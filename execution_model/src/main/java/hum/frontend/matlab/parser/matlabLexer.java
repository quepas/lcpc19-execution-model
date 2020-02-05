// Generated from /home/quepas/PhD/Publications/lcpc19-execution-model/execution_model/src/hum/frontend/matlab/grammar/matlab.g4 by ANTLR 4.7.2
package hum.frontend.matlab.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class matlabLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "NEWLINE", "WS", "SHELL_COMMAND", "BANG", "PRINT", "DISPLAY", 
			"SECTION_COMMENT", "LINE_COMMENT", "BLOCK_COMMENT", "NOT_A_NUMBER", "INFINITY", 
			"DIGIT", "NON_ZERO_DIGIT", "LETTER", "EXPONENT", "IMAGINARY", "DECIMAL_INTEGER", 
			"FLOATING_POINT", "COMPLEX_NUMBER", "STRING", "TRANSPOSE", "C_TRANSPOSE", 
			"POWER", "M_POWER", "NOT", "TIMES", "R_DIVIDE", "L_DIVIDE", "M_TIMES", 
			"MR_DIVIDE", "ML_DIVIDE", "PLUS", "MINUS", "COLON", "LT", "LE", "GT", 
			"GE", "EQ", "NE", "AND", "OR", "SHORT_AND", "SHORT_OR", "ELLIPSIS", "NAME_PART", 
			"NAME"
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


	    int lastTokenType = 0;
	    public void emit(Token token) {
	        super.emit(token);
	        lastTokenType = token.getType();
	    }

	    private boolean isTransposeOperator() {
	        if (lastTokenType == STRING) return false;
	        char ch = (char) _input.LA(-1);
	        switch(ch) {
	            case ')':
	            case '}':
	            case ']':
	            case '_':
	            case '\'':
	            case '.':
	                return true;
	            default:
	                return Character.isLetterOrDigit(ch);
	        }
	    }



	public matlabLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "matlab.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return SHELL_COMMAND_sempred((RuleContext)_localctx, predIndex);
		case 45:
			return STRING_sempred((RuleContext)_localctx, predIndex);
		case 46:
			return TRANSPOSE_sempred((RuleContext)_localctx, predIndex);
		case 47:
			return C_TRANSPOSE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean SHELL_COMMAND_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return lastTokenType == BANG;
		}
		return true;
	}
	private boolean STRING_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return  !isTransposeOperator() ;
		}
		return true;
	}
	private boolean TRANSPOSE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return  isTransposeOperator() ;
		}
		return true;
	}
	private boolean C_TRANSPOSE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return  isTransposeOperator() ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2C\u021f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\6\35\u0112\n\35\r\35\16\35\u0113\3\35\3\35\3\36\3"+
		"\36\6\36\u011a\n\36\r\36\16\36\u011b\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3"+
		" \7 \u0128\n \f \16 \u012b\13 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!"+
		"\u0139\n!\f!\16!\u013c\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0146\n\""+
		"\f\"\16\"\u0149\13\"\5\"\u014b\n\"\3\"\3\"\3#\3#\3#\7#\u0152\n#\f#\16"+
		"#\u0155\13#\3#\3#\3$\3$\3$\3$\7$\u015d\n$\f$\16$\u0160\13$\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\5&\u0171\n&\3\'\3\'\3(\3(\3)\3)\3*"+
		"\3*\5*\u017b\n*\3*\6*\u017e\n*\r*\16*\u017f\3+\3+\5+\u0184\n+\3+\3+\3"+
		",\6,\u0189\n,\r,\16,\u018a\3,\5,\u018e\n,\3-\6-\u0191\n-\r-\16-\u0192"+
		"\3-\3-\7-\u0197\n-\f-\16-\u019a\13-\3-\5-\u019d\n-\3-\3-\6-\u01a1\n-\r"+
		"-\16-\u01a2\3-\5-\u01a6\n-\5-\u01a8\n-\3.\3.\5.\u01ac\n.\3.\3.\5.\u01b0"+
		"\n.\3.\3.\3/\3/\3/\3/\3/\7/\u01b9\n/\f/\16/\u01bc\13/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3"+
		"=\3>\3>\3?\3?\3?\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3E\3E\3F\3F\3"+
		"F\3G\3G\3G\3H\3H\3H\3H\3H\7H\u0202\nH\fH\16H\u0205\13H\3H\6H\u0208\nH"+
		"\rH\16H\u0209\3H\3H\3I\3I\3I\3I\7I\u0212\nI\fI\16I\u0215\13I\3J\3J\3J"+
		"\3J\3J\3J\3J\5J\u021e\nJ\4\u015e\u0203\2K\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I\2K\2M\2O\2Q"+
		"\2S\2U\2W&Y\'[(])_*a+c,e-g.i/k\60m\61o\62q\63s\64u\65w\66y\67{8}9\177"+
		":\u0081;\u0083<\u0085=\u0087>\u0089?\u008b@\u008dA\u008fB\u0091\2\u0093"+
		"C\3\2\r\5\2\13\13\17\17\"\"\4\2\f\f\17\17\4\2\13\13\"\"\3\2##\3\2\62;"+
		"\3\2\63;\4\2C\\c|\4\2GGgg\4\2--//\3\2kl\4\2\f\f))\2\u0236\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2W\3\2\2\2"+
		"\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e"+
		"\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2"+
		"\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2"+
		"\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0093\3\2\2\2\3\u0095\3\2\2\2\5\u0099\3\2\2\2\7\u009b\3\2\2\2\t\u009f"+
		"\3\2\2\2\13\u00a6\3\2\2\2\r\u00ac\3\2\2\2\17\u00b3\3\2\2\2\21\u00b7\3"+
		"\2\2\2\23\u00bd\3\2\2\2\25\u00c4\3\2\2\2\27\u00cf\3\2\2\2\31\u00d1\3\2"+
		"\2\2\33\u00d3\3\2\2\2\35\u00d5\3\2\2\2\37\u00d7\3\2\2\2!\u00da\3\2\2\2"+
		"#\u00e1\3\2\2\2%\u00e6\3\2\2\2\'\u00eb\3\2\2\2)\u00f5\3\2\2\2+\u00fb\3"+
		"\2\2\2-\u00fd\3\2\2\2/\u00ff\3\2\2\2\61\u0101\3\2\2\2\63\u0103\3\2\2\2"+
		"\65\u0105\3\2\2\2\67\u010e\3\2\2\29\u0111\3\2\2\2;\u0117\3\2\2\2=\u011d"+
		"\3\2\2\2?\u011f\3\2\2\2A\u012e\3\2\2\2C\u013f\3\2\2\2E\u014e\3\2\2\2G"+
		"\u0158\3\2\2\2I\u0166\3\2\2\2K\u0170\3\2\2\2M\u0172\3\2\2\2O\u0174\3\2"+
		"\2\2Q\u0176\3\2\2\2S\u0178\3\2\2\2U\u0183\3\2\2\2W\u0188\3\2\2\2Y\u01a7"+
		"\3\2\2\2[\u01af\3\2\2\2]\u01b3\3\2\2\2_\u01bf\3\2\2\2a\u01c3\3\2\2\2c"+
		"\u01c6\3\2\2\2e\u01c9\3\2\2\2g\u01cb\3\2\2\2i\u01cd\3\2\2\2k\u01d0\3\2"+
		"\2\2m\u01d3\3\2\2\2o\u01d6\3\2\2\2q\u01d8\3\2\2\2s\u01da\3\2\2\2u\u01dc"+
		"\3\2\2\2w\u01de\3\2\2\2y\u01e0\3\2\2\2{\u01e2\3\2\2\2}\u01e4\3\2\2\2\177"+
		"\u01e7\3\2\2\2\u0081\u01e9\3\2\2\2\u0083\u01ec\3\2\2\2\u0085\u01ef\3\2"+
		"\2\2\u0087\u01f2\3\2\2\2\u0089\u01f4\3\2\2\2\u008b\u01f6\3\2\2\2\u008d"+
		"\u01f9\3\2\2\2\u008f\u01fc\3\2\2\2\u0091\u020d\3\2\2\2\u0093\u021d\3\2"+
		"\2\2\u0095\u0096\7h\2\2\u0096\u0097\7q\2\2\u0097\u0098\7t\2\2\u0098\4"+
		"\3\2\2\2\u0099\u009a\7?\2\2\u009a\6\3\2\2\2\u009b\u009c\7g\2\2\u009c\u009d"+
		"\7p\2\2\u009d\u009e\7f\2\2\u009e\b\3\2\2\2\u009f\u00a0\7r\2\2\u00a0\u00a1"+
		"\7c\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4\7q\2\2\u00a4"+
		"\u00a5\7t\2\2\u00a5\n\3\2\2\2\u00a6\u00a7\7y\2\2\u00a7\u00a8\7j\2\2\u00a8"+
		"\u00a9\7k\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7g\2\2\u00ab\f\3\2\2\2\u00ac"+
		"\u00ad\7u\2\2\u00ad\u00ae\7y\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7v\2\2"+
		"\u00b0\u00b1\7e\2\2\u00b1\u00b2\7j\2\2\u00b2\16\3\2\2\2\u00b3\u00b4\7"+
		"v\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7{\2\2\u00b6\20\3\2\2\2\u00b7\u00b8"+
		"\7d\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7c\2\2\u00bb"+
		"\u00bc\7m\2\2\u00bc\22\3\2\2\2\u00bd\u00be\7i\2\2\u00be\u00bf\7n\2\2\u00bf"+
		"\u00c0\7q\2\2\u00c0\u00c1\7d\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7n\2\2"+
		"\u00c3\24\3\2\2\2\u00c4\u00c5\7r\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7"+
		"t\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb"+
		"\7v\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7v\2\2\u00ce"+
		"\26\3\2\2\2\u00cf\u00d0\7]\2\2\u00d0\30\3\2\2\2\u00d1\u00d2\7.\2\2\u00d2"+
		"\32\3\2\2\2\u00d3\u00d4\7_\2\2\u00d4\34\3\2\2\2\u00d5\u00d6\7=\2\2\u00d6"+
		"\36\3\2\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7h\2\2\u00d9 \3\2\2\2\u00da"+
		"\u00db\7g\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7g\2\2"+
		"\u00de\u00df\7k\2\2\u00df\u00e0\7h\2\2\u00e0\"\3\2\2\2\u00e1\u00e2\7g"+
		"\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7g\2\2\u00e5$\3"+
		"\2\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7u\2\2\u00e9"+
		"\u00ea\7g\2\2\u00ea&\3\2\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7v\2\2\u00ed"+
		"\u00ee\7j\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7y\2\2"+
		"\u00f1\u00f2\7k\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7g\2\2\u00f4(\3\2\2"+
		"\2\u00f5\u00f6\7e\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9"+
		"\7e\2\2\u00f9\u00fa\7j\2\2\u00fa*\3\2\2\2\u00fb\u00fc\7}\2\2\u00fc,\3"+
		"\2\2\2\u00fd\u00fe\7\177\2\2\u00fe.\3\2\2\2\u00ff\u0100\7*\2\2\u0100\60"+
		"\3\2\2\2\u0101\u0102\7+\2\2\u0102\62\3\2\2\2\u0103\u0104\7B\2\2\u0104"+
		"\64\3\2\2\2\u0105\u0106\7h\2\2\u0106\u0107\7w\2\2\u0107\u0108\7p\2\2\u0108"+
		"\u0109\7e\2\2\u0109\u010a\7v\2\2\u010a\u010b\7k\2\2\u010b\u010c\7q\2\2"+
		"\u010c\u010d\7p\2\2\u010d\66\3\2\2\2\u010e\u010f\7\f\2\2\u010f8\3\2\2"+
		"\2\u0110\u0112\t\2\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\b\35\2\2"+
		"\u0116:\3\2\2\2\u0117\u0119\6\36\2\2\u0118\u011a\n\3\2\2\u0119\u0118\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"<\3\2\2\2\u011d\u011e\7#\2\2\u011e>\3\2\2\2\u011f\u0120\7r\2\2\u0120\u0121"+
		"\7t\2\2\u0121\u0122\7k\2\2\u0122\u0123\7p\2\2\u0123\u0124\7v\2\2\u0124"+
		"\u0125\7\"\2\2\u0125\u0129\3\2\2\2\u0126\u0128\n\3\2\2\u0127\u0126\3\2"+
		"\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\b \3\2\u012d@\3\2\2\2\u012e"+
		"\u012f\7f\2\2\u012f\u0130\7k\2\2\u0130\u0131\7u\2\2\u0131\u0132\7r\2\2"+
		"\u0132\u0133\7n\2\2\u0133\u0134\7c\2\2\u0134\u0135\7{\2\2\u0135\u0136"+
		"\7\"\2\2\u0136\u013a\3\2\2\2\u0137\u0139\n\3\2\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013d\u013e\b!\3\2\u013eB\3\2\2\2\u013f\u0140"+
		"\7\'\2\2\u0140\u0141\7\'\2\2\u0141\u014a\3\2\2\2\u0142\u014b\5\67\34\2"+
		"\u0143\u0147\t\4\2\2\u0144\u0146\n\3\2\2\u0145\u0144\3\2\2\2\u0146\u0149"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u014a\u0142\3\2\2\2\u014a\u0143\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014d\b\"\3\2\u014dD\3\2\2\2\u014e\u014f\7\'\2\2\u014f\u0153"+
		"\n\5\2\2\u0150\u0152\n\3\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0156\u0157\b#\3\2\u0157F\3\2\2\2\u0158\u0159\7\'\2\2\u0159\u015a"+
		"\7}\2\2\u015a\u015e\3\2\2\2\u015b\u015d\13\2\2\2\u015c\u015b\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0161\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7\'\2\2\u0162\u0163\7\177\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0165\b$\3\2\u0165H\3\2\2\2\u0166\u0167\7P\2\2\u0167"+
		"\u0168\7c\2\2\u0168\u0169\7P\2\2\u0169J\3\2\2\2\u016a\u016b\7k\2\2\u016b"+
		"\u016c\7p\2\2\u016c\u0171\7h\2\2\u016d\u016e\7K\2\2\u016e\u016f\7p\2\2"+
		"\u016f\u0171\7h\2\2\u0170\u016a\3\2\2\2\u0170\u016d\3\2\2\2\u0171L\3\2"+
		"\2\2\u0172\u0173\t\6\2\2\u0173N\3\2\2\2\u0174\u0175\t\7\2\2\u0175P\3\2"+
		"\2\2\u0176\u0177\t\b\2\2\u0177R\3\2\2\2\u0178\u017a\t\t\2\2\u0179\u017b"+
		"\t\n\2\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c"+
		"\u017e\5M\'\2\u017d\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u017d\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180T\3\2\2\2\u0181\u0184\5W,\2\u0182\u0184"+
		"\5Y-\2\u0183\u0181\3\2\2\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0186\t\13\2\2\u0186V\3\2\2\2\u0187\u0189\5M\'\2\u0188\u0187\3\2\2\2"+
		"\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d"+
		"\3\2\2\2\u018c\u018e\5S*\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"X\3\2\2\2\u018f\u0191\5M\'\2\u0190\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0198\7\60"+
		"\2\2\u0195\u0197\5M\'\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2"+
		"\2\2\u019b\u019d\5S*\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a8"+
		"\3\2\2\2\u019e\u01a0\7\60\2\2\u019f\u01a1\5M\'\2\u01a0\u019f\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2"+
		"\2\2\u01a4\u01a6\5S*\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8"+
		"\3\2\2\2\u01a7\u0190\3\2\2\2\u01a7\u019e\3\2\2\2\u01a8Z\3\2\2\2\u01a9"+
		"\u01ac\5W,\2\u01aa\u01ac\5Y-\2\u01ab\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2"+
		"\u01ac\u01ad\3\2\2\2\u01ad\u01ae\t\n\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ab"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\5U+\2\u01b2"+
		"\\\3\2\2\2\u01b3\u01b4\6/\3\2\u01b4\u01ba\7)\2\2\u01b5\u01b6\7)\2\2\u01b6"+
		"\u01b9\7)\2\2\u01b7\u01b9\n\f\2\2\u01b8\u01b5\3\2\2\2\u01b8\u01b7\3\2"+
		"\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01bd\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be\7)\2\2\u01be^\3\2\2\2\u01bf"+
		"\u01c0\6\60\4\2\u01c0\u01c1\7\60\2\2\u01c1\u01c2\7)\2\2\u01c2`\3\2\2\2"+
		"\u01c3\u01c4\6\61\5\2\u01c4\u01c5\7)\2\2\u01c5b\3\2\2\2\u01c6\u01c7\7"+
		"\60\2\2\u01c7\u01c8\7`\2\2\u01c8d\3\2\2\2\u01c9\u01ca\7`\2\2\u01caf\3"+
		"\2\2\2\u01cb\u01cc\7\u0080\2\2\u01cch\3\2\2\2\u01cd\u01ce\7\60\2\2\u01ce"+
		"\u01cf\7,\2\2\u01cfj\3\2\2\2\u01d0\u01d1\7\60\2\2\u01d1\u01d2\7\61\2\2"+
		"\u01d2l\3\2\2\2\u01d3\u01d4\7\60\2\2\u01d4\u01d5\7^\2\2\u01d5n\3\2\2\2"+
		"\u01d6\u01d7\7,\2\2\u01d7p\3\2\2\2\u01d8\u01d9\7\61\2\2\u01d9r\3\2\2\2"+
		"\u01da\u01db\7^\2\2\u01dbt\3\2\2\2\u01dc\u01dd\7-\2\2\u01ddv\3\2\2\2\u01de"+
		"\u01df\7/\2\2\u01dfx\3\2\2\2\u01e0\u01e1\7<\2\2\u01e1z\3\2\2\2\u01e2\u01e3"+
		"\7>\2\2\u01e3|\3\2\2\2\u01e4\u01e5\7>\2\2\u01e5\u01e6\7?\2\2\u01e6~\3"+
		"\2\2\2\u01e7\u01e8\7@\2\2\u01e8\u0080\3\2\2\2\u01e9\u01ea\7@\2\2\u01ea"+
		"\u01eb\7?\2\2\u01eb\u0082\3\2\2\2\u01ec\u01ed\7?\2\2\u01ed\u01ee\7?\2"+
		"\2\u01ee\u0084\3\2\2\2\u01ef\u01f0\7\u0080\2\2\u01f0\u01f1\7?\2\2\u01f1"+
		"\u0086\3\2\2\2\u01f2\u01f3\7(\2\2\u01f3\u0088\3\2\2\2\u01f4\u01f5\7~\2"+
		"\2\u01f5\u008a\3\2\2\2\u01f6\u01f7\7(\2\2\u01f7\u01f8\7(\2\2\u01f8\u008c"+
		"\3\2\2\2\u01f9\u01fa\7~\2\2\u01fa\u01fb\7~\2\2\u01fb\u008e\3\2\2\2\u01fc"+
		"\u01fd\7\60\2\2\u01fd\u01fe\7\60\2\2\u01fe\u01ff\7\60\2\2\u01ff\u0203"+
		"\3\2\2\2\u0200\u0202\13\2\2\2\u0201\u0200\3\2\2\2\u0202\u0205\3\2\2\2"+
		"\u0203\u0204\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203"+
		"\3\2\2\2\u0206\u0208\5\67\34\2\u0207\u0206\3\2\2\2\u0208\u0209\3\2\2\2"+
		"\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c"+
		"\bH\3\2\u020c\u0090\3\2\2\2\u020d\u0213\5Q)\2\u020e\u0212\5Q)\2\u020f"+
		"\u0212\5M\'\2\u0210\u0212\7a\2\2\u0211\u020e\3\2\2\2\u0211\u020f\3\2\2"+
		"\2\u0211\u0210\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214"+
		"\3\2\2\2\u0214\u0092\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u021e\5K&\2\u0217"+
		"\u021e\5I%\2\u0218\u0219\5\u0091I\2\u0219\u021a\7\60\2\2\u021a\u021b\5"+
		"\u0091I\2\u021b\u021e\3\2\2\2\u021c\u021e\5\u0091I\2\u021d\u0216\3\2\2"+
		"\2\u021d\u0217\3\2\2\2\u021d\u0218\3\2\2\2\u021d\u021c\3\2\2\2\u021e\u0094"+
		"\3\2\2\2 \2\u0113\u011b\u0129\u013a\u0147\u014a\u0153\u015e\u0170\u017a"+
		"\u017f\u0183\u018a\u018d\u0192\u0198\u019c\u01a2\u01a5\u01a7\u01ab\u01af"+
		"\u01b8\u01ba\u0203\u0209\u0211\u0213\u021d\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}