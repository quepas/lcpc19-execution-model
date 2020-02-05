package hum.ir.ast.element.statement;

import com.google.common.collect.Lists;
import hum.ir.HasPrettyPrint;
import hum.ir.ast.element.Node;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

import java.util.List;
import java.util.stream.Collectors;

public class Try extends Statement implements HasBody {

    private CatchClause catchClause;
    private List<Statement> statements;

    public Try(CatchClause catchClause, List<Statement> statements) {
        this.catchClause = catchClause;
        this.statements = Lists.newArrayList(statements);
    }

    @Override
    public List<Statement> getStatements() {
        return statements;
    }

    public CatchClause getCatchClause() {
        return catchClause;
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("try\n" +
                "\t<statements; separator=\"\n\">\n" +
                "<catch>" +
                "end");
        template.add("statements", getStatements()
                .stream()
                .map(HasPrettyPrint::toPrettyString)
                .collect(Collectors.toList()));
        template.add("catch", getCatchClause().toPrettyString());
        return template.render();
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterTry(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitTry(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        List<Node> result = Lists.newArrayList(statements);
        result.add(catchClause);
        return result;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitTry(this);
    }
}
