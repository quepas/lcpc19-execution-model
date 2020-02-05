package hum.ir.ast.element.expr;

import hum.ir.ast.element.Node;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;

import java.util.List;

/**
 * Created by Quepas on 15.05.2017.
 */
public class IndexAll extends Expression {

    public IndexAll() {}

    @Override
    public String toPrettyString() {
        return ":";
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitIndexAll(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterIndexAll(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitIndexAll(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        return NO_CHILDREN;
    }
}
