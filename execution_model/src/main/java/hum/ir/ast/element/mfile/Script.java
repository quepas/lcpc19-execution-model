package hum.ir.ast.element.mfile;

import hum.ir.HasPrettyPrint;
import hum.ir.ast.element.statement.Statement;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Quepas on 31.03.2017.
 */
public class Script extends Unit {

    public Script(List<Statement> statements) {
        super(statements);
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("<statements>");
        template.add("statements", getStatements().stream()
                                             .map(HasPrettyPrint::toPrettyString)
                                             .collect(Collectors.joining("\n")));
        return template.render();
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitScript(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterScript(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitScript(this);
    }
}
