// Generated from E:/ite-fourth-year/compilers/projects/sql-compiler/src/com/sqlcompiler/antlr\Hplsql.g4 by ANTLR 4.7.2
package com.sqlcompiler.java;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HplsqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HplsqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HplsqlParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(HplsqlParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#begin_end_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_end_block(HplsqlParser.Begin_end_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#single_block_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_block_stmt(HplsqlParser.Single_block_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#block_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_end(HplsqlParser.Block_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#proc_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_block(HplsqlParser.Proc_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(HplsqlParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#error_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_stmt(HplsqlParser.Error_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#invalid_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalid_select(HplsqlParser.Invalid_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#invalid_where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalid_where_clause(HplsqlParser.Invalid_where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#invalid_from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalid_from_clause(HplsqlParser.Invalid_from_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#invalid_bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalid_bool_expr(HplsqlParser.Invalid_bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#invalid_bool_expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalid_bool_expr_atom(HplsqlParser.Invalid_bool_expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#invalid_bool_expr_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalid_bool_expr_binary(HplsqlParser.Invalid_bool_expr_binaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#invalid_bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalid_bool_expr_binary_operator(HplsqlParser.Invalid_bool_expr_binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#invalid_cpp_function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalid_cpp_function_stmt(HplsqlParser.Invalid_cpp_function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#invalid_cpp_function_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalid_cpp_function_header(HplsqlParser.Invalid_cpp_function_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#invalid_cpp_function_params_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalid_cpp_function_params_clause(HplsqlParser.Invalid_cpp_function_params_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#invalid_cpp_function_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalid_cpp_function_param(HplsqlParser.Invalid_cpp_function_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#exception_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block(HplsqlParser.Exception_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#exception_block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block_item(HplsqlParser.Exception_block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon_stmt(HplsqlParser.Semicolon_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#null_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_stmt(HplsqlParser.Null_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(HplsqlParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(HplsqlParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_item(HplsqlParser.Assignment_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_single_item(HplsqlParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_multiple_item(HplsqlParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_select_item(HplsqlParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociate_locator_stmt(HplsqlParser.Associate_locator_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(HplsqlParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_stmt(HplsqlParser.Call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#close_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_stmt(HplsqlParser.Close_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#declare_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt(HplsqlParser.Declare_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#declare_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block(HplsqlParser.Declare_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block_inplace(HplsqlParser.Declare_block_inplaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt_item(HplsqlParser.Declare_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#declare_var_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_var_item(HplsqlParser.Declare_var_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#declare_condition_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_condition_item(HplsqlParser.Declare_condition_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#declare_handler_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_handler_item(HplsqlParser.Declare_handler_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_type_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type_stmt(HplsqlParser.Create_type_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type_definition(HplsqlParser.Create_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_type_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type_items(HplsqlParser.Create_type_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_type_items_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type_items_item(HplsqlParser.Create_type_items_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_temporary_table_item(HplsqlParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(HplsqlParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_local_temp_table_stmt(HplsqlParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_definition(HplsqlParser.Create_table_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns(HplsqlParser.Create_table_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns_item(HplsqlParser.Create_table_columns_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(HplsqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_inline_cons(HplsqlParser.Create_table_column_inline_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_cons(HplsqlParser.Create_table_column_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_fk_action(HplsqlParser.Create_table_fk_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions(HplsqlParser.Create_table_preoptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_item(HplsqlParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_td_item(HplsqlParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options(HplsqlParser.Create_table_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_item(HplsqlParser.Create_table_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_ora_item(HplsqlParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_db2_item(HplsqlParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_td_item(HplsqlParser.Create_table_options_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_hive_item(HplsqlParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format(HplsqlParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format_fields(HplsqlParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mssql_item(HplsqlParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mysql_item(HplsqlParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype(HplsqlParser.DtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#dtype_len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_len(HplsqlParser.Dtype_lenContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#dtype_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_attr(HplsqlParser.Dtype_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#dtype_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_default(HplsqlParser.Dtype_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_database_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_stmt(HplsqlParser.Create_database_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_database_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_option(HplsqlParser.Create_database_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_stmt(HplsqlParser.Create_function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_function_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_return(HplsqlParser.Create_function_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_stmt(HplsqlParser.Create_package_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#package_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec(HplsqlParser.Package_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#package_spec_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec_item(HplsqlParser.Package_spec_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_body_stmt(HplsqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body(HplsqlParser.Package_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#package_body_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body_item(HplsqlParser.Package_body_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure_stmt(HplsqlParser.Create_procedure_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_routine_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_params(HplsqlParser.Create_routine_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_param_item(HplsqlParser.Create_routine_param_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_routine_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_options(HplsqlParser.Create_routine_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_routine_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_option(HplsqlParser.Create_routine_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#exec_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_stmt(HplsqlParser.Exec_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(HplsqlParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_plsql_stmt(HplsqlParser.If_plsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_tsql_stmt(HplsqlParser.If_tsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_bteq_stmt(HplsqlParser.If_bteq_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#elseif_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_block(HplsqlParser.Elseif_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(HplsqlParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_stmt(HplsqlParser.Exit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#leave_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeave_stmt(HplsqlParser.Leave_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cmp_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_stmt(HplsqlParser.Cmp_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cmp_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_source(HplsqlParser.Cmp_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(HplsqlParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#create_index_col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_col(HplsqlParser.Create_index_colContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#index_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_storage_clause(HplsqlParser.Index_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_mssql_storage_clause(HplsqlParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#quit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuit_stmt(HplsqlParser.Quit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(HplsqlParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_stmt(HplsqlParser.Cpp_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_function_stmt(HplsqlParser.Cpp_function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_function_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_function_header(HplsqlParser.Cpp_function_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_function_params_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_function_params_clause(HplsqlParser.Cpp_function_params_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_function_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_function_param(HplsqlParser.Cpp_function_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_function_body(HplsqlParser.Cpp_function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_if_stmt(HplsqlParser.Cpp_if_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_elseif_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_elseif_clause(HplsqlParser.Cpp_elseif_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_else_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_else_clause(HplsqlParser.Cpp_else_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_for_stmt(HplsqlParser.Cpp_for_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_for_stmt_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_for_stmt_header(HplsqlParser.Cpp_for_stmt_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_for_params_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_for_params_clause(HplsqlParser.Cpp_for_params_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_for_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_for_param(HplsqlParser.Cpp_for_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_for_stmt_var_incr_caluse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_for_stmt_var_incr_caluse(HplsqlParser.Cpp_for_stmt_var_incr_caluseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_for_stmt_var_incr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_for_stmt_var_incr(HplsqlParser.Cpp_for_stmt_var_incrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_for_stmt_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_for_stmt_body(HplsqlParser.Cpp_for_stmt_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_declare_assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_declare_assignment_stmt(HplsqlParser.Cpp_declare_assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_declare_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_declare_stmt(HplsqlParser.Cpp_declare_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_assignment_stmt(HplsqlParser.Cpp_assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_return_stmt(HplsqlParser.Cpp_return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cpp_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_scope(HplsqlParser.Cpp_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(HplsqlParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#for_range_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_range_stmt(HplsqlParser.For_range_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(HplsqlParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(HplsqlParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(HplsqlParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt(HplsqlParser.Fullselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt_item(HplsqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_set_clause(HplsqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubselect_stmt(HplsqlParser.Subselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(HplsqlParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_list_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_set(HplsqlParser.Select_list_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_limit(HplsqlParser.Select_list_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_item(HplsqlParser.Select_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_alias(HplsqlParser.Select_list_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_asterisk(HplsqlParser.Select_list_asteriskContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(HplsqlParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(HplsqlParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_clause(HplsqlParser.From_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_name_clause(HplsqlParser.From_table_name_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_subselect_clause(HplsqlParser.From_subselect_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_clause(HplsqlParser.From_join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_type_clause(HplsqlParser.From_join_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_clause(HplsqlParser.From_table_values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_row(HplsqlParser.From_table_values_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_alias_clause(HplsqlParser.From_alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(HplsqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(HplsqlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(HplsqlParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(HplsqlParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualify_clause(HplsqlParser.Qualify_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(HplsqlParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options(HplsqlParser.Select_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options_item(HplsqlParser.Select_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(HplsqlParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_atom(HplsqlParser.Bool_expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_unary(HplsqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_single_in(HplsqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_multi_in(HplsqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary(HplsqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_logical_operator(HplsqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary_operator(HplsqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HplsqlParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_atom(HplsqlParser.Expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_interval(HplsqlParser.Expr_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#interval_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_item(HplsqlParser.Interval_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat(HplsqlParser.Expr_concatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat_item(HplsqlParser.Expr_concat_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case(HplsqlParser.Expr_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_simple(HplsqlParser.Expr_case_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_searched(HplsqlParser.Expr_case_searchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_cursor_attribute(HplsqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_agg_window_func(HplsqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_all_distinct(HplsqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_over_clause(HplsqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_partition_by_clause(HplsqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_spec_func(HplsqlParser.Expr_spec_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func(HplsqlParser.Expr_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_params(HplsqlParser.Expr_func_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#func_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_param(HplsqlParser.Func_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#write_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_stmt(HplsqlParser.Write_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#write_stmt_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_stmt_string(HplsqlParser.Write_stmt_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#date_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_literal(HplsqlParser.Date_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_literal(HplsqlParser.Timestamp_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(HplsqlParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link HplsqlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_quotedString(HplsqlParser.Double_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link HplsqlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_quotedString(HplsqlParser.Single_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#int_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_number(HplsqlParser.Int_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#dec_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_number(HplsqlParser.Dec_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(HplsqlParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#null_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_const(HplsqlParser.Null_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#new_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_line(HplsqlParser.New_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_reserved_words(HplsqlParser.Non_reserved_wordsContext ctx);
}