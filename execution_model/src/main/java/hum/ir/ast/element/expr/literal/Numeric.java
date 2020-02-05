package hum.ir.ast.element.expr.literal;

import hum.ir.ast.element.Node;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;

import java.util.List;
import java.util.Optional;

/**
 * Created by Quepas on 09.04.2017.
 */
public class Numeric extends Literal {

    private double value;
    private Optional<java.lang.String> complex = Optional.empty();

    public Numeric(double data)
    {
        value = data;
    }

    public Numeric(java.lang.String complex) {
        this.complex = Optional.of(complex);
    }

    public Numeric(int number) {
        value = number;
    }

    public Numeric(float number) {
        value = number;
    }

    public double getValue() {
        return value;
    }

    @Override
    public java.lang.String toPrettyString() {
        if (!complex.isPresent()) {
            if ((value == Math.floor(value)) && !Double.isInfinite(value)) {
                return java.lang.String.valueOf((int) value);
            }
            return java.lang.String.valueOf(value);
        } else {
            return complex.get();
        }
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitNumeric(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterNumeric(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitNumeric(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        return NO_CHILDREN;
    }
}
