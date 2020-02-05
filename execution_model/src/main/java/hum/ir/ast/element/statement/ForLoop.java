package hum.ir.ast.element.statement;

import com.google.common.collect.Lists;
import hum.ir.ast.element.Node;
import hum.ir.ast.element.expr.Expression;
import hum.ir.ast.element.expr.ref.WriteRef;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Element representing for-loop construct.
 */
public class ForLoop extends Statement implements HasBody {

    private WriteRef iterator;
    private Expression iterationSpace;
    private List<Statement> statements;

    public ForLoop(WriteRef iterator, Expression iterationSpace, List<Statement> statements) {
        this.iterator = iterator;
        this.iterationSpace = iterationSpace;
        this.statements = Lists.newArrayList(statements);
    }

    public WriteRef getIterator() {
        return iterator;
    }

    public Expression getSpace() {
        return iterationSpace;
    }

    @Override
    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("for <iteratorVar> = <iterationSpace>\n" +
                "\t<statements; separator=\"\n\">" +
                "\nend");
        template.add("iteratorVar", iterator.toPrettyString());
        template.add("iterationSpace", iterationSpace.toPrettyString());
        template.add("statements", getStatements().stream()
                .map(Statement::toPrettyString)
                .collect(Collectors.toList()));
        return template.render();
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitForLoop(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterForLoop(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitForLoop(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        List<Node> result = Lists.newArrayList(iterationSpace, iterator);
        result.addAll(getStatements());
        return result;
    }

}
