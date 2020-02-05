package hum.analysis.execution.model;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import hum.analysis.execution.model.tree.*;
import hum.frontend.matlab.BuildAST;
import hum.ir.ast.element.Node;
import hum.ir.ast.element.expr.Expression;
import hum.ir.ast.element.expr.op.BinaryOp;
import hum.ir.ast.element.expr.op.arithmetic.*;
import hum.ir.ast.element.expr.ref.ReadRef;
import hum.ir.ast.traversal.visitor.BaseASTVisitor;

import java.util.List;
import java.util.Set;

public class PrepareFirstInstructionTree extends BaseASTVisitor<InstTreeNode> {

    private Set<String> builtins = Sets.newHashSet(),
            udfs = Sets.newHashSet(),
            vars = Sets.newHashSet();

    public Set<String> getBuiltins() {
        return builtins;
    }

    public Set<String> getUdfs() {
        return udfs;
    }

    public Set<String> getVars() {
        return vars;
    }

    public InstTreeNode apply(Node input) throws Exception {
        return visit(input);
    }

    @Override
    public InstTreeNode visitReadRef(ReadRef readRef) throws Exception {
        String refName = readRef.getName();
        if (readRef.getNumParameters() == 0) {
            vars.add(refName);
            return new ArrayReference(readRef);
        } else {
            // Visit parameters
            List<InstTreeNode> nodes = Lists.newArrayList();
            for (Expression parameter : readRef.getParameters()) {
                nodes.add(visit(parameter));
            }
            if (ListOfBuiltins.hasOpcode(refName)) {
                Instruction instruction = ListOfBuiltins.getByName(refName);
                builtins.add(instruction.toString());
                InstructionBlock ib =
                        new InstructionBlock(instruction);
                for (InstTreeNode node : nodes) {
                    node.setParent(ib);
                    ib.addChild(node);
                }
                return ib;
            } else if (refName.startsWith("udf_")) {
                udfs.add(refName);
                InstructionBlock ib =
                        new InstructionBlock(new Instruction(refName, CompilationMode.UDF));
                for (InstTreeNode node : nodes) {
                    node.setParent(ib);
                    ib.addChild(node);
                }
                return ib;
            } else {
                vars.add(refName);
                return new ArraySlice(readRef);
            }
        }
    }

    private InstTreeNode visitBinaryOp(BinaryOp binaryOp,
                                       String op) throws Exception {
        Instruction instruction = ListOfBuiltins.getByName(op);
        builtins.add(instruction.toString());
        InstTreeNode left = visit(binaryOp.getLeft());
        InstTreeNode right = visit(binaryOp.getRight());

        InstructionBlock ib =
                new InstructionBlock(instruction);
        left.setParent(ib);
        right.setParent(ib);
        ib.addChild(left);
        ib.addChild(right);
        return ib;
    }

    @Override
    public InstTreeNode visitPlus(Plus plus) throws Exception {
        return visitBinaryOp(plus, "plus");
    }

    @Override
    public InstTreeNode visitTimes(Times times) throws Exception {
        return visitBinaryOp(times, "times");
    }

    @Override
    public InstTreeNode visitMTimes(MTimes mtimes) throws Exception {
        return visitBinaryOp(mtimes, "mtimes");
    }

    @Override
    public InstTreeNode visitMinus(Minus minus) throws Exception {
        return visitBinaryOp(minus, "minus");
    }

    @Override
    public InstTreeNode visitRDivide(RDivide rdivide) throws Exception {
        return visitBinaryOp(rdivide, "rdivide");
    }

    @Override
    public InstTreeNode visitLDivide(LDivide ldivide) throws Exception {
        return visitBinaryOp(ldivide, "ldivide");
    }

    @Override
    public InstTreeNode visitPower(Power power) throws Exception {
        return visitBinaryOp(power, "power");
    }

    public static void main(String[] args) throws Exception {
        Node ast = BuildAST.fromStringExpr("sin(2 * pi * f1 * t) + sin(2 * pi * f3 * t)");
        PrepareFirstInstructionTree buildComputationTree = new PrepareFirstInstructionTree();
        InstTreeNode computationTree =
                buildComputationTree.apply(ast);
        System.out.println("ComputationTree=" + computationTree.toString());
    }

}
