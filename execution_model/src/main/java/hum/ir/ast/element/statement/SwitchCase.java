package hum.ir.ast.element.statement;

import com.google.common.collect.Lists;
import hum.ir.ast.element.Node;
import hum.ir.ast.element.expr.Expression;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

import java.util.List;
import java.util.stream.Collectors;

public class SwitchCase extends Statement implements HasCondition, HasBody {

    private Expression condition;
    private List<Statement> statements;

    public SwitchCase(Expression condition, List<Statement> statements) {
        this.condition = condition;
        this.statements = Lists.newArrayList(statements);
    }

    @Override
    public Expression getCondition() {
        return condition;
    }

    @Override
    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("case <condition>\n" +
                "\t<statements; separator=\"\n\">");
        template.add("condition", getCondition().toPrettyString());
        template.add("statements", getStatements().stream()
                .map(Statement::toPrettyString)
                .collect(Collectors.toList()));
        return template.render();
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterSwitchCase(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitSwitchCase(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        List<Node> result = Lists.newArrayList(condition);
        result.addAll(statements);
        return result;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitSwitchCase(this);
    }
}
