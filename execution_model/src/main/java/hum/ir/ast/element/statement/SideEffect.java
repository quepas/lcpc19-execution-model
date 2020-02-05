package hum.ir.ast.element.statement;

import com.google.common.collect.Lists;
import hum.ir.ast.element.Node;
import hum.ir.ast.element.expr.Expression;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;

import java.util.List;

public class SideEffect extends Statement {

    private Expression expression;

    public SideEffect(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toPrettyString() {
        return expression.toPrettyString() + ";";
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterSideEffect(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitSideEffect(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        return Lists.newArrayList(expression);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitSideEffect(this);
    }
}
