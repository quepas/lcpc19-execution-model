package hum.ir.ast.element.expr.op;

import com.google.common.collect.Lists;
import hum.ir.ast.element.Node;
import hum.ir.ast.element.expr.Expression;
import org.stringtemplate.v4.ST;

import java.util.List;

/**
 * Created by Quepas on 09.04.2017.
 */
public abstract class UnaryOp extends Expression {

    protected String op;
    private Expression child;

    public UnaryOp(String op, Expression child) {
        this.op =  op;
        this.child = child;
    }

    public String getOp() {
        return op;
    }

    public Expression getChild() {
        return child;
    }

    @Override
    public List<Node> getTraversalOrder() {
        return Lists.newArrayList(child);
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("<op><expr>");
        template.add("op", op);
        template.add("expr", getChild().toPrettyString());
        return template.render();
    }

}
