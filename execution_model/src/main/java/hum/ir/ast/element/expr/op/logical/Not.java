package hum.ir.ast.element.expr.op.logical;

import hum.ir.ast.element.expr.Expression;
import hum.ir.ast.element.expr.op.UnaryOp;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;

/**
 * Created by Quepas on 15.05.2017.
 */
public class Not extends UnaryOp {

    public Not(Expression child) {
        super("~", child);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitNot(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterNot(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitNot(this);
    }
}
