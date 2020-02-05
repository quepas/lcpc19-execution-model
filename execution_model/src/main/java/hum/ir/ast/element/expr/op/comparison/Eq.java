package hum.ir.ast.element.expr.op.comparison;

import hum.ir.ast.element.expr.Expression;
import hum.ir.ast.element.expr.op.BinaryOp;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;

/**
 * Created by Quepas on 15.05.2017.
 */
public class Eq extends BinaryOp {

    public Eq(Expression left, Expression right) {
        super("==", left, right);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitEQ(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterEQ(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitEQ(this);
    }
}
