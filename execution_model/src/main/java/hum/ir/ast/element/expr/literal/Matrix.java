package hum.ir.ast.element.expr.literal;

import hum.ir.ast.element.Node;
import hum.ir.ast.element.expr.Expression;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import hum.ir.ast.util.PrettyRenderer;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupString;

import java.lang.String;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Quepas on 09.04.2017.
 */
public class Matrix extends Literal {

    private List<List<Expression>> elements;

    public Matrix(List<List<Expression>> elements) {
        this.elements = elements;
    }

    public List<List<Expression>> getElements() {
        return elements;
    }

    @Override
    public String toPrettyString() {
        STGroup group = new STGroupString("matrix(rows) ::= " +
                "<<" +
                "[<rows :{ row | <row :{ item |<item>};" +
                "separator=\", \">}; " +
                "separator=\";\n\">]" +
                ">>");
        group.registerRenderer(Node.class, new PrettyRenderer());
        ST template = group.getInstanceOf("matrix");
        template.add("rows", elements);
        return template.render();
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitMatrix(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterMatrix(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitMatrix(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        return elements.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

}
