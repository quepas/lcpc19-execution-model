package hum.ir.ast.element.expr;

import com.google.common.collect.Lists;
import hum.ir.ast.element.Node;
import hum.ir.ast.element.expr.literal.Numeric;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

import java.util.List;

/**
 * Created by Quepas on 04.05.2017.
 */
public class Range extends Expression {

    protected Expression leftOp, middleOp, rightOp;

    public Range(Expression leftOp, Expression rightOp) {
        this.leftOp = leftOp;
        this.middleOp = new Numeric(1);
        this.rightOp = rightOp;
    }

    public Range(Expression leftOp, Expression middleOp, Expression rightOp) {
        this.leftOp = leftOp;
        this.middleOp = middleOp;
        this.rightOp = rightOp;
    }

    public Range(double left, double middle, double right) {
        this.leftOp = new Numeric(left);
        this.middleOp = new Numeric(middle);
        this.rightOp = new Numeric(right);
    }

    public Expression getLeft() {
        return leftOp;
    }

    public Expression getMiddle() {
        return middleOp;
    }

    public Expression getRight() {
        return rightOp;
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("<left>:<right>");
        if (!(middleOp instanceof Numeric) || (Double.parseDouble(middleOp.toPrettyString()) != 1)) {
            template = new ST("<left>:<middle>:<right>");
            template.add("middle", middleOp.toPrettyString());
        }
        template.add("left", leftOp.toPrettyString());
        template.add("right", rightOp.toPrettyString());
        return template.render();
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitRange(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterRange(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitRange(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        return Lists.newArrayList(leftOp, middleOp, rightOp);
    }

}
