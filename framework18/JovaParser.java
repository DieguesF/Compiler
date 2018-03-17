// Generated from Jova.g4 by ANTLR 4.5

	package at.tugraz.ist.cc.antlr.gen; 

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JovaParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_type = 1, RULE_class_decls = 2, RULE_class_decl = 3, 
		RULE_class_head = 4, RULE_class_body = 5, RULE_member_decls = 6, RULE_member_decl = 7, 
		RULE_id_list = 8, RULE_method_decls = 9, RULE_method_decl = 10, RULE_method_head = 11, 
		RULE_params = 12, RULE_param_list = 13, RULE_method_body = 14, RULE_declaration = 15, 
		RULE_stmt = 16, RULE_ret_stmt = 17, RULE_if_stmt = 18, RULE_while_stmt = 19, 
		RULE_assignment = 20, RULE_member_access = 21, RULE_object_alloc = 22, 
		RULE_compound_stmt = 23, RULE_expr = 24, RULE_expr_or = 25, RULE_expr_and = 26, 
		RULE_expr_relop = 27, RULE_expr_sign = 28, RULE_expr_mulop = 29, RULE_operand = 30, 
		RULE_id_operand = 31, RULE_arg_list = 32, RULE_args = 33;
	public static final String[] ruleNames = {
		"program", "type", "class_decls", "class_decl", "class_head", "class_body", 
		"member_decls", "member_decl", "id_list", "method_decls", "method_decl", 
		"method_head", "params", "param_list", "method_body", "declaration", "stmt", 
		"ret_stmt", "if_stmt", "while_stmt", "assignment", "member_access", "object_alloc", 
		"compound_stmt", "expr", "expr_or", "expr_and", "expr_relop", "expr_sign", 
		"expr_mulop", "operand", "id_operand", "arg_list", "args"
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

	@Override
	public String getGrammarFileName() { return "Jova.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JovaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Class_declsContext class_decls() {
			return getRuleContext(Class_declsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			class_decls();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode PRIMITIVE_TYPE() { return getToken(JovaParser.PRIMITIVE_TYPE, 0); }
		public TerminalNode CLASS_TYPE() { return getToken(JovaParser.CLASS_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==PRIMITIVE_TYPE || _la==CLASS_TYPE) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Class_declsContext extends ParserRuleContext {
		public Class_declContext class_decl() {
			return getRuleContext(Class_declContext.class,0);
		}
		public Class_declsContext class_decls() {
			return getRuleContext(Class_declsContext.class,0);
		}
		public Class_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterClass_decls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitClass_decls(this);
		}
	}

	public final Class_declsContext class_decls() throws RecognitionException {
		Class_declsContext _localctx = new Class_declsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_decls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			class_decl();
			setState(75);
			switch (_input.LA(1)) {
			case KEY_CLASS:
				{
				setState(73);
				class_decls();
				}
				break;
			case EOF:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Class_declContext extends ParserRuleContext {
		public Class_headContext class_head() {
			return getRuleContext(Class_headContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public Class_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterClass_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitClass_decl(this);
		}
	}

	public final Class_declContext class_decl() throws RecognitionException {
		Class_declContext _localctx = new Class_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			class_head();
			setState(78);
			class_body();
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

	public static class Class_headContext extends ParserRuleContext {
		public TerminalNode KEY_CLASS() { return getToken(JovaParser.KEY_CLASS, 0); }
		public TerminalNode CLASS_TYPE() { return getToken(JovaParser.CLASS_TYPE, 0); }
		public Class_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterClass_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitClass_head(this);
		}
	}

	public final Class_headContext class_head() throws RecognitionException {
		Class_headContext _localctx = new Class_headContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_class_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(KEY_CLASS);
			setState(81);
			match(CLASS_TYPE);
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

	public static class Class_bodyContext extends ParserRuleContext {
		public Member_declsContext member_decls() {
			return getRuleContext(Member_declsContext.class,0);
		}
		public Method_declsContext method_decls() {
			return getRuleContext(Method_declsContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitClass_body(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_class_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__0);
			setState(84);
			member_decls();
			setState(85);
			method_decls();
			setState(86);
			match(T__1);
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

	public static class Member_declsContext extends ParserRuleContext {
		public Member_declContext member_decl() {
			return getRuleContext(Member_declContext.class,0);
		}
		public Member_declsContext member_decls() {
			return getRuleContext(Member_declsContext.class,0);
		}
		public Member_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMember_decls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMember_decls(this);
		}
	}

	public final Member_declsContext member_decls() throws RecognitionException {
		Member_declsContext _localctx = new Member_declsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_member_decls);
		try {
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				member_decl();
				setState(89);
				member_decls();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Member_declContext extends ParserRuleContext {
		public TerminalNode AMOD() { return getToken(JovaParser.AMOD, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Member_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMember_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMember_decl(this);
		}
	}

	public final Member_declContext member_decl() throws RecognitionException {
		Member_declContext _localctx = new Member_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_member_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(AMOD);
			setState(95);
			type();
			setState(96);
			id_list();
			setState(97);
			match(T__2);
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

	public static class Id_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JovaParser.ID, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitId_list(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_id_list);
		try {
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(ID);
				setState(101);
				match(T__3);
				setState(102);
				id_list();
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

	public static class Method_declsContext extends ParserRuleContext {
		public Method_declContext method_decl() {
			return getRuleContext(Method_declContext.class,0);
		}
		public Method_declsContext method_decls() {
			return getRuleContext(Method_declsContext.class,0);
		}
		public Method_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMethod_decls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMethod_decls(this);
		}
	}

	public final Method_declsContext method_decls() throws RecognitionException {
		Method_declsContext _localctx = new Method_declsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_method_decls);
		try {
			setState(109);
			switch (_input.LA(1)) {
			case AMOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				method_decl();
				setState(106);
				method_decls();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Method_declContext extends ParserRuleContext {
		public Method_headContext method_head() {
			return getRuleContext(Method_headContext.class,0);
		}
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_method_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			method_head();
			setState(112);
			method_body();
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

	public static class Method_headContext extends ParserRuleContext {
		public TerminalNode AMOD() { return getToken(JovaParser.AMOD, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JovaParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Method_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMethod_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMethod_head(this);
		}
	}

	public final Method_headContext method_head() throws RecognitionException {
		Method_headContext _localctx = new Method_headContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_method_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(AMOD);
			setState(115);
			type();
			setState(116);
			match(ID);
			setState(117);
			params();
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

	public static class ParamsContext extends ParserRuleContext {
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_params);
		try {
			setState(124);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(T__4);
				setState(120);
				param_list(0);
				setState(121);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(T__6);
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

	public static class Param_listContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JovaParser.ID, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitParam_list(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		return param_list(0);
	}

	private Param_listContext param_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Param_listContext _localctx = new Param_listContext(_ctx, _parentState);
		Param_listContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(127);
			type();
			setState(128);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_param_list);
					setState(130);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(131);
					match(T__3);
					setState(132);
					type();
					setState(133);
					match(ID);
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Method_bodyContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Ret_stmtContext ret_stmt() {
			return getRuleContext(Ret_stmtContext.class,0);
		}
		public Method_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMethod_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMethod_body(this);
		}
	}

	public final Method_bodyContext method_body() throws RecognitionException {
		Method_bodyContext _localctx = new Method_bodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_method_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__0);
			setState(141);
			declaration(0);
			setState(142);
			stmt(0);
			setState(143);
			ret_stmt();
			setState(144);
			match(T__1);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		return declaration(0);
	}

	private DeclarationContext declaration(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationContext _localctx = new DeclarationContext(_ctx, _parentState);
		DeclarationContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_declaration, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(147);
				type();
				setState(148);
				id_list();
				setState(149);
				match(T__2);
				}
				break;
			case 2:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declaration);
					setState(154);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(155);
					type();
					setState(156);
					id_list();
					setState(157);
					match(T__2);
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		return stmt(0);
	}

	private StmtContext stmt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StmtContext _localctx = new StmtContext(_ctx, _parentState);
		StmtContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_stmt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(173);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new StmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(165);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(166);
						if_stmt();
						}
						break;
					case 2:
						{
						_localctx = new StmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(167);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(168);
						while_stmt();
						}
						break;
					case 3:
						{
						_localctx = new StmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(169);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(170);
						assignment();
						setState(171);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Ret_stmtContext extends ParserRuleContext {
		public TerminalNode KEY_RETURN() { return getToken(JovaParser.KEY_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Ret_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterRet_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitRet_stmt(this);
		}
	}

	public final Ret_stmtContext ret_stmt() throws RecognitionException {
		Ret_stmtContext _localctx = new Ret_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ret_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(KEY_RETURN);
			setState(179);
			expr();
			setState(180);
			match(T__2);
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode KEY_IF() { return getToken(JovaParser.KEY_IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Compound_stmtContext> compound_stmt() {
			return getRuleContexts(Compound_stmtContext.class);
		}
		public Compound_stmtContext compound_stmt(int i) {
			return getRuleContext(Compound_stmtContext.class,i);
		}
		public TerminalNode KEY_ELSE() { return getToken(JovaParser.KEY_ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_stmt);
		try {
			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(KEY_IF);
				setState(183);
				match(T__4);
				setState(184);
				expr();
				setState(185);
				match(T__5);
				setState(186);
				compound_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(KEY_IF);
				setState(189);
				match(T__4);
				setState(190);
				expr();
				setState(191);
				match(T__5);
				setState(192);
				compound_stmt();
				setState(193);
				match(KEY_ELSE);
				setState(194);
				compound_stmt();
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

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode KEY_WHILE() { return getToken(JovaParser.KEY_WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(KEY_WHILE);
			setState(199);
			match(T__4);
			setState(200);
			expr();
			setState(201);
			match(T__5);
			setState(202);
			compound_stmt();
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

	public static class AssignmentContext extends ParserRuleContext {
		public Member_accessContext member_access() {
			return getRuleContext(Member_accessContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JovaParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Object_allocContext object_alloc() {
			return getRuleContext(Object_allocContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			member_access();
			setState(205);
			match(ASSIGN);
			setState(208);
			switch (_input.LA(1)) {
			case T__4:
			case KEY_NIX:
			case SIGN:
			case NOT:
			case INT:
			case BOOL:
			case ID:
			case LITERAL:
				{
				setState(206);
				expr();
				}
				break;
			case KEY_NEW:
				{
				setState(207);
				object_alloc();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Member_accessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JovaParser.ID, 0); }
		public TerminalNode DOTOP() { return getToken(JovaParser.DOTOP, 0); }
		public Member_accessContext member_access() {
			return getRuleContext(Member_accessContext.class,0);
		}
		public Member_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMember_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMember_access(this);
		}
	}

	public final Member_accessContext member_access() throws RecognitionException {
		Member_accessContext _localctx = new Member_accessContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_member_access);
		try {
			setState(214);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(ID);
				setState(211);
				match(DOTOP);
				setState(212);
				member_access();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(ID);
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

	public static class Object_allocContext extends ParserRuleContext {
		public TerminalNode KEY_NEW() { return getToken(JovaParser.KEY_NEW, 0); }
		public TerminalNode CLASS_TYPE() { return getToken(JovaParser.CLASS_TYPE, 0); }
		public Object_allocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_alloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterObject_alloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitObject_alloc(this);
		}
	}

	public final Object_allocContext object_alloc() throws RecognitionException {
		Object_allocContext _localctx = new Object_allocContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_object_alloc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(KEY_NEW);
			setState(217);
			match(CLASS_TYPE);
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

	public static class Compound_stmtContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitCompound_stmt(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_compound_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__0);
			setState(220);
			stmt(0);
			setState(221);
			match(T__1);
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
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Expr_orContext expr_or() {
			return getRuleContext(Expr_orContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr);
		try {
			setState(225);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				operand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				expr_or();
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

	public static class Expr_orContext extends ParserRuleContext {
		public List<Expr_andContext> expr_and() {
			return getRuleContexts(Expr_andContext.class);
		}
		public Expr_andContext expr_and(int i) {
			return getRuleContext(Expr_andContext.class,i);
		}
		public TerminalNode OR() { return getToken(JovaParser.OR, 0); }
		public Expr_orContext expr_or() {
			return getRuleContext(Expr_orContext.class,0);
		}
		public Expr_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterExpr_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitExpr_or(this);
		}
	}

	public final Expr_orContext expr_or() throws RecognitionException {
		Expr_orContext _localctx = new Expr_orContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			expr_and();
			setState(228);
			match(OR);
			setState(231);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(229);
				expr_or();
				}
				break;
			case 2:
				{
				setState(230);
				expr_and();
				}
				break;
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

	public static class Expr_andContext extends ParserRuleContext {
		public List<Expr_relopContext> expr_relop() {
			return getRuleContexts(Expr_relopContext.class);
		}
		public Expr_relopContext expr_relop(int i) {
			return getRuleContext(Expr_relopContext.class,i);
		}
		public TerminalNode AND() { return getToken(JovaParser.AND, 0); }
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterExpr_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitExpr_and(this);
		}
	}

	public final Expr_andContext expr_and() throws RecognitionException {
		Expr_andContext _localctx = new Expr_andContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			expr_relop();
			setState(234);
			match(AND);
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(235);
				expr_and();
				}
				break;
			case 2:
				{
				setState(236);
				expr_relop();
				}
				break;
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

	public static class Expr_relopContext extends ParserRuleContext {
		public List<Expr_signContext> expr_sign() {
			return getRuleContexts(Expr_signContext.class);
		}
		public Expr_signContext expr_sign(int i) {
			return getRuleContext(Expr_signContext.class,i);
		}
		public TerminalNode RELOP() { return getToken(JovaParser.RELOP, 0); }
		public Expr_relopContext expr_relop() {
			return getRuleContext(Expr_relopContext.class,0);
		}
		public Expr_relopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterExpr_relop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitExpr_relop(this);
		}
	}

	public final Expr_relopContext expr_relop() throws RecognitionException {
		Expr_relopContext _localctx = new Expr_relopContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr_relop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			expr_sign();
			setState(240);
			match(RELOP);
			setState(243);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(241);
				expr_relop();
				}
				break;
			case 2:
				{
				setState(242);
				expr_sign();
				}
				break;
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

	public static class Expr_signContext extends ParserRuleContext {
		public List<Expr_mulopContext> expr_mulop() {
			return getRuleContexts(Expr_mulopContext.class);
		}
		public Expr_mulopContext expr_mulop(int i) {
			return getRuleContext(Expr_mulopContext.class,i);
		}
		public TerminalNode SIGN() { return getToken(JovaParser.SIGN, 0); }
		public Expr_signContext expr_sign() {
			return getRuleContext(Expr_signContext.class,0);
		}
		public Expr_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterExpr_sign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitExpr_sign(this);
		}
	}

	public final Expr_signContext expr_sign() throws RecognitionException {
		Expr_signContext _localctx = new Expr_signContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			expr_mulop();
			setState(246);
			match(SIGN);
			setState(249);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(247);
				expr_sign();
				}
				break;
			case 2:
				{
				setState(248);
				expr_mulop();
				}
				break;
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

	public static class Expr_mulopContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode MULOP() { return getToken(JovaParser.MULOP, 0); }
		public Expr_mulopContext expr_mulop() {
			return getRuleContext(Expr_mulopContext.class,0);
		}
		public Expr_mulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterExpr_mulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitExpr_mulop(this);
		}
	}

	public final Expr_mulopContext expr_mulop() throws RecognitionException {
		Expr_mulopContext _localctx = new Expr_mulopContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expr_mulop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			operand();
			setState(252);
			match(MULOP);
			setState(255);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(253);
				expr_mulop();
				}
				break;
			case 2:
				{
				setState(254);
				operand();
				}
				break;
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

	public static class OperandContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JovaParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(JovaParser.BOOL, 0); }
		public TerminalNode LITERAL() { return getToken(JovaParser.LITERAL, 0); }
		public TerminalNode KEY_NIX() { return getToken(JovaParser.KEY_NIX, 0); }
		public TerminalNode NOT() { return getToken(JovaParser.NOT, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode SIGN() { return getToken(JovaParser.SIGN, 0); }
		public Id_operandContext id_operand() {
			return getRuleContext(Id_operandContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_operand);
		try {
			setState(270);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(INT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(BOOL);
				}
				break;
			case LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(LITERAL);
				}
				break;
			case KEY_NIX:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				match(KEY_NIX);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(261);
				match(NOT);
				setState(262);
				operand();
				}
				break;
			case SIGN:
				enterOuterAlt(_localctx, 6);
				{
				setState(263);
				match(SIGN);
				setState(264);
				operand();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(265);
				id_operand();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 8);
				{
				setState(266);
				match(T__4);
				setState(267);
				expr();
				setState(268);
				match(T__5);
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

	public static class Id_operandContext extends ParserRuleContext {
		public Member_accessContext member_access() {
			return getRuleContext(Member_accessContext.class,0);
		}
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public Id_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterId_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitId_operand(this);
		}
	}

	public final Id_operandContext id_operand() throws RecognitionException {
		Id_operandContext _localctx = new Id_operandContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_id_operand);
		try {
			setState(278);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				member_access();
				setState(273);
				match(T__4);
				setState(274);
				arg_list();
				setState(275);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				member_access();
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

	public static class Arg_listContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterArg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitArg_list(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arg_list);
		try {
			setState(282);
			switch (_input.LA(1)) {
			case T__4:
			case KEY_NIX:
			case SIGN:
			case NOT:
			case INT:
			case BOOL:
			case ID:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				args(0);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ArgsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		return args(0);
	}

	private ArgsContext args(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgsContext _localctx = new ArgsContext(_ctx, _parentState);
		ArgsContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(285);
			expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_args);
					setState(287);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(288);
					match(T__3);
					setState(289);
					expr();
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return param_list_sempred((Param_listContext)_localctx, predIndex);
		case 15:
			return declaration_sempred((DeclarationContext)_localctx, predIndex);
		case 16:
			return stmt_sempred((StmtContext)_localctx, predIndex);
		case 33:
			return args_sempred((ArgsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean param_list_sempred(Param_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declaration_sempred(DeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean stmt_sempred(StmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean args_sempred(ArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u012a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\4\5\4N\n\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b_\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\5\nj\n\n\3\13\3\13\3\13\3\13\5\13p\n\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\177\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u008a\n\17\f\17\16\17\u008d\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u009b"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\7\21\u00a2\n\21\f\21\16\21\u00a5\13\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00b0\n\22\f\22\16"+
		"\22\u00b3\13\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c7\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00d3\n\26\3\27\3\27\3\27\3\27\5\27"+
		"\u00d9\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u00e4\n"+
		"\32\3\33\3\33\3\33\3\33\5\33\u00ea\n\33\3\34\3\34\3\34\3\34\5\34\u00f0"+
		"\n\34\3\35\3\35\3\35\3\35\5\35\u00f6\n\35\3\36\3\36\3\36\3\36\5\36\u00fc"+
		"\n\36\3\37\3\37\3\37\3\37\5\37\u0102\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \5 \u0111\n \3!\3!\3!\3!\3!\3!\5!\u0119\n!\3\"\3\"\5\"\u011d"+
		"\n\"\3#\3#\3#\3#\3#\3#\7#\u0125\n#\f#\16#\u0128\13#\3#\2\6\34 \"D$\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\3\4"+
		"\2\34\34##\u0125\2F\3\2\2\2\4H\3\2\2\2\6J\3\2\2\2\bO\3\2\2\2\nR\3\2\2"+
		"\2\fU\3\2\2\2\16^\3\2\2\2\20`\3\2\2\2\22i\3\2\2\2\24o\3\2\2\2\26q\3\2"+
		"\2\2\30t\3\2\2\2\32~\3\2\2\2\34\u0080\3\2\2\2\36\u008e\3\2\2\2 \u009a"+
		"\3\2\2\2\"\u00a6\3\2\2\2$\u00b4\3\2\2\2&\u00c6\3\2\2\2(\u00c8\3\2\2\2"+
		"*\u00ce\3\2\2\2,\u00d8\3\2\2\2.\u00da\3\2\2\2\60\u00dd\3\2\2\2\62\u00e3"+
		"\3\2\2\2\64\u00e5\3\2\2\2\66\u00eb\3\2\2\28\u00f1\3\2\2\2:\u00f7\3\2\2"+
		"\2<\u00fd\3\2\2\2>\u0110\3\2\2\2@\u0118\3\2\2\2B\u011c\3\2\2\2D\u011e"+
		"\3\2\2\2FG\5\6\4\2G\3\3\2\2\2HI\t\2\2\2I\5\3\2\2\2JM\5\b\5\2KN\5\6\4\2"+
		"LN\3\2\2\2MK\3\2\2\2ML\3\2\2\2N\7\3\2\2\2OP\5\n\6\2PQ\5\f\7\2Q\t\3\2\2"+
		"\2RS\7\n\2\2ST\7#\2\2T\13\3\2\2\2UV\7\3\2\2VW\5\16\b\2WX\5\24\13\2XY\7"+
		"\4\2\2Y\r\3\2\2\2Z[\5\20\t\2[\\\5\16\b\2\\_\3\2\2\2]_\3\2\2\2^Z\3\2\2"+
		"\2^]\3\2\2\2_\17\3\2\2\2`a\7\"\2\2ab\5\4\3\2bc\5\22\n\2cd\7\5\2\2d\21"+
		"\3\2\2\2ej\7\36\2\2fg\7\36\2\2gh\7\6\2\2hj\5\22\n\2ie\3\2\2\2if\3\2\2"+
		"\2j\23\3\2\2\2kl\5\26\f\2lm\5\24\13\2mp\3\2\2\2np\3\2\2\2ok\3\2\2\2on"+
		"\3\2\2\2p\25\3\2\2\2qr\5\30\r\2rs\5\36\20\2s\27\3\2\2\2tu\7\"\2\2uv\5"+
		"\4\3\2vw\7\36\2\2wx\5\32\16\2x\31\3\2\2\2yz\7\7\2\2z{\5\34\17\2{|\7\b"+
		"\2\2|\177\3\2\2\2}\177\7\t\2\2~y\3\2\2\2~}\3\2\2\2\177\33\3\2\2\2\u0080"+
		"\u0081\b\17\1\2\u0081\u0082\5\4\3\2\u0082\u0083\7\36\2\2\u0083\u008b\3"+
		"\2\2\2\u0084\u0085\f\3\2\2\u0085\u0086\7\6\2\2\u0086\u0087\5\4\3\2\u0087"+
		"\u0088\7\36\2\2\u0088\u008a\3\2\2\2\u0089\u0084\3\2\2\2\u008a\u008d\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\35\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u008f\7\3\2\2\u008f\u0090\5 \21\2\u0090\u0091\5\""+
		"\22\2\u0091\u0092\5$\23\2\u0092\u0093\7\4\2\2\u0093\37\3\2\2\2\u0094\u0095"+
		"\b\21\1\2\u0095\u0096\5\4\3\2\u0096\u0097\5\22\n\2\u0097\u0098\7\5\2\2"+
		"\u0098\u009b\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0099"+
		"\3\2\2\2\u009b\u00a3\3\2\2\2\u009c\u009d\f\4\2\2\u009d\u009e\5\4\3\2\u009e"+
		"\u009f\5\22\n\2\u009f\u00a0\7\5\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009c\3"+
		"\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"!\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00b1\b\22\1\2\u00a7\u00a8\f\6\2\2"+
		"\u00a8\u00b0\5&\24\2\u00a9\u00aa\f\5\2\2\u00aa\u00b0\5(\25\2\u00ab\u00ac"+
		"\f\4\2\2\u00ac\u00ad\5*\26\2\u00ad\u00ae\7\5\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00a7\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\u00b3\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2#\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b4\u00b5\7\16\2\2\u00b5\u00b6\5\62\32\2\u00b6\u00b7\7\5\2"+
		"\2\u00b7%\3\2\2\2\u00b8\u00b9\7\13\2\2\u00b9\u00ba\7\7\2\2\u00ba\u00bb"+
		"\5\62\32\2\u00bb\u00bc\7\b\2\2\u00bc\u00bd\5\60\31\2\u00bd\u00c7\3\2\2"+
		"\2\u00be\u00bf\7\13\2\2\u00bf\u00c0\7\7\2\2\u00c0\u00c1\5\62\32\2\u00c1"+
		"\u00c2\7\b\2\2\u00c2\u00c3\5\60\31\2\u00c3\u00c4\7\f\2\2\u00c4\u00c5\5"+
		"\60\31\2\u00c5\u00c7\3\2\2\2\u00c6\u00b8\3\2\2\2\u00c6\u00be\3\2\2\2\u00c7"+
		"\'\3\2\2\2\u00c8\u00c9\7\r\2\2\u00c9\u00ca\7\7\2\2\u00ca\u00cb\5\62\32"+
		"\2\u00cb\u00cc\7\b\2\2\u00cc\u00cd\5\60\31\2\u00cd)\3\2\2\2\u00ce\u00cf"+
		"\5,\27\2\u00cf\u00d2\7\21\2\2\u00d0\u00d3\5\62\32\2\u00d1\u00d3\5.\30"+
		"\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3+\3\2\2\2\u00d4\u00d5"+
		"\7\36\2\2\u00d5\u00d6\7\30\2\2\u00d6\u00d9\5,\27\2\u00d7\u00d9\7\36\2"+
		"\2\u00d8\u00d4\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9-\3\2\2\2\u00da\u00db"+
		"\7\17\2\2\u00db\u00dc\7#\2\2\u00dc/\3\2\2\2\u00dd\u00de\7\3\2\2\u00de"+
		"\u00df\5\"\22\2\u00df\u00e0\7\4\2\2\u00e0\61\3\2\2\2\u00e1\u00e4\5> \2"+
		"\u00e2\u00e4\5\64\33\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\63"+
		"\3\2\2\2\u00e5\u00e6\5\66\34\2\u00e6\u00e9\7\24\2\2\u00e7\u00ea\5\64\33"+
		"\2\u00e8\u00ea\5\66\34\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\65\3\2\2\2\u00eb\u00ec\58\35\2\u00ec\u00ef\7\25\2\2\u00ed\u00f0\5\66"+
		"\34\2\u00ee\u00f0\58\35\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0"+
		"\67\3\2\2\2\u00f1\u00f2\5:\36\2\u00f2\u00f5\7\22\2\2\u00f3\u00f6\58\35"+
		"\2\u00f4\u00f6\5:\36\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f69"+
		"\3\2\2\2\u00f7\u00f8\5<\37\2\u00f8\u00fb\7\26\2\2\u00f9\u00fc\5:\36\2"+
		"\u00fa\u00fc\5<\37\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc;\3"+
		"\2\2\2\u00fd\u00fe\5> \2\u00fe\u0101\7\23\2\2\u00ff\u0102\5<\37\2\u0100"+
		"\u0102\5> \2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102=\3\2\2\2\u0103"+
		"\u0111\7\33\2\2\u0104\u0111\7\35\2\2\u0105\u0111\7!\2\2\u0106\u0111\7"+
		"\20\2\2\u0107\u0108\7\27\2\2\u0108\u0111\5> \2\u0109\u010a\7\26\2\2\u010a"+
		"\u0111\5> \2\u010b\u0111\5@!\2\u010c\u010d\7\7\2\2\u010d\u010e\5\62\32"+
		"\2\u010e\u010f\7\b\2\2\u010f\u0111\3\2\2\2\u0110\u0103\3\2\2\2\u0110\u0104"+
		"\3\2\2\2\u0110\u0105\3\2\2\2\u0110\u0106\3\2\2\2\u0110\u0107\3\2\2\2\u0110"+
		"\u0109\3\2\2\2\u0110\u010b\3\2\2\2\u0110\u010c\3\2\2\2\u0111?\3\2\2\2"+
		"\u0112\u0113\5,\27\2\u0113\u0114\7\7\2\2\u0114\u0115\5B\"\2\u0115\u0116"+
		"\7\b\2\2\u0116\u0119\3\2\2\2\u0117\u0119\5,\27\2\u0118\u0112\3\2\2\2\u0118"+
		"\u0117\3\2\2\2\u0119A\3\2\2\2\u011a\u011d\5D#\2\u011b\u011d\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011dC\3\2\2\2\u011e\u011f\b#\1\2\u011f"+
		"\u0120\5\62\32\2\u0120\u0126\3\2\2\2\u0121\u0122\f\3\2\2\u0122\u0123\7"+
		"\6\2\2\u0123\u0125\5\62\32\2\u0124\u0121\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127E\3\2\2\2\u0128\u0126\3\2\2\2"+
		"\31M^io~\u008b\u009a\u00a3\u00af\u00b1\u00c6\u00d2\u00d8\u00e3\u00e9\u00ef"+
		"\u00f5\u00fb\u0101\u0110\u0118\u011c\u0126";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}