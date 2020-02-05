package hum.ir.ast.element.expr.op.logical;

import hum.ir.ast.element.expr.Expression;
import hum.ir.ast.element.expr.op.BinaryOp;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;

/**
 * Created by Quepas on 15.05.2017.
 */
public class ShortOr extends BinaryOp {

    public ShortOr(Expression left, Expression right) {
        super("||", left, right);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitShortOr(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterShortOr(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitShortOr(this);
    }
}
