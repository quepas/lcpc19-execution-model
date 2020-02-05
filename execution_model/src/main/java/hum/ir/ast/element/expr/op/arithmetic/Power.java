package hum.ir.ast.element.expr.op.arithmetic;

import hum.ir.ast.element.expr.Expression;
import hum.ir.ast.element.expr.op.BinaryOp;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

/**
 * Created by Quepas on 15.05.2017.
 */
public class Power extends BinaryOp {

    public Power(Expression left, Expression right) {
        super(".^", left, right);
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("<left><op><right>");
        template.add("left", getLeft().toPrettyString());
        template.add("op", op);
        template.add("right", getRight().toPrettyString());
        return template.render();
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitPower(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterPower(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitPower(this);
    }
}
