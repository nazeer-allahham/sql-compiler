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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T_ACTION=6, T_ADD2=7, T_ALL=8, 
		T_ALTER=9, T_AND=10, T_ANSI_NULLS=11, T_ANSI_PADDING=12, T_AS=13, T_ASC=14, 
		T_ASSOCIATE=15, T_AT=16, T_AUTO_INCREMENT=17, T_AVG=18, T_BEGIN=19, T_BETWEEN=20, 
		T_BIGINT=21, T_BINARY_DOUBLE=22, T_BINARY_FLOAT=23, T_BINARY_INTEGER=24, 
		T_BIT=25, T_BODY=26, T_BREAK=27, T_BY=28, T_BYTE=29, T_CALL=30, T_CALLER=31, 
		T_CASCADE=32, T_CASE=33, T_CASESPECIFIC=34, T_CAST=35, T_CHAR=36, T_CHARACTER=37, 
		T_CHARSET=38, T_CLIENT=39, T_CLOSE=40, T_CLUSTERED=41, T_CMP=42, T_COLLECT=43, 
		T_COLLECTION=44, T_COLUMN=45, T_COMMENT=46, T_CONSTANT=47, T_COMMIT=48, 
		T_COMPRESS=49, T_CONCAT=50, T_CONDITION=51, T_CONSTRAINT=52, T_CONTINUE=53, 
		T_COPY=54, T_COUNT=55, T_COUNT_BIG=56, T_CREATE=57, T_CREATION=58, T_CREATOR=59, 
		T_CS=60, T_CURRENT=61, T_CURRENT_SCHEMA=62, T_DATABASE=63, T_DATA=64, 
		T_DATE=65, T_DATETIME=66, T_DAY=67, T_DAYS=68, T_DEC=69, T_DECIMAL=70, 
		T_DECLARE=71, T_DEFAULT=72, T_DEFERRED=73, T_DEFINED=74, T_DEFINER=75, 
		T_DEFINITION=76, T_DELETE=77, T_DELIMITED=78, T_DELIMITER=79, T_DESC=80, 
		T_DIR=81, T_DIRECTORY=82, T_DISTINCT=83, T_DISTRIBUTE=84, T_DO=85, T_DOUBLE=86, 
		T_DROP=87, T_DYNAMIC=88, T_ELSE=89, T_ELSEIF=90, T_ELSIF=91, T_ENABLE=92, 
		T_END=93, T_ENGINE=94, T_ESCAPED=95, T_EXCEPT=96, T_EXEC=97, T_EXECUTE=98, 
		T_EXCEPTION=99, T_EXCLUSIVE=100, T_EXISTS=101, T_EXIT=102, T_FALLBACK=103, 
		T_FALSE=104, T_FIELDS=105, T_FILE=106, T_FILES=107, T_FLOAT=108, T_FOR=109, 
		T_FOREIGN=110, T_FORMAT=111, T_FOUND=112, T_FROM=113, T_FULL=114, T_FUNCTION=115, 
		T_GET=116, T_GLOBAL=117, T_GO=118, T_GROUP=119, T_HANDLER=120, T_HASH=121, 
		T_HAVING=122, T_HDFS=123, T_IDENTITY=124, T_IF=125, T_IGNORE=126, T_IMMEDIATE=127, 
		T_IN=128, T_INCLUDE=129, T_INDEX=130, T_INITRANS=131, T_INNER=132, T_INOUT=133, 
		T_INSERT=134, T_INT=135, T_INT2=136, T_INT4=137, T_INT8=138, T_INTEGER=139, 
		T_INTERSECT=140, T_INTERVAL=141, T_INTO=142, T_INVOKER=143, T_IS=144, 
		T_ISOPEN=145, T_ITEMS=146, T_JOIN=147, T_KEEP=148, T_KEY=149, T_KEYS=150, 
		T_LANGUAGE=151, T_LEAVE=152, T_LEFT=153, T_LIKE=154, T_LIMIT=155, T_LINES=156, 
		T_LOCAL=157, T_LOCATION=158, T_LOCATOR=159, T_LOCATORS=160, T_LOCKS=161, 
		T_LOG=162, T_LOGGED=163, T_LOGGING=164, T_LOOP=165, T_MAP=166, T_MAX=167, 
		T_MAXTRANS=168, T_MERGE=169, T_MICROSECOND=170, T_MICROSECONDS=171, T_MIN=172, 
		T_MULTISET=173, T_NCHAR=174, T_NEW=175, T_NVARCHAR=176, T_NO=177, T_NOCOUNT=178, 
		T_NOCOMPRESS=179, T_NOLOGGING=180, T_NONE=181, T_NOT=182, T_NOTFOUND=183, 
		T_NULL=184, T_NUMERIC=185, T_NUMBER=186, T_OBJECT=187, T_OFF=188, T_ON=189, 
		T_ONLY=190, T_OPEN=191, T_OR=192, T_ORDER=193, T_OUT=194, T_OUTER=195, 
		T_OVER=196, T_OVERWRITE=197, T_OWNER=198, T_PACKAGE=199, T_PARTITION=200, 
		T_PCTFREE=201, T_PCTUSED=202, T_PLS_INTEGER=203, T_PRECISION=204, T_PRESERVE=205, 
		T_PRIMARY=206, T_PROC=207, T_PROCEDURE=208, T_QUALIFY=209, T_QUERY_BAND=210, 
		T_QUIT=211, T_QUOTED_IDENTIFIER=212, T_RAISE=213, T_REAL=214, T_REFERENCES=215, 
		T_REGEXP=216, T_REPLACE=217, T_RESIGNAL=218, T_RESTRICT=219, T_RESULT=220, 
		T_RESULT_SET_LOCATOR=221, T_RETURN=222, T_RETURNS=223, T_REVERSE=224, 
		T_RIGHT=225, T_RLIKE=226, T_ROW=227, T_ROWS=228, T_ROW_COUNT=229, T_RR=230, 
		T_RS=231, T_PWD=232, T_TRIM=233, T_SCHEMA=234, T_SECOND=235, T_SECONDS=236, 
		T_SECURITY=237, T_SEGMENT=238, T_SEL=239, T_SELECT=240, T_SET=241, T_SESSION=242, 
		T_SESSIONS=243, T_SETS=244, T_SHARE=245, T_SIGNAL=246, T_SIMPLE_DOUBLE=247, 
		T_SIMPLE_FLOAT=248, T_SIMPLE_INTEGER=249, T_SMALLDATETIME=250, T_SMALLINT=251, 
		T_SQL=252, T_SQLEXCEPTION=253, T_SQLINSERT=254, T_SQLSTATE=255, T_SQLWARNING=256, 
		T_STATS=257, T_STATISTICS=258, T_STEP=259, T_STORAGE=260, T_STORED=261, 
		T_STRING=262, T_SUBDIR=263, T_SUBSTRING=264, T_SUM=265, T_SUMMARY=266, 
		T_SYS_REFCURSOR=267, T_TABLE=268, T_TABLESPACE=269, T_TEMPORARY=270, T_TERMINATED=271, 
		T_TEXTIMAGE_ON=272, T_THEN=273, T_TIMESTAMP=274, T_TINYINT=275, T_TITLE=276, 
		T_TO=277, T_TOP=278, T_TRANSACTION=279, T_TRUE=280, T_TYPE=281, T_UNION=282, 
		T_UNIQUE=283, T_UPDATE=284, T_UR=285, T_USE=286, T_USING=287, T_VALUE=288, 
		T_VALUES=289, T_VAR=290, T_VARCHAR=291, T_VARCHAR2=292, T_VARYING=293, 
		T_VOLATILE=294, T_WHEN=295, T_WHERE=296, T_WHILE=297, T_WITH=298, T_WITHOUT=299, 
		T_WORK=300, T_XACT_ABORT=301, T_XML=302, T_YES=303, T_ACTIVITY_COUNT=304, 
		T_CUME_DIST=305, T_CURRENT_DATE=306, T_CURRENT_TIMESTAMP=307, T_CURRENT_USER=308, 
		T_DENSE_RANK=309, T_FIRST_VALUE=310, T_LAG=311, T_LAST_VALUE=312, T_LEAD=313, 
		T_MAX_PART_STRING=314, T_MIN_PART_STRING=315, T_MAX_PART_INT=316, T_MIN_PART_INT=317, 
		T_MAX_PART_DATE=318, T_MIN_PART_DATE=319, T_PART_COUNT=320, T_PART_LOC=321, 
		T_RANK=322, T_ROW_NUMBER=323, T_STDEV=324, T_SYSDATE=325, T_VARIANCE=326, 
		T_USER=327, T_ADD=328, T_COLON=329, T_COMMA=330, T_PIPE=331, T_DIV=332, 
		T_DOT2=333, T_EQUAL=334, T_EQUAL2=335, T_NOTEQUAL=336, T_NOTEQUAL2=337, 
		T_GREATER=338, T_GREATEREQUAL=339, T_LESS=340, T_LESSEQUAL=341, T_MUL=342, 
		T_OPEN_B=343, T_OPEN_P=344, T_OPEN_SB=345, T_CLOSE_B=346, T_CLOSE_P=347, 
		T_CLOSE_SB=348, T_SEMICOLON=349, T_SUB=350, L_ID=351, L_S_STRING=352, 
		L_D_STRING=353, L_INT=354, L_DEC=355, L_WS=356, L_M_COMMENT=357, L_S_COMMENT=358, 
		L_FILE=359, L_LABEL=360, T_CURSOR=361;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_begin_end_block = 2, RULE_single_block_stmt = 3, 
		RULE_block_end = 4, RULE_proc_block = 5, RULE_stmt = 6, RULE_semicolon_stmt = 7, 
		RULE_exception_block = 8, RULE_exception_block_item = 9, RULE_null_stmt = 10, 
		RULE_expr_stmt = 11, RULE_assignment_stmt = 12, RULE_assignment_stmt_item = 13, 
		RULE_assignment_stmt_single_item = 14, RULE_assignment_stmt_multiple_item = 15, 
		RULE_assignment_stmt_select_item = 16, RULE_associate_locator_stmt = 17, 
		RULE_break_stmt = 18, RULE_call_stmt = 19, RULE_close_stmt = 20, RULE_declare_stmt = 21, 
		RULE_declare_block = 22, RULE_declare_block_inplace = 23, RULE_declare_stmt_item = 24, 
		RULE_declare_var_item = 25, RULE_declare_condition_item = 26, RULE_declare_cursor_item = 27, 
		RULE_cursor_with_return = 28, RULE_cursor_without_return = 29, RULE_declare_handler_item = 30, 
		RULE_declare_temporary_table_item = 31, RULE_create_table_stmt = 32, RULE_create_local_temp_table_stmt = 33, 
		RULE_create_table_definition = 34, RULE_create_table_columns = 35, RULE_create_table_columns_item = 36, 
		RULE_column_name = 37, RULE_create_table_column_inline_cons = 38, RULE_create_table_column_cons = 39, 
		RULE_create_table_fk_action = 40, RULE_create_table_preoptions = 41, RULE_create_table_preoptions_item = 42, 
		RULE_create_table_preoptions_td_item = 43, RULE_create_table_options = 44, 
		RULE_create_table_options_item = 45, RULE_create_table_options_ora_item = 46, 
		RULE_create_table_options_db2_item = 47, RULE_create_table_options_td_item = 48, 
		RULE_create_table_options_hive_item = 49, RULE_create_table_hive_row_format = 50, 
		RULE_create_table_hive_row_format_fields = 51, RULE_create_table_options_mssql_item = 52, 
		RULE_create_table_options_mysql_item = 53, RULE_dtype = 54, RULE_dtype_len = 55, 
		RULE_dtype_attr = 56, RULE_dtype_default = 57, RULE_create_database_stmt = 58, 
		RULE_create_database_option = 59, RULE_create_function_stmt = 60, RULE_create_function_return = 61, 
		RULE_create_package_stmt = 62, RULE_package_spec = 63, RULE_package_spec_item = 64, 
		RULE_create_package_body_stmt = 65, RULE_package_body = 66, RULE_package_body_item = 67, 
		RULE_create_procedure_stmt = 68, RULE_create_routine_params = 69, RULE_create_routine_param_item = 70, 
		RULE_create_routine_options = 71, RULE_create_routine_option = 72, RULE_exec_stmt = 73, 
		RULE_if_stmt = 74, RULE_if_plsql_stmt = 75, RULE_if_tsql_stmt = 76, RULE_if_bteq_stmt = 77, 
		RULE_elseif_block = 78, RULE_else_block = 79, RULE_exit_stmt = 80, RULE_leave_stmt = 81, 
		RULE_cmp_stmt = 82, RULE_cmp_source = 83, RULE_create_index_stmt = 84, 
		RULE_create_index_col = 85, RULE_index_storage_clause = 86, RULE_index_mssql_storage_clause = 87, 
		RULE_quit_stmt = 88, RULE_return_stmt = 89, RULE_set_session_option = 90, 
		RULE_set_current_schema_option = 91, RULE_set_mssql_session_option = 92, 
		RULE_set_teradata_session_option = 93, RULE_for_range_stmt = 94, RULE_label = 95, 
		RULE_using_clause = 96, RULE_select_stmt = 97, RULE_cte_select_stmt = 98, 
		RULE_cte_select_stmt_item = 99, RULE_cte_select_cols = 100, RULE_fullselect_stmt = 101, 
		RULE_fullselect_stmt_item = 102, RULE_fullselect_set_clause = 103, RULE_subselect_stmt = 104, 
		RULE_select_list = 105, RULE_select_list_set = 106, RULE_select_list_limit = 107, 
		RULE_select_list_item = 108, RULE_select_list_alias = 109, RULE_select_list_asterisk = 110, 
		RULE_into_clause = 111, RULE_from_clause = 112, RULE_from_table_clause = 113, 
		RULE_from_table_name_clause = 114, RULE_from_subselect_clause = 115, RULE_from_join_clause = 116, 
		RULE_from_join_type_clause = 117, RULE_from_table_values_clause = 118, 
		RULE_from_table_values_row = 119, RULE_from_alias_clause = 120, RULE_table_name = 121, 
		RULE_where_clause = 122, RULE_group_by_clause = 123, RULE_having_clause = 124, 
		RULE_qualify_clause = 125, RULE_order_by_clause = 126, RULE_select_options = 127, 
		RULE_select_options_item = 128, RULE_non_balanced_expr = 129, RULE_bool_expr = 130, 
		RULE_bool_expr_atom = 131, RULE_bool_expr_unary = 132, RULE_bool_expr_single_in = 133, 
		RULE_bool_expr_multi_in = 134, RULE_bool_expr_binary = 135, RULE_bool_expr_logical_operator = 136, 
		RULE_bool_expr_binary_operator = 137, RULE_expr = 138, RULE_expr_atom = 139, 
		RULE_expr_interval = 140, RULE_interval_item = 141, RULE_expr_concat = 142, 
		RULE_expr_concat_item = 143, RULE_expr_case = 144, RULE_expr_case_simple = 145, 
		RULE_expr_case_searched = 146, RULE_expr_cursor_attribute = 147, RULE_expr_agg_window_func = 148, 
		RULE_expr_func_all_distinct = 149, RULE_expr_func_over_clause = 150, RULE_expr_func_partition_by_clause = 151, 
		RULE_expr_spec_func = 152, RULE_expr_func = 153, RULE_expr_func_params = 154, 
		RULE_func_param = 155, RULE_date_literal = 156, RULE_timestamp_literal = 157, 
		RULE_ident = 158, RULE_string = 159, RULE_int_number = 160, RULE_dec_number = 161, 
		RULE_bool_literal = 162, RULE_null_const = 163, RULE_new_line = 164, RULE_non_reserved_words = 165;
	public static final String[] ruleNames = {
		"program", "block", "begin_end_block", "single_block_stmt", "block_end", 
		"proc_block", "stmt", "semicolon_stmt", "exception_block", "exception_block_item", 
		"null_stmt", "expr_stmt", "assignment_stmt", "assignment_stmt_item", "assignment_stmt_single_item", 
		"assignment_stmt_multiple_item", "assignment_stmt_select_item", "associate_locator_stmt", 
		"break_stmt", "call_stmt", "close_stmt", "declare_stmt", "declare_block", 
		"declare_block_inplace", "declare_stmt_item", "declare_var_item", "declare_condition_item", 
		"declare_cursor_item", "cursor_with_return", "cursor_without_return", 
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
		"index_mssql_storage_clause", "quit_stmt", "return_stmt", "set_session_option", 
		"set_current_schema_option", "set_mssql_session_option", "set_teradata_session_option", 
		"for_range_stmt", "label", "using_clause", "select_stmt", "cte_select_stmt", 
		"cte_select_stmt_item", "cte_select_cols", "fullselect_stmt", "fullselect_stmt_item", 
		"fullselect_set_clause", "subselect_stmt", "select_list", "select_list_set", 
		"select_list_limit", "select_list_item", "select_list_alias", "select_list_asterisk", 
		"into_clause", "from_clause", "from_table_clause", "from_table_name_clause", 
		"from_subselect_clause", "from_join_clause", "from_join_type_clause", 
		"from_table_values_clause", "from_table_values_row", "from_alias_clause", 
		"table_name", "where_clause", "group_by_clause", "having_clause", "qualify_clause", 
		"order_by_clause", "select_options", "select_options_item", "non_balanced_expr", 
		"bool_expr", "bool_expr_atom", "bool_expr_unary", "bool_expr_single_in", 
		"bool_expr_multi_in", "bool_expr_binary", "bool_expr_logical_operator", 
		"bool_expr_binary_operator", "expr", "expr_atom", "expr_interval", "interval_item", 
		"expr_concat", "expr_concat_item", "expr_case", "expr_case_simple", "expr_case_searched", 
		"expr_cursor_attribute", "expr_agg_window_func", "expr_func_all_distinct", 
		"expr_func_over_clause", "expr_func_partition_by_clause", "expr_spec_func", 
		"expr_func", "expr_func_params", "func_param", "date_literal", "timestamp_literal", 
		"ident", "string", "int_number", "dec_number", "bool_literal", "null_const", 
		"new_line", "non_reserved_words"
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
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'+'", "':'", "','", "'||'", "'/'", "'..'", 
		"'='", "'=='", "'<>'", "'!='", "'>'", "'>='", "'<'", "'<='", "'*'", "'{'", 
		"'('", "'['", "'}'", "')'", "']'", "';'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "T_ACTION", "T_ADD2", "T_ALL", "T_ALTER", 
		"T_AND", "T_ANSI_NULLS", "T_ANSI_PADDING", "T_AS", "T_ASC", "T_ASSOCIATE", 
		"T_AT", "T_AUTO_INCREMENT", "T_AVG", "T_BEGIN", "T_BETWEEN", "T_BIGINT", 
		"T_BINARY_DOUBLE", "T_BINARY_FLOAT", "T_BINARY_INTEGER", "T_BIT", "T_BODY", 
		"T_BREAK", "T_BY", "T_BYTE", "T_CALL", "T_CALLER", "T_CASCADE", "T_CASE", 
		"T_CASESPECIFIC", "T_CAST", "T_CHAR", "T_CHARACTER", "T_CHARSET", "T_CLIENT", 
		"T_CLOSE", "T_CLUSTERED", "T_CMP", "T_COLLECT", "T_COLLECTION", "T_COLUMN", 
		"T_COMMENT", "T_CONSTANT", "T_COMMIT", "T_COMPRESS", "T_CONCAT", "T_CONDITION", 
		"T_CONSTRAINT", "T_CONTINUE", "T_COPY", "T_COUNT", "T_COUNT_BIG", "T_CREATE", 
		"T_CREATION", "T_CREATOR", "T_CS", "T_CURRENT", "T_CURRENT_SCHEMA", "T_DATABASE", 
		"T_DATA", "T_DATE", "T_DATETIME", "T_DAY", "T_DAYS", "T_DEC", "T_DECIMAL", 
		"T_DECLARE", "T_DEFAULT", "T_DEFERRED", "T_DEFINED", "T_DEFINER", "T_DEFINITION", 
		"T_DELETE", "T_DELIMITED", "T_DELIMITER", "T_DESC", "T_DIR", "T_DIRECTORY", 
		"T_DISTINCT", "T_DISTRIBUTE", "T_DO", "T_DOUBLE", "T_DROP", "T_DYNAMIC", 
		"T_ELSE", "T_ELSEIF", "T_ELSIF", "T_ENABLE", "T_END", "T_ENGINE", "T_ESCAPED", 
		"T_EXCEPT", "T_EXEC", "T_EXECUTE", "T_EXCEPTION", "T_EXCLUSIVE", "T_EXISTS", 
		"T_EXIT", "T_FALLBACK", "T_FALSE", "T_FIELDS", "T_FILE", "T_FILES", "T_FLOAT", 
		"T_FOR", "T_FOREIGN", "T_FORMAT", "T_FOUND", "T_FROM", "T_FULL", "T_FUNCTION", 
		"T_GET", "T_GLOBAL", "T_GO", "T_GROUP", "T_HANDLER", "T_HASH", "T_HAVING", 
		"T_HDFS", "T_IDENTITY", "T_IF", "T_IGNORE", "T_IMMEDIATE", "T_IN", "T_INCLUDE", 
		"T_INDEX", "T_INITRANS", "T_INNER", "T_INOUT", "T_INSERT", "T_INT", "T_INT2", 
		"T_INT4", "T_INT8", "T_INTEGER", "T_INTERSECT", "T_INTERVAL", "T_INTO", 
		"T_INVOKER", "T_IS", "T_ISOPEN", "T_ITEMS", "T_JOIN", "T_KEEP", "T_KEY", 
		"T_KEYS", "T_LANGUAGE", "T_LEAVE", "T_LEFT", "T_LIKE", "T_LIMIT", "T_LINES", 
		"T_LOCAL", "T_LOCATION", "T_LOCATOR", "T_LOCATORS", "T_LOCKS", "T_LOG", 
		"T_LOGGED", "T_LOGGING", "T_LOOP", "T_MAP", "T_MAX", "T_MAXTRANS", "T_MERGE", 
		"T_MICROSECOND", "T_MICROSECONDS", "T_MIN", "T_MULTISET", "T_NCHAR", "T_NEW", 
		"T_NVARCHAR", "T_NO", "T_NOCOUNT", "T_NOCOMPRESS", "T_NOLOGGING", "T_NONE", 
		"T_NOT", "T_NOTFOUND", "T_NULL", "T_NUMERIC", "T_NUMBER", "T_OBJECT", 
		"T_OFF", "T_ON", "T_ONLY", "T_OPEN", "T_OR", "T_ORDER", "T_OUT", "T_OUTER", 
		"T_OVER", "T_OVERWRITE", "T_OWNER", "T_PACKAGE", "T_PARTITION", "T_PCTFREE", 
		"T_PCTUSED", "T_PLS_INTEGER", "T_PRECISION", "T_PRESERVE", "T_PRIMARY", 
		"T_PROC", "T_PROCEDURE", "T_QUALIFY", "T_QUERY_BAND", "T_QUIT", "T_QUOTED_IDENTIFIER", 
		"T_RAISE", "T_REAL", "T_REFERENCES", "T_REGEXP", "T_REPLACE", "T_RESIGNAL", 
		"T_RESTRICT", "T_RESULT", "T_RESULT_SET_LOCATOR", "T_RETURN", "T_RETURNS", 
		"T_REVERSE", "T_RIGHT", "T_RLIKE", "T_ROW", "T_ROWS", "T_ROW_COUNT", "T_RR", 
		"T_RS", "T_PWD", "T_TRIM", "T_SCHEMA", "T_SECOND", "T_SECONDS", "T_SECURITY", 
		"T_SEGMENT", "T_SEL", "T_SELECT", "T_SET", "T_SESSION", "T_SESSIONS", 
		"T_SETS", "T_SHARE", "T_SIGNAL", "T_SIMPLE_DOUBLE", "T_SIMPLE_FLOAT", 
		"T_SIMPLE_INTEGER", "T_SMALLDATETIME", "T_SMALLINT", "T_SQL", "T_SQLEXCEPTION", 
		"T_SQLINSERT", "T_SQLSTATE", "T_SQLWARNING", "T_STATS", "T_STATISTICS", 
		"T_STEP", "T_STORAGE", "T_STORED", "T_STRING", "T_SUBDIR", "T_SUBSTRING", 
		"T_SUM", "T_SUMMARY", "T_SYS_REFCURSOR", "T_TABLE", "T_TABLESPACE", "T_TEMPORARY", 
		"T_TERMINATED", "T_TEXTIMAGE_ON", "T_THEN", "T_TIMESTAMP", "T_TINYINT", 
		"T_TITLE", "T_TO", "T_TOP", "T_TRANSACTION", "T_TRUE", "T_TYPE", "T_UNION", 
		"T_UNIQUE", "T_UPDATE", "T_UR", "T_USE", "T_USING", "T_VALUE", "T_VALUES", 
		"T_VAR", "T_VARCHAR", "T_VARCHAR2", "T_VARYING", "T_VOLATILE", "T_WHEN", 
		"T_WHERE", "T_WHILE", "T_WITH", "T_WITHOUT", "T_WORK", "T_XACT_ABORT", 
		"T_XML", "T_YES", "T_ACTIVITY_COUNT", "T_CUME_DIST", "T_CURRENT_DATE", 
		"T_CURRENT_TIMESTAMP", "T_CURRENT_USER", "T_DENSE_RANK", "T_FIRST_VALUE", 
		"T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", "T_MIN_PART_STRING", 
		"T_MAX_PART_INT", "T_MIN_PART_INT", "T_MAX_PART_DATE", "T_MIN_PART_DATE", 
		"T_PART_COUNT", "T_PART_LOC", "T_RANK", "T_ROW_NUMBER", "T_STDEV", "T_SYSDATE", 
		"T_VARIANCE", "T_USER", "T_ADD", "T_COLON", "T_COMMA", "T_PIPE", "T_DIV", 
		"T_DOT2", "T_EQUAL", "T_EQUAL2", "T_NOTEQUAL", "T_NOTEQUAL2", "T_GREATER", 
		"T_GREATEREQUAL", "T_LESS", "T_LESSEQUAL", "T_MUL", "T_OPEN_B", "T_OPEN_P", 
		"T_OPEN_SB", "T_CLOSE_B", "T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON", "T_SUB", 
		"L_ID", "L_S_STRING", "L_D_STRING", "L_INT", "L_DEC", "L_WS", "L_M_COMMENT", 
		"L_S_COMMENT", "L_FILE", "L_LABEL", "T_CURSOR"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			block();
			setState(333);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(337);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(335);
						begin_end_block();
						}
						break;
					case 2:
						{
						setState(336);
						stmt();
						}
						break;
					}
					setState(340);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(339);
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
				setState(344); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBegin_end_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_end_blockContext begin_end_block() throws RecognitionException {
		Begin_end_blockContext _localctx = new Begin_end_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_begin_end_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(346);
				declare_block();
				}
			}

			setState(349);
			match(T_BEGIN);
			setState(350);
			block();
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(351);
				exception_block();
				}
				break;
			}
			setState(354);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSingle_block_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_block_stmtContext single_block_stmt() throws RecognitionException {
		Single_block_stmtContext _localctx = new Single_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_block_stmt);
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(T_BEGIN);
				setState(357);
				block();
				setState(359);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(358);
					exception_block();
					}
					break;
				}
				setState(361);
				block_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				stmt();
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(364);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBlock_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_endContext block_end() throws RecognitionException {
		Block_endContext _localctx = new Block_endContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(370);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitProc_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_blockContext proc_block() throws RecognitionException {
		Proc_blockContext _localctx = new Proc_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proc_block);
		try {
			int _alt;
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				begin_end_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(373);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(376); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(379);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(378);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				associate_locator_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				break_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				call_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(387);
				close_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(388);
				cmp_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(389);
				create_database_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(390);
				create_function_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(391);
				create_index_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(392);
				create_local_temp_table_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(393);
				create_package_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(394);
				create_package_body_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(395);
				create_procedure_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(396);
				create_table_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(397);
				declare_stmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(398);
				exec_stmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(399);
				exit_stmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(400);
				for_range_stmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(401);
				if_stmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(402);
				leave_stmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(403);
				quit_stmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(404);
				return_stmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(405);
				select_stmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(406);
				label();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(407);
				null_stmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(408);
				expr_stmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(409);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSemicolon_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Semicolon_stmtContext semicolon_stmt() throws RecognitionException {
		Semicolon_stmtContext _localctx = new Semicolon_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_semicolon_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitException_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_blockContext exception_block() throws RecognitionException {
		Exception_blockContext _localctx = new Exception_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exception_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(T_EXCEPTION);
			setState(416); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(415);
					exception_block_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(418); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitException_block_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_block_itemContext exception_block_item() throws RecognitionException {
		Exception_block_itemContext _localctx = new Exception_block_itemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exception_block_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(T_WHEN);
			setState(421);
			match(L_ID);
			setState(422);
			match(T_THEN);
			setState(423);
			block();
			setState(424);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNull_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_stmtContext null_stmt() throws RecognitionException {
		Null_stmtContext _localctx = new Null_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_null_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("GO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"GO\")");
			setState(429);
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
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public Set_session_optionContext set_session_option() {
			return getRuleContext(Set_session_optionContext.class,0);
		}
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAssignment_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment_stmt);
		try {
			int _alt;
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(T_SET);
				setState(432);
				set_session_option();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(433);
					match(T_SET);
					}
					break;
				}
				setState(436);
				assignment_stmt_item();
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(437);
						match(T_COMMA);
						setState(438);
						assignment_stmt_item();
						}
						} 
					}
					setState(443);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAssignment_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_itemContext assignment_stmt_item() throws RecognitionException {
		Assignment_stmt_itemContext _localctx = new Assignment_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment_stmt_item);
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				assignment_stmt_single_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				assignment_stmt_multiple_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAssignment_stmt_single_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_single_itemContext assignment_stmt_single_item() throws RecognitionException {
		Assignment_stmt_single_itemContext _localctx = new Assignment_stmt_single_itemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment_stmt_single_item);
		int _la;
		try {
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
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
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
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
			case T_DELIMITER:
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
			case T_FILE:
			case T_FILES:
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
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
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
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
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
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
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
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
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
			case T_TRANSACTION:
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
			case T_WITHOUT:
			case T_XACT_ABORT:
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
				setState(451);
				ident();
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(452);
					match(T_COLON);
					}
				}

				setState(455);
				match(T_EQUAL);
				setState(456);
				expr(0);
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				match(T_OPEN_P);
				setState(459);
				ident();
				setState(460);
				match(T_CLOSE_P);
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(461);
					match(T_COLON);
					}
				}

				setState(464);
				match(T_EQUAL);
				setState(465);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAssignment_stmt_multiple_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() throws RecognitionException {
		Assignment_stmt_multiple_itemContext _localctx = new Assignment_stmt_multiple_itemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment_stmt_multiple_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(T_OPEN_P);
			setState(470);
			ident();
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(471);
				match(T_COMMA);
				setState(472);
				ident();
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
			match(T_CLOSE_P);
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(479);
				match(T_COLON);
				}
			}

			setState(482);
			match(T_EQUAL);
			setState(483);
			match(T_OPEN_P);
			setState(484);
			expr(0);
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(485);
				match(T_COMMA);
				setState(486);
				expr(0);
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAssignment_stmt_select_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_select_itemContext assignment_stmt_select_item() throws RecognitionException {
		Assignment_stmt_select_itemContext _localctx = new Assignment_stmt_select_itemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment_stmt_select_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
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
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
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
			case T_DELIMITER:
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
			case T_FILE:
			case T_FILES:
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
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
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
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
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
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
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
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
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
			case T_TRANSACTION:
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
			case T_WITHOUT:
			case T_XACT_ABORT:
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
				{
				setState(494);
				ident();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(495);
				match(T_OPEN_P);
				setState(496);
				ident();
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(497);
					match(T_COMMA);
					setState(498);
					ident();
					}
					}
					setState(503);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(504);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(508);
				match(T_COLON);
				}
			}

			setState(511);
			match(T_EQUAL);
			setState(512);
			match(T_OPEN_P);
			setState(513);
			select_stmt();
			setState(514);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAssociate_locator_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Associate_locator_stmtContext associate_locator_stmt() throws RecognitionException {
		Associate_locator_stmtContext _localctx = new Associate_locator_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_associate_locator_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(T_ASSOCIATE);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_RESULT) {
				{
				setState(517);
				match(T_RESULT);
				setState(518);
				match(T_SET);
				}
			}

			setState(521);
			_la = _input.LA(1);
			if ( !(_la==T_LOCATOR || _la==T_LOCATORS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(522);
			match(T_OPEN_P);
			setState(523);
			ident();
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(524);
				match(T_COMMA);
				setState(525);
				ident();
				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(531);
			match(T_CLOSE_P);
			setState(532);
			match(T_WITH);
			setState(533);
			match(T_PROCEDURE);
			setState(534);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_stmtContext call_stmt() throws RecognitionException {
		Call_stmtContext _localctx = new Call_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_call_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(T_CALL);
			setState(539);
			ident();
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(540);
				match(T_OPEN_P);
				setState(542);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(541);
					expr_func_params();
					}
					break;
				}
				setState(544);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(545);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitClose_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_stmtContext close_stmt() throws RecognitionException {
		Close_stmtContext _localctx = new Close_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_close_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(T_CLOSE);
			setState(549);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmtContext declare_stmt() throws RecognitionException {
		Declare_stmtContext _localctx = new Declare_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declare_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(T_DECLARE);
			setState(552);
			declare_stmt_item();
			setState(557);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(553);
					match(T_COMMA);
					setState(554);
					declare_stmt_item();
					}
					} 
				}
				setState(559);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_blockContext declare_block() throws RecognitionException {
		Declare_blockContext _localctx = new Declare_blockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declare_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(T_DECLARE);
			setState(561);
			declare_stmt_item();
			setState(562);
			match(T_SEMICOLON);
			setState(568);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(563);
					declare_stmt_item();
					setState(564);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(570);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_block_inplace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_block_inplaceContext declare_block_inplace() throws RecognitionException {
		Declare_block_inplaceContext _localctx = new Declare_block_inplaceContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declare_block_inplace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			declare_stmt_item();
			setState(572);
			match(T_SEMICOLON);
			setState(578);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(573);
					declare_stmt_item();
					setState(574);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		public Declare_cursor_itemContext declare_cursor_item() {
			return getRuleContext(Declare_cursor_itemContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmt_itemContext declare_stmt_item() throws RecognitionException {
		Declare_stmt_itemContext _localctx = new Declare_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declare_stmt_item);
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				declare_cursor_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				declare_condition_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				declare_handler_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(584);
				declare_var_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(585);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_var_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_var_itemContext declare_var_item() throws RecognitionException {
		Declare_var_itemContext _localctx = new Declare_var_itemContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declare_var_item);
		int _la;
		try {
			int _alt;
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				ident();
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(589);
					match(T_COMMA);
					setState(590);
					ident();
					}
					}
					setState(595);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(597);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(596);
					match(T_AS);
					}
					break;
				}
				setState(599);
				dtype();
				setState(601);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(600);
					dtype_len();
					}
					break;
				}
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(603);
						dtype_attr();
						}
						} 
					}
					setState(608);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(610);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(609);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				ident();
				setState(613);
				match(T_CONSTANT);
				setState(615);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(614);
					match(T_AS);
					}
					break;
				}
				setState(617);
				dtype();
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(618);
					dtype_len();
					}
				}

				setState(621);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_condition_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_condition_itemContext declare_condition_item() throws RecognitionException {
		Declare_condition_itemContext _localctx = new Declare_condition_itemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declare_condition_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			ident();
			setState(626);
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

	public static class Declare_cursor_itemContext extends ParserRuleContext {
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_CURSOR() { return getToken(HplsqlParser.T_CURSOR, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Cursor_with_returnContext cursor_with_return() {
			return getRuleContext(Cursor_with_returnContext.class,0);
		}
		public Cursor_without_returnContext cursor_without_return() {
			return getRuleContext(Cursor_without_returnContext.class,0);
		}
		public Declare_cursor_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_cursor_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterDeclare_cursor_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitDeclare_cursor_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_cursor_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_cursor_itemContext declare_cursor_item() throws RecognitionException {
		Declare_cursor_itemContext _localctx = new Declare_cursor_itemContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declare_cursor_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURSOR:
				{
				setState(628);
				match(T_CURSOR);
				setState(629);
				ident();
				}
				break;
			case T_ACTION:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
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
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
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
			case T_DELIMITER:
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
			case T_FILE:
			case T_FILES:
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
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
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
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
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
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
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
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
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
			case T_TRANSACTION:
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
			case T_WITHOUT:
			case T_XACT_ABORT:
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
				{
				setState(630);
				ident();
				setState(631);
				match(T_CURSOR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_WITH:
				{
				setState(635);
				cursor_with_return();
				}
				break;
			case T_WITHOUT:
				{
				setState(636);
				cursor_without_return();
				}
				break;
			case T_AS:
			case T_FOR:
			case T_IS:
				break;
			default:
				break;
			}
			setState(639);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_FOR || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(640);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(641);
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

	public static class Cursor_with_returnContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public TerminalNode T_ONLY() { return getToken(HplsqlParser.T_ONLY, 0); }
		public TerminalNode T_TO() { return getToken(HplsqlParser.T_TO, 0); }
		public TerminalNode T_CALLER() { return getToken(HplsqlParser.T_CALLER, 0); }
		public TerminalNode T_CLIENT() { return getToken(HplsqlParser.T_CLIENT, 0); }
		public Cursor_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_with_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCursor_with_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCursor_with_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCursor_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_with_returnContext cursor_with_return() throws RecognitionException {
		Cursor_with_returnContext _localctx = new Cursor_with_returnContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cursor_with_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(T_WITH);
			setState(645);
			match(T_RETURN);
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ONLY) {
				{
				setState(646);
				match(T_ONLY);
				}
			}

			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TO) {
				{
				setState(649);
				match(T_TO);
				setState(650);
				_la = _input.LA(1);
				if ( !(_la==T_CALLER || _la==T_CLIENT) ) {
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

	public static class Cursor_without_returnContext extends ParserRuleContext {
		public TerminalNode T_WITHOUT() { return getToken(HplsqlParser.T_WITHOUT, 0); }
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public Cursor_without_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_without_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterCursor_without_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitCursor_without_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCursor_without_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_without_returnContext cursor_without_return() throws RecognitionException {
		Cursor_without_returnContext _localctx = new Cursor_without_returnContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cursor_without_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(T_WITHOUT);
			setState(654);
			match(T_RETURN);
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_handler_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_handler_itemContext declare_handler_item() throws RecognitionException {
		Declare_handler_itemContext _localctx = new Declare_handler_itemContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_declare_handler_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			_la = _input.LA(1);
			if ( !(_la==T_CONTINUE || _la==T_EXIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(657);
			match(T_HANDLER);
			setState(658);
			match(T_FOR);
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(659);
				match(T_SQLEXCEPTION);
				}
				break;
			case 2:
				{
				setState(660);
				match(T_SQLWARNING);
				}
				break;
			case 3:
				{
				setState(661);
				match(T_NOT);
				setState(662);
				match(T_FOUND);
				}
				break;
			case 4:
				{
				setState(663);
				ident();
				}
				break;
			}
			setState(666);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_temporary_table_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_temporary_table_itemContext declare_temporary_table_item() throws RecognitionException {
		Declare_temporary_table_itemContext _localctx = new Declare_temporary_table_itemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declare_temporary_table_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_GLOBAL) {
				{
				setState(668);
				match(T_GLOBAL);
				}
			}

			setState(671);
			match(T_TEMPORARY);
			setState(672);
			match(T_TABLE);
			setState(673);
			ident();
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(674);
				create_table_preoptions();
				}
			}

			setState(677);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(T_CREATE);
			setState(680);
			match(T_TABLE);
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(681);
				match(T_IF);
				setState(682);
				match(T_NOT);
				setState(683);
				match(T_EXISTS);
				}
				break;
			}
			setState(686);
			table_name();
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(687);
				create_table_preoptions();
				}
			}

			setState(690);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_local_temp_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_local_temp_table_stmtContext create_local_temp_table_stmt() throws RecognitionException {
		Create_local_temp_table_stmtContext _localctx = new Create_local_temp_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_create_local_temp_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(T_CREATE);
			setState(699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(693);
				match(T_LOCAL);
				setState(694);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(695);
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

				setState(698);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(701);
			match(T_TABLE);
			setState(702);
			ident();
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(703);
				create_table_preoptions();
				}
			}

			setState(706);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_definitionContext create_table_definition() throws RecognitionException {
		Create_table_definitionContext _localctx = new Create_table_definitionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_create_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(708);
					match(T_AS);
					}
				}

				setState(711);
				match(T_OPEN_P);
				setState(712);
				select_stmt();
				setState(713);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(715);
					match(T_AS);
					}
				}

				setState(718);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(719);
				match(T_OPEN_P);
				setState(720);
				create_table_columns();
				setState(721);
				match(T_CLOSE_P);
				}
				break;
			}
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(725);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_columns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columnsContext create_table_columns() throws RecognitionException {
		Create_table_columnsContext _localctx = new Create_table_columnsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_create_table_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			create_table_columns_item();
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(729);
				match(T_COMMA);
				setState(730);
				create_table_columns_item();
				}
				}
				setState(735);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_columns_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columns_itemContext create_table_columns_item() throws RecognitionException {
		Create_table_columns_itemContext _localctx = new Create_table_columns_itemContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_create_table_columns_item);
		int _la;
		try {
			int _alt;
			setState(758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				column_name();
				setState(737);
				dtype();
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(738);
					dtype_len();
					}
				}

				setState(744);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(741);
						dtype_attr();
						}
						} 
					}
					setState(746);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T_DEFAULT - 72)) | (1L << (T_ENABLE - 72)) | (1L << (T_IDENTITY - 72)))) != 0) || ((((_la - 182)) & ~0x3f) == 0 && ((1L << (_la - 182)) & ((1L << (T_NOT - 182)) | (1L << (T_NULL - 182)) | (1L << (T_PRIMARY - 182)) | (1L << (T_REFERENCES - 182)))) != 0) || ((((_la - 283)) & ~0x3f) == 0 && ((1L << (_la - 283)) & ((1L << (T_UNIQUE - 283)) | (1L << (T_WITH - 283)) | (1L << (T_COLON - 283)) | (1L << (T_EQUAL - 283)))) != 0)) {
					{
					{
					setState(747);
					create_table_column_inline_cons();
					}
					}
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(753);
					match(T_CONSTRAINT);
					setState(754);
					ident();
					}
				}

				setState(757);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_column_inline_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_inline_consContext create_table_column_inline_cons() throws RecognitionException {
		Create_table_column_inline_consContext _localctx = new Create_table_column_inline_consContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_create_table_column_inline_cons);
		int _la;
		try {
			setState(794);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(763);
					match(T_NOT);
					}
				}

				setState(766);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(767);
				match(T_PRIMARY);
				setState(768);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(769);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(770);
				match(T_REFERENCES);
				setState(771);
				table_name();
				setState(772);
				match(T_OPEN_P);
				setState(773);
				ident();
				setState(774);
				match(T_CLOSE_P);
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(775);
					create_table_fk_action();
					}
					}
					setState(780);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(781);
				match(T_IDENTITY);
				setState(782);
				match(T_OPEN_P);
				setState(783);
				match(L_INT);
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(784);
					match(T_COMMA);
					setState(785);
					match(L_INT);
					}
					}
					setState(790);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(791);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(792);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(793);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_column_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_consContext create_table_column_cons() throws RecognitionException {
		Create_table_column_consContext _localctx = new Create_table_column_consContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_create_table_column_cons);
		int _la;
		try {
			setState(853);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				match(T_PRIMARY);
				setState(797);
				match(T_KEY);
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(798);
					match(T_CLUSTERED);
					}
				}

				setState(801);
				match(T_OPEN_P);
				setState(802);
				ident();
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(803);
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

				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(806);
					match(T_COMMA);
					setState(807);
					ident();
					setState(809);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(808);
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
					setState(815);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(816);
				match(T_CLOSE_P);
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(817);
					match(T_ENABLE);
					}
				}

				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(820);
					index_storage_clause();
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(823);
				match(T_FOREIGN);
				setState(824);
				match(T_KEY);
				setState(825);
				match(T_OPEN_P);
				setState(826);
				ident();
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(827);
					match(T_COMMA);
					setState(828);
					ident();
					}
					}
					setState(833);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(834);
				match(T_CLOSE_P);
				setState(835);
				match(T_REFERENCES);
				setState(836);
				table_name();
				setState(837);
				match(T_OPEN_P);
				setState(838);
				ident();
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(839);
					match(T_COMMA);
					setState(840);
					ident();
					}
					}
					setState(845);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(846);
				match(T_CLOSE_P);
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(847);
					create_table_fk_action();
					}
					}
					setState(852);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_fk_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_fk_actionContext create_table_fk_action() throws RecognitionException {
		Create_table_fk_actionContext _localctx = new Create_table_fk_actionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_create_table_fk_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(T_ON);
			setState(856);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(857);
				match(T_NO);
				setState(858);
				match(T_ACTION);
				}
				break;
			case 2:
				{
				setState(859);
				match(T_RESTRICT);
				}
				break;
			case 3:
				{
				setState(860);
				match(T_SET);
				setState(861);
				match(T_NULL);
				}
				break;
			case 4:
				{
				setState(862);
				match(T_SET);
				setState(863);
				match(T_DEFAULT);
				}
				break;
			case 5:
				{
				setState(864);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_preoptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptionsContext create_table_preoptions() throws RecognitionException {
		Create_table_preoptionsContext _localctx = new Create_table_preoptionsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_create_table_preoptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(867);
				create_table_preoptions_item();
				}
				}
				setState(870); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_preoptions_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_itemContext create_table_preoptions_item() throws RecognitionException {
		Create_table_preoptions_itemContext _localctx = new Create_table_preoptions_itemContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_create_table_preoptions_item);
		try {
			setState(875);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				match(T_COMMA);
				setState(873);
				create_table_preoptions_td_item();
				}
				break;
			case T_ROW:
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_preoptions_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_td_itemContext create_table_preoptions_td_item() throws RecognitionException {
		Create_table_preoptions_td_itemContext _localctx = new Create_table_preoptions_td_itemContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_create_table_preoptions_td_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NO) {
				{
				setState(877);
				match(T_NO);
				}
			}

			setState(880);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_optionsContext create_table_options() throws RecognitionException {
		Create_table_optionsContext _localctx = new Create_table_optionsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_create_table_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(883); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(882);
					create_table_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(885); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_itemContext create_table_options_item() throws RecognitionException {
		Create_table_options_itemContext _localctx = new Create_table_options_itemContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_create_table_options_item);
		int _la;
		try {
			setState(897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(887);
				match(T_ON);
				setState(888);
				match(T_COMMIT);
				setState(889);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(890);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
				create_table_options_ora_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(892);
				create_table_options_db2_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(893);
				create_table_options_td_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(894);
				create_table_options_hive_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(895);
				create_table_options_mssql_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(896);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_ora_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_ora_itemContext create_table_options_ora_item() throws RecognitionException {
		Create_table_options_ora_itemContext _localctx = new Create_table_options_ora_itemContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_create_table_options_ora_item);
		int _la;
		try {
			setState(917);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(899);
				match(T_SEGMENT);
				setState(900);
				match(T_CREATION);
				setState(901);
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
				setState(902);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(903);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(904);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(905);
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
				setState(906);
				match(T_STORAGE);
				setState(907);
				match(T_OPEN_P);
				setState(910); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(910);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T_ACTION:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
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
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLIENT:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECT:
					case T_COLLECTION:
					case T_COLUMN:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COPY:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_CURRENT_SCHEMA:
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
					case T_DELIMITER:
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
					case T_FILE:
					case T_FILES:
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
					case T_IGNORE:
					case T_IMMEDIATE:
					case T_IN:
					case T_INCLUDE:
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
					case T_NEW:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOUNT:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NONE:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_OBJECT:
					case T_OFF:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_ORDER:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OVERWRITE:
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
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
					case T_RAISE:
					case T_REAL:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESIGNAL:
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
					case T_PWD:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLINSERT:
					case T_SQLSTATE:
					case T_SQLWARNING:
					case T_STATS:
					case T_STATISTICS:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_STRING:
					case T_SUBDIR:
					case T_SUBSTRING:
					case T_SUM:
					case T_SUMMARY:
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
					case T_TRANSACTION:
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
					case T_WITHOUT:
					case T_XACT_ABORT:
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
						{
						setState(908);
						ident();
						}
						break;
					case L_INT:
						{
						setState(909);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(912); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_END - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IGNORE - 64)) | (1L << (T_IMMEDIATE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_OBJECT - 128)) | (1L << (T_OFF - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)) | (1L << (T_SESSIONS - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIGNAL - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)) | (1L << (T_SQL - 192)) | (1L << (T_SQLEXCEPTION - 192)) | (1L << (T_SQLINSERT - 192)) | (1L << (T_SQLSTATE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (L_ID - 320)) | (1L << (L_INT - 320)))) != 0) );
				setState(914);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(915);
				match(T_TABLESPACE);
				setState(916);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_db2_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_db2_itemContext create_table_options_db2_item() throws RecognitionException {
		Create_table_options_db2_itemContext _localctx = new Create_table_options_db2_itemContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_create_table_options_db2_item);
		int _la;
		try {
			setState(952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(919);
					match(T_INDEX);
					}
				}

				setState(922);
				match(T_IN);
				setState(923);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(924);
				match(T_WITH);
				setState(925);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(926);
				match(T_DISTRIBUTE);
				setState(927);
				match(T_BY);
				setState(928);
				match(T_HASH);
				setState(929);
				match(T_OPEN_P);
				setState(930);
				ident();
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(931);
					match(T_COMMA);
					setState(932);
					ident();
					}
					}
					setState(937);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(938);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(940);
					match(T_NOT);
					}
				}

				setState(943);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(944);
				match(T_COMPRESS);
				setState(945);
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
				setState(946);
				match(T_DEFINITION);
				setState(947);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(948);
				match(T_WITH);
				setState(949);
				match(T_RESTRICT);
				setState(950);
				match(T_ON);
				setState(951);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_td_itemContext create_table_options_td_item() throws RecognitionException {
		Create_table_options_td_itemContext _localctx = new Create_table_options_td_itemContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_create_table_options_td_item);
		int _la;
		try {
			setState(972);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(954);
					match(T_UNIQUE);
					}
				}

				setState(957);
				match(T_PRIMARY);
				setState(958);
				match(T_INDEX);
				setState(959);
				match(T_OPEN_P);
				setState(960);
				ident();
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(961);
					match(T_COMMA);
					setState(962);
					ident();
					}
					}
					setState(967);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(968);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(970);
				match(T_WITH);
				setState(971);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_hive_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_hive_itemContext create_table_options_hive_item() throws RecognitionException {
		Create_table_options_hive_itemContext _localctx = new Create_table_options_hive_itemContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_create_table_options_hive_item);
		try {
			setState(978);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(974);
				create_table_hive_row_format();
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(975);
				match(T_STORED);
				setState(976);
				match(T_AS);
				setState(977);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_hive_row_format(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_formatContext create_table_hive_row_format() throws RecognitionException {
		Create_table_hive_row_formatContext _localctx = new Create_table_hive_row_formatContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_create_table_hive_row_format);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			match(T_ROW);
			setState(981);
			match(T_FORMAT);
			setState(982);
			match(T_DELIMITED);
			setState(986);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(983);
					create_table_hive_row_format_fields();
					}
					} 
				}
				setState(988);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_hive_row_format_fields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields() throws RecognitionException {
		Create_table_hive_row_format_fieldsContext _localctx = new Create_table_hive_row_format_fieldsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_create_table_hive_row_format_fields);
		try {
			setState(1016);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				match(T_FIELDS);
				setState(990);
				match(T_TERMINATED);
				setState(991);
				match(T_BY);
				setState(992);
				expr(0);
				setState(996);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(993);
					match(T_ESCAPED);
					setState(994);
					match(T_BY);
					setState(995);
					expr(0);
					}
					break;
				}
				}
				break;
			case T_COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(998);
				match(T_COLLECTION);
				setState(999);
				match(T_ITEMS);
				setState(1000);
				match(T_TERMINATED);
				setState(1001);
				match(T_BY);
				setState(1002);
				expr(0);
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1003);
				match(T_MAP);
				setState(1004);
				match(T_KEYS);
				setState(1005);
				match(T_TERMINATED);
				setState(1006);
				match(T_BY);
				setState(1007);
				expr(0);
				}
				break;
			case T_LINES:
				enterOuterAlt(_localctx, 4);
				{
				setState(1008);
				match(T_LINES);
				setState(1009);
				match(T_TERMINATED);
				setState(1010);
				match(T_BY);
				setState(1011);
				expr(0);
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1012);
				match(T_NULL);
				setState(1013);
				match(T_DEFINED);
				setState(1014);
				match(T_AS);
				setState(1015);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_mssql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mssql_itemContext create_table_options_mssql_item() throws RecognitionException {
		Create_table_options_mssql_itemContext _localctx = new Create_table_options_mssql_itemContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_create_table_options_mssql_item);
		try {
			setState(1022);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1018);
				match(T_ON);
				setState(1019);
				ident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1020);
				match(T_TEXTIMAGE_ON);
				setState(1021);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_mysql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mysql_itemContext create_table_options_mysql_item() throws RecognitionException {
		Create_table_options_mysql_itemContext _localctx = new Create_table_options_mysql_itemContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_create_table_options_mysql_item);
		int _la;
		try {
			setState(1051);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1024);
				match(T_AUTO_INCREMENT);
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1025);
					match(T_EQUAL);
					}
				}

				setState(1028);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
				match(T_COMMENT);
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1030);
					match(T_EQUAL);
					}
				}

				setState(1033);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(1034);
					match(T_DEFAULT);
					}
				}

				setState(1040);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(1037);
					match(T_CHARACTER);
					setState(1038);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(1039);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1043);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1042);
					match(T_EQUAL);
					}
				}

				setState(1045);
				expr(0);
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1046);
				match(T_ENGINE);
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1047);
					match(T_EQUAL);
					}
				}

				setState(1050);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_dtype);
		try {
			setState(1098);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1053);
				match(T_CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1054);
				match(T_BIGINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1055);
				match(T_BINARY_DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1056);
				match(T_BINARY_FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1057);
				match(T_BINARY_INTEGER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1058);
				match(T_BIT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1059);
				match(T_DATE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1060);
				match(T_DATETIME);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1061);
				match(T_DEC);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1062);
				match(T_DECIMAL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1063);
				match(T_DOUBLE);
				setState(1065);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1064);
					match(T_PRECISION);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1067);
				match(T_FLOAT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1068);
				match(T_INT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1069);
				match(T_INT2);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1070);
				match(T_INT4);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1071);
				match(T_INT8);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1072);
				match(T_INTEGER);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1073);
				match(T_NCHAR);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1074);
				match(T_NVARCHAR);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1075);
				match(T_NUMBER);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1076);
				match(T_NUMERIC);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1077);
				match(T_PLS_INTEGER);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1078);
				match(T_REAL);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1079);
				match(T_RESULT_SET_LOCATOR);
				setState(1080);
				match(T_VARYING);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1081);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1082);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1083);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1084);
				match(T_SMALLINT);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1085);
				match(T_SMALLDATETIME);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1086);
				match(T_STRING);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1087);
				match(T_SYS_REFCURSOR);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1088);
				match(T_TIMESTAMP);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1089);
				match(T_TINYINT);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1090);
				match(T_VARCHAR);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1091);
				match(T_VARCHAR2);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1092);
				match(T_XML);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1093);
				ident();
				setState(1096);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1094);
					match(T__2);
					{
					setState(1095);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDtype_len(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_lenContext dtype_len() throws RecognitionException {
		Dtype_lenContext _localctx = new Dtype_lenContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_dtype_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			match(T_OPEN_P);
			setState(1101);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(1102);
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

			setState(1107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(1105);
				match(T_COMMA);
				setState(1106);
				match(L_INT);
				}
			}

			setState(1109);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDtype_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_attrContext dtype_attr() throws RecognitionException {
		Dtype_attrContext _localctx = new Dtype_attrContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_dtype_attr);
		int _la;
		try {
			setState(1122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1111);
					match(T_NOT);
					}
				}

				setState(1114);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1115);
				match(T_CHARACTER);
				setState(1116);
				match(T_SET);
				setState(1117);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1118);
					match(T_NOT);
					}
				}

				setState(1121);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDtype_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_defaultContext dtype_default() throws RecognitionException {
		Dtype_defaultContext _localctx = new Dtype_defaultContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_dtype_default);
		int _la;
		try {
			setState(1136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(1124);
					match(T_COLON);
					}
				}

				setState(1127);
				match(T_EQUAL);
				setState(1128);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1129);
					match(T_WITH);
					}
				}

				setState(1132);
				match(T_DEFAULT);
				setState(1134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1133);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_database_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_stmtContext create_database_stmt() throws RecognitionException {
		Create_database_stmtContext _localctx = new Create_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_create_database_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			match(T_CREATE);
			setState(1139);
			_la = _input.LA(1);
			if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1140);
				match(T_IF);
				setState(1141);
				match(T_NOT);
				setState(1142);
				match(T_EXISTS);
				}
				break;
			}
			setState(1145);
			expr(0);
			setState(1149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1146);
					create_database_option();
					}
					} 
				}
				setState(1151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_database_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_optionContext create_database_option() throws RecognitionException {
		Create_database_optionContext _localctx = new Create_database_optionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_create_database_option);
		try {
			setState(1156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1152);
				match(T_COMMENT);
				setState(1153);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1154);
				match(T_LOCATION);
				setState(1155);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_function_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_stmtContext create_function_stmt() throws RecognitionException {
		Create_function_stmtContext _localctx = new Create_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_create_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1158);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1159);
				match(T_CREATE);
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1160);
					match(T_OR);
					setState(1161);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1164);
				match(T_REPLACE);
				}
				break;
			case T_FUNCTION:
				break;
			default:
				break;
			}
			setState(1167);
			match(T_FUNCTION);
			setState(1168);
			ident();
			setState(1170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1169);
				create_routine_params();
				}
				break;
			}
			setState(1172);
			create_function_return();
			setState(1174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1173);
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
			setState(1177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1176);
				declare_block_inplace();
				}
				break;
			}
			setState(1179);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_function_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_returnContext create_function_return() throws RecognitionException {
		Create_function_returnContext _localctx = new Create_function_returnContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_create_function_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			_la = _input.LA(1);
			if ( !(_la==T_RETURN || _la==T_RETURNS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1182);
			dtype();
			setState(1184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1183);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_package_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_stmtContext create_package_stmt() throws RecognitionException {
		Create_package_stmtContext _localctx = new Create_package_stmtContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_create_package_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1186);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1187);
				match(T_CREATE);
				setState(1190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1188);
					match(T_OR);
					setState(1189);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1192);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1195);
			match(T_PACKAGE);
			setState(1196);
			ident();
			setState(1197);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1198);
			package_spec();
			setState(1199);
			match(T_END);
			setState(1203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1200);
				ident();
				setState(1201);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPackage_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_specContext package_spec() throws RecognitionException {
		Package_specContext _localctx = new Package_specContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_package_spec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			package_spec_item();
			setState(1206);
			match(T_SEMICOLON);
			setState(1212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1207);
					package_spec_item();
					setState(1208);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(1214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPackage_spec_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_spec_itemContext package_spec_item() throws RecognitionException {
		Package_spec_itemContext _localctx = new Package_spec_itemContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_package_spec_item);
		int _la;
		try {
			setState(1228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1215);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1216);
				match(T_FUNCTION);
				setState(1217);
				ident();
				setState(1219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1218);
					create_routine_params();
					}
					break;
				}
				setState(1221);
				create_function_return();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1223);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1224);
				ident();
				setState(1226);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1225);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_package_body_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_body_stmtContext create_package_body_stmt() throws RecognitionException {
		Create_package_body_stmtContext _localctx = new Create_package_body_stmtContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_create_package_body_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1230);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1231);
				match(T_CREATE);
				setState(1234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1232);
					match(T_OR);
					setState(1233);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1236);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1239);
			match(T_PACKAGE);
			setState(1240);
			match(T_BODY);
			setState(1241);
			ident();
			setState(1242);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1243);
			package_body();
			setState(1244);
			match(T_END);
			setState(1248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1245);
				ident();
				setState(1246);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPackage_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_bodyContext package_body() throws RecognitionException {
		Package_bodyContext _localctx = new Package_bodyContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_package_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			package_body_item();
			setState(1251);
			match(T_SEMICOLON);
			setState(1257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1252);
					package_body_item();
					setState(1253);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(1259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPackage_body_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_body_itemContext package_body_item() throws RecognitionException {
		Package_body_itemContext _localctx = new Package_body_itemContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_package_body_item);
		try {
			setState(1263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1260);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1261);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1262);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_procedure_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_procedure_stmtContext create_procedure_stmt() throws RecognitionException {
		Create_procedure_stmtContext _localctx = new Create_procedure_stmtContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_create_procedure_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1265);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1266);
				match(T_CREATE);
				setState(1269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1267);
					match(T_OR);
					setState(1268);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1271);
				match(T_REPLACE);
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				break;
			default:
				break;
			}
			setState(1274);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1275);
			ident();
			setState(1277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1276);
				create_routine_params();
				}
				break;
			}
			setState(1280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1279);
				create_routine_options();
				}
				break;
			}
			setState(1283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1282);
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
			setState(1286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1285);
				declare_block_inplace();
				}
				break;
			}
			setState(1289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1288);
				label();
				}
				break;
			}
			setState(1291);
			proc_block();
			setState(1295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1292);
				ident();
				setState(1293);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_routine_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_paramsContext create_routine_params() throws RecognitionException {
		Create_routine_paramsContext _localctx = new Create_routine_paramsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_create_routine_params);
		int _la;
		try {
			int _alt;
			setState(1319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1297);
				match(T_OPEN_P);
				setState(1298);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1299);
				match(T_OPEN_P);
				setState(1300);
				create_routine_param_item();
				setState(1305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1301);
					match(T_COMMA);
					setState(1302);
					create_routine_param_item();
					}
					}
					setState(1307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1308);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1310);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\r\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") && _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\r\n        ");
				setState(1311);
				create_routine_param_item();
				setState(1316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1312);
						match(T_COMMA);
						setState(1313);
						create_routine_param_item();
						}
						} 
					}
					setState(1318);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_routine_param_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_param_itemContext create_routine_param_item() throws RecognitionException {
		Create_routine_param_itemContext _localctx = new Create_routine_param_itemContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_create_routine_param_item);
		try {
			int _alt;
			setState(1363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1321);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1322);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1323);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1324);
					match(T_IN);
					setState(1325);
					match(T_OUT);
					}
					break;
				}
				setState(1328);
				ident();
				setState(1329);
				dtype();
				setState(1331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1330);
					dtype_len();
					}
					break;
				}
				setState(1336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1333);
						dtype_attr();
						}
						} 
					}
					setState(1338);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				}
				setState(1340);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1339);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1342);
				ident();
				setState(1348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1343);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1344);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1345);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1346);
					match(T_IN);
					setState(1347);
					match(T_OUT);
					}
					break;
				}
				setState(1350);
				dtype();
				setState(1352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1351);
					dtype_len();
					}
					break;
				}
				setState(1357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1354);
						dtype_attr();
						}
						} 
					}
					setState(1359);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				}
				setState(1361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1360);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_routine_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_optionsContext create_routine_options() throws RecognitionException {
		Create_routine_optionsContext _localctx = new Create_routine_optionsContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_create_routine_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1366); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1365);
					create_routine_option();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1368); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_routine_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_optionContext create_routine_option() throws RecognitionException {
		Create_routine_optionContext _localctx = new Create_routine_optionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_create_routine_option);
		int _la;
		try {
			setState(1381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LANGUAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1370);
				match(T_LANGUAGE);
				setState(1371);
				match(T_SQL);
				}
				break;
			case T_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1372);
				match(T_SQL);
				setState(1373);
				match(T_SECURITY);
				setState(1374);
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
				setState(1376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DYNAMIC) {
					{
					setState(1375);
					match(T_DYNAMIC);
					}
				}

				setState(1378);
				match(T_RESULT);
				setState(1379);
				match(T_SETS);
				setState(1380);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExec_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exec_stmtContext exec_stmt() throws RecognitionException {
		Exec_stmtContext _localctx = new Exec_stmtContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_exec_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			_la = _input.LA(1);
			if ( !(_la==T_EXEC || _la==T_EXECUTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1384);
				match(T_IMMEDIATE);
				}
				break;
			}
			setState(1387);
			expr(0);
			setState(1393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1388);
				match(T_OPEN_P);
				setState(1389);
				expr_func_params();
				setState(1390);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1392);
				expr_func_params();
				}
				break;
			}
			setState(1404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1395);
				match(T_INTO);
				setState(1396);
				match(L_ID);
				setState(1401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1397);
						match(T_COMMA);
						setState(1398);
						match(L_ID);
						}
						} 
					}
					setState(1403);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				}
				}
				break;
			}
			setState(1407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1406);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_if_stmt);
		try {
			setState(1412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1409);
				if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1410);
				if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1411);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIf_plsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_plsql_stmtContext if_plsql_stmt() throws RecognitionException {
		If_plsql_stmtContext _localctx = new If_plsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_if_plsql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			match(T_IF);
			setState(1415);
			bool_expr(0);
			setState(1416);
			match(T_THEN);
			setState(1417);
			block();
			setState(1421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1418);
				elseif_block();
				}
				}
				setState(1423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1424);
				else_block();
				}
			}

			setState(1427);
			match(T_END);
			setState(1428);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIf_tsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_tsql_stmtContext if_tsql_stmt() throws RecognitionException {
		If_tsql_stmtContext _localctx = new If_tsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_if_tsql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			match(T_IF);
			setState(1431);
			bool_expr(0);
			setState(1432);
			single_block_stmt();
			setState(1435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1433);
				match(T_ELSE);
				setState(1434);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIf_bteq_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_bteq_stmtContext if_bteq_stmt() throws RecognitionException {
		If_bteq_stmtContext _localctx = new If_bteq_stmtContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_if_bteq_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			match(T__3);
			setState(1438);
			match(T_IF);
			setState(1439);
			bool_expr(0);
			setState(1440);
			match(T_THEN);
			setState(1441);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitElseif_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_blockContext elseif_block() throws RecognitionException {
		Elseif_blockContext _localctx = new Elseif_blockContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_elseif_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1444);
			bool_expr(0);
			setState(1445);
			match(T_THEN);
			setState(1446);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1448);
			match(T_ELSE);
			setState(1449);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_stmtContext exit_stmt() throws RecognitionException {
		Exit_stmtContext _localctx = new Exit_stmtContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_exit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			match(T_EXIT);
			setState(1453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1452);
				match(L_ID);
				}
				break;
			}
			setState(1457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1455);
				match(T_WHEN);
				setState(1456);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitLeave_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Leave_stmtContext leave_stmt() throws RecognitionException {
		Leave_stmtContext _localctx = new Leave_stmtContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_leave_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			match(T_LEAVE);
			setState(1461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1460);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCmp_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmp_stmtContext cmp_stmt() throws RecognitionException {
		Cmp_stmtContext _localctx = new Cmp_stmtContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_cmp_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			match(T_CMP);
			setState(1464);
			_la = _input.LA(1);
			if ( !(_la==T_ROW_COUNT || _la==T_SUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1465);
			cmp_source();
			setState(1466);
			match(T_COMMA);
			setState(1467);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCmp_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmp_sourceContext cmp_source() throws RecognitionException {
		Cmp_sourceContext _localctx = new Cmp_sourceContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_cmp_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
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
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
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
			case T_DELIMITER:
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
			case T_FILE:
			case T_FILES:
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
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
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
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
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
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
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
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
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
			case T_TRANSACTION:
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
			case T_WITHOUT:
			case T_XACT_ABORT:
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
				{
				setState(1469);
				table_name();
				setState(1471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1470);
					where_clause();
					}
					break;
				}
				}
				break;
			case T_OPEN_P:
				{
				setState(1473);
				match(T_OPEN_P);
				setState(1474);
				select_stmt();
				setState(1475);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1479);
				match(T_AT);
				setState(1480);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1483);
			match(T_CREATE);
			setState(1485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(1484);
				match(T_UNIQUE);
				}
			}

			setState(1487);
			match(T_INDEX);
			setState(1488);
			ident();
			setState(1489);
			match(T_ON);
			setState(1490);
			table_name();
			setState(1491);
			match(T_OPEN_P);
			setState(1492);
			create_index_col();
			setState(1497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1493);
				match(T_COMMA);
				setState(1494);
				create_index_col();
				}
				}
				setState(1499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1500);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_index_col(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_colContext create_index_col() throws RecognitionException {
		Create_index_colContext _localctx = new Create_index_colContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_create_index_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1502);
			ident();
			setState(1504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(1503);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIndex_storage_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_storage_clauseContext index_storage_clause() throws RecognitionException {
		Index_storage_clauseContext _localctx = new Index_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_index_storage_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIndex_mssql_storage_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_mssql_storage_clauseContext index_mssql_storage_clause() throws RecognitionException {
		Index_mssql_storage_clauseContext _localctx = new Index_mssql_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_index_mssql_storage_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1508);
			match(T_WITH);
			setState(1509);
			match(T_OPEN_P);
			setState(1510);
			ident();
			setState(1511);
			match(T_EQUAL);
			setState(1512);
			ident();
			setState(1520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1513);
				match(T_COMMA);
				setState(1514);
				ident();
				setState(1515);
				match(T_EQUAL);
				setState(1516);
				ident();
				}
				}
				setState(1522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1523);
			match(T_CLOSE_P);
			setState(1527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ON || _la==T_TEXTIMAGE_ON) {
				{
				{
				setState(1524);
				create_table_options_mssql_item();
				}
				}
				setState(1529);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitQuit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quit_stmtContext quit_stmt() throws RecognitionException {
		Quit_stmtContext _localctx = new Quit_stmtContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_quit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(1530);
				match(T__3);
				}
			}

			setState(1533);
			match(T_QUIT);
			setState(1535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1534);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1537);
			match(T_RETURN);
			setState(1539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1538);
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

	public static class Set_session_optionContext extends ParserRuleContext {
		public Set_current_schema_optionContext set_current_schema_option() {
			return getRuleContext(Set_current_schema_optionContext.class,0);
		}
		public Set_mssql_session_optionContext set_mssql_session_option() {
			return getRuleContext(Set_mssql_session_optionContext.class,0);
		}
		public Set_teradata_session_optionContext set_teradata_session_option() {
			return getRuleContext(Set_teradata_session_optionContext.class,0);
		}
		public Set_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSet_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSet_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSet_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_session_optionContext set_session_option() throws RecognitionException {
		Set_session_optionContext _localctx = new Set_session_optionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_set_session_option);
		try {
			setState(1544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_SCHEMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1541);
				set_current_schema_option();
				}
				break;
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_NOCOUNT:
			case T_QUOTED_IDENTIFIER:
			case T_XACT_ABORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1542);
				set_mssql_session_option();
				}
				break;
			case T_QUERY_BAND:
				enterOuterAlt(_localctx, 3);
				{
				setState(1543);
				set_teradata_session_option();
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

	public static class Set_current_schema_optionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(HplsqlParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HplsqlParser.T_SCHEMA, 0); }
		public TerminalNode T_CURRENT() { return getToken(HplsqlParser.T_CURRENT, 0); }
		public Set_current_schema_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_current_schema_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSet_current_schema_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSet_current_schema_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSet_current_schema_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_current_schema_optionContext set_current_schema_option() throws RecognitionException {
		Set_current_schema_optionContext _localctx = new Set_current_schema_optionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_set_current_schema_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_SCHEMA:
				{
				{
				setState(1547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CURRENT) {
					{
					setState(1546);
					match(T_CURRENT);
					}
				}

				setState(1549);
				match(T_SCHEMA);
				}
				}
				break;
			case T_CURRENT_SCHEMA:
				{
				setState(1550);
				match(T_CURRENT_SCHEMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_EQUAL) {
				{
				setState(1553);
				match(T_EQUAL);
				}
			}

			setState(1556);
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

	public static class Set_mssql_session_optionContext extends ParserRuleContext {
		public TerminalNode T_ANSI_NULLS() { return getToken(HplsqlParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(HplsqlParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(HplsqlParser.T_NOCOUNT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(HplsqlParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(HplsqlParser.T_XACT_ABORT, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_OFF() { return getToken(HplsqlParser.T_OFF, 0); }
		public Set_mssql_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_mssql_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSet_mssql_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSet_mssql_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSet_mssql_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_mssql_session_optionContext set_mssql_session_option() throws RecognitionException {
		Set_mssql_session_optionContext _localctx = new Set_mssql_session_optionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_set_mssql_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1558);
			_la = _input.LA(1);
			if ( !(_la==T_ANSI_NULLS || _la==T_ANSI_PADDING || _la==T_NOCOUNT || _la==T_QUOTED_IDENTIFIER || _la==T_XACT_ABORT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1559);
			_la = _input.LA(1);
			if ( !(_la==T_OFF || _la==T_ON) ) {
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

	public static class Set_teradata_session_optionContext extends ParserRuleContext {
		public TerminalNode T_QUERY_BAND() { return getToken(HplsqlParser.T_QUERY_BAND, 0); }
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(HplsqlParser.T_TRANSACTION, 0); }
		public TerminalNode T_SESSION() { return getToken(HplsqlParser.T_SESSION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_NONE() { return getToken(HplsqlParser.T_NONE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public Set_teradata_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_teradata_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterSet_teradata_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitSet_teradata_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSet_teradata_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_teradata_session_optionContext set_teradata_session_option() throws RecognitionException {
		Set_teradata_session_optionContext _localctx = new Set_teradata_session_optionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_set_teradata_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			match(T_QUERY_BAND);
			setState(1562);
			match(T_EQUAL);
			setState(1565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1563);
				expr(0);
				}
				break;
			case 2:
				{
				setState(1564);
				match(T_NONE);
				}
				break;
			}
			setState(1568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UPDATE) {
				{
				setState(1567);
				match(T_UPDATE);
				}
			}

			setState(1570);
			match(T_FOR);
			setState(1571);
			_la = _input.LA(1);
			if ( !(_la==T_SESSION || _la==T_TRANSACTION) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFor_range_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_range_stmtContext for_range_stmt() throws RecognitionException {
		For_range_stmtContext _localctx = new For_range_stmtContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_for_range_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			match(T_FOR);
			setState(1574);
			match(L_ID);
			setState(1575);
			match(T_IN);
			setState(1577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1576);
				match(T_REVERSE);
				}
				break;
			}
			setState(1579);
			expr(0);
			setState(1580);
			match(T_DOT2);
			setState(1581);
			expr(0);
			setState(1584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BY || _la==T_STEP) {
				{
				setState(1582);
				_la = _input.LA(1);
				if ( !(_la==T_BY || _la==T_STEP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1583);
				expr(0);
				}
			}

			setState(1586);
			match(T_LOOP);
			setState(1587);
			block();
			setState(1588);
			match(T_END);
			setState(1589);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_label);
		try {
			setState(1597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1591);
				match(L_LABEL);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1592);
				match(T_LESS);
				setState(1593);
				match(T_LESS);
				setState(1594);
				match(L_ID);
				setState(1595);
				match(T_GREATER);
				setState(1596);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitUsing_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Using_clauseContext using_clause() throws RecognitionException {
		Using_clauseContext _localctx = new Using_clauseContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_using_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1599);
			match(T_USING);
			setState(1600);
			expr(0);
			setState(1605);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1601);
					match(T_COMMA);
					setState(1602);
					expr(0);
					}
					} 
				}
				setState(1607);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(1608);
				cte_select_stmt();
				}
			}

			setState(1611);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCte_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmtContext cte_select_stmt() throws RecognitionException {
		Cte_select_stmtContext _localctx = new Cte_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_cte_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1613);
			match(T_WITH);
			setState(1614);
			cte_select_stmt_item();
			setState(1619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1615);
				match(T_COMMA);
				setState(1616);
				cte_select_stmt_item();
				}
				}
				setState(1621);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCte_select_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmt_itemContext cte_select_stmt_item() throws RecognitionException {
		Cte_select_stmt_itemContext _localctx = new Cte_select_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_cte_select_stmt_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622);
			ident();
			setState(1624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(1623);
				cte_select_cols();
				}
			}

			setState(1626);
			match(T_AS);
			setState(1627);
			match(T_OPEN_P);
			setState(1628);
			fullselect_stmt();
			setState(1629);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCte_select_cols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_colsContext cte_select_cols() throws RecognitionException {
		Cte_select_colsContext _localctx = new Cte_select_colsContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_cte_select_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			match(T_OPEN_P);
			setState(1632);
			ident();
			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1633);
				match(T_COMMA);
				setState(1634);
				ident();
				}
				}
				setState(1639);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1640);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFullselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmtContext fullselect_stmt() throws RecognitionException {
		Fullselect_stmtContext _localctx = new Fullselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_fullselect_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			fullselect_stmt_item();
			setState(1648);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1643);
					fullselect_set_clause();
					setState(1644);
					fullselect_stmt_item();
					}
					} 
				}
				setState(1650);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFullselect_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmt_itemContext fullselect_stmt_item() throws RecognitionException {
		Fullselect_stmt_itemContext _localctx = new Fullselect_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_fullselect_stmt_item);
		try {
			setState(1656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1651);
				subselect_stmt();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1652);
				match(T_OPEN_P);
				setState(1653);
				fullselect_stmt();
				setState(1654);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFullselect_set_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_set_clauseContext fullselect_set_clause() throws RecognitionException {
		Fullselect_set_clauseContext _localctx = new Fullselect_set_clauseContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_fullselect_set_clause);
		int _la;
		try {
			setState(1670);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1658);
				match(T_UNION);
				setState(1660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1659);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1662);
				match(T_EXCEPT);
				setState(1664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1663);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1666);
				match(T_INTERSECT);
				setState(1668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1667);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSubselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subselect_stmtContext subselect_stmt() throws RecognitionException {
		Subselect_stmtContext _localctx = new Subselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_subselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1673);
			select_list();
			setState(1675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1674);
				into_clause();
				}
				break;
			}
			setState(1678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1677);
				from_clause();
				}
				break;
			}
			setState(1681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1680);
				where_clause();
				}
				break;
			}
			setState(1684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1683);
				group_by_clause();
				}
				break;
			}
			setState(1688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1686);
				having_clause();
				}
				break;
			case 2:
				{
				setState(1687);
				qualify_clause();
				}
				break;
			}
			setState(1691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1690);
				order_by_clause();
				}
				break;
			}
			setState(1694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1693);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1696);
				select_list_set();
				}
				break;
			}
			setState(1700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1699);
				select_list_limit();
				}
				break;
			}
			setState(1702);
			select_list_item();
			setState(1707);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1703);
					match(T_COMMA);
					setState(1704);
					select_list_item();
					}
					} 
				}
				setState(1709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_setContext select_list_set() throws RecognitionException {
		Select_list_setContext _localctx = new Select_list_setContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_select_list_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_limit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_limitContext select_list_limit() throws RecognitionException {
		Select_list_limitContext _localctx = new Select_list_limitContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_select_list_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			match(T_TOP);
			setState(1713);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_itemContext select_list_item() throws RecognitionException {
		Select_list_itemContext _localctx = new Select_list_itemContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_select_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1718);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1715);
					ident();
					setState(1716);
					match(T_EQUAL);
					}
					break;
				}
				setState(1720);
				expr(0);
				setState(1722);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1721);
					select_list_alias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1724);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_aliasContext select_list_alias() throws RecognitionException {
		Select_list_aliasContext _localctx = new Select_list_aliasContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_select_list_alias);
		try {
			setState(1736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1727);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") && !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
				setState(1729);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1728);
					match(T_AS);
					}
					break;
				}
				setState(1731);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1732);
				match(T_OPEN_P);
				setState(1733);
				match(T_TITLE);
				setState(1734);
				match(L_S_STRING);
				setState(1735);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_asterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_asteriskContext select_list_asterisk() throws RecognitionException {
		Select_list_asteriskContext _localctx = new Select_list_asteriskContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_select_list_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_ID) {
				{
				setState(1738);
				match(L_ID);
				setState(1739);
				match(T__3);
				}
			}

			setState(1742);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitInto_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Into_clauseContext into_clause() throws RecognitionException {
		Into_clauseContext _localctx = new Into_clauseContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_into_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			match(T_INTO);
			setState(1745);
			ident();
			setState(1750);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1746);
					match(T_COMMA);
					setState(1747);
					ident();
					}
					} 
				}
				setState(1752);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1753);
			match(T_FROM);
			setState(1754);
			from_table_clause();
			setState(1758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1755);
					from_join_clause();
					}
					} 
				}
				setState(1760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_table_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_clauseContext from_table_clause() throws RecognitionException {
		From_table_clauseContext _localctx = new From_table_clauseContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_from_table_clause);
		try {
			setState(1764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1761);
				from_table_name_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1762);
				from_subselect_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1763);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_table_name_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_name_clauseContext from_table_name_clause() throws RecognitionException {
		From_table_name_clauseContext _localctx = new From_table_name_clauseContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			table_name();
			setState(1768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1767);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_subselect_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_subselect_clauseContext from_subselect_clause() throws RecognitionException {
		From_subselect_clauseContext _localctx = new From_subselect_clauseContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
			match(T_OPEN_P);
			setState(1771);
			select_stmt();
			setState(1772);
			match(T_CLOSE_P);
			setState(1774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1773);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_join_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_clauseContext from_join_clause() throws RecognitionException {
		From_join_clauseContext _localctx = new From_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_from_join_clause);
		try {
			setState(1783);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1776);
				match(T_COMMA);
				setState(1777);
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
				setState(1778);
				from_join_type_clause();
				setState(1779);
				from_table_clause();
				setState(1780);
				match(T_ON);
				setState(1781);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_join_type_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_type_clauseContext from_join_type_clause() throws RecognitionException {
		From_join_type_clauseContext _localctx = new From_join_type_clauseContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_from_join_type_clause);
		int _la;
		try {
			setState(1794);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(1785);
					match(T_INNER);
					}
				}

				setState(1788);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1789);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(1790);
					match(T_OUTER);
					}
				}

				setState(1793);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_table_values_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_clauseContext from_table_values_clause() throws RecognitionException {
		From_table_values_clauseContext _localctx = new From_table_values_clauseContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			match(T_TABLE);
			setState(1797);
			match(T_OPEN_P);
			setState(1798);
			match(T_VALUES);
			setState(1799);
			from_table_values_row();
			setState(1804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1800);
				match(T_COMMA);
				setState(1801);
				from_table_values_row();
				}
				}
				setState(1806);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1807);
			match(T_CLOSE_P);
			setState(1809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(1808);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_table_values_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_rowContext from_table_values_row() throws RecognitionException {
		From_table_values_rowContext _localctx = new From_table_values_rowContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_from_table_values_row);
		int _la;
		try {
			setState(1823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1811);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1812);
				match(T_OPEN_P);
				setState(1813);
				expr(0);
				setState(1818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1814);
					match(T_COMMA);
					setState(1815);
					expr(0);
					}
					}
					setState(1820);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1821);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_alias_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_alias_clauseContext from_alias_clause() throws RecognitionException {
		From_alias_clauseContext _localctx = new From_alias_clauseContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(1827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1826);
				match(T_AS);
				}
				break;
			}
			setState(1829);
			ident();
			setState(1840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1830);
				match(T_OPEN_P);
				setState(1831);
				match(L_ID);
				setState(1836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1832);
					match(T_COMMA);
					setState(1833);
					match(L_ID);
					}
					}
					setState(1838);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1839);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
			match(T_WHERE);
			setState(1845);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitGroup_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			match(T_GROUP);
			setState(1848);
			match(T_BY);
			setState(1849);
			expr(0);
			setState(1854);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1850);
					match(T_COMMA);
					setState(1851);
					expr(0);
					}
					} 
				}
				setState(1856);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitHaving_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1857);
			match(T_HAVING);
			setState(1858);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitQualify_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualify_clauseContext qualify_clause() throws RecognitionException {
		Qualify_clauseContext _localctx = new Qualify_clauseContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1860);
			match(T_QUALIFY);
			setState(1861);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitOrder_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1863);
			match(T_ORDER);
			setState(1864);
			match(T_BY);
			setState(1865);
			expr(0);
			setState(1867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(1866);
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
			setState(1876);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1869);
					match(T_COMMA);
					setState(1870);
					expr(0);
					setState(1872);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
					case 1:
						{
						setState(1871);
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
				setState(1878);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_optionsContext select_options() throws RecognitionException {
		Select_optionsContext _localctx = new Select_optionsContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_select_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1880); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1879);
					select_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1882); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_options_itemContext select_options_item() throws RecognitionException {
		Select_options_itemContext _localctx = new Select_options_itemContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_select_options_item);
		int _la;
		try {
			setState(1895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1884);
				match(T_LIMIT);
				setState(1885);
				expr(0);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1886);
				match(T_WITH);
				setState(1887);
				_la = _input.LA(1);
				if ( !(_la==T_CS || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (T_RR - 230)) | (1L << (T_RS - 230)) | (1L << (T_UR - 230)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1893);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1888);
					match(T_USE);
					setState(1889);
					match(T_AND);
					setState(1890);
					match(T_KEEP);
					setState(1891);
					_la = _input.LA(1);
					if ( !(_la==T_EXCLUSIVE || _la==T_SHARE || _la==T_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1892);
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

	public static class Non_balanced_exprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public Non_balanced_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_balanced_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).enterNon_balanced_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HplsqlListener ) ((HplsqlListener)listener).exitNon_balanced_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNon_balanced_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_balanced_exprContext non_balanced_expr() throws RecognitionException {
		Non_balanced_exprContext _localctx = new Non_balanced_exprContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_non_balanced_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(1897);
				match(T_NOT);
				}
			}

			setState(1900);
			match(T_OPEN_P);
			setState(1901);
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

	public static class Bool_exprContext extends ParserRuleContext {
		public Non_balanced_exprContext non_balanced_expr() {
			return getRuleContext(Non_balanced_exprContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 260;
		enterRecursionRule(_localctx, 260, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				setState(1904);
				non_balanced_expr();
				}
				break;
			case 2:
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
				match(T_OPEN_P);
				setState(1909);
				bool_expr(0);
				setState(1910);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(1912);
				bool_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1921);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(1915);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1916);
					bool_expr_logical_operator();
					setState(1917);
					bool_expr(3);
					}
					} 
				}
				setState(1923);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_atomContext bool_expr_atom() throws RecognitionException {
		Bool_expr_atomContext _localctx = new Bool_expr_atomContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_bool_expr_atom);
		try {
			setState(1927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1924);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1925);
				bool_expr_binary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1926);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_unary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_unaryContext bool_expr_unary() throws RecognitionException {
		Bool_expr_unaryContext _localctx = new Bool_expr_unaryContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_bool_expr_unary);
		int _la;
		try {
			setState(1952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1929);
				expr(0);
				setState(1930);
				match(T_IS);
				setState(1932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1931);
					match(T_NOT);
					}
				}

				setState(1934);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1936);
				expr(0);
				setState(1937);
				match(T_BETWEEN);
				setState(1938);
				expr(0);
				setState(1939);
				match(T_AND);
				setState(1940);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1942);
					match(T_NOT);
					}
				}

				setState(1945);
				match(T_EXISTS);
				setState(1946);
				match(T_OPEN_P);
				setState(1947);
				select_stmt();
				setState(1948);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1950);
				bool_expr_single_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1951);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_single_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_single_inContext bool_expr_single_in() throws RecognitionException {
		Bool_expr_single_inContext _localctx = new Bool_expr_single_inContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1954);
			expr(0);
			setState(1956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(1955);
				match(T_NOT);
				}
			}

			setState(1958);
			match(T_IN);
			setState(1959);
			match(T_OPEN_P);
			setState(1969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				{
				setState(1960);
				expr(0);
				setState(1965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1961);
					match(T_COMMA);
					setState(1962);
					expr(0);
					}
					}
					setState(1967);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(1968);
				select_stmt();
				}
				break;
			}
			setState(1971);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_multi_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_multi_inContext bool_expr_multi_in() throws RecognitionException {
		Bool_expr_multi_inContext _localctx = new Bool_expr_multi_inContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1973);
			match(T_OPEN_P);
			setState(1974);
			expr(0);
			setState(1979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1975);
				match(T_COMMA);
				setState(1976);
				expr(0);
				}
				}
				setState(1981);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1982);
			match(T_CLOSE_P);
			setState(1984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(1983);
				match(T_NOT);
				}
			}

			setState(1986);
			match(T_IN);
			setState(1987);
			match(T_OPEN_P);
			setState(1988);
			select_stmt();
			setState(1989);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_binary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binaryContext bool_expr_binary() throws RecognitionException {
		Bool_expr_binaryContext _localctx = new Bool_expr_binaryContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1991);
			expr(0);
			setState(1992);
			bool_expr_binary_operator();
			setState(1993);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_logical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_logical_operatorContext bool_expr_logical_operator() throws RecognitionException {
		Bool_expr_logical_operatorContext _localctx = new Bool_expr_logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_bool_expr_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_binary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binary_operatorContext bool_expr_binary_operator() throws RecognitionException {
		Bool_expr_binary_operatorContext _localctx = new Bool_expr_binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(2009);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1997);
				match(T_EQUAL);
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1998);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1999);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(2000);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(2001);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(2002);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 7);
				{
				setState(2003);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2004);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2005);
					match(T_NOT);
					}
				}

				setState(2008);
				_la = _input.LA(1);
				if ( !(_la==T_LIKE || _la==T_REGEXP || _la==T_RLIKE) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 276;
		enterRecursionRule(_localctx, 276, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				setState(2012);
				match(T_OPEN_P);
				setState(2013);
				select_stmt();
				setState(2014);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2016);
				match(T_OPEN_P);
				setState(2017);
				expr(0);
				setState(2018);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(2020);
				expr_interval();
				}
				break;
			case 4:
				{
				setState(2021);
				expr_concat();
				}
				break;
			case 5:
				{
				setState(2022);
				expr_case();
				}
				break;
			case 6:
				{
				setState(2023);
				expr_cursor_attribute();
				}
				break;
			case 7:
				{
				setState(2024);
				expr_agg_window_func();
				}
				break;
			case 8:
				{
				setState(2025);
				expr_spec_func();
				}
				break;
			case 9:
				{
				setState(2026);
				expr_func();
				}
				break;
			case 10:
				{
				setState(2027);
				expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2046);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2044);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2030);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2031);
						match(T_MUL);
						setState(2032);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2033);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2034);
						match(T_DIV);
						setState(2035);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2036);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2037);
						match(T_ADD);
						setState(2038);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2039);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2040);
						match(T_SUB);
						setState(2041);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2042);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2043);
						interval_item();
						}
						break;
					}
					} 
				}
				setState(2048);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_expr_atom);
		try {
			setState(2057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2049);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2050);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2051);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2052);
				ident();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2053);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2054);
				dec_number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2055);
				int_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2056);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_interval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_intervalContext expr_interval() throws RecognitionException {
		Expr_intervalContext _localctx = new Expr_intervalContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2059);
			match(T_INTERVAL);
			setState(2060);
			expr(0);
			setState(2061);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitInterval_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_itemContext interval_item() throws RecognitionException {
		Interval_itemContext _localctx = new Interval_itemContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2063);
			_la = _input.LA(1);
			if ( !(_la==T_DAY || _la==T_DAYS || _la==T_MICROSECOND || _la==T_MICROSECONDS || _la==T_SECOND || _la==T_SECONDS) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_concat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concatContext expr_concat() throws RecognitionException {
		Expr_concatContext _localctx = new Expr_concatContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_expr_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2065);
			expr_concat_item();
			setState(2066);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2067);
			expr_concat_item();
			setState(2072);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2068);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2069);
					expr_concat_item();
					}
					} 
				}
				setState(2074);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_concat_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		Expr_concat_itemContext _localctx = new Expr_concat_itemContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_expr_concat_item);
		try {
			setState(2084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2075);
				match(T_OPEN_P);
				setState(2076);
				expr(0);
				setState(2077);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2079);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2080);
				expr_agg_window_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2081);
				expr_spec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2082);
				expr_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2083);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_caseContext expr_case() throws RecognitionException {
		Expr_caseContext _localctx = new Expr_caseContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_expr_case);
		try {
			setState(2088);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2086);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2087);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_case_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_simpleContext expr_case_simple() throws RecognitionException {
		Expr_case_simpleContext _localctx = new Expr_case_simpleContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2090);
			match(T_CASE);
			setState(2091);
			expr(0);
			setState(2097); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2092);
				match(T_WHEN);
				setState(2093);
				expr(0);
				setState(2094);
				match(T_THEN);
				setState(2095);
				expr(0);
				}
				}
				setState(2099); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2101);
				match(T_ELSE);
				setState(2102);
				expr(0);
				}
			}

			setState(2105);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_case_searched(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_searchedContext expr_case_searched() throws RecognitionException {
		Expr_case_searchedContext _localctx = new Expr_case_searchedContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2107);
			match(T_CASE);
			setState(2113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2108);
				match(T_WHEN);
				setState(2109);
				bool_expr(0);
				setState(2110);
				match(T_THEN);
				setState(2111);
				expr(0);
				}
				}
				setState(2115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2117);
				match(T_ELSE);
				setState(2118);
				expr(0);
				}
			}

			setState(2121);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_cursor_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_cursor_attributeContext expr_cursor_attribute() throws RecognitionException {
		Expr_cursor_attributeContext _localctx = new Expr_cursor_attributeContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_expr_cursor_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2123);
			ident();
			setState(2124);
			match(T__2);
			setState(2125);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_agg_window_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_agg_window_funcContext expr_agg_window_func() throws RecognitionException {
		Expr_agg_window_funcContext _localctx = new Expr_agg_window_funcContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(2279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2127);
				match(T_AVG);
				setState(2128);
				match(T_OPEN_P);
				setState(2130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
				case 1:
					{
					setState(2129);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2132);
				expr(0);
				setState(2133);
				match(T_CLOSE_P);
				setState(2135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
				case 1:
					{
					setState(2134);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2137);
				match(T_COUNT);
				setState(2138);
				match(T_OPEN_P);
				setState(2144);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ALL:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
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
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
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
				case T_DELIMITER:
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
				case T_FILE:
				case T_FILES:
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
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
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
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
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
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
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
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
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
				case T_TRANSACTION:
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
				case T_WITHOUT:
				case T_XACT_ABORT:
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
					{
					{
					setState(2140);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
					case 1:
						{
						setState(2139);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2142);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2143);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2146);
				match(T_CLOSE_P);
				setState(2148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
				case 1:
					{
					setState(2147);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(2150);
				match(T_COUNT_BIG);
				setState(2151);
				match(T_OPEN_P);
				setState(2157);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ALL:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
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
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
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
				case T_DELIMITER:
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
				case T_FILE:
				case T_FILES:
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
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
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
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
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
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
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
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
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
				case T_TRANSACTION:
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
				case T_WITHOUT:
				case T_XACT_ABORT:
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
					{
					{
					setState(2153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
					case 1:
						{
						setState(2152);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2155);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2156);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2159);
				match(T_CLOSE_P);
				setState(2161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
				case 1:
					{
					setState(2160);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(2163);
				match(T_CUME_DIST);
				setState(2164);
				match(T_OPEN_P);
				setState(2165);
				match(T_CLOSE_P);
				setState(2166);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2167);
				match(T_DENSE_RANK);
				setState(2168);
				match(T_OPEN_P);
				setState(2169);
				match(T_CLOSE_P);
				setState(2170);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2171);
				match(T_FIRST_VALUE);
				setState(2172);
				match(T_OPEN_P);
				setState(2173);
				expr(0);
				setState(2174);
				match(T_CLOSE_P);
				setState(2175);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(2177);
				match(T_LAG);
				setState(2178);
				match(T_OPEN_P);
				setState(2179);
				expr(0);
				setState(2186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2180);
					match(T_COMMA);
					setState(2181);
					expr(0);
					setState(2184);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2182);
						match(T_COMMA);
						setState(2183);
						expr(0);
						}
					}

					}
				}

				setState(2188);
				match(T_CLOSE_P);
				setState(2189);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2191);
				match(T_LAST_VALUE);
				setState(2192);
				match(T_OPEN_P);
				setState(2193);
				expr(0);
				setState(2194);
				match(T_CLOSE_P);
				setState(2195);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(2197);
				match(T_LEAD);
				setState(2198);
				match(T_OPEN_P);
				setState(2199);
				expr(0);
				setState(2206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2200);
					match(T_COMMA);
					setState(2201);
					expr(0);
					setState(2204);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2202);
						match(T_COMMA);
						setState(2203);
						expr(0);
						}
					}

					}
				}

				setState(2208);
				match(T_CLOSE_P);
				setState(2209);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(2211);
				match(T_MAX);
				setState(2212);
				match(T_OPEN_P);
				setState(2214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2213);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2216);
				expr(0);
				setState(2217);
				match(T_CLOSE_P);
				setState(2219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2218);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(2221);
				match(T_MIN);
				setState(2222);
				match(T_OPEN_P);
				setState(2224);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2223);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2226);
				expr(0);
				setState(2227);
				match(T_CLOSE_P);
				setState(2229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2228);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(2231);
				match(T_RANK);
				setState(2232);
				match(T_OPEN_P);
				setState(2233);
				match(T_CLOSE_P);
				setState(2234);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(2235);
				match(T_ROW_NUMBER);
				setState(2236);
				match(T_OPEN_P);
				setState(2237);
				match(T_CLOSE_P);
				setState(2238);
				expr_func_over_clause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
				{
				setState(2239);
				match(T_STDEV);
				setState(2240);
				match(T_OPEN_P);
				setState(2242);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2241);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2244);
				expr(0);
				setState(2245);
				match(T_CLOSE_P);
				setState(2247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2246);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
				{
				setState(2249);
				match(T_SUM);
				setState(2250);
				match(T_OPEN_P);
				setState(2252);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(2251);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2254);
				expr(0);
				setState(2255);
				match(T_CLOSE_P);
				setState(2257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2256);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(2259);
				match(T_VAR);
				setState(2260);
				match(T_OPEN_P);
				setState(2262);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2261);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2264);
				expr(0);
				setState(2265);
				match(T_CLOSE_P);
				setState(2267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
				case 1:
					{
					setState(2266);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 17);
				{
				setState(2269);
				match(T_VARIANCE);
				setState(2270);
				match(T_OPEN_P);
				setState(2272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(2271);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2274);
				expr(0);
				setState(2275);
				match(T_CLOSE_P);
				setState(2277);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2276);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_all_distinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_all_distinctContext expr_func_all_distinct() throws RecognitionException {
		Expr_func_all_distinctContext _localctx = new Expr_func_all_distinctContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2281);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_over_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_over_clauseContext expr_func_over_clause() throws RecognitionException {
		Expr_func_over_clauseContext _localctx = new Expr_func_over_clauseContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2283);
			match(T_OVER);
			setState(2284);
			match(T_OPEN_P);
			setState(2286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(2285);
				expr_func_partition_by_clause();
				}
			}

			setState(2289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(2288);
				order_by_clause();
				}
			}

			setState(2291);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_partition_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_partition_by_clauseContext expr_func_partition_by_clause() throws RecognitionException {
		Expr_func_partition_by_clauseContext _localctx = new Expr_func_partition_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2293);
			match(T_PARTITION);
			setState(2294);
			match(T_BY);
			setState(2295);
			expr(0);
			setState(2300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2296);
				match(T_COMMA);
				setState(2297);
				expr(0);
				}
				}
				setState(2302);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_spec_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_spec_funcContext expr_spec_func() throws RecognitionException {
		Expr_spec_funcContext _localctx = new Expr_spec_funcContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(2503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2303);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2304);
				match(T_CAST);
				setState(2305);
				match(T_OPEN_P);
				setState(2306);
				expr(0);
				setState(2307);
				match(T_AS);
				setState(2308);
				dtype();
				setState(2310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2309);
					dtype_len();
					}
				}

				setState(2312);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2314);
				match(T_COUNT);
				setState(2315);
				match(T_OPEN_P);
				setState(2318);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
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
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
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
				case T_DELIMITER:
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
				case T_FILE:
				case T_FILES:
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
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
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
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
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
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
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
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
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
				case T_TRANSACTION:
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
				case T_WITHOUT:
				case T_XACT_ABORT:
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
					{
					setState(2316);
					expr(0);
					}
					break;
				case T_MUL:
					{
					setState(2317);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2320);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2321);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2322);
				match(T_CURRENT);
				setState(2323);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2327);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(2324);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(2325);
					match(T_CURRENT);
					setState(2326);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
				case 1:
					{
					setState(2329);
					match(T_OPEN_P);
					setState(2330);
					expr(0);
					setState(2331);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2335);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2336);
				match(T_CURRENT);
				setState(2337);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2338);
				match(T_MAX_PART_STRING);
				setState(2339);
				match(T_OPEN_P);
				setState(2340);
				expr(0);
				setState(2353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2341);
					match(T_COMMA);
					setState(2342);
					expr(0);
					setState(2350);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2343);
						match(T_COMMA);
						setState(2344);
						expr(0);
						setState(2345);
						match(T_EQUAL);
						setState(2346);
						expr(0);
						}
						}
						setState(2352);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2355);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2357);
				match(T_MIN_PART_STRING);
				setState(2358);
				match(T_OPEN_P);
				setState(2359);
				expr(0);
				setState(2372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2360);
					match(T_COMMA);
					setState(2361);
					expr(0);
					setState(2369);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2362);
						match(T_COMMA);
						setState(2363);
						expr(0);
						setState(2364);
						match(T_EQUAL);
						setState(2365);
						expr(0);
						}
						}
						setState(2371);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2374);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2376);
				match(T_MAX_PART_INT);
				setState(2377);
				match(T_OPEN_P);
				setState(2378);
				expr(0);
				setState(2391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2379);
					match(T_COMMA);
					setState(2380);
					expr(0);
					setState(2388);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2381);
						match(T_COMMA);
						setState(2382);
						expr(0);
						setState(2383);
						match(T_EQUAL);
						setState(2384);
						expr(0);
						}
						}
						setState(2390);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2393);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2395);
				match(T_MIN_PART_INT);
				setState(2396);
				match(T_OPEN_P);
				setState(2397);
				expr(0);
				setState(2410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2398);
					match(T_COMMA);
					setState(2399);
					expr(0);
					setState(2407);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2400);
						match(T_COMMA);
						setState(2401);
						expr(0);
						setState(2402);
						match(T_EQUAL);
						setState(2403);
						expr(0);
						}
						}
						setState(2409);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2412);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2414);
				match(T_MAX_PART_DATE);
				setState(2415);
				match(T_OPEN_P);
				setState(2416);
				expr(0);
				setState(2429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2417);
					match(T_COMMA);
					setState(2418);
					expr(0);
					setState(2426);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2419);
						match(T_COMMA);
						setState(2420);
						expr(0);
						setState(2421);
						match(T_EQUAL);
						setState(2422);
						expr(0);
						}
						}
						setState(2428);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2431);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2433);
				match(T_MIN_PART_DATE);
				setState(2434);
				match(T_OPEN_P);
				setState(2435);
				expr(0);
				setState(2448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2436);
					match(T_COMMA);
					setState(2437);
					expr(0);
					setState(2445);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2438);
						match(T_COMMA);
						setState(2439);
						expr(0);
						setState(2440);
						match(T_EQUAL);
						setState(2441);
						expr(0);
						}
						}
						setState(2447);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2450);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2452);
				match(T_PART_COUNT);
				setState(2453);
				match(T_OPEN_P);
				setState(2454);
				expr(0);
				setState(2462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2455);
					match(T_COMMA);
					setState(2456);
					expr(0);
					setState(2457);
					match(T_EQUAL);
					setState(2458);
					expr(0);
					}
					}
					setState(2464);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2465);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2467);
				match(T_PART_LOC);
				setState(2468);
				match(T_OPEN_P);
				setState(2469);
				expr(0);
				setState(2475); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2470);
						match(T_COMMA);
						setState(2471);
						expr(0);
						setState(2472);
						match(T_EQUAL);
						setState(2473);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2477); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2479);
					match(T_COMMA);
					setState(2480);
					expr(0);
					}
				}

				setState(2483);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2485);
				match(T_TRIM);
				setState(2486);
				match(T_OPEN_P);
				setState(2487);
				expr(0);
				setState(2488);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2490);
				match(T_SUBSTRING);
				setState(2491);
				match(T_OPEN_P);
				setState(2492);
				expr(0);
				setState(2493);
				match(T_FROM);
				setState(2494);
				expr(0);
				setState(2497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(2495);
					match(T_FOR);
					setState(2496);
					expr(0);
					}
				}

				setState(2499);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2501);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2502);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_funcContext expr_func() throws RecognitionException {
		Expr_funcContext _localctx = new Expr_funcContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2505);
			ident();
			setState(2506);
			match(T_OPEN_P);
			setState(2508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				{
				setState(2507);
				expr_func_params();
				}
				break;
			}
			setState(2510);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_paramsContext expr_func_params() throws RecognitionException {
		Expr_func_paramsContext _localctx = new Expr_func_paramsContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_expr_func_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2512);
			func_param();
			setState(2517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2513);
					match(T_COMMA);
					setState(2514);
					func_param();
					}
					} 
				}
				setState(2519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFunc_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_paramContext func_param() throws RecognitionException {
		Func_paramContext _localctx = new Func_paramContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_func_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2520);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
			setState(2526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				{
				setState(2521);
				ident();
				setState(2522);
				match(T_EQUAL);
				setState(2524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_GREATER) {
					{
					setState(2523);
					match(T_GREATER);
					}
				}

				}
				break;
			}
			setState(2528);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDate_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2530);
			match(T_DATE);
			setState(2531);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitTimestamp_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2533);
			match(T_TIMESTAMP);
			setState(2534);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_ident);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(2536);
				match(L_ID);
				}
				break;
			case T_ACTION:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
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
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
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
			case T_DELIMITER:
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
			case T_FILE:
			case T_FILES:
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
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
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
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
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
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
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
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
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
			case T_TRANSACTION:
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
			case T_WITHOUT:
			case T_XACT_ABORT:
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
				setState(2537);
				non_reserved_words();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2547);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2540);
					match(T__3);
					setState(2543);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ID:
						{
						setState(2541);
						match(L_ID);
						}
						break;
					case T_ACTION:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
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
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLIENT:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECT:
					case T_COLLECTION:
					case T_COLUMN:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COPY:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_CURRENT_SCHEMA:
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
					case T_DELIMITER:
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
					case T_FILE:
					case T_FILES:
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
					case T_IGNORE:
					case T_IMMEDIATE:
					case T_IN:
					case T_INCLUDE:
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
					case T_NEW:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOUNT:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NONE:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_OBJECT:
					case T_OFF:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_ORDER:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OVERWRITE:
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
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
					case T_RAISE:
					case T_REAL:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESIGNAL:
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
					case T_PWD:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLINSERT:
					case T_SQLSTATE:
					case T_SQLWARNING:
					case T_STATS:
					case T_STATISTICS:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_STRING:
					case T_SUBDIR:
					case T_SUBSTRING:
					case T_SUM:
					case T_SUMMARY:
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
					case T_TRANSACTION:
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
					case T_WITHOUT:
					case T_XACT_ABORT:
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
						setState(2542);
						non_reserved_words();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(2549);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDouble_quotedString(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSingle_quotedString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_string);
		try {
			setState(2552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2550);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2551);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitInt_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_numberContext int_number() throws RecognitionException {
		Int_numberContext _localctx = new Int_numberContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2554);
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

			setState(2557);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDec_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_numberContext dec_number() throws RecognitionException {
		Dec_numberContext _localctx = new Dec_numberContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2559);
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

			setState(2562);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2564);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNull_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_constContext null_const() throws RecognitionException {
		Null_constContext _localctx = new Null_constContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2566);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNew_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_lineContext new_line() throws RecognitionException {
		New_lineContext _localctx = new New_lineContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_new_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2568);
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
		public TerminalNode T_ANSI_NULLS() { return getToken(HplsqlParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(HplsqlParser.T_ANSI_PADDING, 0); }
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
		public TerminalNode T_CALLER() { return getToken(HplsqlParser.T_CALLER, 0); }
		public TerminalNode T_CASCADE() { return getToken(HplsqlParser.T_CASCADE, 0); }
		public TerminalNode T_CASE() { return getToken(HplsqlParser.T_CASE, 0); }
		public TerminalNode T_CASESPECIFIC() { return getToken(HplsqlParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CAST() { return getToken(HplsqlParser.T_CAST, 0); }
		public TerminalNode T_CHAR() { return getToken(HplsqlParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HplsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_CHARSET() { return getToken(HplsqlParser.T_CHARSET, 0); }
		public TerminalNode T_CLIENT() { return getToken(HplsqlParser.T_CLIENT, 0); }
		public TerminalNode T_CLOSE() { return getToken(HplsqlParser.T_CLOSE, 0); }
		public TerminalNode T_CLUSTERED() { return getToken(HplsqlParser.T_CLUSTERED, 0); }
		public TerminalNode T_CMP() { return getToken(HplsqlParser.T_CMP, 0); }
		public TerminalNode T_COLLECT() { return getToken(HplsqlParser.T_COLLECT, 0); }
		public TerminalNode T_COLLECTION() { return getToken(HplsqlParser.T_COLLECTION, 0); }
		public TerminalNode T_COLUMN() { return getToken(HplsqlParser.T_COLUMN, 0); }
		public TerminalNode T_COMMENT() { return getToken(HplsqlParser.T_COMMENT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(HplsqlParser.T_COMPRESS, 0); }
		public TerminalNode T_CONSTANT() { return getToken(HplsqlParser.T_CONSTANT, 0); }
		public TerminalNode T_COPY() { return getToken(HplsqlParser.T_COPY, 0); }
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
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(HplsqlParser.T_CURRENT_SCHEMA, 0); }
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
		public TerminalNode T_DELIMITER() { return getToken(HplsqlParser.T_DELIMITER, 0); }
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
		public TerminalNode T_FILE() { return getToken(HplsqlParser.T_FILE, 0); }
		public TerminalNode T_FILES() { return getToken(HplsqlParser.T_FILES, 0); }
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
		public TerminalNode T_IGNORE() { return getToken(HplsqlParser.T_IGNORE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HplsqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public TerminalNode T_INCLUDE() { return getToken(HplsqlParser.T_INCLUDE, 0); }
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
		public TerminalNode T_NEW() { return getToken(HplsqlParser.T_NEW, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(HplsqlParser.T_NVARCHAR, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(HplsqlParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(HplsqlParser.T_NOCOUNT, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(HplsqlParser.T_NOLOGGING, 0); }
		public TerminalNode T_NONE() { return getToken(HplsqlParser.T_NONE, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(HplsqlParser.T_NOTFOUND, 0); }
		public TerminalNode T_NUMERIC() { return getToken(HplsqlParser.T_NUMERIC, 0); }
		public TerminalNode T_NUMBER() { return getToken(HplsqlParser.T_NUMBER, 0); }
		public TerminalNode T_OBJECT() { return getToken(HplsqlParser.T_OBJECT, 0); }
		public TerminalNode T_OFF() { return getToken(HplsqlParser.T_OFF, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_ONLY() { return getToken(HplsqlParser.T_ONLY, 0); }
		public TerminalNode T_OPEN() { return getToken(HplsqlParser.T_OPEN, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public TerminalNode T_ORDER() { return getToken(HplsqlParser.T_ORDER, 0); }
		public TerminalNode T_OUT() { return getToken(HplsqlParser.T_OUT, 0); }
		public TerminalNode T_OUTER() { return getToken(HplsqlParser.T_OUTER, 0); }
		public TerminalNode T_OVER() { return getToken(HplsqlParser.T_OVER, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(HplsqlParser.T_OVERWRITE, 0); }
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
		public TerminalNode T_PWD() { return getToken(HplsqlParser.T_PWD, 0); }
		public TerminalNode T_QUALIFY() { return getToken(HplsqlParser.T_QUALIFY, 0); }
		public TerminalNode T_QUERY_BAND() { return getToken(HplsqlParser.T_QUERY_BAND, 0); }
		public TerminalNode T_QUIT() { return getToken(HplsqlParser.T_QUIT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(HplsqlParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_RAISE() { return getToken(HplsqlParser.T_RAISE, 0); }
		public TerminalNode T_RANK() { return getToken(HplsqlParser.T_RANK, 0); }
		public TerminalNode T_REAL() { return getToken(HplsqlParser.T_REAL, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HplsqlParser.T_REFERENCES, 0); }
		public TerminalNode T_REGEXP() { return getToken(HplsqlParser.T_REGEXP, 0); }
		public TerminalNode T_RR() { return getToken(HplsqlParser.T_RR, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public TerminalNode T_RESIGNAL() { return getToken(HplsqlParser.T_RESIGNAL, 0); }
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
		public TerminalNode T_SESSION() { return getToken(HplsqlParser.T_SESSION, 0); }
		public TerminalNode T_SESSIONS() { return getToken(HplsqlParser.T_SESSIONS, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_SETS() { return getToken(HplsqlParser.T_SETS, 0); }
		public TerminalNode T_SHARE() { return getToken(HplsqlParser.T_SHARE, 0); }
		public TerminalNode T_SIGNAL() { return getToken(HplsqlParser.T_SIGNAL, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(HplsqlParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(HplsqlParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(HplsqlParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_SMALLINT() { return getToken(HplsqlParser.T_SMALLINT, 0); }
		public TerminalNode T_SQL() { return getToken(HplsqlParser.T_SQL, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(HplsqlParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLINSERT() { return getToken(HplsqlParser.T_SQLINSERT, 0); }
		public TerminalNode T_SQLSTATE() { return getToken(HplsqlParser.T_SQLSTATE, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(HplsqlParser.T_SQLWARNING, 0); }
		public TerminalNode T_STATS() { return getToken(HplsqlParser.T_STATS, 0); }
		public TerminalNode T_STATISTICS() { return getToken(HplsqlParser.T_STATISTICS, 0); }
		public TerminalNode T_STEP() { return getToken(HplsqlParser.T_STEP, 0); }
		public TerminalNode T_STDEV() { return getToken(HplsqlParser.T_STDEV, 0); }
		public TerminalNode T_STORAGE() { return getToken(HplsqlParser.T_STORAGE, 0); }
		public TerminalNode T_STORED() { return getToken(HplsqlParser.T_STORED, 0); }
		public TerminalNode T_STRING() { return getToken(HplsqlParser.T_STRING, 0); }
		public TerminalNode T_SUBDIR() { return getToken(HplsqlParser.T_SUBDIR, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(HplsqlParser.T_SUBSTRING, 0); }
		public TerminalNode T_SUM() { return getToken(HplsqlParser.T_SUM, 0); }
		public TerminalNode T_SUMMARY() { return getToken(HplsqlParser.T_SUMMARY, 0); }
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
		public TerminalNode T_TRANSACTION() { return getToken(HplsqlParser.T_TRANSACTION, 0); }
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
		public TerminalNode T_WITHOUT() { return getToken(HplsqlParser.T_WITHOUT, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(HplsqlParser.T_XACT_ABORT, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNon_reserved_words(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_reserved_wordsContext non_reserved_words() throws RecognitionException {
		Non_reserved_wordsContext _localctx = new Non_reserved_wordsContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2570);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_END - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IGNORE - 64)) | (1L << (T_IMMEDIATE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_OBJECT - 128)) | (1L << (T_OFF - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)) | (1L << (T_SESSIONS - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIGNAL - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)) | (1L << (T_SQL - 192)) | (1L << (T_SQLEXCEPTION - 192)) | (1L << (T_SQLINSERT - 192)) | (1L << (T_SQLSTATE - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)))) != 0)) ) {
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
		case 69:
			return create_routine_params_sempred((Create_routine_paramsContext)_localctx, predIndex);
		case 109:
			return select_list_alias_sempred((Select_list_aliasContext)_localctx, predIndex);
		case 120:
			return from_alias_clause_sempred((From_alias_clauseContext)_localctx, predIndex);
		case 130:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 138:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 155:
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
		        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
		        ;
		}
		return true;
	}
	private boolean select_list_alias_sempred(Select_list_aliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM");
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u016b\u0a0f\4\2\t"+
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
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\3\2\3\2\3\2\3\3\3\3\5"+
		"\3\u0154\n\3\3\3\5\3\u0157\n\3\6\3\u0159\n\3\r\3\16\3\u015a\3\4\5\4\u015e"+
		"\n\4\3\4\3\4\3\4\5\4\u0163\n\4\3\4\3\4\3\5\3\5\3\5\5\5\u016a\n\5\3\5\3"+
		"\5\3\5\3\5\5\5\u0170\n\5\5\5\u0172\n\5\3\6\3\6\3\6\3\7\3\7\6\7\u0179\n"+
		"\7\r\7\16\7\u017a\3\7\5\7\u017e\n\7\5\7\u0180\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u019d\n\b\3\t\3\t\3\n\3\n\6\n\u01a3\n\n\r\n\16"+
		"\n\u01a4\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\5\16\u01b5\n\16\3\16\3\16\3\16\7\16\u01ba\n\16\f\16\16\16\u01bd\13"+
		"\16\5\16\u01bf\n\16\3\17\3\17\3\17\5\17\u01c4\n\17\3\20\3\20\5\20\u01c8"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01d1\n\20\3\20\3\20\3\20"+
		"\5\20\u01d6\n\20\3\21\3\21\3\21\3\21\7\21\u01dc\n\21\f\21\16\21\u01df"+
		"\13\21\3\21\3\21\5\21\u01e3\n\21\3\21\3\21\3\21\3\21\3\21\7\21\u01ea\n"+
		"\21\f\21\16\21\u01ed\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u01f6"+
		"\n\22\f\22\16\22\u01f9\13\22\3\22\3\22\5\22\u01fd\n\22\3\22\5\22\u0200"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u020a\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u0211\n\23\f\23\16\23\u0214\13\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0221\n\25\3\25\3\25\5\25"+
		"\u0225\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u022e\n\27\f\27\16"+
		"\27\u0231\13\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0239\n\30\f\30\16"+
		"\30\u023c\13\30\3\31\3\31\3\31\3\31\3\31\7\31\u0243\n\31\f\31\16\31\u0246"+
		"\13\31\3\32\3\32\3\32\3\32\3\32\5\32\u024d\n\32\3\33\3\33\3\33\7\33\u0252"+
		"\n\33\f\33\16\33\u0255\13\33\3\33\5\33\u0258\n\33\3\33\3\33\5\33\u025c"+
		"\n\33\3\33\7\33\u025f\n\33\f\33\16\33\u0262\13\33\3\33\5\33\u0265\n\33"+
		"\3\33\3\33\3\33\5\33\u026a\n\33\3\33\3\33\5\33\u026e\n\33\3\33\3\33\5"+
		"\33\u0272\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u027c\n\35"+
		"\3\35\3\35\5\35\u0280\n\35\3\35\3\35\3\35\5\35\u0285\n\35\3\36\3\36\3"+
		"\36\5\36\u028a\n\36\3\36\3\36\5\36\u028e\n\36\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3 \5 \u029b\n \3 \3 \3!\5!\u02a0\n!\3!\3!\3!\3!\5!\u02a6"+
		"\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u02af\n\"\3\"\3\"\5\"\u02b3\n\"\3\""+
		"\3\"\3#\3#\3#\3#\5#\u02bb\n#\3#\5#\u02be\n#\3#\3#\3#\5#\u02c3\n#\3#\3"+
		"#\3$\5$\u02c8\n$\3$\3$\3$\3$\3$\5$\u02cf\n$\3$\3$\3$\3$\3$\5$\u02d6\n"+
		"$\3$\5$\u02d9\n$\3%\3%\3%\7%\u02de\n%\f%\16%\u02e1\13%\3&\3&\3&\5&\u02e6"+
		"\n&\3&\7&\u02e9\n&\f&\16&\u02ec\13&\3&\7&\u02ef\n&\f&\16&\u02f2\13&\3"+
		"&\3&\5&\u02f6\n&\3&\5&\u02f9\n&\3\'\3\'\3(\3(\5(\u02ff\n(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\7(\u030b\n(\f(\16(\u030e\13(\3(\3(\3(\3(\3(\7(\u0315"+
		"\n(\f(\16(\u0318\13(\3(\3(\3(\5(\u031d\n(\3)\3)\3)\5)\u0322\n)\3)\3)\3"+
		")\5)\u0327\n)\3)\3)\3)\5)\u032c\n)\7)\u032e\n)\f)\16)\u0331\13)\3)\3)"+
		"\5)\u0335\n)\3)\5)\u0338\n)\3)\3)\3)\3)\3)\3)\7)\u0340\n)\f)\16)\u0343"+
		"\13)\3)\3)\3)\3)\3)\3)\3)\7)\u034c\n)\f)\16)\u034f\13)\3)\3)\7)\u0353"+
		"\n)\f)\16)\u0356\13)\5)\u0358\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0364"+
		"\n*\3+\6+\u0367\n+\r+\16+\u0368\3,\3,\3,\5,\u036e\n,\3-\5-\u0371\n-\3"+
		"-\3-\3.\6.\u0376\n.\r.\16.\u0377\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0384"+
		"\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\6\60\u0391"+
		"\n\60\r\60\16\60\u0392\3\60\3\60\3\60\5\60\u0398\n\60\3\61\5\61\u039b"+
		"\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u03a8"+
		"\n\61\f\61\16\61\u03ab\13\61\3\61\3\61\3\61\5\61\u03b0\n\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u03bb\n\61\3\62\5\62\u03be\n"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u03c6\n\62\f\62\16\62\u03c9\13"+
		"\62\3\62\3\62\3\62\3\62\5\62\u03cf\n\62\3\63\3\63\3\63\3\63\5\63\u03d5"+
		"\n\63\3\64\3\64\3\64\3\64\7\64\u03db\n\64\f\64\16\64\u03de\13\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u03e7\n\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65"+
		"\u03fb\n\65\3\66\3\66\3\66\3\66\5\66\u0401\n\66\3\67\3\67\5\67\u0405\n"+
		"\67\3\67\3\67\3\67\5\67\u040a\n\67\3\67\3\67\5\67\u040e\n\67\3\67\3\67"+
		"\3\67\5\67\u0413\n\67\3\67\5\67\u0416\n\67\3\67\3\67\3\67\5\67\u041b\n"+
		"\67\3\67\5\67\u041e\n\67\38\38\38\38\38\38\38\38\38\38\38\38\58\u042c"+
		"\n8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\58\u044b\n8\58\u044d\n8\39\39\39\59\u0452\n9\39"+
		"\39\59\u0456\n9\39\39\3:\5:\u045b\n:\3:\3:\3:\3:\3:\5:\u0462\n:\3:\5:"+
		"\u0465\n:\3;\5;\u0468\n;\3;\3;\3;\5;\u046d\n;\3;\3;\5;\u0471\n;\5;\u0473"+
		"\n;\3<\3<\3<\3<\3<\5<\u047a\n<\3<\3<\7<\u047e\n<\f<\16<\u0481\13<\3=\3"+
		"=\3=\3=\5=\u0487\n=\3>\3>\3>\3>\5>\u048d\n>\3>\5>\u0490\n>\3>\3>\3>\5"+
		">\u0495\n>\3>\3>\5>\u0499\n>\3>\5>\u049c\n>\3>\3>\3?\3?\3?\5?\u04a3\n"+
		"?\3@\3@\3@\3@\5@\u04a9\n@\3@\5@\u04ac\n@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u04b6"+
		"\n@\3A\3A\3A\3A\3A\7A\u04bd\nA\fA\16A\u04c0\13A\3B\3B\3B\3B\5B\u04c6\n"+
		"B\3B\3B\3B\3B\3B\5B\u04cd\nB\5B\u04cf\nB\3C\3C\3C\3C\5C\u04d5\nC\3C\5"+
		"C\u04d8\nC\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u04e3\nC\3D\3D\3D\3D\3D\7D\u04ea"+
		"\nD\fD\16D\u04ed\13D\3E\3E\3E\5E\u04f2\nE\3F\3F\3F\3F\5F\u04f8\nF\3F\5"+
		"F\u04fb\nF\3F\3F\3F\5F\u0500\nF\3F\5F\u0503\nF\3F\5F\u0506\nF\3F\5F\u0509"+
		"\nF\3F\5F\u050c\nF\3F\3F\3F\3F\5F\u0512\nF\3G\3G\3G\3G\3G\3G\7G\u051a"+
		"\nG\fG\16G\u051d\13G\3G\3G\3G\3G\3G\3G\7G\u0525\nG\fG\16G\u0528\13G\5"+
		"G\u052a\nG\3H\3H\3H\3H\3H\5H\u0531\nH\3H\3H\3H\5H\u0536\nH\3H\7H\u0539"+
		"\nH\fH\16H\u053c\13H\3H\5H\u053f\nH\3H\3H\3H\3H\3H\3H\5H\u0547\nH\3H\3"+
		"H\5H\u054b\nH\3H\7H\u054e\nH\fH\16H\u0551\13H\3H\5H\u0554\nH\5H\u0556"+
		"\nH\3I\6I\u0559\nI\rI\16I\u055a\3J\3J\3J\3J\3J\3J\5J\u0563\nJ\3J\3J\3"+
		"J\5J\u0568\nJ\3K\3K\5K\u056c\nK\3K\3K\3K\3K\3K\3K\5K\u0574\nK\3K\3K\3"+
		"K\3K\7K\u057a\nK\fK\16K\u057d\13K\5K\u057f\nK\3K\5K\u0582\nK\3L\3L\3L"+
		"\5L\u0587\nL\3M\3M\3M\3M\3M\7M\u058e\nM\fM\16M\u0591\13M\3M\5M\u0594\n"+
		"M\3M\3M\3M\3N\3N\3N\3N\3N\5N\u059e\nN\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3"+
		"P\3Q\3Q\3Q\3R\3R\5R\u05b0\nR\3R\3R\5R\u05b4\nR\3S\3S\5S\u05b8\nS\3T\3"+
		"T\3T\3T\3T\3T\3U\3U\5U\u05c2\nU\3U\3U\3U\3U\5U\u05c8\nU\3U\3U\5U\u05cc"+
		"\nU\3V\3V\5V\u05d0\nV\3V\3V\3V\3V\3V\3V\3V\3V\7V\u05da\nV\fV\16V\u05dd"+
		"\13V\3V\3V\3W\3W\5W\u05e3\nW\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u05f1"+
		"\nY\fY\16Y\u05f4\13Y\3Y\3Y\7Y\u05f8\nY\fY\16Y\u05fb\13Y\3Z\5Z\u05fe\n"+
		"Z\3Z\3Z\5Z\u0602\nZ\3[\3[\5[\u0606\n[\3\\\3\\\3\\\5\\\u060b\n\\\3]\5]"+
		"\u060e\n]\3]\3]\5]\u0612\n]\3]\5]\u0615\n]\3]\3]\3^\3^\3^\3_\3_\3_\3_"+
		"\5_\u0620\n_\3_\5_\u0623\n_\3_\3_\3_\3`\3`\3`\3`\5`\u062c\n`\3`\3`\3`"+
		"\3`\3`\5`\u0633\n`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\5a\u0640\na\3b\3b"+
		"\3b\3b\7b\u0646\nb\fb\16b\u0649\13b\3c\5c\u064c\nc\3c\3c\3d\3d\3d\3d\7"+
		"d\u0654\nd\fd\16d\u0657\13d\3e\3e\5e\u065b\ne\3e\3e\3e\3e\3e\3f\3f\3f"+
		"\3f\7f\u0666\nf\ff\16f\u0669\13f\3f\3f\3g\3g\3g\3g\7g\u0671\ng\fg\16g"+
		"\u0674\13g\3h\3h\3h\3h\3h\5h\u067b\nh\3i\3i\5i\u067f\ni\3i\3i\5i\u0683"+
		"\ni\3i\3i\5i\u0687\ni\5i\u0689\ni\3j\3j\3j\5j\u068e\nj\3j\5j\u0691\nj"+
		"\3j\5j\u0694\nj\3j\5j\u0697\nj\3j\3j\5j\u069b\nj\3j\5j\u069e\nj\3j\5j"+
		"\u06a1\nj\3k\5k\u06a4\nk\3k\5k\u06a7\nk\3k\3k\3k\7k\u06ac\nk\fk\16k\u06af"+
		"\13k\3l\3l\3m\3m\3m\3n\3n\3n\5n\u06b9\nn\3n\3n\5n\u06bd\nn\3n\5n\u06c0"+
		"\nn\3o\3o\5o\u06c4\no\3o\3o\3o\3o\3o\5o\u06cb\no\3p\3p\5p\u06cf\np\3p"+
		"\3p\3q\3q\3q\3q\7q\u06d7\nq\fq\16q\u06da\13q\3r\3r\3r\7r\u06df\nr\fr\16"+
		"r\u06e2\13r\3s\3s\3s\5s\u06e7\ns\3t\3t\5t\u06eb\nt\3u\3u\3u\3u\5u\u06f1"+
		"\nu\3v\3v\3v\3v\3v\3v\3v\5v\u06fa\nv\3w\5w\u06fd\nw\3w\3w\3w\5w\u0702"+
		"\nw\3w\5w\u0705\nw\3x\3x\3x\3x\3x\3x\7x\u070d\nx\fx\16x\u0710\13x\3x\3"+
		"x\5x\u0714\nx\3y\3y\3y\3y\3y\7y\u071b\ny\fy\16y\u071e\13y\3y\3y\5y\u0722"+
		"\ny\3z\3z\5z\u0726\nz\3z\3z\3z\3z\3z\7z\u072d\nz\fz\16z\u0730\13z\3z\5"+
		"z\u0733\nz\3{\3{\3|\3|\3|\3}\3}\3}\3}\3}\7}\u073f\n}\f}\16}\u0742\13}"+
		"\3~\3~\3~\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u074e"+
		"\n\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0753\n\u0080\7\u0080\u0755\n"+
		"\u0080\f\u0080\16\u0080\u0758\13\u0080\3\u0081\6\u0081\u075b\n\u0081\r"+
		"\u0081\16\u0081\u075c\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\5\u0082\u0768\n\u0082\5\u0082\u076a\n\u0082\3"+
		"\u0083\5\u0083\u076d\n\u0083\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3"+
		"\u0084\5\u0084\u0775\n\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5"+
		"\u0084\u077c\n\u0084\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u0782\n\u0084"+
		"\f\u0084\16\u0084\u0785\13\u0084\3\u0085\3\u0085\3\u0085\5\u0085\u078a"+
		"\n\u0085\3\u0086\3\u0086\3\u0086\5\u0086\u078f\n\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u079a"+
		"\n\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086"+
		"\u07a3\n\u0086\3\u0087\3\u0087\5\u0087\u07a7\n\u0087\3\u0087\3\u0087\3"+
		"\u0087\3\u0087\3\u0087\7\u0087\u07ae\n\u0087\f\u0087\16\u0087\u07b1\13"+
		"\u0087\3\u0087\5\u0087\u07b4\n\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3"+
		"\u0088\3\u0088\7\u0088\u07bc\n\u0088\f\u0088\16\u0088\u07bf\13\u0088\3"+
		"\u0088\3\u0088\5\u0088\u07c3\n\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3"+
		"\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u07d9"+
		"\n\u008b\3\u008b\5\u008b\u07dc\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u07ef\n\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\7\u008c\u07ff\n\u008c\f\u008c\16\u008c\u0802"+
		"\13\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\5\u008d\u080c\n\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\7\u0090\u0819\n\u0090\f\u0090"+
		"\16\u0090\u081c\13\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\5\u0091\u0827\n\u0091\3\u0092\3\u0092\5\u0092"+
		"\u082b\n\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\6\u0093\u0834\n\u0093\r\u0093\16\u0093\u0835\3\u0093\3\u0093\5\u0093"+
		"\u083a\n\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\6\u0094\u0844\n\u0094\r\u0094\16\u0094\u0845\3\u0094\3\u0094"+
		"\5\u0094\u084a\n\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0096\3\u0096\3\u0096\5\u0096\u0855\n\u0096\3\u0096\3\u0096\3\u0096"+
		"\5\u0096\u085a\n\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u085f\n\u0096\3"+
		"\u0096\3\u0096\5\u0096\u0863\n\u0096\3\u0096\3\u0096\5\u0096\u0867\n\u0096"+
		"\3\u0096\3\u0096\3\u0096\5\u0096\u086c\n\u0096\3\u0096\3\u0096\5\u0096"+
		"\u0870\n\u0096\3\u0096\3\u0096\5\u0096\u0874\n\u0096\3\u0096\3\u0096\3"+
		"\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\5\u0096\u088b\n\u0096\5\u0096\u088d\n\u0096\3\u0096\3\u0096\3"+
		"\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u089f\n\u0096\5\u0096"+
		"\u08a1\n\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096"+
		"\u08a9\n\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u08ae\n\u0096\3\u0096\3"+
		"\u0096\3\u0096\5\u0096\u08b3\n\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u08b8"+
		"\n\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\5\u0096\u08c5\n\u0096\3\u0096\3\u0096\3\u0096"+
		"\5\u0096\u08ca\n\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u08cf\n\u0096\3"+
		"\u0096\3\u0096\3\u0096\5\u0096\u08d4\n\u0096\3\u0096\3\u0096\3\u0096\5"+
		"\u0096\u08d9\n\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u08de\n\u0096\3\u0096"+
		"\3\u0096\3\u0096\5\u0096\u08e3\n\u0096\3\u0096\3\u0096\3\u0096\5\u0096"+
		"\u08e8\n\u0096\5\u0096\u08ea\n\u0096\3\u0097\3\u0097\3\u0098\3\u0098\3"+
		"\u0098\5\u0098\u08f1\n\u0098\3\u0098\5\u0098\u08f4\n\u0098\3\u0098\3\u0098"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\7\u0099\u08fd\n\u0099\f\u0099"+
		"\16\u0099\u0900\13\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\5\u009a\u0909\n\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\5\u009a\u0911\n\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\5\u009a\u091a\n\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\5\u009a\u0920\n\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\7\u009a\u092f"+
		"\n\u009a\f\u009a\16\u009a\u0932\13\u009a\5\u009a\u0934\n\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\7\u009a\u0942\n\u009a\f\u009a\16\u009a\u0945\13\u009a"+
		"\5\u009a\u0947\n\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\7\u009a\u0955\n\u009a"+
		"\f\u009a\16\u009a\u0958\13\u009a\5\u009a\u095a\n\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\7\u009a\u0968\n\u009a\f\u009a\16\u009a\u096b\13\u009a\5\u009a"+
		"\u096d\n\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\7\u009a\u097b\n\u009a\f\u009a"+
		"\16\u009a\u097e\13\u009a\5\u009a\u0980\n\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\7\u009a\u098e\n\u009a\f\u009a\16\u009a\u0991\13\u009a\5\u009a\u0993\n"+
		"\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\7\u009a\u099f\n\u009a\f\u009a\16\u009a\u09a2\13\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\6\u009a\u09ae\n\u009a\r\u009a\16\u009a\u09af\3\u009a\3\u009a"+
		"\5\u009a\u09b4\n\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a"+
		"\u09c4\n\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u09ca\n\u009a\3"+
		"\u009b\3\u009b\3\u009b\5\u009b\u09cf\n\u009b\3\u009b\3\u009b\3\u009c\3"+
		"\u009c\3\u009c\7\u009c\u09d6\n\u009c\f\u009c\16\u009c\u09d9\13\u009c\3"+
		"\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u09df\n\u009d\5\u009d\u09e1\n\u009d"+
		"\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u00a0"+
		"\3\u00a0\5\u00a0\u09ed\n\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u09f2\n"+
		"\u00a0\7\u00a0\u09f4\n\u00a0\f\u00a0\16\u00a0\u09f7\13\u00a0\3\u00a1\3"+
		"\u00a1\5\u00a1\u09fb\n\u00a1\3\u00a2\5\u00a2\u09fe\n\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a3\5\u00a3\u0a03\n\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a5"+
		"\3\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\2\4\u0106\u0116\u00a8"+
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
		"\2-\5\2\3\4\u014e\u014e\u015f\u015f\4\2__\u0129\u0129\3\2\u00a1\u00a2"+
		"\5\2\17\17oo\u0092\u0092\4\2!!))\4\2\67\67hh\4\2\u00af\u00af\u00f3\u00f3"+
		"\4\2\20\20RR\4\2OO\u011e\u011e\4\2ii\u00a4\u00a4\4\2OO\u00cf\u00cf\4\2"+
		"KK\u0081\u0081\5\2\u0085\u0085\u00aa\u00aa\u00cb\u00cc\4\2\u00a6\u00a6"+
		"\u00b6\u00b6\4\2\u00b3\u00b3\u0131\u0131\4\2\u00a9\u00a9\u0164\u0164\4"+
		"\2\37\37&&\4\2$$>>\4\2AA\u00ec\u00ec\4\2\17\17\u0092\u0092\3\2\u00e0\u00e1"+
		"\3\2\u00d1\u00d2\6\2==MM\u0091\u0091\u00c8\u00c8\3\2cd\3\2\\]\4\2\u00e7"+
		"\u00e7\u010b\u010b\6\2\r\16\u00b4\u00b4\u00d6\u00d6\u012f\u012f\3\2\u00be"+
		"\u00bf\4\2\u00f4\u00f4\u0119\u0119\4\2\36\36\u0105\u0105\3\2\u00f1\u00f2"+
		"\4\2\n\nUU\5\2tt\u009b\u009b\u00e3\u00e3\5\2>>\u00e8\u00e9\u011f\u011f"+
		"\5\2ff\u00f7\u00f7\u011e\u011e\4\2\f\f\u00c2\u00c2\5\2\u009c\u009c\u00da"+
		"\u00da\u00e4\u00e4\5\2EF\u00ac\u00ad\u00ed\u00ee\4\2\64\64\u014d\u014d"+
		"\5\2rr\u0093\u0093\u00b9\u00b9\4\2\u014a\u014a\u0160\u0160\4\2jj\u011a"+
		"\u011a\25\2\b\b\f\31\33\61\63SUXZZ^uw|~\u0087\u0089\u00aa\u00ac\u00b9"+
		"\u00bb\u00cc\u00ce\u00fa\u00fc\u0114\u0116\u011a\u011d\u0128\u012b\u012d"+
		"\u012f\u013b\u0142\u0149\2\u0b6e\2\u014e\3\2\2\2\4\u0158\3\2\2\2\6\u015d"+
		"\3\2\2\2\b\u0171\3\2\2\2\n\u0173\3\2\2\2\f\u017f\3\2\2\2\16\u019c\3\2"+
		"\2\2\20\u019e\3\2\2\2\22\u01a0\3\2\2\2\24\u01a6\3\2\2\2\26\u01ac\3\2\2"+
		"\2\30\u01ae\3\2\2\2\32\u01be\3\2\2\2\34\u01c3\3\2\2\2\36\u01d5\3\2\2\2"+
		" \u01d7\3\2\2\2\"\u01fc\3\2\2\2$\u0206\3\2\2\2&\u021a\3\2\2\2(\u021c\3"+
		"\2\2\2*\u0226\3\2\2\2,\u0229\3\2\2\2.\u0232\3\2\2\2\60\u023d\3\2\2\2\62"+
		"\u024c\3\2\2\2\64\u0271\3\2\2\2\66\u0273\3\2\2\28\u027b\3\2\2\2:\u0286"+
		"\3\2\2\2<\u028f\3\2\2\2>\u0292\3\2\2\2@\u029f\3\2\2\2B\u02a9\3\2\2\2D"+
		"\u02b6\3\2\2\2F\u02d5\3\2\2\2H\u02da\3\2\2\2J\u02f8\3\2\2\2L\u02fa\3\2"+
		"\2\2N\u031c\3\2\2\2P\u0357\3\2\2\2R\u0359\3\2\2\2T\u0366\3\2\2\2V\u036d"+
		"\3\2\2\2X\u0370\3\2\2\2Z\u0375\3\2\2\2\\\u0383\3\2\2\2^\u0397\3\2\2\2"+
		"`\u03ba\3\2\2\2b\u03ce\3\2\2\2d\u03d4\3\2\2\2f\u03d6\3\2\2\2h\u03fa\3"+
		"\2\2\2j\u0400\3\2\2\2l\u041d\3\2\2\2n\u044c\3\2\2\2p\u044e\3\2\2\2r\u0464"+
		"\3\2\2\2t\u0472\3\2\2\2v\u0474\3\2\2\2x\u0486\3\2\2\2z\u048f\3\2\2\2|"+
		"\u049f\3\2\2\2~\u04ab\3\2\2\2\u0080\u04b7\3\2\2\2\u0082\u04ce\3\2\2\2"+
		"\u0084\u04d7\3\2\2\2\u0086\u04e4\3\2\2\2\u0088\u04f1\3\2\2\2\u008a\u04fa"+
		"\3\2\2\2\u008c\u0529\3\2\2\2\u008e\u0555\3\2\2\2\u0090\u0558\3\2\2\2\u0092"+
		"\u0567\3\2\2\2\u0094\u0569\3\2\2\2\u0096\u0586\3\2\2\2\u0098\u0588\3\2"+
		"\2\2\u009a\u0598\3\2\2\2\u009c\u059f\3\2\2\2\u009e\u05a5\3\2\2\2\u00a0"+
		"\u05aa\3\2\2\2\u00a2\u05ad\3\2\2\2\u00a4\u05b5\3\2\2\2\u00a6\u05b9\3\2"+
		"\2\2\u00a8\u05c7\3\2\2\2\u00aa\u05cd\3\2\2\2\u00ac\u05e0\3\2\2\2\u00ae"+
		"\u05e4\3\2\2\2\u00b0\u05e6\3\2\2\2\u00b2\u05fd\3\2\2\2\u00b4\u0603\3\2"+
		"\2\2\u00b6\u060a\3\2\2\2\u00b8\u0611\3\2\2\2\u00ba\u0618\3\2\2\2\u00bc"+
		"\u061b\3\2\2\2\u00be\u0627\3\2\2\2\u00c0\u063f\3\2\2\2\u00c2\u0641\3\2"+
		"\2\2\u00c4\u064b\3\2\2\2\u00c6\u064f\3\2\2\2\u00c8\u0658\3\2\2\2\u00ca"+
		"\u0661\3\2\2\2\u00cc\u066c\3\2\2\2\u00ce\u067a\3\2\2\2\u00d0\u0688\3\2"+
		"\2\2\u00d2\u068a\3\2\2\2\u00d4\u06a3\3\2\2\2\u00d6\u06b0\3\2\2\2\u00d8"+
		"\u06b2\3\2\2\2\u00da\u06bf\3\2\2\2\u00dc\u06ca\3\2\2\2\u00de\u06ce\3\2"+
		"\2\2\u00e0\u06d2\3\2\2\2\u00e2\u06db\3\2\2\2\u00e4\u06e6\3\2\2\2\u00e6"+
		"\u06e8\3\2\2\2\u00e8\u06ec\3\2\2\2\u00ea\u06f9\3\2\2\2\u00ec\u0704\3\2"+
		"\2\2\u00ee\u0706\3\2\2\2\u00f0\u0721\3\2\2\2\u00f2\u0723\3\2\2\2\u00f4"+
		"\u0734\3\2\2\2\u00f6\u0736\3\2\2\2\u00f8\u0739\3\2\2\2\u00fa\u0743\3\2"+
		"\2\2\u00fc\u0746\3\2\2\2\u00fe\u0749\3\2\2\2\u0100\u075a\3\2\2\2\u0102"+
		"\u0769\3\2\2\2\u0104\u076c\3\2\2\2\u0106\u077b\3\2\2\2\u0108\u0789\3\2"+
		"\2\2\u010a\u07a2\3\2\2\2\u010c\u07a4\3\2\2\2\u010e\u07b7\3\2\2\2\u0110"+
		"\u07c9\3\2\2\2\u0112\u07cd\3\2\2\2\u0114\u07db\3\2\2\2\u0116\u07ee\3\2"+
		"\2\2\u0118\u080b\3\2\2\2\u011a\u080d\3\2\2\2\u011c\u0811\3\2\2\2\u011e"+
		"\u0813\3\2\2\2\u0120\u0826\3\2\2\2\u0122\u082a\3\2\2\2\u0124\u082c\3\2"+
		"\2\2\u0126\u083d\3\2\2\2\u0128\u084d\3\2\2\2\u012a\u08e9\3\2\2\2\u012c"+
		"\u08eb\3\2\2\2\u012e\u08ed\3\2\2\2\u0130\u08f7\3\2\2\2\u0132\u09c9\3\2"+
		"\2\2\u0134\u09cb\3\2\2\2\u0136\u09d2\3\2\2\2\u0138\u09da\3\2\2\2\u013a"+
		"\u09e4\3\2\2\2\u013c\u09e7\3\2\2\2\u013e\u09ec\3\2\2\2\u0140\u09fa\3\2"+
		"\2\2\u0142\u09fd\3\2\2\2\u0144\u0a02\3\2\2\2\u0146\u0a06\3\2\2\2\u0148"+
		"\u0a08\3\2\2\2\u014a\u0a0a\3\2\2\2\u014c\u0a0c\3\2\2\2\u014e\u014f\5\4"+
		"\3\2\u014f\u0150\7\2\2\3\u0150\3\3\2\2\2\u0151\u0154\5\6\4\2\u0152\u0154"+
		"\5\16\b\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154\u0156\3\2\2\2"+
		"\u0155\u0157\7x\2\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159"+
		"\3\2\2\2\u0158\u0153\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\5\3\2\2\2\u015c\u015e\5.\30\2\u015d\u015c\3\2\2\2"+
		"\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\7\25\2\2\u0160\u0162"+
		"\5\4\3\2\u0161\u0163\5\22\n\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2"+
		"\u0163\u0164\3\2\2\2\u0164\u0165\5\n\6\2\u0165\7\3\2\2\2\u0166\u0167\7"+
		"\25\2\2\u0167\u0169\5\4\3\2\u0168\u016a\5\22\n\2\u0169\u0168\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\5\n\6\2\u016c\u0172\3\2"+
		"\2\2\u016d\u016f\5\16\b\2\u016e\u0170\7\u015f\2\2\u016f\u016e\3\2\2\2"+
		"\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u0166\3\2\2\2\u0171\u016d"+
		"\3\2\2\2\u0172\t\3\2\2\2\u0173\u0174\6\6\2\2\u0174\u0175\7_\2\2\u0175"+
		"\13\3\2\2\2\u0176\u0180\5\6\4\2\u0177\u0179\5\16\b\2\u0178\u0177\3\2\2"+
		"\2\u0179\u017a\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d"+
		"\3\2\2\2\u017c\u017e\7x\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u0180\3\2\2\2\u017f\u0176\3\2\2\2\u017f\u0178\3\2\2\2\u0180\r\3\2\2\2"+
		"\u0181\u019d\5\32\16\2\u0182\u019d\5$\23\2\u0183\u019d\5&\24\2\u0184\u019d"+
		"\5(\25\2\u0185\u019d\5*\26\2\u0186\u019d\5\u00a6T\2\u0187\u019d\5v<\2"+
		"\u0188\u019d\5z>\2\u0189\u019d\5\u00aaV\2\u018a\u019d\5D#\2\u018b\u019d"+
		"\5~@\2\u018c\u019d\5\u0084C\2\u018d\u019d\5\u008aF\2\u018e\u019d\5B\""+
		"\2\u018f\u019d\5,\27\2\u0190\u019d\5\u0094K\2\u0191\u019d\5\u00a2R\2\u0192"+
		"\u019d\5\u00be`\2\u0193\u019d\5\u0096L\2\u0194\u019d\5\u00a4S\2\u0195"+
		"\u019d\5\u00b2Z\2\u0196\u019d\5\u00b4[\2\u0197\u019d\5\u00c4c\2\u0198"+
		"\u019d\5\u00c0a\2\u0199\u019d\5\26\f\2\u019a\u019d\5\30\r\2\u019b\u019d"+
		"\5\20\t\2\u019c\u0181\3\2\2\2\u019c\u0182\3\2\2\2\u019c\u0183\3\2\2\2"+
		"\u019c\u0184\3\2\2\2\u019c\u0185\3\2\2\2\u019c\u0186\3\2\2\2\u019c\u0187"+
		"\3\2\2\2\u019c\u0188\3\2\2\2\u019c\u0189\3\2\2\2\u019c\u018a\3\2\2\2\u019c"+
		"\u018b\3\2\2\2\u019c\u018c\3\2\2\2\u019c\u018d\3\2\2\2\u019c\u018e\3\2"+
		"\2\2\u019c\u018f\3\2\2\2\u019c\u0190\3\2\2\2\u019c\u0191\3\2\2\2\u019c"+
		"\u0192\3\2\2\2\u019c\u0193\3\2\2\2\u019c\u0194\3\2\2\2\u019c\u0195\3\2"+
		"\2\2\u019c\u0196\3\2\2\2\u019c\u0197\3\2\2\2\u019c\u0198\3\2\2\2\u019c"+
		"\u0199\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019d\17\3\2\2"+
		"\2\u019e\u019f\t\2\2\2\u019f\21\3\2\2\2\u01a0\u01a2\7e\2\2\u01a1\u01a3"+
		"\5\24\13\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a2\3\2\2\2"+
		"\u01a4\u01a5\3\2\2\2\u01a5\23\3\2\2\2\u01a6\u01a7\7\u0129\2\2\u01a7\u01a8"+
		"\7\u0161\2\2\u01a8\u01a9\7\u0113\2\2\u01a9\u01aa\5\4\3\2\u01aa\u01ab\n"+
		"\3\2\2\u01ab\25\3\2\2\2\u01ac\u01ad\7\u00ba\2\2\u01ad\27\3\2\2\2\u01ae"+
		"\u01af\6\r\3\2\u01af\u01b0\5\u0116\u008c\2\u01b0\31\3\2\2\2\u01b1\u01b2"+
		"\7\u00f3\2\2\u01b2\u01bf\5\u00b6\\\2\u01b3\u01b5\7\u00f3\2\2\u01b4\u01b3"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01bb\5\34\17\2"+
		"\u01b7\u01b8\7\u014c\2\2\u01b8\u01ba\5\34\17\2\u01b9\u01b7\3\2\2\2\u01ba"+
		"\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bf\3\2"+
		"\2\2\u01bd\u01bb\3\2\2\2\u01be\u01b1\3\2\2\2\u01be\u01b4\3\2\2\2\u01bf"+
		"\33\3\2\2\2\u01c0\u01c4\5\36\20\2\u01c1\u01c4\5 \21\2\u01c2\u01c4\5\""+
		"\22\2\u01c3\u01c0\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4"+
		"\35\3\2\2\2\u01c5\u01c7\5\u013e\u00a0\2\u01c6\u01c8\7\u014b\2\2\u01c7"+
		"\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\7\u0150"+
		"\2\2\u01ca\u01cb\5\u0116\u008c\2\u01cb\u01d6\3\2\2\2\u01cc\u01cd\7\u015a"+
		"\2\2\u01cd\u01ce\5\u013e\u00a0\2\u01ce\u01d0\7\u015d\2\2\u01cf\u01d1\7"+
		"\u014b\2\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2"+
		"\u01d2\u01d3\7\u0150\2\2\u01d3\u01d4\5\u0116\u008c\2\u01d4\u01d6\3\2\2"+
		"\2\u01d5\u01c5\3\2\2\2\u01d5\u01cc\3\2\2\2\u01d6\37\3\2\2\2\u01d7\u01d8"+
		"\7\u015a\2\2\u01d8\u01dd\5\u013e\u00a0\2\u01d9\u01da\7\u014c\2\2\u01da"+
		"\u01dc\5\u013e\u00a0\2\u01db\u01d9\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db"+
		"\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0"+
		"\u01e2\7\u015d\2\2\u01e1\u01e3\7\u014b\2\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3"+
		"\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\7\u0150\2\2\u01e5\u01e6\7\u015a"+
		"\2\2\u01e6\u01eb\5\u0116\u008c\2\u01e7\u01e8\7\u014c\2\2\u01e8\u01ea\5"+
		"\u0116\u008c\2\u01e9\u01e7\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2"+
		"\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee"+
		"\u01ef\7\u015d\2\2\u01ef!\3\2\2\2\u01f0\u01fd\5\u013e\u00a0\2\u01f1\u01f2"+
		"\7\u015a\2\2\u01f2\u01f7\5\u013e\u00a0\2\u01f3\u01f4\7\u014c\2\2\u01f4"+
		"\u01f6\5\u013e\u00a0\2\u01f5\u01f3\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5"+
		"\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa"+
		"\u01fb\7\u015d\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01f0\3\2\2\2\u01fc\u01f1"+
		"\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u0200\7\u014b\2\2\u01ff\u01fe\3\2\2"+
		"\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\7\u0150\2\2\u0202"+
		"\u0203\7\u015a\2\2\u0203\u0204\5\u00c4c\2\u0204\u0205\7\u015d\2\2\u0205"+
		"#\3\2\2\2\u0206\u0209\7\21\2\2\u0207\u0208\7\u00de\2\2\u0208\u020a\7\u00f3"+
		"\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u020c\t\4\2\2\u020c\u020d\7\u015a\2\2\u020d\u0212\5\u013e\u00a0\2\u020e"+
		"\u020f\7\u014c\2\2\u020f\u0211\5\u013e\u00a0\2\u0210\u020e\3\2\2\2\u0211"+
		"\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2"+
		"\2\2\u0214\u0212\3\2\2\2\u0215\u0216\7\u015d\2\2\u0216\u0217\7\u012c\2"+
		"\2\u0217\u0218\7\u00d2\2\2\u0218\u0219\5\u013e\u00a0\2\u0219%\3\2\2\2"+
		"\u021a\u021b\7\35\2\2\u021b\'\3\2\2\2\u021c\u021d\7 \2\2\u021d\u0224\5"+
		"\u013e\u00a0\2\u021e\u0220\7\u015a\2\2\u021f\u0221\5\u0136\u009c\2\u0220"+
		"\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0225\7\u015d"+
		"\2\2\u0223\u0225\5\u0136\u009c\2\u0224\u021e\3\2\2\2\u0224\u0223\3\2\2"+
		"\2\u0224\u0225\3\2\2\2\u0225)\3\2\2\2\u0226\u0227\7*\2\2\u0227\u0228\7"+
		"\u0161\2\2\u0228+\3\2\2\2\u0229\u022a\7I\2\2\u022a\u022f\5\62\32\2\u022b"+
		"\u022c\7\u014c\2\2\u022c\u022e\5\62\32\2\u022d\u022b\3\2\2\2\u022e\u0231"+
		"\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230-\3\2\2\2\u0231"+
		"\u022f\3\2\2\2\u0232\u0233\7I\2\2\u0233\u0234\5\62\32\2\u0234\u023a\7"+
		"\u015f\2\2\u0235\u0236\5\62\32\2\u0236\u0237\7\u015f\2\2\u0237\u0239\3"+
		"\2\2\2\u0238\u0235\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023b/\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023e\5\62\32"+
		"\2\u023e\u0244\7\u015f\2\2\u023f\u0240\5\62\32\2\u0240\u0241\7\u015f\2"+
		"\2\u0241\u0243\3\2\2\2\u0242\u023f\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242"+
		"\3\2\2\2\u0244\u0245\3\2\2\2\u0245\61\3\2\2\2\u0246\u0244\3\2\2\2\u0247"+
		"\u024d\58\35\2\u0248\u024d\5\66\34\2\u0249\u024d\5> \2\u024a\u024d\5\64"+
		"\33\2\u024b\u024d\5@!\2\u024c\u0247\3\2\2\2\u024c\u0248\3\2\2\2\u024c"+
		"\u0249\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024b\3\2\2\2\u024d\63\3\2\2"+
		"\2\u024e\u0253\5\u013e\u00a0\2\u024f\u0250\7\u014c\2\2\u0250\u0252\5\u013e"+
		"\u00a0\2\u0251\u024f\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0256\u0258\7\17"+
		"\2\2\u0257\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3\2\2\2\u0259"+
		"\u025b\5n8\2\u025a\u025c\5p9\2\u025b\u025a\3\2\2\2\u025b\u025c\3\2\2\2"+
		"\u025c\u0260\3\2\2\2\u025d\u025f\5r:\2\u025e\u025d\3\2\2\2\u025f\u0262"+
		"\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0264\3\2\2\2\u0262"+
		"\u0260\3\2\2\2\u0263\u0265\5t;\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2"+
		"\2\u0265\u0272\3\2\2\2\u0266\u0267\5\u013e\u00a0\2\u0267\u0269\7\61\2"+
		"\2\u0268\u026a\7\17\2\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\u026d\5n8\2\u026c\u026e\5p9\2\u026d\u026c\3\2\2\2"+
		"\u026d\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\5t;\2\u0270\u0272"+
		"\3\2\2\2\u0271\u024e\3\2\2\2\u0271\u0266\3\2\2\2\u0272\65\3\2\2\2\u0273"+
		"\u0274\5\u013e\u00a0\2\u0274\u0275\7\65\2\2\u0275\67\3\2\2\2\u0276\u0277"+
		"\7\u016b\2\2\u0277\u027c\5\u013e\u00a0\2\u0278\u0279\5\u013e\u00a0\2\u0279"+
		"\u027a\7\u016b\2\2\u027a\u027c\3\2\2\2\u027b\u0276\3\2\2\2\u027b\u0278"+
		"\3\2\2\2\u027c\u027f\3\2\2\2\u027d\u0280\5:\36\2\u027e\u0280\5<\37\2\u027f"+
		"\u027d\3\2\2\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2"+
		"\2\2\u0281\u0284\t\5\2\2\u0282\u0285\5\u00c4c\2\u0283\u0285\5\u0116\u008c"+
		"\2\u0284\u0282\3\2\2\2\u0284\u0283\3\2\2\2\u02859\3\2\2\2\u0286\u0287"+
		"\7\u012c\2\2\u0287\u0289\7\u00e0\2\2\u0288\u028a\7\u00c0\2\2\u0289\u0288"+
		"\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u028c\7\u0117\2"+
		"\2\u028c\u028e\t\6\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e;"+
		"\3\2\2\2\u028f\u0290\7\u012d\2\2\u0290\u0291\7\u00e0\2\2\u0291=\3\2\2"+
		"\2\u0292\u0293\t\7\2\2\u0293\u0294\7z\2\2\u0294\u029a\7o\2\2\u0295\u029b"+
		"\7\u00ff\2\2\u0296\u029b\7\u0102\2\2\u0297\u0298\7\u00b8\2\2\u0298\u029b"+
		"\7r\2\2\u0299\u029b\5\u013e\u00a0\2\u029a\u0295\3\2\2\2\u029a\u0296\3"+
		"\2\2\2\u029a\u0297\3\2\2\2\u029a\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c"+
		"\u029d\5\b\5\2\u029d?\3\2\2\2\u029e\u02a0\7w\2\2\u029f\u029e\3\2\2\2\u029f"+
		"\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\7\u0110\2\2\u02a2\u02a3"+
		"\7\u010e\2\2\u02a3\u02a5\5\u013e\u00a0\2\u02a4\u02a6\5T+\2\u02a5\u02a4"+
		"\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\5F$\2\u02a8"+
		"A\3\2\2\2\u02a9\u02aa\7;\2\2\u02aa\u02ae\7\u010e\2\2\u02ab\u02ac\7\177"+
		"\2\2\u02ac\u02ad\7\u00b8\2\2\u02ad\u02af\7g\2\2\u02ae\u02ab\3\2\2\2\u02ae"+
		"\u02af\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b2\5\u00f4{\2\u02b1\u02b3"+
		"\5T+\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4"+
		"\u02b5\5F$\2\u02b5C\3\2\2\2\u02b6\u02bd\7;\2\2\u02b7\u02b8\7\u009f\2\2"+
		"\u02b8\u02be\7\u0110\2\2\u02b9\u02bb\t\b\2\2\u02ba\u02b9\3\2\2\2\u02ba"+
		"\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\7\u0128\2\2\u02bd\u02b7"+
		"\3\2\2\2\u02bd\u02ba\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\7\u010e\2"+
		"\2\u02c0\u02c2\5\u013e\u00a0\2\u02c1\u02c3\5T+\2\u02c2\u02c1\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\5F$\2\u02c5E\3\2\2\2\u02c6"+
		"\u02c8\7\17\2\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\3"+
		"\2\2\2\u02c9\u02ca\7\u015a\2\2\u02ca\u02cb\5\u00c4c\2\u02cb\u02cc\7\u015d"+
		"\2\2\u02cc\u02d6\3\2\2\2\u02cd\u02cf\7\17\2\2\u02ce\u02cd\3\2\2\2\u02ce"+
		"\u02cf\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d6\5\u00c4c\2\u02d1\u02d2"+
		"\7\u015a\2\2\u02d2\u02d3\5H%\2\u02d3\u02d4\7\u015d\2\2\u02d4\u02d6\3\2"+
		"\2\2\u02d5\u02c7\3\2\2\2\u02d5\u02ce\3\2\2\2\u02d5\u02d1\3\2\2\2\u02d6"+
		"\u02d8\3\2\2\2\u02d7\u02d9\5Z.\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3\2\2"+
		"\2\u02d9G\3\2\2\2\u02da\u02df\5J&\2\u02db\u02dc\7\u014c\2\2\u02dc\u02de"+
		"\5J&\2\u02dd\u02db\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2\2\2\u02df"+
		"\u02e0\3\2\2\2\u02e0I\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02e3\5L\'\2\u02e3"+
		"\u02e5\5n8\2\u02e4\u02e6\5p9\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2"+
		"\u02e6\u02ea\3\2\2\2\u02e7\u02e9\5r:\2\u02e8\u02e7\3\2\2\2\u02e9\u02ec"+
		"\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02f0\3\2\2\2\u02ec"+
		"\u02ea\3\2\2\2\u02ed\u02ef\5N(\2\u02ee\u02ed\3\2\2\2\u02ef\u02f2\3\2\2"+
		"\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f9\3\2\2\2\u02f2\u02f0"+
		"\3\2\2\2\u02f3\u02f4\7\66\2\2\u02f4\u02f6\5\u013e\u00a0\2\u02f5\u02f3"+
		"\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f9\5P)\2\u02f8"+
		"\u02e2\3\2\2\2\u02f8\u02f5\3\2\2\2\u02f9K\3\2\2\2\u02fa\u02fb\5\u013e"+
		"\u00a0\2\u02fbM\3\2\2\2\u02fc\u031d\5t;\2\u02fd\u02ff\7\u00b8\2\2\u02fe"+
		"\u02fd\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u031d\7\u00ba"+
		"\2\2\u0301\u0302\7\u00d0\2\2\u0302\u031d\7\u0097\2\2\u0303\u031d\7\u011d"+
		"\2\2\u0304\u0305\7\u00d9\2\2\u0305\u0306\5\u00f4{\2\u0306\u0307\7\u015a"+
		"\2\2\u0307\u0308\5\u013e\u00a0\2\u0308\u030c\7\u015d\2\2\u0309\u030b\5"+
		"R*\2\u030a\u0309\3\2\2\2\u030b\u030e\3\2\2\2\u030c\u030a\3\2\2\2\u030c"+
		"\u030d\3\2\2\2\u030d\u031d\3\2\2\2\u030e\u030c\3\2\2\2\u030f\u0310\7~"+
		"\2\2\u0310\u0311\7\u015a\2\2\u0311\u0316\7\u0164\2\2\u0312\u0313\7\u014c"+
		"\2\2\u0313\u0315\7\u0164\2\2\u0314\u0312\3\2\2\2\u0315\u0318\3\2\2\2\u0316"+
		"\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0319\3\2\2\2\u0318\u0316\3\2"+
		"\2\2\u0319\u031d\7\u015d\2\2\u031a\u031d\7\23\2\2\u031b\u031d\7^\2\2\u031c"+
		"\u02fc\3\2\2\2\u031c\u02fe\3\2\2\2\u031c\u0301\3\2\2\2\u031c\u0303\3\2"+
		"\2\2\u031c\u0304\3\2\2\2\u031c\u030f\3\2\2\2\u031c\u031a\3\2\2\2\u031c"+
		"\u031b\3\2\2\2\u031dO\3\2\2\2\u031e\u031f\7\u00d0\2\2\u031f\u0321\7\u0097"+
		"\2\2\u0320\u0322\7+\2\2\u0321\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u0323\3\2\2\2\u0323\u0324\7\u015a\2\2\u0324\u0326\5\u013e\u00a0\2\u0325"+
		"\u0327\t\t\2\2\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u032f\3\2"+
		"\2\2\u0328\u0329\7\u014c\2\2\u0329\u032b\5\u013e\u00a0\2\u032a\u032c\t"+
		"\t\2\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032e\3\2\2\2\u032d"+
		"\u0328\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2"+
		"\2\2\u0330\u0332\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0334\7\u015d\2\2\u0333"+
		"\u0335\7^\2\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337\3\2"+
		"\2\2\u0336\u0338\5\u00aeX\2\u0337\u0336\3\2\2\2\u0337\u0338\3\2\2\2\u0338"+
		"\u0358\3\2\2\2\u0339\u033a\7p\2\2\u033a\u033b\7\u0097\2\2\u033b\u033c"+
		"\7\u015a\2\2\u033c\u0341\5\u013e\u00a0\2\u033d\u033e\7\u014c\2\2\u033e"+
		"\u0340\5\u013e\u00a0\2\u033f\u033d\3\2\2\2\u0340\u0343\3\2\2\2\u0341\u033f"+
		"\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0344\3\2\2\2\u0343\u0341\3\2\2\2\u0344"+
		"\u0345\7\u015d\2\2\u0345\u0346\7\u00d9\2\2\u0346\u0347\5\u00f4{\2\u0347"+
		"\u0348\7\u015a\2\2\u0348\u034d\5\u013e\u00a0\2\u0349\u034a\7\u014c\2\2"+
		"\u034a\u034c\5\u013e\u00a0\2\u034b\u0349\3\2\2\2\u034c\u034f\3\2\2\2\u034d"+
		"\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0350\3\2\2\2\u034f\u034d\3\2"+
		"\2\2\u0350\u0354\7\u015d\2\2\u0351\u0353\5R*\2\u0352\u0351\3\2\2\2\u0353"+
		"\u0356\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0358\3\2"+
		"\2\2\u0356\u0354\3\2\2\2\u0357\u031e\3\2\2\2\u0357\u0339\3\2\2\2\u0358"+
		"Q\3\2\2\2\u0359\u035a\7\u00bf\2\2\u035a\u0363\t\n\2\2\u035b\u035c\7\u00b3"+
		"\2\2\u035c\u0364\7\b\2\2\u035d\u0364\7\u00dd\2\2\u035e\u035f\7\u00f3\2"+
		"\2\u035f\u0364\7\u00ba\2\2\u0360\u0361\7\u00f3\2\2\u0361\u0364\7J\2\2"+
		"\u0362\u0364\7\"\2\2\u0363\u035b\3\2\2\2\u0363\u035d\3\2\2\2\u0363\u035e"+
		"\3\2\2\2\u0363\u0360\3\2\2\2\u0363\u0362\3\2\2\2\u0364S\3\2\2\2\u0365"+
		"\u0367\5V,\2\u0366\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0366\3\2\2"+
		"\2\u0368\u0369\3\2\2\2\u0369U\3\2\2\2\u036a\u036b\7\u014c\2\2\u036b\u036e"+
		"\5X-\2\u036c\u036e\5d\63\2\u036d\u036a\3\2\2\2\u036d\u036c\3\2\2\2\u036e"+
		"W\3\2\2\2\u036f\u0371\7\u00b3\2\2\u0370\u036f\3\2\2\2\u0370\u0371\3\2"+
		"\2\2\u0371\u0372\3\2\2\2\u0372\u0373\t\13\2\2\u0373Y\3\2\2\2\u0374\u0376"+
		"\5\\/\2\u0375\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0375\3\2\2\2\u0377"+
		"\u0378\3\2\2\2\u0378[\3\2\2\2\u0379\u037a\7\u00bf\2\2\u037a\u037b\7\62"+
		"\2\2\u037b\u037c\t\f\2\2\u037c\u0384\7\u00e6\2\2\u037d\u0384\5^\60\2\u037e"+
		"\u0384\5`\61\2\u037f\u0384\5b\62\2\u0380\u0384\5d\63\2\u0381\u0384\5j"+
		"\66\2\u0382\u0384\5l\67\2\u0383\u0379\3\2\2\2\u0383\u037d\3\2\2\2\u0383"+
		"\u037e\3\2\2\2\u0383\u037f\3\2\2\2\u0383\u0380\3\2\2\2\u0383\u0381\3\2"+
		"\2\2\u0383\u0382\3\2\2\2\u0384]\3\2\2\2\u0385\u0386\7\u00f0\2\2\u0386"+
		"\u0387\7<\2\2\u0387\u0398\t\r\2\2\u0388\u0389\t\16\2\2\u0389\u0398\7\u0164"+
		"\2\2\u038a\u0398\7\u00b5\2\2\u038b\u0398\t\17\2\2\u038c\u038d\7\u0106"+
		"\2\2\u038d\u0390\7\u015a\2\2\u038e\u0391\5\u013e\u00a0\2\u038f\u0391\7"+
		"\u0164\2\2\u0390\u038e\3\2\2\2\u0390\u038f\3\2\2\2\u0391\u0392\3\2\2\2"+
		"\u0392\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0398"+
		"\7\u015d\2\2\u0395\u0396\7\u010f\2\2\u0396\u0398\5\u013e\u00a0\2\u0397"+
		"\u0385\3\2\2\2\u0397\u0388\3\2\2\2\u0397\u038a\3\2\2\2\u0397\u038b\3\2"+
		"\2\2\u0397\u038c\3\2\2\2\u0397\u0395\3\2\2\2\u0398_\3\2\2\2\u0399\u039b"+
		"\7\u0084\2\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039c\3\2\2"+
		"\2\u039c\u039d\7\u0082\2\2\u039d\u03bb\5\u013e\u00a0\2\u039e\u039f\7\u012c"+
		"\2\2\u039f\u03bb\7\u00db\2\2\u03a0\u03a1\7V\2\2\u03a1\u03a2\7\36\2\2\u03a2"+
		"\u03a3\7{\2\2\u03a3\u03a4\7\u015a\2\2\u03a4\u03a9\5\u013e\u00a0\2\u03a5"+
		"\u03a6\7\u014c\2\2\u03a6\u03a8\5\u013e\u00a0\2\u03a7\u03a5\3\2\2\2\u03a8"+
		"\u03ab\3\2\2\2\u03a9\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ac\3\2"+
		"\2\2\u03ab\u03a9\3\2\2\2\u03ac\u03ad\7\u015d\2\2\u03ad\u03bb\3\2\2\2\u03ae"+
		"\u03b0\7\u00b8\2\2\u03af\u03ae\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1"+
		"\3\2\2\2\u03b1\u03bb\7\u00a5\2\2\u03b2\u03b3\7\63\2\2\u03b3\u03bb\t\20"+
		"\2\2\u03b4\u03b5\7N\2\2\u03b5\u03bb\7\u00c0\2\2\u03b6\u03b7\7\u012c\2"+
		"\2\u03b7\u03b8\7\u00dd\2\2\u03b8\u03b9\7\u00bf\2\2\u03b9\u03bb\7Y\2\2"+
		"\u03ba\u039a\3\2\2\2\u03ba\u039e\3\2\2\2\u03ba\u03a0\3\2\2\2\u03ba\u03af"+
		"\3\2\2\2\u03ba\u03b2\3\2\2\2\u03ba\u03b4\3\2\2\2\u03ba\u03b6\3\2\2\2\u03bb"+
		"a\3\2\2\2\u03bc\u03be\7\u011d\2\2\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2"+
		"\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\7\u00d0\2\2\u03c0\u03c1\7\u0084\2"+
		"\2\u03c1\u03c2\7\u015a\2\2\u03c2\u03c7\5\u013e\u00a0\2\u03c3\u03c4\7\u014c"+
		"\2\2\u03c4\u03c6\5\u013e\u00a0\2\u03c5\u03c3\3\2\2\2\u03c6\u03c9\3\2\2"+
		"\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03c7"+
		"\3\2\2\2\u03ca\u03cb\7\u015d\2\2\u03cb\u03cf\3\2\2\2\u03cc\u03cd\7\u012c"+
		"\2\2\u03cd\u03cf\7B\2\2\u03ce\u03bd\3\2\2\2\u03ce\u03cc\3\2\2\2\u03cf"+
		"c\3\2\2\2\u03d0\u03d5\5f\64\2\u03d1\u03d2\7\u0107\2\2\u03d2\u03d3\7\17"+
		"\2\2\u03d3\u03d5\5\u013e\u00a0\2\u03d4\u03d0\3\2\2\2\u03d4\u03d1\3\2\2"+
		"\2\u03d5e\3\2\2\2\u03d6\u03d7\7\u00e5\2\2\u03d7\u03d8\7q\2\2\u03d8\u03dc"+
		"\7P\2\2\u03d9\u03db\5h\65\2\u03da\u03d9\3\2\2\2\u03db\u03de\3\2\2\2\u03dc"+
		"\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03ddg\3\2\2\2\u03de\u03dc\3\2\2\2"+
		"\u03df\u03e0\7k\2\2\u03e0\u03e1\7\u0111\2\2\u03e1\u03e2\7\36\2\2\u03e2"+
		"\u03e6\5\u0116\u008c\2\u03e3\u03e4\7a\2\2\u03e4\u03e5\7\36\2\2\u03e5\u03e7"+
		"\5\u0116\u008c\2\u03e6\u03e3\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03fb\3"+
		"\2\2\2\u03e8\u03e9\7.\2\2\u03e9\u03ea\7\u0094\2\2\u03ea\u03eb\7\u0111"+
		"\2\2\u03eb\u03ec\7\36\2\2\u03ec\u03fb\5\u0116\u008c\2\u03ed\u03ee\7\u00a8"+
		"\2\2\u03ee\u03ef\7\u0098\2\2\u03ef\u03f0\7\u0111\2\2\u03f0\u03f1\7\36"+
		"\2\2\u03f1\u03fb\5\u0116\u008c\2\u03f2\u03f3\7\u009e\2\2\u03f3\u03f4\7"+
		"\u0111\2\2\u03f4\u03f5\7\36\2\2\u03f5\u03fb\5\u0116\u008c\2\u03f6\u03f7"+
		"\7\u00ba\2\2\u03f7\u03f8\7L\2\2\u03f8\u03f9\7\17\2\2\u03f9\u03fb\5\u0116"+
		"\u008c\2\u03fa\u03df\3\2\2\2\u03fa\u03e8\3\2\2\2\u03fa\u03ed\3\2\2\2\u03fa"+
		"\u03f2\3\2\2\2\u03fa\u03f6\3\2\2\2\u03fbi\3\2\2\2\u03fc\u03fd\7\u00bf"+
		"\2\2\u03fd\u0401\5\u013e\u00a0\2\u03fe\u03ff\7\u0112\2\2\u03ff\u0401\5"+
		"\u013e\u00a0\2\u0400\u03fc\3\2\2\2\u0400\u03fe\3\2\2\2\u0401k\3\2\2\2"+
		"\u0402\u0404\7\23\2\2\u0403\u0405\7\u0150\2\2\u0404\u0403\3\2\2\2\u0404"+
		"\u0405\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u041e\5\u0116\u008c\2\u0407\u0409"+
		"\7\60\2\2\u0408\u040a\7\u0150\2\2\u0409\u0408\3\2\2\2\u0409\u040a\3\2"+
		"\2\2\u040a\u040b\3\2\2\2\u040b\u041e\5\u0116\u008c\2\u040c\u040e\7J\2"+
		"\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0412\3\2\2\2\u040f\u0410"+
		"\7\'\2\2\u0410\u0413\7\u00f3\2\2\u0411\u0413\7(\2\2\u0412\u040f\3\2\2"+
		"\2\u0412\u0411\3\2\2\2\u0413\u0415\3\2\2\2\u0414\u0416\7\u0150\2\2\u0415"+
		"\u0414\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u041e\5\u0116"+
		"\u008c\2\u0418\u041a\7`\2\2\u0419\u041b\7\u0150\2\2\u041a\u0419\3\2\2"+
		"\2\u041a\u041b\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041e\5\u0116\u008c\2"+
		"\u041d\u0402\3\2\2\2\u041d\u0407\3\2\2\2\u041d\u040d\3\2\2\2\u041d\u0418"+
		"\3\2\2\2\u041em\3\2\2\2\u041f\u044d\7&\2\2\u0420\u044d\7\27\2\2\u0421"+
		"\u044d\7\30\2\2\u0422\u044d\7\31\2\2\u0423\u044d\7\32\2\2\u0424\u044d"+
		"\7\33\2\2\u0425\u044d\7C\2\2\u0426\u044d\7D\2\2\u0427\u044d\7G\2\2\u0428"+
		"\u044d\7H\2\2\u0429\u042b\7X\2\2\u042a\u042c\7\u00ce\2\2\u042b\u042a\3"+
		"\2\2\2\u042b\u042c\3\2\2\2\u042c\u044d\3\2\2\2\u042d\u044d\7n\2\2\u042e"+
		"\u044d\7\u0089\2\2\u042f\u044d\7\u008a\2\2\u0430\u044d\7\u008b\2\2\u0431"+
		"\u044d\7\u008c\2\2\u0432\u044d\7\u008d\2\2\u0433\u044d\7\u00b0\2\2\u0434"+
		"\u044d\7\u00b2\2\2\u0435\u044d\7\u00bc\2\2\u0436\u044d\7\u00bb\2\2\u0437"+
		"\u044d\7\u00cd\2\2\u0438\u044d\7\u00d8\2\2\u0439\u043a\7\u00df\2\2\u043a"+
		"\u044d\7\u0127\2\2\u043b\u044d\7\u00fa\2\2\u043c\u044d\7\u00f9\2\2\u043d"+
		"\u044d\7\u00fb\2\2\u043e\u044d\7\u00fd\2\2\u043f\u044d\7\u00fc\2\2\u0440"+
		"\u044d\7\u0108\2\2\u0441\u044d\7\u010d\2\2\u0442\u044d\7\u0114\2\2\u0443"+
		"\u044d\7\u0115\2\2\u0444\u044d\7\u0125\2\2\u0445\u044d\7\u0126\2\2\u0446"+
		"\u044d\7\u0130\2\2\u0447\u044a\5\u013e\u00a0\2\u0448\u0449\7\5\2\2\u0449"+
		"\u044b\7\u011b\2\2\u044a\u0448\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044d"+
		"\3\2\2\2\u044c\u041f\3\2\2\2\u044c\u0420\3\2\2\2\u044c\u0421\3\2\2\2\u044c"+
		"\u0422\3\2\2\2\u044c\u0423\3\2\2\2\u044c\u0424\3\2\2\2\u044c\u0425\3\2"+
		"\2\2\u044c\u0426\3\2\2\2\u044c\u0427\3\2\2\2\u044c\u0428\3\2\2\2\u044c"+
		"\u0429\3\2\2\2\u044c\u042d\3\2\2\2\u044c\u042e\3\2\2\2\u044c\u042f\3\2"+
		"\2\2\u044c\u0430\3\2\2\2\u044c\u0431\3\2\2\2\u044c\u0432\3\2\2\2\u044c"+
		"\u0433\3\2\2\2\u044c\u0434\3\2\2\2\u044c\u0435\3\2\2\2\u044c\u0436\3\2"+
		"\2\2\u044c\u0437\3\2\2\2\u044c\u0438\3\2\2\2\u044c\u0439\3\2\2\2\u044c"+
		"\u043b\3\2\2\2\u044c\u043c\3\2\2\2\u044c\u043d\3\2\2\2\u044c\u043e\3\2"+
		"\2\2\u044c\u043f\3\2\2\2\u044c\u0440\3\2\2\2\u044c\u0441\3\2\2\2\u044c"+
		"\u0442\3\2\2\2\u044c\u0443\3\2\2\2\u044c\u0444\3\2\2\2\u044c\u0445\3\2"+
		"\2\2\u044c\u0446\3\2\2\2\u044c\u0447\3\2\2\2\u044do\3\2\2\2\u044e\u044f"+
		"\7\u015a\2\2\u044f\u0451\t\21\2\2\u0450\u0452\t\22\2\2\u0451\u0450\3\2"+
		"\2\2\u0451\u0452\3\2\2\2\u0452\u0455\3\2\2\2\u0453\u0454\7\u014c\2\2\u0454"+
		"\u0456\7\u0164\2\2\u0455\u0453\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0457"+
		"\3\2\2\2\u0457\u0458\7\u015d\2\2\u0458q\3\2\2\2\u0459\u045b\7\u00b8\2"+
		"\2\u045a\u0459\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u0465"+
		"\7\u00ba\2\2\u045d\u045e\7\'\2\2\u045e\u045f\7\u00f3\2\2\u045f\u0465\5"+
		"\u013e\u00a0\2\u0460\u0462\7\u00b8\2\2\u0461\u0460\3\2\2\2\u0461\u0462"+
		"\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0465\t\23\2\2\u0464\u045a\3\2\2\2"+
		"\u0464\u045d\3\2\2\2\u0464\u0461\3\2\2\2\u0465s\3\2\2\2\u0466\u0468\7"+
		"\u014b\2\2\u0467\u0466\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\3\2\2\2"+
		"\u0469\u046a\7\u0150\2\2\u046a\u0473\5\u0116\u008c\2\u046b\u046d\7\u012c"+
		"\2\2\u046c\u046b\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046e\3\2\2\2\u046e"+
		"\u0470\7J\2\2\u046f\u0471\5\u0116\u008c\2\u0470\u046f\3\2\2\2\u0470\u0471"+
		"\3\2\2\2\u0471\u0473\3\2\2\2\u0472\u0467\3\2\2\2\u0472\u046c\3\2\2\2\u0473"+
		"u\3\2\2\2\u0474\u0475\7;\2\2\u0475\u0479\t\24\2\2\u0476\u0477\7\177\2"+
		"\2\u0477\u0478\7\u00b8\2\2\u0478\u047a\7g\2\2\u0479\u0476\3\2\2\2\u0479"+
		"\u047a\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047f\5\u0116\u008c\2\u047c\u047e"+
		"\5x=\2\u047d\u047c\3\2\2\2\u047e\u0481\3\2\2\2\u047f\u047d\3\2\2\2\u047f"+
		"\u0480\3\2\2\2\u0480w\3\2\2\2\u0481\u047f\3\2\2\2\u0482\u0483\7\60\2\2"+
		"\u0483\u0487\5\u0116\u008c\2\u0484\u0485\7\u00a0\2\2\u0485\u0487\5\u0116"+
		"\u008c\2\u0486\u0482\3\2\2\2\u0486\u0484\3\2\2\2\u0487y\3\2\2\2\u0488"+
		"\u0490\7\13\2\2\u0489\u048c\7;\2\2\u048a\u048b\7\u00c2\2\2\u048b\u048d"+
		"\7\u00db\2\2\u048c\u048a\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u0490\3\2\2"+
		"\2\u048e\u0490\7\u00db\2\2\u048f\u0488\3\2\2\2\u048f\u0489\3\2\2\2\u048f"+
		"\u048e\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\7u"+
		"\2\2\u0492\u0494\5\u013e\u00a0\2\u0493\u0495\5\u008cG\2\u0494\u0493\3"+
		"\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0498\5|?\2\u0497"+
		"\u0499\t\25\2\2\u0498\u0497\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049b\3"+
		"\2\2\2\u049a\u049c\5\60\31\2\u049b\u049a\3\2\2\2\u049b\u049c\3\2\2\2\u049c"+
		"\u049d\3\2\2\2\u049d\u049e\5\b\5\2\u049e{\3\2\2\2\u049f\u04a0\t\26\2\2"+
		"\u04a0\u04a2\5n8\2\u04a1\u04a3\5p9\2\u04a2\u04a1\3\2\2\2\u04a2\u04a3\3"+
		"\2\2\2\u04a3}\3\2\2\2\u04a4\u04ac\7\13\2\2\u04a5\u04a8\7;\2\2\u04a6\u04a7"+
		"\7\u00c2\2\2\u04a7\u04a9\7\u00db\2\2\u04a8\u04a6\3\2\2\2\u04a8\u04a9\3"+
		"\2\2\2\u04a9\u04ac\3\2\2\2\u04aa\u04ac\7\u00db\2\2\u04ab\u04a4\3\2\2\2"+
		"\u04ab\u04a5\3\2\2\2\u04ab\u04aa\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ad"+
		"\3\2\2\2\u04ad\u04ae\7\u00c9\2\2\u04ae\u04af\5\u013e\u00a0\2\u04af\u04b0"+
		"\t\25\2\2\u04b0\u04b1\5\u0080A\2\u04b1\u04b5\7_\2\2\u04b2\u04b3\5\u013e"+
		"\u00a0\2\u04b3\u04b4\7\u015f\2\2\u04b4\u04b6\3\2\2\2\u04b5\u04b2\3\2\2"+
		"\2\u04b5\u04b6\3\2\2\2\u04b6\177\3\2\2\2\u04b7\u04b8\5\u0082B\2\u04b8"+
		"\u04be\7\u015f\2\2\u04b9\u04ba\5\u0082B\2\u04ba\u04bb\7\u015f\2\2\u04bb"+
		"\u04bd\3\2\2\2\u04bc\u04b9\3\2\2\2\u04bd\u04c0\3\2\2\2\u04be\u04bc\3\2"+
		"\2\2\u04be\u04bf\3\2\2\2\u04bf\u0081\3\2\2\2\u04c0\u04be\3\2\2\2\u04c1"+
		"\u04cf\5\62\32\2\u04c2\u04c3\7u\2\2\u04c3\u04c5\5\u013e\u00a0\2\u04c4"+
		"\u04c6\5\u008cG\2\u04c5\u04c4\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c7"+
		"\3\2\2\2\u04c7\u04c8\5|?\2\u04c8\u04cf\3\2\2\2\u04c9\u04ca\t\27\2\2\u04ca"+
		"\u04cc\5\u013e\u00a0\2\u04cb\u04cd\5\u008cG\2\u04cc\u04cb\3\2\2\2\u04cc"+
		"\u04cd\3\2\2\2\u04cd\u04cf\3\2\2\2\u04ce\u04c1\3\2\2\2\u04ce\u04c2\3\2"+
		"\2\2\u04ce\u04c9\3\2\2\2\u04cf\u0083\3\2\2\2\u04d0\u04d8\7\13\2\2\u04d1"+
		"\u04d4\7;\2\2\u04d2\u04d3\7\u00c2\2\2\u04d3\u04d5\7\u00db\2\2\u04d4\u04d2"+
		"\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d8\3\2\2\2\u04d6\u04d8\7\u00db\2"+
		"\2\u04d7\u04d0\3\2\2\2\u04d7\u04d1\3\2\2\2\u04d7\u04d6\3\2\2\2\u04d7\u04d8"+
		"\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04da\7\u00c9\2\2\u04da\u04db\7\34"+
		"\2\2\u04db\u04dc\5\u013e\u00a0\2\u04dc\u04dd\t\25\2\2\u04dd\u04de\5\u0086"+
		"D\2\u04de\u04e2\7_\2\2\u04df\u04e0\5\u013e\u00a0\2\u04e0\u04e1\7\u015f"+
		"\2\2\u04e1\u04e3\3\2\2\2\u04e2\u04df\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3"+
		"\u0085\3\2\2\2\u04e4\u04e5\5\u0088E\2\u04e5\u04eb\7\u015f\2\2\u04e6\u04e7"+
		"\5\u0088E\2\u04e7\u04e8\7\u015f\2\2\u04e8\u04ea\3\2\2\2\u04e9\u04e6\3"+
		"\2\2\2\u04ea\u04ed\3\2\2\2\u04eb\u04e9\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec"+
		"\u0087\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ee\u04f2\5\62\32\2\u04ef\u04f2\5"+
		"z>\2\u04f0\u04f2\5\u008aF\2\u04f1\u04ee\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f1"+
		"\u04f0\3\2\2\2\u04f2\u0089\3\2\2\2\u04f3\u04fb\7\13\2\2\u04f4\u04f7\7"+
		";\2\2\u04f5\u04f6\7\u00c2\2\2\u04f6\u04f8\7\u00db\2\2\u04f7\u04f5\3\2"+
		"\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fb\3\2\2\2\u04f9\u04fb\7\u00db\2\2\u04fa"+
		"\u04f3\3\2\2\2\u04fa\u04f4\3\2\2\2\u04fa\u04f9\3\2\2\2\u04fa\u04fb\3\2"+
		"\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fd\t\27\2\2\u04fd\u04ff\5\u013e\u00a0"+
		"\2\u04fe\u0500\5\u008cG\2\u04ff\u04fe\3\2\2\2\u04ff\u0500\3\2\2\2\u0500"+
		"\u0502\3\2\2\2\u0501\u0503\5\u0090I\2\u0502\u0501\3\2\2\2\u0502\u0503"+
		"\3\2\2\2\u0503\u0505\3\2\2\2\u0504\u0506\t\25\2\2\u0505\u0504\3\2\2\2"+
		"\u0505\u0506\3\2\2\2\u0506\u0508\3\2\2\2\u0507\u0509\5\60\31\2\u0508\u0507"+
		"\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050b\3\2\2\2\u050a\u050c\5\u00c0a"+
		"\2\u050b\u050a\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u0511"+
		"\5\f\7\2\u050e\u050f\5\u013e\u00a0\2\u050f\u0510\7\u015f\2\2\u0510\u0512"+
		"\3\2\2\2\u0511\u050e\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u008b\3\2\2\2\u0513"+
		"\u0514\7\u015a\2\2\u0514\u052a\7\u015d\2\2\u0515\u0516\7\u015a\2\2\u0516"+
		"\u051b\5\u008eH\2\u0517\u0518\7\u014c\2\2\u0518\u051a\5\u008eH\2\u0519"+
		"\u0517\3\2\2\2\u051a\u051d\3\2\2\2\u051b\u0519\3\2\2\2\u051b\u051c\3\2"+
		"\2\2\u051c\u051e\3\2\2\2\u051d\u051b\3\2\2\2\u051e\u051f\7\u015d\2\2\u051f"+
		"\u052a\3\2\2\2\u0520\u0521\6G\4\2\u0521\u0526\5\u008eH\2\u0522\u0523\7"+
		"\u014c\2\2\u0523\u0525\5\u008eH\2\u0524\u0522\3\2\2\2\u0525\u0528\3\2"+
		"\2\2\u0526\u0524\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u052a\3\2\2\2\u0528"+
		"\u0526\3\2\2\2\u0529\u0513\3\2\2\2\u0529\u0515\3\2\2\2\u0529\u0520\3\2"+
		"\2\2\u052a\u008d\3\2\2\2\u052b\u0531\7\u0082\2\2\u052c\u0531\7\u00c4\2"+
		"\2\u052d\u0531\7\u0087\2\2\u052e\u052f\7\u0082\2\2\u052f\u0531\7\u00c4"+
		"\2\2\u0530\u052b\3\2\2\2\u0530\u052c\3\2\2\2\u0530\u052d\3\2\2\2\u0530"+
		"\u052e\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533\5\u013e"+
		"\u00a0\2\u0533\u0535\5n8\2\u0534\u0536\5p9\2\u0535\u0534\3\2\2\2\u0535"+
		"\u0536\3\2\2\2\u0536\u053a\3\2\2\2\u0537\u0539\5r:\2\u0538\u0537\3\2\2"+
		"\2\u0539\u053c\3\2\2\2\u053a\u0538\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053e"+
		"\3\2\2\2\u053c\u053a\3\2\2\2\u053d\u053f\5t;\2\u053e\u053d\3\2\2\2\u053e"+
		"\u053f\3\2\2\2\u053f\u0556\3\2\2\2\u0540\u0546\5\u013e\u00a0\2\u0541\u0547"+
		"\7\u0082\2\2\u0542\u0547\7\u00c4\2\2\u0543\u0547\7\u0087\2\2\u0544\u0545"+
		"\7\u0082\2\2\u0545\u0547\7\u00c4\2\2\u0546\u0541\3\2\2\2\u0546\u0542\3"+
		"\2\2\2\u0546\u0543\3\2\2\2\u0546\u0544\3\2\2\2\u0546\u0547\3\2\2\2\u0547"+
		"\u0548\3\2\2\2\u0548\u054a\5n8\2\u0549\u054b\5p9\2\u054a\u0549\3\2\2\2"+
		"\u054a\u054b\3\2\2\2\u054b\u054f\3\2\2\2\u054c\u054e\5r:\2\u054d\u054c"+
		"\3\2\2\2\u054e\u0551\3\2\2\2\u054f\u054d\3\2\2\2\u054f\u0550\3\2\2\2\u0550"+
		"\u0553\3\2\2\2\u0551\u054f\3\2\2\2\u0552\u0554\5t;\2\u0553\u0552\3\2\2"+
		"\2\u0553\u0554\3\2\2\2\u0554\u0556\3\2\2\2\u0555\u0530\3\2\2\2\u0555\u0540"+
		"\3\2\2\2\u0556\u008f\3\2\2\2\u0557\u0559\5\u0092J\2\u0558\u0557\3\2\2"+
		"\2\u0559\u055a\3\2\2\2\u055a\u0558\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u0091"+
		"\3\2\2\2\u055c\u055d\7\u0099\2\2\u055d\u0568\7\u00fe\2\2\u055e\u055f\7"+
		"\u00fe\2\2\u055f\u0560\7\u00ef\2\2\u0560\u0568\t\30\2\2\u0561\u0563\7"+
		"Z\2\2\u0562\u0561\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0564\3\2\2\2\u0564"+
		"\u0565\7\u00de\2\2\u0565\u0566\7\u00f6\2\2\u0566\u0568\7\u0164\2\2\u0567"+
		"\u055c\3\2\2\2\u0567\u055e\3\2\2\2\u0567\u0562\3\2\2\2\u0568\u0093\3\2"+
		"\2\2\u0569\u056b\t\31\2\2\u056a\u056c\7\u0081\2\2\u056b\u056a\3\2\2\2"+
		"\u056b\u056c\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u0573\5\u0116\u008c\2\u056e"+
		"\u056f\7\u015a\2\2\u056f\u0570\5\u0136\u009c\2\u0570\u0571\7\u015d\2\2"+
		"\u0571\u0574\3\2\2\2\u0572\u0574\5\u0136\u009c\2\u0573\u056e\3\2\2\2\u0573"+
		"\u0572\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u057e\3\2\2\2\u0575\u0576\7\u0090"+
		"\2\2\u0576\u057b\7\u0161\2\2\u0577\u0578\7\u014c\2\2\u0578\u057a\7\u0161"+
		"\2\2\u0579\u0577\3\2\2\2\u057a\u057d\3\2\2\2\u057b\u0579\3\2\2\2\u057b"+
		"\u057c\3\2\2\2\u057c\u057f\3\2\2\2\u057d\u057b\3\2\2\2\u057e\u0575\3\2"+
		"\2\2\u057e\u057f\3\2\2\2\u057f\u0581\3\2\2\2\u0580\u0582\5\u00c2b\2\u0581"+
		"\u0580\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0095\3\2\2\2\u0583\u0587\5\u0098"+
		"M\2\u0584\u0587\5\u009aN\2\u0585\u0587\5\u009cO\2\u0586\u0583\3\2\2\2"+
		"\u0586\u0584\3\2\2\2\u0586\u0585\3\2\2\2\u0587\u0097\3\2\2\2\u0588\u0589"+
		"\7\177\2\2\u0589\u058a\5\u0106\u0084\2\u058a\u058b\7\u0113\2\2\u058b\u058f"+
		"\5\4\3\2\u058c\u058e\5\u009eP\2\u058d\u058c\3\2\2\2\u058e\u0591\3\2\2"+
		"\2\u058f\u058d\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0593\3\2\2\2\u0591\u058f"+
		"\3\2\2\2\u0592\u0594\5\u00a0Q\2\u0593\u0592\3\2\2\2\u0593\u0594\3\2\2"+
		"\2\u0594\u0595\3\2\2\2\u0595\u0596\7_\2\2\u0596\u0597\7\177\2\2\u0597"+
		"\u0099\3\2\2\2\u0598\u0599\7\177\2\2\u0599\u059a\5\u0106\u0084\2\u059a"+
		"\u059d\5\b\5\2\u059b\u059c\7[\2\2\u059c\u059e\5\b\5\2\u059d\u059b\3\2"+
		"\2\2\u059d\u059e\3\2\2\2\u059e\u009b\3\2\2\2\u059f\u05a0\7\6\2\2\u05a0"+
		"\u05a1\7\177\2\2\u05a1\u05a2\5\u0106\u0084\2\u05a2\u05a3\7\u0113\2\2\u05a3"+
		"\u05a4\5\b\5\2\u05a4\u009d\3\2\2\2\u05a5\u05a6\t\32\2\2\u05a6\u05a7\5"+
		"\u0106\u0084\2\u05a7\u05a8\7\u0113\2\2\u05a8\u05a9\5\4\3\2\u05a9\u009f"+
		"\3\2\2\2\u05aa\u05ab\7[\2\2\u05ab\u05ac\5\4\3\2\u05ac\u00a1\3\2\2\2\u05ad"+
		"\u05af\7h\2\2\u05ae\u05b0\7\u0161\2\2\u05af\u05ae\3\2\2\2\u05af\u05b0"+
		"\3\2\2\2\u05b0\u05b3\3\2\2\2\u05b1\u05b2\7\u0129\2\2\u05b2\u05b4\5\u0106"+
		"\u0084\2\u05b3\u05b1\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u00a3\3\2\2\2\u05b5"+
		"\u05b7\7\u009a\2\2\u05b6\u05b8\7\u0161\2\2\u05b7\u05b6\3\2\2\2\u05b7\u05b8"+
		"\3\2\2\2\u05b8\u00a5\3\2\2\2\u05b9\u05ba\7,\2\2\u05ba\u05bb\t\33\2\2\u05bb"+
		"\u05bc\5\u00a8U\2\u05bc\u05bd\7\u014c\2\2\u05bd\u05be\5\u00a8U\2\u05be"+
		"\u00a7\3\2\2\2\u05bf\u05c1\5\u00f4{\2\u05c0\u05c2\5\u00f6|\2\u05c1\u05c0"+
		"\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c8\3\2\2\2\u05c3\u05c4\7\u015a\2"+
		"\2\u05c4\u05c5\5\u00c4c\2\u05c5\u05c6\7\u015d\2\2\u05c6\u05c8\3\2\2\2"+
		"\u05c7\u05bf\3\2\2\2\u05c7\u05c3\3\2\2\2\u05c8\u05cb\3\2\2\2\u05c9\u05ca"+
		"\7\22\2\2\u05ca\u05cc\5\u013e\u00a0\2\u05cb\u05c9\3\2\2\2\u05cb\u05cc"+
		"\3\2\2\2\u05cc\u00a9\3\2\2\2\u05cd\u05cf\7;\2\2\u05ce\u05d0\7\u011d\2"+
		"\2\u05cf\u05ce\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d2"+
		"\7\u0084\2\2\u05d2\u05d3\5\u013e\u00a0\2\u05d3\u05d4\7\u00bf\2\2\u05d4"+
		"\u05d5\5\u00f4{\2\u05d5\u05d6\7\u015a\2\2\u05d6\u05db\5\u00acW\2\u05d7"+
		"\u05d8\7\u014c\2\2\u05d8\u05da\5\u00acW\2\u05d9\u05d7\3\2\2\2\u05da\u05dd"+
		"\3\2\2\2\u05db\u05d9\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc\u05de\3\2\2\2\u05dd"+
		"\u05db\3\2\2\2\u05de\u05df\7\u015d\2\2\u05df\u00ab\3\2\2\2\u05e0\u05e2"+
		"\5\u013e\u00a0\2\u05e1\u05e3\t\t\2\2\u05e2\u05e1\3\2\2\2\u05e2\u05e3\3"+
		"\2\2\2\u05e3\u00ad\3\2\2\2\u05e4\u05e5\5\u00b0Y\2\u05e5\u00af\3\2\2\2"+
		"\u05e6\u05e7\7\u012c\2\2\u05e7\u05e8\7\u015a\2\2\u05e8\u05e9\5\u013e\u00a0"+
		"\2\u05e9\u05ea\7\u0150\2\2\u05ea\u05f2\5\u013e\u00a0\2\u05eb\u05ec\7\u014c"+
		"\2\2\u05ec\u05ed\5\u013e\u00a0\2\u05ed\u05ee\7\u0150\2\2\u05ee\u05ef\5"+
		"\u013e\u00a0\2\u05ef\u05f1\3\2\2\2\u05f0\u05eb\3\2\2\2\u05f1\u05f4\3\2"+
		"\2\2\u05f2\u05f0\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f5\3\2\2\2\u05f4"+
		"\u05f2\3\2\2\2\u05f5\u05f9\7\u015d\2\2\u05f6\u05f8\5j\66\2\u05f7\u05f6"+
		"\3\2\2\2\u05f8\u05fb\3\2\2\2\u05f9\u05f7\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa"+
		"\u00b1\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fc\u05fe\7\6\2\2\u05fd\u05fc\3\2"+
		"\2\2\u05fd\u05fe\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0601\7\u00d5\2\2\u0600"+
		"\u0602\5\u0116\u008c\2\u0601\u0600\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u00b3"+
		"\3\2\2\2\u0603\u0605\7\u00e0\2\2\u0604\u0606\5\u0116\u008c\2\u0605\u0604"+
		"\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u00b5\3\2\2\2\u0607\u060b\5\u00b8]"+
		"\2\u0608\u060b\5\u00ba^\2\u0609\u060b\5\u00bc_\2\u060a\u0607\3\2\2\2\u060a"+
		"\u0608\3\2\2\2\u060a\u0609\3\2\2\2\u060b\u00b7\3\2\2\2\u060c\u060e\7?"+
		"\2\2\u060d\u060c\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u060f\3\2\2\2\u060f"+
		"\u0612\7\u00ec\2\2\u0610\u0612\7@\2\2\u0611\u060d\3\2\2\2\u0611\u0610"+
		"\3\2\2\2\u0612\u0614\3\2\2\2\u0613\u0615\7\u0150\2\2\u0614\u0613\3\2\2"+
		"\2\u0614\u0615\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0617\5\u0116\u008c\2"+
		"\u0617\u00b9\3\2\2\2\u0618\u0619\t\34\2\2\u0619\u061a\t\35\2\2\u061a\u00bb"+
		"\3\2\2\2\u061b\u061c\7\u00d4\2\2\u061c\u061f\7\u0150\2\2\u061d\u0620\5"+
		"\u0116\u008c\2\u061e\u0620\7\u00b7\2\2\u061f\u061d\3\2\2\2\u061f\u061e"+
		"\3\2\2\2\u0620\u0622\3\2\2\2\u0621\u0623\7\u011e\2\2\u0622\u0621\3\2\2"+
		"\2\u0622\u0623\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0625\7o\2\2\u0625\u0626"+
		"\t\36\2\2\u0626\u00bd\3\2\2\2\u0627\u0628\7o\2\2\u0628\u0629\7\u0161\2"+
		"\2\u0629\u062b\7\u0082\2\2\u062a\u062c\7\u00e2\2\2\u062b\u062a\3\2\2\2"+
		"\u062b\u062c\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u062e\5\u0116\u008c\2\u062e"+
		"\u062f\7\u014f\2\2\u062f\u0632\5\u0116\u008c\2\u0630\u0631\t\37\2\2\u0631"+
		"\u0633\5\u0116\u008c\2\u0632\u0630\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u0634"+
		"\3\2\2\2\u0634\u0635\7\u00a7\2\2\u0635\u0636\5\4\3\2\u0636\u0637\7_\2"+
		"\2\u0637\u0638\7\u00a7\2\2\u0638\u00bf\3\2\2\2\u0639\u0640\7\u016a\2\2"+
		"\u063a\u063b\7\u0156\2\2\u063b\u063c\7\u0156\2\2\u063c\u063d\7\u0161\2"+
		"\2\u063d\u063e\7\u0154\2\2\u063e\u0640\7\u0154\2\2\u063f\u0639\3\2\2\2"+
		"\u063f\u063a\3\2\2\2\u0640\u00c1\3\2\2\2\u0641\u0642\7\u0121\2\2\u0642"+
		"\u0647\5\u0116\u008c\2\u0643\u0644\7\u014c\2\2\u0644\u0646\5\u0116\u008c"+
		"\2\u0645\u0643\3\2\2\2\u0646\u0649\3\2\2\2\u0647\u0645\3\2\2\2\u0647\u0648"+
		"\3\2\2\2\u0648\u00c3\3\2\2\2\u0649\u0647\3\2\2\2\u064a\u064c\5\u00c6d"+
		"\2\u064b\u064a\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064e"+
		"\5\u00ccg\2\u064e\u00c5\3\2\2\2\u064f\u0650\7\u012c\2\2\u0650\u0655\5"+
		"\u00c8e\2\u0651\u0652\7\u014c\2\2\u0652\u0654\5\u00c8e\2\u0653\u0651\3"+
		"\2\2\2\u0654\u0657\3\2\2\2\u0655\u0653\3\2\2\2\u0655\u0656\3\2\2\2\u0656"+
		"\u00c7\3\2\2\2\u0657\u0655\3\2\2\2\u0658\u065a\5\u013e\u00a0\2\u0659\u065b"+
		"\5\u00caf\2\u065a\u0659\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065c\3\2\2"+
		"\2\u065c\u065d\7\17\2\2\u065d\u065e\7\u015a\2\2\u065e\u065f\5\u00ccg\2"+
		"\u065f\u0660\7\u015d\2\2\u0660\u00c9\3\2\2\2\u0661\u0662\7\u015a\2\2\u0662"+
		"\u0667\5\u013e\u00a0\2\u0663\u0664\7\u014c\2\2\u0664\u0666\5\u013e\u00a0"+
		"\2\u0665\u0663\3\2\2\2\u0666\u0669\3\2\2\2\u0667\u0665\3\2\2\2\u0667\u0668"+
		"\3\2\2\2\u0668\u066a\3\2\2\2\u0669\u0667\3\2\2\2\u066a\u066b\7\u015d\2"+
		"\2\u066b\u00cb\3\2\2\2\u066c\u0672\5\u00ceh\2\u066d\u066e\5\u00d0i\2\u066e"+
		"\u066f\5\u00ceh\2\u066f\u0671\3\2\2\2\u0670\u066d\3\2\2\2\u0671\u0674"+
		"\3\2\2\2\u0672\u0670\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u00cd\3\2\2\2\u0674"+
		"\u0672\3\2\2\2\u0675\u067b\5\u00d2j\2\u0676\u0677\7\u015a\2\2\u0677\u0678"+
		"\5\u00ccg\2\u0678\u0679\7\u015d\2\2\u0679\u067b\3\2\2\2\u067a\u0675\3"+
		"\2\2\2\u067a\u0676\3\2\2\2\u067b\u00cf\3\2\2\2\u067c\u067e\7\u011c\2\2"+
		"\u067d\u067f\7\n\2\2\u067e\u067d\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0689"+
		"\3\2\2\2\u0680\u0682\7b\2\2\u0681\u0683\7\n\2\2\u0682\u0681\3\2\2\2\u0682"+
		"\u0683\3\2\2\2\u0683\u0689\3\2\2\2\u0684\u0686\7\u008e\2\2\u0685\u0687"+
		"\7\n\2\2\u0686\u0685\3\2\2\2\u0686\u0687\3\2\2\2\u0687\u0689\3\2\2\2\u0688"+
		"\u067c\3\2\2\2\u0688\u0680\3\2\2\2\u0688\u0684\3\2\2\2\u0689\u00d1\3\2"+
		"\2\2\u068a\u068b\t \2\2\u068b\u068d\5\u00d4k\2\u068c\u068e\5\u00e0q\2"+
		"\u068d\u068c\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u0690\3\2\2\2\u068f\u0691"+
		"\5\u00e2r\2\u0690\u068f\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u0693\3\2\2"+
		"\2\u0692\u0694\5\u00f6|\2\u0693\u0692\3\2\2\2\u0693\u0694\3\2\2\2\u0694"+
		"\u0696\3\2\2\2\u0695\u0697\5\u00f8}\2\u0696\u0695\3\2\2\2\u0696\u0697"+
		"\3\2\2\2\u0697\u069a\3\2\2\2\u0698\u069b\5\u00fa~\2\u0699\u069b\5\u00fc"+
		"\177\2\u069a\u0698\3\2\2\2\u069a\u0699\3\2\2\2\u069a\u069b\3\2\2\2\u069b"+
		"\u069d\3\2\2\2\u069c\u069e\5\u00fe\u0080\2\u069d\u069c\3\2\2\2\u069d\u069e"+
		"\3\2\2\2\u069e\u06a0\3\2\2\2\u069f\u06a1\5\u0100\u0081\2\u06a0\u069f\3"+
		"\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u00d3\3\2\2\2\u06a2\u06a4\5\u00d6l\2"+
		"\u06a3\u06a2\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a6\3\2\2\2\u06a5\u06a7"+
		"\5\u00d8m\2\u06a6\u06a5\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06a8\3\2\2"+
		"\2\u06a8\u06ad\5\u00dan\2\u06a9\u06aa\7\u014c\2\2\u06aa\u06ac\5\u00da"+
		"n\2\u06ab\u06a9\3\2\2\2\u06ac\u06af\3\2\2\2\u06ad\u06ab\3\2\2\2\u06ad"+
		"\u06ae\3\2\2\2\u06ae\u00d5\3\2\2\2\u06af\u06ad\3\2\2\2\u06b0\u06b1\t!"+
		"\2\2\u06b1\u00d7\3\2\2\2\u06b2\u06b3\7\u0118\2\2\u06b3\u06b4\5\u0116\u008c"+
		"\2\u06b4\u00d9\3\2\2\2\u06b5\u06b6\5\u013e\u00a0\2\u06b6\u06b7\7\u0150"+
		"\2\2\u06b7\u06b9\3\2\2\2\u06b8\u06b5\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9"+
		"\u06ba\3\2\2\2\u06ba\u06bc\5\u0116\u008c\2\u06bb\u06bd\5\u00dco\2\u06bc"+
		"\u06bb\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\u06c0\3\2\2\2\u06be\u06c0\5\u00de"+
		"p\2\u06bf\u06b8\3\2\2\2\u06bf\u06be\3\2\2\2\u06c0\u00db\3\2\2\2\u06c1"+
		"\u06c3\6o\5\2\u06c2\u06c4\7\17\2\2\u06c3\u06c2\3\2\2\2\u06c3\u06c4\3\2"+
		"\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06cb\5\u013e\u00a0\2\u06c6\u06c7\7\u015a"+
		"\2\2\u06c7\u06c8\7\u0116\2\2\u06c8\u06c9\7\u0162\2\2\u06c9\u06cb\7\u015d"+
		"\2\2\u06ca\u06c1\3\2\2\2\u06ca\u06c6\3\2\2\2\u06cb\u00dd\3\2\2\2\u06cc"+
		"\u06cd\7\u0161\2\2\u06cd\u06cf\7\6\2\2\u06ce\u06cc\3\2\2\2\u06ce\u06cf"+
		"\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d1\7\u0158\2\2\u06d1\u00df\3\2\2"+
		"\2\u06d2\u06d3\7\u0090\2\2\u06d3\u06d8\5\u013e\u00a0\2\u06d4\u06d5\7\u014c"+
		"\2\2\u06d5\u06d7\5\u013e\u00a0\2\u06d6\u06d4\3\2\2\2\u06d7\u06da\3\2\2"+
		"\2\u06d8\u06d6\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u00e1\3\2\2\2\u06da\u06d8"+
		"\3\2\2\2\u06db\u06dc\7s\2\2\u06dc\u06e0\5\u00e4s\2\u06dd\u06df\5\u00ea"+
		"v\2\u06de\u06dd\3\2\2\2\u06df\u06e2\3\2\2\2\u06e0\u06de\3\2\2\2\u06e0"+
		"\u06e1\3\2\2\2\u06e1\u00e3\3\2\2\2\u06e2\u06e0\3\2\2\2\u06e3\u06e7\5\u00e6"+
		"t\2\u06e4\u06e7\5\u00e8u\2\u06e5\u06e7\5\u00eex\2\u06e6\u06e3\3\2\2\2"+
		"\u06e6\u06e4\3\2\2\2\u06e6\u06e5\3\2\2\2\u06e7\u00e5\3\2\2\2\u06e8\u06ea"+
		"\5\u00f4{\2\u06e9\u06eb\5\u00f2z\2\u06ea\u06e9\3\2\2\2\u06ea\u06eb\3\2"+
		"\2\2\u06eb\u00e7\3\2\2\2\u06ec\u06ed\7\u015a\2\2\u06ed\u06ee\5\u00c4c"+
		"\2\u06ee\u06f0\7\u015d\2\2\u06ef\u06f1\5\u00f2z\2\u06f0\u06ef\3\2\2\2"+
		"\u06f0\u06f1\3\2\2\2\u06f1\u00e9\3\2\2\2\u06f2\u06f3\7\u014c\2\2\u06f3"+
		"\u06fa\5\u00e4s\2\u06f4\u06f5\5\u00ecw\2\u06f5\u06f6\5\u00e4s\2\u06f6"+
		"\u06f7\7\u00bf\2\2\u06f7\u06f8\5\u0106\u0084\2\u06f8\u06fa\3\2\2\2\u06f9"+
		"\u06f2\3\2\2\2\u06f9\u06f4\3\2\2\2\u06fa\u00eb\3\2\2\2\u06fb\u06fd\7\u0086"+
		"\2\2\u06fc\u06fb\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe"+
		"\u0705\7\u0095\2\2\u06ff\u0701\t\"\2\2\u0700\u0702\7\u00c5\2\2\u0701\u0700"+
		"\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u0705\7\u0095\2"+
		"\2\u0704\u06fc\3\2\2\2\u0704\u06ff\3\2\2\2\u0705\u00ed\3\2\2\2\u0706\u0707"+
		"\7\u010e\2\2\u0707\u0708\7\u015a\2\2\u0708\u0709\7\u0123\2\2\u0709\u070e"+
		"\5\u00f0y\2\u070a\u070b\7\u014c\2\2\u070b\u070d\5\u00f0y\2\u070c\u070a"+
		"\3\2\2\2\u070d\u0710\3\2\2\2\u070e\u070c\3\2\2\2\u070e\u070f\3\2\2\2\u070f"+
		"\u0711\3\2\2\2\u0710\u070e\3\2\2\2\u0711\u0713\7\u015d\2\2\u0712\u0714"+
		"\5\u00f2z\2\u0713\u0712\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u00ef\3\2\2"+
		"\2\u0715\u0722\5\u0116\u008c\2\u0716\u0717\7\u015a\2\2\u0717\u071c\5\u0116"+
		"\u008c\2\u0718\u0719\7\u014c\2\2\u0719\u071b\5\u0116\u008c\2\u071a\u0718"+
		"\3\2\2\2\u071b\u071e\3\2\2\2\u071c\u071a\3\2\2\2\u071c\u071d\3\2\2\2\u071d"+
		"\u071f\3\2\2\2\u071e\u071c\3\2\2\2\u071f\u0720\7\u015d\2\2\u0720\u0722"+
		"\3\2\2\2\u0721\u0715\3\2\2\2\u0721\u0716\3\2\2\2\u0722\u00f1\3\2\2\2\u0723"+
		"\u0725\6z\6\2\u0724\u0726\7\17\2\2\u0725\u0724\3\2\2\2\u0725\u0726\3\2"+
		"\2\2\u0726\u0727\3\2\2\2\u0727\u0732\5\u013e\u00a0\2\u0728\u0729\7\u015a"+
		"\2\2\u0729\u072e\7\u0161\2\2\u072a\u072b\7\u014c\2\2\u072b\u072d\7\u0161"+
		"\2\2\u072c\u072a\3\2\2\2\u072d\u0730\3\2\2\2\u072e\u072c\3\2\2\2\u072e"+
		"\u072f\3\2\2\2\u072f\u0731\3\2\2\2\u0730\u072e\3\2\2\2\u0731\u0733\7\u015d"+
		"\2\2\u0732\u0728\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u00f3\3\2\2\2\u0734"+
		"\u0735\5\u013e\u00a0\2\u0735\u00f5\3\2\2\2\u0736\u0737\7\u012a\2\2\u0737"+
		"\u0738\5\u0106\u0084\2\u0738\u00f7\3\2\2\2\u0739\u073a\7y\2\2\u073a\u073b"+
		"\7\36\2\2\u073b\u0740\5\u0116\u008c\2\u073c\u073d\7\u014c\2\2\u073d\u073f"+
		"\5\u0116\u008c\2\u073e\u073c\3\2\2\2\u073f\u0742\3\2\2\2\u0740\u073e\3"+
		"\2\2\2\u0740\u0741\3\2\2\2\u0741\u00f9\3\2\2\2\u0742\u0740\3\2\2\2\u0743"+
		"\u0744\7|\2\2\u0744\u0745\5\u0106\u0084\2\u0745\u00fb\3\2\2\2\u0746\u0747"+
		"\7\u00d3\2\2\u0747\u0748\5\u0106\u0084\2\u0748\u00fd\3\2\2\2\u0749\u074a"+
		"\7\u00c3\2\2\u074a\u074b\7\36\2\2\u074b\u074d\5\u0116\u008c\2\u074c\u074e"+
		"\t\t\2\2\u074d\u074c\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u0756\3\2\2\2\u074f"+
		"\u0750\7\u014c\2\2\u0750\u0752\5\u0116\u008c\2\u0751\u0753\t\t\2\2\u0752"+
		"\u0751\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0755\3\2\2\2\u0754\u074f\3\2"+
		"\2\2\u0755\u0758\3\2\2\2\u0756\u0754\3\2\2\2\u0756\u0757\3\2\2\2\u0757"+
		"\u00ff\3\2\2\2\u0758\u0756\3\2\2\2\u0759\u075b\5\u0102\u0082\2\u075a\u0759"+
		"\3\2\2\2\u075b\u075c\3\2\2\2\u075c\u075a\3\2\2\2\u075c\u075d\3\2\2\2\u075d"+
		"\u0101\3\2\2\2\u075e\u075f\7\u009d\2\2\u075f\u076a\5\u0116\u008c\2\u0760"+
		"\u0761\7\u012c\2\2\u0761\u0767\t#\2\2\u0762\u0763\7\u0120\2\2\u0763\u0764"+
		"\7\f\2\2\u0764\u0765\7\u0096\2\2\u0765\u0766\t$\2\2\u0766\u0768\7\u00a3"+
		"\2\2\u0767\u0762\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u076a\3\2\2\2\u0769"+
		"\u075e\3\2\2\2\u0769\u0760\3\2\2\2\u076a\u0103\3\2\2\2\u076b\u076d\7\u00b8"+
		"\2\2\u076c\u076b\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u076e\3\2\2\2\u076e"+
		"\u076f\7\u015a\2\2\u076f\u0770\5\u0106\u0084\2\u0770\u0105\3\2\2\2\u0771"+
		"\u0772\b\u0084\1\2\u0772\u077c\5\u0104\u0083\2\u0773\u0775\7\u00b8\2\2"+
		"\u0774\u0773\3\2\2\2\u0774\u0775\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u0777"+
		"\7\u015a\2\2\u0777\u0778\5\u0106\u0084\2\u0778\u0779\7\u015d\2\2\u0779"+
		"\u077c\3\2\2\2\u077a\u077c\5\u0108\u0085\2\u077b\u0771\3\2\2\2\u077b\u0774"+
		"\3\2\2\2\u077b\u077a\3\2\2\2\u077c\u0783\3\2\2\2\u077d\u077e\f\4\2\2\u077e"+
		"\u077f\5\u0112\u008a\2\u077f\u0780\5\u0106\u0084\5\u0780\u0782\3\2\2\2"+
		"\u0781\u077d\3\2\2\2\u0782\u0785\3\2\2\2\u0783\u0781\3\2\2\2\u0783\u0784"+
		"\3\2\2\2\u0784\u0107\3\2\2\2\u0785\u0783\3\2\2\2\u0786\u078a\5\u010a\u0086"+
		"\2\u0787\u078a\5\u0110\u0089\2\u0788\u078a\5\u0116\u008c\2\u0789\u0786"+
		"\3\2\2\2\u0789\u0787\3\2\2\2\u0789\u0788\3\2\2\2\u078a\u0109\3\2\2\2\u078b"+
		"\u078c\5\u0116\u008c\2\u078c\u078e\7\u0092\2\2\u078d\u078f\7\u00b8\2\2"+
		"\u078e\u078d\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0791"+
		"\7\u00ba\2\2\u0791\u07a3\3\2\2\2\u0792\u0793\5\u0116\u008c\2\u0793\u0794"+
		"\7\26\2\2\u0794\u0795\5\u0116\u008c\2\u0795\u0796\7\f\2\2\u0796\u0797"+
		"\5\u0116\u008c\2\u0797\u07a3\3\2\2\2\u0798\u079a\7\u00b8\2\2\u0799\u0798"+
		"\3\2\2\2\u0799\u079a\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u079c\7g\2\2\u079c"+
		"\u079d\7\u015a\2\2\u079d\u079e\5\u00c4c\2\u079e\u079f\7\u015d\2\2\u079f"+
		"\u07a3\3\2\2\2\u07a0\u07a3\5\u010c\u0087\2\u07a1\u07a3\5\u010e\u0088\2"+
		"\u07a2\u078b\3\2\2\2\u07a2\u0792\3\2\2\2\u07a2\u0799\3\2\2\2\u07a2\u07a0"+
		"\3\2\2\2\u07a2\u07a1\3\2\2\2\u07a3\u010b\3\2\2\2\u07a4\u07a6\5\u0116\u008c"+
		"\2\u07a5\u07a7\7\u00b8\2\2\u07a6\u07a5\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7"+
		"\u07a8\3\2\2\2\u07a8\u07a9\7\u0082\2\2\u07a9\u07b3\7\u015a\2\2\u07aa\u07af"+
		"\5\u0116\u008c\2\u07ab\u07ac\7\u014c\2\2\u07ac\u07ae\5\u0116\u008c\2\u07ad"+
		"\u07ab\3\2\2\2\u07ae\u07b1\3\2\2\2\u07af\u07ad\3\2\2\2\u07af\u07b0\3\2"+
		"\2\2\u07b0\u07b4\3\2\2\2\u07b1\u07af\3\2\2\2\u07b2\u07b4\5\u00c4c\2\u07b3"+
		"\u07aa\3\2\2\2\u07b3\u07b2\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u07b6\7\u015d"+
		"\2\2\u07b6\u010d\3\2\2\2\u07b7\u07b8\7\u015a\2\2\u07b8\u07bd\5\u0116\u008c"+
		"\2\u07b9\u07ba\7\u014c\2\2\u07ba\u07bc\5\u0116\u008c\2\u07bb\u07b9\3\2"+
		"\2\2\u07bc\u07bf\3\2\2\2\u07bd\u07bb\3\2\2\2\u07bd\u07be\3\2\2\2\u07be"+
		"\u07c0\3\2\2\2\u07bf\u07bd\3\2\2\2\u07c0\u07c2\7\u015d\2\2\u07c1\u07c3"+
		"\7\u00b8\2\2\u07c2\u07c1\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c4\3\2\2"+
		"\2\u07c4\u07c5\7\u0082\2\2\u07c5\u07c6\7\u015a\2\2\u07c6\u07c7\5\u00c4"+
		"c\2\u07c7\u07c8\7\u015d\2\2\u07c8\u010f\3\2\2\2\u07c9\u07ca\5\u0116\u008c"+
		"\2\u07ca\u07cb\5\u0114\u008b\2\u07cb\u07cc\5\u0116\u008c\2\u07cc\u0111"+
		"\3\2\2\2\u07cd\u07ce\t%\2\2\u07ce\u0113\3\2\2\2\u07cf\u07dc\7\u0150\2"+
		"\2\u07d0\u07dc\7\u0151\2\2\u07d1\u07dc\7\u0152\2\2\u07d2\u07dc\7\u0153"+
		"\2\2\u07d3\u07dc\7\u0156\2\2\u07d4\u07dc\7\u0157\2\2\u07d5\u07dc\7\u0154"+
		"\2\2\u07d6\u07dc\7\u0155\2\2\u07d7\u07d9\7\u00b8\2\2\u07d8\u07d7\3\2\2"+
		"\2\u07d8\u07d9\3\2\2\2\u07d9\u07da\3\2\2\2\u07da\u07dc\t&\2\2\u07db\u07cf"+
		"\3\2\2\2\u07db\u07d0\3\2\2\2\u07db\u07d1\3\2\2\2\u07db\u07d2\3\2\2\2\u07db"+
		"\u07d3\3\2\2\2\u07db\u07d4\3\2\2\2\u07db\u07d5\3\2\2\2\u07db\u07d6\3\2"+
		"\2\2\u07db\u07d8\3\2\2\2\u07dc\u0115\3\2\2\2\u07dd\u07de\b\u008c\1\2\u07de"+
		"\u07df\7\u015a\2\2\u07df\u07e0\5\u00c4c\2\u07e0\u07e1\7\u015d\2\2\u07e1"+
		"\u07ef\3\2\2\2\u07e2\u07e3\7\u015a\2\2\u07e3\u07e4\5\u0116\u008c\2\u07e4"+
		"\u07e5\7\u015d\2\2\u07e5\u07ef\3\2\2\2\u07e6\u07ef\5\u011a\u008e\2\u07e7"+
		"\u07ef\5\u011e\u0090\2\u07e8\u07ef\5\u0122\u0092\2\u07e9\u07ef\5\u0128"+
		"\u0095\2\u07ea\u07ef\5\u012a\u0096\2\u07eb\u07ef\5\u0132\u009a\2\u07ec"+
		"\u07ef\5\u0134\u009b\2\u07ed\u07ef\5\u0118\u008d\2\u07ee\u07dd\3\2\2\2"+
		"\u07ee\u07e2\3\2\2\2\u07ee\u07e6\3\2\2\2\u07ee\u07e7\3\2\2\2\u07ee\u07e8"+
		"\3\2\2\2\u07ee\u07e9\3\2\2\2\u07ee\u07ea\3\2\2\2\u07ee\u07eb\3\2\2\2\u07ee"+
		"\u07ec\3\2\2\2\u07ee\u07ed\3\2\2\2\u07ef\u0800\3\2\2\2\u07f0\u07f1\f\20"+
		"\2\2\u07f1\u07f2\7\u0158\2\2\u07f2\u07ff\5\u0116\u008c\21\u07f3\u07f4"+
		"\f\17\2\2\u07f4\u07f5\7\u014e\2\2\u07f5\u07ff\5\u0116\u008c\20\u07f6\u07f7"+
		"\f\16\2\2\u07f7\u07f8\7\u014a\2\2\u07f8\u07ff\5\u0116\u008c\17\u07f9\u07fa"+
		"\f\r\2\2\u07fa\u07fb\7\u0160\2\2\u07fb\u07ff\5\u0116\u008c\16\u07fc\u07fd"+
		"\f\21\2\2\u07fd\u07ff\5\u011c\u008f\2\u07fe\u07f0\3\2\2\2\u07fe\u07f3"+
		"\3\2\2\2\u07fe\u07f6\3\2\2\2\u07fe\u07f9\3\2\2\2\u07fe\u07fc\3\2\2\2\u07ff"+
		"\u0802\3\2\2\2\u0800\u07fe\3\2\2\2\u0800\u0801\3\2\2\2\u0801\u0117\3\2"+
		"\2\2\u0802\u0800\3\2\2\2\u0803\u080c\5\u013a\u009e\2\u0804\u080c\5\u013c"+
		"\u009f\2\u0805\u080c\5\u0146\u00a4\2\u0806\u080c\5\u013e\u00a0\2\u0807"+
		"\u080c\5\u0140\u00a1\2\u0808\u080c\5\u0144\u00a3\2\u0809\u080c\5\u0142"+
		"\u00a2\2\u080a\u080c\5\u0148\u00a5\2\u080b\u0803\3\2\2\2\u080b\u0804\3"+
		"\2\2\2\u080b\u0805\3\2\2\2\u080b\u0806\3\2\2\2\u080b\u0807\3\2\2\2\u080b"+
		"\u0808\3\2\2\2\u080b\u0809\3\2\2\2\u080b\u080a\3\2\2\2\u080c\u0119\3\2"+
		"\2\2\u080d\u080e\7\u008f\2\2\u080e\u080f\5\u0116\u008c\2\u080f\u0810\5"+
		"\u011c\u008f\2\u0810\u011b\3\2\2\2\u0811\u0812\t\'\2\2\u0812\u011d\3\2"+
		"\2\2\u0813\u0814\5\u0120\u0091\2\u0814\u0815\t(\2\2\u0815\u081a\5\u0120"+
		"\u0091\2\u0816\u0817\t(\2\2\u0817\u0819\5\u0120\u0091\2\u0818\u0816\3"+
		"\2\2\2\u0819\u081c\3\2\2\2\u081a\u0818\3\2\2\2\u081a\u081b\3\2\2\2\u081b"+
		"\u011f\3\2\2\2\u081c\u081a\3\2\2\2\u081d\u081e\7\u015a\2\2\u081e\u081f"+
		"\5\u0116\u008c\2\u081f\u0820\7\u015d\2\2\u0820\u0827\3\2\2\2\u0821\u0827"+
		"\5\u0122\u0092\2\u0822\u0827\5\u012a\u0096\2\u0823\u0827\5\u0132\u009a"+
		"\2\u0824\u0827\5\u0134\u009b\2\u0825\u0827\5\u0118\u008d\2\u0826\u081d"+
		"\3\2\2\2\u0826\u0821\3\2\2\2\u0826\u0822\3\2\2\2\u0826\u0823\3\2\2\2\u0826"+
		"\u0824\3\2\2\2\u0826\u0825\3\2\2\2\u0827\u0121\3\2\2\2\u0828\u082b\5\u0124"+
		"\u0093\2\u0829\u082b\5\u0126\u0094\2\u082a\u0828\3\2\2\2\u082a\u0829\3"+
		"\2\2\2\u082b\u0123\3\2\2\2\u082c\u082d\7#\2\2\u082d\u0833\5\u0116\u008c"+
		"\2\u082e\u082f\7\u0129\2\2\u082f\u0830\5\u0116\u008c\2\u0830\u0831\7\u0113"+
		"\2\2\u0831\u0832\5\u0116\u008c\2\u0832\u0834\3\2\2\2\u0833\u082e\3\2\2"+
		"\2\u0834\u0835\3\2\2\2\u0835\u0833\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u0839"+
		"\3\2\2\2\u0837\u0838\7[\2\2\u0838\u083a\5\u0116\u008c\2\u0839\u0837\3"+
		"\2\2\2\u0839\u083a\3\2\2\2\u083a\u083b\3\2\2\2\u083b\u083c\7_\2\2\u083c"+
		"\u0125\3\2\2\2\u083d\u0843\7#\2\2\u083e\u083f\7\u0129\2\2\u083f\u0840"+
		"\5\u0106\u0084\2\u0840\u0841\7\u0113\2\2\u0841\u0842\5\u0116\u008c\2\u0842"+
		"\u0844\3\2\2\2\u0843\u083e\3\2\2\2\u0844\u0845\3\2\2\2\u0845\u0843\3\2"+
		"\2\2\u0845\u0846\3\2\2\2\u0846\u0849\3\2\2\2\u0847\u0848\7[\2\2\u0848"+
		"\u084a\5\u0116\u008c\2\u0849\u0847\3\2\2\2\u0849\u084a\3\2\2\2\u084a\u084b"+
		"\3\2\2\2\u084b\u084c\7_\2\2\u084c\u0127\3\2\2\2\u084d\u084e\5\u013e\u00a0"+
		"\2\u084e\u084f\7\5\2\2\u084f\u0850\t)\2\2\u0850\u0129\3\2\2\2\u0851\u0852"+
		"\7\24\2\2\u0852\u0854\7\u015a\2\2\u0853\u0855\5\u012c\u0097\2\u0854\u0853"+
		"\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0857\5\u0116\u008c"+
		"\2\u0857\u0859\7\u015d\2\2\u0858\u085a\5\u012e\u0098\2\u0859\u0858\3\2"+
		"\2\2\u0859\u085a\3\2\2\2\u085a\u08ea\3\2\2\2\u085b\u085c\79\2\2\u085c"+
		"\u0862\7\u015a\2\2\u085d\u085f\5\u012c\u0097\2\u085e\u085d\3\2\2\2\u085e"+
		"\u085f\3\2\2\2\u085f\u0860\3\2\2\2\u0860\u0863\5\u0116\u008c\2\u0861\u0863"+
		"\7\u0158\2\2\u0862\u085e\3\2\2\2\u0862\u0861\3\2\2\2\u0863\u0864\3\2\2"+
		"\2\u0864\u0866\7\u015d\2\2\u0865\u0867\5\u012e\u0098\2\u0866\u0865\3\2"+
		"\2\2\u0866\u0867\3\2\2\2\u0867\u08ea\3\2\2\2\u0868\u0869\7:\2\2\u0869"+
		"\u086f\7\u015a\2\2\u086a\u086c\5\u012c\u0097\2\u086b\u086a\3\2\2\2\u086b"+
		"\u086c\3\2\2\2\u086c\u086d\3\2\2\2\u086d\u0870\5\u0116\u008c\2\u086e\u0870"+
		"\7\u0158\2\2\u086f\u086b\3\2\2\2\u086f\u086e\3\2\2\2\u0870\u0871\3\2\2"+
		"\2\u0871\u0873\7\u015d\2\2\u0872\u0874\5\u012e\u0098\2\u0873\u0872\3\2"+
		"\2\2\u0873\u0874\3\2\2\2\u0874\u08ea\3\2\2\2\u0875\u0876\7\u0133\2\2\u0876"+
		"\u0877\7\u015a\2\2\u0877\u0878\7\u015d\2\2\u0878\u08ea\5\u012e\u0098\2"+
		"\u0879\u087a\7\u0137\2\2\u087a\u087b\7\u015a\2\2\u087b\u087c\7\u015d\2"+
		"\2\u087c\u08ea\5\u012e\u0098\2\u087d\u087e\7\u0138\2\2\u087e\u087f\7\u015a"+
		"\2\2\u087f\u0880\5\u0116\u008c\2\u0880\u0881\7\u015d\2\2\u0881\u0882\5"+
		"\u012e\u0098\2\u0882\u08ea\3\2\2\2\u0883\u0884\7\u0139\2\2\u0884\u0885"+
		"\7\u015a\2\2\u0885\u088c\5\u0116\u008c\2\u0886\u0887\7\u014c\2\2\u0887"+
		"\u088a\5\u0116\u008c\2\u0888\u0889\7\u014c\2\2\u0889\u088b\5\u0116\u008c"+
		"\2\u088a\u0888\3\2\2\2\u088a\u088b\3\2\2\2\u088b\u088d\3\2\2\2\u088c\u0886"+
		"\3\2\2\2\u088c\u088d\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u088f\7\u015d\2"+
		"\2\u088f\u0890\5\u012e\u0098\2\u0890\u08ea\3\2\2\2\u0891\u0892\7\u013a"+
		"\2\2\u0892\u0893\7\u015a\2\2\u0893\u0894\5\u0116\u008c\2\u0894\u0895\7"+
		"\u015d\2\2\u0895\u0896\5\u012e\u0098\2\u0896\u08ea\3\2\2\2\u0897\u0898"+
		"\7\u013b\2\2\u0898\u0899\7\u015a\2\2\u0899\u08a0\5\u0116\u008c\2\u089a"+
		"\u089b\7\u014c\2\2\u089b\u089e\5\u0116\u008c\2\u089c\u089d\7\u014c\2\2"+
		"\u089d\u089f\5\u0116\u008c\2\u089e\u089c\3\2\2\2\u089e\u089f\3\2\2\2\u089f"+
		"\u08a1\3\2\2\2\u08a0\u089a\3\2\2\2\u08a0\u08a1\3\2\2\2\u08a1\u08a2\3\2"+
		"\2\2\u08a2\u08a3\7\u015d\2\2\u08a3\u08a4\5\u012e\u0098\2\u08a4\u08ea\3"+
		"\2\2\2\u08a5\u08a6\7\u00a9\2\2\u08a6\u08a8\7\u015a\2\2\u08a7\u08a9\5\u012c"+
		"\u0097\2\u08a8\u08a7\3\2\2\2\u08a8\u08a9\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa"+
		"\u08ab\5\u0116\u008c\2\u08ab\u08ad\7\u015d\2\2\u08ac\u08ae\5\u012e\u0098"+
		"\2\u08ad\u08ac\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae\u08ea\3\2\2\2\u08af\u08b0"+
		"\7\u00ae\2\2\u08b0\u08b2\7\u015a\2\2\u08b1\u08b3\5\u012c\u0097\2\u08b2"+
		"\u08b1\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3\u08b4\3\2\2\2\u08b4\u08b5\5\u0116"+
		"\u008c\2\u08b5\u08b7\7\u015d\2\2\u08b6\u08b8\5\u012e\u0098\2\u08b7\u08b6"+
		"\3\2\2\2\u08b7\u08b8\3\2\2\2\u08b8\u08ea\3\2\2\2\u08b9\u08ba\7\u0144\2"+
		"\2\u08ba\u08bb\7\u015a\2\2\u08bb\u08bc\7\u015d\2\2\u08bc\u08ea\5\u012e"+
		"\u0098\2\u08bd\u08be\7\u0145\2\2\u08be\u08bf\7\u015a\2\2\u08bf\u08c0\7"+
		"\u015d\2\2\u08c0\u08ea\5\u012e\u0098\2\u08c1\u08c2\7\u0146\2\2\u08c2\u08c4"+
		"\7\u015a\2\2\u08c3\u08c5\5\u012c\u0097\2\u08c4\u08c3\3\2\2\2\u08c4\u08c5"+
		"\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6\u08c7\5\u0116\u008c\2\u08c7\u08c9\7"+
		"\u015d\2\2\u08c8\u08ca\5\u012e\u0098\2\u08c9\u08c8\3\2\2\2\u08c9\u08ca"+
		"\3\2\2\2\u08ca\u08ea\3\2\2\2\u08cb\u08cc\7\u010b\2\2\u08cc\u08ce\7\u015a"+
		"\2\2\u08cd\u08cf\5\u012c\u0097\2\u08ce\u08cd\3\2\2\2\u08ce\u08cf\3\2\2"+
		"\2\u08cf\u08d0\3\2\2\2\u08d0\u08d1\5\u0116\u008c\2\u08d1\u08d3\7\u015d"+
		"\2\2\u08d2\u08d4\5\u012e\u0098\2\u08d3\u08d2\3\2\2\2\u08d3\u08d4\3\2\2"+
		"\2\u08d4\u08ea\3\2\2\2\u08d5\u08d6\7\u0124\2\2\u08d6\u08d8\7\u015a\2\2"+
		"\u08d7\u08d9\5\u012c\u0097\2\u08d8\u08d7\3\2\2\2\u08d8\u08d9\3\2\2\2\u08d9"+
		"\u08da\3\2\2\2\u08da\u08db\5\u0116\u008c\2\u08db\u08dd\7\u015d\2\2\u08dc"+
		"\u08de\5\u012e\u0098\2\u08dd\u08dc\3\2\2\2\u08dd\u08de\3\2\2\2\u08de\u08ea"+
		"\3\2\2\2\u08df\u08e0\7\u0148\2\2\u08e0\u08e2\7\u015a\2\2\u08e1\u08e3\5"+
		"\u012c\u0097\2\u08e2\u08e1\3\2\2\2\u08e2\u08e3\3\2\2\2\u08e3\u08e4\3\2"+
		"\2\2\u08e4\u08e5\5\u0116\u008c\2\u08e5\u08e7\7\u015d\2\2\u08e6\u08e8\5"+
		"\u012e\u0098\2\u08e7\u08e6\3\2\2\2\u08e7\u08e8\3\2\2\2\u08e8\u08ea\3\2"+
		"\2\2\u08e9\u0851\3\2\2\2\u08e9\u085b\3\2\2\2\u08e9\u0868\3\2\2\2\u08e9"+
		"\u0875\3\2\2\2\u08e9\u0879\3\2\2\2\u08e9\u087d\3\2\2\2\u08e9\u0883\3\2"+
		"\2\2\u08e9\u0891\3\2\2\2\u08e9\u0897\3\2\2\2\u08e9\u08a5\3\2\2\2\u08e9"+
		"\u08af\3\2\2\2\u08e9\u08b9\3\2\2\2\u08e9\u08bd\3\2\2\2\u08e9\u08c1\3\2"+
		"\2\2\u08e9\u08cb\3\2\2\2\u08e9\u08d5\3\2\2\2\u08e9\u08df\3\2\2\2\u08ea"+
		"\u012b\3\2\2\2\u08eb\u08ec\t!\2\2\u08ec\u012d\3\2\2\2\u08ed\u08ee\7\u00c6"+
		"\2\2\u08ee\u08f0\7\u015a\2\2\u08ef\u08f1\5\u0130\u0099\2\u08f0\u08ef\3"+
		"\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u08f3\3\2\2\2\u08f2\u08f4\5\u00fe\u0080"+
		"\2\u08f3\u08f2\3\2\2\2\u08f3\u08f4\3\2\2\2\u08f4\u08f5\3\2\2\2\u08f5\u08f6"+
		"\7\u015d\2\2\u08f6\u012f\3\2\2\2\u08f7\u08f8\7\u00ca\2\2\u08f8\u08f9\7"+
		"\36\2\2\u08f9\u08fe\5\u0116\u008c\2\u08fa\u08fb\7\u014c\2\2\u08fb\u08fd"+
		"\5\u0116\u008c\2\u08fc\u08fa\3\2\2\2\u08fd\u0900\3\2\2\2\u08fe\u08fc\3"+
		"\2\2\2\u08fe\u08ff\3\2\2\2\u08ff\u0131\3\2\2\2\u0900\u08fe\3\2\2\2\u0901"+
		"\u09ca\7\u0132\2\2\u0902\u0903\7%\2\2\u0903\u0904\7\u015a\2\2\u0904\u0905"+
		"\5\u0116\u008c\2\u0905\u0906\7\17\2\2\u0906\u0908\5n8\2\u0907\u0909\5"+
		"p9\2\u0908\u0907\3\2\2\2\u0908\u0909\3\2\2\2\u0909\u090a\3\2\2\2\u090a"+
		"\u090b\7\u015d\2\2\u090b\u09ca\3\2\2\2\u090c\u090d\79\2\2\u090d\u0910"+
		"\7\u015a\2\2\u090e\u0911\5\u0116\u008c\2\u090f\u0911\7\u0158\2\2\u0910"+
		"\u090e\3\2\2\2\u0910\u090f\3\2\2\2\u0911\u0912\3\2\2\2\u0912\u09ca\7\u015d"+
		"\2\2\u0913\u09ca\7\u0134\2\2\u0914\u0915\7?\2\2\u0915\u09ca\7C\2\2\u0916"+
		"\u091a\7\u0135\2\2\u0917\u0918\7?\2\2\u0918\u091a\7\u0114\2\2\u0919\u0916"+
		"\3\2\2\2\u0919\u0917\3\2\2\2\u091a\u091f\3\2";
	private static final String _serializedATNSegment1 =
		"\2\2\u091b\u091c\7\u015a\2\2\u091c\u091d\5\u0116\u008c\2\u091d\u091e\7"+
		"\u015d\2\2\u091e\u0920\3\2\2\2\u091f\u091b\3\2\2\2\u091f\u0920\3\2\2\2"+
		"\u0920\u09ca\3\2\2\2\u0921\u09ca\7\u0136\2\2\u0922\u0923\7?\2\2\u0923"+
		"\u09ca\7\u0149\2\2\u0924\u0925\7\u013c\2\2\u0925\u0926\7\u015a\2\2\u0926"+
		"\u0933\5\u0116\u008c\2\u0927\u0928\7\u014c\2\2\u0928\u0930\5\u0116\u008c"+
		"\2\u0929\u092a\7\u014c\2\2\u092a\u092b\5\u0116\u008c\2\u092b\u092c\7\u0150"+
		"\2\2\u092c\u092d\5\u0116\u008c\2\u092d\u092f\3\2\2\2\u092e\u0929\3\2\2"+
		"\2\u092f\u0932\3\2\2\2\u0930\u092e\3\2\2\2\u0930\u0931\3\2\2\2\u0931\u0934"+
		"\3\2\2\2\u0932\u0930\3\2\2\2\u0933\u0927\3\2\2\2\u0933\u0934\3\2\2\2\u0934"+
		"\u0935\3\2\2\2\u0935\u0936\7\u015d\2\2\u0936\u09ca\3\2\2\2\u0937\u0938"+
		"\7\u013d\2\2\u0938\u0939\7\u015a\2\2\u0939\u0946\5\u0116\u008c\2\u093a"+
		"\u093b\7\u014c\2\2\u093b\u0943\5\u0116\u008c\2\u093c\u093d\7\u014c\2\2"+
		"\u093d\u093e\5\u0116\u008c\2\u093e\u093f\7\u0150\2\2\u093f\u0940\5\u0116"+
		"\u008c\2\u0940\u0942\3\2\2\2\u0941\u093c\3\2\2\2\u0942\u0945\3\2\2\2\u0943"+
		"\u0941\3\2\2\2\u0943\u0944\3\2\2\2\u0944\u0947\3\2\2\2\u0945\u0943\3\2"+
		"\2\2\u0946\u093a\3\2\2\2\u0946\u0947\3\2\2\2\u0947\u0948\3\2\2\2\u0948"+
		"\u0949\7\u015d\2\2\u0949\u09ca\3\2\2\2\u094a\u094b\7\u013e\2\2\u094b\u094c"+
		"\7\u015a\2\2\u094c\u0959\5\u0116\u008c\2\u094d\u094e\7\u014c\2\2\u094e"+
		"\u0956\5\u0116\u008c\2\u094f\u0950\7\u014c\2\2\u0950\u0951\5\u0116\u008c"+
		"\2\u0951\u0952\7\u0150\2\2\u0952\u0953\5\u0116\u008c\2\u0953\u0955\3\2"+
		"\2\2\u0954\u094f\3\2\2\2\u0955\u0958\3\2\2\2\u0956\u0954\3\2\2\2\u0956"+
		"\u0957\3\2\2\2\u0957\u095a\3\2\2\2\u0958\u0956\3\2\2\2\u0959\u094d\3\2"+
		"\2\2\u0959\u095a\3\2\2\2\u095a\u095b\3\2\2\2\u095b\u095c\7\u015d\2\2\u095c"+
		"\u09ca\3\2\2\2\u095d\u095e\7\u013f\2\2\u095e\u095f\7\u015a\2\2\u095f\u096c"+
		"\5\u0116\u008c\2\u0960\u0961\7\u014c\2\2\u0961\u0969\5\u0116\u008c\2\u0962"+
		"\u0963\7\u014c\2\2\u0963\u0964\5\u0116\u008c\2\u0964\u0965\7\u0150\2\2"+
		"\u0965\u0966\5\u0116\u008c\2\u0966\u0968\3\2\2\2\u0967\u0962\3\2\2\2\u0968"+
		"\u096b\3\2\2\2\u0969\u0967\3\2\2\2\u0969\u096a\3\2\2\2\u096a\u096d\3\2"+
		"\2\2\u096b\u0969\3\2\2\2\u096c\u0960\3\2\2\2\u096c\u096d\3\2\2\2\u096d"+
		"\u096e\3\2\2\2\u096e\u096f\7\u015d\2\2\u096f\u09ca\3\2\2\2\u0970\u0971"+
		"\7\u0140\2\2\u0971\u0972\7\u015a\2\2\u0972\u097f\5\u0116\u008c\2\u0973"+
		"\u0974\7\u014c\2\2\u0974\u097c\5\u0116\u008c\2\u0975\u0976\7\u014c\2\2"+
		"\u0976\u0977\5\u0116\u008c\2\u0977\u0978\7\u0150\2\2\u0978\u0979\5\u0116"+
		"\u008c\2\u0979\u097b\3\2\2\2\u097a\u0975\3\2\2\2\u097b\u097e\3\2\2\2\u097c"+
		"\u097a\3\2\2\2\u097c\u097d\3\2\2\2\u097d\u0980\3\2\2\2\u097e\u097c\3\2"+
		"\2\2\u097f\u0973\3\2\2\2\u097f\u0980\3\2\2\2\u0980\u0981\3\2\2\2\u0981"+
		"\u0982\7\u015d\2\2\u0982\u09ca\3\2\2\2\u0983\u0984\7\u0141\2\2\u0984\u0985"+
		"\7\u015a\2\2\u0985\u0992\5\u0116\u008c\2\u0986\u0987\7\u014c\2\2\u0987"+
		"\u098f\5\u0116\u008c\2\u0988\u0989\7\u014c\2\2\u0989\u098a\5\u0116\u008c"+
		"\2\u098a\u098b\7\u0150\2\2\u098b\u098c\5\u0116\u008c\2\u098c\u098e\3\2"+
		"\2\2\u098d\u0988\3\2\2\2\u098e\u0991\3\2\2\2\u098f\u098d\3\2\2\2\u098f"+
		"\u0990\3\2\2\2\u0990\u0993\3\2\2\2\u0991\u098f\3\2\2\2\u0992\u0986\3\2"+
		"\2\2\u0992\u0993\3\2\2\2\u0993\u0994\3\2\2\2\u0994\u0995\7\u015d\2\2\u0995"+
		"\u09ca\3\2\2\2\u0996\u0997\7\u0142\2\2\u0997\u0998\7\u015a\2\2\u0998\u09a0"+
		"\5\u0116\u008c\2\u0999\u099a\7\u014c\2\2\u099a\u099b\5\u0116\u008c\2\u099b"+
		"\u099c\7\u0150\2\2\u099c\u099d\5\u0116\u008c\2\u099d\u099f\3\2\2\2\u099e"+
		"\u0999\3\2\2\2\u099f\u09a2\3\2\2\2\u09a0\u099e\3\2\2\2\u09a0\u09a1\3\2"+
		"\2\2\u09a1\u09a3\3\2\2\2\u09a2\u09a0\3\2\2\2\u09a3\u09a4\7\u015d\2\2\u09a4"+
		"\u09ca\3\2\2\2\u09a5\u09a6\7\u0143\2\2\u09a6\u09a7\7\u015a\2\2\u09a7\u09ad"+
		"\5\u0116\u008c\2\u09a8\u09a9\7\u014c\2\2\u09a9\u09aa\5\u0116\u008c\2\u09aa"+
		"\u09ab\7\u0150\2\2\u09ab\u09ac\5\u0116\u008c\2\u09ac\u09ae\3\2\2\2\u09ad"+
		"\u09a8\3\2\2\2\u09ae\u09af\3\2\2\2\u09af\u09ad\3\2\2\2\u09af\u09b0\3\2"+
		"\2\2\u09b0\u09b3\3\2\2\2\u09b1\u09b2\7\u014c\2\2\u09b2\u09b4\5\u0116\u008c"+
		"\2\u09b3\u09b1\3\2\2\2\u09b3\u09b4\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5\u09b6"+
		"\7\u015d\2\2\u09b6\u09ca\3\2\2\2\u09b7\u09b8\7\u00eb\2\2\u09b8\u09b9\7"+
		"\u015a\2\2\u09b9\u09ba\5\u0116\u008c\2\u09ba\u09bb\7\u015d\2\2\u09bb\u09ca"+
		"\3\2\2\2\u09bc\u09bd\7\u010a\2\2\u09bd\u09be\7\u015a\2\2\u09be\u09bf\5"+
		"\u0116\u008c\2\u09bf\u09c0\7s\2\2\u09c0\u09c3\5\u0116\u008c\2\u09c1\u09c2"+
		"\7o\2\2\u09c2\u09c4\5\u0116\u008c\2\u09c3\u09c1\3\2\2\2\u09c3\u09c4\3"+
		"\2\2\2\u09c4\u09c5\3\2\2\2\u09c5\u09c6\7\u015d\2\2\u09c6\u09ca\3\2\2\2"+
		"\u09c7\u09ca\7\u0147\2\2\u09c8\u09ca\7\u0149\2\2\u09c9\u0901\3\2\2\2\u09c9"+
		"\u0902\3\2\2\2\u09c9\u090c\3\2\2\2\u09c9\u0913\3\2\2\2\u09c9\u0914\3\2"+
		"\2\2\u09c9\u0919\3\2\2\2\u09c9\u0921\3\2\2\2\u09c9\u0922\3\2\2\2\u09c9"+
		"\u0924\3\2\2\2\u09c9\u0937\3\2\2\2\u09c9\u094a\3\2\2\2\u09c9\u095d\3\2"+
		"\2\2\u09c9\u0970\3\2\2\2\u09c9\u0983\3\2\2\2\u09c9\u0996\3\2\2\2\u09c9"+
		"\u09a5\3\2\2\2\u09c9\u09b7\3\2\2\2\u09c9\u09bc\3\2\2\2\u09c9\u09c7\3\2"+
		"\2\2\u09c9\u09c8\3\2\2\2\u09ca\u0133\3\2\2\2\u09cb\u09cc\5\u013e\u00a0"+
		"\2\u09cc\u09ce\7\u015a\2\2\u09cd\u09cf\5\u0136\u009c\2\u09ce\u09cd\3\2"+
		"\2\2\u09ce\u09cf\3\2\2\2\u09cf\u09d0\3\2\2\2\u09d0\u09d1\7\u015d\2\2\u09d1"+
		"\u0135\3\2\2\2\u09d2\u09d7\5\u0138\u009d\2\u09d3\u09d4\7\u014c\2\2\u09d4"+
		"\u09d6\5\u0138\u009d\2\u09d5\u09d3\3\2\2\2\u09d6\u09d9\3\2\2\2\u09d7\u09d5"+
		"\3\2\2\2\u09d7\u09d8\3\2\2\2\u09d8\u0137\3\2\2\2\u09d9\u09d7\3\2\2\2\u09da"+
		"\u09e0\6\u009d\r\2\u09db\u09dc\5\u013e\u00a0\2\u09dc\u09de\7\u0150\2\2"+
		"\u09dd\u09df\7\u0154\2\2\u09de\u09dd\3\2\2\2\u09de\u09df\3\2\2\2\u09df"+
		"\u09e1\3\2\2\2\u09e0\u09db\3\2\2\2\u09e0\u09e1\3\2\2\2\u09e1\u09e2\3\2"+
		"\2\2\u09e2\u09e3\5\u0116\u008c\2\u09e3\u0139\3\2\2\2\u09e4\u09e5\7C\2"+
		"\2\u09e5\u09e6\5\u0140\u00a1\2\u09e6\u013b\3\2\2\2\u09e7\u09e8\7\u0114"+
		"\2\2\u09e8\u09e9\5\u0140\u00a1\2\u09e9\u013d\3\2\2\2\u09ea\u09ed\7\u0161"+
		"\2\2\u09eb\u09ed\5\u014c\u00a7\2\u09ec\u09ea\3\2\2\2\u09ec\u09eb\3\2\2"+
		"\2\u09ed\u09f5\3\2\2\2\u09ee\u09f1\7\6\2\2\u09ef\u09f2\7\u0161\2\2\u09f0"+
		"\u09f2\5\u014c\u00a7\2\u09f1\u09ef\3\2\2\2\u09f1\u09f0\3\2\2\2\u09f2\u09f4"+
		"\3\2\2\2\u09f3\u09ee\3\2\2\2\u09f4\u09f7\3\2\2\2\u09f5\u09f3\3\2\2\2\u09f5"+
		"\u09f6\3\2\2\2\u09f6\u013f\3\2\2\2\u09f7\u09f5\3\2\2\2\u09f8\u09fb\7\u0162"+
		"\2\2\u09f9\u09fb\7\u0163\2\2\u09fa\u09f8\3\2\2\2\u09fa\u09f9\3\2\2\2\u09fb"+
		"\u0141\3\2\2\2\u09fc\u09fe\t*\2\2\u09fd\u09fc\3\2\2\2\u09fd\u09fe\3\2"+
		"\2\2\u09fe\u09ff\3\2\2\2\u09ff\u0a00\7\u0164\2\2\u0a00\u0143\3\2\2\2\u0a01"+
		"\u0a03\t*\2\2\u0a02\u0a01\3\2\2\2\u0a02\u0a03\3\2\2\2\u0a03\u0a04\3\2"+
		"\2\2\u0a04\u0a05\7\u0165\2\2\u0a05\u0145\3\2\2\2\u0a06\u0a07\t+\2\2\u0a07"+
		"\u0147\3\2\2\2\u0a08\u0a09\7\u00ba\2\2\u0a09\u0149\3\2\2\2\u0a0a\u0a0b"+
		"\7\7\2\2\u0a0b\u014b\3\2\2\2\u0a0c\u0a0d\t,\2\2\u0a0d\u014d\3\2\2\2\u014c"+
		"\u0153\u0156\u015a\u015d\u0162\u0169\u016f\u0171\u017a\u017d\u017f\u019c"+
		"\u01a4\u01b4\u01bb\u01be\u01c3\u01c7\u01d0\u01d5\u01dd\u01e2\u01eb\u01f7"+
		"\u01fc\u01ff\u0209\u0212\u0220\u0224\u022f\u023a\u0244\u024c\u0253\u0257"+
		"\u025b\u0260\u0264\u0269\u026d\u0271\u027b\u027f\u0284\u0289\u028d\u029a"+
		"\u029f\u02a5\u02ae\u02b2\u02ba\u02bd\u02c2\u02c7\u02ce\u02d5\u02d8\u02df"+
		"\u02e5\u02ea\u02f0\u02f5\u02f8\u02fe\u030c\u0316\u031c\u0321\u0326\u032b"+
		"\u032f\u0334\u0337\u0341\u034d\u0354\u0357\u0363\u0368\u036d\u0370\u0377"+
		"\u0383\u0390\u0392\u0397\u039a\u03a9\u03af\u03ba\u03bd\u03c7\u03ce\u03d4"+
		"\u03dc\u03e6\u03fa\u0400\u0404\u0409\u040d\u0412\u0415\u041a\u041d\u042b"+
		"\u044a\u044c\u0451\u0455\u045a\u0461\u0464\u0467\u046c\u0470\u0472\u0479"+
		"\u047f\u0486\u048c\u048f\u0494\u0498\u049b\u04a2\u04a8\u04ab\u04b5\u04be"+
		"\u04c5\u04cc\u04ce\u04d4\u04d7\u04e2\u04eb\u04f1\u04f7\u04fa\u04ff\u0502"+
		"\u0505\u0508\u050b\u0511\u051b\u0526\u0529\u0530\u0535\u053a\u053e\u0546"+
		"\u054a\u054f\u0553\u0555\u055a\u0562\u0567\u056b\u0573\u057b\u057e\u0581"+
		"\u0586\u058f\u0593\u059d\u05af\u05b3\u05b7\u05c1\u05c7\u05cb\u05cf\u05db"+
		"\u05e2\u05f2\u05f9\u05fd\u0601\u0605\u060a\u060d\u0611\u0614\u061f\u0622"+
		"\u062b\u0632\u063f\u0647\u064b\u0655\u065a\u0667\u0672\u067a\u067e\u0682"+
		"\u0686\u0688\u068d\u0690\u0693\u0696\u069a\u069d\u06a0\u06a3\u06a6\u06ad"+
		"\u06b8\u06bc\u06bf\u06c3\u06ca\u06ce\u06d8\u06e0\u06e6\u06ea\u06f0\u06f9"+
		"\u06fc\u0701\u0704\u070e\u0713\u071c\u0721\u0725\u072e\u0732\u0740\u074d"+
		"\u0752\u0756\u075c\u0767\u0769\u076c\u0774\u077b\u0783\u0789\u078e\u0799"+
		"\u07a2\u07a6\u07af\u07b3\u07bd\u07c2\u07d8\u07db\u07ee\u07fe\u0800\u080b"+
		"\u081a\u0826\u082a\u0835\u0839\u0845\u0849\u0854\u0859\u085e\u0862\u0866"+
		"\u086b\u086f\u0873\u088a\u088c\u089e\u08a0\u08a8\u08ad\u08b2\u08b7\u08c4"+
		"\u08c9\u08ce\u08d3\u08d8\u08dd\u08e2\u08e7\u08e9\u08f0\u08f3\u08fe\u0908"+
		"\u0910\u0919\u091f\u0930\u0933\u0943\u0946\u0956\u0959\u0969\u096c\u097c"+
		"\u097f\u098f\u0992\u09a0\u09af\u09b3\u09c3\u09c9\u09ce\u09d7\u09de\u09e0"+
		"\u09ec\u09f1\u09f5\u09fa\u09fd\u0a02";
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