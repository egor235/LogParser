// Generated from C:/Documents and Settings/eg/Рабочий стол/LogParser/src\LogRead.g4 by ANTLR 4.7
package com.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogReadParser}.
 */
public interface LogReadListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogReadParser#proc}.
	 * @param ctx the parse tree
	 */
	void enterProc(LogReadParser.ProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogReadParser#proc}.
	 * @param ctx the parse tree
	 */
	void exitProc(LogReadParser.ProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogReadParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(LogReadParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogReadParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(LogReadParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogReadParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(LogReadParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogReadParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(LogReadParser.UnaryOperatorContext ctx);
}