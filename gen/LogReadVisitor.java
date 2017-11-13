// Generated from C:/Documents and Settings/eg/Рабочий стол/LogParser/src/main/java\LogRead.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogReadParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogReadVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogReadParser#proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc(LogReadParser.ProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogReadParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(LogReadParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogReadParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(LogReadParser.UnaryOperatorContext ctx);
}