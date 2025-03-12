// Generated from /home/damien/Documents/Dev/Analyse_Syntaxique/ArrayOperation_Project/src/antlr/ArrayOperations.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArraydoperationsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArraydoperationsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArraydoperationsParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ArraydoperationsParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleopinstruction}
	 * labeled alternative in {@link ArraydoperationsParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleopinstruction(ArraydoperationsParser.SimpleopinstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vardeclinstruction}
	 * labeled alternative in {@link ArraydoperationsParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardeclinstruction(ArraydoperationsParser.VardeclinstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectationinstruction}
	 * labeled alternative in {@link ArraydoperationsParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectationinstruction(ArraydoperationsParser.AffectationinstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varoutinstruction}
	 * labeled alternative in {@link ArraydoperationsParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVaroutinstruction(ArraydoperationsParser.VaroutinstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sum}
	 * labeled alternative in {@link ArraydoperationsParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(ArraydoperationsParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prod}
	 * labeled alternative in {@link ArraydoperationsParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProd(ArraydoperationsParser.ProdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code max}
	 * labeled alternative in {@link ArraydoperationsParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax(ArraydoperationsParser.MaxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code min}
	 * labeled alternative in {@link ArraydoperationsParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMin(ArraydoperationsParser.MinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sort}
	 * labeled alternative in {@link ArraydoperationsParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort(ArraydoperationsParser.SortContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vararray}
	 * labeled alternative in {@link ArraydoperationsParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVararray(ArraydoperationsParser.VararrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initvararray}
	 * labeled alternative in {@link ArraydoperationsParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitvararray(ArraydoperationsParser.InitvararrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varint}
	 * labeled alternative in {@link ArraydoperationsParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarint(ArraydoperationsParser.VarintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initvarint}
	 * labeled alternative in {@link ArraydoperationsParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitvarint(ArraydoperationsParser.InitvarintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectsimpleop}
	 * labeled alternative in {@link ArraydoperationsParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectsimpleop(ArraydoperationsParser.AffectsimpleopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectarray}
	 * labeled alternative in {@link ArraydoperationsParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectarray(ArraydoperationsParser.AffectarrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectint}
	 * labeled alternative in {@link ArraydoperationsParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectint(ArraydoperationsParser.AffectintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArraydoperationsParser#varout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarout(ArraydoperationsParser.VaroutContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArraydoperationsParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ArraydoperationsParser.ArrayContext ctx);
}