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
 */
public class BaseASTVisitor<T> implements ASTVisitor<T> {

    @Override
    public T visit(Node node) throws Exception {
        return node.accept(this);
    }

    @Override
    public T visitParentheses(Parentheses parentheses) throws Exception {
        return visitChildren(parentheses);
    }

    @Override
    public T visitCell(Cell cell) throws Exception {
        return visitChildren(cell);
    }

    @Override
    public T visitMatrix(Matrix matrix) throws Exception {
        return visitChildren(matrix);
    }

    @Override
    public T visitNumeric(Numeric numeric) throws Exception {
        return visitChildren(numeric);
    }

    @Override
    public T visitString(String string) throws Exception {
        return visitChildren(string);
    }

    @Override
    public T visitHandle(Handle handle) throws Exception {
        return visitChildren(handle);
    }

    @Override
    public T visitLambda(Lambda lambda) throws Exception {
        return visitChildren(lambda);
    }

    @Override
    public T visitRange(Range range) throws Exception {
        return visitChildren(range);
    }

    @Override
    public T visitLT(Lt lt) throws Exception {
        return visitChildren(lt);
    }

    @Override
    public T visitLE(Le le) throws Exception {
        return visitChildren(le);
    }

    @Override
    public T visitGT(Gt gt) throws Exception {
        return visitChildren(gt);
    }

    @Override
    public T visitGE(Ge ge) throws Exception {
        return visitChildren(ge);
    }

    @Override
    public T visitEQ(Eq eq) throws Exception {
        return visitChildren(eq);
    }

    @Override
    public T visitNE(Ne ne) throws Exception {
        return visitChildren(ne);
    }

    @Override
    public T visitAnd(And and) throws Exception {
        return visitChildren(and);
    }

    @Override
    public T visitOr(Or or) throws Exception {
        return visitChildren(or);
    }

    @Override
    public T visitShortAnd(ShortAnd shortAnd) throws Exception {
        return visitChildren(shortAnd);
    }

    @Override
    public T visitShortOr(ShortOr shortOr) throws Exception {
        return visitChildren(shortOr);
    }

    @Override
    public T visitCTranspose(CTranspose cTranspose) throws Exception {
        return visitChildren(cTranspose);
    }

    @Override
    public T visitPower(Power power) throws Exception {
        return visitChildren(power);
    }

    @Override
    public T visitMPower(MPower mpower) throws Exception {
        return visitChildren(mpower);
    }

    @Override
    public T visitUMinus(UMinus uminus) throws Exception {
        return visitChildren(uminus);
    }

    @Override
    public T visitUPlus(UPlus uplus) throws Exception {
        return visitChildren(uplus);
    }

    @Override
    public T visitNot(Not not) throws Exception {
        return visitChildren(not);
    }

    @Override
    public T visitTimes(Times times) throws Exception {
        return visitChildren(times);
    }

    @Override
    public T visitRDivide(RDivide rdivide) throws Exception {
        return visitChildren(rdivide);
    }

    @Override
    public T visitLDivide(LDivide ldivide) throws Exception {
        return visitChildren(ldivide);
    }

    @Override
    public T visitMTimes(MTimes mtimes) throws Exception {
        return visitChildren(mtimes);
    }

    @Override
    public T visitMRDivide(MRDivide mrdivide) throws Exception {
        return visitChildren(mrdivide);
    }

    @Override
    public T visitMLDivide(MLDivide mldivide) throws Exception {
        return visitChildren(mldivide);
    }

    @Override
    public T visitPlus(Plus plus) throws Exception {
        return visitChildren(plus);
    }

    @Override
    public T visitMinus(Minus minus) throws Exception {
        return visitChildren(minus);
    }

    @Override
    public T visitTranspose(Transpose transpose) throws Exception {
        return visitChildren(transpose);
    }

    @Override
    public T visitReadRef(ReadRef readRef) throws Exception {
        return visitChildren(readRef);
    }

    @Override
    public T visitWriteRef(WriteRef writeRef) throws Exception {
        return visitChildren(writeRef);
    }

    @Override
    public T visitIndexAll(IndexAll indexAll) throws Exception {
        return visitChildren(indexAll);
    }

    @Override
    public T visitIndexEnd(IndexEnd indexEnd) throws Exception {
        return visitChildren(indexEnd);
    }

    @Override
    public T visitScript(Script script) throws Exception {
        return visitChildren(script);
    }

    @Override
    public T visitFunction(Function function) throws Exception {
        return visitChildren(function);
    }

    @Override
    public T visitFunctionFile(FunctionFile functionFile) throws Exception {
        return visitChildren(functionFile);
    }

    @Override
    public T visitGlobal(Global global) throws Exception {
        return visitChildren(global);
    }

    @Override
    public T visitSingleAssignment(SingleAssignment assignment) throws Exception {
        return visitChildren(assignment);
    }

    @Override
    public T visitMultiAssignment(MultiAssignment assignment) throws Exception {
        return visitChildren(assignment);
    }

    @Override
    public T visitExpressionStatement(ExpressionStatement expressionStatement) throws Exception {
        return visitChildren(expressionStatement);
    }

    @Override
    public T visitForLoop(ForLoop loop) throws Exception {
        return visitChildren(loop);
    }

    @Override
    public T visitParforLoop(ParforLoop loop) throws Exception {
        return visitChildren(loop);
    }

    @Override
    public T visitWhileLoop(WhileLoop loop) throws Exception {
        return visitChildren(loop);
    }

    @Override
    public T visitIf(If ifStmt) throws Exception {
        return visitChildren(ifStmt);
    }

    @Override
    public T visitTry(Try tryStmt) throws Exception {
        return visitChildren(tryStmt);
    }

    @Override
    public T visitCatchClause(CatchClause catchClause) throws Exception {
        return visitChildren(catchClause);
    }

    @Override
    public T visitIfClause(IfClause ifClause) throws Exception {
        return visitChildren(ifClause);
    }

    @Override
    public T visitElseIfClause(ElseIfClause elseIfClause) throws Exception {
        return visitChildren(elseIfClause);
    }

    @Override
    public T visitElseClause(ElseClause elseStmt) throws Exception {
        return visitChildren(elseStmt);
    }

    @Override
    public T visitSwitch(Switch switchStmt) throws Exception {
        return visitChildren(switchStmt);
    }

    @Override
    public T visitSwitchCase(SwitchCase switchCase) throws Exception {
        return visitChildren(switchCase);
    }

    @Override
    public T visitSwitchOtherwise(SwitchOtherwise switchOtherwise) throws Exception {
        return visitChildren(switchOtherwise);
    }

    @Override
    public T visitSideEffect(SideEffect funCallStmt) throws Exception {
        return visitChildren(funCallStmt);
    }

    @Override
    public T visitBreak(Break breakStmt) throws Exception {
        return visitChildren(breakStmt);
    }

    @Override
    public T visitChildren(Node node) throws Exception {
        T result = defaultResult();

        for (Node child : node.getTraversalOrder()) {
            T childResult = child.accept(this);
            result = aggregateResults(result, childResult);
        }
        return result;
    }

    @Override
    public T defaultResult() {
        return null;
    }

    @Override
    public T aggregateResults(T aggregate, T nextValue) {
        return nextValue;
    }

}
