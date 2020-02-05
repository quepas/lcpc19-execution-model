package hum.ir.ast.element.expr.literal;

import hum.ir.ast.element.Node;
import hum.ir.ast.element.expr.Expression;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;

import java.util.List;

/**
 * Created by Quepas on 09.04.2017.
 */
public class Cell extends Literal implements Data2D {

    private Expression[][] elements;
    private int row, col;

    public Cell(Expression[][] elements, int row, int col) {
        this.elements = elements;
        this.row = row;
        this.col = col;
    }

    @Override
    public Expression[][] getElements() {
        return elements;
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getCol() {
        return col;
    }

    @Override
    public java.lang.String toPrettyString() {
        StringBuilder text = new StringBuilder();
        text.append("{");
        for (int i = 0; i < elements.length; ++i) {
            for (int j = 0; j < elements[0].length; ++j) {
                text.append(elements[i][j].toPrettyString());
                if (j < elements[0].length - 1)
                    text.append(", ");
            }
            if (i < elements.length - 1)
                text.append(";\n");
        }
        text.append("}");
        return text.toString();
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitCell(this);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterCell(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitCell(this);
    }

    @Override
    public List<Node> getTraversalOrder() {
        return NO_CHILDREN;
    }
}
