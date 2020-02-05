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
 * Created by Quepas on 19.05.2017.
 */
public class MultiAssignment extends Statement {

    private List<WriteRef> definitions;
    private Expression rhs;


    public MultiAssignment(List<WriteRef> definitions, Expression rhs) {
        this.definitions = Lists.newArrayList(definitions);
        this.rhs = rhs;
    }

    public List<WriteRef> getLHS() {
        return definitions;
    }

    public Expression getRHS() {
        return rhs;
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("[<definitions;separator=\", \">] = <rhs>;");
        template.add("definitions", getLHS().stream()
                .map(WriteRef::toPrettyString)
                .collect(Collectors.toList()));
        template.add("rhs", getRHS().toPrettyString());
        return template.render();
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterMultiAssignment(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitMultiAssignment(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        List<Node> result = Lists.newArrayList(rhs);
        result.addAll(definitions);
        return result;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitMultiAssignment(this);
    }
}
