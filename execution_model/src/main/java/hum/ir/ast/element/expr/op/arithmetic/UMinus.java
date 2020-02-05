package hum.ir.ast.element.expr.op.arithmetic;

import hum.ir.ast.element.expr.Expression;
import hum.ir.ast.element.expr.op.UnaryOp;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;

/**
 * Created by Quepas on 15.05.2017.
 */
public class UMinus extends UnaryOp {

    public UMinus(Expression child) {
        super("-", child);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitUMinus(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterUMinus(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitUMinus(this);
    }
}
