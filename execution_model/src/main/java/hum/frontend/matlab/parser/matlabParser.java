// Generated from /home/quepas/PhD/Publications/lcpc19-execution-model/execution_model/src/hum/frontend/matlab/grammar/matlab.g4 by ANTLR 4.7.2
package hum.frontend.matlab.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class matlabParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, NEWLINE=27, WS=28, SHELL_COMMAND=29, BANG=30, PRINT=31, 
		DISPLAY=32, SECTION_COMMENT=33, LINE_COMMENT=34, BLOCK_COMMENT=35, DECIMAL_INTEGER=36, 
		FLOATING_POINT=37, COMPLEX_NUMBER=38, STRING=39, TRANSPOSE=40, C_TRANSPOSE=41, 
		POWER=42, M_POWER=43, NOT=44, TIMES=45, R_DIVIDE=46, L_DIVIDE=47, M_TIMES=48, 
		MR_DIVIDE=49, ML_DIVIDE=50, PLUS=51, MINUS=52, COLON=53, LT=54, LE=55, 
		GT=56, GE=57, EQ=58, NE=59, AND=60, OR=61, SHORT_AND=62, SHORT_OR=63, 
		ELLIPSIS=64, NAME=65;
	public static final int
		RULE_m_file = 0, RULE_statement = 1, RULE_sep = 2, RULE_body = 3, RULE_if_clause = 4, 
		RULE_elseif_clause = 5, RULE_else_clause = 6, RULE_case_clause = 7, RULE_otherwise_clause = 8, 
		RULE_catch_clause = 9, RULE_shell_stmt = 10, RULE_numeric = 11, RULE_matrix = 12, 
		RULE_cell_array = 13, RULE_row = 14, RULE_expr = 15, RULE_variable = 16, 
		RULE_expr_primary = 17, RULE_expr_index = 18, RULE_expr_index_list = 19, 
		RULE_function_def = 20, RULE_outputs = 21, RULE_name_list = 22, RULE_inputs = 23, 
		RULE_parameter_list = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"m_file", "statement", "sep", "body", "if_clause", "elseif_clause", "else_clause", 
			"case_clause", "otherwise_clause", "catch_clause", "shell_stmt", "numeric", 
			"matrix", "cell_array", "row", "expr", "variable", "expr_primary", "expr_index", 
			"expr_index_list", "function_def", "outputs", "name_list", "inputs", 
			"parameter_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'='", "'end'", "'parfor'", "'while'", "'switch'", "'try'", 
			"'break'", "'global'", "'persistent'", "'['", "','", "']'", "';'", "'if'", 
			"'elseif'", "'else'", "'case'", "'otherwise'", "'catch'", "'{'", "'}'", 
			"'('", "')'", "'@'", "'function'", "'\n'", null, null, "'!'", null, null, 
			null, null, null, null, null, null, null, null, null, "'.^'", "'^'", 
			"'~'", "'.*'", "'./'", "'.\\'", "'*'", "'/'", "'\\'", "'+'", "'-'", "':'", 
			"'<'", "'<='", "'>'", "'>='", "'=='", "'~='", "'&'", "'|'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NEWLINE", "WS", "SHELL_COMMAND", "BANG", "PRINT", 
			"DISPLAY", "SECTION_COMMENT", "LINE_COMMENT", "BLOCK_COMMENT", "DECIMAL_INTEGER", 
			"FLOATING_POINT", "COMPLEX_NUMBER", "STRING", "TRANSPOSE", "C_TRANSPOSE", 
			"POWER", "M_POWER", "NOT", "TIMES", "R_DIVIDE", "L_DIVIDE", "M_TIMES", 
			"MR_DIVIDE", "ML_DIVIDE", "PLUS", "MINUS", "COLON", "LT", "LE", "GT", 
			"GE", "EQ", "NE", "AND", "OR", "SHORT_AND", "SHORT_OR", "ELLIPSIS", "NAME"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "matlab.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private static boolean isIndexedExpr = false;

	public matlabParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class M_fileContext extends ParserRuleContext {
		public M_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_file; }
	 
		public M_fileContext() { }
		public void copyFrom(M_fileContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionFileContext extends M_fileContext {
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public TerminalNode EOF() { return getToken(matlabParser.EOF, 0); }
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public FunctionFileContext(M_fileContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterFunctionFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitFunctionFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitFunctionFile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScriptFileContext extends M_fileContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(matlabParser.EOF, 0); }
		public ScriptFileContext(M_fileContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterScriptFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitScriptFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitScriptFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_fileContext m_file() throws RecognitionException {
		M_fileContext _localctx = new M_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_m_file);
		int _la;
		try {
			int _alt;
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ScriptFileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				body();
				setState(51);
				match(EOF);
				}
				break;
			case 2:
				_localctx = new FunctionFileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << NEWLINE))) != 0)) {
					{
					{
					setState(53);
					sep();
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				function_def();
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(61); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(60);
							sep();
							}
							}
							setState(63); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << NEWLINE))) != 0) );
						setState(65);
						function_def();
						}
						} 
					}
					setState(71);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << NEWLINE))) != 0)) {
					{
					{
					setState(72);
					sep();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtBreakContext extends StatementContext {
		public StmtBreakContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterStmtBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitStmtBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitStmtBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtMultiAssignmentContext extends StatementContext {
		public Expr_primaryContext expr_primary() {
			return getRuleContext(Expr_primaryContext.class,0);
		}
		public List<Expr_indexContext> expr_index() {
			return getRuleContexts(Expr_indexContext.class);
		}
		public Expr_indexContext expr_index(int i) {
			return getRuleContext(Expr_indexContext.class,i);
		}
		public List<TerminalNode> NOT() { return getTokens(matlabParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(matlabParser.NOT, i);
		}
		public StmtMultiAssignmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterStmtMultiAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitStmtMultiAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitStmtMultiAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtTryContext extends StatementContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Catch_clauseContext catch_clause() {
			return getRuleContext(Catch_clauseContext.class,0);
		}
		public StmtTryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterStmtTry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitStmtTry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitStmtTry(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtSingleAssignmentContext extends StatementContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Expr_primaryContext expr_primary() {
			return getRuleContext(Expr_primaryContext.class,0);
		}
		public StmtSingleAssignmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterStmtSingleAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitStmtSingleAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitStmtSingleAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtGlobalContext extends StatementContext {
		public List<TerminalNode> NAME() { return getTokens(matlabParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(matlabParser.NAME, i);
		}
		public StmtGlobalContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterStmtGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitStmtGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitStmtGlobal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtShellContext extends StatementContext {
		public Shell_stmtContext shell_stmt() {
			return getRuleContext(Shell_stmtContext.class,0);
		}
		public StmtShellContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterStmtShell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitStmtShell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitStmtShell(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtSideEffectContext extends StatementContext {
		public Expr_primaryContext expr_primary() {
			return getRuleContext(Expr_primaryContext.class,0);
		}
		public StmtSideEffectContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterStmtSideEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitStmtSideEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitStmtSideEffect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtCommandContext extends StatementContext {
		public List<TerminalNode> NAME() { return getTokens(matlabParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(matlabParser.NAME, i);
		}
		public StmtCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterStmtCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitStmtCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitStmtCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtSwitchContext extends StatementContext {
		public Expr_primaryContext expr_primary() {
			return getRuleContext(Expr_primaryContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(matlabParser.NEWLINE, 0); }
		public List<Case_clauseContext> case_clause() {
			return getRuleContexts(Case_clauseContext.class);
		}
		public Case_clauseContext case_clause(int i) {
			return getRuleContext(Case_clauseContext.class,i);
		}
		public Otherwise_clauseContext otherwise_clause() {
			return getRuleContext(Otherwise_clauseContext.class,0);
		}
		public StmtSwitchContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterStmtSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitStmtSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitStmtSwitch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtParforContext extends StatementContext {
		public ExprContext initVal;
		public ExprContext endVal;
		public TerminalNode NAME() { return getToken(matlabParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(matlabParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StmtParforContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterStmtParfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitStmtParfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitStmtParfor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtWhileContext extends StatementContext {
		public Expr_primaryContext expr_primary() {
			return getRuleContext(Expr_primaryContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(matlabParser.NEWLINE, 0); }
		public StmtWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterStmtWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitStmtWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitStmtWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtForContext extends StatementContext {
		public TerminalNode NAME() { return getToken(matlabParser.NAME, 0); }
		public Expr_primaryContext expr_primary() {
			return getRuleContext(Expr_primaryContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public StmtForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterStmtFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitStmtFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitStmtFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtIfContext extends StatementContext {
		public If_clauseContext if_clause() {
			return getRuleContext(If_clauseContext.class,0);
		}
		public List<Elseif_clauseContext> elseif_clause() {
			return getRuleContexts(Elseif_clauseContext.class);
		}
		public Elseif_clauseContext elseif_clause(int i) {
			return getRuleContext(Elseif_clauseContext.class,i);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public StmtIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterStmtIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitStmtIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitStmtIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtPersistentContext extends StatementContext {
		public List<TerminalNode> NAME() { return getTokens(matlabParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(matlabParser.NAME, i);
		}
		public StmtPersistentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterStmtPersistent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitStmtPersistent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitStmtPersistent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new StmtForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(T__0);
				setState(83);
				match(NAME);
				setState(84);
				match(T__1);
				setState(85);
				expr_primary();
				setState(86);
				body();
				setState(87);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new StmtParforContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(T__3);
				setState(90);
				match(NAME);
				setState(91);
				match(T__1);
				setState(92);
				((StmtParforContext)_localctx).initVal = expr(0);
				setState(93);
				match(COLON);
				setState(94);
				((StmtParforContext)_localctx).endVal = expr(0);
				setState(95);
				body();
				setState(96);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new StmtWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(T__4);
				setState(99);
				expr_primary();
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(100);
					match(NEWLINE);
					}
					break;
				}
				setState(103);
				body();
				setState(104);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				if_clause();
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(107);
					elseif_clause();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(113);
					else_clause();
					}
				}

				setState(116);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new StmtSwitchContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				match(T__5);
				setState(119);
				expr_primary();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(120);
					match(NEWLINE);
					}
				}

				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(123);
					case_clause();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(129);
					otherwise_clause();
					}
				}

				setState(132);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new StmtTryContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(134);
				match(T__6);
				setState(135);
				body();
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(136);
					catch_clause();
					}
				}

				setState(139);
				match(T__2);
				}
				break;
			case 7:
				_localctx = new StmtBreakContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				match(T__7);
				}
				break;
			case 8:
				_localctx = new StmtGlobalContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				match(T__8);
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(143);
					match(NAME);
					}
					}
					setState(146); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				}
				break;
			case 9:
				_localctx = new StmtPersistentContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(148);
				match(T__9);
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(149);
					match(NAME);
					}
					}
					setState(152); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				}
				break;
			case 10:
				_localctx = new StmtSingleAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(154);
				variable();
				setState(155);
				match(T__1);
				setState(156);
				expr_primary();
				}
				break;
			case 11:
				_localctx = new StmtMultiAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(158);
				match(T__10);
				setState(175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(159);
						expr_index();
						}
						break;
					case 2:
						{
						setState(160);
						match(NOT);
						}
						break;
					}
					setState(172);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(164);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
							case 1:
								{
								setState(163);
								match(T__11);
								}
								break;
							}
							setState(168);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
							case 1:
								{
								setState(166);
								expr_index();
								}
								break;
							case 2:
								{
								setState(167);
								match(NOT);
								}
								break;
							}
							}
							} 
						}
						setState(174);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					}
					}
					break;
				}
				setState(177);
				match(T__12);
				setState(178);
				match(T__1);
				setState(179);
				expr_primary();
				}
				break;
			case 12:
				_localctx = new StmtCommandContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(180);
				match(NAME);
				setState(182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(181);
					match(NAME);
					}
					}
					setState(184); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				}
				break;
			case 13:
				_localctx = new StmtShellContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(186);
				shell_stmt();
				}
				break;
			case 14:
				_localctx = new StmtSideEffectContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(187);
				expr_primary();
				setState(188);
				match(T__13);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SepContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(matlabParser.NEWLINE, 0); }
		public SepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterSep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitSep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitSep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SepContext sep() throws RecognitionException {
		SepContext _localctx = new SepContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << NEWLINE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(194);
						sep();
						}
						} 
					}
					setState(199);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(200);
				statement();
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(202); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(201);
								sep();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(204); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(206);
						statement();
						}
						} 
					}
					setState(212);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
				break;
			}
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(215);
					sep();
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_clauseContext extends ParserRuleContext {
		public Expr_primaryContext expr_primary() {
			return getRuleContext(Expr_primaryContext.class,0);
		}
		public SepContext sep() {
			return getRuleContext(SepContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public If_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterIf_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitIf_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitIf_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_clauseContext if_clause() throws RecognitionException {
		If_clauseContext _localctx = new If_clauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__14);
			setState(222);
			expr_primary();
			setState(223);
			sep();
			setState(224);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elseif_clauseContext extends ParserRuleContext {
		public Expr_primaryContext expr_primary() {
			return getRuleContext(Expr_primaryContext.class,0);
		}
		public SepContext sep() {
			return getRuleContext(SepContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Elseif_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterElseif_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitElseif_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitElseif_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_clauseContext elseif_clause() throws RecognitionException {
		Elseif_clauseContext _localctx = new Elseif_clauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elseif_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__15);
			setState(227);
			expr_primary();
			setState(228);
			sep();
			setState(229);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_clauseContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterElse_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitElse_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitElse_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_clauseContext else_clause() throws RecognitionException {
		Else_clauseContext _localctx = new Else_clauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_else_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__16);
			setState(232);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_clauseContext extends ParserRuleContext {
		public Expr_primaryContext expr_primary() {
			return getRuleContext(Expr_primaryContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterCase_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitCase_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitCase_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_clauseContext case_clause() throws RecognitionException {
		Case_clauseContext _localctx = new Case_clauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_case_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__17);
			setState(235);
			expr_primary();
			setState(236);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Otherwise_clauseContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Otherwise_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherwise_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterOtherwise_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitOtherwise_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitOtherwise_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Otherwise_clauseContext otherwise_clause() throws RecognitionException {
		Otherwise_clauseContext _localctx = new Otherwise_clauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_otherwise_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__18);
			setState(239);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_clauseContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode NAME() { return getToken(matlabParser.NAME, 0); }
		public Catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterCatch_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitCatch_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitCatch_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_clauseContext catch_clause() throws RecognitionException {
		Catch_clauseContext _localctx = new Catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_catch_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__19);
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(242);
				match(NAME);
				}
				break;
			}
			setState(245);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shell_stmtContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(matlabParser.BANG, 0); }
		public TerminalNode SHELL_COMMAND() { return getToken(matlabParser.SHELL_COMMAND, 0); }
		public Shell_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shell_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterShell_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitShell_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitShell_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shell_stmtContext shell_stmt() throws RecognitionException {
		Shell_stmtContext _localctx = new Shell_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_shell_stmt);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(BANG);
				setState(248);
				match(SHELL_COMMAND);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(BANG);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericContext extends ParserRuleContext {
		public TerminalNode COMPLEX_NUMBER() { return getToken(matlabParser.COMPLEX_NUMBER, 0); }
		public TerminalNode DECIMAL_INTEGER() { return getToken(matlabParser.DECIMAL_INTEGER, 0); }
		public TerminalNode FLOATING_POINT() { return getToken(matlabParser.FLOATING_POINT, 0); }
		public NumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterNumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitNumeric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitNumeric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericContext numeric() throws RecognitionException {
		NumericContext _localctx = new NumericContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_numeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_INTEGER) | (1L << FLOATING_POINT) | (1L << COMPLEX_NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatrixContext extends ParserRuleContext {
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(matlabParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(matlabParser.NEWLINE, i);
		}
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitMatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitMatrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_matrix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__10);
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(255);
				match(T__11);
				}
				break;
			}
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(258);
				row();
				}
				break;
			}
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==NEWLINE) {
				{
				{
				setState(261);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(263);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(262);
					row();
					}
					break;
				}
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cell_arrayContext extends ParserRuleContext {
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(matlabParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(matlabParser.NEWLINE, i);
		}
		public Cell_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cell_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterCell_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitCell_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitCell_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cell_arrayContext cell_array() throws RecognitionException {
		Cell_arrayContext _localctx = new Cell_arrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cell_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__20);
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(273);
				match(T__11);
				}
				break;
			}
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(276);
				row();
				}
				break;
			}
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==NEWLINE) {
				{
				{
				setState(279);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(280);
					row();
					}
					break;
				}
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowContext extends ParserRuleContext {
		public List<Expr_primaryContext> expr_primary() {
			return getRuleContexts(Expr_primaryContext.class);
		}
		public Expr_primaryContext expr_primary(int i) {
			return getRuleContext(Expr_primaryContext.class,i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_row);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(290);
				match(T__11);
				}
				break;
			}
			setState(293);
			expr_primary();
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(295);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(294);
						match(T__11);
						}
						break;
					}
					setState(297);
					expr_primary();
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(303);
				match(T__11);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprCellReadRefContext extends ExprContext {
		public TerminalNode NAME() { return getToken(matlabParser.NAME, 0); }
		public Expr_index_listContext expr_index_list() {
			return getRuleContext(Expr_index_listContext.class,0);
		}
		public ExprCellReadRefContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprCellReadRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprCellReadRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprCellReadRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNumericContext extends ExprContext {
		public NumericContext numeric() {
			return getRuleContext(NumericContext.class,0);
		}
		public ExprNumericContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprNumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprNumeric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprNumeric(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprHandleContext extends ExprContext {
		public TerminalNode NAME() { return getToken(matlabParser.NAME, 0); }
		public ExprHandleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprHandle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprHandle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprHandle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprShortAndContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode SHORT_AND() { return getToken(matlabParser.SHORT_AND, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprShortAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprShortAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprShortAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprShortAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprComparisonContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(matlabParser.LT, 0); }
		public TerminalNode LE() { return getToken(matlabParser.LE, 0); }
		public TerminalNode GT() { return getToken(matlabParser.GT, 0); }
		public TerminalNode GE() { return getToken(matlabParser.GE, 0); }
		public TerminalNode EQ() { return getToken(matlabParser.EQ, 0); }
		public TerminalNode NE() { return getToken(matlabParser.NE, 0); }
		public ExprComparisonContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprShortOrContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode SHORT_OR() { return getToken(matlabParser.SHORT_OR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprShortOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprShortOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprShortOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprShortOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprUnaryContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(matlabParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(matlabParser.PLUS, 0); }
		public TerminalNode NOT() { return getToken(matlabParser.NOT, 0); }
		public ExprUnaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprTransposeContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TRANSPOSE() { return getToken(matlabParser.TRANSPOSE, 0); }
		public TerminalNode C_TRANSPOSE() { return getToken(matlabParser.C_TRANSPOSE, 0); }
		public ExprTransposeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprTranspose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprTranspose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprTranspose(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprLambdaContext extends ExprContext {
		public InputsContext inputs() {
			return getRuleContext(InputsContext.class,0);
		}
		public Expr_primaryContext expr_primary() {
			return getRuleContext(Expr_primaryContext.class,0);
		}
		public ExprLambdaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIndexEndContext extends ExprContext {
		public ExprIndexEndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprIndexEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprIndexEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprIndexEnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprArithmeticContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(matlabParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(matlabParser.MINUS, 0); }
		public ExprArithmeticContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCellContext extends ExprContext {
		public Cell_arrayContext cell_array() {
			return getRuleContext(Cell_arrayContext.class,0);
		}
		public ExprCellContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprCell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprCell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprCell(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMatrixOpContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(matlabParser.TIMES, 0); }
		public TerminalNode R_DIVIDE() { return getToken(matlabParser.R_DIVIDE, 0); }
		public TerminalNode L_DIVIDE() { return getToken(matlabParser.L_DIVIDE, 0); }
		public TerminalNode M_TIMES() { return getToken(matlabParser.M_TIMES, 0); }
		public TerminalNode MR_DIVIDE() { return getToken(matlabParser.MR_DIVIDE, 0); }
		public TerminalNode ML_DIVIDE() { return getToken(matlabParser.ML_DIVIDE, 0); }
		public ExprMatrixOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprMatrixOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprMatrixOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprMatrixOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOrContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode OR() { return getToken(matlabParser.OR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprArrayReadRefOrFunCallContext extends ExprContext {
		public TerminalNode NAME() { return getToken(matlabParser.NAME, 0); }
		public Expr_index_listContext expr_index_list() {
			return getRuleContext(Expr_index_listContext.class,0);
		}
		public ExprArrayReadRefOrFunCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprArrayReadRefOrFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprArrayReadRefOrFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprArrayReadRefOrFunCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(matlabParser.STRING, 0); }
		public ExprStringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIndexAllContext extends ExprContext {
		public TerminalNode COLON() { return getToken(matlabParser.COLON, 0); }
		public ExprIndexAllContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprIndexAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprIndexAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprIndexAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAndContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode AND() { return getToken(matlabParser.AND, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprColonContext extends ExprContext {
		public ExprContext left;
		public ExprContext middle;
		public ExprContext right;
		public List<TerminalNode> COLON() { return getTokens(matlabParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(matlabParser.COLON, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprColonContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprColon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprColon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprColon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPowerContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POWER() { return getToken(matlabParser.POWER, 0); }
		public TerminalNode M_POWER() { return getToken(matlabParser.M_POWER, 0); }
		public ExprPowerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMatrixContext extends ExprContext {
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public ExprMatrixContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprMatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprMatrix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprInParenthesesContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprInParenthesesContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExprInParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExprInParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExprInParentheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				_localctx = new ExprInParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(307);
				match(T__22);
				setState(308);
				expr(0);
				setState(309);
				match(T__23);
				}
				break;
			case 2:
				{
				_localctx = new ExprUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(311);
				((ExprUnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
					((ExprUnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(312);
				expr(19);
				}
				break;
			case 3:
				{
				_localctx = new ExprMatrixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(313);
				matrix();
				}
				break;
			case 4:
				{
				_localctx = new ExprNumericContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314);
				numeric();
				}
				break;
			case 5:
				{
				_localctx = new ExprCellContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(315);
				cell_array();
				}
				break;
			case 6:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316);
				match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new ExprLambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317);
				match(T__24);
				setState(318);
				inputs();
				setState(319);
				expr_primary();
				}
				break;
			case 8:
				{
				_localctx = new ExprHandleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(321);
				match(T__24);
				setState(322);
				match(NAME);
				}
				break;
			case 9:
				{
				_localctx = new ExprArrayReadRefOrFunCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(323);
				match(NAME);
				setState(329);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(324);
					match(T__22);
					setState(326);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(325);
						expr_index_list();
						}
						break;
					}
					setState(328);
					match(T__23);
					}
					break;
				}
				}
				break;
			case 10:
				{
				_localctx = new ExprCellReadRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(331);
				match(NAME);
				{
				setState(332);
				match(T__20);
				setState(333);
				expr_index_list();
				setState(334);
				match(T__21);
				}
				}
				break;
			case 11:
				{
				_localctx = new ExprIndexAllContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(336);
				if (!( isIndexedExpr )) throw new FailedPredicateException(this, " isIndexedExpr ");
				setState(337);
				match(COLON);
				}
				break;
			case 12:
				{
				_localctx = new ExprIndexEndContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338);
				if (!( isIndexedExpr )) throw new FailedPredicateException(this, " isIndexedExpr ");
				setState(339);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(375);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new ExprPowerContext(new ExprContext(_parentctx, _parentState));
						((ExprPowerContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(342);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(343);
						((ExprPowerContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==POWER || _la==M_POWER) ) {
							((ExprPowerContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(344);
						((ExprPowerContext)_localctx).right = expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprMatrixOpContext(new ExprContext(_parentctx, _parentState));
						((ExprMatrixOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(345);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(346);
						((ExprMatrixOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << R_DIVIDE) | (1L << L_DIVIDE) | (1L << M_TIMES) | (1L << MR_DIVIDE) | (1L << ML_DIVIDE))) != 0)) ) {
							((ExprMatrixOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(347);
						((ExprMatrixOpContext)_localctx).right = expr(19);
						}
						break;
					case 3:
						{
						_localctx = new ExprArithmeticContext(new ExprContext(_parentctx, _parentState));
						((ExprArithmeticContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(348);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(349);
						((ExprArithmeticContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExprArithmeticContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(350);
						((ExprArithmeticContext)_localctx).right = expr(18);
						}
						break;
					case 4:
						{
						_localctx = new ExprColonContext(new ExprContext(_parentctx, _parentState));
						((ExprColonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(351);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(354);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
						case 1:
							{
							setState(352);
							match(COLON);
							setState(353);
							((ExprColonContext)_localctx).middle = expr(0);
							}
							break;
						}
						setState(356);
						match(COLON);
						setState(357);
						((ExprColonContext)_localctx).right = expr(17);
						}
						break;
					case 5:
						{
						_localctx = new ExprComparisonContext(new ExprContext(_parentctx, _parentState));
						((ExprComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(358);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(359);
						((ExprComparisonContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LE) | (1L << GT) | (1L << GE) | (1L << EQ) | (1L << NE))) != 0)) ) {
							((ExprComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(360);
						((ExprComparisonContext)_localctx).right = expr(16);
						}
						break;
					case 6:
						{
						_localctx = new ExprAndContext(new ExprContext(_parentctx, _parentState));
						((ExprAndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(361);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(362);
						match(AND);
						setState(363);
						((ExprAndContext)_localctx).right = expr(15);
						}
						break;
					case 7:
						{
						_localctx = new ExprOrContext(new ExprContext(_parentctx, _parentState));
						((ExprOrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(364);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(365);
						match(OR);
						setState(366);
						((ExprOrContext)_localctx).right = expr(14);
						}
						break;
					case 8:
						{
						_localctx = new ExprShortAndContext(new ExprContext(_parentctx, _parentState));
						((ExprShortAndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(367);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(368);
						match(SHORT_AND);
						setState(369);
						((ExprShortAndContext)_localctx).right = expr(13);
						}
						break;
					case 9:
						{
						_localctx = new ExprShortOrContext(new ExprContext(_parentctx, _parentState));
						((ExprShortOrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(370);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(371);
						match(SHORT_OR);
						setState(372);
						((ExprShortOrContext)_localctx).right = expr(12);
						}
						break;
					case 10:
						{
						_localctx = new ExprTransposeContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(373);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(374);
						((ExprTransposeContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==TRANSPOSE || _la==C_TRANSPOSE) ) {
							((ExprTransposeContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CellWriteRefContext extends VariableContext {
		public TerminalNode NAME() { return getToken(matlabParser.NAME, 0); }
		public Expr_index_listContext expr_index_list() {
			return getRuleContext(Expr_index_listContext.class,0);
		}
		public CellWriteRefContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterCellWriteRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitCellWriteRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitCellWriteRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnyWriteRefContext extends VariableContext {
		public TerminalNode NAME() { return getToken(matlabParser.NAME, 0); }
		public AnyWriteRefContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterAnyWriteRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitAnyWriteRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitAnyWriteRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayWriteRefContext extends VariableContext {
		public TerminalNode NAME() { return getToken(matlabParser.NAME, 0); }
		public Expr_index_listContext expr_index_list() {
			return getRuleContext(Expr_index_listContext.class,0);
		}
		public ArrayWriteRefContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterArrayWriteRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitArrayWriteRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitArrayWriteRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variable);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new ArrayWriteRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				match(NAME);
				{
				setState(381);
				match(T__22);
				setState(382);
				expr_index_list();
				setState(383);
				match(T__23);
				}
				}
				break;
			case 2:
				_localctx = new CellWriteRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(NAME);
				{
				setState(386);
				match(T__20);
				setState(387);
				expr_index_list();
				setState(388);
				match(T__21);
				}
				}
				break;
			case 3:
				_localctx = new AnyWriteRefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				match(NAME);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_primaryContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExpr_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExpr_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExpr_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_primaryContext expr_primary() throws RecognitionException {
		Expr_primaryContext _localctx = new Expr_primaryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 isIndexedExpr = false; 
			setState(394);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_indexContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExpr_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExpr_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExpr_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_indexContext expr_index() throws RecognitionException {
		Expr_indexContext _localctx = new Expr_indexContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 isIndexedExpr = true; 
			setState(397);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_index_listContext extends ParserRuleContext {
		public List<Expr_indexContext> expr_index() {
			return getRuleContexts(Expr_indexContext.class);
		}
		public Expr_indexContext expr_index(int i) {
			return getRuleContext(Expr_indexContext.class,i);
		}
		public Expr_index_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_index_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterExpr_index_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitExpr_index_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitExpr_index_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_index_listContext expr_index_list() throws RecognitionException {
		Expr_index_listContext _localctx = new Expr_index_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr_index_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			expr_index();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(400);
				match(T__11);
				setState(401);
				expr_index();
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_defContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(matlabParser.NAME, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public OutputsContext outputs() {
			return getRuleContext(OutputsContext.class,0);
		}
		public InputsContext inputs() {
			return getRuleContext(InputsContext.class,0);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitFunction_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitFunction_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(T__25);
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(408);
				outputs();
				}
				break;
			}
			setState(411);
			match(NAME);
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(412);
				inputs();
				}
				break;
			}
			setState(415);
			body();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(416);
				match(T__2);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputsContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(matlabParser.NAME, 0); }
		public Name_listContext name_list() {
			return getRuleContext(Name_listContext.class,0);
		}
		public OutputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterOutputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitOutputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitOutputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputsContext outputs() throws RecognitionException {
		OutputsContext _localctx = new OutputsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_outputs);
		int _la;
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(NAME);
				setState(420);
				match(T__1);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				match(T__10);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(422);
					name_list();
					}
				}

				setState(425);
				match(T__12);
				setState(426);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Name_listContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(matlabParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(matlabParser.NAME, i);
		}
		public Name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterName_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitName_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitName_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_listContext name_list() throws RecognitionException {
		Name_listContext _localctx = new Name_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(NAME);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==NAME) {
				{
				{
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(430);
					match(T__11);
					}
				}

				setState(433);
				match(NAME);
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputsContext extends ParserRuleContext {
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public InputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterInputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitInputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitInputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputsContext inputs() throws RecognitionException {
		InputsContext _localctx = new InputsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_inputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(T__22);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT || _la==NAME) {
				{
				setState(440);
				parameter_list();
				}
			}

			setState(443);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(matlabParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(matlabParser.NAME, i);
		}
		public List<TerminalNode> NOT() { return getTokens(matlabParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(matlabParser.NOT, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matlabListener ) ((matlabListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matlabVisitor ) return ((matlabVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_la = _input.LA(1);
			if ( !(_la==NOT || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(446);
				match(T__11);
				setState(447);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  isIndexedExpr ;
		case 1:
			return  isIndexedExpr ;
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 21);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u01c8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\6\2@\n\2\r"+
		"\2\16\2A\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3"+
		"\2\3\2\5\2S\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3h\n\3\3\3\3\3\3\3\3\3\3\3\7\3o\n\3\f\3\16\3"+
		"r\13\3\3\3\5\3u\n\3\3\3\3\3\3\3\3\3\3\3\5\3|\n\3\3\3\7\3\177\n\3\f\3\16"+
		"\3\u0082\13\3\3\3\5\3\u0085\n\3\3\3\3\3\3\3\3\3\3\3\5\3\u008c\n\3\3\3"+
		"\3\3\3\3\3\3\3\3\6\3\u0093\n\3\r\3\16\3\u0094\3\3\3\3\6\3\u0099\n\3\r"+
		"\3\16\3\u009a\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00a4\n\3\3\3\5\3\u00a7"+
		"\n\3\3\3\3\3\5\3\u00ab\n\3\7\3\u00ad\n\3\f\3\16\3\u00b0\13\3\5\3\u00b2"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\6\3\u00b9\n\3\r\3\16\3\u00ba\3\3\3\3\3\3\3\3"+
		"\5\3\u00c1\n\3\3\4\3\4\3\5\7\5\u00c6\n\5\f\5\16\5\u00c9\13\5\3\5\3\5\6"+
		"\5\u00cd\n\5\r\5\16\5\u00ce\3\5\3\5\7\5\u00d3\n\5\f\5\16\5\u00d6\13\5"+
		"\5\5\u00d8\n\5\3\5\7\5\u00db\n\5\f\5\16\5\u00de\13\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\5\13\u00f6\n\13\3\13\3\13\3\f\3\f\3\f\5\f\u00fd\n\f\3\r\3\r\3\16\3"+
		"\16\5\16\u0103\n\16\3\16\5\16\u0106\n\16\3\16\3\16\5\16\u010a\n\16\7\16"+
		"\u010c\n\16\f\16\16\16\u010f\13\16\3\16\3\16\3\17\3\17\5\17\u0115\n\17"+
		"\3\17\5\17\u0118\n\17\3\17\3\17\5\17\u011c\n\17\7\17\u011e\n\17\f\17\16"+
		"\17\u0121\13\17\3\17\3\17\3\20\5\20\u0126\n\20\3\20\3\20\5\20\u012a\n"+
		"\20\3\20\7\20\u012d\n\20\f\20\16\20\u0130\13\20\3\20\5\20\u0133\n\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u0149\n\21\3\21\5\21\u014c\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0157\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0165\n\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u017a\n\21\f\21\16\21\u017d\13\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u018a\n\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u0195\n\25\f\25\16\25\u0198\13\25"+
		"\3\26\3\26\5\26\u019c\n\26\3\26\3\26\5\26\u01a0\n\26\3\26\3\26\5\26\u01a4"+
		"\n\26\3\27\3\27\3\27\3\27\5\27\u01aa\n\27\3\27\3\27\5\27\u01ae\n\27\3"+
		"\30\3\30\5\30\u01b2\n\30\3\30\7\30\u01b5\n\30\f\30\16\30\u01b8\13\30\3"+
		"\31\3\31\5\31\u01bc\n\31\3\31\3\31\3\32\3\32\3\32\7\32\u01c3\n\32\f\32"+
		"\16\32\u01c6\13\32\3\32\2\3 \33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\2\f\5\2\16\16\20\20\35\35\3\2&(\4\2\20\20\35\35\4\2.."+
		"\65\66\3\2,-\3\2/\64\3\2\65\66\3\28=\3\2*+\4\2..CC\2\u0206\2R\3\2\2\2"+
		"\4\u00c0\3\2\2\2\6\u00c2\3\2\2\2\b\u00d7\3\2\2\2\n\u00df\3\2\2\2\f\u00e4"+
		"\3\2\2\2\16\u00e9\3\2\2\2\20\u00ec\3\2\2\2\22\u00f0\3\2\2\2\24\u00f3\3"+
		"\2\2\2\26\u00fc\3\2\2\2\30\u00fe\3\2\2\2\32\u0100\3\2\2\2\34\u0112\3\2"+
		"\2\2\36\u0125\3\2\2\2 \u0156\3\2\2\2\"\u0189\3\2\2\2$\u018b\3\2\2\2&\u018e"+
		"\3\2\2\2(\u0191\3\2\2\2*\u0199\3\2\2\2,\u01ad\3\2\2\2.\u01af\3\2\2\2\60"+
		"\u01b9\3\2\2\2\62\u01bf\3\2\2\2\64\65\5\b\5\2\65\66\7\2\2\3\66S\3\2\2"+
		"\2\679\5\6\4\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3"+
		"\2\2\2=G\5*\26\2>@\5\6\4\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3"+
		"\2\2\2CD\5*\26\2DF\3\2\2\2E?\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HM\3"+
		"\2\2\2IG\3\2\2\2JL\5\6\4\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3"+
		"\2\2\2OM\3\2\2\2PQ\7\2\2\3QS\3\2\2\2R\64\3\2\2\2R:\3\2\2\2S\3\3\2\2\2"+
		"TU\7\3\2\2UV\7C\2\2VW\7\4\2\2WX\5$\23\2XY\5\b\5\2YZ\7\5\2\2Z\u00c1\3\2"+
		"\2\2[\\\7\6\2\2\\]\7C\2\2]^\7\4\2\2^_\5 \21\2_`\7\67\2\2`a\5 \21\2ab\5"+
		"\b\5\2bc\7\5\2\2c\u00c1\3\2\2\2de\7\7\2\2eg\5$\23\2fh\7\35\2\2gf\3\2\2"+
		"\2gh\3\2\2\2hi\3\2\2\2ij\5\b\5\2jk\7\5\2\2k\u00c1\3\2\2\2lp\5\n\6\2mo"+
		"\5\f\7\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2s"+
		"u\5\16\b\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\5\2\2w\u00c1\3\2\2\2xy\7"+
		"\b\2\2y{\5$\23\2z|\7\35\2\2{z\3\2\2\2{|\3\2\2\2|\u0080\3\2\2\2}\177\5"+
		"\20\t\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\5\22\n\2\u0084\u0083"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\5\2\2\u0087"+
		"\u00c1\3\2\2\2\u0088\u0089\7\t\2\2\u0089\u008b\5\b\5\2\u008a\u008c\5\24"+
		"\13\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\7\5\2\2\u008e\u00c1\3\2\2\2\u008f\u00c1\7\n\2\2\u0090\u0092\7\13"+
		"\2\2\u0091\u0093\7C\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u00c1\3\2\2\2\u0096\u0098\7\f"+
		"\2\2\u0097\u0099\7C\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00c1\3\2\2\2\u009c\u009d\5\""+
		"\22\2\u009d\u009e\7\4\2\2\u009e\u009f\5$\23\2\u009f\u00c1\3\2\2\2\u00a0"+
		"\u00b1\7\r\2\2\u00a1\u00a4\5&\24\2\u00a2\u00a4\7.\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00ae\3\2\2\2\u00a5\u00a7\7\16\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00ab\5&"+
		"\24\2\u00a9\u00ab\7.\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\u00ad\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00a3\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\17"+
		"\2\2\u00b4\u00b5\7\4\2\2\u00b5\u00c1\5$\23\2\u00b6\u00b8\7C\2\2\u00b7"+
		"\u00b9\7C\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c1\3\2\2\2\u00bc\u00c1\5\26\f\2\u00bd"+
		"\u00be\5$\23\2\u00be\u00bf\7\20\2\2\u00bf\u00c1\3\2\2\2\u00c0T\3\2\2\2"+
		"\u00c0[\3\2\2\2\u00c0d\3\2\2\2\u00c0l\3\2\2\2\u00c0x\3\2\2\2\u00c0\u0088"+
		"\3\2\2\2\u00c0\u008f\3\2\2\2\u00c0\u0090\3\2\2\2\u00c0\u0096\3\2\2\2\u00c0"+
		"\u009c\3\2\2\2\u00c0\u00a0\3\2\2\2\u00c0\u00b6\3\2\2\2\u00c0\u00bc\3\2"+
		"\2\2\u00c0\u00bd\3\2\2\2\u00c1\5\3\2\2\2\u00c2\u00c3\t\2\2\2\u00c3\7\3"+
		"\2\2\2\u00c4\u00c6\5\6\4\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00ca\u00d4\5\4\3\2\u00cb\u00cd\5\6\4\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\5\4\3\2\u00d1\u00d3\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d8\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00c7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00dc\3\2\2\2\u00d9\u00db\5\6\4\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\t\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e0\7\21\2\2\u00e0\u00e1\5$\23\2\u00e1\u00e2\5\6\4\2"+
		"\u00e2\u00e3\5\b\5\2\u00e3\13\3\2\2\2\u00e4\u00e5\7\22\2\2\u00e5\u00e6"+
		"\5$\23\2\u00e6\u00e7\5\6\4\2\u00e7\u00e8\5\b\5\2\u00e8\r\3\2\2\2\u00e9"+
		"\u00ea\7\23\2\2\u00ea\u00eb\5\b\5\2\u00eb\17\3\2\2\2\u00ec\u00ed\7\24"+
		"\2\2\u00ed\u00ee\5$\23\2\u00ee\u00ef\5\b\5\2\u00ef\21\3\2\2\2\u00f0\u00f1"+
		"\7\25\2\2\u00f1\u00f2\5\b\5\2\u00f2\23\3\2\2\2\u00f3\u00f5\7\26\2\2\u00f4"+
		"\u00f6\7C\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f8\5\b\5\2\u00f8\25\3\2\2\2\u00f9\u00fa\7 \2\2\u00fa\u00fd"+
		"\7\37\2\2\u00fb\u00fd\7 \2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd"+
		"\27\3\2\2\2\u00fe\u00ff\t\3\2\2\u00ff\31\3\2\2\2\u0100\u0102\7\r\2\2\u0101"+
		"\u0103\7\16\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3"+
		"\2\2\2\u0104\u0106\5\36\20\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u010d\3\2\2\2\u0107\u0109\t\4\2\2\u0108\u010a\5\36\20\2\u0109\u0108\3"+
		"\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0107\3\2\2\2\u010c"+
		"\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2"+
		"\2\2\u010f\u010d\3\2\2\2\u0110\u0111\7\17\2\2\u0111\33\3\2\2\2\u0112\u0114"+
		"\7\27\2\2\u0113\u0115\7\16\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2"+
		"\u0115\u0117\3\2\2\2\u0116\u0118\5\36\20\2\u0117\u0116\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u011f\3\2\2\2\u0119\u011b\t\4\2\2\u011a\u011c\5\36\20\2"+
		"\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u0119"+
		"\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\7\30\2\2\u0123\35\3\2\2"+
		"\2\u0124\u0126\7\16\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u012e\5$\23\2\u0128\u012a\7\16\2\2\u0129\u0128\3"+
		"\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\5$\23\2\u012c"+
		"\u0129\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0133\7\16\2\2\u0132"+
		"\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\37\3\2\2\2\u0134\u0135\b\21\1"+
		"\2\u0135\u0136\7\31\2\2\u0136\u0137\5 \21\2\u0137\u0138\7\32\2\2\u0138"+
		"\u0157\3\2\2\2\u0139\u013a\t\5\2\2\u013a\u0157\5 \21\25\u013b\u0157\5"+
		"\32\16\2\u013c\u0157\5\30\r\2\u013d\u0157\5\34\17\2\u013e\u0157\7)\2\2"+
		"\u013f\u0140\7\33\2\2\u0140\u0141\5\60\31\2\u0141\u0142\5$\23\2\u0142"+
		"\u0157\3\2\2\2\u0143\u0144\7\33\2\2\u0144\u0157\7C\2\2\u0145\u014b\7C"+
		"\2\2\u0146\u0148\7\31\2\2\u0147\u0149\5(\25\2\u0148\u0147\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\7\32\2\2\u014b\u0146\3"+
		"\2\2\2\u014b\u014c\3\2\2\2\u014c\u0157\3\2\2\2\u014d\u014e\7C\2\2\u014e"+
		"\u014f\7\27\2\2\u014f\u0150\5(\25\2\u0150\u0151\7\30\2\2\u0151\u0157\3"+
		"\2\2\2\u0152\u0153\6\21\2\2\u0153\u0157\7\67\2\2\u0154\u0155\6\21\3\2"+
		"\u0155\u0157\7\5\2\2\u0156\u0134\3\2\2\2\u0156\u0139\3\2\2\2\u0156\u013b"+
		"\3\2\2\2\u0156\u013c\3\2\2\2\u0156\u013d\3\2\2\2\u0156\u013e\3\2\2\2\u0156"+
		"\u013f\3\2\2\2\u0156\u0143\3\2\2\2\u0156\u0145\3\2\2\2\u0156\u014d\3\2"+
		"\2\2\u0156\u0152\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u017b\3\2\2\2\u0158"+
		"\u0159\f\26\2\2\u0159\u015a\t\6\2\2\u015a\u017a\5 \21\27\u015b\u015c\f"+
		"\24\2\2\u015c\u015d\t\7\2\2\u015d\u017a\5 \21\25\u015e\u015f\f\23\2\2"+
		"\u015f\u0160\t\b\2\2\u0160\u017a\5 \21\24\u0161\u0164\f\22\2\2\u0162\u0163"+
		"\7\67\2\2\u0163\u0165\5 \21\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2"+
		"\u0165\u0166\3\2\2\2\u0166\u0167\7\67\2\2\u0167\u017a\5 \21\23\u0168\u0169"+
		"\f\21\2\2\u0169\u016a\t\t\2\2\u016a\u017a\5 \21\22\u016b\u016c\f\20\2"+
		"\2\u016c\u016d\7>\2\2\u016d\u017a\5 \21\21\u016e\u016f\f\17\2\2\u016f"+
		"\u0170\7?\2\2\u0170\u017a\5 \21\20\u0171\u0172\f\16\2\2\u0172\u0173\7"+
		"@\2\2\u0173\u017a\5 \21\17\u0174\u0175\f\r\2\2\u0175\u0176\7A\2\2\u0176"+
		"\u017a\5 \21\16\u0177\u0178\f\27\2\2\u0178\u017a\t\n\2\2\u0179\u0158\3"+
		"\2\2\2\u0179\u015b\3\2\2\2\u0179\u015e\3\2\2\2\u0179\u0161\3\2\2\2\u0179"+
		"\u0168\3\2\2\2\u0179\u016b\3\2\2\2\u0179\u016e\3\2\2\2\u0179\u0171\3\2"+
		"\2\2\u0179\u0174\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c!\3\2\2\2\u017d\u017b\3\2\2\2"+
		"\u017e\u017f\7C\2\2\u017f\u0180\7\31\2\2\u0180\u0181\5(\25\2\u0181\u0182"+
		"\7\32\2\2\u0182\u018a\3\2\2\2\u0183\u0184\7C\2\2\u0184\u0185\7\27\2\2"+
		"\u0185\u0186\5(\25\2\u0186\u0187\7\30\2\2\u0187\u018a\3\2\2\2\u0188\u018a"+
		"\7C\2\2\u0189\u017e\3\2\2\2\u0189\u0183\3\2\2\2\u0189\u0188\3\2\2\2\u018a"+
		"#\3\2\2\2\u018b\u018c\b\23\1\2\u018c\u018d\5 \21\2\u018d%\3\2\2\2\u018e"+
		"\u018f\b\24\1\2\u018f\u0190\5 \21\2\u0190\'\3\2\2\2\u0191\u0196\5&\24"+
		"\2\u0192\u0193\7\16\2\2\u0193\u0195\5&\24\2\u0194\u0192\3\2\2\2\u0195"+
		"\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197)\3\2\2\2"+
		"\u0198\u0196\3\2\2\2\u0199\u019b\7\34\2\2\u019a\u019c\5,\27\2\u019b\u019a"+
		"\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\7C\2\2\u019e"+
		"\u01a0\5\60\31\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3"+
		"\2\2\2\u01a1\u01a3\5\b\5\2\u01a2\u01a4\7\5\2\2\u01a3\u01a2\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4+\3\2\2\2\u01a5\u01a6\7C\2\2\u01a6\u01ae\7\4\2\2\u01a7"+
		"\u01a9\7\r\2\2\u01a8\u01aa\5.\30\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2"+
		"\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\7\17\2\2\u01ac\u01ae\7\4\2\2\u01ad"+
		"\u01a5\3\2\2\2\u01ad\u01a7\3\2\2\2\u01ae-\3\2\2\2\u01af\u01b6\7C\2\2\u01b0"+
		"\u01b2\7\16\2\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3"+
		"\2\2\2\u01b3\u01b5\7C\2\2\u01b4\u01b1\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7/\3\2\2\2\u01b8\u01b6\3\2\2\2"+
		"\u01b9\u01bb\7\31\2\2\u01ba\u01bc\5\62\32\2\u01bb\u01ba\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\7\32\2\2\u01be\61\3\2\2"+
		"\2\u01bf\u01c4\t\13\2\2\u01c0\u01c1\7\16\2\2\u01c1\u01c3\t\13\2\2\u01c2"+
		"\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5\63\3\2\2\2\u01c6\u01c4\3\2\2\2;:AGMRgpt{\u0080\u0084\u008b"+
		"\u0094\u009a\u00a3\u00a6\u00aa\u00ae\u00b1\u00ba\u00c0\u00c7\u00ce\u00d4"+
		"\u00d7\u00dc\u00f5\u00fc\u0102\u0105\u0109\u010d\u0114\u0117\u011b\u011f"+
		"\u0125\u0129\u012e\u0132\u0148\u014b\u0156\u0164\u0179\u017b\u0189\u0196"+
		"\u019b\u019f\u01a3\u01a9\u01ad\u01b1\u01b6\u01bb\u01c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}