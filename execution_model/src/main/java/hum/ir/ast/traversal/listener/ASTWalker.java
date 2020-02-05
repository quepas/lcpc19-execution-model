package hum.ir.ast.traversal.listener;

import hum.ir.ast.element.Node;

/**
 * Created by Quepas on 17.05.2017.
 */
public class ASTWalker {

    public static final ASTWalker DEFAULT = new ASTWalker();

    public void walk(ASTListener listener, Node t) throws Exception {
        enterRule(listener, t);
        for (Node child : t.getTraversalOrder()) {
            walk(listener, child);
        }
        exitRule(listener, t);
    }

    protected void enterRule(ASTListener listener, Node n) {
        listener.enterEveryRule(n);
        n.enterRule(listener);
    }

    protected void exitRule(ASTListener listener, Node n) {
        listener.exitEveryRule(n);
        n.exitRule(listener);
    }


}
