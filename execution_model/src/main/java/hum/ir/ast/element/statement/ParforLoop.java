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
public class ParforLoop extends Statement implements HasBody {

    private WriteRef iterator;
    private Expression initVal, endVal;
    private List<Statement> statements;

    public ParforLoop(WriteRef iterator, Expression initVal, Expression endVal,
                      List<Statement> statements) {
        this.iterator = iterator;
        this.initVal = initVal;
        this.endVal = endVal;
        this.statements = Lists.newArrayList(statements);
    }

    public WriteRef getIterator() {
        return iterator;
    }

    public Expression getInitVal() {
        return initVal;
    }

    public Expression getEndVal() {
        return endVal;
    }

    @Override
    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("parfor <iteratorVar> = <initVal>:<endVal>\n" +
                "\t<statements; separator=\"\n\">" +
                "\nend");
        template.add("iteratorVar", iterator.toPrettyString());
        template.add("initVal", initVal.toPrettyString());
        template.add("endVal", endVal.toPrettyString());
        template.add("statements", getStatements().stream()
                .map(Statement::toPrettyString)
                .collect(Collectors.toList()));
        return template.render();
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitParforLoop(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterParforLoop(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitParforLoop(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        List<Node> result = Lists.newArrayList(initVal, endVal, iterator);
        result.addAll(getStatements());
        return result;
    }

}
