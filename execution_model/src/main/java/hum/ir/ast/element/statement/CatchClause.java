package hum.ir.ast.element.statement;

import com.google.common.collect.Lists;
import hum.ir.HasPrettyPrint;
import hum.ir.ast.element.Node;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

import java.util.List;
import java.util.stream.Collectors;

public class CatchClause extends Statement implements HasBody {

    private String exception;
    private List<Statement> statements;


    public CatchClause(List<Statement> statements) {
        this("", statements);
    }

    public CatchClause(String exception, List<Statement> statements) {
        this.exception = exception;
        this.statements = Lists.newArrayList(statements);
    }

    public String getException() {
        return exception;
    }

    @Override
    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("catch <exception>\n" +
                "\t<statements; separator=\"\n\">\n");
        template.add("exception", exception);
        template.add("statements", getStatements()
                .stream()
                .map(HasPrettyPrint::toPrettyString)
                .collect(Collectors.toList()));
        return template.render();
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterCatchClause(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitCatchClause(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        return statements.stream()
                .map(elem -> (Node) elem)
                .collect(Collectors.toList());
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitCatchClause(this);
    }
}
