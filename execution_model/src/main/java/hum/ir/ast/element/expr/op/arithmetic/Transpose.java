package hum.ir.ast.element.expr.op.arithmetic;

import hum.ir.ast.element.expr.Expression;
import hum.ir.ast.element.expr.op.UnaryOp;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

/**
 * Created by Quepas on 12.05.2017.
 */
public class Transpose extends UnaryOp {

    public Transpose(Expression child) {
        super(".'", child);
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("<expr><op>");
        template.add("expr", getChild().toPrettyString());
        template.add("op", op);
        return template.render();
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitTranspose(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterTranspose(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitTranspose(this);
    }
}
