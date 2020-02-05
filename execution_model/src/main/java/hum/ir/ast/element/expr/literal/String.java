package hum.ir.ast.element.expr.literal;

import hum.ir.ast.element.Node;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

import java.util.List;

/**
 * Created by Quepas on 09.04.2017.
 */
public class String extends Literal {

    private java.lang.String str;

    public String(java.lang.String str) {
        this.str = str;
    }

    @Override
    public java.lang.String toPrettyString() {
        ST template = new ST("'<string>'");
        template.add("string", str);
        return template.render();
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitString(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterString(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitString(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        return NO_CHILDREN;
    }
}
