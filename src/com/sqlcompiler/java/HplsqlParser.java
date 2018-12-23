// Generated from E:/ite-fourth-year/compilers/projects/sql-compiler/src/com/sqlcompiler/antlr\Hplsql.g4 by ANTLR 4.7
package com.sqlcompiler.java;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HplsqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T_ACTION=6, T_ALL=7, T_ALTER=8, 
		T_AND=9, T_AS=10, T_ASC=11, T_ASSOCIATE=12, T_AT=13, T_AUTO_INCREMENT=14, 
		T_AVG=15, T_BEGIN=16, T_BETWEEN=17, T_BIGINT=18, T_BINARY_DOUBLE=19, T_BINARY_FLOAT=20, 
		T_BINARY_INTEGER=21, T_BIT=22, T_BODY=23, T_BREAK=24, T_BY=25, T_BYTE=26, 
		T_CALL=27, T_CASCADE=28, T_CASE=29, T_CASESPECIFIC=30, T_CAST=31, T_CHAR=32, 
		T_CHARACTER=33, T_CHARSET=34, T_CLOSE=35, T_CLUSTERED=36, T_CMP=37, T_COLLECT=38, 
		T_COLLECTION=39, T_COMMENT=40, T_CONSTANT=41, T_COMMIT=42, T_COMPRESS=43, 
		T_CONCAT=44, T_CONDITION=45, T_CONSTRAINT=46, T_CONTINUE=47, T_COUNT=48, 
		T_COUNT_BIG=49, T_CREATE=50, T_CREATION=51, T_CREATOR=52, T_CS=53, T_CURRENT=54, 
		T_DATABASE=55, T_DATA=56, T_DATE=57, T_DATETIME=58, T_DAY=59, T_DAYS=60, 
		T_DEC=61, T_DECIMAL=62, T_DECLARE=63, T_DEFAULT=64, T_DEFERRED=65, T_DEFINED=66, 
		T_DEFINER=67, T_DEFINITION=68, T_DELETE=69, T_DELIMITED=70, T_DESC=71, 
		T_DIR=72, T_DIRECTORY=73, T_DISTINCT=74, T_DISTRIBUTE=75, T_DO=76, T_DOUBLE=77, 
		T_DROP=78, T_DYNAMIC=79, T_ELSE=80, T_ELSEIF=81, T_ELSIF=82, T_ENABLE=83, 
		T_END=84, T_ENGINE=85, T_ESCAPED=86, T_EXCEPT=87, T_EXEC=88, T_EXECUTE=89, 
		T_EXCEPTION=90, T_EXCLUSIVE=91, T_EXISTS=92, T_EXIT=93, T_FALLBACK=94, 
		T_FALSE=95, T_FIELDS=96, T_FLOAT=97, T_FOR=98, T_FOREIGN=99, T_FORMAT=100, 
		T_FOUND=101, T_FROM=102, T_FULL=103, T_FUNCTION=104, T_GET=105, T_GLOBAL=106, 
		T_GO=107, T_GROUP=108, T_HANDLER=109, T_HASH=110, T_HAVING=111, T_HDFS=112, 
		T_IDENTITY=113, T_IF=114, T_IMMEDIATE=115, T_IN=116, T_INDEX=117, T_INITRANS=118, 
		T_INNER=119, T_INOUT=120, T_INSERT=121, T_INT=122, T_INT2=123, T_INT4=124, 
		T_INT8=125, T_INTEGER=126, T_INTERSECT=127, T_INTERVAL=128, T_INTO=129, 
		T_INVOKER=130, T_IS=131, T_ISOPEN=132, T_ITEMS=133, T_JOIN=134, T_KEEP=135, 
		T_KEY=136, T_KEYS=137, T_LANGUAGE=138, T_LEAVE=139, T_LEFT=140, T_LIKE=141, 
		T_LIMIT=142, T_LINES=143, T_LOCAL=144, T_LOCATION=145, T_LOCATOR=146, 
		T_LOCATORS=147, T_LOCKS=148, T_LOG=149, T_LOGGED=150, T_LOGGING=151, T_LOOP=152, 
		T_MAP=153, T_MAX=154, T_MAXTRANS=155, T_MERGE=156, T_MICROSECOND=157, 
		T_MICROSECONDS=158, T_MIN=159, T_MULTISET=160, T_NCHAR=161, T_NVARCHAR=162, 
		T_NO=163, T_NOCOMPRESS=164, T_NOLOGGING=165, T_NOT=166, T_NOTFOUND=167, 
		T_NULL=168, T_NUMERIC=169, T_NUMBER=170, T_ON=171, T_ONLY=172, T_OPEN=173, 
		T_OR=174, T_ORDER=175, T_OUT=176, T_OUTER=177, T_OVER=178, T_OWNER=179, 
		T_PACKAGE=180, T_PARTITION=181, T_PCTFREE=182, T_PCTUSED=183, T_PLS_INTEGER=184, 
		T_PRECISION=185, T_PRESERVE=186, T_PRIMARY=187, T_PROC=188, T_PROCEDURE=189, 
		T_QUALIFY=190, T_QUIT=191, T_REAL=192, T_REFERENCES=193, T_REGEXP=194, 
		T_REPLACE=195, T_RESTRICT=196, T_RESULT=197, T_RESULT_SET_LOCATOR=198, 
		T_RETURN=199, T_RETURNS=200, T_REVERSE=201, T_RIGHT=202, T_RLIKE=203, 
		T_ROW=204, T_ROWS=205, T_ROW_COUNT=206, T_RR=207, T_RS=208, T_TRIM=209, 
		T_SCHEMA=210, T_SECOND=211, T_SECONDS=212, T_SECURITY=213, T_SEGMENT=214, 
		T_SEL=215, T_SELECT=216, T_SET=217, T_SETS=218, T_SHARE=219, T_SIMPLE_DOUBLE=220, 
		T_SIMPLE_FLOAT=221, T_SIMPLE_INTEGER=222, T_SMALLDATETIME=223, T_SMALLINT=224, 
		T_SQL=225, T_SQLEXCEPTION=226, T_SQLWARNING=227, T_STEP=228, T_STORAGE=229, 
		T_STORED=230, T_STRING=231, T_SUBSTRING=232, T_SUM=233, T_SYS_REFCURSOR=234, 
		T_TABLE=235, T_TABLESPACE=236, T_TEMPORARY=237, T_TERMINATED=238, T_TEXTIMAGE_ON=239, 
		T_THEN=240, T_TIMESTAMP=241, T_TINYINT=242, T_TITLE=243, T_TO=244, T_TOP=245, 
		T_TRUE=246, T_TYPE=247, T_UNION=248, T_UNIQUE=249, T_UPDATE=250, T_UR=251, 
		T_USE=252, T_USING=253, T_VALUE=254, T_VALUES=255, T_VAR=256, T_VARCHAR=257, 
		T_VARCHAR2=258, T_VARYING=259, T_VOLATILE=260, T_WHEN=261, T_WHERE=262, 
		T_WHILE=263, T_WITH=264, T_WORK=265, T_XML=266, T_YES=267, T_ACTIVITY_COUNT=268, 
		T_CUME_DIST=269, T_CURRENT_DATE=270, T_CURRENT_TIMESTAMP=271, T_CURRENT_USER=272, 
		T_DENSE_RANK=273, T_FIRST_VALUE=274, T_LAG=275, T_LAST_VALUE=276, T_LEAD=277, 
		T_MAX_PART_STRING=278, T_MIN_PART_STRING=279, T_MAX_PART_INT=280, T_MIN_PART_INT=281, 
		T_MAX_PART_DATE=282, T_MIN_PART_DATE=283, T_PART_COUNT=284, T_PART_LOC=285, 
		T_RANK=286, T_ROW_NUMBER=287, T_STDEV=288, T_SYSDATE=289, T_VARIANCE=290, 
		T_USER=291, T_ADD=292, T_COLON=293, T_COMMA=294, T_PIPE=295, T_DIV=296, 
		T_DOT2=297, T_EQUAL=298, T_EQUAL2=299, T_NOTEQUAL=300, T_NOTEQUAL2=301, 
		T_GREATER=302, T_GREATEREQUAL=303, T_LESS=304, T_LESSEQUAL=305, T_MUL=306, 
		T_OPEN_B=307, T_OPEN_P=308, T_OPEN_SB=309, T_CLOSE_B=310, T_CLOSE_P=311, 
		T_CLOSE_SB=312, T_SEMICOLON=313, T_SUB=314, L_ID=315, L_S_STRING=316, 
		L_D_STRING=317, L_INT=318, L_DEC=319, L_WS=320, L_M_COMMENT=321, L_S_COMMENT=322, 
		L_FILE=323, L_LABEL=324, L_CHARS=325;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_begin_end_block = 2, RULE_single_block_stmt = 3, 
		RULE_block_end = 4, RULE_proc_block = 5, RULE_stmt = 6, RULE_error_stmt = 7, 
		RULE_invalid_select_stmt = 8, RULE_invalid_where_clause = 9, RULE_invalid_bool_expr = 10, 
		RULE_invalid_cpp_function_stmt = 11, RULE_invalid_cpp_function_header = 12, 
		RULE_invalid_cpp_function_params_clause = 13, RULE_invalid_cpp_function_param = 14, 
		RULE_invalid_cpp_function_body = 15, RULE_exception_block = 16, RULE_exception_block_item = 17, 
		RULE_semicolon_stmt = 18, RULE_null_stmt = 19, RULE_expr_stmt = 20, RULE_assignment_stmt = 21, 
		RULE_assignment_stmt_item = 22, RULE_assignment_stmt_single_item = 23, 
		RULE_assignment_stmt_multiple_item = 24, RULE_assignment_stmt_select_item = 25, 
		RULE_associate_locator_stmt = 26, RULE_break_stmt = 27, RULE_call_stmt = 28, 
		RULE_close_stmt = 29, RULE_declare_stmt = 30, RULE_declare_block = 31, 
		RULE_declare_block_inplace = 32, RULE_declare_stmt_item = 33, RULE_declare_var_item = 34, 
		RULE_declare_condition_item = 35, RULE_declare_handler_item = 36, RULE_declare_temporary_table_item = 37, 
		RULE_create_type_stmt = 38, RULE_create_type_definition = 39, RULE_create_type_items = 40, 
		RULE_create_type_items_item = 41, RULE_create_table_stmt = 42, RULE_create_local_temp_table_stmt = 43, 
		RULE_create_table_definition = 44, RULE_create_table_columns = 45, RULE_create_table_columns_item = 46, 
		RULE_column_name = 47, RULE_create_table_column_inline_cons = 48, RULE_create_table_column_cons = 49, 
		RULE_create_table_fk_action = 50, RULE_create_table_preoptions = 51, RULE_create_table_preoptions_item = 52, 
		RULE_create_table_preoptions_td_item = 53, RULE_create_table_options = 54, 
		RULE_create_table_options_item = 55, RULE_create_table_options_ora_item = 56, 
		RULE_create_table_options_db2_item = 57, RULE_create_table_options_td_item = 58, 
		RULE_create_table_options_hive_item = 59, RULE_create_table_hive_row_format = 60, 
		RULE_create_table_hive_row_format_fields = 61, RULE_create_table_options_mssql_item = 62, 
		RULE_create_table_options_mysql_item = 63, RULE_dtype = 64, RULE_dtype_len = 65, 
		RULE_dtype_attr = 66, RULE_dtype_default = 67, RULE_create_database_stmt = 68, 
		RULE_create_database_option = 69, RULE_create_function_stmt = 70, RULE_create_function_return = 71, 
		RULE_create_package_stmt = 72, RULE_package_spec = 73, RULE_package_spec_item = 74, 
		RULE_create_package_body_stmt = 75, RULE_package_body = 76, RULE_package_body_item = 77, 
		RULE_create_procedure_stmt = 78, RULE_create_routine_params = 79, RULE_create_routine_param_item = 80, 
		RULE_create_routine_options = 81, RULE_create_routine_option = 82, RULE_exec_stmt = 83, 
		RULE_if_stmt = 84, RULE_if_plsql_stmt = 85, RULE_if_tsql_stmt = 86, RULE_if_bteq_stmt = 87, 
		RULE_elseif_block = 88, RULE_else_block = 89, RULE_exit_stmt = 90, RULE_leave_stmt = 91, 
		RULE_cmp_stmt = 92, RULE_cmp_source = 93, RULE_create_index_stmt = 94, 
		RULE_create_index_col = 95, RULE_index_storage_clause = 96, RULE_index_mssql_storage_clause = 97, 
		RULE_quit_stmt = 98, RULE_return_stmt = 99, RULE_cpp_function_stmt = 100, 
		RULE_cpp_function_header = 101, RULE_cpp_function_params_clause = 102, 
		RULE_cpp_function_param = 103, RULE_cpp_function_body = 104, RULE_cpp_if_stmt = 105, 
		RULE_cpp_elseif_clause = 106, RULE_cpp_else_clause = 107, RULE_cpp_for_stmt = 108, 
		RULE_cpp_for_stmt_header = 109, RULE_cpp_for_params_clause = 110, RULE_cpp_for_param = 111, 
		RULE_cpp_for_stmt_var_incr_caluse = 112, RULE_cpp_for_stmt_var_incr_ = 113, 
		RULE_cpp_for_stmt_body = 114, RULE_cpp_body_content = 115, RULE_while_stmt = 116, 
		RULE_for_range_stmt = 117, RULE_label = 118, RULE_using_clause = 119, 
		RULE_select_stmt = 120, RULE_fullselect_stmt = 121, RULE_fullselect_stmt_item = 122, 
		RULE_fullselect_set_clause = 123, RULE_subselect_stmt = 124, RULE_select_list = 125, 
		RULE_select_list_set = 126, RULE_select_list_limit = 127, RULE_select_list_item = 128, 
		RULE_select_list_alias = 129, RULE_select_list_asterisk = 130, RULE_into_clause = 131, 
		RULE_from_clause = 132, RULE_from_table_clause = 133, RULE_from_table_name_clause = 134, 
		RULE_from_subselect_clause = 135, RULE_from_join_clause = 136, RULE_from_join_type_clause = 137, 
		RULE_from_table_values_clause = 138, RULE_from_table_values_row = 139, 
		RULE_from_alias_clause = 140, RULE_table_name = 141, RULE_where_clause = 142, 
		RULE_group_by_clause = 143, RULE_having_clause = 144, RULE_qualify_clause = 145, 
		RULE_order_by_clause = 146, RULE_select_options = 147, RULE_select_options_item = 148, 
		RULE_bool_expr = 149, RULE_bool_expr_atom = 150, RULE_bool_expr_unary = 151, 
		RULE_bool_expr_single_in = 152, RULE_bool_expr_multi_in = 153, RULE_bool_expr_binary = 154, 
		RULE_bool_expr_logical_operator = 155, RULE_bool_expr_binary_operator = 156, 
		RULE_expr = 157, RULE_expr_atom = 158, RULE_expr_interval = 159, RULE_interval_item = 160, 
		RULE_expr_concat = 161, RULE_expr_concat_item = 162, RULE_expr_case = 163, 
		RULE_expr_case_simple = 164, RULE_expr_case_searched = 165, RULE_expr_cursor_attribute = 166, 
		RULE_expr_agg_window_func = 167, RULE_expr_func_all_distinct = 168, RULE_expr_func_over_clause = 169, 
		RULE_expr_func_partition_by_clause = 170, RULE_expr_spec_func = 171, RULE_expr_func = 172, 
		RULE_expr_func_params = 173, RULE_func_param = 174, RULE_date_literal = 175, 
		RULE_timestamp_literal = 176, RULE_ident = 177, RULE_string = 178, RULE_int_number = 179, 
		RULE_dec_number = 180, RULE_bool_literal = 181, RULE_null_const = 182, 
		RULE_new_line = 183, RULE_non_reserved_words = 184;
	public static final String[] ruleNames = {
		"program", "block", "begin_end_block", "single_block_stmt", "block_end", 
		"proc_block", "stmt", "error_stmt", "invalid_select_stmt", "invalid_where_clause", 
		"invalid_bool_expr", "invalid_cpp_function_stmt", "invalid_cpp_function_header", 
		"invalid_cpp_function_params_clause", "invalid_cpp_function_param", "invalid_cpp_function_body", 
		"exception_block", "exception_block_item", "semicolon_stmt", "null_stmt", 
		"expr_stmt", "assignment_stmt", "assignment_stmt_item", "assignment_stmt_single_item", 
		"assignment_stmt_multiple_item", "assignment_stmt_select_item", "associate_locator_stmt", 
		"break_stmt", "call_stmt", "close_stmt", "declare_stmt", "declare_block", 
		"declare_block_inplace", "declare_stmt_item", "declare_var_item", "declare_condition_item", 
		"declare_handler_item", "declare_temporary_table_item", "create_type_stmt", 
		"create_type_definition", "create_type_items", "create_type_items_item", 
		"create_table_stmt", "create_local_temp_table_stmt", "create_table_definition", 
		"create_table_columns", "create_table_columns_item", "column_name", "create_table_column_inline_cons", 
		"create_table_column_cons", "create_table_fk_action", "create_table_preoptions", 
		"create_table_preoptions_item", "create_table_preoptions_td_item", "create_table_options", 
		"create_table_options_item", "create_table_options_ora_item", "create_table_options_db2_item", 
		"create_table_options_td_item", "create_table_options_hive_item", "create_table_hive_row_format", 
		"create_table_hive_row_format_fields", "create_table_options_mssql_item", 
		"create_table_options_mysql_item", "dtype", "dtype_len", "dtype_attr", 
		"dtype_default", "create_database_stmt", "create_database_option", "create_function_stmt", 
		"create_function_return", "create_package_stmt", "package_spec", "package_spec_item", 
		"create_package_body_stmt", "package_body", "package_body_item", "create_procedure_stmt", 
		"create_routine_params", "create_routine_param_item", "create_routine_options", 
		"create_routine_option", "exec_stmt", "if_stmt", "if_plsql_stmt", "if_tsql_stmt", 
		"if_bteq_stmt", "elseif_block", "else_block", "exit_stmt", "leave_stmt", 
		"cmp_stmt", "cmp_source", "create_index_stmt", "create_index_col", "index_storage_clause", 
		"index_mssql_storage_clause", "quit_stmt", "return_stmt", "cpp_function_stmt", 
		"cpp_function_header", "cpp_function_params_clause", "cpp_function_param", 
		"cpp_function_body", "cpp_if_stmt", "cpp_elseif_clause", "cpp_else_clause", 
		"cpp_for_stmt", "cpp_for_stmt_header", "cpp_for_params_clause", "cpp_for_param", 
		"cpp_for_stmt_var_incr_caluse", "cpp_for_stmt_var_incr_", "cpp_for_stmt_body", 
		"cpp_body_content", "while_stmt", "for_range_stmt", "label", "using_clause", 
		"select_stmt", "fullselect_stmt", "fullselect_stmt_item", "fullselect_set_clause", 
		"subselect_stmt", "select_list", "select_list_set", "select_list_limit", 
		"select_list_item", "select_list_alias", "select_list_asterisk", "into_clause", 
		"from_clause", "from_table_clause", "from_table_name_clause", "from_subselect_clause", 
		"from_join_clause", "from_join_type_clause", "from_table_values_clause", 
		"from_table_values_row", "from_alias_clause", "table_name", "where_clause", 
		"group_by_clause", "having_clause", "qualify_clause", "order_by_clause", 
		"select_options", "select_options_item", "bool_expr", "bool_expr_atom", 
		"bool_expr_unary", "bool_expr_single_in", "bool_expr_multi_in", "bool_expr_binary", 
		"bool_expr_logical_operator", "bool_expr_binary_operator", "expr", "expr_atom", 
		"expr_interval", "interval_item", "expr_concat", "expr_concat_item", "expr_case", 
		"expr_case_simple", "expr_case_searched", "expr_cursor_attribute", "expr_agg_window_func", 
		"expr_func_all_distinct", "expr_func_over_clause", "expr_func_partition_by_clause", 
		"expr_spec_func", "expr_func", "expr_func_params", "func_param", "date_literal", 
		"timestamp_literal", "ident", "string", "int_number", "dec_number", "bool_literal", 
		"null_const", "new_line", "non_reserved_words"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@'", "'#'", "'%'", "'.'", "'\n'", null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'+'", "':'", "','", "'||'", "'/'", "'..'", 
		"'='", "'=='", "'<>'", "'!='", "'>'", "'>='", "'<'", "'<='", "'*'", "'{'", 
		"'('", "'['", "'}'", "')'", "']'", "';'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "T_ACTION", "T_ALL", "T_ALTER", "T_AND", 
		"T_AS", "T_ASC", "T_ASSOCIATE", "T_AT", "T_AUTO_INCREMENT", "T_AVG", "T_BEGIN", 
		"T_BETWEEN", "T_BIGINT", "T_BINARY_DOUBLE", "T_BINARY_FLOAT", "T_BINARY_INTEGER", 
		"T_BIT", "T_BODY", "T_BREAK", "T_BY", "T_BYTE", "T_CALL", "T_CASCADE", 
		"T_CASE", "T_CASESPECIFIC", "T_CAST", "T_CHAR", "T_CHARACTER", "T_CHARSET", 
		"T_CLOSE", "T_CLUSTERED", "T_CMP", "T_COLLECT", "T_COLLECTION", "T_COMMENT", 
		"T_CONSTANT", "T_COMMIT", "T_COMPRESS", "T_CONCAT", "T_CONDITION", "T_CONSTRAINT", 
		"T_CONTINUE", "T_COUNT", "T_COUNT_BIG", "T_CREATE", "T_CREATION", "T_CREATOR", 
		"T_CS", "T_CURRENT", "T_DATABASE", "T_DATA", "T_DATE", "T_DATETIME", "T_DAY", 
		"T_DAYS", "T_DEC", "T_DECIMAL", "T_DECLARE", "T_DEFAULT", "T_DEFERRED", 
		"T_DEFINED", "T_DEFINER", "T_DEFINITION", "T_DELETE", "T_DELIMITED", "T_DESC", 
		"T_DIR", "T_DIRECTORY", "T_DISTINCT", "T_DISTRIBUTE", "T_DO", "T_DOUBLE", 
		"T_DROP", "T_DYNAMIC", "T_ELSE", "T_ELSEIF", "T_ELSIF", "T_ENABLE", "T_END", 
		"T_ENGINE", "T_ESCAPED", "T_EXCEPT", "T_EXEC", "T_EXECUTE", "T_EXCEPTION", 
		"T_EXCLUSIVE", "T_EXISTS", "T_EXIT", "T_FALLBACK", "T_FALSE", "T_FIELDS", 
		"T_FLOAT", "T_FOR", "T_FOREIGN", "T_FORMAT", "T_FOUND", "T_FROM", "T_FULL", 
		"T_FUNCTION", "T_GET", "T_GLOBAL", "T_GO", "T_GROUP", "T_HANDLER", "T_HASH", 
		"T_HAVING", "T_HDFS", "T_IDENTITY", "T_IF", "T_IMMEDIATE", "T_IN", "T_INDEX", 
		"T_INITRANS", "T_INNER", "T_INOUT", "T_INSERT", "T_INT", "T_INT2", "T_INT4", 
		"T_INT8", "T_INTEGER", "T_INTERSECT", "T_INTERVAL", "T_INTO", "T_INVOKER", 
		"T_IS", "T_ISOPEN", "T_ITEMS", "T_JOIN", "T_KEEP", "T_KEY", "T_KEYS", 
		"T_LANGUAGE", "T_LEAVE", "T_LEFT", "T_LIKE", "T_LIMIT", "T_LINES", "T_LOCAL", 
		"T_LOCATION", "T_LOCATOR", "T_LOCATORS", "T_LOCKS", "T_LOG", "T_LOGGED", 
		"T_LOGGING", "T_LOOP", "T_MAP", "T_MAX", "T_MAXTRANS", "T_MERGE", "T_MICROSECOND", 
		"T_MICROSECONDS", "T_MIN", "T_MULTISET", "T_NCHAR", "T_NVARCHAR", "T_NO", 
		"T_NOCOMPRESS", "T_NOLOGGING", "T_NOT", "T_NOTFOUND", "T_NULL", "T_NUMERIC", 
		"T_NUMBER", "T_ON", "T_ONLY", "T_OPEN", "T_OR", "T_ORDER", "T_OUT", "T_OUTER", 
		"T_OVER", "T_OWNER", "T_PACKAGE", "T_PARTITION", "T_PCTFREE", "T_PCTUSED", 
		"T_PLS_INTEGER", "T_PRECISION", "T_PRESERVE", "T_PRIMARY", "T_PROC", "T_PROCEDURE", 
		"T_QUALIFY", "T_QUIT", "T_REAL", "T_REFERENCES", "T_REGEXP", "T_REPLACE", 
		"T_RESTRICT", "T_RESULT", "T_RESULT_SET_LOCATOR", "T_RETURN", "T_RETURNS", 
		"T_REVERSE", "T_RIGHT", "T_RLIKE", "T_ROW", "T_ROWS", "T_ROW_COUNT", "T_RR", 
		"T_RS", "T_TRIM", "T_SCHEMA", "T_SECOND", "T_SECONDS", "T_SECURITY", "T_SEGMENT", 
		"T_SEL", "T_SELECT", "T_SET", "T_SETS", "T_SHARE", "T_SIMPLE_DOUBLE", 
		"T_SIMPLE_FLOAT", "T_SIMPLE_INTEGER", "T_SMALLDATETIME", "T_SMALLINT", 
		"T_SQL", "T_SQLEXCEPTION", "T_SQLWARNING", "T_STEP", "T_STORAGE", "T_STORED", 
		"T_STRING", "T_SUBSTRING", "T_SUM", "T_SYS_REFCURSOR", "T_TABLE", "T_TABLESPACE", 
		"T_TEMPORARY", "T_TERMINATED", "T_TEXTIMAGE_ON", "T_THEN", "T_TIMESTAMP", 
		"T_TINYINT", "T_TITLE", "T_TO", "T_TOP", "T_TRUE", "T_TYPE", "T_UNION", 
		"T_UNIQUE", "T_UPDATE", "T_UR", "T_USE", "T_USING", "T_VALUE", "T_VALUES", 
		"T_VAR", "T_VARCHAR", "T_VARCHAR2", "T_VARYING", "T_VOLATILE", "T_WHEN", 
		"T_WHERE", "T_WHILE", "T_WITH", "T_WORK", "T_XML", "T_YES", "T_ACTIVITY_COUNT", 
		"T_CUME_DIST", "T_CURRENT_DATE", "T_CURRENT_TIMESTAMP", "T_CURRENT_USER", 
		"T_DENSE_RANK", "T_FIRST_VALUE", "T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", 
		"T_MIN_PART_STRING", "T_MAX_PART_INT", "T_MIN_PART_INT", "T_MAX_PART_DATE", 
		"T_MIN_PART_DATE", "T_PART_COUNT", "T_PART_LOC", "T_RANK", "T_ROW_NUMBER", 
		"T_STDEV", "T_SYSDATE", "T_VARIANCE", "T_USER", "T_ADD", "T_COLON", "T_COMMA", 
		"T_PIPE", "T_DIV", "T_DOT2", "T_EQUAL", "T_EQUAL2", "T_NOTEQUAL", "T_NOTEQUAL2", 
		"T_GREATER", "T_GREATEREQUAL", "T_LESS", "T_LESSEQUAL", "T_MUL", "T_OPEN_B", 
		"T_OPEN_P", "T_OPEN_SB", "T_CLOSE_B", "T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON", 
		"T_SUB", "L_ID", "L_S_STRING", "L_D_STRING", "L_INT", "L_DEC", "L_WS", 
		"L_M_COMMENT", "L_S_COMMENT", "L_FILE", "L_LABEL", "L_CHARS"
	};
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
	public String getGrammarFileName() { return "Hplsql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HplsqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HplsqlParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			block();
			setState(371);
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

	public static class BlockContext extends ParserRuleContext {
		public List<Begin_end_blockContext> begin_end_block() {
			return getRuleContexts(Begin_end_blockContext.class);
		}
		public Begin_end_blockContext begin_end_block(int i) {
			return getRuleContext(Begin_end_blockContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> T_GO() { return getTokens(HplsqlParser.T_GO); }
		public TerminalNode T_GO(int i) {
			return getToken(HplsqlParser.T_GO, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(380); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(375);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(373);
						begin_end_block();
						}
						break;
					case 2:
						{
						setState(374);
						stmt();
						}
						break;
					}
					setState(378);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(377);
						match(T_GO);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(382); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Begin_end_blockContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Declare_blockContext declare_block() {
			return getRuleContext(Declare_blockContext.class,0);
		}
		public Exception_blockContext exception_block() {
			return getRuleContext(Exception_blockContext.class,0);
		}
		public Begin_end_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_end_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBegin_end_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBegin_end_block(this);
		}
	}

	public final Begin_end_blockContext begin_end_block() throws RecognitionException {
		Begin_end_blockContext _localctx = new Begin_end_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_begin_end_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(384);
				declare_block();
				}
			}

			setState(387);
			match(T_BEGIN);
			setState(388);
			block();
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(389);
				exception_block();
				}
				break;
			}
			setState(392);
			block_end();
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

	public static class Single_block_stmtContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Exception_blockContext exception_block() {
			return getRuleContext(Exception_blockContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public Single_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_block_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSingle_block_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSingle_block_stmt(this);
		}
	}

	public final Single_block_stmtContext single_block_stmt() throws RecognitionException {
		Single_block_stmtContext _localctx = new Single_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_block_stmt);
		try {
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(T_BEGIN);
				setState(395);
				block();
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(396);
					exception_block();
					}
					break;
				}
				setState(399);
				block_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				stmt();
				setState(403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(402);
					match(T_SEMICOLON);
					}
					break;
				}
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

	public static class Block_endContext extends ParserRuleContext {
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public Block_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBlock_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBlock_end(this);
		}
	}

	public final Block_endContext block_end() throws RecognitionException {
		Block_endContext _localctx = new Block_endContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(408);
			match(T_END);
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

	public static class Proc_blockContext extends ParserRuleContext {
		public Begin_end_blockContext begin_end_block() {
			return getRuleContext(Begin_end_blockContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode T_GO() { return getToken(HplsqlParser.T_GO, 0); }
		public Proc_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterProc_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitProc_block(this);
		}
	}

	public final Proc_blockContext proc_block() throws RecognitionException {
		Proc_blockContext _localctx = new Proc_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proc_block);
		try {
			int _alt;
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				begin_end_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(411);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(414); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(416);
					match(T_GO);
					}
					break;
				}
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

	public static class StmtContext extends ParserRuleContext {
		public Error_stmtContext error_stmt() {
			return getRuleContext(Error_stmtContext.class,0);
		}
		public Cpp_function_stmtContext cpp_function_stmt() {
			return getRuleContext(Cpp_function_stmtContext.class,0);
		}
		public Cpp_if_stmtContext cpp_if_stmt() {
			return getRuleContext(Cpp_if_stmtContext.class,0);
		}
		public Cpp_for_stmtContext cpp_for_stmt() {
			return getRuleContext(Cpp_for_stmtContext.class,0);
		}
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public Associate_locator_stmtContext associate_locator_stmt() {
			return getRuleContext(Associate_locator_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Call_stmtContext call_stmt() {
			return getRuleContext(Call_stmtContext.class,0);
		}
		public Close_stmtContext close_stmt() {
			return getRuleContext(Close_stmtContext.class,0);
		}
		public Cmp_stmtContext cmp_stmt() {
			return getRuleContext(Cmp_stmtContext.class,0);
		}
		public Create_database_stmtContext create_database_stmt() {
			return getRuleContext(Create_database_stmtContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_local_temp_table_stmtContext create_local_temp_table_stmt() {
			return getRuleContext(Create_local_temp_table_stmtContext.class,0);
		}
		public Create_package_stmtContext create_package_stmt() {
			return getRuleContext(Create_package_stmtContext.class,0);
		}
		public Create_package_body_stmtContext create_package_body_stmt() {
			return getRuleContext(Create_package_body_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_type_stmtContext create_type_stmt() {
			return getRuleContext(Create_type_stmtContext.class,0);
		}
		public Declare_stmtContext declare_stmt() {
			return getRuleContext(Declare_stmtContext.class,0);
		}
		public Exec_stmtContext exec_stmt() {
			return getRuleContext(Exec_stmtContext.class,0);
		}
		public Exit_stmtContext exit_stmt() {
			return getRuleContext(Exit_stmtContext.class,0);
		}
		public For_range_stmtContext for_range_stmt() {
			return getRuleContext(For_range_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Leave_stmtContext leave_stmt() {
			return getRuleContext(Leave_stmtContext.class,0);
		}
		public Quit_stmtContext quit_stmt() {
			return getRuleContext(Quit_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Null_stmtContext null_stmt() {
			return getRuleContext(Null_stmtContext.class,0);
		}
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Semicolon_stmtContext semicolon_stmt() {
			return getRuleContext(Semicolon_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				error_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				cpp_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				cpp_if_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				cpp_for_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(425);
				assignment_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(426);
				associate_locator_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(427);
				break_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(428);
				call_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(429);
				close_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(430);
				cmp_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(431);
				create_database_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(432);
				create_function_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(433);
				create_index_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(434);
				create_local_temp_table_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(435);
				create_package_stmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(436);
				create_package_body_stmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(437);
				create_procedure_stmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(438);
				create_table_stmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(439);
				create_type_stmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(440);
				declare_stmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(441);
				exec_stmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(442);
				exit_stmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(443);
				for_range_stmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(444);
				if_stmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(445);
				leave_stmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(446);
				quit_stmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(447);
				return_stmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(448);
				select_stmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(449);
				while_stmt();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(450);
				label();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(451);
				null_stmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(452);
				expr_stmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(453);
				semicolon_stmt();
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

	public static class Error_stmtContext extends ParserRuleContext {
		public Invalid_cpp_function_stmtContext invalid_cpp_function_stmt() {
			return getRuleContext(Invalid_cpp_function_stmtContext.class,0);
		}
		public Invalid_select_stmtContext invalid_select_stmt() {
			return getRuleContext(Invalid_select_stmtContext.class,0);
		}
		public Error_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterError_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitError_stmt(this);
		}
	}

	public final Error_stmtContext error_stmt() throws RecognitionException {
		Error_stmtContext _localctx = new Error_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_error_stmt);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				invalid_cpp_function_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				invalid_select_stmt();
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

	public static class Invalid_select_stmtContext extends ParserRuleContext {
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public Invalid_where_clauseContext invalid_where_clause() {
			return getRuleContext(Invalid_where_clauseContext.class,0);
		}
		public TerminalNode T_SELECT() { return getToken(HplsqlParser.T_SELECT, 0); }
		public TerminalNode T_SEL() { return getToken(HplsqlParser.T_SEL, 0); }
		public Into_clauseContext into_clause() {
			return getRuleContext(Into_clauseContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Qualify_clauseContext qualify_clause() {
			return getRuleContext(Qualify_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Select_optionsContext select_options() {
			return getRuleContext(Select_optionsContext.class,0);
		}
		public Invalid_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalid_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInvalid_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInvalid_select_stmt(this);
		}
	}

	public final Invalid_select_stmtContext invalid_select_stmt() throws RecognitionException {
		Invalid_select_stmtContext _localctx = new Invalid_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_invalid_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(461);
			select_list();
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(462);
				into_clause();
				}
				break;
			}
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(465);
				from_clause();
				}
				break;
			}
			setState(468);
			invalid_where_clause();
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(469);
				group_by_clause();
				}
				break;
			}
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(472);
				having_clause();
				}
				break;
			case 2:
				{
				setState(473);
				qualify_clause();
				}
				break;
			}
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(476);
				order_by_clause();
				}
				break;
			}
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(479);
				select_options();
				}
				break;
			}
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

	public static class Invalid_where_clauseContext extends ParserRuleContext {
		public Invalid_bool_exprContext invalid_bool_expr() {
			return getRuleContext(Invalid_bool_exprContext.class,0);
		}
		public TerminalNode T_WHERE() { return getToken(HplsqlParser.T_WHERE, 0); }
		public Invalid_where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalid_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInvalid_where_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInvalid_where_clause(this);
		}
	}

	public final Invalid_where_clauseContext invalid_where_clause() throws RecognitionException {
		Invalid_where_clauseContext _localctx = new Invalid_where_clauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_invalid_where_clause);
		int _la;
		try {
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WHERE) {
					{
					setState(482);
					match(T_WHERE);
					}
				}

				setState(485);
				invalid_bool_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				match(T_WHERE);
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

	public static class Invalid_bool_exprContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Invalid_bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalid_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInvalid_bool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInvalid_bool_expr(this);
		}
	}

	public final Invalid_bool_exprContext invalid_bool_expr() throws RecognitionException {
		Invalid_bool_exprContext _localctx = new Invalid_bool_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_invalid_bool_expr);
		int _la;
		try {
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(489);
					match(T_NOT);
					}
					break;
				}
				setState(492);
				bool_expr(0);
				setState(493);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(495);
					match(T_NOT);
					}
				}

				setState(498);
				match(T_OPEN_P);
				setState(499);
				bool_expr(0);
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

	public static class Invalid_cpp_function_stmtContext extends ParserRuleContext {
		public Invalid_cpp_function_headerContext invalid_cpp_function_header() {
			return getRuleContext(Invalid_cpp_function_headerContext.class,0);
		}
		public Invalid_cpp_function_bodyContext invalid_cpp_function_body() {
			return getRuleContext(Invalid_cpp_function_bodyContext.class,0);
		}
		public Cpp_function_bodyContext cpp_function_body() {
			return getRuleContext(Cpp_function_bodyContext.class,0);
		}
		public Cpp_function_headerContext cpp_function_header() {
			return getRuleContext(Cpp_function_headerContext.class,0);
		}
		public Invalid_cpp_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalid_cpp_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInvalid_cpp_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInvalid_cpp_function_stmt(this);
		}
	}

	public final Invalid_cpp_function_stmtContext invalid_cpp_function_stmt() throws RecognitionException {
		Invalid_cpp_function_stmtContext _localctx = new Invalid_cpp_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_invalid_cpp_function_stmt);
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				invalid_cpp_function_header();
				setState(503);
				invalid_cpp_function_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				invalid_cpp_function_header();
				setState(506);
				cpp_function_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(508);
				cpp_function_header();
				setState(509);
				invalid_cpp_function_body();
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

	public static class Invalid_cpp_function_headerContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Cpp_function_params_clauseContext cpp_function_params_clause() {
			return getRuleContext(Cpp_function_params_clauseContext.class,0);
		}
		public Invalid_cpp_function_params_clauseContext invalid_cpp_function_params_clause() {
			return getRuleContext(Invalid_cpp_function_params_clauseContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Invalid_cpp_function_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalid_cpp_function_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInvalid_cpp_function_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInvalid_cpp_function_header(this);
		}
	}

	public final Invalid_cpp_function_headerContext invalid_cpp_function_header() throws RecognitionException {
		Invalid_cpp_function_headerContext _localctx = new Invalid_cpp_function_headerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_invalid_cpp_function_header);
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				ident();
				setState(514);
				match(T_OPEN_P);
				setState(517);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(515);
					cpp_function_params_clause();
					}
					break;
				case 2:
					{
					setState(516);
					invalid_cpp_function_params_clause();
					}
					break;
				}
				setState(519);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				dtype();
				setState(522);
				match(T_OPEN_P);
				setState(525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(523);
					cpp_function_params_clause();
					}
					break;
				case 2:
					{
					setState(524);
					invalid_cpp_function_params_clause();
					}
					break;
				}
				setState(527);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				dtype();
				setState(530);
				ident();
				setState(531);
				match(T_OPEN_P);
				setState(532);
				invalid_cpp_function_params_clause();
				setState(533);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(535);
				dtype();
				setState(536);
				ident();
				setState(539);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(537);
					cpp_function_params_clause();
					}
					break;
				case 2:
					{
					setState(538);
					invalid_cpp_function_params_clause();
					}
					break;
				}
				setState(541);
				match(T_CLOSE_P);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(543);
				dtype();
				setState(544);
				ident();
				setState(545);
				match(T_OPEN_P);
				setState(548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(546);
					cpp_function_params_clause();
					}
					break;
				case 2:
					{
					setState(547);
					invalid_cpp_function_params_clause();
					}
					break;
				}
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

	public static class Invalid_cpp_function_params_clauseContext extends ParserRuleContext {
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<Invalid_cpp_function_paramContext> invalid_cpp_function_param() {
			return getRuleContexts(Invalid_cpp_function_paramContext.class);
		}
		public Invalid_cpp_function_paramContext invalid_cpp_function_param(int i) {
			return getRuleContext(Invalid_cpp_function_paramContext.class,i);
		}
		public List<Cpp_function_paramContext> cpp_function_param() {
			return getRuleContexts(Cpp_function_paramContext.class);
		}
		public Cpp_function_paramContext cpp_function_param(int i) {
			return getRuleContext(Cpp_function_paramContext.class,i);
		}
		public Invalid_cpp_function_params_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalid_cpp_function_params_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInvalid_cpp_function_params_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInvalid_cpp_function_params_clause(this);
		}
	}

	public final Invalid_cpp_function_params_clauseContext invalid_cpp_function_params_clause() throws RecognitionException {
		Invalid_cpp_function_params_clauseContext _localctx = new Invalid_cpp_function_params_clauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_invalid_cpp_function_params_clause);
		int _la;
		try {
			int _alt;
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(552);
					invalid_cpp_function_param();
					}
					break;
				case 2:
					{
					setState(553);
					cpp_function_param();
					}
					break;
				}
				setState(556);
				match(T_COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				invalid_cpp_function_param();
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(559);
					match(T_COMMA);
					setState(562);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(560);
						cpp_function_param();
						}
						break;
					case 2:
						{
						setState(561);
						invalid_cpp_function_param();
						}
						break;
					}
					}
					}
					setState(568);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(569);
				cpp_function_param();
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(570);
						match(T_COMMA);
						setState(571);
						cpp_function_param();
						}
						} 
					}
					setState(576);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(579); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(577);
						match(T_COMMA);
						setState(578);
						invalid_cpp_function_param();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(581); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(583);
					match(T_COMMA);
					setState(584);
					cpp_function_param();
					}
					}
					setState(589);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Invalid_cpp_function_paramContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Invalid_cpp_function_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalid_cpp_function_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInvalid_cpp_function_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInvalid_cpp_function_param(this);
		}
	}

	public final Invalid_cpp_function_paramContext invalid_cpp_function_param() throws RecognitionException {
		Invalid_cpp_function_paramContext _localctx = new Invalid_cpp_function_paramContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_invalid_cpp_function_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			ident();
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

	public static class Invalid_cpp_function_bodyContext extends ParserRuleContext {
		public TerminalNode T_OPEN_B() { return getToken(HplsqlParser.T_OPEN_B, 0); }
		public List<Cpp_body_contentContext> cpp_body_content() {
			return getRuleContexts(Cpp_body_contentContext.class);
		}
		public Cpp_body_contentContext cpp_body_content(int i) {
			return getRuleContext(Cpp_body_contentContext.class,i);
		}
		public TerminalNode T_CLOSE_B() { return getToken(HplsqlParser.T_CLOSE_B, 0); }
		public Invalid_cpp_function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalid_cpp_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInvalid_cpp_function_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInvalid_cpp_function_body(this);
		}
	}

	public final Invalid_cpp_function_bodyContext invalid_cpp_function_body() throws RecognitionException {
		Invalid_cpp_function_bodyContext _localctx = new Invalid_cpp_function_bodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_invalid_cpp_function_body);
		int _la;
		try {
			int _alt;
			setState(608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_OPEN_B:
				enterOuterAlt(_localctx, 1);
				{
				setState(594);
				match(T_OPEN_B);
				setState(598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(595);
						cpp_body_content();
						}
						} 
					}
					setState(600);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				}
				break;
			case T_FOR:
			case T_IF:
			case T_CLOSE_B:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_FOR || _la==T_IF) {
					{
					{
					setState(601);
					cpp_body_content();
					}
					}
					setState(606);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(607);
				match(T_CLOSE_B);
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

	public static class Exception_blockContext extends ParserRuleContext {
		public TerminalNode T_EXCEPTION() { return getToken(HplsqlParser.T_EXCEPTION, 0); }
		public List<Exception_block_itemContext> exception_block_item() {
			return getRuleContexts(Exception_block_itemContext.class);
		}
		public Exception_block_itemContext exception_block_item(int i) {
			return getRuleContext(Exception_block_itemContext.class,i);
		}
		public Exception_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterException_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitException_block(this);
		}
	}

	public final Exception_blockContext exception_block() throws RecognitionException {
		Exception_blockContext _localctx = new Exception_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exception_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(T_EXCEPTION);
			setState(612); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(611);
					exception_block_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(614); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Exception_block_itemContext extends ParserRuleContext {
		public List<TerminalNode> T_WHEN() { return getTokens(HplsqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HplsqlParser.T_WHEN, i);
		}
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public Exception_block_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_block_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterException_block_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitException_block_item(this);
		}
	}

	public final Exception_block_itemContext exception_block_item() throws RecognitionException {
		Exception_block_itemContext _localctx = new Exception_block_itemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exception_block_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(T_WHEN);
			setState(617);
			match(L_ID);
			setState(618);
			match(T_THEN);
			setState(619);
			block();
			setState(620);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T_END || _la==T_WHEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Semicolon_stmtContext extends ParserRuleContext {
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public Semicolon_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSemicolon_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSemicolon_stmt(this);
		}
	}

	public final Semicolon_stmtContext semicolon_stmt() throws RecognitionException {
		Semicolon_stmtContext _localctx = new Semicolon_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_semicolon_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1 || _la==T_DIV || _la==T_SEMICOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Null_stmtContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public Null_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNull_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNull_stmt(this);
		}
	}

	public final Null_stmtContext null_stmt() throws RecognitionException {
		Null_stmtContext _localctx = new Null_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_null_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(T_NULL);
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

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_stmt(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("GO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"GO\")");
			setState(627);
			expr(0);
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

	public static class Assignment_stmtContext extends ParserRuleContext {
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAssignment_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAssignment_stmt(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignment_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(629);
				match(T_SET);
				}
				break;
			}
			setState(632);
			assignment_stmt_item();
			setState(637);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(633);
					match(T_COMMA);
					setState(634);
					assignment_stmt_item();
					}
					} 
				}
				setState(639);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
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

	public static class Assignment_stmt_itemContext extends ParserRuleContext {
		public Assignment_stmt_single_itemContext assignment_stmt_single_item() {
			return getRuleContext(Assignment_stmt_single_itemContext.class,0);
		}
		public Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() {
			return getRuleContext(Assignment_stmt_multiple_itemContext.class,0);
		}
		public Assignment_stmt_select_itemContext assignment_stmt_select_item() {
			return getRuleContext(Assignment_stmt_select_itemContext.class,0);
		}
		public Assignment_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAssignment_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAssignment_stmt_item(this);
		}
	}

	public final Assignment_stmt_itemContext assignment_stmt_item() throws RecognitionException {
		Assignment_stmt_itemContext _localctx = new Assignment_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignment_stmt_item);
		try {
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				assignment_stmt_single_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				assignment_stmt_multiple_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(642);
				assignment_stmt_select_item();
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

	public static class Assignment_stmt_single_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(HplsqlParser.T_COLON, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Assignment_stmt_single_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_single_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAssignment_stmt_single_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAssignment_stmt_single_item(this);
		}
	}

	public final Assignment_stmt_single_itemContext assignment_stmt_single_item() throws RecognitionException {
		Assignment_stmt_single_itemContext _localctx = new Assignment_stmt_single_itemContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignment_stmt_single_item);
		int _la;
		try {
			setState(661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_AND:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DESC:
			case T_DIR:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_END:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FIELDS:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GLOBAL:
			case T_GO:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_IDENTITY:
			case T_IF:
			case T_IMMEDIATE:
			case T_IN:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MAX:
			case T_MAXTRANS:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUIT:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SETS:
			case T_SHARE:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLWARNING:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBSTRING:
			case T_SUM:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRUE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
			case L_CHARS:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				ident();
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(646);
					match(T_COLON);
					}
				}

				setState(649);
				match(T_EQUAL);
				setState(650);
				expr(0);
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				match(T_OPEN_P);
				setState(653);
				ident();
				setState(654);
				match(T_CLOSE_P);
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(655);
					match(T_COLON);
					}
				}

				setState(658);
				match(T_EQUAL);
				setState(659);
				expr(0);
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

	public static class Assignment_stmt_multiple_itemContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(HplsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HplsqlParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HplsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_COLON() { return getToken(HplsqlParser.T_COLON, 0); }
		public Assignment_stmt_multiple_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_multiple_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAssignment_stmt_multiple_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAssignment_stmt_multiple_item(this);
		}
	}

	public final Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() throws RecognitionException {
		Assignment_stmt_multiple_itemContext _localctx = new Assignment_stmt_multiple_itemContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignment_stmt_multiple_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(T_OPEN_P);
			setState(664);
			ident();
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(665);
				match(T_COMMA);
				setState(666);
				ident();
				}
				}
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(672);
			match(T_CLOSE_P);
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(673);
				match(T_COLON);
				}
			}

			setState(676);
			match(T_EQUAL);
			setState(677);
			match(T_OPEN_P);
			setState(678);
			expr(0);
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(679);
				match(T_COMMA);
				setState(680);
				expr(0);
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(686);
			match(T_CLOSE_P);
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

	public static class Assignment_stmt_select_itemContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(HplsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HplsqlParser.T_OPEN_P, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HplsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_COLON() { return getToken(HplsqlParser.T_COLON, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Assignment_stmt_select_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_select_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAssignment_stmt_select_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAssignment_stmt_select_item(this);
		}
	}

	public final Assignment_stmt_select_itemContext assignment_stmt_select_item() throws RecognitionException {
		Assignment_stmt_select_itemContext _localctx = new Assignment_stmt_select_itemContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignment_stmt_select_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_AND:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DESC:
			case T_DIR:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_END:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FIELDS:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GLOBAL:
			case T_GO:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_IDENTITY:
			case T_IF:
			case T_IMMEDIATE:
			case T_IN:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MAX:
			case T_MAXTRANS:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUIT:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SETS:
			case T_SHARE:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLWARNING:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBSTRING:
			case T_SUM:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRUE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
			case L_CHARS:
				{
				setState(688);
				ident();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(689);
				match(T_OPEN_P);
				setState(690);
				ident();
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(691);
					match(T_COMMA);
					setState(692);
					ident();
					}
					}
					setState(697);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(698);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(702);
				match(T_COLON);
				}
			}

			setState(705);
			match(T_EQUAL);
			setState(706);
			match(T_OPEN_P);
			setState(707);
			select_stmt();
			setState(708);
			match(T_CLOSE_P);
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

	public static class Associate_locator_stmtContext extends ParserRuleContext {
		public TerminalNode T_ASSOCIATE() { return getToken(HplsqlParser.T_ASSOCIATE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_LOCATOR() { return getToken(HplsqlParser.T_LOCATOR, 0); }
		public TerminalNode T_LOCATORS() { return getToken(HplsqlParser.T_LOCATORS, 0); }
		public TerminalNode T_RESULT() { return getToken(HplsqlParser.T_RESULT, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Associate_locator_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associate_locator_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterAssociate_locator_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitAssociate_locator_stmt(this);
		}
	}

	public final Associate_locator_stmtContext associate_locator_stmt() throws RecognitionException {
		Associate_locator_stmtContext _localctx = new Associate_locator_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_associate_locator_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(T_ASSOCIATE);
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_RESULT) {
				{
				setState(711);
				match(T_RESULT);
				setState(712);
				match(T_SET);
				}
			}

			setState(715);
			_la = _input.LA(1);
			if ( !(_la==T_LOCATOR || _la==T_LOCATORS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(716);
			match(T_OPEN_P);
			setState(717);
			ident();
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(718);
				match(T_COMMA);
				setState(719);
				ident();
				}
				}
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(725);
			match(T_CLOSE_P);
			setState(726);
			match(T_WITH);
			setState(727);
			match(T_PROCEDURE);
			setState(728);
			ident();
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

	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode T_BREAK() { return getToken(HplsqlParser.T_BREAK, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBreak_stmt(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(T_BREAK);
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

	public static class Call_stmtContext extends ParserRuleContext {
		public TerminalNode T_CALL() { return getToken(HplsqlParser.T_CALL, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public Call_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCall_stmt(this);
		}
	}

	public final Call_stmtContext call_stmt() throws RecognitionException {
		Call_stmtContext _localctx = new Call_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_call_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(T_CALL);
			setState(733);
			ident();
			setState(740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(734);
				match(T_OPEN_P);
				setState(736);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(735);
					expr_func_params();
					}
					break;
				}
				setState(738);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(739);
				expr_func_params();
				}
				break;
			}
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

	public static class Close_stmtContext extends ParserRuleContext {
		public TerminalNode T_CLOSE() { return getToken(HplsqlParser.T_CLOSE, 0); }
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public Close_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterClose_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitClose_stmt(this);
		}
	}

	public final Close_stmtContext close_stmt() throws RecognitionException {
		Close_stmtContext _localctx = new Close_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_close_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			match(T_CLOSE);
			setState(743);
			match(L_ID);
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

	public static class Declare_stmtContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(HplsqlParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Declare_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_stmt(this);
		}
	}

	public final Declare_stmtContext declare_stmt() throws RecognitionException {
		Declare_stmtContext _localctx = new Declare_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_declare_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(T_DECLARE);
			setState(746);
			declare_stmt_item();
			setState(751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(747);
					match(T_COMMA);
					setState(748);
					declare_stmt_item();
					}
					} 
				}
				setState(753);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
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

	public static class Declare_blockContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(HplsqlParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public Declare_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_block(this);
		}
	}

	public final Declare_blockContext declare_block() throws RecognitionException {
		Declare_blockContext _localctx = new Declare_blockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declare_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(T_DECLARE);
			setState(755);
			declare_stmt_item();
			setState(756);
			match(T_SEMICOLON);
			setState(762);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(757);
					declare_stmt_item();
					setState(758);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(764);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
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

	public static class Declare_block_inplaceContext extends ParserRuleContext {
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public Declare_block_inplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block_inplace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_block_inplace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_block_inplace(this);
		}
	}

	public final Declare_block_inplaceContext declare_block_inplace() throws RecognitionException {
		Declare_block_inplaceContext _localctx = new Declare_block_inplaceContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declare_block_inplace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			declare_stmt_item();
			setState(766);
			match(T_SEMICOLON);
			setState(772);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(767);
					declare_stmt_item();
					setState(768);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(774);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
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

	public static class Declare_stmt_itemContext extends ParserRuleContext {
		public Declare_condition_itemContext declare_condition_item() {
			return getRuleContext(Declare_condition_itemContext.class,0);
		}
		public Declare_handler_itemContext declare_handler_item() {
			return getRuleContext(Declare_handler_itemContext.class,0);
		}
		public Declare_var_itemContext declare_var_item() {
			return getRuleContext(Declare_var_itemContext.class,0);
		}
		public Declare_temporary_table_itemContext declare_temporary_table_item() {
			return getRuleContext(Declare_temporary_table_itemContext.class,0);
		}
		public Declare_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_stmt_item(this);
		}
	}

	public final Declare_stmt_itemContext declare_stmt_item() throws RecognitionException {
		Declare_stmt_itemContext _localctx = new Declare_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_declare_stmt_item);
		try {
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(775);
				declare_condition_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				declare_handler_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(777);
				declare_var_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(778);
				declare_temporary_table_item();
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

	public static class Declare_var_itemContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_CONSTANT() { return getToken(HplsqlParser.T_CONSTANT, 0); }
		public Declare_var_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_var_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_var_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_var_item(this);
		}
	}

	public final Declare_var_itemContext declare_var_item() throws RecognitionException {
		Declare_var_itemContext _localctx = new Declare_var_itemContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_declare_var_item);
		int _la;
		try {
			int _alt;
			setState(816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				ident();
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(782);
					match(T_COMMA);
					setState(783);
					ident();
					}
					}
					setState(788);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(790);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(789);
					match(T_AS);
					}
					break;
				}
				setState(792);
				dtype();
				setState(794);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(793);
					dtype_len();
					}
					break;
				}
				setState(799);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(796);
						dtype_attr();
						}
						} 
					}
					setState(801);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(803);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(802);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				ident();
				setState(806);
				match(T_CONSTANT);
				setState(808);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(807);
					match(T_AS);
					}
					break;
				}
				setState(810);
				dtype();
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(811);
					dtype_len();
					}
				}

				setState(814);
				dtype_default();
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

	public static class Declare_condition_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CONDITION() { return getToken(HplsqlParser.T_CONDITION, 0); }
		public Declare_condition_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_condition_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_condition_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_condition_item(this);
		}
	}

	public final Declare_condition_itemContext declare_condition_item() throws RecognitionException {
		Declare_condition_itemContext _localctx = new Declare_condition_itemContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_declare_condition_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			ident();
			setState(819);
			match(T_CONDITION);
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

	public static class Declare_handler_itemContext extends ParserRuleContext {
		public TerminalNode T_HANDLER() { return getToken(HplsqlParser.T_HANDLER, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_CONTINUE() { return getToken(HplsqlParser.T_CONTINUE, 0); }
		public TerminalNode T_EXIT() { return getToken(HplsqlParser.T_EXIT, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(HplsqlParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(HplsqlParser.T_SQLWARNING, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_FOUND() { return getToken(HplsqlParser.T_FOUND, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Declare_handler_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_handler_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_handler_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_handler_item(this);
		}
	}

	public final Declare_handler_itemContext declare_handler_item() throws RecognitionException {
		Declare_handler_itemContext _localctx = new Declare_handler_itemContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_declare_handler_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			_la = _input.LA(1);
			if ( !(_la==T_CONTINUE || _la==T_EXIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(822);
			match(T_HANDLER);
			setState(823);
			match(T_FOR);
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(824);
				match(T_SQLEXCEPTION);
				}
				break;
			case 2:
				{
				setState(825);
				match(T_SQLWARNING);
				}
				break;
			case 3:
				{
				setState(826);
				match(T_NOT);
				setState(827);
				match(T_FOUND);
				}
				break;
			case 4:
				{
				setState(828);
				ident();
				}
				break;
			}
			setState(831);
			single_block_stmt();
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

	public static class Declare_temporary_table_itemContext extends ParserRuleContext {
		public TerminalNode T_TEMPORARY() { return getToken(HplsqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_GLOBAL() { return getToken(HplsqlParser.T_GLOBAL, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Declare_temporary_table_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_temporary_table_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_temporary_table_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_temporary_table_item(this);
		}
	}

	public final Declare_temporary_table_itemContext declare_temporary_table_item() throws RecognitionException {
		Declare_temporary_table_itemContext _localctx = new Declare_temporary_table_itemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_declare_temporary_table_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_GLOBAL) {
				{
				setState(833);
				match(T_GLOBAL);
				}
			}

			setState(836);
			match(T_TEMPORARY);
			setState(837);
			match(T_TABLE);
			setState(838);
			ident();
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(839);
				create_table_preoptions();
				}
			}

			setState(842);
			create_table_definition();
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

	public static class Create_type_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_TYPE() { return getToken(HplsqlParser.T_TYPE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_type_definitionContext create_type_definition() {
			return getRuleContext(Create_type_definitionContext.class,0);
		}
		public Create_type_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_type_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_type_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_type_stmt(this);
		}
	}

	public final Create_type_stmtContext create_type_stmt() throws RecognitionException {
		Create_type_stmtContext _localctx = new Create_type_stmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_create_type_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(T_CREATE);
			setState(845);
			match(T_TYPE);
			setState(846);
			table_name();
			setState(847);
			create_type_definition();
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

	public static class Create_type_definitionContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Create_type_itemsContext create_type_items() {
			return getRuleContext(Create_type_itemsContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Create_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_type_definition(this);
		}
	}

	public final Create_type_definitionContext create_type_definition() throws RecognitionException {
		Create_type_definitionContext _localctx = new Create_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_create_type_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(T_OPEN_P);
			setState(850);
			create_type_items();
			setState(851);
			match(T_CLOSE_P);
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

	public static class Create_type_itemsContext extends ParserRuleContext {
		public List<Create_type_items_itemContext> create_type_items_item() {
			return getRuleContexts(Create_type_items_itemContext.class);
		}
		public Create_type_items_itemContext create_type_items_item(int i) {
			return getRuleContext(Create_type_items_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Create_type_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_type_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_type_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_type_items(this);
		}
	}

	public final Create_type_itemsContext create_type_items() throws RecognitionException {
		Create_type_itemsContext _localctx = new Create_type_itemsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_create_type_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			create_type_items_item();
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(854);
				match(T_COMMA);
				setState(855);
				create_type_items_item();
				}
				}
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Create_type_items_itemContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode T_COLON() { return getToken(HplsqlParser.T_COLON, 0); }
		public Create_type_items_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_type_items_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_type_items_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_type_items_item(this);
		}
	}

	public final Create_type_items_itemContext create_type_items_item() throws RecognitionException {
		Create_type_items_itemContext _localctx = new Create_type_items_itemContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_create_type_items_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			string();
			setState(862);
			match(T_COLON);
			setState(863);
			string();
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_stmt(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			match(T_CREATE);
			setState(866);
			match(T_TABLE);
			setState(870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(867);
				match(T_IF);
				setState(868);
				match(T_NOT);
				setState(869);
				match(T_EXISTS);
				}
				break;
			}
			setState(872);
			table_name();
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(873);
				create_table_preoptions();
				}
			}

			setState(876);
			create_table_definition();
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

	public static class Create_local_temp_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_LOCAL() { return getToken(HplsqlParser.T_LOCAL, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(HplsqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_VOLATILE() { return getToken(HplsqlParser.T_VOLATILE, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_MULTISET() { return getToken(HplsqlParser.T_MULTISET, 0); }
		public Create_local_temp_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_local_temp_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_local_temp_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_local_temp_table_stmt(this);
		}
	}

	public final Create_local_temp_table_stmtContext create_local_temp_table_stmt() throws RecognitionException {
		Create_local_temp_table_stmtContext _localctx = new Create_local_temp_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_create_local_temp_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(T_CREATE);
			setState(885);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(879);
				match(T_LOCAL);
				setState(880);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(881);
					_la = _input.LA(1);
					if ( !(_la==T_MULTISET || _la==T_SET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(884);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(887);
			match(T_TABLE);
			setState(888);
			ident();
			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(889);
				create_table_preoptions();
				}
			}

			setState(892);
			create_table_definition();
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

	public static class Create_table_definitionContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Create_table_columnsContext create_table_columns() {
			return getRuleContext(Create_table_columnsContext.class,0);
		}
		public Create_table_optionsContext create_table_options() {
			return getRuleContext(Create_table_optionsContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Create_table_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_definition(this);
		}
	}

	public final Create_table_definitionContext create_table_definition() throws RecognitionException {
		Create_table_definitionContext _localctx = new Create_table_definitionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_create_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(894);
					match(T_AS);
					}
				}

				setState(897);
				match(T_OPEN_P);
				setState(898);
				select_stmt();
				setState(899);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(901);
					match(T_AS);
					}
				}

				setState(904);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(905);
				match(T_OPEN_P);
				setState(906);
				create_table_columns();
				setState(907);
				match(T_CLOSE_P);
				}
				break;
			}
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(911);
				create_table_options();
				}
				break;
			}
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

	public static class Create_table_columnsContext extends ParserRuleContext {
		public List<Create_table_columns_itemContext> create_table_columns_item() {
			return getRuleContexts(Create_table_columns_itemContext.class);
		}
		public Create_table_columns_itemContext create_table_columns_item(int i) {
			return getRuleContext(Create_table_columns_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Create_table_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_columns(this);
		}
	}

	public final Create_table_columnsContext create_table_columns() throws RecognitionException {
		Create_table_columnsContext _localctx = new Create_table_columnsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_create_table_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			create_table_columns_item();
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(915);
				match(T_COMMA);
				setState(916);
				create_table_columns_item();
				}
				}
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Create_table_columns_itemContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public List<Create_table_column_inline_consContext> create_table_column_inline_cons() {
			return getRuleContexts(Create_table_column_inline_consContext.class);
		}
		public Create_table_column_inline_consContext create_table_column_inline_cons(int i) {
			return getRuleContext(Create_table_column_inline_consContext.class,i);
		}
		public Create_table_column_consContext create_table_column_cons() {
			return getRuleContext(Create_table_column_consContext.class,0);
		}
		public TerminalNode T_CONSTRAINT() { return getToken(HplsqlParser.T_CONSTRAINT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_columns_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_columns_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_columns_item(this);
		}
	}

	public final Create_table_columns_itemContext create_table_columns_item() throws RecognitionException {
		Create_table_columns_itemContext _localctx = new Create_table_columns_itemContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_create_table_columns_item);
		int _la;
		try {
			int _alt;
			setState(944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(922);
				column_name();
				setState(923);
				dtype();
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(924);
					dtype_len();
					}
				}

				setState(930);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(927);
						dtype_attr();
						}
						} 
					}
					setState(932);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DEFAULT - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_IDENTITY - 64)))) != 0) || ((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & ((1L << (T_NOT - 166)) | (1L << (T_NULL - 166)) | (1L << (T_PRIMARY - 166)) | (1L << (T_REFERENCES - 166)))) != 0) || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (T_UNIQUE - 249)) | (1L << (T_WITH - 249)) | (1L << (T_COLON - 249)) | (1L << (T_EQUAL - 249)))) != 0)) {
					{
					{
					setState(933);
					create_table_column_inline_cons();
					}
					}
					setState(938);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(939);
					match(T_CONSTRAINT);
					setState(940);
					ident();
					}
				}

				setState(943);
				create_table_column_cons();
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

	public static class Column_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			ident();
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

	public static class Create_table_column_inline_consContext extends ParserRuleContext {
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HplsqlParser.T_KEY, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HplsqlParser.T_UNIQUE, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HplsqlParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public TerminalNode T_IDENTITY() { return getToken(HplsqlParser.T_IDENTITY, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HplsqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HplsqlParser.L_INT, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HplsqlParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_ENABLE() { return getToken(HplsqlParser.T_ENABLE, 0); }
		public Create_table_column_inline_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_inline_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_column_inline_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_column_inline_cons(this);
		}
	}

	public final Create_table_column_inline_consContext create_table_column_inline_cons() throws RecognitionException {
		Create_table_column_inline_consContext _localctx = new Create_table_column_inline_consContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_create_table_column_inline_cons);
		int _la;
		try {
			setState(980);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(949);
					match(T_NOT);
					}
				}

				setState(952);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(953);
				match(T_PRIMARY);
				setState(954);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(955);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(956);
				match(T_REFERENCES);
				setState(957);
				table_name();
				setState(958);
				match(T_OPEN_P);
				setState(959);
				ident();
				setState(960);
				match(T_CLOSE_P);
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(961);
					create_table_fk_action();
					}
					}
					setState(966);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(967);
				match(T_IDENTITY);
				setState(968);
				match(T_OPEN_P);
				setState(969);
				match(L_INT);
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(970);
					match(T_COMMA);
					setState(971);
					match(L_INT);
					}
					}
					setState(976);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(977);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(978);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(979);
				match(T_ENABLE);
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

	public static class Create_table_column_consContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HplsqlParser.T_KEY, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(HplsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HplsqlParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HplsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_CLUSTERED() { return getToken(HplsqlParser.T_CLUSTERED, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_ENABLE() { return getToken(HplsqlParser.T_ENABLE, 0); }
		public Index_storage_clauseContext index_storage_clause() {
			return getRuleContext(Index_storage_clauseContext.class,0);
		}
		public List<TerminalNode> T_ASC() { return getTokens(HplsqlParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(HplsqlParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(HplsqlParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(HplsqlParser.T_DESC, i);
		}
		public TerminalNode T_FOREIGN() { return getToken(HplsqlParser.T_FOREIGN, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HplsqlParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public Create_table_column_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_column_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_column_cons(this);
		}
	}

	public final Create_table_column_consContext create_table_column_cons() throws RecognitionException {
		Create_table_column_consContext _localctx = new Create_table_column_consContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_create_table_column_cons);
		int _la;
		try {
			setState(1039);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				match(T_PRIMARY);
				setState(983);
				match(T_KEY);
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(984);
					match(T_CLUSTERED);
					}
				}

				setState(987);
				match(T_OPEN_P);
				setState(988);
				ident();
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(989);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(992);
					match(T_COMMA);
					setState(993);
					ident();
					setState(995);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(994);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					setState(1001);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1002);
				match(T_CLOSE_P);
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(1003);
					match(T_ENABLE);
					}
				}

				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1006);
					index_storage_clause();
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1009);
				match(T_FOREIGN);
				setState(1010);
				match(T_KEY);
				setState(1011);
				match(T_OPEN_P);
				setState(1012);
				ident();
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1013);
					match(T_COMMA);
					setState(1014);
					ident();
					}
					}
					setState(1019);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1020);
				match(T_CLOSE_P);
				setState(1021);
				match(T_REFERENCES);
				setState(1022);
				table_name();
				setState(1023);
				match(T_OPEN_P);
				setState(1024);
				ident();
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1025);
					match(T_COMMA);
					setState(1026);
					ident();
					}
					}
					setState(1031);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1032);
				match(T_CLOSE_P);
				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(1033);
					create_table_fk_action();
					}
					}
					setState(1038);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Create_table_fk_actionContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public TerminalNode T_ACTION() { return getToken(HplsqlParser.T_ACTION, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HplsqlParser.T_RESTRICT, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_CASCADE() { return getToken(HplsqlParser.T_CASCADE, 0); }
		public Create_table_fk_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_fk_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_fk_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_fk_action(this);
		}
	}

	public final Create_table_fk_actionContext create_table_fk_action() throws RecognitionException {
		Create_table_fk_actionContext _localctx = new Create_table_fk_actionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_create_table_fk_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			match(T_ON);
			setState(1042);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1043);
				match(T_NO);
				setState(1044);
				match(T_ACTION);
				}
				break;
			case 2:
				{
				setState(1045);
				match(T_RESTRICT);
				}
				break;
			case 3:
				{
				setState(1046);
				match(T_SET);
				setState(1047);
				match(T_NULL);
				}
				break;
			case 4:
				{
				setState(1048);
				match(T_SET);
				setState(1049);
				match(T_DEFAULT);
				}
				break;
			case 5:
				{
				setState(1050);
				match(T_CASCADE);
				}
				break;
			}
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

	public static class Create_table_preoptionsContext extends ParserRuleContext {
		public List<Create_table_preoptions_itemContext> create_table_preoptions_item() {
			return getRuleContexts(Create_table_preoptions_itemContext.class);
		}
		public Create_table_preoptions_itemContext create_table_preoptions_item(int i) {
			return getRuleContext(Create_table_preoptions_itemContext.class,i);
		}
		public Create_table_preoptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_preoptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_preoptions(this);
		}
	}

	public final Create_table_preoptionsContext create_table_preoptions() throws RecognitionException {
		Create_table_preoptionsContext _localctx = new Create_table_preoptionsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_create_table_preoptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1053);
				create_table_preoptions_item();
				}
				}
				setState(1056); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_ROW || _la==T_STORED || _la==T_COMMA );
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

	public static class Create_table_preoptions_itemContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(HplsqlParser.T_COMMA, 0); }
		public Create_table_preoptions_td_itemContext create_table_preoptions_td_item() {
			return getRuleContext(Create_table_preoptions_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_preoptions_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_preoptions_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_preoptions_item(this);
		}
	}

	public final Create_table_preoptions_itemContext create_table_preoptions_item() throws RecognitionException {
		Create_table_preoptions_itemContext _localctx = new Create_table_preoptions_itemContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_create_table_preoptions_item);
		try {
			setState(1061);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				match(T_COMMA);
				setState(1059);
				create_table_preoptions_td_item();
				}
				break;
			case T_ROW:
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1060);
				create_table_options_hive_item();
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

	public static class Create_table_preoptions_td_itemContext extends ParserRuleContext {
		public TerminalNode T_LOG() { return getToken(HplsqlParser.T_LOG, 0); }
		public TerminalNode T_FALLBACK() { return getToken(HplsqlParser.T_FALLBACK, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public Create_table_preoptions_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_preoptions_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_preoptions_td_item(this);
		}
	}

	public final Create_table_preoptions_td_itemContext create_table_preoptions_td_item() throws RecognitionException {
		Create_table_preoptions_td_itemContext _localctx = new Create_table_preoptions_td_itemContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_create_table_preoptions_td_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NO) {
				{
				setState(1063);
				match(T_NO);
				}
			}

			setState(1066);
			_la = _input.LA(1);
			if ( !(_la==T_FALLBACK || _la==T_LOG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Create_table_optionsContext extends ParserRuleContext {
		public List<Create_table_options_itemContext> create_table_options_item() {
			return getRuleContexts(Create_table_options_itemContext.class);
		}
		public Create_table_options_itemContext create_table_options_item(int i) {
			return getRuleContext(Create_table_options_itemContext.class,i);
		}
		public Create_table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options(this);
		}
	}

	public final Create_table_optionsContext create_table_options() throws RecognitionException {
		Create_table_optionsContext _localctx = new Create_table_optionsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_create_table_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1069); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1068);
					create_table_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1071); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Create_table_options_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_COMMIT() { return getToken(HplsqlParser.T_COMMIT, 0); }
		public TerminalNode T_ROWS() { return getToken(HplsqlParser.T_ROWS, 0); }
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public TerminalNode T_PRESERVE() { return getToken(HplsqlParser.T_PRESERVE, 0); }
		public Create_table_options_ora_itemContext create_table_options_ora_item() {
			return getRuleContext(Create_table_options_ora_itemContext.class,0);
		}
		public Create_table_options_db2_itemContext create_table_options_db2_item() {
			return getRuleContext(Create_table_options_db2_itemContext.class,0);
		}
		public Create_table_options_td_itemContext create_table_options_td_item() {
			return getRuleContext(Create_table_options_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item() {
			return getRuleContext(Create_table_options_mssql_itemContext.class,0);
		}
		public Create_table_options_mysql_itemContext create_table_options_mysql_item() {
			return getRuleContext(Create_table_options_mysql_itemContext.class,0);
		}
		public Create_table_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_item(this);
		}
	}

	public final Create_table_options_itemContext create_table_options_item() throws RecognitionException {
		Create_table_options_itemContext _localctx = new Create_table_options_itemContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_create_table_options_item);
		int _la;
		try {
			setState(1083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1073);
				match(T_ON);
				setState(1074);
				match(T_COMMIT);
				setState(1075);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1076);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1077);
				create_table_options_ora_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1078);
				create_table_options_db2_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1079);
				create_table_options_td_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1080);
				create_table_options_hive_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1081);
				create_table_options_mssql_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1082);
				create_table_options_mysql_item();
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

	public static class Create_table_options_ora_itemContext extends ParserRuleContext {
		public TerminalNode T_SEGMENT() { return getToken(HplsqlParser.T_SEGMENT, 0); }
		public TerminalNode T_CREATION() { return getToken(HplsqlParser.T_CREATION, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HplsqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_DEFERRED() { return getToken(HplsqlParser.T_DEFERRED, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HplsqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HplsqlParser.L_INT, i);
		}
		public TerminalNode T_PCTFREE() { return getToken(HplsqlParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(HplsqlParser.T_PCTUSED, 0); }
		public TerminalNode T_INITRANS() { return getToken(HplsqlParser.T_INITRANS, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(HplsqlParser.T_MAXTRANS, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(HplsqlParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_LOGGING() { return getToken(HplsqlParser.T_LOGGING, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(HplsqlParser.T_NOLOGGING, 0); }
		public TerminalNode T_STORAGE() { return getToken(HplsqlParser.T_STORAGE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_TABLESPACE() { return getToken(HplsqlParser.T_TABLESPACE, 0); }
		public Create_table_options_ora_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_ora_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_ora_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_ora_item(this);
		}
	}

	public final Create_table_options_ora_itemContext create_table_options_ora_item() throws RecognitionException {
		Create_table_options_ora_itemContext _localctx = new Create_table_options_ora_itemContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_create_table_options_ora_item);
		int _la;
		try {
			setState(1103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1085);
				match(T_SEGMENT);
				setState(1086);
				match(T_CREATION);
				setState(1087);
				_la = _input.LA(1);
				if ( !(_la==T_DEFERRED || _la==T_IMMEDIATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_INITRANS:
			case T_MAXTRANS:
			case T_PCTFREE:
			case T_PCTUSED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1088);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1089);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1090);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1091);
				_la = _input.LA(1);
				if ( !(_la==T_LOGGING || _la==T_NOLOGGING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_STORAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1092);
				match(T_STORAGE);
				setState(1093);
				match(T_OPEN_P);
				setState(1096); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1096);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T_ACTION:
					case T_AND:
					case T_AS:
					case T_ASC:
					case T_ASSOCIATE:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECT:
					case T_COLLECTION:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_DATABASE:
					case T_DATA:
					case T_DATE:
					case T_DATETIME:
					case T_DAY:
					case T_DAYS:
					case T_DEC:
					case T_DECIMAL:
					case T_DECLARE:
					case T_DEFAULT:
					case T_DEFERRED:
					case T_DEFINED:
					case T_DEFINER:
					case T_DEFINITION:
					case T_DELETE:
					case T_DELIMITED:
					case T_DESC:
					case T_DIR:
					case T_DISTINCT:
					case T_DISTRIBUTE:
					case T_DO:
					case T_DOUBLE:
					case T_DYNAMIC:
					case T_ENABLE:
					case T_END:
					case T_ENGINE:
					case T_ESCAPED:
					case T_EXCEPT:
					case T_EXEC:
					case T_EXECUTE:
					case T_EXCEPTION:
					case T_EXCLUSIVE:
					case T_EXISTS:
					case T_EXIT:
					case T_FALLBACK:
					case T_FALSE:
					case T_FIELDS:
					case T_FLOAT:
					case T_FOR:
					case T_FOREIGN:
					case T_FORMAT:
					case T_FOUND:
					case T_FROM:
					case T_FULL:
					case T_FUNCTION:
					case T_GLOBAL:
					case T_GO:
					case T_GROUP:
					case T_HANDLER:
					case T_HASH:
					case T_HAVING:
					case T_IDENTITY:
					case T_IF:
					case T_IMMEDIATE:
					case T_IN:
					case T_INDEX:
					case T_INITRANS:
					case T_INNER:
					case T_INOUT:
					case T_INT:
					case T_INT2:
					case T_INT4:
					case T_INT8:
					case T_INTEGER:
					case T_INTERSECT:
					case T_INTERVAL:
					case T_INTO:
					case T_INVOKER:
					case T_IS:
					case T_ISOPEN:
					case T_ITEMS:
					case T_JOIN:
					case T_KEEP:
					case T_KEY:
					case T_KEYS:
					case T_LANGUAGE:
					case T_LEAVE:
					case T_LEFT:
					case T_LIKE:
					case T_LIMIT:
					case T_LINES:
					case T_LOCAL:
					case T_LOCATION:
					case T_LOCATOR:
					case T_LOCATORS:
					case T_LOCKS:
					case T_LOG:
					case T_LOGGED:
					case T_LOGGING:
					case T_LOOP:
					case T_MAP:
					case T_MAX:
					case T_MAXTRANS:
					case T_MICROSECOND:
					case T_MICROSECONDS:
					case T_MIN:
					case T_MULTISET:
					case T_NCHAR:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_ORDER:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OWNER:
					case T_PACKAGE:
					case T_PARTITION:
					case T_PCTFREE:
					case T_PCTUSED:
					case T_PRECISION:
					case T_PRESERVE:
					case T_PRIMARY:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUIT:
					case T_REAL:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESTRICT:
					case T_RESULT:
					case T_RESULT_SET_LOCATOR:
					case T_RETURN:
					case T_RETURNS:
					case T_REVERSE:
					case T_RIGHT:
					case T_RLIKE:
					case T_ROW:
					case T_ROWS:
					case T_ROW_COUNT:
					case T_RR:
					case T_RS:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SETS:
					case T_SHARE:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLWARNING:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_STRING:
					case T_SUBSTRING:
					case T_SUM:
					case T_SYS_REFCURSOR:
					case T_TABLE:
					case T_TABLESPACE:
					case T_TEMPORARY:
					case T_TERMINATED:
					case T_TEXTIMAGE_ON:
					case T_THEN:
					case T_TIMESTAMP:
					case T_TITLE:
					case T_TO:
					case T_TOP:
					case T_TRUE:
					case T_UNIQUE:
					case T_UPDATE:
					case T_UR:
					case T_USE:
					case T_USING:
					case T_VALUE:
					case T_VALUES:
					case T_VAR:
					case T_VARCHAR:
					case T_VARCHAR2:
					case T_VARYING:
					case T_VOLATILE:
					case T_WHILE:
					case T_WITH:
					case T_XML:
					case T_YES:
					case T_ACTIVITY_COUNT:
					case T_CUME_DIST:
					case T_CURRENT_DATE:
					case T_CURRENT_TIMESTAMP:
					case T_CURRENT_USER:
					case T_DENSE_RANK:
					case T_FIRST_VALUE:
					case T_LAG:
					case T_LAST_VALUE:
					case T_LEAD:
					case T_PART_COUNT:
					case T_PART_LOC:
					case T_RANK:
					case T_ROW_NUMBER:
					case T_STDEV:
					case T_SYSDATE:
					case T_VARIANCE:
					case T_USER:
					case L_ID:
					case L_CHARS:
						{
						setState(1094);
						ident();
						}
						break;
					case L_INT:
						{
						setState(1095);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1098); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T_ACTION - 6)) | (1L << (T_AND - 6)) | (1L << (T_AS - 6)) | (1L << (T_ASC - 6)) | (1L << (T_ASSOCIATE - 6)) | (1L << (T_AT - 6)) | (1L << (T_AUTO_INCREMENT - 6)) | (1L << (T_AVG - 6)) | (1L << (T_BEGIN - 6)) | (1L << (T_BETWEEN - 6)) | (1L << (T_BIGINT - 6)) | (1L << (T_BINARY_DOUBLE - 6)) | (1L << (T_BINARY_FLOAT - 6)) | (1L << (T_BIT - 6)) | (1L << (T_BODY - 6)) | (1L << (T_BREAK - 6)) | (1L << (T_BY - 6)) | (1L << (T_BYTE - 6)) | (1L << (T_CALL - 6)) | (1L << (T_CASCADE - 6)) | (1L << (T_CASE - 6)) | (1L << (T_CASESPECIFIC - 6)) | (1L << (T_CAST - 6)) | (1L << (T_CHAR - 6)) | (1L << (T_CHARACTER - 6)) | (1L << (T_CHARSET - 6)) | (1L << (T_CLOSE - 6)) | (1L << (T_CLUSTERED - 6)) | (1L << (T_CMP - 6)) | (1L << (T_COLLECT - 6)) | (1L << (T_COLLECTION - 6)) | (1L << (T_COMMENT - 6)) | (1L << (T_CONSTANT - 6)) | (1L << (T_COMPRESS - 6)) | (1L << (T_CONCAT - 6)) | (1L << (T_CONDITION - 6)) | (1L << (T_CONSTRAINT - 6)) | (1L << (T_CONTINUE - 6)) | (1L << (T_COUNT - 6)) | (1L << (T_COUNT_BIG - 6)) | (1L << (T_CREATE - 6)) | (1L << (T_CREATION - 6)) | (1L << (T_CREATOR - 6)) | (1L << (T_CS - 6)) | (1L << (T_CURRENT - 6)) | (1L << (T_DATABASE - 6)) | (1L << (T_DATA - 6)) | (1L << (T_DATE - 6)) | (1L << (T_DATETIME - 6)) | (1L << (T_DAY - 6)) | (1L << (T_DAYS - 6)) | (1L << (T_DEC - 6)) | (1L << (T_DECIMAL - 6)) | (1L << (T_DECLARE - 6)) | (1L << (T_DEFAULT - 6)) | (1L << (T_DEFERRED - 6)) | (1L << (T_DEFINED - 6)) | (1L << (T_DEFINER - 6)) | (1L << (T_DEFINITION - 6)) | (1L << (T_DELETE - 6)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T_DELIMITED - 70)) | (1L << (T_DESC - 70)) | (1L << (T_DIR - 70)) | (1L << (T_DISTINCT - 70)) | (1L << (T_DISTRIBUTE - 70)) | (1L << (T_DO - 70)) | (1L << (T_DOUBLE - 70)) | (1L << (T_DYNAMIC - 70)) | (1L << (T_ENABLE - 70)) | (1L << (T_END - 70)) | (1L << (T_ENGINE - 70)) | (1L << (T_ESCAPED - 70)) | (1L << (T_EXCEPT - 70)) | (1L << (T_EXEC - 70)) | (1L << (T_EXECUTE - 70)) | (1L << (T_EXCEPTION - 70)) | (1L << (T_EXCLUSIVE - 70)) | (1L << (T_EXISTS - 70)) | (1L << (T_EXIT - 70)) | (1L << (T_FALLBACK - 70)) | (1L << (T_FALSE - 70)) | (1L << (T_FIELDS - 70)) | (1L << (T_FLOAT - 70)) | (1L << (T_FOR - 70)) | (1L << (T_FOREIGN - 70)) | (1L << (T_FORMAT - 70)) | (1L << (T_FOUND - 70)) | (1L << (T_FROM - 70)) | (1L << (T_FULL - 70)) | (1L << (T_FUNCTION - 70)) | (1L << (T_GLOBAL - 70)) | (1L << (T_GO - 70)) | (1L << (T_GROUP - 70)) | (1L << (T_HANDLER - 70)) | (1L << (T_HASH - 70)) | (1L << (T_HAVING - 70)) | (1L << (T_IDENTITY - 70)) | (1L << (T_IF - 70)) | (1L << (T_IMMEDIATE - 70)) | (1L << (T_IN - 70)) | (1L << (T_INDEX - 70)) | (1L << (T_INITRANS - 70)) | (1L << (T_INNER - 70)) | (1L << (T_INOUT - 70)) | (1L << (T_INT - 70)) | (1L << (T_INT2 - 70)) | (1L << (T_INT4 - 70)) | (1L << (T_INT8 - 70)) | (1L << (T_INTEGER - 70)) | (1L << (T_INTERSECT - 70)) | (1L << (T_INTERVAL - 70)) | (1L << (T_INTO - 70)) | (1L << (T_INVOKER - 70)) | (1L << (T_IS - 70)) | (1L << (T_ISOPEN - 70)) | (1L << (T_ITEMS - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (T_JOIN - 134)) | (1L << (T_KEEP - 134)) | (1L << (T_KEY - 134)) | (1L << (T_KEYS - 134)) | (1L << (T_LANGUAGE - 134)) | (1L << (T_LEAVE - 134)) | (1L << (T_LEFT - 134)) | (1L << (T_LIKE - 134)) | (1L << (T_LIMIT - 134)) | (1L << (T_LINES - 134)) | (1L << (T_LOCAL - 134)) | (1L << (T_LOCATION - 134)) | (1L << (T_LOCATOR - 134)) | (1L << (T_LOCATORS - 134)) | (1L << (T_LOCKS - 134)) | (1L << (T_LOG - 134)) | (1L << (T_LOGGED - 134)) | (1L << (T_LOGGING - 134)) | (1L << (T_LOOP - 134)) | (1L << (T_MAP - 134)) | (1L << (T_MAX - 134)) | (1L << (T_MAXTRANS - 134)) | (1L << (T_MICROSECOND - 134)) | (1L << (T_MICROSECONDS - 134)) | (1L << (T_MIN - 134)) | (1L << (T_MULTISET - 134)) | (1L << (T_NCHAR - 134)) | (1L << (T_NVARCHAR - 134)) | (1L << (T_NO - 134)) | (1L << (T_NOCOMPRESS - 134)) | (1L << (T_NOLOGGING - 134)) | (1L << (T_NOT - 134)) | (1L << (T_NOTFOUND - 134)) | (1L << (T_NUMERIC - 134)) | (1L << (T_NUMBER - 134)) | (1L << (T_ON - 134)) | (1L << (T_ONLY - 134)) | (1L << (T_OPEN - 134)) | (1L << (T_OR - 134)) | (1L << (T_ORDER - 134)) | (1L << (T_OUT - 134)) | (1L << (T_OUTER - 134)) | (1L << (T_OVER - 134)) | (1L << (T_OWNER - 134)) | (1L << (T_PACKAGE - 134)) | (1L << (T_PARTITION - 134)) | (1L << (T_PCTFREE - 134)) | (1L << (T_PCTUSED - 134)) | (1L << (T_PRECISION - 134)) | (1L << (T_PRESERVE - 134)) | (1L << (T_PRIMARY - 134)) | (1L << (T_PROC - 134)) | (1L << (T_PROCEDURE - 134)) | (1L << (T_QUALIFY - 134)) | (1L << (T_QUIT - 134)) | (1L << (T_REAL - 134)) | (1L << (T_REFERENCES - 134)) | (1L << (T_REGEXP - 134)) | (1L << (T_REPLACE - 134)) | (1L << (T_RESTRICT - 134)) | (1L << (T_RESULT - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (T_RESULT_SET_LOCATOR - 198)) | (1L << (T_RETURN - 198)) | (1L << (T_RETURNS - 198)) | (1L << (T_REVERSE - 198)) | (1L << (T_RIGHT - 198)) | (1L << (T_RLIKE - 198)) | (1L << (T_ROW - 198)) | (1L << (T_ROWS - 198)) | (1L << (T_ROW_COUNT - 198)) | (1L << (T_RR - 198)) | (1L << (T_RS - 198)) | (1L << (T_TRIM - 198)) | (1L << (T_SCHEMA - 198)) | (1L << (T_SECOND - 198)) | (1L << (T_SECONDS - 198)) | (1L << (T_SECURITY - 198)) | (1L << (T_SEGMENT - 198)) | (1L << (T_SEL - 198)) | (1L << (T_SELECT - 198)) | (1L << (T_SET - 198)) | (1L << (T_SETS - 198)) | (1L << (T_SHARE - 198)) | (1L << (T_SIMPLE_DOUBLE - 198)) | (1L << (T_SIMPLE_FLOAT - 198)) | (1L << (T_SMALLDATETIME - 198)) | (1L << (T_SMALLINT - 198)) | (1L << (T_SQL - 198)) | (1L << (T_SQLEXCEPTION - 198)) | (1L << (T_SQLWARNING - 198)) | (1L << (T_STEP - 198)) | (1L << (T_STORAGE - 198)) | (1L << (T_STORED - 198)) | (1L << (T_STRING - 198)) | (1L << (T_SUBSTRING - 198)) | (1L << (T_SUM - 198)) | (1L << (T_SYS_REFCURSOR - 198)) | (1L << (T_TABLE - 198)) | (1L << (T_TABLESPACE - 198)) | (1L << (T_TEMPORARY - 198)) | (1L << (T_TERMINATED - 198)) | (1L << (T_TEXTIMAGE_ON - 198)) | (1L << (T_THEN - 198)) | (1L << (T_TIMESTAMP - 198)) | (1L << (T_TITLE - 198)) | (1L << (T_TO - 198)) | (1L << (T_TOP - 198)) | (1L << (T_TRUE - 198)) | (1L << (T_UNIQUE - 198)) | (1L << (T_UPDATE - 198)) | (1L << (T_UR - 198)) | (1L << (T_USE - 198)) | (1L << (T_USING - 198)) | (1L << (T_VALUE - 198)) | (1L << (T_VALUES - 198)) | (1L << (T_VAR - 198)) | (1L << (T_VARCHAR - 198)) | (1L << (T_VARCHAR2 - 198)) | (1L << (T_VARYING - 198)) | (1L << (T_VOLATILE - 198)))) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (T_WHILE - 263)) | (1L << (T_WITH - 263)) | (1L << (T_XML - 263)) | (1L << (T_YES - 263)) | (1L << (T_ACTIVITY_COUNT - 263)) | (1L << (T_CUME_DIST - 263)) | (1L << (T_CURRENT_DATE - 263)) | (1L << (T_CURRENT_TIMESTAMP - 263)) | (1L << (T_CURRENT_USER - 263)) | (1L << (T_DENSE_RANK - 263)) | (1L << (T_FIRST_VALUE - 263)) | (1L << (T_LAG - 263)) | (1L << (T_LAST_VALUE - 263)) | (1L << (T_LEAD - 263)) | (1L << (T_PART_COUNT - 263)) | (1L << (T_PART_LOC - 263)) | (1L << (T_RANK - 263)) | (1L << (T_ROW_NUMBER - 263)) | (1L << (T_STDEV - 263)) | (1L << (T_SYSDATE - 263)) | (1L << (T_VARIANCE - 263)) | (1L << (T_USER - 263)) | (1L << (L_ID - 263)) | (1L << (L_INT - 263)) | (1L << (L_CHARS - 263)))) != 0) );
				setState(1100);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1101);
				match(T_TABLESPACE);
				setState(1102);
				ident();
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

	public static class Create_table_options_db2_itemContext extends ParserRuleContext {
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(HplsqlParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public TerminalNode T_HASH() { return getToken(HplsqlParser.T_HASH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_LOGGED() { return getToken(HplsqlParser.T_LOGGED, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(HplsqlParser.T_COMPRESS, 0); }
		public TerminalNode T_YES() { return getToken(HplsqlParser.T_YES, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public TerminalNode T_DEFINITION() { return getToken(HplsqlParser.T_DEFINITION, 0); }
		public TerminalNode T_ONLY() { return getToken(HplsqlParser.T_ONLY, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HplsqlParser.T_RESTRICT, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_DROP() { return getToken(HplsqlParser.T_DROP, 0); }
		public Create_table_options_db2_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_db2_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_db2_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_db2_item(this);
		}
	}

	public final Create_table_options_db2_itemContext create_table_options_db2_item() throws RecognitionException {
		Create_table_options_db2_itemContext _localctx = new Create_table_options_db2_itemContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_create_table_options_db2_item);
		int _la;
		try {
			setState(1138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(1105);
					match(T_INDEX);
					}
				}

				setState(1108);
				match(T_IN);
				setState(1109);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1110);
				match(T_WITH);
				setState(1111);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1112);
				match(T_DISTRIBUTE);
				setState(1113);
				match(T_BY);
				setState(1114);
				match(T_HASH);
				setState(1115);
				match(T_OPEN_P);
				setState(1116);
				ident();
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1117);
					match(T_COMMA);
					setState(1118);
					ident();
					}
					}
					setState(1123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1124);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1126);
					match(T_NOT);
					}
				}

				setState(1129);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1130);
				match(T_COMPRESS);
				setState(1131);
				_la = _input.LA(1);
				if ( !(_la==T_NO || _la==T_YES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1132);
				match(T_DEFINITION);
				setState(1133);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1134);
				match(T_WITH);
				setState(1135);
				match(T_RESTRICT);
				setState(1136);
				match(T_ON);
				setState(1137);
				match(T_DROP);
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

	public static class Create_table_options_td_itemContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HplsqlParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_DATA() { return getToken(HplsqlParser.T_DATA, 0); }
		public Create_table_options_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_td_item(this);
		}
	}

	public final Create_table_options_td_itemContext create_table_options_td_item() throws RecognitionException {
		Create_table_options_td_itemContext _localctx = new Create_table_options_td_itemContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_create_table_options_td_item);
		int _la;
		try {
			setState(1158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(1140);
					match(T_UNIQUE);
					}
				}

				setState(1143);
				match(T_PRIMARY);
				setState(1144);
				match(T_INDEX);
				setState(1145);
				match(T_OPEN_P);
				setState(1146);
				ident();
				setState(1151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1147);
					match(T_COMMA);
					setState(1148);
					ident();
					}
					}
					setState(1153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1154);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1156);
				match(T_WITH);
				setState(1157);
				match(T_DATA);
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

	public static class Create_table_options_hive_itemContext extends ParserRuleContext {
		public Create_table_hive_row_formatContext create_table_hive_row_format() {
			return getRuleContext(Create_table_hive_row_formatContext.class,0);
		}
		public TerminalNode T_STORED() { return getToken(HplsqlParser.T_STORED, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_options_hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_hive_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_hive_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_hive_item(this);
		}
	}

	public final Create_table_options_hive_itemContext create_table_options_hive_item() throws RecognitionException {
		Create_table_options_hive_itemContext _localctx = new Create_table_options_hive_itemContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_create_table_options_hive_item);
		try {
			setState(1164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1160);
				create_table_hive_row_format();
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1161);
				match(T_STORED);
				setState(1162);
				match(T_AS);
				setState(1163);
				ident();
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

	public static class Create_table_hive_row_formatContext extends ParserRuleContext {
		public TerminalNode T_ROW() { return getToken(HplsqlParser.T_ROW, 0); }
		public TerminalNode T_FORMAT() { return getToken(HplsqlParser.T_FORMAT, 0); }
		public TerminalNode T_DELIMITED() { return getToken(HplsqlParser.T_DELIMITED, 0); }
		public List<Create_table_hive_row_format_fieldsContext> create_table_hive_row_format_fields() {
			return getRuleContexts(Create_table_hive_row_format_fieldsContext.class);
		}
		public Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields(int i) {
			return getRuleContext(Create_table_hive_row_format_fieldsContext.class,i);
		}
		public Create_table_hive_row_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_hive_row_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_hive_row_format(this);
		}
	}

	public final Create_table_hive_row_formatContext create_table_hive_row_format() throws RecognitionException {
		Create_table_hive_row_formatContext _localctx = new Create_table_hive_row_formatContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_create_table_hive_row_format);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			match(T_ROW);
			setState(1167);
			match(T_FORMAT);
			setState(1168);
			match(T_DELIMITED);
			setState(1172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1169);
					create_table_hive_row_format_fields();
					}
					} 
				}
				setState(1174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
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

	public static class Create_table_hive_row_format_fieldsContext extends ParserRuleContext {
		public TerminalNode T_FIELDS() { return getToken(HplsqlParser.T_FIELDS, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HplsqlParser.T_TERMINATED, 0); }
		public List<TerminalNode> T_BY() { return getTokens(HplsqlParser.T_BY); }
		public TerminalNode T_BY(int i) {
			return getToken(HplsqlParser.T_BY, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ESCAPED() { return getToken(HplsqlParser.T_ESCAPED, 0); }
		public TerminalNode T_COLLECTION() { return getToken(HplsqlParser.T_COLLECTION, 0); }
		public TerminalNode T_ITEMS() { return getToken(HplsqlParser.T_ITEMS, 0); }
		public TerminalNode T_MAP() { return getToken(HplsqlParser.T_MAP, 0); }
		public TerminalNode T_KEYS() { return getToken(HplsqlParser.T_KEYS, 0); }
		public TerminalNode T_LINES() { return getToken(HplsqlParser.T_LINES, 0); }
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_DEFINED() { return getToken(HplsqlParser.T_DEFINED, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Create_table_hive_row_format_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_hive_row_format_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_hive_row_format_fields(this);
		}
	}

	public final Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields() throws RecognitionException {
		Create_table_hive_row_format_fieldsContext _localctx = new Create_table_hive_row_format_fieldsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_create_table_hive_row_format_fields);
		try {
			setState(1202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1175);
				match(T_FIELDS);
				setState(1176);
				match(T_TERMINATED);
				setState(1177);
				match(T_BY);
				setState(1178);
				expr(0);
				setState(1182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1179);
					match(T_ESCAPED);
					setState(1180);
					match(T_BY);
					setState(1181);
					expr(0);
					}
					break;
				}
				}
				break;
			case T_COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1184);
				match(T_COLLECTION);
				setState(1185);
				match(T_ITEMS);
				setState(1186);
				match(T_TERMINATED);
				setState(1187);
				match(T_BY);
				setState(1188);
				expr(0);
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1189);
				match(T_MAP);
				setState(1190);
				match(T_KEYS);
				setState(1191);
				match(T_TERMINATED);
				setState(1192);
				match(T_BY);
				setState(1193);
				expr(0);
				}
				break;
			case T_LINES:
				enterOuterAlt(_localctx, 4);
				{
				setState(1194);
				match(T_LINES);
				setState(1195);
				match(T_TERMINATED);
				setState(1196);
				match(T_BY);
				setState(1197);
				expr(0);
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1198);
				match(T_NULL);
				setState(1199);
				match(T_DEFINED);
				setState(1200);
				match(T_AS);
				setState(1201);
				expr(0);
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

	public static class Create_table_options_mssql_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(HplsqlParser.T_TEXTIMAGE_ON, 0); }
		public Create_table_options_mssql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mssql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_mssql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_mssql_item(this);
		}
	}

	public final Create_table_options_mssql_itemContext create_table_options_mssql_item() throws RecognitionException {
		Create_table_options_mssql_itemContext _localctx = new Create_table_options_mssql_itemContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_create_table_options_mssql_item);
		try {
			setState(1208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1204);
				match(T_ON);
				setState(1205);
				ident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1206);
				match(T_TEXTIMAGE_ON);
				setState(1207);
				ident();
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

	public static class Create_table_options_mysql_itemContext extends ParserRuleContext {
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HplsqlParser.T_AUTO_INCREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_COMMENT() { return getToken(HplsqlParser.T_COMMENT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HplsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_CHARSET() { return getToken(HplsqlParser.T_CHARSET, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_ENGINE() { return getToken(HplsqlParser.T_ENGINE, 0); }
		public Create_table_options_mysql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mysql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_table_options_mysql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_table_options_mysql_item(this);
		}
	}

	public final Create_table_options_mysql_itemContext create_table_options_mysql_item() throws RecognitionException {
		Create_table_options_mysql_itemContext _localctx = new Create_table_options_mysql_itemContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_create_table_options_mysql_item);
		int _la;
		try {
			setState(1237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1210);
				match(T_AUTO_INCREMENT);
				setState(1212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1211);
					match(T_EQUAL);
					}
				}

				setState(1214);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1215);
				match(T_COMMENT);
				setState(1217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1216);
					match(T_EQUAL);
					}
				}

				setState(1219);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(1220);
					match(T_DEFAULT);
					}
				}

				setState(1226);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(1223);
					match(T_CHARACTER);
					setState(1224);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(1225);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1228);
					match(T_EQUAL);
					}
				}

				setState(1231);
				expr(0);
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1232);
				match(T_ENGINE);
				setState(1234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1233);
					match(T_EQUAL);
					}
				}

				setState(1236);
				expr(0);
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

	public static class DtypeContext extends ParserRuleContext {
		public TerminalNode T_CHAR() { return getToken(HplsqlParser.T_CHAR, 0); }
		public TerminalNode T_BIGINT() { return getToken(HplsqlParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(HplsqlParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(HplsqlParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BINARY_INTEGER() { return getToken(HplsqlParser.T_BINARY_INTEGER, 0); }
		public TerminalNode T_BIT() { return getToken(HplsqlParser.T_BIT, 0); }
		public TerminalNode T_DATE() { return getToken(HplsqlParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(HplsqlParser.T_DATETIME, 0); }
		public TerminalNode T_DEC() { return getToken(HplsqlParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(HplsqlParser.T_DECIMAL, 0); }
		public TerminalNode T_DOUBLE() { return getToken(HplsqlParser.T_DOUBLE, 0); }
		public TerminalNode T_PRECISION() { return getToken(HplsqlParser.T_PRECISION, 0); }
		public TerminalNode T_FLOAT() { return getToken(HplsqlParser.T_FLOAT, 0); }
		public TerminalNode T_INT() { return getToken(HplsqlParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(HplsqlParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(HplsqlParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(HplsqlParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(HplsqlParser.T_INTEGER, 0); }
		public TerminalNode T_NCHAR() { return getToken(HplsqlParser.T_NCHAR, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(HplsqlParser.T_NVARCHAR, 0); }
		public TerminalNode T_NUMBER() { return getToken(HplsqlParser.T_NUMBER, 0); }
		public TerminalNode T_NUMERIC() { return getToken(HplsqlParser.T_NUMERIC, 0); }
		public TerminalNode T_PLS_INTEGER() { return getToken(HplsqlParser.T_PLS_INTEGER, 0); }
		public TerminalNode T_REAL() { return getToken(HplsqlParser.T_REAL, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(HplsqlParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_VARYING() { return getToken(HplsqlParser.T_VARYING, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(HplsqlParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(HplsqlParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_INTEGER() { return getToken(HplsqlParser.T_SIMPLE_INTEGER, 0); }
		public TerminalNode T_SMALLINT() { return getToken(HplsqlParser.T_SMALLINT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(HplsqlParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_STRING() { return getToken(HplsqlParser.T_STRING, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(HplsqlParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HplsqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TINYINT() { return getToken(HplsqlParser.T_TINYINT, 0); }
		public TerminalNode T_VARCHAR() { return getToken(HplsqlParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(HplsqlParser.T_VARCHAR2, 0); }
		public TerminalNode T_XML() { return getToken(HplsqlParser.T_XML, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TYPE() { return getToken(HplsqlParser.T_TYPE, 0); }
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDtype(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_dtype);
		try {
			setState(1284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1239);
				match(T_CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1240);
				match(T_BIGINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1241);
				match(T_BINARY_DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1242);
				match(T_BINARY_FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1243);
				match(T_BINARY_INTEGER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1244);
				match(T_BIT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1245);
				match(T_DATE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1246);
				match(T_DATETIME);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1247);
				match(T_DEC);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1248);
				match(T_DECIMAL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1249);
				match(T_DOUBLE);
				setState(1251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1250);
					match(T_PRECISION);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1253);
				match(T_FLOAT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1254);
				match(T_INT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1255);
				match(T_INT2);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1256);
				match(T_INT4);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1257);
				match(T_INT8);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1258);
				match(T_INTEGER);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1259);
				match(T_NCHAR);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1260);
				match(T_NVARCHAR);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1261);
				match(T_NUMBER);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1262);
				match(T_NUMERIC);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1263);
				match(T_PLS_INTEGER);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1264);
				match(T_REAL);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1265);
				match(T_RESULT_SET_LOCATOR);
				setState(1266);
				match(T_VARYING);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1267);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1268);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1269);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1270);
				match(T_SMALLINT);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1271);
				match(T_SMALLDATETIME);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1272);
				match(T_STRING);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1273);
				match(T_SYS_REFCURSOR);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1274);
				match(T_TIMESTAMP);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1275);
				match(T_TINYINT);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1276);
				match(T_VARCHAR);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1277);
				match(T_VARCHAR2);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1278);
				match(T_XML);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1279);
				ident();
				setState(1282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1280);
					match(T__2);
					{
					setState(1281);
					match(T_TYPE);
					}
					}
					break;
				}
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

	public static class Dtype_lenContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HplsqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HplsqlParser.L_INT, i);
		}
		public TerminalNode T_MAX() { return getToken(HplsqlParser.T_MAX, 0); }
		public TerminalNode T_COMMA() { return getToken(HplsqlParser.T_COMMA, 0); }
		public TerminalNode T_CHAR() { return getToken(HplsqlParser.T_CHAR, 0); }
		public TerminalNode T_BYTE() { return getToken(HplsqlParser.T_BYTE, 0); }
		public Dtype_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDtype_len(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDtype_len(this);
		}
	}

	public final Dtype_lenContext dtype_len() throws RecognitionException {
		Dtype_lenContext _localctx = new Dtype_lenContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_dtype_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			match(T_OPEN_P);
			setState(1287);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(1288);
				_la = _input.LA(1);
				if ( !(_la==T_BYTE || _la==T_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(1291);
				match(T_COMMA);
				setState(1292);
				match(L_INT);
				}
			}

			setState(1295);
			match(T_CLOSE_P);
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

	public static class Dtype_attrContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HplsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CASESPECIFIC() { return getToken(HplsqlParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CS() { return getToken(HplsqlParser.T_CS, 0); }
		public Dtype_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDtype_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDtype_attr(this);
		}
	}

	public final Dtype_attrContext dtype_attr() throws RecognitionException {
		Dtype_attrContext _localctx = new Dtype_attrContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_dtype_attr);
		int _la;
		try {
			setState(1308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1297);
					match(T_NOT);
					}
				}

				setState(1300);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1301);
				match(T_CHARACTER);
				setState(1302);
				match(T_SET);
				setState(1303);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1304);
					match(T_NOT);
					}
				}

				setState(1307);
				_la = _input.LA(1);
				if ( !(_la==T_CASESPECIFIC || _la==T_CS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class Dtype_defaultContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(HplsqlParser.T_COLON, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public Dtype_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDtype_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDtype_default(this);
		}
	}

	public final Dtype_defaultContext dtype_default() throws RecognitionException {
		Dtype_defaultContext _localctx = new Dtype_defaultContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_dtype_default);
		int _la;
		try {
			setState(1322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(1310);
					match(T_COLON);
					}
				}

				setState(1313);
				match(T_EQUAL);
				setState(1314);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1315);
					match(T_WITH);
					}
				}

				setState(1318);
				match(T_DEFAULT);
				setState(1320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1319);
					expr(0);
					}
					break;
				}
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

	public static class Create_database_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DATABASE() { return getToken(HplsqlParser.T_DATABASE, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HplsqlParser.T_SCHEMA, 0); }
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public List<Create_database_optionContext> create_database_option() {
			return getRuleContexts(Create_database_optionContext.class);
		}
		public Create_database_optionContext create_database_option(int i) {
			return getRuleContext(Create_database_optionContext.class,i);
		}
		public Create_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_database_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_database_stmt(this);
		}
	}

	public final Create_database_stmtContext create_database_stmt() throws RecognitionException {
		Create_database_stmtContext _localctx = new Create_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_create_database_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			match(T_CREATE);
			setState(1325);
			_la = _input.LA(1);
			if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1326);
				match(T_IF);
				setState(1327);
				match(T_NOT);
				setState(1328);
				match(T_EXISTS);
				}
				break;
			}
			setState(1331);
			expr(0);
			setState(1335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1332);
					create_database_option();
					}
					} 
				}
				setState(1337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			}
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

	public static class Create_database_optionContext extends ParserRuleContext {
		public TerminalNode T_COMMENT() { return getToken(HplsqlParser.T_COMMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_LOCATION() { return getToken(HplsqlParser.T_LOCATION, 0); }
		public Create_database_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_database_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_database_option(this);
		}
	}

	public final Create_database_optionContext create_database_option() throws RecognitionException {
		Create_database_optionContext _localctx = new Create_database_optionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_create_database_option);
		try {
			setState(1342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1338);
				match(T_COMMENT);
				setState(1339);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1340);
				match(T_LOCATION);
				setState(1341);
				expr(0);
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

	public static class Create_function_stmtContext extends ParserRuleContext {
		public TerminalNode T_FUNCTION() { return getToken(HplsqlParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Create_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_function_stmt(this);
		}
	}

	public final Create_function_stmtContext create_function_stmt() throws RecognitionException {
		Create_function_stmtContext _localctx = new Create_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_create_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1344);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1345);
				match(T_CREATE);
				setState(1348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1346);
					match(T_OR);
					setState(1347);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1350);
				match(T_REPLACE);
				}
				break;
			case T_FUNCTION:
				break;
			default:
				break;
			}
			setState(1353);
			match(T_FUNCTION);
			setState(1354);
			ident();
			setState(1356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1355);
				create_routine_params();
				}
				break;
			}
			setState(1358);
			create_function_return();
			setState(1360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1359);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1362);
				declare_block_inplace();
				}
				break;
			}
			setState(1365);
			single_block_stmt();
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

	public static class Create_function_returnContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(HplsqlParser.T_RETURNS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public Create_function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_function_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_function_return(this);
		}
	}

	public final Create_function_returnContext create_function_return() throws RecognitionException {
		Create_function_returnContext _localctx = new Create_function_returnContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_create_function_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			_la = _input.LA(1);
			if ( !(_la==T_RETURN || _la==T_RETURNS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1368);
			dtype();
			setState(1370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1369);
				dtype_len();
				}
				break;
			}
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

	public static class Create_package_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(HplsqlParser.T_PACKAGE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_specContext package_spec() {
			return getRuleContext(Package_specContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Create_package_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_package_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_package_stmt(this);
		}
	}

	public final Create_package_stmtContext create_package_stmt() throws RecognitionException {
		Create_package_stmtContext _localctx = new Create_package_stmtContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_create_package_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1372);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1373);
				match(T_CREATE);
				setState(1376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1374);
					match(T_OR);
					setState(1375);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1378);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1381);
			match(T_PACKAGE);
			setState(1382);
			ident();
			setState(1383);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1384);
			package_spec();
			setState(1385);
			match(T_END);
			setState(1389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1386);
				ident();
				setState(1387);
				match(T_SEMICOLON);
				}
				break;
			}
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

	public static class Package_specContext extends ParserRuleContext {
		public List<Package_spec_itemContext> package_spec_item() {
			return getRuleContexts(Package_spec_itemContext.class);
		}
		public Package_spec_itemContext package_spec_item(int i) {
			return getRuleContext(Package_spec_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public Package_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterPackage_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitPackage_spec(this);
		}
	}

	public final Package_specContext package_spec() throws RecognitionException {
		Package_specContext _localctx = new Package_specContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_package_spec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			package_spec_item();
			setState(1392);
			match(T_SEMICOLON);
			setState(1398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1393);
					package_spec_item();
					setState(1394);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(1400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			}
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

	public static class Package_spec_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public TerminalNode T_FUNCTION() { return getToken(HplsqlParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(HplsqlParser.T_PROC, 0); }
		public Package_spec_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterPackage_spec_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitPackage_spec_item(this);
		}
	}

	public final Package_spec_itemContext package_spec_item() throws RecognitionException {
		Package_spec_itemContext _localctx = new Package_spec_itemContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_package_spec_item);
		int _la;
		try {
			setState(1414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1401);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1402);
				match(T_FUNCTION);
				setState(1403);
				ident();
				setState(1405);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1404);
					create_routine_params();
					}
					break;
				}
				setState(1407);
				create_function_return();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1409);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1410);
				ident();
				setState(1412);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1411);
					create_routine_params();
					}
					break;
				}
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

	public static class Create_package_body_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(HplsqlParser.T_PACKAGE, 0); }
		public TerminalNode T_BODY() { return getToken(HplsqlParser.T_BODY, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_bodyContext package_body() {
			return getRuleContext(Package_bodyContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Create_package_body_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_body_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_package_body_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_package_body_stmt(this);
		}
	}

	public final Create_package_body_stmtContext create_package_body_stmt() throws RecognitionException {
		Create_package_body_stmtContext _localctx = new Create_package_body_stmtContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_create_package_body_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1416);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1417);
				match(T_CREATE);
				setState(1420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1418);
					match(T_OR);
					setState(1419);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1422);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1425);
			match(T_PACKAGE);
			setState(1426);
			match(T_BODY);
			setState(1427);
			ident();
			setState(1428);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1429);
			package_body();
			setState(1430);
			match(T_END);
			setState(1434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1431);
				ident();
				setState(1432);
				match(T_SEMICOLON);
				}
				break;
			}
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

	public static class Package_bodyContext extends ParserRuleContext {
		public List<Package_body_itemContext> package_body_item() {
			return getRuleContexts(Package_body_itemContext.class);
		}
		public Package_body_itemContext package_body_item(int i) {
			return getRuleContext(Package_body_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public Package_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterPackage_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitPackage_body(this);
		}
	}

	public final Package_bodyContext package_body() throws RecognitionException {
		Package_bodyContext _localctx = new Package_bodyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_package_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
			package_body_item();
			setState(1437);
			match(T_SEMICOLON);
			setState(1443);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1438);
					package_body_item();
					setState(1439);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(1445);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			}
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

	public static class Package_body_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Package_body_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterPackage_body_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitPackage_body_item(this);
		}
	}

	public final Package_body_itemContext package_body_item() throws RecognitionException {
		Package_body_itemContext _localctx = new Package_body_itemContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_package_body_item);
		try {
			setState(1449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1446);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1447);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1448);
				create_procedure_stmt();
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

	public static class Create_procedure_stmtContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Proc_blockContext proc_block() {
			return getRuleContext(Proc_blockContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(HplsqlParser.T_PROC, 0); }
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Create_routine_optionsContext create_routine_options() {
			return getRuleContext(Create_routine_optionsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Create_procedure_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_procedure_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_procedure_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_procedure_stmt(this);
		}
	}

	public final Create_procedure_stmtContext create_procedure_stmt() throws RecognitionException {
		Create_procedure_stmtContext _localctx = new Create_procedure_stmtContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_create_procedure_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1451);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1452);
				match(T_CREATE);
				setState(1455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1453);
					match(T_OR);
					setState(1454);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1457);
				match(T_REPLACE);
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				break;
			default:
				break;
			}
			setState(1460);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1461);
			ident();
			setState(1463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1462);
				create_routine_params();
				}
				break;
			}
			setState(1466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1465);
				create_routine_options();
				}
				break;
			}
			setState(1469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1468);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1471);
				declare_block_inplace();
				}
				break;
			}
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1474);
				label();
				}
				break;
			}
			setState(1477);
			proc_block();
			setState(1481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1478);
				ident();
				setState(1479);
				match(T_SEMICOLON);
				}
				break;
			}
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

	public static class Create_routine_paramsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<Create_routine_param_itemContext> create_routine_param_item() {
			return getRuleContexts(Create_routine_param_itemContext.class);
		}
		public Create_routine_param_itemContext create_routine_param_item(int i) {
			return getRuleContext(Create_routine_param_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Create_routine_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_routine_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_routine_params(this);
		}
	}

	public final Create_routine_paramsContext create_routine_params() throws RecognitionException {
		Create_routine_paramsContext _localctx = new Create_routine_paramsContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_create_routine_params);
		int _la;
		try {
			int _alt;
			setState(1505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1483);
				match(T_OPEN_P);
				setState(1484);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1485);
				match(T_OPEN_P);
				setState(1486);
				create_routine_param_item();
				setState(1491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1487);
					match(T_COMMA);
					setState(1488);
					create_routine_param_item();
					}
					}
					setState(1493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1494);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1496);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") &&
				        _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\r\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") &&\r\n        _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\r\n        ");
				setState(1497);
				create_routine_param_item();
				setState(1502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1498);
						match(T_COMMA);
						setState(1499);
						create_routine_param_item();
						}
						} 
					}
					setState(1504);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
				}
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

	public static class Create_routine_param_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public TerminalNode T_OUT() { return getToken(HplsqlParser.T_OUT, 0); }
		public TerminalNode T_INOUT() { return getToken(HplsqlParser.T_INOUT, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public Create_routine_param_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_param_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_routine_param_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_routine_param_item(this);
		}
	}

	public final Create_routine_param_itemContext create_routine_param_item() throws RecognitionException {
		Create_routine_param_itemContext _localctx = new Create_routine_param_itemContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_create_routine_param_item);
		try {
			int _alt;
			setState(1549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1512);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1507);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1508);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1509);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1510);
					match(T_IN);
					setState(1511);
					match(T_OUT);
					}
					break;
				}
				setState(1514);
				ident();
				setState(1515);
				dtype();
				setState(1517);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1516);
					dtype_len();
					}
					break;
				}
				setState(1522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1519);
						dtype_attr();
						}
						} 
					}
					setState(1524);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				}
				setState(1526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1525);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1528);
				ident();
				setState(1534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1529);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1530);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1531);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1532);
					match(T_IN);
					setState(1533);
					match(T_OUT);
					}
					break;
				}
				setState(1536);
				dtype();
				setState(1538);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1537);
					dtype_len();
					}
					break;
				}
				setState(1543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1540);
						dtype_attr();
						}
						} 
					}
					setState(1545);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				}
				setState(1547);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1546);
					dtype_default();
					}
					break;
				}
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

	public static class Create_routine_optionsContext extends ParserRuleContext {
		public List<Create_routine_optionContext> create_routine_option() {
			return getRuleContexts(Create_routine_optionContext.class);
		}
		public Create_routine_optionContext create_routine_option(int i) {
			return getRuleContext(Create_routine_optionContext.class,i);
		}
		public Create_routine_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_routine_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_routine_options(this);
		}
	}

	public final Create_routine_optionsContext create_routine_options() throws RecognitionException {
		Create_routine_optionsContext _localctx = new Create_routine_optionsContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_create_routine_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1552); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1551);
					create_routine_option();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1554); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Create_routine_optionContext extends ParserRuleContext {
		public TerminalNode T_LANGUAGE() { return getToken(HplsqlParser.T_LANGUAGE, 0); }
		public TerminalNode T_SQL() { return getToken(HplsqlParser.T_SQL, 0); }
		public TerminalNode T_SECURITY() { return getToken(HplsqlParser.T_SECURITY, 0); }
		public TerminalNode T_CREATOR() { return getToken(HplsqlParser.T_CREATOR, 0); }
		public TerminalNode T_DEFINER() { return getToken(HplsqlParser.T_DEFINER, 0); }
		public TerminalNode T_INVOKER() { return getToken(HplsqlParser.T_INVOKER, 0); }
		public TerminalNode T_OWNER() { return getToken(HplsqlParser.T_OWNER, 0); }
		public TerminalNode T_RESULT() { return getToken(HplsqlParser.T_RESULT, 0); }
		public TerminalNode T_SETS() { return getToken(HplsqlParser.T_SETS, 0); }
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(HplsqlParser.T_DYNAMIC, 0); }
		public Create_routine_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_routine_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_routine_option(this);
		}
	}

	public final Create_routine_optionContext create_routine_option() throws RecognitionException {
		Create_routine_optionContext _localctx = new Create_routine_optionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_create_routine_option);
		int _la;
		try {
			setState(1567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LANGUAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1556);
				match(T_LANGUAGE);
				setState(1557);
				match(T_SQL);
				}
				break;
			case T_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1558);
				match(T_SQL);
				setState(1559);
				match(T_SECURITY);
				setState(1560);
				_la = _input.LA(1);
				if ( !(_la==T_CREATOR || _la==T_DEFINER || _la==T_INVOKER || _la==T_OWNER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_DYNAMIC:
			case T_RESULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DYNAMIC) {
					{
					setState(1561);
					match(T_DYNAMIC);
					}
				}

				setState(1564);
				match(T_RESULT);
				setState(1565);
				match(T_SETS);
				setState(1566);
				match(L_INT);
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

	public static class Exec_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EXEC() { return getToken(HplsqlParser.T_EXEC, 0); }
		public TerminalNode T_EXECUTE() { return getToken(HplsqlParser.T_EXECUTE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HplsqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_INTO() { return getToken(HplsqlParser.T_INTO, 0); }
		public List<TerminalNode> L_ID() { return getTokens(HplsqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HplsqlParser.L_ID, i);
		}
		public Using_clauseContext using_clause() {
			return getRuleContext(Using_clauseContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Exec_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exec_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExec_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExec_stmt(this);
		}
	}

	public final Exec_stmtContext exec_stmt() throws RecognitionException {
		Exec_stmtContext _localctx = new Exec_stmtContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_exec_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1569);
			_la = _input.LA(1);
			if ( !(_la==T_EXEC || _la==T_EXECUTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1570);
				match(T_IMMEDIATE);
				}
				break;
			}
			setState(1573);
			expr(0);
			setState(1579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1574);
				match(T_OPEN_P);
				setState(1575);
				expr_func_params();
				setState(1576);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1578);
				expr_func_params();
				}
				break;
			}
			setState(1590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1581);
				match(T_INTO);
				setState(1582);
				match(L_ID);
				setState(1587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1583);
						match(T_COMMA);
						setState(1584);
						match(L_ID);
						}
						} 
					}
					setState(1589);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				}
				}
				break;
			}
			setState(1593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1592);
				using_clause();
				}
				break;
			}
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

	public static class If_stmtContext extends ParserRuleContext {
		public If_plsql_stmtContext if_plsql_stmt() {
			return getRuleContext(If_plsql_stmtContext.class,0);
		}
		public If_tsql_stmtContext if_tsql_stmt() {
			return getRuleContext(If_tsql_stmtContext.class,0);
		}
		public If_bteq_stmtContext if_bteq_stmt() {
			return getRuleContext(If_bteq_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_if_stmt);
		try {
			setState(1598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1595);
				if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1596);
				if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1597);
				if_bteq_stmt();
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

	public static class If_plsql_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_IF() { return getTokens(HplsqlParser.T_IF); }
		public TerminalNode T_IF(int i) {
			return getToken(HplsqlParser.T_IF, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public List<Elseif_blockContext> elseif_block() {
			return getRuleContexts(Elseif_blockContext.class);
		}
		public Elseif_blockContext elseif_block(int i) {
			return getRuleContext(Elseif_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_plsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_plsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIf_plsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIf_plsql_stmt(this);
		}
	}

	public final If_plsql_stmtContext if_plsql_stmt() throws RecognitionException {
		If_plsql_stmtContext _localctx = new If_plsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_if_plsql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			match(T_IF);
			setState(1601);
			bool_expr(0);
			setState(1602);
			match(T_THEN);
			setState(1603);
			block();
			setState(1607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1604);
				elseif_block();
				}
				}
				setState(1609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1610);
				else_block();
				}
			}

			setState(1613);
			match(T_END);
			setState(1614);
			match(T_IF);
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

	public static class If_tsql_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<Single_block_stmtContext> single_block_stmt() {
			return getRuleContexts(Single_block_stmtContext.class);
		}
		public Single_block_stmtContext single_block_stmt(int i) {
			return getRuleContext(Single_block_stmtContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public If_tsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_tsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIf_tsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIf_tsql_stmt(this);
		}
	}

	public final If_tsql_stmtContext if_tsql_stmt() throws RecognitionException {
		If_tsql_stmtContext _localctx = new If_tsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_if_tsql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			match(T_IF);
			setState(1617);
			bool_expr(0);
			setState(1618);
			single_block_stmt();
			setState(1621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1619);
				match(T_ELSE);
				setState(1620);
				single_block_stmt();
				}
				break;
			}
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

	public static class If_bteq_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public If_bteq_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_bteq_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIf_bteq_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIf_bteq_stmt(this);
		}
	}

	public final If_bteq_stmtContext if_bteq_stmt() throws RecognitionException {
		If_bteq_stmtContext _localctx = new If_bteq_stmtContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_if_bteq_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623);
			match(T__3);
			setState(1624);
			match(T_IF);
			setState(1625);
			bool_expr(0);
			setState(1626);
			match(T_THEN);
			setState(1627);
			single_block_stmt();
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

	public static class Elseif_blockContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_ELSIF() { return getToken(HplsqlParser.T_ELSIF, 0); }
		public TerminalNode T_ELSEIF() { return getToken(HplsqlParser.T_ELSEIF, 0); }
		public Elseif_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterElseif_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitElseif_block(this);
		}
	}

	public final Elseif_blockContext elseif_block() throws RecognitionException {
		Elseif_blockContext _localctx = new Elseif_blockContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_elseif_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1630);
			bool_expr(0);
			setState(1631);
			match(T_THEN);
			setState(1632);
			block();
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

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitElse_block(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			match(T_ELSE);
			setState(1635);
			block();
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

	public static class Exit_stmtContext extends ParserRuleContext {
		public TerminalNode T_EXIT() { return getToken(HplsqlParser.T_EXIT, 0); }
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode T_WHEN() { return getToken(HplsqlParser.T_WHEN, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Exit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExit_stmt(this);
		}
	}

	public final Exit_stmtContext exit_stmt() throws RecognitionException {
		Exit_stmtContext _localctx = new Exit_stmtContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_exit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			match(T_EXIT);
			setState(1639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1638);
				match(L_ID);
				}
				break;
			}
			setState(1643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1641);
				match(T_WHEN);
				setState(1642);
				bool_expr(0);
				}
				break;
			}
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

	public static class Leave_stmtContext extends ParserRuleContext {
		public TerminalNode T_LEAVE() { return getToken(HplsqlParser.T_LEAVE, 0); }
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public Leave_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leave_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterLeave_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitLeave_stmt(this);
		}
	}

	public final Leave_stmtContext leave_stmt() throws RecognitionException {
		Leave_stmtContext _localctx = new Leave_stmtContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_leave_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1645);
			match(T_LEAVE);
			setState(1647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1646);
				match(L_ID);
				}
				break;
			}
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

	public static class Cmp_stmtContext extends ParserRuleContext {
		public TerminalNode T_CMP() { return getToken(HplsqlParser.T_CMP, 0); }
		public List<Cmp_sourceContext> cmp_source() {
			return getRuleContexts(Cmp_sourceContext.class);
		}
		public Cmp_sourceContext cmp_source(int i) {
			return getRuleContext(Cmp_sourceContext.class,i);
		}
		public TerminalNode T_COMMA() { return getToken(HplsqlParser.T_COMMA, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(HplsqlParser.T_ROW_COUNT, 0); }
		public TerminalNode T_SUM() { return getToken(HplsqlParser.T_SUM, 0); }
		public Cmp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCmp_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCmp_stmt(this);
		}
	}

	public final Cmp_stmtContext cmp_stmt() throws RecognitionException {
		Cmp_stmtContext _localctx = new Cmp_stmtContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_cmp_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			match(T_CMP);
			setState(1650);
			_la = _input.LA(1);
			if ( !(_la==T_ROW_COUNT || _la==T_SUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1651);
			cmp_source();
			setState(1652);
			match(T_COMMA);
			setState(1653);
			cmp_source();
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

	public static class Cmp_sourceContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_AT() { return getToken(HplsqlParser.T_AT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Cmp_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCmp_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCmp_source(this);
		}
	}

	public final Cmp_sourceContext cmp_source() throws RecognitionException {
		Cmp_sourceContext _localctx = new Cmp_sourceContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_cmp_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_AND:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DESC:
			case T_DIR:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_END:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FIELDS:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GLOBAL:
			case T_GO:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_IDENTITY:
			case T_IF:
			case T_IMMEDIATE:
			case T_IN:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MAX:
			case T_MAXTRANS:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUIT:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SETS:
			case T_SHARE:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLWARNING:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBSTRING:
			case T_SUM:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRUE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
			case L_CHARS:
				{
				setState(1655);
				table_name();
				setState(1657);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1656);
					where_clause();
					}
					break;
				}
				}
				break;
			case T_OPEN_P:
				{
				setState(1659);
				match(T_OPEN_P);
				setState(1660);
				select_stmt();
				setState(1661);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1665);
				match(T_AT);
				setState(1666);
				ident();
				}
				break;
			}
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

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<Create_index_colContext> create_index_col() {
			return getRuleContexts(Create_index_colContext.class);
		}
		public Create_index_colContext create_index_col(int i) {
			return getRuleContext(Create_index_colContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HplsqlParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_index_stmt(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			match(T_CREATE);
			setState(1671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(1670);
				match(T_UNIQUE);
				}
			}

			setState(1673);
			match(T_INDEX);
			setState(1674);
			ident();
			setState(1675);
			match(T_ON);
			setState(1676);
			table_name();
			setState(1677);
			match(T_OPEN_P);
			setState(1678);
			create_index_col();
			setState(1683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1679);
				match(T_COMMA);
				setState(1680);
				create_index_col();
				}
				}
				setState(1685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1686);
			match(T_CLOSE_P);
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

	public static class Create_index_colContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ASC() { return getToken(HplsqlParser.T_ASC, 0); }
		public TerminalNode T_DESC() { return getToken(HplsqlParser.T_DESC, 0); }
		public Create_index_colContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCreate_index_col(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCreate_index_col(this);
		}
	}

	public final Create_index_colContext create_index_col() throws RecognitionException {
		Create_index_colContext _localctx = new Create_index_colContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_create_index_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688);
			ident();
			setState(1690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(1689);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

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

	public static class Index_storage_clauseContext extends ParserRuleContext {
		public Index_mssql_storage_clauseContext index_mssql_storage_clause() {
			return getRuleContext(Index_mssql_storage_clauseContext.class,0);
		}
		public Index_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_storage_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIndex_storage_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIndex_storage_clause(this);
		}
	}

	public final Index_storage_clauseContext index_storage_clause() throws RecognitionException {
		Index_storage_clauseContext _localctx = new Index_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_index_storage_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692);
			index_mssql_storage_clause();
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

	public static class Index_mssql_storage_clauseContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(HplsqlParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(HplsqlParser.T_EQUAL, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<Create_table_options_mssql_itemContext> create_table_options_mssql_item() {
			return getRuleContexts(Create_table_options_mssql_itemContext.class);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item(int i) {
			return getRuleContext(Create_table_options_mssql_itemContext.class,i);
		}
		public Index_mssql_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_mssql_storage_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIndex_mssql_storage_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIndex_mssql_storage_clause(this);
		}
	}

	public final Index_mssql_storage_clauseContext index_mssql_storage_clause() throws RecognitionException {
		Index_mssql_storage_clauseContext _localctx = new Index_mssql_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_index_mssql_storage_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			match(T_WITH);
			setState(1695);
			match(T_OPEN_P);
			setState(1696);
			ident();
			setState(1697);
			match(T_EQUAL);
			setState(1698);
			ident();
			setState(1706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1699);
				match(T_COMMA);
				setState(1700);
				ident();
				setState(1701);
				match(T_EQUAL);
				setState(1702);
				ident();
				}
				}
				setState(1708);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1709);
			match(T_CLOSE_P);
			setState(1713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ON || _la==T_TEXTIMAGE_ON) {
				{
				{
				setState(1710);
				create_table_options_mssql_item();
				}
				}
				setState(1715);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Quit_stmtContext extends ParserRuleContext {
		public TerminalNode T_QUIT() { return getToken(HplsqlParser.T_QUIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Quit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterQuit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitQuit_stmt(this);
		}
	}

	public final Quit_stmtContext quit_stmt() throws RecognitionException {
		Quit_stmtContext _localctx = new Quit_stmtContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_quit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(1716);
				match(T__3);
				}
			}

			setState(1719);
			match(T_QUIT);
			setState(1721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1720);
				expr(0);
				}
				break;
			}
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			match(T_RETURN);
			setState(1725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1724);
				expr(0);
				}
				break;
			}
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

	public static class Cpp_function_stmtContext extends ParserRuleContext {
		public Cpp_function_headerContext cpp_function_header() {
			return getRuleContext(Cpp_function_headerContext.class,0);
		}
		public Cpp_function_bodyContext cpp_function_body() {
			return getRuleContext(Cpp_function_bodyContext.class,0);
		}
		public Cpp_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_function_stmt(this);
		}
	}

	public final Cpp_function_stmtContext cpp_function_stmt() throws RecognitionException {
		Cpp_function_stmtContext _localctx = new Cpp_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_cpp_function_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1727);
			cpp_function_header();
			setState(1728);
			cpp_function_body();
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

	public static class Cpp_function_headerContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Cpp_function_params_clauseContext cpp_function_params_clause() {
			return getRuleContext(Cpp_function_params_clauseContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Cpp_function_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_function_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_function_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_function_header(this);
		}
	}

	public final Cpp_function_headerContext cpp_function_header() throws RecognitionException {
		Cpp_function_headerContext _localctx = new Cpp_function_headerContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_cpp_function_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			dtype();
			setState(1731);
			ident();
			setState(1732);
			match(T_OPEN_P);
			setState(1733);
			cpp_function_params_clause();
			setState(1734);
			match(T_CLOSE_P);
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

	public static class Cpp_function_params_clauseContext extends ParserRuleContext {
		public List<Cpp_function_paramContext> cpp_function_param() {
			return getRuleContexts(Cpp_function_paramContext.class);
		}
		public Cpp_function_paramContext cpp_function_param(int i) {
			return getRuleContext(Cpp_function_paramContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Cpp_function_params_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_function_params_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_function_params_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_function_params_clause(this);
		}
	}

	public final Cpp_function_params_clauseContext cpp_function_params_clause() throws RecognitionException {
		Cpp_function_params_clauseContext _localctx = new Cpp_function_params_clauseContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_cpp_function_params_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1736);
			cpp_function_param();
			setState(1741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1737);
				match(T_COMMA);
				setState(1738);
				cpp_function_param();
				}
				}
				setState(1743);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Cpp_function_paramContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Cpp_function_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_function_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_function_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_function_param(this);
		}
	}

	public final Cpp_function_paramContext cpp_function_param() throws RecognitionException {
		Cpp_function_paramContext _localctx = new Cpp_function_paramContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_cpp_function_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			dtype();
			setState(1745);
			ident();
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

	public static class Cpp_function_bodyContext extends ParserRuleContext {
		public TerminalNode T_OPEN_B() { return getToken(HplsqlParser.T_OPEN_B, 0); }
		public TerminalNode T_CLOSE_B() { return getToken(HplsqlParser.T_CLOSE_B, 0); }
		public List<Cpp_body_contentContext> cpp_body_content() {
			return getRuleContexts(Cpp_body_contentContext.class);
		}
		public Cpp_body_contentContext cpp_body_content(int i) {
			return getRuleContext(Cpp_body_contentContext.class,i);
		}
		public Cpp_function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_function_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_function_body(this);
		}
	}

	public final Cpp_function_bodyContext cpp_function_body() throws RecognitionException {
		Cpp_function_bodyContext _localctx = new Cpp_function_bodyContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_cpp_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1747);
			match(T_OPEN_B);
			setState(1751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_FOR || _la==T_IF) {
				{
				{
				setState(1748);
				cpp_body_content();
				}
				}
				setState(1753);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1754);
			match(T_CLOSE_B);
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

	public static class Cpp_if_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Cpp_for_stmt_bodyContext cpp_for_stmt_body() {
			return getRuleContext(Cpp_for_stmt_bodyContext.class,0);
		}
		public List<Cpp_elseif_clauseContext> cpp_elseif_clause() {
			return getRuleContexts(Cpp_elseif_clauseContext.class);
		}
		public Cpp_elseif_clauseContext cpp_elseif_clause(int i) {
			return getRuleContext(Cpp_elseif_clauseContext.class,i);
		}
		public Cpp_else_clauseContext cpp_else_clause() {
			return getRuleContext(Cpp_else_clauseContext.class,0);
		}
		public Cpp_if_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_if_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_if_stmt(this);
		}
	}

	public final Cpp_if_stmtContext cpp_if_stmt() throws RecognitionException {
		Cpp_if_stmtContext _localctx = new Cpp_if_stmtContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_cpp_if_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1756);
			match(T_IF);
			setState(1757);
			match(T_OPEN_P);
			setState(1758);
			bool_expr(0);
			setState(1759);
			match(T_CLOSE_P);
			setState(1760);
			cpp_for_stmt_body();
			setState(1764);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1761);
					cpp_elseif_clause();
					}
					} 
				}
				setState(1766);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			}
			setState(1768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1767);
				cpp_else_clause();
				}
				break;
			}
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

	public static class Cpp_elseif_clauseContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Cpp_for_stmt_bodyContext cpp_for_stmt_body() {
			return getRuleContext(Cpp_for_stmt_bodyContext.class,0);
		}
		public TerminalNode T_ELSIF() { return getToken(HplsqlParser.T_ELSIF, 0); }
		public TerminalNode T_ELSEIF() { return getToken(HplsqlParser.T_ELSEIF, 0); }
		public Cpp_elseif_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_elseif_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_elseif_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_elseif_clause(this);
		}
	}

	public final Cpp_elseif_clauseContext cpp_elseif_clause() throws RecognitionException {
		Cpp_elseif_clauseContext _localctx = new Cpp_elseif_clauseContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_cpp_elseif_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1771);
			match(T_OPEN_P);
			setState(1772);
			bool_expr(0);
			setState(1773);
			match(T_CLOSE_P);
			setState(1774);
			cpp_for_stmt_body();
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

	public static class Cpp_else_clauseContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public Cpp_for_stmt_bodyContext cpp_for_stmt_body() {
			return getRuleContext(Cpp_for_stmt_bodyContext.class,0);
		}
		public Cpp_else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_else_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_else_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_else_clause(this);
		}
	}

	public final Cpp_else_clauseContext cpp_else_clause() throws RecognitionException {
		Cpp_else_clauseContext _localctx = new Cpp_else_clauseContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_cpp_else_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1776);
			match(T_ELSE);
			setState(1777);
			cpp_for_stmt_body();
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

	public static class Cpp_for_stmtContext extends ParserRuleContext {
		public Cpp_for_stmt_headerContext cpp_for_stmt_header() {
			return getRuleContext(Cpp_for_stmt_headerContext.class,0);
		}
		public Cpp_for_stmt_bodyContext cpp_for_stmt_body() {
			return getRuleContext(Cpp_for_stmt_bodyContext.class,0);
		}
		public Cpp_for_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_for_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_for_stmt(this);
		}
	}

	public final Cpp_for_stmtContext cpp_for_stmt() throws RecognitionException {
		Cpp_for_stmtContext _localctx = new Cpp_for_stmtContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_cpp_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			cpp_for_stmt_header();
			setState(1780);
			cpp_for_stmt_body();
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

	public static class Cpp_for_stmt_headerContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Cpp_for_params_clauseContext cpp_for_params_clause() {
			return getRuleContext(Cpp_for_params_clauseContext.class,0);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Cpp_for_stmt_var_incr_caluseContext cpp_for_stmt_var_incr_caluse() {
			return getRuleContext(Cpp_for_stmt_var_incr_caluseContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Cpp_for_stmt_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_for_stmt_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_for_stmt_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_for_stmt_header(this);
		}
	}

	public final Cpp_for_stmt_headerContext cpp_for_stmt_header() throws RecognitionException {
		Cpp_for_stmt_headerContext _localctx = new Cpp_for_stmt_headerContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_cpp_for_stmt_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			match(T_FOR);
			setState(1783);
			match(T_OPEN_P);
			setState(1784);
			cpp_for_params_clause();
			setState(1785);
			match(T_SEMICOLON);
			setState(1786);
			bool_expr(0);
			setState(1787);
			match(T_SEMICOLON);
			setState(1788);
			cpp_for_stmt_var_incr_caluse();
			setState(1789);
			match(T_CLOSE_P);
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

	public static class Cpp_for_params_clauseContext extends ParserRuleContext {
		public List<Cpp_for_paramContext> cpp_for_param() {
			return getRuleContexts(Cpp_for_paramContext.class);
		}
		public Cpp_for_paramContext cpp_for_param(int i) {
			return getRuleContext(Cpp_for_paramContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Cpp_for_params_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_for_params_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_for_params_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_for_params_clause(this);
		}
	}

	public final Cpp_for_params_clauseContext cpp_for_params_clause() throws RecognitionException {
		Cpp_for_params_clauseContext _localctx = new Cpp_for_params_clauseContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_cpp_for_params_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1791);
			cpp_for_param();
			setState(1796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1792);
				match(T_COMMA);
				setState(1793);
				cpp_for_param();
				}
				}
				setState(1798);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Cpp_for_paramContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Cpp_for_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_for_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_for_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_for_param(this);
		}
	}

	public final Cpp_for_paramContext cpp_for_param() throws RecognitionException {
		Cpp_for_paramContext _localctx = new Cpp_for_paramContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_cpp_for_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1799);
				dtype();
				}
				break;
			}
			setState(1802);
			ident();
			setState(1803);
			match(T_EQUAL);
			setState(1804);
			match(L_INT);
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

	public static class Cpp_for_stmt_var_incr_caluseContext extends ParserRuleContext {
		public List<Cpp_for_stmt_var_incr_Context> cpp_for_stmt_var_incr_() {
			return getRuleContexts(Cpp_for_stmt_var_incr_Context.class);
		}
		public Cpp_for_stmt_var_incr_Context cpp_for_stmt_var_incr_(int i) {
			return getRuleContext(Cpp_for_stmt_var_incr_Context.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Cpp_for_stmt_var_incr_caluseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_for_stmt_var_incr_caluse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_for_stmt_var_incr_caluse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_for_stmt_var_incr_caluse(this);
		}
	}

	public final Cpp_for_stmt_var_incr_caluseContext cpp_for_stmt_var_incr_caluse() throws RecognitionException {
		Cpp_for_stmt_var_incr_caluseContext _localctx = new Cpp_for_stmt_var_incr_caluseContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_cpp_for_stmt_var_incr_caluse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			cpp_for_stmt_var_incr_();
			setState(1811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1807);
				match(T_COMMA);
				setState(1808);
				cpp_for_stmt_var_incr_();
				}
				}
				setState(1813);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Cpp_for_stmt_var_incr_Context extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public Cpp_for_stmt_var_incr_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_for_stmt_var_incr_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_for_stmt_var_incr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_for_stmt_var_incr_(this);
		}
	}

	public final Cpp_for_stmt_var_incr_Context cpp_for_stmt_var_incr_() throws RecognitionException {
		Cpp_for_stmt_var_incr_Context _localctx = new Cpp_for_stmt_var_incr_Context(_ctx, getState());
		enterRule(_localctx, 226, RULE_cpp_for_stmt_var_incr_);
		int _la;
		try {
			setState(1837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1814);
				ident();
				setState(1815);
				match(T_ADD);
				setState(1816);
				match(T_ADD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1818);
				ident();
				setState(1819);
				match(T_SUB);
				setState(1820);
				match(T_SUB);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1822);
				ident();
				setState(1823);
				match(T_EQUAL);
				setState(1824);
				match(L_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1826);
				ident();
				setState(1827);
				match(T_EQUAL);
				setState(1828);
				ident();
				setState(1829);
				_la = _input.LA(1);
				if ( !(_la==T__2 || ((((_la - 292)) & ~0x3f) == 0 && ((1L << (_la - 292)) & ((1L << (T_ADD - 292)) | (1L << (T_DIV - 292)) | (1L << (T_MUL - 292)) | (1L << (T_SUB - 292)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1830);
				match(L_INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1832);
				ident();
				setState(1833);
				_la = _input.LA(1);
				if ( !(_la==T__2 || ((((_la - 292)) & ~0x3f) == 0 && ((1L << (_la - 292)) & ((1L << (T_ADD - 292)) | (1L << (T_DIV - 292)) | (1L << (T_MUL - 292)) | (1L << (T_SUB - 292)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1834);
				match(T_EQUAL);
				setState(1835);
				match(L_INT);
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

	public static class Cpp_for_stmt_bodyContext extends ParserRuleContext {
		public TerminalNode T_OPEN_B() { return getToken(HplsqlParser.T_OPEN_B, 0); }
		public TerminalNode T_CLOSE_B() { return getToken(HplsqlParser.T_CLOSE_B, 0); }
		public List<Cpp_body_contentContext> cpp_body_content() {
			return getRuleContexts(Cpp_body_contentContext.class);
		}
		public Cpp_body_contentContext cpp_body_content(int i) {
			return getRuleContext(Cpp_body_contentContext.class,i);
		}
		public Cpp_for_stmt_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_for_stmt_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_for_stmt_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_for_stmt_body(this);
		}
	}

	public final Cpp_for_stmt_bodyContext cpp_for_stmt_body() throws RecognitionException {
		Cpp_for_stmt_bodyContext _localctx = new Cpp_for_stmt_bodyContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_cpp_for_stmt_body);
		int _la;
		try {
			setState(1848);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_OPEN_B:
				enterOuterAlt(_localctx, 1);
				{
				setState(1839);
				match(T_OPEN_B);
				setState(1843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_FOR || _la==T_IF) {
					{
					{
					setState(1840);
					cpp_body_content();
					}
					}
					setState(1845);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1846);
				match(T_CLOSE_B);
				}
				break;
			case T_FOR:
			case T_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1847);
				cpp_body_content();
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

	public static class Cpp_body_contentContext extends ParserRuleContext {
		public Cpp_if_stmtContext cpp_if_stmt() {
			return getRuleContext(Cpp_if_stmtContext.class,0);
		}
		public Cpp_for_stmtContext cpp_for_stmt() {
			return getRuleContext(Cpp_for_stmtContext.class,0);
		}
		public Cpp_body_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_body_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCpp_body_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCpp_body_content(this);
		}
	}

	public final Cpp_body_contentContext cpp_body_content() throws RecognitionException {
		Cpp_body_contentContext _localctx = new Cpp_body_contentContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_cpp_body_content);
		try {
			setState(1852);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1850);
				cpp_if_stmt();
				}
				break;
			case T_FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1851);
				cpp_for_stmt();
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

	public static class While_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_WHILE() { return getTokens(HplsqlParser.T_WHILE); }
		public TerminalNode T_WHILE(int i) {
			return getToken(HplsqlParser.T_WHILE, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_DO() { return getToken(HplsqlParser.T_DO, 0); }
		public List<TerminalNode> T_LOOP() { return getTokens(HplsqlParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(HplsqlParser.T_LOOP, i);
		}
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
			match(T_WHILE);
			setState(1855);
			bool_expr(0);
			setState(1856);
			_la = _input.LA(1);
			if ( !(_la==T_BEGIN || _la==T_DO || _la==T_LOOP || _la==T_THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1857);
			block();
			setState(1858);
			match(T_END);
			setState(1860);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1859);
				_la = _input.LA(1);
				if ( !(_la==T_LOOP || _la==T_WHILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
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

	public static class For_range_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_DOT2() { return getToken(HplsqlParser.T_DOT2, 0); }
		public List<TerminalNode> T_LOOP() { return getTokens(HplsqlParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(HplsqlParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_REVERSE() { return getToken(HplsqlParser.T_REVERSE, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public TerminalNode T_STEP() { return getToken(HplsqlParser.T_STEP, 0); }
		public For_range_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFor_range_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFor_range_stmt(this);
		}
	}

	public final For_range_stmtContext for_range_stmt() throws RecognitionException {
		For_range_stmtContext _localctx = new For_range_stmtContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_for_range_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1862);
			match(T_FOR);
			setState(1863);
			match(L_ID);
			setState(1864);
			match(T_IN);
			setState(1866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1865);
				match(T_REVERSE);
				}
				break;
			}
			setState(1868);
			expr(0);
			setState(1869);
			match(T_DOT2);
			setState(1870);
			expr(0);
			setState(1873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BY || _la==T_STEP) {
				{
				setState(1871);
				_la = _input.LA(1);
				if ( !(_la==T_BY || _la==T_STEP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1872);
				expr(0);
				}
			}

			setState(1875);
			match(T_LOOP);
			setState(1876);
			block();
			setState(1877);
			match(T_END);
			setState(1878);
			match(T_LOOP);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode L_LABEL() { return getToken(HplsqlParser.L_LABEL, 0); }
		public List<TerminalNode> T_LESS() { return getTokens(HplsqlParser.T_LESS); }
		public TerminalNode T_LESS(int i) {
			return getToken(HplsqlParser.T_LESS, i);
		}
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public List<TerminalNode> T_GREATER() { return getTokens(HplsqlParser.T_GREATER); }
		public TerminalNode T_GREATER(int i) {
			return getToken(HplsqlParser.T_GREATER, i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_label);
		try {
			setState(1886);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1880);
				match(L_LABEL);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1881);
				match(T_LESS);
				setState(1882);
				match(T_LESS);
				setState(1883);
				match(L_ID);
				setState(1884);
				match(T_GREATER);
				setState(1885);
				match(T_GREATER);
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

	public static class Using_clauseContext extends ParserRuleContext {
		public TerminalNode T_USING() { return getToken(HplsqlParser.T_USING, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Using_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterUsing_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitUsing_clause(this);
		}
	}

	public final Using_clauseContext using_clause() throws RecognitionException {
		Using_clauseContext _localctx = new Using_clauseContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_using_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1888);
			match(T_USING);
			setState(1889);
			expr(0);
			setState(1894);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1890);
					match(T_COMMA);
					setState(1891);
					expr(0);
					}
					} 
				}
				setState(1896);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			}
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

	public static class Select_stmtContext extends ParserRuleContext {
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_stmt(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_select_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1897);
			fullselect_stmt();
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

	public static class Fullselect_stmtContext extends ParserRuleContext {
		public List<Fullselect_stmt_itemContext> fullselect_stmt_item() {
			return getRuleContexts(Fullselect_stmt_itemContext.class);
		}
		public Fullselect_stmt_itemContext fullselect_stmt_item(int i) {
			return getRuleContext(Fullselect_stmt_itemContext.class,i);
		}
		public List<Fullselect_set_clauseContext> fullselect_set_clause() {
			return getRuleContexts(Fullselect_set_clauseContext.class);
		}
		public Fullselect_set_clauseContext fullselect_set_clause(int i) {
			return getRuleContext(Fullselect_set_clauseContext.class,i);
		}
		public Fullselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFullselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFullselect_stmt(this);
		}
	}

	public final Fullselect_stmtContext fullselect_stmt() throws RecognitionException {
		Fullselect_stmtContext _localctx = new Fullselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_fullselect_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1899);
			fullselect_stmt_item();
			setState(1905);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1900);
					fullselect_set_clause();
					setState(1901);
					fullselect_stmt_item();
					}
					} 
				}
				setState(1907);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			}
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

	public static class Fullselect_stmt_itemContext extends ParserRuleContext {
		public Subselect_stmtContext subselect_stmt() {
			return getRuleContext(Subselect_stmtContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Fullselect_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFullselect_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFullselect_stmt_item(this);
		}
	}

	public final Fullselect_stmt_itemContext fullselect_stmt_item() throws RecognitionException {
		Fullselect_stmt_itemContext _localctx = new Fullselect_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_fullselect_stmt_item);
		try {
			setState(1913);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1908);
				subselect_stmt();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1909);
				match(T_OPEN_P);
				setState(1910);
				fullselect_stmt();
				setState(1911);
				match(T_CLOSE_P);
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

	public static class Fullselect_set_clauseContext extends ParserRuleContext {
		public TerminalNode T_UNION() { return getToken(HplsqlParser.T_UNION, 0); }
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public TerminalNode T_EXCEPT() { return getToken(HplsqlParser.T_EXCEPT, 0); }
		public TerminalNode T_INTERSECT() { return getToken(HplsqlParser.T_INTERSECT, 0); }
		public Fullselect_set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_set_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFullselect_set_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFullselect_set_clause(this);
		}
	}

	public final Fullselect_set_clauseContext fullselect_set_clause() throws RecognitionException {
		Fullselect_set_clauseContext _localctx = new Fullselect_set_clauseContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_fullselect_set_clause);
		int _la;
		try {
			setState(1927);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1915);
				match(T_UNION);
				setState(1917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1916);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1919);
				match(T_EXCEPT);
				setState(1921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1920);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1923);
				match(T_INTERSECT);
				setState(1925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1924);
					match(T_ALL);
					}
				}

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

	public static class Subselect_stmtContext extends ParserRuleContext {
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode T_SELECT() { return getToken(HplsqlParser.T_SELECT, 0); }
		public TerminalNode T_SEL() { return getToken(HplsqlParser.T_SEL, 0); }
		public Into_clauseContext into_clause() {
			return getRuleContext(Into_clauseContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Qualify_clauseContext qualify_clause() {
			return getRuleContext(Qualify_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Select_optionsContext select_options() {
			return getRuleContext(Select_optionsContext.class,0);
		}
		public Subselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSubselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSubselect_stmt(this);
		}
	}

	public final Subselect_stmtContext subselect_stmt() throws RecognitionException {
		Subselect_stmtContext _localctx = new Subselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_subselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1929);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1930);
			select_list();
			setState(1932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(1931);
				into_clause();
				}
				break;
			}
			setState(1935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(1934);
				from_clause();
				}
				break;
			}
			setState(1938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(1937);
				where_clause();
				}
				break;
			}
			setState(1941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(1940);
				group_by_clause();
				}
				break;
			}
			setState(1945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1943);
				having_clause();
				}
				break;
			case 2:
				{
				setState(1944);
				qualify_clause();
				}
				break;
			}
			setState(1948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(1947);
				order_by_clause();
				}
				break;
			}
			setState(1951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1950);
				select_options();
				}
				break;
			}
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

	public static class Select_listContext extends ParserRuleContext {
		public List<Select_list_itemContext> select_list_item() {
			return getRuleContexts(Select_list_itemContext.class);
		}
		public Select_list_itemContext select_list_item(int i) {
			return getRuleContext(Select_list_itemContext.class,i);
		}
		public Select_list_setContext select_list_set() {
			return getRuleContext(Select_list_setContext.class,0);
		}
		public Select_list_limitContext select_list_limit() {
			return getRuleContext(Select_list_limitContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1953);
				select_list_set();
				}
				break;
			}
			setState(1957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(1956);
				select_list_limit();
				}
				break;
			}
			setState(1959);
			select_list_item();
			setState(1964);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1960);
					match(T_COMMA);
					setState(1961);
					select_list_item();
					}
					} 
				}
				setState(1966);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			}
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

	public static class Select_list_setContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HplsqlParser.T_DISTINCT, 0); }
		public Select_list_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list_set(this);
		}
	}

	public final Select_list_setContext select_list_set() throws RecognitionException {
		Select_list_setContext _localctx = new Select_list_setContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_select_list_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1967);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Select_list_limitContext extends ParserRuleContext {
		public TerminalNode T_TOP() { return getToken(HplsqlParser.T_TOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list_limit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list_limit(this);
		}
	}

	public final Select_list_limitContext select_list_limit() throws RecognitionException {
		Select_list_limitContext _localctx = new Select_list_limitContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_select_list_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1969);
			match(T_TOP);
			setState(1970);
			expr(0);
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

	public static class Select_list_itemContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_asteriskContext select_list_asterisk() {
			return getRuleContext(Select_list_asteriskContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public Select_list_aliasContext select_list_alias() {
			return getRuleContext(Select_list_aliasContext.class,0);
		}
		public Select_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list_item(this);
		}
	}

	public final Select_list_itemContext select_list_item() throws RecognitionException {
		Select_list_itemContext _localctx = new Select_list_itemContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_select_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(1975);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(1972);
					ident();
					setState(1973);
					match(T_EQUAL);
					}
					break;
				}
				setState(1977);
				expr(0);
				setState(1979);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1978);
					select_list_alias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1981);
				select_list_asterisk();
				}
				break;
			}
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

	public static class Select_list_aliasContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_TITLE() { return getToken(HplsqlParser.T_TITLE, 0); }
		public TerminalNode L_S_STRING() { return getToken(HplsqlParser.L_S_STRING, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Select_list_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list_alias(this);
		}
	}

	public final Select_list_aliasContext select_list_alias() throws RecognitionException {
		Select_list_aliasContext _localctx = new Select_list_aliasContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_select_list_alias);
		try {
			setState(1993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1984);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") &&
				         !_input.LT(1).getText().equalsIgnoreCase("FROM"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
				setState(1986);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(1985);
					match(T_AS);
					}
					break;
				}
				setState(1988);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1989);
				match(T_OPEN_P);
				setState(1990);
				match(T_TITLE);
				setState(1991);
				match(L_S_STRING);
				setState(1992);
				match(T_CLOSE_P);
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

	public static class Select_list_asteriskContext extends ParserRuleContext {
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public Select_list_asteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_asterisk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_list_asterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_list_asterisk(this);
		}
	}

	public final Select_list_asteriskContext select_list_asterisk() throws RecognitionException {
		Select_list_asteriskContext _localctx = new Select_list_asteriskContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_select_list_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_ID) {
				{
				setState(1995);
				match(L_ID);
				setState(1996);
				match(T__3);
				}
			}

			setState(1999);
			match(T_MUL);
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

	public static class Into_clauseContext extends ParserRuleContext {
		public TerminalNode T_INTO() { return getToken(HplsqlParser.T_INTO, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Into_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_into_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInto_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInto_clause(this);
		}
	}

	public final Into_clauseContext into_clause() throws RecognitionException {
		Into_clauseContext _localctx = new Into_clauseContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_into_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2001);
			match(T_INTO);
			setState(2002);
			ident();
			setState(2007);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2003);
					match(T_COMMA);
					setState(2004);
					ident();
					}
					} 
				}
				setState(2009);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			}
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

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public List<From_join_clauseContext> from_join_clause() {
			return getRuleContexts(From_join_clauseContext.class);
		}
		public From_join_clauseContext from_join_clause(int i) {
			return getRuleContext(From_join_clauseContext.class,i);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_clause(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2010);
			match(T_FROM);
			setState(2011);
			from_table_clause();
			setState(2015);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2012);
					from_join_clause();
					}
					} 
				}
				setState(2017);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			}
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

	public static class From_table_clauseContext extends ParserRuleContext {
		public From_table_name_clauseContext from_table_name_clause() {
			return getRuleContext(From_table_name_clauseContext.class,0);
		}
		public From_subselect_clauseContext from_subselect_clause() {
			return getRuleContext(From_subselect_clauseContext.class,0);
		}
		public From_table_values_clauseContext from_table_values_clause() {
			return getRuleContext(From_table_values_clauseContext.class,0);
		}
		public From_table_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_table_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_table_clause(this);
		}
	}

	public final From_table_clauseContext from_table_clause() throws RecognitionException {
		From_table_clauseContext _localctx = new From_table_clauseContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_from_table_clause);
		try {
			setState(2021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2018);
				from_table_name_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2019);
				from_subselect_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2020);
				from_table_values_clause();
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

	public static class From_table_name_clauseContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_name_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_name_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_table_name_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_table_name_clause(this);
		}
	}

	public final From_table_name_clauseContext from_table_name_clause() throws RecognitionException {
		From_table_name_clauseContext _localctx = new From_table_name_clauseContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2023);
			table_name();
			setState(2025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				setState(2024);
				from_alias_clause();
				}
				break;
			}
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

	public static class From_subselect_clauseContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_subselect_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_subselect_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_subselect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_subselect_clause(this);
		}
	}

	public final From_subselect_clauseContext from_subselect_clause() throws RecognitionException {
		From_subselect_clauseContext _localctx = new From_subselect_clauseContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2027);
			match(T_OPEN_P);
			setState(2028);
			select_stmt();
			setState(2029);
			match(T_CLOSE_P);
			setState(2031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(2030);
				from_alias_clause();
				}
				break;
			}
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

	public static class From_join_clauseContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(HplsqlParser.T_COMMA, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public From_join_type_clauseContext from_join_type_clause() {
			return getRuleContext(From_join_type_clauseContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public From_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_join_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_join_clause(this);
		}
	}

	public final From_join_clauseContext from_join_clause() throws RecognitionException {
		From_join_clauseContext _localctx = new From_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_from_join_clause);
		try {
			setState(2040);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2033);
				match(T_COMMA);
				setState(2034);
				from_table_clause();
				}
				break;
			case T_FULL:
			case T_INNER:
			case T_JOIN:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2035);
				from_join_type_clause();
				setState(2036);
				from_table_clause();
				setState(2037);
				match(T_ON);
				setState(2038);
				bool_expr(0);
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

	public static class From_join_type_clauseContext extends ParserRuleContext {
		public TerminalNode T_JOIN() { return getToken(HplsqlParser.T_JOIN, 0); }
		public TerminalNode T_INNER() { return getToken(HplsqlParser.T_INNER, 0); }
		public TerminalNode T_LEFT() { return getToken(HplsqlParser.T_LEFT, 0); }
		public TerminalNode T_RIGHT() { return getToken(HplsqlParser.T_RIGHT, 0); }
		public TerminalNode T_FULL() { return getToken(HplsqlParser.T_FULL, 0); }
		public TerminalNode T_OUTER() { return getToken(HplsqlParser.T_OUTER, 0); }
		public From_join_type_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_type_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_join_type_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_join_type_clause(this);
		}
	}

	public final From_join_type_clauseContext from_join_type_clause() throws RecognitionException {
		From_join_type_clauseContext _localctx = new From_join_type_clauseContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_from_join_type_clause);
		int _la;
		try {
			setState(2051);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2043);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(2042);
					match(T_INNER);
					}
				}

				setState(2045);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2046);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(2047);
					match(T_OUTER);
					}
				}

				setState(2050);
				match(T_JOIN);
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

	public static class From_table_values_clauseContext extends ParserRuleContext {
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_VALUES() { return getToken(HplsqlParser.T_VALUES, 0); }
		public List<From_table_values_rowContext> from_table_values_row() {
			return getRuleContexts(From_table_values_rowContext.class);
		}
		public From_table_values_rowContext from_table_values_row(int i) {
			return getRuleContext(From_table_values_rowContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_values_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_table_values_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_table_values_clause(this);
		}
	}

	public final From_table_values_clauseContext from_table_values_clause() throws RecognitionException {
		From_table_values_clauseContext _localctx = new From_table_values_clauseContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2053);
			match(T_TABLE);
			setState(2054);
			match(T_OPEN_P);
			setState(2055);
			match(T_VALUES);
			setState(2056);
			from_table_values_row();
			setState(2061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2057);
				match(T_COMMA);
				setState(2058);
				from_table_values_row();
				}
				}
				setState(2063);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2064);
			match(T_CLOSE_P);
			setState(2066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(2065);
				from_alias_clause();
				}
				break;
			}
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

	public static class From_table_values_rowContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public From_table_values_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_table_values_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_table_values_row(this);
		}
	}

	public final From_table_values_rowContext from_table_values_row() throws RecognitionException {
		From_table_values_rowContext _localctx = new From_table_values_rowContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_from_table_values_row);
		int _la;
		try {
			setState(2080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2068);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2069);
				match(T_OPEN_P);
				setState(2070);
				expr(0);
				setState(2075);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2071);
					match(T_COMMA);
					setState(2072);
					expr(0);
					}
					}
					setState(2077);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2078);
				match(T_CLOSE_P);
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

	public static class From_alias_clauseContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<TerminalNode> L_ID() { return getTokens(HplsqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HplsqlParser.L_ID, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public From_alias_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_alias_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFrom_alias_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFrom_alias_clause(this);
		}
	}

	public final From_alias_clauseContext from_alias_clause() throws RecognitionException {
		From_alias_clauseContext _localctx = new From_alias_clauseContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2082);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			         !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			         !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			         !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			         !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			         !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			         !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			         !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(2084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				setState(2083);
				match(T_AS);
				}
				break;
			}
			setState(2086);
			ident();
			setState(2097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2087);
				match(T_OPEN_P);
				setState(2088);
				match(L_ID);
				setState(2093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2089);
					match(T_COMMA);
					setState(2090);
					match(L_ID);
					}
					}
					setState(2095);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2096);
				match(T_CLOSE_P);
				}
				break;
			}
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

	public static class Table_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2099);
			ident();
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

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode T_WHERE() { return getToken(HplsqlParser.T_WHERE, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitWhere_clause(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2101);
			match(T_WHERE);
			setState(2102);
			bool_expr(0);
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

	public static class Group_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_GROUP() { return getToken(HplsqlParser.T_GROUP, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterGroup_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitGroup_by_clause(this);
		}
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2104);
			match(T_GROUP);
			setState(2105);
			match(T_BY);
			setState(2106);
			expr(0);
			setState(2111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2107);
					match(T_COMMA);
					setState(2108);
					expr(0);
					}
					} 
				}
				setState(2113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
			}
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

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode T_HAVING() { return getToken(HplsqlParser.T_HAVING, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitHaving_clause(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2114);
			match(T_HAVING);
			setState(2115);
			bool_expr(0);
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

	public static class Qualify_clauseContext extends ParserRuleContext {
		public TerminalNode T_QUALIFY() { return getToken(HplsqlParser.T_QUALIFY, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Qualify_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualify_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterQualify_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitQualify_clause(this);
		}
	}

	public final Qualify_clauseContext qualify_clause() throws RecognitionException {
		Qualify_clauseContext _localctx = new Qualify_clauseContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2117);
			match(T_QUALIFY);
			setState(2118);
			bool_expr(0);
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

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_ORDER() { return getToken(HplsqlParser.T_ORDER, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_ASC() { return getTokens(HplsqlParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(HplsqlParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(HplsqlParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(HplsqlParser.T_DESC, i);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitOrder_by_clause(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2120);
			match(T_ORDER);
			setState(2121);
			match(T_BY);
			setState(2122);
			expr(0);
			setState(2124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				{
				setState(2123);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(2133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2126);
					match(T_COMMA);
					setState(2127);
					expr(0);
					setState(2129);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
					case 1:
						{
						setState(2128);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					} 
				}
				setState(2135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
			}
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

	public static class Select_optionsContext extends ParserRuleContext {
		public List<Select_options_itemContext> select_options_item() {
			return getRuleContexts(Select_options_itemContext.class);
		}
		public Select_options_itemContext select_options_item(int i) {
			return getRuleContext(Select_options_itemContext.class,i);
		}
		public Select_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_options(this);
		}
	}

	public final Select_optionsContext select_options() throws RecognitionException {
		Select_optionsContext _localctx = new Select_optionsContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_select_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2137); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2136);
					select_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2139); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Select_options_itemContext extends ParserRuleContext {
		public TerminalNode T_LIMIT() { return getToken(HplsqlParser.T_LIMIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_RR() { return getToken(HplsqlParser.T_RR, 0); }
		public TerminalNode T_RS() { return getToken(HplsqlParser.T_RS, 0); }
		public TerminalNode T_CS() { return getToken(HplsqlParser.T_CS, 0); }
		public TerminalNode T_UR() { return getToken(HplsqlParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(HplsqlParser.T_USE, 0); }
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public TerminalNode T_KEEP() { return getToken(HplsqlParser.T_KEEP, 0); }
		public TerminalNode T_LOCKS() { return getToken(HplsqlParser.T_LOCKS, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(HplsqlParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public TerminalNode T_SHARE() { return getToken(HplsqlParser.T_SHARE, 0); }
		public Select_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSelect_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSelect_options_item(this);
		}
	}

	public final Select_options_itemContext select_options_item() throws RecognitionException {
		Select_options_itemContext _localctx = new Select_options_itemContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_select_options_item);
		int _la;
		try {
			setState(2152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2141);
				match(T_LIMIT);
				setState(2142);
				expr(0);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(2143);
				match(T_WITH);
				setState(2144);
				_la = _input.LA(1);
				if ( !(_la==T_CS || ((((_la - 207)) & ~0x3f) == 0 && ((1L << (_la - 207)) & ((1L << (T_RR - 207)) | (1L << (T_RS - 207)) | (1L << (T_UR - 207)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
				case 1:
					{
					setState(2145);
					match(T_USE);
					setState(2146);
					match(T_AND);
					setState(2147);
					match(T_KEEP);
					setState(2148);
					_la = _input.LA(1);
					if ( !(_la==T_EXCLUSIVE || _la==T_SHARE || _la==T_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2149);
					match(T_LOCKS);
					}
					break;
				}
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

	public static class Bool_exprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public Bool_expr_atomContext bool_expr_atom() {
			return getRuleContext(Bool_expr_atomContext.class,0);
		}
		public Bool_expr_logical_operatorContext bool_expr_logical_operator() {
			return getRuleContext(Bool_expr_logical_operatorContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 298;
		enterRecursionRule(_localctx, 298, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				{
				setState(2156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2155);
					match(T_NOT);
					}
				}

				setState(2158);
				match(T_OPEN_P);
				setState(2159);
				bool_expr(0);
				setState(2160);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2162);
				bool_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(2165);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(2166);
					bool_expr_logical_operator();
					setState(2167);
					bool_expr(3);
					}
					} 
				}
				setState(2173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Bool_expr_atomContext extends ParserRuleContext {
		public Bool_expr_unaryContext bool_expr_unary() {
			return getRuleContext(Bool_expr_unaryContext.class,0);
		}
		public Bool_expr_binaryContext bool_expr_binary() {
			return getRuleContext(Bool_expr_binaryContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bool_expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_atom(this);
		}
	}

	public final Bool_expr_atomContext bool_expr_atom() throws RecognitionException {
		Bool_expr_atomContext _localctx = new Bool_expr_atomContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_bool_expr_atom);
		try {
			setState(2177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2174);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2175);
				bool_expr_binary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2176);
				expr(0);
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

	public static class Bool_expr_unaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HplsqlParser.T_BETWEEN, 0); }
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Bool_expr_single_inContext bool_expr_single_in() {
			return getRuleContext(Bool_expr_single_inContext.class,0);
		}
		public Bool_expr_multi_inContext bool_expr_multi_in() {
			return getRuleContext(Bool_expr_multi_inContext.class,0);
		}
		public Bool_expr_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_unary(this);
		}
	}

	public final Bool_expr_unaryContext bool_expr_unary() throws RecognitionException {
		Bool_expr_unaryContext _localctx = new Bool_expr_unaryContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_bool_expr_unary);
		int _la;
		try {
			setState(2202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2179);
				expr(0);
				setState(2180);
				match(T_IS);
				setState(2182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2181);
					match(T_NOT);
					}
				}

				setState(2184);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2186);
				expr(0);
				setState(2187);
				match(T_BETWEEN);
				setState(2188);
				expr(0);
				setState(2189);
				match(T_AND);
				setState(2190);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2192);
					match(T_NOT);
					}
				}

				setState(2195);
				match(T_EXISTS);
				setState(2196);
				match(T_OPEN_P);
				setState(2197);
				select_stmt();
				setState(2198);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2200);
				bool_expr_single_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2201);
				bool_expr_multi_in();
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

	public static class Bool_expr_single_inContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Bool_expr_single_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_single_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_single_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_single_in(this);
		}
	}

	public final Bool_expr_single_inContext bool_expr_single_in() throws RecognitionException {
		Bool_expr_single_inContext _localctx = new Bool_expr_single_inContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2204);
			expr(0);
			setState(2206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2205);
				match(T_NOT);
				}
			}

			setState(2208);
			match(T_IN);
			setState(2209);
			match(T_OPEN_P);
			setState(2219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				{
				setState(2210);
				expr(0);
				setState(2215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2211);
					match(T_COMMA);
					setState(2212);
					expr(0);
					}
					}
					setState(2217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(2218);
				select_stmt();
				}
				break;
			}
			setState(2221);
			match(T_CLOSE_P);
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

	public static class Bool_expr_multi_inContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(HplsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HplsqlParser.T_OPEN_P, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HplsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public Bool_expr_multi_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_multi_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_multi_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_multi_in(this);
		}
	}

	public final Bool_expr_multi_inContext bool_expr_multi_in() throws RecognitionException {
		Bool_expr_multi_inContext _localctx = new Bool_expr_multi_inContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2223);
			match(T_OPEN_P);
			setState(2224);
			expr(0);
			setState(2229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2225);
				match(T_COMMA);
				setState(2226);
				expr(0);
				}
				}
				setState(2231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2232);
			match(T_CLOSE_P);
			setState(2234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2233);
				match(T_NOT);
				}
			}

			setState(2236);
			match(T_IN);
			setState(2237);
			match(T_OPEN_P);
			setState(2238);
			select_stmt();
			setState(2239);
			match(T_CLOSE_P);
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

	public static class Bool_expr_binaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bool_expr_binary_operatorContext bool_expr_binary_operator() {
			return getRuleContext(Bool_expr_binary_operatorContext.class,0);
		}
		public Bool_expr_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_binary(this);
		}
	}

	public final Bool_expr_binaryContext bool_expr_binary() throws RecognitionException {
		Bool_expr_binaryContext _localctx = new Bool_expr_binaryContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2241);
			expr(0);
			setState(2242);
			bool_expr_binary_operator();
			setState(2243);
			expr(0);
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

	public static class Bool_expr_logical_operatorContext extends ParserRuleContext {
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Bool_expr_logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_logical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_logical_operator(this);
		}
	}

	public final Bool_expr_logical_operatorContext bool_expr_logical_operator() throws RecognitionException {
		Bool_expr_logical_operatorContext _localctx = new Bool_expr_logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_bool_expr_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2245);
			_la = _input.LA(1);
			if ( !(_la==T_AND || _la==T_OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Bool_expr_binary_operatorContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_EQUAL2() { return getToken(HplsqlParser.T_EQUAL2, 0); }
		public TerminalNode T_NOTEQUAL() { return getToken(HplsqlParser.T_NOTEQUAL, 0); }
		public TerminalNode T_NOTEQUAL2() { return getToken(HplsqlParser.T_NOTEQUAL2, 0); }
		public TerminalNode T_LESS() { return getToken(HplsqlParser.T_LESS, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(HplsqlParser.T_LESSEQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(HplsqlParser.T_GREATER, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(HplsqlParser.T_GREATEREQUAL, 0); }
		public TerminalNode T_LIKE() { return getToken(HplsqlParser.T_LIKE, 0); }
		public TerminalNode T_RLIKE() { return getToken(HplsqlParser.T_RLIKE, 0); }
		public TerminalNode T_REGEXP() { return getToken(HplsqlParser.T_REGEXP, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public Bool_expr_binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_expr_binary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_expr_binary_operator(this);
		}
	}

	public final Bool_expr_binary_operatorContext bool_expr_binary_operator() throws RecognitionException {
		Bool_expr_binary_operatorContext _localctx = new Bool_expr_binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(2259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2247);
				match(T_EQUAL);
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2248);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2249);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(2250);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(2251);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(2252);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 7);
				{
				setState(2253);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2254);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2255);
					match(T_NOT);
					}
				}

				setState(2258);
				_la = _input.LA(1);
				if ( !(((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (T_LIKE - 141)) | (1L << (T_REGEXP - 141)) | (1L << (T_RLIKE - 141)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_intervalContext expr_interval() {
			return getRuleContext(Expr_intervalContext.class,0);
		}
		public Expr_concatContext expr_concat() {
			return getRuleContext(Expr_concatContext.class,0);
		}
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_cursor_attributeContext expr_cursor_attribute() {
			return getRuleContext(Expr_cursor_attributeContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public TerminalNode T_MUL() { return getToken(HplsqlParser.T_MUL, 0); }
		public TerminalNode T_DIV() { return getToken(HplsqlParser.T_DIV, 0); }
		public TerminalNode T_ADD() { return getToken(HplsqlParser.T_ADD, 0); }
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 314;
		enterRecursionRule(_localctx, 314, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(2262);
				match(T_OPEN_P);
				setState(2263);
				select_stmt();
				setState(2264);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2266);
				match(T_OPEN_P);
				setState(2267);
				expr(0);
				setState(2268);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(2270);
				expr_interval();
				}
				break;
			case 4:
				{
				setState(2271);
				expr_concat();
				}
				break;
			case 5:
				{
				setState(2272);
				expr_case();
				}
				break;
			case 6:
				{
				setState(2273);
				expr_cursor_attribute();
				}
				break;
			case 7:
				{
				setState(2274);
				expr_agg_window_func();
				}
				break;
			case 8:
				{
				setState(2275);
				expr_spec_func();
				}
				break;
			case 9:
				{
				setState(2276);
				expr_func();
				}
				break;
			case 10:
				{
				setState(2277);
				expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2294);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2280);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2281);
						match(T_MUL);
						setState(2282);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2283);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2284);
						match(T_DIV);
						setState(2285);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2286);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2287);
						match(T_ADD);
						setState(2288);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2289);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2290);
						match(T_SUB);
						setState(2291);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2292);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2293);
						interval_item();
						}
						break;
					}
					} 
				}
				setState(2298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_atomContext extends ParserRuleContext {
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public Timestamp_literalContext timestamp_literal() {
			return getRuleContext(Timestamp_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Dec_numberContext dec_number() {
			return getRuleContext(Dec_numberContext.class,0);
		}
		public Int_numberContext int_number() {
			return getRuleContext(Int_numberContext.class,0);
		}
		public Null_constContext null_const() {
			return getRuleContext(Null_constContext.class,0);
		}
		public Expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_atom(this);
		}
	}

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_expr_atom);
		try {
			setState(2307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2299);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2300);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2301);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2302);
				ident();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2303);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2304);
				dec_number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2305);
				int_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2306);
				null_const();
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

	public static class Expr_intervalContext extends ParserRuleContext {
		public TerminalNode T_INTERVAL() { return getToken(HplsqlParser.T_INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public Expr_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_interval(this);
		}
	}

	public final Expr_intervalContext expr_interval() throws RecognitionException {
		Expr_intervalContext _localctx = new Expr_intervalContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2309);
			match(T_INTERVAL);
			setState(2310);
			expr(0);
			setState(2311);
			interval_item();
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

	public static class Interval_itemContext extends ParserRuleContext {
		public TerminalNode T_DAY() { return getToken(HplsqlParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(HplsqlParser.T_DAYS, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(HplsqlParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(HplsqlParser.T_MICROSECONDS, 0); }
		public TerminalNode T_SECOND() { return getToken(HplsqlParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(HplsqlParser.T_SECONDS, 0); }
		public Interval_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInterval_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInterval_item(this);
		}
	}

	public final Interval_itemContext interval_item() throws RecognitionException {
		Interval_itemContext _localctx = new Interval_itemContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2313);
			_la = _input.LA(1);
			if ( !(_la==T_DAY || _la==T_DAYS || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (T_MICROSECOND - 157)) | (1L << (T_MICROSECONDS - 157)) | (1L << (T_SECOND - 157)) | (1L << (T_SECONDS - 157)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Expr_concatContext extends ParserRuleContext {
		public List<Expr_concat_itemContext> expr_concat_item() {
			return getRuleContexts(Expr_concat_itemContext.class);
		}
		public Expr_concat_itemContext expr_concat_item(int i) {
			return getRuleContext(Expr_concat_itemContext.class,i);
		}
		public List<TerminalNode> T_PIPE() { return getTokens(HplsqlParser.T_PIPE); }
		public TerminalNode T_PIPE(int i) {
			return getToken(HplsqlParser.T_PIPE, i);
		}
		public List<TerminalNode> T_CONCAT() { return getTokens(HplsqlParser.T_CONCAT); }
		public TerminalNode T_CONCAT(int i) {
			return getToken(HplsqlParser.T_CONCAT, i);
		}
		public Expr_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_concat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_concat(this);
		}
	}

	public final Expr_concatContext expr_concat() throws RecognitionException {
		Expr_concatContext _localctx = new Expr_concatContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_expr_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2315);
			expr_concat_item();
			setState(2316);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2317);
			expr_concat_item();
			setState(2322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2318);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2319);
					expr_concat_item();
					}
					} 
				}
				setState(2324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			}
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

	public static class Expr_concat_itemContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public Expr_concat_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_concat_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_concat_item(this);
		}
	}

	public final Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		Expr_concat_itemContext _localctx = new Expr_concat_itemContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_expr_concat_item);
		try {
			setState(2334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2325);
				match(T_OPEN_P);
				setState(2326);
				expr(0);
				setState(2327);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2329);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2330);
				expr_agg_window_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2331);
				expr_spec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2332);
				expr_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2333);
				expr_atom();
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

	public static class Expr_caseContext extends ParserRuleContext {
		public Expr_case_simpleContext expr_case_simple() {
			return getRuleContext(Expr_case_simpleContext.class,0);
		}
		public Expr_case_searchedContext expr_case_searched() {
			return getRuleContext(Expr_case_searchedContext.class,0);
		}
		public Expr_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_case(this);
		}
	}

	public final Expr_caseContext expr_case() throws RecognitionException {
		Expr_caseContext _localctx = new Expr_caseContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_expr_case);
		try {
			setState(2338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2336);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2337);
				expr_case_searched();
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

	public static class Expr_case_simpleContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(HplsqlParser.T_CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(HplsqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HplsqlParser.T_WHEN, i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(HplsqlParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(HplsqlParser.T_THEN, i);
		}
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public Expr_case_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_case_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_case_simple(this);
		}
	}

	public final Expr_case_simpleContext expr_case_simple() throws RecognitionException {
		Expr_case_simpleContext _localctx = new Expr_case_simpleContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2340);
			match(T_CASE);
			setState(2341);
			expr(0);
			setState(2347); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2342);
				match(T_WHEN);
				setState(2343);
				expr(0);
				setState(2344);
				match(T_THEN);
				setState(2345);
				expr(0);
				}
				}
				setState(2349); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2351);
				match(T_ELSE);
				setState(2352);
				expr(0);
				}
			}

			setState(2355);
			match(T_END);
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

	public static class Expr_case_searchedContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(HplsqlParser.T_CASE, 0); }
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(HplsqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HplsqlParser.T_WHEN, i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(HplsqlParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(HplsqlParser.T_THEN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public Expr_case_searchedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_searched; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_case_searched(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_case_searched(this);
		}
	}

	public final Expr_case_searchedContext expr_case_searched() throws RecognitionException {
		Expr_case_searchedContext _localctx = new Expr_case_searchedContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2357);
			match(T_CASE);
			setState(2363); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2358);
				match(T_WHEN);
				setState(2359);
				bool_expr(0);
				setState(2360);
				match(T_THEN);
				setState(2361);
				expr(0);
				}
				}
				setState(2365); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2367);
				match(T_ELSE);
				setState(2368);
				expr(0);
				}
			}

			setState(2371);
			match(T_END);
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

	public static class Expr_cursor_attributeContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ISOPEN() { return getToken(HplsqlParser.T_ISOPEN, 0); }
		public TerminalNode T_FOUND() { return getToken(HplsqlParser.T_FOUND, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(HplsqlParser.T_NOTFOUND, 0); }
		public Expr_cursor_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cursor_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_cursor_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_cursor_attribute(this);
		}
	}

	public final Expr_cursor_attributeContext expr_cursor_attribute() throws RecognitionException {
		Expr_cursor_attributeContext _localctx = new Expr_cursor_attributeContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_expr_cursor_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2373);
			ident();
			setState(2374);
			match(T__2);
			setState(2375);
			_la = _input.LA(1);
			if ( !(_la==T_FOUND || _la==T_ISOPEN || _la==T_NOTFOUND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Expr_agg_window_funcContext extends ParserRuleContext {
		public TerminalNode T_AVG() { return getToken(HplsqlParser.T_AVG, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_func_all_distinctContext expr_func_all_distinct() {
			return getRuleContext(Expr_func_all_distinctContext.class,0);
		}
		public Expr_func_over_clauseContext expr_func_over_clause() {
			return getRuleContext(Expr_func_over_clauseContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(HplsqlParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(HplsqlParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(HplsqlParser.T_CUME_DIST, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(HplsqlParser.T_DENSE_RANK, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(HplsqlParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_LAG() { return getToken(HplsqlParser.T_LAG, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_LAST_VALUE() { return getToken(HplsqlParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(HplsqlParser.T_LEAD, 0); }
		public TerminalNode T_MAX() { return getToken(HplsqlParser.T_MAX, 0); }
		public TerminalNode T_MIN() { return getToken(HplsqlParser.T_MIN, 0); }
		public TerminalNode T_RANK() { return getToken(HplsqlParser.T_RANK, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(HplsqlParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_STDEV() { return getToken(HplsqlParser.T_STDEV, 0); }
		public TerminalNode T_SUM() { return getToken(HplsqlParser.T_SUM, 0); }
		public TerminalNode T_VAR() { return getToken(HplsqlParser.T_VAR, 0); }
		public TerminalNode T_VARIANCE() { return getToken(HplsqlParser.T_VARIANCE, 0); }
		public Expr_agg_window_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_agg_window_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_agg_window_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_agg_window_func(this);
		}
	}

	public final Expr_agg_window_funcContext expr_agg_window_func() throws RecognitionException {
		Expr_agg_window_funcContext _localctx = new Expr_agg_window_funcContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(2529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2377);
				match(T_AVG);
				setState(2378);
				match(T_OPEN_P);
				setState(2380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2379);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2382);
				expr(0);
				setState(2383);
				match(T_CLOSE_P);
				setState(2385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2384);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2387);
				match(T_COUNT);
				setState(2388);
				match(T_OPEN_P);
				setState(2394);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ALL:
				case T_AND:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DESC:
				case T_DIR:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_END:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FIELDS:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GLOBAL:
				case T_GO:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_IDENTITY:
				case T_IF:
				case T_IMMEDIATE:
				case T_IN:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MAX:
				case T_MAXTRANS:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUIT:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SETS:
				case T_SHARE:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLWARNING:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBSTRING:
				case T_SUM:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRUE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
				case L_CHARS:
					{
					{
					setState(2390);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
					case 1:
						{
						setState(2389);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2392);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2393);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2396);
				match(T_CLOSE_P);
				setState(2398);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2397);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(2400);
				match(T_COUNT_BIG);
				setState(2401);
				match(T_OPEN_P);
				setState(2407);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ALL:
				case T_AND:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DESC:
				case T_DIR:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_END:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FIELDS:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GLOBAL:
				case T_GO:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_IDENTITY:
				case T_IF:
				case T_IMMEDIATE:
				case T_IN:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MAX:
				case T_MAXTRANS:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUIT:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SETS:
				case T_SHARE:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLWARNING:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBSTRING:
				case T_SUM:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRUE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
				case L_CHARS:
					{
					{
					setState(2403);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
					case 1:
						{
						setState(2402);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2405);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2406);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2409);
				match(T_CLOSE_P);
				setState(2411);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
				case 1:
					{
					setState(2410);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(2413);
				match(T_CUME_DIST);
				setState(2414);
				match(T_OPEN_P);
				setState(2415);
				match(T_CLOSE_P);
				setState(2416);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2417);
				match(T_DENSE_RANK);
				setState(2418);
				match(T_OPEN_P);
				setState(2419);
				match(T_CLOSE_P);
				setState(2420);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2421);
				match(T_FIRST_VALUE);
				setState(2422);
				match(T_OPEN_P);
				setState(2423);
				expr(0);
				setState(2424);
				match(T_CLOSE_P);
				setState(2425);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(2427);
				match(T_LAG);
				setState(2428);
				match(T_OPEN_P);
				setState(2429);
				expr(0);
				setState(2436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2430);
					match(T_COMMA);
					setState(2431);
					expr(0);
					setState(2434);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2432);
						match(T_COMMA);
						setState(2433);
						expr(0);
						}
					}

					}
				}

				setState(2438);
				match(T_CLOSE_P);
				setState(2439);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2441);
				match(T_LAST_VALUE);
				setState(2442);
				match(T_OPEN_P);
				setState(2443);
				expr(0);
				setState(2444);
				match(T_CLOSE_P);
				setState(2445);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(2447);
				match(T_LEAD);
				setState(2448);
				match(T_OPEN_P);
				setState(2449);
				expr(0);
				setState(2456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2450);
					match(T_COMMA);
					setState(2451);
					expr(0);
					setState(2454);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2452);
						match(T_COMMA);
						setState(2453);
						expr(0);
						}
					}

					}
				}

				setState(2458);
				match(T_CLOSE_P);
				setState(2459);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(2461);
				match(T_MAX);
				setState(2462);
				match(T_OPEN_P);
				setState(2464);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
				case 1:
					{
					setState(2463);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2466);
				expr(0);
				setState(2467);
				match(T_CLOSE_P);
				setState(2469);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
				case 1:
					{
					setState(2468);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(2471);
				match(T_MIN);
				setState(2472);
				match(T_OPEN_P);
				setState(2474);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
				case 1:
					{
					setState(2473);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2476);
				expr(0);
				setState(2477);
				match(T_CLOSE_P);
				setState(2479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
				case 1:
					{
					setState(2478);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(2481);
				match(T_RANK);
				setState(2482);
				match(T_OPEN_P);
				setState(2483);
				match(T_CLOSE_P);
				setState(2484);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(2485);
				match(T_ROW_NUMBER);
				setState(2486);
				match(T_OPEN_P);
				setState(2487);
				match(T_CLOSE_P);
				setState(2488);
				expr_func_over_clause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
				{
				setState(2489);
				match(T_STDEV);
				setState(2490);
				match(T_OPEN_P);
				setState(2492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
				case 1:
					{
					setState(2491);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2494);
				expr(0);
				setState(2495);
				match(T_CLOSE_P);
				setState(2497);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
				case 1:
					{
					setState(2496);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
				{
				setState(2499);
				match(T_SUM);
				setState(2500);
				match(T_OPEN_P);
				setState(2502);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
				case 1:
					{
					setState(2501);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2504);
				expr(0);
				setState(2505);
				match(T_CLOSE_P);
				setState(2507);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
				case 1:
					{
					setState(2506);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(2509);
				match(T_VAR);
				setState(2510);
				match(T_OPEN_P);
				setState(2512);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
				case 1:
					{
					setState(2511);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2514);
				expr(0);
				setState(2515);
				match(T_CLOSE_P);
				setState(2517);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
				case 1:
					{
					setState(2516);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 17);
				{
				setState(2519);
				match(T_VARIANCE);
				setState(2520);
				match(T_OPEN_P);
				setState(2522);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
				case 1:
					{
					setState(2521);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2524);
				expr(0);
				setState(2525);
				match(T_CLOSE_P);
				setState(2527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
				case 1:
					{
					setState(2526);
					expr_func_over_clause();
					}
					break;
				}
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

	public static class Expr_func_all_distinctContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HplsqlParser.T_DISTINCT, 0); }
		public Expr_func_all_distinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_all_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_func_all_distinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_func_all_distinct(this);
		}
	}

	public final Expr_func_all_distinctContext expr_func_all_distinct() throws RecognitionException {
		Expr_func_all_distinctContext _localctx = new Expr_func_all_distinctContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2531);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Expr_func_over_clauseContext extends ParserRuleContext {
		public TerminalNode T_OVER() { return getToken(HplsqlParser.T_OVER, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_func_partition_by_clauseContext expr_func_partition_by_clause() {
			return getRuleContext(Expr_func_partition_by_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Expr_func_over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_over_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_func_over_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_func_over_clause(this);
		}
	}

	public final Expr_func_over_clauseContext expr_func_over_clause() throws RecognitionException {
		Expr_func_over_clauseContext _localctx = new Expr_func_over_clauseContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2533);
			match(T_OVER);
			setState(2534);
			match(T_OPEN_P);
			setState(2536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(2535);
				expr_func_partition_by_clause();
				}
			}

			setState(2539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(2538);
				order_by_clause();
				}
			}

			setState(2541);
			match(T_CLOSE_P);
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

	public static class Expr_func_partition_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_PARTITION() { return getToken(HplsqlParser.T_PARTITION, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Expr_func_partition_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_partition_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_func_partition_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_func_partition_by_clause(this);
		}
	}

	public final Expr_func_partition_by_clauseContext expr_func_partition_by_clause() throws RecognitionException {
		Expr_func_partition_by_clauseContext _localctx = new Expr_func_partition_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2543);
			match(T_PARTITION);
			setState(2544);
			match(T_BY);
			setState(2545);
			expr(0);
			setState(2550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2546);
				match(T_COMMA);
				setState(2547);
				expr(0);
				}
				}
				setState(2552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Expr_spec_funcContext extends ParserRuleContext {
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(HplsqlParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_CAST() { return getToken(HplsqlParser.T_CAST, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(HplsqlParser.T_COUNT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(HplsqlParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT() { return getToken(HplsqlParser.T_CURRENT, 0); }
		public TerminalNode T_DATE() { return getToken(HplsqlParser.T_DATE, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HplsqlParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HplsqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(HplsqlParser.T_CURRENT_USER, 0); }
		public TerminalNode T_USER() { return getToken(HplsqlParser.T_USER, 0); }
		public TerminalNode T_MAX_PART_STRING() { return getToken(HplsqlParser.T_MAX_PART_STRING, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(HplsqlParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(HplsqlParser.T_EQUAL, i);
		}
		public TerminalNode T_MIN_PART_STRING() { return getToken(HplsqlParser.T_MIN_PART_STRING, 0); }
		public TerminalNode T_MAX_PART_INT() { return getToken(HplsqlParser.T_MAX_PART_INT, 0); }
		public TerminalNode T_MIN_PART_INT() { return getToken(HplsqlParser.T_MIN_PART_INT, 0); }
		public TerminalNode T_MAX_PART_DATE() { return getToken(HplsqlParser.T_MAX_PART_DATE, 0); }
		public TerminalNode T_MIN_PART_DATE() { return getToken(HplsqlParser.T_MIN_PART_DATE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(HplsqlParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(HplsqlParser.T_PART_LOC, 0); }
		public TerminalNode T_TRIM() { return getToken(HplsqlParser.T_TRIM, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(HplsqlParser.T_SUBSTRING, 0); }
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_SYSDATE() { return getToken(HplsqlParser.T_SYSDATE, 0); }
		public Expr_spec_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_spec_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_spec_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_spec_func(this);
		}
	}

	public final Expr_spec_funcContext expr_spec_func() throws RecognitionException {
		Expr_spec_funcContext _localctx = new Expr_spec_funcContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(2753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2553);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2554);
				match(T_CAST);
				setState(2555);
				match(T_OPEN_P);
				setState(2556);
				expr(0);
				setState(2557);
				match(T_AS);
				setState(2558);
				dtype();
				setState(2560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2559);
					dtype_len();
					}
				}

				setState(2562);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2564);
				match(T_COUNT);
				setState(2565);
				match(T_OPEN_P);
				setState(2568);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_AND:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DESC:
				case T_DIR:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_END:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FIELDS:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GLOBAL:
				case T_GO:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_IDENTITY:
				case T_IF:
				case T_IMMEDIATE:
				case T_IN:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MAX:
				case T_MAXTRANS:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUIT:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SETS:
				case T_SHARE:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLWARNING:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBSTRING:
				case T_SUM:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRUE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
				case L_CHARS:
					{
					setState(2566);
					expr(0);
					}
					break;
				case T_MUL:
					{
					setState(2567);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2570);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2571);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2572);
				match(T_CURRENT);
				setState(2573);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2577);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(2574);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(2575);
					match(T_CURRENT);
					setState(2576);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2583);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
				case 1:
					{
					setState(2579);
					match(T_OPEN_P);
					setState(2580);
					expr(0);
					setState(2581);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2585);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2586);
				match(T_CURRENT);
				setState(2587);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2588);
				match(T_MAX_PART_STRING);
				setState(2589);
				match(T_OPEN_P);
				setState(2590);
				expr(0);
				setState(2603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2591);
					match(T_COMMA);
					setState(2592);
					expr(0);
					setState(2600);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2593);
						match(T_COMMA);
						setState(2594);
						expr(0);
						setState(2595);
						match(T_EQUAL);
						setState(2596);
						expr(0);
						}
						}
						setState(2602);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2605);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2607);
				match(T_MIN_PART_STRING);
				setState(2608);
				match(T_OPEN_P);
				setState(2609);
				expr(0);
				setState(2622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2610);
					match(T_COMMA);
					setState(2611);
					expr(0);
					setState(2619);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2612);
						match(T_COMMA);
						setState(2613);
						expr(0);
						setState(2614);
						match(T_EQUAL);
						setState(2615);
						expr(0);
						}
						}
						setState(2621);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2624);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2626);
				match(T_MAX_PART_INT);
				setState(2627);
				match(T_OPEN_P);
				setState(2628);
				expr(0);
				setState(2641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2629);
					match(T_COMMA);
					setState(2630);
					expr(0);
					setState(2638);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2631);
						match(T_COMMA);
						setState(2632);
						expr(0);
						setState(2633);
						match(T_EQUAL);
						setState(2634);
						expr(0);
						}
						}
						setState(2640);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2643);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2645);
				match(T_MIN_PART_INT);
				setState(2646);
				match(T_OPEN_P);
				setState(2647);
				expr(0);
				setState(2660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2648);
					match(T_COMMA);
					setState(2649);
					expr(0);
					setState(2657);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2650);
						match(T_COMMA);
						setState(2651);
						expr(0);
						setState(2652);
						match(T_EQUAL);
						setState(2653);
						expr(0);
						}
						}
						setState(2659);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2662);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2664);
				match(T_MAX_PART_DATE);
				setState(2665);
				match(T_OPEN_P);
				setState(2666);
				expr(0);
				setState(2679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2667);
					match(T_COMMA);
					setState(2668);
					expr(0);
					setState(2676);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2669);
						match(T_COMMA);
						setState(2670);
						expr(0);
						setState(2671);
						match(T_EQUAL);
						setState(2672);
						expr(0);
						}
						}
						setState(2678);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2681);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2683);
				match(T_MIN_PART_DATE);
				setState(2684);
				match(T_OPEN_P);
				setState(2685);
				expr(0);
				setState(2698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2686);
					match(T_COMMA);
					setState(2687);
					expr(0);
					setState(2695);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2688);
						match(T_COMMA);
						setState(2689);
						expr(0);
						setState(2690);
						match(T_EQUAL);
						setState(2691);
						expr(0);
						}
						}
						setState(2697);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2700);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2702);
				match(T_PART_COUNT);
				setState(2703);
				match(T_OPEN_P);
				setState(2704);
				expr(0);
				setState(2712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2705);
					match(T_COMMA);
					setState(2706);
					expr(0);
					setState(2707);
					match(T_EQUAL);
					setState(2708);
					expr(0);
					}
					}
					setState(2714);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2715);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2717);
				match(T_PART_LOC);
				setState(2718);
				match(T_OPEN_P);
				setState(2719);
				expr(0);
				setState(2725); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2720);
						match(T_COMMA);
						setState(2721);
						expr(0);
						setState(2722);
						match(T_EQUAL);
						setState(2723);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2727); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2729);
					match(T_COMMA);
					setState(2730);
					expr(0);
					}
				}

				setState(2733);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2735);
				match(T_TRIM);
				setState(2736);
				match(T_OPEN_P);
				setState(2737);
				expr(0);
				setState(2738);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2740);
				match(T_SUBSTRING);
				setState(2741);
				match(T_OPEN_P);
				setState(2742);
				expr(0);
				setState(2743);
				match(T_FROM);
				setState(2744);
				expr(0);
				setState(2747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(2745);
					match(T_FOR);
					setState(2746);
					expr(0);
					}
				}

				setState(2749);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2751);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2752);
				match(T_USER);
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

	public static class Expr_funcContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public Expr_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_func(this);
		}
	}

	public final Expr_funcContext expr_func() throws RecognitionException {
		Expr_funcContext _localctx = new Expr_funcContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2755);
			ident();
			setState(2756);
			match(T_OPEN_P);
			setState(2758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
			case 1:
				{
				setState(2757);
				expr_func_params();
				}
				break;
			}
			setState(2760);
			match(T_CLOSE_P);
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

	public static class Expr_func_paramsContext extends ParserRuleContext {
		public List<Func_paramContext> func_param() {
			return getRuleContexts(Func_paramContext.class);
		}
		public Func_paramContext func_param(int i) {
			return getRuleContext(Func_paramContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Expr_func_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterExpr_func_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitExpr_func_params(this);
		}
	}

	public final Expr_func_paramsContext expr_func_params() throws RecognitionException {
		Expr_func_paramsContext _localctx = new Expr_func_paramsContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_expr_func_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2762);
			func_param();
			setState(2767);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,345,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2763);
					match(T_COMMA);
					setState(2764);
					func_param();
					}
					} 
				}
				setState(2769);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,345,_ctx);
			}
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

	public static class Func_paramContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(HplsqlParser.T_GREATER, 0); }
		public Func_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterFunc_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitFunc_param(this);
		}
	}

	public final Func_paramContext func_param() throws RecognitionException {
		Func_paramContext _localctx = new Func_paramContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_func_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2770);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
			setState(2776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
			case 1:
				{
				setState(2771);
				ident();
				setState(2772);
				match(T_EQUAL);
				setState(2774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_GREATER) {
					{
					setState(2773);
					match(T_GREATER);
					}
				}

				}
				break;
			}
			setState(2778);
			expr(0);
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

	public static class Date_literalContext extends ParserRuleContext {
		public TerminalNode T_DATE() { return getToken(HplsqlParser.T_DATE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDate_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDate_literal(this);
		}
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2780);
			match(T_DATE);
			setState(2781);
			string();
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

	public static class Timestamp_literalContext extends ParserRuleContext {
		public TerminalNode T_TIMESTAMP() { return getToken(HplsqlParser.T_TIMESTAMP, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Timestamp_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterTimestamp_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitTimestamp_literal(this);
		}
	}

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2783);
			match(T_TIMESTAMP);
			setState(2784);
			string();
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

	public static class IdentContext extends ParserRuleContext {
		public List<TerminalNode> L_ID() { return getTokens(HplsqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HplsqlParser.L_ID, i);
		}
		public List<Non_reserved_wordsContext> non_reserved_words() {
			return getRuleContexts(Non_reserved_wordsContext.class);
		}
		public Non_reserved_wordsContext non_reserved_words(int i) {
			return getRuleContext(Non_reserved_wordsContext.class,i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitIdent(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_ident);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2788);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(2786);
				match(L_ID);
				}
				break;
			case T_ACTION:
			case T_AND:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DESC:
			case T_DIR:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_END:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FIELDS:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GLOBAL:
			case T_GO:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_IDENTITY:
			case T_IF:
			case T_IMMEDIATE:
			case T_IN:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MAX:
			case T_MAXTRANS:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUIT:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SETS:
			case T_SHARE:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLWARNING:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBSTRING:
			case T_SUM:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRUE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_CHARS:
				{
				setState(2787);
				non_reserved_words();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2797);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,350,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2790);
					match(T__3);
					setState(2793);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ID:
						{
						setState(2791);
						match(L_ID);
						}
						break;
					case T_ACTION:
					case T_AND:
					case T_AS:
					case T_ASC:
					case T_ASSOCIATE:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECT:
					case T_COLLECTION:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_DATABASE:
					case T_DATA:
					case T_DATE:
					case T_DATETIME:
					case T_DAY:
					case T_DAYS:
					case T_DEC:
					case T_DECIMAL:
					case T_DECLARE:
					case T_DEFAULT:
					case T_DEFERRED:
					case T_DEFINED:
					case T_DEFINER:
					case T_DEFINITION:
					case T_DELETE:
					case T_DELIMITED:
					case T_DESC:
					case T_DIR:
					case T_DISTINCT:
					case T_DISTRIBUTE:
					case T_DO:
					case T_DOUBLE:
					case T_DYNAMIC:
					case T_ENABLE:
					case T_END:
					case T_ENGINE:
					case T_ESCAPED:
					case T_EXCEPT:
					case T_EXEC:
					case T_EXECUTE:
					case T_EXCEPTION:
					case T_EXCLUSIVE:
					case T_EXISTS:
					case T_EXIT:
					case T_FALLBACK:
					case T_FALSE:
					case T_FIELDS:
					case T_FLOAT:
					case T_FOR:
					case T_FOREIGN:
					case T_FORMAT:
					case T_FOUND:
					case T_FROM:
					case T_FULL:
					case T_FUNCTION:
					case T_GLOBAL:
					case T_GO:
					case T_GROUP:
					case T_HANDLER:
					case T_HASH:
					case T_HAVING:
					case T_IDENTITY:
					case T_IF:
					case T_IMMEDIATE:
					case T_IN:
					case T_INDEX:
					case T_INITRANS:
					case T_INNER:
					case T_INOUT:
					case T_INT:
					case T_INT2:
					case T_INT4:
					case T_INT8:
					case T_INTEGER:
					case T_INTERSECT:
					case T_INTERVAL:
					case T_INTO:
					case T_INVOKER:
					case T_IS:
					case T_ISOPEN:
					case T_ITEMS:
					case T_JOIN:
					case T_KEEP:
					case T_KEY:
					case T_KEYS:
					case T_LANGUAGE:
					case T_LEAVE:
					case T_LEFT:
					case T_LIKE:
					case T_LIMIT:
					case T_LINES:
					case T_LOCAL:
					case T_LOCATION:
					case T_LOCATOR:
					case T_LOCATORS:
					case T_LOCKS:
					case T_LOG:
					case T_LOGGED:
					case T_LOGGING:
					case T_LOOP:
					case T_MAP:
					case T_MAX:
					case T_MAXTRANS:
					case T_MICROSECOND:
					case T_MICROSECONDS:
					case T_MIN:
					case T_MULTISET:
					case T_NCHAR:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_ORDER:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OWNER:
					case T_PACKAGE:
					case T_PARTITION:
					case T_PCTFREE:
					case T_PCTUSED:
					case T_PRECISION:
					case T_PRESERVE:
					case T_PRIMARY:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUIT:
					case T_REAL:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESTRICT:
					case T_RESULT:
					case T_RESULT_SET_LOCATOR:
					case T_RETURN:
					case T_RETURNS:
					case T_REVERSE:
					case T_RIGHT:
					case T_RLIKE:
					case T_ROW:
					case T_ROWS:
					case T_ROW_COUNT:
					case T_RR:
					case T_RS:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SETS:
					case T_SHARE:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLWARNING:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_STRING:
					case T_SUBSTRING:
					case T_SUM:
					case T_SYS_REFCURSOR:
					case T_TABLE:
					case T_TABLESPACE:
					case T_TEMPORARY:
					case T_TERMINATED:
					case T_TEXTIMAGE_ON:
					case T_THEN:
					case T_TIMESTAMP:
					case T_TITLE:
					case T_TO:
					case T_TOP:
					case T_TRUE:
					case T_UNIQUE:
					case T_UPDATE:
					case T_UR:
					case T_USE:
					case T_USING:
					case T_VALUE:
					case T_VALUES:
					case T_VAR:
					case T_VARCHAR:
					case T_VARCHAR2:
					case T_VARYING:
					case T_VOLATILE:
					case T_WHILE:
					case T_WITH:
					case T_XML:
					case T_YES:
					case T_ACTIVITY_COUNT:
					case T_CUME_DIST:
					case T_CURRENT_DATE:
					case T_CURRENT_TIMESTAMP:
					case T_CURRENT_USER:
					case T_DENSE_RANK:
					case T_FIRST_VALUE:
					case T_LAG:
					case T_LAST_VALUE:
					case T_LEAD:
					case T_PART_COUNT:
					case T_PART_LOC:
					case T_RANK:
					case T_ROW_NUMBER:
					case T_STDEV:
					case T_SYSDATE:
					case T_VARIANCE:
					case T_USER:
					case L_CHARS:
						{
						setState(2792);
						non_reserved_words();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(2799);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,350,_ctx);
			}
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

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Double_quotedStringContext extends StringContext {
		public TerminalNode L_D_STRING() { return getToken(HplsqlParser.L_D_STRING, 0); }
		public Double_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDouble_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDouble_quotedString(this);
		}
	}
	public static class Single_quotedStringContext extends StringContext {
		public TerminalNode L_S_STRING() { return getToken(HplsqlParser.L_S_STRING, 0); }
		public Single_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSingle_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSingle_quotedString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_string);
		try {
			setState(2802);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2800);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2801);
				match(L_D_STRING);
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

	public static class Int_numberContext extends ParserRuleContext {
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public Int_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInt_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInt_number(this);
		}
	}

	public final Int_numberContext int_number() throws RecognitionException {
		Int_numberContext _localctx = new Int_numberContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2804);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2807);
			match(L_INT);
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

	public static class Dec_numberContext extends ParserRuleContext {
		public TerminalNode L_DEC() { return getToken(HplsqlParser.L_DEC, 0); }
		public Dec_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDec_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDec_number(this);
		}
	}

	public final Dec_numberContext dec_number() throws RecognitionException {
		Dec_numberContext _localctx = new Dec_numberContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2809);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2812);
			match(L_DEC);
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

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode T_TRUE() { return getToken(HplsqlParser.T_TRUE, 0); }
		public TerminalNode T_FALSE() { return getToken(HplsqlParser.T_FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitBool_literal(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2814);
			_la = _input.LA(1);
			if ( !(_la==T_FALSE || _la==T_TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Null_constContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public Null_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNull_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNull_const(this);
		}
	}

	public final Null_constContext null_const() throws RecognitionException {
		Null_constContext _localctx = new Null_constContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2816);
			match(T_NULL);
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

	public static class New_lineContext extends ParserRuleContext {
		public New_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNew_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNew_line(this);
		}
	}

	public final New_lineContext new_line() throws RecognitionException {
		New_lineContext _localctx = new New_lineContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_new_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2818);
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

	public static class Non_reserved_wordsContext extends ParserRuleContext {
		public TerminalNode T_ACTION() { return getToken(HplsqlParser.T_ACTION, 0); }
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(HplsqlParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_ASC() { return getToken(HplsqlParser.T_ASC, 0); }
		public TerminalNode T_ASSOCIATE() { return getToken(HplsqlParser.T_ASSOCIATE, 0); }
		public TerminalNode T_AT() { return getToken(HplsqlParser.T_AT, 0); }
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HplsqlParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_AVG() { return getToken(HplsqlParser.T_AVG, 0); }
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HplsqlParser.T_BETWEEN, 0); }
		public TerminalNode T_BIGINT() { return getToken(HplsqlParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(HplsqlParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(HplsqlParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BIT() { return getToken(HplsqlParser.T_BIT, 0); }
		public TerminalNode T_BODY() { return getToken(HplsqlParser.T_BODY, 0); }
		public TerminalNode T_BREAK() { return getToken(HplsqlParser.T_BREAK, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public TerminalNode T_BYTE() { return getToken(HplsqlParser.T_BYTE, 0); }
		public TerminalNode T_CALL() { return getToken(HplsqlParser.T_CALL, 0); }
		public TerminalNode T_CASCADE() { return getToken(HplsqlParser.T_CASCADE, 0); }
		public TerminalNode T_CASE() { return getToken(HplsqlParser.T_CASE, 0); }
		public TerminalNode T_CASESPECIFIC() { return getToken(HplsqlParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CAST() { return getToken(HplsqlParser.T_CAST, 0); }
		public TerminalNode T_CHAR() { return getToken(HplsqlParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HplsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_CHARSET() { return getToken(HplsqlParser.T_CHARSET, 0); }
		public TerminalNode T_CLOSE() { return getToken(HplsqlParser.T_CLOSE, 0); }
		public TerminalNode T_CLUSTERED() { return getToken(HplsqlParser.T_CLUSTERED, 0); }
		public TerminalNode T_CMP() { return getToken(HplsqlParser.T_CMP, 0); }
		public TerminalNode T_COLLECT() { return getToken(HplsqlParser.T_COLLECT, 0); }
		public TerminalNode T_COLLECTION() { return getToken(HplsqlParser.T_COLLECTION, 0); }
		public TerminalNode T_COMMENT() { return getToken(HplsqlParser.T_COMMENT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(HplsqlParser.T_COMPRESS, 0); }
		public TerminalNode T_CONSTANT() { return getToken(HplsqlParser.T_CONSTANT, 0); }
		public TerminalNode T_CONCAT() { return getToken(HplsqlParser.T_CONCAT, 0); }
		public TerminalNode T_CONDITION() { return getToken(HplsqlParser.T_CONDITION, 0); }
		public TerminalNode T_CONSTRAINT() { return getToken(HplsqlParser.T_CONSTRAINT, 0); }
		public TerminalNode T_CONTINUE() { return getToken(HplsqlParser.T_CONTINUE, 0); }
		public TerminalNode T_COUNT() { return getToken(HplsqlParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(HplsqlParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_CREATION() { return getToken(HplsqlParser.T_CREATION, 0); }
		public TerminalNode T_CREATOR() { return getToken(HplsqlParser.T_CREATOR, 0); }
		public TerminalNode T_CS() { return getToken(HplsqlParser.T_CS, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(HplsqlParser.T_CUME_DIST, 0); }
		public TerminalNode T_CURRENT() { return getToken(HplsqlParser.T_CURRENT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(HplsqlParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HplsqlParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(HplsqlParser.T_CURRENT_USER, 0); }
		public TerminalNode T_DATA() { return getToken(HplsqlParser.T_DATA, 0); }
		public TerminalNode T_DATABASE() { return getToken(HplsqlParser.T_DATABASE, 0); }
		public TerminalNode T_DATE() { return getToken(HplsqlParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(HplsqlParser.T_DATETIME, 0); }
		public TerminalNode T_DAY() { return getToken(HplsqlParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(HplsqlParser.T_DAYS, 0); }
		public TerminalNode T_DEC() { return getToken(HplsqlParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(HplsqlParser.T_DECIMAL, 0); }
		public TerminalNode T_DECLARE() { return getToken(HplsqlParser.T_DECLARE, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_DEFERRED() { return getToken(HplsqlParser.T_DEFERRED, 0); }
		public TerminalNode T_DEFINED() { return getToken(HplsqlParser.T_DEFINED, 0); }
		public TerminalNode T_DEFINER() { return getToken(HplsqlParser.T_DEFINER, 0); }
		public TerminalNode T_DEFINITION() { return getToken(HplsqlParser.T_DEFINITION, 0); }
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public TerminalNode T_DELIMITED() { return getToken(HplsqlParser.T_DELIMITED, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(HplsqlParser.T_DENSE_RANK, 0); }
		public TerminalNode T_DESC() { return getToken(HplsqlParser.T_DESC, 0); }
		public TerminalNode T_DIR() { return getToken(HplsqlParser.T_DIR, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HplsqlParser.T_DISTINCT, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(HplsqlParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_DO() { return getToken(HplsqlParser.T_DO, 0); }
		public TerminalNode T_DOUBLE() { return getToken(HplsqlParser.T_DOUBLE, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(HplsqlParser.T_DYNAMIC, 0); }
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_ENABLE() { return getToken(HplsqlParser.T_ENABLE, 0); }
		public TerminalNode T_ENGINE() { return getToken(HplsqlParser.T_ENGINE, 0); }
		public TerminalNode T_ESCAPED() { return getToken(HplsqlParser.T_ESCAPED, 0); }
		public TerminalNode T_EXCEPT() { return getToken(HplsqlParser.T_EXCEPT, 0); }
		public TerminalNode T_EXEC() { return getToken(HplsqlParser.T_EXEC, 0); }
		public TerminalNode T_EXECUTE() { return getToken(HplsqlParser.T_EXECUTE, 0); }
		public TerminalNode T_EXCEPTION() { return getToken(HplsqlParser.T_EXCEPTION, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(HplsqlParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public TerminalNode T_EXIT() { return getToken(HplsqlParser.T_EXIT, 0); }
		public TerminalNode T_FALLBACK() { return getToken(HplsqlParser.T_FALLBACK, 0); }
		public TerminalNode T_FALSE() { return getToken(HplsqlParser.T_FALSE, 0); }
		public TerminalNode T_FIELDS() { return getToken(HplsqlParser.T_FIELDS, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(HplsqlParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_FLOAT() { return getToken(HplsqlParser.T_FLOAT, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_FOREIGN() { return getToken(HplsqlParser.T_FOREIGN, 0); }
		public TerminalNode T_FORMAT() { return getToken(HplsqlParser.T_FORMAT, 0); }
		public TerminalNode T_FOUND() { return getToken(HplsqlParser.T_FOUND, 0); }
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public TerminalNode T_FULL() { return getToken(HplsqlParser.T_FULL, 0); }
		public TerminalNode T_FUNCTION() { return getToken(HplsqlParser.T_FUNCTION, 0); }
		public TerminalNode T_GLOBAL() { return getToken(HplsqlParser.T_GLOBAL, 0); }
		public TerminalNode T_GO() { return getToken(HplsqlParser.T_GO, 0); }
		public TerminalNode T_GROUP() { return getToken(HplsqlParser.T_GROUP, 0); }
		public TerminalNode T_HANDLER() { return getToken(HplsqlParser.T_HANDLER, 0); }
		public TerminalNode T_HASH() { return getToken(HplsqlParser.T_HASH, 0); }
		public TerminalNode T_HAVING() { return getToken(HplsqlParser.T_HAVING, 0); }
		public TerminalNode T_IDENTITY() { return getToken(HplsqlParser.T_IDENTITY, 0); }
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HplsqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public TerminalNode T_INITRANS() { return getToken(HplsqlParser.T_INITRANS, 0); }
		public TerminalNode T_INNER() { return getToken(HplsqlParser.T_INNER, 0); }
		public TerminalNode T_INOUT() { return getToken(HplsqlParser.T_INOUT, 0); }
		public TerminalNode T_INT() { return getToken(HplsqlParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(HplsqlParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(HplsqlParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(HplsqlParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(HplsqlParser.T_INTEGER, 0); }
		public TerminalNode T_INTERSECT() { return getToken(HplsqlParser.T_INTERSECT, 0); }
		public TerminalNode T_INTERVAL() { return getToken(HplsqlParser.T_INTERVAL, 0); }
		public TerminalNode T_INTO() { return getToken(HplsqlParser.T_INTO, 0); }
		public TerminalNode T_INVOKER() { return getToken(HplsqlParser.T_INVOKER, 0); }
		public TerminalNode T_ITEMS() { return getToken(HplsqlParser.T_ITEMS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_ISOPEN() { return getToken(HplsqlParser.T_ISOPEN, 0); }
		public TerminalNode T_JOIN() { return getToken(HplsqlParser.T_JOIN, 0); }
		public TerminalNode T_KEEP() { return getToken(HplsqlParser.T_KEEP, 0); }
		public TerminalNode T_KEY() { return getToken(HplsqlParser.T_KEY, 0); }
		public TerminalNode T_KEYS() { return getToken(HplsqlParser.T_KEYS, 0); }
		public TerminalNode T_LAG() { return getToken(HplsqlParser.T_LAG, 0); }
		public TerminalNode T_LANGUAGE() { return getToken(HplsqlParser.T_LANGUAGE, 0); }
		public TerminalNode T_LAST_VALUE() { return getToken(HplsqlParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(HplsqlParser.T_LEAD, 0); }
		public TerminalNode T_LEAVE() { return getToken(HplsqlParser.T_LEAVE, 0); }
		public TerminalNode T_LEFT() { return getToken(HplsqlParser.T_LEFT, 0); }
		public TerminalNode T_LIKE() { return getToken(HplsqlParser.T_LIKE, 0); }
		public TerminalNode T_LIMIT() { return getToken(HplsqlParser.T_LIMIT, 0); }
		public TerminalNode T_LINES() { return getToken(HplsqlParser.T_LINES, 0); }
		public TerminalNode T_LOCAL() { return getToken(HplsqlParser.T_LOCAL, 0); }
		public TerminalNode T_LOCATION() { return getToken(HplsqlParser.T_LOCATION, 0); }
		public TerminalNode T_LOCATOR() { return getToken(HplsqlParser.T_LOCATOR, 0); }
		public TerminalNode T_LOCATORS() { return getToken(HplsqlParser.T_LOCATORS, 0); }
		public TerminalNode T_LOCKS() { return getToken(HplsqlParser.T_LOCKS, 0); }
		public TerminalNode T_LOG() { return getToken(HplsqlParser.T_LOG, 0); }
		public TerminalNode T_LOGGED() { return getToken(HplsqlParser.T_LOGGED, 0); }
		public TerminalNode T_LOGGING() { return getToken(HplsqlParser.T_LOGGING, 0); }
		public TerminalNode T_LOOP() { return getToken(HplsqlParser.T_LOOP, 0); }
		public TerminalNode T_MAP() { return getToken(HplsqlParser.T_MAP, 0); }
		public TerminalNode T_MAX() { return getToken(HplsqlParser.T_MAX, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(HplsqlParser.T_MAXTRANS, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(HplsqlParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(HplsqlParser.T_MICROSECONDS, 0); }
		public TerminalNode T_MIN() { return getToken(HplsqlParser.T_MIN, 0); }
		public TerminalNode T_MULTISET() { return getToken(HplsqlParser.T_MULTISET, 0); }
		public TerminalNode T_NCHAR() { return getToken(HplsqlParser.T_NCHAR, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(HplsqlParser.T_NVARCHAR, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(HplsqlParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(HplsqlParser.T_NOLOGGING, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(HplsqlParser.T_NOTFOUND, 0); }
		public TerminalNode T_NUMERIC() { return getToken(HplsqlParser.T_NUMERIC, 0); }
		public TerminalNode T_NUMBER() { return getToken(HplsqlParser.T_NUMBER, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_ONLY() { return getToken(HplsqlParser.T_ONLY, 0); }
		public TerminalNode T_OPEN() { return getToken(HplsqlParser.T_OPEN, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public TerminalNode T_ORDER() { return getToken(HplsqlParser.T_ORDER, 0); }
		public TerminalNode T_OUT() { return getToken(HplsqlParser.T_OUT, 0); }
		public TerminalNode T_OUTER() { return getToken(HplsqlParser.T_OUTER, 0); }
		public TerminalNode T_OVER() { return getToken(HplsqlParser.T_OVER, 0); }
		public TerminalNode T_OWNER() { return getToken(HplsqlParser.T_OWNER, 0); }
		public TerminalNode T_PACKAGE() { return getToken(HplsqlParser.T_PACKAGE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(HplsqlParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(HplsqlParser.T_PART_LOC, 0); }
		public TerminalNode T_PARTITION() { return getToken(HplsqlParser.T_PARTITION, 0); }
		public TerminalNode T_PCTFREE() { return getToken(HplsqlParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(HplsqlParser.T_PCTUSED, 0); }
		public TerminalNode T_PRECISION() { return getToken(HplsqlParser.T_PRECISION, 0); }
		public TerminalNode T_PRESERVE() { return getToken(HplsqlParser.T_PRESERVE, 0); }
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_PROC() { return getToken(HplsqlParser.T_PROC, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_QUALIFY() { return getToken(HplsqlParser.T_QUALIFY, 0); }
		public TerminalNode T_QUIT() { return getToken(HplsqlParser.T_QUIT, 0); }
		public TerminalNode T_RANK() { return getToken(HplsqlParser.T_RANK, 0); }
		public TerminalNode T_REAL() { return getToken(HplsqlParser.T_REAL, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HplsqlParser.T_REFERENCES, 0); }
		public TerminalNode T_REGEXP() { return getToken(HplsqlParser.T_REGEXP, 0); }
		public TerminalNode T_RR() { return getToken(HplsqlParser.T_RR, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HplsqlParser.T_RESTRICT, 0); }
		public TerminalNode T_RESULT() { return getToken(HplsqlParser.T_RESULT, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(HplsqlParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(HplsqlParser.T_RETURNS, 0); }
		public TerminalNode T_REVERSE() { return getToken(HplsqlParser.T_REVERSE, 0); }
		public TerminalNode T_RIGHT() { return getToken(HplsqlParser.T_RIGHT, 0); }
		public TerminalNode T_RLIKE() { return getToken(HplsqlParser.T_RLIKE, 0); }
		public TerminalNode T_RS() { return getToken(HplsqlParser.T_RS, 0); }
		public TerminalNode T_ROW() { return getToken(HplsqlParser.T_ROW, 0); }
		public TerminalNode T_ROWS() { return getToken(HplsqlParser.T_ROWS, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(HplsqlParser.T_ROW_COUNT, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(HplsqlParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HplsqlParser.T_SCHEMA, 0); }
		public TerminalNode T_SECOND() { return getToken(HplsqlParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(HplsqlParser.T_SECONDS, 0); }
		public TerminalNode T_SECURITY() { return getToken(HplsqlParser.T_SECURITY, 0); }
		public TerminalNode T_SEGMENT() { return getToken(HplsqlParser.T_SEGMENT, 0); }
		public TerminalNode T_SEL() { return getToken(HplsqlParser.T_SEL, 0); }
		public TerminalNode T_SELECT() { return getToken(HplsqlParser.T_SELECT, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_SETS() { return getToken(HplsqlParser.T_SETS, 0); }
		public TerminalNode T_SHARE() { return getToken(HplsqlParser.T_SHARE, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(HplsqlParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(HplsqlParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(HplsqlParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_SMALLINT() { return getToken(HplsqlParser.T_SMALLINT, 0); }
		public TerminalNode T_SQL() { return getToken(HplsqlParser.T_SQL, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(HplsqlParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(HplsqlParser.T_SQLWARNING, 0); }
		public TerminalNode T_STEP() { return getToken(HplsqlParser.T_STEP, 0); }
		public TerminalNode T_STDEV() { return getToken(HplsqlParser.T_STDEV, 0); }
		public TerminalNode T_STORAGE() { return getToken(HplsqlParser.T_STORAGE, 0); }
		public TerminalNode T_STORED() { return getToken(HplsqlParser.T_STORED, 0); }
		public TerminalNode T_STRING() { return getToken(HplsqlParser.T_STRING, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(HplsqlParser.T_SUBSTRING, 0); }
		public TerminalNode T_SUM() { return getToken(HplsqlParser.T_SUM, 0); }
		public TerminalNode T_SYSDATE() { return getToken(HplsqlParser.T_SYSDATE, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(HplsqlParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public TerminalNode T_TABLESPACE() { return getToken(HplsqlParser.T_TABLESPACE, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(HplsqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HplsqlParser.T_TERMINATED, 0); }
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(HplsqlParser.T_TEXTIMAGE_ON, 0); }
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HplsqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TITLE() { return getToken(HplsqlParser.T_TITLE, 0); }
		public TerminalNode T_TO() { return getToken(HplsqlParser.T_TO, 0); }
		public TerminalNode T_TOP() { return getToken(HplsqlParser.T_TOP, 0); }
		public TerminalNode T_TRIM() { return getToken(HplsqlParser.T_TRIM, 0); }
		public TerminalNode T_TRUE() { return getToken(HplsqlParser.T_TRUE, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HplsqlParser.T_UNIQUE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public TerminalNode T_UR() { return getToken(HplsqlParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(HplsqlParser.T_USE, 0); }
		public TerminalNode T_USER() { return getToken(HplsqlParser.T_USER, 0); }
		public TerminalNode T_USING() { return getToken(HplsqlParser.T_USING, 0); }
		public TerminalNode T_VALUE() { return getToken(HplsqlParser.T_VALUE, 0); }
		public TerminalNode T_VALUES() { return getToken(HplsqlParser.T_VALUES, 0); }
		public TerminalNode T_VAR() { return getToken(HplsqlParser.T_VAR, 0); }
		public TerminalNode T_VARCHAR() { return getToken(HplsqlParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(HplsqlParser.T_VARCHAR2, 0); }
		public TerminalNode T_VARYING() { return getToken(HplsqlParser.T_VARYING, 0); }
		public TerminalNode T_VARIANCE() { return getToken(HplsqlParser.T_VARIANCE, 0); }
		public TerminalNode T_VOLATILE() { return getToken(HplsqlParser.T_VOLATILE, 0); }
		public TerminalNode T_WHILE() { return getToken(HplsqlParser.T_WHILE, 0); }
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_XML() { return getToken(HplsqlParser.T_XML, 0); }
		public TerminalNode T_YES() { return getToken(HplsqlParser.T_YES, 0); }
		public TerminalNode L_CHARS() { return getToken(HplsqlParser.L_CHARS, 0); }
		public Non_reserved_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_reserved_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNon_reserved_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNon_reserved_words(this);
		}
	}

	public final Non_reserved_wordsContext non_reserved_words() throws RecognitionException {
		Non_reserved_wordsContext _localctx = new Non_reserved_wordsContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2820);
			_la = _input.LA(1);
			if ( !(((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T_ACTION - 6)) | (1L << (T_AND - 6)) | (1L << (T_AS - 6)) | (1L << (T_ASC - 6)) | (1L << (T_ASSOCIATE - 6)) | (1L << (T_AT - 6)) | (1L << (T_AUTO_INCREMENT - 6)) | (1L << (T_AVG - 6)) | (1L << (T_BEGIN - 6)) | (1L << (T_BETWEEN - 6)) | (1L << (T_BIGINT - 6)) | (1L << (T_BINARY_DOUBLE - 6)) | (1L << (T_BINARY_FLOAT - 6)) | (1L << (T_BIT - 6)) | (1L << (T_BODY - 6)) | (1L << (T_BREAK - 6)) | (1L << (T_BY - 6)) | (1L << (T_BYTE - 6)) | (1L << (T_CALL - 6)) | (1L << (T_CASCADE - 6)) | (1L << (T_CASE - 6)) | (1L << (T_CASESPECIFIC - 6)) | (1L << (T_CAST - 6)) | (1L << (T_CHAR - 6)) | (1L << (T_CHARACTER - 6)) | (1L << (T_CHARSET - 6)) | (1L << (T_CLOSE - 6)) | (1L << (T_CLUSTERED - 6)) | (1L << (T_CMP - 6)) | (1L << (T_COLLECT - 6)) | (1L << (T_COLLECTION - 6)) | (1L << (T_COMMENT - 6)) | (1L << (T_CONSTANT - 6)) | (1L << (T_COMPRESS - 6)) | (1L << (T_CONCAT - 6)) | (1L << (T_CONDITION - 6)) | (1L << (T_CONSTRAINT - 6)) | (1L << (T_CONTINUE - 6)) | (1L << (T_COUNT - 6)) | (1L << (T_COUNT_BIG - 6)) | (1L << (T_CREATE - 6)) | (1L << (T_CREATION - 6)) | (1L << (T_CREATOR - 6)) | (1L << (T_CS - 6)) | (1L << (T_CURRENT - 6)) | (1L << (T_DATABASE - 6)) | (1L << (T_DATA - 6)) | (1L << (T_DATE - 6)) | (1L << (T_DATETIME - 6)) | (1L << (T_DAY - 6)) | (1L << (T_DAYS - 6)) | (1L << (T_DEC - 6)) | (1L << (T_DECIMAL - 6)) | (1L << (T_DECLARE - 6)) | (1L << (T_DEFAULT - 6)) | (1L << (T_DEFERRED - 6)) | (1L << (T_DEFINED - 6)) | (1L << (T_DEFINER - 6)) | (1L << (T_DEFINITION - 6)) | (1L << (T_DELETE - 6)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T_DELIMITED - 70)) | (1L << (T_DESC - 70)) | (1L << (T_DIR - 70)) | (1L << (T_DISTINCT - 70)) | (1L << (T_DISTRIBUTE - 70)) | (1L << (T_DO - 70)) | (1L << (T_DOUBLE - 70)) | (1L << (T_DYNAMIC - 70)) | (1L << (T_ENABLE - 70)) | (1L << (T_END - 70)) | (1L << (T_ENGINE - 70)) | (1L << (T_ESCAPED - 70)) | (1L << (T_EXCEPT - 70)) | (1L << (T_EXEC - 70)) | (1L << (T_EXECUTE - 70)) | (1L << (T_EXCEPTION - 70)) | (1L << (T_EXCLUSIVE - 70)) | (1L << (T_EXISTS - 70)) | (1L << (T_EXIT - 70)) | (1L << (T_FALLBACK - 70)) | (1L << (T_FALSE - 70)) | (1L << (T_FIELDS - 70)) | (1L << (T_FLOAT - 70)) | (1L << (T_FOR - 70)) | (1L << (T_FOREIGN - 70)) | (1L << (T_FORMAT - 70)) | (1L << (T_FOUND - 70)) | (1L << (T_FROM - 70)) | (1L << (T_FULL - 70)) | (1L << (T_FUNCTION - 70)) | (1L << (T_GLOBAL - 70)) | (1L << (T_GO - 70)) | (1L << (T_GROUP - 70)) | (1L << (T_HANDLER - 70)) | (1L << (T_HASH - 70)) | (1L << (T_HAVING - 70)) | (1L << (T_IDENTITY - 70)) | (1L << (T_IF - 70)) | (1L << (T_IMMEDIATE - 70)) | (1L << (T_IN - 70)) | (1L << (T_INDEX - 70)) | (1L << (T_INITRANS - 70)) | (1L << (T_INNER - 70)) | (1L << (T_INOUT - 70)) | (1L << (T_INT - 70)) | (1L << (T_INT2 - 70)) | (1L << (T_INT4 - 70)) | (1L << (T_INT8 - 70)) | (1L << (T_INTEGER - 70)) | (1L << (T_INTERSECT - 70)) | (1L << (T_INTERVAL - 70)) | (1L << (T_INTO - 70)) | (1L << (T_INVOKER - 70)) | (1L << (T_IS - 70)) | (1L << (T_ISOPEN - 70)) | (1L << (T_ITEMS - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (T_JOIN - 134)) | (1L << (T_KEEP - 134)) | (1L << (T_KEY - 134)) | (1L << (T_KEYS - 134)) | (1L << (T_LANGUAGE - 134)) | (1L << (T_LEAVE - 134)) | (1L << (T_LEFT - 134)) | (1L << (T_LIKE - 134)) | (1L << (T_LIMIT - 134)) | (1L << (T_LINES - 134)) | (1L << (T_LOCAL - 134)) | (1L << (T_LOCATION - 134)) | (1L << (T_LOCATOR - 134)) | (1L << (T_LOCATORS - 134)) | (1L << (T_LOCKS - 134)) | (1L << (T_LOG - 134)) | (1L << (T_LOGGED - 134)) | (1L << (T_LOGGING - 134)) | (1L << (T_LOOP - 134)) | (1L << (T_MAP - 134)) | (1L << (T_MAX - 134)) | (1L << (T_MAXTRANS - 134)) | (1L << (T_MICROSECOND - 134)) | (1L << (T_MICROSECONDS - 134)) | (1L << (T_MIN - 134)) | (1L << (T_MULTISET - 134)) | (1L << (T_NCHAR - 134)) | (1L << (T_NVARCHAR - 134)) | (1L << (T_NO - 134)) | (1L << (T_NOCOMPRESS - 134)) | (1L << (T_NOLOGGING - 134)) | (1L << (T_NOT - 134)) | (1L << (T_NOTFOUND - 134)) | (1L << (T_NUMERIC - 134)) | (1L << (T_NUMBER - 134)) | (1L << (T_ON - 134)) | (1L << (T_ONLY - 134)) | (1L << (T_OPEN - 134)) | (1L << (T_OR - 134)) | (1L << (T_ORDER - 134)) | (1L << (T_OUT - 134)) | (1L << (T_OUTER - 134)) | (1L << (T_OVER - 134)) | (1L << (T_OWNER - 134)) | (1L << (T_PACKAGE - 134)) | (1L << (T_PARTITION - 134)) | (1L << (T_PCTFREE - 134)) | (1L << (T_PCTUSED - 134)) | (1L << (T_PRECISION - 134)) | (1L << (T_PRESERVE - 134)) | (1L << (T_PRIMARY - 134)) | (1L << (T_PROC - 134)) | (1L << (T_PROCEDURE - 134)) | (1L << (T_QUALIFY - 134)) | (1L << (T_QUIT - 134)) | (1L << (T_REAL - 134)) | (1L << (T_REFERENCES - 134)) | (1L << (T_REGEXP - 134)) | (1L << (T_REPLACE - 134)) | (1L << (T_RESTRICT - 134)) | (1L << (T_RESULT - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (T_RESULT_SET_LOCATOR - 198)) | (1L << (T_RETURN - 198)) | (1L << (T_RETURNS - 198)) | (1L << (T_REVERSE - 198)) | (1L << (T_RIGHT - 198)) | (1L << (T_RLIKE - 198)) | (1L << (T_ROW - 198)) | (1L << (T_ROWS - 198)) | (1L << (T_ROW_COUNT - 198)) | (1L << (T_RR - 198)) | (1L << (T_RS - 198)) | (1L << (T_TRIM - 198)) | (1L << (T_SCHEMA - 198)) | (1L << (T_SECOND - 198)) | (1L << (T_SECONDS - 198)) | (1L << (T_SECURITY - 198)) | (1L << (T_SEGMENT - 198)) | (1L << (T_SEL - 198)) | (1L << (T_SELECT - 198)) | (1L << (T_SET - 198)) | (1L << (T_SETS - 198)) | (1L << (T_SHARE - 198)) | (1L << (T_SIMPLE_DOUBLE - 198)) | (1L << (T_SIMPLE_FLOAT - 198)) | (1L << (T_SMALLDATETIME - 198)) | (1L << (T_SMALLINT - 198)) | (1L << (T_SQL - 198)) | (1L << (T_SQLEXCEPTION - 198)) | (1L << (T_SQLWARNING - 198)) | (1L << (T_STEP - 198)) | (1L << (T_STORAGE - 198)) | (1L << (T_STORED - 198)) | (1L << (T_STRING - 198)) | (1L << (T_SUBSTRING - 198)) | (1L << (T_SUM - 198)) | (1L << (T_SYS_REFCURSOR - 198)) | (1L << (T_TABLE - 198)) | (1L << (T_TABLESPACE - 198)) | (1L << (T_TEMPORARY - 198)) | (1L << (T_TERMINATED - 198)) | (1L << (T_TEXTIMAGE_ON - 198)) | (1L << (T_THEN - 198)) | (1L << (T_TIMESTAMP - 198)) | (1L << (T_TITLE - 198)) | (1L << (T_TO - 198)) | (1L << (T_TOP - 198)) | (1L << (T_TRUE - 198)) | (1L << (T_UNIQUE - 198)) | (1L << (T_UPDATE - 198)) | (1L << (T_UR - 198)) | (1L << (T_USE - 198)) | (1L << (T_USING - 198)) | (1L << (T_VALUE - 198)) | (1L << (T_VALUES - 198)) | (1L << (T_VAR - 198)) | (1L << (T_VARCHAR - 198)) | (1L << (T_VARCHAR2 - 198)) | (1L << (T_VARYING - 198)) | (1L << (T_VOLATILE - 198)))) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (T_WHILE - 263)) | (1L << (T_WITH - 263)) | (1L << (T_XML - 263)) | (1L << (T_YES - 263)) | (1L << (T_ACTIVITY_COUNT - 263)) | (1L << (T_CUME_DIST - 263)) | (1L << (T_CURRENT_DATE - 263)) | (1L << (T_CURRENT_TIMESTAMP - 263)) | (1L << (T_CURRENT_USER - 263)) | (1L << (T_DENSE_RANK - 263)) | (1L << (T_FIRST_VALUE - 263)) | (1L << (T_LAG - 263)) | (1L << (T_LAST_VALUE - 263)) | (1L << (T_LEAD - 263)) | (1L << (T_PART_COUNT - 263)) | (1L << (T_PART_LOC - 263)) | (1L << (T_RANK - 263)) | (1L << (T_ROW_NUMBER - 263)) | (1L << (T_STDEV - 263)) | (1L << (T_SYSDATE - 263)) | (1L << (T_VARIANCE - 263)) | (1L << (T_USER - 263)) | (1L << (L_CHARS - 263)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return block_end_sempred((Block_endContext)_localctx, predIndex);
		case 20:
			return expr_stmt_sempred((Expr_stmtContext)_localctx, predIndex);
		case 79:
			return create_routine_params_sempred((Create_routine_paramsContext)_localctx, predIndex);
		case 129:
			return select_list_alias_sempred((Select_list_aliasContext)_localctx, predIndex);
		case 140:
			return from_alias_clause_sempred((From_alias_clauseContext)_localctx, predIndex);
		case 149:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 157:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 174:
			return func_param_sempred((Func_paramContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean block_end_sempred(Block_endContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_input.LT(2).getText().equalsIgnoreCase("TRANSACTION");
		}
		return true;
	}
	private boolean expr_stmt_sempred(Expr_stmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !_input.LT(1).getText().equalsIgnoreCase("GO");
		}
		return true;
	}
	private boolean create_routine_params_sempred(Create_routine_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return !_input.LT(1).getText().equalsIgnoreCase("IS") &&
		        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
		        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") &&
		        _input.LT(2).getText().equalsIgnoreCase("RESULT"))
		        ;
		}
		return true;
	}
	private boolean select_list_alias_sempred(Select_list_aliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO") &&
		         !_input.LT(1).getText().equalsIgnoreCase("FROM");
		}
		return true;
	}
	private boolean from_alias_clause_sempred(From_alias_clauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return !_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
		         !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
		         !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
		         !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
		         !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
		         !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
		         !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
		         !_input.LT(1).getText().equalsIgnoreCase("WITH");
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 11);
		case 10:
			return precpred(_ctx, 15);
		}
		return true;
	}
	private boolean func_param_sempred(Func_paramContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO");
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0147\u0b09\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\3\2\3"+
		"\2\3\2\3\3\3\3\5\3\u017a\n\3\3\3\5\3\u017d\n\3\6\3\u017f\n\3\r\3\16\3"+
		"\u0180\3\4\5\4\u0184\n\4\3\4\3\4\3\4\5\4\u0189\n\4\3\4\3\4\3\5\3\5\3\5"+
		"\5\5\u0190\n\5\3\5\3\5\3\5\3\5\5\5\u0196\n\5\5\5\u0198\n\5\3\6\3\6\3\6"+
		"\3\7\3\7\6\7\u019f\n\7\r\7\16\7\u01a0\3\7\5\7\u01a4\n\7\5\7\u01a6\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01c9"+
		"\n\b\3\t\3\t\5\t\u01cd\n\t\3\n\3\n\3\n\5\n\u01d2\n\n\3\n\5\n\u01d5\n\n"+
		"\3\n\3\n\5\n\u01d9\n\n\3\n\3\n\5\n\u01dd\n\n\3\n\5\n\u01e0\n\n\3\n\5\n"+
		"\u01e3\n\n\3\13\5\13\u01e6\n\13\3\13\3\13\5\13\u01ea\n\13\3\f\5\f\u01ed"+
		"\n\f\3\f\3\f\3\f\3\f\5\f\u01f3\n\f\3\f\3\f\5\f\u01f7\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u0202\n\r\3\16\3\16\3\16\3\16\5\16\u0208\n"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0210\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u021e\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0227\n\16\5\16\u0229\n\16\3\17\3\17\5\17\u022d"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0235\n\17\7\17\u0237\n\17\f"+
		"\17\16\17\u023a\13\17\3\17\3\17\3\17\7\17\u023f\n\17\f\17\16\17\u0242"+
		"\13\17\3\17\3\17\6\17\u0246\n\17\r\17\16\17\u0247\3\17\3\17\7\17\u024c"+
		"\n\17\f\17\16\17\u024f\13\17\5\17\u0251\n\17\3\20\3\20\3\21\3\21\7\21"+
		"\u0257\n\21\f\21\16\21\u025a\13\21\3\21\7\21\u025d\n\21\f\21\16\21\u0260"+
		"\13\21\3\21\5\21\u0263\n\21\3\22\3\22\6\22\u0267\n\22\r\22\16\22\u0268"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\5\27\u0279\n\27\3\27\3\27\3\27\7\27\u027e\n\27\f\27\16\27\u0281\13\27"+
		"\3\30\3\30\3\30\5\30\u0286\n\30\3\31\3\31\5\31\u028a\n\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u0293\n\31\3\31\3\31\3\31\5\31\u0298\n\31"+
		"\3\32\3\32\3\32\3\32\7\32\u029e\n\32\f\32\16\32\u02a1\13\32\3\32\3\32"+
		"\5\32\u02a5\n\32\3\32\3\32\3\32\3\32\3\32\7\32\u02ac\n\32\f\32\16\32\u02af"+
		"\13\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\7\33\u02b8\n\33\f\33\16\33\u02bb"+
		"\13\33\3\33\3\33\5\33\u02bf\n\33\3\33\5\33\u02c2\n\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\5\34\u02cc\n\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u02d3\n\34\f\34\16\34\u02d6\13\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\5\36\u02e3\n\36\3\36\3\36\5\36\u02e7\n\36\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \7 \u02f0\n \f \16 \u02f3\13 \3!\3!\3!\3!\3!\3!\7"+
		"!\u02fb\n!\f!\16!\u02fe\13!\3\"\3\"\3\"\3\"\3\"\7\"\u0305\n\"\f\"\16\""+
		"\u0308\13\"\3#\3#\3#\3#\5#\u030e\n#\3$\3$\3$\7$\u0313\n$\f$\16$\u0316"+
		"\13$\3$\5$\u0319\n$\3$\3$\5$\u031d\n$\3$\7$\u0320\n$\f$\16$\u0323\13$"+
		"\3$\5$\u0326\n$\3$\3$\3$\5$\u032b\n$\3$\3$\5$\u032f\n$\3$\3$\5$\u0333"+
		"\n$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0340\n&\3&\3&\3\'\5\'\u0345\n"+
		"\'\3\'\3\'\3\'\3\'\5\'\u034b\n\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3"+
		"*\3*\3*\7*\u035b\n*\f*\16*\u035e\13*\3+\3+\3+\3+\3,\3,\3,\3,\3,\5,\u0369"+
		"\n,\3,\3,\5,\u036d\n,\3,\3,\3-\3-\3-\3-\5-\u0375\n-\3-\5-\u0378\n-\3-"+
		"\3-\3-\5-\u037d\n-\3-\3-\3.\5.\u0382\n.\3.\3.\3.\3.\3.\5.\u0389\n.\3."+
		"\3.\3.\3.\3.\5.\u0390\n.\3.\5.\u0393\n.\3/\3/\3/\7/\u0398\n/\f/\16/\u039b"+
		"\13/\3\60\3\60\3\60\5\60\u03a0\n\60\3\60\7\60\u03a3\n\60\f\60\16\60\u03a6"+
		"\13\60\3\60\7\60\u03a9\n\60\f\60\16\60\u03ac\13\60\3\60\3\60\5\60\u03b0"+
		"\n\60\3\60\5\60\u03b3\n\60\3\61\3\61\3\62\3\62\5\62\u03b9\n\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u03c5\n\62\f\62\16\62"+
		"\u03c8\13\62\3\62\3\62\3\62\3\62\3\62\7\62\u03cf\n\62\f\62\16\62\u03d2"+
		"\13\62\3\62\3\62\3\62\5\62\u03d7\n\62\3\63\3\63\3\63\5\63\u03dc\n\63\3"+
		"\63\3\63\3\63\5\63\u03e1\n\63\3\63\3\63\3\63\5\63\u03e6\n\63\7\63\u03e8"+
		"\n\63\f\63\16\63\u03eb\13\63\3\63\3\63\5\63\u03ef\n\63\3\63\5\63\u03f2"+
		"\n\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u03fa\n\63\f\63\16\63\u03fd\13"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u0406\n\63\f\63\16\63\u0409"+
		"\13\63\3\63\3\63\7\63\u040d\n\63\f\63\16\63\u0410\13\63\5\63\u0412\n\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u041e\n\64\3\65"+
		"\6\65\u0421\n\65\r\65\16\65\u0422\3\66\3\66\3\66\5\66\u0428\n\66\3\67"+
		"\5\67\u042b\n\67\3\67\3\67\38\68\u0430\n8\r8\168\u0431\39\39\39\39\39"+
		"\39\39\39\39\39\59\u043e\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\6:\u044b"+
		"\n:\r:\16:\u044c\3:\3:\3:\5:\u0452\n:\3;\5;\u0455\n;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\7;\u0462\n;\f;\16;\u0465\13;\3;\3;\3;\5;\u046a\n;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0475\n;\3<\5<\u0478\n<\3<\3<\3<\3<\3<\3<"+
		"\7<\u0480\n<\f<\16<\u0483\13<\3<\3<\3<\3<\5<\u0489\n<\3=\3=\3=\3=\5=\u048f"+
		"\n=\3>\3>\3>\3>\7>\u0495\n>\f>\16>\u0498\13>\3?\3?\3?\3?\3?\3?\3?\5?\u04a1"+
		"\n?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u04b5\n?"+
		"\3@\3@\3@\3@\5@\u04bb\n@\3A\3A\5A\u04bf\nA\3A\3A\3A\5A\u04c4\nA\3A\3A"+
		"\5A\u04c8\nA\3A\3A\3A\5A\u04cd\nA\3A\5A\u04d0\nA\3A\3A\3A\5A\u04d5\nA"+
		"\3A\5A\u04d8\nA\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u04e6\nB\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\3B\5B\u0505\nB\5B\u0507\nB\3C\3C\3C\5C\u050c\nC\3C\3C\5C\u0510"+
		"\nC\3C\3C\3D\5D\u0515\nD\3D\3D\3D\3D\3D\5D\u051c\nD\3D\5D\u051f\nD\3E"+
		"\5E\u0522\nE\3E\3E\3E\5E\u0527\nE\3E\3E\5E\u052b\nE\5E\u052d\nE\3F\3F"+
		"\3F\3F\3F\5F\u0534\nF\3F\3F\7F\u0538\nF\fF\16F\u053b\13F\3G\3G\3G\3G\5"+
		"G\u0541\nG\3H\3H\3H\3H\5H\u0547\nH\3H\5H\u054a\nH\3H\3H\3H\5H\u054f\n"+
		"H\3H\3H\5H\u0553\nH\3H\5H\u0556\nH\3H\3H\3I\3I\3I\5I\u055d\nI\3J\3J\3"+
		"J\3J\5J\u0563\nJ\3J\5J\u0566\nJ\3J\3J\3J\3J\3J\3J\3J\3J\5J\u0570\nJ\3"+
		"K\3K\3K\3K\3K\7K\u0577\nK\fK\16K\u057a\13K\3L\3L\3L\3L\5L\u0580\nL\3L"+
		"\3L\3L\3L\3L\5L\u0587\nL\5L\u0589\nL\3M\3M\3M\3M\5M\u058f\nM\3M\5M\u0592"+
		"\nM\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u059d\nM\3N\3N\3N\3N\3N\7N\u05a4\nN"+
		"\fN\16N\u05a7\13N\3O\3O\3O\5O\u05ac\nO\3P\3P\3P\3P\5P\u05b2\nP\3P\5P\u05b5"+
		"\nP\3P\3P\3P\5P\u05ba\nP\3P\5P\u05bd\nP\3P\5P\u05c0\nP\3P\5P\u05c3\nP"+
		"\3P\5P\u05c6\nP\3P\3P\3P\3P\5P\u05cc\nP\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u05d4\nQ"+
		"\fQ\16Q\u05d7\13Q\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u05df\nQ\fQ\16Q\u05e2\13Q\5Q\u05e4"+
		"\nQ\3R\3R\3R\3R\3R\5R\u05eb\nR\3R\3R\3R\5R\u05f0\nR\3R\7R\u05f3\nR\fR"+
		"\16R\u05f6\13R\3R\5R\u05f9\nR\3R\3R\3R\3R\3R\3R\5R\u0601\nR\3R\3R\5R\u0605"+
		"\nR\3R\7R\u0608\nR\fR\16R\u060b\13R\3R\5R\u060e\nR\5R\u0610\nR\3S\6S\u0613"+
		"\nS\rS\16S\u0614\3T\3T\3T\3T\3T\3T\5T\u061d\nT\3T\3T\3T\5T\u0622\nT\3"+
		"U\3U\5U\u0626\nU\3U\3U\3U\3U\3U\3U\5U\u062e\nU\3U\3U\3U\3U\7U\u0634\n"+
		"U\fU\16U\u0637\13U\5U\u0639\nU\3U\5U\u063c\nU\3V\3V\3V\5V\u0641\nV\3W"+
		"\3W\3W\3W\3W\7W\u0648\nW\fW\16W\u064b\13W\3W\5W\u064e\nW\3W\3W\3W\3X\3"+
		"X\3X\3X\3X\5X\u0658\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3\\\3"+
		"\\\5\\\u066a\n\\\3\\\3\\\5\\\u066e\n\\\3]\3]\5]\u0672\n]\3^\3^\3^\3^\3"+
		"^\3^\3_\3_\5_\u067c\n_\3_\3_\3_\3_\5_\u0682\n_\3_\3_\5_\u0686\n_\3`\3"+
		"`\5`\u068a\n`\3`\3`\3`\3`\3`\3`\3`\3`\7`\u0694\n`\f`\16`\u0697\13`\3`"+
		"\3`\3a\3a\5a\u069d\na\3b\3b\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\7c\u06ab\nc"+
		"\fc\16c\u06ae\13c\3c\3c\7c\u06b2\nc\fc\16c\u06b5\13c\3d\5d\u06b8\nd\3"+
		"d\3d\5d\u06bc\nd\3e\3e\5e\u06c0\ne\3f\3f\3f\3g\3g\3g\3g\3g\3g\3h\3h\3"+
		"h\7h\u06ce\nh\fh\16h\u06d1\13h\3i\3i\3i\3j\3j\7j\u06d8\nj\fj\16j\u06db"+
		"\13j\3j\3j\3k\3k\3k\3k\3k\3k\7k\u06e5\nk\fk\16k\u06e8\13k\3k\5k\u06eb"+
		"\nk\3l\3l\3l\3l\3l\3l\3m\3m\3m\3n\3n\3n\3o\3o\3o\3o\3o\3o\3o\3o\3o\3p"+
		"\3p\3p\7p\u0705\np\fp\16p\u0708\13p\3q\5q\u070b\nq\3q\3q\3q\3q\3r\3r\3"+
		"r\7r\u0714\nr\fr\16r\u0717\13r\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s"+
		"\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\5s\u0730\ns\3t\3t\7t\u0734\nt\ft\16t\u0737"+
		"\13t\3t\3t\5t\u073b\nt\3u\3u\5u\u073f\nu\3v\3v\3v\3v\3v\3v\5v\u0747\n"+
		"v\3w\3w\3w\3w\5w\u074d\nw\3w\3w\3w\3w\3w\5w\u0754\nw\3w\3w\3w\3w\3w\3"+
		"x\3x\3x\3x\3x\3x\5x\u0761\nx\3y\3y\3y\3y\7y\u0767\ny\fy\16y\u076a\13y"+
		"\3z\3z\3{\3{\3{\3{\7{\u0772\n{\f{\16{\u0775\13{\3|\3|\3|\3|\3|\5|\u077c"+
		"\n|\3}\3}\5}\u0780\n}\3}\3}\5}\u0784\n}\3}\3}\5}\u0788\n}\5}\u078a\n}"+
		"\3~\3~\3~\5~\u078f\n~\3~\5~\u0792\n~\3~\5~\u0795\n~\3~\5~\u0798\n~\3~"+
		"\3~\5~\u079c\n~\3~\5~\u079f\n~\3~\5~\u07a2\n~\3\177\5\177\u07a5\n\177"+
		"\3\177\5\177\u07a8\n\177\3\177\3\177\3\177\7\177\u07ad\n\177\f\177\16"+
		"\177\u07b0\13\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082"+
		"\3\u0082\5\u0082\u07ba\n\u0082\3\u0082\3\u0082\5\u0082\u07be\n\u0082\3"+
		"\u0082\5\u0082\u07c1\n\u0082\3\u0083\3\u0083\5\u0083\u07c5\n\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u07cc\n\u0083\3\u0084\3\u0084"+
		"\5\u0084\u07d0\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\7\u0085\u07d8\n\u0085\f\u0085\16\u0085\u07db\13\u0085\3\u0086\3\u0086"+
		"\3\u0086\7\u0086\u07e0\n\u0086\f\u0086\16\u0086\u07e3\13\u0086\3\u0087"+
		"\3\u0087\3\u0087\5\u0087\u07e8\n\u0087\3\u0088\3\u0088\5\u0088\u07ec\n"+
		"\u0088\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u07f2\n\u0089\3\u008a\3"+
		"\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u07fb\n\u008a\3"+
		"\u008b\5\u008b\u07fe\n\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0803\n\u008b"+
		"\3\u008b\5\u008b\u0806\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\7\u008c\u080e\n\u008c\f\u008c\16\u008c\u0811\13\u008c\3\u008c"+
		"\3\u008c\5\u008c\u0815\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\7\u008d\u081c\n\u008d\f\u008d\16\u008d\u081f\13\u008d\3\u008d\3\u008d"+
		"\5\u008d\u0823\n\u008d\3\u008e\3\u008e\5\u008e\u0827\n\u008e\3\u008e\3"+
		"\u008e\3\u008e\3\u008e\3\u008e\7\u008e\u082e\n\u008e\f\u008e\16\u008e"+
		"\u0831\13\u008e\3\u008e\5\u008e\u0834\n\u008e\3\u008f\3\u008f\3\u0090"+
		"\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u0840"+
		"\n\u0091\f\u0091\16\u0091\u0843\13\u0091\3\u0092\3\u0092\3\u0092\3\u0093"+
		"\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u084f\n\u0094"+
		"\3\u0094\3\u0094\3\u0094\5\u0094\u0854\n\u0094\7\u0094\u0856\n\u0094\f"+
		"\u0094\16\u0094\u0859\13\u0094\3\u0095\6\u0095\u085c\n\u0095\r\u0095\16"+
		"\u0095\u085d\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3"+
		"\u0096\3\u0096\5\u0096\u0869\n\u0096\5\u0096\u086b\n\u0096\3\u0097\3\u0097"+
		"\5\u0097\u086f\n\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097"+
		"\u0876\n\u0097\3\u0097\3\u0097\3\u0097\3\u0097\7\u0097\u087c\n\u0097\f"+
		"\u0097\16\u0097\u087f\13\u0097\3\u0098\3\u0098\3\u0098\5\u0098\u0884\n"+
		"\u0098\3\u0099\3\u0099\3\u0099\5\u0099\u0889\n\u0099\3\u0099\3\u0099\3"+
		"\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u0894\n"+
		"\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099"+
		"\u089d\n\u0099\3\u009a\3\u009a\5\u009a\u08a1\n\u009a\3\u009a\3\u009a\3"+
		"\u009a\3\u009a\3\u009a\7\u009a\u08a8\n\u009a\f\u009a\16\u009a\u08ab\13"+
		"\u009a\3\u009a\5\u009a\u08ae\n\u009a\3\u009a\3\u009a\3\u009b\3\u009b\3"+
		"\u009b\3\u009b\7\u009b\u08b6\n\u009b\f\u009b\16\u009b\u08b9\13\u009b\3"+
		"\u009b\3\u009b\5\u009b\u08bd\n\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3"+
		"\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u08d3"+
		"\n\u009e\3\u009e\5\u009e\u08d6\n\u009e\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u08e9\n\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\7\u009f\u08f9\n\u009f\f\u009f\16\u009f\u08fc"+
		"\13\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\5\u00a0\u0906\n\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u0913\n\u00a3\f\u00a3"+
		"\16\u00a3\u0916\13\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u0921\n\u00a4\3\u00a5\3\u00a5\5\u00a5"+
		"\u0925\n\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\6\u00a6\u092e\n\u00a6\r\u00a6\16\u00a6\u092f\3\u00a6\3\u00a6\5\u00a6"+
		"\u0934\n\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\6\u00a7\u093e\n\u00a7\r\u00a7\16\u00a7\u093f\3\u00a7\3\u00a7"+
		"\5\u00a7\u0944\n\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u094f\n\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\5\u00a9\u0954\n\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0959\n\u00a9\3"+
		"\u00a9\3\u00a9\5\u00a9\u095d\n\u00a9\3\u00a9\3\u00a9\5\u00a9\u0961\n\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0966\n\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u096a\n\u00a9\3\u00a9\3\u00a9\5\u00a9\u096e\n\u00a9\3\u00a9\3\u00a9\3"+
		"\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\5\u00a9\u0985\n\u00a9\5\u00a9\u0987\n\u00a9\3\u00a9\3\u00a9\3"+
		"\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0999\n\u00a9\5\u00a9"+
		"\u099b\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u09a3\n\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u09a8\n\u00a9\3\u00a9\3"+
		"\u00a9\3\u00a9\5\u00a9\u09ad\n\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u09b2"+
		"\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u09bf\n\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\5\u00a9\u09c4\n\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u09c9\n\u00a9\3"+
		"\u00a9\3\u00a9\3\u00a9\5\u00a9\u09ce\n\u00a9\3\u00a9\3\u00a9\3\u00a9\5"+
		"\u00a9\u09d3\n\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u09d8\n\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\5\u00a9\u09dd\n\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u09e2\n\u00a9\5\u00a9\u09e4\n\u00a9\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3"+
		"\u00ab\5\u00ab\u09eb\n\u00ab\3\u00ab\5\u00ab\u09ee\n\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\7\u00ac\u09f7\n\u00ac\f\u00ac"+
		"\16\u00ac\u09fa\13\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\5\u00ad\u0a03\n\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\5\u00ad\u0a0b\n\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\5\u00ad\u0a14\n\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\5\u00ad\u0a1a\n\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\7\u00ad\u0a29"+
		"\n\u00ad\f\u00ad\16\u00ad\u0a2c\13\u00ad\5\u00ad\u0a2e\n\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\7\u00ad\u0a3c\n\u00ad\f\u00ad\16\u00ad\u0a3f\13\u00ad"+
		"\5\u00ad\u0a41\n\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\7\u00ad\u0a4f\n\u00ad"+
		"\f\u00ad\16\u00ad\u0a52\13\u00ad\5\u00ad\u0a54\n\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\7\u00ad\u0a62\n\u00ad\f\u00ad\16\u00ad\u0a65\13\u00ad\5\u00ad"+
		"\u0a67\n\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\7\u00ad\u0a75\n\u00ad\f\u00ad"+
		"\16\u00ad\u0a78\13\u00ad\5\u00ad\u0a7a\n\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\7\u00ad\u0a88\n\u00ad\f\u00ad\16\u00ad\u0a8b\13\u00ad\5\u00ad\u0a8d\n"+
		"\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\7\u00ad\u0a99\n\u00ad\f\u00ad\16\u00ad\u0a9c\13\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\6\u00ad\u0aa8\n\u00ad\r\u00ad\16\u00ad\u0aa9\3\u00ad\3\u00ad"+
		"\5\u00ad\u0aae\n\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad"+
		"\u0abe\n\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u0ac4\n\u00ad\3"+
		"\u00ae\3\u00ae\3\u00ae\5\u00ae\u0ac9\n\u00ae\3\u00ae\3\u00ae\3\u00af\3"+
		"\u00af\3\u00af\7\u00af\u0ad0\n\u00af\f\u00af\16\u00af\u0ad3\13\u00af\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0ad9\n\u00b0\5\u00b0\u0adb\n\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b3"+
		"\3\u00b3\5\u00b3\u0ae7\n\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0aec\n"+
		"\u00b3\7\u00b3\u0aee\n\u00b3\f\u00b3\16\u00b3\u0af1\13\u00b3\3\u00b4\3"+
		"\u00b4\5\u00b4\u0af5\n\u00b4\3\u00b5\5\u00b5\u0af8\n\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b6\5\u00b6\u0afd\n\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b8"+
		"\3\u00b8\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\2\4\u012c\u013c\u00bb"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134"+
		"\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c"+
		"\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164"+
		"\u0166\u0168\u016a\u016c\u016e\u0170\u0172\2+\3\2\u00d9\u00da\4\2VV\u0107"+
		"\u0107\5\2\3\4\u012a\u012a\u013b\u013b\3\2\u0094\u0095\4\2\61\61__\4\2"+
		"\u00a2\u00a2\u00db\u00db\4\2\r\rII\4\2GG\u00fc\u00fc\4\2``\u0097\u0097"+
		"\4\2GG\u00bc\u00bc\4\2CCuu\5\2xx\u009d\u009d\u00b8\u00b9\4\2\u0099\u0099"+
		"\u00a7\u00a7\4\2\u00a5\u00a5\u010d\u010d\4\2\u009c\u009c\u0140\u0140\4"+
		"\2\34\34\"\"\4\2  \67\67\4\299\u00d4\u00d4\4\2\f\f\u0085\u0085\3\2\u00c9"+
		"\u00ca\3\2\u00be\u00bf\6\2\66\66EE\u0084\u0084\u00b5\u00b5\3\2Z[\3\2S"+
		"T\4\2\u00d0\u00d0\u00eb\u00eb\7\2\5\5\u0126\u0126\u012a\u012a\u0134\u0134"+
		"\u013c\u013c\6\2\22\22NN\u009a\u009a\u00f2\u00f2\4\2\u009a\u009a\u0109"+
		"\u0109\4\2\33\33\u00e6\u00e6\4\2\t\tLL\5\2ii\u008e\u008e\u00cc\u00cc\5"+
		"\2\67\67\u00d1\u00d2\u00fd\u00fd\5\2]]\u00dd\u00dd\u00fc\u00fc\4\2\13"+
		"\13\u00b0\u00b0\5\2\u008f\u008f\u00c4\u00c4\u00cd\u00cd\5\2=>\u009f\u00a0"+
		"\u00d5\u00d6\4\2..\u0129\u0129\5\2gg\u0086\u0086\u00a9\u00a9\4\2\u0126"+
		"\u0126\u013c\u013c\4\2aa\u00f8\u00f8\26\2\b\b\13\26\30+-JLOQQUjlqsz|\u009d"+
		"\u009f\u00a9\u00ab\u00b9\u00bb\u00df\u00e1\u00f3\u00f5\u00f8\u00fb\u0106"+
		"\u0109\u010a\u010c\u0117\u011e\u0125\u0147\u0147\2\u0c78\2\u0174\3\2\2"+
		"\2\4\u017e\3\2\2\2\6\u0183\3\2\2\2\b\u0197\3\2\2\2\n\u0199\3\2\2\2\f\u01a5"+
		"\3\2\2\2\16\u01c8\3\2\2\2\20\u01cc\3\2\2\2\22\u01ce\3\2\2\2\24\u01e9\3"+
		"\2\2\2\26\u01f6\3\2\2\2\30\u0201\3\2\2\2\32\u0228\3\2\2\2\34\u0250\3\2"+
		"\2\2\36\u0252\3\2\2\2 \u0262\3\2\2\2\"\u0264\3\2\2\2$\u026a\3\2\2\2&\u0270"+
		"\3\2\2\2(\u0272\3\2\2\2*\u0274\3\2\2\2,\u0278\3\2\2\2.\u0285\3\2\2\2\60"+
		"\u0297\3\2\2\2\62\u0299\3\2\2\2\64\u02be\3\2\2\2\66\u02c8\3\2\2\28\u02dc"+
		"\3\2\2\2:\u02de\3\2\2\2<\u02e8\3\2\2\2>\u02eb\3\2\2\2@\u02f4\3\2\2\2B"+
		"\u02ff\3\2\2\2D\u030d\3\2\2\2F\u0332\3\2\2\2H\u0334\3\2\2\2J\u0337\3\2"+
		"\2\2L\u0344\3\2\2\2N\u034e\3\2\2\2P\u0353\3\2\2\2R\u0357\3\2\2\2T\u035f"+
		"\3\2\2\2V\u0363\3\2\2\2X\u0370\3\2\2\2Z\u038f\3\2\2\2\\\u0394\3\2\2\2"+
		"^\u03b2\3\2\2\2`\u03b4\3\2\2\2b\u03d6\3\2\2\2d\u0411\3\2\2\2f\u0413\3"+
		"\2\2\2h\u0420\3\2\2\2j\u0427\3\2\2\2l\u042a\3\2\2\2n\u042f\3\2\2\2p\u043d"+
		"\3\2\2\2r\u0451\3\2\2\2t\u0474\3\2\2\2v\u0488\3\2\2\2x\u048e\3\2\2\2z"+
		"\u0490\3\2\2\2|\u04b4\3\2\2\2~\u04ba\3\2\2\2\u0080\u04d7\3\2\2\2\u0082"+
		"\u0506\3\2\2\2\u0084\u0508\3\2\2\2\u0086\u051e\3\2\2\2\u0088\u052c\3\2"+
		"\2\2\u008a\u052e\3\2\2\2\u008c\u0540\3\2\2\2\u008e\u0549\3\2\2\2\u0090"+
		"\u0559\3\2\2\2\u0092\u0565\3\2\2\2\u0094\u0571\3\2\2\2\u0096\u0588\3\2"+
		"\2\2\u0098\u0591\3\2\2\2\u009a\u059e\3\2\2\2\u009c\u05ab\3\2\2\2\u009e"+
		"\u05b4\3\2\2\2\u00a0\u05e3\3\2\2\2\u00a2\u060f\3\2\2\2\u00a4\u0612\3\2"+
		"\2\2\u00a6\u0621\3\2\2\2\u00a8\u0623\3\2\2\2\u00aa\u0640\3\2\2\2\u00ac"+
		"\u0642\3\2\2\2\u00ae\u0652\3\2\2\2\u00b0\u0659\3\2\2\2\u00b2\u065f\3\2"+
		"\2\2\u00b4\u0664\3\2\2\2\u00b6\u0667\3\2\2\2\u00b8\u066f\3\2\2\2\u00ba"+
		"\u0673\3\2\2\2\u00bc\u0681\3\2\2\2\u00be\u0687\3\2\2\2\u00c0\u069a\3\2"+
		"\2\2\u00c2\u069e\3\2\2\2\u00c4\u06a0\3\2\2\2\u00c6\u06b7\3\2\2\2\u00c8"+
		"\u06bd\3\2\2\2\u00ca\u06c1\3\2\2\2\u00cc\u06c4\3\2\2\2\u00ce\u06ca\3\2"+
		"\2\2\u00d0\u06d2\3\2\2\2\u00d2\u06d5\3\2\2\2\u00d4\u06de\3\2\2\2\u00d6"+
		"\u06ec\3\2\2\2\u00d8\u06f2\3\2\2\2\u00da\u06f5\3\2\2\2\u00dc\u06f8\3\2"+
		"\2\2\u00de\u0701\3\2\2\2\u00e0\u070a\3\2\2\2\u00e2\u0710\3\2\2\2\u00e4"+
		"\u072f\3\2\2\2\u00e6\u073a\3\2\2\2\u00e8\u073e\3\2\2\2\u00ea\u0740\3\2"+
		"\2\2\u00ec\u0748\3\2\2\2\u00ee\u0760\3\2\2\2\u00f0\u0762\3\2\2\2\u00f2"+
		"\u076b\3\2\2\2\u00f4\u076d\3\2\2\2\u00f6\u077b\3\2\2\2\u00f8\u0789\3\2"+
		"\2\2\u00fa\u078b\3\2\2\2\u00fc\u07a4\3\2\2\2\u00fe\u07b1\3\2\2\2\u0100"+
		"\u07b3\3\2\2\2\u0102\u07c0\3\2\2\2\u0104\u07cb\3\2\2\2\u0106\u07cf\3\2"+
		"\2\2\u0108\u07d3\3\2\2\2\u010a\u07dc\3\2\2\2\u010c\u07e7\3\2\2\2\u010e"+
		"\u07e9\3\2\2\2\u0110\u07ed\3\2\2\2\u0112\u07fa\3\2\2\2\u0114\u0805\3\2"+
		"\2\2\u0116\u0807\3\2\2\2\u0118\u0822\3\2\2\2\u011a\u0824\3\2\2\2\u011c"+
		"\u0835\3\2\2\2\u011e\u0837\3\2\2\2\u0120\u083a\3\2\2\2\u0122\u0844\3\2"+
		"\2\2\u0124\u0847\3\2\2\2\u0126\u084a\3\2\2\2\u0128\u085b\3\2\2\2\u012a"+
		"\u086a\3\2\2\2\u012c\u0875\3\2\2\2\u012e\u0883\3\2\2\2\u0130\u089c\3\2"+
		"\2\2\u0132\u089e\3\2\2\2\u0134\u08b1\3\2\2\2\u0136\u08c3\3\2\2\2\u0138"+
		"\u08c7\3\2\2\2\u013a\u08d5\3\2\2\2\u013c\u08e8\3\2\2\2\u013e\u0905\3\2"+
		"\2\2\u0140\u0907\3\2\2\2\u0142\u090b\3\2\2\2\u0144\u090d\3\2\2\2\u0146"+
		"\u0920\3\2\2\2\u0148\u0924\3\2\2\2\u014a\u0926\3\2\2\2\u014c\u0937\3\2"+
		"\2\2\u014e\u0947\3\2\2\2\u0150\u09e3\3\2\2\2\u0152\u09e5\3\2\2\2\u0154"+
		"\u09e7\3\2\2\2\u0156\u09f1\3\2\2\2\u0158\u0ac3\3\2\2\2\u015a\u0ac5\3\2"+
		"\2\2\u015c\u0acc\3\2\2\2\u015e\u0ad4\3\2\2\2\u0160\u0ade\3\2\2\2\u0162"+
		"\u0ae1\3\2\2\2\u0164\u0ae6\3\2\2\2\u0166\u0af4\3\2\2\2\u0168\u0af7\3\2"+
		"\2\2\u016a\u0afc\3\2\2\2\u016c\u0b00\3\2\2\2\u016e\u0b02\3\2\2\2\u0170"+
		"\u0b04\3\2\2\2\u0172\u0b06\3\2\2\2\u0174\u0175\5\4\3\2\u0175\u0176\7\2"+
		"\2\3\u0176\3\3\2\2\2\u0177\u017a\5\6\4\2\u0178\u017a\5\16\b\2\u0179\u0177"+
		"\3\2\2\2\u0179\u0178\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u017d\7m\2\2\u017c"+
		"\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u0179\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\5\3\2\2\2\u0182\u0184\5@!\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0186\7\22\2\2\u0186\u0188\5\4\3\2\u0187\u0189\5"+
		"\"\22\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\5\n\6\2\u018b\7\3\2\2\2\u018c\u018d\7\22\2\2\u018d\u018f\5\4\3"+
		"\2\u018e\u0190\5\"\22\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u0192\5\n\6\2\u0192\u0198\3\2\2\2\u0193\u0195\5\16"+
		"\b\2\u0194\u0196\7\u013b\2\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0198\3\2\2\2\u0197\u018c\3\2\2\2\u0197\u0193\3\2\2\2\u0198\t\3\2\2\2"+
		"\u0199\u019a\6\6\2\2\u019a\u019b\7V\2\2\u019b\13\3\2\2\2\u019c\u01a6\5"+
		"\6\4\2\u019d\u019f\5\16\b\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a4\7m"+
		"\2\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5"+
		"\u019c\3\2\2\2\u01a5\u019e\3\2\2\2\u01a6\r\3\2\2\2\u01a7\u01c9\5\20\t"+
		"\2\u01a8\u01c9\5\u00caf\2\u01a9\u01c9\5\u00d4k\2\u01aa\u01c9\5\u00dan"+
		"\2\u01ab\u01c9\5,\27\2\u01ac\u01c9\5\66\34\2\u01ad\u01c9\58\35\2\u01ae"+
		"\u01c9\5:\36\2\u01af\u01c9\5<\37\2\u01b0\u01c9\5\u00ba^\2\u01b1\u01c9"+
		"\5\u008aF\2\u01b2\u01c9\5\u008eH\2\u01b3\u01c9\5\u00be`\2\u01b4\u01c9"+
		"\5X-\2\u01b5\u01c9\5\u0092J\2\u01b6\u01c9\5\u0098M\2\u01b7\u01c9\5\u009e"+
		"P\2\u01b8\u01c9\5V,\2\u01b9\u01c9\5N(\2\u01ba\u01c9\5> \2\u01bb\u01c9"+
		"\5\u00a8U\2\u01bc\u01c9\5\u00b6\\\2\u01bd\u01c9\5\u00ecw\2\u01be\u01c9"+
		"\5\u00aaV\2\u01bf\u01c9\5\u00b8]\2\u01c0\u01c9\5\u00c6d\2\u01c1\u01c9"+
		"\5\u00c8e\2\u01c2\u01c9\5\u00f2z\2\u01c3\u01c9\5\u00eav\2\u01c4\u01c9"+
		"\5\u00eex\2\u01c5\u01c9\5(\25\2\u01c6\u01c9\5*\26\2\u01c7\u01c9\5&\24"+
		"\2\u01c8\u01a7\3\2\2\2\u01c8\u01a8\3\2\2\2\u01c8\u01a9\3\2\2\2\u01c8\u01aa"+
		"\3\2\2\2\u01c8\u01ab\3\2\2\2\u01c8\u01ac\3\2\2\2\u01c8\u01ad\3\2\2\2\u01c8"+
		"\u01ae\3\2\2\2\u01c8\u01af\3\2\2\2\u01c8\u01b0\3\2\2\2\u01c8\u01b1\3\2"+
		"\2\2\u01c8\u01b2\3\2\2\2\u01c8\u01b3\3\2\2\2\u01c8\u01b4\3\2\2\2\u01c8"+
		"\u01b5\3\2\2\2\u01c8\u01b6\3\2\2\2\u01c8\u01b7\3\2\2\2\u01c8\u01b8\3\2"+
		"\2\2\u01c8\u01b9\3\2\2\2\u01c8\u01ba\3\2\2\2\u01c8\u01bb\3\2\2\2\u01c8"+
		"\u01bc\3\2\2\2\u01c8\u01bd\3\2\2\2\u01c8\u01be\3\2\2\2\u01c8\u01bf\3\2"+
		"\2\2\u01c8\u01c0\3\2\2\2\u01c8\u01c1\3\2\2\2\u01c8\u01c2\3\2\2\2\u01c8"+
		"\u01c3\3\2\2\2\u01c8\u01c4\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c8\u01c6\3\2"+
		"\2\2\u01c8\u01c7\3\2\2\2\u01c9\17\3\2\2\2\u01ca\u01cd\5\30\r\2\u01cb\u01cd"+
		"\5\22\n\2\u01cc\u01ca\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd\21\3\2\2\2\u01ce"+
		"\u01cf\t\2\2\2\u01cf\u01d1\5\u00fc\177\2\u01d0\u01d2\5\u0108\u0085\2\u01d1"+
		"\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d5\5\u010a"+
		"\u0086\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01d8\5\24\13\2\u01d7\u01d9\5\u0120\u0091\2\u01d8\u01d7\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01dd\5\u0122\u0092\2\u01db\u01dd"+
		"\5\u0124\u0093\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3"+
		"\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01e0\5\u0126\u0094\2\u01df\u01de\3\2"+
		"\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01e3\5\u0128\u0095"+
		"\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\23\3\2\2\2\u01e4\u01e6"+
		"\7\u0108\2\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2"+
		"\2\u01e7\u01ea\5\26\f\2\u01e8\u01ea\7\u0108\2\2\u01e9\u01e5\3\2\2\2\u01e9"+
		"\u01e8\3\2\2\2\u01ea\25\3\2\2\2\u01eb\u01ed\7\u00a8\2\2\u01ec\u01eb\3"+
		"\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\5\u012c\u0097"+
		"\2\u01ef\u01f0\7\u0139\2\2\u01f0\u01f7\3\2\2\2\u01f1\u01f3\7\u00a8\2\2"+
		"\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5"+
		"\7\u0136\2\2\u01f5\u01f7\5\u012c\u0097\2\u01f6\u01ec\3\2\2\2\u01f6\u01f2"+
		"\3\2\2\2\u01f7\27\3\2\2\2\u01f8\u01f9\5\32\16\2\u01f9\u01fa\5 \21\2\u01fa"+
		"\u0202\3\2\2\2\u01fb\u01fc\5\32\16\2\u01fc\u01fd\5\u00d2j\2\u01fd\u0202"+
		"\3\2\2\2\u01fe\u01ff\5\u00ccg\2\u01ff\u0200\5 \21\2\u0200\u0202\3\2\2"+
		"\2\u0201\u01f8\3\2\2\2\u0201\u01fb\3\2\2\2\u0201\u01fe\3\2\2\2\u0202\31"+
		"\3\2\2\2\u0203\u0204\5\u0164\u00b3\2\u0204\u0207\7\u0136\2\2\u0205\u0208"+
		"\5\u00ceh\2\u0206\u0208\5\34\17\2\u0207\u0205\3\2\2\2\u0207\u0206\3\2"+
		"\2\2\u0208\u0209\3\2\2\2\u0209\u020a\7\u0139\2\2\u020a\u0229\3\2\2\2\u020b"+
		"\u020c\5\u0082B\2\u020c\u020f\7\u0136\2\2\u020d\u0210\5\u00ceh\2\u020e"+
		"\u0210\5\34\17\2\u020f\u020d\3\2\2\2\u020f\u020e\3\2\2\2\u0210\u0211\3"+
		"\2\2\2\u0211\u0212\7\u0139\2\2\u0212\u0229\3\2\2\2\u0213\u0214\5\u0082"+
		"B\2\u0214\u0215\5\u0164\u00b3\2\u0215\u0216\7\u0136\2\2\u0216\u0217\5"+
		"\34\17\2\u0217\u0218\7\u0139\2\2\u0218\u0229\3\2\2\2\u0219\u021a\5\u0082"+
		"B\2\u021a\u021d\5\u0164\u00b3\2\u021b\u021e\5\u00ceh\2\u021c\u021e\5\34"+
		"\17\2\u021d\u021b\3\2\2\2\u021d\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\u0220\7\u0139\2\2\u0220\u0229\3\2\2\2\u0221\u0222\5\u0082B\2\u0222\u0223"+
		"\5\u0164\u00b3\2\u0223\u0226\7\u0136\2\2\u0224\u0227\5\u00ceh\2\u0225"+
		"\u0227\5\34\17\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2\2\2\u0227\u0229\3"+
		"\2\2\2\u0228\u0203\3\2\2\2\u0228\u020b\3\2\2\2\u0228\u0213\3\2\2\2\u0228"+
		"\u0219\3\2\2\2\u0228\u0221\3\2\2\2\u0229\33\3\2\2\2\u022a\u022d\5\36\20"+
		"\2\u022b\u022d\5\u00d0i\2\u022c\u022a\3\2\2\2\u022c\u022b\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u022f\7\u0128\2\2\u022f\u0251\3\2\2\2\u0230\u0238"+
		"\5\36\20\2\u0231\u0234\7\u0128\2\2\u0232\u0235\5\u00d0i\2\u0233\u0235"+
		"\5\36\20\2\u0234\u0232\3\2\2\2\u0234\u0233\3\2\2\2\u0235\u0237\3\2\2\2"+
		"\u0236\u0231\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239"+
		"\3\2\2\2\u0239\u0251\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u0240\5\u00d0i"+
		"\2\u023c\u023d\7\u0128\2\2\u023d\u023f\5\u00d0i\2\u023e\u023c\3\2\2\2"+
		"\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0245"+
		"\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0244\7\u0128\2\2\u0244\u0246\5\36"+
		"\20\2\u0245\u0243\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0245\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u024d\3\2\2\2\u0249\u024a\7\u0128\2\2\u024a\u024c"+
		"\5\u00d0i\2\u024b\u0249\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2"+
		"\2\u024d\u024e\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u022c"+
		"\3\2\2\2\u0250\u0230\3\2\2\2\u0250\u023b\3\2\2\2\u0251\35\3\2\2\2\u0252"+
		"\u0253\5\u0164\u00b3\2\u0253\37\3\2\2\2\u0254\u0258\7\u0135\2\2\u0255"+
		"\u0257\5\u00e8u\2\u0256\u0255\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256"+
		"\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u0263\3\2\2\2\u025a\u0258\3\2\2\2\u025b"+
		"\u025d\5\u00e8u\2\u025c\u025b\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c"+
		"\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0261\3\2\2\2\u0260\u025e\3\2\2\2\u0261"+
		"\u0263\7\u0138\2\2\u0262\u0254\3\2\2\2\u0262\u025e\3\2\2\2\u0263!\3\2"+
		"\2\2\u0264\u0266\7\\\2\2\u0265\u0267\5$\23\2\u0266\u0265\3\2\2\2\u0267"+
		"\u0268\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269#\3\2\2\2"+
		"\u026a\u026b\7\u0107\2\2\u026b\u026c\7\u013d\2\2\u026c\u026d\7\u00f2\2"+
		"\2\u026d\u026e\5\4\3\2\u026e\u026f\n\3\2\2\u026f%\3\2\2\2\u0270\u0271"+
		"\t\4\2\2\u0271\'\3\2\2\2\u0272\u0273\7\u00aa\2\2\u0273)\3\2\2\2\u0274"+
		"\u0275\6\26\3\2\u0275\u0276\5\u013c\u009f\2\u0276+\3\2\2\2\u0277\u0279"+
		"\7\u00db\2\2\u0278\u0277\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\3\2\2"+
		"\2\u027a\u027f\5.\30\2\u027b\u027c\7\u0128\2\2\u027c\u027e\5.\30\2\u027d"+
		"\u027b\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2"+
		"\2\2\u0280-\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0286\5\60\31\2\u0283\u0286"+
		"\5\62\32\2\u0284\u0286\5\64\33\2\u0285\u0282\3\2\2\2\u0285\u0283\3\2\2"+
		"\2\u0285\u0284\3\2\2\2\u0286/\3\2\2\2\u0287\u0289\5\u0164\u00b3\2\u0288"+
		"\u028a\7\u0127\2\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b"+
		"\3\2\2\2\u028b\u028c\7\u012c\2\2\u028c\u028d\5\u013c\u009f\2\u028d\u0298"+
		"\3\2\2\2\u028e\u028f\7\u0136\2\2\u028f\u0290\5\u0164\u00b3\2\u0290\u0292"+
		"\7\u0139\2\2\u0291\u0293\7\u0127\2\2\u0292\u0291\3\2\2\2\u0292\u0293\3"+
		"\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\7\u012c\2\2\u0295\u0296\5\u013c"+
		"\u009f\2\u0296\u0298\3\2\2\2\u0297\u0287\3\2\2\2\u0297\u028e\3\2\2\2\u0298"+
		"\61\3\2\2\2\u0299\u029a\7\u0136\2\2\u029a\u029f\5\u0164\u00b3\2\u029b"+
		"\u029c\7\u0128\2\2\u029c\u029e\5\u0164\u00b3\2\u029d\u029b\3\2\2\2\u029e"+
		"\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a2\3\2"+
		"\2\2\u02a1\u029f\3\2\2\2\u02a2\u02a4\7\u0139\2\2\u02a3\u02a5\7\u0127\2"+
		"\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7"+
		"\7\u012c\2\2\u02a7\u02a8\7\u0136\2\2\u02a8\u02ad\5\u013c\u009f\2\u02a9"+
		"\u02aa\7\u0128\2\2\u02aa\u02ac\5\u013c\u009f\2\u02ab\u02a9\3\2\2\2\u02ac"+
		"\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\3\2"+
		"\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b1\7\u0139\2\2\u02b1\63\3\2\2\2\u02b2"+
		"\u02bf\5\u0164\u00b3\2\u02b3\u02b4\7\u0136\2\2\u02b4\u02b9\5\u0164\u00b3"+
		"\2\u02b5\u02b6\7\u0128\2\2\u02b6\u02b8\5\u0164\u00b3\2\u02b7\u02b5\3\2"+
		"\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba"+
		"\u02bc\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02bd\7\u0139\2\2\u02bd\u02bf"+
		"\3\2\2\2\u02be\u02b2\3\2\2\2\u02be\u02b3\3\2\2\2\u02bf\u02c1\3\2\2\2\u02c0"+
		"\u02c2\7\u0127\2\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3"+
		"\3\2\2\2\u02c3\u02c4\7\u012c\2\2\u02c4\u02c5\7\u0136\2\2\u02c5\u02c6\5"+
		"\u00f2z\2\u02c6\u02c7\7\u0139\2\2\u02c7\65\3\2\2\2\u02c8\u02cb\7\16\2"+
		"\2\u02c9\u02ca\7\u00c7\2\2\u02ca\u02cc\7\u00db\2\2\u02cb\u02c9\3\2\2\2"+
		"\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\t\5\2\2\u02ce\u02cf"+
		"\7\u0136\2\2\u02cf\u02d4\5\u0164\u00b3\2\u02d0\u02d1\7\u0128\2\2\u02d1"+
		"\u02d3\5\u0164\u00b3\2\u02d2\u02d0\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2"+
		"\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7"+
		"\u02d8\7\u0139\2\2\u02d8\u02d9\7\u010a\2\2\u02d9\u02da\7\u00bf\2\2\u02da"+
		"\u02db\5\u0164\u00b3\2\u02db\67\3\2\2\2\u02dc\u02dd\7\32\2\2\u02dd9\3"+
		"\2\2\2\u02de\u02df\7\35\2\2\u02df\u02e6\5\u0164\u00b3\2\u02e0\u02e2\7"+
		"\u0136\2\2\u02e1\u02e3\5\u015c\u00af\2\u02e2\u02e1\3\2\2\2\u02e2\u02e3"+
		"\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e7\7\u0139\2\2\u02e5\u02e7\5\u015c"+
		"\u00af\2\u02e6\u02e0\3\2\2\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		";\3\2\2\2\u02e8\u02e9\7%\2\2\u02e9\u02ea\7\u013d\2\2\u02ea=\3\2\2\2\u02eb"+
		"\u02ec\7A\2\2\u02ec\u02f1\5D#\2\u02ed\u02ee\7\u0128\2\2\u02ee\u02f0\5"+
		"D#\2\u02ef\u02ed\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1"+
		"\u02f2\3\2\2\2\u02f2?\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f5\7A\2\2\u02f5"+
		"\u02f6\5D#\2\u02f6\u02fc\7\u013b\2\2\u02f7\u02f8\5D#\2\u02f8\u02f9\7\u013b"+
		"\2\2\u02f9\u02fb\3\2\2\2\u02fa\u02f7\3\2\2\2\u02fb\u02fe\3\2\2\2\u02fc"+
		"\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fdA\3\2\2\2\u02fe\u02fc\3\2\2\2"+
		"\u02ff\u0300\5D#\2\u0300\u0306\7\u013b\2\2\u0301\u0302\5D#\2\u0302\u0303"+
		"\7\u013b\2\2\u0303\u0305\3\2\2\2\u0304\u0301\3\2\2\2\u0305\u0308\3\2\2"+
		"\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307C\3\2\2\2\u0308\u0306"+
		"\3\2\2\2\u0309\u030e\5H%\2\u030a\u030e\5J&\2\u030b\u030e\5F$\2\u030c\u030e"+
		"\5L\'\2\u030d\u0309\3\2\2\2\u030d\u030a\3\2\2\2\u030d\u030b\3\2\2\2\u030d"+
		"\u030c\3\2\2\2\u030eE\3\2\2\2\u030f\u0314\5\u0164\u00b3\2\u0310\u0311"+
		"\7\u0128\2\2\u0311\u0313\5\u0164\u00b3\2\u0312\u0310\3\2\2\2\u0313\u0316"+
		"\3\2\2\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0318\3\2\2\2\u0316"+
		"\u0314\3\2\2\2\u0317\u0319\7\f\2\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2"+
		"\2\2\u0319\u031a\3\2\2\2\u031a\u031c\5\u0082B\2\u031b\u031d\5\u0084C\2"+
		"\u031c\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u0321\3\2\2\2\u031e\u0320"+
		"\5\u0086D\2\u031f\u031e\3\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2\2"+
		"\2\u0321\u0322\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0324\u0326"+
		"\5\u0088E\2\u0325\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0333\3\2\2"+
		"\2\u0327\u0328\5\u0164\u00b3\2\u0328\u032a\7+\2\2\u0329\u032b\7\f\2\2"+
		"\u032a\u0329\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032e"+
		"\5\u0082B\2\u032d\u032f\5\u0084C\2\u032e\u032d\3\2\2\2\u032e\u032f\3\2"+
		"\2\2\u032f\u0330\3\2\2\2\u0330\u0331\5\u0088E\2\u0331\u0333\3\2\2\2\u0332"+
		"\u030f\3\2\2\2\u0332\u0327\3\2\2\2\u0333G\3\2\2\2\u0334\u0335\5\u0164"+
		"\u00b3\2\u0335\u0336\7/\2\2\u0336I\3\2\2\2\u0337\u0338\t\6\2\2\u0338\u0339"+
		"\7o\2\2\u0339\u033f\7d\2\2\u033a\u0340\7\u00e4\2\2\u033b\u0340\7\u00e5"+
		"\2\2\u033c\u033d\7\u00a8\2\2\u033d\u0340\7g\2\2\u033e\u0340\5\u0164\u00b3"+
		"\2\u033f\u033a\3\2\2\2\u033f\u033b\3\2\2\2\u033f\u033c\3\2\2\2\u033f\u033e"+
		"\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0342\5\b\5\2\u0342K\3\2\2\2\u0343"+
		"\u0345\7l\2\2\u0344\u0343\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\3\2"+
		"\2\2\u0346\u0347\7\u00ef\2\2\u0347\u0348\7\u00ed\2\2\u0348\u034a\5\u0164"+
		"\u00b3\2\u0349\u034b\5h\65\2\u034a\u0349\3\2\2\2\u034a\u034b\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034c\u034d\5Z.\2\u034dM\3\2\2\2\u034e\u034f\7\64\2\2\u034f"+
		"\u0350\7\u00f9\2\2\u0350\u0351\5\u011c\u008f\2\u0351\u0352\5P)\2\u0352"+
		"O\3\2\2\2\u0353\u0354\7\u0136\2\2\u0354\u0355\5R*\2\u0355\u0356\7\u0139"+
		"\2\2\u0356Q\3\2\2\2\u0357\u035c\5T+\2\u0358\u0359\7\u0128\2\2\u0359\u035b"+
		"\5T+\2\u035a\u0358\3\2\2\2\u035b\u035e\3\2\2\2\u035c\u035a\3\2\2\2\u035c"+
		"\u035d\3\2\2\2\u035dS\3\2\2\2\u035e\u035c\3\2\2\2\u035f\u0360\5\u0166"+
		"\u00b4\2\u0360\u0361\7\u0127\2\2\u0361\u0362\5\u0166\u00b4\2\u0362U\3"+
		"\2\2\2\u0363\u0364\7\64\2\2\u0364\u0368\7\u00ed\2\2\u0365\u0366\7t\2\2"+
		"\u0366\u0367\7\u00a8\2\2\u0367\u0369\7^\2\2\u0368\u0365\3\2\2\2\u0368"+
		"\u0369\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036c\5\u011c\u008f\2\u036b\u036d"+
		"\5h\65\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\3\2\2\2\u036e"+
		"\u036f\5Z.\2\u036fW\3\2\2\2\u0370\u0377\7\64\2\2\u0371\u0372\7\u0092\2"+
		"\2\u0372\u0378\7\u00ef\2\2\u0373\u0375\t\7\2\2\u0374\u0373\3\2\2\2\u0374"+
		"\u0375\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378\7\u0106\2\2\u0377\u0371"+
		"\3\2\2\2\u0377\u0374\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\7\u00ed\2"+
		"\2\u037a\u037c\5\u0164\u00b3\2\u037b\u037d\5h\65\2\u037c\u037b\3\2\2\2"+
		"\u037c\u037d\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u037f\5Z.\2\u037fY\3\2"+
		"\2\2\u0380\u0382\7\f\2\2\u0381\u0380\3\2\2\2\u0381\u0382\3\2\2\2\u0382"+
		"\u0383\3\2\2\2\u0383\u0384\7\u0136\2\2\u0384\u0385\5\u00f2z\2\u0385\u0386"+
		"\7\u0139\2\2\u0386\u0390\3\2\2\2\u0387\u0389\7\f\2\2\u0388\u0387\3\2\2"+
		"\2\u0388\u0389\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u0390\5\u00f2z\2\u038b"+
		"\u038c\7\u0136\2\2\u038c\u038d\5\\/\2\u038d\u038e\7\u0139\2\2\u038e\u0390"+
		"\3\2\2\2\u038f\u0381\3\2\2\2\u038f\u0388\3\2\2\2\u038f\u038b\3\2\2\2\u0390"+
		"\u0392\3\2\2\2\u0391\u0393\5n8\2\u0392\u0391\3\2\2\2\u0392\u0393\3\2\2"+
		"\2\u0393[\3\2\2\2\u0394\u0399\5^\60\2\u0395\u0396\7\u0128\2\2\u0396\u0398"+
		"\5^\60\2\u0397\u0395\3\2\2\2\u0398\u039b\3\2\2\2\u0399\u0397\3\2\2\2\u0399"+
		"\u039a\3\2\2\2\u039a]\3\2\2\2\u039b\u0399\3\2\2\2\u039c\u039d\5`\61\2"+
		"\u039d\u039f\5\u0082B\2\u039e\u03a0\5\u0084C\2\u039f\u039e\3\2\2\2\u039f"+
		"\u03a0\3\2\2\2\u03a0\u03a4\3\2\2\2\u03a1\u03a3\5\u0086D\2\u03a2\u03a1"+
		"\3\2\2\2\u03a3\u03a6\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5"+
		"\u03aa\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a7\u03a9\5b\62\2\u03a8\u03a7\3\2"+
		"\2\2\u03a9\u03ac\3\2\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab"+
		"\u03b3\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ad\u03ae\7\60\2\2\u03ae\u03b0\5"+
		"\u0164\u00b3\2\u03af\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\3\2"+
		"\2\2\u03b1\u03b3\5d\63\2\u03b2\u039c\3\2\2\2\u03b2\u03af\3\2\2\2\u03b3"+
		"_\3\2\2\2\u03b4\u03b5\5\u0164\u00b3\2\u03b5a\3\2\2\2\u03b6\u03d7\5\u0088"+
		"E\2\u03b7\u03b9\7\u00a8\2\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9"+
		"\u03ba\3\2\2\2\u03ba\u03d7\7\u00aa\2\2\u03bb\u03bc\7\u00bd\2\2\u03bc\u03d7"+
		"\7\u008a\2\2\u03bd\u03d7\7\u00fb\2\2\u03be\u03bf\7\u00c3\2\2\u03bf\u03c0"+
		"\5\u011c\u008f\2\u03c0\u03c1\7\u0136\2\2\u03c1\u03c2\5\u0164\u00b3\2\u03c2"+
		"\u03c6\7\u0139\2\2\u03c3\u03c5\5f\64\2\u03c4\u03c3\3\2\2\2\u03c5\u03c8"+
		"\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03d7\3\2\2\2\u03c8"+
		"\u03c6\3\2\2\2\u03c9\u03ca\7s\2\2\u03ca\u03cb\7\u0136\2\2\u03cb\u03d0"+
		"\7\u0140\2\2\u03cc\u03cd\7\u0128\2\2\u03cd\u03cf\7\u0140\2\2\u03ce\u03cc"+
		"\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1"+
		"\u03d3\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d3\u03d7\7\u0139\2\2\u03d4\u03d7"+
		"\7\20\2\2\u03d5\u03d7\7U\2\2\u03d6\u03b6\3\2\2\2\u03d6\u03b8\3\2\2\2\u03d6"+
		"\u03bb\3\2\2\2\u03d6\u03bd\3\2\2\2\u03d6\u03be\3\2\2\2\u03d6\u03c9\3\2"+
		"\2\2\u03d6\u03d4\3\2\2\2\u03d6\u03d5\3\2\2\2\u03d7c\3\2\2\2\u03d8\u03d9"+
		"\7\u00bd\2\2\u03d9\u03db\7\u008a\2\2\u03da\u03dc\7&\2\2\u03db\u03da\3"+
		"\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\7\u0136\2\2"+
		"\u03de\u03e0\5\u0164\u00b3\2\u03df\u03e1\t\b\2\2\u03e0\u03df\3\2\2\2\u03e0"+
		"\u03e1\3\2\2\2\u03e1\u03e9\3\2\2\2\u03e2\u03e3\7\u0128\2\2\u03e3\u03e5"+
		"\5\u0164\u00b3\2\u03e4\u03e6\t\b\2\2\u03e5\u03e4\3\2\2\2\u03e5\u03e6\3"+
		"\2\2\2\u03e6\u03e8\3\2\2\2\u03e7\u03e2\3\2\2\2\u03e8\u03eb\3\2\2\2\u03e9"+
		"\u03e7\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03ec\3\2\2\2\u03eb\u03e9\3\2"+
		"\2\2\u03ec\u03ee\7\u0139\2\2\u03ed\u03ef\7U\2\2\u03ee\u03ed\3\2\2\2\u03ee"+
		"\u03ef\3\2\2\2\u03ef\u03f1\3\2\2\2\u03f0\u03f2\5\u00c2b\2\u03f1\u03f0"+
		"\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u0412\3\2\2\2\u03f3\u03f4\7e\2\2\u03f4"+
		"\u03f5\7\u008a\2\2\u03f5\u03f6\7\u0136\2\2\u03f6\u03fb\5\u0164\u00b3\2"+
		"\u03f7\u03f8\7\u0128\2\2\u03f8\u03fa\5\u0164\u00b3\2\u03f9\u03f7\3\2\2"+
		"\2\u03fa\u03fd\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fe"+
		"\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fe\u03ff\7\u0139\2\2\u03ff\u0400\7\u00c3"+
		"\2\2\u0400\u0401\5\u011c\u008f\2\u0401\u0402\7\u0136\2\2\u0402\u0407\5"+
		"\u0164\u00b3\2\u0403\u0404\7\u0128\2\2\u0404\u0406\5\u0164\u00b3\2\u0405"+
		"\u0403\3\2\2\2\u0406\u0409\3\2\2\2\u0407\u0405\3\2\2\2\u0407\u0408\3\2"+
		"\2\2\u0408\u040a\3\2\2\2\u0409\u0407\3\2\2\2\u040a\u040e\7\u0139\2\2\u040b"+
		"\u040d\5f\64\2\u040c\u040b\3\2\2\2\u040d\u0410\3\2\2\2\u040e\u040c\3\2"+
		"\2\2\u040e\u040f\3\2\2\2\u040f\u0412\3\2\2\2\u0410\u040e\3\2\2\2\u0411"+
		"\u03d8\3\2\2\2\u0411\u03f3\3\2\2\2\u0412e\3\2\2\2\u0413\u0414\7\u00ad"+
		"\2\2\u0414\u041d\t\t\2\2\u0415\u0416\7\u00a5\2\2\u0416\u041e\7\b\2\2\u0417"+
		"\u041e\7\u00c6\2\2\u0418\u0419\7\u00db\2\2\u0419\u041e\7\u00aa\2\2\u041a"+
		"\u041b\7\u00db\2\2\u041b\u041e\7B\2\2\u041c\u041e\7\36\2\2\u041d\u0415"+
		"\3\2\2\2\u041d\u0417\3\2\2\2\u041d\u0418\3\2\2\2\u041d\u041a\3\2\2\2\u041d"+
		"\u041c\3\2\2\2\u041eg\3\2\2\2\u041f\u0421\5j\66\2\u0420\u041f\3\2\2\2"+
		"\u0421\u0422\3\2\2\2\u0422\u0420\3\2\2\2\u0422\u0423\3\2\2\2\u0423i\3"+
		"\2\2\2\u0424\u0425\7\u0128\2\2\u0425\u0428\5l\67\2\u0426\u0428\5x=\2\u0427"+
		"\u0424\3\2\2\2\u0427\u0426\3\2\2\2\u0428k\3\2\2\2\u0429\u042b\7\u00a5"+
		"\2\2\u042a\u0429\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042c\3\2\2\2\u042c"+
		"\u042d\t\n\2\2\u042dm\3\2\2\2\u042e\u0430\5p9\2\u042f\u042e\3\2\2\2\u0430"+
		"\u0431\3\2\2\2\u0431\u042f\3\2\2\2\u0431\u0432\3\2\2\2\u0432o\3\2\2\2"+
		"\u0433\u0434\7\u00ad\2\2\u0434\u0435\7,\2\2\u0435\u0436\t\13\2\2\u0436"+
		"\u043e\7\u00cf\2\2\u0437\u043e\5r:\2\u0438\u043e\5t;\2\u0439\u043e\5v"+
		"<\2\u043a\u043e\5x=\2\u043b\u043e\5~@\2\u043c\u043e\5\u0080A\2\u043d\u0433"+
		"\3\2\2\2\u043d\u0437\3\2\2\2\u043d\u0438\3\2\2\2\u043d\u0439\3\2\2\2\u043d"+
		"\u043a\3\2\2\2\u043d\u043b\3\2\2\2\u043d\u043c\3\2\2\2\u043eq\3\2\2\2"+
		"\u043f\u0440\7\u00d8\2\2\u0440\u0441\7\65\2\2\u0441\u0452\t\f\2\2\u0442"+
		"\u0443\t\r\2\2\u0443\u0452\7\u0140\2\2\u0444\u0452\7\u00a6\2\2\u0445\u0452"+
		"\t\16\2\2\u0446\u0447\7\u00e7\2\2\u0447\u044a\7\u0136\2\2\u0448\u044b"+
		"\5\u0164\u00b3\2\u0449\u044b\7\u0140\2\2\u044a\u0448\3\2\2\2\u044a\u0449"+
		"\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d"+
		"\u044e\3\2\2\2\u044e\u0452\7\u0139\2\2\u044f\u0450\7\u00ee\2\2\u0450\u0452"+
		"\5\u0164\u00b3\2\u0451\u043f\3\2\2\2\u0451\u0442\3\2\2\2\u0451\u0444\3"+
		"\2\2\2\u0451\u0445\3\2\2\2\u0451\u0446\3\2\2\2\u0451\u044f\3\2\2\2\u0452"+
		"s\3\2\2\2\u0453\u0455\7w\2\2\u0454\u0453\3\2\2\2\u0454\u0455\3\2\2\2\u0455"+
		"\u0456\3\2\2\2\u0456\u0457\7v\2\2\u0457\u0475\5\u0164\u00b3\2\u0458\u0459"+
		"\7\u010a\2\2\u0459\u0475\7\u00c5\2\2\u045a\u045b\7M\2\2\u045b\u045c\7"+
		"\33\2\2\u045c\u045d\7p\2\2\u045d\u045e\7\u0136\2\2\u045e\u0463\5\u0164"+
		"\u00b3\2\u045f\u0460\7\u0128\2\2\u0460\u0462\5\u0164\u00b3\2\u0461\u045f"+
		"\3\2\2\2\u0462\u0465\3\2\2\2\u0463\u0461\3\2\2\2\u0463\u0464\3\2\2\2\u0464"+
		"\u0466\3\2\2\2\u0465\u0463\3\2\2\2\u0466\u0467\7\u0139\2\2\u0467\u0475"+
		"\3\2\2\2\u0468\u046a\7\u00a8\2\2\u0469\u0468\3\2\2\2\u0469\u046a\3\2\2"+
		"\2\u046a\u046b\3\2\2\2\u046b\u0475\7\u0098\2\2\u046c\u046d\7-\2\2\u046d"+
		"\u0475\t\17\2\2\u046e\u046f\7F\2\2\u046f\u0475\7\u00ae\2\2\u0470\u0471"+
		"\7\u010a\2\2\u0471\u0472\7\u00c6\2\2\u0472\u0473\7\u00ad\2\2\u0473\u0475"+
		"\7P\2\2\u0474\u0454\3\2\2\2\u0474\u0458\3\2\2\2\u0474\u045a\3\2\2\2\u0474"+
		"\u0469\3\2\2\2\u0474\u046c\3\2\2\2\u0474\u046e\3\2\2\2\u0474\u0470\3\2"+
		"\2\2\u0475u\3\2\2\2\u0476\u0478\7\u00fb\2\2\u0477\u0476\3\2\2\2\u0477"+
		"\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047a\7\u00bd\2\2\u047a\u047b"+
		"\7w\2\2\u047b\u047c\7\u0136\2\2\u047c\u0481\5\u0164\u00b3\2\u047d\u047e"+
		"\7\u0128\2\2\u047e\u0480\5\u0164\u00b3\2\u047f\u047d\3\2\2\2\u0480\u0483"+
		"\3\2\2\2\u0481\u047f\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0484\3\2\2\2\u0483"+
		"\u0481\3\2\2\2\u0484\u0485\7\u0139\2\2\u0485\u0489\3\2\2\2\u0486\u0487"+
		"\7\u010a\2\2\u0487\u0489\7:\2\2\u0488\u0477\3\2\2\2\u0488\u0486\3\2\2"+
		"\2\u0489w\3\2\2\2\u048a\u048f\5z>\2\u048b\u048c\7\u00e8\2\2\u048c\u048d"+
		"\7\f\2\2\u048d\u048f\5\u0164\u00b3\2\u048e\u048a\3\2\2\2\u048e\u048b\3"+
		"\2\2\2\u048fy\3\2\2\2\u0490\u0491\7\u00ce\2\2\u0491\u0492\7f\2\2\u0492"+
		"\u0496\7H\2\2\u0493\u0495\5|?\2\u0494\u0493\3\2\2\2\u0495\u0498\3\2\2"+
		"\2\u0496\u0494\3\2\2\2\u0496\u0497\3\2\2\2\u0497{\3\2\2\2\u0498\u0496"+
		"\3\2\2\2\u0499\u049a\7b\2\2\u049a\u049b\7\u00f0\2\2\u049b\u049c\7\33\2"+
		"\2\u049c\u04a0\5\u013c\u009f\2\u049d\u049e\7X\2\2\u049e\u049f\7\33\2\2"+
		"\u049f\u04a1\5\u013c\u009f\2\u04a0\u049d\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1"+
		"\u04b5\3\2\2\2\u04a2\u04a3\7)\2\2\u04a3\u04a4\7\u0087\2\2\u04a4\u04a5"+
		"\7\u00f0\2\2\u04a5\u04a6\7\33\2\2\u04a6\u04b5\5\u013c\u009f\2\u04a7\u04a8"+
		"\7\u009b\2\2\u04a8\u04a9\7\u008b\2\2\u04a9\u04aa\7\u00f0\2\2\u04aa\u04ab"+
		"\7\33\2\2\u04ab\u04b5\5\u013c\u009f\2\u04ac\u04ad\7\u0091\2\2\u04ad\u04ae"+
		"\7\u00f0\2\2\u04ae\u04af\7\33\2\2\u04af\u04b5\5\u013c\u009f\2\u04b0\u04b1"+
		"\7\u00aa\2\2\u04b1\u04b2\7D\2\2\u04b2\u04b3\7\f\2\2\u04b3\u04b5\5\u013c"+
		"\u009f\2\u04b4\u0499\3\2\2\2\u04b4\u04a2\3\2\2\2\u04b4\u04a7\3\2\2\2\u04b4"+
		"\u04ac\3\2\2\2\u04b4\u04b0\3\2\2\2\u04b5}\3\2\2\2\u04b6\u04b7\7\u00ad"+
		"\2\2\u04b7\u04bb\5\u0164\u00b3\2\u04b8\u04b9\7\u00f1\2\2\u04b9\u04bb\5"+
		"\u0164\u00b3\2\u04ba\u04b6\3\2\2\2\u04ba\u04b8\3\2\2\2\u04bb\177\3\2\2"+
		"\2\u04bc\u04be\7\20\2\2\u04bd\u04bf\7\u012c\2\2\u04be\u04bd\3\2\2\2\u04be"+
		"\u04bf\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04d8\5\u013c\u009f\2\u04c1\u04c3"+
		"\7*\2\2\u04c2\u04c4\7\u012c\2\2\u04c3\u04c2\3\2\2\2\u04c3\u04c4\3\2\2"+
		"\2\u04c4\u04c5\3\2\2\2\u04c5\u04d8\5\u013c\u009f\2\u04c6\u04c8\7B\2\2"+
		"\u04c7\u04c6\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04cc\3\2\2\2\u04c9\u04ca"+
		"\7#\2\2\u04ca\u04cd\7\u00db\2\2\u04cb\u04cd\7$\2\2\u04cc\u04c9\3\2\2\2"+
		"\u04cc\u04cb\3\2\2\2\u04cd\u04cf\3\2\2\2\u04ce\u04d0\7\u012c\2\2\u04cf"+
		"\u04ce\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d8\5\u013c"+
		"\u009f\2\u04d2\u04d4\7W\2\2\u04d3\u04d5\7\u012c\2\2\u04d4\u04d3\3\2\2"+
		"\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d8\5\u013c\u009f\2"+
		"\u04d7\u04bc\3\2\2\2\u04d7\u04c1\3\2\2\2\u04d7\u04c7\3\2\2\2\u04d7\u04d2"+
		"\3\2\2\2\u04d8\u0081\3\2\2\2\u04d9\u0507\7\"\2\2\u04da\u0507\7\24\2\2"+
		"\u04db\u0507\7\25\2\2\u04dc\u0507\7\26\2\2\u04dd\u0507\7\27\2\2\u04de"+
		"\u0507\7\30\2\2\u04df\u0507\7;\2\2\u04e0\u0507\7<\2\2\u04e1\u0507\7?\2"+
		"\2\u04e2\u0507\7@\2\2\u04e3\u04e5\7O\2\2\u04e4\u04e6\7\u00bb\2\2\u04e5"+
		"\u04e4\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u0507\3\2\2\2\u04e7\u0507\7c"+
		"\2\2\u04e8\u0507\7|\2\2\u04e9\u0507\7}\2\2\u04ea\u0507\7~\2\2\u04eb\u0507"+
		"\7\177\2\2\u04ec\u0507\7\u0080\2\2\u04ed\u0507\7\u00a3\2\2\u04ee\u0507"+
		"\7\u00a4\2\2\u04ef\u0507\7\u00ac\2\2\u04f0\u0507\7\u00ab\2\2\u04f1\u0507"+
		"\7\u00ba\2\2\u04f2\u0507\7\u00c2\2\2\u04f3\u04f4\7\u00c8\2\2\u04f4\u0507"+
		"\7\u0105\2\2\u04f5\u0507\7\u00df\2\2\u04f6\u0507\7\u00de\2\2\u04f7\u0507"+
		"\7\u00e0\2\2\u04f8\u0507\7\u00e2\2\2\u04f9\u0507\7\u00e1\2\2\u04fa\u0507"+
		"\7\u00e9\2\2\u04fb\u0507\7\u00ec\2\2\u04fc\u0507\7\u00f3\2\2\u04fd\u0507"+
		"\7\u00f4\2\2\u04fe\u0507\7\u0103\2\2\u04ff\u0507\7\u0104\2\2\u0500\u0507"+
		"\7\u010c\2\2\u0501\u0504\5\u0164\u00b3\2\u0502\u0503\7\5\2\2\u0503\u0505"+
		"\7\u00f9\2\2\u0504\u0502\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0507\3\2\2"+
		"\2\u0506\u04d9\3\2\2\2\u0506\u04da\3\2\2\2\u0506\u04db\3\2\2\2\u0506\u04dc"+
		"\3\2\2\2\u0506\u04dd\3\2\2\2\u0506\u04de\3\2\2\2\u0506\u04df\3\2\2\2\u0506"+
		"\u04e0\3\2\2\2\u0506\u04e1\3\2\2\2\u0506\u04e2\3\2\2\2\u0506\u04e3\3\2"+
		"\2\2\u0506\u04e7\3\2\2\2\u0506\u04e8\3\2\2\2\u0506\u04e9\3\2\2\2\u0506"+
		"\u04ea\3\2\2\2\u0506\u04eb\3\2\2\2\u0506\u04ec\3\2\2\2\u0506\u04ed\3\2"+
		"\2\2\u0506\u04ee\3\2\2\2\u0506\u04ef\3\2\2\2\u0506\u04f0\3\2\2\2\u0506"+
		"\u04f1\3\2\2\2\u0506\u04f2\3\2\2\2\u0506\u04f3\3\2\2\2\u0506\u04f5\3\2"+
		"\2\2\u0506\u04f6\3\2\2\2\u0506\u04f7\3\2\2\2\u0506\u04f8\3\2\2\2\u0506"+
		"\u04f9\3\2\2\2\u0506\u04fa\3\2\2\2\u0506\u04fb\3\2\2\2\u0506\u04fc\3\2"+
		"\2\2\u0506\u04fd\3\2\2\2\u0506\u04fe\3\2\2\2\u0506\u04ff\3\2\2\2\u0506"+
		"\u0500\3\2\2\2\u0506\u0501\3\2\2\2\u0507\u0083\3\2\2\2\u0508\u0509\7\u0136"+
		"\2\2\u0509\u050b\t\20\2\2\u050a\u050c\t\21\2\2\u050b\u050a\3\2\2\2\u050b"+
		"\u050c\3\2\2\2\u050c\u050f\3\2\2\2\u050d\u050e\7\u0128\2\2\u050e\u0510"+
		"\7\u0140\2\2\u050f\u050d\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0511\3\2\2"+
		"\2\u0511\u0512\7\u0139\2\2\u0512\u0085\3\2\2\2\u0513\u0515\7\u00a8\2\2"+
		"\u0514\u0513\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u051f"+
		"\7\u00aa\2\2\u0517\u0518\7#\2\2\u0518\u0519\7\u00db\2\2\u0519\u051f\5"+
		"\u0164\u00b3\2\u051a\u051c\7\u00a8\2\2\u051b\u051a\3\2\2\2\u051b\u051c"+
		"\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051f\t\22\2\2\u051e\u0514\3\2\2\2"+
		"\u051e\u0517\3\2\2\2\u051e\u051b\3\2\2\2\u051f\u0087\3\2\2\2\u0520\u0522"+
		"\7\u0127\2\2\u0521\u0520\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0523\3\2\2"+
		"\2\u0523\u0524\7\u012c\2\2\u0524\u052d\5\u013c\u009f\2\u0525\u0527\7\u010a"+
		"\2\2\u0526\u0525\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528\3\2\2\2\u0528"+
		"\u052a\7B\2\2\u0529\u052b\5\u013c\u009f\2\u052a\u0529\3\2\2\2\u052a\u052b"+
		"\3\2\2\2\u052b\u052d\3\2\2\2\u052c\u0521\3\2\2\2\u052c\u0526\3\2\2\2\u052d"+
		"\u0089\3\2\2\2\u052e\u052f\7\64\2\2\u052f\u0533\t\23\2\2\u0530\u0531\7"+
		"t\2\2\u0531\u0532\7\u00a8\2\2\u0532\u0534\7^\2\2\u0533\u0530\3\2\2\2\u0533"+
		"\u0534\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0539\5\u013c\u009f\2\u0536\u0538"+
		"\5\u008cG\2\u0537\u0536\3\2\2\2\u0538\u053b\3\2\2\2\u0539\u0537\3\2\2"+
		"\2\u0539\u053a\3\2\2\2\u053a\u008b\3\2\2\2\u053b\u0539\3\2\2\2\u053c\u053d"+
		"\7*\2\2\u053d\u0541\5\u013c\u009f\2\u053e\u053f\7\u0093\2\2\u053f\u0541"+
		"\5\u013c\u009f\2\u0540\u053c\3\2\2\2\u0540\u053e\3\2\2\2\u0541\u008d\3"+
		"\2\2\2\u0542\u054a\7\n\2\2\u0543\u0546\7\64\2\2\u0544\u0545\7\u00b0\2"+
		"\2\u0545\u0547\7\u00c5\2\2\u0546\u0544\3\2\2\2\u0546\u0547\3\2\2\2\u0547"+
		"\u054a\3\2\2\2\u0548\u054a\7\u00c5\2\2\u0549\u0542\3\2\2\2\u0549\u0543"+
		"\3\2\2\2\u0549\u0548\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054b\3\2\2\2\u054b"+
		"\u054c\7j\2\2\u054c\u054e\5\u0164\u00b3\2\u054d\u054f\5\u00a0Q\2\u054e"+
		"\u054d\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0552\5\u0090"+
		"I\2\u0551\u0553\t\24\2\2\u0552\u0551\3\2\2\2\u0552\u0553\3\2\2\2\u0553"+
		"\u0555\3\2\2\2\u0554\u0556\5B\"\2\u0555\u0554\3\2\2\2\u0555\u0556\3\2"+
		"\2\2\u0556\u0557\3\2\2\2\u0557\u0558\5\b\5\2\u0558\u008f\3\2\2\2\u0559"+
		"\u055a\t\25\2\2\u055a\u055c\5\u0082B\2\u055b\u055d\5\u0084C\2\u055c\u055b"+
		"\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u0091\3\2\2\2\u055e\u0566\7\n\2\2\u055f"+
		"\u0562\7\64\2\2\u0560\u0561\7\u00b0\2\2\u0561\u0563\7\u00c5\2\2\u0562"+
		"\u0560\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0566\3\2\2\2\u0564\u0566\7\u00c5"+
		"\2\2\u0565\u055e\3\2\2\2\u0565\u055f\3\2\2\2\u0565\u0564\3\2\2\2\u0565"+
		"\u0566\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0568\7\u00b6\2\2\u0568\u0569"+
		"\5\u0164\u00b3\2\u0569\u056a\t\24\2\2\u056a\u056b\5\u0094K\2\u056b\u056f"+
		"\7V\2\2\u056c\u056d\5\u0164\u00b3\2\u056d\u056e\7\u013b\2\2\u056e\u0570"+
		"\3\2\2\2\u056f\u056c\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0093\3\2\2\2\u0571"+
		"\u0572\5\u0096L\2\u0572\u0578\7\u013b\2\2\u0573\u0574\5\u0096L\2\u0574"+
		"\u0575\7\u013b\2\2\u0575\u0577\3\2\2\2\u0576\u0573\3\2\2\2\u0577\u057a"+
		"\3\2\2\2\u0578\u0576\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u0095\3\2\2\2\u057a"+
		"\u0578\3\2\2\2\u057b\u0589\5D#\2\u057c\u057d\7j\2\2\u057d\u057f\5\u0164"+
		"\u00b3\2\u057e\u0580\5\u00a0Q\2\u057f\u057e\3\2\2\2\u057f\u0580\3\2\2"+
		"\2\u0580\u0581\3\2\2\2\u0581\u0582\5\u0090I\2\u0582\u0589\3\2\2\2\u0583"+
		"\u0584\t\26\2\2\u0584\u0586\5\u0164\u00b3\2\u0585\u0587\5\u00a0Q\2\u0586"+
		"\u0585\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0589\3\2\2\2\u0588\u057b\3\2"+
		"\2\2\u0588\u057c\3\2\2\2\u0588\u0583\3\2\2\2\u0589\u0097\3\2\2\2\u058a"+
		"\u0592\7\n\2\2\u058b\u058e\7\64\2\2\u058c\u058d\7\u00b0\2\2\u058d\u058f"+
		"\7\u00c5\2\2\u058e\u058c\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0592\3\2\2"+
		"\2\u0590\u0592\7\u00c5\2\2\u0591\u058a\3\2\2\2\u0591\u058b\3\2\2\2\u0591"+
		"\u0590\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0594\7\u00b6"+
		"\2\2\u0594\u0595\7\31\2\2\u0595\u0596\5\u0164\u00b3\2\u0596\u0597\t\24"+
		"\2\2\u0597\u0598\5\u009aN\2\u0598\u059c\7V\2\2\u0599\u059a\5\u0164\u00b3"+
		"\2\u059a\u059b\7\u013b\2\2\u059b\u059d\3\2\2\2\u059c\u0599\3\2\2\2\u059c"+
		"\u059d\3\2\2\2\u059d\u0099\3\2\2\2\u059e\u059f\5\u009cO\2\u059f\u05a5"+
		"\7\u013b\2\2\u05a0\u05a1\5\u009cO\2\u05a1\u05a2\7\u013b\2\2\u05a2\u05a4"+
		"\3\2\2\2\u05a3\u05a0\3\2\2\2\u05a4\u05a7\3\2\2\2\u05a5\u05a3\3\2\2\2\u05a5"+
		"\u05a6\3\2\2\2\u05a6\u009b\3\2\2\2\u05a7\u05a5\3\2\2\2\u05a8\u05ac\5D"+
		"#\2\u05a9\u05ac\5\u008eH\2\u05aa\u05ac\5\u009eP\2\u05ab\u05a8\3\2\2\2"+
		"\u05ab\u05a9\3\2\2\2\u05ab\u05aa\3\2\2\2\u05ac\u009d\3\2\2\2\u05ad\u05b5"+
		"\7\n\2\2\u05ae\u05b1\7\64\2\2\u05af\u05b0\7\u00b0\2\2\u05b0\u05b2\7\u00c5"+
		"\2\2\u05b1\u05af\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b5\3\2\2\2\u05b3"+
		"\u05b5\7\u00c5\2\2\u05b4\u05ad\3\2\2\2\u05b4\u05ae\3\2\2\2\u05b4\u05b3"+
		"\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b7\t\26\2\2"+
		"\u05b7\u05b9\5\u0164\u00b3\2\u05b8\u05ba\5\u00a0Q\2\u05b9\u05b8\3\2\2"+
		"\2\u05b9\u05ba\3\2\2\2\u05ba\u05bc\3\2\2\2\u05bb\u05bd\5\u00a4S\2\u05bc"+
		"\u05bb\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05bf\3\2\2\2\u05be\u05c0\t\24"+
		"\2\2\u05bf\u05be\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c2\3\2\2\2\u05c1"+
		"\u05c3\5B\"\2\u05c2\u05c1\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c5\3\2"+
		"\2\2\u05c4\u05c6\5\u00eex\2\u05c5\u05c4\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6"+
		"\u05c7\3\2\2\2\u05c7\u05cb\5\f\7\2\u05c8\u05c9\5\u0164\u00b3\2\u05c9\u05ca"+
		"\7\u013b\2\2\u05ca\u05cc\3\2\2\2\u05cb\u05c8\3\2\2\2\u05cb\u05cc\3\2\2"+
		"\2\u05cc\u009f\3\2\2\2\u05cd\u05ce\7\u0136\2\2\u05ce\u05e4\7\u0139\2\2"+
		"\u05cf\u05d0\7\u0136\2\2\u05d0\u05d5\5\u00a2R\2\u05d1\u05d2\7\u0128\2"+
		"\2\u05d2\u05d4\5\u00a2R\2\u05d3\u05d1\3\2\2\2\u05d4\u05d7\3\2\2\2\u05d5"+
		"\u05d3\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05d8\3\2\2\2\u05d7\u05d5\3\2"+
		"\2\2\u05d8\u05d9\7\u0139\2\2\u05d9\u05e4\3\2\2\2\u05da\u05db\6Q\4\2\u05db"+
		"\u05e0\5\u00a2R\2\u05dc\u05dd\7\u0128\2\2\u05dd\u05df\5\u00a2R\2\u05de"+
		"\u05dc\3\2\2\2\u05df\u05e2\3\2\2\2\u05e0\u05de\3\2\2\2\u05e0\u05e1\3\2"+
		"\2\2\u05e1\u05e4\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e3\u05cd\3\2\2\2\u05e3"+
		"\u05cf\3\2\2\2\u05e3\u05da\3\2\2\2\u05e4\u00a1\3\2\2\2\u05e5\u05eb\7v"+
		"\2\2\u05e6\u05eb\7\u00b2\2\2\u05e7\u05eb\7z\2\2\u05e8\u05e9\7v\2\2\u05e9"+
		"\u05eb\7\u00b2\2\2\u05ea\u05e5\3\2\2\2\u05ea\u05e6\3\2\2\2\u05ea\u05e7"+
		"\3\2\2\2\u05ea\u05e8\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec"+
		"\u05ed\5\u0164\u00b3\2\u05ed\u05ef\5\u0082B\2\u05ee\u05f0\5\u0084C\2\u05ef"+
		"\u05ee\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f4\3\2\2\2\u05f1\u05f3\5\u0086"+
		"D\2\u05f2\u05f1\3\2\2\2\u05f3\u05f6\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f4"+
		"\u05f5\3\2\2\2\u05f5\u05f8\3\2\2\2\u05f6\u05f4\3\2\2\2\u05f7\u05f9\5\u0088"+
		"E\2\u05f8\u05f7\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u0610\3\2\2\2\u05fa"+
		"\u0600\5\u0164\u00b3\2\u05fb\u0601\7v\2\2\u05fc\u0601\7\u00b2\2\2\u05fd"+
		"\u0601\7z\2\2\u05fe\u05ff\7v\2\2\u05ff\u0601\7\u00b2\2\2\u0600\u05fb\3"+
		"\2\2\2\u0600\u05fc\3\2\2\2\u0600\u05fd\3\2\2\2\u0600\u05fe\3\2\2\2\u0600"+
		"\u0601\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0604\5\u0082B\2\u0603\u0605"+
		"\5\u0084C\2\u0604\u0603\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0609\3\2\2"+
		"\2\u0606\u0608\5\u0086D\2\u0607\u0606\3\2\2\2\u0608\u060b\3\2\2\2\u0609"+
		"\u0607\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u060d\3\2\2\2\u060b\u0609\3\2"+
		"\2\2\u060c\u060e\5\u0088E\2\u060d\u060c\3\2\2\2\u060d\u060e\3\2\2\2\u060e"+
		"\u0610\3\2\2\2\u060f\u05ea\3\2\2\2\u060f\u05fa\3\2\2\2\u0610\u00a3\3\2"+
		"\2\2\u0611\u0613\5\u00a6T\2\u0612\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614"+
		"\u0612\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u00a5\3\2\2\2\u0616\u0617\7\u008c"+
		"\2\2\u0617\u0622\7\u00e3\2\2\u0618\u0619\7\u00e3\2\2\u0619\u061a\7\u00d7"+
		"\2\2\u061a\u0622\t\27\2\2\u061b\u061d\7Q\2\2\u061c\u061b\3\2\2\2\u061c"+
		"\u061d\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u061f\7\u00c7\2\2\u061f\u0620"+
		"\7\u00dc\2\2\u0620\u0622\7\u0140\2\2\u0621\u0616\3\2\2\2\u0621\u0618\3"+
		"\2\2\2\u0621\u061c\3\2\2\2\u0622\u00a7\3\2\2\2\u0623\u0625\t\30\2\2\u0624"+
		"\u0626\7u\2\2\u0625\u0624\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0627\3\2"+
		"\2\2\u0627\u062d\5\u013c\u009f\2\u0628\u0629\7\u0136\2\2\u0629\u062a\5"+
		"\u015c\u00af\2\u062a\u062b\7\u0139\2\2\u062b\u062e\3\2\2\2\u062c\u062e"+
		"\5\u015c\u00af\2\u062d\u0628\3\2\2\2\u062d\u062c\3\2\2\2\u062d\u062e\3"+
		"\2\2\2\u062e\u0638\3\2\2\2\u062f\u0630\7\u0083\2\2\u0630\u0635\7\u013d"+
		"\2\2\u0631\u0632\7\u0128\2\2\u0632\u0634\7\u013d\2\2\u0633\u0631\3\2\2"+
		"\2\u0634\u0637\3\2\2\2\u0635\u0633\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0639"+
		"\3\2\2\2\u0637\u0635\3\2\2\2\u0638\u062f\3\2\2\2\u0638\u0639\3\2\2\2\u0639"+
		"\u063b\3\2\2\2\u063a\u063c\5\u00f0y\2\u063b\u063a\3\2\2\2\u063b\u063c"+
		"\3\2\2\2\u063c\u00a9\3\2\2\2\u063d\u0641\5\u00acW\2\u063e\u0641\5\u00ae"+
		"X\2\u063f\u0641\5\u00b0Y\2\u0640\u063d\3\2\2\2\u0640\u063e\3\2\2\2\u0640"+
		"\u063f\3\2\2\2\u0641\u00ab\3\2\2\2\u0642\u0643\7t\2\2\u0643\u0644\5\u012c"+
		"\u0097\2\u0644\u0645\7\u00f2\2\2\u0645\u0649\5\4\3\2\u0646\u0648\5\u00b2"+
		"Z\2\u0647\u0646\3\2\2\2\u0648\u064b\3\2\2\2\u0649\u0647\3\2\2\2\u0649"+
		"\u064a\3\2\2\2\u064a\u064d\3\2\2\2\u064b\u0649\3\2\2\2\u064c\u064e\5\u00b4"+
		"[\2\u064d\u064c\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u064f\3\2\2\2\u064f"+
		"\u0650\7V\2\2\u0650\u0651\7t\2\2\u0651\u00ad\3\2\2\2\u0652\u0653\7t\2"+
		"\2\u0653\u0654\5\u012c\u0097\2\u0654\u0657\5\b\5\2\u0655\u0656\7R\2\2"+
		"\u0656\u0658\5\b\5\2\u0657\u0655\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u00af"+
		"\3\2\2\2\u0659\u065a\7\6\2\2\u065a\u065b\7t\2\2\u065b\u065c\5\u012c\u0097"+
		"\2\u065c\u065d\7\u00f2\2\2\u065d\u065e\5\b\5\2\u065e\u00b1\3\2\2\2\u065f"+
		"\u0660\t\31\2\2\u0660\u0661\5\u012c\u0097\2\u0661\u0662\7\u00f2\2\2\u0662"+
		"\u0663\5\4\3\2\u0663\u00b3\3\2\2\2\u0664\u0665\7R\2\2\u0665\u0666\5\4"+
		"\3\2\u0666\u00b5\3\2\2\2\u0667\u0669\7_\2\2\u0668\u066a\7\u013d\2\2\u0669"+
		"\u0668\3\2\2\2\u0669\u066a\3\2\2\2\u066a\u066d\3\2\2\2\u066b\u066c\7\u0107"+
		"\2\2\u066c\u066e\5\u012c\u0097\2\u066d\u066b\3\2\2\2\u066d\u066e\3\2\2"+
		"\2\u066e\u00b7\3\2\2\2\u066f\u0671\7\u008d\2\2\u0670\u0672\7\u013d\2\2"+
		"\u0671\u0670\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u00b9\3\2\2\2\u0673\u0674"+
		"\7\'\2\2\u0674\u0675\t\32\2\2\u0675\u0676\5\u00bc_\2\u0676\u0677\7\u0128"+
		"\2\2\u0677\u0678\5\u00bc_\2\u0678\u00bb\3\2\2\2\u0679\u067b\5\u011c\u008f"+
		"\2\u067a\u067c\5\u011e\u0090\2\u067b\u067a\3\2\2\2\u067b\u067c\3\2\2\2"+
		"\u067c\u0682\3\2\2\2\u067d\u067e\7\u0136\2\2\u067e\u067f\5\u00f2z\2\u067f"+
		"\u0680\7\u0139\2\2\u0680\u0682\3\2\2\2\u0681\u0679\3\2\2\2\u0681\u067d"+
		"\3\2\2\2\u0682\u0685\3\2\2\2\u0683\u0684\7\17\2\2\u0684\u0686\5\u0164"+
		"\u00b3\2\u0685\u0683\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u00bd\3\2\2\2\u0687"+
		"\u0689\7\64\2\2\u0688\u068a\7\u00fb\2\2\u0689\u0688\3\2\2\2\u0689\u068a"+
		"\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068c\7w\2\2\u068c\u068d\5\u0164\u00b3"+
		"\2\u068d\u068e\7\u00ad\2\2\u068e\u068f\5\u011c\u008f\2\u068f\u0690\7\u0136"+
		"\2\2\u0690\u0695\5\u00c0a\2\u0691\u0692\7\u0128\2\2\u0692\u0694\5\u00c0"+
		"a\2\u0693\u0691\3\2\2\2\u0694\u0697\3\2\2\2\u0695\u0693\3\2\2\2\u0695"+
		"\u0696\3\2\2\2\u0696\u0698\3\2\2\2\u0697\u0695\3\2\2\2\u0698\u0699\7\u0139"+
		"\2\2\u0699\u00bf\3\2\2\2\u069a\u069c\5\u0164\u00b3\2\u069b\u069d\t\b\2"+
		"\2\u069c\u069b\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u00c1\3\2\2\2\u069e\u069f"+
		"\5\u00c4c\2\u069f\u00c3\3\2\2\2\u06a0\u06a1\7\u010a\2\2\u06a1\u06a2\7"+
		"\u0136\2\2\u06a2\u06a3\5\u0164\u00b3\2\u06a3\u06a4\7\u012c\2\2\u06a4\u06ac"+
		"\5\u0164\u00b3\2\u06a5\u06a6\7\u0128\2\2\u06a6\u06a7\5\u0164\u00b3\2\u06a7"+
		"\u06a8\7\u012c\2\2\u06a8\u06a9\5\u0164\u00b3\2\u06a9\u06ab\3\2\2\2\u06aa"+
		"\u06a5\3\2\2\2\u06ab\u06ae\3\2\2\2\u06ac\u06aa\3\2\2\2\u06ac\u06ad\3\2"+
		"\2\2\u06ad\u06af\3\2\2\2\u06ae\u06ac\3\2\2\2\u06af\u06b3\7\u0139\2\2\u06b0"+
		"\u06b2\5~@\2\u06b1\u06b0\3\2\2\2\u06b2\u06b5\3\2\2\2\u06b3\u06b1\3\2\2"+
		"\2\u06b3\u06b4\3\2\2\2\u06b4\u00c5\3\2\2\2\u06b5\u06b3\3\2\2\2\u06b6\u06b8"+
		"\7\6\2\2\u06b7\u06b6\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9"+
		"\u06bb\7\u00c1\2\2\u06ba\u06bc\5\u013c\u009f\2\u06bb\u06ba\3\2\2\2\u06bb"+
		"\u06bc\3\2\2\2\u06bc\u00c7\3\2\2\2\u06bd\u06bf\7\u00c9\2\2\u06be\u06c0"+
		"\5\u013c\u009f\2\u06bf\u06be\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u00c9\3"+
		"\2\2\2\u06c1\u06c2\5\u00ccg\2\u06c2\u06c3\5\u00d2j\2\u06c3\u00cb\3\2\2"+
		"\2\u06c4\u06c5\5\u0082B\2\u06c5\u06c6\5\u0164\u00b3\2\u06c6\u06c7\7\u0136"+
		"\2\2\u06c7\u06c8\5\u00ceh\2\u06c8\u06c9\7\u0139\2\2\u06c9\u00cd\3\2\2"+
		"\2\u06ca\u06cf\5\u00d0i\2\u06cb\u06cc\7\u0128\2\2\u06cc\u06ce\5\u00d0"+
		"i\2\u06cd\u06cb\3\2\2\2\u06ce\u06d1\3\2\2\2\u06cf\u06cd\3\2\2\2\u06cf"+
		"\u06d0\3\2\2\2\u06d0\u00cf\3\2\2\2\u06d1\u06cf\3\2\2\2\u06d2\u06d3\5\u0082"+
		"B\2\u06d3\u06d4\5\u0164\u00b3\2\u06d4\u00d1\3\2\2\2\u06d5\u06d9\7\u0135"+
		"\2\2\u06d6\u06d8\5\u00e8u\2\u06d7\u06d6\3\2\2\2\u06d8\u06db\3\2\2\2\u06d9"+
		"\u06d7\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06dc\3\2\2\2\u06db\u06d9\3\2"+
		"\2\2\u06dc\u06dd\7\u0138\2\2\u06dd\u00d3\3\2\2\2\u06de\u06df\7t\2\2\u06df"+
		"\u06e0\7\u0136\2\2\u06e0\u06e1\5\u012c\u0097\2\u06e1\u06e2\7\u0139\2\2"+
		"\u06e2\u06e6\5\u00e6t\2\u06e3\u06e5\5\u00d6l\2\u06e4\u06e3\3\2\2\2\u06e5"+
		"\u06e8\3\2\2\2\u06e6\u06e4\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06ea\3\2"+
		"\2\2\u06e8\u06e6\3\2\2\2\u06e9\u06eb\5\u00d8m\2\u06ea\u06e9\3\2\2\2\u06ea"+
		"\u06eb\3\2\2\2\u06eb\u00d5\3\2\2\2\u06ec\u06ed\t\31\2\2\u06ed\u06ee\7"+
		"\u0136\2\2\u06ee\u06ef\5\u012c\u0097\2\u06ef\u06f0\7\u0139\2\2\u06f0\u06f1"+
		"\5\u00e6t\2\u06f1\u00d7\3\2\2\2\u06f2\u06f3\7R\2\2\u06f3\u06f4\5\u00e6"+
		"t\2\u06f4\u00d9\3\2\2\2\u06f5\u06f6\5\u00dco\2\u06f6\u06f7\5\u00e6t\2"+
		"\u06f7\u00db\3\2\2\2\u06f8\u06f9\7d\2\2\u06f9\u06fa\7\u0136\2\2\u06fa"+
		"\u06fb\5\u00dep\2\u06fb\u06fc\7\u013b\2\2\u06fc\u06fd\5\u012c\u0097\2"+
		"\u06fd\u06fe\7\u013b\2\2\u06fe\u06ff\5\u00e2r\2\u06ff\u0700\7\u0139\2"+
		"\2\u0700\u00dd\3\2\2\2\u0701\u0706\5\u00e0q\2\u0702\u0703\7\u0128\2\2"+
		"\u0703\u0705\5\u00e0q\2\u0704\u0702\3\2\2\2\u0705\u0708\3\2\2\2\u0706"+
		"\u0704\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u00df\3\2\2\2\u0708\u0706\3\2"+
		"\2\2\u0709\u070b\5\u0082B\2\u070a\u0709\3\2\2\2\u070a\u070b\3\2\2\2\u070b"+
		"\u070c\3\2\2\2\u070c\u070d\5\u0164\u00b3\2\u070d\u070e\7\u012c\2\2\u070e"+
		"\u070f\7\u0140\2\2\u070f\u00e1\3\2\2\2\u0710\u0715\5\u00e4s\2\u0711\u0712"+
		"\7\u0128\2\2\u0712\u0714\5\u00e4s\2\u0713\u0711\3\2\2\2\u0714\u0717\3"+
		"\2\2\2\u0715\u0713\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u00e3\3\2\2\2\u0717"+
		"\u0715\3\2\2\2\u0718\u0719\5\u0164\u00b3\2\u0719\u071a\7\u0126\2\2\u071a"+
		"\u071b\7\u0126\2\2\u071b\u0730\3\2\2\2\u071c\u071d\5\u0164\u00b3\2\u071d"+
		"\u071e\7\u013c\2\2\u071e\u071f\7\u013c\2\2\u071f\u0730\3\2\2\2\u0720\u0721"+
		"\5\u0164\u00b3\2\u0721\u0722\7\u012c\2\2\u0722\u0723\7\u0140\2\2\u0723"+
		"\u0730\3\2\2\2\u0724\u0725\5\u0164\u00b3\2\u0725\u0726\7\u012c\2\2\u0726"+
		"\u0727\5\u0164\u00b3\2\u0727\u0728\t\33\2\2\u0728\u0729\7\u0140\2\2\u0729"+
		"\u0730\3\2\2\2\u072a\u072b\5\u0164\u00b3\2\u072b\u072c\t\33\2\2\u072c"+
		"\u072d\7\u012c\2\2\u072d\u072e\7\u0140\2\2\u072e\u0730\3\2\2\2\u072f\u0718"+
		"\3\2\2\2\u072f\u071c\3\2\2\2\u072f\u0720\3\2\2\2\u072f\u0724\3\2\2\2\u072f"+
		"\u072a\3\2\2\2\u0730\u00e5\3\2\2\2\u0731\u0735\7\u0135\2\2\u0732\u0734"+
		"\5\u00e8u\2\u0733\u0732\3\2\2\2\u0734\u0737\3\2\2\2\u0735\u0733\3\2\2"+
		"\2\u0735\u0736\3\2\2\2\u0736\u0738\3\2\2\2\u0737\u0735\3\2\2\2\u0738\u073b"+
		"\7\u0138\2\2\u0739\u073b\5\u00e8u\2\u073a\u0731\3\2\2\2\u073a\u0739\3"+
		"\2\2\2\u073b\u00e7\3\2\2\2\u073c\u073f\5\u00d4k\2\u073d\u073f\5\u00da"+
		"n\2\u073e\u073c\3\2\2\2\u073e\u073d\3\2\2\2\u073f\u00e9\3\2\2\2\u0740"+
		"\u0741\7\u0109\2\2\u0741\u0742\5\u012c\u0097\2\u0742\u0743\t\34\2\2\u0743"+
		"\u0744\5\4\3\2\u0744\u0746\7V\2\2\u0745\u0747\t\35\2\2\u0746\u0745\3\2"+
		"\2\2\u0746\u0747\3\2\2\2\u0747\u00eb\3\2\2\2\u0748\u0749\7d\2\2\u0749"+
		"\u074a\7\u013d\2\2\u074a\u074c\7v\2\2\u074b\u074d\7\u00cb\2\2\u074c\u074b"+
		"\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u074f\5\u013c\u009f"+
		"\2\u074f\u0750\7\u012b\2\2\u0750\u0753\5\u013c\u009f\2\u0751\u0752\t\36"+
		"\2\2\u0752\u0754\5\u013c\u009f\2\u0753\u0751\3\2\2\2\u0753\u0754\3\2\2"+
		"\2\u0754\u0755\3\2\2\2\u0755\u0756\7\u009a\2\2\u0756\u0757\5\4\3\2\u0757"+
		"\u0758\7V\2\2\u0758\u0759\7\u009a\2\2\u0759\u00ed\3\2\2\2\u075a\u0761"+
		"\7\u0146\2\2\u075b\u075c\7\u0132\2\2\u075c\u075d\7\u0132\2\2\u075d\u075e"+
		"\7\u013d\2\2\u075e\u075f\7\u0130\2\2\u075f\u0761\7\u0130\2\2\u0760\u075a"+
		"\3\2\2\2\u0760\u075b\3\2\2\2\u0761\u00ef\3\2\2\2\u0762\u0763\7\u00ff\2"+
		"\2\u0763\u0768\5\u013c\u009f\2\u0764\u0765\7\u0128\2\2\u0765\u0767\5\u013c"+
		"\u009f\2\u0766\u0764\3\2\2\2\u0767\u076a\3\2\2\2\u0768\u0766\3\2\2\2\u0768"+
		"\u0769\3\2\2\2\u0769\u00f1\3\2\2\2\u076a\u0768\3\2\2\2\u076b\u076c\5\u00f4"+
		"{\2\u076c\u00f3\3\2\2\2\u076d\u0773\5\u00f6|\2\u076e\u076f\5\u00f8}\2"+
		"\u076f\u0770\5\u00f6|\2\u0770\u0772\3\2\2\2\u0771\u076e\3\2\2\2\u0772"+
		"\u0775\3\2\2\2\u0773\u0771\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u00f5\3\2"+
		"\2\2\u0775\u0773\3\2\2\2\u0776\u077c\5\u00fa~\2\u0777\u0778\7\u0136\2"+
		"\2\u0778\u0779\5\u00f4{\2\u0779\u077a\7\u0139\2\2\u077a\u077c\3\2\2\2"+
		"\u077b\u0776\3\2\2\2\u077b\u0777\3\2\2\2\u077c\u00f7\3\2\2\2\u077d\u077f"+
		"\7\u00fa\2\2\u077e\u0780\7\t\2\2\u077f\u077e\3\2\2\2\u077f\u0780\3\2\2"+
		"\2\u0780\u078a\3\2\2\2\u0781\u0783\7Y\2\2\u0782\u0784\7\t\2\2\u0783\u0782"+
		"\3\2\2\2\u0783\u0784\3\2\2\2\u0784\u078a\3\2\2\2\u0785\u0787\7\u0081\2"+
		"\2\u0786\u0788\7\t\2\2\u0787\u0786\3\2\2\2\u0787\u0788\3\2\2\2\u0788\u078a"+
		"\3\2\2\2\u0789\u077d\3\2\2\2\u0789\u0781\3\2\2\2\u0789\u0785\3\2\2\2\u078a"+
		"\u00f9\3\2\2\2\u078b\u078c\t\2\2\2\u078c\u078e\5\u00fc\177\2\u078d\u078f"+
		"\5\u0108\u0085\2\u078e\u078d\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u0791\3"+
		"\2\2\2\u0790\u0792\5\u010a\u0086\2\u0791\u0790\3\2\2\2\u0791\u0792\3\2"+
		"\2\2\u0792\u0794\3\2\2\2\u0793\u0795\5\u011e\u0090\2\u0794\u0793\3\2\2"+
		"\2\u0794\u0795\3\2\2\2\u0795\u0797\3\2\2\2\u0796\u0798\5\u0120\u0091\2"+
		"\u0797\u0796\3\2\2\2\u0797\u0798\3\2\2\2\u0798\u079b\3\2\2\2\u0799\u079c"+
		"\5\u0122\u0092\2\u079a\u079c\5\u0124\u0093\2\u079b\u0799\3\2\2\2\u079b"+
		"\u079a\3\2\2\2\u079b\u079c\3\2\2\2\u079c\u079e\3\2\2\2\u079d\u079f\5\u0126"+
		"\u0094\2\u079e\u079d\3\2\2\2\u079e\u079f\3\2\2\2\u079f\u07a1\3\2\2\2\u07a0"+
		"\u07a2\5\u0128\u0095\2\u07a1\u07a0\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u00fb"+
		"\3\2\2\2\u07a3\u07a5\5\u00fe\u0080\2\u07a4\u07a3\3\2\2\2\u07a4\u07a5\3"+
		"\2\2\2\u07a5\u07a7\3\2\2\2\u07a6\u07a8\5\u0100\u0081\2\u07a7\u07a6\3\2"+
		"\2\2\u07a7\u07a8\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07ae\5\u0102\u0082"+
		"\2\u07aa\u07ab\7\u0128\2\2\u07ab\u07ad\5\u0102\u0082\2\u07ac\u07aa\3\2"+
		"\2\2\u07ad\u07b0\3\2\2\2\u07ae\u07ac\3\2\2\2\u07ae\u07af\3\2\2\2\u07af"+
		"\u00fd\3\2\2\2\u07b0\u07ae\3\2\2\2\u07b1\u07b2\t\37\2\2\u07b2\u00ff\3"+
		"\2\2\2\u07b3\u07b4\7\u00f7\2\2\u07b4\u07b5\5\u013c\u009f\2\u07b5\u0101"+
		"\3\2\2\2\u07b6\u07b7\5\u0164\u00b3\2\u07b7\u07b8\7\u012c\2\2\u07b8\u07ba"+
		"\3\2\2\2\u07b9\u07b6\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb"+
		"\u07bd\5\u013c\u009f\2\u07bc\u07be\5\u0104\u0083\2\u07bd\u07bc\3\2\2\2"+
		"\u07bd\u07be\3\2\2\2\u07be\u07c1\3\2\2\2\u07bf\u07c1\5\u0106\u0084\2\u07c0"+
		"\u07b9\3\2\2\2\u07c0\u07bf\3\2\2\2\u07c1\u0103\3\2\2\2\u07c2\u07c4\6\u0083"+
		"\5\2\u07c3\u07c5\7\f\2\2\u07c4\u07c3\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5"+
		"\u07c6\3\2\2\2\u07c6\u07cc\5\u0164\u00b3\2\u07c7\u07c8\7\u0136\2\2\u07c8"+
		"\u07c9\7\u00f5\2\2\u07c9\u07ca\7\u013e\2\2\u07ca\u07cc\7\u0139\2\2\u07cb"+
		"\u07c2\3\2\2\2\u07cb\u07c7\3\2\2\2\u07cc\u0105\3\2\2\2\u07cd\u07ce\7\u013d"+
		"\2\2\u07ce\u07d0\7\6\2\2\u07cf\u07cd\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0"+
		"\u07d1\3\2\2\2\u07d1\u07d2\7\u0134\2\2\u07d2\u0107\3\2\2\2\u07d3\u07d4"+
		"\7\u0083\2\2\u07d4\u07d9\5\u0164\u00b3\2\u07d5\u07d6\7\u0128\2\2\u07d6"+
		"\u07d8\5\u0164\u00b3\2\u07d7\u07d5\3\2\2\2\u07d8\u07db\3\2\2\2\u07d9\u07d7"+
		"\3\2\2\2\u07d9\u07da\3\2\2\2\u07da\u0109\3\2\2\2\u07db\u07d9\3\2\2\2\u07dc"+
		"\u07dd\7h\2\2\u07dd\u07e1\5\u010c\u0087\2\u07de\u07e0\5\u0112\u008a\2"+
		"\u07df\u07de\3\2\2\2\u07e0\u07e3\3\2\2\2\u07e1\u07df\3\2\2\2\u07e1\u07e2"+
		"\3\2\2\2\u07e2\u010b\3\2\2\2\u07e3\u07e1\3\2\2\2\u07e4\u07e8\5\u010e\u0088"+
		"\2\u07e5\u07e8\5\u0110\u0089\2\u07e6\u07e8\5\u0116\u008c\2\u07e7\u07e4"+
		"\3\2\2\2\u07e7\u07e5\3\2\2\2\u07e7\u07e6\3\2\2\2\u07e8\u010d\3\2\2\2\u07e9"+
		"\u07eb\5\u011c\u008f\2\u07ea\u07ec\5\u011a\u008e\2\u07eb\u07ea\3\2\2\2"+
		"\u07eb\u07ec\3\2\2\2\u07ec\u010f\3\2\2\2\u07ed\u07ee\7\u0136\2\2\u07ee"+
		"\u07ef\5\u00f2z\2\u07ef\u07f1\7\u0139\2\2\u07f0\u07f2\5\u011a\u008e\2"+
		"\u07f1\u07f0\3\2\2\2\u07f1\u07f2\3\2\2\2\u07f2\u0111\3\2\2\2\u07f3\u07f4"+
		"\7\u0128\2\2\u07f4\u07fb\5\u010c\u0087\2\u07f5\u07f6\5\u0114\u008b\2\u07f6"+
		"\u07f7\5\u010c\u0087\2\u07f7\u07f8\7\u00ad\2\2\u07f8\u07f9\5\u012c\u0097"+
		"\2\u07f9\u07fb\3\2\2\2\u07fa\u07f3\3\2\2\2\u07fa\u07f5\3\2\2\2\u07fb\u0113"+
		"\3\2\2\2\u07fc\u07fe\7y\2\2\u07fd\u07fc\3\2\2\2\u07fd\u07fe\3\2\2\2\u07fe"+
		"\u07ff\3\2\2\2\u07ff\u0806\7\u0088\2\2\u0800\u0802\t \2\2\u0801\u0803"+
		"\7\u00b3\2\2\u0802\u0801\3\2\2\2\u0802\u0803\3\2\2\2\u0803\u0804\3\2\2"+
		"\2\u0804\u0806\7\u0088\2\2\u0805\u07fd\3\2\2\2\u0805\u0800\3\2\2\2\u0806"+
		"\u0115\3\2\2\2\u0807\u0808\7\u00ed\2\2\u0808\u0809\7\u0136\2\2\u0809\u080a"+
		"\7\u0101\2\2\u080a\u080f\5\u0118\u008d\2\u080b\u080c\7\u0128\2\2\u080c"+
		"\u080e\5\u0118\u008d\2\u080d\u080b\3\2\2\2\u080e\u0811\3\2\2\2\u080f\u080d"+
		"\3\2\2\2\u080f\u0810\3\2\2\2\u0810\u0812\3\2\2\2\u0811\u080f\3\2\2\2\u0812"+
		"\u0814\7\u0139\2\2\u0813\u0815\5\u011a\u008e\2\u0814\u0813\3\2\2\2\u0814"+
		"\u0815\3\2\2\2\u0815\u0117\3\2\2\2\u0816\u0823\5\u013c\u009f\2\u0817\u0818"+
		"\7\u0136\2\2\u0818\u081d\5\u013c\u009f\2\u0819\u081a\7\u0128\2\2\u081a"+
		"\u081c\5\u013c\u009f\2\u081b\u0819\3\2\2\2\u081c\u081f\3\2\2\2\u081d\u081b"+
		"\3\2\2\2\u081d\u081e\3\2\2\2\u081e\u0820\3\2\2\2\u081f\u081d\3\2\2\2\u0820"+
		"\u0821\7\u0139\2\2\u0821\u0823\3\2\2\2\u0822\u0816\3\2\2\2\u0822\u0817"+
		"\3\2\2\2\u0823\u0119\3\2\2\2\u0824\u0826\6\u008e\6\2\u0825\u0827\7\f\2"+
		"\2\u0826\u0825\3\2\2\2\u0826\u0827\3\2\2\2\u0827\u0828\3\2\2\2\u0828\u0833"+
		"\5\u0164\u00b3\2\u0829\u082a\7\u0136\2\2\u082a\u082f\7\u013d\2\2\u082b"+
		"\u082c\7\u0128\2\2\u082c\u082e\7\u013d\2\2\u082d\u082b\3\2\2\2\u082e\u0831"+
		"\3\2\2\2\u082f\u082d\3\2\2\2\u082f\u0830\3\2\2\2\u0830\u0832\3\2\2\2\u0831"+
		"\u082f\3\2\2\2\u0832\u0834\7\u0139\2\2\u0833\u0829\3\2\2\2\u0833\u0834"+
		"\3\2\2\2\u0834\u011b\3\2\2\2\u0835\u0836\5\u0164\u00b3\2\u0836\u011d\3"+
		"\2\2\2\u0837\u0838\7\u0108\2\2\u0838\u0839\5\u012c\u0097\2\u0839\u011f"+
		"\3\2\2\2\u083a\u083b\7n\2\2\u083b\u083c\7\33\2\2\u083c\u0841\5\u013c\u009f"+
		"\2\u083d\u083e\7\u0128\2\2\u083e\u0840\5\u013c\u009f\2\u083f\u083d\3\2"+
		"\2\2\u0840\u0843\3\2\2\2\u0841\u083f\3\2\2\2\u0841\u0842\3\2\2\2\u0842"+
		"\u0121\3\2\2\2\u0843\u0841\3\2\2\2\u0844\u0845\7q\2\2\u0845\u0846\5\u012c"+
		"\u0097\2\u0846\u0123\3\2\2\2\u0847\u0848\7\u00c0\2\2\u0848\u0849\5\u012c"+
		"\u0097\2\u0849\u0125\3\2\2\2\u084a\u084b\7\u00b1\2\2\u084b\u084c\7\33"+
		"\2\2\u084c\u084e\5\u013c\u009f\2\u084d\u084f\t\b\2\2\u084e\u084d\3\2\2"+
		"\2\u084e\u084f\3\2\2\2\u084f\u0857\3\2\2\2\u0850\u0851\7\u0128\2\2\u0851"+
		"\u0853\5\u013c\u009f\2\u0852\u0854\t\b\2\2\u0853\u0852\3\2\2\2\u0853\u0854"+
		"\3\2\2\2\u0854\u0856\3\2\2\2\u0855\u0850\3\2\2\2\u0856\u0859\3\2\2\2\u0857"+
		"\u0855\3\2\2\2\u0857\u0858\3\2\2\2\u0858\u0127\3\2\2\2\u0859\u0857\3\2"+
		"\2\2\u085a\u085c\5\u012a\u0096\2\u085b\u085a\3\2\2\2\u085c\u085d\3\2\2"+
		"\2\u085d\u085b\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u0129\3\2\2\2\u085f\u0860"+
		"\7\u0090\2\2\u0860\u086b\5\u013c\u009f\2\u0861\u0862\7\u010a\2\2\u0862"+
		"\u0868\t!\2\2\u0863\u0864\7\u00fe\2\2\u0864\u0865\7\13\2\2\u0865\u0866"+
		"\7\u0089\2\2\u0866\u0867\t\"\2\2\u0867\u0869\7\u0096\2\2\u0868\u0863\3"+
		"\2\2\2\u0868\u0869\3\2\2\2\u0869\u086b\3\2\2\2\u086a\u085f\3\2\2\2\u086a"+
		"\u0861\3\2\2\2\u086b\u012b\3\2\2\2\u086c\u086e\b\u0097\1\2\u086d\u086f"+
		"\7\u00a8\2\2\u086e\u086d\3\2\2\2\u086e\u086f\3\2\2\2\u086f\u0870\3\2\2"+
		"\2\u0870\u0871\7\u0136\2\2\u0871\u0872\5\u012c\u0097\2\u0872\u0873\7\u0139"+
		"\2\2\u0873\u0876\3\2\2\2\u0874\u0876\5\u012e\u0098\2\u0875\u086c\3\2\2"+
		"\2\u0875\u0874\3\2\2\2\u0876\u087d\3\2\2\2\u0877\u0878\f\4\2\2\u0878\u0879"+
		"\5\u0138\u009d\2\u0879\u087a\5\u012c\u0097\5\u087a\u087c\3\2\2\2\u087b"+
		"\u0877\3\2\2\2\u087c\u087f\3\2\2\2\u087d\u087b\3\2\2\2\u087d\u087e\3\2"+
		"\2\2\u087e\u012d\3\2\2\2\u087f\u087d\3\2\2\2\u0880\u0884\5\u0130\u0099"+
		"\2\u0881\u0884\5\u0136\u009c\2\u0882\u0884\5\u013c\u009f\2\u0883\u0880"+
		"\3\2\2\2\u0883\u0881\3\2\2\2\u0883\u0882\3\2\2\2\u0884\u012f\3\2\2\2\u0885"+
		"\u0886\5\u013c\u009f\2\u0886\u0888\7\u0085\2\2\u0887\u0889\7\u00a8\2\2"+
		"\u0888\u0887\3\2\2\2\u0888\u0889\3\2\2\2\u0889\u088a\3\2\2\2\u088a\u088b"+
		"\7\u00aa\2\2\u088b\u089d\3\2\2\2\u088c\u088d\5\u013c\u009f\2\u088d\u088e"+
		"\7\23\2\2\u088e\u088f\5\u013c\u009f\2\u088f\u0890\7\13\2\2\u0890\u0891"+
		"\5\u013c\u009f\2\u0891\u089d\3\2\2\2\u0892\u0894\7\u00a8\2\2\u0893\u0892"+
		"\3\2\2\2\u0893\u0894\3\2\2\2\u0894\u0895\3\2\2\2\u0895\u0896\7^\2\2\u0896"+
		"\u0897\7\u0136\2\2\u0897\u0898\5\u00f2z\2\u0898\u0899\7\u0139\2\2\u0899"+
		"\u089d\3\2\2\2\u089a\u089d\5\u0132\u009a\2\u089b\u089d\5\u0134\u009b\2"+
		"\u089c\u0885\3\2\2\2\u089c\u088c\3\2\2\2\u089c\u0893\3\2\2\2\u089c\u089a"+
		"\3\2\2\2\u089c\u089b\3\2\2\2\u089d\u0131\3\2\2\2\u089e\u08a0\5\u013c\u009f"+
		"\2\u089f\u08a1\7\u00a8\2\2\u08a0\u089f\3\2\2\2\u08a0\u08a1\3\2\2\2\u08a1"+
		"\u08a2\3\2\2\2\u08a2\u08a3\7v\2\2\u08a3\u08ad\7\u0136\2\2\u08a4\u08a9"+
		"\5\u013c\u009f\2\u08a5\u08a6\7\u0128\2\2\u08a6\u08a8\5\u013c\u009f\2\u08a7"+
		"\u08a5\3\2\2\2\u08a8\u08ab\3\2\2\2\u08a9\u08a7\3\2\2\2\u08a9\u08aa\3\2"+
		"\2\2\u08aa\u08ae\3\2\2\2\u08ab\u08a9\3\2\2\2\u08ac\u08ae\5\u00f2z\2\u08ad"+
		"\u08a4\3\2\2\2\u08ad\u08ac\3\2\2\2\u08ae\u08af\3\2\2\2\u08af\u08b0\7\u0139"+
		"\2\2\u08b0\u0133\3\2\2\2\u08b1\u08b2\7\u0136\2\2\u08b2\u08b7\5\u013c\u009f"+
		"\2\u08b3\u08b4\7\u0128\2\2\u08b4\u08b6\5\u013c\u009f\2\u08b5\u08b3\3\2"+
		"\2\2\u08b6\u08b9\3\2\2\2\u08b7\u08b5\3\2\2\2\u08b7\u08b8\3\2\2\2\u08b8"+
		"\u08ba\3\2\2\2\u08b9\u08b7\3\2\2\2\u08ba\u08bc\7\u0139\2\2\u08bb\u08bd"+
		"\7\u00a8\2\2\u08bc\u08bb\3\2\2\2\u08bc\u08bd\3\2\2\2\u08bd\u08be\3\2\2"+
		"\2\u08be\u08bf\7v\2\2\u08bf\u08c0\7\u0136\2\2\u08c0\u08c1\5\u00f2z\2\u08c1"+
		"\u08c2\7\u0139\2\2\u08c2\u0135\3\2\2\2\u08c3\u08c4\5\u013c\u009f\2\u08c4"+
		"\u08c5\5\u013a\u009e\2\u08c5\u08c6\5\u013c\u009f\2\u08c6\u0137\3\2\2\2"+
		"\u08c7\u08c8\t#\2\2\u08c8\u0139\3\2\2\2\u08c9\u08d6\7\u012c\2\2\u08ca"+
		"\u08d6\7\u012d\2\2\u08cb\u08d6\7\u012e\2\2\u08cc\u08d6\7\u012f\2\2\u08cd"+
		"\u08d6\7\u0132\2\2\u08ce\u08d6\7\u0133\2\2\u08cf\u08d6\7\u0130\2\2\u08d0"+
		"\u08d6\7\u0131\2\2\u08d1\u08d3\7\u00a8\2\2\u08d2\u08d1\3\2\2\2\u08d2\u08d3"+
		"\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08d6\t$\2\2\u08d5\u08c9\3\2\2\2\u08d5"+
		"\u08ca\3\2\2\2\u08d5\u08cb\3\2\2\2\u08d5\u08cc\3\2\2\2\u08d5\u08cd\3\2"+
		"\2\2\u08d5\u08ce\3\2\2\2\u08d5\u08cf\3\2\2\2\u08d5\u08d0\3\2\2\2\u08d5"+
		"\u08d2\3\2\2\2\u08d6\u013b\3\2\2\2\u08d7\u08d8\b\u009f\1\2\u08d8\u08d9"+
		"\7\u0136\2\2\u08d9\u08da\5\u00f2z\2\u08da\u08db\7\u0139\2\2\u08db\u08e9"+
		"\3\2\2\2\u08dc\u08dd\7\u0136\2\2\u08dd\u08de\5\u013c\u009f\2\u08de\u08df"+
		"\7\u0139\2\2\u08df\u08e9\3\2\2\2\u08e0\u08e9\5\u0140\u00a1\2\u08e1\u08e9"+
		"\5\u0144\u00a3\2\u08e2\u08e9\5\u0148\u00a5\2\u08e3\u08e9\5\u014e\u00a8"+
		"\2\u08e4\u08e9\5\u0150\u00a9\2\u08e5\u08e9\5\u0158\u00ad\2\u08e6\u08e9"+
		"\5\u015a\u00ae\2\u08e7\u08e9\5\u013e\u00a0\2\u08e8\u08d7\3\2\2\2\u08e8"+
		"\u08dc\3\2\2\2\u08e8\u08e0\3\2\2\2\u08e8\u08e1\3\2\2\2\u08e8\u08e2\3\2"+
		"\2\2\u08e8\u08e3\3\2\2\2\u08e8\u08e4\3\2\2\2\u08e8\u08e5\3\2\2\2\u08e8"+
		"\u08e6\3\2\2\2\u08e8\u08e7\3\2\2\2\u08e9\u08fa\3\2\2\2\u08ea\u08eb\f\20"+
		"\2\2\u08eb\u08ec\7\u0134\2\2\u08ec\u08f9\5\u013c\u009f\21\u08ed\u08ee"+
		"\f\17\2\2\u08ee\u08ef\7\u012a\2\2\u08ef\u08f9\5\u013c\u009f\20\u08f0\u08f1"+
		"\f\16\2\2\u08f1\u08f2\7\u0126\2\2\u08f2\u08f9\5\u013c\u009f\17\u08f3\u08f4"+
		"\f\r\2\2";
	private static final String _serializedATNSegment1 =
		"\u08f4\u08f5\7\u013c\2\2\u08f5\u08f9\5\u013c\u009f\16\u08f6\u08f7\f\21"+
		"\2\2\u08f7\u08f9\5\u0142\u00a2\2\u08f8\u08ea\3\2\2\2\u08f8\u08ed\3\2\2"+
		"\2\u08f8\u08f0\3\2\2\2\u08f8\u08f3\3\2\2\2\u08f8\u08f6\3\2\2\2\u08f9\u08fc"+
		"\3\2\2\2\u08fa\u08f8\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u013d\3\2\2\2\u08fc"+
		"\u08fa\3\2\2\2\u08fd\u0906\5\u0160\u00b1\2\u08fe\u0906\5\u0162\u00b2\2"+
		"\u08ff\u0906\5\u016c\u00b7\2\u0900\u0906\5\u0164\u00b3\2\u0901\u0906\5"+
		"\u0166\u00b4\2\u0902\u0906\5\u016a\u00b6\2\u0903\u0906\5\u0168\u00b5\2"+
		"\u0904\u0906\5\u016e\u00b8\2\u0905\u08fd\3\2\2\2\u0905\u08fe\3\2\2\2\u0905"+
		"\u08ff\3\2\2\2\u0905\u0900\3\2\2\2\u0905\u0901\3\2\2\2\u0905\u0902\3\2"+
		"\2\2\u0905\u0903\3\2\2\2\u0905\u0904\3\2\2\2\u0906\u013f\3\2\2\2\u0907"+
		"\u0908\7\u0082\2\2\u0908\u0909\5\u013c\u009f\2\u0909\u090a\5\u0142\u00a2"+
		"\2\u090a\u0141\3\2\2\2\u090b\u090c\t%\2\2\u090c\u0143\3\2\2\2\u090d\u090e"+
		"\5\u0146\u00a4\2\u090e\u090f\t&\2\2\u090f\u0914\5\u0146\u00a4\2\u0910"+
		"\u0911\t&\2\2\u0911\u0913\5\u0146\u00a4\2\u0912\u0910\3\2\2\2\u0913\u0916"+
		"\3\2\2\2\u0914\u0912\3\2\2\2\u0914\u0915\3\2\2\2\u0915\u0145\3\2\2\2\u0916"+
		"\u0914\3\2\2\2\u0917\u0918\7\u0136\2\2\u0918\u0919\5\u013c\u009f\2\u0919"+
		"\u091a\7\u0139\2\2\u091a\u0921\3\2\2\2\u091b\u0921\5\u0148\u00a5\2\u091c"+
		"\u0921\5\u0150\u00a9\2\u091d\u0921\5\u0158\u00ad\2\u091e\u0921\5\u015a"+
		"\u00ae\2\u091f\u0921\5\u013e\u00a0\2\u0920\u0917\3\2\2\2\u0920\u091b\3"+
		"\2\2\2\u0920\u091c\3\2\2\2\u0920\u091d\3\2\2\2\u0920\u091e\3\2\2\2\u0920"+
		"\u091f\3\2\2\2\u0921\u0147\3\2\2\2\u0922\u0925\5\u014a\u00a6\2\u0923\u0925"+
		"\5\u014c\u00a7\2\u0924\u0922\3\2\2\2\u0924\u0923\3\2\2\2\u0925\u0149\3"+
		"\2\2\2\u0926\u0927\7\37\2\2\u0927\u092d\5\u013c\u009f\2\u0928\u0929\7"+
		"\u0107\2\2\u0929\u092a\5\u013c\u009f\2\u092a\u092b\7\u00f2\2\2\u092b\u092c"+
		"\5\u013c\u009f\2\u092c\u092e\3\2\2\2\u092d\u0928\3\2\2\2\u092e\u092f\3"+
		"\2\2\2\u092f\u092d\3\2\2\2\u092f\u0930\3\2\2\2\u0930\u0933\3\2\2\2\u0931"+
		"\u0932\7R\2\2\u0932\u0934\5\u013c\u009f\2\u0933\u0931\3\2\2\2\u0933\u0934"+
		"\3\2\2\2\u0934\u0935\3\2\2\2\u0935\u0936\7V\2\2\u0936\u014b\3\2\2\2\u0937"+
		"\u093d\7\37\2\2\u0938\u0939\7\u0107\2\2\u0939\u093a\5\u012c\u0097\2\u093a"+
		"\u093b\7\u00f2\2\2\u093b\u093c\5\u013c\u009f\2\u093c\u093e\3\2\2\2\u093d"+
		"\u0938\3\2\2\2\u093e\u093f\3\2\2\2\u093f\u093d\3\2\2\2\u093f\u0940\3\2"+
		"\2\2\u0940\u0943\3\2\2\2\u0941\u0942\7R\2\2\u0942\u0944\5\u013c\u009f"+
		"\2\u0943\u0941\3\2\2\2\u0943\u0944\3\2\2\2\u0944\u0945\3\2\2\2\u0945\u0946"+
		"\7V\2\2\u0946\u014d\3\2\2\2\u0947\u0948\5\u0164\u00b3\2\u0948\u0949\7"+
		"\5\2\2\u0949\u094a\t\'\2\2\u094a\u014f\3\2\2\2\u094b\u094c\7\21\2\2\u094c"+
		"\u094e\7\u0136\2\2\u094d\u094f\5\u0152\u00aa\2\u094e\u094d\3\2\2\2\u094e"+
		"\u094f\3\2\2\2\u094f\u0950\3\2\2\2\u0950\u0951\5\u013c\u009f\2\u0951\u0953"+
		"\7\u0139\2\2\u0952\u0954\5\u0154\u00ab\2\u0953\u0952\3\2\2\2\u0953\u0954"+
		"\3\2\2\2\u0954\u09e4\3\2\2\2\u0955\u0956\7\62\2\2\u0956\u095c\7\u0136"+
		"\2\2\u0957\u0959\5\u0152\u00aa\2\u0958\u0957\3\2\2\2\u0958\u0959\3\2\2"+
		"\2\u0959\u095a\3\2\2\2\u095a\u095d\5\u013c\u009f\2\u095b\u095d\7\u0134"+
		"\2\2\u095c\u0958\3\2\2\2\u095c\u095b\3\2\2\2\u095d\u095e\3\2\2\2\u095e"+
		"\u0960\7\u0139\2\2\u095f\u0961\5\u0154\u00ab\2\u0960\u095f\3\2\2\2\u0960"+
		"\u0961\3\2\2\2\u0961\u09e4\3\2\2\2\u0962\u0963\7\63\2\2\u0963\u0969\7"+
		"\u0136\2\2\u0964\u0966\5\u0152\u00aa\2\u0965\u0964\3\2\2\2\u0965\u0966"+
		"\3\2\2\2\u0966\u0967\3\2\2\2\u0967\u096a\5\u013c\u009f\2\u0968\u096a\7"+
		"\u0134\2\2\u0969\u0965\3\2\2\2\u0969\u0968\3\2\2\2\u096a\u096b\3\2\2\2"+
		"\u096b\u096d\7\u0139\2\2\u096c\u096e\5\u0154\u00ab\2\u096d\u096c\3\2\2"+
		"\2\u096d\u096e\3\2\2\2\u096e\u09e4\3\2\2\2\u096f\u0970\7\u010f\2\2\u0970"+
		"\u0971\7\u0136\2\2\u0971\u0972\7\u0139\2\2\u0972\u09e4\5\u0154\u00ab\2"+
		"\u0973\u0974\7\u0113\2\2\u0974\u0975\7\u0136\2\2\u0975\u0976\7\u0139\2"+
		"\2\u0976\u09e4\5\u0154\u00ab\2\u0977\u0978\7\u0114\2\2\u0978\u0979\7\u0136"+
		"\2\2\u0979\u097a\5\u013c\u009f\2\u097a\u097b\7\u0139\2\2\u097b\u097c\5"+
		"\u0154\u00ab\2\u097c\u09e4\3\2\2\2\u097d\u097e\7\u0115\2\2\u097e\u097f"+
		"\7\u0136\2\2\u097f\u0986\5\u013c\u009f\2\u0980\u0981\7\u0128\2\2\u0981"+
		"\u0984\5\u013c\u009f\2\u0982\u0983\7\u0128\2\2\u0983\u0985\5\u013c\u009f"+
		"\2\u0984\u0982\3\2\2\2\u0984\u0985\3\2\2\2\u0985\u0987\3\2\2\2\u0986\u0980"+
		"\3\2\2\2\u0986\u0987\3\2\2\2\u0987\u0988\3\2\2\2\u0988\u0989\7\u0139\2"+
		"\2\u0989\u098a\5\u0154\u00ab\2\u098a\u09e4\3\2\2\2\u098b\u098c\7\u0116"+
		"\2\2\u098c\u098d\7\u0136\2\2\u098d\u098e\5\u013c\u009f\2\u098e\u098f\7"+
		"\u0139\2\2\u098f\u0990\5\u0154\u00ab\2\u0990\u09e4\3\2\2\2\u0991\u0992"+
		"\7\u0117\2\2\u0992\u0993\7\u0136\2\2\u0993\u099a\5\u013c\u009f\2\u0994"+
		"\u0995\7\u0128\2\2\u0995\u0998\5\u013c\u009f\2\u0996\u0997\7\u0128\2\2"+
		"\u0997\u0999\5\u013c\u009f\2\u0998\u0996\3\2\2\2\u0998\u0999\3\2\2\2\u0999"+
		"\u099b\3\2\2\2\u099a\u0994\3\2\2\2\u099a\u099b\3\2\2\2\u099b\u099c\3\2"+
		"\2\2\u099c\u099d\7\u0139\2\2\u099d\u099e\5\u0154\u00ab\2\u099e\u09e4\3"+
		"\2\2\2\u099f\u09a0\7\u009c\2\2\u09a0\u09a2\7\u0136\2\2\u09a1\u09a3\5\u0152"+
		"\u00aa\2\u09a2\u09a1\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3\u09a4\3\2\2\2\u09a4"+
		"\u09a5\5\u013c\u009f\2\u09a5\u09a7\7\u0139\2\2\u09a6\u09a8\5\u0154\u00ab"+
		"\2\u09a7\u09a6\3\2\2\2\u09a7\u09a8\3\2\2\2\u09a8\u09e4\3\2\2\2\u09a9\u09aa"+
		"\7\u00a1\2\2\u09aa\u09ac\7\u0136\2\2\u09ab\u09ad\5\u0152\u00aa\2\u09ac"+
		"\u09ab\3\2\2\2\u09ac\u09ad\3\2\2\2\u09ad\u09ae\3\2\2\2\u09ae\u09af\5\u013c"+
		"\u009f\2\u09af\u09b1\7\u0139\2\2\u09b0\u09b2\5\u0154\u00ab\2\u09b1\u09b0"+
		"\3\2\2\2\u09b1\u09b2\3\2\2\2\u09b2\u09e4\3\2\2\2\u09b3\u09b4\7\u0120\2"+
		"\2\u09b4\u09b5\7\u0136\2\2\u09b5\u09b6\7\u0139\2\2\u09b6\u09e4\5\u0154"+
		"\u00ab\2\u09b7\u09b8\7\u0121\2\2\u09b8\u09b9\7\u0136\2\2\u09b9\u09ba\7"+
		"\u0139\2\2\u09ba\u09e4\5\u0154\u00ab\2\u09bb\u09bc\7\u0122\2\2\u09bc\u09be"+
		"\7\u0136\2\2\u09bd\u09bf\5\u0152\u00aa\2\u09be\u09bd\3\2\2\2\u09be\u09bf"+
		"\3\2\2\2\u09bf\u09c0\3\2\2\2\u09c0\u09c1\5\u013c\u009f\2\u09c1\u09c3\7"+
		"\u0139\2\2\u09c2\u09c4\5\u0154\u00ab\2\u09c3\u09c2\3\2\2\2\u09c3\u09c4"+
		"\3\2\2\2\u09c4\u09e4\3\2\2\2\u09c5\u09c6\7\u00eb\2\2\u09c6\u09c8\7\u0136"+
		"\2\2\u09c7\u09c9\5\u0152\u00aa\2\u09c8\u09c7\3\2\2\2\u09c8\u09c9\3\2\2"+
		"\2\u09c9\u09ca\3\2\2\2\u09ca\u09cb\5\u013c\u009f\2\u09cb\u09cd\7\u0139"+
		"\2\2\u09cc\u09ce\5\u0154\u00ab\2\u09cd\u09cc\3\2\2\2\u09cd\u09ce\3\2\2"+
		"\2\u09ce\u09e4\3\2\2\2\u09cf\u09d0\7\u0102\2\2\u09d0\u09d2\7\u0136\2\2"+
		"\u09d1\u09d3\5\u0152\u00aa\2\u09d2\u09d1\3\2\2\2\u09d2\u09d3\3\2\2\2\u09d3"+
		"\u09d4\3\2\2\2\u09d4\u09d5\5\u013c\u009f\2\u09d5\u09d7\7\u0139\2\2\u09d6"+
		"\u09d8\5\u0154\u00ab\2\u09d7\u09d6\3\2\2\2\u09d7\u09d8\3\2\2\2\u09d8\u09e4"+
		"\3\2\2\2\u09d9\u09da\7\u0124\2\2\u09da\u09dc\7\u0136\2\2\u09db\u09dd\5"+
		"\u0152\u00aa\2\u09dc\u09db\3\2\2\2\u09dc\u09dd\3\2\2\2\u09dd\u09de\3\2"+
		"\2\2\u09de\u09df\5\u013c\u009f\2\u09df\u09e1\7\u0139\2\2\u09e0\u09e2\5"+
		"\u0154\u00ab\2\u09e1\u09e0\3\2\2\2\u09e1\u09e2\3\2\2\2\u09e2\u09e4\3\2"+
		"\2\2\u09e3\u094b\3\2\2\2\u09e3\u0955\3\2\2\2\u09e3\u0962\3\2\2\2\u09e3"+
		"\u096f\3\2\2\2\u09e3\u0973\3\2\2\2\u09e3\u0977\3\2\2\2\u09e3\u097d\3\2"+
		"\2\2\u09e3\u098b\3\2\2\2\u09e3\u0991\3\2\2\2\u09e3\u099f\3\2\2\2\u09e3"+
		"\u09a9\3\2\2\2\u09e3\u09b3\3\2\2\2\u09e3\u09b7\3\2\2\2\u09e3\u09bb\3\2"+
		"\2\2\u09e3\u09c5\3\2\2\2\u09e3\u09cf\3\2\2\2\u09e3\u09d9\3\2\2\2\u09e4"+
		"\u0151\3\2\2\2\u09e5\u09e6\t\37\2\2\u09e6\u0153\3\2\2\2\u09e7\u09e8\7"+
		"\u00b4\2\2\u09e8\u09ea\7\u0136\2\2\u09e9\u09eb\5\u0156\u00ac\2\u09ea\u09e9"+
		"\3\2\2\2\u09ea\u09eb\3\2\2\2\u09eb\u09ed\3\2\2\2\u09ec\u09ee\5\u0126\u0094"+
		"\2\u09ed\u09ec\3\2\2\2\u09ed\u09ee\3\2\2\2\u09ee\u09ef\3\2\2\2\u09ef\u09f0"+
		"\7\u0139\2\2\u09f0\u0155\3\2\2\2\u09f1\u09f2\7\u00b7\2\2\u09f2\u09f3\7"+
		"\33\2\2\u09f3\u09f8\5\u013c\u009f\2\u09f4\u09f5\7\u0128\2\2\u09f5\u09f7"+
		"\5\u013c\u009f\2\u09f6\u09f4\3\2\2\2\u09f7\u09fa\3\2\2\2\u09f8\u09f6\3"+
		"\2\2\2\u09f8\u09f9\3\2\2\2\u09f9\u0157\3\2\2\2\u09fa\u09f8\3\2\2\2\u09fb"+
		"\u0ac4\7\u010e\2\2\u09fc\u09fd\7!\2\2\u09fd\u09fe\7\u0136\2\2\u09fe\u09ff"+
		"\5\u013c\u009f\2\u09ff\u0a00\7\f\2\2\u0a00\u0a02\5\u0082B\2\u0a01\u0a03"+
		"\5\u0084C\2\u0a02\u0a01\3\2\2\2\u0a02\u0a03\3\2\2\2\u0a03\u0a04\3\2\2"+
		"\2\u0a04\u0a05\7\u0139\2\2\u0a05\u0ac4\3\2\2\2\u0a06\u0a07\7\62\2\2\u0a07"+
		"\u0a0a\7\u0136\2\2\u0a08\u0a0b\5\u013c\u009f\2\u0a09\u0a0b\7\u0134\2\2"+
		"\u0a0a\u0a08\3\2\2\2\u0a0a\u0a09\3\2\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c\u0ac4"+
		"\7\u0139\2\2\u0a0d\u0ac4\7\u0110\2\2\u0a0e\u0a0f\78\2\2\u0a0f\u0ac4\7"+
		";\2\2\u0a10\u0a14\7\u0111\2\2\u0a11\u0a12\78\2\2\u0a12\u0a14\7\u00f3\2"+
		"\2\u0a13\u0a10\3\2\2\2\u0a13\u0a11\3\2\2\2\u0a14\u0a19\3\2\2\2\u0a15\u0a16"+
		"\7\u0136\2\2\u0a16\u0a17\5\u013c\u009f\2\u0a17\u0a18\7\u0139\2\2\u0a18"+
		"\u0a1a\3\2\2\2\u0a19\u0a15\3\2\2\2\u0a19\u0a1a\3\2\2\2\u0a1a\u0ac4\3\2"+
		"\2\2\u0a1b\u0ac4\7\u0112\2\2\u0a1c\u0a1d\78\2\2\u0a1d\u0ac4\7\u0125\2"+
		"\2\u0a1e\u0a1f\7\u0118\2\2\u0a1f\u0a20\7\u0136\2\2\u0a20\u0a2d\5\u013c"+
		"\u009f\2\u0a21\u0a22\7\u0128\2\2\u0a22\u0a2a\5\u013c\u009f\2\u0a23\u0a24"+
		"\7\u0128\2\2\u0a24\u0a25\5\u013c\u009f\2\u0a25\u0a26\7\u012c\2\2\u0a26"+
		"\u0a27\5\u013c\u009f\2\u0a27\u0a29\3\2\2\2\u0a28\u0a23\3\2\2\2\u0a29\u0a2c"+
		"\3\2\2\2\u0a2a\u0a28\3\2\2\2\u0a2a\u0a2b\3\2\2\2\u0a2b\u0a2e\3\2\2\2\u0a2c"+
		"\u0a2a\3\2\2\2\u0a2d\u0a21\3\2\2\2\u0a2d\u0a2e\3\2\2\2\u0a2e\u0a2f\3\2"+
		"\2\2\u0a2f\u0a30\7\u0139\2\2\u0a30\u0ac4\3\2\2\2\u0a31\u0a32\7\u0119\2"+
		"\2\u0a32\u0a33\7\u0136\2\2\u0a33\u0a40\5\u013c\u009f\2\u0a34\u0a35\7\u0128"+
		"\2\2\u0a35\u0a3d\5\u013c\u009f\2\u0a36\u0a37\7\u0128\2\2\u0a37\u0a38\5"+
		"\u013c\u009f\2\u0a38\u0a39\7\u012c\2\2\u0a39\u0a3a\5\u013c\u009f\2\u0a3a"+
		"\u0a3c\3\2\2\2\u0a3b\u0a36\3\2\2\2\u0a3c\u0a3f\3\2\2\2\u0a3d\u0a3b\3\2"+
		"\2\2\u0a3d\u0a3e\3\2\2\2\u0a3e\u0a41\3\2\2\2\u0a3f\u0a3d\3\2\2\2\u0a40"+
		"\u0a34\3\2\2\2\u0a40\u0a41\3\2\2\2\u0a41\u0a42\3\2\2\2\u0a42\u0a43\7\u0139"+
		"\2\2\u0a43\u0ac4\3\2\2\2\u0a44\u0a45\7\u011a\2\2\u0a45\u0a46\7\u0136\2"+
		"\2\u0a46\u0a53\5\u013c\u009f\2\u0a47\u0a48\7\u0128\2\2\u0a48\u0a50\5\u013c"+
		"\u009f\2\u0a49\u0a4a\7\u0128\2\2\u0a4a\u0a4b\5\u013c\u009f\2\u0a4b\u0a4c"+
		"\7\u012c\2\2\u0a4c\u0a4d\5\u013c\u009f\2\u0a4d\u0a4f\3\2\2\2\u0a4e\u0a49"+
		"\3\2\2\2\u0a4f\u0a52\3\2\2\2\u0a50\u0a4e\3\2\2\2\u0a50\u0a51\3\2\2\2\u0a51"+
		"\u0a54\3\2\2\2\u0a52\u0a50\3\2\2\2\u0a53\u0a47\3\2\2\2\u0a53\u0a54\3\2"+
		"\2\2\u0a54\u0a55\3\2\2\2\u0a55\u0a56\7\u0139\2\2\u0a56\u0ac4\3\2\2\2\u0a57"+
		"\u0a58\7\u011b\2\2\u0a58\u0a59\7\u0136\2\2\u0a59\u0a66\5\u013c\u009f\2"+
		"\u0a5a\u0a5b\7\u0128\2\2\u0a5b\u0a63\5\u013c\u009f\2\u0a5c\u0a5d\7\u0128"+
		"\2\2\u0a5d\u0a5e\5\u013c\u009f\2\u0a5e\u0a5f\7\u012c\2\2\u0a5f\u0a60\5"+
		"\u013c\u009f\2\u0a60\u0a62\3\2\2\2\u0a61\u0a5c\3\2\2\2\u0a62\u0a65\3\2"+
		"\2\2\u0a63\u0a61\3\2\2\2\u0a63\u0a64\3\2\2\2\u0a64\u0a67\3\2\2\2\u0a65"+
		"\u0a63\3\2\2\2\u0a66\u0a5a\3\2\2\2\u0a66\u0a67\3\2\2\2\u0a67\u0a68\3\2"+
		"\2\2\u0a68\u0a69\7\u0139\2\2\u0a69\u0ac4\3\2\2\2\u0a6a\u0a6b\7\u011c\2"+
		"\2\u0a6b\u0a6c\7\u0136\2\2\u0a6c\u0a79\5\u013c\u009f\2\u0a6d\u0a6e\7\u0128"+
		"\2\2\u0a6e\u0a76\5\u013c\u009f\2\u0a6f\u0a70\7\u0128\2\2\u0a70\u0a71\5"+
		"\u013c\u009f\2\u0a71\u0a72\7\u012c\2\2\u0a72\u0a73\5\u013c\u009f\2\u0a73"+
		"\u0a75\3\2\2\2\u0a74\u0a6f\3\2\2\2\u0a75\u0a78\3\2\2\2\u0a76\u0a74\3\2"+
		"\2\2\u0a76\u0a77\3\2\2\2\u0a77\u0a7a\3\2\2\2\u0a78\u0a76\3\2\2\2\u0a79"+
		"\u0a6d\3\2\2\2\u0a79\u0a7a\3\2\2\2\u0a7a\u0a7b\3\2\2\2\u0a7b\u0a7c\7\u0139"+
		"\2\2\u0a7c\u0ac4\3\2\2\2\u0a7d\u0a7e\7\u011d\2\2\u0a7e\u0a7f\7\u0136\2"+
		"\2\u0a7f\u0a8c\5\u013c\u009f\2\u0a80\u0a81\7\u0128\2\2\u0a81\u0a89\5\u013c"+
		"\u009f\2\u0a82\u0a83\7\u0128\2\2\u0a83\u0a84\5\u013c\u009f\2\u0a84\u0a85"+
		"\7\u012c\2\2\u0a85\u0a86\5\u013c\u009f\2\u0a86\u0a88\3\2\2\2\u0a87\u0a82"+
		"\3\2\2\2\u0a88\u0a8b\3\2\2\2\u0a89\u0a87\3\2\2\2\u0a89\u0a8a\3\2\2\2\u0a8a"+
		"\u0a8d\3\2\2\2\u0a8b\u0a89\3\2\2\2\u0a8c\u0a80\3\2\2\2\u0a8c\u0a8d\3\2"+
		"\2\2\u0a8d\u0a8e\3\2\2\2\u0a8e\u0a8f\7\u0139\2\2\u0a8f\u0ac4\3\2\2\2\u0a90"+
		"\u0a91\7\u011e\2\2\u0a91\u0a92\7\u0136\2\2\u0a92\u0a9a\5\u013c\u009f\2"+
		"\u0a93\u0a94\7\u0128\2\2\u0a94\u0a95\5\u013c\u009f\2\u0a95\u0a96\7\u012c"+
		"\2\2\u0a96\u0a97\5\u013c\u009f\2\u0a97\u0a99\3\2\2\2\u0a98\u0a93\3\2\2"+
		"\2\u0a99\u0a9c\3\2\2\2\u0a9a\u0a98\3\2\2\2\u0a9a\u0a9b\3\2\2\2\u0a9b\u0a9d"+
		"\3\2\2\2\u0a9c\u0a9a\3\2\2\2\u0a9d\u0a9e\7\u0139\2\2\u0a9e\u0ac4\3\2\2"+
		"\2\u0a9f\u0aa0\7\u011f\2\2\u0aa0\u0aa1\7\u0136\2\2\u0aa1\u0aa7\5\u013c"+
		"\u009f\2\u0aa2\u0aa3\7\u0128\2\2\u0aa3\u0aa4\5\u013c\u009f\2\u0aa4\u0aa5"+
		"\7\u012c\2\2\u0aa5\u0aa6\5\u013c\u009f\2\u0aa6\u0aa8\3\2\2\2\u0aa7\u0aa2"+
		"\3\2\2\2\u0aa8\u0aa9\3\2\2\2\u0aa9\u0aa7\3\2\2\2\u0aa9\u0aaa\3\2\2\2\u0aaa"+
		"\u0aad\3\2\2\2\u0aab\u0aac\7\u0128\2\2\u0aac\u0aae\5\u013c\u009f\2\u0aad"+
		"\u0aab\3\2\2\2\u0aad\u0aae\3\2\2\2\u0aae\u0aaf\3\2\2\2\u0aaf\u0ab0\7\u0139"+
		"\2\2\u0ab0\u0ac4\3\2\2\2\u0ab1\u0ab2\7\u00d3\2\2\u0ab2\u0ab3\7\u0136\2"+
		"\2\u0ab3\u0ab4\5\u013c\u009f\2\u0ab4\u0ab5\7\u0139\2\2\u0ab5\u0ac4\3\2"+
		"\2\2\u0ab6\u0ab7\7\u00ea\2\2\u0ab7\u0ab8\7\u0136\2\2\u0ab8\u0ab9\5\u013c"+
		"\u009f\2\u0ab9\u0aba\7h\2\2\u0aba\u0abd\5\u013c\u009f\2\u0abb\u0abc\7"+
		"d\2\2\u0abc\u0abe\5\u013c\u009f\2\u0abd\u0abb\3\2\2\2\u0abd\u0abe\3\2"+
		"\2\2\u0abe\u0abf\3\2\2\2\u0abf\u0ac0\7\u0139\2\2\u0ac0\u0ac4\3\2\2\2\u0ac1"+
		"\u0ac4\7\u0123\2\2\u0ac2\u0ac4\7\u0125\2\2\u0ac3\u09fb\3\2\2\2\u0ac3\u09fc"+
		"\3\2\2\2\u0ac3\u0a06\3\2\2\2\u0ac3\u0a0d\3\2\2\2\u0ac3\u0a0e\3\2\2\2\u0ac3"+
		"\u0a13\3\2\2\2\u0ac3\u0a1b\3\2\2\2\u0ac3\u0a1c\3\2\2\2\u0ac3\u0a1e\3\2"+
		"\2\2\u0ac3\u0a31\3\2\2\2\u0ac3\u0a44\3\2\2\2\u0ac3\u0a57\3\2\2\2\u0ac3"+
		"\u0a6a\3\2\2\2\u0ac3\u0a7d\3\2\2\2\u0ac3\u0a90\3\2\2\2\u0ac3\u0a9f\3\2"+
		"\2\2\u0ac3\u0ab1\3\2\2\2\u0ac3\u0ab6\3\2\2\2\u0ac3\u0ac1\3\2\2\2\u0ac3"+
		"\u0ac2\3\2\2\2\u0ac4\u0159\3\2\2\2\u0ac5\u0ac6\5\u0164\u00b3\2\u0ac6\u0ac8"+
		"\7\u0136\2\2\u0ac7\u0ac9\5\u015c\u00af\2\u0ac8\u0ac7\3\2\2\2\u0ac8\u0ac9"+
		"\3\2\2\2\u0ac9\u0aca\3\2\2\2\u0aca\u0acb\7\u0139\2\2\u0acb\u015b\3\2\2"+
		"\2\u0acc\u0ad1\5\u015e\u00b0\2\u0acd\u0ace\7\u0128\2\2\u0ace\u0ad0\5\u015e"+
		"\u00b0\2\u0acf\u0acd\3\2\2\2\u0ad0\u0ad3\3\2\2\2\u0ad1\u0acf\3\2\2\2\u0ad1"+
		"\u0ad2\3\2\2\2\u0ad2\u015d\3\2\2\2\u0ad3\u0ad1\3\2\2\2\u0ad4\u0ada\6\u00b0"+
		"\r\2\u0ad5\u0ad6\5\u0164\u00b3\2\u0ad6\u0ad8\7\u012c\2\2\u0ad7\u0ad9\7"+
		"\u0130\2\2\u0ad8\u0ad7\3\2\2\2\u0ad8\u0ad9\3\2\2\2\u0ad9\u0adb\3\2\2\2"+
		"\u0ada\u0ad5\3\2\2\2\u0ada\u0adb\3\2\2\2\u0adb\u0adc\3\2\2\2\u0adc\u0add"+
		"\5\u013c\u009f\2\u0add\u015f\3\2\2\2\u0ade\u0adf\7;\2\2\u0adf\u0ae0\5"+
		"\u0166\u00b4\2\u0ae0\u0161\3\2\2\2\u0ae1\u0ae2\7\u00f3\2\2\u0ae2\u0ae3"+
		"\5\u0166\u00b4\2\u0ae3\u0163\3\2\2\2\u0ae4\u0ae7\7\u013d\2\2\u0ae5\u0ae7"+
		"\5\u0172\u00ba\2\u0ae6\u0ae4\3\2\2\2\u0ae6\u0ae5\3\2\2\2\u0ae7\u0aef\3"+
		"\2\2\2\u0ae8\u0aeb\7\6\2\2\u0ae9\u0aec\7\u013d\2\2\u0aea\u0aec\5\u0172"+
		"\u00ba\2\u0aeb\u0ae9\3\2\2\2\u0aeb\u0aea\3\2\2\2\u0aec\u0aee\3\2\2\2\u0aed"+
		"\u0ae8\3\2\2\2\u0aee\u0af1\3\2\2\2\u0aef\u0aed\3\2\2\2\u0aef\u0af0\3\2"+
		"\2\2\u0af0\u0165\3\2\2\2\u0af1\u0aef\3\2\2\2\u0af2\u0af5\7\u013e\2\2\u0af3"+
		"\u0af5\7\u013f\2\2\u0af4\u0af2\3\2\2\2\u0af4\u0af3\3\2\2\2\u0af5\u0167"+
		"\3\2\2\2\u0af6\u0af8\t(\2\2\u0af7\u0af6\3\2\2\2\u0af7\u0af8\3\2\2\2\u0af8"+
		"\u0af9\3\2\2\2\u0af9\u0afa\7\u0140\2\2\u0afa\u0169\3\2\2\2\u0afb\u0afd"+
		"\t(\2\2\u0afc\u0afb\3\2\2\2\u0afc\u0afd\3\2\2\2\u0afd\u0afe\3\2\2\2\u0afe"+
		"\u0aff\7\u0141\2\2\u0aff\u016b\3\2\2\2\u0b00\u0b01\t)\2\2\u0b01\u016d"+
		"\3\2\2\2\u0b02\u0b03\7\u00aa\2\2\u0b03\u016f\3\2\2\2\u0b04\u0b05\7\7\2"+
		"\2\u0b05\u0171\3\2\2\2\u0b06\u0b07\t*\2\2\u0b07\u0173\3\2\2\2\u0164\u0179"+
		"\u017c\u0180\u0183\u0188\u018f\u0195\u0197\u01a0\u01a3\u01a5\u01c8\u01cc"+
		"\u01d1\u01d4\u01d8\u01dc\u01df\u01e2\u01e5\u01e9\u01ec\u01f2\u01f6\u0201"+
		"\u0207\u020f\u021d\u0226\u0228\u022c\u0234\u0238\u0240\u0247\u024d\u0250"+
		"\u0258\u025e\u0262\u0268\u0278\u027f\u0285\u0289\u0292\u0297\u029f\u02a4"+
		"\u02ad\u02b9\u02be\u02c1\u02cb\u02d4\u02e2\u02e6\u02f1\u02fc\u0306\u030d"+
		"\u0314\u0318\u031c\u0321\u0325\u032a\u032e\u0332\u033f\u0344\u034a\u035c"+
		"\u0368\u036c\u0374\u0377\u037c\u0381\u0388\u038f\u0392\u0399\u039f\u03a4"+
		"\u03aa\u03af\u03b2\u03b8\u03c6\u03d0\u03d6\u03db\u03e0\u03e5\u03e9\u03ee"+
		"\u03f1\u03fb\u0407\u040e\u0411\u041d\u0422\u0427\u042a\u0431\u043d\u044a"+
		"\u044c\u0451\u0454\u0463\u0469\u0474\u0477\u0481\u0488\u048e\u0496\u04a0"+
		"\u04b4\u04ba\u04be\u04c3\u04c7\u04cc\u04cf\u04d4\u04d7\u04e5\u0504\u0506"+
		"\u050b\u050f\u0514\u051b\u051e\u0521\u0526\u052a\u052c\u0533\u0539\u0540"+
		"\u0546\u0549\u054e\u0552\u0555\u055c\u0562\u0565\u056f\u0578\u057f\u0586"+
		"\u0588\u058e\u0591\u059c\u05a5\u05ab\u05b1\u05b4\u05b9\u05bc\u05bf\u05c2"+
		"\u05c5\u05cb\u05d5\u05e0\u05e3\u05ea\u05ef\u05f4\u05f8\u0600\u0604\u0609"+
		"\u060d\u060f\u0614\u061c\u0621\u0625\u062d\u0635\u0638\u063b\u0640\u0649"+
		"\u064d\u0657\u0669\u066d\u0671\u067b\u0681\u0685\u0689\u0695\u069c\u06ac"+
		"\u06b3\u06b7\u06bb\u06bf\u06cf\u06d9\u06e6\u06ea\u0706\u070a\u0715\u072f"+
		"\u0735\u073a\u073e\u0746\u074c\u0753\u0760\u0768\u0773\u077b\u077f\u0783"+
		"\u0787\u0789\u078e\u0791\u0794\u0797\u079b\u079e\u07a1\u07a4\u07a7\u07ae"+
		"\u07b9\u07bd\u07c0\u07c4\u07cb\u07cf\u07d9\u07e1\u07e7\u07eb\u07f1\u07fa"+
		"\u07fd\u0802\u0805\u080f\u0814\u081d\u0822\u0826\u082f\u0833\u0841\u084e"+
		"\u0853\u0857\u085d\u0868\u086a\u086e\u0875\u087d\u0883\u0888\u0893\u089c"+
		"\u08a0\u08a9\u08ad\u08b7\u08bc\u08d2\u08d5\u08e8\u08f8\u08fa\u0905\u0914"+
		"\u0920\u0924\u092f\u0933\u093f\u0943\u094e\u0953\u0958\u095c\u0960\u0965"+
		"\u0969\u096d\u0984\u0986\u0998\u099a\u09a2\u09a7\u09ac\u09b1\u09be\u09c3"+
		"\u09c8\u09cd\u09d2\u09d7\u09dc\u09e1\u09e3\u09ea\u09ed\u09f8\u0a02\u0a0a"+
		"\u0a13\u0a19\u0a2a\u0a2d\u0a3d\u0a40\u0a50\u0a53\u0a63\u0a66\u0a76\u0a79"+
		"\u0a89\u0a8c\u0a9a\u0aa9\u0aad\u0abd\u0ac3\u0ac8\u0ad1\u0ad8\u0ada\u0ae6"+
		"\u0aeb\u0aef\u0af4\u0af7\u0afc";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}