// Generated from /home/quepas/PhD/Publications/lcpc19-execution-model/execution_model/src/hum/frontend/matlab/grammar/matlab.g4 by ANTLR 4.7.2
package hum.frontend.matlab.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link matlabParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface matlabVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code scriptFile}
	 * labeled alternative in {@link matlabParser#m_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptFile(matlabParser.ScriptFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionFile}
	 * labeled alternative in {@link matlabParser#m_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionFile(matlabParser.FunctionFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtFor}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtFor(matlabParser.StmtForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtParfor}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtParfor(matlabParser.StmtParforContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtWhile}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtWhile(matlabParser.StmtWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIf(matlabParser.StmtIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtSwitch}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtSwitch(matlabParser.StmtSwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtTry}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtTry(matlabParser.StmtTryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtBreak}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtBreak(matlabParser.StmtBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtGlobal}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtGlobal(matlabParser.StmtGlobalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtPersistent}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtPersistent(matlabParser.StmtPersistentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtSingleAssignment}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtSingleAssignment(matlabParser.StmtSingleAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtMultiAssignment}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtMultiAssignment(matlabParser.StmtMultiAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtCommand}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtCommand(matlabParser.StmtCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtShell}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtShell(matlabParser.StmtShellContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtSideEffect}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtSideEffect(matlabParser.StmtSideEffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#sep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSep(matlabParser.SepContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(matlabParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#if_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_clause(matlabParser.If_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#elseif_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_clause(matlabParser.Elseif_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#else_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_clause(matlabParser.Else_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#case_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_clause(matlabParser.Case_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#otherwise_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherwise_clause(matlabParser.Otherwise_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#catch_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_clause(matlabParser.Catch_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#shell_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShell_stmt(matlabParser.Shell_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(matlabParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#matrix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix(matlabParser.MatrixContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#cell_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_array(matlabParser.Cell_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(matlabParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCellReadRef}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCellReadRef(matlabParser.ExprCellReadRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNumeric}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumeric(matlabParser.ExprNumericContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprHandle}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprHandle(matlabParser.ExprHandleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprShortAnd}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprShortAnd(matlabParser.ExprShortAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprComparison}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprComparison(matlabParser.ExprComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprShortOr}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprShortOr(matlabParser.ExprShortOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprUnary}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnary(matlabParser.ExprUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprTranspose}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTranspose(matlabParser.ExprTransposeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLambda}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLambda(matlabParser.ExprLambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprIndexEnd}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIndexEnd(matlabParser.ExprIndexEndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprArithmetic}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArithmetic(matlabParser.ExprArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCell}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCell(matlabParser.ExprCellContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMatrixOp}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMatrixOp(matlabParser.ExprMatrixOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOr}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr(matlabParser.ExprOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprArrayReadRefOrFunCall}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArrayReadRefOrFunCall(matlabParser.ExprArrayReadRefOrFunCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprString}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(matlabParser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprIndexAll}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIndexAll(matlabParser.ExprIndexAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(matlabParser.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprColon}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprColon(matlabParser.ExprColonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPower}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPower(matlabParser.ExprPowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMatrix}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMatrix(matlabParser.ExprMatrixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprInParentheses}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInParentheses(matlabParser.ExprInParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayWriteRef}
	 * labeled alternative in {@link matlabParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayWriteRef(matlabParser.ArrayWriteRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cellWriteRef}
	 * labeled alternative in {@link matlabParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCellWriteRef(matlabParser.CellWriteRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code anyWriteRef}
	 * labeled alternative in {@link matlabParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyWriteRef(matlabParser.AnyWriteRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#expr_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_primary(matlabParser.Expr_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#expr_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_index(matlabParser.Expr_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#expr_index_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_index_list(matlabParser.Expr_index_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(matlabParser.Function_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#outputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputs(matlabParser.OutputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_list(matlabParser.Name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#inputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputs(matlabParser.InputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link matlabParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(matlabParser.Parameter_listContext ctx);
}