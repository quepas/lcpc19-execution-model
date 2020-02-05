package hum.ir.ast.element.statement;

import com.google.common.collect.Lists;
import hum.ir.ast.element.Node;
import hum.ir.ast.element.expr.Expression;
import hum.ir.ast.element.expr.ref.WriteRef;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

import java.util.List;

/**
 * Created by Quepas on 19.05.2017.
 */
public class SingleAssignment extends Statement {

    private WriteRef definition;
    private Expression rhs;

    public SingleAssignment(WriteRef definition, Expression rhs) {
        this.definition = definition;
        this.rhs = rhs;
    }

    public WriteRef getDefinition() {
        return definition;
    }

    public Expression getRHS() {
        return rhs;
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("<definition> = <rhs>;");
        template.add("definition", getDefinition().toPrettyString());
        template.add("rhs", getRHS().toPrettyString());
        return template.render();
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterSingleAssignment(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitSingleAssignment(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        List<Node> result = Lists.newArrayList(rhs);
        result.add(definition);
        return result;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitSingleAssignment(this);
    }
}
