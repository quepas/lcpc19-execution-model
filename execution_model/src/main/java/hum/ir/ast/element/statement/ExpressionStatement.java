package hum.ir.ast.element.statement;

import com.google.common.collect.Lists;
import hum.ir.ast.element.Node;
import hum.ir.ast.element.expr.Expression;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

import java.util.List;

/**
 * Created by Quepas on 21.04.2017.
 */
public class ExpressionStatement extends Statement {

    private Expression expression;

    public ExpressionStatement(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitExpressionStatement(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterExpressionStatement(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitExpressionStatement(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        return Lists.newArrayList(expression);
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("<expr>;");
        template.add("expr", expression.toPrettyString());
        return template.render();
    }
}
