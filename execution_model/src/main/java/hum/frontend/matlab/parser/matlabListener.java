// Generated from /home/quepas/PhD/Publications/lcpc19-execution-model/execution_model/src/hum/frontend/matlab/grammar/matlab.g4 by ANTLR 4.7.2
package hum.frontend.matlab.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link matlabParser}.
 */
public interface matlabListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code scriptFile}
	 * labeled alternative in {@link matlabParser#m_file}.
	 * @param ctx the parse tree
	 */
	void enterScriptFile(matlabParser.ScriptFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scriptFile}
	 * labeled alternative in {@link matlabParser#m_file}.
	 * @param ctx the parse tree
	 */
	void exitScriptFile(matlabParser.ScriptFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionFile}
	 * labeled alternative in {@link matlabParser#m_file}.
	 * @param ctx the parse tree
	 */
	void enterFunctionFile(matlabParser.FunctionFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionFile}
	 * labeled alternative in {@link matlabParser#m_file}.
	 * @param ctx the parse tree
	 */
	void exitFunctionFile(matlabParser.FunctionFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtFor}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtFor(matlabParser.StmtForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtFor}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtFor(matlabParser.StmtForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtParfor}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtParfor(matlabParser.StmtParforContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtParfor}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtParfor(matlabParser.StmtParforContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtWhile}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtWhile(matlabParser.StmtWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtWhile}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtWhile(matlabParser.StmtWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtIf(matlabParser.StmtIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtIf(matlabParser.StmtIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtSwitch}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtSwitch(matlabParser.StmtSwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtSwitch}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtSwitch(matlabParser.StmtSwitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtTry}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtTry(matlabParser.StmtTryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtTry}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtTry(matlabParser.StmtTryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtBreak}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtBreak(matlabParser.StmtBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtBreak}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtBreak(matlabParser.StmtBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtGlobal}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtGlobal(matlabParser.StmtGlobalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtGlobal}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtGlobal(matlabParser.StmtGlobalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtPersistent}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtPersistent(matlabParser.StmtPersistentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtPersistent}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtPersistent(matlabParser.StmtPersistentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtSingleAssignment}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtSingleAssignment(matlabParser.StmtSingleAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtSingleAssignment}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtSingleAssignment(matlabParser.StmtSingleAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtMultiAssignment}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtMultiAssignment(matlabParser.StmtMultiAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtMultiAssignment}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtMultiAssignment(matlabParser.StmtMultiAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtCommand}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtCommand(matlabParser.StmtCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtCommand}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtCommand(matlabParser.StmtCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtShell}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtShell(matlabParser.StmtShellContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtShell}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtShell(matlabParser.StmtShellContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtSideEffect}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtSideEffect(matlabParser.StmtSideEffectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtSideEffect}
	 * labeled alternative in {@link matlabParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtSideEffect(matlabParser.StmtSideEffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#sep}.
	 * @param ctx the parse tree
	 */
	void enterSep(matlabParser.SepContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#sep}.
	 * @param ctx the parse tree
	 */
	void exitSep(matlabParser.SepContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(matlabParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(matlabParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#if_clause}.
	 * @param ctx the parse tree
	 */
	void enterIf_clause(matlabParser.If_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#if_clause}.
	 * @param ctx the parse tree
	 */
	void exitIf_clause(matlabParser.If_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#elseif_clause}.
	 * @param ctx the parse tree
	 */
	void enterElseif_clause(matlabParser.Elseif_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#elseif_clause}.
	 * @param ctx the parse tree
	 */
	void exitElseif_clause(matlabParser.Elseif_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void enterElse_clause(matlabParser.Else_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void exitElse_clause(matlabParser.Else_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#case_clause}.
	 * @param ctx the parse tree
	 */
	void enterCase_clause(matlabParser.Case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#case_clause}.
	 * @param ctx the parse tree
	 */
	void exitCase_clause(matlabParser.Case_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#otherwise_clause}.
	 * @param ctx the parse tree
	 */
	void enterOtherwise_clause(matlabParser.Otherwise_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#otherwise_clause}.
	 * @param ctx the parse tree
	 */
	void exitOtherwise_clause(matlabParser.Otherwise_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#catch_clause}.
	 * @param ctx the parse tree
	 */
	void enterCatch_clause(matlabParser.Catch_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#catch_clause}.
	 * @param ctx the parse tree
	 */
	void exitCatch_clause(matlabParser.Catch_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#shell_stmt}.
	 * @param ctx the parse tree
	 */
	void enterShell_stmt(matlabParser.Shell_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#shell_stmt}.
	 * @param ctx the parse tree
	 */
	void exitShell_stmt(matlabParser.Shell_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(matlabParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(matlabParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#matrix}.
	 * @param ctx the parse tree
	 */
	void enterMatrix(matlabParser.MatrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#matrix}.
	 * @param ctx the parse tree
	 */
	void exitMatrix(matlabParser.MatrixContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#cell_array}.
	 * @param ctx the parse tree
	 */
	void enterCell_array(matlabParser.Cell_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#cell_array}.
	 * @param ctx the parse tree
	 */
	void exitCell_array(matlabParser.Cell_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(matlabParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(matlabParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCellReadRef}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCellReadRef(matlabParser.ExprCellReadRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCellReadRef}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCellReadRef(matlabParser.ExprCellReadRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNumeric}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNumeric(matlabParser.ExprNumericContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNumeric}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNumeric(matlabParser.ExprNumericContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprHandle}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprHandle(matlabParser.ExprHandleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprHandle}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprHandle(matlabParser.ExprHandleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprShortAnd}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprShortAnd(matlabParser.ExprShortAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprShortAnd}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprShortAnd(matlabParser.ExprShortAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprComparison}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprComparison(matlabParser.ExprComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprComparison}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprComparison(matlabParser.ExprComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprShortOr}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprShortOr(matlabParser.ExprShortOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprShortOr}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprShortOr(matlabParser.ExprShortOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprUnary}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(matlabParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprUnary}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(matlabParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprTranspose}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTranspose(matlabParser.ExprTransposeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprTranspose}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTranspose(matlabParser.ExprTransposeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprLambda}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLambda(matlabParser.ExprLambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprLambda}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLambda(matlabParser.ExprLambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprIndexEnd}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIndexEnd(matlabParser.ExprIndexEndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprIndexEnd}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIndexEnd(matlabParser.ExprIndexEndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprArithmetic}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprArithmetic(matlabParser.ExprArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprArithmetic}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprArithmetic(matlabParser.ExprArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCell}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCell(matlabParser.ExprCellContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCell}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCell(matlabParser.ExprCellContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMatrixOp}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMatrixOp(matlabParser.ExprMatrixOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMatrixOp}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMatrixOp(matlabParser.ExprMatrixOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOr}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(matlabParser.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOr}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(matlabParser.ExprOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprArrayReadRefOrFunCall}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprArrayReadRefOrFunCall(matlabParser.ExprArrayReadRefOrFunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprArrayReadRefOrFunCall}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprArrayReadRefOrFunCall(matlabParser.ExprArrayReadRefOrFunCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprString}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprString(matlabParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprString}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprString(matlabParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprIndexAll}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIndexAll(matlabParser.ExprIndexAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprIndexAll}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIndexAll(matlabParser.ExprIndexAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(matlabParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(matlabParser.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprColon}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprColon(matlabParser.ExprColonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprColon}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprColon(matlabParser.ExprColonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPower}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPower(matlabParser.ExprPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPower}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPower(matlabParser.ExprPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMatrix}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMatrix(matlabParser.ExprMatrixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMatrix}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMatrix(matlabParser.ExprMatrixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprInParentheses}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInParentheses(matlabParser.ExprInParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprInParentheses}
	 * labeled alternative in {@link matlabParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInParentheses(matlabParser.ExprInParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayWriteRef}
	 * labeled alternative in {@link matlabParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterArrayWriteRef(matlabParser.ArrayWriteRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayWriteRef}
	 * labeled alternative in {@link matlabParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitArrayWriteRef(matlabParser.ArrayWriteRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cellWriteRef}
	 * labeled alternative in {@link matlabParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterCellWriteRef(matlabParser.CellWriteRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cellWriteRef}
	 * labeled alternative in {@link matlabParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitCellWriteRef(matlabParser.CellWriteRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anyWriteRef}
	 * labeled alternative in {@link matlabParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterAnyWriteRef(matlabParser.AnyWriteRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anyWriteRef}
	 * labeled alternative in {@link matlabParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitAnyWriteRef(matlabParser.AnyWriteRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#expr_primary}.
	 * @param ctx the parse tree
	 */
	void enterExpr_primary(matlabParser.Expr_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#expr_primary}.
	 * @param ctx the parse tree
	 */
	void exitExpr_primary(matlabParser.Expr_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#expr_index}.
	 * @param ctx the parse tree
	 */
	void enterExpr_index(matlabParser.Expr_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#expr_index}.
	 * @param ctx the parse tree
	 */
	void exitExpr_index(matlabParser.Expr_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#expr_index_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_index_list(matlabParser.Expr_index_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#expr_index_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_index_list(matlabParser.Expr_index_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(matlabParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(matlabParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#outputs}.
	 * @param ctx the parse tree
	 */
	void enterOutputs(matlabParser.OutputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#outputs}.
	 * @param ctx the parse tree
	 */
	void exitOutputs(matlabParser.OutputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#name_list}.
	 * @param ctx the parse tree
	 */
	void enterName_list(matlabParser.Name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#name_list}.
	 * @param ctx the parse tree
	 */
	void exitName_list(matlabParser.Name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#inputs}.
	 * @param ctx the parse tree
	 */
	void enterInputs(matlabParser.InputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#inputs}.
	 * @param ctx the parse tree
	 */
	void exitInputs(matlabParser.InputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlabParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(matlabParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlabParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(matlabParser.Parameter_listContext ctx);
}