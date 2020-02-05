package hum.ir.ast.element.expr;

import hum.ir.ast.element.expr.op.UnaryOp;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

/**
 * Created by Quepas on 09.04.2017.
 */
public class Parentheses extends UnaryOp {

    public Parentheses(Expression expr) {
        super("", expr);
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("(<expr>)");
        template.add("expr", getChild().toPrettyString());
        return template.render();
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitParentheses(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterParentheses(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitParentheses(this);
    }
}
