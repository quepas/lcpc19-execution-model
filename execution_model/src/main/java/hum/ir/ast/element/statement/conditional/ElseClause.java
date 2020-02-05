package hum.ir.ast.element.statement.conditional;

import com.google.common.collect.Lists;
import hum.ir.ast.element.Node;
import hum.ir.ast.element.statement.HasBody;
import hum.ir.ast.element.statement.Statement;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Quepas on 29.05.2017.
 */
public class ElseClause extends Statement implements HasBody {

    private List<Statement> statements = Lists.newArrayList();

    public ElseClause(List<Statement> statements) {
        this.statements.addAll(statements);
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("else\n" +
                "\t<statements; separator=\"\n\">\n");
        template.add("statements", getStatements().stream()
                        .map(Statement::toPrettyString)
                        .collect(Collectors.toList()));
        return template.render();
    }

    @Override
    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterElseClause(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitElseClause(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        return statements.stream()
                .map(elem -> (Node) elem)
                .collect(Collectors.toList());
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitElseClause(this);
    }
}
