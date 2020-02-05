package hum.analysis.execution.model.tree;

import com.google.common.collect.Lists;

import java.util.List;

public abstract class InstTreeNode {

    protected InstructionBlock parent;
    protected List<InstTreeNode> children = Lists.newArrayList();

    public InstructionBlock getParent() {
        return parent;
    }

    public void setParent(InstructionBlock parent) {
        this.parent = parent;
    }

    public List<InstTreeNode> getChildren() {
        return children;
    }

    public void addChild(InstTreeNode node) {
        children.add(node);
    }

    public void setChildren(List<InstTreeNode> newChildren) {
        children = Lists.newArrayList(newChildren);
    }

}
