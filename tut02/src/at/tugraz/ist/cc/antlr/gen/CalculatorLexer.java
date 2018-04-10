// Generated from Calculator.g4 by ANTLR 4.5

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
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, KEY_BEGIN=2, KEY_END=3, KEY_INT=4, KEY_STR=5, NUMBER=6, ID=7, 
		STRING_LIT=8, EQ=9, ADD=10, MUL=11, WS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "KEY_BEGIN", "KEY_END", "KEY_INT", "KEY_STR", "DIGIT", "NUMBER", 
		"ID", "LETTER", "STRING_LIT", "EQ", "ADD", "MUL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'begin'", "'end'", "'int'", "'string'", null, null, null, 
		"'='", "'+'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "KEY_BEGIN", "KEY_END", "KEY_INT", "KEY_STR", "NUMBER", "ID", 
		"STRING_LIT", "EQ", "ADD", "MUL", "WS"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16Z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\6\b:\n\b\r\b\16\b;\3\t\3\t\3\t\7\tA\n\t\f\t\16\tD\13\t\3\n\3\n\3"+
		"\13\3\13\7\13J\n\13\f\13\16\13M\13\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3K\2\20\3\3\5\4\7\5\t\6\13\7\r\2\17\b\21\t\23"+
		"\2\25\n\27\13\31\f\33\r\35\16\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\""+
		"\"[\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7\'\3\2\2\2\t+\3\2\2\2\13/\3"+
		"\2\2\2\r\66\3\2\2\2\179\3\2\2\2\21=\3\2\2\2\23E\3\2\2\2\25G\3\2\2\2\27"+
		"P\3\2\2\2\31R\3\2\2\2\33T\3\2\2\2\35V\3\2\2\2\37 \7=\2\2 \4\3\2\2\2!\""+
		"\7d\2\2\"#\7g\2\2#$\7i\2\2$%\7k\2\2%&\7p\2\2&\6\3\2\2\2\'(\7g\2\2()\7"+
		"p\2\2)*\7f\2\2*\b\3\2\2\2+,\7k\2\2,-\7p\2\2-.\7v\2\2.\n\3\2\2\2/\60\7"+
		"u\2\2\60\61\7v\2\2\61\62\7t\2\2\62\63\7k\2\2\63\64\7p\2\2\64\65\7i\2\2"+
		"\65\f\3\2\2\2\66\67\t\2\2\2\67\16\3\2\2\28:\5\r\7\298\3\2\2\2:;\3\2\2"+
		"\2;9\3\2\2\2;<\3\2\2\2<\20\3\2\2\2=B\5\23\n\2>A\5\23\n\2?A\5\r\7\2@>\3"+
		"\2\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\22\3\2\2\2DB\3\2\2\2E"+
		"F\t\3\2\2F\24\3\2\2\2GK\7$\2\2HJ\13\2\2\2IH\3\2\2\2JM\3\2\2\2KL\3\2\2"+
		"\2KI\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7$\2\2O\26\3\2\2\2PQ\7?\2\2Q\30\3\2"+
		"\2\2RS\7-\2\2S\32\3\2\2\2TU\7,\2\2U\34\3\2\2\2VW\t\4\2\2WX\3\2\2\2XY\b"+
		"\17\2\2Y\36\3\2\2\2\7\2;@BK\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}