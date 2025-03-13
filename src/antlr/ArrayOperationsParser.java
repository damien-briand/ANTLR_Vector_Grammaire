// Generated from /home/damien/Documents/Dev/Analyse_Syntaxique/ArrayOperation_Project/src/antlr/ArrayOperations.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ArrayOperationsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT=6, SUM=7, PROD=8, MAX=9, MIN=10, 
		SORT=11, ARRAY_TYPE=12, INT_TYPE=13, PRINT=14, READ=15, ID=16, WS=17;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_simpleop = 2, RULE_vardecl = 3, 
		RULE_affectation = 4, RULE_varout = 5, RULE_varin = 6, RULE_array = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "simpleop", "vardecl", "affectation", "varout", 
			"varin", "array"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'['", "','", "']'", null, "'sum'", "'prod'", "'max'", 
			"'min'", "'sort'", "'array'", "'int'", "'print'", "'read'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "INT", "SUM", "PROD", "MAX", "MIN", 
			"SORT", "ARRAY_TYPE", "INT_TYPE", "PRINT", "READ", "ID", "WS"
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
	public String getGrammarFileName() { return "ArrayOperations.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArrayOperationsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ArrayOperationsParser.EOF, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				instruction();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 130944L) != 0) );
			setState(21);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VardeclinstructionContext extends InstructionContext {
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public VardeclinstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitVardeclinstruction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AffectationinstructionContext extends InstructionContext {
		public AffectationContext affectation() {
			return getRuleContext(AffectationContext.class,0);
		}
		public AffectationinstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitAffectationinstruction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarininstructionContext extends InstructionContext {
		public VarinContext varin() {
			return getRuleContext(VarinContext.class,0);
		}
		public VarininstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitVarininstruction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleopinstructionContext extends InstructionContext {
		public SimpleopContext simpleop() {
			return getRuleContext(SimpleopContext.class,0);
		}
		public SimpleopinstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitSimpleopinstruction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VaroutinstructionContext extends InstructionContext {
		public VaroutContext varout() {
			return getRuleContext(VaroutContext.class,0);
		}
		public VaroutinstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitVaroutinstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUM:
			case PROD:
			case MAX:
			case MIN:
			case SORT:
				_localctx = new SimpleopinstructionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				simpleop();
				}
				break;
			case ARRAY_TYPE:
			case INT_TYPE:
				_localctx = new VardeclinstructionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				vardecl();
				}
				break;
			case ID:
				_localctx = new AffectationinstructionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				affectation();
				}
				break;
			case PRINT:
				_localctx = new VaroutinstructionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				varout();
				}
				break;
			case READ:
				_localctx = new VarininstructionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(27);
				varin();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleopContext extends ParserRuleContext {
		public SimpleopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleop; }
	 
		public SimpleopContext() { }
		public void copyFrom(SimpleopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProdContext extends SimpleopContext {
		public TerminalNode PROD() { return getToken(ArrayOperationsParser.PROD, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ProdContext(SimpleopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitProd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinContext extends SimpleopContext {
		public TerminalNode MIN() { return getToken(ArrayOperationsParser.MIN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public MinContext(SimpleopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitMin(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MaxContext extends SimpleopContext {
		public TerminalNode MAX() { return getToken(ArrayOperationsParser.MAX, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public MaxContext(SimpleopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitMax(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumContext extends SimpleopContext {
		public TerminalNode SUM() { return getToken(ArrayOperationsParser.SUM, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public SumContext(SimpleopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SortContext extends SimpleopContext {
		public TerminalNode SORT() { return getToken(ArrayOperationsParser.SORT, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public SortContext(SimpleopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitSort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleopContext simpleop() throws RecognitionException {
		SimpleopContext _localctx = new SimpleopContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleop);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUM:
				_localctx = new SumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(SUM);
				setState(31);
				array();
				setState(32);
				match(T__0);
				}
				break;
			case PROD:
				_localctx = new ProdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(PROD);
				setState(35);
				array();
				setState(36);
				match(T__0);
				}
				break;
			case MAX:
				_localctx = new MaxContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(MAX);
				setState(39);
				array();
				setState(40);
				match(T__0);
				}
				break;
			case MIN:
				_localctx = new MinContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(MIN);
				setState(43);
				array();
				setState(44);
				match(T__0);
				}
				break;
			case SORT:
				_localctx = new SortContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				match(SORT);
				setState(47);
				array();
				setState(48);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VardeclContext extends ParserRuleContext {
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
	 
		public VardeclContext() { }
		public void copyFrom(VardeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarintContext extends VardeclContext {
		public TerminalNode INT_TYPE() { return getToken(ArrayOperationsParser.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(ArrayOperationsParser.ID, 0); }
		public VarintContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitVarint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InitvarintContext extends VardeclContext {
		public TerminalNode INT_TYPE() { return getToken(ArrayOperationsParser.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(ArrayOperationsParser.ID, 0); }
		public TerminalNode INT() { return getToken(ArrayOperationsParser.INT, 0); }
		public InitvarintContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitInitvarint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InitvararrayvarContext extends VardeclContext {
		public TerminalNode ARRAY_TYPE() { return getToken(ArrayOperationsParser.ARRAY_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(ArrayOperationsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ArrayOperationsParser.ID, i);
		}
		public InitvararrayvarContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitInitvararrayvar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InitvaropContext extends VardeclContext {
		public TerminalNode INT_TYPE() { return getToken(ArrayOperationsParser.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(ArrayOperationsParser.ID, 0); }
		public SimpleopContext simpleop() {
			return getRuleContext(SimpleopContext.class,0);
		}
		public InitvaropContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitInitvarop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InitvararrayopContext extends VardeclContext {
		public TerminalNode ARRAY_TYPE() { return getToken(ArrayOperationsParser.ARRAY_TYPE, 0); }
		public TerminalNode ID() { return getToken(ArrayOperationsParser.ID, 0); }
		public SimpleopContext simpleop() {
			return getRuleContext(SimpleopContext.class,0);
		}
		public InitvararrayopContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitInitvararrayop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InitvararrayContext extends VardeclContext {
		public TerminalNode ARRAY_TYPE() { return getToken(ArrayOperationsParser.ARRAY_TYPE, 0); }
		public TerminalNode ID() { return getToken(ArrayOperationsParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public InitvararrayContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitInitvararray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InitvarvarContext extends VardeclContext {
		public TerminalNode INT_TYPE() { return getToken(ArrayOperationsParser.INT_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(ArrayOperationsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ArrayOperationsParser.ID, i);
		}
		public InitvarvarContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitInitvarvar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VararrayContext extends VardeclContext {
		public TerminalNode ARRAY_TYPE() { return getToken(ArrayOperationsParser.ARRAY_TYPE, 0); }
		public TerminalNode ID() { return getToken(ArrayOperationsParser.ID, 0); }
		public VararrayContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitVararray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardecl);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new VararrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(ARRAY_TYPE);
				setState(53);
				match(ID);
				setState(54);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new InitvararrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(ARRAY_TYPE);
				setState(56);
				match(ID);
				setState(57);
				match(T__1);
				setState(58);
				array();
				setState(59);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new VarintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(INT_TYPE);
				setState(62);
				match(ID);
				setState(63);
				match(T__0);
				}
				break;
			case 4:
				_localctx = new InitvarintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				match(INT_TYPE);
				setState(65);
				match(ID);
				setState(66);
				match(T__1);
				setState(67);
				match(INT);
				setState(68);
				match(T__0);
				}
				break;
			case 5:
				_localctx = new InitvarvarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				match(INT_TYPE);
				setState(70);
				match(ID);
				setState(71);
				match(T__1);
				setState(72);
				match(ID);
				setState(73);
				match(T__0);
				}
				break;
			case 6:
				_localctx = new InitvararrayvarContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				match(ARRAY_TYPE);
				setState(75);
				match(ID);
				setState(76);
				match(T__1);
				setState(77);
				match(ID);
				setState(78);
				match(T__0);
				}
				break;
			case 7:
				_localctx = new InitvaropContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				match(INT_TYPE);
				setState(80);
				match(ID);
				setState(81);
				match(T__1);
				setState(82);
				simpleop();
				}
				break;
			case 8:
				_localctx = new InitvararrayopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(83);
				match(ARRAY_TYPE);
				setState(84);
				match(ID);
				setState(85);
				match(T__1);
				setState(86);
				simpleop();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AffectationContext extends ParserRuleContext {
		public AffectationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectation; }
	 
		public AffectationContext() { }
		public void copyFrom(AffectationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AffectsimpleopContext extends AffectationContext {
		public TerminalNode ID() { return getToken(ArrayOperationsParser.ID, 0); }
		public SimpleopContext simpleop() {
			return getRuleContext(SimpleopContext.class,0);
		}
		public AffectsimpleopContext(AffectationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitAffectsimpleop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AffectvarContext extends AffectationContext {
		public List<TerminalNode> ID() { return getTokens(ArrayOperationsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ArrayOperationsParser.ID, i);
		}
		public AffectvarContext(AffectationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitAffectvar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AffectarrayContext extends AffectationContext {
		public TerminalNode ID() { return getToken(ArrayOperationsParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public AffectarrayContext(AffectationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitAffectarray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AffectintContext extends AffectationContext {
		public TerminalNode ID() { return getToken(ArrayOperationsParser.ID, 0); }
		public TerminalNode INT() { return getToken(ArrayOperationsParser.INT, 0); }
		public AffectintContext(AffectationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitAffectint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffectationContext affectation() throws RecognitionException {
		AffectationContext _localctx = new AffectationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_affectation);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new AffectsimpleopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(ID);
				setState(90);
				match(T__1);
				setState(91);
				simpleop();
				}
				break;
			case 2:
				_localctx = new AffectarrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(ID);
				setState(93);
				match(T__1);
				setState(94);
				array();
				setState(95);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new AffectintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(ID);
				setState(98);
				match(T__1);
				setState(99);
				match(INT);
				setState(100);
				match(T__0);
				}
				break;
			case 4:
				_localctx = new AffectvarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(ID);
				setState(102);
				match(T__1);
				setState(103);
				match(ID);
				setState(104);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VaroutContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ArrayOperationsParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(ArrayOperationsParser.ID, 0); }
		public VaroutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varout; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitVarout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VaroutContext varout() throws RecognitionException {
		VaroutContext _localctx = new VaroutContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(PRINT);
			setState(108);
			match(ID);
			setState(109);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarinContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(ArrayOperationsParser.READ, 0); }
		public TerminalNode ID() { return getToken(ArrayOperationsParser.ID, 0); }
		public VarinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitVarin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarinContext varin() throws RecognitionException {
		VarinContext _localctx = new VarinContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(READ);
			setState(112);
			match(ID);
			setState(113);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(ArrayOperationsParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ArrayOperationsParser.INT, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrayOperationsVisitor ) return ((ArrayOperationsVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__2);
			setState(116);
			match(INT);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(117);
				match(T__3);
				setState(118);
				match(INT);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(T__4);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0011\u007f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0001\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u001d\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00023\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003X\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004j\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007x\b\u0007\n\u0007\f\u0007{\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0000\u0000\u008a\u0000\u0011\u0001\u0000\u0000\u0000\u0002"+
		"\u001c\u0001\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000\u0006W\u0001"+
		"\u0000\u0000\u0000\bi\u0001\u0000\u0000\u0000\nk\u0001\u0000\u0000\u0000"+
		"\fo\u0001\u0000\u0000\u0000\u000es\u0001\u0000\u0000\u0000\u0010\u0012"+
		"\u0003\u0002\u0001\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0005\u0000\u0000\u0001\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u001d"+
		"\u0003\u0004\u0002\u0000\u0018\u001d\u0003\u0006\u0003\u0000\u0019\u001d"+
		"\u0003\b\u0004\u0000\u001a\u001d\u0003\n\u0005\u0000\u001b\u001d\u0003"+
		"\f\u0006\u0000\u001c\u0017\u0001\u0000\u0000\u0000\u001c\u0018\u0001\u0000"+
		"\u0000\u0000\u001c\u0019\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u0003\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0005\u0007\u0000\u0000\u001f \u0003\u000e\u0007"+
		"\u0000 !\u0005\u0001\u0000\u0000!3\u0001\u0000\u0000\u0000\"#\u0005\b"+
		"\u0000\u0000#$\u0003\u000e\u0007\u0000$%\u0005\u0001\u0000\u0000%3\u0001"+
		"\u0000\u0000\u0000&\'\u0005\t\u0000\u0000\'(\u0003\u000e\u0007\u0000("+
		")\u0005\u0001\u0000\u0000)3\u0001\u0000\u0000\u0000*+\u0005\n\u0000\u0000"+
		"+,\u0003\u000e\u0007\u0000,-\u0005\u0001\u0000\u0000-3\u0001\u0000\u0000"+
		"\u0000./\u0005\u000b\u0000\u0000/0\u0003\u000e\u0007\u000001\u0005\u0001"+
		"\u0000\u000013\u0001\u0000\u0000\u00002\u001e\u0001\u0000\u0000\u0000"+
		"2\"\u0001\u0000\u0000\u00002&\u0001\u0000\u0000\u00002*\u0001\u0000\u0000"+
		"\u00002.\u0001\u0000\u0000\u00003\u0005\u0001\u0000\u0000\u000045\u0005"+
		"\f\u0000\u000056\u0005\u0010\u0000\u00006X\u0005\u0001\u0000\u000078\u0005"+
		"\f\u0000\u000089\u0005\u0010\u0000\u00009:\u0005\u0002\u0000\u0000:;\u0003"+
		"\u000e\u0007\u0000;<\u0005\u0001\u0000\u0000<X\u0001\u0000\u0000\u0000"+
		"=>\u0005\r\u0000\u0000>?\u0005\u0010\u0000\u0000?X\u0005\u0001\u0000\u0000"+
		"@A\u0005\r\u0000\u0000AB\u0005\u0010\u0000\u0000BC\u0005\u0002\u0000\u0000"+
		"CD\u0005\u0006\u0000\u0000DX\u0005\u0001\u0000\u0000EF\u0005\r\u0000\u0000"+
		"FG\u0005\u0010\u0000\u0000GH\u0005\u0002\u0000\u0000HI\u0005\u0010\u0000"+
		"\u0000IX\u0005\u0001\u0000\u0000JK\u0005\f\u0000\u0000KL\u0005\u0010\u0000"+
		"\u0000LM\u0005\u0002\u0000\u0000MN\u0005\u0010\u0000\u0000NX\u0005\u0001"+
		"\u0000\u0000OP\u0005\r\u0000\u0000PQ\u0005\u0010\u0000\u0000QR\u0005\u0002"+
		"\u0000\u0000RX\u0003\u0004\u0002\u0000ST\u0005\f\u0000\u0000TU\u0005\u0010"+
		"\u0000\u0000UV\u0005\u0002\u0000\u0000VX\u0003\u0004\u0002\u0000W4\u0001"+
		"\u0000\u0000\u0000W7\u0001\u0000\u0000\u0000W=\u0001\u0000\u0000\u0000"+
		"W@\u0001\u0000\u0000\u0000WE\u0001\u0000\u0000\u0000WJ\u0001\u0000\u0000"+
		"\u0000WO\u0001\u0000\u0000\u0000WS\u0001\u0000\u0000\u0000X\u0007\u0001"+
		"\u0000\u0000\u0000YZ\u0005\u0010\u0000\u0000Z[\u0005\u0002\u0000\u0000"+
		"[j\u0003\u0004\u0002\u0000\\]\u0005\u0010\u0000\u0000]^\u0005\u0002\u0000"+
		"\u0000^_\u0003\u000e\u0007\u0000_`\u0005\u0001\u0000\u0000`j\u0001\u0000"+
		"\u0000\u0000ab\u0005\u0010\u0000\u0000bc\u0005\u0002\u0000\u0000cd\u0005"+
		"\u0006\u0000\u0000dj\u0005\u0001\u0000\u0000ef\u0005\u0010\u0000\u0000"+
		"fg\u0005\u0002\u0000\u0000gh\u0005\u0010\u0000\u0000hj\u0005\u0001\u0000"+
		"\u0000iY\u0001\u0000\u0000\u0000i\\\u0001\u0000\u0000\u0000ia\u0001\u0000"+
		"\u0000\u0000ie\u0001\u0000\u0000\u0000j\t\u0001\u0000\u0000\u0000kl\u0005"+
		"\u000e\u0000\u0000lm\u0005\u0010\u0000\u0000mn\u0005\u0001\u0000\u0000"+
		"n\u000b\u0001\u0000\u0000\u0000op\u0005\u000f\u0000\u0000pq\u0005\u0010"+
		"\u0000\u0000qr\u0005\u0001\u0000\u0000r\r\u0001\u0000\u0000\u0000st\u0005"+
		"\u0003\u0000\u0000ty\u0005\u0006\u0000\u0000uv\u0005\u0004\u0000\u0000"+
		"vx\u0005\u0006\u0000\u0000wu\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\u0005\u0000\u0000}\u000f"+
		"\u0001\u0000\u0000\u0000\u0006\u0013\u001c2Wiy";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}