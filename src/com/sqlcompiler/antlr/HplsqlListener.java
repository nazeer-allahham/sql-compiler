// Generated from E:/ite-fourth-year/compilers-1/projects/sql-compiler/src/com/sqlcompiler/antlr\Hplsql.g4 by ANTLR 4.7.2
package com.sqlcompiler.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HplsqlParser}.
 */
public interface HplsqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HplsqlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HplsqlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(HplsqlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(HplsqlParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void enterBegin_end_block(HplsqlParser.Begin_end_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void exitBegin_end_block(HplsqlParser.Begin_end_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#single_block_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSingle_block_stmt(HplsqlParser.Single_block_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#single_block_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSingle_block_stmt(HplsqlParser.Single_block_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#block_end}.
	 * @param ctx the parse tree
	 */
	void enterBlock_end(HplsqlParser.Block_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#block_end}.
	 * @param ctx the parse tree
	 */
	void exitBlock_end(HplsqlParser.Block_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#proc_block}.
	 * @param ctx the parse tree
	 */
	void enterProc_block(HplsqlParser.Proc_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#proc_block}.
	 * @param ctx the parse tree
	 */
	void exitProc_block(HplsqlParser.Proc_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(HplsqlParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(HplsqlParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#error_stmt}.
	 * @param ctx the parse tree
	 */
	void enterError_stmt(HplsqlParser.Error_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#error_stmt}.
	 * @param ctx the parse tree
	 */
	void exitError_stmt(HplsqlParser.Error_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#invalid_select}.
	 * @param ctx the parse tree
	 */
	void enterInvalid_select(HplsqlParser.Invalid_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#invalid_select}.
	 * @param ctx the parse tree
	 */
	void exitInvalid_select(HplsqlParser.Invalid_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#invalid_where_clause}.
	 * @param ctx the parse tree
	 */
	void enterInvalid_where_clause(HplsqlParser.Invalid_where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#invalid_where_clause}.
	 * @param ctx the parse tree
	 */
	void exitInvalid_where_clause(HplsqlParser.Invalid_where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#invalid_from_clause}.
	 * @param ctx the parse tree
	 */
	void enterInvalid_from_clause(HplsqlParser.Invalid_from_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#invalid_from_clause}.
	 * @param ctx the parse tree
	 */
	void exitInvalid_from_clause(HplsqlParser.Invalid_from_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#invalid_bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterInvalid_bool_expr(HplsqlParser.Invalid_bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#invalid_bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitInvalid_bool_expr(HplsqlParser.Invalid_bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#invalid_bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterInvalid_bool_expr_atom(HplsqlParser.Invalid_bool_expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#invalid_bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitInvalid_bool_expr_atom(HplsqlParser.Invalid_bool_expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#invalid_bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void enterInvalid_bool_expr_binary(HplsqlParser.Invalid_bool_expr_binaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#invalid_bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void exitInvalid_bool_expr_binary(HplsqlParser.Invalid_bool_expr_binaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#invalid_bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterInvalid_bool_expr_binary_operator(HplsqlParser.Invalid_bool_expr_binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#invalid_bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitInvalid_bool_expr_binary_operator(HplsqlParser.Invalid_bool_expr_binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#invalid_cpp_function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInvalid_cpp_function_stmt(HplsqlParser.Invalid_cpp_function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#invalid_cpp_function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInvalid_cpp_function_stmt(HplsqlParser.Invalid_cpp_function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#invalid_cpp_function_header}.
	 * @param ctx the parse tree
	 */
	void enterInvalid_cpp_function_header(HplsqlParser.Invalid_cpp_function_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#invalid_cpp_function_header}.
	 * @param ctx the parse tree
	 */
	void exitInvalid_cpp_function_header(HplsqlParser.Invalid_cpp_function_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#invalid_cpp_function_params_clause}.
	 * @param ctx the parse tree
	 */
	void enterInvalid_cpp_function_params_clause(HplsqlParser.Invalid_cpp_function_params_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#invalid_cpp_function_params_clause}.
	 * @param ctx the parse tree
	 */
	void exitInvalid_cpp_function_params_clause(HplsqlParser.Invalid_cpp_function_params_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#invalid_cpp_function_param}.
	 * @param ctx the parse tree
	 */
	void enterInvalid_cpp_function_param(HplsqlParser.Invalid_cpp_function_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#invalid_cpp_function_param}.
	 * @param ctx the parse tree
	 */
	void exitInvalid_cpp_function_param(HplsqlParser.Invalid_cpp_function_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#exception_block}.
	 * @param ctx the parse tree
	 */
	void enterException_block(HplsqlParser.Exception_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#exception_block}.
	 * @param ctx the parse tree
	 */
	void exitException_block(HplsqlParser.Exception_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#exception_block_item}.
	 * @param ctx the parse tree
	 */
	void enterException_block_item(HplsqlParser.Exception_block_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#exception_block_item}.
	 * @param ctx the parse tree
	 */
	void exitException_block_item(HplsqlParser.Exception_block_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon_stmt(HplsqlParser.Semicolon_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon_stmt(HplsqlParser.Semicolon_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNull_stmt(HplsqlParser.Null_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNull_stmt(HplsqlParser.Null_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(HplsqlParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(HplsqlParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(HplsqlParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(HplsqlParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_item(HplsqlParser.Assignment_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_item(HplsqlParser.Assignment_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_single_item(HplsqlParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_single_item(HplsqlParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_multiple_item(HplsqlParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_multiple_item(HplsqlParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_select_item(HplsqlParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_select_item(HplsqlParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssociate_locator_stmt(HplsqlParser.Associate_locator_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssociate_locator_stmt(HplsqlParser.Associate_locator_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(HplsqlParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(HplsqlParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCall_stmt(HplsqlParser.Call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCall_stmt(HplsqlParser.Call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#close_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClose_stmt(HplsqlParser.Close_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#close_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClose_stmt(HplsqlParser.Close_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt(HplsqlParser.Declare_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt(HplsqlParser.Declare_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block(HplsqlParser.Declare_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block(HplsqlParser.Declare_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block_inplace(HplsqlParser.Declare_block_inplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block_inplace(HplsqlParser.Declare_block_inplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt_item(HplsqlParser.Declare_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt_item(HplsqlParser.Declare_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#declare_var_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_var_item(HplsqlParser.Declare_var_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#declare_var_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_var_item(HplsqlParser.Declare_var_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#declare_condition_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_condition_item(HplsqlParser.Declare_condition_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#declare_condition_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_condition_item(HplsqlParser.Declare_condition_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#declare_handler_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_handler_item(HplsqlParser.Declare_handler_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#declare_handler_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_handler_item(HplsqlParser.Declare_handler_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_type_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type_stmt(HplsqlParser.Create_type_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_type_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type_stmt(HplsqlParser.Create_type_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type_definition(HplsqlParser.Create_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type_definition(HplsqlParser.Create_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_type_items}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type_items(HplsqlParser.Create_type_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_type_items}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type_items(HplsqlParser.Create_type_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_type_items_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type_items_item(HplsqlParser.Create_type_items_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_type_items_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type_items_item(HplsqlParser.Create_type_items_itemContext ctx);
	/**
     * Enter a parse tree produced by {@link HplsqlParser#create_type_options}.
     * @param ctx the parse tree
     */
    void enterCreate_type_options(HplsqlParser.Create_type_optionsContext ctx);

    /**
     * Exit a parse tree produced by {@link HplsqlParser#create_type_options}.
     *
     * @param ctx the parse tree
     */
    void exitCreate_type_options(HplsqlParser.Create_type_optionsContext ctx);

    /**
     * Enter a parse tree produced by {@link HplsqlParser#create_type_option}.
     *
     * @param ctx the parse tree
     */
    void enterCreate_type_option(HplsqlParser.Create_type_optionContext ctx);

    /**
     * Exit a parse tree produced by {@link HplsqlParser#create_type_option}.
     *
     * @param ctx the parse tree
     */
    void exitCreate_type_option(HplsqlParser.Create_type_optionContext ctx);

    /**
     * Enter a parse tree produced by {@link HplsqlParser#create_type_store_location}.
     *
     * @param ctx the parse tree
     */
    void enterCreate_type_store_location(HplsqlParser.Create_type_store_locationContext ctx);

    /**
     * Exit a parse tree produced by {@link HplsqlParser#create_type_store_location}.
     *
     * @param ctx the parse tree
     */
    void exitCreate_type_store_location(HplsqlParser.Create_type_store_locationContext ctx);

    /**
     * Enter a parse tree produced by {@link HplsqlParser#create_type_delimiter}.
     *
     * @param ctx the parse tree
     */
    void enterCreate_type_delimiter(HplsqlParser.Create_type_delimiterContext ctx);

    /**
     * Exit a parse tree produced by {@link HplsqlParser#create_type_delimiter}.
     *
     * @param ctx the parse tree
     */
    void exitCreate_type_delimiter(HplsqlParser.Create_type_delimiterContext ctx);

    /**
	 * Enter a parse tree produced by {@link HplsqlParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_temporary_table_item(HplsqlParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_temporary_table_item(HplsqlParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(HplsqlParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(HplsqlParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_local_temp_table_stmt(HplsqlParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_local_temp_table_stmt(HplsqlParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_definition(HplsqlParser.Create_table_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_definition(HplsqlParser.Create_table_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_columns}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_columns(HplsqlParser.Create_table_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_table_columns}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_columns(HplsqlParser.Create_table_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_columns_item(HplsqlParser.Create_table_columns_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_columns_item(HplsqlParser.Create_table_columns_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(HplsqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(HplsqlParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_column_inline_cons(HplsqlParser.Create_table_column_inline_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_column_inline_cons(HplsqlParser.Create_table_column_inline_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_column_cons(HplsqlParser.Create_table_column_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_column_cons(HplsqlParser.Create_table_column_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_fk_action(HplsqlParser.Create_table_fk_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_fk_action(HplsqlParser.Create_table_fk_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions(HplsqlParser.Create_table_preoptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions(HplsqlParser.Create_table_preoptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions_item(HplsqlParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions_item(HplsqlParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions_td_item(HplsqlParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions_td_item(HplsqlParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options(HplsqlParser.Create_table_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_table_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options(HplsqlParser.Create_table_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_options_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_item(HplsqlParser.Create_table_options_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_table_options_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_item(HplsqlParser.Create_table_options_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_ora_item(HplsqlParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_ora_item(HplsqlParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_db2_item(HplsqlParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_db2_item(HplsqlParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_td_item(HplsqlParser.Create_table_options_td_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_td_item(HplsqlParser.Create_table_options_td_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_hive_item(HplsqlParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_hive_item(HplsqlParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_store_location}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_store_location(HplsqlParser.Create_table_store_locationContext ctx);
	/**
     * Exit a parse tree produced by {@link HplsqlParser#create_table_store_location}.
     * @param ctx the parse tree
     */
    void exitCreate_table_store_location(HplsqlParser.Create_table_store_locationContext ctx);

    /**
     * Enter a parse tree produced by {@link HplsqlParser#create_table_delimiter}.
     *
     * @param ctx the parse tree
     */
    void enterCreate_table_delimiter(HplsqlParser.Create_table_delimiterContext ctx);

    /**
     * Exit a parse tree produced by {@link HplsqlParser#create_table_delimiter}.
     * @param ctx the parse tree
	 */
	void exitCreate_table_delimiter(HplsqlParser.Create_table_delimiterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_hive_row_format(HplsqlParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_hive_row_format(HplsqlParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_hive_row_format_fields(HplsqlParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_hive_row_format_fields(HplsqlParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_mssql_item(HplsqlParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_mssql_item(HplsqlParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_mysql_item(HplsqlParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_mysql_item(HplsqlParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#dtype}.
	 * @param ctx the parse tree
	 */
	void enterDtype(HplsqlParser.DtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#dtype}.
	 * @param ctx the parse tree
	 */
	void exitDtype(HplsqlParser.DtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void enterDtype_len(HplsqlParser.Dtype_lenContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void exitDtype_len(HplsqlParser.Dtype_lenContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#dtype_attr}.
	 * @param ctx the parse tree
	 */
	void enterDtype_attr(HplsqlParser.Dtype_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#dtype_attr}.
	 * @param ctx the parse tree
	 */
	void exitDtype_attr(HplsqlParser.Dtype_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#dtype_default}.
	 * @param ctx the parse tree
	 */
	void enterDtype_default(HplsqlParser.Dtype_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#dtype_default}.
	 * @param ctx the parse tree
	 */
	void exitDtype_default(HplsqlParser.Dtype_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_stmt(HplsqlParser.Create_database_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_stmt(HplsqlParser.Create_database_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_option(HplsqlParser.Create_database_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_option(HplsqlParser.Create_database_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_stmt(HplsqlParser.Create_function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_stmt(HplsqlParser.Create_function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_function_return}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_return(HplsqlParser.Create_function_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_function_return}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_return(HplsqlParser.Create_function_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_stmt(HplsqlParser.Create_package_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_stmt(HplsqlParser.Create_package_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec(HplsqlParser.Package_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec(HplsqlParser.Package_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#package_spec_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec_item(HplsqlParser.Package_spec_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#package_spec_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec_item(HplsqlParser.Package_spec_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_body_stmt(HplsqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_body_stmt(HplsqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body(HplsqlParser.Package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body(HplsqlParser.Package_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#package_body_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body_item(HplsqlParser.Package_body_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#package_body_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body_item(HplsqlParser.Package_body_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure_stmt(HplsqlParser.Create_procedure_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure_stmt(HplsqlParser.Create_procedure_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_routine_params}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_params(HplsqlParser.Create_routine_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_routine_params}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_params(HplsqlParser.Create_routine_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_param_item(HplsqlParser.Create_routine_param_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_param_item(HplsqlParser.Create_routine_param_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_routine_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_options(HplsqlParser.Create_routine_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_routine_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_options(HplsqlParser.Create_routine_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_routine_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_option(HplsqlParser.Create_routine_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_routine_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_option(HplsqlParser.Create_routine_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#exec_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExec_stmt(HplsqlParser.Exec_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#exec_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExec_stmt(HplsqlParser.Exec_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(HplsqlParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(HplsqlParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_plsql_stmt(HplsqlParser.If_plsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_plsql_stmt(HplsqlParser.If_plsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_tsql_stmt(HplsqlParser.If_tsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_tsql_stmt(HplsqlParser.If_tsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_bteq_stmt(HplsqlParser.If_bteq_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_bteq_stmt(HplsqlParser.If_bteq_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void enterElseif_block(HplsqlParser.Elseif_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void exitElseif_block(HplsqlParser.Elseif_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(HplsqlParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(HplsqlParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExit_stmt(HplsqlParser.Exit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExit_stmt(HplsqlParser.Exit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#leave_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLeave_stmt(HplsqlParser.Leave_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#leave_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLeave_stmt(HplsqlParser.Leave_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cmp_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCmp_stmt(HplsqlParser.Cmp_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cmp_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCmp_stmt(HplsqlParser.Cmp_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cmp_source}.
	 * @param ctx the parse tree
	 */
	void enterCmp_source(HplsqlParser.Cmp_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cmp_source}.
	 * @param ctx the parse tree
	 */
	void exitCmp_source(HplsqlParser.Cmp_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(HplsqlParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(HplsqlParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#create_index_col}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_col(HplsqlParser.Create_index_colContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#create_index_col}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_col(HplsqlParser.Create_index_colContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#index_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_storage_clause(HplsqlParser.Index_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#index_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_storage_clause(HplsqlParser.Index_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_mssql_storage_clause(HplsqlParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_mssql_storage_clause(HplsqlParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#quit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterQuit_stmt(HplsqlParser.Quit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#quit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitQuit_stmt(HplsqlParser.Quit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(HplsqlParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(HplsqlParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCpp_stmt(HplsqlParser.Cpp_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCpp_stmt(HplsqlParser.Cpp_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCpp_function_stmt(HplsqlParser.Cpp_function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCpp_function_stmt(HplsqlParser.Cpp_function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_function_header}.
	 * @param ctx the parse tree
	 */
	void enterCpp_function_header(HplsqlParser.Cpp_function_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_function_header}.
	 * @param ctx the parse tree
	 */
	void exitCpp_function_header(HplsqlParser.Cpp_function_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_function_params_clause}.
	 * @param ctx the parse tree
	 */
	void enterCpp_function_params_clause(HplsqlParser.Cpp_function_params_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_function_params_clause}.
	 * @param ctx the parse tree
	 */
	void exitCpp_function_params_clause(HplsqlParser.Cpp_function_params_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_function_param}.
	 * @param ctx the parse tree
	 */
	void enterCpp_function_param(HplsqlParser.Cpp_function_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_function_param}.
	 * @param ctx the parse tree
	 */
	void exitCpp_function_param(HplsqlParser.Cpp_function_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_function_body}.
	 * @param ctx the parse tree
	 */
	void enterCpp_function_body(HplsqlParser.Cpp_function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_function_body}.
	 * @param ctx the parse tree
	 */
	void exitCpp_function_body(HplsqlParser.Cpp_function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCpp_if_stmt(HplsqlParser.Cpp_if_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCpp_if_stmt(HplsqlParser.Cpp_if_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_elseif_clause}.
	 * @param ctx the parse tree
	 */
	void enterCpp_elseif_clause(HplsqlParser.Cpp_elseif_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_elseif_clause}.
	 * @param ctx the parse tree
	 */
	void exitCpp_elseif_clause(HplsqlParser.Cpp_elseif_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_else_clause}.
	 * @param ctx the parse tree
	 */
	void enterCpp_else_clause(HplsqlParser.Cpp_else_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_else_clause}.
	 * @param ctx the parse tree
	 */
	void exitCpp_else_clause(HplsqlParser.Cpp_else_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCpp_for_stmt(HplsqlParser.Cpp_for_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCpp_for_stmt(HplsqlParser.Cpp_for_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_for_stmt_header}.
	 * @param ctx the parse tree
	 */
	void enterCpp_for_stmt_header(HplsqlParser.Cpp_for_stmt_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_for_stmt_header}.
	 * @param ctx the parse tree
	 */
	void exitCpp_for_stmt_header(HplsqlParser.Cpp_for_stmt_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_for_params_clause}.
	 * @param ctx the parse tree
	 */
	void enterCpp_for_params_clause(HplsqlParser.Cpp_for_params_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_for_params_clause}.
	 * @param ctx the parse tree
	 */
	void exitCpp_for_params_clause(HplsqlParser.Cpp_for_params_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_for_param}.
	 * @param ctx the parse tree
	 */
	void enterCpp_for_param(HplsqlParser.Cpp_for_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_for_param}.
	 * @param ctx the parse tree
	 */
	void exitCpp_for_param(HplsqlParser.Cpp_for_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_for_stmt_var_incr_caluse}.
	 * @param ctx the parse tree
	 */
	void enterCpp_for_stmt_var_incr_caluse(HplsqlParser.Cpp_for_stmt_var_incr_caluseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_for_stmt_var_incr_caluse}.
	 * @param ctx the parse tree
	 */
	void exitCpp_for_stmt_var_incr_caluse(HplsqlParser.Cpp_for_stmt_var_incr_caluseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_for_stmt_var_incr}.
	 * @param ctx the parse tree
	 */
	void enterCpp_for_stmt_var_incr(HplsqlParser.Cpp_for_stmt_var_incrContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_for_stmt_var_incr}.
	 * @param ctx the parse tree
	 */
	void exitCpp_for_stmt_var_incr(HplsqlParser.Cpp_for_stmt_var_incrContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_for_stmt_body}.
	 * @param ctx the parse tree
	 */
	void enterCpp_for_stmt_body(HplsqlParser.Cpp_for_stmt_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_for_stmt_body}.
	 * @param ctx the parse tree
	 */
	void exitCpp_for_stmt_body(HplsqlParser.Cpp_for_stmt_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_declare_assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCpp_declare_assignment_stmt(HplsqlParser.Cpp_declare_assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_declare_assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCpp_declare_assignment_stmt(HplsqlParser.Cpp_declare_assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_declare_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCpp_declare_stmt(HplsqlParser.Cpp_declare_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_declare_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCpp_declare_stmt(HplsqlParser.Cpp_declare_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCpp_assignment_stmt(HplsqlParser.Cpp_assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCpp_assignment_stmt(HplsqlParser.Cpp_assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCpp_return_stmt(HplsqlParser.Cpp_return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCpp_return_stmt(HplsqlParser.Cpp_return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cpp_scope}.
	 * @param ctx the parse tree
	 */
	void enterCpp_scope(HplsqlParser.Cpp_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cpp_scope}.
	 * @param ctx the parse tree
	 */
	void exitCpp_scope(HplsqlParser.Cpp_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(HplsqlParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(HplsqlParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#for_range_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_range_stmt(HplsqlParser.For_range_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#for_range_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_range_stmt(HplsqlParser.For_range_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(HplsqlParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(HplsqlParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(HplsqlParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(HplsqlParser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(HplsqlParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(HplsqlParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_stmt(HplsqlParser.Fullselect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_stmt(HplsqlParser.Fullselect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_stmt_item(HplsqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_stmt_item(HplsqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_set_clause(HplsqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_set_clause(HplsqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSubselect_stmt(HplsqlParser.Subselect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSubselect_stmt(HplsqlParser.Subselect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(HplsqlParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(HplsqlParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#select_list_set}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_set(HplsqlParser.Select_list_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#select_list_set}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_set(HplsqlParser.Select_list_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_limit(HplsqlParser.Select_list_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_limit(HplsqlParser.Select_list_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#select_list_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_item(HplsqlParser.Select_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#select_list_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_item(HplsqlParser.Select_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_alias(HplsqlParser.Select_list_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_alias(HplsqlParser.Select_list_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_asterisk(HplsqlParser.Select_list_asteriskContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_asterisk(HplsqlParser.Select_list_asteriskContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(HplsqlParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(HplsqlParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(HplsqlParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(HplsqlParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_clause(HplsqlParser.From_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_clause(HplsqlParser.From_table_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_name_clause(HplsqlParser.From_table_name_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_name_clause(HplsqlParser.From_table_name_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_subselect_clause(HplsqlParser.From_subselect_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_subselect_clause(HplsqlParser.From_subselect_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_clause(HplsqlParser.From_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_clause(HplsqlParser.From_join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_type_clause(HplsqlParser.From_join_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_type_clause(HplsqlParser.From_join_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_values_clause(HplsqlParser.From_table_values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_values_clause(HplsqlParser.From_table_values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_values_row(HplsqlParser.From_table_values_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_values_row(HplsqlParser.From_table_values_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_alias_clause(HplsqlParser.From_alias_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_alias_clause(HplsqlParser.From_alias_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(HplsqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(HplsqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(HplsqlParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(HplsqlParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(HplsqlParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(HplsqlParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(HplsqlParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(HplsqlParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void enterQualify_clause(HplsqlParser.Qualify_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void exitQualify_clause(HplsqlParser.Qualify_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(HplsqlParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(HplsqlParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#select_options}.
	 * @param ctx the parse tree
	 */
	void enterSelect_options(HplsqlParser.Select_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#select_options}.
	 * @param ctx the parse tree
	 */
	void exitSelect_options(HplsqlParser.Select_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#select_options_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_options_item(HplsqlParser.Select_options_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#select_options_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_options_item(HplsqlParser.Select_options_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(HplsqlParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(HplsqlParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_atom(HplsqlParser.Bool_expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_atom(HplsqlParser.Bool_expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_unary(HplsqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_unary(HplsqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_single_in(HplsqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_single_in(HplsqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_multi_in(HplsqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_multi_in(HplsqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary(HplsqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary(HplsqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_logical_operator(HplsqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_logical_operator(HplsqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary_operator(HplsqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary_operator(HplsqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HplsqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HplsqlParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterExpr_atom(HplsqlParser.Expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitExpr_atom(HplsqlParser.Expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void enterExpr_interval(HplsqlParser.Expr_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void exitExpr_interval(HplsqlParser.Expr_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void enterInterval_item(HplsqlParser.Interval_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void exitInterval_item(HplsqlParser.Interval_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat(HplsqlParser.Expr_concatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat(HplsqlParser.Expr_concatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat_item(HplsqlParser.Expr_concat_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat_item(HplsqlParser.Expr_concat_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case(HplsqlParser.Expr_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case(HplsqlParser.Expr_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_simple(HplsqlParser.Expr_case_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_simple(HplsqlParser.Expr_case_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_searched(HplsqlParser.Expr_case_searchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_searched(HplsqlParser.Expr_case_searchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cursor_attribute(HplsqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cursor_attribute(HplsqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_agg_window_func(HplsqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_agg_window_func(HplsqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_all_distinct(HplsqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_all_distinct(HplsqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_over_clause(HplsqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_over_clause(HplsqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_partition_by_clause(HplsqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_partition_by_clause(HplsqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_spec_func(HplsqlParser.Expr_spec_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_spec_func(HplsqlParser.Expr_spec_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func(HplsqlParser.Expr_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func(HplsqlParser.Expr_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_params(HplsqlParser.Expr_func_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_params(HplsqlParser.Expr_func_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#func_param}.
	 * @param ctx the parse tree
	 */
	void enterFunc_param(HplsqlParser.Func_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#func_param}.
	 * @param ctx the parse tree
	 */
	void exitFunc_param(HplsqlParser.Func_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stmt(HplsqlParser.Write_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stmt(HplsqlParser.Write_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#write_stmt_string}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stmt_string(HplsqlParser.Write_stmt_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#write_stmt_string}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stmt_string(HplsqlParser.Write_stmt_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void enterDate_literal(HplsqlParser.Date_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void exitDate_literal(HplsqlParser.Date_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp_literal(HplsqlParser.Timestamp_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp_literal(HplsqlParser.Timestamp_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(HplsqlParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(HplsqlParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link HplsqlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterDouble_quotedString(HplsqlParser.Double_quotedStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link HplsqlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitDouble_quotedString(HplsqlParser.Double_quotedStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link HplsqlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterSingle_quotedString(HplsqlParser.Single_quotedStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link HplsqlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitSingle_quotedString(HplsqlParser.Single_quotedStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#int_number}.
	 * @param ctx the parse tree
	 */
	void enterInt_number(HplsqlParser.Int_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#int_number}.
	 * @param ctx the parse tree
	 */
	void exitInt_number(HplsqlParser.Int_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void enterDec_number(HplsqlParser.Dec_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void exitDec_number(HplsqlParser.Dec_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(HplsqlParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(HplsqlParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#null_const}.
	 * @param ctx the parse tree
	 */
	void enterNull_const(HplsqlParser.Null_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#null_const}.
	 * @param ctx the parse tree
	 */
	void exitNull_const(HplsqlParser.Null_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void enterNon_reserved_words(HplsqlParser.Non_reserved_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void exitNon_reserved_words(HplsqlParser.Non_reserved_wordsContext ctx);
}