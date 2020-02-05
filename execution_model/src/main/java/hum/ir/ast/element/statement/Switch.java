package hum.ir.ast.element.statement;

import com.google.common.collect.Lists;
import hum.ir.ast.element.Node;
import hum.ir.ast.element.expr.Expression;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;
import org.stringtemplate.v4.ST;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Switch extends Statement implements HasCondition, HasBody {

    private Expression condition;
    private List<SwitchCase> cases;
    private Optional<SwitchOtherwise> otherwise;

    public Switch(Expression condition, List<SwitchCase> cases) {
        this.condition = condition;
        this.cases = cases;
        this.otherwise = Optional.empty();
    }

    public Switch(Expression condition, List<SwitchCase> cases,
                  SwitchOtherwise otherwise) {
        this.condition = condition;
        this.cases = cases;
        this.otherwise = Optional.of(otherwise);
    }


    @Override
    public Expression getCondition() {
        return condition;
    }

    public Optional<SwitchOtherwise> getOtherwise() {
        return otherwise;
    }

    @Override
    public List<Statement> getStatements() {
        throw new UnsupportedOperationException("Switch has no statements");
    }

    public List<SwitchCase> getSwitchCases() {
        return cases;
    }

    @Override
    public String toPrettyString() {
        ST template = new ST("switch <condition>\n" +
                "\t<switchCases; separator=\"\n\">\n" +
                "<if(otherwise)><otherwise>\n<endif>" +
                "end");
        template.add("condition", getCondition().toPrettyString());
        template.add("switchCases", getSwitchCases().stream()
                .map(SwitchCase::toPrettyString)
                .collect(Collectors.toList()));
        otherwise.ifPresent(switchOtherwise ->
                template.add("otherwise", switchOtherwise.toPrettyString()));
        return template.render();
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterSwitch(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitSwitch(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        List<Node> result = Lists.newArrayList(condition);
        result.addAll(cases);
        otherwise.ifPresent(result::add);
        return result;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitSwitch(this);
    }
}
