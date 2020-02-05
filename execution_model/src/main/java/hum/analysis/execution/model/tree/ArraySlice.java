package hum.analysis.execution.model.tree;

import hum.ir.ast.element.expr.ref.ReadRef;

public class ArraySlice extends InstTreeNode {

    private ReadRef reference;

    public ArraySlice(ReadRef reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "!" + reference.getName();
    }

}
