package hum.ir.ast.element.statement;

import hum.ir.ast.element.Node;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;

import java.util.List;

public class Break extends Statement {

    @Override
    public String toPrettyString() {
        return "break;";
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterBreakStmt(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitBreakStmt(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        return NO_CHILDREN;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitBreak(this);
    }
}
