package hum.ir.ast.element.statement;

import com.google.common.collect.Lists;
import hum.ir.HasPrettyPrint;
import hum.ir.ast.element.Node;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

import java.util.List;
import java.util.stream.Collectors;

public class SwitchOtherwise extends Statement implements HasBody {

    private List<Statement> statements;

    public SwitchOtherwise(List<Statement> statements) {
        this.statements = Lists.newArrayList(statements);
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("otherwise\n\t<statements; separator=\"\n\">");
        template.add("statements",
                getStatements().stream()
                        .map(HasPrettyPrint::toPrettyString)
                        .collect(Collectors.toList()));
        return template.render();
    }

    @Override
    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterSwitchOtherwise(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitSwitchOtherwise(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        return Lists.newArrayList(statements);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitSwitchOtherwise(this);
    }

}
