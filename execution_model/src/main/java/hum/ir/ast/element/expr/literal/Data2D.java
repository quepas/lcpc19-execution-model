package hum.ir.ast.element.expr.literal;

import hum.ir.ast.element.expr.Expression;

public interface Data2D {

    int getRow();

    int getCol();

    Expression[][] getElements();

}
