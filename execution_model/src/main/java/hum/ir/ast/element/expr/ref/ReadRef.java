package hum.ir.ast.element.expr.ref;

import com.google.common.collect.Lists;
import hum.ir.ast.element.expr.Expression;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;

import java.util.List;

/**
 * Created by Quepas on 19.05.2017.
 */
public class ReadRef extends Reference {
    
    public ReadRef(String name) {
        super(name);
    }

    public ReadRef(String name, IndexingType type, List<Expression> indices) {
        super(name, type, indices);
    }

    public static ReadRef newVar(String name) {
        return new ReadRef(name, IndexingType.PARENTHESES,
                Lists.newArrayList());
    }

    public static ReadRef newFunctionCall(String name,
                                          List<Expression> arguments) {
        return new ReadRef(name, IndexingType.PARENTHESES, arguments);
    }

    public static ReadRef newVar(String name, List<Expression> indices) {
        return new ReadRef(name, IndexingType.PARENTHESES, indices);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterReadRef(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitReadRef(this);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitReadRef(this);
    }
}
