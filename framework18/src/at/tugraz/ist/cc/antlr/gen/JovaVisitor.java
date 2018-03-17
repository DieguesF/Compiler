// Generated from Jova.g4 by ANTLR 4.5

	package at.tugraz.ist.cc.antlr.gen; 

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JovaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JovaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JovaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JovaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JovaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#class_decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_decls(JovaParser.Class_declsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#class_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_decl(JovaParser.Class_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#class_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_head(JovaParser.Class_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(JovaParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#member_decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_decls(JovaParser.Member_declsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#member_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_decl(JovaParser.Member_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(JovaParser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#method_decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_decls(JovaParser.Method_declsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#method_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_decl(JovaParser.Method_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#method_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_head(JovaParser.Method_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(JovaParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(JovaParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#method_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_body(JovaParser.Method_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(JovaParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(JovaParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#ret_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet_stmt(JovaParser.Ret_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(JovaParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(JovaParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JovaParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#member_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_access(JovaParser.Member_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#object_alloc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_alloc(JovaParser.Object_allocContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(JovaParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(JovaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#expr_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_or(JovaParser.Expr_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#expr_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_and(JovaParser.Expr_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#expr_relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_relop(JovaParser.Expr_relopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#expr_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_sign(JovaParser.Expr_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#expr_mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_mulop(JovaParser.Expr_mulopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(JovaParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#id_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_operand(JovaParser.Id_operandContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_list(JovaParser.Arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(JovaParser.ArgsContext ctx);
}