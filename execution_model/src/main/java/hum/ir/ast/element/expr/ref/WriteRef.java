package hum.ir.ast.element.expr.ref;

import com.google.common.collect.Lists;
import hum.ir.ast.element.expr.Expression;
import hum.ir.ast.traversal.listener.ASTListener;
import hum.ir.ast.traversal.visitor.ASTVisitor;

import java.util.List;

/**
 * Created by Quepas on 19.05.2017.
 */
public class WriteRef extends Reference {

    public WriteRef(String name) {
        super(name);
    }

    public WriteRef(String name, IndexingType type, List<Expression> indices) {
        super(name, type, indices);
    }

    public static WriteRef newVar(String name) {
        return new WriteRef(name, IndexingType.PARENTHESES,
                Lists.newArrayList());
    }

    public static WriteRef newVar(String name, List<Expression> indices) {
        return new WriteRef(name, IndexingType.PARENTHESES, indices);
    }

    @Override
    public void enterRule(ASTListener listener) {
        listener.enterWriteRef(this);
    }

    @Override
    public void exitRule(ASTListener listener) {
        listener.exitWriteRef(this);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) throws Exception {
        return visitor.visitWriteRef(this);
    }

}
