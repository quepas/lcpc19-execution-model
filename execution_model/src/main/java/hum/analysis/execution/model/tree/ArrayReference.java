package hum.analysis.execution.model.tree;

import hum.ir.ast.element.expr.ref.ReadRef;

public class ArrayReference extends InstTreeNode {

    private ReadRef reference;

    public ArrayReference(ReadRef reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return reference.getName();
    }

}
