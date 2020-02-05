package hum.ir.ast.traversal.listener;

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
 * Created by Quepas on 17.05.2017.
 */
public abstract class ASTListener {

    public void enterEveryRule(Node node) {}
    public void exitEveryRule(Node node) {}

    /**
     * Expressions
     */
    public void enterParentheses(Parentheses parentheses) {}
    public void exitParentheses(Parentheses parentheses) {}

    public void enterTranspose(Transpose transpose) {}
    public void exitTranspose(Transpose transpose) {}
    public void enterCTranspose(CTranspose ctranspose) {}
    public void exitCTranspose(CTranspose ctranspose) {}

    public void enterPower(Power power) {}
    public void exitPower(Power power) {}
    public void enterMPower(MPower mpower) {}
    public void exitMPower(MPower mpower) {}

    public void enterUMinus(UMinus uminus) {}
    public void exitUMinus(UMinus uminus) {}
    public void enterUPlus(UPlus uplus) {}
    public void exitUPlus(UPlus uplus) {}

    public void enterNot(Not not) {}
    public void exitNot(Not not) {}

    public void enterTimes(Times times) {}
    public void exitTimes(Times times) {}
    public void enterRDivide(RDivide rdivide) {}
    public void exitRDivide(RDivide rdivide) {}
    public void enterLDivide(LDivide ldivide) {}
    public void exitLDivide(LDivide ldivide) {}
    public void enterMTimes(MTimes mtimes) {}
    public void exitMTimes(MTimes mtimes) {}
    public void enterMRDivide(MRDivide mrdivide) {}
    public void exitMRDivide(MRDivide mrdivide) {}
    public void enterMLDivide(MLDivide mldivide) {}
    public void exitMLDivide(MLDivide mldivide) {}

    public void enterPlus(Plus plus) {}
    public void exitPlus(Plus plus) {}
    public void enterMinus(Minus minus) {}
    public void exitMinus(Minus minus) {}

    public void enterRange(Range range) {}
    public void exitRange(Range range) {}

    public void enterLT(Lt lt) {}
    public void exitLT(Lt lt) {}
    public void enterLE(Le le) {}
    public void exitLE(Le le) {}
    public void enterGT(Gt gt) {}
    public void exitGT(Gt gt) {}
    public void enterGE(Ge ge) {}
    public void exitGE(Ge ge) {}
    public void enterEQ(Eq eq) {}
    public void exitEQ(Eq eq) {}
    public void enterNE(Ne ne) {}
    public void exitNE(Ne ne) {}

    public void enterAnd(And and) {}
    public void exitAnd(And and) {}
    public void enterOr(Or or) {}
    public void exitOr(Or or) {}
    public void enterShortAnd(ShortAnd shortAnd) {}
    public void exitShortAnd(ShortAnd shortAnd) {}
    public void enterShortOr(ShortOr shortOr) {}
    public void exitShortOr(ShortOr shortOr) {}

    /**
     * Literals
     */
    public void enterMatrix(Matrix matrix) {}
    public void exitMatrix(Matrix matrix) {}
    public void enterNumeric(Numeric numeric) {}
    public void exitNumeric(Numeric numeric) {}
    public void enterCell(Cell cell) {}
    public void exitCell(Cell cell) {}
    public void enterString(String string) {}
    public void exitString(String string) {}
    public void enterLambda(Lambda lambda) {}
    public void exitLambda(Lambda lambda) {}
    public void enterHandle(Handle handle) {}
    public void exitHandle(Handle handle) {}

    /**
     * References
     */
    public void enterReadRef(ReadRef readRef) {}
    public void exitReadRef(ReadRef readRef) {}
    public void enterWriteRef(WriteRef writeRef) {}
    public void exitWriteRef(WriteRef writeRef) {}

    /**
     * Special references
     */
    public void enterIndexAll(IndexAll indexAll) {}
    public void exitIndexAll(IndexAll indexAll) {}
    public void enterIndexEnd(IndexEnd indexEnd) {}
    public void exitIndexEnd(IndexEnd indexEnd) {}

    /**
     * Scripts and programs
     */
    public void enterScript(Script script) {}
    public void exitScript(Script script) {}
    public void enterFunctionFile(FunctionFile functionFile) {}
    public void exitFunctionFile(FunctionFile functionFile) {}

    /**
     * Function and classes
     */
    public void enterFunction(Function function) {}
    public void exitFunction(Function function) {}

    /**
     * Statements
     */
    public void enterGlobal(Global global) {}
    public void exitGlobal(Global global) {}
    public void enterSingleAssignment(SingleAssignment assignment) {}
    public void exitSingleAssignment(SingleAssignment assignment) {}
    public void enterMultiAssignment(MultiAssignment assignment) {}
    public void exitMultiAssignment(MultiAssignment assignment) {}
    public void enterExpressionStatement(ExpressionStatement expressionStatement) {}
    public void exitExpressionStatement(ExpressionStatement expressionStatement) {}

    /**
     * Exceptions
     */
    public void enterTry(Try tryStmt) {}
    public void exitTry(Try tryStmt) {}
    public void enterCatchClause(CatchClause catchClause) {}
    public void exitCatchClause(CatchClause catchClause) {}

    /**
     * Loops
     */
    public void enterWhileLoop(WhileLoop whileLoop) {}
    public void exitWhileLoop(WhileLoop whileLoop) {}
    public void enterForLoop(ForLoop forLoop) {}
    public void exitForLoop(ForLoop forLoop) {}
    public void enterParforLoop(ParforLoop parforLoop) {}
    public void exitParforLoop(ParforLoop parforLoop) {}

    /**
     * Control flow
     */
    public void enterIf(If ifStmt) {}
    public void exitIf(If ifStmt) {}
    public void enterIfClause(IfClause ifClause) {}
    public void exitIfClause(IfClause ifClause) {}
    public void enterElseIfClause(ElseIfClause elseIfClause) {}
    public void exitElseIfClause(ElseIfClause elseIfClause) {}
    public void enterElseClause(ElseClause elseStmt) {}
    public void exitElseClause(ElseClause elseStmt) {}

    public void enterSwitch(Switch switchStmt) {}
    public void exitSwitch(Switch switchStmt) {}
    public void enterSwitchCase(SwitchCase switchCase) {}
    public void exitSwitchCase(SwitchCase switchCase) {}
    public void enterSwitchOtherwise(SwitchOtherwise switchOtherwise) {}
    public void exitSwitchOtherwise(SwitchOtherwise switchOtherwise) {}

    public void enterBreakStmt(Break breakStmt) {}
    public void exitBreakStmt(Break breakStmt) {}

    /**
     * Directives
     */
    public void enterSideEffect(SideEffect funCallStmt) {}
    public void exitSideEffect(SideEffect funCallStmt) {}

}
