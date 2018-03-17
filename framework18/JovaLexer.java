// Generated from Jova.g4 by ANTLR 4.5

	package at.tugraz.ist.cc.antlr.gen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JovaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, KEY_CLASS=8, KEY_IF=9, 
		KEY_ELSE=10, KEY_WHILE=11, KEY_RETURN=12, KEY_NEW=13, KEY_NIX=14, ASSIGN=15, 
		RELOP=16, MULOP=17, OR=18, AND=19, SIGN=20, NOT=21, DOTOP=22, NUMBER=23, 
		DECIMAL=24, INT=25, PRIMITIVE_TYPE=26, BOOL=27, ID=28, WS=29, COMMENT=30, 
		LITERAL=31, AMOD=32, CLASS_TYPE=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "KEY_CLASS", "KEY_IF", 
		"KEY_ELSE", "KEY_WHILE", "KEY_RETURN", "KEY_NEW", "KEY_NIX", "ASSIGN", 
		"RELOP", "MULOP", "OR", "AND", "SIGN", "NOT", "DOTOP", "OPERATORS", "DIGIT0", 
		"DIGIT", "NUMBER", "DECIMAL", "INT", "PRIMITIVE_TYPE", "BOOL", "ID", "LETTER", 
		"PUNCT", "WS", "COMMENT", "LITERAL", "AMOD", "CLASS_TYPE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "','", "'('", "')'", "'()'", "'class'", "'if'", 
		"'else'", "'while'", "'return'", "'new'", "'nix'", "'='", null, null, 
		"'||'", "'&&'", null, "'!'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "KEY_CLASS", "KEY_IF", 
		"KEY_ELSE", "KEY_WHILE", "KEY_RETURN", "KEY_NEW", "KEY_NIX", "ASSIGN", 
		"RELOP", "MULOP", "OR", "AND", "SIGN", "NOT", "DOTOP", "NUMBER", "DECIMAL", 
		"INT", "PRIMITIVE_TYPE", "BOOL", "ID", "WS", "COMMENT", "LITERAL", "AMOD", 
		"CLASS_TYPE"
	};
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


	public JovaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Jova.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u010f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u008d\n\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\7\33\u00a6\n\33\f\33\16\33\u00a9\13\33\5\33"+
		"\u00ab\n\33\3\34\6\34\u00ae\n\34\r\34\16\34\u00af\3\35\5\35\u00b3\n\35"+
		"\3\35\3\35\3\35\5\35\u00b8\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u00c7\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u00d2\n\37\3 \3 \3 \3 \7 \u00d8\n \f \16 \u00db\13"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\7$\u00e7\n$\f$\16$\u00ea\13$\3%\3%\3"+
		"%\3%\3%\7%\u00f1\n%\f%\16%\u00f4\13%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\5&\u0105\n&\3\'\3\'\3\'\3\'\7\'\u010b\n\'\f\'\16\'\u010e"+
		"\13\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\2\65\31\67\32"+
		"9\33;\34=\35?\36A\2C\2E\37G I!K\"M#\3\2\17\4\2>>@@\5\2\'\',,\61\61\4\2"+
		"--//\b\2\'(,-//\61\61>@~~\3\2\62;\3\2\63;\3\2c|\4\2C\\c|\7\2##..\60\60"+
		"<=AA\5\2\13\f\17\17//\4\2\f\f\17\17\7\2\62;C\\^^aac|\3\2C\\\u0121\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3"+
		"\2\2\2\tU\3\2\2\2\13W\3\2\2\2\rY\3\2\2\2\17[\3\2\2\2\21^\3\2\2\2\23d\3"+
		"\2\2\2\25g\3\2\2\2\27l\3\2\2\2\31r\3\2\2\2\33y\3\2\2\2\35}\3\2\2\2\37"+
		"\u0081\3\2\2\2!\u008c\3\2\2\2#\u008e\3\2\2\2%\u0090\3\2\2\2\'\u0093\3"+
		"\2\2\2)\u0096\3\2\2\2+\u0098\3\2\2\2-\u009a\3\2\2\2/\u009c\3\2\2\2\61"+
		"\u009e\3\2\2\2\63\u00a0\3\2\2\2\65\u00aa\3\2\2\2\67\u00ad\3\2\2\29\u00b2"+
		"\3\2\2\2;\u00c6\3\2\2\2=\u00d1\3\2\2\2?\u00d3\3\2\2\2A\u00dc\3\2\2\2C"+
		"\u00de\3\2\2\2E\u00e0\3\2\2\2G\u00e2\3\2\2\2I\u00eb\3\2\2\2K\u0104\3\2"+
		"\2\2M\u0106\3\2\2\2OP\7}\2\2P\4\3\2\2\2QR\7\177\2\2R\6\3\2\2\2ST\7=\2"+
		"\2T\b\3\2\2\2UV\7.\2\2V\n\3\2\2\2WX\7*\2\2X\f\3\2\2\2YZ\7+\2\2Z\16\3\2"+
		"\2\2[\\\7*\2\2\\]\7+\2\2]\20\3\2\2\2^_\7e\2\2_`\7n\2\2`a\7c\2\2ab\7u\2"+
		"\2bc\7u\2\2c\22\3\2\2\2de\7k\2\2ef\7h\2\2f\24\3\2\2\2gh\7g\2\2hi\7n\2"+
		"\2ij\7u\2\2jk\7g\2\2k\26\3\2\2\2lm\7y\2\2mn\7j\2\2no\7k\2\2op\7n\2\2p"+
		"q\7g\2\2q\30\3\2\2\2rs\7t\2\2st\7g\2\2tu\7v\2\2uv\7w\2\2vw\7t\2\2wx\7"+
		"p\2\2x\32\3\2\2\2yz\7p\2\2z{\7g\2\2{|\7y\2\2|\34\3\2\2\2}~\7p\2\2~\177"+
		"\7k\2\2\177\u0080\7z\2\2\u0080\36\3\2\2\2\u0081\u0082\7?\2\2\u0082 \3"+
		"\2\2\2\u0083\u008d\t\2\2\2\u0084\u0085\7>\2\2\u0085\u008d\7?\2\2\u0086"+
		"\u0087\7@\2\2\u0087\u008d\7?\2\2\u0088\u0089\7?\2\2\u0089\u008d\7?\2\2"+
		"\u008a\u008b\7#\2\2\u008b\u008d\7?\2\2\u008c\u0083\3\2\2\2\u008c\u0084"+
		"\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\"\3\2\2\2\u008e\u008f\t\3\2\2\u008f$\3\2\2\2\u0090\u0091\7~\2\2\u0091"+
		"\u0092\7~\2\2\u0092&\3\2\2\2\u0093\u0094\7(\2\2\u0094\u0095\7(\2\2\u0095"+
		"(\3\2\2\2\u0096\u0097\t\4\2\2\u0097*\3\2\2\2\u0098\u0099\7#\2\2\u0099"+
		",\3\2\2\2\u009a\u009b\7\60\2\2\u009b.\3\2\2\2\u009c\u009d\t\5\2\2\u009d"+
		"\60\3\2\2\2\u009e\u009f\t\6\2\2\u009f\62\3\2\2\2\u00a0\u00a1\t\7\2\2\u00a1"+
		"\64\3\2\2\2\u00a2\u00ab\5\61\31\2\u00a3\u00a7\5\63\32\2\u00a4\u00a6\5"+
		"\61\31\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00a2\3\2"+
		"\2\2\u00aa\u00a3\3\2\2\2\u00ab\66\3\2\2\2\u00ac\u00ae\5\61\31\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b08\3\2\2\2\u00b1\u00b3\7/\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7\5\65\33\2\u00b5\u00b6\7\60\2"+
		"\2\u00b6\u00b8\5\67\34\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		":\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7p\2\2\u00bb\u00c7\7v\2\2\u00bc"+
		"\u00bd\7U\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7k\2\2"+
		"\u00c0\u00c1\7p\2\2\u00c1\u00c7\7i\2\2\u00c2\u00c3\7d\2\2\u00c3\u00c4"+
		"\7q\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c7\7n\2\2\u00c6\u00b9\3\2\2\2\u00c6"+
		"\u00bc\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c7<\3\2\2\2\u00c8\u00c9\7v\2\2\u00c9"+
		"\u00ca\7t\2\2\u00ca\u00cb\7w\2\2\u00cb\u00d2\7g\2\2\u00cc\u00cd\7h\2\2"+
		"\u00cd\u00ce\7c\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d2"+
		"\7g\2\2\u00d1\u00c8\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d2>\3\2\2\2\u00d3\u00d9"+
		"\t\b\2\2\u00d4\u00d8\5A!\2\u00d5\u00d8\5\61\31\2\u00d6\u00d8\7a\2\2\u00d7"+
		"\u00d4\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da@\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00dc\u00dd\t\t\2\2\u00ddB\3\2\2\2\u00de\u00df\t\n\2\2\u00df"+
		"D\3\2\2\2\u00e0\u00e1\t\13\2\2\u00e1F\3\2\2\2\u00e2\u00e3\7\61\2\2\u00e3"+
		"\u00e4\7\61\2\2\u00e4\u00e8\3\2\2\2\u00e5\u00e7\n\f\2\2\u00e6\u00e5\3"+
		"\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"H\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00f2\7$\2\2\u00ec\u00f1\t\r\2\2\u00ed"+
		"\u00f1\5/\30\2\u00ee\u00f1\5C\"\2\u00ef\u00f1\7\"\2\2\u00f0\u00ec\3\2"+
		"\2\2\u00f0\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7$\2\2\u00f6J\3\2\2\2\u00f7\u00f8"+
		"\7r\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7d\2\2\u00fa\u00fb\7n\2\2\u00fb"+
		"\u00fc\7k\2\2\u00fc\u0105\7e\2\2\u00fd\u00fe\7r\2\2\u00fe\u00ff\7t\2\2"+
		"\u00ff\u0100\7k\2\2\u0100\u0101\7x\2\2\u0101\u0102\7c\2\2\u0102\u0103"+
		"\7v\2\2\u0103\u0105\7g\2\2\u0104\u00f7\3\2\2\2\u0104\u00fd\3\2\2\2\u0105"+
		"L\3\2\2\2\u0106\u010c\t\16\2\2\u0107\u010b\5A!\2\u0108\u010b\5\61\31\2"+
		"\u0109\u010b\7a\2\2\u010a\u0107\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u0109"+
		"\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"N\3\2\2\2\u010e\u010c\3\2\2\2\23\2\u008c\u00a7\u00aa\u00af\u00b2\u00b7"+
		"\u00c6\u00d1\u00d7\u00d9\u00e8\u00f0\u00f2\u0104\u010a\u010c\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}