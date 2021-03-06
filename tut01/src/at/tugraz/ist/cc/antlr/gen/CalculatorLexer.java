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
		T__0=1, KEY_BEGIN=2, KEY_END=3, NUMBER=4, ID=5, STRING_LIT=6, EQ=7, ADD=8, 
		MUL=9, WS=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "KEY_BEGIN", "KEY_END", "DIGIT", "NUMBER", "ID", "LETTER", "STRING_LIT", 
		"EQ", "ADD", "MUL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'begin'", "'end'", null, null, null, "'='", "'+'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "KEY_BEGIN", "KEY_END", "NUMBER", "ID", "STRING_LIT", "EQ", 
		"ADD", "MUL", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\fK\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\6\6\6+\n\6\r\6\16\6,\3\7\3\7\3\7\7\7\62\n\7\f\7\16\7\65\13\7"+
		"\3\b\3\b\3\t\3\t\7\t;\n\t\f\t\16\t>\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3<\2\16\3\3\5\4\7\5\t\2\13\6\r\7\17\2\21\b\23\t\25"+
		"\n\27\13\31\f\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"L\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2"+
		"\7#\3\2\2\2\t\'\3\2\2\2\13*\3\2\2\2\r.\3\2\2\2\17\66\3\2\2\2\218\3\2\2"+
		"\2\23A\3\2\2\2\25C\3\2\2\2\27E\3\2\2\2\31G\3\2\2\2\33\34\7=\2\2\34\4\3"+
		"\2\2\2\35\36\7d\2\2\36\37\7g\2\2\37 \7i\2\2 !\7k\2\2!\"\7p\2\2\"\6\3\2"+
		"\2\2#$\7g\2\2$%\7p\2\2%&\7f\2\2&\b\3\2\2\2\'(\t\2\2\2(\n\3\2\2\2)+\5\t"+
		"\5\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\f\3\2\2\2.\63\5\17\b\2/"+
		"\62\5\17\b\2\60\62\5\t\5\2\61/\3\2\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63"+
		"\61\3\2\2\2\63\64\3\2\2\2\64\16\3\2\2\2\65\63\3\2\2\2\66\67\t\3\2\2\67"+
		"\20\3\2\2\28<\7$\2\29;\13\2\2\2:9\3\2\2\2;>\3\2\2\2<=\3\2\2\2<:\3\2\2"+
		"\2=?\3\2\2\2><\3\2\2\2?@\7$\2\2@\22\3\2\2\2AB\7?\2\2B\24\3\2\2\2CD\7-"+
		"\2\2D\26\3\2\2\2EF\7,\2\2F\30\3\2\2\2GH\t\4\2\2HI\3\2\2\2IJ\b\r\2\2J\32"+
		"\3\2\2\2\7\2,\61\63<\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}