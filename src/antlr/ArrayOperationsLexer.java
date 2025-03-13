// Generated from /home/damien/Documents/Dev/Analyse_Syntaxique/ArrayOperation_Project/src/antlr/ArrayOperations.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ArrayOperationsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT=6, SUM=7, PROD=8, MAX=9, MIN=10, 
		SORT=11, ARRAY_TYPE=12, INT_TYPE=13, PRINT=14, READ=15, ID=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "INT", "SUM", "PROD", "MAX", 
			"MIN", "SORT", "ARRAY_TYPE", "INT_TYPE", "PRINT", "READ", "ID", "WS"
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


	public ArrayOperationsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ArrayOperations.g4"; }

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

	public static final String _serializedATN =
		"\u0004\u0000\u0011p\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u00051\b"+
		"\u0005\n\u0005\f\u00054\t\u0005\u0003\u00056\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0005\u000fe\b\u000f\n\u000f\f\u000fh\t\u000f\u0001\u0010\u0004\u0010"+
		"k\b\u0010\u000b\u0010\f\u0010l\u0001\u0010\u0001\u0010\u0000\u0000\u0011"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0005\u0001\u000019\u0001"+
		"\u000009\u0001\u0000az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  s\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000"+
		"\u0000\u0005\'\u0001\u0000\u0000\u0000\u0007)\u0001\u0000\u0000\u0000"+
		"\t+\u0001\u0000\u0000\u0000\u000b5\u0001\u0000\u0000\u0000\r7\u0001\u0000"+
		"\u0000\u0000\u000f;\u0001\u0000\u0000\u0000\u0011@\u0001\u0000\u0000\u0000"+
		"\u0013D\u0001\u0000\u0000\u0000\u0015H\u0001\u0000\u0000\u0000\u0017M"+
		"\u0001\u0000\u0000\u0000\u0019S\u0001\u0000\u0000\u0000\u001bW\u0001\u0000"+
		"\u0000\u0000\u001d]\u0001\u0000\u0000\u0000\u001fb\u0001\u0000\u0000\u0000"+
		"!j\u0001\u0000\u0000\u0000#$\u0005;\u0000\u0000$\u0002\u0001\u0000\u0000"+
		"\u0000%&\u0005=\u0000\u0000&\u0004\u0001\u0000\u0000\u0000\'(\u0005[\u0000"+
		"\u0000(\u0006\u0001\u0000\u0000\u0000)*\u0005,\u0000\u0000*\b\u0001\u0000"+
		"\u0000\u0000+,\u0005]\u0000\u0000,\n\u0001\u0000\u0000\u0000-6\u00050"+
		"\u0000\u0000.2\u0007\u0000\u0000\u0000/1\u0007\u0001\u0000\u00000/\u0001"+
		"\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u0000"+
		"23\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000"+
		"\u00005-\u0001\u0000\u0000\u00005.\u0001\u0000\u0000\u00006\f\u0001\u0000"+
		"\u0000\u000078\u0005s\u0000\u000089\u0005u\u0000\u00009:\u0005m\u0000"+
		"\u0000:\u000e\u0001\u0000\u0000\u0000;<\u0005p\u0000\u0000<=\u0005r\u0000"+
		"\u0000=>\u0005o\u0000\u0000>?\u0005d\u0000\u0000?\u0010\u0001\u0000\u0000"+
		"\u0000@A\u0005m\u0000\u0000AB\u0005a\u0000\u0000BC\u0005x\u0000\u0000"+
		"C\u0012\u0001\u0000\u0000\u0000DE\u0005m\u0000\u0000EF\u0005i\u0000\u0000"+
		"FG\u0005n\u0000\u0000G\u0014\u0001\u0000\u0000\u0000HI\u0005s\u0000\u0000"+
		"IJ\u0005o\u0000\u0000JK\u0005r\u0000\u0000KL\u0005t\u0000\u0000L\u0016"+
		"\u0001\u0000\u0000\u0000MN\u0005a\u0000\u0000NO\u0005r\u0000\u0000OP\u0005"+
		"r\u0000\u0000PQ\u0005a\u0000\u0000QR\u0005y\u0000\u0000R\u0018\u0001\u0000"+
		"\u0000\u0000ST\u0005i\u0000\u0000TU\u0005n\u0000\u0000UV\u0005t\u0000"+
		"\u0000V\u001a\u0001\u0000\u0000\u0000WX\u0005p\u0000\u0000XY\u0005r\u0000"+
		"\u0000YZ\u0005i\u0000\u0000Z[\u0005n\u0000\u0000[\\\u0005t\u0000\u0000"+
		"\\\u001c\u0001\u0000\u0000\u0000]^\u0005r\u0000\u0000^_\u0005e\u0000\u0000"+
		"_`\u0005a\u0000\u0000`a\u0005d\u0000\u0000a\u001e\u0001\u0000\u0000\u0000"+
		"bf\u0007\u0002\u0000\u0000ce\u0007\u0003\u0000\u0000dc\u0001\u0000\u0000"+
		"\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000g \u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ik\u0007"+
		"\u0004\u0000\u0000ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000no\u0006\u0010\u0000\u0000o\"\u0001\u0000\u0000\u0000\u0005\u0000"+
		"25fl\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}