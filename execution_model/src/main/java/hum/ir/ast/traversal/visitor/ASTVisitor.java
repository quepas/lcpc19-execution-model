package hum.ir.ast.traversal.visitor;

import hum.ir.ast.element.Node;
import hum.ir.ast.element.expr.*;
import hum.ir.ast.element.expr.literal.Cell;
import hum.ir.ast.element.expr.literal.Matrix;
import hum.ir.ast.element.expr.literal.Numeric;
import hum.ir.ast.element.expr.literal.String;
import hum.ir.ast.element.expr.op.arithmetic.*;
import hum.ir.ast.element.expr.op.comparison.*;
import hum.ir.ast.element.expr.op.logical.*;
import hum.ir.ast.element.expr.ref.ReadRef;
import hum.ir.ast.element.expr.ref.WriteRef;
import hum.ir.ast.element.mfile.Function;
import hum.ir.ast.element.mfile.FunctionFile;
import hum.ir.ast.element.mfile.Script;
import hum.ir.ast.element.statement.*;
import hum.ir.ast.element.statement.conditional.ElseClause;
import hum.ir.ast.element.statement.conditional.ElseIfClause;
import hum.ir.ast.element.statement.conditional.If;
import hum.ir.ast.element.statement.conditional.IfClause;

/**
 * Created by Quepas on 15.05.2017.
 *
 * Implementation based of ANTLR visitor pattern
 */
public interface ASTVisitor<T> {

    T visit(Node node) throws Exception;

    T visitParentheses(Parentheses parentheses) throws Exception;

    // Operator
    //// Arithmetic
    T visitTranspose(Transpose transpose) throws Exception;
    T visitCTranspose(CTranspose cTranspose) throws Exception;

    T visitPower(Power power) throws Exception;
    T visitMPower(MPower mpower) throws Exception;

    T visitUMinus(UMinus uminus) throws Exception;
    T visitUPlus(UPlus uplus) throws Exception;
    T visitNot(Not not) throws Exception;

    T visitTimes(Times times) throws Exception;
    T visitRDivide(RDivide rdivide) throws Exception;
    T visitLDivide(LDivide ldivide) throws Exception;
    T visitMTimes(MTimes mtimes) throws Exception;
    T visitMRDivide(MRDivide mrdivide) throws Exception;
    T visitMLDivide(MLDivide mldivide) throws Exception;

    T visitPlus(Plus plus) throws Exception;
    T visitMinus(Minus minus) throws Exception;

    T visitRange(Range range) throws Exception;

    //// Comparison
    T visitLT(Lt lt) throws Exception;
    T visitLE(Le le) throws Exception;
    T visitGT(Gt gt) throws Exception;
    T visitGE(Ge ge) throws Exception;
    T visitEQ(Eq eq) throws Exception;
    T visitNE(Ne ne) throws Exception;

    //// Logical
    T visitAnd(And and) throws Exception;
    T visitOr(Or or) throws Exception;
    T visitShortAnd(ShortAnd shortAnd) throws Exception;
    T visitShortOr(ShortOr shortOr) throws Exception;

    // Data
    T visitMatrix(Matrix matrix) throws Exception;
    T visitNumeric(Numeric numeric) throws Exception;
    T visitCell(Cell cell) throws Exception;
    T visitString(String string) throws Exception;

    // Handle and lambda
    T visitHandle(Handle handle) throws Exception;
    T visitLambda(Lambda lambda) throws Exception;

    // Reference
    T visitReadRef(ReadRef readRef) throws Exception;
    T visitWriteRef(WriteRef writeRef) throws Exception;

    T visitIndexAll(IndexAll indexAll) throws Exception;
    T visitIndexEnd(IndexEnd indexEnd) throws Exception;

    /**
     * M-files
     */
    T visitScript(Script script) throws Exception;
    T visitFunction(Function function) throws Exception;

    T visitFunctionFile(FunctionFile functionFile) throws Exception;

    /**
     * Statements
     */
    T visitGlobal(Global global) throws Exception;
    T visitSingleAssignment(SingleAssignment assignment) throws Exception;
    T visitMultiAssignment(MultiAssignment assignment) throws Exception;
    T visitExpressionStatement(ExpressionStatement expressionStatement) throws Exception;
    T visitForLoop(ForLoop loop) throws Exception;
    T visitParforLoop(ParforLoop loop) throws Exception;
    T visitWhileLoop(WhileLoop loop) throws Exception;
    T visitIf(If ifStmt) throws Exception;

    T visitTry(Try tryStmt) throws Exception;

    T visitCatchClause(CatchClause catchClause) throws Exception;

    T visitIfClause(IfClause ifClause) throws Exception;

    T visitElseIfClause(ElseIfClause elseIfClause) throws Exception;

    T visitElseClause(ElseClause elseStmt) throws Exception;
    T visitSwitch(Switch switchStmt) throws Exception;
    T visitSwitchCase(SwitchCase switchCase) throws Exception;

    T visitSwitchOtherwise(SwitchOtherwise switchOtherwise) throws Exception;
    T visitSideEffect(SideEffect funCallStmt) throws Exception;

    /* Control statements */
    T visitBreak(Break breakStmt) throws Exception;

    T visitChildren(Node node) throws Exception;

    T defaultResult() throws Exception;
    T aggregateResults(T aggregate, T newValue);

}
