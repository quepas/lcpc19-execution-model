package hum.ir.ast.element.expr;

import hum.ir.ast.element.Node;
import hum.ir.ast.element.expr.ref.Reference;
import hum.ir.ast.element.expr.ref.WriteRef;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

import java.util.List;
import java.util.stream.Collectors;

public class Lambda extends Expression {

    private List<WriteRef> input;
    private Expression body;

    public Lambda(List<WriteRef> input, Expression body) {
        this.input = input;
        this.body = body;
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("@(<if(input)><input;separator=\", \"><endif>) " +
                "<expr>");
        template.add("input", input.stream()
                                            .map(Reference::toPrettyString)
                                            .collect(Collectors.toList()));
        template.add("expr", body.toPrettyString());
        return template.render();
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterLambda(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitLambda(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        List<Node> result = input.stream()
                .map(elem -> (Node) elem)
                .collect(Collectors.toList());
        result.add(body);
        return result;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitLambda(this);
    }
}
