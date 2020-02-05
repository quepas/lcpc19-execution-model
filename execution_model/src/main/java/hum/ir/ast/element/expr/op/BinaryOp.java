package hum.ir.ast.element.expr.op;

import com.google.common.collect.Lists;
import hum.ir.ast.element.Node;
import hum.ir.ast.element.expr.Expression;
import org.stringtemplate.v4.ST;

import java.util.List;
import java.util.Objects;

/**
 * Created by Quepas on 09.04.2017.
 */
public abstract class BinaryOp extends Expression {

    protected String op;
    protected Expression leftOp, rightOp;

    public BinaryOp(String op, Expression leftOp, Expression rightOp) {
        this.op = op;
        this.leftOp = leftOp;
        this.rightOp = rightOp;
    }

    public Expression getLeft() {
        return leftOp;
    }

    public Expression getRight() {
        return rightOp;
    }

    public String getOp() {
        return op;
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("<left> <op> <right>");
        template.add("left", getLeft().toPrettyString());
        template.add("op", op);
        template.add("right", getRight().toPrettyString());
        return template.render();
    }

    @Override
    public List<Node> getTraversalOrder() {
        return Lists.newArrayList(leftOp, rightOp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BinaryOp binaryOp = (BinaryOp) o;

        if (!Objects.equals(op, binaryOp.op)) return false;
        if (getLeft() != null ? !getLeft().equals(binaryOp.getLeft()) : binaryOp.getLeft() != null) return false;
        return getRight() != null ? getRight().equals(binaryOp.getRight()) : binaryOp.getRight() == null;
    }

    @Override
    public int hashCode() {
        int result = op != null ? op.hashCode() : 0;
        result = 31 * result + (getLeft() != null ? getLeft().hashCode() : 0);
        result = 31 * result + (getRight() != null ? getRight().hashCode() : 0);
        return result;
    }

}
