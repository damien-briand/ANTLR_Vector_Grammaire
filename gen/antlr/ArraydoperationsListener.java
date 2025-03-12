// Generated from /home/damien/Documents/Dev/Analyse_Syntaxique/ArrayOperation_Project/src/antlr/ArrayOperations.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArraydoperationsParser}.
 */
public interface ArraydoperationsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArraydoperationsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ArraydoperationsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArraydoperationsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ArraydoperationsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleopinstruction}
	 * labeled alternative in {@link ArraydoperationsParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSimpleopinstruction(ArraydoperationsParser.SimpleopinstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleopinstruction}
	 * labeled alternative in {@link ArraydoperationsParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSimpleopinstruction(ArraydoperationsParser.SimpleopinstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vardeclinstruction}
	 * labeled alternative in {@link ArraydoperationsParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterVardeclinstruction(ArraydoperationsParser.VardeclinstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vardeclinstruction}
	 * labeled alternative in {@link ArraydoperationsParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitVardeclinstruction(ArraydoperationsParser.VardeclinstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectationinstruction}
	 * labeled alternative in {@link ArraydoperationsParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAffectationinstruction(ArraydoperationsParser.AffectationinstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectationinstruction}
	 * labeled alternative in {@link ArraydoperationsParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAffectationinstruction(ArraydoperationsParser.AffectationinstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varoutinstruction}
	 * labeled alternative in {@link ArraydoperationsParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterVaroutinstruction(ArraydoperationsParser.VaroutinstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varoutinstruction}
	 * labeled alternative in {@link ArraydoperationsParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitVaroutinstruction(ArraydoperationsParser.VaroutinstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sum}
	 * labeled alternative in {@link ArraydoperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterSum(ArraydoperationsParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sum}
	 * labeled alternative in {@link ArraydoperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitSum(ArraydoperationsParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prod}
	 * labeled alternative in {@link ArraydoperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterProd(ArraydoperationsParser.ProdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prod}
	 * labeled alternative in {@link ArraydoperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitProd(ArraydoperationsParser.ProdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code max}
	 * labeled alternative in {@link ArraydoperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterMax(ArraydoperationsParser.MaxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code max}
	 * labeled alternative in {@link ArraydoperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitMax(ArraydoperationsParser.MaxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code min}
	 * labeled alternative in {@link ArraydoperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterMin(ArraydoperationsParser.MinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code min}
	 * labeled alternative in {@link ArraydoperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitMin(ArraydoperationsParser.MinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sort}
	 * labeled alternative in {@link ArraydoperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterSort(ArraydoperationsParser.SortContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sort}
	 * labeled alternative in {@link ArraydoperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitSort(ArraydoperationsParser.SortContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vararray}
	 * labeled alternative in {@link ArraydoperationsParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVararray(ArraydoperationsParser.VararrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vararray}
	 * labeled alternative in {@link ArraydoperationsParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVararray(ArraydoperationsParser.VararrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initvararray}
	 * labeled alternative in {@link ArraydoperationsParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterInitvararray(ArraydoperationsParser.InitvararrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initvararray}
	 * labeled alternative in {@link ArraydoperationsParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitInitvararray(ArraydoperationsParser.InitvararrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varint}
	 * labeled alternative in {@link ArraydoperationsParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVarint(ArraydoperationsParser.VarintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varint}
	 * labeled alternative in {@link ArraydoperationsParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVarint(ArraydoperationsParser.VarintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initvarint}
	 * labeled alternative in {@link ArraydoperationsParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterInitvarint(ArraydoperationsParser.InitvarintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initvarint}
	 * labeled alternative in {@link ArraydoperationsParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitInitvarint(ArraydoperationsParser.InitvarintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectsimpleop}
	 * labeled alternative in {@link ArraydoperationsParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectsimpleop(ArraydoperationsParser.AffectsimpleopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectsimpleop}
	 * labeled alternative in {@link ArraydoperationsParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectsimpleop(ArraydoperationsParser.AffectsimpleopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectarray}
	 * labeled alternative in {@link ArraydoperationsParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectarray(ArraydoperationsParser.AffectarrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectarray}
	 * labeled alternative in {@link ArraydoperationsParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectarray(ArraydoperationsParser.AffectarrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectint}
	 * labeled alternative in {@link ArraydoperationsParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectint(ArraydoperationsParser.AffectintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectint}
	 * labeled alternative in {@link ArraydoperationsParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectint(ArraydoperationsParser.AffectintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArraydoperationsParser#varout}.
	 * @param ctx the parse tree
	 */
	void enterVarout(ArraydoperationsParser.VaroutContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArraydoperationsParser#varout}.
	 * @param ctx the parse tree
	 */
	void exitVarout(ArraydoperationsParser.VaroutContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArraydoperationsParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ArraydoperationsParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArraydoperationsParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ArraydoperationsParser.ArrayContext ctx);
}