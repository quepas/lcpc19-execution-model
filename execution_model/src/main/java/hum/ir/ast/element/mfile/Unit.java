package hum.ir.ast.element.mfile;

import com.google.common.collect.Lists;
import hum.ir.ast.element.Node;
import hum.ir.ast.element.statement.HasBody;
import hum.ir.ast.element.statement.Statement;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Unit extends Statement implements HasBody {

    public Unit() {
        this(Lists.newArrayList());
    }

    public Unit(List<Statement> statements) {
        this.statements = statements;
    }

    protected List<Statement> statements;

    @Override
    public List<Node> getTraversalOrder() {
        return statements.stream()
                .map(elem -> (Node) elem)
                .collect(Collectors.toList());
    }

    @Override
    public List<Statement> getStatements() {
        return statements;
    }
}
