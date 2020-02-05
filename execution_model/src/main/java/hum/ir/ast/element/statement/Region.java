package hum.ir.ast.element.statement;

import hum.ir.ast.element.Node;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

import java.util.List;
import java.util.stream.Collectors;

public class Region extends Statement {

    private List<Statement> statements;

    public Region(List<Statement> statements) {
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("<statements; separator=\"\n\">");
        template.add("statements", getStatements().stream()
                .map(Statement::toPrettyString)
                .collect(Collectors.toList()));
        return template.render();
    }

    @Override
    public void enterRule(ASTListener listener) {

    }

    @Override
    public void exitRule(ASTListener listener) {

    }

    @Override
    public List<Node> getTraversalOrder() {
        return null;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return null;
    }
}
