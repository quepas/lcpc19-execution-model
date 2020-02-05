package hum.ir.ast.element.expr.op.arithmetic;

import hum.ir.ast.element.expr.Expression;
import hum.ir.ast.element.expr.op.BinaryOp;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;

/**
 * Created by Quepas on 15.05.2017.
 */
public class MLDivide extends BinaryOp {

    public MLDivide(Expression left, Expression right) {
        super("\\", left, right);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitMLDivide(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterMLDivide(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitMLDivide(this);
    }
}
