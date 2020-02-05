package hum.analysis.execution.model;

import com.google.common.collect.Lists;
import hum.analysis.execution.model.tree.*;
import hum.frontend.matlab.BuildAST;
import hum.ir.ast.element.Node;

import java.util.List;

/**
 * We build it for the R2018b profile for now.
 */
public class BuildMinimalInstructionTree {

    public InstTreeNode apply(Node ast) {
        try {
            System.out.println("Input code             = " + ast.toPrettyString());
            PrepareFirstInstructionTree buildComputationTree =
                    new PrepareFirstInstructionTree();
            InstTreeNode computationTree =
                    buildComputationTree.apply(ast);

            // Print built-in functions, user-defined functions, and variables
            System.out.println("Variables              = " + buildComputationTree.getVars());
            System.out.println("Built-in functions     = " + buildComputationTree.getBuiltins());
            System.out.println("User-defined functions = " + buildComputationTree.getUdfs());

            computationTree = mergeArrayRefs(computationTree);
            buildMinimalTree(computationTree);
            return computationTree;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new InstructionBlock(new Instruction("", CompilationMode.UDF));
    }

    public boolean canMerge(InstTreeNode node) {
        if (node instanceof InstructionBlock) {
            InstructionBlock instructionBlock = (InstructionBlock) node;
            return instructionBlock.getOperations().stream()
                    .allMatch(op -> op.getCompilationMode() == CompilationMode.COMBINED);
        }
        return false;
    }

    public boolean hasRightSibling(InstTreeNode node) {
        InstTreeNode parent = node.getParent();
        int indexOfTheChild = parent.getChildren().indexOf(node);
        return indexOfTheChild < parent.getChildren().size()-1;
    }

    public void buildMinimalTree(InstTreeNode node) {
        List<InstTreeNode> revChildren =
                Lists.newArrayList(Lists.reverse(node.getChildren()));
        for (InstTreeNode revChild : revChildren) {
            buildMinimalTree(revChild);
        }

        if (canMerge(node) && canMerge(node.getParent())) {
            if (!hasRightSibling(node)) {
                node.getParent().mergeWith((InstructionBlock) node);
                node.getChildren().forEach(child -> node.getParent().addChild(child));
                node.getParent().getChildren().remove(node);
            }
        }
    }

    private InstTreeNode mergeArrayRefs(InstTreeNode node) {

        if (node instanceof InstructionBlock) {
            InstructionBlock ib = (InstructionBlock) node;
            List<InstTreeNode> newChild = Lists.newArrayList();
            for (InstTreeNode n : ib.getChildren()) {
                InstTreeNode visitedN = mergeArrayRefs(n);
                if (visitedN instanceof ArrayReference) {
                    ArrayReference ref = (ArrayReference) visitedN;
                    ib.addIfArrayRef(ref);
                } else {
                    newChild.add(visitedN);
                }
            }
            ib.setChildren(newChild);
            return ib;
        }
        return node;
    }

    public static void main(String[] args) {
        Node ast = BuildAST.fromStringExpr("sin(2 * pi * f1 * t) + sin(2 * pi * f2 * t) + " +
                "sin(2" +
                " * pi * f3 * t)");
        BuildMinimalInstructionTree exprExecutionModel = new BuildMinimalInstructionTree();
        System.out.println("MinimalInstructionTree=" + exprExecutionModel.apply(ast));
    }

}
