package hum.runner;

import hum.analysis.execution.model.BuildInstructionChain;
import hum.analysis.execution.model.BuildMinimalInstructionTree;
import hum.analysis.execution.model.RepackingCostModel;
import hum.analysis.execution.model.tree.InstTreeNode;
import hum.frontend.matlab.BuildAST;
import hum.ir.ast.element.Node;

import java.util.List;
import java.util.stream.Collectors;

public class ExecutionPredictor {

    /**
     * An identifier can be a:
     *  1) Built-in function if available in the class ListOfBuiltins
     *  2) User-defined function with an "udf_" prefix
     *  3) Reference to an array
     *
     * @param code AST of the code for the prediction
     * @return textual representation of the prediction
     */
    public static String predict(Node code) {
        BuildMinimalInstructionTree buildMinimalInstructionTree =
                new BuildMinimalInstructionTree();
        InstTreeNode minimalTree = buildMinimalInstructionTree.apply(code);
        BuildInstructionChain buildInstructionChain =
                new BuildInstructionChain();
        List<InstTreeNode> instructionChain =
                buildInstructionChain.apply(minimalTree);
        RepackingCostModel repackingCostModel = new RepackingCostModel();
        repackingCostModel.apply(instructionChain);
        System.out.println("Repacking candidates   = " + repackingCostModel.getRepackingCandidates());

        return instructionChain.stream()
                .map(InstTreeNode::toString)
                .collect(Collectors.joining(" ⟹ "));
    }

    public static void main(String[] args) {
        Node expr = BuildAST.fromStringExpr(args[0]);
        String prediction = ExecutionPredictor.predict(expr);
        System.out.println("Execution prediction   = " + prediction);
    }

}
