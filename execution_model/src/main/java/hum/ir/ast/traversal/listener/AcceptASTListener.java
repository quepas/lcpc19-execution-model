package hum.ir.ast.traversal.listener;

import java.util.List;

/**
 * Created by Quepas on 17.05.2017.
 */
public interface AcceptASTListener<T> {

    void enterRule(ASTListener listener);
    void exitRule(ASTListener listener);

    List<T> getTraversalOrder();

}
