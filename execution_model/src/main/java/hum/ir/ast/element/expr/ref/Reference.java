package hum.ir.ast.element.expr.ref;

import com.google.common.collect.Lists;
import hum.ir.ast.element.Node;
import hum.ir.ast.element.expr.Expression;
import org.stringtemplate.v4.ST;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Quepas on 09.04.2017.
 *
 */
public abstract class Reference extends Expression {

    private String name;
    private IndexingType indexingType;
    private List<Expression> parameters = Lists.newArrayList();

    /**
     * Reference with no parameters (function arguments  or variable indices)
     * @param name The name of the reference (identifier)
     */
    public Reference(String name) {
        this(name, IndexingType.NONE, Lists.newArrayList());
    }

    /**
     * @param name The name of the reference (identifier)
     * @param parameters List of arguments (function call) or
     *                   indices (variable)
     */
    public Reference(String name,
                     IndexingType type, List<Expression> parameters) {
        this.name = name;
        this.indexingType = type;
        this.parameters.addAll(parameters);
    }

    public String getName() {
        return name;
    }

    public IndexingType getIndexingType() {
        return indexingType;
    }

    @Override
    public List<Node> getTraversalOrder() {
        return parameters.stream()
                .map(child -> (Node) child)
                .collect(Collectors.toList());
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Expression> getParameters() {
        return parameters;
    }

    public int getNumParameters() {
        return parameters.size();
    }

    @Override
    public String toString() {
        return getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override
    public String toPrettyString() {
        String pattern = "";
        switch (indexingType) {
            case NONE:
                return name;
            case BRACKETS:
                pattern = "<id><if(indices)>{<indices;separator=\", " +
                        "\">}<endif>";
                break;
            case PARENTHESES:
                pattern = "<id><if(indices)>(<indices;separator=\", \">)" +
                        "<endif>";
                break;
        }
        ST template = new ST(pattern);
        template.add("id", name);
        template.add("indices", getParameters().stream()
                .map(Expression::toPrettyString)
                .collect(Collectors.toList()));
        return template.render();
    }
}
