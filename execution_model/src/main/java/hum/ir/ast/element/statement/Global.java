package hum.ir.ast.element.statement;

import com.google.common.collect.Lists;
import hum.ir.ast.element.Node;
import hum.ir.ast.element.expr.ref.Reference;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

import java.util.List;
import java.util.stream.Collectors;

public class Global extends Statement {

    protected List<Reference> references;

    public Global(List<Reference> references) {
        this.references = Lists.newArrayList(references);
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("global <refs; separator=\", \">");
        template.add("refs", references
                .stream()
                .map(Reference::getName)
                .collect(Collectors.toList()));
        return template.render();
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterGlobal(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitGlobal(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        return Lists.newArrayList(references);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitGlobal(this);
    }
}
