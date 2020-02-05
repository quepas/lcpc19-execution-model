package hum.analysis.execution.model;

import com.google.common.collect.Lists;
import hum.analysis.execution.model.tree.InstTreeNode;
import hum.analysis.execution.model.tree.InstructionBlock;

import java.util.List;

public class BuildInstructionChain {

    public List<InstTreeNode> apply(InstTreeNode in) {
        List<InstTreeNode> list = Lists.newArrayList();
        visitInPostOrder(list, in);
        return list;
    }

    private void visitInPostOrder(List<InstTreeNode> currentList,
                                  InstTreeNode node) {
        if (node instanceof InstructionBlock) {
            for (InstTreeNode child : node.getChildren()) {
                visitInPostOrder(currentList, child);
            }
        }
        currentList.add(node);
    }
}
