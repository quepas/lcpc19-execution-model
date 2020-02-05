package hum.ir.ast.element.expr;

import hum.ir.ast.element.Node;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;

import java.util.List;

public class Handle extends Expression {

    private String functionName;

    public Handle(String functionName) {
        this.functionName = functionName;
    }

    @Override
    public String toPrettyString() {
        return "@" + functionName;
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterHandle(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitHandle(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        return NO_CHILDREN;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitHandle(this);
    }
}
