package hum.ir.ast.element.expr;

import hum.ir.ast.element.Node;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;

import java.util.List;

/**
 * Created by Quepas on 15.05.2017.
 */
public class IndexEnd extends Expression {

    public IndexEnd() {}

    @Override
    public String toPrettyString() {
        return "end";
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitIndexEnd(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterIndexEnd(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitIndexEnd(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        return NO_CHILDREN;
    }
}
