// Generated from E:/ite-fourth-year/compilers/projects/sql-compiler/src/com/sqlcompiler/antlr\Hplsql.g4 by ANTLR 4.7.2
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
    public static final int
            RULE_program = 0, RULE_block = 1, RULE_begin_end_block = 2, RULE_single_block_stmt = 3,
            RULE_block_end = 4, RULE_proc_block = 5, RULE_stmt = 6, RULE_error_stmt = 7,
            RULE_invalid_bool_expr = 8, RULE_invalid_cpp_function_stmt = 9, RULE_invalid_cpp_function_header = 10,
            RULE_invalid_cpp_function_params_clause = 11, RULE_invalid_cpp_function_param = 12,
            RULE_invalid_cpp_function_body = 13, RULE_exception_block = 14, RULE_exception_block_item = 15,
            RULE_semicolon_stmt = 16, RULE_null_stmt = 17, RULE_expr_stmt = 18, RULE_assignment_stmt = 19,
            RULE_assignment_stmt_item = 20, RULE_assignment_stmt_single_item = 21,
            RULE_assignment_stmt_multiple_item = 22, RULE_assignment_stmt_select_item = 23,
            RULE_associate_locator_stmt = 24, RULE_break_stmt = 25, RULE_call_stmt = 26,
            RULE_close_stmt = 27, RULE_declare_stmt = 28, RULE_declare_block = 29,
            RULE_declare_block_inplace = 30, RULE_declare_stmt_item = 31, RULE_declare_var_item = 32,
            RULE_declare_condition_item = 33, RULE_declare_handler_item = 34, RULE_create_type_stmt = 35,
            RULE_create_type_definition = 36, RULE_create_type_items = 37, RULE_create_type_items_item = 38,
            RULE_declare_temporary_table_item = 39, RULE_create_table_stmt = 40, RULE_create_local_temp_table_stmt = 41,
            RULE_create_table_definition = 42, RULE_create_table_columns = 43, RULE_create_table_columns_item = 44,
            RULE_column_name = 45, RULE_create_table_column_inline_cons = 46, RULE_create_table_column_cons = 47,
            RULE_create_table_fk_action = 48, RULE_create_table_preoptions = 49, RULE_create_table_preoptions_item = 50,
            RULE_create_table_preoptions_td_item = 51, RULE_create_table_options = 52,
            RULE_create_table_options_item = 53, RULE_create_table_options_ora_item = 54,
            RULE_create_table_options_db2_item = 55, RULE_create_table_options_td_item = 56,
            RULE_create_table_options_hive_item = 57, RULE_create_table_hive_row_format = 58,
            RULE_create_table_hive_row_format_fields = 59, RULE_create_table_options_mssql_item = 60,
            RULE_create_table_options_mysql_item = 61, RULE_dtype = 62, RULE_dtype_len = 63,
            RULE_dtype_attr = 64, RULE_dtype_default = 65, RULE_create_database_stmt = 66,
            RULE_create_database_option = 67, RULE_create_function_stmt = 68, RULE_create_function_return = 69,
            RULE_create_package_stmt = 70, RULE_package_spec = 71, RULE_package_spec_item = 72,
            RULE_create_package_body_stmt = 73, RULE_package_body = 74, RULE_package_body_item = 75,
            RULE_create_procedure_stmt = 76, RULE_create_routine_params = 77, RULE_create_routine_param_item = 78,
            RULE_create_routine_options = 79, RULE_create_routine_option = 80, RULE_exec_stmt = 81,
            RULE_if_stmt = 82, RULE_if_plsql_stmt = 83, RULE_if_tsql_stmt = 84, RULE_if_bteq_stmt = 85,
            RULE_elseif_block = 86, RULE_else_block = 87, RULE_exit_stmt = 88, RULE_leave_stmt = 89,
            RULE_cmp_stmt = 90, RULE_cmp_source = 91, RULE_create_index_stmt = 92,
            RULE_create_index_col = 93, RULE_index_storage_clause = 94, RULE_index_mssql_storage_clause = 95,
            RULE_quit_stmt = 96, RULE_return_stmt = 97, RULE_cpp_function_stmt = 98,
            RULE_cpp_function_header = 99, RULE_cpp_function_params_clause = 100,
            RULE_cpp_function_param = 101, RULE_cpp_function_body = 102, RULE_cpp_if_stmt = 103,
            RULE_cpp_elseif_clause = 104, RULE_cpp_else_clause = 105, RULE_cpp_for_stmt = 106,
            RULE_cpp_for_stmt_header = 107, RULE_cpp_for_params_clause = 108, RULE_cpp_for_param = 109,
            RULE_cpp_for_stmt_var_incr_caluse = 110, RULE_cpp_for_stmt_var_incr_ = 111,
            RULE_cpp_for_stmt_body = 112, RULE_cpp_body_content = 113, RULE_while_stmt = 114,
            RULE_for_range_stmt = 115, RULE_label = 116, RULE_using_clause = 117,
            RULE_select_stmt = 118, RULE_fullselect_stmt = 119, RULE_fullselect_stmt_item = 120,
            RULE_fullselect_set_clause = 121, RULE_subselect_stmt = 122, RULE_select_list = 123,
            RULE_select_list_set = 124, RULE_select_list_limit = 125, RULE_select_list_item = 126,
            RULE_select_list_alias = 127, RULE_select_list_asterisk = 128, RULE_into_clause = 129,
            RULE_from_clause = 130, RULE_from_table_clause = 131, RULE_from_table_name_clause = 132,
            RULE_from_subselect_clause = 133, RULE_from_join_clause = 134, RULE_from_join_type_clause = 135,
            RULE_from_table_values_clause = 136, RULE_from_table_values_row = 137,
            RULE_from_alias_clause = 138, RULE_table_name = 139, RULE_where_clause = 140,
            RULE_group_by_clause = 141, RULE_having_clause = 142, RULE_qualify_clause = 143,
            RULE_order_by_clause = 144, RULE_select_options = 145, RULE_select_options_item = 146,
            RULE_bool_expr = 147, RULE_bool_expr_atom = 148, RULE_bool_expr_unary = 149,
            RULE_bool_expr_single_in = 150, RULE_bool_expr_multi_in = 151, RULE_bool_expr_binary = 152,
            RULE_bool_expr_logical_operator = 153, RULE_bool_expr_binary_operator = 154,
            RULE_expr = 155, RULE_expr_atom = 156, RULE_expr_interval = 157, RULE_interval_item = 158,
            RULE_expr_concat = 159, RULE_expr_concat_item = 160, RULE_expr_case = 161,
            RULE_expr_case_simple = 162, RULE_expr_case_searched = 163, RULE_expr_cursor_attribute = 164,
            RULE_expr_agg_window_func = 165, RULE_expr_func_all_distinct = 166, RULE_expr_func_over_clause = 167,
            RULE_expr_func_partition_by_clause = 168, RULE_expr_spec_func = 169, RULE_expr_func = 170,
            RULE_expr_func_params = 171, RULE_func_param = 172, RULE_date_literal = 173,
            RULE_timestamp_literal = 174, RULE_ident = 175, RULE_string = 176, RULE_int_number = 177,
            RULE_dec_number = 178, RULE_bool_literal = 179, RULE_null_const = 180,
            RULE_new_line = 181, RULE_non_reserved_words = 182;

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
    public static final String[] ruleNames = makeRuleNames();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    private static final String _serializedATNSegment0 =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0147\u0ae6\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
                    "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT" +
                    "\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4" +
                    "`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t" +
                    "k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4" +
                    "w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080" +
                    "\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085" +
                    "\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089" +
                    "\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e" +
                    "\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092" +
                    "\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097" +
                    "\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b" +
                    "\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0" +
                    "\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4" +
                    "\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9" +
                    "\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad" +
                    "\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2" +
                    "\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6" +
                    "\4\u00b7\t\u00b7\4\u00b8\t\u00b8\3\2\3\2\3\2\3\3\3\3\5\3\u0176\n\3\3\3" +
                    "\5\3\u0179\n\3\6\3\u017b\n\3\r\3\16\3\u017c\3\4\5\4\u0180\n\4\3\4\3\4" +
                    "\3\4\5\4\u0185\n\4\3\4\3\4\3\5\3\5\3\5\5\5\u018c\n\5\3\5\3\5\3\5\3\5\5" +
                    "\5\u0192\n\5\5\5\u0194\n\5\3\6\3\6\3\6\3\7\3\7\6\7\u019b\n\7\r\7\16\7" +
                    "\u019c\3\7\5\7\u01a0\n\7\5\7\u01a2\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b" +
                    "\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3" +
                    "\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01c5\n\b\3\t\3\t\3\n\5\n\u01ca\n\n" +
                    "\3\n\3\n\3\n\3\n\5\n\u01d0\n\n\3\n\3\n\5\n\u01d4\n\n\3\13\3\13\3\13\3" +
                    "\13\3\13\3\13\3\13\3\13\3\13\5\13\u01df\n\13\3\f\3\f\3\f\3\f\5\f\u01e5" +
                    "\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01ed\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f" +
                    "\3\f\3\f\3\f\3\f\3\f\5\f\u01fb\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0204" +
                    "\n\f\5\f\u0206\n\f\3\r\3\r\5\r\u020a\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0212" +
                    "\n\r\7\r\u0214\n\r\f\r\16\r\u0217\13\r\3\r\3\r\3\r\7\r\u021c\n\r\f\r\16" +
                    "\r\u021f\13\r\3\r\3\r\6\r\u0223\n\r\r\r\16\r\u0224\3\r\3\r\7\r\u0229\n" +
                    "\r\f\r\16\r\u022c\13\r\5\r\u022e\n\r\3\16\3\16\3\17\3\17\7\17\u0234\n" +
                    "\17\f\17\16\17\u0237\13\17\3\17\7\17\u023a\n\17\f\17\16\17\u023d\13\17" +
                    "\3\17\5\17\u0240\n\17\3\20\3\20\6\20\u0244\n\20\r\20\16\20\u0245\3\21" +
                    "\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\5\25" +
                    "\u0256\n\25\3\25\3\25\3\25\7\25\u025b\n\25\f\25\16\25\u025e\13\25\3\26" +
                    "\3\26\3\26\5\26\u0263\n\26\3\27\3\27\5\27\u0267\n\27\3\27\3\27\3\27\3" +
                    "\27\3\27\3\27\3\27\5\27\u0270\n\27\3\27\3\27\3\27\5\27\u0275\n\27\3\30" +
                    "\3\30\3\30\3\30\7\30\u027b\n\30\f\30\16\30\u027e\13\30\3\30\3\30\5\30" +
                    "\u0282\n\30\3\30\3\30\3\30\3\30\3\30\7\30\u0289\n\30\f\30\16\30\u028c" +
                    "\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\7\31\u0295\n\31\f\31\16\31\u0298" +
                    "\13\31\3\31\3\31\5\31\u029c\n\31\3\31\5\31\u029f\n\31\3\31\3\31\3\31\3" +
                    "\31\3\31\3\32\3\32\3\32\5\32\u02a9\n\32\3\32\3\32\3\32\3\32\3\32\7\32" +
                    "\u02b0\n\32\f\32\16\32\u02b3\13\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33" +
                    "\3\34\3\34\3\34\3\34\5\34\u02c0\n\34\3\34\3\34\5\34\u02c4\n\34\3\35\3" +
                    "\35\3\35\3\36\3\36\3\36\3\36\7\36\u02cd\n\36\f\36\16\36\u02d0\13\36\3" +
                    "\37\3\37\3\37\3\37\3\37\3\37\7\37\u02d8\n\37\f\37\16\37\u02db\13\37\3" +
                    " \3 \3 \3 \3 \7 \u02e2\n \f \16 \u02e5\13 \3!\3!\3!\3!\5!\u02eb\n!\3\"" +
                    "\3\"\3\"\7\"\u02f0\n\"\f\"\16\"\u02f3\13\"\3\"\5\"\u02f6\n\"\3\"\3\"\5" +
                    "\"\u02fa\n\"\3\"\7\"\u02fd\n\"\f\"\16\"\u0300\13\"\3\"\5\"\u0303\n\"\3" +
                    "\"\3\"\3\"\5\"\u0308\n\"\3\"\3\"\5\"\u030c\n\"\3\"\3\"\5\"\u0310\n\"\3" +
                    "#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u031d\n$\3$\3$\3%\3%\3%\3%\3%\3&\3" +
                    "&\3&\3&\3\'\3\'\3\'\7\'\u032d\n\'\f\'\16\'\u0330\13\'\3(\3(\3(\3(\3)\5" +
                    ")\u0337\n)\3)\3)\3)\3)\5)\u033d\n)\3)\3)\3*\3*\3*\3*\3*\5*\u0346\n*\3" +
                    "*\3*\5*\u034a\n*\3*\3*\3+\3+\3+\3+\5+\u0352\n+\3+\5+\u0355\n+\3+\3+\3" +
                    "+\5+\u035a\n+\3+\3+\3,\5,\u035f\n,\3,\3,\3,\3,\3,\5,\u0366\n,\3,\3,\3" +
                    ",\3,\3,\5,\u036d\n,\3,\5,\u0370\n,\3-\3-\3-\7-\u0375\n-\f-\16-\u0378\13" +
                    "-\3.\3.\3.\5.\u037d\n.\3.\7.\u0380\n.\f.\16.\u0383\13.\3.\7.\u0386\n." +
                    "\f.\16.\u0389\13.\3.\3.\5.\u038d\n.\3.\5.\u0390\n.\3/\3/\3\60\3\60\5\60" +
                    "\u0396\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u03a2" +
                    "\n\60\f\60\16\60\u03a5\13\60\3\60\3\60\3\60\3\60\3\60\7\60\u03ac\n\60" +
                    "\f\60\16\60\u03af\13\60\3\60\3\60\3\60\5\60\u03b4\n\60\3\61\3\61\3\61" +
                    "\5\61\u03b9\n\61\3\61\3\61\3\61\5\61\u03be\n\61\3\61\3\61\3\61\5\61\u03c3" +
                    "\n\61\7\61\u03c5\n\61\f\61\16\61\u03c8\13\61\3\61\3\61\5\61\u03cc\n\61" +
                    "\3\61\5\61\u03cf\n\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u03d7\n\61\f" +
                    "\61\16\61\u03da\13\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u03e3\n" +
                    "\61\f\61\16\61\u03e6\13\61\3\61\3\61\7\61\u03ea\n\61\f\61\16\61\u03ed" +
                    "\13\61\5\61\u03ef\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3" +
                    "\62\5\62\u03fb\n\62\3\63\6\63\u03fe\n\63\r\63\16\63\u03ff\3\64\3\64\3" +
                    "\64\5\64\u0405\n\64\3\65\5\65\u0408\n\65\3\65\3\65\3\66\6\66\u040d\n\66" +
                    "\r\66\16\66\u040e\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5" +
                    "\67\u041b\n\67\38\38\38\38\38\38\38\38\38\38\38\68\u0428\n8\r8\168\u0429" +
                    "\38\38\38\58\u042f\n8\39\59\u0432\n9\39\39\39\39\39\39\39\39\39\39\39" +
                    "\79\u043f\n9\f9\169\u0442\139\39\39\39\59\u0447\n9\39\39\39\39\39\39\3" +
                    "9\39\39\59\u0452\n9\3:\5:\u0455\n:\3:\3:\3:\3:\3:\3:\7:\u045d\n:\f:\16" +
                    ":\u0460\13:\3:\3:\3:\3:\5:\u0466\n:\3;\3;\3;\3;\5;\u046c\n;\3<\3<\3<\3" +
                    "<\7<\u0472\n<\f<\16<\u0475\13<\3=\3=\3=\3=\3=\3=\3=\5=\u047e\n=\3=\3=" +
                    "\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0492\n=\3>\3>\3>" +
                    "\3>\5>\u0498\n>\3?\3?\5?\u049c\n?\3?\3?\3?\5?\u04a1\n?\3?\3?\5?\u04a5" +
                    "\n?\3?\3?\3?\5?\u04aa\n?\3?\5?\u04ad\n?\3?\3?\3?\5?\u04b2\n?\3?\5?\u04b5" +
                    "\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u04c3\n@\3@\3@\3@\3@\3@\3@" +
                    "\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@" +
                    "\5@\u04e2\n@\5@\u04e4\n@\3A\3A\3A\5A\u04e9\nA\3A\3A\5A\u04ed\nA\3A\3A" +
                    "\3B\5B\u04f2\nB\3B\3B\3B\3B\3B\5B\u04f9\nB\3B\5B\u04fc\nB\3C\5C\u04ff" +
                    "\nC\3C\3C\3C\5C\u0504\nC\3C\3C\5C\u0508\nC\5C\u050a\nC\3D\3D\3D\3D\3D" +
                    "\5D\u0511\nD\3D\3D\7D\u0515\nD\fD\16D\u0518\13D\3E\3E\3E\3E\5E\u051e\n" +
                    "E\3F\3F\3F\3F\5F\u0524\nF\3F\5F\u0527\nF\3F\3F\3F\5F\u052c\nF\3F\3F\5" +
                    "F\u0530\nF\3F\5F\u0533\nF\3F\3F\3G\3G\3G\5G\u053a\nG\3H\3H\3H\3H\5H\u0540" +
                    "\nH\3H\5H\u0543\nH\3H\3H\3H\3H\3H\3H\3H\3H\5H\u054d\nH\3I\3I\3I\3I\3I" +
                    "\7I\u0554\nI\fI\16I\u0557\13I\3J\3J\3J\3J\5J\u055d\nJ\3J\3J\3J\3J\3J\5" +
                    "J\u0564\nJ\5J\u0566\nJ\3K\3K\3K\3K\5K\u056c\nK\3K\5K\u056f\nK\3K\3K\3" +
                    "K\3K\3K\3K\3K\3K\3K\5K\u057a\nK\3L\3L\3L\3L\3L\7L\u0581\nL\fL\16L\u0584" +
                    "\13L\3M\3M\3M\5M\u0589\nM\3N\3N\3N\3N\5N\u058f\nN\3N\5N\u0592\nN\3N\3" +
                    "N\3N\5N\u0597\nN\3N\5N\u059a\nN\3N\5N\u059d\nN\3N\5N\u05a0\nN\3N\5N\u05a3" +
                    "\nN\3N\3N\3N\3N\5N\u05a9\nN\3O\3O\3O\3O\3O\3O\7O\u05b1\nO\fO\16O\u05b4" +
                    "\13O\3O\3O\3O\3O\3O\3O\7O\u05bc\nO\fO\16O\u05bf\13O\5O\u05c1\nO\3P\3P" +
                    "\3P\3P\3P\5P\u05c8\nP\3P\3P\3P\5P\u05cd\nP\3P\7P\u05d0\nP\fP\16P\u05d3" +
                    "\13P\3P\5P\u05d6\nP\3P\3P\3P\3P\3P\3P\5P\u05de\nP\3P\3P\5P\u05e2\nP\3" +
                    "P\7P\u05e5\nP\fP\16P\u05e8\13P\3P\5P\u05eb\nP\5P\u05ed\nP\3Q\6Q\u05f0" +
                    "\nQ\rQ\16Q\u05f1\3R\3R\3R\3R\3R\3R\5R\u05fa\nR\3R\3R\3R\5R\u05ff\nR\3" +
                    "S\3S\5S\u0603\nS\3S\3S\3S\3S\3S\3S\5S\u060b\nS\3S\3S\3S\3S\7S\u0611\n" +
                    "S\fS\16S\u0614\13S\5S\u0616\nS\3S\5S\u0619\nS\3T\3T\3T\5T\u061e\nT\3U" +
                    "\3U\3U\3U\3U\7U\u0625\nU\fU\16U\u0628\13U\3U\5U\u062b\nU\3U\3U\3U\3V\3" +
                    "V\3V\3V\3V\5V\u0635\nV\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Z\3" +
                    "Z\5Z\u0647\nZ\3Z\3Z\5Z\u064b\nZ\3[\3[\5[\u064f\n[\3\\\3\\\3\\\3\\\3\\" +
                    "\3\\\3]\3]\5]\u0659\n]\3]\3]\3]\3]\5]\u065f\n]\3]\3]\5]\u0663\n]\3^\3" +
                    "^\5^\u0667\n^\3^\3^\3^\3^\3^\3^\3^\3^\7^\u0671\n^\f^\16^\u0674\13^\3^" +
                    "\3^\3_\3_\5_\u067a\n_\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\7a\u0688\na" +
                    "\fa\16a\u068b\13a\3a\3a\7a\u068f\na\fa\16a\u0692\13a\3b\5b\u0695\nb\3" +
                    "b\3b\5b\u0699\nb\3c\3c\5c\u069d\nc\3d\3d\3d\3e\3e\3e\3e\3e\3e\3f\3f\3" +
                    "f\7f\u06ab\nf\ff\16f\u06ae\13f\3g\3g\3g\3h\3h\7h\u06b5\nh\fh\16h\u06b8" +
                    "\13h\3h\3h\3i\3i\3i\3i\3i\3i\7i\u06c2\ni\fi\16i\u06c5\13i\3i\5i\u06c8" +
                    "\ni\3j\3j\3j\3j\3j\3j\3k\3k\3k\3l\3l\3l\3m\3m\3m\3m\3m\3m\3m\3m\3m\3n" +
                    "\3n\3n\7n\u06e2\nn\fn\16n\u06e5\13n\3o\5o\u06e8\no\3o\3o\3o\3o\3p\3p\3" +
                    "p\7p\u06f1\np\fp\16p\u06f4\13p\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q" +
                    "\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\5q\u070d\nq\3r\3r\7r\u0711\nr\fr\16r\u0714" +
                    "\13r\3r\3r\5r\u0718\nr\3s\3s\5s\u071c\ns\3t\3t\3t\3t\3t\3t\5t\u0724\n" +
                    "t\3u\3u\3u\3u\5u\u072a\nu\3u\3u\3u\3u\3u\5u\u0731\nu\3u\3u\3u\3u\3u\3" +
                    "v\3v\3v\3v\3v\3v\5v\u073e\nv\3w\3w\3w\3w\7w\u0744\nw\fw\16w\u0747\13w" +
                    "\3x\3x\3y\3y\3y\3y\7y\u074f\ny\fy\16y\u0752\13y\3z\3z\3z\3z\3z\5z\u0759" +
                    "\nz\3{\3{\5{\u075d\n{\3{\3{\5{\u0761\n{\3{\3{\5{\u0765\n{\5{\u0767\n{" +
                    "\3|\3|\3|\5|\u076c\n|\3|\5|\u076f\n|\3|\5|\u0772\n|\3|\5|\u0775\n|\3|" +
                    "\3|\5|\u0779\n|\3|\5|\u077c\n|\3|\5|\u077f\n|\3}\5}\u0782\n}\3}\5}\u0785" +
                    "\n}\3}\3}\3}\7}\u078a\n}\f}\16}\u078d\13}\3~\3~\3\177\3\177\3\177\3\u0080" +
                    "\3\u0080\3\u0080\5\u0080\u0797\n\u0080\3\u0080\3\u0080\5\u0080\u079b\n" +
                    "\u0080\3\u0080\5\u0080\u079e\n\u0080\3\u0081\3\u0081\5\u0081\u07a2\n\u0081" +
                    "\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u07a9\n\u0081\3\u0082" +
                    "\3\u0082\5\u0082\u07ad\n\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083" +
                    "\3\u0083\7\u0083\u07b5\n\u0083\f\u0083\16\u0083\u07b8\13\u0083\3\u0084" +
                    "\3\u0084\3\u0084\7\u0084\u07bd\n\u0084\f\u0084\16\u0084\u07c0\13\u0084" +
                    "\3\u0085\3\u0085\3\u0085\5\u0085\u07c5\n\u0085\3\u0086\3\u0086\5\u0086" +
                    "\u07c9\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u07cf\n\u0087\3" +
                    "\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u07d8\n" +
                    "\u0088\3\u0089\5\u0089\u07db\n\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u07e0" +
                    "\n\u0089\3\u0089\5\u0089\u07e3\n\u0089\3\u008a\3\u008a\3\u008a\3\u008a" +
                    "\3\u008a\3\u008a\7\u008a\u07eb\n\u008a\f\u008a\16\u008a\u07ee\13\u008a" +
                    "\3\u008a\3\u008a\5\u008a\u07f2\n\u008a\3\u008b\3\u008b\3\u008b\3\u008b" +
                    "\3\u008b\7\u008b\u07f9\n\u008b\f\u008b\16\u008b\u07fc\13\u008b\3\u008b" +
                    "\3\u008b\5\u008b\u0800\n\u008b\3\u008c\3\u008c\5\u008c\u0804\n\u008c\3" +
                    "\u008c\3\u008c\3\u008c\3\u008c\3\u008c\7\u008c\u080b\n\u008c\f\u008c\16" +
                    "\u008c\u080e\13\u008c\3\u008c\5\u008c\u0811\n\u008c\3\u008d\3\u008d\3" +
                    "\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\7\u008f" +
                    "\u081d\n\u008f\f\u008f\16\u008f\u0820\13\u008f\3\u0090\3\u0090\3\u0090" +
                    "\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u082c" +
                    "\n\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u0831\n\u0092\7\u0092\u0833\n" +
                    "\u0092\f\u0092\16\u0092\u0836\13\u0092\3\u0093\6\u0093\u0839\n\u0093\r" +
                    "\u0093\16\u0093\u083a\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094" +
                    "\3\u0094\3\u0094\3\u0094\5\u0094\u0846\n\u0094\5\u0094\u0848\n\u0094\3" +
                    "\u0095\3\u0095\5\u0095\u084c\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3" +
                    "\u0095\5\u0095\u0853\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\7\u0095\u0859" +
                    "\n\u0095\f\u0095\16\u0095\u085c\13\u0095\3\u0096\3\u0096\3\u0096\5\u0096" +
                    "\u0861\n\u0096\3\u0097\3\u0097\3\u0097\5\u0097\u0866\n\u0097\3\u0097\3" +
                    "\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097" +
                    "\u0871\n\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097" +
                    "\5\u0097\u087a\n\u0097\3\u0098\3\u0098\5\u0098\u087e\n\u0098\3\u0098\3" +
                    "\u0098\3\u0098\3\u0098\3\u0098\7\u0098\u0885\n\u0098\f\u0098\16\u0098" +
                    "\u0888\13\u0098\3\u0098\5\u0098\u088b\n\u0098\3\u0098\3\u0098\3\u0099" +
                    "\3\u0099\3\u0099\3\u0099\7\u0099\u0893\n\u0099\f\u0099\16\u0099\u0896" +
                    "\13\u0099\3\u0099\3\u0099\5\u0099\u089a\n\u0099\3\u0099\3\u0099\3\u0099" +
                    "\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009b\3\u009b\3\u009c" +
                    "\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c" +
                    "\u08b0\n\u009c\3\u009c\5\u009c\u08b3\n\u009c\3\u009d\3\u009d\3\u009d\3" +
                    "\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d" +
                    "\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u08c6\n\u009d\3\u009d" +
                    "\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d" +
                    "\3\u009d\3\u009d\3\u009d\3\u009d\7\u009d\u08d6\n\u009d\f\u009d\16\u009d" +
                    "\u08d9\13\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e" +
                    "\3\u009e\5\u009e\u08e3\n\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u00a0" +
                    "\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\7\u00a1\u08f0\n\u00a1" +
                    "\f\u00a1\16\u00a1\u08f3\13\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2" +
                    "\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u08fe\n\u00a2\3\u00a3\3\u00a3" +
                    "\5\u00a3\u0902\n\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4" +
                    "\3\u00a4\6\u00a4\u090b\n\u00a4\r\u00a4\16\u00a4\u090c\3\u00a4\3\u00a4" +
                    "\5\u00a4\u0911\n\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5" +
                    "\3\u00a5\3\u00a5\6\u00a5\u091b\n\u00a5\r\u00a5\16\u00a5\u091c\3\u00a5" +
                    "\3\u00a5\5\u00a5\u0921\n\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6" +
                    "\3\u00a6\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u092c\n\u00a7\3\u00a7\3\u00a7" +
                    "\3\u00a7\5\u00a7\u0931\n\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0936\n" +
                    "\u00a7\3\u00a7\3\u00a7\5\u00a7\u093a\n\u00a7\3\u00a7\3\u00a7\5\u00a7\u093e" +
                    "\n\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0943\n\u00a7\3\u00a7\3\u00a7" +
                    "\5\u00a7\u0947\n\u00a7\3\u00a7\3\u00a7\5\u00a7\u094b\n\u00a7\3\u00a7\3" +
                    "\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7" +
                    "\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7" +
                    "\3\u00a7\3\u00a7\5\u00a7\u0962\n\u00a7\5\u00a7\u0964\n\u00a7\3\u00a7\3" +
                    "\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7" +
                    "\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0976\n\u00a7" +
                    "\5\u00a7\u0978\n\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7" +
                    "\5\u00a7\u0980\n\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0985\n\u00a7\3" +
                    "\u00a7\3\u00a7\3\u00a7\5\u00a7\u098a\n\u00a7\3\u00a7\3\u00a7\3\u00a7\5" +
                    "\u00a7\u098f\n\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3" +
                    "\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u099c\n\u00a7\3\u00a7\3" +
                    "\u00a7\3\u00a7\5\u00a7\u09a1\n\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u09a6" +
                    "\n\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u09ab\n\u00a7\3\u00a7\3\u00a7" +
                    "\3\u00a7\5\u00a7\u09b0\n\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u09b5\n" +
                    "\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u09ba\n\u00a7\3\u00a7\3\u00a7\3" +
                    "\u00a7\5\u00a7\u09bf\n\u00a7\5\u00a7\u09c1\n\u00a7\3\u00a8\3\u00a8\3\u00a9" +
                    "\3\u00a9\3\u00a9\5\u00a9\u09c8\n\u00a9\3\u00a9\5\u00a9\u09cb\n\u00a9\3" +
                    "\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\7\u00aa\u09d4\n" +
                    "\u00aa\f\u00aa\16\u00aa\u09d7\13\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab" +
                    "\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u09e0\n\u00ab\3\u00ab\3\u00ab\3\u00ab" +
                    "\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u09e8\n\u00ab\3\u00ab\3\u00ab\3\u00ab" +
                    "\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u09f1\n\u00ab\3\u00ab\3\u00ab" +
                    "\3\u00ab\3\u00ab\5\u00ab\u09f7\n\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab" +
                    "\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab" +
                    "\7\u00ab\u0a06\n\u00ab\f\u00ab\16\u00ab\u0a09\13\u00ab\5\u00ab\u0a0b\n" +
                    "\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab" +
                    "\3\u00ab\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u0a19\n\u00ab\f\u00ab\16\u00ab" +
                    "\u0a1c\13\u00ab\5\u00ab\u0a1e\n\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab" +
                    "\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\7\u00ab" +
                    "\u0a2c\n\u00ab\f\u00ab\16\u00ab\u0a2f\13\u00ab\5\u00ab\u0a31\n\u00ab\3" +
                    "\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab" +
                    "\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u0a3f\n\u00ab\f\u00ab\16\u00ab\u0a42" +
                    "\13\u00ab\5\u00ab\u0a44\n\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab" +
                    "\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u0a52" +
                    "\n\u00ab\f\u00ab\16\u00ab\u0a55\13\u00ab\5\u00ab\u0a57\n\u00ab\3\u00ab" +
                    "\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab" +
                    "\3\u00ab\3\u00ab\7\u00ab\u0a65\n\u00ab\f\u00ab\16\u00ab\u0a68\13\u00ab" +
                    "\5\u00ab\u0a6a\n\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab" +
                    "\3\u00ab\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u0a76\n\u00ab\f\u00ab\16\u00ab" +
                    "\u0a79\13\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab" +
                    "\3\u00ab\3\u00ab\3\u00ab\6\u00ab\u0a85\n\u00ab\r\u00ab\16\u00ab\u0a86" +
                    "\3\u00ab\3\u00ab\5\u00ab\u0a8b\n\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab" +
                    "\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab" +
                    "\3\u00ab\5\u00ab\u0a9b\n\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab" +
                    "\u0aa1\n\u00ab\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0aa6\n\u00ac\3\u00ac\3" +
                    "\u00ac\3\u00ad\3\u00ad\3\u00ad\7\u00ad\u0aad\n\u00ad\f\u00ad\16\u00ad" +
                    "\u0ab0\13\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u0ab6\n\u00ae" +
                    "\5\u00ae\u0ab8\n\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00b0" +
                    "\3\u00b0\3\u00b0\3\u00b1\3\u00b1\5\u00b1\u0ac4\n\u00b1\3\u00b1\3\u00b1" +
                    "\3\u00b1\5\u00b1\u0ac9\n\u00b1\7\u00b1\u0acb\n\u00b1\f\u00b1\16\u00b1" +
                    "\u0ace\13\u00b1\3\u00b2\3\u00b2\5\u00b2\u0ad2\n\u00b2\3\u00b3\5\u00b3" +
                    "\u0ad5\n\u00b3\3\u00b3\3\u00b3\3\u00b4\5\u00b4\u0ada\n\u00b4\3\u00b4\3" +
                    "\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b8\3\u00b8" +
                    "\3\u00b8\2\4\u0128\u0138\u00b9\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36" +
                    " \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082" +
                    "\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a" +
                    "\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2" +
                    "\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca" +
                    "\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2" +
                    "\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa" +
                    "\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112" +
                    "\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a" +
                    "\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142" +
                    "\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a" +
                    "\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\2+\4\2VV" +
                    "\u0107\u0107\5\2\3\4\u012a\u012a\u013b\u013b\3\2\u0094\u0095\4\2\61\61" +
                    "__\4\2\u00a2\u00a2\u00db\u00db\4\2\r\rII\4\2GG\u00fc\u00fc\4\2``\u0097" +
                    "\u0097\4\2GG\u00bc\u00bc\4\2CCuu\5\2xx\u009d\u009d\u00b8\u00b9\4\2\u0099" +
                    "\u0099\u00a7\u00a7\4\2\u00a5\u00a5\u010d\u010d\4\2\u009c\u009c\u0140\u0140" +
                    "\4\2\34\34\"\"\4\2  \67\67\4\299\u00d4\u00d4\4\2\f\f\u0085\u0085\3\2\u00c9" +
                    "\u00ca\3\2\u00be\u00bf\6\2\66\66EE\u0084\u0084\u00b5\u00b5\3\2Z[\3\2S" +
                    "T\4\2\u00d0\u00d0\u00eb\u00eb\7\2\5\5\u0126\u0126\u012a\u012a\u0134\u0134" +
                    "\u013c\u013c\6\2\22\22NN\u009a\u009a\u00f2\u00f2\4\2\u009a\u009a\u0109" +
                    "\u0109\4\2\33\33\u00e6\u00e6\3\2\u00d9\u00da\4\2\t\tLL\5\2ii\u008e\u008e" +
                    "\u00cc\u00cc\5\2\67\67\u00d1\u00d2\u00fd\u00fd\5\2]]\u00dd\u00dd\u00fc" +
                    "\u00fc\4\2\13\13\u00b0\u00b0\5\2\u008f\u008f\u00c4\u00c4\u00cd\u00cd\5" +
                    "\2=>\u009f\u00a0\u00d5\u00d6\4\2..\u0129\u0129\5\2gg\u0086\u0086\u00a9" +
                    "\u00a9\4\2\u0126\u0126\u013c\u013c\4\2aa\u00f8\u00f8\26\2\b\b\13\26\30" +
                    "+-JLOQQUjlqsz|\u009d\u009f\u00a9\u00ab\u00b9\u00bb\u00df\u00e1\u00f3\u00f5" +
                    "\u00f8\u00fb\u0106\u0109\u010a\u010c\u0117\u011e\u0125\u0147\u0147\2\u0c4d" +
                    "\2\u0170\3\2\2\2\4\u017a\3\2\2\2\6\u017f\3\2\2\2\b\u0193\3\2\2\2\n\u0195" +
                    "\3\2\2\2\f\u01a1\3\2\2\2\16\u01c4\3\2\2\2\20\u01c6\3\2\2\2\22\u01d3\3" +
                    "\2\2\2\24\u01de\3\2\2\2\26\u0205\3\2\2\2\30\u022d\3\2\2\2\32\u022f\3\2" +
                    "\2\2\34\u023f\3\2\2\2\36\u0241\3\2\2\2 \u0247\3\2\2\2\"\u024d\3\2\2\2" +
                    "$\u024f\3\2\2\2&\u0251\3\2\2\2(\u0255\3\2\2\2*\u0262\3\2\2\2,\u0274\3" +
                    "\2\2\2.\u0276\3\2\2\2\60\u029b\3\2\2\2\62\u02a5\3\2\2\2\64\u02b9\3\2\2" +
                    "\2\66\u02bb\3\2\2\28\u02c5\3\2\2\2:\u02c8\3\2\2\2<\u02d1\3\2\2\2>\u02dc" +
                    "\3\2\2\2@\u02ea\3\2\2\2B\u030f\3\2\2\2D\u0311\3\2\2\2F\u0314\3\2\2\2H" +
                    "\u0320\3\2\2\2J\u0325\3\2\2\2L\u0329\3\2\2\2N\u0331\3\2\2\2P\u0336\3\2" +
                    "\2\2R\u0340\3\2\2\2T\u034d\3\2\2\2V\u036c\3\2\2\2X\u0371\3\2\2\2Z\u038f" +
                    "\3\2\2\2\\\u0391\3\2\2\2^\u03b3\3\2\2\2`\u03ee\3\2\2\2b\u03f0\3\2\2\2" +
                    "d\u03fd\3\2\2\2f\u0404\3\2\2\2h\u0407\3\2\2\2j\u040c\3\2\2\2l\u041a\3" +
                    "\2\2\2n\u042e\3\2\2\2p\u0451\3\2\2\2r\u0465\3\2\2\2t\u046b\3\2\2\2v\u046d" +
                    "\3\2\2\2x\u0491\3\2\2\2z\u0497\3\2\2\2|\u04b4\3\2\2\2~\u04e3\3\2\2\2\u0080" +
                    "\u04e5\3\2\2\2\u0082\u04fb\3\2\2\2\u0084\u0509\3\2\2\2\u0086\u050b\3\2" +
                    "\2\2\u0088\u051d\3\2\2\2\u008a\u0526\3\2\2\2\u008c\u0536\3\2\2\2\u008e" +
                    "\u0542\3\2\2\2\u0090\u054e\3\2\2\2\u0092\u0565\3\2\2\2\u0094\u056e\3\2" +
                    "\2\2\u0096\u057b\3\2\2\2\u0098\u0588\3\2\2\2\u009a\u0591\3\2\2\2\u009c" +
                    "\u05c0\3\2\2\2\u009e\u05ec\3\2\2\2\u00a0\u05ef\3\2\2\2\u00a2\u05fe\3\2" +
                    "\2\2\u00a4\u0600\3\2\2\2\u00a6\u061d\3\2\2\2\u00a8\u061f\3\2\2\2\u00aa" +
                    "\u062f\3\2\2\2\u00ac\u0636\3\2\2\2\u00ae\u063c\3\2\2\2\u00b0\u0641\3\2" +
                    "\2\2\u00b2\u0644\3\2\2\2\u00b4\u064c\3\2\2\2\u00b6\u0650\3\2\2\2\u00b8" +
                    "\u065e\3\2\2\2\u00ba\u0664\3\2\2\2\u00bc\u0677\3\2\2\2\u00be\u067b\3\2" +
                    "\2\2\u00c0\u067d\3\2\2\2\u00c2\u0694\3\2\2\2\u00c4\u069a\3\2\2\2\u00c6" +
                    "\u069e\3\2\2\2\u00c8\u06a1\3\2\2\2\u00ca\u06a7\3\2\2\2\u00cc\u06af\3\2" +
                    "\2\2\u00ce\u06b2\3\2\2\2\u00d0\u06bb\3\2\2\2\u00d2\u06c9\3\2\2\2\u00d4" +
                    "\u06cf\3\2\2\2\u00d6\u06d2\3\2\2\2\u00d8\u06d5\3\2\2\2\u00da\u06de\3\2" +
                    "\2\2\u00dc\u06e7\3\2\2\2\u00de\u06ed\3\2\2\2\u00e0\u070c\3\2\2\2\u00e2" +
                    "\u0717\3\2\2\2\u00e4\u071b\3\2\2\2\u00e6\u071d\3\2\2\2\u00e8\u0725\3\2" +
                    "\2\2\u00ea\u073d\3\2\2\2\u00ec\u073f\3\2\2\2\u00ee\u0748\3\2\2\2\u00f0" +
                    "\u074a\3\2\2\2\u00f2\u0758\3\2\2\2\u00f4\u0766\3\2\2\2\u00f6\u0768\3\2" +
                    "\2\2\u00f8\u0781\3\2\2\2\u00fa\u078e\3\2\2\2\u00fc\u0790\3\2\2\2\u00fe" +
                    "\u079d\3\2\2\2\u0100\u07a8\3\2\2\2\u0102\u07ac\3\2\2\2\u0104\u07b0\3\2" +
                    "\2\2\u0106\u07b9\3\2\2\2\u0108\u07c4\3\2\2\2\u010a\u07c6\3\2\2\2\u010c" +
                    "\u07ca\3\2\2\2\u010e\u07d7\3\2\2\2\u0110\u07e2\3\2\2\2\u0112\u07e4\3\2" +
                    "\2\2\u0114\u07ff\3\2\2\2\u0116\u0801\3\2\2\2\u0118\u0812\3\2\2\2\u011a" +
                    "\u0814\3\2\2\2\u011c\u0817\3\2\2\2\u011e\u0821\3\2\2\2\u0120\u0824\3\2" +
                    "\2\2\u0122\u0827\3\2\2\2\u0124\u0838\3\2\2\2\u0126\u0847\3\2\2\2\u0128" +
                    "\u0852\3\2\2\2\u012a\u0860\3\2\2\2\u012c\u0879\3\2\2\2\u012e\u087b\3\2" +
                    "\2\2\u0130\u088e\3\2\2\2\u0132\u08a0\3\2\2\2\u0134\u08a4\3\2\2\2\u0136" +
                    "\u08b2\3\2\2\2\u0138\u08c5\3\2\2\2\u013a\u08e2\3\2\2\2\u013c\u08e4\3\2" +
                    "\2\2\u013e\u08e8\3\2\2\2\u0140\u08ea\3\2\2\2\u0142\u08fd\3\2\2\2\u0144" +
                    "\u0901\3\2\2\2\u0146\u0903\3\2\2\2\u0148\u0914\3\2\2\2\u014a\u0924\3\2" +
                    "\2\2\u014c\u09c0\3\2\2\2\u014e\u09c2\3\2\2\2\u0150\u09c4\3\2\2\2\u0152" +
                    "\u09ce\3\2\2\2\u0154\u0aa0\3\2\2\2\u0156\u0aa2\3\2\2\2\u0158\u0aa9\3\2" +
                    "\2\2\u015a\u0ab1\3\2\2\2\u015c\u0abb\3\2\2\2\u015e\u0abe\3\2\2\2\u0160" +
                    "\u0ac3\3\2\2\2\u0162\u0ad1\3\2\2\2\u0164\u0ad4\3\2\2\2\u0166\u0ad9\3\2" +
                    "\2\2\u0168\u0add\3\2\2\2\u016a\u0adf\3\2\2\2\u016c\u0ae1\3\2\2\2\u016e" +
                    "\u0ae3\3\2\2\2\u0170\u0171\5\4\3\2\u0171\u0172\7\2\2\3\u0172\3\3\2\2\2" +
                    "\u0173\u0176\5\6\4\2\u0174\u0176\5\16\b\2\u0175\u0173\3\2\2\2\u0175\u0174" +
                    "\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0179\7m\2\2\u0178\u0177\3\2\2\2\u0178" +
                    "\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0175\3\2\2\2\u017b\u017c\3\2" +
                    "\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\5\3\2\2\2\u017e\u0180" +
                    "\5<\37\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181" +
                    "\u0182\7\22\2\2\u0182\u0184\5\4\3\2\u0183\u0185\5\36\20\2\u0184\u0183" +
                    "\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\5\n\6\2\u0187" +
                    "\7\3\2\2\2\u0188\u0189\7\22\2\2\u0189\u018b\5\4\3\2\u018a\u018c\5\36\20" +
                    "\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e" +
                    "\5\n\6\2\u018e\u0194\3\2\2\2\u018f\u0191\5\16\b\2\u0190\u0192\7\u013b" +
                    "\2\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193" +
                    "\u0188\3\2\2\2\u0193\u018f\3\2\2\2\u0194\t\3\2\2\2\u0195\u0196\6\6\2\2" +
                    "\u0196\u0197\7V\2\2\u0197\13\3\2\2\2\u0198\u01a2\5\6\4\2\u0199\u019b\5" +
                    "\16\b\2\u019a\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c" +
                    "\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u01a0\7m\2\2\u019f\u019e\3\2" +
                    "\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u0198\3\2\2\2\u01a1" +
                    "\u019a\3\2\2\2\u01a2\r\3\2\2\2\u01a3\u01c5\5\20\t\2\u01a4\u01c5\5\u00c6" +
                    "d\2\u01a5\u01c5\5\u00d0i\2\u01a6\u01c5\5\u00d6l\2\u01a7\u01c5\5(\25\2" +
                    "\u01a8\u01c5\5\62\32\2\u01a9\u01c5\5\64\33\2\u01aa\u01c5\5\66\34\2\u01ab" +
                    "\u01c5\58\35\2\u01ac\u01c5\5\u00b6\\\2\u01ad\u01c5\5\u0086D\2\u01ae\u01c5" +
                    "\5\u008aF\2\u01af\u01c5\5\u00ba^\2\u01b0\u01c5\5T+\2\u01b1\u01c5\5\u008e" +
                    "H\2\u01b2\u01c5\5\u0094K\2\u01b3\u01c5\5\u009aN\2\u01b4\u01c5\5R*\2\u01b5" +
                    "\u01c5\5H%\2\u01b6\u01c5\5:\36\2\u01b7\u01c5\5\u00a4S\2\u01b8\u01c5\5" +
                    "\u00b2Z\2\u01b9\u01c5\5\u00e8u\2\u01ba\u01c5\5\u00a6T\2\u01bb\u01c5\5" +
                    "\u00b4[\2\u01bc\u01c5\5\u00c2b\2\u01bd\u01c5\5\u00c4c\2\u01be\u01c5\5" +
                    "\u00eex\2\u01bf\u01c5\5\u00e6t\2\u01c0\u01c5\5\u00eav\2\u01c1\u01c5\5" +
                    "$\23\2\u01c2\u01c5\5&\24\2\u01c3\u01c5\5\"\22\2\u01c4\u01a3\3\2\2\2\u01c4" +
                    "\u01a4\3\2\2\2\u01c4\u01a5\3\2\2\2\u01c4\u01a6\3\2\2\2\u01c4\u01a7\3\2" +
                    "\2\2\u01c4\u01a8\3\2\2\2\u01c4\u01a9\3\2\2\2\u01c4\u01aa\3\2\2\2\u01c4" +
                    "\u01ab\3\2\2\2\u01c4\u01ac\3\2\2\2\u01c4\u01ad\3\2\2\2\u01c4\u01ae\3\2" +
                    "\2\2\u01c4\u01af\3\2\2\2\u01c4\u01b0\3\2\2\2\u01c4\u01b1\3\2\2\2\u01c4" +
                    "\u01b2\3\2\2\2\u01c4\u01b3\3\2\2\2\u01c4\u01b4\3\2\2\2\u01c4\u01b5\3\2" +
                    "\2\2\u01c4\u01b6\3\2\2\2\u01c4\u01b7\3\2\2\2\u01c4\u01b8\3\2\2\2\u01c4" +
                    "\u01b9\3\2\2\2\u01c4\u01ba\3\2\2\2\u01c4\u01bb\3\2\2\2\u01c4\u01bc\3\2" +
                    "\2\2\u01c4\u01bd\3\2\2\2\u01c4\u01be\3\2\2\2\u01c4\u01bf\3\2\2\2\u01c4" +
                    "\u01c0\3\2\2\2\u01c4\u01c1\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2" +
                    "\2\2\u01c5\17\3\2\2\2\u01c6\u01c7\5\24\13\2\u01c7\21\3\2\2\2\u01c8\u01ca" +
                    "\7\u00a8\2\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2" +
                    "\2\u01cb\u01cc\5\u0128\u0095\2\u01cc\u01cd\7\u0139\2\2\u01cd\u01d4\3\2" +
                    "\2\2\u01ce\u01d0\7\u00a8\2\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0" +
                    "\u01d1\3\2\2\2\u01d1\u01d2\7\u0136\2\2\u01d2\u01d4\5\u0128\u0095\2\u01d3" +
                    "\u01c9\3\2\2\2\u01d3\u01cf\3\2\2\2\u01d4\23\3\2\2\2\u01d5\u01d6\5\26\f" +
                    "\2\u01d6\u01d7\5\34\17\2\u01d7\u01df\3\2\2\2\u01d8\u01d9\5\26\f\2\u01d9" +
                    "\u01da\5\u00ceh\2\u01da\u01df\3\2\2\2\u01db\u01dc\5\u00c8e\2\u01dc\u01dd" +
                    "\5\34\17\2\u01dd\u01df\3\2\2\2\u01de\u01d5\3\2\2\2\u01de\u01d8\3\2\2\2" +
                    "\u01de\u01db\3\2\2\2\u01df\25\3\2\2\2\u01e0\u01e1\5\u0160\u00b1\2\u01e1" +
                    "\u01e4\7\u0136\2\2\u01e2\u01e5\5\u00caf\2\u01e3\u01e5\5\30\r\2\u01e4\u01e2" +
                    "\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\7\u0139\2" +
                    "\2\u01e7\u0206\3\2\2\2\u01e8\u01e9\5~@\2\u01e9\u01ec\7\u0136\2\2\u01ea" +
                    "\u01ed\5\u00caf\2\u01eb\u01ed\5\30\r\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb" +
                    "\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\7\u0139\2\2\u01ef\u0206\3\2\2" +
                    "\2\u01f0\u01f1\5~@\2\u01f1\u01f2\5\u0160\u00b1\2\u01f2\u01f3\7\u0136\2" +
                    "\2\u01f3\u01f4\5\30\r\2\u01f4\u01f5\7\u0139\2\2\u01f5\u0206\3\2\2\2\u01f6" +
                    "\u01f7\5~@\2\u01f7\u01fa\5\u0160\u00b1\2\u01f8\u01fb\5\u00caf\2\u01f9" +
                    "\u01fb\5\30\r\2\u01fa\u01f8\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fc\3" +
                    "\2\2\2\u01fc\u01fd\7\u0139\2\2\u01fd\u0206\3\2\2\2\u01fe\u01ff\5~@\2\u01ff" +
                    "\u0200\5\u0160\u00b1\2\u0200\u0203\7\u0136\2\2\u0201\u0204\5\u00caf\2" +
                    "\u0202\u0204\5\30\r\2\u0203\u0201\3\2\2\2\u0203\u0202\3\2\2\2\u0204\u0206" +
                    "\3\2\2\2\u0205\u01e0\3\2\2\2\u0205\u01e8\3\2\2\2\u0205\u01f0\3\2\2\2\u0205" +
                    "\u01f6\3\2\2\2\u0205\u01fe\3\2\2\2\u0206\27\3\2\2\2\u0207\u020a\5\32\16" +
                    "\2\u0208\u020a\5\u00ccg\2\u0209\u0207\3\2\2\2\u0209\u0208\3\2\2\2\u020a" +
                    "\u020b\3\2\2\2\u020b\u020c\7\u0128\2\2\u020c\u022e\3\2\2\2\u020d\u0215" +
                    "\5\32\16\2\u020e\u0211\7\u0128\2\2\u020f\u0212\5\u00ccg\2\u0210\u0212" +
                    "\5\32\16\2\u0211\u020f\3\2\2\2\u0211\u0210\3\2\2\2\u0212\u0214\3\2\2\2" +
                    "\u0213\u020e\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216" +
                    "\3\2\2\2\u0216\u022e\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u021d\5\u00ccg" +
                    "\2\u0219\u021a\7\u0128\2\2\u021a\u021c\5\u00ccg\2\u021b\u0219\3\2\2\2" +
                    "\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0222" +
                    "\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0221\7\u0128\2\2\u0221\u0223\5\32" +
                    "\16\2\u0222\u0220\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0222\3\2\2\2\u0224" +
                    "\u0225\3\2\2\2\u0225\u022a\3\2\2\2\u0226\u0227\7\u0128\2\2\u0227\u0229" +
                    "\5\u00ccg\2\u0228\u0226\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2" +
                    "\2\u022a\u022b\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u0209" +
                    "\3\2\2\2\u022d\u020d\3\2\2\2\u022d\u0218\3\2\2\2\u022e\31\3\2\2\2\u022f" +
                    "\u0230\5\u0160\u00b1\2\u0230\33\3\2\2\2\u0231\u0235\7\u0135\2\2\u0232" +
                    "\u0234\5\u00e4s\2\u0233\u0232\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233" +
                    "\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0240\3\2\2\2\u0237\u0235\3\2\2\2\u0238" +
                    "\u023a\5\u00e4s\2\u0239\u0238\3\2\2\2\u023a\u023d\3\2\2\2\u023b\u0239" +
                    "\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e\3\2\2\2\u023d\u023b\3\2\2\2\u023e" +
                    "\u0240\7\u0138\2\2\u023f\u0231\3\2\2\2\u023f\u023b\3\2\2\2\u0240\35\3" +
                    "\2\2\2\u0241\u0243\7\\\2\2\u0242\u0244\5 \21\2\u0243\u0242\3\2\2\2\u0244" +
                    "\u0245\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\37\3\2\2" +
                    "\2\u0247\u0248\7\u0107\2\2\u0248\u0249\7\u013d\2\2\u0249\u024a\7\u00f2" +
                    "\2\2\u024a\u024b\5\4\3\2\u024b\u024c\n\2\2\2\u024c!\3\2\2\2\u024d\u024e" +
                    "\t\3\2\2\u024e#\3\2\2\2\u024f\u0250\7\u00aa\2\2\u0250%\3\2\2\2\u0251\u0252" +
                    "\6\24\3\2\u0252\u0253\5\u0138\u009d\2\u0253\'\3\2\2\2\u0254\u0256\7\u00db" +
                    "\2\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\3\2\2\2\u0257" +
                    "\u025c\5*\26\2\u0258\u0259\7\u0128\2\2\u0259\u025b\5*\26\2\u025a\u0258" +
                    "\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d" +
                    ")\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0263\5,\27\2\u0260\u0263\5.\30\2" +
                    "\u0261\u0263\5\60\31\2\u0262\u025f\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0261" +
                    "\3\2\2\2\u0263+\3\2\2\2\u0264\u0266\5\u0160\u00b1\2\u0265\u0267\7\u0127" +
                    "\2\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\3\2\2\2\u0268" +
                    "\u0269\7\u012c\2\2\u0269\u026a\5\u0138\u009d\2\u026a\u0275\3\2\2\2\u026b" +
                    "\u026c\7\u0136\2\2\u026c\u026d\5\u0160\u00b1\2\u026d\u026f\7\u0139\2\2" +
                    "\u026e\u0270\7\u0127\2\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270" +
                    "\u0271\3\2\2\2\u0271\u0272\7\u012c\2\2\u0272\u0273\5\u0138\u009d\2\u0273" +
                    "\u0275\3\2\2\2\u0274\u0264\3\2\2\2\u0274\u026b\3\2\2\2\u0275-\3\2\2\2" +
                    "\u0276\u0277\7\u0136\2\2\u0277\u027c\5\u0160\u00b1\2\u0278\u0279\7\u0128" +
                    "\2\2\u0279\u027b\5\u0160\u00b1\2\u027a\u0278\3\2\2\2\u027b\u027e\3\2\2" +
                    "\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u027c" +
                    "\3\2\2\2\u027f\u0281\7\u0139\2\2\u0280\u0282\7\u0127\2\2\u0281\u0280\3" +
                    "\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\7\u012c\2\2" +
                    "\u0284\u0285\7\u0136\2\2\u0285\u028a\5\u0138\u009d\2\u0286\u0287\7\u0128" +
                    "\2\2\u0287\u0289\5\u0138\u009d\2\u0288\u0286\3\2\2\2\u0289\u028c\3\2\2" +
                    "\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\3\2\2\2\u028c\u028a" +
                    "\3\2\2\2\u028d\u028e\7\u0139\2\2\u028e/\3\2\2\2\u028f\u029c\5\u0160\u00b1" +
                    "\2\u0290\u0291\7\u0136\2\2\u0291\u0296\5\u0160\u00b1\2\u0292\u0293\7\u0128" +
                    "\2\2\u0293\u0295\5\u0160\u00b1\2\u0294\u0292\3\2\2\2\u0295\u0298\3\2\2" +
                    "\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0299\3\2\2\2\u0298\u0296" +
                    "\3\2\2\2\u0299\u029a\7\u0139\2\2\u029a\u029c\3\2\2\2\u029b\u028f\3\2\2" +
                    "\2\u029b\u0290\3\2\2\2\u029c\u029e\3\2\2\2\u029d\u029f\7\u0127\2\2\u029e" +
                    "\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\7\u012c" +
                    "\2\2\u02a1\u02a2\7\u0136\2\2\u02a2\u02a3\5\u00eex\2\u02a3\u02a4\7\u0139" +
                    "\2\2\u02a4\61\3\2\2\2\u02a5\u02a8\7\16\2\2\u02a6\u02a7\7\u00c7\2\2\u02a7" +
                    "\u02a9\7\u00db\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa" +
                    "\3\2\2\2\u02aa\u02ab\t\4\2\2\u02ab\u02ac\7\u0136\2\2\u02ac\u02b1\5\u0160" +
                    "\u00b1\2\u02ad\u02ae\7\u0128\2\2\u02ae\u02b0\5\u0160\u00b1\2\u02af\u02ad" +
                    "\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2" +
                    "\u02b4\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b5\7\u0139\2\2\u02b5\u02b6" +
                    "\7\u010a\2\2\u02b6\u02b7\7\u00bf\2\2\u02b7\u02b8\5\u0160\u00b1\2\u02b8" +
                    "\63\3\2\2\2\u02b9\u02ba\7\32\2\2\u02ba\65\3\2\2\2\u02bb\u02bc\7\35\2\2" +
                    "\u02bc\u02c3\5\u0160\u00b1\2\u02bd\u02bf\7\u0136\2\2\u02be\u02c0\5\u0158" +
                    "\u00ad\2\u02bf\u02be\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1" +
                    "\u02c4\7\u0139\2\2\u02c2\u02c4\5\u0158\u00ad\2\u02c3\u02bd\3\2\2\2\u02c3" +
                    "\u02c2\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\67\3\2\2\2\u02c5\u02c6\7%\2\2" +
                    "\u02c6\u02c7\7\u013d\2\2\u02c79\3\2\2\2\u02c8\u02c9\7A\2\2\u02c9\u02ce" +
                    "\5@!\2\u02ca\u02cb\7\u0128\2\2\u02cb\u02cd\5@!\2\u02cc\u02ca\3\2\2\2\u02cd" +
                    "\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf;\3\2\2\2" +
                    "\u02d0\u02ce\3\2\2\2\u02d1\u02d2\7A\2\2\u02d2\u02d3\5@!\2\u02d3\u02d9" +
                    "\7\u013b\2\2\u02d4\u02d5\5@!\2\u02d5\u02d6\7\u013b\2\2\u02d6\u02d8\3\2" +
                    "\2\2\u02d7\u02d4\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9" +
                    "\u02da\3\2\2\2\u02da=\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\u02dd\5@!\2\u02dd" +
                    "\u02e3\7\u013b\2\2\u02de\u02df\5@!\2\u02df\u02e0\7\u013b\2\2\u02e0\u02e2" +
                    "\3\2\2\2\u02e1\u02de\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3" +
                    "\u02e4\3\2\2\2\u02e4?\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02eb\5D#\2\u02e7" +
                    "\u02eb\5F$\2\u02e8\u02eb\5B\"\2\u02e9\u02eb\5P)\2\u02ea\u02e6\3\2\2\2" +
                    "\u02ea\u02e7\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02e9\3\2\2\2\u02ebA\3" +
                    "\2\2\2\u02ec\u02f1\5\u0160\u00b1\2\u02ed\u02ee\7\u0128\2\2\u02ee\u02f0" +
                    "\5\u0160\u00b1\2\u02ef\u02ed\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3" +
                    "\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4" +
                    "\u02f6\7\f\2\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2" +
                    "\2\2\u02f7\u02f9\5~@\2\u02f8\u02fa\5\u0080A\2\u02f9\u02f8\3\2\2\2\u02f9" +
                    "\u02fa\3\2\2\2\u02fa\u02fe\3\2\2\2\u02fb\u02fd\5\u0082B\2\u02fc\u02fb" +
                    "\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff" +
                    "\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0301\u0303\5\u0084C\2\u0302\u0301" +
                    "\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0310\3\2\2\2\u0304\u0305\5\u0160\u00b1" +
                    "\2\u0305\u0307\7+\2\2\u0306\u0308\7\f\2\2\u0307\u0306\3\2\2\2\u0307\u0308" +
                    "\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030b\5~@\2\u030a\u030c\5\u0080A\2" +
                    "\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e" +
                    "\5\u0084C\2\u030e\u0310\3\2\2\2\u030f\u02ec\3\2\2\2\u030f\u0304\3\2\2" +
                    "\2\u0310C\3\2\2\2\u0311\u0312\5\u0160\u00b1\2\u0312\u0313\7/\2\2\u0313" +
                    "E\3\2\2\2\u0314\u0315\t\5\2\2\u0315\u0316\7o\2\2\u0316\u031c\7d\2\2\u0317" +
                    "\u031d\7\u00e4\2\2\u0318\u031d\7\u00e5\2\2\u0319\u031a\7\u00a8\2\2\u031a" +
                    "\u031d\7g\2\2\u031b\u031d\5\u0160\u00b1\2\u031c\u0317\3\2\2\2\u031c\u0318" +
                    "\3\2\2\2\u031c\u0319\3\2\2\2\u031c\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e" +
                    "\u031f\5\b\5\2\u031fG\3\2\2\2\u0320\u0321\7\64\2\2\u0321\u0322\7\u00f9" +
                    "\2\2\u0322\u0323\5\u0118\u008d\2\u0323\u0324\5J&\2\u0324I\3\2\2\2\u0325" +
                    "\u0326\7\u0136\2\2\u0326\u0327\5L\'\2\u0327\u0328\7\u0139\2\2\u0328K\3" +
                    "\2\2\2\u0329\u032e\5N(\2\u032a\u032b\7\u0128\2\2\u032b\u032d\5N(\2\u032c" +
                    "\u032a\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032c\3\2\2\2\u032e\u032f\3\2" +
                    "\2\2\u032fM\3\2\2\2\u0330\u032e\3\2\2\2\u0331\u0332\5\u0162\u00b2\2\u0332" +
                    "\u0333\7\u0127\2\2\u0333\u0334\5\u0162\u00b2\2\u0334O\3\2\2\2\u0335\u0337" +
                    "\7l\2\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338\3\2\2\2\u0338" +
                    "\u0339\7\u00ef\2\2\u0339\u033a\7\u00ed\2\2\u033a\u033c\5\u0160\u00b1\2" +
                    "\u033b\u033d\5d\63\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e" +
                    "\3\2\2\2\u033e\u033f\5V,\2\u033fQ\3\2\2\2\u0340\u0341\7\64\2\2\u0341\u0345" +
                    "\7\u00ed\2\2\u0342\u0343\7t\2\2\u0343\u0344\7\u00a8\2\2\u0344\u0346\7" +
                    "^\2\2\u0345\u0342\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347\3\2\2\2\u0347" +
                    "\u0349\5\u0118\u008d\2\u0348\u034a\5d\63\2\u0349\u0348\3\2\2\2\u0349\u034a" +
                    "\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034c\5V,\2\u034cS\3\2\2\2\u034d\u0354" +
                    "\7\64\2\2\u034e\u034f\7\u0092\2\2\u034f\u0355\7\u00ef\2\2\u0350\u0352" +
                    "\t\6\2\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353" +
                    "\u0355\7\u0106\2\2\u0354\u034e\3\2\2\2\u0354\u0351\3\2\2\2\u0355\u0356" +
                    "\3\2\2\2\u0356\u0357\7\u00ed\2\2\u0357\u0359\5\u0160\u00b1\2\u0358\u035a" +
                    "\5d\63\2\u0359\u0358\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b" +
                    "\u035c\5V,\2\u035cU\3\2\2\2\u035d\u035f\7\f\2\2\u035e\u035d\3\2\2\2\u035e" +
                    "\u035f\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\7\u0136\2\2\u0361\u0362" +
                    "\5\u00eex\2\u0362\u0363\7\u0139\2\2\u0363\u036d\3\2\2\2\u0364\u0366\7" +
                    "\f\2\2\u0365\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0367\3\2\2\2\u0367" +
                    "\u036d\5\u00eex\2\u0368\u0369\7\u0136\2\2\u0369\u036a\5X-\2\u036a\u036b" +
                    "\7\u0139\2\2\u036b\u036d\3\2\2\2\u036c\u035e\3\2\2\2\u036c\u0365\3\2\2" +
                    "\2\u036c\u0368\3\2\2\2\u036d\u036f\3\2\2\2\u036e\u0370\5j\66\2\u036f\u036e" +
                    "\3\2\2\2\u036f\u0370\3\2\2\2\u0370W\3\2\2\2\u0371\u0376\5Z.\2\u0372\u0373" +
                    "\7\u0128\2\2\u0373\u0375\5Z.\2\u0374\u0372\3\2\2\2\u0375\u0378\3\2\2\2" +
                    "\u0376\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377Y\3\2\2\2\u0378\u0376\3" +
                    "\2\2\2\u0379\u037a\5\\/\2\u037a\u037c\5~@\2\u037b\u037d\5\u0080A\2\u037c" +
                    "\u037b\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u0381\3\2\2\2\u037e\u0380\5\u0082" +
                    "B\2\u037f\u037e\3\2\2\2\u0380\u0383\3\2\2\2\u0381\u037f\3\2\2\2\u0381" +
                    "\u0382\3\2\2\2\u0382\u0387\3\2\2\2\u0383\u0381\3\2\2\2\u0384\u0386\5^" +
                    "\60\2\u0385\u0384\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0387" +
                    "\u0388\3\2\2\2\u0388\u0390\3\2\2\2\u0389\u0387\3\2\2\2\u038a\u038b\7\60" +
                    "\2\2\u038b\u038d\5\u0160\u00b1\2\u038c\u038a\3\2\2\2\u038c\u038d\3\2\2" +
                    "\2\u038d\u038e\3\2\2\2\u038e\u0390\5`\61\2\u038f\u0379\3\2\2\2\u038f\u038c" +
                    "\3\2\2\2\u0390[\3\2\2\2\u0391\u0392\5\u0160\u00b1\2\u0392]\3\2\2\2\u0393" +
                    "\u03b4\5\u0084C\2\u0394\u0396\7\u00a8\2\2\u0395\u0394\3\2\2\2\u0395\u0396" +
                    "\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u03b4\7\u00aa\2\2\u0398\u0399\7\u00bd" +
                    "\2\2\u0399\u03b4\7\u008a\2\2\u039a\u03b4\7\u00fb\2\2\u039b\u039c\7\u00c3" +
                    "\2\2\u039c\u039d\5\u0118\u008d\2\u039d\u039e\7\u0136\2\2\u039e\u039f\5" +
                    "\u0160\u00b1\2\u039f\u03a3\7\u0139\2\2\u03a0\u03a2\5b\62\2\u03a1\u03a0" +
                    "\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4" +
                    "\u03b4\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a6\u03a7\7s\2\2\u03a7\u03a8\7\u0136" +
                    "\2\2\u03a8\u03ad\7\u0140\2\2\u03a9\u03aa\7\u0128\2\2\u03aa\u03ac\7\u0140" +
                    "\2\2\u03ab\u03a9\3\2\2\2\u03ac\u03af\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad" +
                    "\u03ae\3\2\2\2\u03ae\u03b0\3\2\2\2\u03af\u03ad\3\2\2\2\u03b0\u03b4\7\u0139" +
                    "\2\2\u03b1\u03b4\7\20\2\2\u03b2\u03b4\7U\2\2\u03b3\u0393\3\2\2\2\u03b3" +
                    "\u0395\3\2\2\2\u03b3\u0398\3\2\2\2\u03b3\u039a\3\2\2\2\u03b3\u039b\3\2" +
                    "\2\2\u03b3\u03a6\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b3\u03b2\3\2\2\2\u03b4" +
                    "_\3\2\2\2\u03b5\u03b6\7\u00bd\2\2\u03b6\u03b8\7\u008a\2\2\u03b7\u03b9" +
                    "\7&\2\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba" +
                    "\u03bb\7\u0136\2\2\u03bb\u03bd\5\u0160\u00b1\2\u03bc\u03be\t\7\2\2\u03bd" +
                    "\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c6\3\2\2\2\u03bf\u03c0\7\u0128" +
                    "\2\2\u03c0\u03c2\5\u0160\u00b1\2\u03c1\u03c3\t\7\2\2\u03c2\u03c1\3\2\2" +
                    "\2\u03c2\u03c3\3\2\2\2\u03c3\u03c5\3\2\2\2\u03c4\u03bf\3\2\2\2\u03c5\u03c8" +
                    "\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c9\3\2\2\2\u03c8" +
                    "\u03c6\3\2\2\2\u03c9\u03cb\7\u0139\2\2\u03ca\u03cc\7U\2\2\u03cb\u03ca" +
                    "\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03ce\3\2\2\2\u03cd\u03cf\5\u00be`" +
                    "\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03ef\3\2\2\2\u03d0\u03d1" +
                    "\7e\2\2\u03d1\u03d2\7\u008a\2\2\u03d2\u03d3\7\u0136\2\2\u03d3\u03d8\5" +
                    "\u0160\u00b1\2\u03d4\u03d5\7\u0128\2\2\u03d5\u03d7\5\u0160\u00b1\2\u03d6" +
                    "\u03d4\3\2\2\2\u03d7\u03da\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d8\u03d9\3\2" +
                    "\2\2\u03d9\u03db\3\2\2\2\u03da\u03d8\3\2\2\2\u03db\u03dc\7\u0139\2\2\u03dc" +
                    "\u03dd\7\u00c3\2\2\u03dd\u03de\5\u0118\u008d\2\u03de\u03df\7\u0136\2\2" +
                    "\u03df\u03e4\5\u0160\u00b1\2\u03e0\u03e1\7\u0128\2\2\u03e1\u03e3\5\u0160" +
                    "\u00b1\2\u03e2\u03e0\3\2\2\2\u03e3\u03e6\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4" +
                    "\u03e5\3\2\2\2\u03e5\u03e7\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e7\u03eb\7\u0139" +
                    "\2\2\u03e8\u03ea\5b\62\2\u03e9\u03e8\3\2\2\2\u03ea\u03ed\3\2\2\2\u03eb" +
                    "\u03e9\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ef\3\2\2\2\u03ed\u03eb\3\2" +
                    "\2\2\u03ee\u03b5\3\2\2\2\u03ee\u03d0\3\2\2\2\u03efa\3\2\2\2\u03f0\u03f1" +
                    "\7\u00ad\2\2\u03f1\u03fa\t\b\2\2\u03f2\u03f3\7\u00a5\2\2\u03f3\u03fb\7" +
                    "\b\2\2\u03f4\u03fb\7\u00c6\2\2\u03f5\u03f6\7\u00db\2\2\u03f6\u03fb\7\u00aa" +
                    "\2\2\u03f7\u03f8\7\u00db\2\2\u03f8\u03fb\7B\2\2\u03f9\u03fb\7\36\2\2\u03fa" +
                    "\u03f2\3\2\2\2\u03fa\u03f4\3\2\2\2\u03fa\u03f5\3\2\2\2\u03fa\u03f7\3\2" +
                    "\2\2\u03fa\u03f9\3\2\2\2\u03fbc\3\2\2\2\u03fc\u03fe\5f\64\2\u03fd\u03fc" +
                    "\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u03fd\3\2\2\2\u03ff\u0400\3\2\2\2\u0400" +
                    "e\3\2\2\2\u0401\u0402\7\u0128\2\2\u0402\u0405\5h\65\2\u0403\u0405\5t;" +
                    "\2\u0404\u0401\3\2\2\2\u0404\u0403\3\2\2\2\u0405g\3\2\2\2\u0406\u0408" +
                    "\7\u00a5\2\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2\2" +
                    "\2\u0409\u040a\t\t\2\2\u040ai\3\2\2\2\u040b\u040d\5l\67\2\u040c\u040b" +
                    "\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040c\3\2\2\2\u040e\u040f\3\2\2\2\u040f" +
                    "k\3\2\2\2\u0410\u0411\7\u00ad\2\2\u0411\u0412\7,\2\2\u0412\u0413\t\n\2" +
                    "\2\u0413\u041b\7\u00cf\2\2\u0414\u041b\5n8\2\u0415\u041b\5p9\2\u0416\u041b" +
                    "\5r:\2\u0417\u041b\5t;\2\u0418\u041b\5z>\2\u0419\u041b\5|?\2\u041a\u0410" +
                    "\3\2\2\2\u041a\u0414\3\2\2\2\u041a\u0415\3\2\2\2\u041a\u0416\3\2\2\2\u041a" +
                    "\u0417\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u0419\3\2\2\2\u041bm\3\2\2\2" +
                    "\u041c\u041d\7\u00d8\2\2\u041d\u041e\7\65\2\2\u041e\u042f\t\13\2\2\u041f" +
                    "\u0420\t\f\2\2\u0420\u042f\7\u0140\2\2\u0421\u042f\7\u00a6\2\2\u0422\u042f" +
                    "\t\r\2\2\u0423\u0424\7\u00e7\2\2\u0424\u0427\7\u0136\2\2\u0425\u0428\5" +
                    "\u0160\u00b1\2\u0426\u0428\7\u0140\2\2\u0427\u0425\3\2\2\2\u0427\u0426" +
                    "\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a" +
                    "\u042b\3\2\2\2\u042b\u042f\7\u0139\2\2\u042c\u042d\7\u00ee\2\2\u042d\u042f" +
                    "\5\u0160\u00b1\2\u042e\u041c\3\2\2\2\u042e\u041f\3\2\2\2\u042e\u0421\3" +
                    "\2\2\2\u042e\u0422\3\2\2\2\u042e\u0423\3\2\2\2\u042e\u042c\3\2\2\2\u042f" +
                    "o\3\2\2\2\u0430\u0432\7w\2\2\u0431\u0430\3\2\2\2\u0431\u0432\3\2\2\2\u0432" +
                    "\u0433\3\2\2\2\u0433\u0434\7v\2\2\u0434\u0452\5\u0160\u00b1\2\u0435\u0436" +
                    "\7\u010a\2\2\u0436\u0452\7\u00c5\2\2\u0437\u0438\7M\2\2\u0438\u0439\7" +
                    "\33\2\2\u0439\u043a\7p\2\2\u043a\u043b\7\u0136\2\2\u043b\u0440\5\u0160" +
                    "\u00b1\2\u043c\u043d\7\u0128\2\2\u043d\u043f\5\u0160\u00b1\2\u043e\u043c" +
                    "\3\2\2\2\u043f\u0442\3\2\2\2\u0440\u043e\3\2\2\2\u0440\u0441\3\2\2\2\u0441" +
                    "\u0443\3\2\2\2\u0442\u0440\3\2\2\2\u0443\u0444\7\u0139\2\2\u0444\u0452" +
                    "\3\2\2\2\u0445\u0447\7\u00a8\2\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2" +
                    "\2\u0447\u0448\3\2\2\2\u0448\u0452\7\u0098\2\2\u0449\u044a\7-\2\2\u044a" +
                    "\u0452\t\16\2\2\u044b\u044c\7F\2\2\u044c\u0452\7\u00ae\2\2\u044d\u044e" +
                    "\7\u010a\2\2\u044e\u044f\7\u00c6\2\2\u044f\u0450\7\u00ad\2\2\u0450\u0452" +
                    "\7P\2\2\u0451\u0431\3\2\2\2\u0451\u0435\3\2\2\2\u0451\u0437\3\2\2\2\u0451" +
                    "\u0446\3\2\2\2\u0451\u0449\3\2\2\2\u0451\u044b\3\2\2\2\u0451\u044d\3\2" +
                    "\2\2\u0452q\3\2\2\2\u0453\u0455\7\u00fb\2\2\u0454\u0453\3\2\2\2\u0454" +
                    "\u0455\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0457\7\u00bd\2\2\u0457\u0458" +
                    "\7w\2\2\u0458\u0459\7\u0136\2\2\u0459\u045e\5\u0160\u00b1\2\u045a\u045b" +
                    "\7\u0128\2\2\u045b\u045d\5\u0160\u00b1\2\u045c\u045a\3\2\2\2\u045d\u0460" +
                    "\3\2\2\2\u045e\u045c\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0461\3\2\2\2\u0460" +
                    "\u045e\3\2\2\2\u0461\u0462\7\u0139\2\2\u0462\u0466\3\2\2\2\u0463\u0464" +
                    "\7\u010a\2\2\u0464\u0466\7:\2\2\u0465\u0454\3\2\2\2\u0465\u0463\3\2\2" +
                    "\2\u0466s\3\2\2\2\u0467\u046c\5v<\2\u0468\u0469\7\u00e8\2\2\u0469\u046a" +
                    "\7\f\2\2\u046a\u046c\5\u0160\u00b1\2\u046b\u0467\3\2\2\2\u046b\u0468\3" +
                    "\2\2\2\u046cu\3\2\2\2\u046d\u046e\7\u00ce\2\2\u046e\u046f\7f\2\2\u046f" +
                    "\u0473\7H\2\2\u0470\u0472\5x=\2\u0471\u0470\3\2\2\2\u0472\u0475\3\2\2" +
                    "\2\u0473\u0471\3\2\2\2\u0473\u0474\3\2\2\2\u0474w\3\2\2\2\u0475\u0473" +
                    "\3\2\2\2\u0476\u0477\7b\2\2\u0477\u0478\7\u00f0\2\2\u0478\u0479\7\33\2" +
                    "\2\u0479\u047d\5\u0138\u009d\2\u047a\u047b\7X\2\2\u047b\u047c\7\33\2\2" +
                    "\u047c\u047e\5\u0138\u009d\2\u047d\u047a\3\2\2\2\u047d\u047e\3\2\2\2\u047e" +
                    "\u0492\3\2\2\2\u047f\u0480\7)\2\2\u0480\u0481\7\u0087\2\2\u0481\u0482" +
                    "\7\u00f0\2\2\u0482\u0483\7\33\2\2\u0483\u0492\5\u0138\u009d\2\u0484\u0485" +
                    "\7\u009b\2\2\u0485\u0486\7\u008b\2\2\u0486\u0487\7\u00f0\2\2\u0487\u0488" +
                    "\7\33\2\2\u0488\u0492\5\u0138\u009d\2\u0489\u048a\7\u0091\2\2\u048a\u048b" +
                    "\7\u00f0\2\2\u048b\u048c\7\33\2\2\u048c\u0492\5\u0138\u009d\2\u048d\u048e" +
                    "\7\u00aa\2\2\u048e\u048f\7D\2\2\u048f\u0490\7\f\2\2\u0490\u0492\5\u0138" +
                    "\u009d\2\u0491\u0476\3\2\2\2\u0491\u047f\3\2\2\2\u0491\u0484\3\2\2\2\u0491" +
                    "\u0489\3\2\2\2\u0491\u048d\3\2\2\2\u0492y\3\2\2\2\u0493\u0494\7\u00ad" +
                    "\2\2\u0494\u0498\5\u0160\u00b1\2\u0495\u0496\7\u00f1\2\2\u0496\u0498\5" +
                    "\u0160\u00b1\2\u0497\u0493\3\2\2\2\u0497\u0495\3\2\2\2\u0498{\3\2\2\2" +
                    "\u0499\u049b\7\20\2\2\u049a\u049c\7\u012c\2\2\u049b\u049a\3\2\2\2\u049b" +
                    "\u049c\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u04b5\5\u0138\u009d\2\u049e\u04a0" +
                    "\7*\2\2\u049f\u04a1\7\u012c\2\2\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2\2" +
                    "\2\u04a1\u04a2\3\2\2\2\u04a2\u04b5\5\u0138\u009d\2\u04a3\u04a5\7B\2\2" +
                    "\u04a4\u04a3\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a9\3\2\2\2\u04a6\u04a7" +
                    "\7#\2\2\u04a7\u04aa\7\u00db\2\2\u04a8\u04aa\7$\2\2\u04a9\u04a6\3\2\2\2" +
                    "\u04a9\u04a8\3\2\2\2\u04aa\u04ac\3\2\2\2\u04ab\u04ad\7\u012c\2\2\u04ac" +
                    "\u04ab\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04b5\5\u0138" +
                    "\u009d\2\u04af\u04b1\7W\2\2\u04b0\u04b2\7\u012c\2\2\u04b1\u04b0\3\2\2" +
                    "\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b5\5\u0138\u009d\2" +
                    "\u04b4\u0499\3\2\2\2\u04b4\u049e\3\2\2\2\u04b4\u04a4\3\2\2\2\u04b4\u04af" +
                    "\3\2\2\2\u04b5}\3\2\2\2\u04b6\u04e4\7\"\2\2\u04b7\u04e4\7\24\2\2\u04b8" +
                    "\u04e4\7\25\2\2\u04b9\u04e4\7\26\2\2\u04ba\u04e4\7\27\2\2\u04bb\u04e4" +
                    "\7\30\2\2\u04bc\u04e4\7;\2\2\u04bd\u04e4\7<\2\2\u04be\u04e4\7?\2\2\u04bf" +
                    "\u04e4\7@\2\2\u04c0\u04c2\7O\2\2\u04c1\u04c3\7\u00bb\2\2\u04c2\u04c1\3" +
                    "\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04e4\3\2\2\2\u04c4\u04e4\7c\2\2\u04c5" +
                    "\u04e4\7|\2\2\u04c6\u04e4\7}\2\2\u04c7\u04e4\7~\2\2\u04c8\u04e4\7\177" +
                    "\2\2\u04c9\u04e4\7\u0080\2\2\u04ca\u04e4\7\u00a3\2\2\u04cb\u04e4\7\u00a4" +
                    "\2\2\u04cc\u04e4\7\u00ac\2\2\u04cd\u04e4\7\u00ab\2\2\u04ce\u04e4\7\u00ba" +
                    "\2\2\u04cf\u04e4\7\u00c2\2\2\u04d0\u04d1\7\u00c8\2\2\u04d1\u04e4\7\u0105" +
                    "\2\2\u04d2\u04e4\7\u00df\2\2\u04d3\u04e4\7\u00de\2\2\u04d4\u04e4\7\u00e0" +
                    "\2\2\u04d5\u04e4\7\u00e2\2\2\u04d6\u04e4\7\u00e1\2\2\u04d7\u04e4\7\u00e9" +
                    "\2\2\u04d8\u04e4\7\u00ec\2\2\u04d9\u04e4\7\u00f3\2\2\u04da\u04e4\7\u00f4" +
                    "\2\2\u04db\u04e4\7\u0103\2\2\u04dc\u04e4\7\u0104\2\2\u04dd\u04e4\7\u010c" +
                    "\2\2\u04de\u04e1\5\u0160\u00b1\2\u04df\u04e0\7\5\2\2\u04e0\u04e2\7\u00f9" +
                    "\2\2\u04e1\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e4\3\2\2\2\u04e3" +
                    "\u04b6\3\2\2\2\u04e3\u04b7\3\2\2\2\u04e3\u04b8\3\2\2\2\u04e3\u04b9\3\2" +
                    "\2\2\u04e3\u04ba\3\2\2\2\u04e3\u04bb\3\2\2\2\u04e3\u04bc\3\2\2\2\u04e3" +
                    "\u04bd\3\2\2\2\u04e3\u04be\3\2\2\2\u04e3\u04bf\3\2\2\2\u04e3\u04c0\3\2" +
                    "\2\2\u04e3\u04c4\3\2\2\2\u04e3\u04c5\3\2\2\2\u04e3\u04c6\3\2\2\2\u04e3" +
                    "\u04c7\3\2\2\2\u04e3\u04c8\3\2\2\2\u04e3\u04c9\3\2\2\2\u04e3\u04ca\3\2" +
                    "\2\2\u04e3\u04cb\3\2\2\2\u04e3\u04cc\3\2\2\2\u04e3\u04cd\3\2\2\2\u04e3" +
                    "\u04ce\3\2\2\2\u04e3\u04cf\3\2\2\2\u04e3\u04d0\3\2\2\2\u04e3\u04d2\3\2" +
                    "\2\2\u04e3\u04d3\3\2\2\2\u04e3\u04d4\3\2\2\2\u04e3\u04d5\3\2\2\2\u04e3" +
                    "\u04d6\3\2\2\2\u04e3\u04d7\3\2\2\2\u04e3\u04d8\3\2\2\2\u04e3\u04d9\3\2" +
                    "\2\2\u04e3\u04da\3\2\2\2\u04e3\u04db\3\2\2\2\u04e3\u04dc\3\2\2\2\u04e3" +
                    "\u04dd\3\2\2\2\u04e3\u04de\3\2\2\2\u04e4\177\3\2\2\2\u04e5\u04e6\7\u0136" +
                    "\2\2\u04e6\u04e8\t\17\2\2\u04e7\u04e9\t\20\2\2\u04e8\u04e7\3\2\2\2\u04e8" +
                    "\u04e9\3\2\2\2\u04e9\u04ec\3\2\2\2\u04ea\u04eb\7\u0128\2\2\u04eb\u04ed" +
                    "\7\u0140\2\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ee\3\2\2" +
                    "\2\u04ee\u04ef\7\u0139\2\2\u04ef\u0081\3\2\2\2\u04f0\u04f2\7\u00a8\2\2" +
                    "\u04f1\u04f0\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04fc" +
                    "\7\u00aa\2\2\u04f4\u04f5\7#\2\2\u04f5\u04f6\7\u00db\2\2\u04f6\u04fc\5" +
                    "\u0160\u00b1\2\u04f7\u04f9\7\u00a8\2\2\u04f8\u04f7\3\2\2\2\u04f8\u04f9" +
                    "\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fc\t\21\2\2\u04fb\u04f1\3\2\2\2" +
                    "\u04fb\u04f4\3\2\2\2\u04fb\u04f8\3\2\2\2\u04fc\u0083\3\2\2\2\u04fd\u04ff" +
                    "\7\u0127\2\2\u04fe\u04fd\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0500\3\2\2" +
                    "\2\u0500\u0501\7\u012c\2\2\u0501\u050a\5\u0138\u009d\2\u0502\u0504\7\u010a" +
                    "\2\2\u0503\u0502\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0505\3\2\2\2\u0505" +
                    "\u0507\7B\2\2\u0506\u0508\5\u0138\u009d\2\u0507\u0506\3\2\2\2\u0507\u0508" +
                    "\3\2\2\2\u0508\u050a\3\2\2\2\u0509\u04fe\3\2\2\2\u0509\u0503\3\2\2\2\u050a" +
                    "\u0085\3\2\2\2\u050b\u050c\7\64\2\2\u050c\u0510\t\22\2\2\u050d\u050e\7" +
                    "t\2\2\u050e\u050f\7\u00a8\2\2\u050f\u0511\7^\2\2\u0510\u050d\3\2\2\2\u0510" +
                    "\u0511\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0516\5\u0138\u009d\2\u0513\u0515" +
                    "\5\u0088E\2\u0514\u0513\3\2\2\2\u0515\u0518\3\2\2\2\u0516\u0514\3\2\2" +
                    "\2\u0516\u0517\3\2\2\2\u0517\u0087\3\2\2\2\u0518\u0516\3\2\2\2\u0519\u051a" +
                    "\7*\2\2\u051a\u051e\5\u0138\u009d\2\u051b\u051c\7\u0093\2\2\u051c\u051e" +
                    "\5\u0138\u009d\2\u051d\u0519\3\2\2\2\u051d\u051b\3\2\2\2\u051e\u0089\3" +
                    "\2\2\2\u051f\u0527\7\n\2\2\u0520\u0523\7\64\2\2\u0521\u0522\7\u00b0\2" +
                    "\2\u0522\u0524\7\u00c5\2\2\u0523\u0521\3\2\2\2\u0523\u0524\3\2\2\2\u0524" +
                    "\u0527\3\2\2\2\u0525\u0527\7\u00c5\2\2\u0526\u051f\3\2\2\2\u0526\u0520" +
                    "\3\2\2\2\u0526\u0525\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528\3\2\2\2\u0528" +
                    "\u0529\7j\2\2\u0529\u052b\5\u0160\u00b1\2\u052a\u052c\5\u009cO\2\u052b" +
                    "\u052a\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052f\5\u008c" +
                    "G\2\u052e\u0530\t\23\2\2\u052f\u052e\3\2\2\2\u052f\u0530\3\2\2\2\u0530" +
                    "\u0532\3\2\2\2\u0531\u0533\5> \2\u0532\u0531\3\2\2\2\u0532\u0533\3\2\2" +
                    "\2\u0533\u0534\3\2\2\2\u0534\u0535\5\b\5\2\u0535\u008b\3\2\2\2\u0536\u0537" +
                    "\t\24\2\2\u0537\u0539\5~@\2\u0538\u053a\5\u0080A\2\u0539\u0538\3\2\2\2" +
                    "\u0539\u053a\3\2\2\2\u053a\u008d\3\2\2\2\u053b\u0543\7\n\2\2\u053c\u053f" +
                    "\7\64\2\2\u053d\u053e\7\u00b0\2\2\u053e\u0540\7\u00c5\2\2\u053f\u053d" +
                    "\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0543\3\2\2\2\u0541\u0543\7\u00c5\2" +
                    "\2\u0542\u053b\3\2\2\2\u0542\u053c\3\2\2\2\u0542\u0541\3\2\2\2\u0542\u0543" +
                    "\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0545\7\u00b6\2\2\u0545\u0546\5\u0160" +
                    "\u00b1\2\u0546\u0547\t\23\2\2\u0547\u0548\5\u0090I\2\u0548\u054c\7V\2" +
                    "\2\u0549\u054a\5\u0160\u00b1\2\u054a\u054b\7\u013b\2\2\u054b\u054d\3\2" +
                    "\2\2\u054c\u0549\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u008f\3\2\2\2\u054e" +
                    "\u054f\5\u0092J\2\u054f\u0555\7\u013b\2\2\u0550\u0551\5\u0092J\2\u0551" +
                    "\u0552\7\u013b\2\2\u0552\u0554\3\2\2\2\u0553\u0550\3\2\2\2\u0554\u0557" +
                    "\3\2\2\2\u0555\u0553\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0091\3\2\2\2\u0557" +
                    "\u0555\3\2\2\2\u0558\u0566\5@!\2\u0559\u055a\7j\2\2\u055a\u055c\5\u0160" +
                    "\u00b1\2\u055b\u055d\5\u009cO\2\u055c\u055b\3\2\2\2\u055c\u055d\3\2\2" +
                    "\2\u055d\u055e\3\2\2\2\u055e\u055f\5\u008cG\2\u055f\u0566\3\2\2\2\u0560" +
                    "\u0561\t\25\2\2\u0561\u0563\5\u0160\u00b1\2\u0562\u0564\5\u009cO\2\u0563" +
                    "\u0562\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0566\3\2\2\2\u0565\u0558\3\2" +
                    "\2\2\u0565\u0559\3\2\2\2\u0565\u0560\3\2\2\2\u0566\u0093\3\2\2\2\u0567" +
                    "\u056f\7\n\2\2\u0568\u056b\7\64\2\2\u0569\u056a\7\u00b0\2\2\u056a\u056c" +
                    "\7\u00c5\2\2\u056b\u0569\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u056f\3\2\2" +
                    "\2\u056d\u056f\7\u00c5\2\2\u056e\u0567\3\2\2\2\u056e\u0568\3\2\2\2\u056e" +
                    "\u056d\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0571\7\u00b6" +
                    "\2\2\u0571\u0572\7\31\2\2\u0572\u0573\5\u0160\u00b1\2\u0573\u0574\t\23" +
                    "\2\2\u0574\u0575\5\u0096L\2\u0575\u0579\7V\2\2\u0576\u0577\5\u0160\u00b1" +
                    "\2\u0577\u0578\7\u013b\2\2\u0578\u057a\3\2\2\2\u0579\u0576\3\2\2\2\u0579" +
                    "\u057a\3\2\2\2\u057a\u0095\3\2\2\2\u057b\u057c\5\u0098M\2\u057c\u0582" +
                    "\7\u013b\2\2\u057d\u057e\5\u0098M\2\u057e\u057f\7\u013b\2\2\u057f\u0581" +
                    "\3\2\2\2\u0580\u057d\3\2\2\2\u0581\u0584\3\2\2\2\u0582\u0580\3\2\2\2\u0582" +
                    "\u0583\3\2\2\2\u0583\u0097\3\2\2\2\u0584\u0582\3\2\2\2\u0585\u0589\5@" +
                    "!\2\u0586\u0589\5\u008aF\2\u0587\u0589\5\u009aN\2\u0588\u0585\3\2\2\2" +
                    "\u0588\u0586\3\2\2\2\u0588\u0587\3\2\2\2\u0589\u0099\3\2\2\2\u058a\u0592" +
                    "\7\n\2\2\u058b\u058e\7\64\2\2\u058c\u058d\7\u00b0\2\2\u058d\u058f\7\u00c5" +
                    "\2\2\u058e\u058c\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0592\3\2\2\2\u0590" +
                    "\u0592\7\u00c5\2\2\u0591\u058a\3\2\2\2\u0591\u058b\3\2\2\2\u0591\u0590" +
                    "\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0594\t\25\2\2" +
                    "\u0594\u0596\5\u0160\u00b1\2\u0595\u0597\5\u009cO\2\u0596\u0595\3\2\2" +
                    "\2\u0596\u0597\3\2\2\2\u0597\u0599\3\2\2\2\u0598\u059a\5\u00a0Q\2\u0599" +
                    "\u0598\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059c\3\2\2\2\u059b\u059d\t\23" +
                    "\2\2\u059c\u059b\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059f\3\2\2\2\u059e" +
                    "\u05a0\5> \2\u059f\u059e\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a2\3\2\2" +
                    "\2\u05a1\u05a3\5\u00eav\2\u05a2\u05a1\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3" +
                    "\u05a4\3\2\2\2\u05a4\u05a8\5\f\7\2\u05a5\u05a6\5\u0160\u00b1\2\u05a6\u05a7" +
                    "\7\u013b\2\2\u05a7\u05a9\3\2\2\2\u05a8\u05a5\3\2\2\2\u05a8\u05a9\3\2\2" +
                    "\2\u05a9\u009b\3\2\2\2\u05aa\u05ab\7\u0136\2\2\u05ab\u05c1\7\u0139\2\2" +
                    "\u05ac\u05ad\7\u0136\2\2\u05ad\u05b2\5\u009eP\2\u05ae\u05af\7\u0128\2" +
                    "\2\u05af\u05b1\5\u009eP\2\u05b0\u05ae\3\2\2\2\u05b1\u05b4\3\2\2\2\u05b2" +
                    "\u05b0\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b5\3\2\2\2\u05b4\u05b2\3\2" +
                    "\2\2\u05b5\u05b6\7\u0139\2\2\u05b6\u05c1\3\2\2\2\u05b7\u05b8\6O\4\2\u05b8" +
                    "\u05bd\5\u009eP\2\u05b9\u05ba\7\u0128\2\2\u05ba\u05bc\5\u009eP\2\u05bb" +
                    "\u05b9\3\2\2\2\u05bc\u05bf\3\2\2\2\u05bd\u05bb\3\2\2\2\u05bd\u05be\3\2" +
                    "\2\2\u05be\u05c1\3\2\2\2\u05bf\u05bd\3\2\2\2\u05c0\u05aa\3\2\2\2\u05c0" +
                    "\u05ac\3\2\2\2\u05c0\u05b7\3\2\2\2\u05c1\u009d\3\2\2\2\u05c2\u05c8\7v" +
                    "\2\2\u05c3\u05c8\7\u00b2\2\2\u05c4\u05c8\7z\2\2\u05c5\u05c6\7v\2\2\u05c6" +
                    "\u05c8\7\u00b2\2\2\u05c7\u05c2\3\2\2\2\u05c7\u05c3\3\2\2\2\u05c7\u05c4" +
                    "\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9" +
                    "\u05ca\5\u0160\u00b1\2\u05ca\u05cc\5~@\2\u05cb\u05cd\5\u0080A\2\u05cc" +
                    "\u05cb\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05d1\3\2\2\2\u05ce\u05d0\5\u0082" +
                    "B\2\u05cf\u05ce\3\2\2\2\u05d0\u05d3\3\2\2\2\u05d1\u05cf\3\2\2\2\u05d1" +
                    "\u05d2\3\2\2\2\u05d2\u05d5\3\2\2\2\u05d3\u05d1\3\2\2\2\u05d4\u05d6\5\u0084" +
                    "C\2\u05d5\u05d4\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05ed\3\2\2\2\u05d7" +
                    "\u05dd\5\u0160\u00b1\2\u05d8\u05de\7v\2\2\u05d9\u05de\7\u00b2\2\2\u05da" +
                    "\u05de\7z\2\2\u05db\u05dc\7v\2\2\u05dc\u05de\7\u00b2\2\2\u05dd\u05d8\3" +
                    "\2\2\2\u05dd\u05d9\3\2\2\2\u05dd\u05da\3\2\2\2\u05dd\u05db\3\2\2\2\u05dd" +
                    "\u05de\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e1\5~@\2\u05e0\u05e2\5\u0080" +
                    "A\2\u05e1\u05e0\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e6\3\2\2\2\u05e3" +
                    "\u05e5\5\u0082B\2\u05e4\u05e3\3\2\2\2\u05e5\u05e8\3\2\2\2\u05e6\u05e4" +
                    "\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05ea\3\2\2\2\u05e8\u05e6\3\2\2\2\u05e9" +
                    "\u05eb\5\u0084C\2\u05ea\u05e9\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ed" +
                    "\3\2\2\2\u05ec\u05c7\3\2\2\2\u05ec\u05d7\3\2\2\2\u05ed\u009f\3\2\2\2\u05ee" +
                    "\u05f0\5\u00a2R\2\u05ef\u05ee\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05ef" +
                    "\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u00a1\3\2\2\2\u05f3\u05f4\7\u008c\2" +
                    "\2\u05f4\u05ff\7\u00e3\2\2\u05f5\u05f6\7\u00e3\2\2\u05f6\u05f7\7\u00d7" +
                    "\2\2\u05f7\u05ff\t\26\2\2\u05f8\u05fa\7Q\2\2\u05f9\u05f8\3\2\2\2\u05f9" +
                    "\u05fa\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fc\7\u00c7\2\2\u05fc\u05fd" +
                    "\7\u00dc\2\2\u05fd\u05ff\7\u0140\2\2\u05fe\u05f3\3\2\2\2\u05fe\u05f5\3" +
                    "\2\2\2\u05fe\u05f9\3\2\2\2\u05ff\u00a3\3\2\2\2\u0600\u0602\t\27\2\2\u0601" +
                    "\u0603\7u\2\2\u0602\u0601\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u0604\3\2" +
                    "\2\2\u0604\u060a\5\u0138\u009d\2\u0605\u0606\7\u0136\2\2\u0606\u0607\5" +
                    "\u0158\u00ad\2\u0607\u0608\7\u0139\2\2\u0608\u060b\3\2\2\2\u0609\u060b" +
                    "\5\u0158\u00ad\2\u060a\u0605\3\2\2\2\u060a\u0609\3\2\2\2\u060a\u060b\3" +
                    "\2\2\2\u060b\u0615\3\2\2\2\u060c\u060d\7\u0083\2\2\u060d\u0612\7\u013d" +
                    "\2\2\u060e\u060f\7\u0128\2\2\u060f\u0611\7\u013d\2\2\u0610\u060e\3\2\2" +
                    "\2\u0611\u0614\3\2\2\2\u0612\u0610\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0616" +
                    "\3\2\2\2\u0614\u0612\3\2\2\2\u0615\u060c\3\2\2\2\u0615\u0616\3\2\2\2\u0616" +
                    "\u0618\3\2\2\2\u0617\u0619\5\u00ecw\2\u0618\u0617\3\2\2\2\u0618\u0619" +
                    "\3\2\2\2\u0619\u00a5\3\2\2\2\u061a\u061e\5\u00a8U\2\u061b\u061e\5\u00aa" +
                    "V\2\u061c\u061e\5\u00acW\2\u061d\u061a\3\2\2\2\u061d\u061b\3\2\2\2\u061d" +
                    "\u061c\3\2\2\2\u061e\u00a7\3\2\2\2\u061f\u0620\7t\2\2\u0620\u0621\5\u0128" +
                    "\u0095\2\u0621\u0622\7\u00f2\2\2\u0622\u0626\5\4\3\2\u0623\u0625\5\u00ae" +
                    "X\2\u0624\u0623\3\2\2\2\u0625\u0628\3\2\2\2\u0626\u0624\3\2\2\2\u0626" +
                    "\u0627\3\2\2\2\u0627\u062a\3\2\2\2\u0628\u0626\3\2\2\2\u0629\u062b\5\u00b0" +
                    "Y\2\u062a\u0629\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u062c\3\2\2\2\u062c" +
                    "\u062d\7V\2\2\u062d\u062e\7t\2\2\u062e\u00a9\3\2\2\2\u062f\u0630\7t\2" +
                    "\2\u0630\u0631\5\u0128\u0095\2\u0631\u0634\5\b\5\2\u0632\u0633\7R\2\2" +
                    "\u0633\u0635\5\b\5\2\u0634\u0632\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u00ab" +
                    "\3\2\2\2\u0636\u0637\7\6\2\2\u0637\u0638\7t\2\2\u0638\u0639\5\u0128\u0095" +
                    "\2\u0639\u063a\7\u00f2\2\2\u063a\u063b\5\b\5\2\u063b\u00ad\3\2\2\2\u063c" +
                    "\u063d\t\30\2\2\u063d\u063e\5\u0128\u0095\2\u063e\u063f\7\u00f2\2\2\u063f" +
                    "\u0640\5\4\3\2\u0640\u00af\3\2\2\2\u0641\u0642\7R\2\2\u0642\u0643\5\4" +
                    "\3\2\u0643\u00b1\3\2\2\2\u0644\u0646\7_\2\2\u0645\u0647\7\u013d\2\2\u0646" +
                    "\u0645\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u064a\3\2\2\2\u0648\u0649\7\u0107" +
                    "\2\2\u0649\u064b\5\u0128\u0095\2\u064a\u0648\3\2\2\2\u064a\u064b\3\2\2" +
                    "\2\u064b\u00b3\3\2\2\2\u064c\u064e\7\u008d\2\2\u064d\u064f\7\u013d\2\2" +
                    "\u064e\u064d\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u00b5\3\2\2\2\u0650\u0651" +
                    "\7\'\2\2\u0651\u0652\t\31\2\2\u0652\u0653\5\u00b8]\2\u0653\u0654\7\u0128" +
                    "\2\2\u0654\u0655\5\u00b8]\2\u0655\u00b7\3\2\2\2\u0656\u0658\5\u0118\u008d" +
                    "\2\u0657\u0659\5\u011a\u008e\2\u0658\u0657\3\2\2\2\u0658\u0659\3\2\2\2" +
                    "\u0659\u065f\3\2\2\2\u065a\u065b\7\u0136\2\2\u065b\u065c\5\u00eex\2\u065c" +
                    "\u065d\7\u0139\2\2\u065d\u065f\3\2\2\2\u065e\u0656\3\2\2\2\u065e\u065a" +
                    "\3\2\2\2\u065f\u0662\3\2\2\2\u0660\u0661\7\17\2\2\u0661\u0663\5\u0160" +
                    "\u00b1\2\u0662\u0660\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u00b9\3\2\2\2\u0664" +
                    "\u0666\7\64\2\2\u0665\u0667\7\u00fb\2\2\u0666\u0665\3\2\2\2\u0666\u0667" +
                    "\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u0669\7w\2\2\u0669\u066a\5\u0160\u00b1" +
                    "\2\u066a\u066b\7\u00ad\2\2\u066b\u066c\5\u0118\u008d\2\u066c\u066d\7\u0136" +
                    "\2\2\u066d\u0672\5\u00bc_\2\u066e\u066f\7\u0128\2\2\u066f\u0671\5\u00bc" +
                    "_\2\u0670\u066e\3\2\2\2\u0671\u0674\3\2\2\2\u0672\u0670\3\2\2\2\u0672" +
                    "\u0673\3\2\2\2\u0673\u0675\3\2\2\2\u0674\u0672\3\2\2\2\u0675\u0676\7\u0139" +
                    "\2\2\u0676\u00bb\3\2\2\2\u0677\u0679\5\u0160\u00b1\2\u0678\u067a\t\7\2" +
                    "\2\u0679\u0678\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u00bd\3\2\2\2\u067b\u067c" +
                    "\5\u00c0a\2\u067c\u00bf\3\2\2\2\u067d\u067e\7\u010a\2\2\u067e\u067f\7" +
                    "\u0136\2\2\u067f\u0680\5\u0160\u00b1\2\u0680\u0681\7\u012c\2\2\u0681\u0689" +
                    "\5\u0160\u00b1\2\u0682\u0683\7\u0128\2\2\u0683\u0684\5\u0160\u00b1\2\u0684" +
                    "\u0685\7\u012c\2\2\u0685\u0686\5\u0160\u00b1\2\u0686\u0688\3\2\2\2\u0687" +
                    "\u0682\3\2\2\2\u0688\u068b\3\2\2\2\u0689\u0687\3\2\2\2\u0689\u068a\3\2" +
                    "\2\2\u068a\u068c\3\2\2\2\u068b\u0689\3\2\2\2\u068c\u0690\7\u0139\2\2\u068d" +
                    "\u068f\5z>\2\u068e\u068d\3\2\2\2\u068f\u0692\3\2\2\2\u0690\u068e\3\2\2" +
                    "\2\u0690\u0691\3\2\2\2\u0691\u00c1\3\2\2\2\u0692\u0690\3\2\2\2\u0693\u0695" +
                    "\7\6\2\2\u0694\u0693\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u0696\3\2\2\2\u0696" +
                    "\u0698\7\u00c1\2\2\u0697\u0699\5\u0138\u009d\2\u0698\u0697\3\2\2\2\u0698" +
                    "\u0699\3\2\2\2\u0699\u00c3\3\2\2\2\u069a\u069c\7\u00c9\2\2\u069b\u069d" +
                    "\5\u0138\u009d\2\u069c\u069b\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u00c5\3" +
                    "\2\2\2\u069e\u069f\5\u00c8e\2\u069f\u06a0\5\u00ceh\2\u06a0\u00c7\3\2\2" +
                    "\2\u06a1\u06a2\5~@\2\u06a2\u06a3\5\u0160\u00b1\2\u06a3\u06a4\7\u0136\2" +
                    "\2\u06a4\u06a5\5\u00caf\2\u06a5\u06a6\7\u0139\2\2\u06a6\u00c9\3\2\2\2" +
                    "\u06a7\u06ac\5\u00ccg\2\u06a8\u06a9\7\u0128\2\2\u06a9\u06ab\5\u00ccg\2" +
                    "\u06aa\u06a8\3\2\2\2\u06ab\u06ae\3\2\2\2\u06ac\u06aa\3\2\2\2\u06ac\u06ad" +
                    "\3\2\2\2\u06ad\u00cb\3\2\2\2\u06ae\u06ac\3\2\2\2\u06af\u06b0\5~@\2\u06b0" +
                    "\u06b1\5\u0160\u00b1\2\u06b1\u00cd\3\2\2\2\u06b2\u06b6\7\u0135\2\2\u06b3" +
                    "\u06b5\5\u00e4s\2\u06b4\u06b3\3\2\2\2\u06b5\u06b8\3\2\2\2\u06b6\u06b4" +
                    "\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u06b9\3\2\2\2\u06b8\u06b6\3\2\2\2\u06b9" +
                    "\u06ba\7\u0138\2\2\u06ba\u00cf\3\2\2\2\u06bb\u06bc\7t\2\2\u06bc\u06bd" +
                    "\7\u0136\2\2\u06bd\u06be\5\u0128\u0095\2\u06be\u06bf\7\u0139\2\2\u06bf" +
                    "\u06c3\5\u00e2r\2\u06c0\u06c2\5\u00d2j\2\u06c1\u06c0\3\2\2\2\u06c2\u06c5" +
                    "\3\2\2\2\u06c3\u06c1\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c7\3\2\2\2\u06c5" +
                    "\u06c3\3\2\2\2\u06c6\u06c8\5\u00d4k\2\u06c7\u06c6\3\2\2\2\u06c7\u06c8" +
                    "\3\2\2\2\u06c8\u00d1\3\2\2\2\u06c9\u06ca\t\30\2\2\u06ca\u06cb\7\u0136" +
                    "\2\2\u06cb\u06cc\5\u0128\u0095\2\u06cc\u06cd\7\u0139\2\2\u06cd\u06ce\5" +
                    "\u00e2r\2\u06ce\u00d3\3\2\2\2\u06cf\u06d0\7R\2\2\u06d0\u06d1\5\u00e2r" +
                    "\2\u06d1\u00d5\3\2\2\2\u06d2\u06d3\5\u00d8m\2\u06d3\u06d4\5\u00e2r\2\u06d4" +
                    "\u00d7\3\2\2\2\u06d5\u06d6\7d\2\2\u06d6\u06d7\7\u0136\2\2\u06d7\u06d8" +
                    "\5\u00dan\2\u06d8\u06d9\7\u013b\2\2\u06d9\u06da\5\u0128\u0095\2\u06da" +
                    "\u06db\7\u013b\2\2\u06db\u06dc\5\u00dep\2\u06dc\u06dd\7\u0139\2\2\u06dd" +
                    "\u00d9\3\2\2\2\u06de\u06e3\5\u00dco\2\u06df\u06e0\7\u0128\2\2\u06e0\u06e2" +
                    "\5\u00dco\2\u06e1\u06df\3\2\2\2\u06e2\u06e5\3\2\2\2\u06e3\u06e1\3\2\2" +
                    "\2\u06e3\u06e4\3\2\2\2\u06e4\u00db\3\2\2\2\u06e5\u06e3\3\2\2\2\u06e6\u06e8" +
                    "\5~@\2\u06e7\u06e6\3\2\2\2\u06e7\u06e8\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9" +
                    "\u06ea\5\u0160\u00b1\2\u06ea\u06eb\7\u012c\2\2\u06eb\u06ec\7\u0140\2\2" +
                    "\u06ec\u00dd\3\2\2\2\u06ed\u06f2\5\u00e0q\2\u06ee\u06ef\7\u0128\2\2\u06ef" +
                    "\u06f1\5\u00e0q\2\u06f0\u06ee\3\2\2\2\u06f1\u06f4\3\2\2\2\u06f2\u06f0" +
                    "\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u00df\3\2\2\2\u06f4\u06f2\3\2\2\2\u06f5" +
                    "\u06f6\5\u0160\u00b1\2\u06f6\u06f7\7\u0126\2\2\u06f7\u06f8\7\u0126\2\2" +
                    "\u06f8\u070d\3\2\2\2\u06f9\u06fa\5\u0160\u00b1\2\u06fa\u06fb\7\u013c\2" +
                    "\2\u06fb\u06fc\7\u013c\2\2\u06fc\u070d\3\2\2\2\u06fd\u06fe\5\u0160\u00b1" +
                    "\2\u06fe\u06ff\7\u012c\2\2\u06ff\u0700\7\u0140\2\2\u0700\u070d\3\2\2\2" +
                    "\u0701\u0702\5\u0160\u00b1\2\u0702\u0703\7\u012c\2\2\u0703\u0704\5\u0160" +
                    "\u00b1\2\u0704\u0705\t\32\2\2\u0705\u0706\7\u0140\2\2\u0706\u070d\3\2" +
                    "\2\2\u0707\u0708\5\u0160\u00b1\2\u0708\u0709\t\32\2\2\u0709\u070a\7\u012c" +
                    "\2\2\u070a\u070b\7\u0140\2\2\u070b\u070d\3\2\2\2\u070c\u06f5\3\2\2\2\u070c" +
                    "\u06f9\3\2\2\2\u070c\u06fd\3\2\2\2\u070c\u0701\3\2\2\2\u070c\u0707\3\2" +
                    "\2\2\u070d\u00e1\3\2\2\2\u070e\u0712\7\u0135\2\2\u070f\u0711\5\u00e4s" +
                    "\2\u0710\u070f\3\2\2\2\u0711\u0714\3\2\2\2\u0712\u0710\3\2\2\2\u0712\u0713" +
                    "\3\2\2\2\u0713\u0715\3\2\2\2\u0714\u0712\3\2\2\2\u0715\u0718\7\u0138\2" +
                    "\2\u0716\u0718\5\u00e4s\2\u0717\u070e\3\2\2\2\u0717\u0716\3\2\2\2\u0718" +
                    "\u00e3\3\2\2\2\u0719\u071c\5\u00d0i\2\u071a\u071c\5\u00d6l\2\u071b\u0719" +
                    "\3\2\2\2\u071b\u071a\3\2\2\2\u071c\u00e5\3\2\2\2\u071d\u071e\7\u0109\2" +
                    "\2\u071e\u071f\5\u0128\u0095\2\u071f\u0720\t\33\2\2\u0720\u0721\5\4\3" +
                    "\2\u0721\u0723\7V\2\2\u0722\u0724\t\34\2\2\u0723\u0722\3\2\2\2\u0723\u0724" +
                    "\3\2\2\2\u0724\u00e7\3\2\2\2\u0725\u0726\7d\2\2\u0726\u0727\7\u013d\2" +
                    "\2\u0727\u0729\7v\2\2\u0728\u072a\7\u00cb\2\2\u0729\u0728\3\2\2\2\u0729" +
                    "\u072a\3\2\2\2\u072a\u072b\3\2\2\2\u072b\u072c\5\u0138\u009d\2\u072c\u072d" +
                    "\7\u012b\2\2\u072d\u0730\5\u0138\u009d\2\u072e\u072f\t\35\2\2\u072f\u0731" +
                    "\5\u0138\u009d\2\u0730\u072e\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0732\3" +
                    "\2\2\2\u0732\u0733\7\u009a\2\2\u0733\u0734\5\4\3\2\u0734\u0735\7V\2\2" +
                    "\u0735\u0736\7\u009a\2\2\u0736\u00e9\3\2\2\2\u0737\u073e\7\u0146\2\2\u0738" +
                    "\u0739\7\u0132\2\2\u0739\u073a\7\u0132\2\2\u073a\u073b\7\u013d\2\2\u073b" +
                    "\u073c\7\u0130\2\2\u073c\u073e\7\u0130\2\2\u073d\u0737\3\2\2\2\u073d\u0738" +
                    "\3\2\2\2\u073e\u00eb\3\2\2\2\u073f\u0740\7\u00ff\2\2\u0740\u0745\5\u0138" +
                    "\u009d\2\u0741\u0742\7\u0128\2\2\u0742\u0744\5\u0138\u009d\2\u0743\u0741" +
                    "\3\2\2\2\u0744\u0747\3\2\2\2\u0745\u0743\3\2\2\2\u0745\u0746\3\2\2\2\u0746" +
                    "\u00ed\3\2\2\2\u0747\u0745\3\2\2\2\u0748\u0749\5\u00f0y\2\u0749\u00ef" +
                    "\3\2\2\2\u074a\u0750\5\u00f2z\2\u074b\u074c\5\u00f4{\2\u074c\u074d\5\u00f2" +
                    "z\2\u074d\u074f\3\2\2\2\u074e\u074b\3\2\2\2\u074f\u0752\3\2\2\2\u0750" +
                    "\u074e\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u00f1\3\2\2\2\u0752\u0750\3\2" +
                    "\2\2\u0753\u0759\5\u00f6|\2\u0754\u0755\7\u0136\2\2\u0755\u0756\5\u00f0" +
                    "y\2\u0756\u0757\7\u0139\2\2\u0757\u0759\3\2\2\2\u0758\u0753\3\2\2\2\u0758" +
                    "\u0754\3\2\2\2\u0759\u00f3\3\2\2\2\u075a\u075c\7\u00fa\2\2\u075b\u075d" +
                    "\7\t\2\2\u075c\u075b\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u0767\3\2\2\2\u075e" +
                    "\u0760\7Y\2\2\u075f\u0761\7\t\2\2\u0760\u075f\3\2\2\2\u0760\u0761\3\2" +
                    "\2\2\u0761\u0767\3\2\2\2\u0762\u0764\7\u0081\2\2\u0763\u0765\7\t\2\2\u0764" +
                    "\u0763\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u0767\3\2\2\2\u0766\u075a\3\2" +
                    "\2\2\u0766\u075e\3\2\2\2\u0766\u0762\3\2\2\2\u0767\u00f5\3\2\2\2\u0768" +
                    "\u0769\t\36\2\2\u0769\u076b\5\u00f8}\2\u076a\u076c\5\u0104\u0083\2\u076b" +
                    "\u076a\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u076e\3\2\2\2\u076d\u076f\5\u0106" +
                    "\u0084\2\u076e\u076d\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u0771\3\2\2\2\u0770" +
                    "\u0772\5\u011a\u008e\2\u0771\u0770\3\2\2\2\u0771\u0772\3\2\2\2\u0772\u0774" +
                    "\3\2\2\2\u0773\u0775\5\u011c\u008f\2\u0774\u0773\3\2\2\2\u0774\u0775\3" +
                    "\2\2\2\u0775\u0778\3\2\2\2\u0776\u0779\5\u011e\u0090\2\u0777\u0779\5\u0120" +
                    "\u0091\2\u0778\u0776\3\2\2\2\u0778\u0777\3\2\2\2\u0778\u0779\3\2\2\2\u0779" +
                    "\u077b\3\2\2\2\u077a\u077c\5\u0122\u0092\2\u077b\u077a\3\2\2\2\u077b\u077c" +
                    "\3\2\2\2\u077c\u077e\3\2\2\2\u077d\u077f\5\u0124\u0093\2\u077e\u077d\3" +
                    "\2\2\2\u077e\u077f\3\2\2\2\u077f\u00f7\3\2\2\2\u0780\u0782\5\u00fa~\2" +
                    "\u0781\u0780\3\2\2\2\u0781\u0782\3\2\2\2\u0782\u0784\3\2\2\2\u0783\u0785" +
                    "\5\u00fc\177\2\u0784\u0783\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u0786\3\2" +
                    "\2\2\u0786\u078b\5\u00fe\u0080\2\u0787\u0788\7\u0128\2\2\u0788\u078a\5" +
                    "\u00fe\u0080\2\u0789\u0787\3\2\2\2\u078a\u078d\3\2\2\2\u078b\u0789\3\2" +
                    "\2\2\u078b\u078c\3\2\2\2\u078c\u00f9\3\2\2\2\u078d\u078b\3\2\2\2\u078e" +
                    "\u078f\t\37\2\2\u078f\u00fb\3\2\2\2\u0790\u0791\7\u00f7\2\2\u0791\u0792" +
                    "\5\u0138\u009d\2\u0792\u00fd\3\2\2\2\u0793\u0794\5\u0160\u00b1\2\u0794" +
                    "\u0795\7\u012c\2\2\u0795\u0797\3\2\2\2\u0796\u0793\3\2\2\2\u0796\u0797" +
                    "\3\2\2\2\u0797\u0798\3\2\2\2\u0798\u079a\5\u0138\u009d\2\u0799\u079b\5" +
                    "\u0100\u0081\2\u079a\u0799\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u079e\3\2" +
                    "\2\2\u079c\u079e\5\u0102\u0082\2\u079d\u0796\3\2\2\2\u079d\u079c\3\2\2" +
                    "\2\u079e\u00ff\3\2\2\2\u079f\u07a1\6\u0081\5\2\u07a0\u07a2\7\f\2\2\u07a1" +
                    "\u07a0\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07a3\3\2\2\2\u07a3\u07a9\5\u0160" +
                    "\u00b1\2\u07a4\u07a5\7\u0136\2\2\u07a5\u07a6\7\u00f5\2\2\u07a6\u07a7\7" +
                    "\u013e\2\2\u07a7\u07a9\7\u0139\2\2\u07a8\u079f\3\2\2\2\u07a8\u07a4\3\2" +
                    "\2\2\u07a9\u0101\3\2\2\2\u07aa\u07ab\7\u013d\2\2\u07ab\u07ad\7\6\2\2\u07ac" +
                    "\u07aa\3\2\2\2\u07ac\u07ad\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07af\7\u0134" +
                    "\2\2\u07af\u0103\3\2\2\2\u07b0\u07b1\7\u0083\2\2\u07b1\u07b6\5\u0160\u00b1" +
                    "\2\u07b2\u07b3\7\u0128\2\2\u07b3\u07b5\5\u0160\u00b1\2\u07b4\u07b2\3\2" +
                    "\2\2\u07b5\u07b8\3\2\2\2\u07b6\u07b4\3\2\2\2\u07b6\u07b7\3\2\2\2\u07b7" +
                    "\u0105\3\2\2\2\u07b8\u07b6\3\2\2\2\u07b9\u07ba\7h\2\2\u07ba\u07be\5\u0108" +
                    "\u0085\2\u07bb\u07bd\5\u010e\u0088\2\u07bc\u07bb\3\2\2\2\u07bd\u07c0\3" +
                    "\2\2\2\u07be\u07bc\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf\u0107\3\2\2\2\u07c0" +
                    "\u07be\3\2\2\2\u07c1\u07c5\5\u010a\u0086\2\u07c2\u07c5\5\u010c\u0087\2" +
                    "\u07c3\u07c5\5\u0112\u008a\2\u07c4\u07c1\3\2\2\2\u07c4\u07c2\3\2\2\2\u07c4" +
                    "\u07c3\3\2\2\2\u07c5\u0109\3\2\2\2\u07c6\u07c8\5\u0118\u008d\2\u07c7\u07c9" +
                    "\5\u0116\u008c\2\u07c8\u07c7\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u010b\3" +
                    "\2\2\2\u07ca\u07cb\7\u0136\2\2\u07cb\u07cc\5\u00eex\2\u07cc\u07ce\7\u0139" +
                    "\2\2\u07cd\u07cf\5\u0116\u008c\2\u07ce\u07cd\3\2\2\2\u07ce\u07cf\3\2\2" +
                    "\2\u07cf\u010d\3\2\2\2\u07d0\u07d1\7\u0128\2\2\u07d1\u07d8\5\u0108\u0085" +
                    "\2\u07d2\u07d3\5\u0110\u0089\2\u07d3\u07d4\5\u0108\u0085\2\u07d4\u07d5" +
                    "\7\u00ad\2\2\u07d5\u07d6\5\u0128\u0095\2\u07d6\u07d8\3\2\2\2\u07d7\u07d0" +
                    "\3\2\2\2\u07d7\u07d2\3\2\2\2\u07d8\u010f\3\2\2\2\u07d9\u07db\7y\2\2\u07da" +
                    "\u07d9\3\2\2\2\u07da\u07db\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07e3\7\u0088" +
                    "\2\2\u07dd\u07df\t \2\2\u07de\u07e0\7\u00b3\2\2\u07df\u07de\3\2\2\2\u07df" +
                    "\u07e0\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e3\7\u0088\2\2\u07e2\u07da" +
                    "\3\2\2\2\u07e2\u07dd\3\2\2\2\u07e3\u0111\3\2\2\2\u07e4\u07e5\7\u00ed\2" +
                    "\2\u07e5\u07e6\7\u0136\2\2\u07e6\u07e7\7\u0101\2\2\u07e7\u07ec\5\u0114" +
                    "\u008b\2\u07e8\u07e9\7\u0128\2\2\u07e9\u07eb\5\u0114\u008b\2\u07ea\u07e8" +
                    "\3\2\2\2\u07eb\u07ee\3\2\2\2\u07ec\u07ea\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed" +
                    "\u07ef\3\2\2\2\u07ee\u07ec\3\2\2\2\u07ef\u07f1\7\u0139\2\2\u07f0\u07f2" +
                    "\5\u0116\u008c\2\u07f1\u07f0\3\2\2\2\u07f1\u07f2\3\2\2\2\u07f2\u0113\3" +
                    "\2\2\2\u07f3\u0800\5\u0138\u009d\2\u07f4\u07f5\7\u0136\2\2\u07f5\u07fa" +
                    "\5\u0138\u009d\2\u07f6\u07f7\7\u0128\2\2\u07f7\u07f9\5\u0138\u009d\2\u07f8" +
                    "\u07f6\3\2\2\2\u07f9\u07fc\3\2\2\2\u07fa\u07f8\3\2\2\2\u07fa\u07fb\3\2" +
                    "\2\2\u07fb\u07fd\3\2\2\2\u07fc\u07fa\3\2\2\2\u07fd\u07fe\7\u0139\2\2\u07fe" +
                    "\u0800\3\2\2\2\u07ff\u07f3\3\2\2\2\u07ff\u07f4\3\2\2\2\u0800\u0115\3\2" +
                    "\2\2\u0801\u0803\6\u008c\6\2\u0802\u0804\7\f\2\2\u0803\u0802\3\2\2\2\u0803" +
                    "\u0804\3\2\2\2\u0804\u0805\3\2\2\2\u0805\u0810\5\u0160\u00b1\2\u0806\u0807" +
                    "\7\u0136\2\2\u0807\u080c\7\u013d\2\2\u0808\u0809\7\u0128\2\2\u0809\u080b" +
                    "\7\u013d\2\2\u080a\u0808\3\2\2\2\u080b\u080e\3\2\2\2\u080c\u080a\3\2\2" +
                    "\2\u080c\u080d\3\2\2\2\u080d\u080f\3\2\2\2\u080e\u080c\3\2\2\2\u080f\u0811" +
                    "\7\u0139\2\2\u0810\u0806\3\2\2\2\u0810\u0811\3\2\2\2\u0811\u0117\3\2\2" +
                    "\2\u0812\u0813\5\u0160\u00b1\2\u0813\u0119\3\2\2\2\u0814\u0815\7\u0108" +
                    "\2\2\u0815\u0816\5\u0128\u0095\2\u0816\u011b\3\2\2\2\u0817\u0818\7n\2" +
                    "\2\u0818\u0819\7\33\2\2\u0819\u081e\5\u0138\u009d\2\u081a\u081b\7\u0128" +
                    "\2\2\u081b\u081d\5\u0138\u009d\2\u081c\u081a\3\2\2\2\u081d\u0820\3\2\2" +
                    "\2\u081e\u081c\3\2\2\2\u081e\u081f\3\2\2\2\u081f\u011d\3\2\2\2\u0820\u081e" +
                    "\3\2\2\2\u0821\u0822\7q\2\2\u0822\u0823\5\u0128\u0095\2\u0823\u011f\3" +
                    "\2\2\2\u0824\u0825\7\u00c0\2\2\u0825\u0826\5\u0128\u0095\2\u0826\u0121" +
                    "\3\2\2\2\u0827\u0828\7\u00b1\2\2\u0828\u0829\7\33\2\2\u0829\u082b\5\u0138" +
                    "\u009d\2\u082a\u082c\t\7\2\2\u082b\u082a\3\2\2\2\u082b\u082c\3\2\2\2\u082c" +
                    "\u0834\3\2\2\2\u082d\u082e\7\u0128\2\2\u082e\u0830\5\u0138\u009d\2\u082f" +
                    "\u0831\t\7\2\2\u0830\u082f\3\2\2\2\u0830\u0831\3\2\2\2\u0831\u0833\3\2" +
                    "\2\2\u0832\u082d\3\2\2\2\u0833\u0836\3\2\2\2\u0834\u0832\3\2\2\2\u0834" +
                    "\u0835\3\2\2\2\u0835\u0123\3\2\2\2\u0836\u0834\3\2\2\2\u0837\u0839\5\u0126" +
                    "\u0094\2\u0838\u0837\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u0838\3\2\2\2\u083a" +
                    "\u083b\3\2\2\2\u083b\u0125\3\2\2\2\u083c\u083d\7\u0090\2\2\u083d\u0848" +
                    "\5\u0138\u009d\2\u083e\u083f\7\u010a\2\2\u083f\u0845\t!\2\2\u0840\u0841" +
                    "\7\u00fe\2\2\u0841\u0842\7\13\2\2\u0842\u0843\7\u0089\2\2\u0843\u0844" +
                    "\t\"\2\2\u0844\u0846\7\u0096\2\2\u0845\u0840\3\2\2\2\u0845\u0846\3\2\2" +
                    "\2\u0846\u0848\3\2\2\2\u0847\u083c\3\2\2\2\u0847\u083e\3\2\2\2\u0848\u0127" +
                    "\3\2\2\2\u0849\u084b\b\u0095\1\2\u084a\u084c\7\u00a8\2\2\u084b\u084a\3" +
                    "\2\2\2\u084b\u084c\3\2\2\2\u084c\u084d\3\2\2\2\u084d\u084e\7\u0136\2\2" +
                    "\u084e\u084f\5\u0128\u0095\2\u084f\u0850\7\u0139\2\2\u0850\u0853\3\2\2" +
                    "\2\u0851\u0853\5\u012a\u0096\2\u0852\u0849\3\2\2\2\u0852\u0851\3\2\2\2" +
                    "\u0853\u085a\3\2\2\2\u0854\u0855\f\4\2\2\u0855\u0856\5\u0134\u009b\2\u0856" +
                    "\u0857\5\u0128\u0095\5\u0857\u0859\3\2\2\2\u0858\u0854\3\2\2\2\u0859\u085c" +
                    "\3\2\2\2\u085a\u0858\3\2\2\2\u085a\u085b\3\2\2\2\u085b\u0129\3\2\2\2\u085c" +
                    "\u085a\3\2\2\2\u085d\u0861\5\u012c\u0097\2\u085e\u0861\5\u0132\u009a\2" +
                    "\u085f\u0861\5\u0138\u009d\2\u0860\u085d\3\2\2\2\u0860\u085e\3\2\2\2\u0860" +
                    "\u085f\3\2\2\2\u0861\u012b\3\2\2\2\u0862\u0863\5\u0138\u009d\2\u0863\u0865" +
                    "\7\u0085\2\2\u0864\u0866\7\u00a8\2\2\u0865\u0864\3\2\2\2\u0865\u0866\3" +
                    "\2\2\2\u0866\u0867\3\2\2\2\u0867\u0868\7\u00aa\2\2\u0868\u087a\3\2\2\2" +
                    "\u0869\u086a\5\u0138\u009d\2\u086a\u086b\7\23\2\2\u086b\u086c\5\u0138" +
                    "\u009d\2\u086c\u086d\7\13\2\2\u086d\u086e\5\u0138\u009d\2\u086e\u087a" +
                    "\3\2\2\2\u086f\u0871\7\u00a8\2\2\u0870\u086f\3\2\2\2\u0870\u0871\3\2\2" +
                    "\2\u0871\u0872\3\2\2\2\u0872\u0873\7^\2\2\u0873\u0874\7\u0136\2\2\u0874" +
                    "\u0875\5\u00eex\2\u0875\u0876\7\u0139\2\2\u0876\u087a\3\2\2\2\u0877\u087a" +
                    "\5\u012e\u0098\2\u0878\u087a\5\u0130\u0099\2\u0879\u0862\3\2\2\2\u0879" +
                    "\u0869\3\2\2\2\u0879\u0870\3\2\2\2\u0879\u0877\3\2\2\2\u0879\u0878\3\2" +
                    "\2\2\u087a\u012d\3\2\2\2\u087b\u087d\5\u0138\u009d\2\u087c\u087e\7\u00a8" +
                    "\2\2\u087d\u087c\3\2\2\2\u087d\u087e\3\2\2\2\u087e\u087f\3\2\2\2\u087f" +
                    "\u0880\7v\2\2\u0880\u088a\7\u0136\2\2\u0881\u0886\5\u0138\u009d\2\u0882" +
                    "\u0883\7\u0128\2\2\u0883\u0885\5\u0138\u009d\2\u0884\u0882\3\2\2\2\u0885" +
                    "\u0888\3\2\2\2\u0886\u0884\3\2\2\2\u0886\u0887\3\2\2\2\u0887\u088b\3\2" +
                    "\2\2\u0888\u0886\3\2\2\2\u0889\u088b\5\u00eex\2\u088a\u0881\3\2\2\2\u088a" +
                    "\u0889\3\2\2\2\u088b\u088c\3\2\2\2\u088c\u088d\7\u0139\2\2\u088d\u012f" +
                    "\3\2\2\2\u088e\u088f\7\u0136\2\2\u088f\u0894\5\u0138\u009d\2\u0890\u0891" +
                    "\7\u0128\2\2\u0891\u0893\5\u0138\u009d\2\u0892\u0890\3\2\2\2\u0893\u0896" +
                    "\3\2\2\2\u0894\u0892\3\2\2\2\u0894\u0895\3\2\2\2\u0895\u0897\3\2\2\2\u0896" +
                    "\u0894\3\2\2\2\u0897\u0899\7\u0139\2\2\u0898\u089a\7\u00a8\2\2\u0899\u0898" +
                    "\3\2\2\2\u0899\u089a\3\2\2\2\u089a\u089b\3\2\2\2\u089b\u089c\7v\2\2\u089c" +
                    "\u089d\7\u0136\2\2\u089d\u089e\5\u00eex\2\u089e\u089f\7\u0139\2\2\u089f" +
                    "\u0131\3\2\2\2\u08a0\u08a1\5\u0138\u009d\2\u08a1\u08a2\5\u0136\u009c\2" +
                    "\u08a2\u08a3\5\u0138\u009d\2\u08a3\u0133\3\2\2\2\u08a4\u08a5\t#\2\2\u08a5" +
                    "\u0135\3\2\2\2\u08a6\u08b3\7\u012c\2\2\u08a7\u08b3\7\u012d\2\2\u08a8\u08b3" +
                    "\7\u012e\2\2\u08a9\u08b3\7\u012f\2\2\u08aa\u08b3\7\u0132\2\2\u08ab\u08b3" +
                    "\7\u0133\2\2\u08ac\u08b3\7\u0130\2\2\u08ad\u08b3\7\u0131\2\2\u08ae\u08b0" +
                    "\7\u00a8\2\2\u08af\u08ae\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0\u08b1\3\2\2" +
                    "\2\u08b1\u08b3\t$\2\2\u08b2\u08a6\3\2\2\2\u08b2\u08a7\3\2\2\2\u08b2\u08a8" +
                    "\3\2\2\2\u08b2\u08a9\3\2\2\2\u08b2\u08aa\3\2\2\2\u08b2\u08ab\3\2\2\2\u08b2" +
                    "\u08ac\3\2\2\2\u08b2\u08ad\3\2\2\2\u08b2\u08af\3\2\2\2\u08b3\u0137\3\2" +
                    "\2\2\u08b4\u08b5\b\u009d\1\2\u08b5\u08b6\7\u0136\2\2\u08b6\u08b7\5\u00ee" +
                    "x\2\u08b7\u08b8\7\u0139\2\2\u08b8\u08c6\3\2\2\2\u08b9\u08ba\7\u0136\2" +
                    "\2\u08ba\u08bb\5\u0138\u009d\2\u08bb\u08bc\7\u0139\2\2\u08bc\u08c6\3\2" +
                    "\2\2\u08bd\u08c6\5\u013c\u009f\2\u08be\u08c6\5\u0140\u00a1\2\u08bf\u08c6" +
                    "\5\u0144\u00a3\2\u08c0\u08c6\5\u014a\u00a6\2\u08c1\u08c6\5\u014c\u00a7" +
                    "\2\u08c2\u08c6\5\u0154\u00ab\2\u08c3\u08c6\5\u0156\u00ac\2\u08c4\u08c6" +
                    "\5\u013a\u009e\2\u08c5\u08b4\3\2\2\2\u08c5\u08b9\3\2\2\2\u08c5\u08bd\3" +
                    "\2\2\2\u08c5\u08be\3\2\2\2\u08c5\u08bf\3\2\2\2\u08c5\u08c0\3\2\2\2\u08c5" +
                    "\u08c1\3\2\2\2\u08c5\u08c2\3\2\2\2\u08c5\u08c3\3\2\2\2\u08c5\u08c4\3\2" +
                    "\2\2\u08c6\u08d7\3\2\2\2\u08c7\u08c8\f\20\2\2\u08c8\u08c9\7\u0134\2\2" +
                    "\u08c9\u08d6\5\u0138\u009d\21\u08ca\u08cb\f\17\2\2\u08cb\u08cc\7\u012a" +
                    "\2\2\u08cc\u08d6\5\u0138\u009d\20\u08cd\u08ce\f\16\2\2\u08ce\u08cf\7\u0126" +
                    "\2\2\u08cf\u08d6\5\u0138\u009d\17\u08d0\u08d1\f\r\2\2\u08d1\u08d2\7\u013c" +
                    "\2\2\u08d2\u08d6\5\u0138\u009d\16\u08d3\u08d4\f\21\2\2\u08d4\u08d6\5\u013e" +
                    "\u00a0\2\u08d5\u08c7\3\2\2\2\u08d5\u08ca\3\2\2\2\u08d5\u08cd\3\2\2\2\u08d5" +
                    "\u08d0\3\2\2\2\u08d5\u08d3\3\2\2\2\u08d6\u08d9\3\2\2\2\u08d7\u08d5\3\2" +
                    "\2\2\u08d7\u08d8\3\2\2\2\u08d8\u0139\3\2\2\2\u08d9\u08d7\3\2\2\2\u08da" +
                    "\u08e3\5\u015c\u00af\2\u08db\u08e3\5\u015e\u00b0\2\u08dc\u08e3\5\u0168" +
                    "\u00b5\2\u08dd\u08e3\5\u0160\u00b1\2\u08de\u08e3\5\u0162\u00b2\2\u08df" +
                    "\u08e3\5\u0166\u00b4\2\u08e0\u08e3\5\u0164\u00b3\2\u08e1\u08e3\5\u016a" +
                    "\u00b6\2\u08e2\u08da\3\2\2\2\u08e2\u08db\3\2\2\2\u08e2\u08dc\3\2\2\2\u08e2" +
                    "\u08dd\3\2\2\2\u08e2\u08de\3\2\2\2\u08e2\u08df\3\2\2\2\u08e2\u08e0\3\2" +
                    "\2\2\u08e2\u08e1\3\2\2\2\u08e3\u013b\3\2\2\2\u08e4\u08e5\7\u0082\2\2\u08e5" +
                    "\u08e6\5\u0138\u009d\2\u08e6\u08e7\5\u013e\u00a0\2\u08e7\u013d\3\2\2\2" +
                    "\u08e8\u08e9\t%\2\2\u08e9\u013f\3\2\2\2\u08ea\u08eb\5\u0142\u00a2\2\u08eb" +
                    "\u08ec\t&\2\2\u08ec\u08f1\5\u0142\u00a2\2\u08ed\u08ee\t&\2\2\u08ee\u08f0" +
                    "\5\u0142\u00a2\2\u08ef\u08ed\3\2\2\2\u08f0\u08f3\3\2\2\2\u08f1\u08ef\3" +
                    "\2\2\2\u08f1\u08f2\3\2\2\2\u08f2\u0141\3\2\2\2\u08f3\u08f1\3\2\2\2\u08f4" +
                    "\u08f5\7\u0136\2\2\u08f5\u08f6\5\u0138\u009d\2\u08f6\u08f7\7\u0139\2\2" +
                    "\u08f7\u08fe\3\2\2\2\u08f8\u08fe\5\u0144\u00a3\2\u08f9\u08fe\5\u014c\u00a7" +
                    "\2\u08fa\u08fe\5\u0154\u00ab\2\u08fb\u08fe\5\u0156\u00ac\2\u08fc\u08fe" +
                    "\5";
    private static final String _serializedATNSegment1 =
            "\u013a\u009e\2\u08fd\u08f4\3\2\2\2\u08fd\u08f8\3\2\2\2\u08fd\u08f9\3\2" +
                    "\2\2\u08fd\u08fa\3\2\2\2\u08fd\u08fb\3\2\2\2\u08fd\u08fc\3\2\2\2\u08fe" +
                    "\u0143\3\2\2\2\u08ff\u0902\5\u0146\u00a4\2\u0900\u0902\5\u0148\u00a5\2" +
                    "\u0901\u08ff\3\2\2\2\u0901\u0900\3\2\2\2\u0902\u0145\3\2\2\2\u0903\u0904" +
                    "\7\37\2\2\u0904\u090a\5\u0138\u009d\2\u0905\u0906\7\u0107\2\2\u0906\u0907" +
                    "\5\u0138\u009d\2\u0907\u0908\7\u00f2\2\2\u0908\u0909\5\u0138\u009d\2\u0909" +
                    "\u090b\3\2\2\2\u090a\u0905\3\2\2\2\u090b\u090c\3\2\2\2\u090c\u090a\3\2" +
                    "\2\2\u090c\u090d\3\2\2\2\u090d\u0910\3\2\2\2\u090e\u090f\7R\2\2\u090f" +
                    "\u0911\5\u0138\u009d\2\u0910\u090e\3\2\2\2\u0910\u0911\3\2\2\2\u0911\u0912" +
                    "\3\2\2\2\u0912\u0913\7V\2\2\u0913\u0147\3\2\2\2\u0914\u091a\7\37\2\2\u0915" +
                    "\u0916\7\u0107\2\2\u0916\u0917\5\u0128\u0095\2\u0917\u0918\7\u00f2\2\2" +
                    "\u0918\u0919\5\u0138\u009d\2\u0919\u091b\3\2\2\2\u091a\u0915\3\2\2\2\u091b" +
                    "\u091c\3\2\2\2\u091c\u091a\3\2\2\2\u091c\u091d\3\2\2\2\u091d\u0920\3\2" +
                    "\2\2\u091e\u091f\7R\2\2\u091f\u0921\5\u0138\u009d\2\u0920\u091e\3\2\2" +
                    "\2\u0920\u0921\3\2\2\2\u0921\u0922\3\2\2\2\u0922\u0923\7V\2\2\u0923\u0149" +
                    "\3\2\2\2\u0924\u0925\5\u0160\u00b1\2\u0925\u0926\7\5\2\2\u0926\u0927\t" +
                    "\'\2\2\u0927\u014b\3\2\2\2\u0928\u0929\7\21\2\2\u0929\u092b\7\u0136\2" +
                    "\2\u092a\u092c\5\u014e\u00a8\2\u092b\u092a\3\2\2\2\u092b\u092c\3\2\2\2" +
                    "\u092c\u092d\3\2\2\2\u092d\u092e\5\u0138\u009d\2\u092e\u0930\7\u0139\2" +
                    "\2\u092f\u0931\5\u0150\u00a9\2\u0930\u092f\3\2\2\2\u0930\u0931\3\2\2\2" +
                    "\u0931\u09c1\3\2\2\2\u0932\u0933\7\62\2\2\u0933\u0939\7\u0136\2\2\u0934" +
                    "\u0936\5\u014e\u00a8\2\u0935\u0934\3\2\2\2\u0935\u0936\3\2\2\2\u0936\u0937" +
                    "\3\2\2\2\u0937\u093a\5\u0138\u009d\2\u0938\u093a\7\u0134\2\2\u0939\u0935" +
                    "\3\2\2\2\u0939\u0938\3\2\2\2\u093a\u093b\3\2\2\2\u093b\u093d\7\u0139\2" +
                    "\2\u093c\u093e\5\u0150\u00a9\2\u093d\u093c\3\2\2\2\u093d\u093e\3\2\2\2" +
                    "\u093e\u09c1\3\2\2\2\u093f\u0940\7\63\2\2\u0940\u0946\7\u0136\2\2\u0941" +
                    "\u0943\5\u014e\u00a8\2\u0942\u0941\3\2\2\2\u0942\u0943\3\2\2\2\u0943\u0944" +
                    "\3\2\2\2\u0944\u0947\5\u0138\u009d\2\u0945\u0947\7\u0134\2\2\u0946\u0942" +
                    "\3\2\2\2\u0946\u0945\3\2\2\2\u0947\u0948\3\2\2\2\u0948\u094a\7\u0139\2" +
                    "\2\u0949\u094b\5\u0150\u00a9\2\u094a\u0949\3\2\2\2\u094a\u094b\3\2\2\2" +
                    "\u094b\u09c1\3\2\2\2\u094c\u094d\7\u010f\2\2\u094d\u094e\7\u0136\2\2\u094e" +
                    "\u094f\7\u0139\2\2\u094f\u09c1\5\u0150\u00a9\2\u0950\u0951\7\u0113\2\2" +
                    "\u0951\u0952\7\u0136\2\2\u0952\u0953\7\u0139\2\2\u0953\u09c1\5\u0150\u00a9" +
                    "\2\u0954\u0955\7\u0114\2\2\u0955\u0956\7\u0136\2\2\u0956\u0957\5\u0138" +
                    "\u009d\2\u0957\u0958\7\u0139\2\2\u0958\u0959\5\u0150\u00a9\2\u0959\u09c1" +
                    "\3\2\2\2\u095a\u095b\7\u0115\2\2\u095b\u095c\7\u0136\2\2\u095c\u0963\5" +
                    "\u0138\u009d\2\u095d\u095e\7\u0128\2\2\u095e\u0961\5\u0138\u009d\2\u095f" +
                    "\u0960\7\u0128\2\2\u0960\u0962\5\u0138\u009d\2\u0961\u095f\3\2\2\2\u0961" +
                    "\u0962\3\2\2\2\u0962\u0964\3\2\2\2\u0963\u095d\3\2\2\2\u0963\u0964\3\2" +
                    "\2\2\u0964\u0965\3\2\2\2\u0965\u0966\7\u0139\2\2\u0966\u0967\5\u0150\u00a9" +
                    "\2\u0967\u09c1\3\2\2\2\u0968\u0969\7\u0116\2\2\u0969\u096a\7\u0136\2\2" +
                    "\u096a\u096b\5\u0138\u009d\2\u096b\u096c\7\u0139\2\2\u096c\u096d\5\u0150" +
                    "\u00a9\2\u096d\u09c1\3\2\2\2\u096e\u096f\7\u0117\2\2\u096f\u0970\7\u0136" +
                    "\2\2\u0970\u0977\5\u0138\u009d\2\u0971\u0972\7\u0128\2\2\u0972\u0975\5" +
                    "\u0138\u009d\2\u0973\u0974\7\u0128\2\2\u0974\u0976\5\u0138\u009d\2\u0975" +
                    "\u0973\3\2\2\2\u0975\u0976\3\2\2\2\u0976\u0978\3\2\2\2\u0977\u0971\3\2" +
                    "\2\2\u0977\u0978\3\2\2\2\u0978\u0979\3\2\2\2\u0979\u097a\7\u0139\2\2\u097a" +
                    "\u097b\5\u0150\u00a9\2\u097b\u09c1\3\2\2\2\u097c\u097d\7\u009c\2\2\u097d" +
                    "\u097f\7\u0136\2\2\u097e\u0980\5\u014e\u00a8\2\u097f\u097e\3\2\2\2\u097f" +
                    "\u0980\3\2\2\2\u0980\u0981\3\2\2\2\u0981\u0982\5\u0138\u009d\2\u0982\u0984" +
                    "\7\u0139\2\2\u0983\u0985\5\u0150\u00a9\2\u0984\u0983\3\2\2\2\u0984\u0985" +
                    "\3\2\2\2\u0985\u09c1\3\2\2\2\u0986\u0987\7\u00a1\2\2\u0987\u0989\7\u0136" +
                    "\2\2\u0988\u098a\5\u014e\u00a8\2\u0989\u0988\3\2\2\2\u0989\u098a\3\2\2" +
                    "\2\u098a\u098b\3\2\2\2\u098b\u098c\5\u0138\u009d\2\u098c\u098e\7\u0139" +
                    "\2\2\u098d\u098f\5\u0150\u00a9\2\u098e\u098d\3\2\2\2\u098e\u098f\3\2\2" +
                    "\2\u098f\u09c1\3\2\2\2\u0990\u0991\7\u0120\2\2\u0991\u0992\7\u0136\2\2" +
                    "\u0992\u0993\7\u0139\2\2\u0993\u09c1\5\u0150\u00a9\2\u0994\u0995\7\u0121" +
                    "\2\2\u0995\u0996\7\u0136\2\2\u0996\u0997\7\u0139\2\2\u0997\u09c1\5\u0150" +
                    "\u00a9\2\u0998\u0999\7\u0122\2\2\u0999\u099b\7\u0136\2\2\u099a\u099c\5" +
                    "\u014e\u00a8\2\u099b\u099a\3\2\2\2\u099b\u099c\3\2\2\2\u099c\u099d\3\2" +
                    "\2\2\u099d\u099e\5\u0138\u009d\2\u099e\u09a0\7\u0139\2\2\u099f\u09a1\5" +
                    "\u0150\u00a9\2\u09a0\u099f\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1\u09c1\3\2" +
                    "\2\2\u09a2\u09a3\7\u00eb\2\2\u09a3\u09a5\7\u0136\2\2\u09a4\u09a6\5\u014e" +
                    "\u00a8\2\u09a5\u09a4\3\2\2\2\u09a5\u09a6\3\2\2\2\u09a6\u09a7\3\2\2\2\u09a7" +
                    "\u09a8\5\u0138\u009d\2\u09a8\u09aa\7\u0139\2\2\u09a9\u09ab\5\u0150\u00a9" +
                    "\2\u09aa\u09a9\3\2\2\2\u09aa\u09ab\3\2\2\2\u09ab\u09c1\3\2\2\2\u09ac\u09ad" +
                    "\7\u0102\2\2\u09ad\u09af\7\u0136\2\2\u09ae\u09b0\5\u014e\u00a8\2\u09af" +
                    "\u09ae\3\2\2\2\u09af\u09b0\3\2\2\2\u09b0\u09b1\3\2\2\2\u09b1\u09b2\5\u0138" +
                    "\u009d\2\u09b2\u09b4\7\u0139\2\2\u09b3\u09b5\5\u0150\u00a9\2\u09b4\u09b3" +
                    "\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5\u09c1\3\2\2\2\u09b6\u09b7\7\u0124\2" +
                    "\2\u09b7\u09b9\7\u0136\2\2\u09b8\u09ba\5\u014e\u00a8\2\u09b9\u09b8\3\2" +
                    "\2\2\u09b9\u09ba\3\2\2\2\u09ba\u09bb\3\2\2\2\u09bb\u09bc\5\u0138\u009d" +
                    "\2\u09bc\u09be\7\u0139\2\2\u09bd\u09bf\5\u0150\u00a9\2\u09be\u09bd\3\2" +
                    "\2\2\u09be\u09bf\3\2\2\2\u09bf\u09c1\3\2\2\2\u09c0\u0928\3\2\2\2\u09c0" +
                    "\u0932\3\2\2\2\u09c0\u093f\3\2\2\2\u09c0\u094c\3\2\2\2\u09c0\u0950\3\2" +
                    "\2\2\u09c0\u0954\3\2\2\2\u09c0\u095a\3\2\2\2\u09c0\u0968\3\2\2\2\u09c0" +
                    "\u096e\3\2\2\2\u09c0\u097c\3\2\2\2\u09c0\u0986\3\2\2\2\u09c0\u0990\3\2" +
                    "\2\2\u09c0\u0994\3\2\2\2\u09c0\u0998\3\2\2\2\u09c0\u09a2\3\2\2\2\u09c0" +
                    "\u09ac\3\2\2\2\u09c0\u09b6\3\2\2\2\u09c1\u014d\3\2\2\2\u09c2\u09c3\t\37" +
                    "\2\2\u09c3\u014f\3\2\2\2\u09c4\u09c5\7\u00b4\2\2\u09c5\u09c7\7\u0136\2" +
                    "\2\u09c6\u09c8\5\u0152\u00aa\2\u09c7\u09c6\3\2\2\2\u09c7\u09c8\3\2\2\2" +
                    "\u09c8\u09ca\3\2\2\2\u09c9\u09cb\5\u0122\u0092\2\u09ca\u09c9\3\2\2\2\u09ca" +
                    "\u09cb\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u09cd\7\u0139\2\2\u09cd\u0151" +
                    "\3\2\2\2\u09ce\u09cf\7\u00b7\2\2\u09cf\u09d0\7\33\2\2\u09d0\u09d5\5\u0138" +
                    "\u009d\2\u09d1\u09d2\7\u0128\2\2\u09d2\u09d4\5\u0138\u009d\2\u09d3\u09d1" +
                    "\3\2\2\2\u09d4\u09d7\3\2\2\2\u09d5\u09d3\3\2\2\2\u09d5\u09d6\3\2\2\2\u09d6" +
                    "\u0153\3\2\2\2\u09d7\u09d5\3\2\2\2\u09d8\u0aa1\7\u010e\2\2\u09d9\u09da" +
                    "\7!\2\2\u09da\u09db\7\u0136\2\2\u09db\u09dc\5\u0138\u009d\2\u09dc\u09dd" +
                    "\7\f\2\2\u09dd\u09df\5~@\2\u09de\u09e0\5\u0080A\2\u09df\u09de\3\2\2\2" +
                    "\u09df\u09e0\3\2\2\2\u09e0\u09e1\3\2\2\2\u09e1\u09e2\7\u0139\2\2\u09e2" +
                    "\u0aa1\3\2\2\2\u09e3\u09e4\7\62\2\2\u09e4\u09e7\7\u0136\2\2\u09e5\u09e8" +
                    "\5\u0138\u009d\2\u09e6\u09e8\7\u0134\2\2\u09e7\u09e5\3\2\2\2\u09e7\u09e6" +
                    "\3\2\2\2\u09e8\u09e9\3\2\2\2\u09e9\u0aa1\7\u0139\2\2\u09ea\u0aa1\7\u0110" +
                    "\2\2\u09eb\u09ec\78\2\2\u09ec\u0aa1\7;\2\2\u09ed\u09f1\7\u0111\2\2\u09ee" +
                    "\u09ef\78\2\2\u09ef\u09f1\7\u00f3\2\2\u09f0\u09ed\3\2\2\2\u09f0\u09ee" +
                    "\3\2\2\2\u09f1\u09f6\3\2\2\2\u09f2\u09f3\7\u0136\2\2\u09f3\u09f4\5\u0138" +
                    "\u009d\2\u09f4\u09f5\7\u0139\2\2\u09f5\u09f7\3\2\2\2\u09f6\u09f2\3\2\2" +
                    "\2\u09f6\u09f7\3\2\2\2\u09f7\u0aa1\3\2\2\2\u09f8\u0aa1\7\u0112\2\2\u09f9" +
                    "\u09fa\78\2\2\u09fa\u0aa1\7\u0125\2\2\u09fb\u09fc\7\u0118\2\2\u09fc\u09fd" +
                    "\7\u0136\2\2\u09fd\u0a0a\5\u0138\u009d\2\u09fe\u09ff\7\u0128\2\2\u09ff" +
                    "\u0a07\5\u0138\u009d\2\u0a00\u0a01\7\u0128\2\2\u0a01\u0a02\5\u0138\u009d" +
                    "\2\u0a02\u0a03\7\u012c\2\2\u0a03\u0a04\5\u0138\u009d\2\u0a04\u0a06\3\2" +
                    "\2\2\u0a05\u0a00\3\2\2\2\u0a06\u0a09\3\2\2\2\u0a07\u0a05\3\2\2\2\u0a07" +
                    "\u0a08\3\2\2\2\u0a08\u0a0b\3\2\2\2\u0a09\u0a07\3\2\2\2\u0a0a\u09fe\3\2" +
                    "\2\2\u0a0a\u0a0b\3\2\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c\u0a0d\7\u0139\2\2\u0a0d" +
                    "\u0aa1\3\2\2\2\u0a0e\u0a0f\7\u0119\2\2\u0a0f\u0a10\7\u0136\2\2\u0a10\u0a1d" +
                    "\5\u0138\u009d\2\u0a11\u0a12\7\u0128\2\2\u0a12\u0a1a\5\u0138\u009d\2\u0a13" +
                    "\u0a14\7\u0128\2\2\u0a14\u0a15\5\u0138\u009d\2\u0a15\u0a16\7\u012c\2\2" +
                    "\u0a16\u0a17\5\u0138\u009d\2\u0a17\u0a19\3\2\2\2\u0a18\u0a13\3\2\2\2\u0a19" +
                    "\u0a1c\3\2\2\2\u0a1a\u0a18\3\2\2\2\u0a1a\u0a1b\3\2\2\2\u0a1b\u0a1e\3\2" +
                    "\2\2\u0a1c\u0a1a\3\2\2\2\u0a1d\u0a11\3\2\2\2\u0a1d\u0a1e\3\2\2\2\u0a1e" +
                    "\u0a1f\3\2\2\2\u0a1f\u0a20\7\u0139\2\2\u0a20\u0aa1\3\2\2\2\u0a21\u0a22" +
                    "\7\u011a\2\2\u0a22\u0a23\7\u0136\2\2\u0a23\u0a30\5\u0138\u009d\2\u0a24" +
                    "\u0a25\7\u0128\2\2\u0a25\u0a2d\5\u0138\u009d\2\u0a26\u0a27\7\u0128\2\2" +
                    "\u0a27\u0a28\5\u0138\u009d\2\u0a28\u0a29\7\u012c\2\2\u0a29\u0a2a\5\u0138" +
                    "\u009d\2\u0a2a\u0a2c\3\2\2\2\u0a2b\u0a26\3\2\2\2\u0a2c\u0a2f\3\2\2\2\u0a2d" +
                    "\u0a2b\3\2\2\2\u0a2d\u0a2e\3\2\2\2\u0a2e\u0a31\3\2\2\2\u0a2f\u0a2d\3\2" +
                    "\2\2\u0a30\u0a24\3\2\2\2\u0a30\u0a31\3\2\2\2\u0a31\u0a32\3\2\2\2\u0a32" +
                    "\u0a33\7\u0139\2\2\u0a33\u0aa1\3\2\2\2\u0a34\u0a35\7\u011b\2\2\u0a35\u0a36" +
                    "\7\u0136\2\2\u0a36\u0a43\5\u0138\u009d\2\u0a37\u0a38\7\u0128\2\2\u0a38" +
                    "\u0a40\5\u0138\u009d\2\u0a39\u0a3a\7\u0128\2\2\u0a3a\u0a3b\5\u0138\u009d" +
                    "\2\u0a3b\u0a3c\7\u012c\2\2\u0a3c\u0a3d\5\u0138\u009d\2\u0a3d\u0a3f\3\2" +
                    "\2\2\u0a3e\u0a39\3\2\2\2\u0a3f\u0a42\3\2\2\2\u0a40\u0a3e\3\2\2\2\u0a40" +
                    "\u0a41\3\2\2\2\u0a41\u0a44\3\2\2\2\u0a42\u0a40\3\2\2\2\u0a43\u0a37\3\2" +
                    "\2\2\u0a43\u0a44\3\2\2\2\u0a44\u0a45\3\2\2\2\u0a45\u0a46\7\u0139\2\2\u0a46" +
                    "\u0aa1\3\2\2\2\u0a47\u0a48\7\u011c\2\2\u0a48\u0a49\7\u0136\2\2\u0a49\u0a56" +
                    "\5\u0138\u009d\2\u0a4a\u0a4b\7\u0128\2\2\u0a4b\u0a53\5\u0138\u009d\2\u0a4c" +
                    "\u0a4d\7\u0128\2\2\u0a4d\u0a4e\5\u0138\u009d\2\u0a4e\u0a4f\7\u012c\2\2" +
                    "\u0a4f\u0a50\5\u0138\u009d\2\u0a50\u0a52\3\2\2\2\u0a51\u0a4c\3\2\2\2\u0a52" +
                    "\u0a55\3\2\2\2\u0a53\u0a51\3\2\2\2\u0a53\u0a54\3\2\2\2\u0a54\u0a57\3\2" +
                    "\2\2\u0a55\u0a53\3\2\2\2\u0a56\u0a4a\3\2\2\2\u0a56\u0a57\3\2\2\2\u0a57" +
                    "\u0a58\3\2\2\2\u0a58\u0a59\7\u0139\2\2\u0a59\u0aa1\3\2\2\2\u0a5a\u0a5b" +
                    "\7\u011d\2\2\u0a5b\u0a5c\7\u0136\2\2\u0a5c\u0a69\5\u0138\u009d\2\u0a5d" +
                    "\u0a5e\7\u0128\2\2\u0a5e\u0a66\5\u0138\u009d\2\u0a5f\u0a60\7\u0128\2\2" +
                    "\u0a60\u0a61\5\u0138\u009d\2\u0a61\u0a62\7\u012c\2\2\u0a62\u0a63\5\u0138" +
                    "\u009d\2\u0a63\u0a65\3\2\2\2\u0a64\u0a5f\3\2\2\2\u0a65\u0a68\3\2\2\2\u0a66" +
                    "\u0a64\3\2\2\2\u0a66\u0a67\3\2\2\2\u0a67\u0a6a\3\2\2\2\u0a68\u0a66\3\2" +
                    "\2\2\u0a69\u0a5d\3\2\2\2\u0a69\u0a6a\3\2\2\2\u0a6a\u0a6b\3\2\2\2\u0a6b" +
                    "\u0a6c\7\u0139\2\2\u0a6c\u0aa1\3\2\2\2\u0a6d\u0a6e\7\u011e\2\2\u0a6e\u0a6f" +
                    "\7\u0136\2\2\u0a6f\u0a77\5\u0138\u009d\2\u0a70\u0a71\7\u0128\2\2\u0a71" +
                    "\u0a72\5\u0138\u009d\2\u0a72\u0a73\7\u012c\2\2\u0a73\u0a74\5\u0138\u009d" +
                    "\2\u0a74\u0a76\3\2\2\2\u0a75\u0a70\3\2\2\2\u0a76\u0a79\3\2\2\2\u0a77\u0a75" +
                    "\3\2\2\2\u0a77\u0a78\3\2\2\2\u0a78\u0a7a\3\2\2\2\u0a79\u0a77\3\2\2\2\u0a7a" +
                    "\u0a7b\7\u0139\2\2\u0a7b\u0aa1\3\2\2\2\u0a7c\u0a7d\7\u011f\2\2\u0a7d\u0a7e" +
                    "\7\u0136\2\2\u0a7e\u0a84\5\u0138\u009d\2\u0a7f\u0a80\7\u0128\2\2\u0a80" +
                    "\u0a81\5\u0138\u009d\2\u0a81\u0a82\7\u012c\2\2\u0a82\u0a83\5\u0138\u009d" +
                    "\2\u0a83\u0a85\3\2\2\2\u0a84\u0a7f\3\2\2\2\u0a85\u0a86\3\2\2\2\u0a86\u0a84" +
                    "\3\2\2\2\u0a86\u0a87\3\2\2\2\u0a87\u0a8a\3\2\2\2\u0a88\u0a89\7\u0128\2" +
                    "\2\u0a89\u0a8b\5\u0138\u009d\2\u0a8a\u0a88\3\2\2\2\u0a8a\u0a8b\3\2\2\2" +
                    "\u0a8b\u0a8c\3\2\2\2\u0a8c\u0a8d\7\u0139\2\2\u0a8d\u0aa1\3\2\2\2\u0a8e" +
                    "\u0a8f\7\u00d3\2\2\u0a8f\u0a90\7\u0136\2\2\u0a90\u0a91\5\u0138\u009d\2" +
                    "\u0a91\u0a92\7\u0139\2\2\u0a92\u0aa1\3\2\2\2\u0a93\u0a94\7\u00ea\2\2\u0a94" +
                    "\u0a95\7\u0136\2\2\u0a95\u0a96\5\u0138\u009d\2\u0a96\u0a97\7h\2\2\u0a97" +
                    "\u0a9a\5\u0138\u009d\2\u0a98\u0a99\7d\2\2\u0a99\u0a9b\5\u0138\u009d\2" +
                    "\u0a9a\u0a98\3\2\2\2\u0a9a\u0a9b\3\2\2\2\u0a9b\u0a9c\3\2\2\2\u0a9c\u0a9d" +
                    "\7\u0139\2\2\u0a9d\u0aa1\3\2\2\2\u0a9e\u0aa1\7\u0123\2\2\u0a9f\u0aa1\7" +
                    "\u0125\2\2\u0aa0\u09d8\3\2\2\2\u0aa0\u09d9\3\2\2\2\u0aa0\u09e3\3\2\2\2" +
                    "\u0aa0\u09ea\3\2\2\2\u0aa0\u09eb\3\2\2\2\u0aa0\u09f0\3\2\2\2\u0aa0\u09f8" +
                    "\3\2\2\2\u0aa0\u09f9\3\2\2\2\u0aa0\u09fb\3\2\2\2\u0aa0\u0a0e\3\2\2\2\u0aa0" +
                    "\u0a21\3\2\2\2\u0aa0\u0a34\3\2\2\2\u0aa0\u0a47\3\2\2\2\u0aa0\u0a5a\3\2" +
                    "\2\2\u0aa0\u0a6d\3\2\2\2\u0aa0\u0a7c\3\2\2\2\u0aa0\u0a8e\3\2\2\2\u0aa0" +
                    "\u0a93\3\2\2\2\u0aa0\u0a9e\3\2\2\2\u0aa0\u0a9f\3\2\2\2\u0aa1\u0155\3\2" +
                    "\2\2\u0aa2\u0aa3\5\u0160\u00b1\2\u0aa3\u0aa5\7\u0136\2\2\u0aa4\u0aa6\5" +
                    "\u0158\u00ad\2\u0aa5\u0aa4\3\2\2\2\u0aa5\u0aa6\3\2\2\2\u0aa6\u0aa7\3\2" +
                    "\2\2\u0aa7\u0aa8\7\u0139\2\2\u0aa8\u0157\3\2\2\2\u0aa9\u0aae\5\u015a\u00ae" +
                    "\2\u0aaa\u0aab\7\u0128\2\2\u0aab\u0aad\5\u015a\u00ae\2\u0aac\u0aaa\3\2" +
                    "\2\2\u0aad\u0ab0\3\2\2\2\u0aae\u0aac\3\2\2\2\u0aae\u0aaf\3\2\2\2\u0aaf" +
                    "\u0159\3\2\2\2\u0ab0\u0aae\3\2\2\2\u0ab1\u0ab7\6\u00ae\r\2\u0ab2\u0ab3" +
                    "\5\u0160\u00b1\2\u0ab3\u0ab5\7\u012c\2\2\u0ab4\u0ab6\7\u0130\2\2\u0ab5" +
                    "\u0ab4\3\2\2\2\u0ab5\u0ab6\3\2\2\2\u0ab6\u0ab8\3\2\2\2\u0ab7\u0ab2\3\2" +
                    "\2\2\u0ab7\u0ab8\3\2\2\2\u0ab8\u0ab9\3\2\2\2\u0ab9\u0aba\5\u0138\u009d" +
                    "\2\u0aba\u015b\3\2\2\2\u0abb\u0abc\7;\2\2\u0abc\u0abd\5\u0162\u00b2\2" +
                    "\u0abd\u015d\3\2\2\2\u0abe\u0abf\7\u00f3\2\2\u0abf\u0ac0\5\u0162\u00b2" +
                    "\2\u0ac0\u015f\3\2\2\2\u0ac1\u0ac4\7\u013d\2\2\u0ac2\u0ac4\5\u016e\u00b8" +
                    "\2\u0ac3\u0ac1\3\2\2\2\u0ac3\u0ac2\3\2\2\2\u0ac4\u0acc\3\2\2\2\u0ac5\u0ac8" +
                    "\7\6\2\2\u0ac6\u0ac9\7\u013d\2\2\u0ac7\u0ac9\5\u016e\u00b8\2\u0ac8\u0ac6" +
                    "\3\2\2\2\u0ac8\u0ac7\3\2\2\2\u0ac9\u0acb\3\2\2\2\u0aca\u0ac5\3\2\2\2\u0acb" +
                    "\u0ace\3\2\2\2\u0acc\u0aca\3\2\2\2\u0acc\u0acd\3\2\2\2\u0acd\u0161\3\2" +
                    "\2\2\u0ace\u0acc\3\2\2\2\u0acf\u0ad2\7\u013e\2\2\u0ad0\u0ad2\7\u013f\2" +
                    "\2\u0ad1\u0acf\3\2\2\2\u0ad1\u0ad0\3\2\2\2\u0ad2\u0163\3\2\2\2\u0ad3\u0ad5" +
                    "\t(\2\2\u0ad4\u0ad3\3\2\2\2\u0ad4\u0ad5\3\2\2\2\u0ad5\u0ad6\3\2\2\2\u0ad6" +
                    "\u0ad7\7\u0140\2\2\u0ad7\u0165\3\2\2\2\u0ad8\u0ada\t(\2\2\u0ad9\u0ad8" +
                    "\3\2\2\2\u0ad9\u0ada\3\2\2\2\u0ada\u0adb\3\2\2\2\u0adb\u0adc\7\u0141\2" +
                    "\2\u0adc\u0167\3\2\2\2\u0add\u0ade\t)\2\2\u0ade\u0169\3\2\2\2\u0adf\u0ae0" +
                    "\7\u00aa\2\2\u0ae0\u016b\3\2\2\2\u0ae1\u0ae2\7\7\2\2\u0ae2\u016d\3\2\2" +
                    "\2\u0ae3\u0ae4\t*\2\2\u0ae4\u016f\3\2\2\2\u015b\u0175\u0178\u017c\u017f" +
                    "\u0184\u018b\u0191\u0193\u019c\u019f\u01a1\u01c4\u01c9\u01cf\u01d3\u01de" +
                    "\u01e4\u01ec\u01fa\u0203\u0205\u0209\u0211\u0215\u021d\u0224\u022a\u022d" +
                    "\u0235\u023b\u023f\u0245\u0255\u025c\u0262\u0266\u026f\u0274\u027c\u0281" +
                    "\u028a\u0296\u029b\u029e\u02a8\u02b1\u02bf\u02c3\u02ce\u02d9\u02e3\u02ea" +
                    "\u02f1\u02f5\u02f9\u02fe\u0302\u0307\u030b\u030f\u031c\u032e\u0336\u033c" +
                    "\u0345\u0349\u0351\u0354\u0359\u035e\u0365\u036c\u036f\u0376\u037c\u0381" +
                    "\u0387\u038c\u038f\u0395\u03a3\u03ad\u03b3\u03b8\u03bd\u03c2\u03c6\u03cb" +
                    "\u03ce\u03d8\u03e4\u03eb\u03ee\u03fa\u03ff\u0404\u0407\u040e\u041a\u0427" +
                    "\u0429\u042e\u0431\u0440\u0446\u0451\u0454\u045e\u0465\u046b\u0473\u047d" +
                    "\u0491\u0497\u049b\u04a0\u04a4\u04a9\u04ac\u04b1\u04b4\u04c2\u04e1\u04e3" +
                    "\u04e8\u04ec\u04f1\u04f8\u04fb\u04fe\u0503\u0507\u0509\u0510\u0516\u051d" +
                    "\u0523\u0526\u052b\u052f\u0532\u0539\u053f\u0542\u054c\u0555\u055c\u0563" +
                    "\u0565\u056b\u056e\u0579\u0582\u0588\u058e\u0591\u0596\u0599\u059c\u059f" +
                    "\u05a2\u05a8\u05b2\u05bd\u05c0\u05c7\u05cc\u05d1\u05d5\u05dd\u05e1\u05e6" +
                    "\u05ea\u05ec\u05f1\u05f9\u05fe\u0602\u060a\u0612\u0615\u0618\u061d\u0626" +
                    "\u062a\u0634\u0646\u064a\u064e\u0658\u065e\u0662\u0666\u0672\u0679\u0689" +
                    "\u0690\u0694\u0698\u069c\u06ac\u06b6\u06c3\u06c7\u06e3\u06e7\u06f2\u070c" +
                    "\u0712\u0717\u071b\u0723\u0729\u0730\u073d\u0745\u0750\u0758\u075c\u0760" +
                    "\u0764\u0766\u076b\u076e\u0771\u0774\u0778\u077b\u077e\u0781\u0784\u078b" +
                    "\u0796\u079a\u079d\u07a1\u07a8\u07ac\u07b6\u07be\u07c4\u07c8\u07ce\u07d7" +
                    "\u07da\u07df\u07e2\u07ec\u07f1\u07fa\u07ff\u0803\u080c\u0810\u081e\u082b" +
                    "\u0830\u0834\u083a\u0845\u0847\u084b\u0852\u085a\u0860\u0865\u0870\u0879" +
                    "\u087d\u0886\u088a\u0894\u0899\u08af\u08b2\u08c5\u08d5\u08d7\u08e2\u08f1" +
                    "\u08fd\u0901\u090c\u0910\u091c\u0920\u092b\u0930\u0935\u0939\u093d\u0942" +
                    "\u0946\u094a\u0961\u0963\u0975\u0977\u097f\u0984\u0989\u098e\u099b\u09a0" +
                    "\u09a5\u09aa\u09af\u09b4\u09b9\u09be\u09c0\u09c7\u09ca\u09d5\u09df\u09e7" +
                    "\u09f0\u09f6\u0a07\u0a0a\u0a1a\u0a1d\u0a2d\u0a30\u0a40\u0a43\u0a53\u0a56" +
                    "\u0a66\u0a69\u0a77\u0a86\u0a8a\u0a9a\u0aa0\u0aa5\u0aae\u0ab5\u0ab7\u0ac3" +
                    "\u0ac8\u0acc\u0ad1\u0ad4\u0ad9";

    static {
        RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "program", "block", "begin_end_block", "single_block_stmt", "block_end",
                "proc_block", "stmt", "error_stmt", "invalid_bool_expr", "invalid_cpp_function_stmt",
                "invalid_cpp_function_header", "invalid_cpp_function_params_clause",
                "invalid_cpp_function_param", "invalid_cpp_function_body", "exception_block",
                "exception_block_item", "semicolon_stmt", "null_stmt", "expr_stmt", "assignment_stmt",
                "assignment_stmt_item", "assignment_stmt_single_item", "assignment_stmt_multiple_item",
                "assignment_stmt_select_item", "associate_locator_stmt", "break_stmt",
                "call_stmt", "close_stmt", "declare_stmt", "declare_block", "declare_block_inplace",
                "declare_stmt_item", "declare_var_item", "declare_condition_item", "declare_handler_item",
                "create_type_stmt", "create_type_definition", "create_type_items", "create_type_items_item",
                "declare_temporary_table_item", "create_table_stmt", "create_local_temp_table_stmt",
                "create_table_definition", "create_table_columns", "create_table_columns_item",
                "column_name", "create_table_column_inline_cons", "create_table_column_cons",
                "create_table_fk_action", "create_table_preoptions", "create_table_preoptions_item",
                "create_table_preoptions_td_item", "create_table_options", "create_table_options_item",
                "create_table_options_ora_item", "create_table_options_db2_item", "create_table_options_td_item",
                "create_table_options_hive_item", "create_table_hive_row_format", "create_table_hive_row_format_fields",
                "create_table_options_mssql_item", "create_table_options_mysql_item",
                "dtype", "dtype_len", "dtype_attr", "dtype_default", "create_database_stmt",
                "create_database_option", "create_function_stmt", "create_function_return",
                "create_package_stmt", "package_spec", "package_spec_item", "create_package_body_stmt",
                "package_body", "package_body_item", "create_procedure_stmt", "create_routine_params",
                "create_routine_param_item", "create_routine_options", "create_routine_option",
                "exec_stmt", "if_stmt", "if_plsql_stmt", "if_tsql_stmt", "if_bteq_stmt",
                "elseif_block", "else_block", "exit_stmt", "leave_stmt", "cmp_stmt",
                "cmp_source", "create_index_stmt", "create_index_col", "index_storage_clause",
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
                "expr_interval", "interval_item", "expr_concat", "expr_concat_item",
                "expr_case", "expr_case_simple", "expr_case_searched", "expr_cursor_attribute",
                "expr_agg_window_func", "expr_func_all_distinct", "expr_func_over_clause",
                "expr_func_partition_by_clause", "expr_spec_func", "expr_func", "expr_func_params",
                "func_param", "date_literal", "timestamp_literal", "ident", "string",
                "int_number", "dec_number", "bool_literal", "null_const", "new_line",
                "non_reserved_words"
        };
    }

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
    public String getGrammarFileName() {
        return "Hplsql.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public HplsqlParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeLiteralNames() {
        return new String[]{
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
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, "T_ACTION", "T_ALL", "T_ALTER", "T_AND",
                "T_AS", "T_ASC", "T_ASSOCIATE", "T_AT", "T_AUTO_INCREMENT", "T_AVG",
                "T_BEGIN", "T_BETWEEN", "T_BIGINT", "T_BINARY_DOUBLE", "T_BINARY_FLOAT",
                "T_BINARY_INTEGER", "T_BIT", "T_BODY", "T_BREAK", "T_BY", "T_BYTE", "T_CALL",
                "T_CASCADE", "T_CASE", "T_CASESPECIFIC", "T_CAST", "T_CHAR", "T_CHARACTER",
                "T_CHARSET", "T_CLOSE", "T_CLUSTERED", "T_CMP", "T_COLLECT", "T_COLLECTION",
                "T_COMMENT", "T_CONSTANT", "T_COMMIT", "T_COMPRESS", "T_CONCAT", "T_CONDITION",
                "T_CONSTRAINT", "T_CONTINUE", "T_COUNT", "T_COUNT_BIG", "T_CREATE", "T_CREATION",
                "T_CREATOR", "T_CS", "T_CURRENT", "T_DATABASE", "T_DATA", "T_DATE", "T_DATETIME",
                "T_DAY", "T_DAYS", "T_DEC", "T_DECIMAL", "T_DECLARE", "T_DEFAULT", "T_DEFERRED",
                "T_DEFINED", "T_DEFINER", "T_DEFINITION", "T_DELETE", "T_DELIMITED",
                "T_DESC", "T_DIR", "T_DIRECTORY", "T_DISTINCT", "T_DISTRIBUTE", "T_DO",
                "T_DOUBLE", "T_DROP", "T_DYNAMIC", "T_ELSE", "T_ELSEIF", "T_ELSIF", "T_ENABLE",
                "T_END", "T_ENGINE", "T_ESCAPED", "T_EXCEPT", "T_EXEC", "T_EXECUTE",
                "T_EXCEPTION", "T_EXCLUSIVE", "T_EXISTS", "T_EXIT", "T_FALLBACK", "T_FALSE",
                "T_FIELDS", "T_FLOAT", "T_FOR", "T_FOREIGN", "T_FORMAT", "T_FOUND", "T_FROM",
                "T_FULL", "T_FUNCTION", "T_GET", "T_GLOBAL", "T_GO", "T_GROUP", "T_HANDLER",
                "T_HASH", "T_HAVING", "T_HDFS", "T_IDENTITY", "T_IF", "T_IMMEDIATE",
                "T_IN", "T_INDEX", "T_INITRANS", "T_INNER", "T_INOUT", "T_INSERT", "T_INT",
                "T_INT2", "T_INT4", "T_INT8", "T_INTEGER", "T_INTERSECT", "T_INTERVAL",
                "T_INTO", "T_INVOKER", "T_IS", "T_ISOPEN", "T_ITEMS", "T_JOIN", "T_KEEP",
                "T_KEY", "T_KEYS", "T_LANGUAGE", "T_LEAVE", "T_LEFT", "T_LIKE", "T_LIMIT",
                "T_LINES", "T_LOCAL", "T_LOCATION", "T_LOCATOR", "T_LOCATORS", "T_LOCKS",
                "T_LOG", "T_LOGGED", "T_LOGGING", "T_LOOP", "T_MAP", "T_MAX", "T_MAXTRANS",
                "T_MERGE", "T_MICROSECOND", "T_MICROSECONDS", "T_MIN", "T_MULTISET",
                "T_NCHAR", "T_NVARCHAR", "T_NO", "T_NOCOMPRESS", "T_NOLOGGING", "T_NOT",
                "T_NOTFOUND", "T_NULL", "T_NUMERIC", "T_NUMBER", "T_ON", "T_ONLY", "T_OPEN",
                "T_OR", "T_ORDER", "T_OUT", "T_OUTER", "T_OVER", "T_OWNER", "T_PACKAGE",
                "T_PARTITION", "T_PCTFREE", "T_PCTUSED", "T_PLS_INTEGER", "T_PRECISION",
                "T_PRESERVE", "T_PRIMARY", "T_PROC", "T_PROCEDURE", "T_QUALIFY", "T_QUIT",
                "T_REAL", "T_REFERENCES", "T_REGEXP", "T_REPLACE", "T_RESTRICT", "T_RESULT",
                "T_RESULT_SET_LOCATOR", "T_RETURN", "T_RETURNS", "T_REVERSE", "T_RIGHT",
                "T_RLIKE", "T_ROW", "T_ROWS", "T_ROW_COUNT", "T_RR", "T_RS", "T_TRIM",
                "T_SCHEMA", "T_SECOND", "T_SECONDS", "T_SECURITY", "T_SEGMENT", "T_SEL",
                "T_SELECT", "T_SET", "T_SETS", "T_SHARE", "T_SIMPLE_DOUBLE", "T_SIMPLE_FLOAT",
                "T_SIMPLE_INTEGER", "T_SMALLDATETIME", "T_SMALLINT", "T_SQL", "T_SQLEXCEPTION",
                "T_SQLWARNING", "T_STEP", "T_STORAGE", "T_STORED", "T_STRING", "T_SUBSTRING",
                "T_SUM", "T_SYS_REFCURSOR", "T_TABLE", "T_TABLESPACE", "T_TEMPORARY",
                "T_TERMINATED", "T_TEXTIMAGE_ON", "T_THEN", "T_TIMESTAMP", "T_TINYINT",
                "T_TITLE", "T_TO", "T_TOP", "T_TRUE", "T_TYPE", "T_UNION", "T_UNIQUE",
                "T_UPDATE", "T_UR", "T_USE", "T_USING", "T_VALUE", "T_VALUES", "T_VAR",
                "T_VARCHAR", "T_VARCHAR2", "T_VARYING", "T_VOLATILE", "T_WHEN", "T_WHERE",
                "T_WHILE", "T_WITH", "T_WORK", "T_XML", "T_YES", "T_ACTIVITY_COUNT",
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(366);
			block();
                setState(367);
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

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(376);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
                        {
                            setState(371);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1: {
                        setState(369);
						begin_end_block();
						}
						break;
					case 2: {
                        setState(370);
						stmt();
						}
						break;
                    }
                            setState(374);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1: {
                        setState(373);
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
                setState(378);
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

	public final Begin_end_blockContext begin_end_block() throws RecognitionException {
		Begin_end_blockContext _localctx = new Begin_end_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_begin_end_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
                {
                    setState(380);
				declare_block();
				}
            }

                setState(383);
			match(T_BEGIN);
                setState(384);
			block();
                setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1: {
                setState(385);
				exception_block();
				}
				break;
            }
                setState(388);
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

	public final Single_block_stmtContext single_block_stmt() throws RecognitionException {
		Single_block_stmtContext _localctx = new Single_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_block_stmt);
        try {
            setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(390);
				match(T_BEGIN);
                setState(391);
				block();
                setState(393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1: {
                    setState(392);
					exception_block();
					}
					break;
                }
                setState(395);
				block_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(397);
				stmt();
                setState(399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1: {
                    setState(398);
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

	public final Block_endContext block_end() throws RecognitionException {
		Block_endContext _localctx = new Block_endContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_end);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(403);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
                setState(404);
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

	public final Proc_blockContext proc_block() throws RecognitionException {
		Proc_blockContext _localctx = new Proc_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proc_block);
		try {
			int _alt;
            setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(406);
				begin_end_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(408);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
                            {
                                setState(407);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
                    }
                    setState(410);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                setState(413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1: {
                    setState(412);
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

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
        try {
            setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(417);
				error_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(418);
				cpp_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(419);
				cpp_if_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
            {
                setState(420);
				cpp_for_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
            {
                setState(421);
				assignment_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
            {
                setState(422);
				associate_locator_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
            {
                setState(423);
				break_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
            {
                setState(424);
				call_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
            {
                setState(425);
				close_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
            {
                setState(426);
				cmp_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
            {
                setState(427);
				create_database_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
            {
                setState(428);
				create_function_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
            {
                setState(429);
				create_index_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
            {
                setState(430);
				create_local_temp_table_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
            {
                setState(431);
				create_package_stmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
            {
                setState(432);
				create_package_body_stmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
            {
                setState(433);
				create_procedure_stmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
            {
                setState(434);
				create_table_stmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
            {
                setState(435);
				create_type_stmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
            {
                setState(436);
				declare_stmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
            {
                setState(437);
				exec_stmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
            {
                setState(438);
				exit_stmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
            {
                setState(439);
				for_range_stmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
            {
                setState(440);
				if_stmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
            {
                setState(441);
				leave_stmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
            {
                setState(442);
				quit_stmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
            {
                setState(443);
				return_stmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
            {
                setState(444);
				select_stmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
            {
                setState(445);
				while_stmt();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
            {
                setState(446);
				label();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
            {
                setState(447);
				null_stmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
            {
                setState(448);
				expr_stmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
            {
                setState(449);
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

	public final Error_stmtContext error_stmt() throws RecognitionException {
		Error_stmtContext _localctx = new Error_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_error_stmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(452);
                invalid_cpp_function_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final Invalid_bool_exprContext invalid_bool_expr() throws RecognitionException {
		Invalid_bool_exprContext _localctx = new Invalid_bool_exprContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_invalid_bool_expr);
		int _la;
        try {
            setState(465);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 14, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(455);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 12, _ctx) ) {
				case 1: {
                    setState(454);
					match(T_NOT);
					}
					break;
                }
                setState(457);
				bool_expr(0);
                setState(458);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
                    {
                        setState(460);
					match(T_NOT);
					}
                }

                setState(463);
				match(T_OPEN_P);
                setState(464);
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

	public final Invalid_cpp_function_stmtContext invalid_cpp_function_stmt() throws RecognitionException {
		Invalid_cpp_function_stmtContext _localctx = new Invalid_cpp_function_stmtContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_invalid_cpp_function_stmt);
        try {
            setState(476);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 15, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(467);
				invalid_cpp_function_header();
                setState(468);
				invalid_cpp_function_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(470);
				invalid_cpp_function_header();
                setState(471);
				cpp_function_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(473);
				cpp_function_header();
                setState(474);
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

	public final Invalid_cpp_function_headerContext invalid_cpp_function_header() throws RecognitionException {
		Invalid_cpp_function_headerContext _localctx = new Invalid_cpp_function_headerContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_invalid_cpp_function_header);
        try {
            setState(515);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 20, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(478);
				ident();
                setState(479);
				match(T_OPEN_P);
                setState(482);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 16, _ctx) ) {
				case 1: {
                    setState(480);
					cpp_function_params_clause();
					}
					break;
				case 2: {
                    setState(481);
					invalid_cpp_function_params_clause();
					}
					break;
                }
                setState(484);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(486);
				dtype();
                setState(487);
				match(T_OPEN_P);
                setState(490);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 17, _ctx) ) {
				case 1: {
                    setState(488);
					cpp_function_params_clause();
					}
					break;
				case 2: {
                    setState(489);
					invalid_cpp_function_params_clause();
					}
					break;
                }
                setState(492);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(494);
				dtype();
                setState(495);
				ident();
                setState(496);
				match(T_OPEN_P);
                setState(497);
				invalid_cpp_function_params_clause();
                setState(498);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
            {
                setState(500);
				dtype();
                setState(501);
				ident();
                setState(504);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 18, _ctx) ) {
				case 1: {
                    setState(502);
					cpp_function_params_clause();
					}
					break;
				case 2: {
                    setState(503);
					invalid_cpp_function_params_clause();
					}
					break;
                }
                setState(506);
				match(T_CLOSE_P);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
            {
                setState(508);
				dtype();
                setState(509);
				ident();
                setState(510);
				match(T_OPEN_P);
                setState(513);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 19, _ctx) ) {
				case 1: {
                    setState(511);
					cpp_function_params_clause();
					}
					break;
				case 2: {
                    setState(512);
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

	public final Invalid_cpp_function_params_clauseContext invalid_cpp_function_params_clause() throws RecognitionException {
		Invalid_cpp_function_params_clauseContext _localctx = new Invalid_cpp_function_params_clauseContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_invalid_cpp_function_params_clause);
		int _la;
		try {
			int _alt;
            setState(555);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 27, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(519);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 21, _ctx) ) {
				case 1: {
                    setState(517);
					invalid_cpp_function_param();
					}
					break;
				case 2: {
                    setState(518);
					cpp_function_param();
					}
					break;
                }
                setState(521);
				match(T_COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(523);
				invalid_cpp_function_param();
                setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
                        {
                            setState(524);
					match(T_COMMA);
                            setState(527);
					_errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 22, _ctx) ) {
					case 1: {
                        setState(525);
						cpp_function_param();
						}
						break;
					case 2: {
                        setState(526);
						invalid_cpp_function_param();
						}
						break;
					}
					}
                    }
                    setState(533);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(534);
				cpp_function_param();
                setState(539);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
                            {
                                setState(535);
						match(T_COMMA);
                                setState(536);
						cpp_function_param();
                            }
                        }
                    }
                    setState(541);
					_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 24,_ctx);
                }
                setState(544);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
                            {
                                setState(542);
						match(T_COMMA);
                                setState(543);
						invalid_cpp_function_param();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
                    }
                    setState(546);
					_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
                        {
                            setState(548);
					match(T_COMMA);
                            setState(549);
					cpp_function_param();
					}
                    }
                    setState(554);
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

	public final Invalid_cpp_function_paramContext invalid_cpp_function_param() throws RecognitionException {
		Invalid_cpp_function_paramContext _localctx = new Invalid_cpp_function_paramContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_invalid_cpp_function_param);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(557);
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

	public final Invalid_cpp_function_bodyContext invalid_cpp_function_body() throws RecognitionException {
		Invalid_cpp_function_bodyContext _localctx = new Invalid_cpp_function_bodyContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_invalid_cpp_function_body);
		int _la;
		try {
			int _alt;
            setState(573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_OPEN_B:
				enterOuterAlt(_localctx, 1);
            {
                setState(559);
				match(T_OPEN_B);
                setState(563);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
                            {
                                setState(560);
						cpp_body_content();
                            }
                        }
                    }
                    setState(565);
					_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 28,_ctx);
				}
				}
				break;
			case T_FOR:
			case T_IF:
			case T_CLOSE_B:
				enterOuterAlt(_localctx, 2);
            {
                setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_FOR || _la==T_IF) {
					{
                        {
                            setState(566);
					cpp_body_content();
					}
                    }
                    setState(571);
					_errHandler.sync(this);
					_la = _input.LA(1);
                }
                setState(572);
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

	public final Exception_blockContext exception_block() throws RecognitionException {
		Exception_blockContext _localctx = new Exception_blockContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_exception_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(575);
			match(T_EXCEPTION);
                setState(577);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
                        {
                            setState(576);
					exception_block_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
                }
                setState(579);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 31,_ctx);
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

	public final Exception_block_itemContext exception_block_item() throws RecognitionException {
		Exception_block_itemContext _localctx = new Exception_block_itemContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_exception_block_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(581);
			match(T_WHEN);
                setState(582);
			match(L_ID);
                setState(583);
			match(T_THEN);
                setState(584);
			block();
                setState(585);
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

	public final Semicolon_stmtContext semicolon_stmt() throws RecognitionException {
		Semicolon_stmtContext _localctx = new Semicolon_stmtContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_semicolon_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(587);
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

	public final Null_stmtContext null_stmt() throws RecognitionException {
		Null_stmtContext _localctx = new Null_stmtContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_null_stmt);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(589);
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

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(591);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("GO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"GO\")");
                setState(592);
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

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_assignment_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(595);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 32, _ctx) ) {
			case 1: {
                setState(594);
				match(T_SET);
				}
				break;
                }
                setState(597);
			assignment_stmt_item();
                setState(602);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        {
                            setState(598);
					match(T_COMMA);
                            setState(599);
					assignment_stmt_item();
                        }
                    }
                }
                setState(604);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 33,_ctx);
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

	public final Assignment_stmt_itemContext assignment_stmt_item() throws RecognitionException {
		Assignment_stmt_itemContext _localctx = new Assignment_stmt_itemContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_assignment_stmt_item);
        try {
            setState(608);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 34, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(605);
				assignment_stmt_single_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(606);
				assignment_stmt_multiple_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(607);
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

	public final Assignment_stmt_single_itemContext assignment_stmt_single_item() throws RecognitionException {
		Assignment_stmt_single_itemContext _localctx = new Assignment_stmt_single_itemContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_assignment_stmt_single_item);
		int _la;
        try {
            setState(626);
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
                setState(610);
				ident();
                setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
                    {
                        setState(611);
					match(T_COLON);
					}
                }

                setState(614);
				match(T_EQUAL);
                setState(615);
				expr(0);
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
            {
                setState(617);
				match(T_OPEN_P);
                setState(618);
				ident();
                setState(619);
				match(T_CLOSE_P);
                setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
                    {
                        setState(620);
					match(T_COLON);
					}
                }

                setState(623);
				match(T_EQUAL);
                setState(624);
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

	public final Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() throws RecognitionException {
		Assignment_stmt_multiple_itemContext _localctx = new Assignment_stmt_multiple_itemContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_assignment_stmt_multiple_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(628);
			match(T_OPEN_P);
                setState(629);
			ident();
                setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
                    {
                        setState(630);
				match(T_COMMA);
                        setState(631);
				ident();
				}
                }
                setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
            }
                setState(637);
			match(T_CLOSE_P);
                setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
                {
                    setState(638);
				match(T_COLON);
				}
            }

                setState(641);
			match(T_EQUAL);
                setState(642);
			match(T_OPEN_P);
                setState(643);
			expr(0);
                setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
                    {
                        setState(644);
				match(T_COMMA);
                        setState(645);
				expr(0);
				}
                }
                setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
            }
                setState(651);
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

	public final Assignment_stmt_select_itemContext assignment_stmt_select_item() throws RecognitionException {
		Assignment_stmt_select_itemContext _localctx = new Assignment_stmt_select_itemContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_assignment_stmt_select_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(665);
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
			case L_CHARS: {
                setState(653);
				ident();
				}
				break;
			case T_OPEN_P:
				{
                    {
                        setState(654);
				match(T_OPEN_P);
                        setState(655);
				ident();
                        setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
                        {
                            setState(656);
					match(T_COMMA);
                            setState(657);
					ident();
					}
                    }
                    setState(662);
					_errHandler.sync(this);
					_la = _input.LA(1);
                }
                        setState(663);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
            }
                setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
                {
                    setState(667);
				match(T_COLON);
				}
            }

                setState(670);
			match(T_EQUAL);
                setState(671);
			match(T_OPEN_P);
                setState(672);
			select_stmt();
                setState(673);
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

	public final Associate_locator_stmtContext associate_locator_stmt() throws RecognitionException {
		Associate_locator_stmtContext _localctx = new Associate_locator_stmtContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_associate_locator_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(675);
			match(T_ASSOCIATE);
                setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_RESULT) {
                {
                    setState(676);
				match(T_RESULT);
                    setState(677);
				match(T_SET);
				}
            }

                setState(680);
			_la = _input.LA(1);
			if ( !(_la==T_LOCATOR || _la==T_LOCATORS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
            }
                setState(681);
			match(T_OPEN_P);
                setState(682);
			ident();
                setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
                    {
                        setState(683);
				match(T_COMMA);
                        setState(684);
				ident();
				}
                }
                setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
            }
                setState(690);
			match(T_CLOSE_P);
                setState(691);
			match(T_WITH);
                setState(692);
			match(T_PROCEDURE);
                setState(693);
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

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(695);
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

	public final Call_stmtContext call_stmt() throws RecognitionException {
		Call_stmtContext _localctx = new Call_stmtContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_call_stmt);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(697);
			match(T_CALL);
                setState(698);
			ident();
                setState(705);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 47, _ctx) ) {
			case 1: {
                setState(699);
				match(T_OPEN_P);
                setState(701);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 46, _ctx) ) {
				case 1: {
                    setState(700);
					expr_func_params();
					}
					break;
                }
                setState(703);
				match(T_CLOSE_P);
				}
				break;
			case 2: {
                setState(704);
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

	public final Close_stmtContext close_stmt() throws RecognitionException {
		Close_stmtContext _localctx = new Close_stmtContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_close_stmt);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(707);
			match(T_CLOSE);
                setState(708);
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

	public final Declare_stmtContext declare_stmt() throws RecognitionException {
		Declare_stmtContext _localctx = new Declare_stmtContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_declare_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(710);
			match(T_DECLARE);
                setState(711);
			declare_stmt_item();
                setState(716);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        {
                            setState(712);
					match(T_COMMA);
                            setState(713);
					declare_stmt_item();
                        }
                    }
                }
                setState(718);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 48,_ctx);
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

	public final Declare_blockContext declare_block() throws RecognitionException {
		Declare_blockContext _localctx = new Declare_blockContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_declare_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(719);
			match(T_DECLARE);
                setState(720);
			declare_stmt_item();
                setState(721);
			match(T_SEMICOLON);
                setState(727);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        {
                            setState(722);
					declare_stmt_item();
                            setState(723);
					match(T_SEMICOLON);
                        }
                    }
                }
                setState(729);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 49,_ctx);
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

	public final Declare_block_inplaceContext declare_block_inplace() throws RecognitionException {
		Declare_block_inplaceContext _localctx = new Declare_block_inplaceContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_declare_block_inplace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(730);
			declare_stmt_item();
                setState(731);
			match(T_SEMICOLON);
                setState(737);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        {
                            setState(732);
					declare_stmt_item();
                            setState(733);
					match(T_SEMICOLON);
                        }
                    }
                }
                setState(739);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 50,_ctx);
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

	public final Declare_stmt_itemContext declare_stmt_item() throws RecognitionException {
		Declare_stmt_itemContext _localctx = new Declare_stmt_itemContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_declare_stmt_item);
        try {
            setState(744);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 51, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(740);
				declare_condition_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(741);
				declare_handler_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(742);
				declare_var_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
            {
                setState(743);
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

	public final Declare_var_itemContext declare_var_item() throws RecognitionException {
		Declare_var_itemContext _localctx = new Declare_var_itemContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_declare_var_item);
		int _la;
		try {
			int _alt;
            setState(781);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 59, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(746);
				ident();
                setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
                        {
                            setState(747);
					match(T_COMMA);
                            setState(748);
					ident();
					}
                    }
                    setState(753);
					_errHandler.sync(this);
					_la = _input.LA(1);
                }
                setState(755);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 53, _ctx) ) {
				case 1: {
                    setState(754);
					match(T_AS);
					}
					break;
                }
                setState(757);
				dtype();
                setState(759);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 54, _ctx) ) {
				case 1: {
                    setState(758);
					dtype_len();
					}
					break;
                }
                setState(764);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
                            {
                                setState(761);
						dtype_attr();
                            }
                        }
                    }
                    setState(766);
					_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 55,_ctx);
                }
                setState(768);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 56, _ctx) ) {
				case 1: {
                    setState(767);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(770);
				ident();
                setState(771);
				match(T_CONSTANT);
                setState(773);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 57, _ctx) ) {
				case 1: {
                    setState(772);
					match(T_AS);
					}
					break;
                }
                setState(775);
				dtype();
                setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
                    {
                        setState(776);
					dtype_len();
					}
                }

                setState(779);
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

	public final Declare_condition_itemContext declare_condition_item() throws RecognitionException {
		Declare_condition_itemContext _localctx = new Declare_condition_itemContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_declare_condition_item);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(783);
			ident();
                setState(784);
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

	public final Declare_handler_itemContext declare_handler_item() throws RecognitionException {
		Declare_handler_itemContext _localctx = new Declare_handler_itemContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_declare_handler_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(786);
			_la = _input.LA(1);
			if ( !(_la==T_CONTINUE || _la==T_EXIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
            }
                setState(787);
			match(T_HANDLER);
                setState(788);
			match(T_FOR);
                setState(794);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 60, _ctx) ) {
			case 1: {
                setState(789);
				match(T_SQLEXCEPTION);
				}
				break;
			case 2: {
                setState(790);
				match(T_SQLWARNING);
				}
				break;
			case 3: {
                setState(791);
				match(T_NOT);
                setState(792);
				match(T_FOUND);
				}
				break;
			case 4: {
                setState(793);
				ident();
				}
				break;
                }
                setState(796);
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

	public final Create_type_stmtContext create_type_stmt() throws RecognitionException {
		Create_type_stmtContext _localctx = new Create_type_stmtContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_create_type_stmt);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(798);
			match(T_CREATE);
                setState(799);
			match(T_TYPE);
                setState(800);
			table_name();
                setState(801);
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

	public final Create_type_definitionContext create_type_definition() throws RecognitionException {
		Create_type_definitionContext _localctx = new Create_type_definitionContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_create_type_definition);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(803);
			match(T_OPEN_P);
                setState(804);
			create_type_items();
                setState(805);
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

	public final Create_type_itemsContext create_type_items() throws RecognitionException {
		Create_type_itemsContext _localctx = new Create_type_itemsContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_create_type_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(807);
			create_type_items_item();
                setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
                    {
                        setState(808);
				match(T_COMMA);
                        setState(809);
				create_type_items_item();
				}
                }
                setState(814);
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

	public final Create_type_items_itemContext create_type_items_item() throws RecognitionException {
		Create_type_items_itemContext _localctx = new Create_type_items_itemContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_create_type_items_item);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(815);
			string();
                setState(816);
			match(T_COLON);
                setState(817);
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

    public final Declare_temporary_table_itemContext declare_temporary_table_item() throws RecognitionException {
        Declare_temporary_table_itemContext _localctx = new Declare_temporary_table_itemContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_declare_temporary_table_item);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(820);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T_GLOBAL) {
                    {
                        setState(819);
                        match(T_GLOBAL);
                    }
                }

                setState(822);
                match(T_TEMPORARY);
                setState(823);
                match(T_TABLE);
                setState(824);
                ident();
                setState(826);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T_ROW || _la == T_STORED || _la == T_COMMA) {
                    {
                        setState(825);
                        create_table_preoptions();
                    }
                }

                setState(828);
                create_table_definition();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(830);
			match(T_CREATE);
                setState(831);
			match(T_TABLE);
                setState(835);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 64, _ctx) ) {
			case 1: {
                setState(832);
				match(T_IF);
                setState(833);
				match(T_NOT);
                setState(834);
				match(T_EXISTS);
				}
				break;
                }
                setState(837);
			table_name();
                setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
                {
                    setState(838);
				create_table_preoptions();
				}
            }

                setState(841);
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

	public final Create_local_temp_table_stmtContext create_local_temp_table_stmt() throws RecognitionException {
		Create_local_temp_table_stmtContext _localctx = new Create_local_temp_table_stmtContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_create_local_temp_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(843);
			match(T_CREATE);
                setState(850);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LOCAL: {
                setState(844);
				match(T_LOCAL);
                setState(845);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE: {
                setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
                    {
                        setState(846);
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

                setState(849);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
            }
                setState(852);
			match(T_TABLE);
                setState(853);
			ident();
                setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
                {
                    setState(854);
				create_table_preoptions();
				}
            }

                setState(857);
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

	public final Create_table_definitionContext create_table_definition() throws RecognitionException {
		Create_table_definitionContext _localctx = new Create_table_definitionContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_create_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(874);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 71, _ctx) ) {
			case 1: {
                setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
                    {
                        setState(859);
					match(T_AS);
					}
                }

                setState(862);
				match(T_OPEN_P);
                setState(863);
				select_stmt();
                setState(864);
				match(T_CLOSE_P);
				}
				break;
			case 2: {
                setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
                    {
                        setState(866);
					match(T_AS);
					}
                }

                setState(869);
				select_stmt();
				}
				break;
			case 3: {
                setState(870);
				match(T_OPEN_P);
                setState(871);
				create_table_columns();
                setState(872);
				match(T_CLOSE_P);
				}
				break;
                }
                setState(877);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 72, _ctx) ) {
			case 1: {
                setState(876);
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

	public final Create_table_columnsContext create_table_columns() throws RecognitionException {
		Create_table_columnsContext _localctx = new Create_table_columnsContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_create_table_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(879);
			create_table_columns_item();
                setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
                    {
                        setState(880);
				match(T_COMMA);
                        setState(881);
				create_table_columns_item();
				}
                }
                setState(886);
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

	public final Create_table_columns_itemContext create_table_columns_item() throws RecognitionException {
		Create_table_columns_itemContext _localctx = new Create_table_columns_itemContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_create_table_columns_item);
		int _la;
		try {
			int _alt;
            setState(909);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 78, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(887);
				column_name();
                setState(888);
				dtype();
                setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
                    {
                        setState(889);
					dtype_len();
					}
                }

                setState(895);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
                            {
                                setState(892);
						dtype_attr();
                            }
                        }
                    }
                    setState(897);
					_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 75,_ctx);
                }
                setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DEFAULT - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_IDENTITY - 64)))) != 0) || ((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & ((1L << (T_NOT - 166)) | (1L << (T_NULL - 166)) | (1L << (T_PRIMARY - 166)) | (1L << (T_REFERENCES - 166)))) != 0) || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (T_UNIQUE - 249)) | (1L << (T_WITH - 249)) | (1L << (T_COLON - 249)) | (1L << (T_EQUAL - 249)))) != 0)) {
					{
                        {
                            setState(898);
					create_table_column_inline_cons();
					}
                    }
                    setState(903);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
                    {
                        setState(904);
					match(T_CONSTRAINT);
                        setState(905);
					ident();
					}
                }

                setState(908);
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

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
        enterRule(_localctx, 90, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(911);
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

	public final Create_table_column_inline_consContext create_table_column_inline_cons() throws RecognitionException {
		Create_table_column_inline_consContext _localctx = new Create_table_column_inline_consContext(_ctx, getState());
        enterRule(_localctx, 92, RULE_create_table_column_inline_cons);
		int _la;
        try {
            setState(945);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
            {
                setState(913);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
            {
                setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
                    {
                        setState(914);
					match(T_NOT);
					}
                }

                setState(917);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
            {
                setState(918);
				match(T_PRIMARY);
                setState(919);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
            {
                setState(920);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
            {
                setState(921);
				match(T_REFERENCES);
                setState(922);
				table_name();
                setState(923);
				match(T_OPEN_P);
                setState(924);
				ident();
                setState(925);
				match(T_CLOSE_P);
                setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
                        {
                            setState(926);
					create_table_fk_action();
					}
                    }
                    setState(931);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
            {
                setState(932);
				match(T_IDENTITY);
                setState(933);
				match(T_OPEN_P);
                setState(934);
				match(L_INT);
                setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
                        {
                            setState(935);
					match(T_COMMA);
                            setState(936);
					match(L_INT);
					}
                    }
                    setState(941);
					_errHandler.sync(this);
					_la = _input.LA(1);
                }
                setState(942);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
            {
                setState(943);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
            {
                setState(944);
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

	public final Create_table_column_consContext create_table_column_cons() throws RecognitionException {
		Create_table_column_consContext _localctx = new Create_table_column_consContext(_ctx, getState());
        enterRule(_localctx, 94, RULE_create_table_column_cons);
		int _la;
        try {
            setState(1004);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
            {
                setState(947);
				match(T_PRIMARY);
                setState(948);
				match(T_KEY);
                setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
                    {
                        setState(949);
					match(T_CLUSTERED);
					}
                }

                setState(952);
				match(T_OPEN_P);
                setState(953);
				ident();
                setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
                    {
                        setState(954);
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

                setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
                        {
                            setState(957);
					match(T_COMMA);
                            setState(958);
					ident();
                            setState(960);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
                        {
                            setState(959);
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
                    setState(966);
					_errHandler.sync(this);
					_la = _input.LA(1);
                }
                setState(967);
				match(T_CLOSE_P);
                setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
                    {
                        setState(968);
					match(T_ENABLE);
					}
                }

                setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
                    {
                        setState(971);
					index_storage_clause();
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
            {
                setState(974);
				match(T_FOREIGN);
                setState(975);
				match(T_KEY);
                setState(976);
				match(T_OPEN_P);
                setState(977);
				ident();
                setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
                        {
                            setState(978);
					match(T_COMMA);
                            setState(979);
					ident();
					}
                    }
                    setState(984);
					_errHandler.sync(this);
					_la = _input.LA(1);
                }
                setState(985);
				match(T_CLOSE_P);
                setState(986);
				match(T_REFERENCES);
                setState(987);
				table_name();
                setState(988);
				match(T_OPEN_P);
                setState(989);
				ident();
                setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
                        {
                            setState(990);
					match(T_COMMA);
                            setState(991);
					ident();
					}
                    }
                    setState(996);
					_errHandler.sync(this);
					_la = _input.LA(1);
                }
                setState(997);
				match(T_CLOSE_P);
                setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
                        {
                            setState(998);
					create_table_fk_action();
					}
                    }
                    setState(1003);
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

	public final Create_table_fk_actionContext create_table_fk_action() throws RecognitionException {
		Create_table_fk_actionContext _localctx = new Create_table_fk_actionContext(_ctx, getState());
        enterRule(_localctx, 96, RULE_create_table_fk_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1006);
			match(T_ON);
                setState(1007);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
            }
                setState(1016);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 93, _ctx) ) {
			case 1: {
                setState(1008);
				match(T_NO);
                setState(1009);
				match(T_ACTION);
				}
				break;
			case 2: {
                setState(1010);
				match(T_RESTRICT);
				}
				break;
			case 3: {
                setState(1011);
				match(T_SET);
                setState(1012);
				match(T_NULL);
				}
				break;
			case 4: {
                setState(1013);
				match(T_SET);
                setState(1014);
				match(T_DEFAULT);
				}
				break;
			case 5: {
                setState(1015);
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

	public final Create_table_preoptionsContext create_table_preoptions() throws RecognitionException {
		Create_table_preoptionsContext _localctx = new Create_table_preoptionsContext(_ctx, getState());
        enterRule(_localctx, 98, RULE_create_table_preoptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
                    {
                        setState(1018);
				create_table_preoptions_item();
				}
                }
                setState(1021);
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

	public final Create_table_preoptions_itemContext create_table_preoptions_item() throws RecognitionException {
		Create_table_preoptions_itemContext _localctx = new Create_table_preoptions_itemContext(_ctx, getState());
        enterRule(_localctx, 100, RULE_create_table_preoptions_item);
        try {
            setState(1026);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
            {
                setState(1023);
				match(T_COMMA);
                setState(1024);
				create_table_preoptions_td_item();
				}
				break;
			case T_ROW:
			case T_STORED:
				enterOuterAlt(_localctx, 2);
            {
                setState(1025);
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

	public final Create_table_preoptions_td_itemContext create_table_preoptions_td_item() throws RecognitionException {
		Create_table_preoptions_td_itemContext _localctx = new Create_table_preoptions_td_itemContext(_ctx, getState());
        enterRule(_localctx, 102, RULE_create_table_preoptions_td_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NO) {
                {
                    setState(1028);
				match(T_NO);
				}
            }

                setState(1031);
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

	public final Create_table_optionsContext create_table_options() throws RecognitionException {
		Create_table_optionsContext _localctx = new Create_table_optionsContext(_ctx, getState());
        enterRule(_localctx, 104, RULE_create_table_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(1034);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
                        {
                            setState(1033);
					create_table_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
                }
                setState(1036);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 97,_ctx);
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

	public final Create_table_options_itemContext create_table_options_item() throws RecognitionException {
		Create_table_options_itemContext _localctx = new Create_table_options_itemContext(_ctx, getState());
        enterRule(_localctx, 106, RULE_create_table_options_item);
		int _la;
        try {
            setState(1048);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 98, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(1038);
				match(T_ON);
                setState(1039);
				match(T_COMMIT);
                setState(1040);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
                }
                setState(1041);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(1042);
				create_table_options_ora_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(1043);
				create_table_options_db2_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
            {
                setState(1044);
				create_table_options_td_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
            {
                setState(1045);
				create_table_options_hive_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
            {
                setState(1046);
				create_table_options_mssql_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
            {
                setState(1047);
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

	public final Create_table_options_ora_itemContext create_table_options_ora_item() throws RecognitionException {
		Create_table_options_ora_itemContext _localctx = new Create_table_options_ora_itemContext(_ctx, getState());
        enterRule(_localctx, 108, RULE_create_table_options_ora_item);
		int _la;
        try {
            setState(1068);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
            {
                setState(1050);
				match(T_SEGMENT);
                setState(1051);
				match(T_CREATION);
                setState(1052);
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
                setState(1053);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
                }
                setState(1054);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
            {
                setState(1055);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
            {
                setState(1056);
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
                setState(1057);
				match(T_STORAGE);
                setState(1058);
				match(T_OPEN_P);
                setState(1061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
                    {
                        setState(1061);
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
					case L_CHARS: {
                        setState(1059);
						ident();
						}
						break;
					case L_INT: {
                        setState(1060);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
                    }
                    setState(1063);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T_ACTION - 6)) | (1L << (T_AND - 6)) | (1L << (T_AS - 6)) | (1L << (T_ASC - 6)) | (1L << (T_ASSOCIATE - 6)) | (1L << (T_AT - 6)) | (1L << (T_AUTO_INCREMENT - 6)) | (1L << (T_AVG - 6)) | (1L << (T_BEGIN - 6)) | (1L << (T_BETWEEN - 6)) | (1L << (T_BIGINT - 6)) | (1L << (T_BINARY_DOUBLE - 6)) | (1L << (T_BINARY_FLOAT - 6)) | (1L << (T_BIT - 6)) | (1L << (T_BODY - 6)) | (1L << (T_BREAK - 6)) | (1L << (T_BY - 6)) | (1L << (T_BYTE - 6)) | (1L << (T_CALL - 6)) | (1L << (T_CASCADE - 6)) | (1L << (T_CASE - 6)) | (1L << (T_CASESPECIFIC - 6)) | (1L << (T_CAST - 6)) | (1L << (T_CHAR - 6)) | (1L << (T_CHARACTER - 6)) | (1L << (T_CHARSET - 6)) | (1L << (T_CLOSE - 6)) | (1L << (T_CLUSTERED - 6)) | (1L << (T_CMP - 6)) | (1L << (T_COLLECT - 6)) | (1L << (T_COLLECTION - 6)) | (1L << (T_COMMENT - 6)) | (1L << (T_CONSTANT - 6)) | (1L << (T_COMPRESS - 6)) | (1L << (T_CONCAT - 6)) | (1L << (T_CONDITION - 6)) | (1L << (T_CONSTRAINT - 6)) | (1L << (T_CONTINUE - 6)) | (1L << (T_COUNT - 6)) | (1L << (T_COUNT_BIG - 6)) | (1L << (T_CREATE - 6)) | (1L << (T_CREATION - 6)) | (1L << (T_CREATOR - 6)) | (1L << (T_CS - 6)) | (1L << (T_CURRENT - 6)) | (1L << (T_DATABASE - 6)) | (1L << (T_DATA - 6)) | (1L << (T_DATE - 6)) | (1L << (T_DATETIME - 6)) | (1L << (T_DAY - 6)) | (1L << (T_DAYS - 6)) | (1L << (T_DEC - 6)) | (1L << (T_DECIMAL - 6)) | (1L << (T_DECLARE - 6)) | (1L << (T_DEFAULT - 6)) | (1L << (T_DEFERRED - 6)) | (1L << (T_DEFINED - 6)) | (1L << (T_DEFINER - 6)) | (1L << (T_DEFINITION - 6)) | (1L << (T_DELETE - 6)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T_DELIMITED - 70)) | (1L << (T_DESC - 70)) | (1L << (T_DIR - 70)) | (1L << (T_DISTINCT - 70)) | (1L << (T_DISTRIBUTE - 70)) | (1L << (T_DO - 70)) | (1L << (T_DOUBLE - 70)) | (1L << (T_DYNAMIC - 70)) | (1L << (T_ENABLE - 70)) | (1L << (T_END - 70)) | (1L << (T_ENGINE - 70)) | (1L << (T_ESCAPED - 70)) | (1L << (T_EXCEPT - 70)) | (1L << (T_EXEC - 70)) | (1L << (T_EXECUTE - 70)) | (1L << (T_EXCEPTION - 70)) | (1L << (T_EXCLUSIVE - 70)) | (1L << (T_EXISTS - 70)) | (1L << (T_EXIT - 70)) | (1L << (T_FALLBACK - 70)) | (1L << (T_FALSE - 70)) | (1L << (T_FIELDS - 70)) | (1L << (T_FLOAT - 70)) | (1L << (T_FOR - 70)) | (1L << (T_FOREIGN - 70)) | (1L << (T_FORMAT - 70)) | (1L << (T_FOUND - 70)) | (1L << (T_FROM - 70)) | (1L << (T_FULL - 70)) | (1L << (T_FUNCTION - 70)) | (1L << (T_GLOBAL - 70)) | (1L << (T_GO - 70)) | (1L << (T_GROUP - 70)) | (1L << (T_HANDLER - 70)) | (1L << (T_HASH - 70)) | (1L << (T_HAVING - 70)) | (1L << (T_IDENTITY - 70)) | (1L << (T_IF - 70)) | (1L << (T_IMMEDIATE - 70)) | (1L << (T_IN - 70)) | (1L << (T_INDEX - 70)) | (1L << (T_INITRANS - 70)) | (1L << (T_INNER - 70)) | (1L << (T_INOUT - 70)) | (1L << (T_INT - 70)) | (1L << (T_INT2 - 70)) | (1L << (T_INT4 - 70)) | (1L << (T_INT8 - 70)) | (1L << (T_INTEGER - 70)) | (1L << (T_INTERSECT - 70)) | (1L << (T_INTERVAL - 70)) | (1L << (T_INTO - 70)) | (1L << (T_INVOKER - 70)) | (1L << (T_IS - 70)) | (1L << (T_ISOPEN - 70)) | (1L << (T_ITEMS - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (T_JOIN - 134)) | (1L << (T_KEEP - 134)) | (1L << (T_KEY - 134)) | (1L << (T_KEYS - 134)) | (1L << (T_LANGUAGE - 134)) | (1L << (T_LEAVE - 134)) | (1L << (T_LEFT - 134)) | (1L << (T_LIKE - 134)) | (1L << (T_LIMIT - 134)) | (1L << (T_LINES - 134)) | (1L << (T_LOCAL - 134)) | (1L << (T_LOCATION - 134)) | (1L << (T_LOCATOR - 134)) | (1L << (T_LOCATORS - 134)) | (1L << (T_LOCKS - 134)) | (1L << (T_LOG - 134)) | (1L << (T_LOGGED - 134)) | (1L << (T_LOGGING - 134)) | (1L << (T_LOOP - 134)) | (1L << (T_MAP - 134)) | (1L << (T_MAX - 134)) | (1L << (T_MAXTRANS - 134)) | (1L << (T_MICROSECOND - 134)) | (1L << (T_MICROSECONDS - 134)) | (1L << (T_MIN - 134)) | (1L << (T_MULTISET - 134)) | (1L << (T_NCHAR - 134)) | (1L << (T_NVARCHAR - 134)) | (1L << (T_NO - 134)) | (1L << (T_NOCOMPRESS - 134)) | (1L << (T_NOLOGGING - 134)) | (1L << (T_NOT - 134)) | (1L << (T_NOTFOUND - 134)) | (1L << (T_NUMERIC - 134)) | (1L << (T_NUMBER - 134)) | (1L << (T_ON - 134)) | (1L << (T_ONLY - 134)) | (1L << (T_OPEN - 134)) | (1L << (T_OR - 134)) | (1L << (T_ORDER - 134)) | (1L << (T_OUT - 134)) | (1L << (T_OUTER - 134)) | (1L << (T_OVER - 134)) | (1L << (T_OWNER - 134)) | (1L << (T_PACKAGE - 134)) | (1L << (T_PARTITION - 134)) | (1L << (T_PCTFREE - 134)) | (1L << (T_PCTUSED - 134)) | (1L << (T_PRECISION - 134)) | (1L << (T_PRESERVE - 134)) | (1L << (T_PRIMARY - 134)) | (1L << (T_PROC - 134)) | (1L << (T_PROCEDURE - 134)) | (1L << (T_QUALIFY - 134)) | (1L << (T_QUIT - 134)) | (1L << (T_REAL - 134)) | (1L << (T_REFERENCES - 134)) | (1L << (T_REGEXP - 134)) | (1L << (T_REPLACE - 134)) | (1L << (T_RESTRICT - 134)) | (1L << (T_RESULT - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (T_RESULT_SET_LOCATOR - 198)) | (1L << (T_RETURN - 198)) | (1L << (T_RETURNS - 198)) | (1L << (T_REVERSE - 198)) | (1L << (T_RIGHT - 198)) | (1L << (T_RLIKE - 198)) | (1L << (T_ROW - 198)) | (1L << (T_ROWS - 198)) | (1L << (T_ROW_COUNT - 198)) | (1L << (T_RR - 198)) | (1L << (T_RS - 198)) | (1L << (T_TRIM - 198)) | (1L << (T_SCHEMA - 198)) | (1L << (T_SECOND - 198)) | (1L << (T_SECONDS - 198)) | (1L << (T_SECURITY - 198)) | (1L << (T_SEGMENT - 198)) | (1L << (T_SEL - 198)) | (1L << (T_SELECT - 198)) | (1L << (T_SET - 198)) | (1L << (T_SETS - 198)) | (1L << (T_SHARE - 198)) | (1L << (T_SIMPLE_DOUBLE - 198)) | (1L << (T_SIMPLE_FLOAT - 198)) | (1L << (T_SMALLDATETIME - 198)) | (1L << (T_SMALLINT - 198)) | (1L << (T_SQL - 198)) | (1L << (T_SQLEXCEPTION - 198)) | (1L << (T_SQLWARNING - 198)) | (1L << (T_STEP - 198)) | (1L << (T_STORAGE - 198)) | (1L << (T_STORED - 198)) | (1L << (T_STRING - 198)) | (1L << (T_SUBSTRING - 198)) | (1L << (T_SUM - 198)) | (1L << (T_SYS_REFCURSOR - 198)) | (1L << (T_TABLE - 198)) | (1L << (T_TABLESPACE - 198)) | (1L << (T_TEMPORARY - 198)) | (1L << (T_TERMINATED - 198)) | (1L << (T_TEXTIMAGE_ON - 198)) | (1L << (T_THEN - 198)) | (1L << (T_TIMESTAMP - 198)) | (1L << (T_TITLE - 198)) | (1L << (T_TO - 198)) | (1L << (T_TOP - 198)) | (1L << (T_TRUE - 198)) | (1L << (T_UNIQUE - 198)) | (1L << (T_UPDATE - 198)) | (1L << (T_UR - 198)) | (1L << (T_USE - 198)) | (1L << (T_USING - 198)) | (1L << (T_VALUE - 198)) | (1L << (T_VALUES - 198)) | (1L << (T_VAR - 198)) | (1L << (T_VARCHAR - 198)) | (1L << (T_VARCHAR2 - 198)) | (1L << (T_VARYING - 198)) | (1L << (T_VOLATILE - 198)))) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (T_WHILE - 263)) | (1L << (T_WITH - 263)) | (1L << (T_XML - 263)) | (1L << (T_YES - 263)) | (1L << (T_ACTIVITY_COUNT - 263)) | (1L << (T_CUME_DIST - 263)) | (1L << (T_CURRENT_DATE - 263)) | (1L << (T_CURRENT_TIMESTAMP - 263)) | (1L << (T_CURRENT_USER - 263)) | (1L << (T_DENSE_RANK - 263)) | (1L << (T_FIRST_VALUE - 263)) | (1L << (T_LAG - 263)) | (1L << (T_LAST_VALUE - 263)) | (1L << (T_LEAD - 263)) | (1L << (T_PART_COUNT - 263)) | (1L << (T_PART_LOC - 263)) | (1L << (T_RANK - 263)) | (1L << (T_ROW_NUMBER - 263)) | (1L << (T_STDEV - 263)) | (1L << (T_SYSDATE - 263)) | (1L << (T_VARIANCE - 263)) | (1L << (T_USER - 263)) | (1L << (L_ID - 263)) | (1L << (L_INT - 263)) | (1L << (L_CHARS - 263)))) != 0));
                setState(1065);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
            {
                setState(1066);
				match(T_TABLESPACE);
                setState(1067);
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

	public final Create_table_options_db2_itemContext create_table_options_db2_item() throws RecognitionException {
		Create_table_options_db2_itemContext _localctx = new Create_table_options_db2_itemContext(_ctx, getState());
        enterRule(_localctx, 110, RULE_create_table_options_db2_item);
		int _la;
        try {
            setState(1103);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 105, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(1071);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
                    {
                        setState(1070);
					match(T_INDEX);
					}
                }

                setState(1073);
				match(T_IN);
                setState(1074);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(1075);
				match(T_WITH);
                setState(1076);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(1077);
				match(T_DISTRIBUTE);
                setState(1078);
				match(T_BY);
                setState(1079);
				match(T_HASH);
                setState(1080);
				match(T_OPEN_P);
                setState(1081);
				ident();
                setState(1086);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
                        {
                            setState(1082);
					match(T_COMMA);
                            setState(1083);
					ident();
					}
                    }
                    setState(1088);
					_errHandler.sync(this);
					_la = _input.LA(1);
                }
                setState(1089);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
            {
                setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
                    {
                        setState(1091);
					match(T_NOT);
					}
                }

                setState(1094);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
            {
                setState(1095);
				match(T_COMPRESS);
                setState(1096);
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
                setState(1097);
				match(T_DEFINITION);
                setState(1098);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
            {
                setState(1099);
				match(T_WITH);
                setState(1100);
				match(T_RESTRICT);
                setState(1101);
				match(T_ON);
                setState(1102);
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

	public final Create_table_options_td_itemContext create_table_options_td_item() throws RecognitionException {
		Create_table_options_td_itemContext _localctx = new Create_table_options_td_itemContext(_ctx, getState());
        enterRule(_localctx, 112, RULE_create_table_options_td_item);
		int _la;
        try {
            setState(1123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
            {
                setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
                    {
                        setState(1105);
					match(T_UNIQUE);
					}
                }

                setState(1108);
				match(T_PRIMARY);
                setState(1109);
				match(T_INDEX);
                setState(1110);
				match(T_OPEN_P);
                setState(1111);
				ident();
                setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
                        {
                            setState(1112);
					match(T_COMMA);
                            setState(1113);
					ident();
					}
                    }
                    setState(1118);
					_errHandler.sync(this);
					_la = _input.LA(1);
                }
                setState(1119);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
            {
                setState(1121);
				match(T_WITH);
                setState(1122);
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

	public final Create_table_options_hive_itemContext create_table_options_hive_item() throws RecognitionException {
		Create_table_options_hive_itemContext _localctx = new Create_table_options_hive_itemContext(_ctx, getState());
        enterRule(_localctx, 114, RULE_create_table_options_hive_item);
        try {
            setState(1129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ROW:
				enterOuterAlt(_localctx, 1);
            {
                setState(1125);
				create_table_hive_row_format();
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
            {
                setState(1126);
				match(T_STORED);
                setState(1127);
				match(T_AS);
                setState(1128);
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

	public final Create_table_hive_row_formatContext create_table_hive_row_format() throws RecognitionException {
		Create_table_hive_row_formatContext _localctx = new Create_table_hive_row_formatContext(_ctx, getState());
        enterRule(_localctx, 116, RULE_create_table_hive_row_format);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(1131);
			match(T_ROW);
                setState(1132);
			match(T_FORMAT);
                setState(1133);
			match(T_DELIMITED);
                setState(1137);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        {
                            setState(1134);
					create_table_hive_row_format_fields();
                        }
                    }
                }
                setState(1139);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 110,_ctx);
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

	public final Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields() throws RecognitionException {
		Create_table_hive_row_format_fieldsContext _localctx = new Create_table_hive_row_format_fieldsContext(_ctx, getState());
        enterRule(_localctx, 118, RULE_create_table_hive_row_format_fields);
        try {
            setState(1167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FIELDS:
				enterOuterAlt(_localctx, 1);
            {
                setState(1140);
				match(T_FIELDS);
                setState(1141);
				match(T_TERMINATED);
                setState(1142);
				match(T_BY);
                setState(1143);
				expr(0);
                setState(1147);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 111, _ctx) ) {
				case 1: {
                    setState(1144);
					match(T_ESCAPED);
                    setState(1145);
					match(T_BY);
                    setState(1146);
					expr(0);
					}
					break;
				}
				}
				break;
			case T_COLLECTION:
				enterOuterAlt(_localctx, 2);
            {
                setState(1149);
				match(T_COLLECTION);
                setState(1150);
				match(T_ITEMS);
                setState(1151);
				match(T_TERMINATED);
                setState(1152);
				match(T_BY);
                setState(1153);
				expr(0);
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 3);
            {
                setState(1154);
				match(T_MAP);
                setState(1155);
				match(T_KEYS);
                setState(1156);
				match(T_TERMINATED);
                setState(1157);
				match(T_BY);
                setState(1158);
				expr(0);
				}
				break;
			case T_LINES:
				enterOuterAlt(_localctx, 4);
            {
                setState(1159);
				match(T_LINES);
                setState(1160);
				match(T_TERMINATED);
                setState(1161);
				match(T_BY);
                setState(1162);
				expr(0);
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 5);
            {
                setState(1163);
				match(T_NULL);
                setState(1164);
				match(T_DEFINED);
                setState(1165);
				match(T_AS);
                setState(1166);
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

	public final Create_table_options_mssql_itemContext create_table_options_mssql_item() throws RecognitionException {
		Create_table_options_mssql_itemContext _localctx = new Create_table_options_mssql_itemContext(_ctx, getState());
        enterRule(_localctx, 120, RULE_create_table_options_mssql_item);
        try {
            setState(1173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
            {
                setState(1169);
				match(T_ON);
                setState(1170);
				ident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
            {
                setState(1171);
				match(T_TEXTIMAGE_ON);
                setState(1172);
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

	public final Create_table_options_mysql_itemContext create_table_options_mysql_item() throws RecognitionException {
		Create_table_options_mysql_itemContext _localctx = new Create_table_options_mysql_itemContext(_ctx, getState());
        enterRule(_localctx, 122, RULE_create_table_options_mysql_item);
		int _la;
        try {
            setState(1202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
            {
                setState(1175);
				match(T_AUTO_INCREMENT);
                setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
                    {
                        setState(1176);
					match(T_EQUAL);
					}
                }

                setState(1179);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
            {
                setState(1180);
				match(T_COMMENT);
                setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
                    {
                        setState(1181);
					match(T_EQUAL);
					}
                }

                setState(1184);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
            {
                setState(1186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
                    {
                        setState(1185);
					match(T_DEFAULT);
					}
                }

                setState(1191);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHARACTER: {
                    setState(1188);
					match(T_CHARACTER);
                    setState(1189);
					match(T_SET);
					}
					break;
				case T_CHARSET: {
                    setState(1190);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
                }
                setState(1194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
                    {
                        setState(1193);
					match(T_EQUAL);
					}
                }

                setState(1196);
				expr(0);
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
            {
                setState(1197);
				match(T_ENGINE);
                setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
                    {
                        setState(1198);
					match(T_EQUAL);
					}
                }

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

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
        enterRule(_localctx, 124, RULE_dtype);
        try {
            setState(1249);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 123, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(1204);
				match(T_CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(1205);
				match(T_BIGINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(1206);
				match(T_BINARY_DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
            {
                setState(1207);
				match(T_BINARY_FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
            {
                setState(1208);
				match(T_BINARY_INTEGER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
            {
                setState(1209);
				match(T_BIT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
            {
                setState(1210);
				match(T_DATE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
            {
                setState(1211);
				match(T_DATETIME);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
            {
                setState(1212);
				match(T_DEC);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
            {
                setState(1213);
				match(T_DECIMAL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
            {
                setState(1214);
				match(T_DOUBLE);
                setState(1216);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 121, _ctx) ) {
				case 1: {
                    setState(1215);
					match(T_PRECISION);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
            {
                setState(1218);
				match(T_FLOAT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
            {
                setState(1219);
				match(T_INT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
            {
                setState(1220);
				match(T_INT2);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
            {
                setState(1221);
				match(T_INT4);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
            {
                setState(1222);
				match(T_INT8);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
            {
                setState(1223);
				match(T_INTEGER);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
            {
                setState(1224);
				match(T_NCHAR);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
            {
                setState(1225);
				match(T_NVARCHAR);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
            {
                setState(1226);
				match(T_NUMBER);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
            {
                setState(1227);
				match(T_NUMERIC);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
            {
                setState(1228);
				match(T_PLS_INTEGER);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
            {
                setState(1229);
				match(T_REAL);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
            {
                setState(1230);
				match(T_RESULT_SET_LOCATOR);
                setState(1231);
				match(T_VARYING);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
            {
                setState(1232);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
            {
                setState(1233);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
            {
                setState(1234);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
            {
                setState(1235);
				match(T_SMALLINT);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
            {
                setState(1236);
				match(T_SMALLDATETIME);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
            {
                setState(1237);
				match(T_STRING);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
            {
                setState(1238);
				match(T_SYS_REFCURSOR);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
            {
                setState(1239);
				match(T_TIMESTAMP);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
            {
                setState(1240);
				match(T_TINYINT);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
            {
                setState(1241);
				match(T_VARCHAR);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
            {
                setState(1242);
				match(T_VARCHAR2);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
            {
                setState(1243);
				match(T_XML);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
            {
                setState(1244);
				ident();
                setState(1247);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 122, _ctx) ) {
				case 1: {
                    setState(1245);
					match(T__2);
                    {
                        setState(1246);
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

	public final Dtype_lenContext dtype_len() throws RecognitionException {
		Dtype_lenContext _localctx = new Dtype_lenContext(_ctx, getState());
        enterRule(_localctx, 126, RULE_dtype_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1251);
			match(T_OPEN_P);
                setState(1252);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
            }
                setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
                {
                    setState(1253);
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

                setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
                {
                    setState(1256);
				match(T_COMMA);
                    setState(1257);
				match(L_INT);
				}
            }

                setState(1260);
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

	public final Dtype_attrContext dtype_attr() throws RecognitionException {
		Dtype_attrContext _localctx = new Dtype_attrContext(_ctx, getState());
        enterRule(_localctx, 128, RULE_dtype_attr);
		int _la;
        try {
            setState(1273);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 128, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
                    {
                        setState(1262);
					match(T_NOT);
					}
                }

                setState(1265);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(1266);
				match(T_CHARACTER);
                setState(1267);
				match(T_SET);
                setState(1268);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(1270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
                    {
                        setState(1269);
					match(T_NOT);
					}
                }

                setState(1272);
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

	public final Dtype_defaultContext dtype_default() throws RecognitionException {
		Dtype_defaultContext _localctx = new Dtype_defaultContext(_ctx, getState());
        enterRule(_localctx, 130, RULE_dtype_default);
		int _la;
        try {
            setState(1287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
            {
                setState(1276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
                    {
                        setState(1275);
					match(T_COLON);
					}
                }

                setState(1278);
				match(T_EQUAL);
                setState(1279);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
            {
                setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
                    {
                        setState(1280);
					match(T_WITH);
					}
                }

                setState(1283);
				match(T_DEFAULT);
                setState(1285);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 131, _ctx) ) {
				case 1: {
                    setState(1284);
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

	public final Create_database_stmtContext create_database_stmt() throws RecognitionException {
		Create_database_stmtContext _localctx = new Create_database_stmtContext(_ctx, getState());
        enterRule(_localctx, 132, RULE_create_database_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(1289);
			match(T_CREATE);
                setState(1290);
			_la = _input.LA(1);
			if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
            }
                setState(1294);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 133, _ctx) ) {
			case 1: {
                setState(1291);
				match(T_IF);
                setState(1292);
				match(T_NOT);
                setState(1293);
				match(T_EXISTS);
				}
				break;
                }
                setState(1296);
			expr(0);
                setState(1300);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        {
                            setState(1297);
					create_database_option();
                        }
                    }
                }
                setState(1302);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 134,_ctx);
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

	public final Create_database_optionContext create_database_option() throws RecognitionException {
		Create_database_optionContext _localctx = new Create_database_optionContext(_ctx, getState());
        enterRule(_localctx, 134, RULE_create_database_option);
        try {
            setState(1307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
            {
                setState(1303);
				match(T_COMMENT);
                setState(1304);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
            {
                setState(1305);
				match(T_LOCATION);
                setState(1306);
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

	public final Create_function_stmtContext create_function_stmt() throws RecognitionException {
		Create_function_stmtContext _localctx = new Create_function_stmtContext(_ctx, getState());
        enterRule(_localctx, 136, RULE_create_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER: {
                setState(1309);
				match(T_ALTER);
				}
				break;
			case T_CREATE: {
                setState(1310);
				match(T_CREATE);
                setState(1313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
                    {
                        setState(1311);
					match(T_OR);
                        setState(1312);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE: {
                setState(1315);
				match(T_REPLACE);
				}
				break;
			case T_FUNCTION:
				break;
			default:
				break;
            }
                setState(1318);
			match(T_FUNCTION);
                setState(1319);
			ident();
                setState(1321);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 138, _ctx) ) {
			case 1: {
                setState(1320);
				create_routine_params();
				}
				break;
                }
                setState(1323);
			create_function_return();
                setState(1325);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 139, _ctx) ) {
			case 1: {
                setState(1324);
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
                setState(1328);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 140, _ctx) ) {
			case 1: {
                setState(1327);
				declare_block_inplace();
				}
				break;
                }
                setState(1330);
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

	public final Create_function_returnContext create_function_return() throws RecognitionException {
		Create_function_returnContext _localctx = new Create_function_returnContext(_ctx, getState());
        enterRule(_localctx, 138, RULE_create_function_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1332);
			_la = _input.LA(1);
			if ( !(_la==T_RETURN || _la==T_RETURNS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
            }
                setState(1333);
			dtype();
                setState(1335);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 141, _ctx) ) {
			case 1: {
                setState(1334);
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

	public final Create_package_stmtContext create_package_stmt() throws RecognitionException {
		Create_package_stmtContext _localctx = new Create_package_stmtContext(_ctx, getState());
        enterRule(_localctx, 140, RULE_create_package_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER: {
                setState(1337);
				match(T_ALTER);
				}
				break;
			case T_CREATE: {
                setState(1338);
				match(T_CREATE);
                setState(1341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
                    {
                        setState(1339);
					match(T_OR);
                        setState(1340);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE: {
                setState(1343);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
            }
                setState(1346);
			match(T_PACKAGE);
                setState(1347);
			ident();
                setState(1348);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
            }
                setState(1349);
			package_spec();
                setState(1350);
			match(T_END);
                setState(1354);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 144, _ctx) ) {
			case 1: {
                setState(1351);
				ident();
                setState(1352);
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

	public final Package_specContext package_spec() throws RecognitionException {
		Package_specContext _localctx = new Package_specContext(_ctx, getState());
        enterRule(_localctx, 142, RULE_package_spec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(1356);
			package_spec_item();
                setState(1357);
			match(T_SEMICOLON);
                setState(1363);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        {
                            setState(1358);
					package_spec_item();
                            setState(1359);
					match(T_SEMICOLON);
                        }
                    }
                }
                setState(1365);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 145,_ctx);
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

	public final Package_spec_itemContext package_spec_item() throws RecognitionException {
		Package_spec_itemContext _localctx = new Package_spec_itemContext(_ctx, getState());
        enterRule(_localctx, 144, RULE_package_spec_item);
		int _la;
        try {
            setState(1379);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 148, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(1366);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(1367);
				match(T_FUNCTION);
                setState(1368);
				ident();
                setState(1370);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 146, _ctx) ) {
				case 1: {
                    setState(1369);
					create_routine_params();
					}
					break;
                }
                setState(1372);
				create_function_return();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(1374);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
                }
                setState(1375);
				ident();
                setState(1377);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 147, _ctx) ) {
				case 1: {
                    setState(1376);
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

	public final Create_package_body_stmtContext create_package_body_stmt() throws RecognitionException {
		Create_package_body_stmtContext _localctx = new Create_package_body_stmtContext(_ctx, getState());
        enterRule(_localctx, 146, RULE_create_package_body_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER: {
                setState(1381);
				match(T_ALTER);
				}
				break;
			case T_CREATE: {
                setState(1382);
				match(T_CREATE);
                setState(1385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
                    {
                        setState(1383);
					match(T_OR);
                        setState(1384);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE: {
                setState(1387);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
            }
                setState(1390);
			match(T_PACKAGE);
                setState(1391);
			match(T_BODY);
                setState(1392);
			ident();
                setState(1393);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
            }
                setState(1394);
			package_body();
                setState(1395);
			match(T_END);
                setState(1399);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 151, _ctx) ) {
			case 1: {
                setState(1396);
				ident();
                setState(1397);
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

	public final Package_bodyContext package_body() throws RecognitionException {
		Package_bodyContext _localctx = new Package_bodyContext(_ctx, getState());
        enterRule(_localctx, 148, RULE_package_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(1401);
			package_body_item();
                setState(1402);
			match(T_SEMICOLON);
                setState(1408);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        {
                            setState(1403);
					package_body_item();
                            setState(1404);
					match(T_SEMICOLON);
                        }
                    }
                }
                setState(1410);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 152,_ctx);
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

	public final Package_body_itemContext package_body_item() throws RecognitionException {
		Package_body_itemContext _localctx = new Package_body_itemContext(_ctx, getState());
        enterRule(_localctx, 150, RULE_package_body_item);
        try {
            setState(1414);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 153, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(1411);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(1412);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(1413);
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

	public final Create_procedure_stmtContext create_procedure_stmt() throws RecognitionException {
		Create_procedure_stmtContext _localctx = new Create_procedure_stmtContext(_ctx, getState());
        enterRule(_localctx, 152, RULE_create_procedure_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER: {
                setState(1416);
				match(T_ALTER);
				}
				break;
			case T_CREATE: {
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
			case T_REPLACE: {
                setState(1422);
				match(T_REPLACE);
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				break;
			default:
				break;
            }
                setState(1425);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
            }
                setState(1426);
			ident();
                setState(1428);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 156, _ctx) ) {
			case 1: {
                setState(1427);
				create_routine_params();
				}
				break;
                }
                setState(1431);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 157, _ctx) ) {
			case 1: {
                setState(1430);
				create_routine_options();
				}
				break;
                }
                setState(1434);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 158, _ctx) ) {
			case 1: {
                setState(1433);
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
                setState(1437);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 159, _ctx) ) {
			case 1: {
                setState(1436);
				declare_block_inplace();
				}
				break;
                }
                setState(1440);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 160, _ctx) ) {
			case 1: {
                setState(1439);
				label();
				}
				break;
                }
                setState(1442);
			proc_block();
                setState(1446);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 161, _ctx) ) {
			case 1: {
                setState(1443);
				ident();
                setState(1444);
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

	public final Create_routine_paramsContext create_routine_params() throws RecognitionException {
		Create_routine_paramsContext _localctx = new Create_routine_paramsContext(_ctx, getState());
        enterRule(_localctx, 154, RULE_create_routine_params);
		int _la;
		try {
			int _alt;
            setState(1470);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 164, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(1448);
				match(T_OPEN_P);
                setState(1449);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(1450);
				match(T_OPEN_P);
                setState(1451);
				create_routine_param_item();
                setState(1456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
                        {
                            setState(1452);
					match(T_COMMA);
                            setState(1453);
					create_routine_param_item();
					}
                    }
                    setState(1458);
					_errHandler.sync(this);
					_la = _input.LA(1);
                }
                setState(1459);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(1461);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") &&
				        _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\r\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") &&\r\n        _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\r\n        ");
                setState(1462);
				create_routine_param_item();
                setState(1467);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 163,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
                            {
                                setState(1463);
						match(T_COMMA);
                                setState(1464);
						create_routine_param_item();
                            }
                        }
                    }
                    setState(1469);
					_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 163,_ctx);
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

	public final Create_routine_param_itemContext create_routine_param_item() throws RecognitionException {
		Create_routine_param_itemContext _localctx = new Create_routine_param_itemContext(_ctx, getState());
        enterRule(_localctx, 156, RULE_create_routine_param_item);
		try {
			int _alt;
            setState(1514);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 173, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(1477);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 165, _ctx) ) {
				case 1: {
                    setState(1472);
					match(T_IN);
					}
					break;
				case 2: {
                    setState(1473);
					match(T_OUT);
					}
					break;
				case 3: {
                    setState(1474);
					match(T_INOUT);
					}
					break;
				case 4: {
                    setState(1475);
					match(T_IN);
                    setState(1476);
					match(T_OUT);
					}
					break;
                }
                setState(1479);
				ident();
                setState(1480);
				dtype();
                setState(1482);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 166, _ctx) ) {
				case 1: {
                    setState(1481);
					dtype_len();
					}
					break;
                }
                setState(1487);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 167,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
                            {
                                setState(1484);
						dtype_attr();
                            }
                        }
                    }
                    setState(1489);
					_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 167,_ctx);
                }
                setState(1491);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 168, _ctx) ) {
				case 1: {
                    setState(1490);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(1493);
				ident();
                setState(1499);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 169, _ctx) ) {
				case 1: {
                    setState(1494);
					match(T_IN);
					}
					break;
				case 2: {
                    setState(1495);
					match(T_OUT);
					}
					break;
				case 3: {
                    setState(1496);
					match(T_INOUT);
					}
					break;
				case 4: {
                    setState(1497);
					match(T_IN);
                    setState(1498);
					match(T_OUT);
					}
					break;
                }
                setState(1501);
				dtype();
                setState(1503);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 170, _ctx) ) {
				case 1: {
                    setState(1502);
					dtype_len();
					}
					break;
                }
                setState(1508);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 171,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
                            {
                                setState(1505);
						dtype_attr();
                            }
                        }
                    }
                    setState(1510);
					_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 171,_ctx);
                }
                setState(1512);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 172, _ctx) ) {
				case 1: {
                    setState(1511);
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

	public final Create_routine_optionsContext create_routine_options() throws RecognitionException {
		Create_routine_optionsContext _localctx = new Create_routine_optionsContext(_ctx, getState());
        enterRule(_localctx, 158, RULE_create_routine_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(1517);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
                        {
                            setState(1516);
					create_routine_option();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
                }
                setState(1519);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 174,_ctx);
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

	public final Create_routine_optionContext create_routine_option() throws RecognitionException {
		Create_routine_optionContext _localctx = new Create_routine_optionContext(_ctx, getState());
        enterRule(_localctx, 160, RULE_create_routine_option);
		int _la;
        try {
            setState(1532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LANGUAGE:
				enterOuterAlt(_localctx, 1);
            {
                setState(1521);
				match(T_LANGUAGE);
                setState(1522);
				match(T_SQL);
				}
				break;
			case T_SQL:
				enterOuterAlt(_localctx, 2);
            {
                setState(1523);
				match(T_SQL);
                setState(1524);
				match(T_SECURITY);
                setState(1525);
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
                setState(1527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DYNAMIC) {
                    {
                        setState(1526);
					match(T_DYNAMIC);
					}
                }

                setState(1529);
				match(T_RESULT);
                setState(1530);
				match(T_SETS);
                setState(1531);
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

	public final Exec_stmtContext exec_stmt() throws RecognitionException {
		Exec_stmtContext _localctx = new Exec_stmtContext(_ctx, getState());
        enterRule(_localctx, 162, RULE_exec_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(1534);
			_la = _input.LA(1);
			if ( !(_la==T_EXEC || _la==T_EXECUTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
            }
                setState(1536);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 177, _ctx) ) {
			case 1: {
                setState(1535);
				match(T_IMMEDIATE);
				}
				break;
                }
                setState(1538);
			expr(0);
                setState(1544);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 178, _ctx) ) {
			case 1: {
                setState(1539);
				match(T_OPEN_P);
                setState(1540);
				expr_func_params();
                setState(1541);
				match(T_CLOSE_P);
				}
				break;
			case 2: {
                setState(1543);
				expr_func_params();
				}
				break;
                }
                setState(1555);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 180, _ctx) ) {
			case 1: {
                setState(1546);
				match(T_INTO);
                setState(1547);
				match(L_ID);
                setState(1552);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 179,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
                            {
                                setState(1548);
						match(T_COMMA);
                                setState(1549);
						match(L_ID);
                            }
                        }
                    }
                    setState(1554);
					_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 179,_ctx);
				}
				}
				break;
                }
                setState(1558);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 181, _ctx) ) {
			case 1: {
                setState(1557);
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

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
        enterRule(_localctx, 164, RULE_if_stmt);
        try {
            setState(1563);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 182, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(1560);
				if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(1561);
				if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(1562);
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

	public final If_plsql_stmtContext if_plsql_stmt() throws RecognitionException {
		If_plsql_stmtContext _localctx = new If_plsql_stmtContext(_ctx, getState());
        enterRule(_localctx, 166, RULE_if_plsql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1565);
			match(T_IF);
                setState(1566);
			bool_expr(0);
                setState(1567);
			match(T_THEN);
                setState(1568);
			block();
                setState(1572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
                    {
                        setState(1569);
				elseif_block();
				}
                }
                setState(1574);
				_errHandler.sync(this);
				_la = _input.LA(1);
            }
                setState(1576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
                {
                    setState(1575);
				else_block();
				}
            }

                setState(1578);
			match(T_END);
                setState(1579);
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

	public final If_tsql_stmtContext if_tsql_stmt() throws RecognitionException {
		If_tsql_stmtContext _localctx = new If_tsql_stmtContext(_ctx, getState());
        enterRule(_localctx, 168, RULE_if_tsql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1581);
			match(T_IF);
                setState(1582);
			bool_expr(0);
                setState(1583);
			single_block_stmt();
                setState(1586);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 185, _ctx) ) {
			case 1: {
                setState(1584);
				match(T_ELSE);
                setState(1585);
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

	public final If_bteq_stmtContext if_bteq_stmt() throws RecognitionException {
		If_bteq_stmtContext _localctx = new If_bteq_stmtContext(_ctx, getState());
        enterRule(_localctx, 170, RULE_if_bteq_stmt);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1588);
			match(T__3);
                setState(1589);
			match(T_IF);
                setState(1590);
			bool_expr(0);
                setState(1591);
			match(T_THEN);
                setState(1592);
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

	public final Elseif_blockContext elseif_block() throws RecognitionException {
		Elseif_blockContext _localctx = new Elseif_blockContext(_ctx, getState());
        enterRule(_localctx, 172, RULE_elseif_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1594);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
            }
                setState(1595);
			bool_expr(0);
                setState(1596);
			match(T_THEN);
                setState(1597);
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

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
        enterRule(_localctx, 174, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1599);
			match(T_ELSE);
                setState(1600);
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

	public final Exit_stmtContext exit_stmt() throws RecognitionException {
		Exit_stmtContext _localctx = new Exit_stmtContext(_ctx, getState());
        enterRule(_localctx, 176, RULE_exit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1602);
			match(T_EXIT);
                setState(1604);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 186, _ctx) ) {
			case 1: {
                setState(1603);
				match(L_ID);
				}
				break;
                }
                setState(1608);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 187, _ctx) ) {
			case 1: {
                setState(1606);
				match(T_WHEN);
                setState(1607);
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

	public final Leave_stmtContext leave_stmt() throws RecognitionException {
		Leave_stmtContext _localctx = new Leave_stmtContext(_ctx, getState());
        enterRule(_localctx, 178, RULE_leave_stmt);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1610);
			match(T_LEAVE);
                setState(1612);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 188, _ctx) ) {
			case 1: {
                setState(1611);
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

	public final Cmp_stmtContext cmp_stmt() throws RecognitionException {
		Cmp_stmtContext _localctx = new Cmp_stmtContext(_ctx, getState());
        enterRule(_localctx, 180, RULE_cmp_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1614);
			match(T_CMP);
                setState(1615);
			_la = _input.LA(1);
			if ( !(_la==T_ROW_COUNT || _la==T_SUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
            }
                setState(1616);
			cmp_source();
                setState(1617);
			match(T_COMMA);
                setState(1618);
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

	public final Cmp_sourceContext cmp_source() throws RecognitionException {
		Cmp_sourceContext _localctx = new Cmp_sourceContext(_ctx, getState());
        enterRule(_localctx, 182, RULE_cmp_source);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1628);
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
			case L_CHARS: {
                setState(1620);
				table_name();
                setState(1622);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 189, _ctx) ) {
				case 1: {
                    setState(1621);
					where_clause();
					}
					break;
				}
				}
				break;
			case T_OPEN_P: {
                setState(1624);
				match(T_OPEN_P);
                setState(1625);
				select_stmt();
                setState(1626);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
            }
                setState(1632);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 191, _ctx) ) {
			case 1: {
                setState(1630);
				match(T_AT);
                setState(1631);
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

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
        enterRule(_localctx, 184, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1634);
			match(T_CREATE);
                setState(1636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
                {
                    setState(1635);
				match(T_UNIQUE);
				}
            }

                setState(1638);
			match(T_INDEX);
                setState(1639);
			ident();
                setState(1640);
			match(T_ON);
                setState(1641);
			table_name();
                setState(1642);
			match(T_OPEN_P);
                setState(1643);
			create_index_col();
                setState(1648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
                    {
                        setState(1644);
				match(T_COMMA);
                        setState(1645);
				create_index_col();
				}
                }
                setState(1650);
				_errHandler.sync(this);
				_la = _input.LA(1);
            }
                setState(1651);
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

	public final Create_index_colContext create_index_col() throws RecognitionException {
		Create_index_colContext _localctx = new Create_index_colContext(_ctx, getState());
        enterRule(_localctx, 186, RULE_create_index_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1653);
			ident();
                setState(1655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
                {
                    setState(1654);
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

	public final Index_storage_clauseContext index_storage_clause() throws RecognitionException {
		Index_storage_clauseContext _localctx = new Index_storage_clauseContext(_ctx, getState());
        enterRule(_localctx, 188, RULE_index_storage_clause);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1657);
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

	public final Index_mssql_storage_clauseContext index_mssql_storage_clause() throws RecognitionException {
		Index_mssql_storage_clauseContext _localctx = new Index_mssql_storage_clauseContext(_ctx, getState());
        enterRule(_localctx, 190, RULE_index_mssql_storage_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1659);
			match(T_WITH);
                setState(1660);
			match(T_OPEN_P);
                setState(1661);
			ident();
                setState(1662);
			match(T_EQUAL);
                setState(1663);
			ident();
                setState(1671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
                    {
                        setState(1664);
				match(T_COMMA);
                        setState(1665);
				ident();
                        setState(1666);
				match(T_EQUAL);
                        setState(1667);
				ident();
				}
                }
                setState(1673);
				_errHandler.sync(this);
				_la = _input.LA(1);
            }
                setState(1674);
			match(T_CLOSE_P);
                setState(1678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ON || _la==T_TEXTIMAGE_ON) {
				{
                    {
                        setState(1675);
				create_table_options_mssql_item();
				}
                }
                setState(1680);
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

	public final Quit_stmtContext quit_stmt() throws RecognitionException {
		Quit_stmtContext _localctx = new Quit_stmtContext(_ctx, getState());
        enterRule(_localctx, 192, RULE_quit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
                {
                    setState(1681);
				match(T__3);
				}
            }

                setState(1684);
			match(T_QUIT);
                setState(1686);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 198, _ctx) ) {
			case 1: {
                setState(1685);
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

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
        enterRule(_localctx, 194, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1688);
			match(T_RETURN);
                setState(1690);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 199, _ctx) ) {
			case 1: {
                setState(1689);
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

	public final Cpp_function_stmtContext cpp_function_stmt() throws RecognitionException {
		Cpp_function_stmtContext _localctx = new Cpp_function_stmtContext(_ctx, getState());
        enterRule(_localctx, 196, RULE_cpp_function_stmt);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1692);
			cpp_function_header();
                setState(1693);
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

	public final Cpp_function_headerContext cpp_function_header() throws RecognitionException {
		Cpp_function_headerContext _localctx = new Cpp_function_headerContext(_ctx, getState());
        enterRule(_localctx, 198, RULE_cpp_function_header);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1695);
			dtype();
                setState(1696);
			ident();
                setState(1697);
			match(T_OPEN_P);
                setState(1698);
			cpp_function_params_clause();
                setState(1699);
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

	public final Cpp_function_params_clauseContext cpp_function_params_clause() throws RecognitionException {
		Cpp_function_params_clauseContext _localctx = new Cpp_function_params_clauseContext(_ctx, getState());
        enterRule(_localctx, 200, RULE_cpp_function_params_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1701);
			cpp_function_param();
                setState(1706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
                    {
                        setState(1702);
				match(T_COMMA);
                        setState(1703);
				cpp_function_param();
				}
                }
                setState(1708);
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

	public final Cpp_function_paramContext cpp_function_param() throws RecognitionException {
		Cpp_function_paramContext _localctx = new Cpp_function_paramContext(_ctx, getState());
        enterRule(_localctx, 202, RULE_cpp_function_param);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1709);
			dtype();
                setState(1710);
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

	public final Cpp_function_bodyContext cpp_function_body() throws RecognitionException {
		Cpp_function_bodyContext _localctx = new Cpp_function_bodyContext(_ctx, getState());
        enterRule(_localctx, 204, RULE_cpp_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1712);
			match(T_OPEN_B);
                setState(1716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_FOR || _la==T_IF) {
				{
                    {
                        setState(1713);
				cpp_body_content();
				}
                }
                setState(1718);
				_errHandler.sync(this);
				_la = _input.LA(1);
            }
                setState(1719);
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

	public final Cpp_if_stmtContext cpp_if_stmt() throws RecognitionException {
		Cpp_if_stmtContext _localctx = new Cpp_if_stmtContext(_ctx, getState());
        enterRule(_localctx, 206, RULE_cpp_if_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(1721);
			match(T_IF);
                setState(1722);
			match(T_OPEN_P);
                setState(1723);
			bool_expr(0);
                setState(1724);
			match(T_CLOSE_P);
                setState(1725);
			cpp_for_stmt_body();
                setState(1729);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        {
                            setState(1726);
					cpp_elseif_clause();
                        }
                    }
                }
                setState(1731);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 202,_ctx);
            }
                setState(1733);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 203, _ctx) ) {
			case 1: {
                setState(1732);
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

	public final Cpp_elseif_clauseContext cpp_elseif_clause() throws RecognitionException {
		Cpp_elseif_clauseContext _localctx = new Cpp_elseif_clauseContext(_ctx, getState());
        enterRule(_localctx, 208, RULE_cpp_elseif_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1735);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
            }
                setState(1736);
			match(T_OPEN_P);
                setState(1737);
			bool_expr(0);
                setState(1738);
			match(T_CLOSE_P);
                setState(1739);
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

	public final Cpp_else_clauseContext cpp_else_clause() throws RecognitionException {
		Cpp_else_clauseContext _localctx = new Cpp_else_clauseContext(_ctx, getState());
        enterRule(_localctx, 210, RULE_cpp_else_clause);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1741);
			match(T_ELSE);
                setState(1742);
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

	public final Cpp_for_stmtContext cpp_for_stmt() throws RecognitionException {
		Cpp_for_stmtContext _localctx = new Cpp_for_stmtContext(_ctx, getState());
        enterRule(_localctx, 212, RULE_cpp_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1744);
			cpp_for_stmt_header();
                setState(1745);
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

	public final Cpp_for_stmt_headerContext cpp_for_stmt_header() throws RecognitionException {
		Cpp_for_stmt_headerContext _localctx = new Cpp_for_stmt_headerContext(_ctx, getState());
        enterRule(_localctx, 214, RULE_cpp_for_stmt_header);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1747);
			match(T_FOR);
                setState(1748);
			match(T_OPEN_P);
                setState(1749);
			cpp_for_params_clause();
                setState(1750);
			match(T_SEMICOLON);
                setState(1751);
			bool_expr(0);
                setState(1752);
			match(T_SEMICOLON);
                setState(1753);
			cpp_for_stmt_var_incr_caluse();
                setState(1754);
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

	public final Cpp_for_params_clauseContext cpp_for_params_clause() throws RecognitionException {
		Cpp_for_params_clauseContext _localctx = new Cpp_for_params_clauseContext(_ctx, getState());
        enterRule(_localctx, 216, RULE_cpp_for_params_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1756);
			cpp_for_param();
                setState(1761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
                    {
                        setState(1757);
				match(T_COMMA);
                        setState(1758);
				cpp_for_param();
				}
                }
                setState(1763);
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

	public final Cpp_for_paramContext cpp_for_param() throws RecognitionException {
		Cpp_for_paramContext _localctx = new Cpp_for_paramContext(_ctx, getState());
        enterRule(_localctx, 218, RULE_cpp_for_param);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1765);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 205, _ctx) ) {
			case 1: {
                setState(1764);
				dtype();
				}
				break;
                }
                setState(1767);
			ident();
                setState(1768);
			match(T_EQUAL);
                setState(1769);
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

	public final Cpp_for_stmt_var_incr_caluseContext cpp_for_stmt_var_incr_caluse() throws RecognitionException {
		Cpp_for_stmt_var_incr_caluseContext _localctx = new Cpp_for_stmt_var_incr_caluseContext(_ctx, getState());
        enterRule(_localctx, 220, RULE_cpp_for_stmt_var_incr_caluse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1771);
			cpp_for_stmt_var_incr_();
                setState(1776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
                    {
                        setState(1772);
				match(T_COMMA);
                        setState(1773);
				cpp_for_stmt_var_incr_();
				}
                }
                setState(1778);
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

	public final Cpp_for_stmt_var_incr_Context cpp_for_stmt_var_incr_() throws RecognitionException {
		Cpp_for_stmt_var_incr_Context _localctx = new Cpp_for_stmt_var_incr_Context(_ctx, getState());
        enterRule(_localctx, 222, RULE_cpp_for_stmt_var_incr_);
		int _la;
        try {
            setState(1802);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 207, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(1779);
				ident();
                setState(1780);
				match(T_ADD);
                setState(1781);
				match(T_ADD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(1783);
				ident();
                setState(1784);
				match(T_SUB);
                setState(1785);
				match(T_SUB);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(1787);
				ident();
                setState(1788);
				match(T_EQUAL);
                setState(1789);
				match(L_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
            {
                setState(1791);
				ident();
                setState(1792);
				match(T_EQUAL);
                setState(1793);
				ident();
                setState(1794);
				_la = _input.LA(1);
				if ( !(_la==T__2 || ((((_la - 292)) & ~0x3f) == 0 && ((1L << (_la - 292)) & ((1L << (T_ADD - 292)) | (1L << (T_DIV - 292)) | (1L << (T_MUL - 292)) | (1L << (T_SUB - 292)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
                }
                setState(1795);
				match(L_INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
            {
                setState(1797);
				ident();
                setState(1798);
				_la = _input.LA(1);
				if ( !(_la==T__2 || ((((_la - 292)) & ~0x3f) == 0 && ((1L << (_la - 292)) & ((1L << (T_ADD - 292)) | (1L << (T_DIV - 292)) | (1L << (T_MUL - 292)) | (1L << (T_SUB - 292)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
                }
                setState(1799);
				match(T_EQUAL);
                setState(1800);
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

	public final Cpp_for_stmt_bodyContext cpp_for_stmt_body() throws RecognitionException {
		Cpp_for_stmt_bodyContext _localctx = new Cpp_for_stmt_bodyContext(_ctx, getState());
        enterRule(_localctx, 224, RULE_cpp_for_stmt_body);
		int _la;
        try {
            setState(1813);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_OPEN_B:
				enterOuterAlt(_localctx, 1);
            {
                setState(1804);
				match(T_OPEN_B);
                setState(1808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_FOR || _la==T_IF) {
					{
                        {
                            setState(1805);
					cpp_body_content();
					}
                    }
                    setState(1810);
					_errHandler.sync(this);
					_la = _input.LA(1);
                }
                setState(1811);
				match(T_CLOSE_B);
				}
				break;
			case T_FOR:
			case T_IF:
				enterOuterAlt(_localctx, 2);
            {
                setState(1812);
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

	public final Cpp_body_contentContext cpp_body_content() throws RecognitionException {
		Cpp_body_contentContext _localctx = new Cpp_body_contentContext(_ctx, getState());
        enterRule(_localctx, 226, RULE_cpp_body_content);
        try {
            setState(1817);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_IF:
				enterOuterAlt(_localctx, 1);
            {
                setState(1815);
				cpp_if_stmt();
				}
				break;
			case T_FOR:
				enterOuterAlt(_localctx, 2);
            {
                setState(1816);
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

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
        enterRule(_localctx, 228, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1819);
			match(T_WHILE);
                setState(1820);
			bool_expr(0);
                setState(1821);
			_la = _input.LA(1);
			if ( !(_la==T_BEGIN || _la==T_DO || _la==T_LOOP || _la==T_THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
            }
                setState(1822);
			block();
                setState(1823);
			match(T_END);
                setState(1825);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 211, _ctx) ) {
			case 1: {
                setState(1824);
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

	public final For_range_stmtContext for_range_stmt() throws RecognitionException {
		For_range_stmtContext _localctx = new For_range_stmtContext(_ctx, getState());
        enterRule(_localctx, 230, RULE_for_range_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1827);
			match(T_FOR);
                setState(1828);
			match(L_ID);
                setState(1829);
			match(T_IN);
                setState(1831);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 212, _ctx) ) {
			case 1: {
                setState(1830);
				match(T_REVERSE);
				}
				break;
                }
                setState(1833);
			expr(0);
                setState(1834);
			match(T_DOT2);
                setState(1835);
			expr(0);
                setState(1838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BY || _la==T_STEP) {
                {
                    setState(1836);
				_la = _input.LA(1);
				if ( !(_la==T_BY || _la==T_STEP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
                }
                    setState(1837);
				expr(0);
				}
            }

                setState(1840);
			match(T_LOOP);
                setState(1841);
			block();
                setState(1842);
			match(T_END);
                setState(1843);
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

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
        enterRule(_localctx, 232, RULE_label);
        try {
            setState(1851);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_LABEL:
				enterOuterAlt(_localctx, 1);
            {
                setState(1845);
				match(L_LABEL);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 2);
            {
                setState(1846);
				match(T_LESS);
                setState(1847);
				match(T_LESS);
                setState(1848);
				match(L_ID);
                setState(1849);
				match(T_GREATER);
                setState(1850);
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

	public final Using_clauseContext using_clause() throws RecognitionException {
		Using_clauseContext _localctx = new Using_clauseContext(_ctx, getState());
        enterRule(_localctx, 234, RULE_using_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(1853);
			match(T_USING);
                setState(1854);
			expr(0);
                setState(1859);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 215,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        {
                            setState(1855);
					match(T_COMMA);
                            setState(1856);
					expr(0);
                        }
                    }
                }
                setState(1861);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 215,_ctx);
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

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
        enterRule(_localctx, 236, RULE_select_stmt);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1862);
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

	public final Fullselect_stmtContext fullselect_stmt() throws RecognitionException {
		Fullselect_stmtContext _localctx = new Fullselect_stmtContext(_ctx, getState());
        enterRule(_localctx, 238, RULE_fullselect_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(1864);
			fullselect_stmt_item();
                setState(1870);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        {
                            setState(1865);
					fullselect_set_clause();
                            setState(1866);
					fullselect_stmt_item();
                        }
                    }
                }
                setState(1872);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 216,_ctx);
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

	public final Fullselect_stmt_itemContext fullselect_stmt_item() throws RecognitionException {
		Fullselect_stmt_itemContext _localctx = new Fullselect_stmt_itemContext(_ctx, getState());
        enterRule(_localctx, 240, RULE_fullselect_stmt_item);
        try {
            setState(1878);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
            {
                setState(1873);
				subselect_stmt();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
            {
                setState(1874);
				match(T_OPEN_P);
                setState(1875);
				fullselect_stmt();
                setState(1876);
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

	public final Fullselect_set_clauseContext fullselect_set_clause() throws RecognitionException {
		Fullselect_set_clauseContext _localctx = new Fullselect_set_clauseContext(_ctx, getState());
        enterRule(_localctx, 242, RULE_fullselect_set_clause);
		int _la;
        try {
            setState(1892);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
            {
                setState(1880);
				match(T_UNION);
                setState(1882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
                    {
                        setState(1881);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
            {
                setState(1884);
				match(T_EXCEPT);
                setState(1886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
                    {
                        setState(1885);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
            {
                setState(1888);
				match(T_INTERSECT);
                setState(1890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
                    {
                        setState(1889);
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

	public final Subselect_stmtContext subselect_stmt() throws RecognitionException {
		Subselect_stmtContext _localctx = new Subselect_stmtContext(_ctx, getState());
        enterRule(_localctx, 244, RULE_subselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1894);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
            }
                setState(1895);
			select_list();
                setState(1897);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 222, _ctx) ) {
			case 1: {
                setState(1896);
				into_clause();
				}
				break;
                }
                setState(1900);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 223, _ctx) ) {
			case 1: {
                setState(1899);
				from_clause();
				}
				break;
                }
                setState(1903);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 224, _ctx) ) {
			case 1: {
                setState(1902);
				where_clause();
				}
				break;
                }
                setState(1906);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 225, _ctx) ) {
			case 1: {
                setState(1905);
				group_by_clause();
				}
				break;
                }
                setState(1910);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 226, _ctx) ) {
			case 1: {
                setState(1908);
				having_clause();
				}
				break;
			case 2: {
                setState(1909);
				qualify_clause();
				}
				break;
                }
                setState(1913);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 227, _ctx) ) {
			case 1: {
                setState(1912);
				order_by_clause();
				}
				break;
                }
                setState(1916);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 228, _ctx) ) {
			case 1: {
                setState(1915);
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

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
        enterRule(_localctx, 246, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(1919);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 229, _ctx) ) {
			case 1: {
                setState(1918);
				select_list_set();
				}
				break;
                }
                setState(1922);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 230, _ctx) ) {
			case 1: {
                setState(1921);
				select_list_limit();
				}
				break;
                }
                setState(1924);
			select_list_item();
                setState(1929);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 231,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        {
                            setState(1925);
					match(T_COMMA);
                            setState(1926);
					select_list_item();
                        }
                    }
                }
                setState(1931);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 231,_ctx);
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

	public final Select_list_setContext select_list_set() throws RecognitionException {
		Select_list_setContext _localctx = new Select_list_setContext(_ctx, getState());
        enterRule(_localctx, 248, RULE_select_list_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1932);
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

	public final Select_list_limitContext select_list_limit() throws RecognitionException {
		Select_list_limitContext _localctx = new Select_list_limitContext(_ctx, getState());
        enterRule(_localctx, 250, RULE_select_list_limit);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1934);
			match(T_TOP);
                setState(1935);
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

	public final Select_list_itemContext select_list_item() throws RecognitionException {
		Select_list_itemContext _localctx = new Select_list_itemContext(_ctx, getState());
        enterRule(_localctx, 252, RULE_select_list_item);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1947);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 234, _ctx) ) {
			case 1: {
                setState(1940);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 232, _ctx) ) {
				case 1: {
                    setState(1937);
					ident();
                    setState(1938);
					match(T_EQUAL);
					}
					break;
                }
                setState(1942);
				expr(0);
                setState(1944);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 233, _ctx) ) {
				case 1: {
                    setState(1943);
					select_list_alias();
					}
					break;
				}
				}
				break;
			case 2: {
                setState(1946);
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

	public final Select_list_aliasContext select_list_alias() throws RecognitionException {
		Select_list_aliasContext _localctx = new Select_list_aliasContext(_ctx, getState());
        enterRule(_localctx, 254, RULE_select_list_alias);
        try {
            setState(1958);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 236, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(1949);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") &&
				         !_input.LT(1).getText().equalsIgnoreCase("FROM"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
                setState(1951);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 235, _ctx) ) {
				case 1: {
                    setState(1950);
					match(T_AS);
					}
					break;
                }
                setState(1953);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(1954);
				match(T_OPEN_P);
                setState(1955);
				match(T_TITLE);
                setState(1956);
				match(L_S_STRING);
                setState(1957);
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

	public final Select_list_asteriskContext select_list_asterisk() throws RecognitionException {
		Select_list_asteriskContext _localctx = new Select_list_asteriskContext(_ctx, getState());
        enterRule(_localctx, 256, RULE_select_list_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_ID) {
                {
                    setState(1960);
				match(L_ID);
                    setState(1961);
				match(T__3);
				}
            }

                setState(1964);
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

	public final Into_clauseContext into_clause() throws RecognitionException {
		Into_clauseContext _localctx = new Into_clauseContext(_ctx, getState());
        enterRule(_localctx, 258, RULE_into_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(1966);
			match(T_INTO);
                setState(1967);
			ident();
                setState(1972);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        {
                            setState(1968);
					match(T_COMMA);
                            setState(1969);
					ident();
                        }
                    }
                }
                setState(1974);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 238,_ctx);
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

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
        enterRule(_localctx, 260, RULE_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(1975);
			match(T_FROM);
                setState(1976);
			from_table_clause();
                setState(1980);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 239,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        {
                            setState(1977);
					from_join_clause();
                        }
                    }
                }
                setState(1982);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 239,_ctx);
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

	public final From_table_clauseContext from_table_clause() throws RecognitionException {
		From_table_clauseContext _localctx = new From_table_clauseContext(_ctx, getState());
        enterRule(_localctx, 262, RULE_from_table_clause);
        try {
            setState(1986);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 240, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(1983);
				from_table_name_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(1984);
				from_subselect_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(1985);
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

	public final From_table_name_clauseContext from_table_name_clause() throws RecognitionException {
		From_table_name_clauseContext _localctx = new From_table_name_clauseContext(_ctx, getState());
        enterRule(_localctx, 264, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1988);
			table_name();
                setState(1990);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 241, _ctx) ) {
			case 1: {
                setState(1989);
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

	public final From_subselect_clauseContext from_subselect_clause() throws RecognitionException {
		From_subselect_clauseContext _localctx = new From_subselect_clauseContext(_ctx, getState());
        enterRule(_localctx, 266, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(1992);
			match(T_OPEN_P);
                setState(1993);
			select_stmt();
                setState(1994);
			match(T_CLOSE_P);
                setState(1996);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 242, _ctx) ) {
			case 1: {
                setState(1995);
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

	public final From_join_clauseContext from_join_clause() throws RecognitionException {
		From_join_clauseContext _localctx = new From_join_clauseContext(_ctx, getState());
        enterRule(_localctx, 268, RULE_from_join_clause);
        try {
            setState(2005);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
            {
                setState(1998);
				match(T_COMMA);
                setState(1999);
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
                setState(2000);
				from_join_type_clause();
                setState(2001);
				from_table_clause();
                setState(2002);
				match(T_ON);
                setState(2003);
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

	public final From_join_type_clauseContext from_join_type_clause() throws RecognitionException {
		From_join_type_clauseContext _localctx = new From_join_type_clauseContext(_ctx, getState());
        enterRule(_localctx, 270, RULE_from_join_type_clause);
		int _la;
        try {
            setState(2016);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
            {
                setState(2008);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
                    {
                        setState(2007);
					match(T_INNER);
					}
                }

                setState(2010);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
            {
                setState(2011);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
                }
                setState(2013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
                    {
                        setState(2012);
					match(T_OUTER);
					}
                }

                setState(2015);
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

	public final From_table_values_clauseContext from_table_values_clause() throws RecognitionException {
		From_table_values_clauseContext _localctx = new From_table_values_clauseContext(_ctx, getState());
        enterRule(_localctx, 272, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2018);
			match(T_TABLE);
                setState(2019);
			match(T_OPEN_P);
                setState(2020);
			match(T_VALUES);
                setState(2021);
			from_table_values_row();
                setState(2026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
                    {
                        setState(2022);
				match(T_COMMA);
                        setState(2023);
				from_table_values_row();
				}
                }
                setState(2028);
				_errHandler.sync(this);
				_la = _input.LA(1);
            }
                setState(2029);
			match(T_CLOSE_P);
                setState(2031);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 248, _ctx) ) {
			case 1: {
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

	public final From_table_values_rowContext from_table_values_row() throws RecognitionException {
		From_table_values_rowContext _localctx = new From_table_values_rowContext(_ctx, getState());
        enterRule(_localctx, 274, RULE_from_table_values_row);
		int _la;
        try {
            setState(2045);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 250, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(2033);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(2034);
				match(T_OPEN_P);
                setState(2035);
				expr(0);
                setState(2040);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
                        {
                            setState(2036);
					match(T_COMMA);
                            setState(2037);
					expr(0);
					}
                    }
                    setState(2042);
					_errHandler.sync(this);
					_la = _input.LA(1);
                }
                setState(2043);
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

	public final From_alias_clauseContext from_alias_clause() throws RecognitionException {
		From_alias_clauseContext _localctx = new From_alias_clauseContext(_ctx, getState());
        enterRule(_localctx, 276, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2047);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			         !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			         !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			         !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			         !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			         !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			         !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			         !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
                setState(2049);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 251, _ctx) ) {
			case 1: {
                setState(2048);
				match(T_AS);
				}
				break;
                }
                setState(2051);
			ident();
                setState(2062);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 253, _ctx) ) {
			case 1: {
                setState(2052);
				match(T_OPEN_P);
                setState(2053);
				match(L_ID);
                setState(2058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
                        {
                            setState(2054);
					match(T_COMMA);
                            setState(2055);
					match(L_ID);
					}
                    }
                    setState(2060);
					_errHandler.sync(this);
					_la = _input.LA(1);
                }
                setState(2061);
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

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
        enterRule(_localctx, 278, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2064);
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

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
        enterRule(_localctx, 280, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2066);
			match(T_WHERE);
                setState(2067);
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

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
        enterRule(_localctx, 282, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(2069);
			match(T_GROUP);
                setState(2070);
			match(T_BY);
                setState(2071);
			expr(0);
                setState(2076);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 254,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        {
                            setState(2072);
					match(T_COMMA);
                            setState(2073);
					expr(0);
                        }
                    }
                }
                setState(2078);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 254,_ctx);
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

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
        enterRule(_localctx, 284, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2079);
			match(T_HAVING);
                setState(2080);
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

	public final Qualify_clauseContext qualify_clause() throws RecognitionException {
		Qualify_clauseContext _localctx = new Qualify_clauseContext(_ctx, getState());
        enterRule(_localctx, 286, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2082);
			match(T_QUALIFY);
                setState(2083);
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

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
        enterRule(_localctx, 288, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(2085);
			match(T_ORDER);
                setState(2086);
			match(T_BY);
                setState(2087);
			expr(0);
                setState(2089);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 255, _ctx) ) {
			case 1: {
                setState(2088);
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
                setState(2098);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 257,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        {
                            setState(2091);
					match(T_COMMA);
                            setState(2092);
					expr(0);
                            setState(2094);
					_errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 256, _ctx) ) {
					case 1: {
                        setState(2093);
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
                setState(2100);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 257,_ctx);
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

	public final Select_optionsContext select_options() throws RecognitionException {
		Select_optionsContext _localctx = new Select_optionsContext(_ctx, getState());
        enterRule(_localctx, 290, RULE_select_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(2102);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
                        {
                            setState(2101);
					select_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
                }
                setState(2104);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 258,_ctx);
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

	public final Select_options_itemContext select_options_item() throws RecognitionException {
		Select_options_itemContext _localctx = new Select_options_itemContext(_ctx, getState());
        enterRule(_localctx, 292, RULE_select_options_item);
		int _la;
        try {
            setState(2117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
				enterOuterAlt(_localctx, 1);
            {
                setState(2106);
				match(T_LIMIT);
                setState(2107);
				expr(0);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
            {
                setState(2108);
				match(T_WITH);
                setState(2109);
				_la = _input.LA(1);
				if ( !(_la==T_CS || ((((_la - 207)) & ~0x3f) == 0 && ((1L << (_la - 207)) & ((1L << (T_RR - 207)) | (1L << (T_RS - 207)) | (1L << (T_UR - 207)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
                }
                setState(2115);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 259, _ctx) ) {
				case 1: {
                    setState(2110);
					match(T_USE);
                    setState(2111);
					match(T_AND);
                    setState(2112);
					match(T_KEEP);
                    setState(2113);
					_la = _input.LA(1);
					if ( !(_la==T_EXCLUSIVE || _la==T_SHARE || _la==T_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
                    }
                    setState(2114);
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

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
        int _startState = 294;
        enterRecursionRule(_localctx, 294, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(2128);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 262, _ctx) ) {
			case 1: {
                setState(2121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
                    {
                        setState(2120);
					match(T_NOT);
					}
                }

                setState(2123);
				match(T_OPEN_P);
                setState(2124);
				bool_expr(0);
                setState(2125);
				match(T_CLOSE_P);
				}
				break;
			case 2: {
                setState(2127);
				bool_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
                setState(2136);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 263,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
                        setState(2130);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                        setState(2131);
					bool_expr_logical_operator();
                        setState(2132);
					bool_expr(3);
                    }
                    }
                }
                setState(2138);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 263,_ctx);
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

	public final Bool_expr_atomContext bool_expr_atom() throws RecognitionException {
		Bool_expr_atomContext _localctx = new Bool_expr_atomContext(_ctx, getState());
        enterRule(_localctx, 296, RULE_bool_expr_atom);
        try {
            setState(2142);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 264, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(2139);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(2140);
				bool_expr_binary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(2141);
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

	public final Bool_expr_unaryContext bool_expr_unary() throws RecognitionException {
		Bool_expr_unaryContext _localctx = new Bool_expr_unaryContext(_ctx, getState());
        enterRule(_localctx, 298, RULE_bool_expr_unary);
		int _la;
        try {
            setState(2167);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 267, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(2144);
				expr(0);
                setState(2145);
				match(T_IS);
                setState(2147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
                    {
                        setState(2146);
					match(T_NOT);
					}
                }

                setState(2149);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(2151);
				expr(0);
                setState(2152);
				match(T_BETWEEN);
                setState(2153);
				expr(0);
                setState(2154);
				match(T_AND);
                setState(2155);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(2158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
                    {
                        setState(2157);
					match(T_NOT);
					}
                }

                setState(2160);
				match(T_EXISTS);
                setState(2161);
				match(T_OPEN_P);
                setState(2162);
				select_stmt();
                setState(2163);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
            {
                setState(2165);
				bool_expr_single_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
            {
                setState(2166);
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

	public final Bool_expr_single_inContext bool_expr_single_in() throws RecognitionException {
		Bool_expr_single_inContext _localctx = new Bool_expr_single_inContext(_ctx, getState());
        enterRule(_localctx, 300, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2169);
			expr(0);
                setState(2171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
                {
                    setState(2170);
				match(T_NOT);
				}
            }

                setState(2173);
			match(T_IN);
                setState(2174);
			match(T_OPEN_P);
                setState(2184);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 270, _ctx) ) {
			case 1:
				{
                    {
                        setState(2175);
				expr(0);
                        setState(2180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
                        {
                            setState(2176);
					match(T_COMMA);
                            setState(2177);
					expr(0);
					}
                    }
                    setState(2182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2: {
                setState(2183);
				select_stmt();
				}
				break;
                }
                setState(2186);
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

	public final Bool_expr_multi_inContext bool_expr_multi_in() throws RecognitionException {
		Bool_expr_multi_inContext _localctx = new Bool_expr_multi_inContext(_ctx, getState());
        enterRule(_localctx, 302, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2188);
			match(T_OPEN_P);
                setState(2189);
			expr(0);
                setState(2194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
                    {
                        setState(2190);
				match(T_COMMA);
                        setState(2191);
				expr(0);
				}
                }
                setState(2196);
				_errHandler.sync(this);
				_la = _input.LA(1);
            }
                setState(2197);
			match(T_CLOSE_P);
                setState(2199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
                {
                    setState(2198);
				match(T_NOT);
				}
            }

                setState(2201);
			match(T_IN);
                setState(2202);
			match(T_OPEN_P);
                setState(2203);
			select_stmt();
                setState(2204);
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

	public final Bool_expr_binaryContext bool_expr_binary() throws RecognitionException {
		Bool_expr_binaryContext _localctx = new Bool_expr_binaryContext(_ctx, getState());
        enterRule(_localctx, 304, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2206);
			expr(0);
                setState(2207);
			bool_expr_binary_operator();
                setState(2208);
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

	public final Bool_expr_logical_operatorContext bool_expr_logical_operator() throws RecognitionException {
		Bool_expr_logical_operatorContext _localctx = new Bool_expr_logical_operatorContext(_ctx, getState());
        enterRule(_localctx, 306, RULE_bool_expr_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2210);
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

	public final Bool_expr_binary_operatorContext bool_expr_binary_operator() throws RecognitionException {
		Bool_expr_binary_operatorContext _localctx = new Bool_expr_binary_operatorContext(_ctx, getState());
        enterRule(_localctx, 308, RULE_bool_expr_binary_operator);
		int _la;
        try {
            setState(2224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
            {
                setState(2212);
				match(T_EQUAL);
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 2);
            {
                setState(2213);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 3);
            {
                setState(2214);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 4);
            {
                setState(2215);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 5);
            {
                setState(2216);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 6);
            {
                setState(2217);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 7);
            {
                setState(2218);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 8);
            {
                setState(2219);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 9);
            {
                setState(2221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
                    {
                        setState(2220);
					match(T_NOT);
					}
                }

                setState(2223);
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

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
        int _startState = 310;
        enterRecursionRule(_localctx, 310, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(2243);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 275, _ctx) ) {
			case 1: {
                setState(2227);
				match(T_OPEN_P);
                setState(2228);
				select_stmt();
                setState(2229);
				match(T_CLOSE_P);
				}
				break;
			case 2: {
                setState(2231);
				match(T_OPEN_P);
                setState(2232);
				expr(0);
                setState(2233);
				match(T_CLOSE_P);
				}
				break;
			case 3: {
                setState(2235);
				expr_interval();
				}
				break;
			case 4: {
                setState(2236);
				expr_concat();
				}
				break;
			case 5: {
                setState(2237);
				expr_case();
				}
				break;
			case 6: {
                setState(2238);
				expr_cursor_attribute();
				}
				break;
			case 7: {
                setState(2239);
				expr_agg_window_func();
				}
				break;
			case 8: {
                setState(2240);
				expr_spec_func();
				}
				break;
			case 9: {
                setState(2241);
				expr_func();
				}
				break;
			case 10: {
                setState(2242);
				expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
                setState(2261);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 277,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
                    {
                        setState(2259);
					_errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 276, _ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
                            setState(2245);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                            setState(2246);
						match(T_MUL);
                            setState(2247);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
                            setState(2248);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                            setState(2249);
						match(T_DIV);
                            setState(2250);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
                            setState(2251);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                            setState(2252);
						match(T_ADD);
                            setState(2253);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
                            setState(2254);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                            setState(2255);
						match(T_SUB);
                            setState(2256);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
                            setState(2257);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                            setState(2258);
						interval_item();
						}
						break;
                        }
                    }
                }
                setState(2263);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 277,_ctx);
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

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
        enterRule(_localctx, 312, RULE_expr_atom);
        try {
            setState(2272);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 278, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(2264);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(2265);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(2266);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
            {
                setState(2267);
				ident();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
            {
                setState(2268);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
            {
                setState(2269);
				dec_number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
            {
                setState(2270);
				int_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
            {
                setState(2271);
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

	public final Expr_intervalContext expr_interval() throws RecognitionException {
		Expr_intervalContext _localctx = new Expr_intervalContext(_ctx, getState());
        enterRule(_localctx, 314, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2274);
			match(T_INTERVAL);
                setState(2275);
			expr(0);
                setState(2276);
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

	public final Interval_itemContext interval_item() throws RecognitionException {
		Interval_itemContext _localctx = new Interval_itemContext(_ctx, getState());
        enterRule(_localctx, 316, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2278);
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

	public final Expr_concatContext expr_concat() throws RecognitionException {
		Expr_concatContext _localctx = new Expr_concatContext(_ctx, getState());
        enterRule(_localctx, 318, RULE_expr_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(2280);
			expr_concat_item();
                setState(2281);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
            }
                setState(2282);
			expr_concat_item();
                setState(2287);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 279,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        {
                            setState(2283);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
                    }
                            setState(2284);
					expr_concat_item();
                        }
                    }
                }
                setState(2289);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 279,_ctx);
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

	public final Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		Expr_concat_itemContext _localctx = new Expr_concat_itemContext(_ctx, getState());
        enterRule(_localctx, 320, RULE_expr_concat_item);
        try {
            setState(2299);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 280, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(2290);
				match(T_OPEN_P);
                setState(2291);
				expr(0);
                setState(2292);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(2294);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(2295);
				expr_agg_window_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
            {
                setState(2296);
				expr_spec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
            {
                setState(2297);
				expr_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
            {
                setState(2298);
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

	public final Expr_caseContext expr_case() throws RecognitionException {
		Expr_caseContext _localctx = new Expr_caseContext(_ctx, getState());
        enterRule(_localctx, 322, RULE_expr_case);
        try {
            setState(2303);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 281, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(2301);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(2302);
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

	public final Expr_case_simpleContext expr_case_simple() throws RecognitionException {
		Expr_case_simpleContext _localctx = new Expr_case_simpleContext(_ctx, getState());
        enterRule(_localctx, 324, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2305);
			match(T_CASE);
                setState(2306);
			expr(0);
                setState(2312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
                    {
                        setState(2307);
				match(T_WHEN);
                        setState(2308);
				expr(0);
                        setState(2309);
				match(T_THEN);
                        setState(2310);
				expr(0);
				}
                }
                setState(2314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN);
                setState(2318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
                {
                    setState(2316);
				match(T_ELSE);
                    setState(2317);
				expr(0);
				}
            }

                setState(2320);
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

	public final Expr_case_searchedContext expr_case_searched() throws RecognitionException {
		Expr_case_searchedContext _localctx = new Expr_case_searchedContext(_ctx, getState());
        enterRule(_localctx, 326, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2322);
			match(T_CASE);
                setState(2328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
                    {
                        setState(2323);
				match(T_WHEN);
                        setState(2324);
				bool_expr(0);
                        setState(2325);
				match(T_THEN);
                        setState(2326);
				expr(0);
				}
                }
                setState(2330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN);
                setState(2334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
                {
                    setState(2332);
				match(T_ELSE);
                    setState(2333);
				expr(0);
				}
            }

                setState(2336);
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

	public final Expr_cursor_attributeContext expr_cursor_attribute() throws RecognitionException {
		Expr_cursor_attributeContext _localctx = new Expr_cursor_attributeContext(_ctx, getState());
        enterRule(_localctx, 328, RULE_expr_cursor_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2338);
			ident();
                setState(2339);
			match(T__2);
                setState(2340);
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

	public final Expr_agg_window_funcContext expr_agg_window_func() throws RecognitionException {
		Expr_agg_window_funcContext _localctx = new Expr_agg_window_funcContext(_ctx, getState());
        enterRule(_localctx, 330, RULE_expr_agg_window_func);
		int _la;
        try {
            setState(2494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
            {
                setState(2342);
				match(T_AVG);
                setState(2343);
				match(T_OPEN_P);
                setState(2345);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 286, _ctx) ) {
				case 1: {
                    setState(2344);
					expr_func_all_distinct();
					}
					break;
                }
                setState(2347);
				expr(0);
                setState(2348);
				match(T_CLOSE_P);
                setState(2350);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 287, _ctx) ) {
				case 1: {
                    setState(2349);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
            {
                setState(2352);
				match(T_COUNT);
                setState(2353);
				match(T_OPEN_P);
                setState(2359);
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
                            setState(2355);
					_errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 288, _ctx) ) {
					case 1: {
                        setState(2354);
						expr_func_all_distinct();
						}
						break;
                            }
                            setState(2357);
					expr(0);
					}
					}
					break;
				case T_MUL: {
                    setState(2358);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
                }
                setState(2361);
				match(T_CLOSE_P);
                setState(2363);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 290, _ctx) ) {
				case 1: {
                    setState(2362);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
            {
                setState(2365);
				match(T_COUNT_BIG);
                setState(2366);
				match(T_OPEN_P);
                setState(2372);
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
                            setState(2368);
					_errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 291, _ctx) ) {
					case 1: {
                        setState(2367);
						expr_func_all_distinct();
						}
						break;
                            }
                            setState(2370);
					expr(0);
					}
					}
					break;
				case T_MUL: {
                    setState(2371);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
                }
                setState(2374);
				match(T_CLOSE_P);
                setState(2376);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 293, _ctx) ) {
				case 1: {
                    setState(2375);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
            {
                setState(2378);
				match(T_CUME_DIST);
                setState(2379);
				match(T_OPEN_P);
                setState(2380);
				match(T_CLOSE_P);
                setState(2381);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
            {
                setState(2382);
				match(T_DENSE_RANK);
                setState(2383);
				match(T_OPEN_P);
                setState(2384);
				match(T_CLOSE_P);
                setState(2385);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
            {
                setState(2386);
				match(T_FIRST_VALUE);
                setState(2387);
				match(T_OPEN_P);
                setState(2388);
				expr(0);
                setState(2389);
				match(T_CLOSE_P);
                setState(2390);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
            {
                setState(2392);
				match(T_LAG);
                setState(2393);
				match(T_OPEN_P);
                setState(2394);
				expr(0);
                setState(2401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
                    {
                        setState(2395);
					match(T_COMMA);
                        setState(2396);
					expr(0);
                        setState(2399);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
                        {
                            setState(2397);
						match(T_COMMA);
                            setState(2398);
						expr(0);
						}
					}

					}
                }

                setState(2403);
				match(T_CLOSE_P);
                setState(2404);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
            {
                setState(2406);
				match(T_LAST_VALUE);
                setState(2407);
				match(T_OPEN_P);
                setState(2408);
				expr(0);
                setState(2409);
				match(T_CLOSE_P);
                setState(2410);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
            {
                setState(2412);
				match(T_LEAD);
                setState(2413);
				match(T_OPEN_P);
                setState(2414);
				expr(0);
                setState(2421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
                    {
                        setState(2415);
					match(T_COMMA);
                        setState(2416);
					expr(0);
                        setState(2419);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
                        {
                            setState(2417);
						match(T_COMMA);
                            setState(2418);
						expr(0);
						}
					}

					}
                }

                setState(2423);
				match(T_CLOSE_P);
                setState(2424);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
            {
                setState(2426);
				match(T_MAX);
                setState(2427);
				match(T_OPEN_P);
                setState(2429);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 298, _ctx) ) {
				case 1: {
                    setState(2428);
					expr_func_all_distinct();
					}
					break;
                }
                setState(2431);
				expr(0);
                setState(2432);
				match(T_CLOSE_P);
                setState(2434);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 299, _ctx) ) {
				case 1: {
                    setState(2433);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
            {
                setState(2436);
				match(T_MIN);
                setState(2437);
				match(T_OPEN_P);
                setState(2439);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 300, _ctx) ) {
				case 1: {
                    setState(2438);
					expr_func_all_distinct();
					}
					break;
                }
                setState(2441);
				expr(0);
                setState(2442);
				match(T_CLOSE_P);
                setState(2444);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 301, _ctx) ) {
				case 1: {
                    setState(2443);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
            {
                setState(2446);
				match(T_RANK);
                setState(2447);
				match(T_OPEN_P);
                setState(2448);
				match(T_CLOSE_P);
                setState(2449);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
            {
                setState(2450);
				match(T_ROW_NUMBER);
                setState(2451);
				match(T_OPEN_P);
                setState(2452);
				match(T_CLOSE_P);
                setState(2453);
				expr_func_over_clause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
            {
                setState(2454);
				match(T_STDEV);
                setState(2455);
				match(T_OPEN_P);
                setState(2457);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 302, _ctx) ) {
				case 1: {
                    setState(2456);
					expr_func_all_distinct();
					}
					break;
                }
                setState(2459);
				expr(0);
                setState(2460);
				match(T_CLOSE_P);
                setState(2462);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 303, _ctx) ) {
				case 1: {
                    setState(2461);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
            {
                setState(2464);
				match(T_SUM);
                setState(2465);
				match(T_OPEN_P);
                setState(2467);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 304, _ctx) ) {
				case 1: {
                    setState(2466);
					expr_func_all_distinct();
					}
					break;
                }
                setState(2469);
				expr(0);
                setState(2470);
				match(T_CLOSE_P);
                setState(2472);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 305, _ctx) ) {
				case 1: {
                    setState(2471);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 16);
            {
                setState(2474);
				match(T_VAR);
                setState(2475);
				match(T_OPEN_P);
                setState(2477);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 306, _ctx) ) {
				case 1: {
                    setState(2476);
					expr_func_all_distinct();
					}
					break;
                }
                setState(2479);
				expr(0);
                setState(2480);
				match(T_CLOSE_P);
                setState(2482);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 307, _ctx) ) {
				case 1: {
                    setState(2481);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 17);
            {
                setState(2484);
				match(T_VARIANCE);
                setState(2485);
				match(T_OPEN_P);
                setState(2487);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 308, _ctx) ) {
				case 1: {
                    setState(2486);
					expr_func_all_distinct();
					}
					break;
                }
                setState(2489);
				expr(0);
                setState(2490);
				match(T_CLOSE_P);
                setState(2492);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 309, _ctx) ) {
				case 1: {
                    setState(2491);
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

	public final Expr_func_all_distinctContext expr_func_all_distinct() throws RecognitionException {
		Expr_func_all_distinctContext _localctx = new Expr_func_all_distinctContext(_ctx, getState());
        enterRule(_localctx, 332, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2496);
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

	public final Expr_func_over_clauseContext expr_func_over_clause() throws RecognitionException {
		Expr_func_over_clauseContext _localctx = new Expr_func_over_clauseContext(_ctx, getState());
        enterRule(_localctx, 334, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2498);
			match(T_OVER);
                setState(2499);
			match(T_OPEN_P);
                setState(2501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
                {
                    setState(2500);
				expr_func_partition_by_clause();
				}
            }

                setState(2504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
                {
                    setState(2503);
				order_by_clause();
				}
            }

                setState(2506);
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

	public final Expr_func_partition_by_clauseContext expr_func_partition_by_clause() throws RecognitionException {
		Expr_func_partition_by_clauseContext _localctx = new Expr_func_partition_by_clauseContext(_ctx, getState());
        enterRule(_localctx, 336, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2508);
			match(T_PARTITION);
                setState(2509);
			match(T_BY);
                setState(2510);
			expr(0);
                setState(2515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
                    {
                        setState(2511);
				match(T_COMMA);
                        setState(2512);
				expr(0);
				}
                }
                setState(2517);
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

	public final Expr_spec_funcContext expr_spec_func() throws RecognitionException {
		Expr_spec_funcContext _localctx = new Expr_spec_funcContext(_ctx, getState());
        enterRule(_localctx, 338, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
            setState(2718);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 334, _ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
            {
                setState(2518);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
            {
                setState(2519);
				match(T_CAST);
                setState(2520);
				match(T_OPEN_P);
                setState(2521);
				expr(0);
                setState(2522);
				match(T_AS);
                setState(2523);
				dtype();
                setState(2525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
                    {
                        setState(2524);
					dtype_len();
					}
                }

                setState(2527);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
            {
                setState(2529);
				match(T_COUNT);
                setState(2530);
				match(T_OPEN_P);
                setState(2533);
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
				case L_CHARS: {
                    setState(2531);
					expr(0);
					}
					break;
				case T_MUL: {
                    setState(2532);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
                }
                setState(2535);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
            {
                setState(2536);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
            {
                setState(2537);
				match(T_CURRENT);
                setState(2538);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
            {
                setState(2542);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP: {
                    setState(2539);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT: {
                    setState(2540);
					match(T_CURRENT);
                    setState(2541);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
                }
                setState(2548);
				_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 317, _ctx) ) {
				case 1: {
                    setState(2544);
					match(T_OPEN_P);
                    setState(2545);
					expr(0);
                    setState(2546);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
            {
                setState(2550);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
            {
                setState(2551);
				match(T_CURRENT);
                setState(2552);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
            {
                setState(2553);
				match(T_MAX_PART_STRING);
                setState(2554);
				match(T_OPEN_P);
                setState(2555);
				expr(0);
                setState(2568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
                    {
                        setState(2556);
					match(T_COMMA);
                        setState(2557);
					expr(0);
                        setState(2565);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
                            {
                                setState(2558);
						match(T_COMMA);
                                setState(2559);
						expr(0);
                                setState(2560);
						match(T_EQUAL);
                                setState(2561);
						expr(0);
						}
                        }
                        setState(2567);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
                }

                setState(2570);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
            {
                setState(2572);
				match(T_MIN_PART_STRING);
                setState(2573);
				match(T_OPEN_P);
                setState(2574);
				expr(0);
                setState(2587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
                    {
                        setState(2575);
					match(T_COMMA);
                        setState(2576);
					expr(0);
                        setState(2584);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
                            {
                                setState(2577);
						match(T_COMMA);
                                setState(2578);
						expr(0);
                                setState(2579);
						match(T_EQUAL);
                                setState(2580);
						expr(0);
						}
                        }
                        setState(2586);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
                }

                setState(2589);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
            {
                setState(2591);
				match(T_MAX_PART_INT);
                setState(2592);
				match(T_OPEN_P);
                setState(2593);
				expr(0);
                setState(2606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
                    {
                        setState(2594);
					match(T_COMMA);
                        setState(2595);
					expr(0);
                        setState(2603);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
                            {
                                setState(2596);
						match(T_COMMA);
                                setState(2597);
						expr(0);
                                setState(2598);
						match(T_EQUAL);
                                setState(2599);
						expr(0);
						}
                        }
                        setState(2605);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
                }

                setState(2608);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
            {
                setState(2610);
				match(T_MIN_PART_INT);
                setState(2611);
				match(T_OPEN_P);
                setState(2612);
				expr(0);
                setState(2625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
                    {
                        setState(2613);
					match(T_COMMA);
                        setState(2614);
					expr(0);
                        setState(2622);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
                            {
                                setState(2615);
						match(T_COMMA);
                                setState(2616);
						expr(0);
                                setState(2617);
						match(T_EQUAL);
                                setState(2618);
						expr(0);
						}
                        }
                        setState(2624);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
                }

                setState(2627);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
            {
                setState(2629);
				match(T_MAX_PART_DATE);
                setState(2630);
				match(T_OPEN_P);
                setState(2631);
				expr(0);
                setState(2644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
                    {
                        setState(2632);
					match(T_COMMA);
                        setState(2633);
					expr(0);
                        setState(2641);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
                            {
                                setState(2634);
						match(T_COMMA);
                                setState(2635);
						expr(0);
                                setState(2636);
						match(T_EQUAL);
                                setState(2637);
						expr(0);
						}
                        }
                        setState(2643);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
                }

                setState(2646);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
            {
                setState(2648);
				match(T_MIN_PART_DATE);
                setState(2649);
				match(T_OPEN_P);
                setState(2650);
				expr(0);
                setState(2663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
                    {
                        setState(2651);
					match(T_COMMA);
                        setState(2652);
					expr(0);
                        setState(2660);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
                            {
                                setState(2653);
						match(T_COMMA);
                                setState(2654);
						expr(0);
                                setState(2655);
						match(T_EQUAL);
                                setState(2656);
						expr(0);
						}
                        }
                        setState(2662);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
                }

                setState(2665);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
            {
                setState(2667);
				match(T_PART_COUNT);
                setState(2668);
				match(T_OPEN_P);
                setState(2669);
				expr(0);
                setState(2677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
                        {
                            setState(2670);
					match(T_COMMA);
                            setState(2671);
					expr(0);
                            setState(2672);
					match(T_EQUAL);
                            setState(2673);
					expr(0);
					}
                    }
                    setState(2679);
					_errHandler.sync(this);
					_la = _input.LA(1);
                }
                setState(2680);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
            {
                setState(2682);
				match(T_PART_LOC);
                setState(2683);
				match(T_OPEN_P);
                setState(2684);
				expr(0);
                setState(2690);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
                            {
                                setState(2685);
						match(T_COMMA);
                                setState(2686);
						expr(0);
                                setState(2687);
						match(T_EQUAL);
                                setState(2688);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
                    }
                    setState(2692);
					_errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 331,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                setState(2696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
                    {
                        setState(2694);
					match(T_COMMA);
                        setState(2695);
					expr(0);
					}
                }

                setState(2698);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
            {
                setState(2700);
				match(T_TRIM);
                setState(2701);
				match(T_OPEN_P);
                setState(2702);
				expr(0);
                setState(2703);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
            {
                setState(2705);
				match(T_SUBSTRING);
                setState(2706);
				match(T_OPEN_P);
                setState(2707);
				expr(0);
                setState(2708);
				match(T_FROM);
                setState(2709);
				expr(0);
                setState(2712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FOR) {
                    {
                        setState(2710);
					match(T_FOR);
                        setState(2711);
					expr(0);
					}
                }

                setState(2714);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
            {
                setState(2716);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
            {
                setState(2717);
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

	public final Expr_funcContext expr_func() throws RecognitionException {
		Expr_funcContext _localctx = new Expr_funcContext(_ctx, getState());
        enterRule(_localctx, 340, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2720);
			ident();
                setState(2721);
			match(T_OPEN_P);
                setState(2723);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 335, _ctx) ) {
			case 1: {
                setState(2722);
				expr_func_params();
				}
				break;
                }
                setState(2725);
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

	public final Expr_func_paramsContext expr_func_params() throws RecognitionException {
		Expr_func_paramsContext _localctx = new Expr_func_paramsContext(_ctx, getState());
        enterRule(_localctx, 342, RULE_expr_func_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(2727);
			func_param();
                setState(2732);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 336,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        {
                            setState(2728);
					match(T_COMMA);
                            setState(2729);
					func_param();
                        }
                    }
                }
                setState(2734);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 336,_ctx);
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

	public final Func_paramContext func_param() throws RecognitionException {
		Func_paramContext _localctx = new Func_paramContext(_ctx, getState());
        enterRule(_localctx, 344, RULE_func_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2735);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
                setState(2741);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 338, _ctx) ) {
			case 1: {
                setState(2736);
				ident();
                setState(2737);
				match(T_EQUAL);
                setState(2739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_GREATER) {
                    {
                        setState(2738);
					match(T_GREATER);
					}
				}

				}
				break;
                }
                setState(2743);
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

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
        enterRule(_localctx, 346, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2745);
			match(T_DATE);
                setState(2746);
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

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
        enterRule(_localctx, 348, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2748);
			match(T_TIMESTAMP);
                setState(2749);
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

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
        enterRule(_localctx, 350, RULE_ident);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
            {
                setState(2753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID: {
                setState(2751);
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
			case L_CHARS: {
                setState(2752);
				non_reserved_words();
				}
				break;
			default:
				throw new NoViableAltException(this);
            }
                setState(2762);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 341,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        {
                            setState(2755);
					match(T__3);
                            setState(2758);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ID: {
                        setState(2756);
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
					case L_CHARS: {
                        setState(2757);
						non_reserved_words();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
                        }
                    }
                }
                setState(2764);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 341,_ctx);
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

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
        enterRule(_localctx, 352, RULE_string);
        try {
            setState(2767);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
            {
                setState(2765);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
            {
                setState(2766);
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

	public final Int_numberContext int_number() throws RecognitionException {
		Int_numberContext _localctx = new Int_numberContext(_ctx, getState());
        enterRule(_localctx, 354, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
                {
                    setState(2769);
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

                setState(2772);
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

	public final Dec_numberContext dec_number() throws RecognitionException {
		Dec_numberContext _localctx = new Dec_numberContext(_ctx, getState());
        enterRule(_localctx, 356, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
                {
                    setState(2774);
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

                setState(2777);
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

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
        enterRule(_localctx, 358, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2779);
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

	public final Null_constContext null_const() throws RecognitionException {
		Null_constContext _localctx = new Null_constContext(_ctx, getState());
        enterRule(_localctx, 360, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
            {
                setState(2781);
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

    public final New_lineContext new_line() throws RecognitionException {
        New_lineContext _localctx = new New_lineContext(_ctx, getState());
        enterRule(_localctx, 362, RULE_new_line);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2783);
                match(T__4);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Non_reserved_wordsContext non_reserved_words() throws RecognitionException {
        Non_reserved_wordsContext _localctx = new Non_reserved_wordsContext(_ctx, getState());
        enterRule(_localctx, 364, RULE_non_reserved_words);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2785);
                _la = _input.LA(1);
                if (!(((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T_ACTION - 6)) | (1L << (T_AND - 6)) | (1L << (T_AS - 6)) | (1L << (T_ASC - 6)) | (1L << (T_ASSOCIATE - 6)) | (1L << (T_AT - 6)) | (1L << (T_AUTO_INCREMENT - 6)) | (1L << (T_AVG - 6)) | (1L << (T_BEGIN - 6)) | (1L << (T_BETWEEN - 6)) | (1L << (T_BIGINT - 6)) | (1L << (T_BINARY_DOUBLE - 6)) | (1L << (T_BINARY_FLOAT - 6)) | (1L << (T_BIT - 6)) | (1L << (T_BODY - 6)) | (1L << (T_BREAK - 6)) | (1L << (T_BY - 6)) | (1L << (T_BYTE - 6)) | (1L << (T_CALL - 6)) | (1L << (T_CASCADE - 6)) | (1L << (T_CASE - 6)) | (1L << (T_CASESPECIFIC - 6)) | (1L << (T_CAST - 6)) | (1L << (T_CHAR - 6)) | (1L << (T_CHARACTER - 6)) | (1L << (T_CHARSET - 6)) | (1L << (T_CLOSE - 6)) | (1L << (T_CLUSTERED - 6)) | (1L << (T_CMP - 6)) | (1L << (T_COLLECT - 6)) | (1L << (T_COLLECTION - 6)) | (1L << (T_COMMENT - 6)) | (1L << (T_CONSTANT - 6)) | (1L << (T_COMPRESS - 6)) | (1L << (T_CONCAT - 6)) | (1L << (T_CONDITION - 6)) | (1L << (T_CONSTRAINT - 6)) | (1L << (T_CONTINUE - 6)) | (1L << (T_COUNT - 6)) | (1L << (T_COUNT_BIG - 6)) | (1L << (T_CREATE - 6)) | (1L << (T_CREATION - 6)) | (1L << (T_CREATOR - 6)) | (1L << (T_CS - 6)) | (1L << (T_CURRENT - 6)) | (1L << (T_DATABASE - 6)) | (1L << (T_DATA - 6)) | (1L << (T_DATE - 6)) | (1L << (T_DATETIME - 6)) | (1L << (T_DAY - 6)) | (1L << (T_DAYS - 6)) | (1L << (T_DEC - 6)) | (1L << (T_DECIMAL - 6)) | (1L << (T_DECLARE - 6)) | (1L << (T_DEFAULT - 6)) | (1L << (T_DEFERRED - 6)) | (1L << (T_DEFINED - 6)) | (1L << (T_DEFINER - 6)) | (1L << (T_DEFINITION - 6)) | (1L << (T_DELETE - 6)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T_DELIMITED - 70)) | (1L << (T_DESC - 70)) | (1L << (T_DIR - 70)) | (1L << (T_DISTINCT - 70)) | (1L << (T_DISTRIBUTE - 70)) | (1L << (T_DO - 70)) | (1L << (T_DOUBLE - 70)) | (1L << (T_DYNAMIC - 70)) | (1L << (T_ENABLE - 70)) | (1L << (T_END - 70)) | (1L << (T_ENGINE - 70)) | (1L << (T_ESCAPED - 70)) | (1L << (T_EXCEPT - 70)) | (1L << (T_EXEC - 70)) | (1L << (T_EXECUTE - 70)) | (1L << (T_EXCEPTION - 70)) | (1L << (T_EXCLUSIVE - 70)) | (1L << (T_EXISTS - 70)) | (1L << (T_EXIT - 70)) | (1L << (T_FALLBACK - 70)) | (1L << (T_FALSE - 70)) | (1L << (T_FIELDS - 70)) | (1L << (T_FLOAT - 70)) | (1L << (T_FOR - 70)) | (1L << (T_FOREIGN - 70)) | (1L << (T_FORMAT - 70)) | (1L << (T_FOUND - 70)) | (1L << (T_FROM - 70)) | (1L << (T_FULL - 70)) | (1L << (T_FUNCTION - 70)) | (1L << (T_GLOBAL - 70)) | (1L << (T_GO - 70)) | (1L << (T_GROUP - 70)) | (1L << (T_HANDLER - 70)) | (1L << (T_HASH - 70)) | (1L << (T_HAVING - 70)) | (1L << (T_IDENTITY - 70)) | (1L << (T_IF - 70)) | (1L << (T_IMMEDIATE - 70)) | (1L << (T_IN - 70)) | (1L << (T_INDEX - 70)) | (1L << (T_INITRANS - 70)) | (1L << (T_INNER - 70)) | (1L << (T_INOUT - 70)) | (1L << (T_INT - 70)) | (1L << (T_INT2 - 70)) | (1L << (T_INT4 - 70)) | (1L << (T_INT8 - 70)) | (1L << (T_INTEGER - 70)) | (1L << (T_INTERSECT - 70)) | (1L << (T_INTERVAL - 70)) | (1L << (T_INTO - 70)) | (1L << (T_INVOKER - 70)) | (1L << (T_IS - 70)) | (1L << (T_ISOPEN - 70)) | (1L << (T_ITEMS - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (T_JOIN - 134)) | (1L << (T_KEEP - 134)) | (1L << (T_KEY - 134)) | (1L << (T_KEYS - 134)) | (1L << (T_LANGUAGE - 134)) | (1L << (T_LEAVE - 134)) | (1L << (T_LEFT - 134)) | (1L << (T_LIKE - 134)) | (1L << (T_LIMIT - 134)) | (1L << (T_LINES - 134)) | (1L << (T_LOCAL - 134)) | (1L << (T_LOCATION - 134)) | (1L << (T_LOCATOR - 134)) | (1L << (T_LOCATORS - 134)) | (1L << (T_LOCKS - 134)) | (1L << (T_LOG - 134)) | (1L << (T_LOGGED - 134)) | (1L << (T_LOGGING - 134)) | (1L << (T_LOOP - 134)) | (1L << (T_MAP - 134)) | (1L << (T_MAX - 134)) | (1L << (T_MAXTRANS - 134)) | (1L << (T_MICROSECOND - 134)) | (1L << (T_MICROSECONDS - 134)) | (1L << (T_MIN - 134)) | (1L << (T_MULTISET - 134)) | (1L << (T_NCHAR - 134)) | (1L << (T_NVARCHAR - 134)) | (1L << (T_NO - 134)) | (1L << (T_NOCOMPRESS - 134)) | (1L << (T_NOLOGGING - 134)) | (1L << (T_NOT - 134)) | (1L << (T_NOTFOUND - 134)) | (1L << (T_NUMERIC - 134)) | (1L << (T_NUMBER - 134)) | (1L << (T_ON - 134)) | (1L << (T_ONLY - 134)) | (1L << (T_OPEN - 134)) | (1L << (T_OR - 134)) | (1L << (T_ORDER - 134)) | (1L << (T_OUT - 134)) | (1L << (T_OUTER - 134)) | (1L << (T_OVER - 134)) | (1L << (T_OWNER - 134)) | (1L << (T_PACKAGE - 134)) | (1L << (T_PARTITION - 134)) | (1L << (T_PCTFREE - 134)) | (1L << (T_PCTUSED - 134)) | (1L << (T_PRECISION - 134)) | (1L << (T_PRESERVE - 134)) | (1L << (T_PRIMARY - 134)) | (1L << (T_PROC - 134)) | (1L << (T_PROCEDURE - 134)) | (1L << (T_QUALIFY - 134)) | (1L << (T_QUIT - 134)) | (1L << (T_REAL - 134)) | (1L << (T_REFERENCES - 134)) | (1L << (T_REGEXP - 134)) | (1L << (T_REPLACE - 134)) | (1L << (T_RESTRICT - 134)) | (1L << (T_RESULT - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (T_RESULT_SET_LOCATOR - 198)) | (1L << (T_RETURN - 198)) | (1L << (T_RETURNS - 198)) | (1L << (T_REVERSE - 198)) | (1L << (T_RIGHT - 198)) | (1L << (T_RLIKE - 198)) | (1L << (T_ROW - 198)) | (1L << (T_ROWS - 198)) | (1L << (T_ROW_COUNT - 198)) | (1L << (T_RR - 198)) | (1L << (T_RS - 198)) | (1L << (T_TRIM - 198)) | (1L << (T_SCHEMA - 198)) | (1L << (T_SECOND - 198)) | (1L << (T_SECONDS - 198)) | (1L << (T_SECURITY - 198)) | (1L << (T_SEGMENT - 198)) | (1L << (T_SEL - 198)) | (1L << (T_SELECT - 198)) | (1L << (T_SET - 198)) | (1L << (T_SETS - 198)) | (1L << (T_SHARE - 198)) | (1L << (T_SIMPLE_DOUBLE - 198)) | (1L << (T_SIMPLE_FLOAT - 198)) | (1L << (T_SMALLDATETIME - 198)) | (1L << (T_SMALLINT - 198)) | (1L << (T_SQL - 198)) | (1L << (T_SQLEXCEPTION - 198)) | (1L << (T_SQLWARNING - 198)) | (1L << (T_STEP - 198)) | (1L << (T_STORAGE - 198)) | (1L << (T_STORED - 198)) | (1L << (T_STRING - 198)) | (1L << (T_SUBSTRING - 198)) | (1L << (T_SUM - 198)) | (1L << (T_SYS_REFCURSOR - 198)) | (1L << (T_TABLE - 198)) | (1L << (T_TABLESPACE - 198)) | (1L << (T_TEMPORARY - 198)) | (1L << (T_TERMINATED - 198)) | (1L << (T_TEXTIMAGE_ON - 198)) | (1L << (T_THEN - 198)) | (1L << (T_TIMESTAMP - 198)) | (1L << (T_TITLE - 198)) | (1L << (T_TO - 198)) | (1L << (T_TOP - 198)) | (1L << (T_TRUE - 198)) | (1L << (T_UNIQUE - 198)) | (1L << (T_UPDATE - 198)) | (1L << (T_UR - 198)) | (1L << (T_USE - 198)) | (1L << (T_USING - 198)) | (1L << (T_VALUE - 198)) | (1L << (T_VALUES - 198)) | (1L << (T_VAR - 198)) | (1L << (T_VARCHAR - 198)) | (1L << (T_VARCHAR2 - 198)) | (1L << (T_VARYING - 198)) | (1L << (T_VOLATILE - 198)))) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (T_WHILE - 263)) | (1L << (T_WITH - 263)) | (1L << (T_XML - 263)) | (1L << (T_YES - 263)) | (1L << (T_ACTIVITY_COUNT - 263)) | (1L << (T_CUME_DIST - 263)) | (1L << (T_CURRENT_DATE - 263)) | (1L << (T_CURRENT_TIMESTAMP - 263)) | (1L << (T_CURRENT_USER - 263)) | (1L << (T_DENSE_RANK - 263)) | (1L << (T_FIRST_VALUE - 263)) | (1L << (T_LAG - 263)) | (1L << (T_LAST_VALUE - 263)) | (1L << (T_LEAD - 263)) | (1L << (T_PART_COUNT - 263)) | (1L << (T_PART_LOC - 263)) | (1L << (T_RANK - 263)) | (1L << (T_ROW_NUMBER - 263)) | (1L << (T_STDEV - 263)) | (1L << (T_SYSDATE - 263)) | (1L << (T_VARIANCE - 263)) | (1L << (T_USER - 263)) | (1L << (L_CHARS - 263)))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 4:
                return block_end_sempred((Block_endContext) _localctx, predIndex);
            case 18:
                return expr_stmt_sempred((Expr_stmtContext) _localctx, predIndex);
            case 77:
                return create_routine_params_sempred((Create_routine_paramsContext) _localctx, predIndex);
            case 127:
                return select_list_alias_sempred((Select_list_aliasContext) _localctx, predIndex);
            case 138:
                return from_alias_clause_sempred((From_alias_clauseContext) _localctx, predIndex);
            case 147:
                return bool_expr_sempred((Bool_exprContext) _localctx, predIndex);
            case 155:
                return expr_sempred((ExprContext) _localctx, predIndex);
            case 172:
                return func_param_sempred((Func_paramContext) _localctx, predIndex);
        }
        return true;
    }

    public static class ProgramContext extends ParserRuleContext {
        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(HplsqlParser.EOF, 0);
        }

        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_program;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterProgram(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitProgram(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitProgram(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BlockContext extends ParserRuleContext {
        public List<Begin_end_blockContext> begin_end_block() {
            return getRuleContexts(Begin_end_blockContext.class);
        }

        public Begin_end_blockContext begin_end_block(int i) {
            return getRuleContext(Begin_end_blockContext.class, i);
        }

        public List<StmtContext> stmt() {
            return getRuleContexts(StmtContext.class);
        }

        public StmtContext stmt(int i) {
            return getRuleContext(StmtContext.class, i);
        }

        public List<TerminalNode> T_GO() {
            return getTokens(HplsqlParser.T_GO);
        }

        public TerminalNode T_GO(int i) {
            return getToken(HplsqlParser.T_GO, i);
        }

        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Begin_end_blockContext extends ParserRuleContext {
        public TerminalNode T_BEGIN() {
            return getToken(HplsqlParser.T_BEGIN, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public Block_endContext block_end() {
            return getRuleContext(Block_endContext.class, 0);
        }

        public Declare_blockContext declare_block() {
            return getRuleContext(Declare_blockContext.class, 0);
        }

        public Exception_blockContext exception_block() {
            return getRuleContext(Exception_blockContext.class, 0);
        }

        public Begin_end_blockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_begin_end_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterBegin_end_block(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitBegin_end_block(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitBegin_end_block(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Single_block_stmtContext extends ParserRuleContext {
        public TerminalNode T_BEGIN() {
            return getToken(HplsqlParser.T_BEGIN, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public Block_endContext block_end() {
            return getRuleContext(Block_endContext.class, 0);
        }

        public Exception_blockContext exception_block() {
            return getRuleContext(Exception_blockContext.class, 0);
        }

        public StmtContext stmt() {
            return getRuleContext(StmtContext.class, 0);
        }

        public TerminalNode T_SEMICOLON() {
            return getToken(HplsqlParser.T_SEMICOLON, 0);
        }

        public Single_block_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_single_block_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterSingle_block_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitSingle_block_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitSingle_block_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Block_endContext extends ParserRuleContext {
        public TerminalNode T_END() {
            return getToken(HplsqlParser.T_END, 0);
        }

        public Block_endContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block_end;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterBlock_end(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitBlock_end(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitBlock_end(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Proc_blockContext extends ParserRuleContext {
        public Begin_end_blockContext begin_end_block() {
            return getRuleContext(Begin_end_blockContext.class, 0);
        }

        public List<StmtContext> stmt() {
            return getRuleContexts(StmtContext.class);
        }

        public StmtContext stmt(int i) {
            return getRuleContext(StmtContext.class, i);
        }

        public TerminalNode T_GO() {
            return getToken(HplsqlParser.T_GO, 0);
        }

        public Proc_blockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_proc_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterProc_block(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitProc_block(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitProc_block(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StmtContext extends ParserRuleContext {
        public Error_stmtContext error_stmt() {
            return getRuleContext(Error_stmtContext.class, 0);
        }

        public Cpp_function_stmtContext cpp_function_stmt() {
            return getRuleContext(Cpp_function_stmtContext.class, 0);
        }

        public Cpp_if_stmtContext cpp_if_stmt() {
            return getRuleContext(Cpp_if_stmtContext.class, 0);
        }

        public Cpp_for_stmtContext cpp_for_stmt() {
            return getRuleContext(Cpp_for_stmtContext.class, 0);
        }

        public Assignment_stmtContext assignment_stmt() {
            return getRuleContext(Assignment_stmtContext.class, 0);
        }

        public Associate_locator_stmtContext associate_locator_stmt() {
            return getRuleContext(Associate_locator_stmtContext.class, 0);
        }

        public Break_stmtContext break_stmt() {
            return getRuleContext(Break_stmtContext.class, 0);
        }

        public Call_stmtContext call_stmt() {
            return getRuleContext(Call_stmtContext.class, 0);
        }

        public Close_stmtContext close_stmt() {
            return getRuleContext(Close_stmtContext.class, 0);
        }

        public Cmp_stmtContext cmp_stmt() {
            return getRuleContext(Cmp_stmtContext.class, 0);
        }

        public Create_database_stmtContext create_database_stmt() {
            return getRuleContext(Create_database_stmtContext.class, 0);
        }

        public Create_function_stmtContext create_function_stmt() {
            return getRuleContext(Create_function_stmtContext.class, 0);
        }

        public Create_index_stmtContext create_index_stmt() {
            return getRuleContext(Create_index_stmtContext.class, 0);
        }

        public Create_local_temp_table_stmtContext create_local_temp_table_stmt() {
            return getRuleContext(Create_local_temp_table_stmtContext.class, 0);
        }

        public Create_package_stmtContext create_package_stmt() {
            return getRuleContext(Create_package_stmtContext.class, 0);
        }

        public Create_package_body_stmtContext create_package_body_stmt() {
            return getRuleContext(Create_package_body_stmtContext.class, 0);
        }

        public Create_procedure_stmtContext create_procedure_stmt() {
            return getRuleContext(Create_procedure_stmtContext.class, 0);
        }

        public Create_table_stmtContext create_table_stmt() {
            return getRuleContext(Create_table_stmtContext.class, 0);
        }

        public Create_type_stmtContext create_type_stmt() {
            return getRuleContext(Create_type_stmtContext.class, 0);
        }

        public Declare_stmtContext declare_stmt() {
            return getRuleContext(Declare_stmtContext.class, 0);
        }

        public Exec_stmtContext exec_stmt() {
            return getRuleContext(Exec_stmtContext.class, 0);
        }

        public Exit_stmtContext exit_stmt() {
            return getRuleContext(Exit_stmtContext.class, 0);
        }

        public For_range_stmtContext for_range_stmt() {
            return getRuleContext(For_range_stmtContext.class, 0);
        }

        public If_stmtContext if_stmt() {
            return getRuleContext(If_stmtContext.class, 0);
        }

        public Leave_stmtContext leave_stmt() {
            return getRuleContext(Leave_stmtContext.class, 0);
        }

        public Quit_stmtContext quit_stmt() {
            return getRuleContext(Quit_stmtContext.class, 0);
        }

        public Return_stmtContext return_stmt() {
            return getRuleContext(Return_stmtContext.class, 0);
        }

        public Select_stmtContext select_stmt() {
            return getRuleContext(Select_stmtContext.class, 0);
        }

        public While_stmtContext while_stmt() {
            return getRuleContext(While_stmtContext.class, 0);
        }

        public LabelContext label() {
            return getRuleContext(LabelContext.class, 0);
        }

        public Null_stmtContext null_stmt() {
            return getRuleContext(Null_stmtContext.class, 0);
        }

        public Expr_stmtContext expr_stmt() {
            return getRuleContext(Expr_stmtContext.class, 0);
        }

        public Semicolon_stmtContext semicolon_stmt() {
            return getRuleContext(Semicolon_stmtContext.class, 0);
        }

        public StmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterStmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitStmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitStmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Error_stmtContext extends ParserRuleContext {
        public Invalid_cpp_function_stmtContext invalid_cpp_function_stmt() {
            return getRuleContext(Invalid_cpp_function_stmtContext.class, 0);
        }

        public Error_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_error_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterError_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitError_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitError_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Invalid_bool_exprContext extends ParserRuleContext {
        public Bool_exprContext bool_expr() {
            return getRuleContext(Bool_exprContext.class, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public TerminalNode T_NOT() {
            return getToken(HplsqlParser.T_NOT, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public Invalid_bool_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_invalid_bool_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterInvalid_bool_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitInvalid_bool_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitInvalid_bool_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Invalid_cpp_function_stmtContext extends ParserRuleContext {
        public Invalid_cpp_function_headerContext invalid_cpp_function_header() {
            return getRuleContext(Invalid_cpp_function_headerContext.class, 0);
        }

        public Invalid_cpp_function_bodyContext invalid_cpp_function_body() {
            return getRuleContext(Invalid_cpp_function_bodyContext.class, 0);
        }

        public Cpp_function_bodyContext cpp_function_body() {
            return getRuleContext(Cpp_function_bodyContext.class, 0);
        }

        public Cpp_function_headerContext cpp_function_header() {
            return getRuleContext(Cpp_function_headerContext.class, 0);
        }

        public Invalid_cpp_function_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_invalid_cpp_function_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterInvalid_cpp_function_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitInvalid_cpp_function_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitInvalid_cpp_function_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Invalid_cpp_function_headerContext extends ParserRuleContext {
        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public Cpp_function_params_clauseContext cpp_function_params_clause() {
            return getRuleContext(Cpp_function_params_clauseContext.class, 0);
        }

        public Invalid_cpp_function_params_clauseContext invalid_cpp_function_params_clause() {
            return getRuleContext(Invalid_cpp_function_params_clauseContext.class, 0);
        }

        public DtypeContext dtype() {
            return getRuleContext(DtypeContext.class, 0);
        }

        public Invalid_cpp_function_headerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_invalid_cpp_function_header;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterInvalid_cpp_function_header(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitInvalid_cpp_function_header(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitInvalid_cpp_function_header(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Invalid_cpp_function_params_clauseContext extends ParserRuleContext {
        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public List<Invalid_cpp_function_paramContext> invalid_cpp_function_param() {
            return getRuleContexts(Invalid_cpp_function_paramContext.class);
        }

        public Invalid_cpp_function_paramContext invalid_cpp_function_param(int i) {
            return getRuleContext(Invalid_cpp_function_paramContext.class, i);
        }

        public List<Cpp_function_paramContext> cpp_function_param() {
            return getRuleContexts(Cpp_function_paramContext.class);
        }

        public Cpp_function_paramContext cpp_function_param(int i) {
            return getRuleContext(Cpp_function_paramContext.class, i);
        }

        public Invalid_cpp_function_params_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_invalid_cpp_function_params_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener)
                ((HplsqlListener) listener).enterInvalid_cpp_function_params_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener)
                ((HplsqlListener) listener).exitInvalid_cpp_function_params_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitInvalid_cpp_function_params_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Invalid_cpp_function_paramContext extends ParserRuleContext {
        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public Invalid_cpp_function_paramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_invalid_cpp_function_param;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterInvalid_cpp_function_param(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitInvalid_cpp_function_param(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitInvalid_cpp_function_param(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Invalid_cpp_function_bodyContext extends ParserRuleContext {
        public TerminalNode T_OPEN_B() {
            return getToken(HplsqlParser.T_OPEN_B, 0);
        }

        public List<Cpp_body_contentContext> cpp_body_content() {
            return getRuleContexts(Cpp_body_contentContext.class);
        }

        public Cpp_body_contentContext cpp_body_content(int i) {
            return getRuleContext(Cpp_body_contentContext.class, i);
        }

        public TerminalNode T_CLOSE_B() {
            return getToken(HplsqlParser.T_CLOSE_B, 0);
        }

        public Invalid_cpp_function_bodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_invalid_cpp_function_body;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterInvalid_cpp_function_body(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitInvalid_cpp_function_body(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitInvalid_cpp_function_body(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Exception_blockContext extends ParserRuleContext {
        public TerminalNode T_EXCEPTION() {
            return getToken(HplsqlParser.T_EXCEPTION, 0);
        }

        public List<Exception_block_itemContext> exception_block_item() {
            return getRuleContexts(Exception_block_itemContext.class);
        }

        public Exception_block_itemContext exception_block_item(int i) {
            return getRuleContext(Exception_block_itemContext.class, i);
        }

        public Exception_blockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exception_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterException_block(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitException_block(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitException_block(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Exception_block_itemContext extends ParserRuleContext {
        public List<TerminalNode> T_WHEN() {
            return getTokens(HplsqlParser.T_WHEN);
        }

        public TerminalNode T_WHEN(int i) {
            return getToken(HplsqlParser.T_WHEN, i);
        }

        public TerminalNode L_ID() {
            return getToken(HplsqlParser.L_ID, 0);
        }

        public TerminalNode T_THEN() {
            return getToken(HplsqlParser.T_THEN, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode T_END() {
            return getToken(HplsqlParser.T_END, 0);
        }

        public Exception_block_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exception_block_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterException_block_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitException_block_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitException_block_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Semicolon_stmtContext extends ParserRuleContext {
        public TerminalNode T_SEMICOLON() {
            return getToken(HplsqlParser.T_SEMICOLON, 0);
        }

        public TerminalNode T_DIV() {
            return getToken(HplsqlParser.T_DIV, 0);
        }

        public Semicolon_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_semicolon_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterSemicolon_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitSemicolon_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitSemicolon_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Null_stmtContext extends ParserRuleContext {
        public TerminalNode T_NULL() {
            return getToken(HplsqlParser.T_NULL, 0);
        }

        public Null_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_null_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterNull_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitNull_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitNull_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Expr_stmtContext extends ParserRuleContext {
        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterExpr_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitExpr_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitExpr_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Assignment_stmtContext extends ParserRuleContext {
        public List<Assignment_stmt_itemContext> assignment_stmt_item() {
            return getRuleContexts(Assignment_stmt_itemContext.class);
        }

        public Assignment_stmt_itemContext assignment_stmt_item(int i) {
            return getRuleContext(Assignment_stmt_itemContext.class, i);
        }

        public TerminalNode T_SET() {
            return getToken(HplsqlParser.T_SET, 0);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignment_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterAssignment_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitAssignment_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitAssignment_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Assignment_stmt_itemContext extends ParserRuleContext {
        public Assignment_stmt_single_itemContext assignment_stmt_single_item() {
            return getRuleContext(Assignment_stmt_single_itemContext.class, 0);
        }

        public Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() {
            return getRuleContext(Assignment_stmt_multiple_itemContext.class, 0);
        }

        public Assignment_stmt_select_itemContext assignment_stmt_select_item() {
            return getRuleContext(Assignment_stmt_select_itemContext.class, 0);
        }

        public Assignment_stmt_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignment_stmt_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterAssignment_stmt_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitAssignment_stmt_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitAssignment_stmt_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Assignment_stmt_single_itemContext extends ParserRuleContext {
        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public TerminalNode T_EQUAL() {
            return getToken(HplsqlParser.T_EQUAL, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode T_COLON() {
            return getToken(HplsqlParser.T_COLON, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public Assignment_stmt_single_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignment_stmt_single_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterAssignment_stmt_single_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitAssignment_stmt_single_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitAssignment_stmt_single_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Assignment_stmt_multiple_itemContext extends ParserRuleContext {
        public List<TerminalNode> T_OPEN_P() {
            return getTokens(HplsqlParser.T_OPEN_P);
        }

        public TerminalNode T_OPEN_P(int i) {
            return getToken(HplsqlParser.T_OPEN_P, i);
        }

        public List<IdentContext> ident() {
            return getRuleContexts(IdentContext.class);
        }

        public IdentContext ident(int i) {
            return getRuleContext(IdentContext.class, i);
        }

        public List<TerminalNode> T_CLOSE_P() {
            return getTokens(HplsqlParser.T_CLOSE_P);
        }

        public TerminalNode T_CLOSE_P(int i) {
            return getToken(HplsqlParser.T_CLOSE_P, i);
        }

        public TerminalNode T_EQUAL() {
            return getToken(HplsqlParser.T_EQUAL, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public TerminalNode T_COLON() {
            return getToken(HplsqlParser.T_COLON, 0);
        }

        public Assignment_stmt_multiple_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignment_stmt_multiple_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener)
                ((HplsqlListener) listener).enterAssignment_stmt_multiple_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitAssignment_stmt_multiple_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitAssignment_stmt_multiple_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Assignment_stmt_select_itemContext extends ParserRuleContext {
        public TerminalNode T_EQUAL() {
            return getToken(HplsqlParser.T_EQUAL, 0);
        }

        public List<TerminalNode> T_OPEN_P() {
            return getTokens(HplsqlParser.T_OPEN_P);
        }

        public TerminalNode T_OPEN_P(int i) {
            return getToken(HplsqlParser.T_OPEN_P, i);
        }

        public Select_stmtContext select_stmt() {
            return getRuleContext(Select_stmtContext.class, 0);
        }

        public List<TerminalNode> T_CLOSE_P() {
            return getTokens(HplsqlParser.T_CLOSE_P);
        }

        public TerminalNode T_CLOSE_P(int i) {
            return getToken(HplsqlParser.T_CLOSE_P, i);
        }

        public List<IdentContext> ident() {
            return getRuleContexts(IdentContext.class);
        }

        public IdentContext ident(int i) {
            return getRuleContext(IdentContext.class, i);
        }

        public TerminalNode T_COLON() {
            return getToken(HplsqlParser.T_COLON, 0);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public Assignment_stmt_select_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignment_stmt_select_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterAssignment_stmt_select_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitAssignment_stmt_select_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitAssignment_stmt_select_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Associate_locator_stmtContext extends ParserRuleContext {
        public TerminalNode T_ASSOCIATE() {
            return getToken(HplsqlParser.T_ASSOCIATE, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public List<IdentContext> ident() {
            return getRuleContexts(IdentContext.class);
        }

        public IdentContext ident(int i) {
            return getRuleContext(IdentContext.class, i);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public TerminalNode T_WITH() {
            return getToken(HplsqlParser.T_WITH, 0);
        }

        public TerminalNode T_PROCEDURE() {
            return getToken(HplsqlParser.T_PROCEDURE, 0);
        }

        public TerminalNode T_LOCATOR() {
            return getToken(HplsqlParser.T_LOCATOR, 0);
        }

        public TerminalNode T_LOCATORS() {
            return getToken(HplsqlParser.T_LOCATORS, 0);
        }

        public TerminalNode T_RESULT() {
            return getToken(HplsqlParser.T_RESULT, 0);
        }

        public TerminalNode T_SET() {
            return getToken(HplsqlParser.T_SET, 0);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public Associate_locator_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_associate_locator_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterAssociate_locator_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitAssociate_locator_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitAssociate_locator_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Break_stmtContext extends ParserRuleContext {
        public TerminalNode T_BREAK() {
            return getToken(HplsqlParser.T_BREAK, 0);
        }

        public Break_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_break_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterBreak_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitBreak_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitBreak_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Call_stmtContext extends ParserRuleContext {
        public TerminalNode T_CALL() {
            return getToken(HplsqlParser.T_CALL, 0);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public Expr_func_paramsContext expr_func_params() {
            return getRuleContext(Expr_func_paramsContext.class, 0);
        }

        public Call_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_call_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCall_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCall_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitCall_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Close_stmtContext extends ParserRuleContext {
        public TerminalNode T_CLOSE() {
            return getToken(HplsqlParser.T_CLOSE, 0);
        }

        public TerminalNode L_ID() {
            return getToken(HplsqlParser.L_ID, 0);
        }

        public Close_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_close_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterClose_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitClose_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitClose_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Declare_stmtContext extends ParserRuleContext {
        public TerminalNode T_DECLARE() {
            return getToken(HplsqlParser.T_DECLARE, 0);
        }

        public List<Declare_stmt_itemContext> declare_stmt_item() {
            return getRuleContexts(Declare_stmt_itemContext.class);
        }

        public Declare_stmt_itemContext declare_stmt_item(int i) {
            return getRuleContext(Declare_stmt_itemContext.class, i);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public Declare_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declare_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterDeclare_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitDeclare_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitDeclare_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Declare_blockContext extends ParserRuleContext {
        public TerminalNode T_DECLARE() {
            return getToken(HplsqlParser.T_DECLARE, 0);
        }

        public List<Declare_stmt_itemContext> declare_stmt_item() {
            return getRuleContexts(Declare_stmt_itemContext.class);
        }

        public Declare_stmt_itemContext declare_stmt_item(int i) {
            return getRuleContext(Declare_stmt_itemContext.class, i);
        }

        public List<TerminalNode> T_SEMICOLON() {
            return getTokens(HplsqlParser.T_SEMICOLON);
        }

        public TerminalNode T_SEMICOLON(int i) {
            return getToken(HplsqlParser.T_SEMICOLON, i);
        }

        public Declare_blockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declare_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterDeclare_block(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitDeclare_block(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitDeclare_block(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Declare_block_inplaceContext extends ParserRuleContext {
        public List<Declare_stmt_itemContext> declare_stmt_item() {
            return getRuleContexts(Declare_stmt_itemContext.class);
        }

        public Declare_stmt_itemContext declare_stmt_item(int i) {
            return getRuleContext(Declare_stmt_itemContext.class, i);
        }

        public List<TerminalNode> T_SEMICOLON() {
            return getTokens(HplsqlParser.T_SEMICOLON);
        }

        public TerminalNode T_SEMICOLON(int i) {
            return getToken(HplsqlParser.T_SEMICOLON, i);
        }

        public Declare_block_inplaceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declare_block_inplace;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterDeclare_block_inplace(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitDeclare_block_inplace(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitDeclare_block_inplace(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Declare_stmt_itemContext extends ParserRuleContext {
        public Declare_condition_itemContext declare_condition_item() {
            return getRuleContext(Declare_condition_itemContext.class, 0);
        }

        public Declare_handler_itemContext declare_handler_item() {
            return getRuleContext(Declare_handler_itemContext.class, 0);
        }

        public Declare_var_itemContext declare_var_item() {
            return getRuleContext(Declare_var_itemContext.class, 0);
        }

        public Declare_temporary_table_itemContext declare_temporary_table_item() {
            return getRuleContext(Declare_temporary_table_itemContext.class, 0);
        }

        public Declare_stmt_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declare_stmt_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterDeclare_stmt_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitDeclare_stmt_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitDeclare_stmt_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Declare_var_itemContext extends ParserRuleContext {
        public List<IdentContext> ident() {
            return getRuleContexts(IdentContext.class);
        }

        public IdentContext ident(int i) {
            return getRuleContext(IdentContext.class, i);
        }

        public DtypeContext dtype() {
            return getRuleContext(DtypeContext.class, 0);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public TerminalNode T_AS() {
            return getToken(HplsqlParser.T_AS, 0);
        }

        public Dtype_lenContext dtype_len() {
            return getRuleContext(Dtype_lenContext.class, 0);
        }

        public List<Dtype_attrContext> dtype_attr() {
            return getRuleContexts(Dtype_attrContext.class);
        }

        public Dtype_attrContext dtype_attr(int i) {
            return getRuleContext(Dtype_attrContext.class, i);
        }

        public Dtype_defaultContext dtype_default() {
            return getRuleContext(Dtype_defaultContext.class, 0);
        }

        public TerminalNode T_CONSTANT() {
            return getToken(HplsqlParser.T_CONSTANT, 0);
        }

        public Declare_var_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declare_var_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterDeclare_var_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitDeclare_var_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitDeclare_var_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Declare_condition_itemContext extends ParserRuleContext {
        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public TerminalNode T_CONDITION() {
            return getToken(HplsqlParser.T_CONDITION, 0);
        }

        public Declare_condition_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declare_condition_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterDeclare_condition_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitDeclare_condition_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitDeclare_condition_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Declare_handler_itemContext extends ParserRuleContext {
        public TerminalNode T_HANDLER() {
            return getToken(HplsqlParser.T_HANDLER, 0);
        }

        public TerminalNode T_FOR() {
            return getToken(HplsqlParser.T_FOR, 0);
        }

        public Single_block_stmtContext single_block_stmt() {
            return getRuleContext(Single_block_stmtContext.class, 0);
        }

        public TerminalNode T_CONTINUE() {
            return getToken(HplsqlParser.T_CONTINUE, 0);
        }

        public TerminalNode T_EXIT() {
            return getToken(HplsqlParser.T_EXIT, 0);
        }

        public TerminalNode T_SQLEXCEPTION() {
            return getToken(HplsqlParser.T_SQLEXCEPTION, 0);
        }

        public TerminalNode T_SQLWARNING() {
            return getToken(HplsqlParser.T_SQLWARNING, 0);
        }

        public TerminalNode T_NOT() {
            return getToken(HplsqlParser.T_NOT, 0);
        }

        public TerminalNode T_FOUND() {
            return getToken(HplsqlParser.T_FOUND, 0);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public Declare_handler_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declare_handler_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterDeclare_handler_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitDeclare_handler_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitDeclare_handler_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_type_stmtContext extends ParserRuleContext {
        public TerminalNode T_CREATE() {
            return getToken(HplsqlParser.T_CREATE, 0);
        }

        public TerminalNode T_TYPE() {
            return getToken(HplsqlParser.T_TYPE, 0);
        }

        public Table_nameContext table_name() {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public Create_type_definitionContext create_type_definition() {
            return getRuleContext(Create_type_definitionContext.class, 0);
        }

        public Create_type_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_type_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_type_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_type_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_type_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_type_definitionContext extends ParserRuleContext {
        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public Create_type_itemsContext create_type_items() {
            return getRuleContext(Create_type_itemsContext.class, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public Create_type_definitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_type_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_type_definition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_type_definition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_type_definition(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_type_itemsContext extends ParserRuleContext {
        public List<Create_type_items_itemContext> create_type_items_item() {
            return getRuleContexts(Create_type_items_itemContext.class);
        }

        public Create_type_items_itemContext create_type_items_item(int i) {
            return getRuleContext(Create_type_items_itemContext.class, i);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public Create_type_itemsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_type_items;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_type_items(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_type_items(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_type_items(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_type_items_itemContext extends ParserRuleContext {
        public List<StringContext> string() {
            return getRuleContexts(StringContext.class);
        }

        public StringContext string(int i) {
            return getRuleContext(StringContext.class, i);
        }

        public TerminalNode T_COLON() {
            return getToken(HplsqlParser.T_COLON, 0);
        }

        public Create_type_items_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_type_items_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_type_items_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_type_items_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_type_items_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Declare_temporary_table_itemContext extends ParserRuleContext {
        public Declare_temporary_table_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode T_TEMPORARY() {
            return getToken(HplsqlParser.T_TEMPORARY, 0);
        }

        public TerminalNode T_TABLE() {
            return getToken(HplsqlParser.T_TABLE, 0);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public Create_table_definitionContext create_table_definition() {
            return getRuleContext(Create_table_definitionContext.class, 0);
        }

        public TerminalNode T_GLOBAL() {
            return getToken(HplsqlParser.T_GLOBAL, 0);
        }

        public Create_table_preoptionsContext create_table_preoptions() {
            return getRuleContext(Create_table_preoptionsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declare_temporary_table_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterDeclare_temporary_table_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitDeclare_temporary_table_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitDeclare_temporary_table_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_table_stmtContext extends ParserRuleContext {
        public TerminalNode T_CREATE() {
            return getToken(HplsqlParser.T_CREATE, 0);
        }

        public TerminalNode T_TABLE() {
            return getToken(HplsqlParser.T_TABLE, 0);
        }

        public Table_nameContext table_name() {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public Create_table_definitionContext create_table_definition() {
            return getRuleContext(Create_table_definitionContext.class, 0);
        }

        public TerminalNode T_IF() {
            return getToken(HplsqlParser.T_IF, 0);
        }

        public TerminalNode T_NOT() {
            return getToken(HplsqlParser.T_NOT, 0);
        }

        public TerminalNode T_EXISTS() {
            return getToken(HplsqlParser.T_EXISTS, 0);
        }

        public Create_table_preoptionsContext create_table_preoptions() {
            return getRuleContext(Create_table_preoptionsContext.class, 0);
        }

        public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_table_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_table_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_table_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_local_temp_table_stmtContext extends ParserRuleContext {
        public TerminalNode T_CREATE() {
            return getToken(HplsqlParser.T_CREATE, 0);
        }

        public TerminalNode T_TABLE() {
            return getToken(HplsqlParser.T_TABLE, 0);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public Create_table_definitionContext create_table_definition() {
            return getRuleContext(Create_table_definitionContext.class, 0);
        }

        public TerminalNode T_LOCAL() {
            return getToken(HplsqlParser.T_LOCAL, 0);
        }

        public TerminalNode T_TEMPORARY() {
            return getToken(HplsqlParser.T_TEMPORARY, 0);
        }

        public TerminalNode T_VOLATILE() {
            return getToken(HplsqlParser.T_VOLATILE, 0);
        }

        public Create_table_preoptionsContext create_table_preoptions() {
            return getRuleContext(Create_table_preoptionsContext.class, 0);
        }

        public TerminalNode T_SET() {
            return getToken(HplsqlParser.T_SET, 0);
        }

        public TerminalNode T_MULTISET() {
            return getToken(HplsqlParser.T_MULTISET, 0);
        }

        public Create_local_temp_table_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_local_temp_table_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_local_temp_table_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_local_temp_table_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_local_temp_table_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_table_definitionContext extends ParserRuleContext {
        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public Select_stmtContext select_stmt() {
            return getRuleContext(Select_stmtContext.class, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public Create_table_columnsContext create_table_columns() {
            return getRuleContext(Create_table_columnsContext.class, 0);
        }

        public Create_table_optionsContext create_table_options() {
            return getRuleContext(Create_table_optionsContext.class, 0);
        }

        public TerminalNode T_AS() {
            return getToken(HplsqlParser.T_AS, 0);
        }

        public Create_table_definitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_table_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_table_definition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_table_definition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_definition(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_table_columnsContext extends ParserRuleContext {
        public List<Create_table_columns_itemContext> create_table_columns_item() {
            return getRuleContexts(Create_table_columns_itemContext.class);
        }

        public Create_table_columns_itemContext create_table_columns_item(int i) {
            return getRuleContext(Create_table_columns_itemContext.class, i);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public Create_table_columnsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_table_columns;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_table_columns(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_table_columns(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_columns(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_table_columns_itemContext extends ParserRuleContext {
        public Column_nameContext column_name() {
            return getRuleContext(Column_nameContext.class, 0);
        }

        public DtypeContext dtype() {
            return getRuleContext(DtypeContext.class, 0);
        }

        public Dtype_lenContext dtype_len() {
            return getRuleContext(Dtype_lenContext.class, 0);
        }

        public List<Dtype_attrContext> dtype_attr() {
            return getRuleContexts(Dtype_attrContext.class);
        }

        public Dtype_attrContext dtype_attr(int i) {
            return getRuleContext(Dtype_attrContext.class, i);
        }

        public List<Create_table_column_inline_consContext> create_table_column_inline_cons() {
            return getRuleContexts(Create_table_column_inline_consContext.class);
        }

        public Create_table_column_inline_consContext create_table_column_inline_cons(int i) {
            return getRuleContext(Create_table_column_inline_consContext.class, i);
        }

        public Create_table_column_consContext create_table_column_cons() {
            return getRuleContext(Create_table_column_consContext.class, 0);
        }

        public TerminalNode T_CONSTRAINT() {
            return getToken(HplsqlParser.T_CONSTRAINT, 0);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public Create_table_columns_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_table_columns_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_table_columns_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_table_columns_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_columns_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Column_nameContext extends ParserRuleContext {
        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public Column_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_column_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterColumn_name(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitColumn_name(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitColumn_name(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_table_column_inline_consContext extends ParserRuleContext {
        public Dtype_defaultContext dtype_default() {
            return getRuleContext(Dtype_defaultContext.class, 0);
        }

        public TerminalNode T_NULL() {
            return getToken(HplsqlParser.T_NULL, 0);
        }

        public TerminalNode T_NOT() {
            return getToken(HplsqlParser.T_NOT, 0);
        }

        public TerminalNode T_PRIMARY() {
            return getToken(HplsqlParser.T_PRIMARY, 0);
        }

        public TerminalNode T_KEY() {
            return getToken(HplsqlParser.T_KEY, 0);
        }

        public TerminalNode T_UNIQUE() {
            return getToken(HplsqlParser.T_UNIQUE, 0);
        }

        public TerminalNode T_REFERENCES() {
            return getToken(HplsqlParser.T_REFERENCES, 0);
        }

        public Table_nameContext table_name() {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public List<Create_table_fk_actionContext> create_table_fk_action() {
            return getRuleContexts(Create_table_fk_actionContext.class);
        }

        public Create_table_fk_actionContext create_table_fk_action(int i) {
            return getRuleContext(Create_table_fk_actionContext.class, i);
        }

        public TerminalNode T_IDENTITY() {
            return getToken(HplsqlParser.T_IDENTITY, 0);
        }

        public List<TerminalNode> L_INT() {
            return getTokens(HplsqlParser.L_INT);
        }

        public TerminalNode L_INT(int i) {
            return getToken(HplsqlParser.L_INT, i);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public TerminalNode T_AUTO_INCREMENT() {
            return getToken(HplsqlParser.T_AUTO_INCREMENT, 0);
        }

        public TerminalNode T_ENABLE() {
            return getToken(HplsqlParser.T_ENABLE, 0);
        }

        public Create_table_column_inline_consContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_table_column_inline_cons;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener)
                ((HplsqlListener) listener).enterCreate_table_column_inline_cons(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener)
                ((HplsqlListener) listener).exitCreate_table_column_inline_cons(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_column_inline_cons(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_table_column_consContext extends ParserRuleContext {
        public TerminalNode T_PRIMARY() {
            return getToken(HplsqlParser.T_PRIMARY, 0);
        }

        public TerminalNode T_KEY() {
            return getToken(HplsqlParser.T_KEY, 0);
        }

        public List<TerminalNode> T_OPEN_P() {
            return getTokens(HplsqlParser.T_OPEN_P);
        }

        public TerminalNode T_OPEN_P(int i) {
            return getToken(HplsqlParser.T_OPEN_P, i);
        }

        public List<IdentContext> ident() {
            return getRuleContexts(IdentContext.class);
        }

        public IdentContext ident(int i) {
            return getRuleContext(IdentContext.class, i);
        }

        public List<TerminalNode> T_CLOSE_P() {
            return getTokens(HplsqlParser.T_CLOSE_P);
        }

        public TerminalNode T_CLOSE_P(int i) {
            return getToken(HplsqlParser.T_CLOSE_P, i);
        }

        public TerminalNode T_CLUSTERED() {
            return getToken(HplsqlParser.T_CLUSTERED, 0);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public TerminalNode T_ENABLE() {
            return getToken(HplsqlParser.T_ENABLE, 0);
        }

        public Index_storage_clauseContext index_storage_clause() {
            return getRuleContext(Index_storage_clauseContext.class, 0);
        }

        public List<TerminalNode> T_ASC() {
            return getTokens(HplsqlParser.T_ASC);
        }

        public TerminalNode T_ASC(int i) {
            return getToken(HplsqlParser.T_ASC, i);
        }

        public List<TerminalNode> T_DESC() {
            return getTokens(HplsqlParser.T_DESC);
        }

        public TerminalNode T_DESC(int i) {
            return getToken(HplsqlParser.T_DESC, i);
        }

        public TerminalNode T_FOREIGN() {
            return getToken(HplsqlParser.T_FOREIGN, 0);
        }

        public TerminalNode T_REFERENCES() {
            return getToken(HplsqlParser.T_REFERENCES, 0);
        }

        public Table_nameContext table_name() {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public List<Create_table_fk_actionContext> create_table_fk_action() {
            return getRuleContexts(Create_table_fk_actionContext.class);
        }

        public Create_table_fk_actionContext create_table_fk_action(int i) {
            return getRuleContext(Create_table_fk_actionContext.class, i);
        }

        public Create_table_column_consContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_table_column_cons;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_table_column_cons(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_table_column_cons(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_column_cons(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_table_fk_actionContext extends ParserRuleContext {
        public TerminalNode T_ON() {
            return getToken(HplsqlParser.T_ON, 0);
        }

        public TerminalNode T_UPDATE() {
            return getToken(HplsqlParser.T_UPDATE, 0);
        }

        public TerminalNode T_DELETE() {
            return getToken(HplsqlParser.T_DELETE, 0);
        }

        public TerminalNode T_NO() {
            return getToken(HplsqlParser.T_NO, 0);
        }

        public TerminalNode T_ACTION() {
            return getToken(HplsqlParser.T_ACTION, 0);
        }

        public TerminalNode T_RESTRICT() {
            return getToken(HplsqlParser.T_RESTRICT, 0);
        }

        public TerminalNode T_SET() {
            return getToken(HplsqlParser.T_SET, 0);
        }

        public TerminalNode T_NULL() {
            return getToken(HplsqlParser.T_NULL, 0);
        }

        public TerminalNode T_DEFAULT() {
            return getToken(HplsqlParser.T_DEFAULT, 0);
        }

        public TerminalNode T_CASCADE() {
            return getToken(HplsqlParser.T_CASCADE, 0);
        }

        public Create_table_fk_actionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_table_fk_action;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_table_fk_action(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_table_fk_action(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_fk_action(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_table_preoptionsContext extends ParserRuleContext {
        public List<Create_table_preoptions_itemContext> create_table_preoptions_item() {
            return getRuleContexts(Create_table_preoptions_itemContext.class);
        }

        public Create_table_preoptions_itemContext create_table_preoptions_item(int i) {
            return getRuleContext(Create_table_preoptions_itemContext.class, i);
        }

        public Create_table_preoptionsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_table_preoptions;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_table_preoptions(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_table_preoptions(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_preoptions(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_table_preoptions_itemContext extends ParserRuleContext {
        public TerminalNode T_COMMA() {
            return getToken(HplsqlParser.T_COMMA, 0);
        }

        public Create_table_preoptions_td_itemContext create_table_preoptions_td_item() {
            return getRuleContext(Create_table_preoptions_td_itemContext.class, 0);
        }

        public Create_table_options_hive_itemContext create_table_options_hive_item() {
            return getRuleContext(Create_table_options_hive_itemContext.class, 0);
        }

        public Create_table_preoptions_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_table_preoptions_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_table_preoptions_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_table_preoptions_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_preoptions_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_table_preoptions_td_itemContext extends ParserRuleContext {
        public TerminalNode T_LOG() {
            return getToken(HplsqlParser.T_LOG, 0);
        }

        public TerminalNode T_FALLBACK() {
            return getToken(HplsqlParser.T_FALLBACK, 0);
        }

        public TerminalNode T_NO() {
            return getToken(HplsqlParser.T_NO, 0);
        }

        public Create_table_preoptions_td_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_table_preoptions_td_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener)
                ((HplsqlListener) listener).enterCreate_table_preoptions_td_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener)
                ((HplsqlListener) listener).exitCreate_table_preoptions_td_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_preoptions_td_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_table_optionsContext extends ParserRuleContext {
        public List<Create_table_options_itemContext> create_table_options_item() {
            return getRuleContexts(Create_table_options_itemContext.class);
        }

        public Create_table_options_itemContext create_table_options_item(int i) {
            return getRuleContext(Create_table_options_itemContext.class, i);
        }

        public Create_table_optionsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_table_options;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_table_options(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_table_options(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_options(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_table_options_itemContext extends ParserRuleContext {
        public TerminalNode T_ON() {
            return getToken(HplsqlParser.T_ON, 0);
        }

        public TerminalNode T_COMMIT() {
            return getToken(HplsqlParser.T_COMMIT, 0);
        }

        public TerminalNode T_ROWS() {
            return getToken(HplsqlParser.T_ROWS, 0);
        }

        public TerminalNode T_DELETE() {
            return getToken(HplsqlParser.T_DELETE, 0);
        }

        public TerminalNode T_PRESERVE() {
            return getToken(HplsqlParser.T_PRESERVE, 0);
        }

        public Create_table_options_ora_itemContext create_table_options_ora_item() {
            return getRuleContext(Create_table_options_ora_itemContext.class, 0);
        }

        public Create_table_options_db2_itemContext create_table_options_db2_item() {
            return getRuleContext(Create_table_options_db2_itemContext.class, 0);
        }

        public Create_table_options_td_itemContext create_table_options_td_item() {
            return getRuleContext(Create_table_options_td_itemContext.class, 0);
        }

        public Create_table_options_hive_itemContext create_table_options_hive_item() {
            return getRuleContext(Create_table_options_hive_itemContext.class, 0);
        }

        public Create_table_options_mssql_itemContext create_table_options_mssql_item() {
            return getRuleContext(Create_table_options_mssql_itemContext.class, 0);
        }

        public Create_table_options_mysql_itemContext create_table_options_mysql_item() {
            return getRuleContext(Create_table_options_mysql_itemContext.class, 0);
        }

        public Create_table_options_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_table_options_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_table_options_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_table_options_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_options_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_table_options_ora_itemContext extends ParserRuleContext {
        public TerminalNode T_SEGMENT() {
            return getToken(HplsqlParser.T_SEGMENT, 0);
        }

        public TerminalNode T_CREATION() {
            return getToken(HplsqlParser.T_CREATION, 0);
        }

        public TerminalNode T_IMMEDIATE() {
            return getToken(HplsqlParser.T_IMMEDIATE, 0);
        }

        public TerminalNode T_DEFERRED() {
            return getToken(HplsqlParser.T_DEFERRED, 0);
        }

        public List<TerminalNode> L_INT() {
            return getTokens(HplsqlParser.L_INT);
        }

        public TerminalNode L_INT(int i) {
            return getToken(HplsqlParser.L_INT, i);
        }

        public TerminalNode T_PCTFREE() {
            return getToken(HplsqlParser.T_PCTFREE, 0);
        }

        public TerminalNode T_PCTUSED() {
            return getToken(HplsqlParser.T_PCTUSED, 0);
        }

        public TerminalNode T_INITRANS() {
            return getToken(HplsqlParser.T_INITRANS, 0);
        }

        public TerminalNode T_MAXTRANS() {
            return getToken(HplsqlParser.T_MAXTRANS, 0);
        }

        public TerminalNode T_NOCOMPRESS() {
            return getToken(HplsqlParser.T_NOCOMPRESS, 0);
        }

        public TerminalNode T_LOGGING() {
            return getToken(HplsqlParser.T_LOGGING, 0);
        }

        public TerminalNode T_NOLOGGING() {
            return getToken(HplsqlParser.T_NOLOGGING, 0);
        }

        public TerminalNode T_STORAGE() {
            return getToken(HplsqlParser.T_STORAGE, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public List<IdentContext> ident() {
            return getRuleContexts(IdentContext.class);
        }

        public IdentContext ident(int i) {
            return getRuleContext(IdentContext.class, i);
        }

        public TerminalNode T_TABLESPACE() {
            return getToken(HplsqlParser.T_TABLESPACE, 0);
        }

        public Create_table_options_ora_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_table_options_ora_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener)
                ((HplsqlListener) listener).enterCreate_table_options_ora_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_table_options_ora_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_options_ora_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_table_options_db2_itemContext extends ParserRuleContext {
        public TerminalNode T_IN() {
            return getToken(HplsqlParser.T_IN, 0);
        }

        public List<IdentContext> ident() {
            return getRuleContexts(IdentContext.class);
        }

        public IdentContext ident(int i) {
            return getRuleContext(IdentContext.class, i);
        }

        public TerminalNode T_INDEX() {
            return getToken(HplsqlParser.T_INDEX, 0);
        }

        public TerminalNode T_WITH() {
            return getToken(HplsqlParser.T_WITH, 0);
        }

        public TerminalNode T_REPLACE() {
            return getToken(HplsqlParser.T_REPLACE, 0);
        }

        public TerminalNode T_DISTRIBUTE() {
            return getToken(HplsqlParser.T_DISTRIBUTE, 0);
        }

        public TerminalNode T_BY() {
            return getToken(HplsqlParser.T_BY, 0);
        }

        public TerminalNode T_HASH() {
            return getToken(HplsqlParser.T_HASH, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public TerminalNode T_LOGGED() {
            return getToken(HplsqlParser.T_LOGGED, 0);
        }

        public TerminalNode T_NOT() {
            return getToken(HplsqlParser.T_NOT, 0);
        }

        public TerminalNode T_COMPRESS() {
            return getToken(HplsqlParser.T_COMPRESS, 0);
        }

        public TerminalNode T_YES() {
            return getToken(HplsqlParser.T_YES, 0);
        }

        public TerminalNode T_NO() {
            return getToken(HplsqlParser.T_NO, 0);
        }

        public TerminalNode T_DEFINITION() {
            return getToken(HplsqlParser.T_DEFINITION, 0);
        }

        public TerminalNode T_ONLY() {
            return getToken(HplsqlParser.T_ONLY, 0);
        }

        public TerminalNode T_RESTRICT() {
            return getToken(HplsqlParser.T_RESTRICT, 0);
        }

        public TerminalNode T_ON() {
            return getToken(HplsqlParser.T_ON, 0);
        }

        public TerminalNode T_DROP() {
            return getToken(HplsqlParser.T_DROP, 0);
        }

        public Create_table_options_db2_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_table_options_db2_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener)
                ((HplsqlListener) listener).enterCreate_table_options_db2_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_table_options_db2_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_options_db2_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_table_options_td_itemContext extends ParserRuleContext {
        public TerminalNode T_PRIMARY() {
            return getToken(HplsqlParser.T_PRIMARY, 0);
        }

        public TerminalNode T_INDEX() {
            return getToken(HplsqlParser.T_INDEX, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public List<IdentContext> ident() {
            return getRuleContexts(IdentContext.class);
        }

        public IdentContext ident(int i) {
            return getRuleContext(IdentContext.class, i);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public TerminalNode T_UNIQUE() {
            return getToken(HplsqlParser.T_UNIQUE, 0);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public TerminalNode T_WITH() {
            return getToken(HplsqlParser.T_WITH, 0);
        }

        public TerminalNode T_DATA() {
            return getToken(HplsqlParser.T_DATA, 0);
        }

        public Create_table_options_td_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_table_options_td_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_table_options_td_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_table_options_td_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_options_td_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_table_options_hive_itemContext extends ParserRuleContext {
        public Create_table_hive_row_formatContext create_table_hive_row_format() {
            return getRuleContext(Create_table_hive_row_formatContext.class, 0);
        }

        public TerminalNode T_STORED() {
            return getToken(HplsqlParser.T_STORED, 0);
        }

        public TerminalNode T_AS() {
            return getToken(HplsqlParser.T_AS, 0);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public Create_table_options_hive_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_table_options_hive_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener)
                ((HplsqlListener) listener).enterCreate_table_options_hive_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener)
                ((HplsqlListener) listener).exitCreate_table_options_hive_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_options_hive_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_table_hive_row_formatContext extends ParserRuleContext {
        public TerminalNode T_ROW() {
            return getToken(HplsqlParser.T_ROW, 0);
        }

        public TerminalNode T_FORMAT() {
            return getToken(HplsqlParser.T_FORMAT, 0);
        }

        public TerminalNode T_DELIMITED() {
            return getToken(HplsqlParser.T_DELIMITED, 0);
        }

        public List<Create_table_hive_row_format_fieldsContext> create_table_hive_row_format_fields() {
            return getRuleContexts(Create_table_hive_row_format_fieldsContext.class);
        }

        public Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields(int i) {
            return getRuleContext(Create_table_hive_row_format_fieldsContext.class, i);
        }

        public Create_table_hive_row_formatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_table_hive_row_format;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_table_hive_row_format(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_table_hive_row_format(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_hive_row_format(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_table_hive_row_format_fieldsContext extends ParserRuleContext {
        public TerminalNode T_FIELDS() {
            return getToken(HplsqlParser.T_FIELDS, 0);
        }

        public TerminalNode T_TERMINATED() {
            return getToken(HplsqlParser.T_TERMINATED, 0);
        }

        public List<TerminalNode> T_BY() {
            return getTokens(HplsqlParser.T_BY);
        }

        public TerminalNode T_BY(int i) {
            return getToken(HplsqlParser.T_BY, i);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode T_ESCAPED() {
            return getToken(HplsqlParser.T_ESCAPED, 0);
        }

        public TerminalNode T_COLLECTION() {
            return getToken(HplsqlParser.T_COLLECTION, 0);
        }

        public TerminalNode T_ITEMS() {
            return getToken(HplsqlParser.T_ITEMS, 0);
        }

        public TerminalNode T_MAP() {
            return getToken(HplsqlParser.T_MAP, 0);
        }

        public TerminalNode T_KEYS() {
            return getToken(HplsqlParser.T_KEYS, 0);
        }

        public TerminalNode T_LINES() {
            return getToken(HplsqlParser.T_LINES, 0);
        }

        public TerminalNode T_NULL() {
            return getToken(HplsqlParser.T_NULL, 0);
        }

        public TerminalNode T_DEFINED() {
            return getToken(HplsqlParser.T_DEFINED, 0);
        }

        public TerminalNode T_AS() {
            return getToken(HplsqlParser.T_AS, 0);
        }

        public Create_table_hive_row_format_fieldsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_table_hive_row_format_fields;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener)
                ((HplsqlListener) listener).enterCreate_table_hive_row_format_fields(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener)
                ((HplsqlListener) listener).exitCreate_table_hive_row_format_fields(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_hive_row_format_fields(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_table_options_mssql_itemContext extends ParserRuleContext {
        public TerminalNode T_ON() {
            return getToken(HplsqlParser.T_ON, 0);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public TerminalNode T_TEXTIMAGE_ON() {
            return getToken(HplsqlParser.T_TEXTIMAGE_ON, 0);
        }

        public Create_table_options_mssql_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_table_options_mssql_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener)
                ((HplsqlListener) listener).enterCreate_table_options_mssql_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener)
                ((HplsqlListener) listener).exitCreate_table_options_mssql_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_options_mssql_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_table_options_mysql_itemContext extends ParserRuleContext {
        public TerminalNode T_AUTO_INCREMENT() {
            return getToken(HplsqlParser.T_AUTO_INCREMENT, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode T_EQUAL() {
            return getToken(HplsqlParser.T_EQUAL, 0);
        }

        public TerminalNode T_COMMENT() {
            return getToken(HplsqlParser.T_COMMENT, 0);
        }

        public TerminalNode T_CHARACTER() {
            return getToken(HplsqlParser.T_CHARACTER, 0);
        }

        public TerminalNode T_SET() {
            return getToken(HplsqlParser.T_SET, 0);
        }

        public TerminalNode T_CHARSET() {
            return getToken(HplsqlParser.T_CHARSET, 0);
        }

        public TerminalNode T_DEFAULT() {
            return getToken(HplsqlParser.T_DEFAULT, 0);
        }

        public TerminalNode T_ENGINE() {
            return getToken(HplsqlParser.T_ENGINE, 0);
        }

        public Create_table_options_mysql_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_table_options_mysql_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener)
                ((HplsqlListener) listener).enterCreate_table_options_mysql_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener)
                ((HplsqlListener) listener).exitCreate_table_options_mysql_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_options_mysql_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DtypeContext extends ParserRuleContext {
        public TerminalNode T_CHAR() {
            return getToken(HplsqlParser.T_CHAR, 0);
        }

        public TerminalNode T_BIGINT() {
            return getToken(HplsqlParser.T_BIGINT, 0);
        }

        public TerminalNode T_BINARY_DOUBLE() {
            return getToken(HplsqlParser.T_BINARY_DOUBLE, 0);
        }

        public TerminalNode T_BINARY_FLOAT() {
            return getToken(HplsqlParser.T_BINARY_FLOAT, 0);
        }

        public TerminalNode T_BINARY_INTEGER() {
            return getToken(HplsqlParser.T_BINARY_INTEGER, 0);
        }

        public TerminalNode T_BIT() {
            return getToken(HplsqlParser.T_BIT, 0);
        }

        public TerminalNode T_DATE() {
            return getToken(HplsqlParser.T_DATE, 0);
        }

        public TerminalNode T_DATETIME() {
            return getToken(HplsqlParser.T_DATETIME, 0);
        }

        public TerminalNode T_DEC() {
            return getToken(HplsqlParser.T_DEC, 0);
        }

        public TerminalNode T_DECIMAL() {
            return getToken(HplsqlParser.T_DECIMAL, 0);
        }

        public TerminalNode T_DOUBLE() {
            return getToken(HplsqlParser.T_DOUBLE, 0);
        }

        public TerminalNode T_PRECISION() {
            return getToken(HplsqlParser.T_PRECISION, 0);
        }

        public TerminalNode T_FLOAT() {
            return getToken(HplsqlParser.T_FLOAT, 0);
        }

        public TerminalNode T_INT() {
            return getToken(HplsqlParser.T_INT, 0);
        }

        public TerminalNode T_INT2() {
            return getToken(HplsqlParser.T_INT2, 0);
        }

        public TerminalNode T_INT4() {
            return getToken(HplsqlParser.T_INT4, 0);
        }

        public TerminalNode T_INT8() {
            return getToken(HplsqlParser.T_INT8, 0);
        }

        public TerminalNode T_INTEGER() {
            return getToken(HplsqlParser.T_INTEGER, 0);
        }

        public TerminalNode T_NCHAR() {
            return getToken(HplsqlParser.T_NCHAR, 0);
        }

        public TerminalNode T_NVARCHAR() {
            return getToken(HplsqlParser.T_NVARCHAR, 0);
        }

        public TerminalNode T_NUMBER() {
            return getToken(HplsqlParser.T_NUMBER, 0);
        }

        public TerminalNode T_NUMERIC() {
            return getToken(HplsqlParser.T_NUMERIC, 0);
        }

        public TerminalNode T_PLS_INTEGER() {
            return getToken(HplsqlParser.T_PLS_INTEGER, 0);
        }

        public TerminalNode T_REAL() {
            return getToken(HplsqlParser.T_REAL, 0);
        }

        public TerminalNode T_RESULT_SET_LOCATOR() {
            return getToken(HplsqlParser.T_RESULT_SET_LOCATOR, 0);
        }

        public TerminalNode T_VARYING() {
            return getToken(HplsqlParser.T_VARYING, 0);
        }

        public TerminalNode T_SIMPLE_FLOAT() {
            return getToken(HplsqlParser.T_SIMPLE_FLOAT, 0);
        }

        public TerminalNode T_SIMPLE_DOUBLE() {
            return getToken(HplsqlParser.T_SIMPLE_DOUBLE, 0);
        }

        public TerminalNode T_SIMPLE_INTEGER() {
            return getToken(HplsqlParser.T_SIMPLE_INTEGER, 0);
        }

        public TerminalNode T_SMALLINT() {
            return getToken(HplsqlParser.T_SMALLINT, 0);
        }

        public TerminalNode T_SMALLDATETIME() {
            return getToken(HplsqlParser.T_SMALLDATETIME, 0);
        }

        public TerminalNode T_STRING() {
            return getToken(HplsqlParser.T_STRING, 0);
        }

        public TerminalNode T_SYS_REFCURSOR() {
            return getToken(HplsqlParser.T_SYS_REFCURSOR, 0);
        }

        public TerminalNode T_TIMESTAMP() {
            return getToken(HplsqlParser.T_TIMESTAMP, 0);
        }

        public TerminalNode T_TINYINT() {
            return getToken(HplsqlParser.T_TINYINT, 0);
        }

        public TerminalNode T_VARCHAR() {
            return getToken(HplsqlParser.T_VARCHAR, 0);
        }

        public TerminalNode T_VARCHAR2() {
            return getToken(HplsqlParser.T_VARCHAR2, 0);
        }

        public TerminalNode T_XML() {
            return getToken(HplsqlParser.T_XML, 0);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public TerminalNode T_TYPE() {
            return getToken(HplsqlParser.T_TYPE, 0);
        }

        public DtypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dtype;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterDtype(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitDtype(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitDtype(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Dtype_lenContext extends ParserRuleContext {
        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public List<TerminalNode> L_INT() {
            return getTokens(HplsqlParser.L_INT);
        }

        public TerminalNode L_INT(int i) {
            return getToken(HplsqlParser.L_INT, i);
        }

        public TerminalNode T_MAX() {
            return getToken(HplsqlParser.T_MAX, 0);
        }

        public TerminalNode T_COMMA() {
            return getToken(HplsqlParser.T_COMMA, 0);
        }

        public TerminalNode T_CHAR() {
            return getToken(HplsqlParser.T_CHAR, 0);
        }

        public TerminalNode T_BYTE() {
            return getToken(HplsqlParser.T_BYTE, 0);
        }

        public Dtype_lenContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dtype_len;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterDtype_len(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitDtype_len(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitDtype_len(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Dtype_attrContext extends ParserRuleContext {
        public TerminalNode T_NULL() {
            return getToken(HplsqlParser.T_NULL, 0);
        }

        public TerminalNode T_NOT() {
            return getToken(HplsqlParser.T_NOT, 0);
        }

        public TerminalNode T_CHARACTER() {
            return getToken(HplsqlParser.T_CHARACTER, 0);
        }

        public TerminalNode T_SET() {
            return getToken(HplsqlParser.T_SET, 0);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public TerminalNode T_CASESPECIFIC() {
            return getToken(HplsqlParser.T_CASESPECIFIC, 0);
        }

        public TerminalNode T_CS() {
            return getToken(HplsqlParser.T_CS, 0);
        }

        public Dtype_attrContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dtype_attr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterDtype_attr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitDtype_attr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitDtype_attr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Dtype_defaultContext extends ParserRuleContext {
        public TerminalNode T_EQUAL() {
            return getToken(HplsqlParser.T_EQUAL, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode T_COLON() {
            return getToken(HplsqlParser.T_COLON, 0);
        }

        public TerminalNode T_DEFAULT() {
            return getToken(HplsqlParser.T_DEFAULT, 0);
        }

        public TerminalNode T_WITH() {
            return getToken(HplsqlParser.T_WITH, 0);
        }

        public Dtype_defaultContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dtype_default;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterDtype_default(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitDtype_default(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitDtype_default(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_database_stmtContext extends ParserRuleContext {
        public TerminalNode T_CREATE() {
            return getToken(HplsqlParser.T_CREATE, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode T_DATABASE() {
            return getToken(HplsqlParser.T_DATABASE, 0);
        }

        public TerminalNode T_SCHEMA() {
            return getToken(HplsqlParser.T_SCHEMA, 0);
        }

        public TerminalNode T_IF() {
            return getToken(HplsqlParser.T_IF, 0);
        }

        public TerminalNode T_NOT() {
            return getToken(HplsqlParser.T_NOT, 0);
        }

        public TerminalNode T_EXISTS() {
            return getToken(HplsqlParser.T_EXISTS, 0);
        }

        public List<Create_database_optionContext> create_database_option() {
            return getRuleContexts(Create_database_optionContext.class);
        }

        public Create_database_optionContext create_database_option(int i) {
            return getRuleContext(Create_database_optionContext.class, i);
        }

        public Create_database_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_database_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_database_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_database_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_database_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_database_optionContext extends ParserRuleContext {
        public TerminalNode T_COMMENT() {
            return getToken(HplsqlParser.T_COMMENT, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode T_LOCATION() {
            return getToken(HplsqlParser.T_LOCATION, 0);
        }

        public Create_database_optionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_database_option;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_database_option(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_database_option(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_database_option(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_function_stmtContext extends ParserRuleContext {
        public TerminalNode T_FUNCTION() {
            return getToken(HplsqlParser.T_FUNCTION, 0);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public Create_function_returnContext create_function_return() {
            return getRuleContext(Create_function_returnContext.class, 0);
        }

        public Single_block_stmtContext single_block_stmt() {
            return getRuleContext(Single_block_stmtContext.class, 0);
        }

        public TerminalNode T_ALTER() {
            return getToken(HplsqlParser.T_ALTER, 0);
        }

        public TerminalNode T_CREATE() {
            return getToken(HplsqlParser.T_CREATE, 0);
        }

        public TerminalNode T_REPLACE() {
            return getToken(HplsqlParser.T_REPLACE, 0);
        }

        public Create_routine_paramsContext create_routine_params() {
            return getRuleContext(Create_routine_paramsContext.class, 0);
        }

        public Declare_block_inplaceContext declare_block_inplace() {
            return getRuleContext(Declare_block_inplaceContext.class, 0);
        }

        public TerminalNode T_AS() {
            return getToken(HplsqlParser.T_AS, 0);
        }

        public TerminalNode T_IS() {
            return getToken(HplsqlParser.T_IS, 0);
        }

        public TerminalNode T_OR() {
            return getToken(HplsqlParser.T_OR, 0);
        }

        public Create_function_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_function_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_function_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_function_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_function_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_function_returnContext extends ParserRuleContext {
        public DtypeContext dtype() {
            return getRuleContext(DtypeContext.class, 0);
        }

        public TerminalNode T_RETURN() {
            return getToken(HplsqlParser.T_RETURN, 0);
        }

        public TerminalNode T_RETURNS() {
            return getToken(HplsqlParser.T_RETURNS, 0);
        }

        public Dtype_lenContext dtype_len() {
            return getRuleContext(Dtype_lenContext.class, 0);
        }

        public Create_function_returnContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_function_return;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_function_return(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_function_return(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_function_return(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_package_stmtContext extends ParserRuleContext {
        public TerminalNode T_PACKAGE() {
            return getToken(HplsqlParser.T_PACKAGE, 0);
        }

        public List<IdentContext> ident() {
            return getRuleContexts(IdentContext.class);
        }

        public IdentContext ident(int i) {
            return getRuleContext(IdentContext.class, i);
        }

        public Package_specContext package_spec() {
            return getRuleContext(Package_specContext.class, 0);
        }

        public TerminalNode T_END() {
            return getToken(HplsqlParser.T_END, 0);
        }

        public TerminalNode T_AS() {
            return getToken(HplsqlParser.T_AS, 0);
        }

        public TerminalNode T_IS() {
            return getToken(HplsqlParser.T_IS, 0);
        }

        public TerminalNode T_ALTER() {
            return getToken(HplsqlParser.T_ALTER, 0);
        }

        public TerminalNode T_CREATE() {
            return getToken(HplsqlParser.T_CREATE, 0);
        }

        public TerminalNode T_REPLACE() {
            return getToken(HplsqlParser.T_REPLACE, 0);
        }

        public TerminalNode T_SEMICOLON() {
            return getToken(HplsqlParser.T_SEMICOLON, 0);
        }

        public TerminalNode T_OR() {
            return getToken(HplsqlParser.T_OR, 0);
        }

        public Create_package_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_package_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_package_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_package_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_package_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Package_specContext extends ParserRuleContext {
        public List<Package_spec_itemContext> package_spec_item() {
            return getRuleContexts(Package_spec_itemContext.class);
        }

        public Package_spec_itemContext package_spec_item(int i) {
            return getRuleContext(Package_spec_itemContext.class, i);
        }

        public List<TerminalNode> T_SEMICOLON() {
            return getTokens(HplsqlParser.T_SEMICOLON);
        }

        public TerminalNode T_SEMICOLON(int i) {
            return getToken(HplsqlParser.T_SEMICOLON, i);
        }

        public Package_specContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_package_spec;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterPackage_spec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitPackage_spec(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitPackage_spec(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Package_spec_itemContext extends ParserRuleContext {
        public Declare_stmt_itemContext declare_stmt_item() {
            return getRuleContext(Declare_stmt_itemContext.class, 0);
        }

        public TerminalNode T_FUNCTION() {
            return getToken(HplsqlParser.T_FUNCTION, 0);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public Create_function_returnContext create_function_return() {
            return getRuleContext(Create_function_returnContext.class, 0);
        }

        public Create_routine_paramsContext create_routine_params() {
            return getRuleContext(Create_routine_paramsContext.class, 0);
        }

        public TerminalNode T_PROCEDURE() {
            return getToken(HplsqlParser.T_PROCEDURE, 0);
        }

        public TerminalNode T_PROC() {
            return getToken(HplsqlParser.T_PROC, 0);
        }

        public Package_spec_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_package_spec_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterPackage_spec_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitPackage_spec_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitPackage_spec_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_package_body_stmtContext extends ParserRuleContext {
        public TerminalNode T_PACKAGE() {
            return getToken(HplsqlParser.T_PACKAGE, 0);
        }

        public TerminalNode T_BODY() {
            return getToken(HplsqlParser.T_BODY, 0);
        }

        public List<IdentContext> ident() {
            return getRuleContexts(IdentContext.class);
        }

        public IdentContext ident(int i) {
            return getRuleContext(IdentContext.class, i);
        }

        public Package_bodyContext package_body() {
            return getRuleContext(Package_bodyContext.class, 0);
        }

        public TerminalNode T_END() {
            return getToken(HplsqlParser.T_END, 0);
        }

        public TerminalNode T_AS() {
            return getToken(HplsqlParser.T_AS, 0);
        }

        public TerminalNode T_IS() {
            return getToken(HplsqlParser.T_IS, 0);
        }

        public TerminalNode T_ALTER() {
            return getToken(HplsqlParser.T_ALTER, 0);
        }

        public TerminalNode T_CREATE() {
            return getToken(HplsqlParser.T_CREATE, 0);
        }

        public TerminalNode T_REPLACE() {
            return getToken(HplsqlParser.T_REPLACE, 0);
        }

        public TerminalNode T_SEMICOLON() {
            return getToken(HplsqlParser.T_SEMICOLON, 0);
        }

        public TerminalNode T_OR() {
            return getToken(HplsqlParser.T_OR, 0);
        }

        public Create_package_body_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_package_body_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_package_body_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_package_body_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_package_body_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Package_bodyContext extends ParserRuleContext {
        public List<Package_body_itemContext> package_body_item() {
            return getRuleContexts(Package_body_itemContext.class);
        }

        public Package_body_itemContext package_body_item(int i) {
            return getRuleContext(Package_body_itemContext.class, i);
        }

        public List<TerminalNode> T_SEMICOLON() {
            return getTokens(HplsqlParser.T_SEMICOLON);
        }

        public TerminalNode T_SEMICOLON(int i) {
            return getToken(HplsqlParser.T_SEMICOLON, i);
        }

        public Package_bodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_package_body;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterPackage_body(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitPackage_body(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitPackage_body(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Package_body_itemContext extends ParserRuleContext {
        public Declare_stmt_itemContext declare_stmt_item() {
            return getRuleContext(Declare_stmt_itemContext.class, 0);
        }

        public Create_function_stmtContext create_function_stmt() {
            return getRuleContext(Create_function_stmtContext.class, 0);
        }

        public Create_procedure_stmtContext create_procedure_stmt() {
            return getRuleContext(Create_procedure_stmtContext.class, 0);
        }

        public Package_body_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_package_body_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterPackage_body_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitPackage_body_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitPackage_body_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_procedure_stmtContext extends ParserRuleContext {
        public List<IdentContext> ident() {
            return getRuleContexts(IdentContext.class);
        }

        public IdentContext ident(int i) {
            return getRuleContext(IdentContext.class, i);
        }

        public Proc_blockContext proc_block() {
            return getRuleContext(Proc_blockContext.class, 0);
        }

        public TerminalNode T_PROCEDURE() {
            return getToken(HplsqlParser.T_PROCEDURE, 0);
        }

        public TerminalNode T_PROC() {
            return getToken(HplsqlParser.T_PROC, 0);
        }

        public TerminalNode T_ALTER() {
            return getToken(HplsqlParser.T_ALTER, 0);
        }

        public TerminalNode T_CREATE() {
            return getToken(HplsqlParser.T_CREATE, 0);
        }

        public TerminalNode T_REPLACE() {
            return getToken(HplsqlParser.T_REPLACE, 0);
        }

        public Create_routine_paramsContext create_routine_params() {
            return getRuleContext(Create_routine_paramsContext.class, 0);
        }

        public Create_routine_optionsContext create_routine_options() {
            return getRuleContext(Create_routine_optionsContext.class, 0);
        }

        public Declare_block_inplaceContext declare_block_inplace() {
            return getRuleContext(Declare_block_inplaceContext.class, 0);
        }

        public LabelContext label() {
            return getRuleContext(LabelContext.class, 0);
        }

        public TerminalNode T_SEMICOLON() {
            return getToken(HplsqlParser.T_SEMICOLON, 0);
        }

        public TerminalNode T_AS() {
            return getToken(HplsqlParser.T_AS, 0);
        }

        public TerminalNode T_IS() {
            return getToken(HplsqlParser.T_IS, 0);
        }

        public TerminalNode T_OR() {
            return getToken(HplsqlParser.T_OR, 0);
        }

        public Create_procedure_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_procedure_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_procedure_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_procedure_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_procedure_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_routine_paramsContext extends ParserRuleContext {
        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public List<Create_routine_param_itemContext> create_routine_param_item() {
            return getRuleContexts(Create_routine_param_itemContext.class);
        }

        public Create_routine_param_itemContext create_routine_param_item(int i) {
            return getRuleContext(Create_routine_param_itemContext.class, i);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public Create_routine_paramsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_routine_params;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_routine_params(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_routine_params(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_routine_params(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_routine_param_itemContext extends ParserRuleContext {
        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public DtypeContext dtype() {
            return getRuleContext(DtypeContext.class, 0);
        }

        public TerminalNode T_IN() {
            return getToken(HplsqlParser.T_IN, 0);
        }

        public TerminalNode T_OUT() {
            return getToken(HplsqlParser.T_OUT, 0);
        }

        public TerminalNode T_INOUT() {
            return getToken(HplsqlParser.T_INOUT, 0);
        }

        public Dtype_lenContext dtype_len() {
            return getRuleContext(Dtype_lenContext.class, 0);
        }

        public List<Dtype_attrContext> dtype_attr() {
            return getRuleContexts(Dtype_attrContext.class);
        }

        public Dtype_attrContext dtype_attr(int i) {
            return getRuleContext(Dtype_attrContext.class, i);
        }

        public Dtype_defaultContext dtype_default() {
            return getRuleContext(Dtype_defaultContext.class, 0);
        }

        public Create_routine_param_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_routine_param_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_routine_param_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_routine_param_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_routine_param_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_routine_optionsContext extends ParserRuleContext {
        public List<Create_routine_optionContext> create_routine_option() {
            return getRuleContexts(Create_routine_optionContext.class);
        }

        public Create_routine_optionContext create_routine_option(int i) {
            return getRuleContext(Create_routine_optionContext.class, i);
        }

        public Create_routine_optionsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_routine_options;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_routine_options(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_routine_options(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_routine_options(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_routine_optionContext extends ParserRuleContext {
        public TerminalNode T_LANGUAGE() {
            return getToken(HplsqlParser.T_LANGUAGE, 0);
        }

        public TerminalNode T_SQL() {
            return getToken(HplsqlParser.T_SQL, 0);
        }

        public TerminalNode T_SECURITY() {
            return getToken(HplsqlParser.T_SECURITY, 0);
        }

        public TerminalNode T_CREATOR() {
            return getToken(HplsqlParser.T_CREATOR, 0);
        }

        public TerminalNode T_DEFINER() {
            return getToken(HplsqlParser.T_DEFINER, 0);
        }

        public TerminalNode T_INVOKER() {
            return getToken(HplsqlParser.T_INVOKER, 0);
        }

        public TerminalNode T_OWNER() {
            return getToken(HplsqlParser.T_OWNER, 0);
        }

        public TerminalNode T_RESULT() {
            return getToken(HplsqlParser.T_RESULT, 0);
        }

        public TerminalNode T_SETS() {
            return getToken(HplsqlParser.T_SETS, 0);
        }

        public TerminalNode L_INT() {
            return getToken(HplsqlParser.L_INT, 0);
        }

        public TerminalNode T_DYNAMIC() {
            return getToken(HplsqlParser.T_DYNAMIC, 0);
        }

        public Create_routine_optionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_routine_option;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_routine_option(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_routine_option(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_routine_option(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Exec_stmtContext extends ParserRuleContext {
        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode T_EXEC() {
            return getToken(HplsqlParser.T_EXEC, 0);
        }

        public TerminalNode T_EXECUTE() {
            return getToken(HplsqlParser.T_EXECUTE, 0);
        }

        public TerminalNode T_IMMEDIATE() {
            return getToken(HplsqlParser.T_IMMEDIATE, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public Expr_func_paramsContext expr_func_params() {
            return getRuleContext(Expr_func_paramsContext.class, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public TerminalNode T_INTO() {
            return getToken(HplsqlParser.T_INTO, 0);
        }

        public List<TerminalNode> L_ID() {
            return getTokens(HplsqlParser.L_ID);
        }

        public TerminalNode L_ID(int i) {
            return getToken(HplsqlParser.L_ID, i);
        }

        public Using_clauseContext using_clause() {
            return getRuleContext(Using_clauseContext.class, 0);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public Exec_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exec_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterExec_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitExec_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitExec_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class If_stmtContext extends ParserRuleContext {
        public If_plsql_stmtContext if_plsql_stmt() {
            return getRuleContext(If_plsql_stmtContext.class, 0);
        }

        public If_tsql_stmtContext if_tsql_stmt() {
            return getRuleContext(If_tsql_stmtContext.class, 0);
        }

        public If_bteq_stmtContext if_bteq_stmt() {
            return getRuleContext(If_bteq_stmtContext.class, 0);
        }

        public If_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_if_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterIf_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitIf_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitIf_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class If_plsql_stmtContext extends ParserRuleContext {
        public List<TerminalNode> T_IF() {
            return getTokens(HplsqlParser.T_IF);
        }

        public TerminalNode T_IF(int i) {
            return getToken(HplsqlParser.T_IF, i);
        }

        public Bool_exprContext bool_expr() {
            return getRuleContext(Bool_exprContext.class, 0);
        }

        public TerminalNode T_THEN() {
            return getToken(HplsqlParser.T_THEN, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode T_END() {
            return getToken(HplsqlParser.T_END, 0);
        }

        public List<Elseif_blockContext> elseif_block() {
            return getRuleContexts(Elseif_blockContext.class);
        }

        public Elseif_blockContext elseif_block(int i) {
            return getRuleContext(Elseif_blockContext.class, i);
        }

        public Else_blockContext else_block() {
            return getRuleContext(Else_blockContext.class, 0);
        }

        public If_plsql_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_if_plsql_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterIf_plsql_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitIf_plsql_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitIf_plsql_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class If_tsql_stmtContext extends ParserRuleContext {
        public TerminalNode T_IF() {
            return getToken(HplsqlParser.T_IF, 0);
        }

        public Bool_exprContext bool_expr() {
            return getRuleContext(Bool_exprContext.class, 0);
        }

        public List<Single_block_stmtContext> single_block_stmt() {
            return getRuleContexts(Single_block_stmtContext.class);
        }

        public Single_block_stmtContext single_block_stmt(int i) {
            return getRuleContext(Single_block_stmtContext.class, i);
        }

        public TerminalNode T_ELSE() {
            return getToken(HplsqlParser.T_ELSE, 0);
        }

        public If_tsql_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_if_tsql_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterIf_tsql_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitIf_tsql_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitIf_tsql_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class If_bteq_stmtContext extends ParserRuleContext {
        public TerminalNode T_IF() {
            return getToken(HplsqlParser.T_IF, 0);
        }

        public Bool_exprContext bool_expr() {
            return getRuleContext(Bool_exprContext.class, 0);
        }

        public TerminalNode T_THEN() {
            return getToken(HplsqlParser.T_THEN, 0);
        }

        public Single_block_stmtContext single_block_stmt() {
            return getRuleContext(Single_block_stmtContext.class, 0);
        }

        public If_bteq_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_if_bteq_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterIf_bteq_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitIf_bteq_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitIf_bteq_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Elseif_blockContext extends ParserRuleContext {
        public Bool_exprContext bool_expr() {
            return getRuleContext(Bool_exprContext.class, 0);
        }

        public TerminalNode T_THEN() {
            return getToken(HplsqlParser.T_THEN, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode T_ELSIF() {
            return getToken(HplsqlParser.T_ELSIF, 0);
        }

        public TerminalNode T_ELSEIF() {
            return getToken(HplsqlParser.T_ELSEIF, 0);
        }

        public Elseif_blockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elseif_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterElseif_block(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitElseif_block(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitElseif_block(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Else_blockContext extends ParserRuleContext {
        public TerminalNode T_ELSE() {
            return getToken(HplsqlParser.T_ELSE, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public Else_blockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_else_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterElse_block(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitElse_block(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitElse_block(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Exit_stmtContext extends ParserRuleContext {
        public TerminalNode T_EXIT() {
            return getToken(HplsqlParser.T_EXIT, 0);
        }

        public TerminalNode L_ID() {
            return getToken(HplsqlParser.L_ID, 0);
        }

        public TerminalNode T_WHEN() {
            return getToken(HplsqlParser.T_WHEN, 0);
        }

        public Bool_exprContext bool_expr() {
            return getRuleContext(Bool_exprContext.class, 0);
        }

        public Exit_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exit_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterExit_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitExit_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitExit_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Leave_stmtContext extends ParserRuleContext {
        public TerminalNode T_LEAVE() {
            return getToken(HplsqlParser.T_LEAVE, 0);
        }

        public TerminalNode L_ID() {
            return getToken(HplsqlParser.L_ID, 0);
        }

        public Leave_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_leave_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterLeave_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitLeave_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitLeave_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Cmp_stmtContext extends ParserRuleContext {
        public TerminalNode T_CMP() {
            return getToken(HplsqlParser.T_CMP, 0);
        }

        public List<Cmp_sourceContext> cmp_source() {
            return getRuleContexts(Cmp_sourceContext.class);
        }

        public Cmp_sourceContext cmp_source(int i) {
            return getRuleContext(Cmp_sourceContext.class, i);
        }

        public TerminalNode T_COMMA() {
            return getToken(HplsqlParser.T_COMMA, 0);
        }

        public TerminalNode T_ROW_COUNT() {
            return getToken(HplsqlParser.T_ROW_COUNT, 0);
        }

        public TerminalNode T_SUM() {
            return getToken(HplsqlParser.T_SUM, 0);
        }

        public Cmp_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cmp_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCmp_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCmp_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitCmp_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Cmp_sourceContext extends ParserRuleContext {
        public Table_nameContext table_name() {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public Select_stmtContext select_stmt() {
            return getRuleContext(Select_stmtContext.class, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public TerminalNode T_AT() {
            return getToken(HplsqlParser.T_AT, 0);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public Where_clauseContext where_clause() {
            return getRuleContext(Where_clauseContext.class, 0);
        }

        public Cmp_sourceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cmp_source;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCmp_source(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCmp_source(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitCmp_source(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_index_stmtContext extends ParserRuleContext {
        public TerminalNode T_CREATE() {
            return getToken(HplsqlParser.T_CREATE, 0);
        }

        public TerminalNode T_INDEX() {
            return getToken(HplsqlParser.T_INDEX, 0);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public TerminalNode T_ON() {
            return getToken(HplsqlParser.T_ON, 0);
        }

        public Table_nameContext table_name() {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public List<Create_index_colContext> create_index_col() {
            return getRuleContexts(Create_index_colContext.class);
        }

        public Create_index_colContext create_index_col(int i) {
            return getRuleContext(Create_index_colContext.class, i);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public TerminalNode T_UNIQUE() {
            return getToken(HplsqlParser.T_UNIQUE, 0);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_index_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_index_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_index_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_index_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Create_index_colContext extends ParserRuleContext {
        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public TerminalNode T_ASC() {
            return getToken(HplsqlParser.T_ASC, 0);
        }

        public TerminalNode T_DESC() {
            return getToken(HplsqlParser.T_DESC, 0);
        }

        public Create_index_colContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_index_col;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_index_col(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_index_col(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCreate_index_col(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Index_storage_clauseContext extends ParserRuleContext {
        public Index_mssql_storage_clauseContext index_mssql_storage_clause() {
            return getRuleContext(Index_mssql_storage_clauseContext.class, 0);
        }

        public Index_storage_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_index_storage_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterIndex_storage_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitIndex_storage_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitIndex_storage_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Index_mssql_storage_clauseContext extends ParserRuleContext {
        public TerminalNode T_WITH() {
            return getToken(HplsqlParser.T_WITH, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public List<IdentContext> ident() {
            return getRuleContexts(IdentContext.class);
        }

        public IdentContext ident(int i) {
            return getRuleContext(IdentContext.class, i);
        }

        public List<TerminalNode> T_EQUAL() {
            return getTokens(HplsqlParser.T_EQUAL);
        }

        public TerminalNode T_EQUAL(int i) {
            return getToken(HplsqlParser.T_EQUAL, i);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public List<Create_table_options_mssql_itemContext> create_table_options_mssql_item() {
            return getRuleContexts(Create_table_options_mssql_itemContext.class);
        }

        public Create_table_options_mssql_itemContext create_table_options_mssql_item(int i) {
            return getRuleContext(Create_table_options_mssql_itemContext.class, i);
        }

        public Index_mssql_storage_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_index_mssql_storage_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterIndex_mssql_storage_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitIndex_mssql_storage_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitIndex_mssql_storage_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Quit_stmtContext extends ParserRuleContext {
        public TerminalNode T_QUIT() {
            return getToken(HplsqlParser.T_QUIT, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public Quit_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_quit_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterQuit_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitQuit_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitQuit_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Return_stmtContext extends ParserRuleContext {
        public TerminalNode T_RETURN() {
            return getToken(HplsqlParser.T_RETURN, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public Return_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_return_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterReturn_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitReturn_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitReturn_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Cpp_function_stmtContext extends ParserRuleContext {
        public Cpp_function_headerContext cpp_function_header() {
            return getRuleContext(Cpp_function_headerContext.class, 0);
        }

        public Cpp_function_bodyContext cpp_function_body() {
            return getRuleContext(Cpp_function_bodyContext.class, 0);
        }

        public Cpp_function_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cpp_function_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_function_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_function_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCpp_function_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Cpp_function_headerContext extends ParserRuleContext {
        public DtypeContext dtype() {
            return getRuleContext(DtypeContext.class, 0);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public Cpp_function_params_clauseContext cpp_function_params_clause() {
            return getRuleContext(Cpp_function_params_clauseContext.class, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public Cpp_function_headerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cpp_function_header;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_function_header(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_function_header(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCpp_function_header(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Cpp_function_params_clauseContext extends ParserRuleContext {
        public List<Cpp_function_paramContext> cpp_function_param() {
            return getRuleContexts(Cpp_function_paramContext.class);
        }

        public Cpp_function_paramContext cpp_function_param(int i) {
            return getRuleContext(Cpp_function_paramContext.class, i);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public Cpp_function_params_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cpp_function_params_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_function_params_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_function_params_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCpp_function_params_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Cpp_function_paramContext extends ParserRuleContext {
        public DtypeContext dtype() {
            return getRuleContext(DtypeContext.class, 0);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public Cpp_function_paramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cpp_function_param;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_function_param(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_function_param(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCpp_function_param(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Cpp_function_bodyContext extends ParserRuleContext {
        public TerminalNode T_OPEN_B() {
            return getToken(HplsqlParser.T_OPEN_B, 0);
        }

        public TerminalNode T_CLOSE_B() {
            return getToken(HplsqlParser.T_CLOSE_B, 0);
        }

        public List<Cpp_body_contentContext> cpp_body_content() {
            return getRuleContexts(Cpp_body_contentContext.class);
        }

        public Cpp_body_contentContext cpp_body_content(int i) {
            return getRuleContext(Cpp_body_contentContext.class, i);
        }

        public Cpp_function_bodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cpp_function_body;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_function_body(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_function_body(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCpp_function_body(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Cpp_if_stmtContext extends ParserRuleContext {
        public TerminalNode T_IF() {
            return getToken(HplsqlParser.T_IF, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public Bool_exprContext bool_expr() {
            return getRuleContext(Bool_exprContext.class, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public Cpp_for_stmt_bodyContext cpp_for_stmt_body() {
            return getRuleContext(Cpp_for_stmt_bodyContext.class, 0);
        }

        public List<Cpp_elseif_clauseContext> cpp_elseif_clause() {
            return getRuleContexts(Cpp_elseif_clauseContext.class);
        }

        public Cpp_elseif_clauseContext cpp_elseif_clause(int i) {
            return getRuleContext(Cpp_elseif_clauseContext.class, i);
        }

        public Cpp_else_clauseContext cpp_else_clause() {
            return getRuleContext(Cpp_else_clauseContext.class, 0);
        }

        public Cpp_if_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cpp_if_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_if_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_if_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitCpp_if_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Cpp_elseif_clauseContext extends ParserRuleContext {
        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public Bool_exprContext bool_expr() {
            return getRuleContext(Bool_exprContext.class, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public Cpp_for_stmt_bodyContext cpp_for_stmt_body() {
            return getRuleContext(Cpp_for_stmt_bodyContext.class, 0);
        }

        public TerminalNode T_ELSIF() {
            return getToken(HplsqlParser.T_ELSIF, 0);
        }

        public TerminalNode T_ELSEIF() {
            return getToken(HplsqlParser.T_ELSEIF, 0);
        }

        public Cpp_elseif_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cpp_elseif_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_elseif_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_elseif_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCpp_elseif_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Cpp_else_clauseContext extends ParserRuleContext {
        public TerminalNode T_ELSE() {
            return getToken(HplsqlParser.T_ELSE, 0);
        }

        public Cpp_for_stmt_bodyContext cpp_for_stmt_body() {
            return getRuleContext(Cpp_for_stmt_bodyContext.class, 0);
        }

        public Cpp_else_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cpp_else_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_else_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_else_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCpp_else_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Cpp_for_stmtContext extends ParserRuleContext {
        public Cpp_for_stmt_headerContext cpp_for_stmt_header() {
            return getRuleContext(Cpp_for_stmt_headerContext.class, 0);
        }

        public Cpp_for_stmt_bodyContext cpp_for_stmt_body() {
            return getRuleContext(Cpp_for_stmt_bodyContext.class, 0);
        }

        public Cpp_for_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cpp_for_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_for_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_for_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitCpp_for_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Cpp_for_stmt_headerContext extends ParserRuleContext {
        public TerminalNode T_FOR() {
            return getToken(HplsqlParser.T_FOR, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public Cpp_for_params_clauseContext cpp_for_params_clause() {
            return getRuleContext(Cpp_for_params_clauseContext.class, 0);
        }

        public List<TerminalNode> T_SEMICOLON() {
            return getTokens(HplsqlParser.T_SEMICOLON);
        }

        public TerminalNode T_SEMICOLON(int i) {
            return getToken(HplsqlParser.T_SEMICOLON, i);
        }

        public Bool_exprContext bool_expr() {
            return getRuleContext(Bool_exprContext.class, 0);
        }

        public Cpp_for_stmt_var_incr_caluseContext cpp_for_stmt_var_incr_caluse() {
            return getRuleContext(Cpp_for_stmt_var_incr_caluseContext.class, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public Cpp_for_stmt_headerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cpp_for_stmt_header;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_for_stmt_header(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_for_stmt_header(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCpp_for_stmt_header(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Cpp_for_params_clauseContext extends ParserRuleContext {
        public List<Cpp_for_paramContext> cpp_for_param() {
            return getRuleContexts(Cpp_for_paramContext.class);
        }

        public Cpp_for_paramContext cpp_for_param(int i) {
            return getRuleContext(Cpp_for_paramContext.class, i);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public Cpp_for_params_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cpp_for_params_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_for_params_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_for_params_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCpp_for_params_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Bool_exprContext bool_expr() throws RecognitionException {
        return bool_expr(0);
    }

    public static class Cpp_for_paramContext extends ParserRuleContext {
        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public TerminalNode T_EQUAL() {
            return getToken(HplsqlParser.T_EQUAL, 0);
        }

        public TerminalNode L_INT() {
            return getToken(HplsqlParser.L_INT, 0);
        }

        public DtypeContext dtype() {
            return getRuleContext(DtypeContext.class, 0);
        }

        public Cpp_for_paramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cpp_for_param;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_for_param(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_for_param(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCpp_for_param(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Cpp_for_stmt_var_incr_caluseContext extends ParserRuleContext {
        public List<Cpp_for_stmt_var_incr_Context> cpp_for_stmt_var_incr_() {
            return getRuleContexts(Cpp_for_stmt_var_incr_Context.class);
        }

        public Cpp_for_stmt_var_incr_Context cpp_for_stmt_var_incr_(int i) {
            return getRuleContext(Cpp_for_stmt_var_incr_Context.class, i);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public Cpp_for_stmt_var_incr_caluseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cpp_for_stmt_var_incr_caluse;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_for_stmt_var_incr_caluse(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_for_stmt_var_incr_caluse(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCpp_for_stmt_var_incr_caluse(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Cpp_for_stmt_var_incr_Context extends ParserRuleContext {
        public List<IdentContext> ident() {
            return getRuleContexts(IdentContext.class);
        }

        public IdentContext ident(int i) {
            return getRuleContext(IdentContext.class, i);
        }

        public List<TerminalNode> T_ADD() {
            return getTokens(HplsqlParser.T_ADD);
        }

        public TerminalNode T_ADD(int i) {
            return getToken(HplsqlParser.T_ADD, i);
        }

        public List<TerminalNode> T_SUB() {
            return getTokens(HplsqlParser.T_SUB);
        }

        public TerminalNode T_SUB(int i) {
            return getToken(HplsqlParser.T_SUB, i);
        }

        public TerminalNode T_EQUAL() {
            return getToken(HplsqlParser.T_EQUAL, 0);
        }

        public TerminalNode L_INT() {
            return getToken(HplsqlParser.L_INT, 0);
        }

        public TerminalNode T_MUL() {
            return getToken(HplsqlParser.T_MUL, 0);
        }

        public TerminalNode T_DIV() {
            return getToken(HplsqlParser.T_DIV, 0);
        }

        public Cpp_for_stmt_var_incr_Context(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cpp_for_stmt_var_incr_;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_for_stmt_var_incr_(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_for_stmt_var_incr_(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCpp_for_stmt_var_incr_(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Cpp_for_stmt_bodyContext extends ParserRuleContext {
        public TerminalNode T_OPEN_B() {
            return getToken(HplsqlParser.T_OPEN_B, 0);
        }

        public TerminalNode T_CLOSE_B() {
            return getToken(HplsqlParser.T_CLOSE_B, 0);
        }

        public List<Cpp_body_contentContext> cpp_body_content() {
            return getRuleContexts(Cpp_body_contentContext.class);
        }

        public Cpp_body_contentContext cpp_body_content(int i) {
            return getRuleContext(Cpp_body_contentContext.class, i);
        }

        public Cpp_for_stmt_bodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cpp_for_stmt_body;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_for_stmt_body(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_for_stmt_body(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCpp_for_stmt_body(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Cpp_body_contentContext extends ParserRuleContext {
        public Cpp_if_stmtContext cpp_if_stmt() {
            return getRuleContext(Cpp_if_stmtContext.class, 0);
        }

        public Cpp_for_stmtContext cpp_for_stmt() {
            return getRuleContext(Cpp_for_stmtContext.class, 0);
        }

        public Cpp_body_contentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cpp_body_content;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_body_content(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_body_content(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitCpp_body_content(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class While_stmtContext extends ParserRuleContext {
        public List<TerminalNode> T_WHILE() {
            return getTokens(HplsqlParser.T_WHILE);
        }

        public TerminalNode T_WHILE(int i) {
            return getToken(HplsqlParser.T_WHILE, i);
        }

        public Bool_exprContext bool_expr() {
            return getRuleContext(Bool_exprContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode T_END() {
            return getToken(HplsqlParser.T_END, 0);
        }

        public TerminalNode T_DO() {
            return getToken(HplsqlParser.T_DO, 0);
        }

        public List<TerminalNode> T_LOOP() {
            return getTokens(HplsqlParser.T_LOOP);
        }

        public TerminalNode T_LOOP(int i) {
            return getToken(HplsqlParser.T_LOOP, i);
        }

        public TerminalNode T_THEN() {
            return getToken(HplsqlParser.T_THEN, 0);
        }

        public TerminalNode T_BEGIN() {
            return getToken(HplsqlParser.T_BEGIN, 0);
        }

        public While_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_while_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterWhile_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitWhile_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitWhile_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class For_range_stmtContext extends ParserRuleContext {
        public TerminalNode T_FOR() {
            return getToken(HplsqlParser.T_FOR, 0);
        }

        public TerminalNode L_ID() {
            return getToken(HplsqlParser.L_ID, 0);
        }

        public TerminalNode T_IN() {
            return getToken(HplsqlParser.T_IN, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode T_DOT2() {
            return getToken(HplsqlParser.T_DOT2, 0);
        }

        public List<TerminalNode> T_LOOP() {
            return getTokens(HplsqlParser.T_LOOP);
        }

        public TerminalNode T_LOOP(int i) {
            return getToken(HplsqlParser.T_LOOP, i);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode T_END() {
            return getToken(HplsqlParser.T_END, 0);
        }

        public TerminalNode T_REVERSE() {
            return getToken(HplsqlParser.T_REVERSE, 0);
        }

        public TerminalNode T_BY() {
            return getToken(HplsqlParser.T_BY, 0);
        }

        public TerminalNode T_STEP() {
            return getToken(HplsqlParser.T_STEP, 0);
        }

        public For_range_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_for_range_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterFor_range_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitFor_range_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitFor_range_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LabelContext extends ParserRuleContext {
        public TerminalNode L_LABEL() {
            return getToken(HplsqlParser.L_LABEL, 0);
        }

        public List<TerminalNode> T_LESS() {
            return getTokens(HplsqlParser.T_LESS);
        }

        public TerminalNode T_LESS(int i) {
            return getToken(HplsqlParser.T_LESS, i);
        }

        public TerminalNode L_ID() {
            return getToken(HplsqlParser.L_ID, 0);
        }

        public List<TerminalNode> T_GREATER() {
            return getTokens(HplsqlParser.T_GREATER);
        }

        public TerminalNode T_GREATER(int i) {
            return getToken(HplsqlParser.T_GREATER, i);
        }

        public LabelContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_label;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterLabel(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitLabel(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitLabel(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Using_clauseContext extends ParserRuleContext {
        public TerminalNode T_USING() {
            return getToken(HplsqlParser.T_USING, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public Using_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_using_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterUsing_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitUsing_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitUsing_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Select_stmtContext extends ParserRuleContext {
        public Fullselect_stmtContext fullselect_stmt() {
            return getRuleContext(Fullselect_stmtContext.class, 0);
        }

        public Select_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_select_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterSelect_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitSelect_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitSelect_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Fullselect_stmtContext extends ParserRuleContext {
        public List<Fullselect_stmt_itemContext> fullselect_stmt_item() {
            return getRuleContexts(Fullselect_stmt_itemContext.class);
        }

        public Fullselect_stmt_itemContext fullselect_stmt_item(int i) {
            return getRuleContext(Fullselect_stmt_itemContext.class, i);
        }

        public List<Fullselect_set_clauseContext> fullselect_set_clause() {
            return getRuleContexts(Fullselect_set_clauseContext.class);
        }

        public Fullselect_set_clauseContext fullselect_set_clause(int i) {
            return getRuleContext(Fullselect_set_clauseContext.class, i);
        }

        public Fullselect_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fullselect_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterFullselect_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitFullselect_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitFullselect_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Fullselect_stmt_itemContext extends ParserRuleContext {
        public Subselect_stmtContext subselect_stmt() {
            return getRuleContext(Subselect_stmtContext.class, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public Fullselect_stmtContext fullselect_stmt() {
            return getRuleContext(Fullselect_stmtContext.class, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public Fullselect_stmt_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fullselect_stmt_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterFullselect_stmt_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitFullselect_stmt_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitFullselect_stmt_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Fullselect_set_clauseContext extends ParserRuleContext {
        public TerminalNode T_UNION() {
            return getToken(HplsqlParser.T_UNION, 0);
        }

        public TerminalNode T_ALL() {
            return getToken(HplsqlParser.T_ALL, 0);
        }

        public TerminalNode T_EXCEPT() {
            return getToken(HplsqlParser.T_EXCEPT, 0);
        }

        public TerminalNode T_INTERSECT() {
            return getToken(HplsqlParser.T_INTERSECT, 0);
        }

        public Fullselect_set_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fullselect_set_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterFullselect_set_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitFullselect_set_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitFullselect_set_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Subselect_stmtContext extends ParserRuleContext {
        public Select_listContext select_list() {
            return getRuleContext(Select_listContext.class, 0);
        }

        public TerminalNode T_SELECT() {
            return getToken(HplsqlParser.T_SELECT, 0);
        }

        public TerminalNode T_SEL() {
            return getToken(HplsqlParser.T_SEL, 0);
        }

        public Into_clauseContext into_clause() {
            return getRuleContext(Into_clauseContext.class, 0);
        }

        public From_clauseContext from_clause() {
            return getRuleContext(From_clauseContext.class, 0);
        }

        public Where_clauseContext where_clause() {
            return getRuleContext(Where_clauseContext.class, 0);
        }

        public Group_by_clauseContext group_by_clause() {
            return getRuleContext(Group_by_clauseContext.class, 0);
        }

        public Having_clauseContext having_clause() {
            return getRuleContext(Having_clauseContext.class, 0);
        }

        public Qualify_clauseContext qualify_clause() {
            return getRuleContext(Qualify_clauseContext.class, 0);
        }

        public Order_by_clauseContext order_by_clause() {
            return getRuleContext(Order_by_clauseContext.class, 0);
        }

        public Select_optionsContext select_options() {
            return getRuleContext(Select_optionsContext.class, 0);
        }

        public Subselect_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_subselect_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterSubselect_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitSubselect_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitSubselect_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Select_listContext extends ParserRuleContext {
        public List<Select_list_itemContext> select_list_item() {
            return getRuleContexts(Select_list_itemContext.class);
        }

        public Select_list_itemContext select_list_item(int i) {
            return getRuleContext(Select_list_itemContext.class, i);
        }

        public Select_list_setContext select_list_set() {
            return getRuleContext(Select_list_setContext.class, 0);
        }

        public Select_list_limitContext select_list_limit() {
            return getRuleContext(Select_list_limitContext.class, 0);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public Select_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_select_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterSelect_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitSelect_list(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitSelect_list(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Select_list_setContext extends ParserRuleContext {
        public TerminalNode T_ALL() {
            return getToken(HplsqlParser.T_ALL, 0);
        }

        public TerminalNode T_DISTINCT() {
            return getToken(HplsqlParser.T_DISTINCT, 0);
        }

        public Select_list_setContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_select_list_set;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterSelect_list_set(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitSelect_list_set(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitSelect_list_set(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExprContext expr() throws RecognitionException {
        return expr(0);
    }

    public static class Select_list_limitContext extends ParserRuleContext {
        public TerminalNode T_TOP() {
            return getToken(HplsqlParser.T_TOP, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public Select_list_limitContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_select_list_limit;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterSelect_list_limit(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitSelect_list_limit(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitSelect_list_limit(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Select_list_itemContext extends ParserRuleContext {
        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public Select_list_asteriskContext select_list_asterisk() {
            return getRuleContext(Select_list_asteriskContext.class, 0);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public TerminalNode T_EQUAL() {
            return getToken(HplsqlParser.T_EQUAL, 0);
        }

        public Select_list_aliasContext select_list_alias() {
            return getRuleContext(Select_list_aliasContext.class, 0);
        }

        public Select_list_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_select_list_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterSelect_list_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitSelect_list_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitSelect_list_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Select_list_aliasContext extends ParserRuleContext {
        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public TerminalNode T_AS() {
            return getToken(HplsqlParser.T_AS, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public TerminalNode T_TITLE() {
            return getToken(HplsqlParser.T_TITLE, 0);
        }

        public TerminalNode L_S_STRING() {
            return getToken(HplsqlParser.L_S_STRING, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public Select_list_aliasContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_select_list_alias;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterSelect_list_alias(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitSelect_list_alias(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitSelect_list_alias(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Select_list_asteriskContext extends ParserRuleContext {
        public TerminalNode T_MUL() {
            return getToken(HplsqlParser.T_MUL, 0);
        }

        public TerminalNode L_ID() {
            return getToken(HplsqlParser.L_ID, 0);
        }

        public Select_list_asteriskContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_select_list_asterisk;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterSelect_list_asterisk(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitSelect_list_asterisk(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitSelect_list_asterisk(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Into_clauseContext extends ParserRuleContext {
        public TerminalNode T_INTO() {
            return getToken(HplsqlParser.T_INTO, 0);
        }

        public List<IdentContext> ident() {
            return getRuleContexts(IdentContext.class);
        }

        public IdentContext ident(int i) {
            return getRuleContext(IdentContext.class, i);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public Into_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_into_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterInto_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitInto_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitInto_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class From_clauseContext extends ParserRuleContext {
        public TerminalNode T_FROM() {
            return getToken(HplsqlParser.T_FROM, 0);
        }

        public From_table_clauseContext from_table_clause() {
            return getRuleContext(From_table_clauseContext.class, 0);
        }

        public List<From_join_clauseContext> from_join_clause() {
            return getRuleContexts(From_join_clauseContext.class);
        }

        public From_join_clauseContext from_join_clause(int i) {
            return getRuleContext(From_join_clauseContext.class, i);
        }

        public From_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_from_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterFrom_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitFrom_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitFrom_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class From_table_clauseContext extends ParserRuleContext {
        public From_table_name_clauseContext from_table_name_clause() {
            return getRuleContext(From_table_name_clauseContext.class, 0);
        }

        public From_subselect_clauseContext from_subselect_clause() {
            return getRuleContext(From_subselect_clauseContext.class, 0);
        }

        public From_table_values_clauseContext from_table_values_clause() {
            return getRuleContext(From_table_values_clauseContext.class, 0);
        }

        public From_table_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_from_table_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterFrom_table_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitFrom_table_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitFrom_table_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class From_table_name_clauseContext extends ParserRuleContext {
        public Table_nameContext table_name() {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public From_alias_clauseContext from_alias_clause() {
            return getRuleContext(From_alias_clauseContext.class, 0);
        }

        public From_table_name_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_from_table_name_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterFrom_table_name_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitFrom_table_name_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitFrom_table_name_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class From_subselect_clauseContext extends ParserRuleContext {
        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public Select_stmtContext select_stmt() {
            return getRuleContext(Select_stmtContext.class, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public From_alias_clauseContext from_alias_clause() {
            return getRuleContext(From_alias_clauseContext.class, 0);
        }

        public From_subselect_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_from_subselect_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterFrom_subselect_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitFrom_subselect_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitFrom_subselect_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class From_join_clauseContext extends ParserRuleContext {
        public TerminalNode T_COMMA() {
            return getToken(HplsqlParser.T_COMMA, 0);
        }

        public From_table_clauseContext from_table_clause() {
            return getRuleContext(From_table_clauseContext.class, 0);
        }

        public From_join_type_clauseContext from_join_type_clause() {
            return getRuleContext(From_join_type_clauseContext.class, 0);
        }

        public TerminalNode T_ON() {
            return getToken(HplsqlParser.T_ON, 0);
        }

        public Bool_exprContext bool_expr() {
            return getRuleContext(Bool_exprContext.class, 0);
        }

        public From_join_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_from_join_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterFrom_join_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitFrom_join_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitFrom_join_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class From_join_type_clauseContext extends ParserRuleContext {
        public TerminalNode T_JOIN() {
            return getToken(HplsqlParser.T_JOIN, 0);
        }

        public TerminalNode T_INNER() {
            return getToken(HplsqlParser.T_INNER, 0);
        }

        public TerminalNode T_LEFT() {
            return getToken(HplsqlParser.T_LEFT, 0);
        }

        public TerminalNode T_RIGHT() {
            return getToken(HplsqlParser.T_RIGHT, 0);
        }

        public TerminalNode T_FULL() {
            return getToken(HplsqlParser.T_FULL, 0);
        }

        public TerminalNode T_OUTER() {
            return getToken(HplsqlParser.T_OUTER, 0);
        }

        public From_join_type_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_from_join_type_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterFrom_join_type_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitFrom_join_type_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitFrom_join_type_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class From_table_values_clauseContext extends ParserRuleContext {
        public TerminalNode T_TABLE() {
            return getToken(HplsqlParser.T_TABLE, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public TerminalNode T_VALUES() {
            return getToken(HplsqlParser.T_VALUES, 0);
        }

        public List<From_table_values_rowContext> from_table_values_row() {
            return getRuleContexts(From_table_values_rowContext.class);
        }

        public From_table_values_rowContext from_table_values_row(int i) {
            return getRuleContext(From_table_values_rowContext.class, i);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public From_alias_clauseContext from_alias_clause() {
            return getRuleContext(From_alias_clauseContext.class, 0);
        }

        public From_table_values_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_from_table_values_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterFrom_table_values_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitFrom_table_values_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitFrom_table_values_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class From_table_values_rowContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public From_table_values_rowContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_from_table_values_row;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterFrom_table_values_row(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitFrom_table_values_row(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitFrom_table_values_row(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class From_alias_clauseContext extends ParserRuleContext {
        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public TerminalNode T_AS() {
            return getToken(HplsqlParser.T_AS, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public List<TerminalNode> L_ID() {
            return getTokens(HplsqlParser.L_ID);
        }

        public TerminalNode L_ID(int i) {
            return getToken(HplsqlParser.L_ID, i);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public From_alias_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_from_alias_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterFrom_alias_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitFrom_alias_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitFrom_alias_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Table_nameContext extends ParserRuleContext {
        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public Table_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_table_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterTable_name(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitTable_name(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitTable_name(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Where_clauseContext extends ParserRuleContext {
        public TerminalNode T_WHERE() {
            return getToken(HplsqlParser.T_WHERE, 0);
        }

        public Bool_exprContext bool_expr() {
            return getRuleContext(Bool_exprContext.class, 0);
        }

        public Where_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_where_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterWhere_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitWhere_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitWhere_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Group_by_clauseContext extends ParserRuleContext {
        public TerminalNode T_GROUP() {
            return getToken(HplsqlParser.T_GROUP, 0);
        }

        public TerminalNode T_BY() {
            return getToken(HplsqlParser.T_BY, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_group_by_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterGroup_by_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitGroup_by_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitGroup_by_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Having_clauseContext extends ParserRuleContext {
        public TerminalNode T_HAVING() {
            return getToken(HplsqlParser.T_HAVING, 0);
        }

        public Bool_exprContext bool_expr() {
            return getRuleContext(Bool_exprContext.class, 0);
        }

        public Having_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_having_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterHaving_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitHaving_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitHaving_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Qualify_clauseContext extends ParserRuleContext {
        public TerminalNode T_QUALIFY() {
            return getToken(HplsqlParser.T_QUALIFY, 0);
        }

        public Bool_exprContext bool_expr() {
            return getRuleContext(Bool_exprContext.class, 0);
        }

        public Qualify_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_qualify_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterQualify_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitQualify_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitQualify_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Order_by_clauseContext extends ParserRuleContext {
        public TerminalNode T_ORDER() {
            return getToken(HplsqlParser.T_ORDER, 0);
        }

        public TerminalNode T_BY() {
            return getToken(HplsqlParser.T_BY, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public List<TerminalNode> T_ASC() {
            return getTokens(HplsqlParser.T_ASC);
        }

        public TerminalNode T_ASC(int i) {
            return getToken(HplsqlParser.T_ASC, i);
        }

        public List<TerminalNode> T_DESC() {
            return getTokens(HplsqlParser.T_DESC);
        }

        public TerminalNode T_DESC(int i) {
            return getToken(HplsqlParser.T_DESC, i);
        }

        public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_order_by_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterOrder_by_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitOrder_by_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitOrder_by_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Select_optionsContext extends ParserRuleContext {
        public List<Select_options_itemContext> select_options_item() {
            return getRuleContexts(Select_options_itemContext.class);
        }

        public Select_options_itemContext select_options_item(int i) {
            return getRuleContext(Select_options_itemContext.class, i);
        }

        public Select_optionsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_select_options;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterSelect_options(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitSelect_options(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitSelect_options(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Select_options_itemContext extends ParserRuleContext {
        public TerminalNode T_LIMIT() {
            return getToken(HplsqlParser.T_LIMIT, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode T_WITH() {
            return getToken(HplsqlParser.T_WITH, 0);
        }

        public TerminalNode T_RR() {
            return getToken(HplsqlParser.T_RR, 0);
        }

        public TerminalNode T_RS() {
            return getToken(HplsqlParser.T_RS, 0);
        }

        public TerminalNode T_CS() {
            return getToken(HplsqlParser.T_CS, 0);
        }

        public TerminalNode T_UR() {
            return getToken(HplsqlParser.T_UR, 0);
        }

        public TerminalNode T_USE() {
            return getToken(HplsqlParser.T_USE, 0);
        }

        public TerminalNode T_AND() {
            return getToken(HplsqlParser.T_AND, 0);
        }

        public TerminalNode T_KEEP() {
            return getToken(HplsqlParser.T_KEEP, 0);
        }

        public TerminalNode T_LOCKS() {
            return getToken(HplsqlParser.T_LOCKS, 0);
        }

        public TerminalNode T_EXCLUSIVE() {
            return getToken(HplsqlParser.T_EXCLUSIVE, 0);
        }

        public TerminalNode T_UPDATE() {
            return getToken(HplsqlParser.T_UPDATE, 0);
        }

        public TerminalNode T_SHARE() {
            return getToken(HplsqlParser.T_SHARE, 0);
        }

        public Select_options_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_select_options_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterSelect_options_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitSelect_options_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitSelect_options_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Bool_exprContext extends ParserRuleContext {
        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public List<Bool_exprContext> bool_expr() {
            return getRuleContexts(Bool_exprContext.class);
        }

        public Bool_exprContext bool_expr(int i) {
            return getRuleContext(Bool_exprContext.class, i);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public TerminalNode T_NOT() {
            return getToken(HplsqlParser.T_NOT, 0);
        }

        public Bool_expr_atomContext bool_expr_atom() {
            return getRuleContext(Bool_expr_atomContext.class, 0);
        }

        public Bool_expr_logical_operatorContext bool_expr_logical_operator() {
            return getRuleContext(Bool_expr_logical_operatorContext.class, 0);
        }

        public Bool_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_bool_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterBool_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitBool_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitBool_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Bool_expr_atomContext extends ParserRuleContext {
        public Bool_expr_unaryContext bool_expr_unary() {
            return getRuleContext(Bool_expr_unaryContext.class, 0);
        }

        public Bool_expr_binaryContext bool_expr_binary() {
            return getRuleContext(Bool_expr_binaryContext.class, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public Bool_expr_atomContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_bool_expr_atom;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterBool_expr_atom(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitBool_expr_atom(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitBool_expr_atom(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Bool_expr_unaryContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode T_IS() {
            return getToken(HplsqlParser.T_IS, 0);
        }

        public TerminalNode T_NULL() {
            return getToken(HplsqlParser.T_NULL, 0);
        }

        public TerminalNode T_NOT() {
            return getToken(HplsqlParser.T_NOT, 0);
        }

        public TerminalNode T_BETWEEN() {
            return getToken(HplsqlParser.T_BETWEEN, 0);
        }

        public TerminalNode T_AND() {
            return getToken(HplsqlParser.T_AND, 0);
        }

        public TerminalNode T_EXISTS() {
            return getToken(HplsqlParser.T_EXISTS, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public Select_stmtContext select_stmt() {
            return getRuleContext(Select_stmtContext.class, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public Bool_expr_single_inContext bool_expr_single_in() {
            return getRuleContext(Bool_expr_single_inContext.class, 0);
        }

        public Bool_expr_multi_inContext bool_expr_multi_in() {
            return getRuleContext(Bool_expr_multi_inContext.class, 0);
        }

        public Bool_expr_unaryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_bool_expr_unary;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterBool_expr_unary(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitBool_expr_unary(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitBool_expr_unary(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Bool_expr_single_inContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode T_IN() {
            return getToken(HplsqlParser.T_IN, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public Select_stmtContext select_stmt() {
            return getRuleContext(Select_stmtContext.class, 0);
        }

        public TerminalNode T_NOT() {
            return getToken(HplsqlParser.T_NOT, 0);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public Bool_expr_single_inContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_bool_expr_single_in;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterBool_expr_single_in(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitBool_expr_single_in(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitBool_expr_single_in(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Bool_expr_multi_inContext extends ParserRuleContext {
        public List<TerminalNode> T_OPEN_P() {
            return getTokens(HplsqlParser.T_OPEN_P);
        }

        public TerminalNode T_OPEN_P(int i) {
            return getToken(HplsqlParser.T_OPEN_P, i);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public List<TerminalNode> T_CLOSE_P() {
            return getTokens(HplsqlParser.T_CLOSE_P);
        }

        public TerminalNode T_CLOSE_P(int i) {
            return getToken(HplsqlParser.T_CLOSE_P, i);
        }

        public TerminalNode T_IN() {
            return getToken(HplsqlParser.T_IN, 0);
        }

        public Select_stmtContext select_stmt() {
            return getRuleContext(Select_stmtContext.class, 0);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public TerminalNode T_NOT() {
            return getToken(HplsqlParser.T_NOT, 0);
        }

        public Bool_expr_multi_inContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_bool_expr_multi_in;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterBool_expr_multi_in(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitBool_expr_multi_in(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitBool_expr_multi_in(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Bool_expr_binaryContext extends ParserRuleContext {
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public Bool_expr_binary_operatorContext bool_expr_binary_operator() {
            return getRuleContext(Bool_expr_binary_operatorContext.class, 0);
        }

        public Bool_expr_binaryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_bool_expr_binary;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterBool_expr_binary(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitBool_expr_binary(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitBool_expr_binary(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Bool_expr_logical_operatorContext extends ParserRuleContext {
        public TerminalNode T_AND() {
            return getToken(HplsqlParser.T_AND, 0);
        }

        public TerminalNode T_OR() {
            return getToken(HplsqlParser.T_OR, 0);
        }

        public Bool_expr_logical_operatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_bool_expr_logical_operator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterBool_expr_logical_operator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitBool_expr_logical_operator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitBool_expr_logical_operator(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Bool_expr_binary_operatorContext extends ParserRuleContext {
        public TerminalNode T_EQUAL() {
            return getToken(HplsqlParser.T_EQUAL, 0);
        }

        public TerminalNode T_EQUAL2() {
            return getToken(HplsqlParser.T_EQUAL2, 0);
        }

        public TerminalNode T_NOTEQUAL() {
            return getToken(HplsqlParser.T_NOTEQUAL, 0);
        }

        public TerminalNode T_NOTEQUAL2() {
            return getToken(HplsqlParser.T_NOTEQUAL2, 0);
        }

        public TerminalNode T_LESS() {
            return getToken(HplsqlParser.T_LESS, 0);
        }

        public TerminalNode T_LESSEQUAL() {
            return getToken(HplsqlParser.T_LESSEQUAL, 0);
        }

        public TerminalNode T_GREATER() {
            return getToken(HplsqlParser.T_GREATER, 0);
        }

        public TerminalNode T_GREATEREQUAL() {
            return getToken(HplsqlParser.T_GREATEREQUAL, 0);
        }

        public TerminalNode T_LIKE() {
            return getToken(HplsqlParser.T_LIKE, 0);
        }

        public TerminalNode T_RLIKE() {
            return getToken(HplsqlParser.T_RLIKE, 0);
        }

        public TerminalNode T_REGEXP() {
            return getToken(HplsqlParser.T_REGEXP, 0);
        }

        public TerminalNode T_NOT() {
            return getToken(HplsqlParser.T_NOT, 0);
        }

        public Bool_expr_binary_operatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_bool_expr_binary_operator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterBool_expr_binary_operator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitBool_expr_binary_operator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitBool_expr_binary_operator(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExprContext extends ParserRuleContext {
        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public Select_stmtContext select_stmt() {
            return getRuleContext(Select_stmtContext.class, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public Expr_intervalContext expr_interval() {
            return getRuleContext(Expr_intervalContext.class, 0);
        }

        public Expr_concatContext expr_concat() {
            return getRuleContext(Expr_concatContext.class, 0);
        }

        public Expr_caseContext expr_case() {
            return getRuleContext(Expr_caseContext.class, 0);
        }

        public Expr_cursor_attributeContext expr_cursor_attribute() {
            return getRuleContext(Expr_cursor_attributeContext.class, 0);
        }

        public Expr_agg_window_funcContext expr_agg_window_func() {
            return getRuleContext(Expr_agg_window_funcContext.class, 0);
        }

        public Expr_spec_funcContext expr_spec_func() {
            return getRuleContext(Expr_spec_funcContext.class, 0);
        }

        public Expr_funcContext expr_func() {
            return getRuleContext(Expr_funcContext.class, 0);
        }

        public Expr_atomContext expr_atom() {
            return getRuleContext(Expr_atomContext.class, 0);
        }

        public TerminalNode T_MUL() {
            return getToken(HplsqlParser.T_MUL, 0);
        }

        public TerminalNode T_DIV() {
            return getToken(HplsqlParser.T_DIV, 0);
        }

        public TerminalNode T_ADD() {
            return getToken(HplsqlParser.T_ADD, 0);
        }

        public TerminalNode T_SUB() {
            return getToken(HplsqlParser.T_SUB, 0);
        }

        public Interval_itemContext interval_item() {
            return getRuleContext(Interval_itemContext.class, 0);
        }

        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Expr_atomContext extends ParserRuleContext {
        public Date_literalContext date_literal() {
            return getRuleContext(Date_literalContext.class, 0);
        }

        public Timestamp_literalContext timestamp_literal() {
            return getRuleContext(Timestamp_literalContext.class, 0);
        }

        public Bool_literalContext bool_literal() {
            return getRuleContext(Bool_literalContext.class, 0);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public StringContext string() {
            return getRuleContext(StringContext.class, 0);
        }

        public Dec_numberContext dec_number() {
            return getRuleContext(Dec_numberContext.class, 0);
        }

        public Int_numberContext int_number() {
            return getRuleContext(Int_numberContext.class, 0);
        }

        public Null_constContext null_const() {
            return getRuleContext(Null_constContext.class, 0);
        }

        public Expr_atomContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr_atom;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterExpr_atom(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitExpr_atom(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitExpr_atom(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Expr_intervalContext extends ParserRuleContext {
        public TerminalNode T_INTERVAL() {
            return getToken(HplsqlParser.T_INTERVAL, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public Interval_itemContext interval_item() {
            return getRuleContext(Interval_itemContext.class, 0);
        }

        public Expr_intervalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr_interval;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterExpr_interval(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitExpr_interval(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitExpr_interval(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Interval_itemContext extends ParserRuleContext {
        public TerminalNode T_DAY() {
            return getToken(HplsqlParser.T_DAY, 0);
        }

        public TerminalNode T_DAYS() {
            return getToken(HplsqlParser.T_DAYS, 0);
        }

        public TerminalNode T_MICROSECOND() {
            return getToken(HplsqlParser.T_MICROSECOND, 0);
        }

        public TerminalNode T_MICROSECONDS() {
            return getToken(HplsqlParser.T_MICROSECONDS, 0);
        }

        public TerminalNode T_SECOND() {
            return getToken(HplsqlParser.T_SECOND, 0);
        }

        public TerminalNode T_SECONDS() {
            return getToken(HplsqlParser.T_SECONDS, 0);
        }

        public Interval_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_interval_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterInterval_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitInterval_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitInterval_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Expr_concatContext extends ParserRuleContext {
        public List<Expr_concat_itemContext> expr_concat_item() {
            return getRuleContexts(Expr_concat_itemContext.class);
        }

        public Expr_concat_itemContext expr_concat_item(int i) {
            return getRuleContext(Expr_concat_itemContext.class, i);
        }

        public List<TerminalNode> T_PIPE() {
            return getTokens(HplsqlParser.T_PIPE);
        }

        public TerminalNode T_PIPE(int i) {
            return getToken(HplsqlParser.T_PIPE, i);
        }

        public List<TerminalNode> T_CONCAT() {
            return getTokens(HplsqlParser.T_CONCAT);
        }

        public TerminalNode T_CONCAT(int i) {
            return getToken(HplsqlParser.T_CONCAT, i);
        }

        public Expr_concatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr_concat;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterExpr_concat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitExpr_concat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitExpr_concat(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Expr_concat_itemContext extends ParserRuleContext {
        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public Expr_caseContext expr_case() {
            return getRuleContext(Expr_caseContext.class, 0);
        }

        public Expr_agg_window_funcContext expr_agg_window_func() {
            return getRuleContext(Expr_agg_window_funcContext.class, 0);
        }

        public Expr_spec_funcContext expr_spec_func() {
            return getRuleContext(Expr_spec_funcContext.class, 0);
        }

        public Expr_funcContext expr_func() {
            return getRuleContext(Expr_funcContext.class, 0);
        }

        public Expr_atomContext expr_atom() {
            return getRuleContext(Expr_atomContext.class, 0);
        }

        public Expr_concat_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr_concat_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterExpr_concat_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitExpr_concat_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitExpr_concat_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Expr_caseContext extends ParserRuleContext {
        public Expr_case_simpleContext expr_case_simple() {
            return getRuleContext(Expr_case_simpleContext.class, 0);
        }

        public Expr_case_searchedContext expr_case_searched() {
            return getRuleContext(Expr_case_searchedContext.class, 0);
        }

        public Expr_caseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr_case;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterExpr_case(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitExpr_case(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitExpr_case(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Expr_case_simpleContext extends ParserRuleContext {
        public TerminalNode T_CASE() {
            return getToken(HplsqlParser.T_CASE, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode T_END() {
            return getToken(HplsqlParser.T_END, 0);
        }

        public List<TerminalNode> T_WHEN() {
            return getTokens(HplsqlParser.T_WHEN);
        }

        public TerminalNode T_WHEN(int i) {
            return getToken(HplsqlParser.T_WHEN, i);
        }

        public List<TerminalNode> T_THEN() {
            return getTokens(HplsqlParser.T_THEN);
        }

        public TerminalNode T_THEN(int i) {
            return getToken(HplsqlParser.T_THEN, i);
        }

        public TerminalNode T_ELSE() {
            return getToken(HplsqlParser.T_ELSE, 0);
        }

        public Expr_case_simpleContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr_case_simple;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterExpr_case_simple(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitExpr_case_simple(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitExpr_case_simple(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Expr_case_searchedContext extends ParserRuleContext {
        public TerminalNode T_CASE() {
            return getToken(HplsqlParser.T_CASE, 0);
        }

        public TerminalNode T_END() {
            return getToken(HplsqlParser.T_END, 0);
        }

        public List<TerminalNode> T_WHEN() {
            return getTokens(HplsqlParser.T_WHEN);
        }

        public TerminalNode T_WHEN(int i) {
            return getToken(HplsqlParser.T_WHEN, i);
        }

        public List<Bool_exprContext> bool_expr() {
            return getRuleContexts(Bool_exprContext.class);
        }

        public Bool_exprContext bool_expr(int i) {
            return getRuleContext(Bool_exprContext.class, i);
        }

        public List<TerminalNode> T_THEN() {
            return getTokens(HplsqlParser.T_THEN);
        }

        public TerminalNode T_THEN(int i) {
            return getToken(HplsqlParser.T_THEN, i);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode T_ELSE() {
            return getToken(HplsqlParser.T_ELSE, 0);
        }

        public Expr_case_searchedContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr_case_searched;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterExpr_case_searched(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitExpr_case_searched(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitExpr_case_searched(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Expr_cursor_attributeContext extends ParserRuleContext {
        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public TerminalNode T_ISOPEN() {
            return getToken(HplsqlParser.T_ISOPEN, 0);
        }

        public TerminalNode T_FOUND() {
            return getToken(HplsqlParser.T_FOUND, 0);
        }

        public TerminalNode T_NOTFOUND() {
            return getToken(HplsqlParser.T_NOTFOUND, 0);
        }

        public Expr_cursor_attributeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr_cursor_attribute;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterExpr_cursor_attribute(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitExpr_cursor_attribute(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitExpr_cursor_attribute(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Expr_agg_window_funcContext extends ParserRuleContext {
        public TerminalNode T_AVG() {
            return getToken(HplsqlParser.T_AVG, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public Expr_func_all_distinctContext expr_func_all_distinct() {
            return getRuleContext(Expr_func_all_distinctContext.class, 0);
        }

        public Expr_func_over_clauseContext expr_func_over_clause() {
            return getRuleContext(Expr_func_over_clauseContext.class, 0);
        }

        public TerminalNode T_COUNT() {
            return getToken(HplsqlParser.T_COUNT, 0);
        }

        public TerminalNode T_MUL() {
            return getToken(HplsqlParser.T_MUL, 0);
        }

        public TerminalNode T_COUNT_BIG() {
            return getToken(HplsqlParser.T_COUNT_BIG, 0);
        }

        public TerminalNode T_CUME_DIST() {
            return getToken(HplsqlParser.T_CUME_DIST, 0);
        }

        public TerminalNode T_DENSE_RANK() {
            return getToken(HplsqlParser.T_DENSE_RANK, 0);
        }

        public TerminalNode T_FIRST_VALUE() {
            return getToken(HplsqlParser.T_FIRST_VALUE, 0);
        }

        public TerminalNode T_LAG() {
            return getToken(HplsqlParser.T_LAG, 0);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public TerminalNode T_LAST_VALUE() {
            return getToken(HplsqlParser.T_LAST_VALUE, 0);
        }

        public TerminalNode T_LEAD() {
            return getToken(HplsqlParser.T_LEAD, 0);
        }

        public TerminalNode T_MAX() {
            return getToken(HplsqlParser.T_MAX, 0);
        }

        public TerminalNode T_MIN() {
            return getToken(HplsqlParser.T_MIN, 0);
        }

        public TerminalNode T_RANK() {
            return getToken(HplsqlParser.T_RANK, 0);
        }

        public TerminalNode T_ROW_NUMBER() {
            return getToken(HplsqlParser.T_ROW_NUMBER, 0);
        }

        public TerminalNode T_STDEV() {
            return getToken(HplsqlParser.T_STDEV, 0);
        }

        public TerminalNode T_SUM() {
            return getToken(HplsqlParser.T_SUM, 0);
        }

        public TerminalNode T_VAR() {
            return getToken(HplsqlParser.T_VAR, 0);
        }

        public TerminalNode T_VARIANCE() {
            return getToken(HplsqlParser.T_VARIANCE, 0);
        }

        public Expr_agg_window_funcContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr_agg_window_func;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterExpr_agg_window_func(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitExpr_agg_window_func(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitExpr_agg_window_func(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StringContext extends ParserRuleContext {
        public StringContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_string;
        }

        public StringContext() {
        }

        public void copyFrom(StringContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class Expr_func_all_distinctContext extends ParserRuleContext {
        public TerminalNode T_ALL() {
            return getToken(HplsqlParser.T_ALL, 0);
        }

        public TerminalNode T_DISTINCT() {
            return getToken(HplsqlParser.T_DISTINCT, 0);
        }

        public Expr_func_all_distinctContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr_func_all_distinct;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterExpr_func_all_distinct(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitExpr_func_all_distinct(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitExpr_func_all_distinct(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Expr_func_over_clauseContext extends ParserRuleContext {
        public TerminalNode T_OVER() {
            return getToken(HplsqlParser.T_OVER, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public Expr_func_partition_by_clauseContext expr_func_partition_by_clause() {
            return getRuleContext(Expr_func_partition_by_clauseContext.class, 0);
        }

        public Order_by_clauseContext order_by_clause() {
            return getRuleContext(Order_by_clauseContext.class, 0);
        }

        public Expr_func_over_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr_func_over_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterExpr_func_over_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitExpr_func_over_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitExpr_func_over_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Expr_func_partition_by_clauseContext extends ParserRuleContext {
        public TerminalNode T_PARTITION() {
            return getToken(HplsqlParser.T_PARTITION, 0);
        }

        public TerminalNode T_BY() {
            return getToken(HplsqlParser.T_BY, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public Expr_func_partition_by_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr_func_partition_by_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener)
                ((HplsqlListener) listener).enterExpr_func_partition_by_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitExpr_func_partition_by_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitExpr_func_partition_by_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Expr_spec_funcContext extends ParserRuleContext {
        public TerminalNode T_ACTIVITY_COUNT() {
            return getToken(HplsqlParser.T_ACTIVITY_COUNT, 0);
        }

        public TerminalNode T_CAST() {
            return getToken(HplsqlParser.T_CAST, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode T_AS() {
            return getToken(HplsqlParser.T_AS, 0);
        }

        public DtypeContext dtype() {
            return getRuleContext(DtypeContext.class, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public Dtype_lenContext dtype_len() {
            return getRuleContext(Dtype_lenContext.class, 0);
        }

        public TerminalNode T_COUNT() {
            return getToken(HplsqlParser.T_COUNT, 0);
        }

        public TerminalNode T_MUL() {
            return getToken(HplsqlParser.T_MUL, 0);
        }

        public TerminalNode T_CURRENT_DATE() {
            return getToken(HplsqlParser.T_CURRENT_DATE, 0);
        }

        public TerminalNode T_CURRENT() {
            return getToken(HplsqlParser.T_CURRENT, 0);
        }

        public TerminalNode T_DATE() {
            return getToken(HplsqlParser.T_DATE, 0);
        }

        public TerminalNode T_CURRENT_TIMESTAMP() {
            return getToken(HplsqlParser.T_CURRENT_TIMESTAMP, 0);
        }

        public TerminalNode T_TIMESTAMP() {
            return getToken(HplsqlParser.T_TIMESTAMP, 0);
        }

        public TerminalNode T_CURRENT_USER() {
            return getToken(HplsqlParser.T_CURRENT_USER, 0);
        }

        public TerminalNode T_USER() {
            return getToken(HplsqlParser.T_USER, 0);
        }

        public TerminalNode T_MAX_PART_STRING() {
            return getToken(HplsqlParser.T_MAX_PART_STRING, 0);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public List<TerminalNode> T_EQUAL() {
            return getTokens(HplsqlParser.T_EQUAL);
        }

        public TerminalNode T_EQUAL(int i) {
            return getToken(HplsqlParser.T_EQUAL, i);
        }

        public TerminalNode T_MIN_PART_STRING() {
            return getToken(HplsqlParser.T_MIN_PART_STRING, 0);
        }

        public TerminalNode T_MAX_PART_INT() {
            return getToken(HplsqlParser.T_MAX_PART_INT, 0);
        }

        public TerminalNode T_MIN_PART_INT() {
            return getToken(HplsqlParser.T_MIN_PART_INT, 0);
        }

        public TerminalNode T_MAX_PART_DATE() {
            return getToken(HplsqlParser.T_MAX_PART_DATE, 0);
        }

        public TerminalNode T_MIN_PART_DATE() {
            return getToken(HplsqlParser.T_MIN_PART_DATE, 0);
        }

        public TerminalNode T_PART_COUNT() {
            return getToken(HplsqlParser.T_PART_COUNT, 0);
        }

        public TerminalNode T_PART_LOC() {
            return getToken(HplsqlParser.T_PART_LOC, 0);
        }

        public TerminalNode T_TRIM() {
            return getToken(HplsqlParser.T_TRIM, 0);
        }

        public TerminalNode T_SUBSTRING() {
            return getToken(HplsqlParser.T_SUBSTRING, 0);
        }

        public TerminalNode T_FROM() {
            return getToken(HplsqlParser.T_FROM, 0);
        }

        public TerminalNode T_FOR() {
            return getToken(HplsqlParser.T_FOR, 0);
        }

        public TerminalNode T_SYSDATE() {
            return getToken(HplsqlParser.T_SYSDATE, 0);
        }

        public Expr_spec_funcContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr_spec_func;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterExpr_spec_func(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitExpr_spec_func(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitExpr_spec_func(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Expr_funcContext extends ParserRuleContext {
        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public TerminalNode T_OPEN_P() {
            return getToken(HplsqlParser.T_OPEN_P, 0);
        }

        public TerminalNode T_CLOSE_P() {
            return getToken(HplsqlParser.T_CLOSE_P, 0);
        }

        public Expr_func_paramsContext expr_func_params() {
            return getRuleContext(Expr_func_paramsContext.class, 0);
        }

        public Expr_funcContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr_func;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterExpr_func(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitExpr_func(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitExpr_func(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Expr_func_paramsContext extends ParserRuleContext {
        public List<Func_paramContext> func_param() {
            return getRuleContexts(Func_paramContext.class);
        }

        public Func_paramContext func_param(int i) {
            return getRuleContext(Func_paramContext.class, i);
        }

        public List<TerminalNode> T_COMMA() {
            return getTokens(HplsqlParser.T_COMMA);
        }

        public TerminalNode T_COMMA(int i) {
            return getToken(HplsqlParser.T_COMMA, i);
        }

        public Expr_func_paramsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr_func_params;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterExpr_func_params(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitExpr_func_params(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitExpr_func_params(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Func_paramContext extends ParserRuleContext {
        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public IdentContext ident() {
            return getRuleContext(IdentContext.class, 0);
        }

        public TerminalNode T_EQUAL() {
            return getToken(HplsqlParser.T_EQUAL, 0);
        }

        public TerminalNode T_GREATER() {
            return getToken(HplsqlParser.T_GREATER, 0);
        }

        public Func_paramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_func_param;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterFunc_param(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitFunc_param(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitFunc_param(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Date_literalContext extends ParserRuleContext {
        public TerminalNode T_DATE() {
            return getToken(HplsqlParser.T_DATE, 0);
        }

        public StringContext string() {
            return getRuleContext(StringContext.class, 0);
        }

        public Date_literalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_date_literal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterDate_literal(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitDate_literal(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitDate_literal(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Timestamp_literalContext extends ParserRuleContext {
        public TerminalNode T_TIMESTAMP() {
            return getToken(HplsqlParser.T_TIMESTAMP, 0);
        }

        public StringContext string() {
            return getRuleContext(StringContext.class, 0);
        }

        public Timestamp_literalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_timestamp_literal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterTimestamp_literal(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitTimestamp_literal(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitTimestamp_literal(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdentContext extends ParserRuleContext {
        public List<TerminalNode> L_ID() {
            return getTokens(HplsqlParser.L_ID);
        }

        public TerminalNode L_ID(int i) {
            return getToken(HplsqlParser.L_ID, i);
        }

        public List<Non_reserved_wordsContext> non_reserved_words() {
            return getRuleContexts(Non_reserved_wordsContext.class);
        }

        public Non_reserved_wordsContext non_reserved_words(int i) {
            return getRuleContext(Non_reserved_wordsContext.class, i);
        }

        public IdentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ident;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterIdent(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitIdent(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitIdent(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Double_quotedStringContext extends StringContext {
        public TerminalNode L_D_STRING() {
            return getToken(HplsqlParser.L_D_STRING, 0);
        }

        public Double_quotedStringContext(StringContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterDouble_quotedString(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitDouble_quotedString(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitDouble_quotedString(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Single_quotedStringContext extends StringContext {
        public TerminalNode L_S_STRING() {
            return getToken(HplsqlParser.L_S_STRING, 0);
        }

        public Single_quotedStringContext(StringContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterSingle_quotedString(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitSingle_quotedString(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitSingle_quotedString(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Int_numberContext extends ParserRuleContext {
        public TerminalNode L_INT() {
            return getToken(HplsqlParser.L_INT, 0);
        }

        public TerminalNode T_SUB() {
            return getToken(HplsqlParser.T_SUB, 0);
        }

        public TerminalNode T_ADD() {
            return getToken(HplsqlParser.T_ADD, 0);
        }

        public Int_numberContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_int_number;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterInt_number(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitInt_number(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitInt_number(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Dec_numberContext extends ParserRuleContext {
        public TerminalNode L_DEC() {
            return getToken(HplsqlParser.L_DEC, 0);
        }

        public TerminalNode T_SUB() {
            return getToken(HplsqlParser.T_SUB, 0);
        }

        public TerminalNode T_ADD() {
            return getToken(HplsqlParser.T_ADD, 0);
        }

        public Dec_numberContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dec_number;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterDec_number(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitDec_number(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitDec_number(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Bool_literalContext extends ParserRuleContext {
        public TerminalNode T_TRUE() {
            return getToken(HplsqlParser.T_TRUE, 0);
        }

        public TerminalNode T_FALSE() {
            return getToken(HplsqlParser.T_FALSE, 0);
        }

        public Bool_literalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_bool_literal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterBool_literal(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitBool_literal(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitBool_literal(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Null_constContext extends ParserRuleContext {
        public TerminalNode T_NULL() {
            return getToken(HplsqlParser.T_NULL, 0);
        }

        public Null_constContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_null_const;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterNull_const(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitNull_const(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitNull_const(this);
            else return visitor.visitChildren(this);
        }
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

    public static class New_lineContext extends ParserRuleContext {
        public New_lineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_new_line;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterNew_line(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitNew_line(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitNew_line(this);
            else return visitor.visitChildren(this);
        }
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

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HplsqlVisitor)
                return ((HplsqlVisitor<? extends T>) visitor).visitNon_reserved_words(this);
            else return visitor.visitChildren(this);
		}
	}
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