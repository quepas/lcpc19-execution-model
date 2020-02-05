package hum.ir.ast.element.mfile;

import hum.ir.ast.element.Node;
import hum.ir.ast.element.statement.Statement;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionFile extends Unit {

    protected List<Function> functionDefs;

    public FunctionFile(List<Function> functionDefs) {
        this.functionDefs = functionDefs;
    }

    public List<Function> getFunctionDefs() {
        return functionDefs;
    }

    @Override
    public List<Node> getTraversalOrder() {
        return functionDefs.stream()
                .map(elem -> (Node) elem)
                .collect(Collectors.toList());
    }

    @Override
    public List<Statement> getStatements() {
        throw new UnsupportedOperationException("No statements for " +
                "FunctionFile");
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("<functions; separator=\"\n\n\">");
        template.add("functions",
                getFunctionDefs()
                        .stream()
                        .map(Function::toPrettyString)
                        .collect(Collectors.toList()));
        return template.render();
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterFunctionFile(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitFunctionFile(this);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitFunctionFile(this);
    }
}
