package hum.ir.ast.element.statement.conditional;

import com.google.common.collect.Lists;
import hum.ir.ast.element.Node;
import hum.ir.ast.element.statement.Statement;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Quepas on 01.04.2017.
 */
public class If extends Statement {

    private IfClause ifClause;
    private List<ElseIfClause> elseIfClauses = Lists.newArrayList();
    private Optional<ElseClause> elseClause = Optional.empty();

    public If(IfClause ifClause) {
        this.ifClause = ifClause;
    }

    public If(IfClause ifClause, ElseClause elseClause) {
        this(ifClause);
        this.elseClause = Optional.of(elseClause);
    }

    public If(IfClause ifClause, List<ElseIfClause> elseIfClauses) {
        this.ifClause = ifClause;
        this.elseIfClauses.addAll(elseIfClauses);
    }

    public If(IfClause ifClause, List<ElseIfClause> elseIfClauses,
              ElseClause elseClause) {
        this.ifClause = ifClause;
        this.elseIfClauses.addAll(elseIfClauses);
        this.elseClause = Optional.of(elseClause);
    }

    public IfClause getIfClause() {
        return ifClause;
    }

    public Optional<ElseClause> getElseClause() {
        return elseClause;
    }

    public List<ElseIfClause> getElseIfClauses() {
        return elseIfClauses;
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("<ifClause>" +
                "<elseIfClauses>" +
                "<if(elseClause)><elseClause><endif>" +
                "end");
        template.add("ifClause", getIfClause().toPrettyString());
        template.add("elseIfClauses", getElseIfClauses()
                .stream()
                .map(ElseIfClause::toPrettyString)
                .collect(Collectors.toList()));
        if (elseClause.isPresent()) {
            template.add("elseClause", elseClause.get().toPrettyString());
        } else {
            template.add("elseClause", null);
        }
        return template.render();
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitIf(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterIf(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitIf(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        List<Node> result = Lists.newArrayList(ifClause);
        result.addAll(elseIfClauses);
        elseClause.ifPresent(result::add);
        return result;
    }
}
