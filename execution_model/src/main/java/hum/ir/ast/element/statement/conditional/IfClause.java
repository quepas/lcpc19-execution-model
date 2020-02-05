package hum.ir.ast.element.statement.conditional;

import com.google.common.collect.Lists;
import hum.ir.ast.element.Node;
import hum.ir.ast.element.expr.Expression;
import hum.ir.ast.element.statement.HasBody;
import hum.ir.ast.element.statement.HasCondition;
import hum.ir.ast.element.statement.Statement;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

import java.util.List;
import java.util.stream.Collectors;

public class IfClause extends Statement implements HasCondition, HasBody {

    private Expression condition;
    private List<Statement> statements;

    public IfClause(Expression condition, List<Statement> statements) {
        this.condition = condition;
        this.statements = statements;
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
        ST template = new ST("if <condition>\n" +
                "\t<statements; separator=\"\n\">\n");
        template.add("condition", getCondition().toPrettyString());
        template.add("statements", getStatements().stream()
                .map(Statement::toPrettyString)
                .collect(Collectors.toList()));
        return template.render();
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterIfClause(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitIfClause(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        List<Node> result = Lists.newArrayList(condition);
        result.addAll(statements);
        return result;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitIfClause(this);
    }

}
