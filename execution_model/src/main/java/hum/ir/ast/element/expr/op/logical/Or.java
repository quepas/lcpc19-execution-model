package hum.ir.ast.element.expr.op.logical;

import hum.ir.ast.element.expr.Expression;
import hum.ir.ast.element.expr.op.BinaryOp;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;

/**
 * Created by Quepas on 15.05.2017.
 */
public class Or extends BinaryOp {

    public Or(Expression left, Expression right) {
        super("|", left, right);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitOr(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterOr(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitOr(this);
    }
}