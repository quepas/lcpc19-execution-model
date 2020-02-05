package hum.ir.ast.traversal.visitor;

/**
 * Created by Quepas on 15.05.2017.
 */
public interface AcceptASTVisitor {

    <T> T accept(ASTVisitor<T> visitor) throws Exception;

}
