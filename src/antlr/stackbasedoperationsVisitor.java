// Generated from /home/damien/Documents/Dev/Analyse_Syntaxique/ArrayOperation_Project/src/antlr/ArrayOperations.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link stackbasedoperationsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface stackbasedoperationsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link stackbasedoperationsParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(stackbasedoperationsParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleopinstruction}
	 * labeled alternative in {@link stackbasedoperationsParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleopinstruction(stackbasedoperationsParser.SimpleopinstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vardeclinstruction}
	 * labeled alternative in {@link stackbasedoperationsParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardeclinstruction(stackbasedoperationsParser.VardeclinstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectationinstruction}
	 * labeled alternative in {@link stackbasedoperationsParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectationinstruction(stackbasedoperationsParser.AffectationinstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varoutinstruction}
	 * labeled alternative in {@link stackbasedoperationsParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVaroutinstruction(stackbasedoperationsParser.VaroutinstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sum}
	 * labeled alternative in {@link stackbasedoperationsParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(stackbasedoperationsParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prod}
	 * labeled alternative in {@link stackbasedoperationsParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProd(stackbasedoperationsParser.ProdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code max}
	 * labeled alternative in {@link stackbasedoperationsParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax(stackbasedoperationsParser.MaxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code min}
	 * labeled alternative in {@link stackbasedoperationsParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMin(stackbasedoperationsParser.MinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sort}
	 * labeled alternative in {@link stackbasedoperationsParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort(stackbasedoperationsParser.SortContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vararray}
	 * labeled alternative in {@link stackbasedoperationsParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVararray(stackbasedoperationsParser.VararrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initvararray}
	 * labeled alternative in {@link stackbasedoperationsParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitvararray(stackbasedoperationsParser.InitvararrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varint}
	 * labeled alternative in {@link stackbasedoperationsParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarint(stackbasedoperationsParser.VarintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initvarint}
	 * labeled alternative in {@link stackbasedoperationsParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitvarint(stackbasedoperationsParser.InitvarintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectsimpleop}
	 * labeled alternative in {@link stackbasedoperationsParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectsimpleop(stackbasedoperationsParser.AffectsimpleopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectarray}
	 * labeled alternative in {@link stackbasedoperationsParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectarray(stackbasedoperationsParser.AffectarrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectint}
	 * labeled alternative in {@link stackbasedoperationsParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectint(stackbasedoperationsParser.AffectintContext ctx);
	/**
	 * Visit a parse tree produced by {@link stackbasedoperationsParser#varout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarout(stackbasedoperationsParser.VaroutContext ctx);
	/**
	 * Visit a parse tree produced by {@link stackbasedoperationsParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(stackbasedoperationsParser.ArrayContext ctx);
}