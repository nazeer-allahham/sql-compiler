// Generated from E:/ite-fourth-year/compilers/sql-compiler/src/com/sqlcompiler/antlr\Hplsql.g4 by ANTLR 4.7
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T_ACTION=7, T_ALL=8, T_ALTER=9, 
		T_AND=10, T_AS=11, T_ASC=12, T_ASSOCIATE=13, T_AT=14, T_AUTO_INCREMENT=15, 
		T_AVG=16, T_BEGIN=17, T_BETWEEN=18, T_BIGINT=19, T_BINARY_DOUBLE=20, T_BINARY_FLOAT=21, 
		T_BINARY_INTEGER=22, T_BIT=23, T_BODY=24, T_BREAK=25, T_BY=26, T_BYTE=27, 
		T_CALL=28, T_CASCADE=29, T_CASE=30, T_CASESPECIFIC=31, T_CAST=32, T_CHAR=33, 
		T_CHARACTER=34, T_CHARSET=35, T_CLOSE=36, T_CLUSTERED=37, T_CMP=38, T_COLLECT=39, 
		T_COLLECTION=40, T_COMMENT=41, T_CONSTANT=42, T_COMMIT=43, T_COMPRESS=44, 
		T_CONCAT=45, T_CONDITION=46, T_CONSTRAINT=47, T_CONTINUE=48, T_COUNT=49, 
		T_COUNT_BIG=50, T_CREATE=51, T_CREATION=52, T_CREATOR=53, T_CS=54, T_CURRENT=55, 
		T_DATABASE=56, T_DATA=57, T_DATE=58, T_DATETIME=59, T_DAY=60, T_DAYS=61, 
		T_DEC=62, T_DECIMAL=63, T_DECLARE=64, T_DEFAULT=65, T_DEFERRED=66, T_DEFINED=67, 
		T_DEFINER=68, T_DEFINITION=69, T_DELETE=70, T_DELIMITED=71, T_DESC=72, 
		T_DIR=73, T_DIRECTORY=74, T_DISTINCT=75, T_DISTRIBUTE=76, T_DO=77, T_DOUBLE=78, 
		T_DROP=79, T_DYNAMIC=80, T_ELSE=81, T_ELSEIF=82, T_ELSIF=83, T_ENABLE=84, 
		T_END=85, T_ENGINE=86, T_ESCAPED=87, T_EXCEPT=88, T_EXEC=89, T_EXECUTE=90, 
		T_EXCEPTION=91, T_EXCLUSIVE=92, T_EXISTS=93, T_EXIT=94, T_FALLBACK=95, 
		T_FALSE=96, T_FIELDS=97, T_FLOAT=98, T_FOR=99, T_FOREIGN=100, T_FORMAT=101, 
		T_FOUND=102, T_FROM=103, T_FULL=104, T_FUNCTION=105, T_GET=106, T_GLOBAL=107, 
		T_GO=108, T_GROUP=109, T_HANDLER=110, T_HASH=111, T_HAVING=112, T_HDFS=113, 
		T_IDENTITY=114, T_IF=115, T_IMMEDIATE=116, T_IN=117, T_INDEX=118, T_INITRANS=119, 
		T_INNER=120, T_INOUT=121, T_INSERT=122, T_INT=123, T_INT2=124, T_INT4=125, 
		T_INT8=126, T_INTEGER=127, T_INTERSECT=128, T_INTERVAL=129, T_INTO=130, 
		T_INVOKER=131, T_IS=132, T_ISOPEN=133, T_ITEMS=134, T_JOIN=135, T_KEEP=136, 
		T_KEY=137, T_KEYS=138, T_LANGUAGE=139, T_LEAVE=140, T_LEFT=141, T_LIKE=142, 
		T_LIMIT=143, T_LINES=144, T_LOCAL=145, T_LOCATION=146, T_LOCATOR=147, 
		T_LOCATORS=148, T_LOCKS=149, T_LOG=150, T_LOGGED=151, T_LOGGING=152, T_LOOP=153, 
		T_MAP=154, T_MAX=155, T_MAXTRANS=156, T_MERGE=157, T_MICROSECOND=158, 
		T_MICROSECONDS=159, T_MIN=160, T_MULTISET=161, T_NCHAR=162, T_NVARCHAR=163, 
		T_NO=164, T_NOCOMPRESS=165, T_NOLOGGING=166, T_NOT=167, T_NOTFOUND=168, 
		T_NULL=169, T_NUMERIC=170, T_NUMBER=171, T_ON=172, T_ONLY=173, T_OPEN=174, 
		T_OR=175, T_ORDER=176, T_OUT=177, T_OUTER=178, T_OVER=179, T_OWNER=180, 
		T_PACKAGE=181, T_PARTITION=182, T_PCTFREE=183, T_PCTUSED=184, T_PLS_INTEGER=185, 
		T_PRECISION=186, T_PRESERVE=187, T_PRIMARY=188, T_PROC=189, T_PROCEDURE=190, 
		T_QUALIFY=191, T_QUIT=192, T_REAL=193, T_REFERENCES=194, T_REGEXP=195, 
		T_REPLACE=196, T_RESTRICT=197, T_RESULT=198, T_RESULT_SET_LOCATOR=199, 
		T_RETURN=200, T_RETURNS=201, T_REVERSE=202, T_RIGHT=203, T_RLIKE=204, 
		T_ROW=205, T_ROWS=206, T_ROW_COUNT=207, T_RR=208, T_RS=209, T_TRIM=210, 
		T_SCHEMA=211, T_SECOND=212, T_SECONDS=213, T_SECURITY=214, T_SEGMENT=215, 
		T_SEL=216, T_SELECT=217, T_SET=218, T_SETS=219, T_SHARE=220, T_SIMPLE_DOUBLE=221, 
		T_SIMPLE_FLOAT=222, T_SIMPLE_INTEGER=223, T_SMALLDATETIME=224, T_SMALLINT=225, 
		T_SQL=226, T_SQLEXCEPTION=227, T_SQLWARNING=228, T_STEP=229, T_STORAGE=230, 
		T_STORED=231, T_STRING=232, T_SUBSTRING=233, T_SUM=234, T_SYS_REFCURSOR=235, 
		T_TABLE=236, T_TABLESPACE=237, T_TEMPORARY=238, T_TERMINATED=239, T_TEXTIMAGE_ON=240, 
		T_THEN=241, T_TIMESTAMP=242, T_TINYINT=243, T_TITLE=244, T_TO=245, T_TOP=246, 
		T_TRUE=247, T_TYPE=248, T_UNION=249, T_UNIQUE=250, T_UPDATE=251, T_UR=252, 
		T_USE=253, T_USING=254, T_VALUE=255, T_VALUES=256, T_VAR=257, T_VARCHAR=258, 
		T_VARCHAR2=259, T_VARYING=260, T_VOLATILE=261, T_WHEN=262, T_WHERE=263, 
		T_WHILE=264, T_WITH=265, T_WORK=266, T_XML=267, T_YES=268, T_ACTIVITY_COUNT=269, 
		T_CUME_DIST=270, T_CURRENT_DATE=271, T_CURRENT_TIMESTAMP=272, T_CURRENT_USER=273, 
		T_DENSE_RANK=274, T_FIRST_VALUE=275, T_LAG=276, T_LAST_VALUE=277, T_LEAD=278, 
		T_MAX_PART_STRING=279, T_MIN_PART_STRING=280, T_MAX_PART_INT=281, T_MIN_PART_INT=282, 
		T_MAX_PART_DATE=283, T_MIN_PART_DATE=284, T_PART_COUNT=285, T_PART_LOC=286, 
		T_RANK=287, T_ROW_NUMBER=288, T_STDEV=289, T_SYSDATE=290, T_VARIANCE=291, 
		T_USER=292, T_ADD=293, T_COLON=294, T_COMMA=295, T_PIPE=296, T_DIV=297, 
		T_DOT2=298, T_EQUAL=299, T_EQUAL2=300, T_NOTEQUAL=301, T_NOTEQUAL2=302, 
		T_GREATER=303, T_GREATEREQUAL=304, T_LESS=305, T_LESSEQUAL=306, T_MUL=307, 
		T_OPEN_B=308, T_OPEN_P=309, T_OPEN_SB=310, T_CLOSE_B=311, T_CLOSE_P=312, 
		T_CLOSE_SB=313, T_SEMICOLON=314, T_SUB=315, L_ID=316, L_INVALID_NAME=317, 
		L_S_STRING=318, L_D_STRING=319, L_INT=320, L_DEC=321, L_WS=322, L_M_COMMENT=323, 
		L_S_COMMENT=324, L_FILE=325, L_LABEL=326;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_begin_end_block = 2, RULE_single_block_stmt = 3, 
		RULE_block_end = 4, RULE_proc_block = 5, RULE_stmt = 6, RULE_exception_block = 7, 
		RULE_exception_block_item = 8, RULE_semicolon_stmt = 9, RULE_null_stmt = 10, 
		RULE_expr_stmt = 11, RULE_assignment_stmt = 12, RULE_assignment_stmt_item = 13, 
		RULE_assignment_stmt_single_item = 14, RULE_assignment_stmt_multiple_item = 15, 
		RULE_assignment_stmt_select_item = 16, RULE_associate_locator_stmt = 17, 
		RULE_break_stmt = 18, RULE_call_stmt = 19, RULE_close_stmt = 20, RULE_declare_stmt = 21, 
		RULE_declare_block = 22, RULE_declare_block_inplace = 23, RULE_declare_stmt_item = 24, 
		RULE_declare_var_item = 25, RULE_declare_condition_item = 26, RULE_declare_handler_item = 27, 
		RULE_declare_temporary_table_item = 28, RULE_create_table_stmt = 29, RULE_create_local_temp_table_stmt = 30, 
		RULE_create_table_definition = 31, RULE_create_table_columns = 32, RULE_create_table_columns_item = 33, 
		RULE_column_name = 34, RULE_create_table_column_inline_cons = 35, RULE_create_table_column_cons = 36, 
		RULE_create_table_fk_action = 37, RULE_create_table_preoptions = 38, RULE_create_table_preoptions_item = 39, 
		RULE_create_table_preoptions_td_item = 40, RULE_create_table_options = 41, 
		RULE_create_table_options_item = 42, RULE_create_table_options_ora_item = 43, 
		RULE_create_table_options_db2_item = 44, RULE_create_table_options_td_item = 45, 
		RULE_create_table_options_hive_item = 46, RULE_create_table_hive_row_format = 47, 
		RULE_create_table_hive_row_format_fields = 48, RULE_create_table_options_mssql_item = 49, 
		RULE_create_table_options_mysql_item = 50, RULE_dtype = 51, RULE_dtype_len = 52, 
		RULE_dtype_attr = 53, RULE_dtype_default = 54, RULE_create_database_stmt = 55, 
		RULE_create_database_option = 56, RULE_create_function_stmt = 57, RULE_create_function_return = 58, 
		RULE_create_package_stmt = 59, RULE_package_spec = 60, RULE_package_spec_item = 61, 
		RULE_create_package_body_stmt = 62, RULE_package_body = 63, RULE_package_body_item = 64, 
		RULE_create_procedure_stmt = 65, RULE_create_routine_params = 66, RULE_create_routine_param_item = 67, 
		RULE_create_routine_options = 68, RULE_create_routine_option = 69, RULE_exec_stmt = 70, 
		RULE_if_stmt = 71, RULE_if_plsql_stmt = 72, RULE_if_tsql_stmt = 73, RULE_if_bteq_stmt = 74, 
		RULE_elseif_block = 75, RULE_else_block = 76, RULE_exit_stmt = 77, RULE_leave_stmt = 78, 
		RULE_cmp_stmt = 79, RULE_cmp_source = 80, RULE_create_index_stmt = 81, 
		RULE_create_index_col = 82, RULE_index_storage_clause = 83, RULE_index_mssql_storage_clause = 84, 
		RULE_quit_stmt = 85, RULE_return_stmt = 86, RULE_while_stmt = 87, RULE_for_range_stmt = 88, 
		RULE_label = 89, RULE_using_clause = 90, RULE_select_stmt = 91, RULE_cte_select_stmt = 92, 
		RULE_cte_select_stmt_item = 93, RULE_cte_select_cols = 94, RULE_fullselect_stmt = 95, 
		RULE_fullselect_stmt_item = 96, RULE_fullselect_set_clause = 97, RULE_subselect_stmt = 98, 
		RULE_select_list = 99, RULE_select_list_set = 100, RULE_select_list_limit = 101, 
		RULE_select_list_item = 102, RULE_select_list_alias = 103, RULE_select_list_asterisk = 104, 
		RULE_into_clause = 105, RULE_from_clause = 106, RULE_from_table_clause = 107, 
		RULE_from_table_name_clause = 108, RULE_from_subselect_clause = 109, RULE_from_join_clause = 110, 
		RULE_from_join_type_clause = 111, RULE_from_table_values_clause = 112, 
		RULE_from_table_values_row = 113, RULE_from_alias_clause = 114, RULE_table_name = 115, 
		RULE_where_clause = 116, RULE_group_by_clause = 117, RULE_having_clause = 118, 
		RULE_qualify_clause = 119, RULE_order_by_clause = 120, RULE_select_options = 121, 
		RULE_select_options_item = 122, RULE_bool_expr = 123, RULE_non_balanced_bool_expr = 124, 
		RULE_bool_expr_atom = 125, RULE_bool_expr_unary = 126, RULE_bool_expr_single_in = 127, 
		RULE_bool_expr_multi_in = 128, RULE_bool_expr_binary = 129, RULE_bool_expr_logical_operator = 130, 
		RULE_bool_expr_binary_operator = 131, RULE_expr = 132, RULE_expr_atom = 133, 
		RULE_expr_interval = 134, RULE_interval_item = 135, RULE_expr_concat = 136, 
		RULE_expr_concat_item = 137, RULE_expr_case = 138, RULE_expr_case_simple = 139, 
		RULE_expr_case_searched = 140, RULE_expr_cursor_attribute = 141, RULE_expr_agg_window_func = 142, 
		RULE_expr_func_all_distinct = 143, RULE_expr_func_over_clause = 144, RULE_expr_func_partition_by_clause = 145, 
		RULE_expr_spec_func = 146, RULE_expr_func = 147, RULE_expr_func_params = 148, 
		RULE_func_param = 149, RULE_date_literal = 150, RULE_timestamp_literal = 151, 
		RULE_ident = 152, RULE_string = 153, RULE_int_number = 154, RULE_dec_number = 155, 
		RULE_bool_literal = 156, RULE_null_const = 157, RULE_new_line = 158, RULE_invalid_variable_name = 159, 
		RULE_non_reserved_words = 160;
	public static final String[] ruleNames = {
		"program", "block", "begin_end_block", "single_block_stmt", "block_end", 
		"proc_block", "stmt", "exception_block", "exception_block_item", "semicolon_stmt", 
		"null_stmt", "expr_stmt", "assignment_stmt", "assignment_stmt_item", "assignment_stmt_single_item", 
		"assignment_stmt_multiple_item", "assignment_stmt_select_item", "associate_locator_stmt", 
		"break_stmt", "call_stmt", "close_stmt", "declare_stmt", "declare_block", 
		"declare_block_inplace", "declare_stmt_item", "declare_var_item", "declare_condition_item", 
		"declare_handler_item", "declare_temporary_table_item", "create_table_stmt", 
		"create_local_temp_table_stmt", "create_table_definition", "create_table_columns", 
		"create_table_columns_item", "column_name", "create_table_column_inline_cons", 
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
		"index_mssql_storage_clause", "quit_stmt", "return_stmt", "while_stmt", 
		"for_range_stmt", "label", "using_clause", "select_stmt", "cte_select_stmt", 
		"cte_select_stmt_item", "cte_select_cols", "fullselect_stmt", "fullselect_stmt_item", 
		"fullselect_set_clause", "subselect_stmt", "select_list", "select_list_set", 
		"select_list_limit", "select_list_item", "select_list_alias", "select_list_asterisk", 
		"into_clause", "from_clause", "from_table_clause", "from_table_name_clause", 
		"from_subselect_clause", "from_join_clause", "from_join_type_clause", 
		"from_table_values_clause", "from_table_values_row", "from_alias_clause", 
		"table_name", "where_clause", "group_by_clause", "having_clause", "qualify_clause", 
		"order_by_clause", "select_options", "select_options_item", "bool_expr", 
		"non_balanced_bool_expr", "bool_expr_atom", "bool_expr_unary", "bool_expr_single_in", 
		"bool_expr_multi_in", "bool_expr_binary", "bool_expr_logical_operator", 
		"bool_expr_binary_operator", "expr", "expr_atom", "expr_interval", "interval_item", 
		"expr_concat", "expr_concat_item", "expr_case", "expr_case_simple", "expr_case_searched", 
		"expr_cursor_attribute", "expr_agg_window_func", "expr_func_all_distinct", 
		"expr_func_over_clause", "expr_func_partition_by_clause", "expr_spec_func", 
		"expr_func", "expr_func_params", "func_param", "date_literal", "timestamp_literal", 
		"ident", "string", "int_number", "dec_number", "bool_literal", "null_const", 
		"new_line", "invalid_variable_name", "non_reserved_words"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@'", "'#'", "'%'", "'.'", "'\n'", "'1'", null, null, null, null, 
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
		null, null, null, null, null, null, "'+'", "':'", "','", "'||'", "'/'", 
		"'..'", "'='", "'=='", "'<>'", "'!='", "'>'", "'>='", "'<'", "'<='", "'*'", 
		"'{'", "'('", "'['", "'}'", "')'", "']'", "';'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "T_ACTION", "T_ALL", "T_ALTER", 
		"T_AND", "T_AS", "T_ASC", "T_ASSOCIATE", "T_AT", "T_AUTO_INCREMENT", "T_AVG", 
		"T_BEGIN", "T_BETWEEN", "T_BIGINT", "T_BINARY_DOUBLE", "T_BINARY_FLOAT", 
		"T_BINARY_INTEGER", "T_BIT", "T_BODY", "T_BREAK", "T_BY", "T_BYTE", "T_CALL", 
		"T_CASCADE", "T_CASE", "T_CASESPECIFIC", "T_CAST", "T_CHAR", "T_CHARACTER", 
		"T_CHARSET", "T_CLOSE", "T_CLUSTERED", "T_CMP", "T_COLLECT", "T_COLLECTION", 
		"T_COMMENT", "T_CONSTANT", "T_COMMIT", "T_COMPRESS", "T_CONCAT", "T_CONDITION", 
		"T_CONSTRAINT", "T_CONTINUE", "T_COUNT", "T_COUNT_BIG", "T_CREATE", "T_CREATION", 
		"T_CREATOR", "T_CS", "T_CURRENT", "T_DATABASE", "T_DATA", "T_DATE", "T_DATETIME", 
		"T_DAY", "T_DAYS", "T_DEC", "T_DECIMAL", "T_DECLARE", "T_DEFAULT", "T_DEFERRED", 
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
		"T_SUB", "L_ID", "L_INVALID_NAME", "L_S_STRING", "L_D_STRING", "L_INT", 
		"L_DEC", "L_WS", "L_M_COMMENT", "L_S_COMMENT", "L_FILE", "L_LABEL"
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
			setState(322);
			block();
			setState(323);
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
			setState(332); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(325);
						begin_end_block();
						}
						break;
					case 2:
						{
						setState(326);
						stmt();
						}
						break;
					}
					setState(330);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(329);
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
				setState(334); 
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
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(336);
				declare_block();
				}
			}

			setState(339);
			match(T_BEGIN);
			setState(340);
			block();
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(341);
				exception_block();
				}
				break;
			}
			setState(344);
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
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(T_BEGIN);
				setState(347);
				block();
				setState(349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(348);
					exception_block();
					}
					break;
				}
				setState(351);
				block_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				stmt();
				setState(355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(354);
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
			setState(359);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(360);
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
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				begin_end_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(363);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(366); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(368);
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
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				associate_locator_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				break_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(376);
				call_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(377);
				close_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(378);
				cmp_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(379);
				create_database_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(380);
				create_function_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(381);
				create_index_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(382);
				create_local_temp_table_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(383);
				create_package_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(384);
				create_package_body_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(385);
				create_procedure_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(386);
				create_table_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(387);
				declare_stmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(388);
				exec_stmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(389);
				exit_stmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(390);
				for_range_stmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(391);
				if_stmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(392);
				leave_stmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(393);
				quit_stmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(394);
				return_stmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(395);
				select_stmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(396);
				while_stmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(397);
				label();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(398);
				null_stmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(399);
				expr_stmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(400);
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
		enterRule(_localctx, 14, RULE_exception_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(T_EXCEPTION);
			setState(405); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(404);
					exception_block_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(407); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 16, RULE_exception_block_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(T_WHEN);
			setState(410);
			match(L_ID);
			setState(411);
			match(T_THEN);
			setState(412);
			block();
			setState(413);
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
		enterRule(_localctx, 18, RULE_semicolon_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
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
		enterRule(_localctx, 20, RULE_null_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
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
		enterRule(_localctx, 22, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("GO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"GO\")");
			setState(420);
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
		enterRule(_localctx, 24, RULE_assignment_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(422);
				match(T_SET);
				}
				break;
			}
			setState(425);
			assignment_stmt_item();
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(426);
					match(T_COMMA);
					setState(427);
					assignment_stmt_item();
					}
					} 
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 26, RULE_assignment_stmt_item);
		try {
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				assignment_stmt_single_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				assignment_stmt_multiple_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
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
		enterRule(_localctx, 28, RULE_assignment_stmt_single_item);
		int _la;
		try {
			setState(454);
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
			case L_INVALID_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				ident();
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(439);
					match(T_COLON);
					}
				}

				setState(442);
				match(T_EQUAL);
				setState(443);
				expr(0);
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				match(T_OPEN_P);
				setState(446);
				ident();
				setState(447);
				match(T_CLOSE_P);
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(448);
					match(T_COLON);
					}
				}

				setState(451);
				match(T_EQUAL);
				setState(452);
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
		enterRule(_localctx, 30, RULE_assignment_stmt_multiple_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(T_OPEN_P);
			setState(457);
			ident();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(458);
				match(T_COMMA);
				setState(459);
				ident();
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465);
			match(T_CLOSE_P);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(466);
				match(T_COLON);
				}
			}

			setState(469);
			match(T_EQUAL);
			setState(470);
			match(T_OPEN_P);
			setState(471);
			expr(0);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(472);
				match(T_COMMA);
				setState(473);
				expr(0);
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(479);
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
		enterRule(_localctx, 32, RULE_assignment_stmt_select_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
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
			case L_INVALID_NAME:
				{
				setState(481);
				ident();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(482);
				match(T_OPEN_P);
				setState(483);
				ident();
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(484);
					match(T_COMMA);
					setState(485);
					ident();
					}
					}
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(491);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(495);
				match(T_COLON);
				}
			}

			setState(498);
			match(T_EQUAL);
			setState(499);
			match(T_OPEN_P);
			setState(500);
			select_stmt();
			setState(501);
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
		enterRule(_localctx, 34, RULE_associate_locator_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(T_ASSOCIATE);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_RESULT) {
				{
				setState(504);
				match(T_RESULT);
				setState(505);
				match(T_SET);
				}
			}

			setState(508);
			_la = _input.LA(1);
			if ( !(_la==T_LOCATOR || _la==T_LOCATORS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(509);
			match(T_OPEN_P);
			setState(510);
			ident();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(511);
				match(T_COMMA);
				setState(512);
				ident();
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(518);
			match(T_CLOSE_P);
			setState(519);
			match(T_WITH);
			setState(520);
			match(T_PROCEDURE);
			setState(521);
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
		enterRule(_localctx, 36, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
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
		enterRule(_localctx, 38, RULE_call_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(T_CALL);
			setState(526);
			ident();
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(527);
				match(T_OPEN_P);
				setState(529);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(528);
					expr_func_params();
					}
					break;
				}
				setState(531);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(532);
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
		enterRule(_localctx, 40, RULE_close_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(T_CLOSE);
			setState(536);
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
		enterRule(_localctx, 42, RULE_declare_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(T_DECLARE);
			setState(539);
			declare_stmt_item();
			setState(544);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(540);
					match(T_COMMA);
					setState(541);
					declare_stmt_item();
					}
					} 
				}
				setState(546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 44, RULE_declare_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(T_DECLARE);
			setState(548);
			declare_stmt_item();
			setState(549);
			match(T_SEMICOLON);
			setState(555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(550);
					declare_stmt_item();
					setState(551);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 46, RULE_declare_block_inplace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			declare_stmt_item();
			setState(559);
			match(T_SEMICOLON);
			setState(565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(560);
					declare_stmt_item();
					setState(561);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 48, RULE_declare_stmt_item);
		try {
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				declare_condition_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				declare_handler_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				declare_var_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(571);
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
		enterRule(_localctx, 50, RULE_declare_var_item);
		int _la;
		try {
			int _alt;
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				ident();
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(575);
					match(T_COMMA);
					setState(576);
					ident();
					}
					}
					setState(581);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(583);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(582);
					match(T_AS);
					}
					break;
				}
				setState(585);
				dtype();
				setState(587);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(586);
					dtype_len();
					}
					break;
				}
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(589);
						dtype_attr();
						}
						} 
					}
					setState(594);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(596);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(595);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				ident();
				setState(599);
				match(T_CONSTANT);
				setState(601);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(600);
					match(T_AS);
					}
					break;
				}
				setState(603);
				dtype();
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(604);
					dtype_len();
					}
				}

				setState(607);
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
		enterRule(_localctx, 52, RULE_declare_condition_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			ident();
			setState(612);
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
		enterRule(_localctx, 54, RULE_declare_handler_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			_la = _input.LA(1);
			if ( !(_la==T_CONTINUE || _la==T_EXIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(615);
			match(T_HANDLER);
			setState(616);
			match(T_FOR);
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(617);
				match(T_SQLEXCEPTION);
				}
				break;
			case 2:
				{
				setState(618);
				match(T_SQLWARNING);
				}
				break;
			case 3:
				{
				setState(619);
				match(T_NOT);
				setState(620);
				match(T_FOUND);
				}
				break;
			case 4:
				{
				setState(621);
				ident();
				}
				break;
			}
			setState(624);
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
		enterRule(_localctx, 56, RULE_declare_temporary_table_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_GLOBAL) {
				{
				setState(626);
				match(T_GLOBAL);
				}
			}

			setState(629);
			match(T_TEMPORARY);
			setState(630);
			match(T_TABLE);
			setState(631);
			ident();
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(632);
				create_table_preoptions();
				}
			}

			setState(635);
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
		enterRule(_localctx, 58, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(T_CREATE);
			setState(638);
			match(T_TABLE);
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(639);
				match(T_IF);
				setState(640);
				match(T_NOT);
				setState(641);
				match(T_EXISTS);
				}
				break;
			}
			setState(644);
			table_name();
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(645);
				create_table_preoptions();
				}
			}

			setState(648);
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
		enterRule(_localctx, 60, RULE_create_local_temp_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(T_CREATE);
			setState(657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(651);
				match(T_LOCAL);
				setState(652);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(653);
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

				setState(656);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(659);
			match(T_TABLE);
			setState(660);
			ident();
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(661);
				create_table_preoptions();
				}
			}

			setState(664);
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
		enterRule(_localctx, 62, RULE_create_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(666);
					match(T_AS);
					}
				}

				setState(669);
				match(T_OPEN_P);
				setState(670);
				select_stmt();
				setState(671);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(673);
					match(T_AS);
					}
				}

				setState(676);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(677);
				match(T_OPEN_P);
				setState(678);
				create_table_columns();
				setState(679);
				match(T_CLOSE_P);
				}
				break;
			}
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(683);
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
		enterRule(_localctx, 64, RULE_create_table_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			create_table_columns_item();
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(687);
				match(T_COMMA);
				setState(688);
				create_table_columns_item();
				}
				}
				setState(693);
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
		enterRule(_localctx, 66, RULE_create_table_columns_item);
		int _la;
		try {
			int _alt;
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				column_name();
				setState(695);
				dtype();
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(696);
					dtype_len();
					}
				}

				setState(702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(699);
						dtype_attr();
						}
						} 
					}
					setState(704);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T_DEFAULT - 65)) | (1L << (T_ENABLE - 65)) | (1L << (T_IDENTITY - 65)))) != 0) || ((((_la - 167)) & ~0x3f) == 0 && ((1L << (_la - 167)) & ((1L << (T_NOT - 167)) | (1L << (T_NULL - 167)) | (1L << (T_PRIMARY - 167)) | (1L << (T_REFERENCES - 167)))) != 0) || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (T_UNIQUE - 250)) | (1L << (T_WITH - 250)) | (1L << (T_COLON - 250)) | (1L << (T_EQUAL - 250)))) != 0)) {
					{
					{
					setState(705);
					create_table_column_inline_cons();
					}
					}
					setState(710);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(711);
					match(T_CONSTRAINT);
					setState(712);
					ident();
					}
				}

				setState(715);
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
		enterRule(_localctx, 68, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
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
		enterRule(_localctx, 70, RULE_create_table_column_inline_cons);
		int _la;
		try {
			setState(752);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(721);
					match(T_NOT);
					}
				}

				setState(724);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(725);
				match(T_PRIMARY);
				setState(726);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(727);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(728);
				match(T_REFERENCES);
				setState(729);
				table_name();
				setState(730);
				match(T_OPEN_P);
				setState(731);
				ident();
				setState(732);
				match(T_CLOSE_P);
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(733);
					create_table_fk_action();
					}
					}
					setState(738);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(739);
				match(T_IDENTITY);
				setState(740);
				match(T_OPEN_P);
				setState(741);
				match(L_INT);
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(742);
					match(T_COMMA);
					setState(743);
					match(L_INT);
					}
					}
					setState(748);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(749);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(750);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(751);
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
		enterRule(_localctx, 72, RULE_create_table_column_cons);
		int _la;
		try {
			setState(811);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				match(T_PRIMARY);
				setState(755);
				match(T_KEY);
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(756);
					match(T_CLUSTERED);
					}
				}

				setState(759);
				match(T_OPEN_P);
				setState(760);
				ident();
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(761);
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

				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(764);
					match(T_COMMA);
					setState(765);
					ident();
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(766);
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
					setState(773);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(774);
				match(T_CLOSE_P);
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(775);
					match(T_ENABLE);
					}
				}

				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(778);
					index_storage_clause();
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				match(T_FOREIGN);
				setState(782);
				match(T_KEY);
				setState(783);
				match(T_OPEN_P);
				setState(784);
				ident();
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(785);
					match(T_COMMA);
					setState(786);
					ident();
					}
					}
					setState(791);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(792);
				match(T_CLOSE_P);
				setState(793);
				match(T_REFERENCES);
				setState(794);
				table_name();
				setState(795);
				match(T_OPEN_P);
				setState(796);
				ident();
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(797);
					match(T_COMMA);
					setState(798);
					ident();
					}
					}
					setState(803);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(804);
				match(T_CLOSE_P);
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(805);
					create_table_fk_action();
					}
					}
					setState(810);
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
		enterRule(_localctx, 74, RULE_create_table_fk_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(T_ON);
			setState(814);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(815);
				match(T_NO);
				setState(816);
				match(T_ACTION);
				}
				break;
			case 2:
				{
				setState(817);
				match(T_RESTRICT);
				}
				break;
			case 3:
				{
				setState(818);
				match(T_SET);
				setState(819);
				match(T_NULL);
				}
				break;
			case 4:
				{
				setState(820);
				match(T_SET);
				setState(821);
				match(T_DEFAULT);
				}
				break;
			case 5:
				{
				setState(822);
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
		enterRule(_localctx, 76, RULE_create_table_preoptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(825);
				create_table_preoptions_item();
				}
				}
				setState(828); 
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
		enterRule(_localctx, 78, RULE_create_table_preoptions_item);
		try {
			setState(833);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				match(T_COMMA);
				setState(831);
				create_table_preoptions_td_item();
				}
				break;
			case T_ROW:
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(832);
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
		enterRule(_localctx, 80, RULE_create_table_preoptions_td_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NO) {
				{
				setState(835);
				match(T_NO);
				}
			}

			setState(838);
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
		enterRule(_localctx, 82, RULE_create_table_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(841); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(840);
					create_table_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(843); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
		enterRule(_localctx, 84, RULE_create_table_options_item);
		int _la;
		try {
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(845);
				match(T_ON);
				setState(846);
				match(T_COMMIT);
				setState(847);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(848);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				create_table_options_ora_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(850);
				create_table_options_db2_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(851);
				create_table_options_td_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(852);
				create_table_options_hive_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(853);
				create_table_options_mssql_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(854);
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
		enterRule(_localctx, 86, RULE_create_table_options_ora_item);
		int _la;
		try {
			setState(875);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(857);
				match(T_SEGMENT);
				setState(858);
				match(T_CREATION);
				setState(859);
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
				setState(860);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(861);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(862);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(863);
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
				setState(864);
				match(T_STORAGE);
				setState(865);
				match(T_OPEN_P);
				setState(868); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(868);
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
					case L_INVALID_NAME:
						{
						setState(866);
						ident();
						}
						break;
					case L_INT:
						{
						setState(867);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(870); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T_ACTION - 7)) | (1L << (T_AND - 7)) | (1L << (T_AS - 7)) | (1L << (T_ASC - 7)) | (1L << (T_ASSOCIATE - 7)) | (1L << (T_AT - 7)) | (1L << (T_AUTO_INCREMENT - 7)) | (1L << (T_AVG - 7)) | (1L << (T_BEGIN - 7)) | (1L << (T_BETWEEN - 7)) | (1L << (T_BIGINT - 7)) | (1L << (T_BINARY_DOUBLE - 7)) | (1L << (T_BINARY_FLOAT - 7)) | (1L << (T_BIT - 7)) | (1L << (T_BODY - 7)) | (1L << (T_BREAK - 7)) | (1L << (T_BY - 7)) | (1L << (T_BYTE - 7)) | (1L << (T_CALL - 7)) | (1L << (T_CASCADE - 7)) | (1L << (T_CASE - 7)) | (1L << (T_CASESPECIFIC - 7)) | (1L << (T_CAST - 7)) | (1L << (T_CHAR - 7)) | (1L << (T_CHARACTER - 7)) | (1L << (T_CHARSET - 7)) | (1L << (T_CLOSE - 7)) | (1L << (T_CLUSTERED - 7)) | (1L << (T_CMP - 7)) | (1L << (T_COLLECT - 7)) | (1L << (T_COLLECTION - 7)) | (1L << (T_COMMENT - 7)) | (1L << (T_CONSTANT - 7)) | (1L << (T_COMPRESS - 7)) | (1L << (T_CONCAT - 7)) | (1L << (T_CONDITION - 7)) | (1L << (T_CONSTRAINT - 7)) | (1L << (T_CONTINUE - 7)) | (1L << (T_COUNT - 7)) | (1L << (T_COUNT_BIG - 7)) | (1L << (T_CREATE - 7)) | (1L << (T_CREATION - 7)) | (1L << (T_CREATOR - 7)) | (1L << (T_CS - 7)) | (1L << (T_CURRENT - 7)) | (1L << (T_DATABASE - 7)) | (1L << (T_DATA - 7)) | (1L << (T_DATE - 7)) | (1L << (T_DATETIME - 7)) | (1L << (T_DAY - 7)) | (1L << (T_DAYS - 7)) | (1L << (T_DEC - 7)) | (1L << (T_DECIMAL - 7)) | (1L << (T_DECLARE - 7)) | (1L << (T_DEFAULT - 7)) | (1L << (T_DEFERRED - 7)) | (1L << (T_DEFINED - 7)) | (1L << (T_DEFINER - 7)) | (1L << (T_DEFINITION - 7)) | (1L << (T_DELETE - 7)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T_DELIMITED - 71)) | (1L << (T_DESC - 71)) | (1L << (T_DIR - 71)) | (1L << (T_DISTINCT - 71)) | (1L << (T_DISTRIBUTE - 71)) | (1L << (T_DO - 71)) | (1L << (T_DOUBLE - 71)) | (1L << (T_DYNAMIC - 71)) | (1L << (T_ENABLE - 71)) | (1L << (T_END - 71)) | (1L << (T_ENGINE - 71)) | (1L << (T_ESCAPED - 71)) | (1L << (T_EXCEPT - 71)) | (1L << (T_EXEC - 71)) | (1L << (T_EXECUTE - 71)) | (1L << (T_EXCEPTION - 71)) | (1L << (T_EXCLUSIVE - 71)) | (1L << (T_EXISTS - 71)) | (1L << (T_EXIT - 71)) | (1L << (T_FALLBACK - 71)) | (1L << (T_FALSE - 71)) | (1L << (T_FIELDS - 71)) | (1L << (T_FLOAT - 71)) | (1L << (T_FOR - 71)) | (1L << (T_FOREIGN - 71)) | (1L << (T_FORMAT - 71)) | (1L << (T_FOUND - 71)) | (1L << (T_FROM - 71)) | (1L << (T_FULL - 71)) | (1L << (T_FUNCTION - 71)) | (1L << (T_GLOBAL - 71)) | (1L << (T_GO - 71)) | (1L << (T_GROUP - 71)) | (1L << (T_HANDLER - 71)) | (1L << (T_HASH - 71)) | (1L << (T_HAVING - 71)) | (1L << (T_IDENTITY - 71)) | (1L << (T_IF - 71)) | (1L << (T_IMMEDIATE - 71)) | (1L << (T_IN - 71)) | (1L << (T_INDEX - 71)) | (1L << (T_INITRANS - 71)) | (1L << (T_INNER - 71)) | (1L << (T_INOUT - 71)) | (1L << (T_INT - 71)) | (1L << (T_INT2 - 71)) | (1L << (T_INT4 - 71)) | (1L << (T_INT8 - 71)) | (1L << (T_INTEGER - 71)) | (1L << (T_INTERSECT - 71)) | (1L << (T_INTERVAL - 71)) | (1L << (T_INTO - 71)) | (1L << (T_INVOKER - 71)) | (1L << (T_IS - 71)) | (1L << (T_ISOPEN - 71)) | (1L << (T_ITEMS - 71)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (T_JOIN - 135)) | (1L << (T_KEEP - 135)) | (1L << (T_KEY - 135)) | (1L << (T_KEYS - 135)) | (1L << (T_LANGUAGE - 135)) | (1L << (T_LEAVE - 135)) | (1L << (T_LEFT - 135)) | (1L << (T_LIKE - 135)) | (1L << (T_LIMIT - 135)) | (1L << (T_LINES - 135)) | (1L << (T_LOCAL - 135)) | (1L << (T_LOCATION - 135)) | (1L << (T_LOCATOR - 135)) | (1L << (T_LOCATORS - 135)) | (1L << (T_LOCKS - 135)) | (1L << (T_LOG - 135)) | (1L << (T_LOGGED - 135)) | (1L << (T_LOGGING - 135)) | (1L << (T_LOOP - 135)) | (1L << (T_MAP - 135)) | (1L << (T_MAX - 135)) | (1L << (T_MAXTRANS - 135)) | (1L << (T_MICROSECOND - 135)) | (1L << (T_MICROSECONDS - 135)) | (1L << (T_MIN - 135)) | (1L << (T_MULTISET - 135)) | (1L << (T_NCHAR - 135)) | (1L << (T_NVARCHAR - 135)) | (1L << (T_NO - 135)) | (1L << (T_NOCOMPRESS - 135)) | (1L << (T_NOLOGGING - 135)) | (1L << (T_NOT - 135)) | (1L << (T_NOTFOUND - 135)) | (1L << (T_NUMERIC - 135)) | (1L << (T_NUMBER - 135)) | (1L << (T_ON - 135)) | (1L << (T_ONLY - 135)) | (1L << (T_OPEN - 135)) | (1L << (T_OR - 135)) | (1L << (T_ORDER - 135)) | (1L << (T_OUT - 135)) | (1L << (T_OUTER - 135)) | (1L << (T_OVER - 135)) | (1L << (T_OWNER - 135)) | (1L << (T_PACKAGE - 135)) | (1L << (T_PARTITION - 135)) | (1L << (T_PCTFREE - 135)) | (1L << (T_PCTUSED - 135)) | (1L << (T_PRECISION - 135)) | (1L << (T_PRESERVE - 135)) | (1L << (T_PRIMARY - 135)) | (1L << (T_PROC - 135)) | (1L << (T_PROCEDURE - 135)) | (1L << (T_QUALIFY - 135)) | (1L << (T_QUIT - 135)) | (1L << (T_REAL - 135)) | (1L << (T_REFERENCES - 135)) | (1L << (T_REGEXP - 135)) | (1L << (T_REPLACE - 135)) | (1L << (T_RESTRICT - 135)) | (1L << (T_RESULT - 135)))) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (T_RESULT_SET_LOCATOR - 199)) | (1L << (T_RETURN - 199)) | (1L << (T_RETURNS - 199)) | (1L << (T_REVERSE - 199)) | (1L << (T_RIGHT - 199)) | (1L << (T_RLIKE - 199)) | (1L << (T_ROW - 199)) | (1L << (T_ROWS - 199)) | (1L << (T_ROW_COUNT - 199)) | (1L << (T_RR - 199)) | (1L << (T_RS - 199)) | (1L << (T_TRIM - 199)) | (1L << (T_SCHEMA - 199)) | (1L << (T_SECOND - 199)) | (1L << (T_SECONDS - 199)) | (1L << (T_SECURITY - 199)) | (1L << (T_SEGMENT - 199)) | (1L << (T_SEL - 199)) | (1L << (T_SELECT - 199)) | (1L << (T_SET - 199)) | (1L << (T_SETS - 199)) | (1L << (T_SHARE - 199)) | (1L << (T_SIMPLE_DOUBLE - 199)) | (1L << (T_SIMPLE_FLOAT - 199)) | (1L << (T_SMALLDATETIME - 199)) | (1L << (T_SMALLINT - 199)) | (1L << (T_SQL - 199)) | (1L << (T_SQLEXCEPTION - 199)) | (1L << (T_SQLWARNING - 199)) | (1L << (T_STEP - 199)) | (1L << (T_STORAGE - 199)) | (1L << (T_STORED - 199)) | (1L << (T_STRING - 199)) | (1L << (T_SUBSTRING - 199)) | (1L << (T_SUM - 199)) | (1L << (T_SYS_REFCURSOR - 199)) | (1L << (T_TABLE - 199)) | (1L << (T_TABLESPACE - 199)) | (1L << (T_TEMPORARY - 199)) | (1L << (T_TERMINATED - 199)) | (1L << (T_TEXTIMAGE_ON - 199)) | (1L << (T_THEN - 199)) | (1L << (T_TIMESTAMP - 199)) | (1L << (T_TITLE - 199)) | (1L << (T_TO - 199)) | (1L << (T_TOP - 199)) | (1L << (T_TRUE - 199)) | (1L << (T_UNIQUE - 199)) | (1L << (T_UPDATE - 199)) | (1L << (T_UR - 199)) | (1L << (T_USE - 199)) | (1L << (T_USING - 199)) | (1L << (T_VALUE - 199)) | (1L << (T_VALUES - 199)) | (1L << (T_VAR - 199)) | (1L << (T_VARCHAR - 199)) | (1L << (T_VARCHAR2 - 199)) | (1L << (T_VARYING - 199)) | (1L << (T_VOLATILE - 199)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (T_WHILE - 264)) | (1L << (T_WITH - 264)) | (1L << (T_XML - 264)) | (1L << (T_YES - 264)) | (1L << (T_ACTIVITY_COUNT - 264)) | (1L << (T_CUME_DIST - 264)) | (1L << (T_CURRENT_DATE - 264)) | (1L << (T_CURRENT_TIMESTAMP - 264)) | (1L << (T_CURRENT_USER - 264)) | (1L << (T_DENSE_RANK - 264)) | (1L << (T_FIRST_VALUE - 264)) | (1L << (T_LAG - 264)) | (1L << (T_LAST_VALUE - 264)) | (1L << (T_LEAD - 264)) | (1L << (T_PART_COUNT - 264)) | (1L << (T_PART_LOC - 264)) | (1L << (T_RANK - 264)) | (1L << (T_ROW_NUMBER - 264)) | (1L << (T_STDEV - 264)) | (1L << (T_SYSDATE - 264)) | (1L << (T_VARIANCE - 264)) | (1L << (T_USER - 264)) | (1L << (L_ID - 264)) | (1L << (L_INVALID_NAME - 264)) | (1L << (L_INT - 264)))) != 0) );
				setState(872);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(873);
				match(T_TABLESPACE);
				setState(874);
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
		enterRule(_localctx, 88, RULE_create_table_options_db2_item);
		int _la;
		try {
			setState(910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(877);
					match(T_INDEX);
					}
				}

				setState(880);
				match(T_IN);
				setState(881);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(882);
				match(T_WITH);
				setState(883);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(884);
				match(T_DISTRIBUTE);
				setState(885);
				match(T_BY);
				setState(886);
				match(T_HASH);
				setState(887);
				match(T_OPEN_P);
				setState(888);
				ident();
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(889);
					match(T_COMMA);
					setState(890);
					ident();
					}
					}
					setState(895);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(896);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(898);
					match(T_NOT);
					}
				}

				setState(901);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(902);
				match(T_COMPRESS);
				setState(903);
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
				setState(904);
				match(T_DEFINITION);
				setState(905);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(906);
				match(T_WITH);
				setState(907);
				match(T_RESTRICT);
				setState(908);
				match(T_ON);
				setState(909);
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
		enterRule(_localctx, 90, RULE_create_table_options_td_item);
		int _la;
		try {
			setState(930);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(912);
					match(T_UNIQUE);
					}
				}

				setState(915);
				match(T_PRIMARY);
				setState(916);
				match(T_INDEX);
				setState(917);
				match(T_OPEN_P);
				setState(918);
				ident();
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(919);
					match(T_COMMA);
					setState(920);
					ident();
					}
					}
					setState(925);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(926);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(928);
				match(T_WITH);
				setState(929);
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
		enterRule(_localctx, 92, RULE_create_table_options_hive_item);
		try {
			setState(936);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				create_table_hive_row_format();
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(933);
				match(T_STORED);
				setState(934);
				match(T_AS);
				setState(935);
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
		enterRule(_localctx, 94, RULE_create_table_hive_row_format);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			match(T_ROW);
			setState(939);
			match(T_FORMAT);
			setState(940);
			match(T_DELIMITED);
			setState(944);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(941);
					create_table_hive_row_format_fields();
					}
					} 
				}
				setState(946);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
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
		enterRule(_localctx, 96, RULE_create_table_hive_row_format_fields);
		try {
			setState(974);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(947);
				match(T_FIELDS);
				setState(948);
				match(T_TERMINATED);
				setState(949);
				match(T_BY);
				setState(950);
				expr(0);
				setState(954);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(951);
					match(T_ESCAPED);
					setState(952);
					match(T_BY);
					setState(953);
					expr(0);
					}
					break;
				}
				}
				break;
			case T_COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				match(T_COLLECTION);
				setState(957);
				match(T_ITEMS);
				setState(958);
				match(T_TERMINATED);
				setState(959);
				match(T_BY);
				setState(960);
				expr(0);
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(961);
				match(T_MAP);
				setState(962);
				match(T_KEYS);
				setState(963);
				match(T_TERMINATED);
				setState(964);
				match(T_BY);
				setState(965);
				expr(0);
				}
				break;
			case T_LINES:
				enterOuterAlt(_localctx, 4);
				{
				setState(966);
				match(T_LINES);
				setState(967);
				match(T_TERMINATED);
				setState(968);
				match(T_BY);
				setState(969);
				expr(0);
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(970);
				match(T_NULL);
				setState(971);
				match(T_DEFINED);
				setState(972);
				match(T_AS);
				setState(973);
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
		enterRule(_localctx, 98, RULE_create_table_options_mssql_item);
		try {
			setState(980);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(976);
				match(T_ON);
				setState(977);
				ident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(978);
				match(T_TEXTIMAGE_ON);
				setState(979);
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
		enterRule(_localctx, 100, RULE_create_table_options_mysql_item);
		int _la;
		try {
			setState(1009);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				match(T_AUTO_INCREMENT);
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(983);
					match(T_EQUAL);
					}
				}

				setState(986);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(987);
				match(T_COMMENT);
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(988);
					match(T_EQUAL);
					}
				}

				setState(991);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(992);
					match(T_DEFAULT);
					}
				}

				setState(998);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(995);
					match(T_CHARACTER);
					setState(996);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(997);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1000);
					match(T_EQUAL);
					}
				}

				setState(1003);
				expr(0);
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1004);
				match(T_ENGINE);
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1005);
					match(T_EQUAL);
					}
				}

				setState(1008);
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
		enterRule(_localctx, 102, RULE_dtype);
		try {
			setState(1056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011);
				match(T_CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1012);
				match(T_BIGINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1013);
				match(T_BINARY_DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1014);
				match(T_BINARY_FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1015);
				match(T_BINARY_INTEGER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1016);
				match(T_BIT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1017);
				match(T_DATE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1018);
				match(T_DATETIME);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1019);
				match(T_DEC);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1020);
				match(T_DECIMAL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1021);
				match(T_DOUBLE);
				setState(1023);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(1022);
					match(T_PRECISION);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1025);
				match(T_FLOAT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1026);
				match(T_INT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1027);
				match(T_INT2);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1028);
				match(T_INT4);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1029);
				match(T_INT8);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1030);
				match(T_INTEGER);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1031);
				match(T_NCHAR);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1032);
				match(T_NVARCHAR);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1033);
				match(T_NUMBER);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1034);
				match(T_NUMERIC);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1035);
				match(T_PLS_INTEGER);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1036);
				match(T_REAL);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1037);
				match(T_RESULT_SET_LOCATOR);
				setState(1038);
				match(T_VARYING);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1039);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1040);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1041);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1042);
				match(T_SMALLINT);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1043);
				match(T_SMALLDATETIME);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1044);
				match(T_STRING);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1045);
				match(T_SYS_REFCURSOR);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1046);
				match(T_TIMESTAMP);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1047);
				match(T_TINYINT);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1048);
				match(T_VARCHAR);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1049);
				match(T_VARCHAR2);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1050);
				match(T_XML);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1051);
				ident();
				setState(1054);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(1052);
					match(T__2);
					{
					setState(1053);
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
		enterRule(_localctx, 104, RULE_dtype_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(T_OPEN_P);
			setState(1059);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(1060);
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

			setState(1065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(1063);
				match(T_COMMA);
				setState(1064);
				match(L_INT);
				}
			}

			setState(1067);
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
		enterRule(_localctx, 106, RULE_dtype_attr);
		int _la;
		try {
			setState(1080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1069);
					match(T_NOT);
					}
				}

				setState(1072);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1073);
				match(T_CHARACTER);
				setState(1074);
				match(T_SET);
				setState(1075);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1076);
					match(T_NOT);
					}
				}

				setState(1079);
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
		enterRule(_localctx, 108, RULE_dtype_default);
		int _la;
		try {
			setState(1094);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(1082);
					match(T_COLON);
					}
				}

				setState(1085);
				match(T_EQUAL);
				setState(1086);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1087);
					match(T_WITH);
					}
				}

				setState(1090);
				match(T_DEFAULT);
				setState(1092);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1091);
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
		enterRule(_localctx, 110, RULE_create_database_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			match(T_CREATE);
			setState(1097);
			_la = _input.LA(1);
			if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1098);
				match(T_IF);
				setState(1099);
				match(T_NOT);
				setState(1100);
				match(T_EXISTS);
				}
				break;
			}
			setState(1103);
			expr(0);
			setState(1107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1104);
					create_database_option();
					}
					} 
				}
				setState(1109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
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
		enterRule(_localctx, 112, RULE_create_database_option);
		try {
			setState(1114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1110);
				match(T_COMMENT);
				setState(1111);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1112);
				match(T_LOCATION);
				setState(1113);
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
		enterRule(_localctx, 114, RULE_create_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1116);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1117);
				match(T_CREATE);
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1118);
					match(T_OR);
					setState(1119);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1122);
				match(T_REPLACE);
				}
				break;
			case T_FUNCTION:
				break;
			default:
				break;
			}
			setState(1125);
			match(T_FUNCTION);
			setState(1126);
			ident();
			setState(1128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1127);
				create_routine_params();
				}
				break;
			}
			setState(1130);
			create_function_return();
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1131);
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
			setState(1135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1134);
				declare_block_inplace();
				}
				break;
			}
			setState(1137);
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
		enterRule(_localctx, 116, RULE_create_function_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			_la = _input.LA(1);
			if ( !(_la==T_RETURN || _la==T_RETURNS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1140);
			dtype();
			setState(1142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1141);
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
		enterRule(_localctx, 118, RULE_create_package_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1144);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1145);
				match(T_CREATE);
				setState(1148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1146);
					match(T_OR);
					setState(1147);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1150);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1153);
			match(T_PACKAGE);
			setState(1154);
			ident();
			setState(1155);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1156);
			package_spec();
			setState(1157);
			match(T_END);
			setState(1161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1158);
				ident();
				setState(1159);
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
		enterRule(_localctx, 120, RULE_package_spec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			package_spec_item();
			setState(1164);
			match(T_SEMICOLON);
			setState(1170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1165);
					package_spec_item();
					setState(1166);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(1172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
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
		enterRule(_localctx, 122, RULE_package_spec_item);
		int _la;
		try {
			setState(1186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1173);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1174);
				match(T_FUNCTION);
				setState(1175);
				ident();
				setState(1177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1176);
					create_routine_params();
					}
					break;
				}
				setState(1179);
				create_function_return();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1181);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1182);
				ident();
				setState(1184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1183);
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
		enterRule(_localctx, 124, RULE_create_package_body_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1188);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1189);
				match(T_CREATE);
				setState(1192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1190);
					match(T_OR);
					setState(1191);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1194);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1197);
			match(T_PACKAGE);
			setState(1198);
			match(T_BODY);
			setState(1199);
			ident();
			setState(1200);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1201);
			package_body();
			setState(1202);
			match(T_END);
			setState(1206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1203);
				ident();
				setState(1204);
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
		enterRule(_localctx, 126, RULE_package_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			package_body_item();
			setState(1209);
			match(T_SEMICOLON);
			setState(1215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1210);
					package_body_item();
					setState(1211);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(1217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
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
		enterRule(_localctx, 128, RULE_package_body_item);
		try {
			setState(1221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1218);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1219);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1220);
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
		enterRule(_localctx, 130, RULE_create_procedure_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1223);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1224);
				match(T_CREATE);
				setState(1227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1225);
					match(T_OR);
					setState(1226);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1229);
				match(T_REPLACE);
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				break;
			default:
				break;
			}
			setState(1232);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1233);
			ident();
			setState(1235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1234);
				create_routine_params();
				}
				break;
			}
			setState(1238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1237);
				create_routine_options();
				}
				break;
			}
			setState(1241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1240);
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
			setState(1244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1243);
				declare_block_inplace();
				}
				break;
			}
			setState(1247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1246);
				label();
				}
				break;
			}
			setState(1249);
			proc_block();
			setState(1253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1250);
				ident();
				setState(1251);
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
		enterRule(_localctx, 132, RULE_create_routine_params);
		int _la;
		try {
			int _alt;
			setState(1277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1255);
				match(T_OPEN_P);
				setState(1256);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1257);
				match(T_OPEN_P);
				setState(1258);
				create_routine_param_item();
				setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1259);
					match(T_COMMA);
					setState(1260);
					create_routine_param_item();
					}
					}
					setState(1265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1266);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1268);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") &&
				        _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\r\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") &&\r\n        _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\r\n        ");
				setState(1269);
				create_routine_param_item();
				setState(1274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1270);
						match(T_COMMA);
						setState(1271);
						create_routine_param_item();
						}
						} 
					}
					setState(1276);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
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
		enterRule(_localctx, 134, RULE_create_routine_param_item);
		try {
			int _alt;
			setState(1321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1279);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1280);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1281);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1282);
					match(T_IN);
					setState(1283);
					match(T_OUT);
					}
					break;
				}
				setState(1286);
				ident();
				setState(1287);
				dtype();
				setState(1289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1288);
					dtype_len();
					}
					break;
				}
				setState(1294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1291);
						dtype_attr();
						}
						} 
					}
					setState(1296);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
				}
				setState(1298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1297);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1300);
				ident();
				setState(1306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1301);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1302);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1303);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1304);
					match(T_IN);
					setState(1305);
					match(T_OUT);
					}
					break;
				}
				setState(1308);
				dtype();
				setState(1310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1309);
					dtype_len();
					}
					break;
				}
				setState(1315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1312);
						dtype_attr();
						}
						} 
					}
					setState(1317);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
				}
				setState(1319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1318);
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
		enterRule(_localctx, 136, RULE_create_routine_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1324); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1323);
					create_routine_option();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1326); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
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
		enterRule(_localctx, 138, RULE_create_routine_option);
		int _la;
		try {
			setState(1339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LANGUAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1328);
				match(T_LANGUAGE);
				setState(1329);
				match(T_SQL);
				}
				break;
			case T_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1330);
				match(T_SQL);
				setState(1331);
				match(T_SECURITY);
				setState(1332);
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
				setState(1334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DYNAMIC) {
					{
					setState(1333);
					match(T_DYNAMIC);
					}
				}

				setState(1336);
				match(T_RESULT);
				setState(1337);
				match(T_SETS);
				setState(1338);
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
		enterRule(_localctx, 140, RULE_exec_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1341);
			_la = _input.LA(1);
			if ( !(_la==T_EXEC || _la==T_EXECUTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1342);
				match(T_IMMEDIATE);
				}
				break;
			}
			setState(1345);
			expr(0);
			setState(1351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1346);
				match(T_OPEN_P);
				setState(1347);
				expr_func_params();
				setState(1348);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1350);
				expr_func_params();
				}
				break;
			}
			setState(1362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1353);
				match(T_INTO);
				setState(1354);
				match(L_ID);
				setState(1359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1355);
						match(T_COMMA);
						setState(1356);
						match(L_ID);
						}
						} 
					}
					setState(1361);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				}
				}
				break;
			}
			setState(1365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1364);
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
		enterRule(_localctx, 142, RULE_if_stmt);
		try {
			setState(1370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1367);
				if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1368);
				if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1369);
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
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Non_balanced_bool_exprContext non_balanced_bool_expr() {
			return getRuleContext(Non_balanced_bool_exprContext.class,0);
		}
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
		enterRule(_localctx, 144, RULE_if_plsql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			match(T_IF);
			setState(1375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1373);
				bool_expr(0);
				}
				break;
			case 2:
				{
				setState(1374);
				non_balanced_bool_expr();
				}
				break;
			}
			setState(1377);
			match(T_THEN);
			setState(1378);
			block();
			setState(1382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1379);
				elseif_block();
				}
				}
				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1385);
				else_block();
				}
			}

			setState(1388);
			match(T_END);
			setState(1389);
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
		public List<Single_block_stmtContext> single_block_stmt() {
			return getRuleContexts(Single_block_stmtContext.class);
		}
		public Single_block_stmtContext single_block_stmt(int i) {
			return getRuleContext(Single_block_stmtContext.class,i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Non_balanced_bool_exprContext non_balanced_bool_expr() {
			return getRuleContext(Non_balanced_bool_exprContext.class,0);
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
		enterRule(_localctx, 146, RULE_if_tsql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			match(T_IF);
			setState(1394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1392);
				bool_expr(0);
				}
				break;
			case 2:
				{
				setState(1393);
				non_balanced_bool_expr();
				}
				break;
			}
			setState(1396);
			single_block_stmt();
			setState(1399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1397);
				match(T_ELSE);
				setState(1398);
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
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Non_balanced_bool_exprContext non_balanced_bool_expr() {
			return getRuleContext(Non_balanced_bool_exprContext.class,0);
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
		enterRule(_localctx, 148, RULE_if_bteq_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			match(T__3);
			setState(1402);
			match(T_IF);
			setState(1405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1403);
				bool_expr(0);
				}
				break;
			case 2:
				{
				setState(1404);
				non_balanced_bool_expr();
				}
				break;
			}
			setState(1407);
			match(T_THEN);
			setState(1408);
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
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_ELSIF() { return getToken(HplsqlParser.T_ELSIF, 0); }
		public TerminalNode T_ELSEIF() { return getToken(HplsqlParser.T_ELSEIF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Non_balanced_bool_exprContext non_balanced_bool_expr() {
			return getRuleContext(Non_balanced_bool_exprContext.class,0);
		}
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
		enterRule(_localctx, 150, RULE_elseif_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1411);
				bool_expr(0);
				}
				break;
			case 2:
				{
				setState(1412);
				non_balanced_bool_expr();
				}
				break;
			}
			setState(1415);
			match(T_THEN);
			setState(1416);
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
		enterRule(_localctx, 152, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
			match(T_ELSE);
			setState(1419);
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
		public Non_balanced_bool_exprContext non_balanced_bool_expr() {
			return getRuleContext(Non_balanced_bool_exprContext.class,0);
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
		enterRule(_localctx, 154, RULE_exit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			match(T_EXIT);
			setState(1423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1422);
				match(L_ID);
				}
				break;
			}
			setState(1430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1425);
				match(T_WHEN);
				setState(1428);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1426);
					bool_expr(0);
					}
					break;
				case 2:
					{
					setState(1427);
					non_balanced_bool_expr();
					}
					break;
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
		enterRule(_localctx, 156, RULE_leave_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
			match(T_LEAVE);
			setState(1434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1433);
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
		enterRule(_localctx, 158, RULE_cmp_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
			match(T_CMP);
			setState(1437);
			_la = _input.LA(1);
			if ( !(_la==T_ROW_COUNT || _la==T_SUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1438);
			cmp_source();
			setState(1439);
			match(T_COMMA);
			setState(1440);
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
		enterRule(_localctx, 160, RULE_cmp_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
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
			case L_INVALID_NAME:
				{
				setState(1442);
				table_name();
				setState(1444);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1443);
					where_clause();
					}
					break;
				}
				}
				break;
			case T_OPEN_P:
				{
				setState(1446);
				match(T_OPEN_P);
				setState(1447);
				select_stmt();
				setState(1448);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1452);
				match(T_AT);
				setState(1453);
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
		enterRule(_localctx, 162, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			match(T_CREATE);
			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(1457);
				match(T_UNIQUE);
				}
			}

			setState(1460);
			match(T_INDEX);
			setState(1461);
			ident();
			setState(1462);
			match(T_ON);
			setState(1463);
			table_name();
			setState(1464);
			match(T_OPEN_P);
			setState(1465);
			create_index_col();
			setState(1470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1466);
				match(T_COMMA);
				setState(1467);
				create_index_col();
				}
				}
				setState(1472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1473);
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
		enterRule(_localctx, 164, RULE_create_index_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475);
			ident();
			setState(1477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(1476);
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
		enterRule(_localctx, 166, RULE_index_storage_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
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
		enterRule(_localctx, 168, RULE_index_mssql_storage_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481);
			match(T_WITH);
			setState(1482);
			match(T_OPEN_P);
			setState(1483);
			ident();
			setState(1484);
			match(T_EQUAL);
			setState(1485);
			ident();
			setState(1493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1486);
				match(T_COMMA);
				setState(1487);
				ident();
				setState(1488);
				match(T_EQUAL);
				setState(1489);
				ident();
				}
				}
				setState(1495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1496);
			match(T_CLOSE_P);
			setState(1500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ON || _la==T_TEXTIMAGE_ON) {
				{
				{
				setState(1497);
				create_table_options_mssql_item();
				}
				}
				setState(1502);
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
		enterRule(_localctx, 170, RULE_quit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(1503);
				match(T__3);
				}
			}

			setState(1506);
			match(T_QUIT);
			setState(1508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1507);
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
		enterRule(_localctx, 172, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510);
			match(T_RETURN);
			setState(1512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1511);
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

	public static class While_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_WHILE() { return getTokens(HplsqlParser.T_WHILE); }
		public TerminalNode T_WHILE(int i) {
			return getToken(HplsqlParser.T_WHILE, i);
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
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Non_balanced_bool_exprContext non_balanced_bool_expr() {
			return getRuleContext(Non_balanced_bool_exprContext.class,0);
		}
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
		enterRule(_localctx, 174, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			match(T_WHILE);
			setState(1517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1515);
				bool_expr(0);
				}
				break;
			case 2:
				{
				setState(1516);
				non_balanced_bool_expr();
				}
				break;
			}
			setState(1519);
			_la = _input.LA(1);
			if ( !(_la==T_BEGIN || _la==T_DO || _la==T_LOOP || _la==T_THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1520);
			block();
			setState(1521);
			match(T_END);
			setState(1523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1522);
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
		enterRule(_localctx, 176, RULE_for_range_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			match(T_FOR);
			setState(1526);
			match(L_ID);
			setState(1527);
			match(T_IN);
			setState(1529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1528);
				match(T_REVERSE);
				}
				break;
			}
			setState(1531);
			expr(0);
			setState(1532);
			match(T_DOT2);
			setState(1533);
			expr(0);
			setState(1536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BY || _la==T_STEP) {
				{
				setState(1534);
				_la = _input.LA(1);
				if ( !(_la==T_BY || _la==T_STEP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1535);
				expr(0);
				}
			}

			setState(1538);
			match(T_LOOP);
			setState(1539);
			block();
			setState(1540);
			match(T_END);
			setState(1541);
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
		enterRule(_localctx, 178, RULE_label);
		try {
			setState(1549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1543);
				match(L_LABEL);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1544);
				match(T_LESS);
				setState(1545);
				match(T_LESS);
				setState(1546);
				match(L_ID);
				setState(1547);
				match(T_GREATER);
				setState(1548);
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
		enterRule(_localctx, 180, RULE_using_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			match(T_USING);
			setState(1552);
			expr(0);
			setState(1557);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1553);
					match(T_COMMA);
					setState(1554);
					expr(0);
					}
					} 
				}
				setState(1559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
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
		public Cte_select_stmtContext cte_select_stmt() {
			return getRuleContext(Cte_select_stmtContext.class,0);
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
		enterRule(_localctx, 182, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(1560);
				cte_select_stmt();
				}
			}

			setState(1563);
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

	public static class Cte_select_stmtContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public List<Cte_select_stmt_itemContext> cte_select_stmt_item() {
			return getRuleContexts(Cte_select_stmt_itemContext.class);
		}
		public Cte_select_stmt_itemContext cte_select_stmt_item(int i) {
			return getRuleContext(Cte_select_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Cte_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCte_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCte_select_stmt(this);
		}
	}

	public final Cte_select_stmtContext cte_select_stmt() throws RecognitionException {
		Cte_select_stmtContext _localctx = new Cte_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_cte_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			match(T_WITH);
			setState(1566);
			cte_select_stmt_item();
			setState(1571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1567);
				match(T_COMMA);
				setState(1568);
				cte_select_stmt_item();
				}
				}
				setState(1573);
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

	public static class Cte_select_stmt_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Cte_select_colsContext cte_select_cols() {
			return getRuleContext(Cte_select_colsContext.class,0);
		}
		public Cte_select_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCte_select_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCte_select_stmt_item(this);
		}
	}

	public final Cte_select_stmt_itemContext cte_select_stmt_item() throws RecognitionException {
		Cte_select_stmt_itemContext _localctx = new Cte_select_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_cte_select_stmt_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			ident();
			setState(1576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(1575);
				cte_select_cols();
				}
			}

			setState(1578);
			match(T_AS);
			setState(1579);
			match(T_OPEN_P);
			setState(1580);
			fullselect_stmt();
			setState(1581);
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

	public static class Cte_select_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Cte_select_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCte_select_cols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCte_select_cols(this);
		}
	}

	public final Cte_select_colsContext cte_select_cols() throws RecognitionException {
		Cte_select_colsContext _localctx = new Cte_select_colsContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_cte_select_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
			match(T_OPEN_P);
			setState(1584);
			ident();
			setState(1589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1585);
				match(T_COMMA);
				setState(1586);
				ident();
				}
				}
				setState(1591);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1592);
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
		enterRule(_localctx, 190, RULE_fullselect_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			fullselect_stmt_item();
			setState(1600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1595);
					fullselect_set_clause();
					setState(1596);
					fullselect_stmt_item();
					}
					} 
				}
				setState(1602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
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
		enterRule(_localctx, 192, RULE_fullselect_stmt_item);
		try {
			setState(1608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1603);
				subselect_stmt();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1604);
				match(T_OPEN_P);
				setState(1605);
				fullselect_stmt();
				setState(1606);
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
		enterRule(_localctx, 194, RULE_fullselect_set_clause);
		int _la;
		try {
			setState(1622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1610);
				match(T_UNION);
				setState(1612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1611);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1614);
				match(T_EXCEPT);
				setState(1616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1615);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1618);
				match(T_INTERSECT);
				setState(1620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1619);
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
		enterRule(_localctx, 196, RULE_subselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1625);
			select_list();
			setState(1627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1626);
				into_clause();
				}
				break;
			}
			setState(1630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1629);
				from_clause();
				}
				break;
			}
			setState(1633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1632);
				where_clause();
				}
				break;
			}
			setState(1636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1635);
				group_by_clause();
				}
				break;
			}
			setState(1640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1638);
				having_clause();
				}
				break;
			case 2:
				{
				setState(1639);
				qualify_clause();
				}
				break;
			}
			setState(1643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1642);
				order_by_clause();
				}
				break;
			}
			setState(1646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1645);
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
		enterRule(_localctx, 198, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1648);
				select_list_set();
				}
				break;
			}
			setState(1652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1651);
				select_list_limit();
				}
				break;
			}
			setState(1654);
			select_list_item();
			setState(1659);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1655);
					match(T_COMMA);
					setState(1656);
					select_list_item();
					}
					} 
				}
				setState(1661);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
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
		enterRule(_localctx, 200, RULE_select_list_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
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
		enterRule(_localctx, 202, RULE_select_list_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664);
			match(T_TOP);
			setState(1665);
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
		enterRule(_localctx, 204, RULE_select_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1670);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1667);
					ident();
					setState(1668);
					match(T_EQUAL);
					}
					break;
				}
				setState(1672);
				expr(0);
				setState(1674);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1673);
					select_list_alias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1676);
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
		enterRule(_localctx, 206, RULE_select_list_alias);
		try {
			setState(1688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1679);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") &&
				         !_input.LT(1).getText().equalsIgnoreCase("FROM"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
				setState(1681);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1680);
					match(T_AS);
					}
					break;
				}
				setState(1683);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1684);
				match(T_OPEN_P);
				setState(1685);
				match(T_TITLE);
				setState(1686);
				match(L_S_STRING);
				setState(1687);
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
		enterRule(_localctx, 208, RULE_select_list_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_ID) {
				{
				setState(1690);
				match(L_ID);
				setState(1691);
				match(T__3);
				}
			}

			setState(1694);
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
		enterRule(_localctx, 210, RULE_into_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			match(T_INTO);
			setState(1697);
			ident();
			setState(1702);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1698);
					match(T_COMMA);
					setState(1699);
					ident();
					}
					} 
				}
				setState(1704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
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
		enterRule(_localctx, 212, RULE_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1705);
			match(T_FROM);
			setState(1706);
			from_table_clause();
			setState(1710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1707);
					from_join_clause();
					}
					} 
				}
				setState(1712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
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
		enterRule(_localctx, 214, RULE_from_table_clause);
		try {
			setState(1716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1713);
				from_table_name_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1714);
				from_subselect_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1715);
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
		enterRule(_localctx, 216, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
			table_name();
			setState(1720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1719);
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
		enterRule(_localctx, 218, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			match(T_OPEN_P);
			setState(1723);
			select_stmt();
			setState(1724);
			match(T_CLOSE_P);
			setState(1726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1725);
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
		public Non_balanced_bool_exprContext non_balanced_bool_expr() {
			return getRuleContext(Non_balanced_bool_exprContext.class,0);
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
		enterRule(_localctx, 220, RULE_from_join_clause);
		try {
			setState(1737);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1728);
				match(T_COMMA);
				setState(1729);
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
				setState(1730);
				from_join_type_clause();
				setState(1731);
				from_table_clause();
				setState(1732);
				match(T_ON);
				setState(1735);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1733);
					bool_expr(0);
					}
					break;
				case 2:
					{
					setState(1734);
					non_balanced_bool_expr();
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
		enterRule(_localctx, 222, RULE_from_join_type_clause);
		int _la;
		try {
			setState(1748);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(1739);
					match(T_INNER);
					}
				}

				setState(1742);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1743);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(1744);
					match(T_OUTER);
					}
				}

				setState(1747);
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
		enterRule(_localctx, 224, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1750);
			match(T_TABLE);
			setState(1751);
			match(T_OPEN_P);
			setState(1752);
			match(T_VALUES);
			setState(1753);
			from_table_values_row();
			setState(1758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1754);
				match(T_COMMA);
				setState(1755);
				from_table_values_row();
				}
				}
				setState(1760);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1761);
			match(T_CLOSE_P);
			setState(1763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1762);
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
		enterRule(_localctx, 226, RULE_from_table_values_row);
		int _la;
		try {
			setState(1777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1765);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1766);
				match(T_OPEN_P);
				setState(1767);
				expr(0);
				setState(1772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1768);
					match(T_COMMA);
					setState(1769);
					expr(0);
					}
					}
					setState(1774);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1775);
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
		enterRule(_localctx, 228, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			         !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			         !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			         !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			         !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			         !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			         !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			         !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(1781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(1780);
				match(T_AS);
				}
				break;
			}
			setState(1783);
			ident();
			setState(1794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(1784);
				match(T_OPEN_P);
				setState(1785);
				match(L_ID);
				setState(1790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1786);
					match(T_COMMA);
					setState(1787);
					match(L_ID);
					}
					}
					setState(1792);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1793);
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
		enterRule(_localctx, 230, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
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
		public Non_balanced_bool_exprContext non_balanced_bool_expr() {
			return getRuleContext(Non_balanced_bool_exprContext.class,0);
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
		enterRule(_localctx, 232, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1798);
			match(T_WHERE);
			setState(1801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(1799);
				bool_expr(0);
				}
				break;
			case 2:
				{
				setState(1800);
				non_balanced_bool_expr();
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
		enterRule(_localctx, 234, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1803);
			match(T_GROUP);
			setState(1804);
			match(T_BY);
			setState(1805);
			expr(0);
			setState(1810);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1806);
					match(T_COMMA);
					setState(1807);
					expr(0);
					}
					} 
				}
				setState(1812);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
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
		public Non_balanced_bool_exprContext non_balanced_bool_expr() {
			return getRuleContext(Non_balanced_bool_exprContext.class,0);
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
		enterRule(_localctx, 236, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
			match(T_HAVING);
			setState(1816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(1814);
				bool_expr(0);
				}
				break;
			case 2:
				{
				setState(1815);
				non_balanced_bool_expr();
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

	public static class Qualify_clauseContext extends ParserRuleContext {
		public TerminalNode T_QUALIFY() { return getToken(HplsqlParser.T_QUALIFY, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Non_balanced_bool_exprContext non_balanced_bool_expr() {
			return getRuleContext(Non_balanced_bool_exprContext.class,0);
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
		enterRule(_localctx, 238, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
			match(T_QUALIFY);
			setState(1821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1819);
				bool_expr(0);
				}
				break;
			case 2:
				{
				setState(1820);
				non_balanced_bool_expr();
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
		enterRule(_localctx, 240, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1823);
			match(T_ORDER);
			setState(1824);
			match(T_BY);
			setState(1825);
			expr(0);
			setState(1827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1826);
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
			setState(1836);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1829);
					match(T_COMMA);
					setState(1830);
					expr(0);
					setState(1832);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
					case 1:
						{
						setState(1831);
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
				setState(1838);
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
		enterRule(_localctx, 242, RULE_select_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1840); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1839);
					select_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1842); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
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
		enterRule(_localctx, 244, RULE_select_options_item);
		int _la;
		try {
			setState(1855);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1844);
				match(T_LIMIT);
				setState(1845);
				expr(0);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1846);
				match(T_WITH);
				setState(1847);
				_la = _input.LA(1);
				if ( !(_la==T_CS || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (T_RR - 208)) | (1L << (T_RS - 208)) | (1L << (T_UR - 208)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1853);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1848);
					match(T_USE);
					setState(1849);
					match(T_AND);
					setState(1850);
					match(T_KEEP);
					setState(1851);
					_la = _input.LA(1);
					if ( !(_la==T_EXCLUSIVE || _la==T_SHARE || _la==T_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1852);
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
		int _startState = 246;
		enterRecursionRule(_localctx, 246, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(1859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1858);
					match(T_NOT);
					}
				}

				setState(1861);
				match(T_OPEN_P);
				setState(1862);
				bool_expr(0);
				setState(1863);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1865);
				bool_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1874);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(1868);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1869);
					bool_expr_logical_operator();
					setState(1870);
					bool_expr(3);
					}
					} 
				}
				setState(1876);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
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

	public static class Non_balanced_bool_exprContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Non_balanced_bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_balanced_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNon_balanced_bool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNon_balanced_bool_expr(this);
		}
	}

	public final Non_balanced_bool_exprContext non_balanced_bool_expr() throws RecognitionException {
		Non_balanced_bool_exprContext _localctx = new Non_balanced_bool_exprContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_non_balanced_bool_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				setState(1877);
				match(T_NOT);
				}
				break;
			}
			setState(1881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(1880);
				match(T_OPEN_P);
				}
				break;
			}
			setState(1883);
			bool_expr(0);
			setState(1885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(1884);
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
		enterRule(_localctx, 250, RULE_bool_expr_atom);
		try {
			setState(1890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1887);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1888);
				bool_expr_binary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1889);
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
		enterRule(_localctx, 252, RULE_bool_expr_unary);
		int _la;
		try {
			setState(1915);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1892);
				expr(0);
				setState(1893);
				match(T_IS);
				setState(1895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1894);
					match(T_NOT);
					}
				}

				setState(1897);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1899);
				expr(0);
				setState(1900);
				match(T_BETWEEN);
				setState(1901);
				expr(0);
				setState(1902);
				match(T_AND);
				setState(1903);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1905);
					match(T_NOT);
					}
				}

				setState(1908);
				match(T_EXISTS);
				setState(1909);
				match(T_OPEN_P);
				setState(1910);
				select_stmt();
				setState(1911);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1913);
				bool_expr_single_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1914);
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
		enterRule(_localctx, 254, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1917);
			expr(0);
			setState(1919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(1918);
				match(T_NOT);
				}
			}

			setState(1921);
			match(T_IN);
			setState(1922);
			match(T_OPEN_P);
			setState(1932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				{
				setState(1923);
				expr(0);
				setState(1928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1924);
					match(T_COMMA);
					setState(1925);
					expr(0);
					}
					}
					setState(1930);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(1931);
				select_stmt();
				}
				break;
			}
			setState(1934);
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
		enterRule(_localctx, 256, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1936);
			match(T_OPEN_P);
			setState(1937);
			expr(0);
			setState(1942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1938);
				match(T_COMMA);
				setState(1939);
				expr(0);
				}
				}
				setState(1944);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1945);
			match(T_CLOSE_P);
			setState(1947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(1946);
				match(T_NOT);
				}
			}

			setState(1949);
			match(T_IN);
			setState(1950);
			match(T_OPEN_P);
			setState(1951);
			select_stmt();
			setState(1952);
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
		enterRule(_localctx, 258, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1954);
			expr(0);
			setState(1955);
			bool_expr_binary_operator();
			setState(1956);
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
		enterRule(_localctx, 260, RULE_bool_expr_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
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
		enterRule(_localctx, 262, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(1972);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1960);
				match(T_EQUAL);
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1961);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1962);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(1963);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(1964);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1965);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 7);
				{
				setState(1966);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1967);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1969);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1968);
					match(T_NOT);
					}
				}

				setState(1971);
				_la = _input.LA(1);
				if ( !(((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (T_LIKE - 142)) | (1L << (T_REGEXP - 142)) | (1L << (T_RLIKE - 142)))) != 0)) ) {
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
		int _startState = 264;
		enterRecursionRule(_localctx, 264, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1991);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(1975);
				match(T_OPEN_P);
				setState(1976);
				select_stmt();
				setState(1977);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1979);
				match(T_OPEN_P);
				setState(1980);
				expr(0);
				setState(1981);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(1983);
				expr_interval();
				}
				break;
			case 4:
				{
				setState(1984);
				expr_concat();
				}
				break;
			case 5:
				{
				setState(1985);
				expr_case();
				}
				break;
			case 6:
				{
				setState(1986);
				expr_cursor_attribute();
				}
				break;
			case 7:
				{
				setState(1987);
				expr_agg_window_func();
				}
				break;
			case 8:
				{
				setState(1988);
				expr_spec_func();
				}
				break;
			case 9:
				{
				setState(1989);
				expr_func();
				}
				break;
			case 10:
				{
				setState(1990);
				expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2009);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2007);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1993);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1994);
						match(T_MUL);
						setState(1995);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1996);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1997);
						match(T_DIV);
						setState(1998);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1999);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2000);
						match(T_ADD);
						setState(2001);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2002);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2003);
						match(T_SUB);
						setState(2004);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2005);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2006);
						interval_item();
						}
						break;
					}
					} 
				}
				setState(2011);
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
		enterRule(_localctx, 266, RULE_expr_atom);
		try {
			setState(2020);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2012);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2013);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2014);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2015);
				ident();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2016);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2017);
				dec_number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2018);
				int_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2019);
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
		enterRule(_localctx, 268, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2022);
			match(T_INTERVAL);
			setState(2023);
			expr(0);
			setState(2024);
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
		enterRule(_localctx, 270, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2026);
			_la = _input.LA(1);
			if ( !(_la==T_DAY || _la==T_DAYS || ((((_la - 158)) & ~0x3f) == 0 && ((1L << (_la - 158)) & ((1L << (T_MICROSECOND - 158)) | (1L << (T_MICROSECONDS - 158)) | (1L << (T_SECOND - 158)) | (1L << (T_SECONDS - 158)))) != 0)) ) {
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
		enterRule(_localctx, 272, RULE_expr_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2028);
			expr_concat_item();
			setState(2029);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2030);
			expr_concat_item();
			setState(2035);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2031);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2032);
					expr_concat_item();
					}
					} 
				}
				setState(2037);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
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
		enterRule(_localctx, 274, RULE_expr_concat_item);
		try {
			setState(2047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2038);
				match(T_OPEN_P);
				setState(2039);
				expr(0);
				setState(2040);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2042);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2043);
				expr_agg_window_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2044);
				expr_spec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2045);
				expr_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2046);
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
		enterRule(_localctx, 276, RULE_expr_case);
		try {
			setState(2051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2049);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2050);
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
		enterRule(_localctx, 278, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2053);
			match(T_CASE);
			setState(2054);
			expr(0);
			setState(2060); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2055);
				match(T_WHEN);
				setState(2056);
				expr(0);
				setState(2057);
				match(T_THEN);
				setState(2058);
				expr(0);
				}
				}
				setState(2062); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2064);
				match(T_ELSE);
				setState(2065);
				expr(0);
				}
			}

			setState(2068);
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
		enterRule(_localctx, 280, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2070);
			match(T_CASE);
			setState(2076); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2071);
				match(T_WHEN);
				setState(2072);
				bool_expr(0);
				setState(2073);
				match(T_THEN);
				setState(2074);
				expr(0);
				}
				}
				setState(2078); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2082);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2080);
				match(T_ELSE);
				setState(2081);
				expr(0);
				}
			}

			setState(2084);
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
		enterRule(_localctx, 282, RULE_expr_cursor_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2086);
			ident();
			setState(2087);
			match(T__2);
			setState(2088);
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
		enterRule(_localctx, 284, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(2242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2090);
				match(T_AVG);
				setState(2091);
				match(T_OPEN_P);
				setState(2093);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
				case 1:
					{
					setState(2092);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2095);
				expr(0);
				setState(2096);
				match(T_CLOSE_P);
				setState(2098);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
				case 1:
					{
					setState(2097);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2100);
				match(T_COUNT);
				setState(2101);
				match(T_OPEN_P);
				setState(2107);
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
				case L_INVALID_NAME:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					{
					setState(2103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
					case 1:
						{
						setState(2102);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2105);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2106);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2109);
				match(T_CLOSE_P);
				setState(2111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(2110);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(2113);
				match(T_COUNT_BIG);
				setState(2114);
				match(T_OPEN_P);
				setState(2120);
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
				case L_INVALID_NAME:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					{
					setState(2116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
					case 1:
						{
						setState(2115);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2118);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2119);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2122);
				match(T_CLOSE_P);
				setState(2124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
				case 1:
					{
					setState(2123);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(2126);
				match(T_CUME_DIST);
				setState(2127);
				match(T_OPEN_P);
				setState(2128);
				match(T_CLOSE_P);
				setState(2129);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2130);
				match(T_DENSE_RANK);
				setState(2131);
				match(T_OPEN_P);
				setState(2132);
				match(T_CLOSE_P);
				setState(2133);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2134);
				match(T_FIRST_VALUE);
				setState(2135);
				match(T_OPEN_P);
				setState(2136);
				expr(0);
				setState(2137);
				match(T_CLOSE_P);
				setState(2138);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(2140);
				match(T_LAG);
				setState(2141);
				match(T_OPEN_P);
				setState(2142);
				expr(0);
				setState(2149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2143);
					match(T_COMMA);
					setState(2144);
					expr(0);
					setState(2147);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2145);
						match(T_COMMA);
						setState(2146);
						expr(0);
						}
					}

					}
				}

				setState(2151);
				match(T_CLOSE_P);
				setState(2152);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2154);
				match(T_LAST_VALUE);
				setState(2155);
				match(T_OPEN_P);
				setState(2156);
				expr(0);
				setState(2157);
				match(T_CLOSE_P);
				setState(2158);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(2160);
				match(T_LEAD);
				setState(2161);
				match(T_OPEN_P);
				setState(2162);
				expr(0);
				setState(2169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2163);
					match(T_COMMA);
					setState(2164);
					expr(0);
					setState(2167);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2165);
						match(T_COMMA);
						setState(2166);
						expr(0);
						}
					}

					}
				}

				setState(2171);
				match(T_CLOSE_P);
				setState(2172);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(2174);
				match(T_MAX);
				setState(2175);
				match(T_OPEN_P);
				setState(2177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2176);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2179);
				expr(0);
				setState(2180);
				match(T_CLOSE_P);
				setState(2182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2181);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(2184);
				match(T_MIN);
				setState(2185);
				match(T_OPEN_P);
				setState(2187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2186);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2189);
				expr(0);
				setState(2190);
				match(T_CLOSE_P);
				setState(2192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2191);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(2194);
				match(T_RANK);
				setState(2195);
				match(T_OPEN_P);
				setState(2196);
				match(T_CLOSE_P);
				setState(2197);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(2198);
				match(T_ROW_NUMBER);
				setState(2199);
				match(T_OPEN_P);
				setState(2200);
				match(T_CLOSE_P);
				setState(2201);
				expr_func_over_clause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
				{
				setState(2202);
				match(T_STDEV);
				setState(2203);
				match(T_OPEN_P);
				setState(2205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2204);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2207);
				expr(0);
				setState(2208);
				match(T_CLOSE_P);
				setState(2210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(2209);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
				{
				setState(2212);
				match(T_SUM);
				setState(2213);
				match(T_OPEN_P);
				setState(2215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2214);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2217);
				expr(0);
				setState(2218);
				match(T_CLOSE_P);
				setState(2220);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2219);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(2222);
				match(T_VAR);
				setState(2223);
				match(T_OPEN_P);
				setState(2225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
				case 1:
					{
					setState(2224);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2227);
				expr(0);
				setState(2228);
				match(T_CLOSE_P);
				setState(2230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(2229);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 17);
				{
				setState(2232);
				match(T_VARIANCE);
				setState(2233);
				match(T_OPEN_P);
				setState(2235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2234);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2237);
				expr(0);
				setState(2238);
				match(T_CLOSE_P);
				setState(2240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2239);
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
		enterRule(_localctx, 286, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2244);
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
		enterRule(_localctx, 288, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2246);
			match(T_OVER);
			setState(2247);
			match(T_OPEN_P);
			setState(2249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(2248);
				expr_func_partition_by_clause();
				}
			}

			setState(2252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(2251);
				order_by_clause();
				}
			}

			setState(2254);
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
		enterRule(_localctx, 290, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2256);
			match(T_PARTITION);
			setState(2257);
			match(T_BY);
			setState(2258);
			expr(0);
			setState(2263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2259);
				match(T_COMMA);
				setState(2260);
				expr(0);
				}
				}
				setState(2265);
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
		enterRule(_localctx, 292, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(2466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2266);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2267);
				match(T_CAST);
				setState(2268);
				match(T_OPEN_P);
				setState(2269);
				expr(0);
				setState(2270);
				match(T_AS);
				setState(2271);
				dtype();
				setState(2273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2272);
					dtype_len();
					}
				}

				setState(2275);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2277);
				match(T_COUNT);
				setState(2278);
				match(T_OPEN_P);
				setState(2281);
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
				case L_INVALID_NAME:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					setState(2279);
					expr(0);
					}
					break;
				case T_MUL:
					{
					setState(2280);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2283);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2284);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2285);
				match(T_CURRENT);
				setState(2286);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2290);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(2287);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(2288);
					match(T_CURRENT);
					setState(2289);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
				case 1:
					{
					setState(2292);
					match(T_OPEN_P);
					setState(2293);
					expr(0);
					setState(2294);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2298);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2299);
				match(T_CURRENT);
				setState(2300);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2301);
				match(T_MAX_PART_STRING);
				setState(2302);
				match(T_OPEN_P);
				setState(2303);
				expr(0);
				setState(2316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2304);
					match(T_COMMA);
					setState(2305);
					expr(0);
					setState(2313);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2306);
						match(T_COMMA);
						setState(2307);
						expr(0);
						setState(2308);
						match(T_EQUAL);
						setState(2309);
						expr(0);
						}
						}
						setState(2315);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2318);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2320);
				match(T_MIN_PART_STRING);
				setState(2321);
				match(T_OPEN_P);
				setState(2322);
				expr(0);
				setState(2335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2323);
					match(T_COMMA);
					setState(2324);
					expr(0);
					setState(2332);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2325);
						match(T_COMMA);
						setState(2326);
						expr(0);
						setState(2327);
						match(T_EQUAL);
						setState(2328);
						expr(0);
						}
						}
						setState(2334);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2337);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2339);
				match(T_MAX_PART_INT);
				setState(2340);
				match(T_OPEN_P);
				setState(2341);
				expr(0);
				setState(2354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2342);
					match(T_COMMA);
					setState(2343);
					expr(0);
					setState(2351);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2344);
						match(T_COMMA);
						setState(2345);
						expr(0);
						setState(2346);
						match(T_EQUAL);
						setState(2347);
						expr(0);
						}
						}
						setState(2353);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2356);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2358);
				match(T_MIN_PART_INT);
				setState(2359);
				match(T_OPEN_P);
				setState(2360);
				expr(0);
				setState(2373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2361);
					match(T_COMMA);
					setState(2362);
					expr(0);
					setState(2370);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2363);
						match(T_COMMA);
						setState(2364);
						expr(0);
						setState(2365);
						match(T_EQUAL);
						setState(2366);
						expr(0);
						}
						}
						setState(2372);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2375);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2377);
				match(T_MAX_PART_DATE);
				setState(2378);
				match(T_OPEN_P);
				setState(2379);
				expr(0);
				setState(2392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2380);
					match(T_COMMA);
					setState(2381);
					expr(0);
					setState(2389);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2382);
						match(T_COMMA);
						setState(2383);
						expr(0);
						setState(2384);
						match(T_EQUAL);
						setState(2385);
						expr(0);
						}
						}
						setState(2391);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2394);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2396);
				match(T_MIN_PART_DATE);
				setState(2397);
				match(T_OPEN_P);
				setState(2398);
				expr(0);
				setState(2411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2399);
					match(T_COMMA);
					setState(2400);
					expr(0);
					setState(2408);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2401);
						match(T_COMMA);
						setState(2402);
						expr(0);
						setState(2403);
						match(T_EQUAL);
						setState(2404);
						expr(0);
						}
						}
						setState(2410);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2413);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2415);
				match(T_PART_COUNT);
				setState(2416);
				match(T_OPEN_P);
				setState(2417);
				expr(0);
				setState(2425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2418);
					match(T_COMMA);
					setState(2419);
					expr(0);
					setState(2420);
					match(T_EQUAL);
					setState(2421);
					expr(0);
					}
					}
					setState(2427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2428);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2430);
				match(T_PART_LOC);
				setState(2431);
				match(T_OPEN_P);
				setState(2432);
				expr(0);
				setState(2438); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2433);
						match(T_COMMA);
						setState(2434);
						expr(0);
						setState(2435);
						match(T_EQUAL);
						setState(2436);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2440); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2442);
					match(T_COMMA);
					setState(2443);
					expr(0);
					}
				}

				setState(2446);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2448);
				match(T_TRIM);
				setState(2449);
				match(T_OPEN_P);
				setState(2450);
				expr(0);
				setState(2451);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2453);
				match(T_SUBSTRING);
				setState(2454);
				match(T_OPEN_P);
				setState(2455);
				expr(0);
				setState(2456);
				match(T_FROM);
				setState(2457);
				expr(0);
				setState(2460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(2458);
					match(T_FOR);
					setState(2459);
					expr(0);
					}
				}

				setState(2462);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2464);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2465);
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
		enterRule(_localctx, 294, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2468);
			ident();
			setState(2469);
			match(T_OPEN_P);
			setState(2471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				{
				setState(2470);
				expr_func_params();
				}
				break;
			}
			setState(2473);
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
		enterRule(_localctx, 296, RULE_expr_func_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2475);
			func_param();
			setState(2480);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2476);
					match(T_COMMA);
					setState(2477);
					func_param();
					}
					} 
				}
				setState(2482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
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
		enterRule(_localctx, 298, RULE_func_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2483);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
			setState(2489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				{
				setState(2484);
				ident();
				setState(2485);
				match(T_EQUAL);
				setState(2487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_GREATER) {
					{
					setState(2486);
					match(T_GREATER);
					}
				}

				}
				break;
			}
			setState(2491);
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
		enterRule(_localctx, 300, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2493);
			match(T_DATE);
			setState(2494);
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
		enterRule(_localctx, 302, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2496);
			match(T_TIMESTAMP);
			setState(2497);
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
		public TerminalNode L_INVALID_NAME() { return getToken(HplsqlParser.L_INVALID_NAME, 0); }
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
		enterRule(_localctx, 304, RULE_ident);
		try {
			int _alt;
			setState(2514);
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
				enterOuterAlt(_localctx, 1);
				{
				setState(2501);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_ID:
					{
					setState(2499);
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
					{
					setState(2500);
					non_reserved_words();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,327,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2503);
						match(T__3);
						setState(2506);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case L_ID:
							{
							setState(2504);
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
							{
							setState(2505);
							non_reserved_words();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(2512);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,327,_ctx);
				}
				}
				break;
			case L_INVALID_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(2513);
				match(L_INVALID_NAME);
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
		enterRule(_localctx, 306, RULE_string);
		try {
			setState(2518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2516);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2517);
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
		enterRule(_localctx, 308, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2520);
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

			setState(2523);
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
		enterRule(_localctx, 310, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2525);
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

			setState(2528);
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
		enterRule(_localctx, 312, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2530);
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
		enterRule(_localctx, 314, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2532);
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
		enterRule(_localctx, 316, RULE_new_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2534);
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

	public static class Invalid_variable_nameContext extends ParserRuleContext {
		public TerminalNode L_INVALID_NAME() { return getToken(HplsqlParser.L_INVALID_NAME, 0); }
		public Invalid_variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalid_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterInvalid_variable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitInvalid_variable_name(this);
		}
	}

	public final Invalid_variable_nameContext invalid_variable_name() throws RecognitionException {
		Invalid_variable_nameContext _localctx = new Invalid_variable_nameContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_invalid_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2536);
			match(T__5);
			setState(2537);
			match(L_INVALID_NAME);
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
		enterRule(_localctx, 320, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2539);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_AND) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_DATABASE) | (1L << T_DATA) | (1L << T_DATE) | (1L << T_DATETIME) | (1L << T_DAY) | (1L << T_DAYS) | (1L << T_DEC) | (1L << T_DECIMAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_END - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IMMEDIATE - 64)) | (1L << (T_IN - 64)) | (1L << (T_INDEX - 64)) | (1L << (T_INITRANS - 64)) | (1L << (T_INNER - 64)) | (1L << (T_INOUT - 64)) | (1L << (T_INT - 64)) | (1L << (T_INT2 - 64)) | (1L << (T_INT4 - 64)) | (1L << (T_INT8 - 64)) | (1L << (T_INTEGER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)) | (1L << (T_OR - 128)) | (1L << (T_ORDER - 128)) | (1L << (T_OUT - 128)) | (1L << (T_OUTER - 128)) | (1L << (T_OVER - 128)) | (1L << (T_OWNER - 128)) | (1L << (T_PACKAGE - 128)) | (1L << (T_PARTITION - 128)) | (1L << (T_PCTFREE - 128)) | (1L << (T_PCTUSED - 128)) | (1L << (T_PRECISION - 128)) | (1L << (T_PRESERVE - 128)) | (1L << (T_PRIMARY - 128)) | (1L << (T_PROC - 128)) | (1L << (T_PROCEDURE - 128)) | (1L << (T_QUALIFY - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_QUIT - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)) | (1L << (T_SQL - 192)) | (1L << (T_SQLEXCEPTION - 192)) | (1L << (T_SQLWARNING - 192)) | (1L << (T_STEP - 192)) | (1L << (T_STORAGE - 192)) | (1L << (T_STORED - 192)) | (1L << (T_STRING - 192)) | (1L << (T_SUBSTRING - 192)) | (1L << (T_SUM - 192)) | (1L << (T_SYS_REFCURSOR - 192)) | (1L << (T_TABLE - 192)) | (1L << (T_TABLESPACE - 192)) | (1L << (T_TEMPORARY - 192)) | (1L << (T_TERMINATED - 192)) | (1L << (T_TEXTIMAGE_ON - 192)) | (1L << (T_THEN - 192)) | (1L << (T_TIMESTAMP - 192)) | (1L << (T_TITLE - 192)) | (1L << (T_TO - 192)) | (1L << (T_TOP - 192)) | (1L << (T_TRUE - 192)) | (1L << (T_UNIQUE - 192)) | (1L << (T_UPDATE - 192)) | (1L << (T_UR - 192)) | (1L << (T_USE - 192)) | (1L << (T_USING - 192)) | (1L << (T_VALUE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)) | (1L << (T_PART_COUNT - 256)) | (1L << (T_PART_LOC - 256)) | (1L << (T_RANK - 256)) | (1L << (T_ROW_NUMBER - 256)) | (1L << (T_STDEV - 256)) | (1L << (T_SYSDATE - 256)) | (1L << (T_VARIANCE - 256)) | (1L << (T_USER - 256)))) != 0)) ) {
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
		case 11:
			return expr_stmt_sempred((Expr_stmtContext)_localctx, predIndex);
		case 66:
			return create_routine_params_sempred((Create_routine_paramsContext)_localctx, predIndex);
		case 103:
			return select_list_alias_sempred((Select_list_aliasContext)_localctx, predIndex);
		case 114:
			return from_alias_clause_sempred((From_alias_clauseContext)_localctx, predIndex);
		case 123:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 132:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 149:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0148\u09f0\4\2\t"+
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
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\3\2\3\2\3\2\3\3\3\3\5\3\u014a"+
		"\n\3\3\3\5\3\u014d\n\3\6\3\u014f\n\3\r\3\16\3\u0150\3\4\5\4\u0154\n\4"+
		"\3\4\3\4\3\4\5\4\u0159\n\4\3\4\3\4\3\5\3\5\3\5\5\5\u0160\n\5\3\5\3\5\3"+
		"\5\3\5\5\5\u0166\n\5\5\5\u0168\n\5\3\6\3\6\3\6\3\7\3\7\6\7\u016f\n\7\r"+
		"\7\16\7\u0170\3\7\5\7\u0174\n\7\5\7\u0176\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u0194\n\b\3\t\3\t\6\t\u0198\n\t\r\t\16\t\u0199"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\5\16\u01aa"+
		"\n\16\3\16\3\16\3\16\7\16\u01af\n\16\f\16\16\16\u01b2\13\16\3\17\3\17"+
		"\3\17\5\17\u01b7\n\17\3\20\3\20\5\20\u01bb\n\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u01c4\n\20\3\20\3\20\3\20\5\20\u01c9\n\20\3\21\3\21"+
		"\3\21\3\21\7\21\u01cf\n\21\f\21\16\21\u01d2\13\21\3\21\3\21\5\21\u01d6"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\7\21\u01dd\n\21\f\21\16\21\u01e0\13\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u01e9\n\22\f\22\16\22\u01ec\13"+
		"\22\3\22\3\22\5\22\u01f0\n\22\3\22\5\22\u01f3\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\5\23\u01fd\n\23\3\23\3\23\3\23\3\23\3\23\7\23\u0204"+
		"\n\23\f\23\16\23\u0207\13\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\5\25\u0214\n\25\3\25\3\25\5\25\u0218\n\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\7\27\u0221\n\27\f\27\16\27\u0224\13\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u022c\n\30\f\30\16\30\u022f\13\30\3\31\3\31"+
		"\3\31\3\31\3\31\7\31\u0236\n\31\f\31\16\31\u0239\13\31\3\32\3\32\3\32"+
		"\3\32\5\32\u023f\n\32\3\33\3\33\3\33\7\33\u0244\n\33\f\33\16\33\u0247"+
		"\13\33\3\33\5\33\u024a\n\33\3\33\3\33\5\33\u024e\n\33\3\33\7\33\u0251"+
		"\n\33\f\33\16\33\u0254\13\33\3\33\5\33\u0257\n\33\3\33\3\33\3\33\5\33"+
		"\u025c\n\33\3\33\3\33\5\33\u0260\n\33\3\33\3\33\5\33\u0264\n\33\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0271\n\35\3\35"+
		"\3\35\3\36\5\36\u0276\n\36\3\36\3\36\3\36\3\36\5\36\u027c\n\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\5\37\u0285\n\37\3\37\3\37\5\37\u0289\n\37"+
		"\3\37\3\37\3 \3 \3 \3 \5 \u0291\n \3 \5 \u0294\n \3 \3 \3 \5 \u0299\n"+
		" \3 \3 \3!\5!\u029e\n!\3!\3!\3!\3!\3!\5!\u02a5\n!\3!\3!\3!\3!\3!\5!\u02ac"+
		"\n!\3!\5!\u02af\n!\3\"\3\"\3\"\7\"\u02b4\n\"\f\"\16\"\u02b7\13\"\3#\3"+
		"#\3#\5#\u02bc\n#\3#\7#\u02bf\n#\f#\16#\u02c2\13#\3#\7#\u02c5\n#\f#\16"+
		"#\u02c8\13#\3#\3#\5#\u02cc\n#\3#\5#\u02cf\n#\3$\3$\3%\3%\5%\u02d5\n%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u02e1\n%\f%\16%\u02e4\13%\3%\3%\3%\3%"+
		"\3%\7%\u02eb\n%\f%\16%\u02ee\13%\3%\3%\3%\5%\u02f3\n%\3&\3&\3&\5&\u02f8"+
		"\n&\3&\3&\3&\5&\u02fd\n&\3&\3&\3&\5&\u0302\n&\7&\u0304\n&\f&\16&\u0307"+
		"\13&\3&\3&\5&\u030b\n&\3&\5&\u030e\n&\3&\3&\3&\3&\3&\3&\7&\u0316\n&\f"+
		"&\16&\u0319\13&\3&\3&\3&\3&\3&\3&\3&\7&\u0322\n&\f&\16&\u0325\13&\3&\3"+
		"&\7&\u0329\n&\f&\16&\u032c\13&\5&\u032e\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\5\'\u033a\n\'\3(\6(\u033d\n(\r(\16(\u033e\3)\3)\3)\5)\u0344"+
		"\n)\3*\5*\u0347\n*\3*\3*\3+\6+\u034c\n+\r+\16+\u034d\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\5,\u035a\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\6-\u0367\n"+
		"-\r-\16-\u0368\3-\3-\3-\5-\u036e\n-\3.\5.\u0371\n.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\7.\u037e\n.\f.\16.\u0381\13.\3.\3.\3.\5.\u0386\n.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\5.\u0391\n.\3/\5/\u0394\n/\3/\3/\3/\3/\3/\3/\7/"+
		"\u039c\n/\f/\16/\u039f\13/\3/\3/\3/\3/\5/\u03a5\n/\3\60\3\60\3\60\3\60"+
		"\5\60\u03ab\n\60\3\61\3\61\3\61\3\61\7\61\u03b1\n\61\f\61\16\61\u03b4"+
		"\13\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u03bd\n\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\5\62\u03d1\n\62\3\63\3\63\3\63\3\63\5\63\u03d7\n\63\3\64\3\64"+
		"\5\64\u03db\n\64\3\64\3\64\3\64\5\64\u03e0\n\64\3\64\3\64\5\64\u03e4\n"+
		"\64\3\64\3\64\3\64\5\64\u03e9\n\64\3\64\5\64\u03ec\n\64\3\64\3\64\3\64"+
		"\5\64\u03f1\n\64\3\64\5\64\u03f4\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\5\65\u0402\n\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0421\n\65\5\65"+
		"\u0423\n\65\3\66\3\66\3\66\5\66\u0428\n\66\3\66\3\66\5\66\u042c\n\66\3"+
		"\66\3\66\3\67\5\67\u0431\n\67\3\67\3\67\3\67\3\67\3\67\5\67\u0438\n\67"+
		"\3\67\5\67\u043b\n\67\38\58\u043e\n8\38\38\38\58\u0443\n8\38\38\58\u0447"+
		"\n8\58\u0449\n8\39\39\39\39\39\59\u0450\n9\39\39\79\u0454\n9\f9\169\u0457"+
		"\139\3:\3:\3:\3:\5:\u045d\n:\3;\3;\3;\3;\5;\u0463\n;\3;\5;\u0466\n;\3"+
		";\3;\3;\5;\u046b\n;\3;\3;\5;\u046f\n;\3;\5;\u0472\n;\3;\3;\3<\3<\3<\5"+
		"<\u0479\n<\3=\3=\3=\3=\5=\u047f\n=\3=\5=\u0482\n=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\5=\u048c\n=\3>\3>\3>\3>\3>\7>\u0493\n>\f>\16>\u0496\13>\3?\3?\3?"+
		"\3?\5?\u049c\n?\3?\3?\3?\3?\3?\5?\u04a3\n?\5?\u04a5\n?\3@\3@\3@\3@\5@"+
		"\u04ab\n@\3@\5@\u04ae\n@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u04b9\n@\3A\3A"+
		"\3A\3A\3A\7A\u04c0\nA\fA\16A\u04c3\13A\3B\3B\3B\5B\u04c8\nB\3C\3C\3C\3"+
		"C\5C\u04ce\nC\3C\5C\u04d1\nC\3C\3C\3C\5C\u04d6\nC\3C\5C\u04d9\nC\3C\5"+
		"C\u04dc\nC\3C\5C\u04df\nC\3C\5C\u04e2\nC\3C\3C\3C\3C\5C\u04e8\nC\3D\3"+
		"D\3D\3D\3D\3D\7D\u04f0\nD\fD\16D\u04f3\13D\3D\3D\3D\3D\3D\3D\7D\u04fb"+
		"\nD\fD\16D\u04fe\13D\5D\u0500\nD\3E\3E\3E\3E\3E\5E\u0507\nE\3E\3E\3E\5"+
		"E\u050c\nE\3E\7E\u050f\nE\fE\16E\u0512\13E\3E\5E\u0515\nE\3E\3E\3E\3E"+
		"\3E\3E\5E\u051d\nE\3E\3E\5E\u0521\nE\3E\7E\u0524\nE\fE\16E\u0527\13E\3"+
		"E\5E\u052a\nE\5E\u052c\nE\3F\6F\u052f\nF\rF\16F\u0530\3G\3G\3G\3G\3G\3"+
		"G\5G\u0539\nG\3G\3G\3G\5G\u053e\nG\3H\3H\5H\u0542\nH\3H\3H\3H\3H\3H\3"+
		"H\5H\u054a\nH\3H\3H\3H\3H\7H\u0550\nH\fH\16H\u0553\13H\5H\u0555\nH\3H"+
		"\5H\u0558\nH\3I\3I\3I\5I\u055d\nI\3J\3J\3J\5J\u0562\nJ\3J\3J\3J\7J\u0567"+
		"\nJ\fJ\16J\u056a\13J\3J\5J\u056d\nJ\3J\3J\3J\3K\3K\3K\5K\u0575\nK\3K\3"+
		"K\3K\5K\u057a\nK\3L\3L\3L\3L\5L\u0580\nL\3L\3L\3L\3M\3M\3M\5M\u0588\n"+
		"M\3M\3M\3M\3N\3N\3N\3O\3O\5O\u0592\nO\3O\3O\3O\5O\u0597\nO\5O\u0599\n"+
		"O\3P\3P\5P\u059d\nP\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\5R\u05a7\nR\3R\3R\3R\3R\5"+
		"R\u05ad\nR\3R\3R\5R\u05b1\nR\3S\3S\5S\u05b5\nS\3S\3S\3S\3S\3S\3S\3S\3"+
		"S\7S\u05bf\nS\fS\16S\u05c2\13S\3S\3S\3T\3T\5T\u05c8\nT\3U\3U\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\7V\u05d6\nV\fV\16V\u05d9\13V\3V\3V\7V\u05dd\nV\f"+
		"V\16V\u05e0\13V\3W\5W\u05e3\nW\3W\3W\5W\u05e7\nW\3X\3X\5X\u05eb\nX\3Y"+
		"\3Y\3Y\5Y\u05f0\nY\3Y\3Y\3Y\3Y\5Y\u05f6\nY\3Z\3Z\3Z\3Z\5Z\u05fc\nZ\3Z"+
		"\3Z\3Z\3Z\3Z\5Z\u0603\nZ\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\5[\u0610\n["+
		"\3\\\3\\\3\\\3\\\7\\\u0616\n\\\f\\\16\\\u0619\13\\\3]\5]\u061c\n]\3]\3"+
		"]\3^\3^\3^\3^\7^\u0624\n^\f^\16^\u0627\13^\3_\3_\5_\u062b\n_\3_\3_\3_"+
		"\3_\3_\3`\3`\3`\3`\7`\u0636\n`\f`\16`\u0639\13`\3`\3`\3a\3a\3a\3a\7a\u0641"+
		"\na\fa\16a\u0644\13a\3b\3b\3b\3b\3b\5b\u064b\nb\3c\3c\5c\u064f\nc\3c\3"+
		"c\5c\u0653\nc\3c\3c\5c\u0657\nc\5c\u0659\nc\3d\3d\3d\5d\u065e\nd\3d\5"+
		"d\u0661\nd\3d\5d\u0664\nd\3d\5d\u0667\nd\3d\3d\5d\u066b\nd\3d\5d\u066e"+
		"\nd\3d\5d\u0671\nd\3e\5e\u0674\ne\3e\5e\u0677\ne\3e\3e\3e\7e\u067c\ne"+
		"\fe\16e\u067f\13e\3f\3f\3g\3g\3g\3h\3h\3h\5h\u0689\nh\3h\3h\5h\u068d\n"+
		"h\3h\5h\u0690\nh\3i\3i\5i\u0694\ni\3i\3i\3i\3i\3i\5i\u069b\ni\3j\3j\5"+
		"j\u069f\nj\3j\3j\3k\3k\3k\3k\7k\u06a7\nk\fk\16k\u06aa\13k\3l\3l\3l\7l"+
		"\u06af\nl\fl\16l\u06b2\13l\3m\3m\3m\5m\u06b7\nm\3n\3n\5n\u06bb\nn\3o\3"+
		"o\3o\3o\5o\u06c1\no\3p\3p\3p\3p\3p\3p\3p\5p\u06ca\np\5p\u06cc\np\3q\5"+
		"q\u06cf\nq\3q\3q\3q\5q\u06d4\nq\3q\5q\u06d7\nq\3r\3r\3r\3r\3r\3r\7r\u06df"+
		"\nr\fr\16r\u06e2\13r\3r\3r\5r\u06e6\nr\3s\3s\3s\3s\3s\7s\u06ed\ns\fs\16"+
		"s\u06f0\13s\3s\3s\5s\u06f4\ns\3t\3t\5t\u06f8\nt\3t\3t\3t\3t\3t\7t\u06ff"+
		"\nt\ft\16t\u0702\13t\3t\5t\u0705\nt\3u\3u\3v\3v\3v\5v\u070c\nv\3w\3w\3"+
		"w\3w\3w\7w\u0713\nw\fw\16w\u0716\13w\3x\3x\3x\5x\u071b\nx\3y\3y\3y\5y"+
		"\u0720\ny\3z\3z\3z\3z\5z\u0726\nz\3z\3z\3z\5z\u072b\nz\7z\u072d\nz\fz"+
		"\16z\u0730\13z\3{\6{\u0733\n{\r{\16{\u0734\3|\3|\3|\3|\3|\3|\3|\3|\3|"+
		"\5|\u0740\n|\5|\u0742\n|\3}\3}\5}\u0746\n}\3}\3}\3}\3}\3}\5}\u074d\n}"+
		"\3}\3}\3}\3}\7}\u0753\n}\f}\16}\u0756\13}\3~\5~\u0759\n~\3~\5~\u075c\n"+
		"~\3~\3~\5~\u0760\n~\3\177\3\177\3\177\5\177\u0765\n\177\3\u0080\3\u0080"+
		"\3\u0080\5\u0080\u076a\n\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0775\n\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u077e\n\u0080\3\u0081"+
		"\3\u0081\5\u0081\u0782\n\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\7\u0081\u0789\n\u0081\f\u0081\16\u0081\u078c\13\u0081\3\u0081\5\u0081"+
		"\u078f\n\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\7\u0082"+
		"\u0797\n\u0082\f\u0082\16\u0082\u079a\13\u0082\3\u0082\3\u0082\5\u0082"+
		"\u079e\n\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u07b4\n\u0085\3\u0085\5\u0085"+
		"\u07b7\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\5\u0086\u07ca\n\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\7\u0086\u07da\n\u0086\f\u0086\16\u0086\u07dd\13\u0086\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u07e7\n\u0087"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\7\u008a\u07f4\n\u008a\f\u008a\16\u008a\u07f7\13\u008a"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\5\u008b\u0802\n\u008b\3\u008c\3\u008c\5\u008c\u0806\n\u008c\3\u008d\3"+
		"\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\6\u008d\u080f\n\u008d\r"+
		"\u008d\16\u008d\u0810\3\u008d\3\u008d\5\u008d\u0815\n\u008d\3\u008d\3"+
		"\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\6\u008e\u081f\n"+
		"\u008e\r\u008e\16\u008e\u0820\3\u008e\3\u008e\5\u008e\u0825\n\u008e\3"+
		"\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090"+
		"\5\u0090\u0830\n\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0835\n\u0090\3"+
		"\u0090\3\u0090\3\u0090\5\u0090\u083a\n\u0090\3\u0090\3\u0090\5\u0090\u083e"+
		"\n\u0090\3\u0090\3\u0090\5\u0090\u0842\n\u0090\3\u0090\3\u0090\3\u0090"+
		"\5\u0090\u0847\n\u0090\3\u0090\3\u0090\5\u0090\u084b\n\u0090\3\u0090\3"+
		"\u0090\5\u0090\u084f\n\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3"+
		"\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0866"+
		"\n\u0090\5\u0090\u0868\n\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\5\u0090\u087a\n\u0090\5\u0090\u087c\n\u0090\3\u0090\3"+
		"\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0884\n\u0090\3\u0090\3"+
		"\u0090\3\u0090\5\u0090\u0889\n\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u088e"+
		"\n\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0893\n\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\5\u0090\u08a0\n\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u08a5\n\u0090\3"+
		"\u0090\3\u0090\3\u0090\5\u0090\u08aa\n\u0090\3\u0090\3\u0090\3\u0090\5"+
		"\u0090\u08af\n\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u08b4\n\u0090\3\u0090"+
		"\3\u0090\3\u0090\5\u0090\u08b9\n\u0090\3\u0090\3\u0090\3\u0090\5\u0090"+
		"\u08be\n\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u08c3\n\u0090\5\u0090\u08c5"+
		"\n\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\5\u0092\u08cc\n\u0092"+
		"\3\u0092\5\u0092\u08cf\n\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\7\u0093\u08d8\n\u0093\f\u0093\16\u0093\u08db\13\u0093"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u08e4"+
		"\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u08ec"+
		"\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094"+
		"\u08f5\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u08fb\n\u0094\3"+
		"\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\7\u0094\u090a\n\u0094\f\u0094\16\u0094"+
		"\u090d\13\u0094\5\u0094\u090f\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\7\u0094"+
		"\u091d\n\u0094\f\u0094\16\u0094\u0920\13\u0094\5\u0094\u0922\n\u0094\3"+
		"\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\7\u0094\u0930\n\u0094\f\u0094\16\u0094\u0933"+
		"\13\u0094\5\u0094\u0935\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\7\u0094\u0943"+
		"\n\u0094\f\u0094\16\u0094\u0946\13\u0094\5\u0094\u0948\n\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\7\u0094\u0956\n\u0094\f\u0094\16\u0094\u0959\13\u0094"+
		"\5\u0094\u095b\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\7\u0094\u0969\n\u0094"+
		"\f\u0094\16\u0094\u096c\13\u0094\5\u0094\u096e\n\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\7\u0094"+
		"\u097a\n\u0094\f\u0094\16\u0094\u097d\13\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\6\u0094\u0989"+
		"\n\u0094\r\u0094\16\u0094\u098a\3\u0094\3\u0094\5\u0094\u098f\n\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u099f\n\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\5\u0094\u09a5\n\u0094\3\u0095\3\u0095\3\u0095"+
		"\5\u0095\u09aa\n\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\7\u0096"+
		"\u09b1\n\u0096\f\u0096\16\u0096\u09b4\13\u0096\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\5\u0097\u09ba\n\u0097\5\u0097\u09bc\n\u0097\3\u0097\3\u0097\3"+
		"\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\5\u009a"+
		"\u09c8\n\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u09cd\n\u009a\7\u009a\u09cf"+
		"\n\u009a\f\u009a\16\u009a\u09d2\13\u009a\3\u009a\5\u009a\u09d5\n\u009a"+
		"\3\u009b\3\u009b\5\u009b\u09d9\n\u009b\3\u009c\5\u009c\u09dc\n\u009c\3"+
		"\u009c\3\u009c\3\u009d\5\u009d\u09e1\n\u009d\3\u009d\3\u009d\3\u009e\3"+
		"\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a2"+
		"\3\u00a2\3\u00a2\2\4\u00f8\u010a\u00a3\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\u0142\2*\4\2WW\u0108\u0108\5\2\3\4\u012b\u012b\u013c\u013c\3\2\u0095"+
		"\u0096\4\2\62\62``\4\2\u00a3\u00a3\u00dc\u00dc\4\2\16\16JJ\4\2HH\u00fd"+
		"\u00fd\4\2aa\u0098\u0098\4\2HH\u00bd\u00bd\4\2DDvv\5\2yy\u009e\u009e\u00b9"+
		"\u00ba\4\2\u009a\u009a\u00a8\u00a8\4\2\u00a6\u00a6\u010e\u010e\4\2\u009d"+
		"\u009d\u0142\u0142\4\2\35\35##\4\2!!88\4\2::\u00d5\u00d5\4\2\r\r\u0086"+
		"\u0086\3\2\u00ca\u00cb\3\2\u00bf\u00c0\6\2\67\67FF\u0085\u0085\u00b6\u00b6"+
		"\3\2[\\\3\2TU\4\2\u00d1\u00d1\u00ec\u00ec\6\2\23\23OO\u009b\u009b\u00f3"+
		"\u00f3\4\2\u009b\u009b\u010a\u010a\4\2\34\34\u00e7\u00e7\3\2\u00da\u00db"+
		"\4\2\n\nMM\5\2jj\u008f\u008f\u00cd\u00cd\5\288\u00d2\u00d3\u00fe\u00fe"+
		"\5\2^^\u00de\u00de\u00fd\u00fd\4\2\f\f\u00b1\u00b1\5\2\u0090\u0090\u00c5"+
		"\u00c5\u00ce\u00ce\5\2>?\u00a0\u00a1\u00d6\u00d7\4\2//\u012a\u012a\5\2"+
		"hh\u0087\u0087\u00aa\u00aa\4\2\u0127\u0127\u013d\u013d\4\2bb\u00f9\u00f9"+
		"\25\2\t\t\f\27\31,.KMPRRVkmrt{}\u009e\u00a0\u00aa\u00ac\u00ba\u00bc\u00e0"+
		"\u00e2\u00f4\u00f6\u00f9\u00fc\u0107\u010a\u010b\u010d\u0118\u011f\u0126"+
		"\2\u0b53\2\u0144\3\2\2\2\4\u014e\3\2\2\2\6\u0153\3\2\2\2\b\u0167\3\2\2"+
		"\2\n\u0169\3\2\2\2\f\u0175\3\2\2\2\16\u0193\3\2\2\2\20\u0195\3\2\2\2\22"+
		"\u019b\3\2\2\2\24\u01a1\3\2\2\2\26\u01a3\3\2\2\2\30\u01a5\3\2\2\2\32\u01a9"+
		"\3\2\2\2\34\u01b6\3\2\2\2\36\u01c8\3\2\2\2 \u01ca\3\2\2\2\"\u01ef\3\2"+
		"\2\2$\u01f9\3\2\2\2&\u020d\3\2\2\2(\u020f\3\2\2\2*\u0219\3\2\2\2,\u021c"+
		"\3\2\2\2.\u0225\3\2\2\2\60\u0230\3\2\2\2\62\u023e\3\2\2\2\64\u0263\3\2"+
		"\2\2\66\u0265\3\2\2\28\u0268\3\2\2\2:\u0275\3\2\2\2<\u027f\3\2\2\2>\u028c"+
		"\3\2\2\2@\u02ab\3\2\2\2B\u02b0\3\2\2\2D\u02ce\3\2\2\2F\u02d0\3\2\2\2H"+
		"\u02f2\3\2\2\2J\u032d\3\2\2\2L\u032f\3\2\2\2N\u033c\3\2\2\2P\u0343\3\2"+
		"\2\2R\u0346\3\2\2\2T\u034b\3\2\2\2V\u0359\3\2\2\2X\u036d\3\2\2\2Z\u0390"+
		"\3\2\2\2\\\u03a4\3\2\2\2^\u03aa\3\2\2\2`\u03ac\3\2\2\2b\u03d0\3\2\2\2"+
		"d\u03d6\3\2\2\2f\u03f3\3\2\2\2h\u0422\3\2\2\2j\u0424\3\2\2\2l\u043a\3"+
		"\2\2\2n\u0448\3\2\2\2p\u044a\3\2\2\2r\u045c\3\2\2\2t\u0465\3\2\2\2v\u0475"+
		"\3\2\2\2x\u0481\3\2\2\2z\u048d\3\2\2\2|\u04a4\3\2\2\2~\u04ad\3\2\2\2\u0080"+
		"\u04ba\3\2\2\2\u0082\u04c7\3\2\2\2\u0084\u04d0\3\2\2\2\u0086\u04ff\3\2"+
		"\2\2\u0088\u052b\3\2\2\2\u008a\u052e\3\2\2\2\u008c\u053d\3\2\2\2\u008e"+
		"\u053f\3\2\2\2\u0090\u055c\3\2\2\2\u0092\u055e\3\2\2\2\u0094\u0571\3\2"+
		"\2\2\u0096\u057b\3\2\2\2\u0098\u0584\3\2\2\2\u009a\u058c\3\2\2\2\u009c"+
		"\u058f\3\2\2\2\u009e\u059a\3\2\2\2\u00a0\u059e\3\2\2\2\u00a2\u05ac\3\2"+
		"\2\2\u00a4\u05b2\3\2\2\2\u00a6\u05c5\3\2\2\2\u00a8\u05c9\3\2\2\2\u00aa"+
		"\u05cb\3\2\2\2\u00ac\u05e2\3\2\2\2\u00ae\u05e8\3\2\2\2\u00b0\u05ec\3\2"+
		"\2\2\u00b2\u05f7\3\2\2\2\u00b4\u060f\3\2\2\2\u00b6\u0611\3\2\2\2\u00b8"+
		"\u061b\3\2\2\2\u00ba\u061f\3\2\2\2\u00bc\u0628\3\2\2\2\u00be\u0631\3\2"+
		"\2\2\u00c0\u063c\3\2\2\2\u00c2\u064a\3\2\2\2\u00c4\u0658\3\2\2\2\u00c6"+
		"\u065a\3\2\2\2\u00c8\u0673\3\2\2\2\u00ca\u0680\3\2\2\2\u00cc\u0682\3\2"+
		"\2\2\u00ce\u068f\3\2\2\2\u00d0\u069a\3\2\2\2\u00d2\u069e\3\2\2\2\u00d4"+
		"\u06a2\3\2\2\2\u00d6\u06ab\3\2\2\2\u00d8\u06b6\3\2\2\2\u00da\u06b8\3\2"+
		"\2\2\u00dc\u06bc\3\2\2\2\u00de\u06cb\3\2\2\2\u00e0\u06d6\3\2\2\2\u00e2"+
		"\u06d8\3\2\2\2\u00e4\u06f3\3\2\2\2\u00e6\u06f5\3\2\2\2\u00e8\u0706\3\2"+
		"\2\2\u00ea\u0708\3\2\2\2\u00ec\u070d\3\2\2\2\u00ee\u0717\3\2\2\2\u00f0"+
		"\u071c\3\2\2\2\u00f2\u0721\3\2\2\2\u00f4\u0732\3\2\2\2\u00f6\u0741\3\2"+
		"\2\2\u00f8\u074c\3\2\2\2\u00fa\u0758\3\2\2\2\u00fc\u0764\3\2\2\2\u00fe"+
		"\u077d\3\2\2\2\u0100\u077f\3\2\2\2\u0102\u0792\3\2\2\2\u0104\u07a4\3\2"+
		"\2\2\u0106\u07a8\3\2\2\2\u0108\u07b6\3\2\2\2\u010a\u07c9\3\2\2\2\u010c"+
		"\u07e6\3\2\2\2\u010e\u07e8\3\2\2\2\u0110\u07ec\3\2\2\2\u0112\u07ee\3\2"+
		"\2\2\u0114\u0801\3\2\2\2\u0116\u0805\3\2\2\2\u0118\u0807\3\2\2\2\u011a"+
		"\u0818\3\2\2\2\u011c\u0828\3\2\2\2\u011e\u08c4\3\2\2\2\u0120\u08c6\3\2"+
		"\2\2\u0122\u08c8\3\2\2\2\u0124\u08d2\3\2\2\2\u0126\u09a4\3\2\2\2\u0128"+
		"\u09a6\3\2\2\2\u012a\u09ad\3\2\2\2\u012c\u09b5\3\2\2\2\u012e\u09bf\3\2"+
		"\2\2\u0130\u09c2\3\2\2\2\u0132\u09d4\3\2\2\2\u0134\u09d8\3\2\2\2\u0136"+
		"\u09db\3\2\2\2\u0138\u09e0\3\2\2\2\u013a\u09e4\3\2\2\2\u013c\u09e6\3\2"+
		"\2\2\u013e\u09e8\3\2\2\2\u0140\u09ea\3\2\2\2\u0142\u09ed\3\2\2\2\u0144"+
		"\u0145\5\4\3\2\u0145\u0146\7\2\2\3\u0146\3\3\2\2\2\u0147\u014a\5\6\4\2"+
		"\u0148\u014a\5\16\b\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a\u014c"+
		"\3\2\2\2\u014b\u014d\7n\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014f\3\2\2\2\u014e\u0149\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0150\u0151\3\2\2\2\u0151\5\3\2\2\2\u0152\u0154\5.\30\2\u0153\u0152"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7\23\2\2"+
		"\u0156\u0158\5\4\3\2\u0157\u0159\5\20\t\2\u0158\u0157\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\5\n\6\2\u015b\7\3\2\2\2\u015c"+
		"\u015d\7\23\2\2\u015d\u015f\5\4\3\2\u015e\u0160\5\20\t\2\u015f\u015e\3"+
		"\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\5\n\6\2\u0162"+
		"\u0168\3\2\2\2\u0163\u0165\5\16\b\2\u0164\u0166\7\u013c\2\2\u0165\u0164"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u015c\3\2\2\2\u0167"+
		"\u0163\3\2\2\2\u0168\t\3\2\2\2\u0169\u016a\6\6\2\2\u016a\u016b\7W\2\2"+
		"\u016b\13\3\2\2\2\u016c\u0176\5\6\4\2\u016d\u016f\5\16\b\2\u016e\u016d"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0173\3\2\2\2\u0172\u0174\7n\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174\u0176\3\2\2\2\u0175\u016c\3\2\2\2\u0175\u016e\3\2\2\2\u0176"+
		"\r\3\2\2\2\u0177\u0194\5\32\16\2\u0178\u0194\5$\23\2\u0179\u0194\5&\24"+
		"\2\u017a\u0194\5(\25\2\u017b\u0194\5*\26\2\u017c\u0194\5\u00a0Q\2\u017d"+
		"\u0194\5p9\2\u017e\u0194\5t;\2\u017f\u0194\5\u00a4S\2\u0180\u0194\5> "+
		"\2\u0181\u0194\5x=\2\u0182\u0194\5~@\2\u0183\u0194\5\u0084C\2\u0184\u0194"+
		"\5<\37\2\u0185\u0194\5,\27\2\u0186\u0194\5\u008eH\2\u0187\u0194\5\u009c"+
		"O\2\u0188\u0194\5\u00b2Z\2\u0189\u0194\5\u0090I\2\u018a\u0194\5\u009e"+
		"P\2\u018b\u0194\5\u00acW\2\u018c\u0194\5\u00aeX\2\u018d\u0194\5\u00b8"+
		"]\2\u018e\u0194\5\u00b0Y\2\u018f\u0194\5\u00b4[\2\u0190\u0194\5\26\f\2"+
		"\u0191\u0194\5\30\r\2\u0192\u0194\5\24\13\2\u0193\u0177\3\2\2\2\u0193"+
		"\u0178\3\2\2\2\u0193\u0179\3\2\2\2\u0193\u017a\3\2\2\2\u0193\u017b\3\2"+
		"\2\2\u0193\u017c\3\2\2\2\u0193\u017d\3\2\2\2\u0193\u017e\3\2\2\2\u0193"+
		"\u017f\3\2\2\2\u0193\u0180\3\2\2\2\u0193\u0181\3\2\2\2\u0193\u0182\3\2"+
		"\2\2\u0193\u0183\3\2\2\2\u0193\u0184\3\2\2\2\u0193\u0185\3\2\2\2\u0193"+
		"\u0186\3\2\2\2\u0193\u0187\3\2\2\2\u0193\u0188\3\2\2\2\u0193\u0189\3\2"+
		"\2\2\u0193\u018a\3\2\2\2\u0193\u018b\3\2\2\2\u0193\u018c\3\2\2\2\u0193"+
		"\u018d\3\2\2\2\u0193\u018e\3\2\2\2\u0193\u018f\3\2\2\2\u0193\u0190\3\2"+
		"\2\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194\17\3\2\2\2\u0195\u0197"+
		"\7]\2\2\u0196\u0198\5\22\n\2\u0197\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\21\3\2\2\2\u019b\u019c\7\u0108"+
		"\2\2\u019c\u019d\7\u013e\2\2\u019d\u019e\7\u00f3\2\2\u019e\u019f\5\4\3"+
		"\2\u019f\u01a0\n\2\2\2\u01a0\23\3\2\2\2\u01a1\u01a2\t\3\2\2\u01a2\25\3"+
		"\2\2\2\u01a3\u01a4\7\u00ab\2\2\u01a4\27\3\2\2\2\u01a5\u01a6\6\r\3\2\u01a6"+
		"\u01a7\5\u010a\u0086\2\u01a7\31\3\2\2\2\u01a8\u01aa\7\u00dc\2\2\u01a9"+
		"\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01b0\5\34"+
		"\17\2\u01ac\u01ad\7\u0129\2\2\u01ad\u01af\5\34\17\2\u01ae\u01ac\3\2\2"+
		"\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\33"+
		"\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b7\5\36\20\2\u01b4\u01b7\5 \21\2"+
		"\u01b5\u01b7\5\"\22\2\u01b6\u01b3\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b5"+
		"\3\2\2\2\u01b7\35\3\2\2\2\u01b8\u01ba\5\u0132\u009a\2\u01b9\u01bb\7\u0128"+
		"\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01bd\7\u012d\2\2\u01bd\u01be\5\u010a\u0086\2\u01be\u01c9\3\2\2\2\u01bf"+
		"\u01c0\7\u0137\2\2\u01c0\u01c1\5\u0132\u009a\2\u01c1\u01c3\7\u013a\2\2"+
		"\u01c2\u01c4\7\u0128\2\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c6\7\u012d\2\2\u01c6\u01c7\5\u010a\u0086\2\u01c7"+
		"\u01c9\3\2\2\2\u01c8\u01b8\3\2\2\2\u01c8\u01bf\3\2\2\2\u01c9\37\3\2\2"+
		"\2\u01ca\u01cb\7\u0137\2\2\u01cb\u01d0\5\u0132\u009a\2\u01cc\u01cd\7\u0129"+
		"\2\2\u01cd\u01cf\5\u0132\u009a\2\u01ce\u01cc\3\2\2\2\u01cf\u01d2\3\2\2"+
		"\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d0"+
		"\3\2\2\2\u01d3\u01d5\7\u013a\2\2\u01d4\u01d6\7\u0128\2\2\u01d5\u01d4\3"+
		"\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\7\u012d\2\2"+
		"\u01d8\u01d9\7\u0137\2\2\u01d9\u01de\5\u010a\u0086\2\u01da\u01db\7\u0129"+
		"\2\2\u01db\u01dd\5\u010a\u0086\2\u01dc\u01da\3\2\2\2\u01dd\u01e0\3\2\2"+
		"\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01de"+
		"\3\2\2\2\u01e1\u01e2\7\u013a\2\2\u01e2!\3\2\2\2\u01e3\u01f0\5\u0132\u009a"+
		"\2\u01e4\u01e5\7\u0137\2\2\u01e5\u01ea\5\u0132\u009a\2\u01e6\u01e7\7\u0129"+
		"\2\2\u01e7\u01e9\5\u0132\u009a\2\u01e8\u01e6\3\2\2\2\u01e9\u01ec\3\2\2"+
		"\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea"+
		"\3\2\2\2\u01ed\u01ee\7\u013a\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01e3\3\2\2"+
		"\2\u01ef\u01e4\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01f3\7\u0128\2\2\u01f2"+
		"\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\7\u012d"+
		"\2\2\u01f5\u01f6\7\u0137\2\2\u01f6\u01f7\5\u00b8]\2\u01f7\u01f8\7\u013a"+
		"\2\2\u01f8#\3\2\2\2\u01f9\u01fc\7\17\2\2\u01fa\u01fb\7\u00c8\2\2\u01fb"+
		"\u01fd\7\u00dc\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe"+
		"\3\2\2\2\u01fe\u01ff\t\4\2\2\u01ff\u0200\7\u0137\2\2\u0200\u0205\5\u0132"+
		"\u009a\2\u0201\u0202\7\u0129\2\2\u0202\u0204\5\u0132\u009a\2\u0203\u0201"+
		"\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u0208\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u0209\7\u013a\2\2\u0209\u020a"+
		"\7\u010b\2\2\u020a\u020b\7\u00c0\2\2\u020b\u020c\5\u0132\u009a\2\u020c"+
		"%\3\2\2\2\u020d\u020e\7\33\2\2\u020e\'\3\2\2\2\u020f\u0210\7\36\2\2\u0210"+
		"\u0217\5\u0132\u009a\2\u0211\u0213\7\u0137\2\2\u0212\u0214\5\u012a\u0096"+
		"\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0218"+
		"\7\u013a\2\2\u0216\u0218\5\u012a\u0096\2\u0217\u0211\3\2\2\2\u0217\u0216"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218)\3\2\2\2\u0219\u021a\7&\2\2\u021a\u021b"+
		"\7\u013e\2\2\u021b+\3\2\2\2\u021c\u021d\7B\2\2\u021d\u0222\5\62\32\2\u021e"+
		"\u021f\7\u0129\2\2\u021f\u0221\5\62\32\2\u0220\u021e\3\2\2\2\u0221\u0224"+
		"\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223-\3\2\2\2\u0224"+
		"\u0222\3\2\2\2\u0225\u0226\7B\2\2\u0226\u0227\5\62\32\2\u0227\u022d\7"+
		"\u013c\2\2\u0228\u0229\5\62\32\2\u0229\u022a\7\u013c\2\2\u022a\u022c\3"+
		"\2\2\2\u022b\u0228\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e/\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0231\5\62\32"+
		"\2\u0231\u0237\7\u013c\2\2\u0232\u0233\5\62\32\2\u0233\u0234\7\u013c\2"+
		"\2\u0234\u0236\3\2\2\2\u0235\u0232\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235"+
		"\3\2\2\2\u0237\u0238\3\2\2\2\u0238\61\3\2\2\2\u0239\u0237\3\2\2\2\u023a"+
		"\u023f\5\66\34\2\u023b\u023f\58\35\2\u023c\u023f\5\64\33\2\u023d\u023f"+
		"\5:\36\2\u023e\u023a\3\2\2\2\u023e\u023b\3\2\2\2\u023e\u023c\3\2\2\2\u023e"+
		"\u023d\3\2\2\2\u023f\63\3\2\2\2\u0240\u0245\5\u0132\u009a\2\u0241\u0242"+
		"\7\u0129\2\2\u0242\u0244\5\u0132\u009a\2\u0243\u0241\3\2\2\2\u0244\u0247"+
		"\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0249\3\2\2\2\u0247"+
		"\u0245\3\2\2\2\u0248\u024a\7\r\2\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2"+
		"\2\2\u024a\u024b\3\2\2\2\u024b\u024d\5h\65\2\u024c\u024e\5j\66\2\u024d"+
		"\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0252\3\2\2\2\u024f\u0251\5l"+
		"\67\2\u0250\u024f\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0257\5n"+
		"8\2\u0256\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0264\3\2\2\2\u0258"+
		"\u0259\5\u0132\u009a\2\u0259\u025b\7,\2\2\u025a\u025c\7\r\2\2\u025b\u025a"+
		"\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025f\5h\65\2\u025e"+
		"\u0260\5j\66\2\u025f\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\3\2"+
		"\2\2\u0261\u0262\5n8\2\u0262\u0264\3\2\2\2\u0263\u0240\3\2\2\2\u0263\u0258"+
		"\3\2\2\2\u0264\65\3\2\2\2\u0265\u0266\5\u0132\u009a\2\u0266\u0267\7\60"+
		"\2\2\u0267\67\3\2\2\2\u0268\u0269\t\5\2\2\u0269\u026a\7p\2\2\u026a\u0270"+
		"\7e\2\2\u026b\u0271\7\u00e5\2\2\u026c\u0271\7\u00e6\2\2\u026d\u026e\7"+
		"\u00a9\2\2\u026e\u0271\7h\2\2\u026f\u0271\5\u0132\u009a\2\u0270\u026b"+
		"\3\2\2\2\u0270\u026c\3\2\2\2\u0270\u026d\3\2\2\2\u0270\u026f\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0273\5\b\5\2\u02739\3\2\2\2\u0274\u0276\7m\2\2\u0275"+
		"\u0274\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278\7\u00f0"+
		"\2\2\u0278\u0279\7\u00ee\2\2\u0279\u027b\5\u0132\u009a\2\u027a\u027c\5"+
		"N(\2\u027b\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"\u027e\5@!\2\u027e;\3\2\2\2\u027f\u0280\7\65\2\2\u0280\u0284\7\u00ee\2"+
		"\2\u0281\u0282\7u\2\2\u0282\u0283\7\u00a9\2\2\u0283\u0285\7_\2\2\u0284"+
		"\u0281\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288\5\u00e8"+
		"u\2\u0287\u0289\5N(\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a"+
		"\3\2\2\2\u028a\u028b\5@!\2\u028b=\3\2\2\2\u028c\u0293\7\65\2\2\u028d\u028e"+
		"\7\u0093\2\2\u028e\u0294\7\u00f0\2\2\u028f\u0291\t\6\2\2\u0290\u028f\3"+
		"\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\7\u0107\2\2"+
		"\u0293\u028d\3\2\2\2\u0293\u0290\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296"+
		"\7\u00ee\2\2\u0296\u0298\5\u0132\u009a\2\u0297\u0299\5N(\2\u0298\u0297"+
		"\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\5@!\2\u029b"+
		"?\3\2\2\2\u029c\u029e\7\r\2\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2\2\2"+
		"\u029e\u029f\3\2\2\2\u029f\u02a0\7\u0137\2\2\u02a0\u02a1\5\u00b8]\2\u02a1"+
		"\u02a2\7\u013a\2\2\u02a2\u02ac\3\2\2\2\u02a3\u02a5\7\r\2\2\u02a4\u02a3"+
		"\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02ac\5\u00b8]"+
		"\2\u02a7\u02a8\7\u0137\2\2\u02a8\u02a9\5B\"\2\u02a9\u02aa\7\u013a\2\2"+
		"\u02aa\u02ac\3\2\2\2\u02ab\u029d\3\2\2\2\u02ab\u02a4\3\2\2\2\u02ab\u02a7"+
		"\3\2\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02af\5T+\2\u02ae\u02ad\3\2\2\2\u02ae"+
		"\u02af\3\2\2\2\u02afA\3\2\2\2\u02b0\u02b5\5D#\2\u02b1\u02b2\7\u0129\2"+
		"\2\u02b2\u02b4\5D#\2\u02b3\u02b1\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3"+
		"\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6C\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8"+
		"\u02b9\5F$\2\u02b9\u02bb\5h\65\2\u02ba\u02bc\5j\66\2\u02bb\u02ba\3\2\2"+
		"\2\u02bb\u02bc\3\2\2\2\u02bc\u02c0\3\2\2\2\u02bd\u02bf\5l\67\2\u02be\u02bd"+
		"\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"\u02c6\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c5\5H%\2\u02c4\u02c3\3\2\2"+
		"\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02cf"+
		"\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02ca\7\61\2\2\u02ca\u02cc\5\u0132"+
		"\u009a\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd"+
		"\u02cf\5J&\2\u02ce\u02b8\3\2\2\2\u02ce\u02cb\3\2\2\2\u02cfE\3\2\2\2\u02d0"+
		"\u02d1\5\u0132\u009a\2\u02d1G\3\2\2\2\u02d2\u02f3\5n8\2\u02d3\u02d5\7"+
		"\u00a9\2\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\3\2\2\2"+
		"\u02d6\u02f3\7\u00ab\2\2\u02d7\u02d8\7\u00be\2\2\u02d8\u02f3\7\u008b\2"+
		"\2\u02d9\u02f3\7\u00fc\2\2\u02da\u02db\7\u00c4\2\2\u02db\u02dc\5\u00e8"+
		"u\2\u02dc\u02dd\7\u0137\2\2\u02dd\u02de\5\u0132\u009a\2\u02de\u02e2\7"+
		"\u013a\2\2\u02df\u02e1\5L\'\2\u02e0\u02df\3\2\2\2\u02e1\u02e4\3\2\2\2"+
		"\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02f3\3\2\2\2\u02e4\u02e2"+
		"\3\2\2\2\u02e5\u02e6\7t\2\2\u02e6\u02e7\7\u0137\2\2\u02e7\u02ec\7\u0142"+
		"\2\2\u02e8\u02e9\7\u0129\2\2\u02e9\u02eb\7\u0142\2\2\u02ea\u02e8\3\2\2"+
		"\2\u02eb\u02ee\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef"+
		"\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ef\u02f3\7\u013a\2\2\u02f0\u02f3\7\21"+
		"\2\2\u02f1\u02f3\7V\2\2\u02f2\u02d2\3\2\2\2\u02f2\u02d4\3\2\2\2\u02f2"+
		"\u02d7\3\2\2\2\u02f2\u02d9\3\2\2\2\u02f2\u02da\3\2\2\2\u02f2\u02e5\3\2"+
		"\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f1\3\2\2\2\u02f3I\3\2\2\2\u02f4\u02f5"+
		"\7\u00be\2\2\u02f5\u02f7\7\u008b\2\2\u02f6\u02f8\7\'\2\2\u02f7\u02f6\3"+
		"\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\7\u0137\2\2"+
		"\u02fa\u02fc\5\u0132\u009a\2\u02fb\u02fd\t\7\2\2\u02fc\u02fb\3\2\2\2\u02fc"+
		"\u02fd\3\2\2\2\u02fd\u0305\3\2\2\2\u02fe\u02ff\7\u0129\2\2\u02ff\u0301"+
		"\5\u0132\u009a\2\u0300\u0302\t\7\2\2\u0301\u0300\3\2\2\2\u0301\u0302\3"+
		"\2\2\2\u0302\u0304\3\2\2\2\u0303\u02fe\3\2\2\2\u0304\u0307\3\2\2\2\u0305"+
		"\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\3\2\2\2\u0307\u0305\3\2"+
		"\2\2\u0308\u030a\7\u013a\2\2\u0309\u030b\7V\2\2\u030a\u0309\3\2\2\2\u030a"+
		"\u030b\3\2\2\2\u030b\u030d\3\2\2\2\u030c\u030e\5\u00a8U\2\u030d\u030c"+
		"\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u032e\3\2\2\2\u030f\u0310\7f\2\2\u0310"+
		"\u0311\7\u008b\2\2\u0311\u0312\7\u0137\2\2\u0312\u0317\5\u0132\u009a\2"+
		"\u0313\u0314\7\u0129\2\2\u0314\u0316\5\u0132\u009a\2\u0315\u0313\3\2\2"+
		"\2\u0316\u0319\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031a"+
		"\3\2\2\2\u0319\u0317\3\2\2\2\u031a\u031b\7\u013a\2\2\u031b\u031c\7\u00c4"+
		"\2\2\u031c\u031d\5\u00e8u\2\u031d\u031e\7\u0137\2\2\u031e\u0323\5\u0132"+
		"\u009a\2\u031f\u0320\7\u0129\2\2\u0320\u0322\5\u0132\u009a\2\u0321\u031f"+
		"\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324"+
		"\u0326\3\2\2\2\u0325\u0323\3\2\2\2\u0326\u032a\7\u013a\2\2\u0327\u0329"+
		"\5L\'\2\u0328\u0327\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032a"+
		"\u032b\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u02f4\3\2"+
		"\2\2\u032d\u030f\3\2\2\2\u032eK\3\2\2\2\u032f\u0330\7\u00ae\2\2\u0330"+
		"\u0339\t\b\2\2\u0331\u0332\7\u00a6\2\2\u0332\u033a\7\t\2\2\u0333\u033a"+
		"\7\u00c7\2\2\u0334\u0335\7\u00dc\2\2\u0335\u033a\7\u00ab\2\2\u0336\u0337"+
		"\7\u00dc\2\2\u0337\u033a\7C\2\2\u0338\u033a\7\37\2\2\u0339\u0331\3\2\2"+
		"\2\u0339\u0333\3\2\2\2\u0339\u0334\3\2\2\2\u0339\u0336\3\2\2\2\u0339\u0338"+
		"\3\2\2\2\u033aM\3\2\2\2\u033b\u033d\5P)\2\u033c\u033b\3\2\2\2\u033d\u033e"+
		"\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033fO\3\2\2\2\u0340"+
		"\u0341\7\u0129\2\2\u0341\u0344\5R*\2\u0342\u0344\5^\60\2\u0343\u0340\3"+
		"\2\2\2\u0343\u0342\3\2\2\2\u0344Q\3\2\2\2\u0345\u0347\7\u00a6\2\2\u0346"+
		"\u0345\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\t\t"+
		"\2\2\u0349S\3\2\2\2\u034a\u034c\5V,\2\u034b\u034a\3\2\2\2\u034c\u034d"+
		"\3\2\2\2\u034d\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034eU\3\2\2\2\u034f"+
		"\u0350\7\u00ae\2\2\u0350\u0351\7-\2\2\u0351\u0352\t\n\2\2\u0352\u035a"+
		"\7\u00d0\2\2\u0353\u035a\5X-\2\u0354\u035a\5Z.\2\u0355\u035a\5\\/\2\u0356"+
		"\u035a\5^\60\2\u0357\u035a\5d\63\2\u0358\u035a\5f\64\2\u0359\u034f\3\2"+
		"\2\2\u0359\u0353\3\2\2\2\u0359\u0354\3\2\2\2\u0359\u0355\3\2\2\2\u0359"+
		"\u0356\3\2\2\2\u0359\u0357\3\2\2\2\u0359\u0358\3\2\2\2\u035aW\3\2\2\2"+
		"\u035b\u035c\7\u00d9\2\2\u035c\u035d\7\66\2\2\u035d\u036e\t\13\2\2\u035e"+
		"\u035f\t\f\2\2\u035f\u036e\7\u0142\2\2\u0360\u036e\7\u00a7\2\2\u0361\u036e"+
		"\t\r\2\2\u0362\u0363\7\u00e8\2\2\u0363\u0366\7\u0137\2\2\u0364\u0367\5"+
		"\u0132\u009a\2\u0365\u0367\7\u0142\2\2\u0366\u0364\3\2\2\2\u0366\u0365"+
		"\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369"+
		"\u036a\3\2\2\2\u036a\u036e\7\u013a\2\2\u036b\u036c\7\u00ef\2\2\u036c\u036e"+
		"\5\u0132\u009a\2\u036d\u035b\3\2\2\2\u036d\u035e\3\2\2\2\u036d\u0360\3"+
		"\2\2\2\u036d\u0361\3\2\2\2\u036d\u0362\3\2\2\2\u036d\u036b\3\2\2\2\u036e"+
		"Y\3\2\2\2\u036f\u0371\7x\2\2\u0370\u036f\3\2\2\2\u0370\u0371\3\2\2\2\u0371"+
		"\u0372\3\2\2\2\u0372\u0373\7w\2\2\u0373\u0391\5\u0132\u009a\2\u0374\u0375"+
		"\7\u010b\2\2\u0375\u0391\7\u00c6\2\2\u0376\u0377\7N\2\2\u0377\u0378\7"+
		"\34\2\2\u0378\u0379\7q\2\2\u0379\u037a\7\u0137\2\2\u037a\u037f\5\u0132"+
		"\u009a\2\u037b\u037c\7\u0129\2\2\u037c\u037e\5\u0132\u009a\2\u037d\u037b"+
		"\3\2\2\2\u037e\u0381\3\2\2\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380"+
		"\u0382\3\2\2\2\u0381\u037f\3\2\2\2\u0382\u0383\7\u013a\2\2\u0383\u0391"+
		"\3\2\2\2\u0384\u0386\7\u00a9\2\2\u0385\u0384\3\2\2\2\u0385\u0386\3\2\2"+
		"\2\u0386\u0387\3\2\2\2\u0387\u0391\7\u0099\2\2\u0388\u0389\7.\2\2\u0389"+
		"\u0391\t\16\2\2\u038a\u038b\7G\2\2\u038b\u0391\7\u00af\2\2\u038c\u038d"+
		"\7\u010b\2\2\u038d\u038e\7\u00c7\2\2\u038e\u038f\7\u00ae\2\2\u038f\u0391"+
		"\7Q\2\2\u0390\u0370\3\2\2\2\u0390\u0374\3\2\2\2\u0390\u0376\3\2\2\2\u0390"+
		"\u0385\3\2\2\2\u0390\u0388\3\2\2\2\u0390\u038a\3\2\2\2\u0390\u038c\3\2"+
		"\2\2\u0391[\3\2\2\2\u0392\u0394\7\u00fc\2\2\u0393\u0392\3\2\2\2\u0393"+
		"\u0394\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0396\7\u00be\2\2\u0396\u0397"+
		"\7x\2\2\u0397\u0398\7\u0137\2\2\u0398\u039d\5\u0132\u009a\2\u0399\u039a"+
		"\7\u0129\2\2\u039a\u039c\5\u0132\u009a\2\u039b\u0399\3\2\2\2\u039c\u039f"+
		"\3\2\2\2\u039d\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a0\3\2\2\2\u039f"+
		"\u039d\3\2\2\2\u03a0\u03a1\7\u013a\2\2\u03a1\u03a5\3\2\2\2\u03a2\u03a3"+
		"\7\u010b\2\2\u03a3\u03a5\7;\2\2\u03a4\u0393\3\2\2\2\u03a4\u03a2\3\2\2"+
		"\2\u03a5]\3\2\2\2\u03a6\u03ab\5`\61\2\u03a7\u03a8\7\u00e9\2\2\u03a8\u03a9"+
		"\7\r\2\2\u03a9\u03ab\5\u0132\u009a\2\u03aa\u03a6\3\2\2\2\u03aa\u03a7\3"+
		"\2\2\2\u03ab_\3\2\2\2\u03ac\u03ad\7\u00cf\2\2\u03ad\u03ae\7g\2\2\u03ae"+
		"\u03b2\7I\2\2\u03af\u03b1\5b\62\2\u03b0\u03af\3\2\2\2\u03b1\u03b4\3\2"+
		"\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3a\3\2\2\2\u03b4\u03b2"+
		"\3\2\2\2\u03b5\u03b6\7c\2\2\u03b6\u03b7\7\u00f1\2\2\u03b7\u03b8\7\34\2"+
		"\2\u03b8\u03bc\5\u010a\u0086\2\u03b9\u03ba\7Y\2\2\u03ba\u03bb\7\34\2\2"+
		"\u03bb\u03bd\5\u010a\u0086\2\u03bc\u03b9\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd"+
		"\u03d1\3\2\2\2\u03be\u03bf\7*\2\2\u03bf\u03c0\7\u0088\2\2\u03c0\u03c1"+
		"\7\u00f1\2\2\u03c1\u03c2\7\34\2\2\u03c2\u03d1\5\u010a\u0086\2\u03c3\u03c4"+
		"\7\u009c\2\2\u03c4\u03c5\7\u008c\2\2\u03c5\u03c6\7\u00f1\2\2\u03c6\u03c7"+
		"\7\34\2\2\u03c7\u03d1\5\u010a\u0086\2\u03c8\u03c9\7\u0092\2\2\u03c9\u03ca"+
		"\7\u00f1\2\2\u03ca\u03cb\7\34\2\2\u03cb\u03d1\5\u010a\u0086\2\u03cc\u03cd"+
		"\7\u00ab\2\2\u03cd\u03ce\7E\2\2\u03ce\u03cf\7\r\2\2\u03cf\u03d1\5\u010a"+
		"\u0086\2\u03d0\u03b5\3\2\2\2\u03d0\u03be\3\2\2\2\u03d0\u03c3\3\2\2\2\u03d0"+
		"\u03c8\3\2\2\2\u03d0\u03cc\3\2\2\2\u03d1c\3\2\2\2\u03d2\u03d3\7\u00ae"+
		"\2\2\u03d3\u03d7\5\u0132\u009a\2\u03d4\u03d5\7\u00f2\2\2\u03d5\u03d7\5"+
		"\u0132\u009a\2\u03d6\u03d2\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d7e\3\2\2\2"+
		"\u03d8\u03da\7\21\2\2\u03d9\u03db\7\u012d\2\2\u03da\u03d9\3\2\2\2\u03da"+
		"\u03db\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03f4\5\u010a\u0086\2\u03dd\u03df"+
		"\7+\2\2\u03de\u03e0\7\u012d\2\2\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2"+
		"\2\u03e0\u03e1\3\2\2\2\u03e1\u03f4\5\u010a\u0086\2\u03e2\u03e4\7C\2\2"+
		"\u03e3\u03e2\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e8\3\2\2\2\u03e5\u03e6"+
		"\7$\2\2\u03e6\u03e9\7\u00dc\2\2\u03e7\u03e9\7%\2\2\u03e8\u03e5\3\2\2\2"+
		"\u03e8\u03e7\3\2\2\2\u03e9\u03eb\3\2\2\2\u03ea\u03ec\7\u012d\2\2\u03eb"+
		"\u03ea\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03f4\5\u010a"+
		"\u0086\2\u03ee\u03f0\7X\2\2\u03ef\u03f1\7\u012d\2\2\u03f0\u03ef\3\2\2"+
		"\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f4\5\u010a\u0086\2"+
		"\u03f3\u03d8\3\2\2\2\u03f3\u03dd\3\2\2\2\u03f3\u03e3\3\2\2\2\u03f3\u03ee"+
		"\3\2\2\2\u03f4g\3\2\2\2\u03f5\u0423\7#\2\2\u03f6\u0423\7\25\2\2\u03f7"+
		"\u0423\7\26\2\2\u03f8\u0423\7\27\2\2\u03f9\u0423\7\30\2\2\u03fa\u0423"+
		"\7\31\2\2\u03fb\u0423\7<\2\2\u03fc\u0423\7=\2\2\u03fd\u0423\7@\2\2\u03fe"+
		"\u0423\7A\2\2\u03ff\u0401\7P\2\2\u0400\u0402\7\u00bc\2\2\u0401\u0400\3"+
		"\2\2\2\u0401\u0402\3\2\2\2\u0402\u0423\3\2\2\2\u0403\u0423\7d\2\2\u0404"+
		"\u0423\7}\2\2\u0405\u0423\7~\2\2\u0406\u0423\7\177\2\2\u0407\u0423\7\u0080"+
		"\2\2\u0408\u0423\7\u0081\2\2\u0409\u0423\7\u00a4\2\2\u040a\u0423\7\u00a5"+
		"\2\2\u040b\u0423\7\u00ad\2\2\u040c\u0423\7\u00ac\2\2\u040d\u0423\7\u00bb"+
		"\2\2\u040e\u0423\7\u00c3\2\2\u040f\u0410\7\u00c9\2\2\u0410\u0423\7\u0106"+
		"\2\2\u0411\u0423\7\u00e0\2\2\u0412\u0423\7\u00df\2\2\u0413\u0423\7\u00e1"+
		"\2\2\u0414\u0423\7\u00e3\2\2\u0415\u0423\7\u00e2\2\2\u0416\u0423\7\u00ea"+
		"\2\2\u0417\u0423\7\u00ed\2\2\u0418\u0423\7\u00f4\2\2\u0419\u0423\7\u00f5"+
		"\2\2\u041a\u0423\7\u0104\2\2\u041b\u0423\7\u0105\2\2\u041c\u0423\7\u010d"+
		"\2\2\u041d\u0420\5\u0132\u009a\2\u041e\u041f\7\5\2\2\u041f\u0421\7\u00fa"+
		"\2\2\u0420\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0423\3\2\2\2\u0422"+
		"\u03f5\3\2\2\2\u0422\u03f6\3\2\2\2\u0422\u03f7\3\2\2\2\u0422\u03f8\3\2"+
		"\2\2\u0422\u03f9\3\2\2\2\u0422\u03fa\3\2\2\2\u0422\u03fb\3\2\2\2\u0422"+
		"\u03fc\3\2\2\2\u0422\u03fd\3\2\2\2\u0422\u03fe\3\2\2\2\u0422\u03ff\3\2"+
		"\2\2\u0422\u0403\3\2\2\2\u0422\u0404\3\2\2\2\u0422\u0405\3\2\2\2\u0422"+
		"\u0406\3\2\2\2\u0422\u0407\3\2\2\2\u0422\u0408\3\2\2\2\u0422\u0409\3\2"+
		"\2\2\u0422\u040a\3\2\2\2\u0422\u040b\3\2\2\2\u0422\u040c\3\2\2\2\u0422"+
		"\u040d\3\2\2\2\u0422\u040e\3\2\2\2\u0422\u040f\3\2\2\2\u0422\u0411\3\2"+
		"\2\2\u0422\u0412\3\2\2\2\u0422\u0413\3\2\2\2\u0422\u0414\3\2\2\2\u0422"+
		"\u0415\3\2\2\2\u0422\u0416\3\2\2\2\u0422\u0417\3\2\2\2\u0422\u0418\3\2"+
		"\2\2\u0422\u0419\3\2\2\2\u0422\u041a\3\2\2\2\u0422\u041b\3\2\2\2\u0422"+
		"\u041c\3\2\2\2\u0422\u041d\3\2\2\2\u0423i\3\2\2\2\u0424\u0425\7\u0137"+
		"\2\2\u0425\u0427\t\17\2\2\u0426\u0428\t\20\2\2\u0427\u0426\3\2\2\2\u0427"+
		"\u0428\3\2\2\2\u0428\u042b\3\2\2\2\u0429\u042a\7\u0129\2\2\u042a\u042c"+
		"\7\u0142\2\2\u042b\u0429\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d\3\2\2"+
		"\2\u042d\u042e\7\u013a\2\2\u042ek\3\2\2\2\u042f\u0431\7\u00a9\2\2\u0430"+
		"\u042f\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u043b\7\u00ab"+
		"\2\2\u0433\u0434\7$\2\2\u0434\u0435\7\u00dc\2\2\u0435\u043b\5\u0132\u009a"+
		"\2\u0436\u0438\7\u00a9\2\2\u0437\u0436\3\2\2\2\u0437\u0438\3\2\2\2\u0438"+
		"\u0439\3\2\2\2\u0439\u043b\t\21\2\2\u043a\u0430\3\2\2\2\u043a\u0433\3"+
		"\2\2\2\u043a\u0437\3\2\2\2\u043bm\3\2\2\2\u043c\u043e\7\u0128\2\2\u043d"+
		"\u043c\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440\7\u012d"+
		"\2\2\u0440\u0449\5\u010a\u0086\2\u0441\u0443\7\u010b\2\2\u0442\u0441\3"+
		"\2\2\2\u0442\u0443\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0446\7C\2\2\u0445"+
		"\u0447\5\u010a\u0086\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0449"+
		"\3\2\2\2\u0448\u043d\3\2\2\2\u0448\u0442\3\2\2\2\u0449o\3\2\2\2\u044a"+
		"\u044b\7\65\2\2\u044b\u044f\t\22\2\2\u044c\u044d\7u\2\2\u044d\u044e\7"+
		"\u00a9\2\2\u044e\u0450\7_\2\2\u044f\u044c\3\2\2\2\u044f\u0450\3\2\2\2"+
		"\u0450\u0451\3\2\2\2\u0451\u0455\5\u010a\u0086\2\u0452\u0454\5r:\2\u0453"+
		"\u0452\3\2\2\2\u0454\u0457\3\2\2\2\u0455\u0453\3\2\2\2\u0455\u0456\3\2"+
		"\2\2\u0456q\3\2\2\2\u0457\u0455\3\2\2\2\u0458\u0459\7+\2\2\u0459\u045d"+
		"\5\u010a\u0086\2\u045a\u045b\7\u0094\2\2\u045b\u045d\5\u010a\u0086\2\u045c"+
		"\u0458\3\2\2\2\u045c\u045a\3\2\2\2\u045ds\3\2\2\2\u045e\u0466\7\13\2\2"+
		"\u045f\u0462\7\65\2\2\u0460\u0461\7\u00b1\2\2\u0461\u0463\7\u00c6\2\2"+
		"\u0462\u0460\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0466\3\2\2\2\u0464\u0466"+
		"\7\u00c6\2\2\u0465\u045e\3\2\2\2\u0465\u045f\3\2\2\2\u0465\u0464\3\2\2"+
		"\2\u0465\u0466\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0468\7k\2\2\u0468\u046a"+
		"\5\u0132\u009a\2\u0469\u046b\5\u0086D\2\u046a\u0469\3\2\2\2\u046a\u046b"+
		"\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046e\5v<\2\u046d\u046f\t\23\2\2\u046e"+
		"\u046d\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0471\3\2\2\2\u0470\u0472\5\60"+
		"\31\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\3\2\2\2\u0473"+
		"\u0474\5\b\5\2\u0474u\3\2\2\2\u0475\u0476\t\24\2\2\u0476\u0478\5h\65\2"+
		"\u0477\u0479\5j\66\2\u0478\u0477\3\2\2\2\u0478\u0479\3\2\2\2\u0479w\3"+
		"\2\2\2\u047a\u0482\7\13\2\2\u047b\u047e\7\65\2\2\u047c\u047d\7\u00b1\2"+
		"\2\u047d\u047f\7\u00c6\2\2\u047e\u047c\3\2\2\2\u047e\u047f\3\2\2\2\u047f"+
		"\u0482\3\2\2\2\u0480\u0482\7\u00c6\2\2\u0481\u047a\3\2\2\2\u0481\u047b"+
		"\3\2\2\2\u0481\u0480\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0483\3\2\2\2\u0483"+
		"\u0484\7\u00b7\2\2\u0484\u0485\5\u0132\u009a\2\u0485\u0486\t\23\2\2\u0486"+
		"\u0487\5z>\2\u0487\u048b\7W\2\2\u0488\u0489\5\u0132\u009a\2\u0489\u048a"+
		"\7\u013c\2\2\u048a\u048c\3\2\2\2\u048b\u0488\3\2\2\2\u048b\u048c\3\2\2"+
		"\2\u048cy\3\2\2\2\u048d\u048e\5|?\2\u048e\u0494\7\u013c\2\2\u048f\u0490"+
		"\5|?\2\u0490\u0491\7\u013c\2\2\u0491\u0493\3\2\2\2\u0492\u048f\3\2\2\2"+
		"\u0493\u0496\3\2\2\2\u0494\u0492\3\2\2\2\u0494\u0495\3\2\2\2\u0495{\3"+
		"\2\2\2\u0496\u0494\3\2\2\2\u0497\u04a5\5\62\32\2\u0498\u0499\7k\2\2\u0499"+
		"\u049b\5\u0132\u009a\2\u049a\u049c\5\u0086D\2\u049b\u049a\3\2\2\2\u049b"+
		"\u049c\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\5v<\2\u049e\u04a5\3\2\2"+
		"\2\u049f\u04a0\t\25\2\2\u04a0\u04a2\5\u0132\u009a\2\u04a1\u04a3\5\u0086"+
		"D\2\u04a2\u04a1\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a5\3\2\2\2\u04a4"+
		"\u0497\3\2\2\2\u04a4\u0498\3\2\2\2\u04a4\u049f\3\2\2\2\u04a5}\3\2\2\2"+
		"\u04a6\u04ae\7\13\2\2\u04a7\u04aa\7\65\2\2\u04a8\u04a9\7\u00b1\2\2\u04a9"+
		"\u04ab\7\u00c6\2\2\u04aa\u04a8\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ae"+
		"\3\2\2\2\u04ac\u04ae\7\u00c6\2\2\u04ad\u04a6\3\2\2\2\u04ad\u04a7\3\2\2"+
		"\2\u04ad\u04ac\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0"+
		"\7\u00b7\2\2\u04b0\u04b1\7\32\2\2\u04b1\u04b2\5\u0132\u009a\2\u04b2\u04b3"+
		"\t\23\2\2\u04b3\u04b4\5\u0080A\2\u04b4\u04b8\7W\2\2\u04b5\u04b6\5\u0132"+
		"\u009a\2\u04b6\u04b7\7\u013c\2\2\u04b7\u04b9\3\2\2\2\u04b8\u04b5\3\2\2"+
		"\2\u04b8\u04b9\3\2\2\2\u04b9\177\3\2\2\2\u04ba\u04bb\5\u0082B\2\u04bb"+
		"\u04c1\7\u013c\2\2\u04bc\u04bd\5\u0082B\2\u04bd\u04be\7\u013c\2\2\u04be"+
		"\u04c0\3\2\2\2\u04bf\u04bc\3\2\2\2\u04c0\u04c3\3\2\2\2\u04c1\u04bf\3\2"+
		"\2\2\u04c1\u04c2\3\2\2\2\u04c2\u0081\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c4"+
		"\u04c8\5\62\32\2\u04c5\u04c8\5t;\2\u04c6\u04c8\5\u0084C\2\u04c7\u04c4"+
		"\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c7\u04c6\3\2\2\2\u04c8\u0083\3\2\2\2\u04c9"+
		"\u04d1\7\13\2\2\u04ca\u04cd\7\65\2\2\u04cb\u04cc\7\u00b1\2\2\u04cc\u04ce"+
		"\7\u00c6\2\2\u04cd\u04cb\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04d1\3\2\2"+
		"\2\u04cf\u04d1\7\u00c6\2\2\u04d0\u04c9\3\2\2\2\u04d0\u04ca\3\2\2\2\u04d0"+
		"\u04cf\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d3\t\25"+
		"\2\2\u04d3\u04d5\5\u0132\u009a\2\u04d4\u04d6\5\u0086D\2\u04d5\u04d4\3"+
		"\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d8\3\2\2\2\u04d7\u04d9\5\u008aF\2"+
		"\u04d8\u04d7\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04db\3\2\2\2\u04da\u04dc"+
		"\t\23\2\2\u04db\u04da\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04de\3\2\2\2"+
		"\u04dd\u04df\5\60\31\2\u04de\u04dd\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e1"+
		"\3\2\2\2\u04e0\u04e2\5\u00b4[\2\u04e1\u04e0\3\2\2\2\u04e1\u04e2\3\2\2"+
		"\2\u04e2\u04e3\3\2\2\2\u04e3\u04e7\5\f\7\2\u04e4\u04e5\5\u0132\u009a\2"+
		"\u04e5\u04e6\7\u013c\2\2\u04e6\u04e8\3\2\2\2\u04e7\u04e4\3\2\2\2\u04e7"+
		"\u04e8\3\2\2\2\u04e8\u0085\3\2\2\2\u04e9\u04ea\7\u0137\2\2\u04ea\u0500"+
		"\7\u013a\2\2\u04eb\u04ec\7\u0137\2\2\u04ec\u04f1\5\u0088E\2\u04ed\u04ee"+
		"\7\u0129\2\2\u04ee\u04f0\5\u0088E\2\u04ef\u04ed\3\2\2\2\u04f0\u04f3\3"+
		"\2\2\2\u04f1\u04ef\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f4\3\2\2\2\u04f3"+
		"\u04f1\3\2\2\2\u04f4\u04f5\7\u013a\2\2\u04f5\u0500\3\2\2\2\u04f6\u04f7"+
		"\6D\4\2\u04f7\u04fc\5\u0088E\2\u04f8\u04f9\7\u0129\2\2\u04f9\u04fb\5\u0088"+
		"E\2\u04fa\u04f8\3\2\2\2\u04fb\u04fe\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fc"+
		"\u04fd\3\2\2\2\u04fd\u0500\3\2\2\2\u04fe\u04fc\3\2\2\2\u04ff\u04e9\3\2"+
		"\2\2\u04ff\u04eb\3\2\2\2\u04ff\u04f6\3\2\2\2\u0500\u0087\3\2\2\2\u0501"+
		"\u0507\7w\2\2\u0502\u0507\7\u00b3\2\2\u0503\u0507\7{\2\2\u0504\u0505\7"+
		"w\2\2\u0505\u0507\7\u00b3\2\2\u0506\u0501\3\2\2\2\u0506\u0502\3\2\2\2"+
		"\u0506\u0503\3\2\2\2\u0506\u0504\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0508"+
		"\3\2\2\2\u0508\u0509\5\u0132\u009a\2\u0509\u050b\5h\65\2\u050a\u050c\5"+
		"j\66\2\u050b\u050a\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u0510\3\2\2\2\u050d"+
		"\u050f\5l\67\2\u050e\u050d\3\2\2\2\u050f\u0512\3\2\2\2\u0510\u050e\3\2"+
		"\2\2\u0510\u0511\3\2\2\2\u0511\u0514\3\2\2\2\u0512\u0510\3\2\2\2\u0513"+
		"\u0515\5n8\2\u0514\u0513\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u052c\3\2\2"+
		"\2\u0516\u051c\5\u0132\u009a\2\u0517\u051d\7w\2\2\u0518\u051d\7\u00b3"+
		"\2\2\u0519\u051d\7{\2\2\u051a\u051b\7w\2\2\u051b\u051d\7\u00b3\2\2\u051c"+
		"\u0517\3\2\2\2\u051c\u0518\3\2\2\2\u051c\u0519\3\2\2\2\u051c\u051a\3\2"+
		"\2\2\u051c\u051d\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u0520\5h\65\2\u051f"+
		"\u0521\5j\66\2\u0520\u051f\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0525\3\2"+
		"\2\2\u0522\u0524\5l\67\2\u0523\u0522\3\2\2\2\u0524\u0527\3\2\2\2\u0525"+
		"\u0523\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0529\3\2\2\2\u0527\u0525\3\2"+
		"\2\2\u0528\u052a\5n8\2\u0529\u0528\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052c"+
		"\3\2\2\2\u052b\u0506\3\2\2\2\u052b\u0516\3\2\2\2\u052c\u0089\3\2\2\2\u052d"+
		"\u052f\5\u008cG\2\u052e\u052d\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u052e"+
		"\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u008b\3\2\2\2\u0532\u0533\7\u008d\2"+
		"\2\u0533\u053e\7\u00e4\2\2\u0534\u0535\7\u00e4\2\2\u0535\u0536\7\u00d8"+
		"\2\2\u0536\u053e\t\26\2\2\u0537\u0539\7R\2\2\u0538\u0537\3\2\2\2\u0538"+
		"\u0539\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053b\7\u00c8\2\2\u053b\u053c"+
		"\7\u00dd\2\2\u053c\u053e\7\u0142\2\2\u053d\u0532\3\2\2\2\u053d\u0534\3"+
		"\2\2\2\u053d\u0538\3\2\2\2\u053e\u008d\3\2\2\2\u053f\u0541\t\27\2\2\u0540"+
		"\u0542\7v\2\2\u0541\u0540\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0543\3\2"+
		"\2\2\u0543\u0549\5\u010a\u0086\2\u0544\u0545\7\u0137\2\2\u0545\u0546\5"+
		"\u012a\u0096\2\u0546\u0547\7\u013a\2\2\u0547\u054a\3\2\2\2\u0548\u054a"+
		"\5\u012a\u0096\2\u0549\u0544\3\2\2\2\u0549\u0548\3\2\2\2\u0549\u054a\3"+
		"\2\2\2\u054a\u0554\3\2\2\2\u054b\u054c\7\u0084\2\2\u054c\u0551\7\u013e"+
		"\2\2\u054d\u054e\7\u0129\2\2\u054e\u0550\7\u013e\2\2\u054f\u054d\3\2\2"+
		"\2\u0550\u0553\3\2\2\2\u0551\u054f\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0555"+
		"\3\2\2\2\u0553\u0551\3\2\2\2\u0554\u054b\3\2\2\2\u0554\u0555\3\2\2\2\u0555"+
		"\u0557\3\2\2\2\u0556\u0558\5\u00b6\\\2\u0557\u0556\3\2\2\2\u0557\u0558"+
		"\3\2\2\2\u0558\u008f\3\2\2\2\u0559\u055d\5\u0092J\2\u055a\u055d\5\u0094"+
		"K\2\u055b\u055d\5\u0096L\2\u055c\u0559\3\2\2\2\u055c\u055a\3\2\2\2\u055c"+
		"\u055b\3\2\2\2\u055d\u0091\3\2\2\2\u055e\u0561\7u\2\2\u055f\u0562\5\u00f8"+
		"}\2\u0560\u0562\5\u00fa~\2\u0561\u055f\3\2\2\2\u0561\u0560\3\2\2\2\u0562"+
		"\u0563\3\2\2\2\u0563\u0564\7\u00f3\2\2\u0564\u0568\5\4\3\2\u0565\u0567"+
		"\5\u0098M\2\u0566\u0565\3\2\2\2\u0567\u056a\3\2\2\2\u0568\u0566\3\2\2"+
		"\2\u0568\u0569\3\2\2\2\u0569\u056c\3\2\2\2\u056a\u0568\3\2\2\2\u056b\u056d"+
		"\5\u009aN\2\u056c\u056b\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u056e\3\2\2"+
		"\2\u056e\u056f\7W\2\2\u056f\u0570\7u\2\2\u0570\u0093\3\2\2\2\u0571\u0574"+
		"\7u\2\2\u0572\u0575\5\u00f8}\2\u0573\u0575\5\u00fa~\2\u0574\u0572\3\2"+
		"\2\2\u0574\u0573\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0579\5\b\5\2\u0577"+
		"\u0578\7S\2\2\u0578\u057a\5\b\5\2\u0579\u0577\3\2\2\2\u0579\u057a\3\2"+
		"\2\2\u057a\u0095\3\2\2\2\u057b\u057c\7\6\2\2\u057c\u057f\7u\2\2\u057d"+
		"\u0580\5\u00f8}\2\u057e\u0580\5\u00fa~\2\u057f\u057d\3\2\2\2\u057f\u057e"+
		"\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0582\7\u00f3\2\2\u0582\u0583\5\b\5"+
		"\2\u0583\u0097\3\2\2\2\u0584\u0587\t\30\2\2\u0585\u0588\5\u00f8}\2\u0586"+
		"\u0588\5\u00fa~\2\u0587\u0585\3\2\2\2\u0587\u0586\3\2\2\2\u0588\u0589"+
		"\3\2\2\2\u0589\u058a\7\u00f3\2\2\u058a\u058b\5\4\3\2\u058b\u0099\3\2\2"+
		"\2\u058c\u058d\7S\2\2\u058d\u058e\5\4\3\2\u058e\u009b\3\2\2\2\u058f\u0591"+
		"\7`\2\2\u0590\u0592\7\u013e\2\2\u0591\u0590\3\2\2\2\u0591\u0592\3\2\2"+
		"\2\u0592\u0598\3\2\2\2\u0593\u0596\7\u0108\2\2\u0594\u0597\5\u00f8}\2"+
		"\u0595\u0597\5\u00fa~\2\u0596\u0594\3\2\2\2\u0596\u0595\3\2\2\2\u0597"+
		"\u0599\3\2\2\2\u0598\u0593\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u009d\3\2"+
		"\2\2\u059a\u059c\7\u008e\2\2\u059b\u059d\7\u013e\2\2\u059c\u059b\3\2\2"+
		"\2\u059c\u059d\3\2\2\2\u059d\u009f\3\2\2\2\u059e\u059f\7(\2\2\u059f\u05a0"+
		"\t\31\2\2\u05a0\u05a1\5\u00a2R\2\u05a1\u05a2\7\u0129\2\2\u05a2\u05a3\5"+
		"\u00a2R\2\u05a3\u00a1\3\2\2\2\u05a4\u05a6\5\u00e8u\2\u05a5\u05a7\5\u00ea"+
		"v\2\u05a6\u05a5\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05ad\3\2\2\2\u05a8"+
		"\u05a9\7\u0137\2\2\u05a9\u05aa\5\u00b8]\2\u05aa\u05ab\7\u013a\2\2\u05ab"+
		"\u05ad\3\2\2\2\u05ac\u05a4\3\2\2\2\u05ac\u05a8\3\2\2\2\u05ad\u05b0\3\2"+
		"\2\2\u05ae\u05af\7\20\2\2\u05af\u05b1\5\u0132\u009a\2\u05b0\u05ae\3\2"+
		"\2\2\u05b0\u05b1\3\2\2\2\u05b1\u00a3\3\2\2\2\u05b2\u05b4\7\65\2\2\u05b3"+
		"\u05b5\7\u00fc\2\2\u05b4\u05b3\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b6"+
		"\3\2\2\2\u05b6\u05b7\7x\2\2\u05b7\u05b8\5\u0132\u009a\2\u05b8\u05b9\7"+
		"\u00ae\2\2\u05b9\u05ba\5\u00e8u\2\u05ba\u05bb\7\u0137\2\2\u05bb\u05c0"+
		"\5\u00a6T\2\u05bc\u05bd\7\u0129\2\2\u05bd\u05bf\5\u00a6T\2\u05be\u05bc"+
		"\3\2\2\2\u05bf\u05c2\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1"+
		"\u05c3\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c3\u05c4\7\u013a\2\2\u05c4\u00a5"+
		"\3\2\2\2\u05c5\u05c7\5\u0132\u009a\2\u05c6\u05c8\t\7\2\2\u05c7\u05c6\3"+
		"\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u00a7\3\2\2\2\u05c9\u05ca\5\u00aaV\2"+
		"\u05ca\u00a9\3\2\2\2\u05cb\u05cc\7\u010b\2\2\u05cc\u05cd\7\u0137\2\2\u05cd"+
		"\u05ce\5\u0132\u009a\2\u05ce\u05cf\7\u012d\2\2\u05cf\u05d7\5\u0132\u009a"+
		"\2\u05d0\u05d1\7\u0129\2\2\u05d1\u05d2\5\u0132\u009a\2\u05d2\u05d3\7\u012d"+
		"\2\2\u05d3\u05d4\5\u0132\u009a\2\u05d4\u05d6\3\2\2\2\u05d5\u05d0\3\2\2"+
		"\2\u05d6\u05d9\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05da"+
		"\3\2\2\2\u05d9\u05d7\3\2\2\2\u05da\u05de\7\u013a\2\2\u05db\u05dd\5d\63"+
		"\2\u05dc\u05db\3\2\2\2\u05dd\u05e0\3\2\2\2\u05de\u05dc\3\2\2\2\u05de\u05df"+
		"\3\2\2\2\u05df\u00ab\3\2\2\2\u05e0\u05de\3\2\2\2\u05e1\u05e3\7\6\2\2\u05e2"+
		"\u05e1\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e6\7\u00c2"+
		"\2\2\u05e5\u05e7\5\u010a\u0086\2\u05e6\u05e5\3\2\2\2\u05e6\u05e7\3\2\2"+
		"\2\u05e7\u00ad\3\2\2\2\u05e8\u05ea\7\u00ca\2\2\u05e9\u05eb\5\u010a\u0086"+
		"\2\u05ea\u05e9\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u00af\3\2\2\2\u05ec\u05ef"+
		"\7\u010a\2\2\u05ed\u05f0\5\u00f8}\2\u05ee\u05f0\5\u00fa~\2\u05ef\u05ed"+
		"\3\2\2\2\u05ef\u05ee\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f2\t\32\2\2"+
		"\u05f2\u05f3\5\4\3\2\u05f3\u05f5\7W\2\2\u05f4\u05f6\t\33\2\2\u05f5\u05f4"+
		"\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u00b1\3\2\2\2\u05f7\u05f8\7e\2\2\u05f8"+
		"\u05f9\7\u013e\2\2\u05f9\u05fb\7w\2\2\u05fa\u05fc\7\u00cc\2\2\u05fb\u05fa"+
		"\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u05fe\5\u010a\u0086"+
		"\2\u05fe\u05ff\7\u012c\2\2\u05ff\u0602\5\u010a\u0086\2\u0600\u0601\t\34"+
		"\2\2\u0601\u0603\5\u010a\u0086\2\u0602\u0600\3\2\2\2\u0602\u0603\3\2\2"+
		"\2\u0603\u0604\3\2\2\2\u0604\u0605\7\u009b\2\2\u0605\u0606\5\4\3\2\u0606"+
		"\u0607\7W\2\2\u0607\u0608\7\u009b\2\2\u0608\u00b3\3\2\2\2\u0609\u0610"+
		"\7\u0148\2\2\u060a\u060b\7\u0133\2\2\u060b\u060c\7\u0133\2\2\u060c\u060d"+
		"\7\u013e\2\2\u060d\u060e\7\u0131\2\2\u060e\u0610\7\u0131\2\2\u060f\u0609"+
		"\3\2\2\2\u060f\u060a\3\2\2\2\u0610\u00b5\3\2\2\2\u0611\u0612\7\u0100\2"+
		"\2\u0612\u0617\5\u010a\u0086\2\u0613\u0614\7\u0129\2\2\u0614\u0616\5\u010a"+
		"\u0086\2\u0615\u0613\3\2\2\2\u0616\u0619\3\2\2\2\u0617\u0615\3\2\2\2\u0617"+
		"\u0618\3\2\2\2\u0618\u00b7\3\2\2\2\u0619\u0617\3\2\2\2\u061a\u061c\5\u00ba"+
		"^\2\u061b\u061a\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u061d\3\2\2\2\u061d"+
		"\u061e\5\u00c0a\2\u061e\u00b9\3\2\2\2\u061f\u0620\7\u010b\2\2\u0620\u0625"+
		"\5\u00bc_\2\u0621\u0622\7\u0129\2\2\u0622\u0624\5\u00bc_\2\u0623\u0621"+
		"\3\2\2\2\u0624\u0627\3\2\2\2\u0625\u0623\3\2\2\2\u0625\u0626\3\2\2\2\u0626"+
		"\u00bb\3\2\2\2\u0627\u0625\3\2\2\2\u0628\u062a\5\u0132\u009a\2\u0629\u062b"+
		"\5\u00be`\2\u062a\u0629\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u062c\3\2\2"+
		"\2\u062c\u062d\7\r\2\2\u062d\u062e\7\u0137\2\2\u062e\u062f\5\u00c0a\2"+
		"\u062f\u0630\7\u013a\2\2\u0630\u00bd\3\2\2\2\u0631\u0632\7\u0137\2\2\u0632"+
		"\u0637\5\u0132\u009a\2\u0633\u0634\7\u0129\2\2\u0634\u0636\5\u0132\u009a"+
		"\2\u0635\u0633\3\2\2\2\u0636\u0639\3\2\2\2\u0637\u0635\3\2\2\2\u0637\u0638"+
		"\3\2\2\2\u0638\u063a\3\2\2\2\u0639\u0637\3\2\2\2\u063a\u063b\7\u013a\2"+
		"\2\u063b\u00bf\3\2\2\2\u063c\u0642\5\u00c2b\2\u063d\u063e\5\u00c4c\2\u063e"+
		"\u063f\5\u00c2b\2\u063f\u0641\3\2\2\2\u0640\u063d\3\2\2\2\u0641\u0644"+
		"\3\2\2\2\u0642\u0640\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u00c1\3\2\2\2\u0644"+
		"\u0642\3\2\2\2\u0645\u064b\5\u00c6d\2\u0646\u0647\7\u0137\2\2\u0647\u0648"+
		"\5\u00c0a\2\u0648\u0649\7\u013a\2\2\u0649\u064b\3\2\2\2\u064a\u0645\3"+
		"\2\2\2\u064a\u0646\3\2\2\2\u064b\u00c3\3\2\2\2\u064c\u064e\7\u00fb\2\2"+
		"\u064d\u064f\7\n\2\2\u064e\u064d\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0659"+
		"\3\2\2\2\u0650\u0652\7Z\2\2\u0651\u0653\7\n\2\2\u0652\u0651\3\2\2\2\u0652"+
		"\u0653\3\2\2\2\u0653\u0659\3\2\2\2\u0654\u0656\7\u0082\2\2\u0655\u0657"+
		"\7\n\2\2\u0656\u0655\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0659\3\2\2\2\u0658"+
		"\u064c\3\2\2\2\u0658\u0650\3\2\2\2\u0658\u0654\3\2\2\2\u0659\u00c5\3\2"+
		"\2\2\u065a\u065b\t\35\2\2\u065b\u065d\5\u00c8e\2\u065c\u065e\5\u00d4k"+
		"\2\u065d\u065c\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u0660\3\2\2\2\u065f\u0661"+
		"\5\u00d6l\2\u0660\u065f\3\2\2\2\u0660\u0661\3\2\2\2\u0661\u0663\3\2\2"+
		"\2\u0662\u0664\5\u00eav\2\u0663\u0662\3\2\2\2\u0663\u0664\3\2\2\2\u0664"+
		"\u0666\3\2\2\2\u0665\u0667\5\u00ecw\2\u0666\u0665\3\2\2\2\u0666\u0667"+
		"\3\2\2\2\u0667\u066a\3\2\2\2\u0668\u066b\5\u00eex\2\u0669\u066b\5\u00f0"+
		"y\2\u066a\u0668\3\2\2\2\u066a\u0669\3\2\2\2\u066a\u066b\3\2\2\2\u066b"+
		"\u066d\3\2\2\2\u066c\u066e\5\u00f2z\2\u066d\u066c\3\2\2\2\u066d\u066e"+
		"\3\2\2\2\u066e\u0670\3\2\2\2\u066f\u0671\5\u00f4{\2\u0670\u066f\3\2\2"+
		"\2\u0670\u0671\3\2\2\2\u0671\u00c7\3\2\2\2\u0672\u0674\5\u00caf\2\u0673"+
		"\u0672\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0676\3\2\2\2\u0675\u0677\5\u00cc"+
		"g\2\u0676\u0675\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u0678\3\2\2\2\u0678"+
		"\u067d\5\u00ceh\2\u0679\u067a\7\u0129\2\2\u067a\u067c\5\u00ceh\2\u067b"+
		"\u0679\3\2\2\2\u067c\u067f\3\2\2\2\u067d\u067b\3\2\2\2\u067d\u067e\3\2"+
		"\2\2\u067e\u00c9\3\2\2\2\u067f\u067d\3\2\2\2\u0680\u0681\t\36\2\2\u0681"+
		"\u00cb\3\2\2\2\u0682\u0683\7\u00f8\2\2\u0683\u0684\5\u010a\u0086\2\u0684"+
		"\u00cd\3\2\2\2\u0685\u0686\5\u0132\u009a\2\u0686\u0687\7\u012d\2\2\u0687"+
		"\u0689\3\2\2\2\u0688\u0685\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068a\3\2"+
		"\2\2\u068a\u068c\5\u010a\u0086\2\u068b\u068d\5\u00d0i\2\u068c\u068b\3"+
		"\2\2\2\u068c\u068d\3\2\2\2\u068d\u0690\3\2\2\2\u068e\u0690\5\u00d2j\2"+
		"\u068f\u0688\3\2\2\2\u068f\u068e\3\2\2\2\u0690\u00cf\3\2\2\2\u0691\u0693"+
		"\6i\5\2\u0692\u0694\7\r\2\2\u0693\u0692\3\2\2\2\u0693\u0694\3\2\2\2\u0694"+
		"\u0695\3\2\2\2\u0695\u069b\5\u0132\u009a\2\u0696\u0697\7\u0137\2\2\u0697"+
		"\u0698\7\u00f6\2\2\u0698\u0699\7\u0140\2\2\u0699\u069b\7\u013a\2\2\u069a"+
		"\u0691\3\2\2\2\u069a\u0696\3\2\2\2\u069b\u00d1\3\2\2\2\u069c\u069d\7\u013e"+
		"\2\2\u069d\u069f\7\6\2\2\u069e\u069c\3\2\2\2\u069e\u069f\3\2\2\2\u069f"+
		"\u06a0\3\2\2\2\u06a0\u06a1\7\u0135\2\2\u06a1\u00d3\3\2\2\2\u06a2\u06a3"+
		"\7\u0084\2\2\u06a3\u06a8\5\u0132\u009a\2\u06a4\u06a5\7\u0129\2\2\u06a5"+
		"\u06a7\5\u0132\u009a\2\u06a6\u06a4\3\2\2\2\u06a7\u06aa\3\2\2\2\u06a8\u06a6"+
		"\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u00d5\3\2\2\2\u06aa\u06a8\3\2\2\2\u06ab"+
		"\u06ac\7i\2\2\u06ac\u06b0\5\u00d8m\2\u06ad\u06af\5\u00dep\2\u06ae\u06ad"+
		"\3\2\2\2\u06af\u06b2\3\2\2\2\u06b0\u06ae\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1"+
		"\u00d7\3\2\2\2\u06b2\u06b0\3\2\2\2\u06b3\u06b7\5\u00dan\2\u06b4\u06b7"+
		"\5\u00dco\2\u06b5\u06b7\5\u00e2r\2\u06b6\u06b3\3\2\2\2\u06b6\u06b4\3\2"+
		"\2\2\u06b6\u06b5\3\2\2\2\u06b7\u00d9\3\2\2\2\u06b8\u06ba\5\u00e8u\2\u06b9"+
		"\u06bb\5\u00e6t\2\u06ba\u06b9\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u00db"+
		"\3\2\2\2\u06bc\u06bd\7\u0137\2\2\u06bd\u06be\5\u00b8]\2\u06be\u06c0\7"+
		"\u013a\2\2\u06bf\u06c1\5\u00e6t\2\u06c0\u06bf\3\2\2\2\u06c0\u06c1\3\2"+
		"\2\2\u06c1\u00dd\3\2\2\2\u06c2\u06c3\7\u0129\2\2\u06c3\u06cc\5\u00d8m"+
		"\2\u06c4\u06c5\5\u00e0q\2\u06c5\u06c6\5\u00d8m\2\u06c6\u06c9\7\u00ae\2"+
		"\2\u06c7\u06ca\5\u00f8}\2\u06c8\u06ca\5\u00fa~\2\u06c9\u06c7\3\2\2\2\u06c9"+
		"\u06c8\3\2\2\2\u06ca\u06cc\3\2\2\2\u06cb\u06c2\3\2\2\2\u06cb\u06c4\3\2"+
		"\2\2\u06cc\u00df\3\2\2\2\u06cd\u06cf\7z\2\2\u06ce\u06cd\3\2\2\2\u06ce"+
		"\u06cf\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d7\7\u0089\2\2\u06d1\u06d3"+
		"\t\37\2\2\u06d2\u06d4\7\u00b4\2\2\u06d3\u06d2\3\2\2\2\u06d3\u06d4\3\2"+
		"\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d7\7\u0089\2\2\u06d6\u06ce\3\2\2\2\u06d6"+
		"\u06d1\3\2\2\2\u06d7\u00e1\3\2\2\2\u06d8\u06d9\7\u00ee\2\2\u06d9\u06da"+
		"\7\u0137\2\2\u06da\u06db\7\u0102\2\2\u06db\u06e0\5\u00e4s\2\u06dc\u06dd"+
		"\7\u0129\2\2\u06dd\u06df\5\u00e4s\2\u06de\u06dc\3\2\2\2\u06df\u06e2\3"+
		"\2\2\2\u06e0\u06de\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u06e3\3\2\2\2\u06e2"+
		"\u06e0\3\2\2\2\u06e3\u06e5\7\u013a\2\2\u06e4\u06e6\5\u00e6t\2\u06e5\u06e4"+
		"\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u00e3\3\2\2\2\u06e7\u06f4\5\u010a\u0086"+
		"\2\u06e8\u06e9\7\u0137\2\2\u06e9\u06ee\5\u010a\u0086\2\u06ea\u06eb\7\u0129"+
		"\2\2\u06eb\u06ed\5\u010a\u0086\2\u06ec\u06ea\3\2\2\2\u06ed\u06f0\3\2\2"+
		"\2\u06ee\u06ec\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u06f1\3\2\2\2\u06f0\u06ee"+
		"\3\2\2\2\u06f1\u06f2\7\u013a\2\2\u06f2\u06f4\3\2\2\2\u06f3\u06e7\3\2\2"+
		"\2\u06f3\u06e8\3\2\2\2\u06f4\u00e5\3\2\2\2\u06f5\u06f7\6t\6\2\u06f6\u06f8"+
		"\7\r\2\2\u06f7\u06f6\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9"+
		"\u0704\5\u0132\u009a\2\u06fa\u06fb\7\u0137\2\2\u06fb\u0700\7\u013e\2\2"+
		"\u06fc\u06fd\7\u0129\2\2\u06fd\u06ff\7\u013e\2\2\u06fe\u06fc\3\2\2\2\u06ff"+
		"\u0702\3\2\2\2\u0700\u06fe\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0703\3\2"+
		"\2\2\u0702\u0700\3\2\2\2\u0703\u0705\7\u013a\2\2\u0704\u06fa\3\2\2\2\u0704"+
		"\u0705\3\2\2\2\u0705\u00e7\3\2\2\2\u0706\u0707\5\u0132\u009a\2\u0707\u00e9"+
		"\3\2\2\2\u0708\u070b\7\u0109\2\2\u0709\u070c\5\u00f8}\2\u070a\u070c\5"+
		"\u00fa~\2\u070b\u0709\3\2\2\2\u070b\u070a\3\2\2\2\u070c\u00eb\3\2\2\2"+
		"\u070d\u070e\7o\2\2\u070e\u070f\7\34\2\2\u070f\u0714\5\u010a\u0086\2\u0710"+
		"\u0711\7\u0129\2\2\u0711\u0713\5\u010a\u0086\2\u0712\u0710\3\2\2\2\u0713"+
		"\u0716\3\2\2\2\u0714\u0712\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u00ed\3\2"+
		"\2\2\u0716\u0714\3\2\2\2\u0717\u071a\7r\2\2\u0718\u071b\5\u00f8}\2\u0719"+
		"\u071b\5\u00fa~\2\u071a\u0718\3\2\2\2\u071a\u0719\3\2\2\2\u071b\u00ef"+
		"\3\2\2\2\u071c\u071f\7\u00c1\2\2\u071d\u0720\5\u00f8}\2\u071e\u0720\5"+
		"\u00fa~\2\u071f\u071d\3\2\2\2\u071f\u071e\3\2\2\2\u0720\u00f1\3\2\2\2"+
		"\u0721\u0722\7\u00b2\2\2\u0722\u0723\7\34\2\2\u0723\u0725\5\u010a\u0086"+
		"\2\u0724\u0726\t\7\2\2\u0725\u0724\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u072e"+
		"\3\2\2\2\u0727\u0728\7\u0129\2\2\u0728\u072a\5\u010a\u0086\2\u0729\u072b"+
		"\t\7\2\2\u072a\u0729\3\2\2\2\u072a\u072b\3\2\2\2\u072b\u072d\3\2\2\2\u072c"+
		"\u0727\3\2\2\2\u072d\u0730\3\2\2\2\u072e\u072c\3\2\2\2\u072e\u072f\3\2"+
		"\2\2\u072f\u00f3\3\2\2\2\u0730\u072e\3\2\2\2\u0731\u0733\5\u00f6|\2\u0732"+
		"\u0731\3\2\2\2\u0733\u0734\3\2\2\2\u0734\u0732\3\2\2\2\u0734\u0735\3\2"+
		"\2\2\u0735\u00f5\3\2\2\2\u0736\u0737\7\u0091\2\2\u0737\u0742\5\u010a\u0086"+
		"\2\u0738\u0739\7\u010b\2\2\u0739\u073f\t \2\2\u073a\u073b\7\u00ff\2\2"+
		"\u073b\u073c\7\f\2\2\u073c\u073d\7\u008a\2\2\u073d\u073e\t!\2\2\u073e"+
		"\u0740\7\u0097\2\2\u073f\u073a\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u0742"+
		"\3\2\2\2\u0741\u0736\3\2\2\2\u0741\u0738\3\2\2\2\u0742\u00f7\3\2\2\2\u0743"+
		"\u0745\b}\1\2\u0744\u0746\7\u00a9\2\2\u0745\u0744\3\2\2\2\u0745\u0746"+
		"\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u0748\7\u0137\2\2\u0748\u0749\5\u00f8"+
		"}\2\u0749\u074a\7\u013a\2\2\u074a\u074d\3\2\2\2\u074b\u074d\5\u00fc\177"+
		"\2\u074c\u0743\3\2\2\2\u074c\u074b\3\2\2\2\u074d\u0754\3\2\2\2\u074e\u074f"+
		"\f\4\2\2\u074f\u0750\5\u0106\u0084\2\u0750\u0751\5\u00f8}\5\u0751\u0753"+
		"\3\2\2\2\u0752\u074e\3\2\2\2\u0753\u0756\3\2\2\2\u0754\u0752\3\2\2\2\u0754"+
		"\u0755\3\2\2\2\u0755\u00f9\3\2\2\2\u0756\u0754\3\2\2\2\u0757\u0759\7\u00a9"+
		"\2\2\u0758\u0757\3\2\2\2\u0758\u0759\3\2\2\2\u0759\u075b\3\2\2\2\u075a"+
		"\u075c\7\u0137\2\2\u075b\u075a\3\2\2\2\u075b\u075c\3\2\2\2\u075c\u075d"+
		"\3\2\2\2\u075d\u075f\5\u00f8}\2\u075e\u0760\7\u013a\2\2\u075f\u075e\3"+
		"\2\2\2\u075f\u0760\3\2\2\2\u0760\u00fb\3\2\2\2\u0761\u0765\5\u00fe\u0080"+
		"\2\u0762\u0765\5\u0104\u0083\2\u0763\u0765\5\u010a\u0086\2\u0764\u0761"+
		"\3\2\2\2\u0764\u0762\3\2\2\2\u0764\u0763\3\2\2\2\u0765\u00fd\3\2\2\2\u0766"+
		"\u0767\5\u010a\u0086\2\u0767\u0769\7\u0086\2\2\u0768\u076a\7\u00a9\2\2"+
		"\u0769\u0768\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u076c"+
		"\7\u00ab\2\2\u076c\u077e\3\2\2\2\u076d\u076e\5\u010a\u0086\2\u076e\u076f"+
		"\7\24\2\2\u076f\u0770\5\u010a\u0086\2\u0770\u0771\7\f\2\2\u0771\u0772"+
		"\5\u010a\u0086\2\u0772\u077e\3\2\2\2\u0773\u0775\7\u00a9\2\2\u0774\u0773"+
		"\3\2\2\2\u0774\u0775\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u0777\7_\2\2\u0777"+
		"\u0778\7\u0137\2\2\u0778\u0779\5\u00b8]\2\u0779\u077a\7\u013a\2\2\u077a"+
		"\u077e\3\2\2\2\u077b\u077e\5\u0100\u0081\2\u077c\u077e\5\u0102\u0082\2"+
		"\u077d\u0766\3\2\2\2\u077d\u076d\3\2\2\2\u077d\u0774\3\2\2\2\u077d\u077b"+
		"\3\2\2\2\u077d\u077c\3\2\2\2\u077e\u00ff\3\2\2\2\u077f\u0781\5\u010a\u0086"+
		"\2\u0780\u0782\7\u00a9\2\2\u0781\u0780\3\2\2\2\u0781\u0782\3\2\2\2\u0782"+
		"\u0783\3\2\2\2\u0783\u0784\7w\2\2\u0784\u078e\7\u0137\2\2\u0785\u078a"+
		"\5\u010a\u0086\2\u0786\u0787\7\u0129\2\2\u0787\u0789\5\u010a\u0086\2\u0788"+
		"\u0786\3\2\2\2\u0789\u078c\3\2\2\2\u078a\u0788\3\2\2\2\u078a\u078b\3\2"+
		"\2\2\u078b\u078f\3\2\2\2\u078c\u078a\3\2\2\2\u078d\u078f\5\u00b8]\2\u078e"+
		"\u0785\3\2\2\2\u078e\u078d\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0791\7\u013a"+
		"\2\2\u0791\u0101\3\2\2\2\u0792\u0793\7\u0137\2\2\u0793\u0798\5\u010a\u0086"+
		"\2\u0794\u0795\7\u0129\2\2\u0795\u0797\5\u010a\u0086\2\u0796\u0794\3\2"+
		"\2\2\u0797\u079a\3\2\2\2\u0798\u0796\3\2\2\2\u0798\u0799\3\2\2\2\u0799"+
		"\u079b\3\2\2\2\u079a\u0798\3\2\2\2\u079b\u079d\7\u013a\2\2\u079c\u079e"+
		"\7\u00a9\2\2\u079d\u079c\3\2\2\2\u079d\u079e\3\2\2\2\u079e\u079f\3\2\2"+
		"\2\u079f\u07a0\7w\2\2\u07a0\u07a1\7\u0137\2\2\u07a1\u07a2\5\u00b8]\2\u07a2"+
		"\u07a3\7\u013a\2\2\u07a3\u0103\3\2\2\2\u07a4\u07a5\5\u010a\u0086\2\u07a5"+
		"\u07a6\5\u0108\u0085\2\u07a6\u07a7\5\u010a\u0086\2\u07a7\u0105\3\2\2\2"+
		"\u07a8\u07a9\t\"\2\2\u07a9\u0107\3\2\2\2\u07aa\u07b7\7\u012d\2\2\u07ab"+
		"\u07b7\7\u012e\2\2\u07ac\u07b7\7\u012f\2\2\u07ad\u07b7\7\u0130\2\2\u07ae"+
		"\u07b7\7\u0133\2\2\u07af\u07b7\7\u0134\2\2\u07b0\u07b7\7\u0131\2\2\u07b1"+
		"\u07b7\7\u0132\2\2\u07b2\u07b4\7\u00a9\2\2\u07b3\u07b2\3\2\2\2\u07b3\u07b4"+
		"\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u07b7\t#\2\2\u07b6\u07aa\3\2\2\2\u07b6"+
		"\u07ab\3\2\2\2\u07b6\u07ac\3\2\2\2\u07b6\u07ad\3\2\2\2\u07b6\u07ae\3\2"+
		"\2\2\u07b6\u07af\3\2\2\2\u07b6\u07b0\3\2\2\2\u07b6\u07b1\3\2\2\2\u07b6"+
		"\u07b3\3\2\2\2\u07b7\u0109\3\2\2\2\u07b8\u07b9\b\u0086\1\2\u07b9\u07ba"+
		"\7\u0137\2\2\u07ba\u07bb\5\u00b8]\2\u07bb\u07bc\7\u013a\2\2\u07bc\u07ca"+
		"\3\2\2\2\u07bd\u07be\7\u0137\2\2\u07be\u07bf\5\u010a\u0086\2\u07bf\u07c0"+
		"\7\u013a\2\2\u07c0\u07ca\3\2\2\2\u07c1\u07ca\5\u010e\u0088\2\u07c2\u07ca"+
		"\5\u0112\u008a\2\u07c3\u07ca\5\u0116\u008c\2\u07c4\u07ca\5\u011c\u008f"+
		"\2\u07c5\u07ca\5\u011e\u0090\2\u07c6\u07ca\5\u0126\u0094\2\u07c7\u07ca"+
		"\5\u0128\u0095\2\u07c8\u07ca\5\u010c\u0087\2\u07c9\u07b8\3\2\2\2\u07c9"+
		"\u07bd\3\2\2\2\u07c9\u07c1\3\2\2\2\u07c9\u07c2\3\2\2\2\u07c9\u07c3\3\2"+
		"\2\2\u07c9\u07c4\3\2\2\2\u07c9\u07c5\3\2\2\2\u07c9\u07c6\3\2\2\2\u07c9"+
		"\u07c7\3\2\2\2\u07c9\u07c8\3\2\2\2\u07ca\u07db\3\2\2\2\u07cb\u07cc\f\20"+
		"\2\2\u07cc\u07cd\7\u0135\2\2\u07cd\u07da\5\u010a\u0086\21\u07ce\u07cf"+
		"\f\17\2\2\u07cf\u07d0\7\u012b\2\2\u07d0\u07da\5\u010a\u0086\20\u07d1\u07d2"+
		"\f\16\2\2\u07d2\u07d3\7\u0127\2\2\u07d3\u07da\5\u010a\u0086\17\u07d4\u07d5"+
		"\f\r\2\2\u07d5\u07d6\7\u013d\2\2\u07d6\u07da\5\u010a\u0086\16\u07d7\u07d8"+
		"\f\21\2\2\u07d8\u07da\5\u0110\u0089\2\u07d9\u07cb\3\2\2\2\u07d9\u07ce"+
		"\3\2\2\2\u07d9\u07d1\3\2\2\2\u07d9\u07d4\3\2\2\2\u07d9\u07d7\3\2\2\2\u07da"+
		"\u07dd\3\2\2\2\u07db\u07d9\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u010b\3\2"+
		"\2\2\u07dd\u07db\3\2\2\2\u07de\u07e7\5\u012e\u0098\2\u07df\u07e7\5\u0130"+
		"\u0099\2\u07e0\u07e7\5\u013a\u009e\2\u07e1\u07e7\5\u0132\u009a\2\u07e2"+
		"\u07e7\5\u0134\u009b\2\u07e3\u07e7\5\u0138\u009d\2\u07e4\u07e7\5\u0136"+
		"\u009c\2\u07e5\u07e7\5\u013c\u009f\2\u07e6\u07de\3\2\2\2\u07e6\u07df\3"+
		"\2\2\2\u07e6\u07e0\3\2\2\2\u07e6\u07e1\3\2\2\2\u07e6\u07e2\3\2\2\2\u07e6"+
		"\u07e3\3\2\2\2\u07e6\u07e4\3\2\2\2\u07e6\u07e5\3\2\2\2\u07e7\u010d\3\2"+
		"\2\2\u07e8\u07e9\7\u0083\2\2\u07e9\u07ea\5\u010a\u0086\2\u07ea\u07eb\5"+
		"\u0110\u0089\2\u07eb\u010f\3\2\2\2\u07ec\u07ed\t$\2\2\u07ed\u0111\3\2"+
		"\2\2\u07ee\u07ef\5\u0114\u008b\2\u07ef\u07f0\t%\2\2\u07f0\u07f5\5\u0114"+
		"\u008b\2\u07f1\u07f2\t%\2\2\u07f2\u07f4\5\u0114\u008b\2\u07f3\u07f1\3"+
		"\2\2\2\u07f4\u07f7\3\2\2\2\u07f5\u07f3\3\2\2\2\u07f5\u07f6\3\2\2\2\u07f6"+
		"\u0113\3\2\2\2\u07f7\u07f5\3\2\2\2\u07f8\u07f9\7\u0137\2\2\u07f9\u07fa"+
		"\5\u010a\u0086\2\u07fa\u07fb\7\u013a\2\2\u07fb\u0802\3\2\2\2\u07fc\u0802"+
		"\5\u0116\u008c\2\u07fd\u0802\5\u011e\u0090\2\u07fe\u0802\5\u0126\u0094"+
		"\2\u07ff\u0802\5\u0128\u0095\2\u0800\u0802\5\u010c\u0087\2\u0801\u07f8"+
		"\3\2\2\2\u0801\u07fc\3\2\2\2\u0801\u07fd\3\2\2\2\u0801\u07fe\3\2\2\2\u0801"+
		"\u07ff\3\2\2\2\u0801\u0800\3\2\2\2\u0802\u0115\3\2\2\2\u0803\u0806\5\u0118"+
		"\u008d\2\u0804\u0806\5\u011a\u008e\2\u0805\u0803\3\2\2\2\u0805\u0804\3"+
		"\2\2\2\u0806\u0117\3\2\2\2\u0807\u0808\7 \2\2\u0808\u080e\5\u010a\u0086"+
		"\2\u0809\u080a\7\u0108\2\2\u080a\u080b\5\u010a\u0086\2\u080b\u080c\7\u00f3"+
		"\2\2\u080c\u080d\5\u010a\u0086\2\u080d\u080f\3\2\2\2\u080e\u0809\3\2\2"+
		"\2\u080f\u0810\3\2\2\2\u0810\u080e\3\2\2\2\u0810\u0811\3\2\2\2\u0811\u0814"+
		"\3\2\2\2\u0812\u0813\7S\2\2\u0813\u0815\5\u010a\u0086\2\u0814\u0812\3"+
		"\2\2\2\u0814\u0815\3\2\2\2\u0815\u0816\3\2\2\2\u0816\u0817\7W\2\2\u0817"+
		"\u0119\3\2\2\2\u0818\u081e\7 \2\2\u0819\u081a\7\u0108\2\2\u081a\u081b"+
		"\5\u00f8}\2\u081b\u081c\7\u00f3\2\2\u081c\u081d\5\u010a\u0086\2\u081d"+
		"\u081f\3\2\2\2\u081e\u0819\3\2\2\2\u081f\u0820\3\2\2\2\u0820\u081e\3\2"+
		"\2\2\u0820\u0821\3\2\2\2\u0821\u0824\3\2\2\2\u0822\u0823\7S\2\2\u0823"+
		"\u0825\5\u010a\u0086\2\u0824\u0822\3\2\2\2\u0824\u0825\3\2\2\2\u0825\u0826"+
		"\3\2\2\2\u0826\u0827\7W\2\2\u0827\u011b\3\2\2\2\u0828\u0829\5\u0132\u009a"+
		"\2\u0829\u082a\7\5\2\2\u082a\u082b\t&\2\2\u082b\u011d\3\2\2\2\u082c\u082d"+
		"\7\22\2\2\u082d\u082f\7\u0137\2\2\u082e\u0830\5\u0120\u0091\2\u082f\u082e"+
		"\3\2\2\2\u082f\u0830\3\2\2\2\u0830\u0831\3\2\2\2\u0831\u0832\5\u010a\u0086"+
		"\2\u0832\u0834\7\u013a\2\2\u0833\u0835\5\u0122\u0092\2\u0834\u0833\3\2"+
		"\2\2\u0834\u0835\3\2\2\2\u0835\u08c5\3\2\2\2\u0836\u0837\7\63\2\2\u0837"+
		"\u083d\7\u0137\2\2\u0838\u083a\5\u0120\u0091\2\u0839\u0838\3\2\2\2\u0839"+
		"\u083a\3\2\2\2\u083a\u083b\3\2\2\2\u083b\u083e\5\u010a\u0086\2\u083c\u083e"+
		"\7\u0135\2\2\u083d\u0839\3\2\2\2\u083d\u083c\3\2\2\2\u083e\u083f\3\2\2"+
		"\2\u083f\u0841\7\u013a\2\2\u0840\u0842\5\u0122\u0092\2\u0841\u0840\3\2"+
		"\2\2\u0841\u0842\3\2\2\2\u0842\u08c5\3\2\2\2\u0843\u0844\7\64\2\2\u0844"+
		"\u084a\7\u0137\2\2\u0845\u0847\5\u0120\u0091\2\u0846\u0845\3\2\2\2\u0846"+
		"\u0847\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u084b\5\u010a\u0086\2\u0849\u084b"+
		"\7\u0135\2\2\u084a\u0846\3\2\2\2\u084a\u0849\3\2\2\2\u084b\u084c\3\2\2"+
		"\2\u084c\u084e\7\u013a\2\2\u084d\u084f\5\u0122\u0092\2\u084e\u084d\3\2"+
		"\2\2\u084e\u084f\3\2\2\2\u084f\u08c5\3\2\2\2\u0850\u0851\7\u0110\2\2\u0851"+
		"\u0852\7\u0137\2\2\u0852\u0853\7\u013a\2\2\u0853\u08c5\5\u0122\u0092\2"+
		"\u0854\u0855\7\u0114\2\2\u0855\u0856\7\u0137\2\2\u0856\u0857\7\u013a\2"+
		"\2\u0857\u08c5\5\u0122\u0092\2\u0858\u0859\7\u0115\2\2\u0859\u085a\7\u0137"+
		"\2\2\u085a\u085b\5\u010a\u0086\2\u085b\u085c\7\u013a\2\2\u085c\u085d\5"+
		"\u0122\u0092\2\u085d\u08c5\3\2\2\2\u085e\u085f\7\u0116\2\2\u085f\u0860"+
		"\7\u0137\2\2\u0860\u0867\5\u010a\u0086\2\u0861\u0862\7\u0129\2\2\u0862"+
		"\u0865\5\u010a\u0086\2\u0863\u0864\7\u0129\2\2\u0864\u0866\5\u010a\u0086"+
		"\2\u0865\u0863\3\2\2\2\u0865\u0866\3\2\2\2\u0866\u0868\3\2\2\2\u0867\u0861"+
		"\3\2\2\2\u0867\u0868\3\2\2\2\u0868\u0869\3\2\2\2\u0869\u086a\7\u013a\2"+
		"\2\u086a\u086b\5\u0122\u0092\2\u086b\u08c5\3\2\2\2\u086c\u086d\7\u0117"+
		"\2\2\u086d\u086e\7\u0137\2\2\u086e\u086f\5\u010a\u0086\2\u086f\u0870\7"+
		"\u013a\2\2\u0870\u0871\5\u0122\u0092\2\u0871\u08c5\3\2\2\2\u0872\u0873"+
		"\7\u0118\2\2\u0873\u0874\7\u0137\2\2\u0874\u087b\5\u010a\u0086\2\u0875"+
		"\u0876\7\u0129\2\2\u0876\u0879\5\u010a\u0086\2\u0877\u0878\7\u0129\2\2"+
		"\u0878\u087a\5\u010a\u0086\2\u0879\u0877\3\2\2\2\u0879\u087a\3\2\2\2\u087a"+
		"\u087c\3\2\2\2\u087b\u0875\3\2\2\2\u087b\u087c\3\2\2\2\u087c\u087d\3\2"+
		"\2\2\u087d\u087e\7\u013a\2\2\u087e\u087f\5\u0122\u0092\2\u087f\u08c5\3"+
		"\2\2\2\u0880\u0881\7\u009d\2\2\u0881\u0883\7\u0137\2\2\u0882\u0884\5\u0120"+
		"\u0091\2\u0883\u0882\3\2\2\2\u0883\u0884\3\2\2\2\u0884\u0885\3\2\2\2\u0885"+
		"\u0886\5\u010a\u0086\2\u0886\u0888\7\u013a\2\2\u0887\u0889\5\u0122\u0092"+
		"\2\u0888\u0887\3\2\2\2\u0888\u0889\3\2\2\2\u0889\u08c5\3\2\2\2\u088a\u088b"+
		"\7\u00a2\2\2\u088b\u088d\7\u0137\2\2\u088c\u088e\5\u0120\u0091\2\u088d"+
		"\u088c\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u088f\3\2\2\2\u088f\u0890\5\u010a"+
		"\u0086\2\u0890\u0892\7\u013a\2\2\u0891\u0893\5\u0122\u0092\2\u0892\u0891"+
		"\3\2\2\2\u0892\u0893\3\2\2\2\u0893\u08c5\3\2\2\2\u0894\u0895\7\u0121\2"+
		"\2\u0895\u0896\7\u0137\2\2\u0896\u0897\7\u013a\2\2\u0897\u08c5\5\u0122"+
		"\u0092\2\u0898\u0899\7\u0122\2\2\u0899\u089a\7\u0137\2\2\u089a\u089b\7"+
		"\u013a\2\2\u089b\u08c5\5\u0122\u0092\2\u089c\u089d\7\u0123\2\2\u089d\u089f"+
		"\7\u0137\2\2\u089e\u08a0\5\u0120\u0091\2\u089f\u089e\3\2\2\2\u089f\u08a0"+
		"\3\2\2\2\u08a0\u08a1\3\2\2\2\u08a1\u08a2\5\u010a\u0086\2\u08a2\u08a4\7"+
		"\u013a\2\2\u08a3\u08a5\5\u0122\u0092\2\u08a4\u08a3\3\2\2\2\u08a4\u08a5"+
		"\3\2\2\2\u08a5\u08c5\3\2\2\2\u08a6\u08a7\7\u00ec\2\2\u08a7\u08a9\7\u0137"+
		"\2\2\u08a8\u08aa\5\u0120\u0091\2\u08a9\u08a8\3\2\2\2\u08a9\u08aa\3\2\2"+
		"\2\u08aa\u08ab\3\2\2\2\u08ab\u08ac\5\u010a\u0086\2\u08ac\u08ae\7\u013a"+
		"\2\2\u08ad\u08af\5\u0122\u0092\2\u08ae\u08ad\3\2\2\2\u08ae\u08af\3\2\2"+
		"\2\u08af\u08c5\3\2\2\2\u08b0\u08b1\7\u0103\2\2\u08b1\u08b3\7\u0137\2\2"+
		"\u08b2\u08b4\5\u0120\u0091\2\u08b3\u08b2\3\2\2\2\u08b3\u08b4\3\2\2\2\u08b4"+
		"\u08b5\3\2\2\2\u08b5\u08b6\5\u010a\u0086\2\u08b6\u08b8\7\u013a\2\2\u08b7"+
		"\u08b9\5\u0122\u0092\2\u08b8\u08b7\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9\u08c5"+
		"\3\2\2\2\u08ba\u08bb\7\u0125\2\2\u08bb\u08bd\7\u0137\2\2\u08bc\u08be\5"+
		"\u0120\u0091\2\u08bd\u08bc\3\2\2\2\u08bd\u08be\3\2\2\2\u08be\u08bf\3\2"+
		"\2\2\u08bf\u08c0\5\u010a\u0086\2\u08c0\u08c2\7\u013a\2\2\u08c1\u08c3\5"+
		"\u0122\u0092\2\u08c2\u08c1\3\2\2\2\u08c2\u08c3\3\2\2\2\u08c3\u08c5\3\2"+
		"\2\2\u08c4\u082c\3\2\2\2\u08c4\u0836\3\2\2\2\u08c4\u0843\3\2\2\2\u08c4"+
		"\u0850\3\2\2\2\u08c4\u0854\3\2\2\2\u08c4\u0858\3\2\2\2\u08c4\u085e\3\2"+
		"\2\2\u08c4\u086c\3\2\2\2\u08c4\u0872\3\2\2\2\u08c4\u0880\3\2\2\2\u08c4"+
		"\u088a\3\2\2\2\u08c4\u0894\3\2\2\2\u08c4\u0898\3\2\2\2\u08c4\u089c\3\2"+
		"\2\2\u08c4\u08a6\3\2\2\2\u08c4\u08b0\3\2\2\2\u08c4\u08ba\3\2\2\2\u08c5"+
		"\u011f\3\2\2\2\u08c6\u08c7\t\36\2\2\u08c7\u0121\3\2\2\2\u08c8\u08c9\7"+
		"\u00b5\2\2\u08c9\u08cb\7\u0137\2\2\u08ca\u08cc\5\u0124\u0093\2\u08cb\u08ca"+
		"\3\2\2\2\u08cb\u08cc\3\2\2\2\u08cc\u08ce\3\2\2\2\u08cd\u08cf\5\u00f2z"+
		"\2\u08ce\u08cd\3\2\2\2\u08ce\u08cf\3\2\2\2\u08cf\u08d0\3\2\2\2\u08d0\u08d1"+
		"\7\u013a\2\2\u08d1\u0123\3\2\2\2\u08d2\u08d3\7\u00b8\2\2\u08d3\u08d4\7"+
		"\34\2\2\u08d4\u08d9\5\u010a\u0086\2\u08d5\u08d6\7\u0129\2\2\u08d6\u08d8"+
		"\5\u010a\u0086\2\u08d7\u08d5\3\2\2\2\u08d8\u08db\3\2\2\2\u08d9\u08d7\3"+
		"\2\2\2\u08d9\u08da\3\2\2\2\u08da\u0125\3\2\2\2\u08db\u08d9\3\2\2\2\u08dc"+
		"\u09a5\7\u010f\2\2\u08dd\u08de\7\"\2\2\u08de\u08df\7\u0137\2\2\u08df\u08e0"+
		"\5\u010a\u0086\2\u08e0\u08e1\7\r\2\2\u08e1\u08e3\5h\65\2\u08e2\u08e4\5"+
		"j\66\2\u08e3\u08e2\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5"+
		"\u08e6\7\u013a\2\2\u08e6\u09a5\3\2\2\2\u08e7\u08e8\7\63\2\2\u08e8\u08eb"+
		"\7\u0137\2\2\u08e9\u08ec\5\u010a\u0086\2\u08ea\u08ec\7\u0135\2\2\u08eb"+
		"\u08e9\3\2\2\2\u08eb\u08ea\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed\u09a5\7\u013a"+
		"\2\2\u08ee\u09a5\7\u0111\2\2\u08ef\u08f0\79\2\2\u08f0\u09a5\7<\2\2\u08f1"+
		"\u08f5\7\u0112\2\2\u08f2\u08f3\79\2\2\u08f3\u08f5\7\u00f4\2\2\u08f4\u08f1"+
		"\3\2\2\2\u08f4\u08f2\3\2\2\2\u08f5\u08fa\3\2\2\2\u08f6\u08f7\7\u0137\2"+
		"\2\u08f7\u08f8\5\u010a\u0086\2\u08f8\u08f9\7\u013a\2\2\u08f9\u08fb\3\2"+
		"\2\2\u08fa\u08f6\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u09a5\3\2\2\2\u08fc"+
		"\u09a5\7\u0113\2\2\u08fd\u08fe\79\2\2\u08fe\u09a5\7\u0126\2\2\u08ff\u0900"+
		"\7\u0119\2\2\u0900\u0901\7\u0137\2\2\u0901\u090e\5\u010a\u0086\2\u0902"+
		"\u0903\7\u0129\2\2\u0903\u090b\5\u010a\u0086\2\u0904\u0905\7\u0129\2\2"+
		"\u0905\u0906\5\u010a\u0086\2\u0906\u0907\7\u012d\2\2\u0907\u0908\5\u010a"+
		"\u0086\2\u0908\u090a\3\2\2\2\u0909\u0904\3\2\2\2\u090a\u090d\3\2\2\2\u090b"+
		"\u0909\3\2\2\2\u090b\u090c\3\2\2\2\u090c\u090f\3\2\2\2\u090d\u090b\3\2"+
		"\2\2\u090e\u0902\3\2\2\2\u090e\u090f\3\2\2\2\u090f\u0910\3\2\2\2\u0910"+
		"\u0911\7\u013a\2\2\u0911\u09a5\3\2\2\2\u0912\u0913\7\u011a\2\2\u0913\u0914"+
		"\7\u0137\2\2\u0914\u0921\5\u010a\u0086\2\u0915\u0916\7\u0129\2\2\u0916"+
		"\u091e\5\u010a\u0086\2\u0917\u0918\7\u0129\2\2\u0918\u0919\5\u010a\u0086"+
		"\2\u0919\u091a\7\u012d\2\2\u091a\u091b\5\u010a\u0086\2\u091b\u091d\3\2"+
		"\2\2\u091c\u0917\3\2\2\2\u091d\u0920\3\2\2\2\u091e\u091c\3\2\2\2\u091e"+
		"\u091f\3\2\2\2\u091f\u0922\3\2\2\2\u0920\u091e\3\2\2\2\u0921\u0915\3";
	private static final String _serializedATNSegment1 =
		"\2\2\2\u0921\u0922\3\2\2\2\u0922\u0923\3\2\2\2\u0923\u0924\7\u013a\2\2"+
		"\u0924\u09a5\3\2\2\2\u0925\u0926\7\u011b\2\2\u0926\u0927\7\u0137\2\2\u0927"+
		"\u0934\5\u010a\u0086\2\u0928\u0929\7\u0129\2\2\u0929\u0931\5\u010a\u0086"+
		"\2\u092a\u092b\7\u0129\2\2\u092b\u092c\5\u010a\u0086\2\u092c\u092d\7\u012d"+
		"\2\2\u092d\u092e\5\u010a\u0086\2\u092e\u0930\3\2\2\2\u092f\u092a\3\2\2"+
		"\2\u0930\u0933\3\2\2\2\u0931\u092f\3\2\2\2\u0931\u0932\3\2\2\2\u0932\u0935"+
		"\3\2\2\2\u0933\u0931\3\2\2\2\u0934\u0928\3\2\2\2\u0934\u0935\3\2\2\2\u0935"+
		"\u0936\3\2\2\2\u0936\u0937\7\u013a\2\2\u0937\u09a5\3\2\2\2\u0938\u0939"+
		"\7\u011c\2\2\u0939\u093a\7\u0137\2\2\u093a\u0947\5\u010a\u0086\2\u093b"+
		"\u093c\7\u0129\2\2\u093c\u0944\5\u010a\u0086\2\u093d\u093e\7\u0129\2\2"+
		"\u093e\u093f\5\u010a\u0086\2\u093f\u0940\7\u012d\2\2\u0940\u0941\5\u010a"+
		"\u0086\2\u0941\u0943\3\2\2\2\u0942\u093d\3\2\2\2\u0943\u0946\3\2\2\2\u0944"+
		"\u0942\3\2\2\2\u0944\u0945\3\2\2\2\u0945\u0948\3\2\2\2\u0946\u0944\3\2"+
		"\2\2\u0947\u093b\3\2\2\2\u0947\u0948\3\2\2\2\u0948\u0949\3\2\2\2\u0949"+
		"\u094a\7\u013a\2\2\u094a\u09a5\3\2\2\2\u094b\u094c\7\u011d\2\2\u094c\u094d"+
		"\7\u0137\2\2\u094d\u095a\5\u010a\u0086\2\u094e\u094f\7\u0129\2\2\u094f"+
		"\u0957\5\u010a\u0086\2\u0950\u0951\7\u0129\2\2\u0951\u0952\5\u010a\u0086"+
		"\2\u0952\u0953\7\u012d\2\2\u0953\u0954\5\u010a\u0086\2\u0954\u0956\3\2"+
		"\2\2\u0955\u0950\3\2\2\2\u0956\u0959\3\2\2\2\u0957\u0955\3\2\2\2\u0957"+
		"\u0958\3\2\2\2\u0958\u095b\3\2\2\2\u0959\u0957\3\2\2\2\u095a\u094e\3\2"+
		"\2\2\u095a\u095b\3\2\2\2\u095b\u095c\3\2\2\2\u095c\u095d\7\u013a\2\2\u095d"+
		"\u09a5\3\2\2\2\u095e\u095f\7\u011e\2\2\u095f\u0960\7\u0137\2\2\u0960\u096d"+
		"\5\u010a\u0086\2\u0961\u0962\7\u0129\2\2\u0962\u096a\5\u010a\u0086\2\u0963"+
		"\u0964\7\u0129\2\2\u0964\u0965\5\u010a\u0086\2\u0965\u0966\7\u012d\2\2"+
		"\u0966\u0967\5\u010a\u0086\2\u0967\u0969\3\2\2\2\u0968\u0963\3\2\2\2\u0969"+
		"\u096c\3\2\2\2\u096a\u0968\3\2\2\2\u096a\u096b\3\2\2\2\u096b\u096e\3\2"+
		"\2\2\u096c\u096a\3\2\2\2\u096d\u0961\3\2\2\2\u096d\u096e\3\2\2\2\u096e"+
		"\u096f\3\2\2\2\u096f\u0970\7\u013a\2\2\u0970\u09a5\3\2\2\2\u0971\u0972"+
		"\7\u011f\2\2\u0972\u0973\7\u0137\2\2\u0973\u097b\5\u010a\u0086\2\u0974"+
		"\u0975\7\u0129\2\2\u0975\u0976\5\u010a\u0086\2\u0976\u0977\7\u012d\2\2"+
		"\u0977\u0978\5\u010a\u0086\2\u0978\u097a\3\2\2\2\u0979\u0974\3\2\2\2\u097a"+
		"\u097d\3\2\2\2\u097b\u0979\3\2\2\2\u097b\u097c\3\2\2\2\u097c\u097e\3\2"+
		"\2\2\u097d\u097b\3\2\2\2\u097e\u097f\7\u013a\2\2\u097f\u09a5\3\2\2\2\u0980"+
		"\u0981\7\u0120\2\2\u0981\u0982\7\u0137\2\2\u0982\u0988\5\u010a\u0086\2"+
		"\u0983\u0984\7\u0129\2\2\u0984\u0985\5\u010a\u0086\2\u0985\u0986\7\u012d"+
		"\2\2\u0986\u0987\5\u010a\u0086\2\u0987\u0989\3\2\2\2\u0988\u0983\3\2\2"+
		"\2\u0989\u098a\3\2\2\2\u098a\u0988\3\2\2\2\u098a\u098b\3\2\2\2\u098b\u098e"+
		"\3\2\2\2\u098c\u098d\7\u0129\2\2\u098d\u098f\5\u010a\u0086\2\u098e\u098c"+
		"\3\2\2\2\u098e\u098f\3\2\2\2\u098f\u0990\3\2\2\2\u0990\u0991\7\u013a\2"+
		"\2\u0991\u09a5\3\2\2\2\u0992\u0993\7\u00d4\2\2\u0993\u0994\7\u0137\2\2"+
		"\u0994\u0995\5\u010a\u0086\2\u0995\u0996\7\u013a\2\2\u0996\u09a5\3\2\2"+
		"\2\u0997\u0998\7\u00eb\2\2\u0998\u0999\7\u0137\2\2\u0999\u099a\5\u010a"+
		"\u0086\2\u099a\u099b\7i\2\2\u099b\u099e\5\u010a\u0086\2\u099c\u099d\7"+
		"e\2\2\u099d\u099f\5\u010a\u0086\2\u099e\u099c\3\2\2\2\u099e\u099f\3\2"+
		"\2\2\u099f\u09a0\3\2\2\2\u09a0\u09a1\7\u013a\2\2\u09a1\u09a5\3\2\2\2\u09a2"+
		"\u09a5\7\u0124\2\2\u09a3\u09a5\7\u0126\2\2\u09a4\u08dc\3\2\2\2\u09a4\u08dd"+
		"\3\2\2\2\u09a4\u08e7\3\2\2\2\u09a4\u08ee\3\2\2\2\u09a4\u08ef\3\2\2\2\u09a4"+
		"\u08f4\3\2\2\2\u09a4\u08fc\3\2\2\2\u09a4\u08fd\3\2\2\2\u09a4\u08ff\3\2"+
		"\2\2\u09a4\u0912\3\2\2\2\u09a4\u0925\3\2\2\2\u09a4\u0938\3\2\2\2\u09a4"+
		"\u094b\3\2\2\2\u09a4\u095e\3\2\2\2\u09a4\u0971\3\2\2\2\u09a4\u0980\3\2"+
		"\2\2\u09a4\u0992\3\2\2\2\u09a4\u0997\3\2\2\2\u09a4\u09a2\3\2\2\2\u09a4"+
		"\u09a3\3\2\2\2\u09a5\u0127\3\2\2\2\u09a6\u09a7\5\u0132\u009a\2\u09a7\u09a9"+
		"\7\u0137\2\2\u09a8\u09aa\5\u012a\u0096\2\u09a9\u09a8\3\2\2\2\u09a9\u09aa"+
		"\3\2\2\2\u09aa\u09ab\3\2\2\2\u09ab\u09ac\7\u013a\2\2\u09ac\u0129\3\2\2"+
		"\2\u09ad\u09b2\5\u012c\u0097\2\u09ae\u09af\7\u0129\2\2\u09af\u09b1\5\u012c"+
		"\u0097\2\u09b0\u09ae\3\2\2\2\u09b1\u09b4\3\2\2\2\u09b2\u09b0\3\2\2\2\u09b2"+
		"\u09b3\3\2\2\2\u09b3\u012b\3\2\2\2\u09b4\u09b2\3\2\2\2\u09b5\u09bb\6\u0097"+
		"\r\2\u09b6\u09b7\5\u0132\u009a\2\u09b7\u09b9\7\u012d\2\2\u09b8\u09ba\7"+
		"\u0131\2\2\u09b9\u09b8\3\2\2\2\u09b9\u09ba\3\2\2\2\u09ba\u09bc\3\2\2\2"+
		"\u09bb\u09b6\3\2\2\2\u09bb\u09bc\3\2\2\2\u09bc\u09bd\3\2\2\2\u09bd\u09be"+
		"\5\u010a\u0086\2\u09be\u012d\3\2\2\2\u09bf\u09c0\7<\2\2\u09c0\u09c1\5"+
		"\u0134\u009b\2\u09c1\u012f\3\2\2\2\u09c2\u09c3\7\u00f4\2\2\u09c3\u09c4"+
		"\5\u0134\u009b\2\u09c4\u0131\3\2\2\2\u09c5\u09c8\7\u013e\2\2\u09c6\u09c8"+
		"\5\u0142\u00a2\2\u09c7\u09c5\3\2\2\2\u09c7\u09c6\3\2\2\2\u09c8\u09d0\3"+
		"\2\2\2\u09c9\u09cc\7\6\2\2\u09ca\u09cd\7\u013e\2\2\u09cb\u09cd\5\u0142"+
		"\u00a2\2\u09cc\u09ca\3\2\2\2\u09cc\u09cb\3\2\2\2\u09cd\u09cf\3\2\2\2\u09ce"+
		"\u09c9\3\2\2\2\u09cf\u09d2\3\2\2\2\u09d0\u09ce\3\2\2\2\u09d0\u09d1\3\2"+
		"\2\2\u09d1\u09d5\3\2\2\2\u09d2\u09d0\3\2\2\2\u09d3\u09d5\7\u013f\2\2\u09d4"+
		"\u09c7\3\2\2\2\u09d4\u09d3\3\2\2\2\u09d5\u0133\3\2\2\2\u09d6\u09d9\7\u0140"+
		"\2\2\u09d7\u09d9\7\u0141\2\2\u09d8\u09d6\3\2\2\2\u09d8\u09d7\3\2\2\2\u09d9"+
		"\u0135\3\2\2\2\u09da\u09dc\t\'\2\2\u09db\u09da\3\2\2\2\u09db\u09dc\3\2"+
		"\2\2\u09dc\u09dd\3\2\2\2\u09dd\u09de\7\u0142\2\2\u09de\u0137\3\2\2\2\u09df"+
		"\u09e1\t\'\2\2\u09e0\u09df\3\2\2\2\u09e0\u09e1\3\2\2\2\u09e1\u09e2\3\2"+
		"\2\2\u09e2\u09e3\7\u0143\2\2\u09e3\u0139\3\2\2\2\u09e4\u09e5\t(\2\2\u09e5"+
		"\u013b\3\2\2\2\u09e6\u09e7\7\u00ab\2\2\u09e7\u013d\3\2\2\2\u09e8\u09e9"+
		"\7\7\2\2\u09e9\u013f\3\2\2\2\u09ea\u09eb\7\b\2\2\u09eb\u09ec\7\u013f\2"+
		"\2\u09ec\u0141\3\2\2\2\u09ed\u09ee\t)\2\2\u09ee\u0143\3\2\2\2\u014e\u0149"+
		"\u014c\u0150\u0153\u0158\u015f\u0165\u0167\u0170\u0173\u0175\u0193\u0199"+
		"\u01a9\u01b0\u01b6\u01ba\u01c3\u01c8\u01d0\u01d5\u01de\u01ea\u01ef\u01f2"+
		"\u01fc\u0205\u0213\u0217\u0222\u022d\u0237\u023e\u0245\u0249\u024d\u0252"+
		"\u0256\u025b\u025f\u0263\u0270\u0275\u027b\u0284\u0288\u0290\u0293\u0298"+
		"\u029d\u02a4\u02ab\u02ae\u02b5\u02bb\u02c0\u02c6\u02cb\u02ce\u02d4\u02e2"+
		"\u02ec\u02f2\u02f7\u02fc\u0301\u0305\u030a\u030d\u0317\u0323\u032a\u032d"+
		"\u0339\u033e\u0343\u0346\u034d\u0359\u0366\u0368\u036d\u0370\u037f\u0385"+
		"\u0390\u0393\u039d\u03a4\u03aa\u03b2\u03bc\u03d0\u03d6\u03da\u03df\u03e3"+
		"\u03e8\u03eb\u03f0\u03f3\u0401\u0420\u0422\u0427\u042b\u0430\u0437\u043a"+
		"\u043d\u0442\u0446\u0448\u044f\u0455\u045c\u0462\u0465\u046a\u046e\u0471"+
		"\u0478\u047e\u0481\u048b\u0494\u049b\u04a2\u04a4\u04aa\u04ad\u04b8\u04c1"+
		"\u04c7\u04cd\u04d0\u04d5\u04d8\u04db\u04de\u04e1\u04e7\u04f1\u04fc\u04ff"+
		"\u0506\u050b\u0510\u0514\u051c\u0520\u0525\u0529\u052b\u0530\u0538\u053d"+
		"\u0541\u0549\u0551\u0554\u0557\u055c\u0561\u0568\u056c\u0574\u0579\u057f"+
		"\u0587\u0591\u0596\u0598\u059c\u05a6\u05ac\u05b0\u05b4\u05c0\u05c7\u05d7"+
		"\u05de\u05e2\u05e6\u05ea\u05ef\u05f5\u05fb\u0602\u060f\u0617\u061b\u0625"+
		"\u062a\u0637\u0642\u064a\u064e\u0652\u0656\u0658\u065d\u0660\u0663\u0666"+
		"\u066a\u066d\u0670\u0673\u0676\u067d\u0688\u068c\u068f\u0693\u069a\u069e"+
		"\u06a8\u06b0\u06b6\u06ba\u06c0\u06c9\u06cb\u06ce\u06d3\u06d6\u06e0\u06e5"+
		"\u06ee\u06f3\u06f7\u0700\u0704\u070b\u0714\u071a\u071f\u0725\u072a\u072e"+
		"\u0734\u073f\u0741\u0745\u074c\u0754\u0758\u075b\u075f\u0764\u0769\u0774"+
		"\u077d\u0781\u078a\u078e\u0798\u079d\u07b3\u07b6\u07c9\u07d9\u07db\u07e6"+
		"\u07f5\u0801\u0805\u0810\u0814\u0820\u0824\u082f\u0834\u0839\u083d\u0841"+
		"\u0846\u084a\u084e\u0865\u0867\u0879\u087b\u0883\u0888\u088d\u0892\u089f"+
		"\u08a4\u08a9\u08ae\u08b3\u08b8\u08bd\u08c2\u08c4\u08cb\u08ce\u08d9\u08e3"+
		"\u08eb\u08f4\u08fa\u090b\u090e\u091e\u0921\u0931\u0934\u0944\u0947\u0957"+
		"\u095a\u096a\u096d\u097b\u098a\u098e\u099e\u09a4\u09a9\u09b2\u09b9\u09bb"+
		"\u09c7\u09cc\u09d0\u09d4\u09d8\u09db\u09e0";
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