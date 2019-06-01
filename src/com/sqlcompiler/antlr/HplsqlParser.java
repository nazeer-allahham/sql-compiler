// Generated from E:/ite-fourth-year/compilers-1/projects/sql-compiler/src/com/sqlcompiler/antlr\Hplsql.g4 by ANTLR 4.7.2
package com.sqlcompiler.antlr;
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
			T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T_ACTION = 5, T_ALL = 6, T_ALTER = 7, T_AND = 8,
			T_AS = 9, T_ASC = 10, T_ASSOCIATE = 11, T_AT = 12, T_AUTO_INCREMENT = 13, T_AVG = 14,
			T_BEGIN = 15, T_BETWEEN = 16, T_BIGINT = 17, T_BINARY_DOUBLE = 18, T_BINARY_FLOAT = 19,
			T_BINARY_INTEGER = 20, T_BIT = 21, T_BODY = 22, T_BREAK = 23, T_BY = 24, T_BYTE = 25,
			T_CALL = 26, T_CASCADE = 27, T_CASE = 28, T_CASESPECIFIC = 29, T_CAST = 30, T_CHAR = 31,
			T_CHARACTER = 32, T_CHARSET = 33, T_CLOSE = 34, T_CLUSTERED = 35, T_CMP = 36, T_COLLECT = 37,
			T_COLLECTION = 38, T_COMMENT = 39, T_CONSTANT = 40, T_COMMIT = 41, T_COMPRESS = 42,
			T_CONCAT = 43, T_CONDITION = 44, T_CONSTRAINT = 45, T_CONTINUE = 46, T_COUNT = 47,
			T_COUNT_BIG = 48, T_CREATE = 49, T_CREATION = 50, T_CREATOR = 51, T_CS = 52, T_CURRENT = 53,
			T_DATABASE = 54, T_DATA = 55, T_DATE = 56, T_DATETIME = 57, T_DAY = 58, T_DAYS = 59,
			T_DEC = 60, T_DECIMAL = 61, T_DECLARE = 62, T_DEFAULT = 63, T_DEFERRED = 64, T_DEFINED = 65,
			T_DEFINER = 66, T_DEFINITION = 67, T_DELETE = 68, T_DELIMITED = 69, T_DESC = 70,
			T_DIR = 71, T_DIRECTORY = 72, T_DISTINCT = 73, T_DISTRIBUTE = 74, T_DO = 75, T_DOUBLE = 76,
			T_DROP = 77, T_DYNAMIC = 78, T_ELSE = 79, T_ELSEIF = 80, T_ELSIF = 81, T_ENABLE = 82,
			T_END = 83, T_ENGINE = 84, T_ESCAPED = 85, T_EXCEPT = 86, T_EXEC = 87, T_EXECUTE = 88,
			T_EXCEPTION = 89, T_EXCLUSIVE = 90, T_EXISTS = 91, T_EXIT = 92, T_FALLBACK = 93,
			T_FALSE = 94, T_FIELDS = 95, T_FLOAT = 96, T_FOR = 97, T_FOREIGN = 98, T_FORMAT = 99,
			T_FOUND = 100, T_FROM = 101, T_FULL = 102, T_FUNCTION = 103, T_GET = 104, T_GLOBAL = 105,
			T_GO = 106, T_GROUP = 107, T_HANDLER = 108, T_HASH = 109, T_HAVING = 110, T_HDFS = 111,
			T_IDENTITY = 112, T_IF = 113, T_IMMEDIATE = 114, T_IN = 115, T_INDEX = 116, T_INITRANS = 117,
			T_INNER = 118, T_INOUT = 119, T_INSERT = 120, T_INT = 121, T_INT2 = 122, T_INT4 = 123,
			T_INT8 = 124, T_INTEGER = 125, T_INTERSECT = 126, T_INTERVAL = 127, T_INTO = 128,
			T_INVOKER = 129, T_IS = 130, T_ISOPEN = 131, T_ITEMS = 132, T_JOIN = 133, T_KEEP = 134,
			T_KEY = 135, T_KEYS = 136, T_LANGUAGE = 137, T_LEAVE = 138, T_LEFT = 139, T_LIKE = 140,
			T_LIMIT = 141, T_LINES = 142, T_LOCAL = 143, T_LOCATION = 144, T_LOCATOR = 145,
			T_LOCATORS = 146, T_LOCKS = 147, T_LOG = 148, T_LOGGED = 149, T_LOGGING = 150, T_LOOP = 151,
			T_MAP = 152, T_MAX = 153, T_MAXTRANS = 154, T_MERGE = 155, T_MICROSECOND = 156,
			T_MICROSECONDS = 157, T_MIN = 158, T_MULTISET = 159, T_NCHAR = 160, T_NVARCHAR = 161,
			T_NO = 162, T_NOCOMPRESS = 163, T_NOLOGGING = 164, T_NOT = 165, T_NOTFOUND = 166,
			T_NULL = 167, T_NUMERIC = 168, T_NUMBER = 169, T_ON = 170, T_ONLY = 171, T_OPEN = 172,
			T_OR = 173, T_ORDER = 174, T_OUT = 175, T_OUTER = 176, T_OVER = 177, T_OWNER = 178,
			T_PACKAGE = 179, T_PARTITION = 180, T_PCTFREE = 181, T_PCTUSED = 182, T_PLS_INTEGER = 183,
			T_PRECISION = 184, T_PRESERVE = 185, T_PRIMARY = 186, T_PROC = 187, T_PROCEDURE = 188,
			T_QUALIFY = 189, T_QUIT = 190, T_REAL = 191, T_REFERENCES = 192, T_REGEXP = 193,
			T_REPLACE = 194, T_RESTRICT = 195, T_RESULT = 196, T_RESULT_SET_LOCATOR = 197,
			T_RETURN = 198, T_RETURNS = 199, T_REVERSE = 200, T_RIGHT = 201, T_RLIKE = 202,
			T_ROW = 203, T_ROWS = 204, T_ROW_COUNT = 205, T_RR = 206, T_RS = 207, T_TRIM = 208,
			T_SCHEMA = 209, T_SECOND = 210, T_SECONDS = 211, T_SECURITY = 212, T_SEGMENT = 213,
			T_SEL = 214, T_SELECT = 215, T_SET = 216, T_SETS = 217, T_SHARE = 218, T_SIMPLE_DOUBLE = 219,
			T_SIMPLE_FLOAT = 220, T_SIMPLE_INTEGER = 221, T_SMALLDATETIME = 222, T_SMALLINT = 223,
			T_SQL = 224, T_SQLEXCEPTION = 225, T_SQLWARNING = 226, T_STEP = 227, T_STORAGE = 228,
			T_STORED = 229, T_STRING = 230, T_SUBSTRING = 231, T_SUM = 232, T_SYS_REFCURSOR = 233,
			T_TABLE = 234, T_TABLESPACE = 235, T_TEMPORARY = 236, T_TERMINATED = 237, T_TEXTIMAGE_ON = 238,
			T_THEN = 239, T_TIMESTAMP = 240, T_TINYINT = 241, T_TITLE = 242, T_TO = 243, T_TOP = 244,
			T_TRUE = 245, T_TYPE = 246, T_UNION = 247, T_UNIQUE = 248, T_UPDATE = 249, T_UR = 250,
			T_USE = 251, T_USING = 252, T_VALUE = 253, T_VALUES = 254, T_VAR = 255, T_VARCHAR = 256,
			T_VARCHAR2 = 257, T_VARYING = 258, T_VOLATILE = 259, T_WHEN = 260, T_WHERE = 261,
			T_WHILE = 262, T_WITH = 263, T_WORK = 264, T_XML = 265, T_YES = 266, T_ACTIVITY_COUNT = 267,
			T_CUME_DIST = 268, T_CURRENT_DATE = 269, T_CURRENT_TIMESTAMP = 270, T_CURRENT_USER = 271,
			T_DENSE_RANK = 272, T_FIRST_VALUE = 273, T_LAG = 274, T_LAST_VALUE = 275, T_LEAD = 276,
			T_MAX_PART_STRING = 277, T_MIN_PART_STRING = 278, T_MAX_PART_INT = 279, T_MIN_PART_INT = 280,
			T_MAX_PART_DATE = 281, T_MIN_PART_DATE = 282, T_PART_COUNT = 283, T_PART_LOC = 284,
			T_RANK = 285, T_ROW_NUMBER = 286, T_STDEV = 287, T_SYSDATE = 288, T_VARIANCE = 289,
			T_USER = 290, T_WRITE = 291, T_TYPEOF = 292, T_QUERY = 293, T_QUERY_RESULT = 294,
			T_EXECUTE_QUERY = 295, T_ADD = 296, T_COLON = 297, T_COMMA = 298, T_PIPE = 299,
			T_DIV = 300, T_DOT2 = 301, T_EQUAL = 302, T_EQUAL2 = 303, T_NOTEQUAL = 304, T_NOTEQUAL2 = 305,
			T_GREATER = 306, T_GREATEREQUAL = 307, T_LESS = 308, T_LESSEQUAL = 309, T_MUL = 310,
			T_OPEN_B = 311, T_OPEN_P = 312, T_OPEN_SB = 313, T_CLOSE_B = 314, T_CLOSE_P = 315,
			T_CLOSE_SB = 316, T_SEMICOLON = 317, T_SUB = 318, L_ID = 319, L_S_STRING = 320,
			L_D_STRING = 321, L_INT = 322, L_DEC = 323, L_WS = 324, L_M_COMMENT = 325, L_S_COMMENT = 326,
			L_FILE = 327, L_LABEL = 328;
	public static final int
			RULE_program = 0, RULE_block = 1, RULE_begin_end_block = 2, RULE_single_block_stmt = 3,
			RULE_block_end = 4, RULE_proc_block = 5, RULE_stmt = 6, RULE_typeof = 7,
			RULE_error_stmt = 8, RULE_invalid_select = 9, RULE_invalid_where_clause = 10,
			RULE_invalid_from_clause = 11, RULE_invalid_bool_expr = 12, RULE_invalid_bool_expr_atom = 13,
			RULE_invalid_bool_expr_binary = 14, RULE_invalid_bool_expr_binary_operator = 15,
			RULE_invalid_cpp_function_stmt = 16, RULE_invalid_cpp_function_header = 17,
			RULE_invalid_cpp_function_params_clause = 18, RULE_invalid_cpp_function_param = 19,
			RULE_exception_block = 20, RULE_exception_block_item = 21, RULE_semicolon_stmt = 22,
			RULE_null_stmt = 23, RULE_expr_stmt = 24, RULE_assignment_stmt = 25, RULE_assignment_stmt_item = 26,
			RULE_assignment_stmt_single_item = 27, RULE_assignment_stmt_multiple_item = 28,
			RULE_assignment_stmt_select_item = 29, RULE_assignment_query_stmt = 30,
			RULE_associate_locator_stmt = 31, RULE_break_stmt = 32, RULE_call_stmt = 33,
			RULE_close_stmt = 34, RULE_declare_stmt = 35, RULE_declare_block = 36,
			RULE_declare_block_inplace = 37, RULE_declare_stmt_item = 38, RULE_declare_var_item = 39,
			RULE_declare_condition_item = 40, RULE_declare_handler_item = 41, RULE_create_type_stmt = 42,
			RULE_create_type_definition = 43, RULE_create_type_items = 44, RULE_create_type_items_item = 45,
			RULE_create_type_options = 46, RULE_create_type_option = 47, RULE_create_type_store_location = 48,
			RULE_create_type_delimiter = 49, RULE_declare_temporary_table_item = 50,
			RULE_create_table_stmt = 51, RULE_create_local_temp_table_stmt = 52, RULE_create_table_definition = 53,
			RULE_create_table_columns = 54, RULE_create_table_columns_item = 55, RULE_column_name = 56,
			RULE_create_table_column_inline_cons = 57, RULE_create_table_column_cons = 58,
			RULE_create_table_fk_action = 59, RULE_create_table_preoptions = 60, RULE_create_table_preoptions_item = 61,
			RULE_create_table_preoptions_td_item = 62, RULE_create_table_options = 63,
			RULE_create_table_options_item = 64, RULE_create_table_options_ora_item = 65,
			RULE_create_table_options_db2_item = 66, RULE_create_table_options_td_item = 67,
			RULE_create_table_options_hive_item = 68, RULE_create_table_store_location = 69,
			RULE_create_table_delimiter = 70, RULE_create_table_hive_row_format = 71,
			RULE_create_table_hive_row_format_fields = 72, RULE_create_table_options_mssql_item = 73,
			RULE_create_table_options_mysql_item = 74, RULE_dtype = 75, RULE_dtype_len = 76,
			RULE_dtype_attr = 77, RULE_dtype_default = 78, RULE_create_database_stmt = 79,
			RULE_create_database_option = 80, RULE_create_function_stmt = 81, RULE_create_function_return = 82,
			RULE_create_package_stmt = 83, RULE_package_spec = 84, RULE_package_spec_item = 85,
			RULE_create_package_body_stmt = 86, RULE_package_body = 87, RULE_package_body_item = 88,
			RULE_create_procedure_stmt = 89, RULE_create_routine_params = 90, RULE_create_routine_param_item = 91,
			RULE_create_routine_options = 92, RULE_create_routine_option = 93, RULE_exec_stmt = 94,
			RULE_if_stmt = 95, RULE_if_plsql_stmt = 96, RULE_if_tsql_stmt = 97, RULE_if_bteq_stmt = 98,
			RULE_elseif_block = 99, RULE_else_block = 100, RULE_exit_stmt = 101, RULE_leave_stmt = 102,
			RULE_cmp_stmt = 103, RULE_cmp_source = 104, RULE_create_index_stmt = 105,
			RULE_create_index_col = 106, RULE_index_storage_clause = 107, RULE_index_mssql_storage_clause = 108,
			RULE_quit_stmt = 109, RULE_return_stmt = 110, RULE_cpp_stmt = 111, RULE_cpp_function_stmt = 112,
			RULE_cpp_function_header = 113, RULE_cpp_function_params_clause = 114,
			RULE_cpp_function_param = 115, RULE_cpp_function_body = 116, RULE_cpp_if_stmt = 117,
			RULE_cpp_elseif_clause = 118, RULE_cpp_else_clause = 119, RULE_cpp_for_stmt = 120,
			RULE_cpp_for_stmt_header = 121, RULE_cpp_for_params_clause = 122, RULE_cpp_for_param = 123,
			RULE_cpp_for_stmt_var_incr_caluse = 124, RULE_cpp_for_stmt_var_incr = 125,
			RULE_cpp_for_stmt_body = 126, RULE_cpp_declare_assignment_stmt = 127,
			RULE_cpp_declare_stmt = 128, RULE_cpp_assignment_stmt = 129, RULE_cpp_return_stmt = 130,
			RULE_cpp_scope = 131, RULE_execute_query_stmt = 132, RULE_while_stmt = 133,
			RULE_for_range_stmt = 134, RULE_label = 135, RULE_using_clause = 136,
			RULE_select_stmt = 137, RULE_fullselect_stmt = 138, RULE_fullselect_stmt_item = 139,
			RULE_fullselect_set_clause = 140, RULE_subselect_stmt = 141, RULE_select_list = 142,
			RULE_select_list_set = 143, RULE_select_list_limit = 144, RULE_select_list_item = 145,
			RULE_select_list_alias = 146, RULE_select_list_asterisk = 147, RULE_into_clause = 148,
			RULE_from_clause = 149, RULE_from_table_clause = 150, RULE_from_table_name_clause = 151,
			RULE_from_subselect_clause = 152, RULE_from_join_clause = 153, RULE_from_join_type_clause = 154,
			RULE_from_table_values_clause = 155, RULE_from_table_values_row = 156,
			RULE_from_alias_clause = 157, RULE_table_name = 158, RULE_where_clause = 159,
			RULE_group_by_clause = 160, RULE_having_clause = 161, RULE_qualify_clause = 162,
			RULE_order_by_clause = 163, RULE_select_options = 164, RULE_select_options_item = 165,
			RULE_bool_expr = 166, RULE_bool_expr_atom = 167, RULE_bool_expr_unary = 168,
			RULE_bool_expr_is_not_null = 169, RULE_bool_expr_between = 170, RULE_bool_expr_exists = 171,
			RULE_bool_expr_single_in = 172, RULE_bool_expr_multi_in = 173, RULE_bool_expr_binary = 174,
			RULE_bool_expr_logical_operator = 175, RULE_bool_expr_binary_operator = 176,
			RULE_expr = 177, RULE_expr_atom = 178, RULE_expr_interval = 179, RULE_interval_item = 180,
			RULE_expr_concat = 181, RULE_expr_concat_item = 182, RULE_expr_case = 183,
			RULE_expr_case_simple = 184, RULE_expr_case_searched = 185, RULE_expr_cursor_attribute = 186,
			RULE_expr_agg_window_func = 187, RULE_expr_func_all_distinct = 188, RULE_expr_func_over_clause = 189,
			RULE_expr_func_partition_by_clause = 190, RULE_expr_spec_func = 191, RULE_expr_func = 192,
			RULE_expr_func_params = 193, RULE_func_param = 194, RULE_write_stmt = 195,
			RULE_write_stmt_string = 196, RULE_date_literal = 197, RULE_timestamp_literal = 198,
			RULE_parenthesis_open = 199, RULE_parenthesis_close = 200, RULE_ident = 201,
			RULE_string = 202, RULE_int_number = 203, RULE_dec_number = 204, RULE_bool_literal = 205,
			RULE_null_const = 206, RULE_non_reserved_words = 207;
	public static final String[] ruleNames = makeRuleNames();
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u014a\u0bc2\4\2\t" +
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
					"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb" +
					"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf" +
					"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4" +
					"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8" +
					"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd" +
					"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1" +
					"\3\2\3\2\3\2\3\3\3\3\5\3\u01a8\n\3\3\3\5\3\u01ab\n\3\6\3\u01ad\n\3\r\3" +
					"\16\3\u01ae\3\4\5\4\u01b2\n\4\3\4\3\4\3\4\5\4\u01b7\n\4\3\4\3\4\3\5\3" +
					"\5\3\5\5\5\u01be\n\5\3\5\3\5\3\5\3\5\5\5\u01c4\n\5\5\5\u01c6\n\5\3\6\3" +
					"\6\3\6\3\7\3\7\6\7\u01cd\n\7\r\7\16\7\u01ce\3\7\5\7\u01d2\n\7\5\7\u01d4" +
					"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3" +
					"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b" +
					"\u01f7\n\b\3\t\3\t\3\t\3\t\5\t\u01fd\n\t\3\t\3\t\3\n\3\n\3\n\5\n\u0204" +
					"\n\n\3\13\3\13\3\13\5\13\u0209\n\13\3\13\3\13\5\13\u020d\n\13\3\13\3\13" +
					"\5\13\u0211\n\13\3\13\5\13\u0214\n\13\3\13\3\13\5\13\u0218\n\13\3\13\5" +
					"\13\u021b\n\13\3\13\5\13\u021e\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u0225\n\f" +
					"\3\r\3\r\7\r\u0229\n\r\f\r\16\r\u022c\13\r\3\r\3\r\3\16\5\16\u0231\n\16" +
					"\3\16\3\16\3\16\3\16\3\16\5\16\u0238\n\16\3\16\3\16\3\16\3\16\3\16\5\16" +
					"\u023f\n\16\3\16\3\16\3\16\6\16\u0244\n\16\r\16\16\16\u0245\3\16\3\16" +
					"\3\16\5\16\u024b\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22" +
					"\3\22\3\23\3\23\3\23\3\23\5\23\u025c\n\23\3\23\3\23\3\23\3\23\3\23\3\23" +
					"\3\23\5\23\u0265\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23" +
					"\3\23\3\23\3\23\5\23\u0274\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23" +
					"\5\23\u027e\n\23\3\23\3\23\5\23\u0282\n\23\3\24\3\24\5\24\u0286\n\24\3" +
					"\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u028f\n\24\7\24\u0291\n\24\f\24" +
					"\16\24\u0294\13\24\3\24\3\24\3\24\7\24\u0299\n\24\f\24\16\24\u029c\13" +
					"\24\3\24\3\24\6\24\u02a0\n\24\r\24\16\24\u02a1\3\24\3\24\7\24\u02a6\n" +
					"\24\f\24\16\24\u02a9\13\24\5\24\u02ab\n\24\3\25\3\25\3\25\3\26\3\26\6" +
					"\26\u02b2\n\26\r\26\16\26\u02b3\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30" +
					"\3\31\3\31\3\32\3\32\3\32\3\33\5\33\u02c4\n\33\3\33\3\33\3\33\7\33\u02c9" +
					"\n\33\f\33\16\33\u02cc\13\33\3\34\3\34\3\34\3\34\5\34\u02d2\n\34\3\35" +
					"\3\35\5\35\u02d6\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u02df\n" +
					"\35\3\35\3\35\3\35\5\35\u02e4\n\35\3\36\3\36\3\36\3\36\7\36\u02ea\n\36" +
					"\f\36\16\36\u02ed\13\36\3\36\3\36\5\36\u02f1\n\36\3\36\3\36\3\36\3\36" +
					"\3\36\7\36\u02f8\n\36\f\36\16\36\u02fb\13\36\3\36\3\36\3\37\3\37\3\37" +
					"\3\37\3\37\7\37\u0304\n\37\f\37\16\37\u0307\13\37\3\37\3\37\5\37\u030b" +
					"\n\37\3\37\5\37\u030e\n\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3!\5!" +
					"\u031a\n!\3!\3!\3!\3!\3!\7!\u0321\n!\f!\16!\u0324\13!\3!\3!\3!\3!\3!\3" +
					"\"\3\"\3#\3#\3#\3#\5#\u0331\n#\3#\3#\5#\u0335\n#\3$\3$\3$\3%\3%\3%\3%" +
					"\7%\u033e\n%\f%\16%\u0341\13%\3&\3&\3&\3&\3&\3&\7&\u0349\n&\f&\16&\u034c" +
					"\13&\3\'\3\'\3\'\3\'\3\'\7\'\u0353\n\'\f\'\16\'\u0356\13\'\3(\3(\3(\3" +
					"(\5(\u035c\n(\3)\3)\3)\7)\u0361\n)\f)\16)\u0364\13)\3)\5)\u0367\n)\3)" +
					"\3)\5)\u036b\n)\3)\7)\u036e\n)\f)\16)\u0371\13)\3)\5)\u0374\n)\3)\3)\3" +
					")\5)\u0379\n)\3)\3)\5)\u037d\n)\3)\3)\5)\u0381\n)\3*\3*\3*\3+\3+\3+\3" +
					"+\3+\3+\3+\3+\5+\u038e\n+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3" +
					".\7.\u039f\n.\f.\16.\u03a2\13.\3/\3/\3/\3/\5/\u03a8\n/\3\60\7\60\u03ab" +
					"\n\60\f\60\16\60\u03ae\13\60\3\61\3\61\5\61\u03b2\n\61\3\62\3\62\3\62" +
					"\3\62\7\62\u03b8\n\62\f\62\16\62\u03bb\13\62\3\63\3\63\3\63\3\63\3\64" +
					"\5\64\u03c2\n\64\3\64\3\64\3\64\3\64\5\64\u03c8\n\64\3\64\3\64\3\65\3" +
					"\65\3\65\3\65\3\65\5\65\u03d1\n\65\3\65\3\65\5\65\u03d5\n\65\3\65\3\65" +
					"\3\66\3\66\3\66\3\66\5\66\u03dd\n\66\3\66\5\66\u03e0\n\66\3\66\3\66\3" +
					"\66\5\66\u03e5\n\66\3\66\3\66\3\67\5\67\u03ea\n\67\3\67\3\67\3\67\3\67" +
					"\3\67\5\67\u03f1\n\67\3\67\3\67\3\67\3\67\3\67\5\67\u03f8\n\67\3\67\5" +
					"\67\u03fb\n\67\38\38\38\78\u0400\n8\f8\168\u0403\138\39\39\39\59\u0408" +
					"\n9\39\79\u040b\n9\f9\169\u040e\139\39\79\u0411\n9\f9\169\u0414\139\3" +
					"9\39\59\u0418\n9\39\59\u041b\n9\3:\3:\3;\3;\5;\u0421\n;\3;\3;\3;\3;\3" +
					";\3;\3;\3;\3;\3;\7;\u042d\n;\f;\16;\u0430\13;\3;\3;\3;\3;\3;\7;\u0437" +
					"\n;\f;\16;\u043a\13;\3;\3;\3;\5;\u043f\n;\3<\3<\3<\5<\u0444\n<\3<\3<\3" +
					"<\5<\u0449\n<\3<\3<\3<\5<\u044e\n<\7<\u0450\n<\f<\16<\u0453\13<\3<\3<" +
					"\5<\u0457\n<\3<\5<\u045a\n<\3<\3<\3<\3<\3<\3<\7<\u0462\n<\f<\16<\u0465" +
					"\13<\3<\3<\3<\3<\3<\3<\3<\7<\u046e\n<\f<\16<\u0471\13<\3<\3<\7<\u0475" +
					"\n<\f<\16<\u0478\13<\5<\u047a\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0486" +
					"\n=\3>\6>\u0489\n>\r>\16>\u048a\3?\3?\3?\5?\u0490\n?\3@\5@\u0493\n@\3" +
					"@\3@\3A\6A\u0498\nA\rA\16A\u0499\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5" +
					"B\u04a8\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\6C\u04b5\nC\rC\16C\u04b6\3" +
					"C\3C\3C\5C\u04bc\nC\3D\5D\u04bf\nD\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\7" +
					"D\u04cc\nD\fD\16D\u04cf\13D\3D\3D\3D\5D\u04d4\nD\3D\3D\3D\3D\3D\3D\3D" +
					"\3D\3D\5D\u04df\nD\3E\5E\u04e2\nE\3E\3E\3E\3E\3E\3E\7E\u04ea\nE\fE\16" +
					"E\u04ed\13E\3E\3E\3E\3E\5E\u04f3\nE\3F\3F\3F\3F\5F\u04f9\nF\3G\3G\3G\3" +
					"G\7G\u04ff\nG\fG\16G\u0502\13G\3H\3H\3H\3H\3I\3I\3I\3I\7I\u050c\nI\fI" +
					"\16I\u050f\13I\3J\3J\3J\3J\3J\3J\3J\5J\u0518\nJ\3J\3J\3J\3J\3J\3J\3J\3" +
					"J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u052c\nJ\3K\3K\3K\3K\5K\u0532\nK\3" +
					"L\3L\5L\u0536\nL\3L\3L\3L\5L\u053b\nL\3L\3L\5L\u053f\nL\3L\3L\3L\5L\u0544" +
					"\nL\3L\5L\u0547\nL\3L\3L\3L\5L\u054c\nL\3L\5L\u054f\nL\3M\3M\3M\3M\3M" +
					"\3M\3M\3M\3M\3M\3M\3M\5M\u055d\nM\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M" +
					"\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u057e\nM" +
					"\5M\u0580\nM\3N\3N\3N\5N\u0585\nN\3N\3N\5N\u0589\nN\3N\3N\3O\5O\u058e" +
					"\nO\3O\3O\3O\3O\3O\5O\u0595\nO\3O\5O\u0598\nO\3P\5P\u059b\nP\3P\3P\3P" +
					"\5P\u05a0\nP\3P\3P\5P\u05a4\nP\5P\u05a6\nP\3Q\3Q\3Q\3Q\3Q\5Q\u05ad\nQ" +
					"\3Q\3Q\7Q\u05b1\nQ\fQ\16Q\u05b4\13Q\3R\3R\3R\3R\5R\u05ba\nR\3S\3S\3S\3" +
					"S\5S\u05c0\nS\3S\5S\u05c3\nS\3S\3S\3S\5S\u05c8\nS\3S\3S\5S\u05cc\nS\3" +
					"S\5S\u05cf\nS\3S\3S\3T\3T\3T\5T\u05d6\nT\3U\3U\3U\3U\5U\u05dc\nU\3U\5" +
					"U\u05df\nU\3U\3U\3U\3U\3U\3U\3U\3U\5U\u05e9\nU\3V\3V\3V\3V\3V\7V\u05f0" +
					"\nV\fV\16V\u05f3\13V\3W\3W\3W\3W\5W\u05f9\nW\3W\3W\3W\3W\3W\5W\u0600\n" +
					"W\5W\u0602\nW\3X\3X\3X\3X\5X\u0608\nX\3X\5X\u060b\nX\3X\3X\3X\3X\3X\3" +
					"X\3X\3X\3X\5X\u0616\nX\3Y\3Y\3Y\3Y\3Y\7Y\u061d\nY\fY\16Y\u0620\13Y\3Z" +
					"\3Z\3Z\5Z\u0625\nZ\3[\3[\3[\3[\5[\u062b\n[\3[\5[\u062e\n[\3[\3[\3[\5[" +
					"\u0633\n[\3[\5[\u0636\n[\3[\5[\u0639\n[\3[\5[\u063c\n[\3[\5[\u063f\n[" +
					"\3[\3[\3[\3[\5[\u0645\n[\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u064d\n\\\f\\\16" +
					"\\\u0650\13\\\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u0658\n\\\f\\\16\\\u065b\13" +
					"\\\5\\\u065d\n\\\3]\3]\3]\3]\3]\5]\u0664\n]\3]\3]\3]\5]\u0669\n]\3]\7" +
					"]\u066c\n]\f]\16]\u066f\13]\3]\5]\u0672\n]\3]\3]\3]\3]\3]\3]\5]\u067a" +
					"\n]\3]\3]\5]\u067e\n]\3]\7]\u0681\n]\f]\16]\u0684\13]\3]\5]\u0687\n]\5" +
					"]\u0689\n]\3^\6^\u068c\n^\r^\16^\u068d\3_\3_\3_\3_\3_\3_\5_\u0696\n_\3" +
					"_\3_\3_\5_\u069b\n_\3`\3`\5`\u069f\n`\3`\3`\3`\3`\3`\3`\5`\u06a7\n`\3" +
					"`\3`\3`\3`\7`\u06ad\n`\f`\16`\u06b0\13`\5`\u06b2\n`\3`\5`\u06b5\n`\3a" +
					"\3a\3a\5a\u06ba\na\3b\3b\3b\3b\3b\7b\u06c1\nb\fb\16b\u06c4\13b\3b\5b\u06c7" +
					"\nb\3b\3b\3b\3c\3c\3c\3c\3c\5c\u06d1\nc\3d\3d\3d\3d\3d\3d\3e\3e\3e\3e" +
					"\3e\3f\3f\3f\3g\3g\5g\u06e3\ng\3g\3g\5g\u06e7\ng\3h\3h\5h\u06eb\nh\3i" +
					"\3i\3i\3i\3i\3i\3j\3j\5j\u06f5\nj\3j\3j\3j\3j\5j\u06fb\nj\3j\3j\5j\u06ff" +
					"\nj\3k\3k\5k\u0703\nk\3k\3k\3k\3k\3k\3k\3k\3k\7k\u070d\nk\fk\16k\u0710" +
					"\13k\3k\3k\3l\3l\5l\u0716\nl\3m\3m\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\7n\u0724" +
					"\nn\fn\16n\u0727\13n\3n\3n\7n\u072b\nn\fn\16n\u072e\13n\3o\5o\u0731\n" +
					"o\3o\3o\5o\u0735\no\3p\3p\5p\u0739\np\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\5" +
					"q\u0745\nq\3r\3r\3r\3s\3s\3s\3s\5s\u074e\ns\3s\3s\3t\3t\3t\7t\u0755\n" +
					"t\ft\16t\u0758\13t\3u\3u\3u\3v\3v\3w\3w\3w\3w\3w\3w\7w\u0765\nw\fw\16" +
					"w\u0768\13w\3w\5w\u076b\nw\3x\3x\3x\3x\3x\3x\3y\3y\3y\3z\3z\3z\3{\3{\3" +
					"{\3{\3{\3{\3{\3{\3{\3|\3|\3|\7|\u0785\n|\f|\16|\u0788\13|\3}\5}\u078b" +
					"\n}\3}\3}\3}\3}\3~\3~\3~\7~\u0794\n~\f~\16~\u0797\13~\3\177\3\177\3\177" +
					"\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177" +
					"\7\177\u07a8\n\177\f\177\16\177\u07ab\13\177\3\177\3\177\3\177\3\177\3" +
					"\177\5\177\u07b2\n\177\3\u0080\3\u0080\5\u0080\u07b6\n\u0080\3\u0081\3" +
					"\u0081\5\u0081\u07ba\n\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3" +
					"\u0082\3\u0082\5\u0082\u07c3\n\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3" +
					"\u0083\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085" +
					"\3\u0085\3\u0085\7\u0085\u07d4\n\u0085\f\u0085\16\u0085\u07d7\13\u0085" +
					"\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\5\u0086\u07de\n\u0086\3\u0086" +
					"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087" +
					"\3\u0087\5\u0087\u07eb\n\u0087\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088" +
					"\u07f1\n\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u07f8\n" +
					"\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089" +
					"\3\u0089\3\u0089\3\u0089\5\u0089\u0805\n\u0089\3\u008a\3\u008a\3\u008a" +
					"\3\u008a\7\u008a\u080b\n\u008a\f\u008a\16\u008a\u080e\13\u008a\3\u008b" +
					"\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\7\u008c\u0816\n\u008c\f\u008c" +
					"\16\u008c\u0819\13\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d" +
					"\u0820\n\u008d\3\u008e\3\u008e\5\u008e\u0824\n\u008e\3\u008e\3\u008e\5" +
					"\u008e\u0828\n\u008e\3\u008e\3\u008e\5\u008e\u082c\n\u008e\5\u008e\u082e" +
					"\n\u008e\3\u008f\3\u008f\3\u008f\5\u008f\u0833\n\u008f\3\u008f\5\u008f" +
					"\u0836\n\u008f\3\u008f\5\u008f\u0839\n\u008f\3\u008f\5\u008f\u083c\n\u008f" +
					"\3\u008f\3\u008f\5\u008f\u0840\n\u008f\3\u008f\5\u008f\u0843\n\u008f\3" +
					"\u008f\5\u008f\u0846\n\u008f\3\u0090\5\u0090\u0849\n\u0090\3\u0090\5\u0090" +
					"\u084c\n\u0090\3\u0090\3\u0090\3\u0090\7\u0090\u0851\n\u0090\f\u0090\16" +
					"\u0090\u0854\13\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0093" +
					"\3\u0093\3\u0093\5\u0093\u085e\n\u0093\3\u0093\3\u0093\5\u0093\u0862\n" +
					"\u0093\3\u0093\5\u0093\u0865\n\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3" +
					"\u0094\3\u0094\3\u0094\5\u0094\u086e\n\u0094\3\u0095\3\u0095\5\u0095\u0872" +
					"\n\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\7\u0096\u087a" +
					"\n\u0096\f\u0096\16\u0096\u087d\13\u0096\3\u0097\3\u0097\3\u0097\7\u0097" +
					"\u0882\n\u0097\f\u0097\16\u0097\u0885\13\u0097\3\u0098\3\u0098\3\u0098" +
					"\5\u0098\u088a\n\u0098\3\u0099\3\u0099\5\u0099\u088e\n\u0099\3\u009a\3" +
					"\u009a\3\u009a\3\u009a\5\u009a\u0894\n\u009a\3\u009b\3\u009b\3\u009b\3" +
					"\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u089d\n\u009b\3\u009c\5\u009c\u08a0" +
					"\n\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u08a5\n\u009c\3\u009c\5\u009c" +
					"\u08a8\n\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\7\u009d" +
					"\u08b0\n\u009d\f\u009d\16\u009d\u08b3\13\u009d\3\u009d\3\u009d\5\u009d" +
					"\u08b7\n\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\7\u009e\u08be\n" +
					"\u009e\f\u009e\16\u009e\u08c1\13\u009e\3\u009e\3\u009e\5\u009e\u08c5\n" +
					"\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\7\u009f\u08cd\n" +
					"\u009f\f\u009f\16\u009f\u08d0\13\u009f\3\u009f\5\u009f\u08d3\n\u009f\3" +
					"\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2" +
					"\3\u00a2\7\u00a2\u08df\n\u00a2\f\u00a2\16\u00a2\u08e2\13\u00a2\3\u00a3" +
					"\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5" +
					"\5\u00a5\u08ee\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u08f3\n\u00a5\7" +
					"\u00a5\u08f5\n\u00a5\f\u00a5\16\u00a5\u08f8\13\u00a5\3\u00a6\6\u00a6\u08fb" +
					"\n\u00a6\r\u00a6\16\u00a6\u08fc\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7" +
					"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0908\n\u00a7\5\u00a7\u090a\n" +
					"\u00a7\3\u00a8\3\u00a8\5\u00a8\u090e\n\u00a8\3\u00a8\3\u00a8\3\u00a8\3" +
					"\u00a8\3\u00a8\5\u00a8\u0915\n\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\7" +
					"\u00a8\u091b\n\u00a8\f\u00a8\16\u00a8\u091e\13\u00a8\3\u00a9\3\u00a9\3" +
					"\u00a9\5\u00a9\u0923\n\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5" +
					"\u00aa\u092a\n\u00aa\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u092f\n\u00ab\3\u00ab" +
					"\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ad\5\u00ad" +
					"\u093a\n\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae" +
					"\5\u00ae\u0943\n\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\7\u00ae" +
					"\u094a\n\u00ae\f\u00ae\16\u00ae\u094d\13\u00ae\3\u00ae\5\u00ae\u0950\n" +
					"\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\7\u00af\u0958\n" +
					"\u00af\f\u00af\16\u00af\u095b\13\u00af\3\u00af\3\u00af\5\u00af\u095f\n" +
					"\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0" +
					"\3\u00b0\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2" +
					"\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0975\n\u00b2\3\u00b2\5\u00b2\u0978\n" +
					"\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3" +
					"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3" +
					"\5\u00b3\u098b\n\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3" +
					"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\7\u00b3" +
					"\u099b\n\u00b3\f\u00b3\16\u00b3\u099e\13\u00b3\3\u00b4\3\u00b4\3\u00b4" +
					"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u09a8\n\u00b4\3\u00b5" +
					"\3\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7" +
					"\3\u00b7\7\u00b7\u09b5\n\u00b7\f\u00b7\16\u00b7\u09b8\13\u00b7\3\u00b8" +
					"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8" +
					"\u09c3\n\u00b8\3\u00b9\3\u00b9\5\u00b9\u09c7\n\u00b9\3\u00ba\3\u00ba\3" +
					"\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\6\u00ba\u09d0\n\u00ba\r\u00ba\16" +
					"\u00ba\u09d1\3\u00ba\3\u00ba\5\u00ba\u09d6\n\u00ba\3\u00ba\3\u00ba\3\u00bb" +
					"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\6\u00bb\u09e0\n\u00bb\r\u00bb" +
					"\16\u00bb\u09e1\3\u00bb\3\u00bb\5\u00bb\u09e6\n\u00bb\3\u00bb\3\u00bb" +
					"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u09f1" +
					"\n\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u09f6\n\u00bd\3\u00bd\3\u00bd" +
					"\3\u00bd\5\u00bd\u09fb\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u09ff\n\u00bd\3" +
					"\u00bd\3\u00bd\5\u00bd\u0a03\n\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0a08" +
					"\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u0a0c\n\u00bd\3\u00bd\3\u00bd\5\u00bd" +
					"\u0a10\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd" +
					"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd" +
					"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0a27\n\u00bd\5\u00bd" +
					"\u0a29\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd" +
					"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd" +
					"\5\u00bd\u0a3b\n\u00bd\5\u00bd\u0a3d\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3" +
					"\u00bd\3\u00bd\3\u00bd\5\u00bd\u0a45\n\u00bd\3\u00bd\3\u00bd\3\u00bd\5" +
					"\u00bd\u0a4a\n\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0a4f\n\u00bd\3\u00bd" +
					"\3\u00bd\3\u00bd\5\u00bd\u0a54\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd" +
					"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0a61" +
					"\n\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0a66\n\u00bd\3\u00bd\3\u00bd" +
					"\3\u00bd\5\u00bd\u0a6b\n\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0a70\n" +
					"\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0a75\n\u00bd\3\u00bd\3\u00bd\3" +
					"\u00bd\5\u00bd\u0a7a\n\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0a7f\n\u00bd" +
					"\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0a84\n\u00bd\5\u00bd\u0a86\n\u00bd\3" +
					"\u00be\3\u00be\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0a8d\n\u00bf\3\u00bf\5" +
					"\u00bf\u0a90\n\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3" +
					"\u00c0\7\u00c0\u0a99\n\u00c0\f\u00c0\16\u00c0\u0a9c\13\u00c0\3\u00c1\3" +
					"\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0aa5\n\u00c1\3" +
					"\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0aad\n\u00c1\3" +
					"\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0ab6\n" +
					"\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0abc\n\u00c1\3\u00c1\3" +
					"\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1" +
					"\3\u00c1\3\u00c1\3\u00c1\7\u00c1\u0acb\n\u00c1\f\u00c1\16\u00c1\u0ace" +
					"\13\u00c1\5\u00c1\u0ad0\n\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1" +
					"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\7\u00c1\u0ade" +
					"\n\u00c1\f\u00c1\16\u00c1\u0ae1\13\u00c1\5\u00c1\u0ae3\n\u00c1\3\u00c1" +
					"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1" +
					"\3\u00c1\3\u00c1\7\u00c1\u0af1\n\u00c1\f\u00c1\16\u00c1\u0af4\13\u00c1" +
					"\5\u00c1\u0af6\n\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1" +
					"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\7\u00c1\u0b04\n\u00c1" +
					"\f\u00c1\16\u00c1\u0b07\13\u00c1\5\u00c1\u0b09\n\u00c1\3\u00c1\3\u00c1" +
					"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1" +
					"\3\u00c1\7\u00c1\u0b17\n\u00c1\f\u00c1\16\u00c1\u0b1a\13\u00c1\5\u00c1" +
					"\u0b1c\n\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1" +
					"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\7\u00c1\u0b2a\n\u00c1\f\u00c1" +
					"\16\u00c1\u0b2d\13\u00c1\5\u00c1\u0b2f\n\u00c1\3\u00c1\3\u00c1\3\u00c1" +
					"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\7\u00c1\u0b3b" +
					"\n\u00c1\f\u00c1\16\u00c1\u0b3e\13\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1" +
					"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\6\u00c1\u0b4a\n\u00c1" +
					"\r\u00c1\16\u00c1\u0b4b\3\u00c1\3\u00c1\5\u00c1\u0b50\n\u00c1\3\u00c1" +
					"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1" +
					"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0b60\n\u00c1\3\u00c1\3\u00c1" +
					"\3\u00c1\3\u00c1\5\u00c1\u0b66\n\u00c1\3\u00c2\3\u00c2\3\u00c2\5\u00c2" +
					"\u0b6b\n\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3\7\u00c3\u0b72\n" +
					"\u00c3\f\u00c3\16\u00c3\u0b75\13\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4" +
					"\5\u00c4\u0b7b\n\u00c4\5\u00c4\u0b7d\n\u00c4\3\u00c4\3\u00c4\3\u00c5\3" +
					"\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0b86\n\u00c5\3\u00c6\3\u00c6\5" +
					"\u00c6\u0b8a\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0b8f\n\u00c6\7\u00c6" +
					"\u0b91\n\u00c6\f\u00c6\16\u00c6\u0b94\13\u00c6\3\u00c7\3\u00c7\3\u00c7" +
					"\3\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00cb\3\u00cb" +
					"\5\u00cb\u0ba2\n\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0ba7\n\u00cb\7" +
					"\u00cb\u0ba9\n\u00cb\f\u00cb\16\u00cb\u0bac\13\u00cb\3\u00cc\3\u00cc\5" +
					"\u00cc\u0bb0\n\u00cc\3\u00cd\5\u00cd\u0bb3\n\u00cd\3\u00cd\3\u00cd\3\u00ce" +
					"\5\u00ce\u0bb8\n\u00ce\3\u00ce\3\u00ce\3\u00cf\3\u00cf\3\u00d0\3\u00d0" +
					"\3\u00d1\3\u00d1\3\u00d1\2\4\u014e\u0164\u00d2\2\4\6\b\n\f\16\20\22\24" +
					"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv" +
					"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094" +
					"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac" +
					"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4" +
					"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc" +
					"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4" +
					"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c" +
					"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124" +
					"\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c" +
					"\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154" +
					"\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c" +
					"\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184" +
					"\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c" +
					"\u019e\u01a0\2+\3\2\u00d8\u00d9\4\2UU\u0106\u0106\5\2\3\4\u012e\u012e" +
					"\u013f\u013f\3\2\u0093\u0094\4\2\60\60^^\4\2\u00a1\u00a1\u00da\u00da\4" +
					"\2\f\fHH\4\2FF\u00fb\u00fb\4\2__\u0096\u0096\4\2FF\u00bb\u00bb\4\2BBt" +
					"t\5\2ww\u009c\u009c\u00b7\u00b8\4\2\u0098\u0098\u00a6\u00a6\4\2\u00a4" +
					"\u00a4\u010c\u010c\4\2\u009b\u009b\u0144\u0144\4\2\33\33!!\4\2\37\37\66" +
					"\66\4\288\u00d3\u00d3\4\2\13\13\u0084\u0084\3\2\u00c8\u00c9\3\2\u00bd" +
					"\u00be\6\2\65\65DD\u0083\u0083\u00b4\u00b4\3\2YZ\3\2RS\4\2\u00cf\u00cf" +
					"\u00ea\u00ea\7\2\5\5\u012a\u012a\u012e\u012e\u0138\u0138\u0140\u0140\6" +
					"\2\21\21MM\u0099\u0099\u00f1\u00f1\4\2\u0099\u0099\u0108\u0108\4\2\32" +
					"\32\u00e5\u00e5\4\2\b\bKK\5\2hh\u008d\u008d\u00cb\u00cb\5\2\66\66\u00d0" +
					"\u00d1\u00fc\u00fc\5\2\\\\\u00dc\u00dc\u00fb\u00fb\4\2\n\n\u00af\u00af" +
					"\5\2\u008e\u008e\u00c3\u00c3\u00cc\u00cc\5\2<=\u009e\u009f\u00d4\u00d5" +
					"\4\2--\u012d\u012d\5\2ff\u0085\u0085\u00a8\u00a8\4\2\u012a\u012a\u0140" +
					"\u0140\4\2``\u00f7\u00f7\26\2\7\7\n\25\27*,\62\64IKNPPTikpry{\u009c\u009e" +
					"\u00a8\u00aa\u00b8\u00ba\u00de\u00e0\u00f2\u00f4\u00f7\u00fa\u0105\u0108" +
					"\u0109\u010b\u0116\u011d\u0125\2\u0d36\2\u01a2\3\2\2\2\4\u01ac\3\2\2\2" +
					"\6\u01b1\3\2\2\2\b\u01c5\3\2\2\2\n\u01c7\3\2\2\2\f\u01d3\3\2\2\2\16\u01f6" +
					"\3\2\2\2\20\u01f8\3\2\2\2\22\u0203\3\2\2\2\24\u0205\3\2\2\2\26\u0224\3" +
					"\2\2\2\30\u0226\3\2\2\2\32\u024a\3\2\2\2\34\u024c\3\2\2\2\36\u024e\3\2" +
					"\2\2 \u0252\3\2\2\2\"\u0254\3\2\2\2$\u0281\3\2\2\2&\u02aa\3\2\2\2(\u02ac" +
					"\3\2\2\2*\u02af\3\2\2\2,\u02b5\3\2\2\2.\u02bb\3\2\2\2\60\u02bd\3\2\2\2" +
					"\62\u02bf\3\2\2\2\64\u02c3\3\2\2\2\66\u02d1\3\2\2\28\u02e3\3\2\2\2:\u02e5" +
					"\3\2\2\2<\u030a\3\2\2\2>\u0314\3\2\2\2@\u0316\3\2\2\2B\u032a\3\2\2\2D" +
					"\u032c\3\2\2\2F\u0336\3\2\2\2H\u0339\3\2\2\2J\u0342\3\2\2\2L\u034d\3\2" +
					"\2\2N\u035b\3\2\2\2P\u0380\3\2\2\2R\u0382\3\2\2\2T\u0385\3\2\2\2V\u0391" +
					"\3\2\2\2X\u0397\3\2\2\2Z\u039b\3\2\2\2\\\u03a3\3\2\2\2^\u03ac\3\2\2\2" +
					"`\u03b1\3\2\2\2b\u03b3\3\2\2\2d\u03bc\3\2\2\2f\u03c1\3\2\2\2h\u03cb\3" +
					"\2\2\2j\u03d8\3\2\2\2l\u03f7\3\2\2\2n\u03fc\3\2\2\2p\u041a\3\2\2\2r\u041c" +
					"\3\2\2\2t\u043e\3\2\2\2v\u0479\3\2\2\2x\u047b\3\2\2\2z\u0488\3\2\2\2|" +
					"\u048f\3\2\2\2~\u0492\3\2\2\2\u0080\u0497\3\2\2\2\u0082\u04a7\3\2\2\2" +
					"\u0084\u04bb\3\2\2\2\u0086\u04de\3\2\2\2\u0088\u04f2\3\2\2\2\u008a\u04f8" +
					"\3\2\2\2\u008c\u04fa\3\2\2\2\u008e\u0503\3\2\2\2\u0090\u0507\3\2\2\2\u0092" +
					"\u052b\3\2\2\2\u0094\u0531\3\2\2\2\u0096\u054e\3\2\2\2\u0098\u057f\3\2" +
					"\2\2\u009a\u0581\3\2\2\2\u009c\u0597\3\2\2\2\u009e\u05a5\3\2\2\2\u00a0" +
					"\u05a7\3\2\2\2\u00a2\u05b9\3\2\2\2\u00a4\u05c2\3\2\2\2\u00a6\u05d2\3\2" +
					"\2\2\u00a8\u05de\3\2\2\2\u00aa\u05ea\3\2\2\2\u00ac\u0601\3\2\2\2\u00ae" +
					"\u060a\3\2\2\2\u00b0\u0617\3\2\2\2\u00b2\u0624\3\2\2\2\u00b4\u062d\3\2" +
					"\2\2\u00b6\u065c\3\2\2\2\u00b8\u0688\3\2\2\2\u00ba\u068b\3\2\2\2\u00bc" +
					"\u069a\3\2\2\2\u00be\u069c\3\2\2\2\u00c0\u06b9\3\2\2\2\u00c2\u06bb\3\2" +
					"\2\2\u00c4\u06cb\3\2\2\2\u00c6\u06d2\3\2\2\2\u00c8\u06d8\3\2\2\2\u00ca" +
					"\u06dd\3\2\2\2\u00cc\u06e0\3\2\2\2\u00ce\u06e8\3\2\2\2\u00d0\u06ec\3\2" +
					"\2\2\u00d2\u06fa\3\2\2\2\u00d4\u0700\3\2\2\2\u00d6\u0713\3\2\2\2\u00d8" +
					"\u0717\3\2\2\2\u00da\u0719\3\2\2\2\u00dc\u0730\3\2\2\2\u00de\u0736\3\2" +
					"\2\2\u00e0\u0744\3\2\2\2\u00e2\u0746\3\2\2\2\u00e4\u0749\3\2\2\2\u00e6" +
					"\u0751\3\2\2\2\u00e8\u0759\3\2\2\2\u00ea\u075c\3\2\2\2\u00ec\u075e\3\2" +
					"\2\2\u00ee\u076c\3\2\2\2\u00f0\u0772\3\2\2\2\u00f2\u0775\3\2\2\2\u00f4" +
					"\u0778\3\2\2\2\u00f6\u0781\3\2\2\2\u00f8\u078a\3\2\2\2\u00fa\u0790\3\2" +
					"\2\2\u00fc\u07b1\3\2\2\2\u00fe\u07b5\3\2\2\2\u0100\u07b9\3\2\2\2\u0102" +
					"\u07c2\3\2\2\2\u0104\u07c7\3\2\2\2\u0106\u07cc\3\2\2\2\u0108\u07d0\3\2" +
					"\2\2\u010a\u07dd\3\2\2\2\u010c\u07e4\3\2\2\2\u010e\u07ec\3\2\2\2\u0110" +
					"\u0804\3\2\2\2\u0112\u0806\3\2\2\2\u0114\u080f\3\2\2\2\u0116\u0811\3\2" +
					"\2\2\u0118\u081f\3\2\2\2\u011a\u082d\3\2\2\2\u011c\u082f\3\2\2\2\u011e" +
					"\u0848\3\2\2\2\u0120\u0855\3\2\2\2\u0122\u0857\3\2\2\2\u0124\u0864\3\2" +
					"\2\2\u0126\u086d\3\2\2\2\u0128\u0871\3\2\2\2\u012a\u0875\3\2\2\2\u012c" +
					"\u087e\3\2\2\2\u012e\u0889\3\2\2\2\u0130\u088b\3\2\2\2\u0132\u088f\3\2" +
					"\2\2\u0134\u089c\3\2\2\2\u0136\u08a7\3\2\2\2\u0138\u08a9\3\2\2\2\u013a" +
					"\u08c4\3\2\2\2\u013c\u08c6\3\2\2\2\u013e\u08d4\3\2\2\2\u0140\u08d6\3\2" +
					"\2\2\u0142\u08d9\3\2\2\2\u0144\u08e3\3\2\2\2\u0146\u08e6\3\2\2\2\u0148" +
					"\u08e9\3\2\2\2\u014a\u08fa\3\2\2\2\u014c\u0909\3\2\2\2\u014e\u0914\3\2" +
					"\2\2\u0150\u0922\3\2\2\2\u0152\u0929\3\2\2\2\u0154\u092b\3\2\2\2\u0156" +
					"\u0932\3\2\2\2\u0158\u0939\3\2\2\2\u015a\u0940\3\2\2\2\u015c\u0953\3\2" +
					"\2\2\u015e\u0965\3\2\2\2\u0160\u0969\3\2\2\2\u0162\u0977\3\2\2\2\u0164" +
					"\u098a\3\2\2\2\u0166\u09a7\3\2\2\2\u0168\u09a9\3\2\2\2\u016a\u09ad\3\2" +
					"\2\2\u016c\u09af\3\2\2\2\u016e\u09c2\3\2\2\2\u0170\u09c6\3\2\2\2\u0172" +
					"\u09c8\3\2\2\2\u0174\u09d9\3\2\2\2\u0176\u09e9\3\2\2\2\u0178\u0a85\3\2" +
					"\2\2\u017a\u0a87\3\2\2\2\u017c\u0a89\3\2\2\2\u017e\u0a93\3\2\2\2\u0180" +
					"\u0b65\3\2\2\2\u0182\u0b67\3\2\2\2\u0184\u0b6e\3\2\2\2\u0186\u0b76\3\2" +
					"\2\2\u0188\u0b80\3\2\2\2\u018a\u0b89\3\2\2\2\u018c\u0b95\3\2\2\2\u018e" +
					"\u0b98\3\2\2\2\u0190\u0b9b\3\2\2\2\u0192\u0b9d\3\2\2\2\u0194\u0ba1\3\2" +
					"\2\2\u0196\u0baf\3\2\2\2\u0198\u0bb2\3\2\2\2\u019a\u0bb7\3\2\2\2\u019c" +
					"\u0bbb\3\2\2\2\u019e\u0bbd\3\2\2\2\u01a0\u0bbf\3\2\2\2\u01a2\u01a3\5\4" +
					"\3\2\u01a3\u01a4\7\2\2\3\u01a4\3\3\2\2\2\u01a5\u01a8\5\6\4\2\u01a6\u01a8" +
					"\5\16\b\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01aa\3\2\2\2" +
					"\u01a9\u01ab\7l\2\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad" +
					"\3\2\2\2\u01ac\u01a7\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae" +
					"\u01af\3\2\2\2\u01af\5\3\2\2\2\u01b0\u01b2\5J&\2\u01b1\u01b0\3\2\2\2\u01b1" +
					"\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\7\21\2\2\u01b4\u01b6\5" +
					"\4\3\2\u01b5\u01b7\5*\26\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7" +
					"\u01b8\3\2\2\2\u01b8\u01b9\5\n\6\2\u01b9\7\3\2\2\2\u01ba\u01bb\7\21\2" +
					"\2\u01bb\u01bd\5\4\3\2\u01bc\u01be\5*\26\2\u01bd\u01bc\3\2\2\2\u01bd\u01be" +
					"\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\5\n\6\2\u01c0\u01c6\3\2\2\2\u01c1" +
					"\u01c3\5\16\b\2\u01c2\u01c4\7\u013f\2\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4" +
					"\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01ba\3\2\2\2\u01c5\u01c1\3\2\2\2\u01c6" +
					"\t\3\2\2\2\u01c7\u01c8\6\6\2\2\u01c8\u01c9\7U\2\2\u01c9\13\3\2\2\2\u01ca" +
					"\u01d4\5\6\4\2\u01cb\u01cd\5\16\b\2\u01cc\u01cb\3\2\2\2\u01cd\u01ce\3" +
					"\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0" +
					"\u01d2\7l\2\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3\2" +
					"\2\2\u01d3\u01ca\3\2\2\2\u01d3\u01cc\3\2\2\2\u01d4\r\3\2\2\2\u01d5\u01f7" +
					"\5\64\33\2\u01d6\u01f7\5@!\2\u01d7\u01f7\5B\"\2\u01d8\u01f7\5D#\2\u01d9" +
					"\u01f7\5F$\2\u01da\u01f7\5\u00d0i\2\u01db\u01f7\5\u00a0Q\2\u01dc\u01f7" +
					"\5\u00a4S\2\u01dd\u01f7\5\u00d4k\2\u01de\u01f7\5j\66\2\u01df\u01f7\5\u00a8" +
					"U\2\u01e0\u01f7\5\u00aeX\2\u01e1\u01f7\5\u00b4[\2\u01e2\u01f7\5h\65\2" +
					"\u01e3\u01f7\5V,\2\u01e4\u01f7\5H%\2\u01e5\u01f7\5\u00be`\2\u01e6\u01f7" +
					"\5\u00ccg\2\u01e7\u01f7\5\u010e\u0088\2\u01e8\u01f7\5\u00c0a\2\u01e9\u01f7" +
					"\5\u00ceh\2\u01ea\u01f7\5\u00dco\2\u01eb\u01f7\5\u00dep\2\u01ec\u01f7" +
					"\5\u0114\u008b\2\u01ed\u01f7\5\u010c\u0087\2\u01ee\u01f7\5\20\t\2\u01ef" +
					"\u01f7\5\u00e0q\2\u01f0\u01f7\5\u010a\u0086\2\u01f1\u01f7\5\22\n\2\u01f2" +
					"\u01f7\5\u0110\u0089\2\u01f3\u01f7\5\60\31\2\u01f4\u01f7\5\62\32\2\u01f5" +
					"\u01f7\5.\30\2\u01f6\u01d5\3\2\2\2\u01f6\u01d6\3\2\2\2\u01f6\u01d7\3\2" +
					"\2\2\u01f6\u01d8\3\2\2\2\u01f6\u01d9\3\2\2\2\u01f6\u01da\3\2\2\2\u01f6" +
					"\u01db\3\2\2\2\u01f6\u01dc\3\2\2\2\u01f6\u01dd\3\2\2\2\u01f6\u01de\3\2" +
					"\2\2\u01f6\u01df\3\2\2\2\u01f6\u01e0\3\2\2\2\u01f6\u01e1\3\2\2\2\u01f6" +
					"\u01e2\3\2\2\2\u01f6\u01e3\3\2\2\2\u01f6\u01e4\3\2\2\2\u01f6\u01e5\3\2" +
					"\2\2\u01f6\u01e6\3\2\2\2\u01f6\u01e7\3\2\2\2\u01f6\u01e8\3\2\2\2\u01f6" +
					"\u01e9\3\2\2\2\u01f6\u01ea\3\2\2\2\u01f6\u01eb\3\2\2\2\u01f6\u01ec\3\2" +
					"\2\2\u01f6\u01ed\3\2\2\2\u01f6\u01ee\3\2\2\2\u01f6\u01ef\3\2\2\2\u01f6" +
					"\u01f0\3\2\2\2\u01f6\u01f1\3\2\2\2\u01f6\u01f2\3\2\2\2\u01f6\u01f3\3\2" +
					"\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7\17\3\2\2\2\u01f8\u01f9" +
					"\7\u0126\2\2\u01f9\u01fc\7\u013a\2\2\u01fa\u01fd\5\u0164\u00b3\2\u01fb" +
					"\u01fd\5\u014e\u00a8\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd\u01fe" +
					"\3\2\2\2\u01fe\u01ff\7\u013d\2\2\u01ff\21\3\2\2\2\u0200\u0204\5\24\13" +
					"\2\u0201\u0204\5\32\16\2\u0202\u0204\5\"\22\2\u0203\u0200\3\2\2\2\u0203" +
					"\u0201\3\2\2\2\u0203\u0202\3\2\2\2\u0204\23\3\2\2\2\u0205\u0206\t\2\2" +
					"\2\u0206\u0208\5\u011e\u0090\2\u0207\u0209\5\u012a\u0096\2\u0208\u0207" +
					"\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u020d\5\u012c\u0097" +
					"\2\u020b\u020d\5\30\r\2\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020c" +
					"\u020d\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u0211\5\u0140\u00a1\2\u020f\u0211" +
					"\5\26\f\2\u0210\u020e\3\2\2\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2" +
					"\u0211\u0213\3\2\2\2\u0212\u0214\5\u0142\u00a2\2\u0213\u0212\3\2\2\2\u0213" +
					"\u0214\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0218\5\u0144\u00a3\2\u0216\u0218" +
					"\5\u0146\u00a4\2\u0217\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0217\u0218\3" +
					"\2\2\2\u0218\u021a\3\2\2\2\u0219\u021b\5\u0148\u00a5\2\u021a\u0219\3\2" +
					"\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u021e\5\u014a\u00a6" +
					"\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e\25\3\2\2\2\u021f\u0220" +
					"\5\u014e\u00a8\2\u0220\u0221\b\f\1\2\u0221\u0225\3\2\2\2\u0222\u0223\7" +
					"\u0107\2\2\u0223\u0225\5\32\16\2\u0224\u021f\3\2\2\2\u0224\u0222\3\2\2" +
					"\2\u0225\27\3\2\2\2\u0226\u022a\5\u012e\u0098\2\u0227\u0229\5\u0134\u009b" +
					"\2\u0228\u0227\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b" +
					"\3\2\2\2\u022b\u022d\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022e\b\r\1\2\u022e" +
					"\31\3\2\2\2\u022f\u0231\7\u00a7\2\2\u0230\u022f\3\2\2\2\u0230\u0231\3" +
					"\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\5\u014e\u00a8\2\u0233\u0234\7\u013d" +
					"\2\2\u0234\u0235\b\16\1\2\u0235\u024b\3\2\2\2\u0236\u0238\7\u00a7\2\2" +
					"\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a" +
					"\7\u013a\2\2\u023a\u023b\5\u014e\u00a8\2\u023b\u023c\b\16\1\2\u023c\u024b" +
					"\3\2\2\2\u023d\u023f\7\u00a7\2\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2" +
					"\2\u023f\u0240\3\2\2\2\u0240\u0241\5\u014e\u00a8\2\u0241\u0243\7\u013d" +
					"\2\2\u0242\u0244\7\u013d\2\2\u0243\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245" +
					"\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\b\16" +
					"\1\2\u0248\u024b\3\2\2\2\u0249\u024b\5\34\17\2\u024a\u0230\3\2\2\2\u024a" +
					"\u0237\3\2\2\2\u024a\u023e\3\2\2\2\u024a\u0249\3\2\2\2\u024b\33\3\2\2" +
					"\2\u024c\u024d\5\36\20\2\u024d\35\3\2\2\2\u024e\u024f\5\u0164\u00b3\2" +
					"\u024f\u0250\5 \21\2\u0250\u0251\5\u0164\u00b3\2\u0251\37\3\2\2\2\u0252" +
					"\u0253\5\u0194\u00cb\2\u0253!\3\2\2\2\u0254\u0255\5$\23\2\u0255\u0256" +
					"\5\u00eav\2\u0256#\3\2\2\2\u0257\u0258\5\u0194\u00cb\2\u0258\u025b\7\u013a" +
					"\2\2\u0259\u025c\5\u00e6t\2\u025a\u025c\5&\24\2\u025b\u0259\3\2\2\2\u025b" +
					"\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\7\u013d\2\2\u025e\u025f" +
					"\b\23\1\2\u025f\u0282\3\2\2\2\u0260\u0261\5\u0098M\2\u0261\u0264\7\u013a" +
					"\2\2\u0262\u0265\5\u00e6t\2\u0263\u0265\5&\24\2\u0264\u0262\3\2\2\2\u0264" +
					"\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\7\u013d\2\2\u0267\u0268" +
					"\b\23\1\2\u0268\u0282\3\2\2\2\u0269\u026a\5\u0098M\2\u026a\u026b\5\u0194" +
					"\u00cb\2\u026b\u026c\7\u013a\2\2\u026c\u026d\5&\24\2\u026d\u026e\7\u013d" +
					"\2\2\u026e\u0282\3\2\2\2\u026f\u0270\5\u0098M\2\u0270\u0273\5\u0194\u00cb" +
					"\2\u0271\u0274\5\u00e6t\2\u0272\u0274\5&\24\2\u0273\u0271\3\2\2\2\u0273" +
					"\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\7\u013d\2\2\u0276\u0277" +
					"\b\23\1\2\u0277\u0282\3\2\2\2\u0278\u0279\5\u0098M\2\u0279\u027a\5\u0194" +
					"\u00cb\2\u027a\u027d\7\u013a\2\2\u027b\u027e\5\u00e6t\2\u027c\u027e\5" +
					"&\24\2\u027d\u027b\3\2\2\2\u027d\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f" +
					"\u0280\b\23\1\2\u0280\u0282\3\2\2\2\u0281\u0257\3\2\2\2\u0281\u0260\3" +
					"\2\2\2\u0281\u0269\3\2\2\2\u0281\u026f\3\2\2\2\u0281\u0278\3\2\2\2\u0282" +
					"%\3\2\2\2\u0283\u0286\5(\25\2\u0284\u0286\5\u00e8u\2\u0285\u0283\3\2\2" +
					"\2\u0285\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\7\u012c\2\2\u0288" +
					"\u0289\b\24\1\2\u0289\u02ab\3\2\2\2\u028a\u0292\5(\25\2\u028b\u028e\7" +
					"\u012c\2\2\u028c\u028f\5\u00e8u\2\u028d\u028f\5(\25\2\u028e\u028c\3\2" +
					"\2\2\u028e\u028d\3\2\2\2\u028f\u0291\3\2\2\2\u0290\u028b\3\2\2\2\u0291" +
					"\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u02ab\3\2" +
					"\2\2\u0294\u0292\3\2\2\2\u0295\u029a\5\u00e8u\2\u0296\u0297\7\u012c\2" +
					"\2\u0297\u0299\5\u00e8u\2\u0298\u0296\3\2\2\2\u0299\u029c\3\2\2\2\u029a" +
					"\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029f\3\2\2\2\u029c\u029a\3\2" +
					"\2\2\u029d\u029e\7\u012c\2\2\u029e\u02a0\5(\25\2\u029f\u029d\3\2\2\2\u02a0" +
					"\u02a1\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a7\3\2" +
					"\2\2\u02a3\u02a4\7\u012c\2\2\u02a4\u02a6\5\u00e8u\2\u02a5\u02a3\3\2\2" +
					"\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02ab" +
					"\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u0285\3\2\2\2\u02aa\u028a\3\2\2\2\u02aa" +
					"\u0295\3\2\2\2\u02ab\'\3\2\2\2\u02ac\u02ad\5\u0194\u00cb\2\u02ad\u02ae" +
					"\b\25\1\2\u02ae)\3\2\2\2\u02af\u02b1\7[\2\2\u02b0\u02b2\5,\27\2\u02b1" +
					"\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2" +
					"\2\2\u02b4+\3\2\2\2\u02b5\u02b6\7\u0106\2\2\u02b6\u02b7\7\u0141\2\2\u02b7" +
					"\u02b8\7\u00f1\2\2\u02b8\u02b9\5\4\3\2\u02b9\u02ba\n\3\2\2\u02ba-\3\2" +
					"\2\2\u02bb\u02bc\t\4\2\2\u02bc/\3\2\2\2\u02bd\u02be\7\u00a9\2\2\u02be" +
					"\61\3\2\2\2\u02bf\u02c0\6\32\3\2\u02c0\u02c1\5\u0164\u00b3\2\u02c1\63" +
					"\3\2\2\2\u02c2\u02c4\7\u00da\2\2\u02c3\u02c2\3\2\2\2\u02c3\u02c4\3\2\2" +
					"\2\u02c4\u02c5\3\2\2\2\u02c5\u02ca\5\66\34\2\u02c6\u02c7\7\u012c\2\2\u02c7" +
					"\u02c9\5\66\34\2\u02c8\u02c6\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8\3" +
					"\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\65\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd" +
					"\u02d2\58\35\2\u02ce\u02d2\5:\36\2\u02cf\u02d2\5<\37\2\u02d0\u02d2\5>" +
					" \2\u02d1\u02cd\3\2\2\2\u02d1\u02ce\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1" +
					"\u02d0\3\2\2\2\u02d2\67\3\2\2\2\u02d3\u02d5\5\u0194\u00cb\2\u02d4\u02d6" +
					"\7\u012b\2\2\u02d5\u02d4\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\3\2\2" +
					"\2\u02d7\u02d8\7\u0130\2\2\u02d8\u02d9\5\u0164\u00b3\2\u02d9\u02e4\3\2" +
					"\2\2\u02da\u02db\7\u013a\2\2\u02db\u02dc\5\u0194\u00cb\2\u02dc\u02de\7" +
					"\u013d\2\2\u02dd\u02df\7\u012b\2\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2" +
					"\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\7\u0130\2\2\u02e1\u02e2\5\u0164\u00b3" +
					"\2\u02e2\u02e4\3\2\2\2\u02e3\u02d3\3\2\2\2\u02e3\u02da\3\2\2\2\u02e49" +
					"\3\2\2\2\u02e5\u02e6\7\u013a\2\2\u02e6\u02eb\5\u0194\u00cb\2\u02e7\u02e8" +
					"\7\u012c\2\2\u02e8\u02ea\5\u0194\u00cb\2\u02e9\u02e7\3\2\2\2\u02ea\u02ed" +
					"\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee\3\2\2\2\u02ed" +
					"\u02eb\3\2\2\2\u02ee\u02f0\7\u013d\2\2\u02ef\u02f1\7\u012b\2\2\u02f0\u02ef" +
					"\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\7\u0130\2" +
					"\2\u02f3\u02f4\7\u013a\2\2\u02f4\u02f9\5\u0164\u00b3\2\u02f5\u02f6\7\u012c" +
					"\2\2\u02f6\u02f8\5\u0164\u00b3\2\u02f7\u02f5\3\2\2\2\u02f8\u02fb\3\2\2" +
					"\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02f9" +
					"\3\2\2\2\u02fc\u02fd\7\u013d\2\2\u02fd;\3\2\2\2\u02fe\u030b\5\u0194\u00cb" +
					"\2\u02ff\u0300\7\u013a\2\2\u0300\u0305\5\u0194\u00cb\2\u0301\u0302\7\u012c" +
					"\2\2\u0302\u0304\5\u0194\u00cb\2\u0303\u0301\3\2\2\2\u0304\u0307\3\2\2" +
					"\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\3\2\2\2\u0307\u0305" +
					"\3\2\2\2\u0308\u0309\7\u013d\2\2\u0309\u030b\3\2\2\2\u030a\u02fe\3\2\2" +
					"\2\u030a\u02ff\3\2\2\2\u030b\u030d\3\2\2\2\u030c\u030e\7\u012b\2\2\u030d" +
					"\u030c\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\7\u0130" +
					"\2\2\u0310\u0311\7\u013a\2\2\u0311\u0312\5\u0114\u008b\2\u0312\u0313\7" +
					"\u013d\2\2\u0313=\3\2\2\2\u0314\u0315\5\u0114\u008b\2\u0315?\3\2\2\2\u0316" +
					"\u0319\7\r\2\2\u0317\u0318\7\u00c6\2\2\u0318\u031a\7\u00da\2\2\u0319\u0317" +
					"\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\t\5\2\2\u031c" +
					"\u031d\7\u013a\2\2\u031d\u0322\5\u0194\u00cb\2\u031e\u031f\7\u012c\2\2" +
					"\u031f\u0321\5\u0194\u00cb\2\u0320\u031e\3\2\2\2\u0321\u0324\3\2\2\2\u0322" +
					"\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0325\3\2\2\2\u0324\u0322\3\2" +
					"\2\2\u0325\u0326\7\u013d\2\2\u0326\u0327\7\u0109\2\2\u0327\u0328\7\u00be" +
					"\2\2\u0328\u0329\5\u0194\u00cb\2\u0329A\3\2\2\2\u032a\u032b\7\31\2\2\u032b" +
					"C\3\2\2\2\u032c\u032d\7\34\2\2\u032d\u0334\5\u0194\u00cb\2\u032e\u0330" +
					"\7\u013a\2\2\u032f\u0331\5\u0184\u00c3\2\u0330\u032f\3\2\2\2\u0330\u0331" +
					"\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0335\7\u013d\2\2\u0333\u0335\5\u0184" +
					"\u00c3\2\u0334\u032e\3\2\2\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335" +
					"E\3\2\2\2\u0336\u0337\7$\2\2\u0337\u0338\7\u0141\2\2\u0338G\3\2\2\2\u0339" +
					"\u033a\7@\2\2\u033a\u033f\5N(\2\u033b\u033c\7\u012c\2\2\u033c\u033e\5" +
					"N(\2\u033d\u033b\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u033f" +
					"\u0340\3\2\2\2\u0340I\3\2\2\2\u0341\u033f\3\2\2\2\u0342\u0343\7@\2\2\u0343" +
					"\u0344\5N(\2\u0344\u034a\7\u013f\2\2\u0345\u0346\5N(\2\u0346\u0347\7\u013f" +
					"\2\2\u0347\u0349\3\2\2\2\u0348\u0345\3\2\2\2\u0349\u034c\3\2\2\2\u034a" +
					"\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034bK\3\2\2\2\u034c\u034a\3\2\2\2" +
					"\u034d\u034e\5N(\2\u034e\u0354\7\u013f\2\2\u034f\u0350\5N(\2\u0350\u0351" +
					"\7\u013f\2\2\u0351\u0353\3\2\2\2\u0352\u034f\3\2\2\2\u0353\u0356\3\2\2" +
					"\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355M\3\2\2\2\u0356\u0354" +
					"\3\2\2\2\u0357\u035c\5R*\2\u0358\u035c\5T+\2\u0359\u035c\5P)\2\u035a\u035c" +
					"\5f\64\2\u035b\u0357\3\2\2\2\u035b\u0358\3\2\2\2\u035b\u0359\3\2\2\2\u035b" +
					"\u035a\3\2\2\2\u035cO\3\2\2\2\u035d\u0362\5\u0194\u00cb\2\u035e\u035f" +
					"\7\u012c\2\2\u035f\u0361\5\u0194\u00cb\2\u0360\u035e\3\2\2\2\u0361\u0364" +
					"\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0366\3\2\2\2\u0364" +
					"\u0362\3\2\2\2\u0365\u0367\7\13\2\2\u0366\u0365\3\2\2\2\u0366\u0367\3" +
					"\2\2\2\u0367\u0368\3\2\2\2\u0368\u036a\5\u0098M\2\u0369\u036b\5\u009a" +
					"N\2\u036a\u0369\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036f\3\2\2\2\u036c" +
					"\u036e\5\u009cO\2\u036d\u036c\3\2\2\2\u036e\u0371\3\2\2\2\u036f\u036d" +
					"\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0373\3\2\2\2\u0371\u036f\3\2\2\2\u0372" +
					"\u0374\5\u009eP\2\u0373\u0372\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0381" +
					"\3\2\2\2\u0375\u0376\5\u0194\u00cb\2\u0376\u0378\7*\2\2\u0377\u0379\7" +
					"\13\2\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\3\2\2\2\u037a" +
					"\u037c\5\u0098M\2\u037b\u037d\5\u009aN\2\u037c\u037b\3\2\2\2\u037c\u037d" +
					"\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u037f\5\u009eP\2\u037f\u0381\3\2\2" +
					"\2\u0380\u035d\3\2\2\2\u0380\u0375\3\2\2\2\u0381Q\3\2\2\2\u0382\u0383" +
					"\5\u0194\u00cb\2\u0383\u0384\7.\2\2\u0384S\3\2\2\2\u0385\u0386\t\6\2\2" +
					"\u0386\u0387\7n\2\2\u0387\u038d\7c\2\2\u0388\u038e\7\u00e3\2\2\u0389\u038e" +
					"\7\u00e4\2\2\u038a\u038b\7\u00a7\2\2\u038b\u038e\7f\2\2\u038c\u038e\5" +
					"\u0194\u00cb\2\u038d\u0388\3\2\2\2\u038d\u0389\3\2\2\2\u038d\u038a\3\2" +
					"\2\2\u038d\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390\5\b\5\2\u0390" +
					"U\3\2\2\2\u0391\u0392\7\63\2\2\u0392\u0393\7\u00f8\2\2\u0393\u0394\5\u013e" +
					"\u00a0\2\u0394\u0395\5X-\2\u0395\u0396\5^\60\2\u0396W\3\2\2\2\u0397\u0398" +
					"\7\u013a\2\2\u0398\u0399\5Z.\2\u0399\u039a\7\u013d\2\2\u039aY\3\2\2\2" +
					"\u039b\u03a0\5\\/\2\u039c\u039d\7\u012c\2\2\u039d\u039f\5\\/\2\u039e\u039c" +
					"\3\2\2\2\u039f\u03a2\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1" +
					"[\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a3\u03a4\5\u0194\u00cb\2\u03a4\u03a7" +
					"\7\u012b\2\2\u03a5\u03a8\5\u0194\u00cb\2\u03a6\u03a8\5\u0196\u00cc\2\u03a7" +
					"\u03a5\3\2\2\2\u03a7\u03a6\3\2\2\2\u03a8]\3\2\2\2\u03a9\u03ab\5`\61\2" +
					"\u03aa\u03a9\3\2\2\2\u03ab\u03ae\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ac\u03ad" +
					"\3\2\2\2\u03ad_\3\2\2\2\u03ae\u03ac\3\2\2\2\u03af\u03b2\5b\62\2\u03b0" +
					"\u03b2\5d\63\2\u03b1\u03af\3\2\2\2\u03b1\u03b0\3\2\2\2\u03b2a\3\2\2\2" +
					"\u03b3\u03b4\7\u0092\2\2\u03b4\u03b9\5\u0196\u00cc\2\u03b5\u03b6\7\u012c" +
					"\2\2\u03b6\u03b8\5\u0196\u00cc\2\u03b7\u03b5\3\2\2\2\u03b8\u03bb\3\2\2" +
					"\2\u03b9\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03bac\3\2\2\2\u03bb\u03b9" +
					"\3\2\2\2\u03bc\u03bd\7G\2\2\u03bd\u03be\7\32\2\2\u03be\u03bf\5\u0196\u00cc" +
					"\2\u03bfe\3\2\2\2\u03c0\u03c2\7k\2\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3" +
					"\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4\7\u00ee\2\2\u03c4\u03c5\7\u00ec" +
					"\2\2\u03c5\u03c7\5\u0194\u00cb\2\u03c6\u03c8\5z>\2\u03c7\u03c6\3\2\2\2" +
					"\u03c7\u03c8\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03ca\5l\67\2\u03cag\3" +
					"\2\2\2\u03cb\u03cc\7\63\2\2\u03cc\u03d0\7\u00ec\2\2\u03cd\u03ce\7s\2\2" +
					"\u03ce\u03cf\7\u00a7\2\2\u03cf\u03d1\7]\2\2\u03d0\u03cd\3\2\2\2\u03d0" +
					"\u03d1\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d4\5\u013e\u00a0\2\u03d3\u03d5" +
					"\5z>\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6" +
					"\u03d7\5l\67\2\u03d7i\3\2\2\2\u03d8\u03df\7\63\2\2\u03d9\u03da\7\u0091" +
					"\2\2\u03da\u03e0\7\u00ee\2\2\u03db\u03dd\t\7\2\2\u03dc\u03db\3\2\2\2\u03dc" +
					"\u03dd\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03e0\7\u0105\2\2\u03df\u03d9" +
					"\3\2\2\2\u03df\u03dc\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\7\u00ec\2" +
					"\2\u03e2\u03e4\5\u0194\u00cb\2\u03e3\u03e5\5z>\2\u03e4\u03e3\3\2\2\2\u03e4" +
					"\u03e5\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\5l\67\2\u03e7k\3\2\2\2" +
					"\u03e8\u03ea\7\13\2\2\u03e9\u03e8\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb" +
					"\3\2\2\2\u03eb\u03ec\7\u013a\2\2\u03ec\u03ed\5\u0114\u008b\2\u03ed\u03ee" +
					"\7\u013d\2\2\u03ee\u03f8\3\2\2\2\u03ef\u03f1\7\13\2\2\u03f0\u03ef\3\2" +
					"\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f8\5\u0114\u008b" +
					"\2\u03f3\u03f4\7\u013a\2\2\u03f4\u03f5\5n8\2\u03f5\u03f6\7\u013d\2\2\u03f6" +
					"\u03f8\3\2\2\2\u03f7\u03e9\3\2\2\2\u03f7\u03f0\3\2\2\2\u03f7\u03f3\3\2" +
					"\2\2\u03f8\u03fa\3\2\2\2\u03f9\u03fb\5\u0080A\2\u03fa\u03f9\3\2\2\2\u03fa" +
					"\u03fb\3\2\2\2\u03fbm\3\2\2\2\u03fc\u0401\5p9\2\u03fd\u03fe\7\u012c\2" +
					"\2\u03fe\u0400\5p9\2\u03ff\u03fd\3\2\2\2\u0400\u0403\3\2\2\2\u0401\u03ff" +
					"\3\2\2\2\u0401\u0402\3\2\2\2\u0402o\3\2\2\2\u0403\u0401\3\2\2\2\u0404" +
					"\u0405\5r:\2\u0405\u0407\5\u0098M\2\u0406\u0408\5\u009aN\2\u0407\u0406" +
					"\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u040c\3\2\2\2\u0409\u040b\5\u009cO" +
					"\2\u040a\u0409\3\2\2\2\u040b\u040e\3\2\2\2\u040c\u040a\3\2\2\2\u040c\u040d" +
					"\3\2\2\2\u040d\u0412\3\2\2\2\u040e\u040c\3\2\2\2\u040f\u0411\5t;\2\u0410" +
					"\u040f\3\2\2\2\u0411\u0414\3\2\2\2\u0412\u0410\3\2\2\2\u0412\u0413\3\2" +
					"\2\2\u0413\u041b\3\2\2\2\u0414\u0412\3\2\2\2\u0415\u0416\7/\2\2\u0416" +
					"\u0418\5\u0194\u00cb\2\u0417\u0415\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0419" +
					"\3\2\2\2\u0419\u041b\5v<\2\u041a\u0404\3\2\2\2\u041a\u0417\3\2\2\2\u041b" +
					"q\3\2\2\2\u041c\u041d\5\u0194\u00cb\2\u041ds\3\2\2\2\u041e\u043f\5\u009e" +
					"P\2\u041f\u0421\7\u00a7\2\2\u0420\u041f\3\2\2\2\u0420\u0421\3\2\2\2\u0421" +
					"\u0422\3\2\2\2\u0422\u043f\7\u00a9\2\2\u0423\u0424\7\u00bc\2\2\u0424\u043f" +
					"\7\u0089\2\2\u0425\u043f\7\u00fa\2\2\u0426\u0427\7\u00c2\2\2\u0427\u0428" +
					"\5\u013e\u00a0\2\u0428\u0429\7\u013a\2\2\u0429\u042a\5\u0194\u00cb\2\u042a" +
					"\u042e\7\u013d\2\2\u042b\u042d\5x=\2\u042c\u042b\3\2\2\2\u042d\u0430\3" +
					"\2\2\2\u042e\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u043f\3\2\2\2\u0430" +
					"\u042e\3\2\2\2\u0431\u0432\7r\2\2\u0432\u0433\7\u013a\2\2\u0433\u0438" +
					"\7\u0144\2\2\u0434\u0435\7\u012c\2\2\u0435\u0437\7\u0144\2\2\u0436\u0434" +
					"\3\2\2\2\u0437\u043a\3\2\2\2\u0438\u0436\3\2\2\2\u0438\u0439\3\2\2\2\u0439" +
					"\u043b\3\2\2\2\u043a\u0438\3\2\2\2\u043b\u043f\7\u013d\2\2\u043c\u043f" +
					"\7\17\2\2\u043d\u043f\7T\2\2\u043e\u041e\3\2\2\2\u043e\u0420\3\2\2\2\u043e" +
					"\u0423\3\2\2\2\u043e\u0425\3\2\2\2\u043e\u0426\3\2\2\2\u043e\u0431\3\2" +
					"\2\2\u043e\u043c\3\2\2\2\u043e\u043d\3\2\2\2\u043fu\3\2\2\2\u0440\u0441" +
					"\7\u00bc\2\2\u0441\u0443\7\u0089\2\2\u0442\u0444\7%\2\2\u0443\u0442\3" +
					"\2\2\2\u0443\u0444\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0446\7\u013a\2\2" +
					"\u0446\u0448\5\u0194\u00cb\2\u0447\u0449\t\b\2\2\u0448\u0447\3\2\2\2\u0448" +
					"\u0449\3\2\2\2\u0449\u0451\3\2\2\2\u044a\u044b\7\u012c\2\2\u044b\u044d" +
					"\5\u0194\u00cb\2\u044c\u044e\t\b\2\2\u044d\u044c\3\2\2\2\u044d\u044e\3" +
					"\2\2\2\u044e\u0450\3\2\2\2\u044f\u044a\3\2\2\2\u0450\u0453\3\2\2\2\u0451" +
					"\u044f\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0454\3\2\2\2\u0453\u0451\3\2" +
					"\2\2\u0454\u0456\7\u013d\2\2\u0455\u0457\7T\2\2\u0456\u0455\3\2\2\2\u0456" +
					"\u0457\3\2\2\2\u0457\u0459\3\2\2\2\u0458\u045a\5\u00d8m\2\u0459\u0458" +
					"\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u047a\3\2\2\2\u045b\u045c\7d\2\2\u045c" +
					"\u045d\7\u0089\2\2\u045d\u045e\7\u013a\2\2\u045e\u0463\5\u0194\u00cb\2" +
					"\u045f\u0460\7\u012c\2\2\u0460\u0462\5\u0194\u00cb\2\u0461\u045f\3\2\2" +
					"\2\u0462\u0465\3\2\2\2\u0463\u0461\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0466" +
					"\3\2\2\2\u0465\u0463\3\2\2\2\u0466\u0467\7\u013d\2\2\u0467\u0468\7\u00c2" +
					"\2\2\u0468\u0469\5\u013e\u00a0\2\u0469\u046a\7\u013a\2\2\u046a\u046f\5" +
					"\u0194\u00cb\2\u046b\u046c\7\u012c\2\2\u046c\u046e\5\u0194\u00cb\2\u046d" +
					"\u046b\3\2\2\2\u046e\u0471\3\2\2\2\u046f\u046d\3\2\2\2\u046f\u0470\3\2" +
					"\2\2\u0470\u0472\3\2\2\2\u0471\u046f\3\2\2\2\u0472\u0476\7\u013d\2\2\u0473" +
					"\u0475\5x=\2\u0474\u0473\3\2\2\2\u0475\u0478\3\2\2\2\u0476\u0474\3\2\2" +
					"\2\u0476\u0477\3\2\2\2\u0477\u047a\3\2\2\2\u0478\u0476\3\2\2\2\u0479\u0440" +
					"\3\2\2\2\u0479\u045b\3\2\2\2\u047aw\3\2\2\2\u047b\u047c\7\u00ac\2\2\u047c" +
					"\u0485\t\t\2\2\u047d\u047e\7\u00a4\2\2\u047e\u0486\7\7\2\2\u047f\u0486" +
					"\7\u00c5\2\2\u0480\u0481\7\u00da\2\2\u0481\u0486\7\u00a9\2\2\u0482\u0483" +
					"\7\u00da\2\2\u0483\u0486\7A\2\2\u0484\u0486\7\35\2\2\u0485\u047d\3\2\2" +
					"\2\u0485\u047f\3\2\2\2\u0485\u0480\3\2\2\2\u0485\u0482\3\2\2\2\u0485\u0484" +
					"\3\2\2\2\u0486y\3\2\2\2\u0487\u0489\5|?\2\u0488\u0487\3\2\2\2\u0489\u048a" +
					"\3\2\2\2\u048a\u0488\3\2\2\2\u048a\u048b\3\2\2\2\u048b{\3\2\2\2\u048c" +
					"\u048d\7\u012c\2\2\u048d\u0490\5~@\2\u048e\u0490\5\u008aF\2\u048f\u048c" +
					"\3\2\2\2\u048f\u048e\3\2\2\2\u0490}\3\2\2\2\u0491\u0493\7\u00a4\2\2\u0492" +
					"\u0491\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\t\n" +
					"\2\2\u0495\177\3\2\2\2\u0496\u0498\5\u0082B\2\u0497\u0496\3\2\2\2\u0498" +
					"\u0499\3\2\2\2\u0499\u0497\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u0081\3\2" +
					"\2\2\u049b\u049c\7\u00ac\2\2\u049c\u049d\7+\2\2\u049d\u049e\t\13\2\2\u049e" +
					"\u04a8\7\u00ce\2\2\u049f\u04a8\5\u0084C\2\u04a0\u04a8\5\u0086D\2\u04a1" +
					"\u04a8\5\u0088E\2\u04a2\u04a8\5\u008aF\2\u04a3\u04a8\5\u0094K\2\u04a4" +
					"\u04a8\5\u0096L\2\u04a5\u04a8\5\u008cG\2\u04a6\u04a8\5\u008eH\2\u04a7" +
					"\u049b\3\2\2\2\u04a7\u049f\3\2\2\2\u04a7\u04a0\3\2\2\2\u04a7\u04a1\3\2" +
					"\2\2\u04a7\u04a2\3\2\2\2\u04a7\u04a3\3\2\2\2\u04a7\u04a4\3\2\2\2\u04a7" +
					"\u04a5\3\2\2\2\u04a7\u04a6\3\2\2\2\u04a8\u0083\3\2\2\2\u04a9\u04aa\7\u00d7" +
					"\2\2\u04aa\u04ab\7\64\2\2\u04ab\u04bc\t\f\2\2\u04ac\u04ad\t\r\2\2\u04ad" +
					"\u04bc\7\u0144\2\2\u04ae\u04bc\7\u00a5\2\2\u04af\u04bc\t\16\2\2\u04b0" +
					"\u04b1\7\u00e6\2\2\u04b1\u04b4\7\u013a\2\2\u04b2\u04b5\5\u0194\u00cb\2" +
					"\u04b3\u04b5\7\u0144\2\2\u04b4\u04b2\3\2\2\2\u04b4\u04b3\3\2\2\2\u04b5" +
					"\u04b6\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\3\2" +
					"\2\2\u04b8\u04bc\7\u013d\2\2\u04b9\u04ba\7\u00ed\2\2\u04ba\u04bc\5\u0194" +
					"\u00cb\2\u04bb\u04a9\3\2\2\2\u04bb\u04ac\3\2\2\2\u04bb\u04ae\3\2\2\2\u04bb" +
					"\u04af\3\2\2\2\u04bb\u04b0\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bc\u0085\3\2" +
					"\2\2\u04bd\u04bf\7v\2\2\u04be\u04bd\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf" +
					"\u04c0\3\2\2\2\u04c0\u04c1\7u\2\2\u04c1\u04df\5\u0194\u00cb\2\u04c2\u04c3" +
					"\7\u0109\2\2\u04c3\u04df\7\u00c4\2\2\u04c4\u04c5\7L\2\2\u04c5\u04c6\7" +
					"\32\2\2\u04c6\u04c7\7o\2\2\u04c7\u04c8\7\u013a\2\2\u04c8\u04cd\5\u0194" +
					"\u00cb\2\u04c9\u04ca\7\u012c\2\2\u04ca\u04cc\5\u0194\u00cb\2\u04cb\u04c9" +
					"\3\2\2\2\u04cc\u04cf\3\2\2\2\u04cd\u04cb\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce" +
					"\u04d0\3\2\2\2\u04cf\u04cd\3\2\2\2\u04d0\u04d1\7\u013d\2\2\u04d1\u04df" +
					"\3\2\2\2\u04d2\u04d4\7\u00a7\2\2\u04d3\u04d2\3\2\2\2\u04d3\u04d4\3\2\2" +
					"\2\u04d4\u04d5\3\2\2\2\u04d5\u04df\7\u0097\2\2\u04d6\u04d7\7,\2\2\u04d7" +
					"\u04df\t\17\2\2\u04d8\u04d9\7E\2\2\u04d9\u04df\7\u00ad\2\2\u04da\u04db" +
					"\7\u0109\2\2\u04db\u04dc\7\u00c5\2\2\u04dc\u04dd\7\u00ac\2\2\u04dd\u04df" +
					"\7O\2\2\u04de\u04be\3\2\2\2\u04de\u04c2\3\2\2\2\u04de\u04c4\3\2\2\2\u04de" +
					"\u04d3\3\2\2\2\u04de\u04d6\3\2\2\2\u04de\u04d8\3\2\2\2\u04de\u04da\3\2" +
					"\2\2\u04df\u0087\3\2\2\2\u04e0\u04e2\7\u00fa\2\2\u04e1\u04e0\3\2\2\2\u04e1" +
					"\u04e2\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4\7\u00bc\2\2\u04e4\u04e5" +
					"\7v\2\2\u04e5\u04e6\7\u013a\2\2\u04e6\u04eb\5\u0194\u00cb\2\u04e7\u04e8" +
					"\7\u012c\2\2\u04e8\u04ea\5\u0194\u00cb\2\u04e9\u04e7\3\2\2\2\u04ea\u04ed" +
					"\3\2\2\2\u04eb\u04e9\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ee\3\2\2\2\u04ed" +
					"\u04eb\3\2\2\2\u04ee\u04ef\7\u013d\2\2\u04ef\u04f3\3\2\2\2\u04f0\u04f1" +
					"\7\u0109\2\2\u04f1\u04f3\79\2\2\u04f2\u04e1\3\2\2\2\u04f2\u04f0\3\2\2" +
					"\2\u04f3\u0089\3\2\2\2\u04f4\u04f9\5\u0090I\2\u04f5\u04f6\7\u00e7\2\2" +
					"\u04f6\u04f7\7\13\2\2\u04f7\u04f9\5\u0194\u00cb\2\u04f8\u04f4\3\2\2\2" +
					"\u04f8\u04f5\3\2\2\2\u04f9\u008b\3\2\2\2\u04fa\u04fb\7\u0092\2\2\u04fb" +
					"\u0500\5\u0196\u00cc\2\u04fc\u04fd\7\u012c\2\2\u04fd\u04ff\5\u0196\u00cc" +
					"\2\u04fe\u04fc\3\2\2\2\u04ff\u0502\3\2\2\2\u0500\u04fe\3\2\2\2\u0500\u0501" +
					"\3\2\2\2\u0501\u008d\3\2\2\2\u0502\u0500\3\2\2\2\u0503\u0504\7G\2\2\u0504" +
					"\u0505\7\32\2\2\u0505\u0506\5\u0196\u00cc\2\u0506\u008f\3\2\2\2\u0507" +
					"\u0508\7\u00cd\2\2\u0508\u0509\7e\2\2\u0509\u050d\7G\2\2\u050a\u050c\5" +
					"\u0092J\2\u050b\u050a\3\2\2\2\u050c\u050f\3\2\2\2\u050d\u050b\3\2\2\2" +
					"\u050d\u050e\3\2\2\2\u050e\u0091\3\2\2\2\u050f\u050d\3\2\2\2\u0510\u0511" +
					"\7a\2\2\u0511\u0512\7\u00ef\2\2\u0512\u0513\7\32\2\2\u0513\u0517\5\u0164" +
					"\u00b3\2\u0514\u0515\7W\2\2\u0515\u0516\7\32\2\2\u0516\u0518\5\u0164\u00b3" +
					"\2\u0517\u0514\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u052c\3\2\2\2\u0519\u051a" +
					"\7(\2\2\u051a\u051b\7\u0086\2\2\u051b\u051c\7\u00ef\2\2\u051c\u051d\7" +
					"\32\2\2\u051d\u052c\5\u0164\u00b3\2\u051e\u051f\7\u009a\2\2\u051f\u0520" +
					"\7\u008a\2\2\u0520\u0521\7\u00ef\2\2\u0521\u0522\7\32\2\2\u0522\u052c" +
					"\5\u0164\u00b3\2\u0523\u0524\7\u0090\2\2\u0524\u0525\7\u00ef\2\2\u0525" +
					"\u0526\7\32\2\2\u0526\u052c\5\u0164\u00b3\2\u0527\u0528\7\u00a9\2\2\u0528" +
					"\u0529\7C\2\2\u0529\u052a\7\13\2\2\u052a\u052c\5\u0164\u00b3\2\u052b\u0510" +
					"\3\2\2\2\u052b\u0519\3\2\2\2\u052b\u051e\3\2\2\2\u052b\u0523\3\2\2\2\u052b" +
					"\u0527\3\2\2\2\u052c\u0093\3\2\2\2\u052d\u052e\7\u00ac\2\2\u052e\u0532" +
					"\5\u0194\u00cb\2\u052f\u0530\7\u00f0\2\2\u0530\u0532\5\u0194\u00cb\2\u0531" +
					"\u052d\3\2\2\2\u0531\u052f\3\2\2\2\u0532\u0095\3\2\2\2\u0533\u0535\7\17" +
					"\2\2\u0534\u0536\7\u0130\2\2\u0535\u0534\3\2\2\2\u0535\u0536\3\2\2\2\u0536" +
					"\u0537\3\2\2\2\u0537\u054f\5\u0164\u00b3\2\u0538\u053a\7)\2\2\u0539\u053b" +
					"\7\u0130\2\2\u053a\u0539\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053c\3\2\2" +
					"\2\u053c\u054f\5\u0164\u00b3\2\u053d\u053f\7A\2\2\u053e\u053d\3\2\2\2" +
					"\u053e\u053f\3\2\2\2\u053f\u0543\3\2\2\2\u0540\u0541\7\"\2\2\u0541\u0544" +
					"\7\u00da\2\2\u0542\u0544\7#\2\2\u0543\u0540\3\2\2\2\u0543\u0542\3\2\2" +
					"\2\u0544\u0546\3\2\2\2\u0545\u0547\7\u0130\2\2\u0546\u0545\3\2\2\2\u0546" +
					"\u0547\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u054f\5\u0164\u00b3\2\u0549\u054b" +
					"\7V\2\2\u054a\u054c\7\u0130\2\2\u054b\u054a\3\2\2\2\u054b\u054c\3\2\2" +
					"\2\u054c\u054d\3\2\2\2\u054d\u054f\5\u0164\u00b3\2\u054e\u0533\3\2\2\2" +
					"\u054e\u0538\3\2\2\2\u054e\u053e\3\2\2\2\u054e\u0549\3\2\2\2\u054f\u0097" +
					"\3\2\2\2\u0550\u0580\7!\2\2\u0551\u0580\7\23\2\2\u0552\u0580\7\24\2\2" +
					"\u0553\u0580\7\25\2\2\u0554\u0580\7\26\2\2\u0555\u0580\7\27\2\2\u0556" +
					"\u0580\7:\2\2\u0557\u0580\7;\2\2\u0558\u0580\7>\2\2\u0559\u0580\7?\2\2" +
					"\u055a\u055c\7N\2\2\u055b\u055d\7\u00ba\2\2\u055c\u055b\3\2\2\2\u055c" +
					"\u055d\3\2\2\2\u055d\u0580\3\2\2\2\u055e\u0580\7b\2\2\u055f\u0580\7{\2" +
					"\2\u0560\u0580\7|\2\2\u0561\u0580\7}\2\2\u0562\u0580\7~\2\2\u0563\u0580" +
					"\7\177\2\2\u0564\u0580\7\u00a2\2\2\u0565\u0580\7\u00a3\2\2\u0566\u0580" +
					"\7\u00ab\2\2\u0567\u0580\7\u00aa\2\2\u0568\u0580\7\u00b9\2\2\u0569\u0580" +
					"\7\u00c1\2\2\u056a\u056b\7\u00c7\2\2\u056b\u0580\7\u0104\2\2\u056c\u0580" +
					"\7\u00de\2\2\u056d\u0580\7\u00dd\2\2\u056e\u0580\7\u00df\2\2\u056f\u0580" +
					"\7\u00e1\2\2\u0570\u0580\7\u00e0\2\2\u0571\u0580\7\u00e8\2\2\u0572\u0580" +
					"\7\u00eb\2\2\u0573\u0580\7\u00f2\2\2\u0574\u0580\7\u00f3\2\2\u0575\u0580" +
					"\7\u0102\2\2\u0576\u0580\7\u0103\2\2\u0577\u0580\7\u010b\2\2\u0578\u0580" +
					"\7\u0127\2\2\u0579\u0580\7\u0128\2\2\u057a\u057d\5\u0194\u00cb\2\u057b" +
					"\u057c\7\5\2\2\u057c\u057e\7\u00f8\2\2\u057d\u057b\3\2\2\2\u057d\u057e" +
					"\3\2\2\2\u057e\u0580\3\2\2\2\u057f\u0550\3\2\2\2\u057f\u0551\3\2\2\2\u057f" +
					"\u0552\3\2\2\2\u057f\u0553\3\2\2\2\u057f\u0554\3\2\2\2\u057f\u0555\3\2" +
					"\2\2\u057f\u0556\3\2\2\2\u057f\u0557\3\2\2\2\u057f\u0558\3\2\2\2\u057f" +
					"\u0559\3\2\2\2\u057f\u055a\3\2\2\2\u057f\u055e\3\2\2\2\u057f\u055f\3\2" +
					"\2\2\u057f\u0560\3\2\2\2\u057f\u0561\3\2\2\2\u057f\u0562\3\2\2\2\u057f" +
					"\u0563\3\2\2\2\u057f\u0564\3\2\2\2\u057f\u0565\3\2\2\2\u057f\u0566\3\2" +
					"\2\2\u057f\u0567\3\2\2\2\u057f\u0568\3\2\2\2\u057f\u0569\3\2\2\2\u057f" +
					"\u056a\3\2\2\2\u057f\u056c\3\2\2\2\u057f\u056d\3\2\2\2\u057f\u056e\3\2" +
					"\2\2\u057f\u056f\3\2\2\2\u057f\u0570\3\2\2\2\u057f\u0571\3\2\2\2\u057f" +
					"\u0572\3\2\2\2\u057f\u0573\3\2\2\2\u057f\u0574\3\2\2\2\u057f\u0575\3\2" +
					"\2\2\u057f\u0576\3\2\2\2\u057f\u0577\3\2\2\2\u057f\u0578\3\2\2\2\u057f" +
					"\u0579\3\2\2\2\u057f\u057a\3\2\2\2\u0580\u0099\3\2\2\2\u0581\u0582\7\u013a" +
					"\2\2\u0582\u0584\t\20\2\2\u0583\u0585\t\21\2\2\u0584\u0583\3\2\2\2\u0584" +
					"\u0585\3\2\2\2\u0585\u0588\3\2\2\2\u0586\u0587\7\u012c\2\2\u0587\u0589" +
					"\7\u0144\2\2\u0588\u0586\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058a\3\2\2" +
					"\2\u058a\u058b\7\u013d\2\2\u058b\u009b\3\2\2\2\u058c\u058e\7\u00a7\2\2" +
					"\u058d\u058c\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0598" +
					"\7\u00a9\2\2\u0590\u0591\7\"\2\2\u0591\u0592\7\u00da\2\2\u0592\u0598\5" +
					"\u0194\u00cb\2\u0593\u0595\7\u00a7\2\2\u0594\u0593\3\2\2\2\u0594\u0595" +
					"\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u0598\t\22\2\2\u0597\u058d\3\2\2\2" +
					"\u0597\u0590\3\2\2\2\u0597\u0594\3\2\2\2\u0598\u009d\3\2\2\2\u0599\u059b" +
					"\7\u012b\2\2\u059a\u0599\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059c\3\2\2" +
					"\2\u059c\u059d\7\u0130\2\2\u059d\u05a6\5\u0164\u00b3\2\u059e\u05a0\7\u0109" +
					"\2\2\u059f\u059e\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1" +
					"\u05a3\7A\2\2\u05a2\u05a4\5\u0164\u00b3\2\u05a3\u05a2\3\2\2\2\u05a3\u05a4" +
					"\3\2\2\2\u05a4\u05a6\3\2\2\2\u05a5\u059a\3\2\2\2\u05a5\u059f\3\2\2\2\u05a6" +
					"\u009f\3\2\2\2\u05a7\u05a8\7\63\2\2\u05a8\u05ac\t\23\2\2\u05a9\u05aa\7" +
					"s\2\2\u05aa\u05ab\7\u00a7\2\2\u05ab\u05ad\7]\2\2\u05ac\u05a9\3\2\2\2\u05ac" +
					"\u05ad\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05b2\5\u0164\u00b3\2\u05af\u05b1" +
					"\5\u00a2R\2\u05b0\u05af\3\2\2\2\u05b1\u05b4\3\2\2\2\u05b2\u05b0\3\2\2" +
					"\2\u05b2\u05b3\3\2\2\2\u05b3\u00a1\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b5\u05b6" +
					"\7)\2\2\u05b6\u05ba\5\u0164\u00b3\2\u05b7\u05b8\7\u0092\2\2\u05b8\u05ba" +
					"\5\u0164\u00b3\2\u05b9\u05b5\3\2\2\2\u05b9\u05b7\3\2\2\2\u05ba\u00a3\3" +
					"\2\2\2\u05bb\u05c3\7\t\2\2\u05bc\u05bf\7\63\2\2\u05bd\u05be\7\u00af\2" +
					"\2\u05be\u05c0\7\u00c4\2\2\u05bf\u05bd\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0" +
					"\u05c3\3\2\2\2\u05c1\u05c3\7\u00c4\2\2\u05c2\u05bb\3\2\2\2\u05c2\u05bc" +
					"\3\2\2\2\u05c2\u05c1\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4" +
					"\u05c5\7i\2\2\u05c5\u05c7\5\u0194\u00cb\2\u05c6\u05c8\5\u00b6\\\2\u05c7" +
					"\u05c6\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05cb\5\u00a6" +
					"T\2\u05ca\u05cc\t\24\2\2\u05cb\u05ca\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc" +
					"\u05ce\3\2\2\2\u05cd\u05cf\5L\'\2\u05ce\u05cd\3\2\2\2\u05ce\u05cf\3\2" +
					"\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d1\5\b\5\2\u05d1\u00a5\3\2\2\2\u05d2" +
					"\u05d3\t\25\2\2\u05d3\u05d5\5\u0098M\2\u05d4\u05d6\5\u009aN\2\u05d5\u05d4" +
					"\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u00a7\3\2\2\2\u05d7\u05df\7\t\2\2\u05d8" +
					"\u05db\7\63\2\2\u05d9\u05da\7\u00af\2\2\u05da\u05dc\7\u00c4\2\2\u05db" +
					"\u05d9\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc\u05df\3\2\2\2\u05dd\u05df\7\u00c4" +
					"\2\2\u05de\u05d7\3\2\2\2\u05de\u05d8\3\2\2\2\u05de\u05dd\3\2\2\2\u05de" +
					"\u05df\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e1\7\u00b5\2\2\u05e1\u05e2" +
					"\5\u0194\u00cb\2\u05e2\u05e3\t\24\2\2\u05e3\u05e4\5\u00aaV\2\u05e4\u05e8" +
					"\7U\2\2\u05e5\u05e6\5\u0194\u00cb\2\u05e6\u05e7\7\u013f\2\2\u05e7\u05e9" +
					"\3\2\2\2\u05e8\u05e5\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u00a9\3\2\2\2\u05ea" +
					"\u05eb\5\u00acW\2\u05eb\u05f1\7\u013f\2\2\u05ec\u05ed\5\u00acW\2\u05ed" +
					"\u05ee\7\u013f\2\2\u05ee\u05f0\3\2\2\2\u05ef\u05ec\3\2\2\2\u05f0\u05f3" +
					"\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u00ab\3\2\2\2\u05f3" +
					"\u05f1\3\2\2\2\u05f4\u0602\5N(\2\u05f5\u05f6\7i\2\2\u05f6\u05f8\5\u0194" +
					"\u00cb\2\u05f7\u05f9\5\u00b6\\\2\u05f8\u05f7\3\2\2\2\u05f8\u05f9\3\2\2" +
					"\2\u05f9\u05fa\3\2\2\2\u05fa\u05fb\5\u00a6T\2\u05fb\u0602\3\2\2\2\u05fc" +
					"\u05fd\t\26\2\2\u05fd\u05ff\5\u0194\u00cb\2\u05fe\u0600\5\u00b6\\\2\u05ff" +
					"\u05fe\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0602\3\2\2\2\u0601\u05f4\3\2" +
					"\2\2\u0601\u05f5\3\2\2\2\u0601\u05fc\3\2\2\2\u0602\u00ad\3\2\2\2\u0603" +
					"\u060b\7\t\2\2\u0604\u0607\7\63\2\2\u0605\u0606\7\u00af\2\2\u0606\u0608" +
					"\7\u00c4\2\2\u0607\u0605\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u060b\3\2\2" +
					"\2\u0609\u060b\7\u00c4\2\2\u060a\u0603\3\2\2\2\u060a\u0604\3\2\2\2\u060a" +
					"\u0609\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\7\u00b5" +
					"\2\2\u060d\u060e\7\30\2\2\u060e\u060f\5\u0194\u00cb\2\u060f\u0610\t\24" +
					"\2\2\u0610\u0611\5\u00b0Y\2\u0611\u0615\7U\2\2\u0612\u0613\5\u0194\u00cb" +
					"\2\u0613\u0614\7\u013f\2\2\u0614\u0616\3\2\2\2\u0615\u0612\3\2\2\2\u0615" +
					"\u0616\3\2\2\2\u0616\u00af\3\2\2\2\u0617\u0618\5\u00b2Z\2\u0618\u061e" +
					"\7\u013f\2\2\u0619\u061a\5\u00b2Z\2\u061a\u061b\7\u013f\2\2\u061b\u061d" +
					"\3\2\2\2\u061c\u0619\3\2\2\2\u061d\u0620\3\2\2\2\u061e\u061c\3\2\2\2\u061e" +
					"\u061f\3\2\2\2\u061f\u00b1\3\2\2\2\u0620\u061e\3\2\2\2\u0621\u0625\5N" +
					"(\2\u0622\u0625\5\u00a4S\2\u0623\u0625\5\u00b4[\2\u0624\u0621\3\2\2\2" +
					"\u0624\u0622\3\2\2\2\u0624\u0623\3\2\2\2\u0625\u00b3\3\2\2\2\u0626\u062e" +
					"\7\t\2\2\u0627\u062a\7\63\2\2\u0628\u0629\7\u00af\2\2\u0629\u062b\7\u00c4" +
					"\2\2\u062a\u0628\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u062e\3\2\2\2\u062c" +
					"\u062e\7\u00c4\2\2\u062d\u0626\3\2\2\2\u062d\u0627\3\2\2\2\u062d\u062c" +
					"\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0630\t\26\2\2" +
					"\u0630\u0632\5\u0194\u00cb\2\u0631\u0633\5\u00b6\\\2\u0632\u0631\3\2\2" +
					"\2\u0632\u0633\3\2\2\2\u0633\u0635\3\2\2\2\u0634\u0636\5\u00ba^\2\u0635" +
					"\u0634\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0638\3\2\2\2\u0637\u0639\t\24" +
					"\2\2\u0638\u0637\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063b\3\2\2\2\u063a" +
					"\u063c\5L\'\2\u063b\u063a\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u063e\3\2" +
					"\2\2\u063d\u063f\5\u0110\u0089\2\u063e\u063d\3\2\2\2\u063e\u063f\3\2\2" +
					"\2\u063f\u0640\3\2\2\2\u0640\u0644\5\f\7\2\u0641\u0642\5\u0194\u00cb\2" +
					"\u0642\u0643\7\u013f\2\2\u0643\u0645\3\2\2\2\u0644\u0641\3\2\2\2\u0644" +
					"\u0645\3\2\2\2\u0645\u00b5\3\2\2\2\u0646\u0647\7\u013a\2\2\u0647\u065d" +
					"\7\u013d\2\2\u0648\u0649\7\u013a\2\2\u0649\u064e\5\u00b8]\2\u064a\u064b" +
					"\7\u012c\2\2\u064b\u064d\5\u00b8]\2\u064c\u064a\3\2\2\2\u064d\u0650\3" +
					"\2\2\2\u064e\u064c\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0651\3\2\2\2\u0650" +
					"\u064e\3\2\2\2\u0651\u0652\7\u013d\2\2\u0652\u065d\3\2\2\2\u0653\u0654" +
					"\6\\\4\2\u0654\u0659\5\u00b8]\2\u0655\u0656\7\u012c\2\2\u0656\u0658\5" +
					"\u00b8]\2\u0657\u0655\3\2\2\2\u0658\u065b\3\2\2\2\u0659\u0657\3\2\2\2" +
					"\u0659\u065a\3\2\2\2\u065a\u065d\3\2\2\2\u065b\u0659\3\2\2\2\u065c\u0646" +
					"\3\2\2\2\u065c\u0648\3\2\2\2\u065c\u0653\3\2\2\2\u065d\u00b7\3\2\2\2\u065e" +
					"\u0664\7u\2\2\u065f\u0664\7\u00b1\2\2\u0660\u0664\7y\2\2\u0661\u0662\7" +
					"u\2\2\u0662\u0664\7\u00b1\2\2\u0663\u065e\3\2\2\2\u0663\u065f\3\2\2\2" +
					"\u0663\u0660\3\2\2\2\u0663\u0661\3\2\2\2\u0663\u0664\3\2\2\2\u0664\u0665" +
					"\3\2\2\2\u0665\u0666\5\u0194\u00cb\2\u0666\u0668\5\u0098M\2\u0667\u0669" +
					"\5\u009aN\2\u0668\u0667\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066d\3\2\2" +
					"\2\u066a\u066c\5\u009cO\2\u066b\u066a\3\2\2\2\u066c\u066f\3\2\2\2\u066d" +
					"\u066b\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u0671\3\2\2\2\u066f\u066d\3\2" +
					"\2\2\u0670\u0672\5\u009eP\2\u0671\u0670\3\2\2\2\u0671\u0672\3\2\2\2\u0672" +
					"\u0689\3\2\2\2\u0673\u0679\5\u0194\u00cb\2\u0674\u067a\7u\2\2\u0675\u067a" +
					"\7\u00b1\2\2\u0676\u067a\7y\2\2\u0677\u0678\7u\2\2\u0678\u067a\7\u00b1" +
					"\2\2\u0679\u0674\3\2\2\2\u0679\u0675\3\2\2\2\u0679\u0676\3\2\2\2\u0679" +
					"\u0677\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067d\5\u0098" +
					"M\2\u067c\u067e\5\u009aN\2\u067d\u067c\3\2\2\2\u067d\u067e\3\2\2\2\u067e" +
					"\u0682\3\2\2\2\u067f\u0681\5\u009cO\2\u0680\u067f\3\2\2\2\u0681\u0684" +
					"\3\2\2\2\u0682\u0680\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u0686\3\2\2\2\u0684" +
					"\u0682\3\2\2\2\u0685\u0687\5\u009eP\2\u0686\u0685\3\2\2\2\u0686\u0687" +
					"\3\2\2\2\u0687\u0689\3\2\2\2\u0688\u0663\3\2\2\2\u0688\u0673\3\2\2\2\u0689" +
					"\u00b9\3\2\2\2\u068a\u068c\5\u00bc_\2\u068b\u068a\3\2\2\2\u068c\u068d" +
					"\3\2\2\2\u068d\u068b\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u00bb\3\2\2\2\u068f" +
					"\u0690\7\u008b\2\2\u0690\u069b\7\u00e2\2\2\u0691\u0692\7\u00e2\2\2\u0692" +
					"\u0693\7\u00d6\2\2\u0693\u069b\t\27\2\2\u0694\u0696\7P\2\2\u0695\u0694" +
					"\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u0698\7\u00c6\2" +
					"\2\u0698\u0699\7\u00db\2\2\u0699\u069b\7\u0144\2\2\u069a\u068f\3\2\2\2" +
					"\u069a\u0691\3\2\2\2\u069a\u0695\3\2\2\2\u069b\u00bd\3\2\2\2\u069c\u069e" +
					"\t\30\2\2\u069d\u069f\7t\2\2\u069e\u069d\3\2\2\2\u069e\u069f\3\2\2\2\u069f" +
					"\u06a0\3\2\2\2\u06a0\u06a6\5\u0164\u00b3\2\u06a1\u06a2\7\u013a\2\2\u06a2" +
					"\u06a3\5\u0184\u00c3\2\u06a3\u06a4\7\u013d\2\2\u06a4\u06a7\3\2\2\2\u06a5" +
					"\u06a7\5\u0184\u00c3\2\u06a6\u06a1\3\2\2\2\u06a6\u06a5\3\2\2\2\u06a6\u06a7" +
					"\3\2\2\2\u06a7\u06b1\3\2\2\2\u06a8\u06a9\7\u0082\2\2\u06a9\u06ae\7\u0141" +
					"\2\2\u06aa\u06ab\7\u012c\2\2\u06ab\u06ad\7\u0141\2\2\u06ac\u06aa\3\2\2" +
					"\2\u06ad\u06b0\3\2\2\2\u06ae\u06ac\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u06b2" +
					"\3\2\2\2\u06b0\u06ae\3\2\2\2\u06b1\u06a8\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2" +
					"\u06b4\3\2\2\2\u06b3\u06b5\5\u0112\u008a\2\u06b4\u06b3\3\2\2\2\u06b4\u06b5" +
					"\3\2\2\2\u06b5\u00bf\3\2\2\2\u06b6\u06ba\5\u00c2b\2\u06b7\u06ba\5\u00c4" +
					"c\2\u06b8\u06ba\5\u00c6d\2\u06b9\u06b6\3\2\2\2\u06b9\u06b7\3\2\2\2\u06b9" +
					"\u06b8\3\2\2\2\u06ba\u00c1\3\2\2\2\u06bb\u06bc\7s\2\2\u06bc\u06bd\5\u014e" +
					"\u00a8\2\u06bd\u06be\7\u00f1\2\2\u06be\u06c2\5\4\3\2\u06bf\u06c1\5\u00c8" +
					"e\2\u06c0\u06bf\3\2\2\2\u06c1\u06c4\3\2\2\2\u06c2\u06c0\3\2\2\2\u06c2" +
					"\u06c3\3\2\2\2\u06c3\u06c6\3\2\2\2\u06c4\u06c2\3\2\2\2\u06c5\u06c7\5\u00ca" +
					"f\2\u06c6\u06c5\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8" +
					"\u06c9\7U\2\2\u06c9\u06ca\7s\2\2\u06ca\u00c3\3\2\2\2\u06cb\u06cc\7s\2" +
					"\2\u06cc\u06cd\5\u014e\u00a8\2\u06cd\u06d0\5\b\5\2\u06ce\u06cf\7Q\2\2" +
					"\u06cf\u06d1\5\b\5\2\u06d0\u06ce\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u00c5" +
					"\3\2\2\2\u06d2\u06d3\7\6\2\2\u06d3\u06d4\7s\2\2\u06d4\u06d5\5\u014e\u00a8" +
					"\2\u06d5\u06d6\7\u00f1\2\2\u06d6\u06d7\5\b\5\2\u06d7\u00c7\3\2\2\2\u06d8" +
					"\u06d9\t\31\2\2\u06d9\u06da\5\u014e\u00a8\2\u06da\u06db\7\u00f1\2\2\u06db" +
					"\u06dc\5\4\3\2\u06dc\u00c9\3\2\2\2\u06dd\u06de\7Q\2\2\u06de\u06df\5\4" +
					"\3\2\u06df\u00cb\3\2\2\2\u06e0\u06e2\7^\2\2\u06e1\u06e3\7\u0141\2\2\u06e2" +
					"\u06e1\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e6\3\2\2\2\u06e4\u06e5\7\u0106" +
					"\2\2\u06e5\u06e7\5\u014e\u00a8\2\u06e6\u06e4\3\2\2\2\u06e6\u06e7\3\2\2" +
					"\2\u06e7\u00cd\3\2\2\2\u06e8\u06ea\7\u008c\2\2\u06e9\u06eb\7\u0141\2\2" +
					"\u06ea\u06e9\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u00cf\3\2\2\2\u06ec\u06ed" +
					"\7&\2\2\u06ed\u06ee\t\32\2\2\u06ee\u06ef\5\u00d2j\2\u06ef\u06f0\7\u012c" +
					"\2\2\u06f0\u06f1\5\u00d2j\2\u06f1\u00d1\3\2\2\2\u06f2\u06f4\5\u013e\u00a0" +
					"\2\u06f3\u06f5\5\u0140\u00a1\2\u06f4\u06f3\3\2\2\2\u06f4\u06f5\3\2\2\2" +
					"\u06f5\u06fb\3\2\2\2\u06f6\u06f7\7\u013a\2\2\u06f7\u06f8\5\u0114\u008b" +
					"\2\u06f8\u06f9\7\u013d\2\2\u06f9\u06fb\3\2\2\2\u06fa\u06f2\3\2\2\2\u06fa" +
					"\u06f6\3\2\2\2\u06fb\u06fe\3\2\2\2\u06fc\u06fd\7\16\2\2\u06fd\u06ff\5" +
					"\u0194\u00cb\2\u06fe\u06fc\3\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u00d3\3\2" +
					"\2\2\u0700\u0702\7\63\2\2\u0701\u0703\7\u00fa\2\2\u0702\u0701\3\2\2\2" +
					"\u0702\u0703\3\2\2\2\u0703\u0704\3\2\2\2\u0704\u0705\7v\2\2\u0705\u0706" +
					"\5\u0194\u00cb\2\u0706\u0707\7\u00ac\2\2\u0707\u0708\5\u013e\u00a0\2\u0708" +
					"\u0709\7\u013a\2\2\u0709\u070e\5\u00d6l\2\u070a\u070b\7\u012c\2\2\u070b" +
					"\u070d\5\u00d6l\2\u070c\u070a\3\2\2\2\u070d\u0710\3\2\2\2\u070e\u070c" +
					"\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0711\3\2\2\2\u0710\u070e\3\2\2\2\u0711" +
					"\u0712\7\u013d\2\2\u0712\u00d5\3\2\2\2\u0713\u0715\5\u0194\u00cb\2\u0714" +
					"\u0716\t\b\2\2\u0715\u0714\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u00d7\3\2" +
					"\2\2\u0717\u0718\5\u00dan\2\u0718\u00d9\3\2\2\2\u0719\u071a\7\u0109\2" +
					"\2\u071a\u071b\7\u013a\2\2\u071b\u071c\5\u0194\u00cb\2\u071c\u071d\7\u0130" +
					"\2\2\u071d\u0725\5\u0194\u00cb\2\u071e\u071f\7\u012c\2\2\u071f\u0720\5" +
					"\u0194\u00cb\2\u0720\u0721\7\u0130\2\2\u0721\u0722\5\u0194\u00cb\2\u0722" +
					"\u0724\3\2\2\2\u0723\u071e\3\2\2\2\u0724\u0727\3\2\2\2\u0725\u0723\3\2" +
					"\2\2\u0725\u0726\3\2\2\2\u0726\u0728\3\2\2\2\u0727\u0725\3\2\2\2\u0728" +
					"\u072c\7\u013d\2\2\u0729\u072b\5\u0094K\2\u072a\u0729\3\2\2\2\u072b\u072e" +
					"\3\2\2\2\u072c\u072a\3\2\2\2\u072c\u072d\3\2\2\2\u072d\u00db\3\2\2\2\u072e" +
					"\u072c\3\2\2\2\u072f\u0731\7\6\2\2\u0730\u072f\3\2\2\2\u0730\u0731\3\2" +
					"\2\2\u0731\u0732\3\2\2\2\u0732\u0734\7\u00c0\2\2\u0733\u0735\5\u0164\u00b3" +
					"\2\u0734\u0733\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u00dd\3\2\2\2\u0736\u0738" +
					"\7\u00c8\2\2\u0737\u0739\5\u0164\u00b3\2\u0738\u0737\3\2\2\2\u0738\u0739" +
					"\3\2\2\2\u0739\u00df\3\2\2\2\u073a\u0745\5\u00e2r\2\u073b\u0745\5\u00f2" +
					"z\2\u073c\u0745\5\u00ecw\2\u073d\u0745\5\u0106\u0084\2\u073e\u0745\5\u0102" +
					"\u0082\2\u073f\u0745\5\u0104\u0083\2\u0740\u0745\5\u0100\u0081\2\u0741" +
					"\u0745\5\u0188\u00c5\2\u0742\u0745\5h\65\2\u0743\u0745\5V,\2\u0744\u073a" +
					"\3\2\2\2\u0744\u073b\3\2\2\2\u0744\u073c\3\2\2\2\u0744\u073d\3\2\2\2\u0744" +
					"\u073e\3\2\2\2\u0744\u073f\3\2\2\2\u0744\u0740\3\2\2\2\u0744\u0741\3\2" +
					"\2\2\u0744\u0742\3\2\2\2\u0744\u0743\3\2\2\2\u0745\u00e1\3\2\2\2\u0746" +
					"\u0747\5\u00e4s\2\u0747\u0748\5\u00eav\2\u0748\u00e3\3\2\2\2\u0749\u074a" +
					"\5\u0098M\2\u074a\u074b\5\u0194\u00cb\2\u074b\u074d\7\u013a\2\2\u074c" +
					"\u074e\5\u00e6t\2\u074d\u074c\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u074f" +
					"\3\2\2\2\u074f\u0750\7\u013d\2\2\u0750\u00e5\3\2\2\2\u0751\u0756\5\u00e8" +
					"u\2\u0752\u0753\7\u012c\2\2\u0753\u0755\5\u00e8u\2\u0754\u0752\3\2\2\2" +
					"\u0755\u0758\3\2\2\2\u0756\u0754\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u00e7" +
					"\3\2\2\2\u0758\u0756\3\2\2\2\u0759\u075a\5\u0098M\2\u075a\u075b\5\u0194" +
					"\u00cb\2\u075b\u00e9\3\2\2\2\u075c\u075d\5\u0108\u0085\2\u075d\u00eb\3" +
					"\2\2\2\u075e\u075f\7s\2\2\u075f\u0760\7\u013a\2\2\u0760\u0761\5\u014e" +
					"\u00a8\2\u0761\u0762\7\u013d\2\2\u0762\u0766\5\u00fe\u0080\2\u0763\u0765" +
					"\5\u00eex\2\u0764\u0763\3\2\2\2\u0765\u0768\3\2\2\2\u0766\u0764\3\2\2" +
					"\2\u0766\u0767\3\2\2\2\u0767\u076a\3\2\2\2\u0768\u0766\3\2\2\2\u0769\u076b" +
					"\5\u00f0y\2\u076a\u0769\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u00ed\3\2\2" +
					"\2\u076c\u076d\t\31\2\2\u076d\u076e\7\u013a\2\2\u076e\u076f\5\u014e\u00a8" +
					"\2\u076f\u0770\7\u013d\2\2\u0770\u0771\5\u00fe\u0080\2\u0771\u00ef\3\2" +
					"\2\2\u0772\u0773\7Q\2\2\u0773\u0774\5\u00fe\u0080\2\u0774\u00f1\3\2\2" +
					"\2\u0775\u0776\5\u00f4{\2\u0776\u0777\5\u00fe\u0080\2\u0777\u00f3\3\2" +
					"\2\2\u0778\u0779\7c\2\2\u0779\u077a\7\u013a\2\2\u077a\u077b\5\u00f6|\2" +
					"\u077b\u077c\7\u013f\2\2\u077c\u077d\5\u014e\u00a8\2\u077d\u077e\7\u013f" +
					"\2\2\u077e\u077f\5\u00fa~\2\u077f\u0780\7\u013d\2\2\u0780\u00f5\3\2\2" +
					"\2\u0781\u0786\5\u00f8}\2\u0782\u0783\7\u012c\2\2\u0783\u0785\5\u00f8" +
					"}\2\u0784\u0782\3\2\2\2\u0785\u0788\3\2\2\2\u0786\u0784\3\2\2\2\u0786" +
					"\u0787\3\2\2\2\u0787\u00f7\3\2\2\2\u0788\u0786\3\2\2\2\u0789\u078b\5\u0098" +
					"M\2\u078a\u0789\3\2\2\2\u078a\u078b\3\2\2\2\u078b\u078c\3\2\2\2\u078c" +
					"\u078d\5\u0194\u00cb\2\u078d\u078e\7\u0130\2\2\u078e\u078f\7\u0144\2\2" +
					"\u078f\u00f9\3\2\2\2\u0790\u0795\5\u00fc\177\2\u0791\u0792\7\u012c\2\2" +
					"\u0792\u0794\5\u00fc\177\2\u0793\u0791\3\2\2\2\u0794\u0797\3\2\2\2\u0795" +
					"\u0793\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u00fb\3\2\2\2\u0797\u0795\3\2" +
					"\2\2\u0798\u0799\5\u0194\u00cb\2\u0799\u079a\7\u012a\2\2\u079a\u079b\7" +
					"\u012a\2\2\u079b\u07b2\3\2\2\2\u079c\u079d\5\u0194\u00cb\2\u079d\u079e" +
					"\7\u0130\2\2\u079e\u079f\5\u0194\u00cb\2\u079f\u07b2\3\2\2\2\u07a0\u07a1" +
					"\5\u0194\u00cb\2\u07a1\u07a2\7\u0130\2\2\u07a2\u07a3\5\u0194\u00cb\2\u07a3" +
					"\u07a4\t\33\2\2\u07a4\u07a9\5\u0194\u00cb\2\u07a5\u07a6\t\33\2\2\u07a6" +
					"\u07a8\5\u0194\u00cb\2\u07a7\u07a5\3\2\2\2\u07a8\u07ab\3\2\2\2\u07a9\u07a7" +
					"\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07b2\3\2\2\2\u07ab\u07a9\3\2\2\2\u07ac" +
					"\u07ad\5\u0194\u00cb\2\u07ad\u07ae\t\33\2\2\u07ae\u07af\7\u0130\2\2\u07af" +
					"\u07b0\5\u0194\u00cb\2\u07b0\u07b2\3\2\2\2\u07b1\u0798\3\2\2\2\u07b1\u079c" +
					"\3\2\2\2\u07b1\u07a0\3\2\2\2\u07b1\u07ac\3\2\2\2\u07b2\u00fd\3\2\2\2\u07b3" +
					"\u07b6\5\u0108\u0085\2\u07b4\u07b6\5\u00e0q\2\u07b5\u07b3\3\2\2\2\u07b5" +
					"\u07b4\3\2\2\2\u07b6\u00ff\3\2\2\2\u07b7\u07ba\5\u0098M\2\u07b8\u07ba" +
					"\7\u0101\2\2\u07b9\u07b7\3\2\2\2\u07b9\u07b8\3\2\2\2\u07ba\u07bb\3\2\2" +
					"\2\u07bb\u07bc\5\u0194\u00cb\2\u07bc\u07bd\7\u0130\2\2\u07bd\u07be\5\16" +
					"\b\2\u07be\u07bf\7\u013f\2\2\u07bf\u0101\3\2\2\2\u07c0\u07c3\5\u0098M" +
					"\2\u07c1\u07c3\7\u0101\2\2\u07c2\u07c0\3\2\2\2\u07c2\u07c1\3\2\2\2\u07c3" +
					"\u07c4\3\2\2\2\u07c4\u07c5\5\u0194\u00cb\2\u07c5\u07c6\7\u013f\2\2\u07c6" +
					"\u0103\3\2\2\2\u07c7\u07c8\5\u0194\u00cb\2\u07c8\u07c9\7\u0130\2\2\u07c9" +
					"\u07ca\5\16\b\2\u07ca\u07cb\7\u013f\2\2\u07cb\u0105\3\2\2\2\u07cc\u07cd" +
					"\7\u00c8\2\2\u07cd\u07ce\5\u0164\u00b3\2\u07ce\u07cf\7\u013f\2\2\u07cf" +
					"\u0107\3\2\2\2\u07d0\u07d5\7\u0139\2\2\u07d1\u07d4\5\u00e0q\2\u07d2\u07d4" +
					"\5\u0108\u0085\2\u07d3\u07d1\3\2\2\2\u07d3\u07d2\3\2\2\2\u07d4\u07d7\3" +
					"\2\2\2\u07d5\u07d3\3\2\2\2\u07d5\u07d6\3\2\2\2\u07d6\u07d8\3\2\2\2\u07d7" +
					"\u07d5\3\2\2\2\u07d8\u07d9\7\u013c\2\2\u07d9\u0109\3\2\2\2\u07da\u07db" +
					"\5\u0194\u00cb\2\u07db\u07dc\7\u0130\2\2\u07dc\u07de\3\2\2\2\u07dd\u07da" +
					"\3\2\2\2\u07dd\u07de\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u07e0\7\u0129\2" +
					"\2\u07e0\u07e1\7\u013a\2\2\u07e1\u07e2\5\u0194\u00cb\2\u07e2\u07e3\7\u013d" +
					"\2\2\u07e3\u010b\3\2\2\2\u07e4\u07e5\7\u0108\2\2\u07e5\u07e6\5\u014e\u00a8" +
					"\2\u07e6\u07e7\t\34\2\2\u07e7\u07e8\5\4\3\2\u07e8\u07ea\7U\2\2\u07e9\u07eb" +
					"\t\35\2\2\u07ea\u07e9\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb\u010d\3\2\2\2" +
					"\u07ec\u07ed\7c\2\2\u07ed\u07ee\7\u0141\2\2\u07ee\u07f0\7u\2\2\u07ef\u07f1" +
					"\7\u00ca\2\2\u07f0\u07ef\3\2\2\2\u07f0\u07f1\3\2\2\2\u07f1\u07f2\3\2\2" +
					"\2\u07f2\u07f3\5\u0164\u00b3\2\u07f3\u07f4\7\u012f\2\2\u07f4\u07f7\5\u0164" +
					"\u00b3\2\u07f5\u07f6\t\36\2\2\u07f6\u07f8\5\u0164\u00b3\2\u07f7\u07f5" +
					"\3\2\2\2\u07f7\u07f8\3\2\2\2\u07f8\u07f9\3\2\2\2\u07f9\u07fa\7\u0099\2" +
					"\2\u07fa\u07fb\5\4\3\2\u07fb\u07fc\7U\2\2\u07fc\u07fd\7\u0099\2\2\u07fd" +
					"\u010f\3\2\2\2\u07fe\u0805\7\u014a\2\2\u07ff\u0800\7\u0136\2\2\u0800\u0801" +
					"\7\u0136\2\2\u0801\u0802\7\u0141\2\2\u0802\u0803\7\u0134\2\2\u0803\u0805" +
					"\7\u0134\2\2\u0804\u07fe\3\2\2\2\u0804\u07ff\3\2\2\2\u0805\u0111\3\2\2" +
					"\2\u0806\u0807\7\u00fe\2\2\u0807\u080c\5\u0164\u00b3\2\u0808\u0809\7\u012c" +
					"\2\2\u0809\u080b\5\u0164\u00b3\2\u080a\u0808\3\2\2\2\u080b\u080e\3\2\2" +
					"\2\u080c\u080a\3\2\2\2\u080c\u080d\3\2\2\2\u080d\u0113\3\2\2\2\u080e\u080c" +
					"\3\2\2\2\u080f\u0810\5\u0116\u008c\2\u0810\u0115\3\2\2\2\u0811\u0817\5" +
					"\u0118\u008d\2\u0812\u0813\5\u011a\u008e\2\u0813\u0814\5\u0118\u008d\2" +
					"\u0814\u0816\3\2\2\2\u0815\u0812\3\2\2\2\u0816\u0819\3\2\2\2\u0817\u0815" +
					"\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u0117\3\2\2\2\u0819\u0817\3\2\2\2\u081a" +
					"\u0820\5\u011c\u008f\2\u081b\u081c\7\u013a\2\2\u081c\u081d\5\u0116\u008c" +
					"\2\u081d\u081e\7\u013d\2\2\u081e\u0820\3\2\2\2\u081f\u081a\3\2\2\2\u081f" +
					"\u081b\3\2\2\2\u0820\u0119\3\2\2\2\u0821\u0823\7\u00f9\2\2\u0822\u0824" +
					"\7\b\2\2\u0823\u0822\3\2\2\2\u0823\u0824\3\2\2\2\u0824\u082e\3\2\2\2\u0825" +
					"\u0827\7X\2\2\u0826\u0828\7\b\2\2\u0827\u0826\3\2\2\2\u0827\u0828\3\2" +
					"\2\2\u0828\u082e\3\2\2\2\u0829\u082b\7\u0080\2\2\u082a\u082c\7\b\2\2\u082b" +
					"\u082a\3\2\2\2\u082b\u082c\3\2\2\2\u082c\u082e\3\2\2\2\u082d\u0821\3\2" +
					"\2\2\u082d\u0825\3\2\2\2\u082d\u0829\3\2\2\2\u082e\u011b\3\2\2\2\u082f" +
					"\u0830\t\2\2\2\u0830\u0832\5\u011e\u0090\2\u0831\u0833\5\u012a\u0096\2" +
					"\u0832\u0831\3\2\2\2\u0832\u0833\3\2\2\2\u0833\u0835\3\2\2\2\u0834\u0836" +
					"\5\u012c\u0097\2\u0835\u0834\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u0838\3" +
					"\2\2\2\u0837\u0839\5\u0140\u00a1\2\u0838\u0837\3\2\2\2\u0838\u0839\3\2" +
					"\2\2\u0839\u083b\3\2\2\2\u083a\u083c\5\u0142\u00a2\2\u083b\u083a\3\2\2" +
					"\2\u083b\u083c\3\2\2\2\u083c\u083f\3\2\2\2\u083d\u0840\5\u0144\u00a3\2" +
					"\u083e\u0840\5\u0146\u00a4\2\u083f\u083d\3\2\2\2\u083f\u083e\3\2\2\2\u083f" +
					"\u0840\3\2\2\2\u0840\u0842\3\2\2\2\u0841\u0843\5\u0148\u00a5\2\u0842\u0841" +
					"\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u0845\3\2\2\2\u0844\u0846\5\u014a\u00a6" +
					"\2\u0845\u0844\3\2\2\2\u0845\u0846\3\2\2\2\u0846\u011d\3\2\2\2\u0847\u0849" +
					"\5\u0120\u0091\2\u0848\u0847\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u084b\3" +
					"\2\2\2\u084a\u084c\5\u0122\u0092\2\u084b\u084a\3\2\2\2\u084b\u084c\3\2" +
					"\2\2\u084c\u084d\3\2\2\2\u084d\u0852\5\u0124\u0093\2\u084e\u084f\7\u012c" +
					"\2\2\u084f\u0851\5\u0124\u0093\2\u0850\u084e\3\2\2\2\u0851\u0854\3\2\2" +
					"\2\u0852\u0850\3\2\2\2\u0852\u0853\3\2\2\2\u0853\u011f\3\2\2\2\u0854\u0852" +
					"\3\2\2\2\u0855\u0856\t\37\2\2\u0856\u0121\3\2\2\2\u0857\u0858\7\u00f6" +
					"\2\2\u0858\u0859\5\u0164\u00b3\2\u0859\u0123\3\2\2\2\u085a\u085b\5\u0194" +
					"\u00cb\2\u085b\u085c\7\u0130\2\2\u085c\u085e\3\2\2\2\u085d\u085a\3\2\2" +
					"\2\u085d\u085e\3\2\2\2\u085e\u085f\3\2\2\2\u085f\u0861\5\u0164\u00b3\2" +
					"\u0860\u0862\5\u0126\u0094\2\u0861\u0860\3\2\2\2\u0861\u0862\3\2\2\2\u0862" +
					"\u0865\3\2\2\2\u0863\u0865\5\u0128\u0095\2\u0864\u085d\3\2\2\2\u0864\u0863" +
					"\3\2\2\2\u0865\u0125\3\2\2\2\u0866\u0867\6\u0094\5\2\u0867\u0868\7\13" +
					"\2\2\u0868\u086e\5\u0194\u00cb\2\u0869\u086a\7\u013a\2\2\u086a\u086b\7" +
					"\u00f4\2\2\u086b\u086c\7\u0142\2\2\u086c\u086e\7\u013d\2\2\u086d\u0866" +
					"\3\2\2\2\u086d\u0869\3\2\2\2\u086e\u0127\3\2\2\2\u086f\u0870\7\u0141\2" +
					"\2\u0870\u0872\7\6\2\2\u0871\u086f\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u0873" +
					"\3\2\2\2\u0873\u0874\7\u0138\2\2\u0874\u0129\3\2\2\2\u0875\u0876\7\u0082" +
					"\2\2\u0876\u087b\5\u0194\u00cb\2\u0877\u0878\7\u012c\2\2\u0878\u087a\5" +
					"\u0194\u00cb\2\u0879\u0877\3\2\2\2\u087a\u087d\3\2\2\2\u087b\u0879\3\2" +
					"\2\2\u087b\u087c\3\2\2\2\u087c\u012b\3\2\2\2\u087d\u087b\3\2\2\2\u087e" +
					"\u087f\7g\2\2\u087f\u0883\5\u012e\u0098\2\u0880\u0882\5\u0134\u009b\2" +
					"\u0881\u0880\3\2\2\2\u0882\u0885\3\2\2\2\u0883\u0881\3\2\2\2\u0883\u0884" +
					"\3\2\2\2\u0884\u012d\3\2\2\2\u0885\u0883\3\2\2\2\u0886\u088a\5\u0130\u0099" +
					"\2\u0887\u088a\5\u0132\u009a\2\u0888\u088a\5\u0138\u009d\2\u0889\u0886" +
					"\3\2\2\2\u0889\u0887\3\2\2\2\u0889\u0888\3\2\2\2\u088a\u012f\3\2\2\2\u088b" +
					"\u088d\5\u013e\u00a0\2\u088c\u088e\5\u013c\u009f\2\u088d\u088c\3\2\2\2" +
					"\u088d\u088e\3\2\2\2\u088e\u0131\3\2\2\2\u088f\u0890\7\u013a\2\2\u0890" +
					"\u0891\5\u0114\u008b\2\u0891\u0893\7\u013d\2\2\u0892\u0894\5\u013c\u009f" +
					"\2\u0893\u0892\3\2\2\2\u0893\u0894\3\2\2\2\u0894\u0133\3\2\2\2\u0895\u0896" +
					"\7\u012c\2\2\u0896\u089d\5\u012e\u0098\2\u0897\u0898\5\u0136\u009c\2\u0898" +
					"\u0899\5\u012e\u0098\2\u0899\u089a\7\u00ac\2\2\u089a\u089b\5\u014e\u00a8" +
					"\2\u089b\u089d\3\2\2\2\u089c\u0895\3\2\2\2\u089c\u0897\3\2\2\2\u089d\u0135" +
					"\3\2\2\2\u089e\u08a0\7x\2\2\u089f\u089e\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0" +
					"\u08a1\3\2\2\2\u08a1\u08a8\7\u0087\2\2\u08a2\u08a4\t \2\2\u08a3\u08a5" +
					"\7\u00b2\2\2\u08a4\u08a3\3\2\2\2\u08a4\u08a5\3\2\2\2\u08a5\u08a6\3\2\2" +
					"\2\u08a6\u08a8\7\u0087\2\2\u08a7\u089f\3\2\2\2\u08a7\u08a2\3\2\2\2\u08a8" +
					"\u0137\3\2\2\2\u08a9\u08aa\7\u00ec\2\2\u08aa\u08ab\7\u013a\2\2\u08ab\u08ac" +
					"\7\u0100\2\2\u08ac\u08b1\5\u013a\u009e\2\u08ad\u08ae\7\u012c\2\2\u08ae" +
					"\u08b0\5\u013a\u009e\2\u08af\u08ad\3\2\2\2\u08b0\u08b3\3\2\2\2\u08b1\u08af" +
					"\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u08b4\3\2\2\2\u08b3\u08b1\3\2\2\2\u08b4" +
					"\u08b6\7\u013d\2\2\u08b5\u08b7\5\u013c\u009f\2\u08b6\u08b5\3\2\2\2\u08b6" +
					"\u08b7\3\2\2\2\u08b7\u0139\3\2\2\2\u08b8\u08c5\5\u0164\u00b3\2\u08b9\u08ba" +
					"\7\u013a\2\2\u08ba\u08bf\5\u0164\u00b3\2\u08bb\u08bc\7\u012c\2\2\u08bc" +
					"\u08be\5\u0164\u00b3\2\u08bd\u08bb\3\2\2\2\u08be\u08c1\3\2\2\2\u08bf\u08bd" +
					"\3\2\2\2\u08bf\u08c0\3\2\2\2\u08c0\u08c2\3\2\2\2\u08c1\u08bf\3\2\2\2\u08c2" +
					"\u08c3\7\u013d\2\2\u08c3\u08c5\3\2\2\2\u08c4\u08b8\3\2\2\2\u08c4\u08b9" +
					"\3\2\2\2\u08c5\u013b\3\2\2\2\u08c6\u08c7\7\13\2\2\u08c7\u08d2\5\u0194" +
					"\u00cb\2\u08c8\u08c9\7\u013a\2\2\u08c9\u08ce\7\u0141\2\2\u08ca\u08cb\7" +
					"\u012c\2\2\u08cb\u08cd\7\u0141\2\2\u08cc\u08ca\3\2\2\2\u08cd\u08d0\3\2" +
					"\2\2\u08ce\u08cc\3\2\2\2\u08ce\u08cf\3\2\2\2\u08cf\u08d1\3\2\2\2\u08d0" +
					"\u08ce\3\2\2\2\u08d1\u08d3\7\u013d\2\2\u08d2\u08c8\3\2\2\2\u08d2\u08d3" +
					"\3\2\2\2\u08d3\u013d\3\2\2\2\u08d4\u08d5\5\u0194\u00cb\2\u08d5\u013f\3" +
					"\2\2\2\u08d6\u08d7\7\u0107\2\2\u08d7\u08d8\5\u014e\u00a8\2";
	private static final String _serializedATNSegment1 =
			"\u08d8\u0141\3\2\2\2\u08d9\u08da\7m\2\2\u08da\u08db\7\32\2\2\u08db\u08e0" +
					"\5\u0164\u00b3\2\u08dc\u08dd\7\u012c\2\2\u08dd\u08df\5\u0164\u00b3\2\u08de" +
					"\u08dc\3\2\2\2\u08df\u08e2\3\2\2\2\u08e0\u08de\3\2\2\2\u08e0\u08e1\3\2" +
					"\2\2\u08e1\u0143\3\2\2\2\u08e2\u08e0\3\2\2\2\u08e3\u08e4\7p\2\2\u08e4" +
					"\u08e5\5\u014e\u00a8\2\u08e5\u0145\3\2\2\2\u08e6\u08e7\7\u00bf\2\2\u08e7" +
					"\u08e8\5\u014e\u00a8\2\u08e8\u0147\3\2\2\2\u08e9\u08ea\7\u00b0\2\2\u08ea" +
					"\u08eb\7\32\2\2\u08eb\u08ed\5\u0164\u00b3\2\u08ec\u08ee\t\b\2\2\u08ed" +
					"\u08ec\3\2\2\2\u08ed\u08ee\3\2\2\2\u08ee\u08f6\3\2\2\2\u08ef\u08f0\7\u012c" +
					"\2\2\u08f0\u08f2\5\u0164\u00b3\2\u08f1\u08f3\t\b\2\2\u08f2\u08f1\3\2\2" +
					"\2\u08f2\u08f3\3\2\2\2\u08f3\u08f5\3\2\2\2\u08f4\u08ef\3\2\2\2\u08f5\u08f8" +
					"\3\2\2\2\u08f6\u08f4\3\2\2\2\u08f6\u08f7\3\2\2\2\u08f7\u0149\3\2\2\2\u08f8" +
					"\u08f6\3\2\2\2\u08f9\u08fb\5\u014c\u00a7\2\u08fa\u08f9\3\2\2\2\u08fb\u08fc" +
					"\3\2\2\2\u08fc\u08fa\3\2\2\2\u08fc\u08fd\3\2\2\2\u08fd\u014b\3\2\2\2\u08fe" +
					"\u08ff\7\u008f\2\2\u08ff\u090a\5\u0164\u00b3\2\u0900\u0901\7\u0109\2\2" +
					"\u0901\u0907\t!\2\2\u0902\u0903\7\u00fd\2\2\u0903\u0904\7\n\2\2\u0904" +
					"\u0905\7\u0088\2\2\u0905\u0906\t\"\2\2\u0906\u0908\7\u0095\2\2\u0907\u0902" +
					"\3\2\2\2\u0907\u0908\3\2\2\2\u0908\u090a\3\2\2\2\u0909\u08fe\3\2\2\2\u0909" +
					"\u0900\3\2\2\2\u090a\u014d\3\2\2\2\u090b\u090d\b\u00a8\1\2\u090c\u090e" +
					"\7\u00a7\2\2\u090d\u090c\3\2\2\2\u090d\u090e\3\2\2\2\u090e\u090f\3\2\2" +
					"\2\u090f\u0910\7\u013a\2\2\u0910\u0911\5\u014e\u00a8\2\u0911\u0912\7\u013d" +
					"\2\2\u0912\u0915\3\2\2\2\u0913\u0915\5\u0150\u00a9\2\u0914\u090b\3\2\2" +
					"\2\u0914\u0913\3\2\2\2\u0915\u091c\3\2\2\2\u0916\u0917\f\4\2\2\u0917\u0918" +
					"\5\u0160\u00b1\2\u0918\u0919\5\u014e\u00a8\5\u0919\u091b\3\2\2\2\u091a" +
					"\u0916\3\2\2\2\u091b\u091e\3\2\2\2\u091c\u091a\3\2\2\2\u091c\u091d\3\2" +
					"\2\2\u091d\u014f\3\2\2\2\u091e\u091c\3\2\2\2\u091f\u0923\5\u0152\u00aa" +
					"\2\u0920\u0923\5\u015e\u00b0\2\u0921\u0923\5\u0164\u00b3\2\u0922\u091f" +
					"\3\2\2\2\u0922\u0920\3\2\2\2\u0922\u0921\3\2\2\2\u0923\u0151\3\2\2\2\u0924" +
					"\u092a\5\u0154\u00ab\2\u0925\u092a\5\u0156\u00ac\2\u0926\u092a\5\u0158" +
					"\u00ad\2\u0927\u092a\5\u015a\u00ae\2\u0928\u092a\5\u015c\u00af\2\u0929" +
					"\u0924\3\2\2\2\u0929\u0925\3\2\2\2\u0929\u0926\3\2\2\2\u0929\u0927\3\2" +
					"\2\2\u0929\u0928\3\2\2\2\u092a\u0153\3\2\2\2\u092b\u092c\5\u0164\u00b3" +
					"\2\u092c\u092e\7\u0084\2\2\u092d\u092f\7\u00a7\2\2\u092e\u092d\3\2\2\2" +
					"\u092e\u092f\3\2\2\2\u092f\u0930\3\2\2\2\u0930\u0931\7\u00a9\2\2\u0931" +
					"\u0155\3\2\2\2\u0932\u0933\5\u0164\u00b3\2\u0933\u0934\7\22\2\2\u0934" +
					"\u0935\5\u0164\u00b3\2\u0935\u0936\7\n\2\2\u0936\u0937\5\u0164\u00b3\2" +
					"\u0937\u0157\3\2\2\2\u0938\u093a\7\u00a7\2\2\u0939\u0938\3\2\2\2\u0939" +
					"\u093a\3\2\2\2\u093a\u093b\3\2\2\2\u093b\u093c\7]\2\2\u093c\u093d\7\u013a" +
					"\2\2\u093d\u093e\5\u0114\u008b\2\u093e\u093f\7\u013d\2\2\u093f\u0159\3" +
					"\2\2\2\u0940\u0942\5\u0164\u00b3\2\u0941\u0943\7\u00a7\2\2\u0942\u0941" +
					"\3\2\2\2\u0942\u0943\3\2\2\2\u0943\u0944\3\2\2\2\u0944\u0945\7u\2\2\u0945" +
					"\u094f\5\u0190\u00c9\2\u0946\u094b\5\u0164\u00b3\2\u0947\u0948\7\u012c" +
					"\2\2\u0948\u094a\5\u0164\u00b3\2\u0949\u0947\3\2\2\2\u094a\u094d\3\2\2" +
					"\2\u094b\u0949\3\2\2\2\u094b\u094c\3\2\2\2\u094c\u0950\3\2\2\2\u094d\u094b" +
					"\3\2\2\2\u094e\u0950\5\u0114\u008b\2\u094f\u0946\3\2\2\2\u094f\u094e\3" +
					"\2\2\2\u0950\u0951\3\2\2\2\u0951\u0952\5\u0192\u00ca\2\u0952\u015b\3\2" +
					"\2\2\u0953\u0954\7\u013a\2\2\u0954\u0959\5\u0164\u00b3\2\u0955\u0956\7" +
					"\u012c\2\2\u0956\u0958\5\u0164\u00b3\2\u0957\u0955\3\2\2\2\u0958\u095b" +
					"\3\2\2\2\u0959\u0957\3\2\2\2\u0959\u095a\3\2\2\2\u095a\u095c\3\2\2\2\u095b" +
					"\u0959\3\2\2\2\u095c\u095e\7\u013d\2\2\u095d\u095f\7\u00a7\2\2\u095e\u095d" +
					"\3\2\2\2\u095e\u095f\3\2\2\2\u095f\u0960\3\2\2\2\u0960\u0961\7u\2\2\u0961" +
					"\u0962\7\u013a\2\2\u0962\u0963\5\u0114\u008b\2\u0963\u0964\7\u013d\2\2" +
					"\u0964\u015d\3\2\2\2\u0965\u0966\5\u0164\u00b3\2\u0966\u0967\5\u0162\u00b2" +
					"\2\u0967\u0968\5\u0164\u00b3\2\u0968\u015f\3\2\2\2\u0969\u096a\t#\2\2" +
					"\u096a\u0161\3\2\2\2\u096b\u0978\7\u0130\2\2\u096c\u0978\7\u0131\2\2\u096d" +
					"\u0978\7\u0132\2\2\u096e\u0978\7\u0133\2\2\u096f\u0978\7\u0136\2\2\u0970" +
					"\u0978\7\u0137\2\2\u0971\u0978\7\u0134\2\2\u0972\u0978\7\u0135\2\2\u0973" +
					"\u0975\7\u00a7\2\2\u0974\u0973\3\2\2\2\u0974\u0975\3\2\2\2\u0975\u0976" +
					"\3\2\2\2\u0976\u0978\t$\2\2\u0977\u096b\3\2\2\2\u0977\u096c\3\2\2\2\u0977" +
					"\u096d\3\2\2\2\u0977\u096e\3\2\2\2\u0977\u096f\3\2\2\2\u0977\u0970\3\2" +
					"\2\2\u0977\u0971\3\2\2\2\u0977\u0972\3\2\2\2\u0977\u0974\3\2\2\2\u0978" +
					"\u0163\3\2\2\2\u0979\u097a\b\u00b3\1\2\u097a\u097b\7\u013a\2\2\u097b\u097c" +
					"\5\u0114\u008b\2\u097c\u097d\7\u013d\2\2\u097d\u098b\3\2\2\2\u097e\u097f" +
					"\7\u013a\2\2\u097f\u0980\5\u0164\u00b3\2\u0980\u0981\7\u013d\2\2\u0981" +
					"\u098b\3\2\2\2\u0982\u098b\5\u0168\u00b5\2\u0983\u098b\5\u016c\u00b7\2" +
					"\u0984\u098b\5\u0170\u00b9\2\u0985\u098b\5\u0176\u00bc\2\u0986\u098b\5" +
					"\u0178\u00bd\2\u0987\u098b\5\u0180\u00c1\2\u0988\u098b\5\u0182\u00c2\2" +
					"\u0989\u098b\5\u0166\u00b4\2\u098a\u0979\3\2\2\2\u098a\u097e\3\2\2\2\u098a" +
					"\u0982\3\2\2\2\u098a\u0983\3\2\2\2\u098a\u0984\3\2\2\2\u098a\u0985\3\2" +
					"\2\2\u098a\u0986\3\2\2\2\u098a\u0987\3\2\2\2\u098a\u0988\3\2\2\2\u098a" +
					"\u0989\3\2\2\2\u098b\u099c\3\2\2\2\u098c\u098d\f\20\2\2\u098d\u098e\7" +
					"\u0138\2\2\u098e\u099b\5\u0164\u00b3\21\u098f\u0990\f\17\2\2\u0990\u0991" +
					"\7\u012e\2\2\u0991\u099b\5\u0164\u00b3\20\u0992\u0993\f\16\2\2\u0993\u0994" +
					"\7\u012a\2\2\u0994\u099b\5\u0164\u00b3\17\u0995\u0996\f\r\2\2\u0996\u0997" +
					"\7\u0140\2\2\u0997\u099b\5\u0164\u00b3\16\u0998\u0999\f\21\2\2\u0999\u099b" +
					"\5\u016a\u00b6\2\u099a\u098c\3\2\2\2\u099a\u098f\3\2\2\2\u099a\u0992\3" +
					"\2\2\2\u099a\u0995\3\2\2\2\u099a\u0998\3\2\2\2\u099b\u099e\3\2\2\2\u099c" +
					"\u099a\3\2\2\2\u099c\u099d\3\2\2\2\u099d\u0165\3\2\2\2\u099e\u099c\3\2" +
					"\2\2\u099f\u09a8\5\u018c\u00c7\2\u09a0\u09a8\5\u018e\u00c8\2\u09a1\u09a8" +
					"\5\u019c\u00cf\2\u09a2\u09a8\5\u0194\u00cb\2\u09a3\u09a8\5\u0196\u00cc" +
					"\2\u09a4\u09a8\5\u019a\u00ce\2\u09a5\u09a8\5\u0198\u00cd\2\u09a6\u09a8" +
					"\5\u019e\u00d0\2\u09a7\u099f\3\2\2\2\u09a7\u09a0\3\2\2\2\u09a7\u09a1\3" +
					"\2\2\2\u09a7\u09a2\3\2\2\2\u09a7\u09a3\3\2\2\2\u09a7\u09a4\3\2\2\2\u09a7" +
					"\u09a5\3\2\2\2\u09a7\u09a6\3\2\2\2\u09a8\u0167\3\2\2\2\u09a9\u09aa\7\u0081" +
					"\2\2\u09aa\u09ab\5\u0164\u00b3\2\u09ab\u09ac\5\u016a\u00b6\2\u09ac\u0169" +
					"\3\2\2\2\u09ad\u09ae\t%\2\2\u09ae\u016b\3\2\2\2\u09af\u09b0\5\u016e\u00b8" +
					"\2\u09b0\u09b1\t&\2\2\u09b1\u09b6\5\u016e\u00b8\2\u09b2\u09b3\t&\2\2\u09b3" +
					"\u09b5\5\u016e\u00b8\2\u09b4\u09b2\3\2\2\2\u09b5\u09b8\3\2\2\2\u09b6\u09b4" +
					"\3\2\2\2\u09b6\u09b7\3\2\2\2\u09b7\u016d\3\2\2\2\u09b8\u09b6\3\2\2\2\u09b9" +
					"\u09ba\7\u013a\2\2\u09ba\u09bb\5\u0164\u00b3\2\u09bb\u09bc\7\u013d\2\2" +
					"\u09bc\u09c3\3\2\2\2\u09bd\u09c3\5\u0170\u00b9\2\u09be\u09c3\5\u0178\u00bd" +
					"\2\u09bf\u09c3\5\u0180\u00c1\2\u09c0\u09c3\5\u0182\u00c2\2\u09c1\u09c3" +
					"\5\u0166\u00b4\2\u09c2\u09b9\3\2\2\2\u09c2\u09bd\3\2\2\2\u09c2\u09be\3" +
					"\2\2\2\u09c2\u09bf\3\2\2\2\u09c2\u09c0\3\2\2\2\u09c2\u09c1\3\2\2\2\u09c3" +
					"\u016f\3\2\2\2\u09c4\u09c7\5\u0172\u00ba\2\u09c5\u09c7\5\u0174\u00bb\2" +
					"\u09c6\u09c4\3\2\2\2\u09c6\u09c5\3\2\2\2\u09c7\u0171\3\2\2\2\u09c8\u09c9" +
					"\7\36\2\2\u09c9\u09cf\5\u0164\u00b3\2\u09ca\u09cb\7\u0106\2\2\u09cb\u09cc" +
					"\5\u0164\u00b3\2\u09cc\u09cd\7\u00f1\2\2\u09cd\u09ce\5\u0164\u00b3\2\u09ce" +
					"\u09d0\3\2\2\2\u09cf\u09ca\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1\u09cf\3\2" +
					"\2\2\u09d1\u09d2\3\2\2\2\u09d2\u09d5\3\2\2\2\u09d3\u09d4\7Q\2\2\u09d4" +
					"\u09d6\5\u0164\u00b3\2\u09d5\u09d3\3\2\2\2\u09d5\u09d6\3\2\2\2\u09d6\u09d7" +
					"\3\2\2\2\u09d7\u09d8\7U\2\2\u09d8\u0173\3\2\2\2\u09d9\u09df\7\36\2\2\u09da" +
					"\u09db\7\u0106\2\2\u09db\u09dc\5\u014e\u00a8\2\u09dc\u09dd\7\u00f1\2\2" +
					"\u09dd\u09de\5\u0164\u00b3\2\u09de\u09e0\3\2\2\2\u09df\u09da\3\2\2\2\u09e0" +
					"\u09e1\3\2\2\2\u09e1\u09df\3\2\2\2\u09e1\u09e2\3\2\2\2\u09e2\u09e5\3\2" +
					"\2\2\u09e3\u09e4\7Q\2\2\u09e4\u09e6\5\u0164\u00b3\2\u09e5\u09e3\3\2\2" +
					"\2\u09e5\u09e6\3\2\2\2\u09e6\u09e7\3\2\2\2\u09e7\u09e8\7U\2\2\u09e8\u0175" +
					"\3\2\2\2\u09e9\u09ea\5\u0194\u00cb\2\u09ea\u09eb\7\5\2\2\u09eb\u09ec\t" +
					"\'\2\2\u09ec\u0177\3\2\2\2\u09ed\u09ee\7\20\2\2\u09ee\u09f0\7\u013a\2" +
					"\2\u09ef\u09f1\5\u017a\u00be\2\u09f0\u09ef\3\2\2\2\u09f0\u09f1\3\2\2\2" +
					"\u09f1\u09f2\3\2\2\2\u09f2\u09f3\5\u0164\u00b3\2\u09f3\u09f5\7\u013d\2" +
					"\2\u09f4\u09f6\5\u017c\u00bf\2\u09f5\u09f4\3\2\2\2\u09f5\u09f6\3\2\2\2" +
					"\u09f6\u0a86\3\2\2\2\u09f7\u09f8\7\61\2\2\u09f8\u09fe\7\u013a\2\2\u09f9" +
					"\u09fb\5\u017a\u00be\2\u09fa\u09f9\3\2\2\2\u09fa\u09fb\3\2\2\2\u09fb\u09fc" +
					"\3\2\2\2\u09fc\u09ff\5\u0164\u00b3\2\u09fd\u09ff\7\u0138\2\2\u09fe\u09fa" +
					"\3\2\2\2\u09fe\u09fd\3\2\2\2\u09ff\u0a00\3\2\2\2\u0a00\u0a02\7\u013d\2" +
					"\2\u0a01\u0a03\5\u017c\u00bf\2\u0a02\u0a01\3\2\2\2\u0a02\u0a03\3\2\2\2" +
					"\u0a03\u0a86\3\2\2\2\u0a04\u0a05\7\62\2\2\u0a05\u0a0b\7\u013a\2\2\u0a06" +
					"\u0a08\5\u017a\u00be\2\u0a07\u0a06\3\2\2\2\u0a07\u0a08\3\2\2\2\u0a08\u0a09" +
					"\3\2\2\2\u0a09\u0a0c\5\u0164\u00b3\2\u0a0a\u0a0c\7\u0138\2\2\u0a0b\u0a07" +
					"\3\2\2\2\u0a0b\u0a0a\3\2\2\2\u0a0c\u0a0d\3\2\2\2\u0a0d\u0a0f\7\u013d\2" +
					"\2\u0a0e\u0a10\5\u017c\u00bf\2\u0a0f\u0a0e\3\2\2\2\u0a0f\u0a10\3\2\2\2" +
					"\u0a10\u0a86\3\2\2\2\u0a11\u0a12\7\u010e\2\2\u0a12\u0a13\7\u013a\2\2\u0a13" +
					"\u0a14\7\u013d\2\2\u0a14\u0a86\5\u017c\u00bf\2\u0a15\u0a16\7\u0112\2\2" +
					"\u0a16\u0a17\7\u013a\2\2\u0a17\u0a18\7\u013d\2\2\u0a18\u0a86\5\u017c\u00bf" +
					"\2\u0a19\u0a1a\7\u0113\2\2\u0a1a\u0a1b\7\u013a\2\2\u0a1b\u0a1c\5\u0164" +
					"\u00b3\2\u0a1c\u0a1d\7\u013d\2\2\u0a1d\u0a1e\5\u017c\u00bf\2\u0a1e\u0a86" +
					"\3\2\2\2\u0a1f\u0a20\7\u0114\2\2\u0a20\u0a21\7\u013a\2\2\u0a21\u0a28\5" +
					"\u0164\u00b3\2\u0a22\u0a23\7\u012c\2\2\u0a23\u0a26\5\u0164\u00b3\2\u0a24" +
					"\u0a25\7\u012c\2\2\u0a25\u0a27\5\u0164\u00b3\2\u0a26\u0a24\3\2\2\2\u0a26" +
					"\u0a27\3\2\2\2\u0a27\u0a29\3\2\2\2\u0a28\u0a22\3\2\2\2\u0a28\u0a29\3\2" +
					"\2\2\u0a29\u0a2a\3\2\2\2\u0a2a\u0a2b\7\u013d\2\2\u0a2b\u0a2c\5\u017c\u00bf" +
					"\2\u0a2c\u0a86\3\2\2\2\u0a2d\u0a2e\7\u0115\2\2\u0a2e\u0a2f\7\u013a\2\2" +
					"\u0a2f\u0a30\5\u0164\u00b3\2\u0a30\u0a31\7\u013d\2\2\u0a31\u0a32\5\u017c" +
					"\u00bf\2\u0a32\u0a86\3\2\2\2\u0a33\u0a34\7\u0116\2\2\u0a34\u0a35\7\u013a" +
					"\2\2\u0a35\u0a3c\5\u0164\u00b3\2\u0a36\u0a37\7\u012c\2\2\u0a37\u0a3a\5" +
					"\u0164\u00b3\2\u0a38\u0a39\7\u012c\2\2\u0a39\u0a3b\5\u0164\u00b3\2\u0a3a" +
					"\u0a38\3\2\2\2\u0a3a\u0a3b\3\2\2\2\u0a3b\u0a3d\3\2\2\2\u0a3c\u0a36\3\2" +
					"\2\2\u0a3c\u0a3d\3\2\2\2\u0a3d\u0a3e\3\2\2\2\u0a3e\u0a3f\7\u013d\2\2\u0a3f" +
					"\u0a40\5\u017c\u00bf\2\u0a40\u0a86\3\2\2\2\u0a41\u0a42\7\u009b\2\2\u0a42" +
					"\u0a44\7\u013a\2\2\u0a43\u0a45\5\u017a\u00be\2\u0a44\u0a43\3\2\2\2\u0a44" +
					"\u0a45\3\2\2\2\u0a45\u0a46\3\2\2\2\u0a46\u0a47\5\u0164\u00b3\2\u0a47\u0a49" +
					"\7\u013d\2\2\u0a48\u0a4a\5\u017c\u00bf\2\u0a49\u0a48\3\2\2\2\u0a49\u0a4a" +
					"\3\2\2\2\u0a4a\u0a86\3\2\2\2\u0a4b\u0a4c\7\u00a0\2\2\u0a4c\u0a4e\7\u013a" +
					"\2\2\u0a4d\u0a4f\5\u017a\u00be\2\u0a4e\u0a4d\3\2\2\2\u0a4e\u0a4f\3\2\2" +
					"\2\u0a4f\u0a50\3\2\2\2\u0a50\u0a51\5\u0164\u00b3\2\u0a51\u0a53\7\u013d" +
					"\2\2\u0a52\u0a54\5\u017c\u00bf\2\u0a53\u0a52\3\2\2\2\u0a53\u0a54\3\2\2" +
					"\2\u0a54\u0a86\3\2\2\2\u0a55\u0a56\7\u011f\2\2\u0a56\u0a57\7\u013a\2\2" +
					"\u0a57\u0a58\7\u013d\2\2\u0a58\u0a86\5\u017c\u00bf\2\u0a59\u0a5a\7\u0120" +
					"\2\2\u0a5a\u0a5b\7\u013a\2\2\u0a5b\u0a5c\7\u013d\2\2\u0a5c\u0a86\5\u017c" +
					"\u00bf\2\u0a5d\u0a5e\7\u0121\2\2\u0a5e\u0a60\7\u013a\2\2\u0a5f\u0a61\5" +
					"\u017a\u00be\2\u0a60\u0a5f\3\2\2\2\u0a60\u0a61\3\2\2\2\u0a61\u0a62\3\2" +
					"\2\2\u0a62\u0a63\5\u0164\u00b3\2\u0a63\u0a65\7\u013d\2\2\u0a64\u0a66\5" +
					"\u017c\u00bf\2\u0a65\u0a64\3\2\2\2\u0a65\u0a66\3\2\2\2\u0a66\u0a86\3\2" +
					"\2\2\u0a67\u0a68\7\u00ea\2\2\u0a68\u0a6a\7\u013a\2\2\u0a69\u0a6b\5\u017a" +
					"\u00be\2\u0a6a\u0a69\3\2\2\2\u0a6a\u0a6b\3\2\2\2\u0a6b\u0a6c\3\2\2\2\u0a6c" +
					"\u0a6d\5\u0164\u00b3\2\u0a6d\u0a6f\7\u013d\2\2\u0a6e\u0a70\5\u017c\u00bf" +
					"\2\u0a6f\u0a6e\3\2\2\2\u0a6f\u0a70\3\2\2\2\u0a70\u0a86\3\2\2\2\u0a71\u0a72" +
					"\7\u0101\2\2\u0a72\u0a74\7\u013a\2\2\u0a73\u0a75\5\u017a\u00be\2\u0a74" +
					"\u0a73\3\2\2\2\u0a74\u0a75\3\2\2\2\u0a75\u0a76\3\2\2\2\u0a76\u0a77\5\u0164" +
					"\u00b3\2\u0a77\u0a79\7\u013d\2\2\u0a78\u0a7a\5\u017c\u00bf\2\u0a79\u0a78" +
					"\3\2\2\2\u0a79\u0a7a\3\2\2\2\u0a7a\u0a86\3\2\2\2\u0a7b\u0a7c\7\u0123\2" +
					"\2\u0a7c\u0a7e\7\u013a\2\2\u0a7d\u0a7f\5\u017a\u00be\2\u0a7e\u0a7d\3\2" +
					"\2\2\u0a7e\u0a7f\3\2\2\2\u0a7f\u0a80\3\2\2\2\u0a80\u0a81\5\u0164\u00b3" +
					"\2\u0a81\u0a83\7\u013d\2\2\u0a82\u0a84\5\u017c\u00bf\2\u0a83\u0a82\3\2" +
					"\2\2\u0a83\u0a84\3\2\2\2\u0a84\u0a86\3\2\2\2\u0a85\u09ed\3\2\2\2\u0a85" +
					"\u09f7\3\2\2\2\u0a85\u0a04\3\2\2\2\u0a85\u0a11\3\2\2\2\u0a85\u0a15\3\2" +
					"\2\2\u0a85\u0a19\3\2\2\2\u0a85\u0a1f\3\2\2\2\u0a85\u0a2d\3\2\2\2\u0a85" +
					"\u0a33\3\2\2\2\u0a85\u0a41\3\2\2\2\u0a85\u0a4b\3\2\2\2\u0a85\u0a55\3\2" +
					"\2\2\u0a85\u0a59\3\2\2\2\u0a85\u0a5d\3\2\2\2\u0a85\u0a67\3\2\2\2\u0a85" +
					"\u0a71\3\2\2\2\u0a85\u0a7b\3\2\2\2\u0a86\u0179\3\2\2\2\u0a87\u0a88\t\37" +
					"\2\2\u0a88\u017b\3\2\2\2\u0a89\u0a8a\7\u00b3\2\2\u0a8a\u0a8c\7\u013a\2" +
					"\2\u0a8b\u0a8d\5\u017e\u00c0\2\u0a8c\u0a8b\3\2\2\2\u0a8c\u0a8d\3\2\2\2" +
					"\u0a8d\u0a8f\3\2\2\2\u0a8e\u0a90\5\u0148\u00a5\2\u0a8f\u0a8e\3\2\2\2\u0a8f" +
					"\u0a90\3\2\2\2\u0a90\u0a91\3\2\2\2\u0a91\u0a92\7\u013d\2\2\u0a92\u017d" +
					"\3\2\2\2\u0a93\u0a94\7\u00b6\2\2\u0a94\u0a95\7\32\2\2\u0a95\u0a9a\5\u0164" +
					"\u00b3\2\u0a96\u0a97\7\u012c\2\2\u0a97\u0a99\5\u0164\u00b3\2\u0a98\u0a96" +
					"\3\2\2\2\u0a99\u0a9c\3\2\2\2\u0a9a\u0a98\3\2\2\2\u0a9a\u0a9b\3\2\2\2\u0a9b" +
					"\u017f\3\2\2\2\u0a9c\u0a9a\3\2\2\2\u0a9d\u0b66\7\u010d\2\2\u0a9e\u0a9f" +
					"\7 \2\2\u0a9f\u0aa0\7\u013a\2\2\u0aa0\u0aa1\5\u0164\u00b3\2\u0aa1\u0aa2" +
					"\7\13\2\2\u0aa2\u0aa4\5\u0098M\2\u0aa3\u0aa5\5\u009aN\2\u0aa4\u0aa3\3" +
					"\2\2\2\u0aa4\u0aa5\3\2\2\2\u0aa5\u0aa6\3\2\2\2\u0aa6\u0aa7\7\u013d\2\2" +
					"\u0aa7\u0b66\3\2\2\2\u0aa8\u0aa9\7\61\2\2\u0aa9\u0aac\7\u013a\2\2\u0aaa" +
					"\u0aad\5\u0164\u00b3\2\u0aab\u0aad\7\u0138\2\2\u0aac\u0aaa\3\2\2\2\u0aac" +
					"\u0aab\3\2\2\2\u0aad\u0aae\3\2\2\2\u0aae\u0b66\7\u013d\2\2\u0aaf\u0b66" +
					"\7\u010f\2\2\u0ab0\u0ab1\7\67\2\2\u0ab1\u0b66\7:\2\2\u0ab2\u0ab6\7\u0110" +
					"\2\2\u0ab3\u0ab4\7\67\2\2\u0ab4\u0ab6\7\u00f2\2\2\u0ab5\u0ab2\3\2\2\2" +
					"\u0ab5\u0ab3\3\2\2\2\u0ab6\u0abb\3\2\2\2\u0ab7\u0ab8\7\u013a\2\2\u0ab8" +
					"\u0ab9\5\u0164\u00b3\2\u0ab9\u0aba\7\u013d\2\2\u0aba\u0abc\3\2\2\2\u0abb" +
					"\u0ab7\3\2\2\2\u0abb\u0abc\3\2\2\2\u0abc\u0b66\3\2\2\2\u0abd\u0b66\7\u0111" +
					"\2\2\u0abe\u0abf\7\67\2\2\u0abf\u0b66\7\u0124\2\2\u0ac0\u0ac1\7\u0117" +
					"\2\2\u0ac1\u0ac2\7\u013a\2\2\u0ac2\u0acf\5\u0164\u00b3\2\u0ac3\u0ac4\7" +
					"\u012c\2\2\u0ac4\u0acc\5\u0164\u00b3\2\u0ac5\u0ac6\7\u012c\2\2\u0ac6\u0ac7" +
					"\5\u0164\u00b3\2\u0ac7\u0ac8\7\u0130\2\2\u0ac8\u0ac9\5\u0164\u00b3\2\u0ac9" +
					"\u0acb\3\2\2\2\u0aca\u0ac5\3\2\2\2\u0acb\u0ace\3\2\2\2\u0acc\u0aca\3\2" +
					"\2\2\u0acc\u0acd\3\2\2\2\u0acd\u0ad0\3\2\2\2\u0ace\u0acc\3\2\2\2\u0acf" +
					"\u0ac3\3\2\2\2\u0acf\u0ad0\3\2\2\2\u0ad0\u0ad1\3\2\2\2\u0ad1\u0ad2\7\u013d" +
					"\2\2\u0ad2\u0b66\3\2\2\2\u0ad3\u0ad4\7\u0118\2\2\u0ad4\u0ad5\7\u013a\2" +
					"\2\u0ad5\u0ae2\5\u0164\u00b3\2\u0ad6\u0ad7\7\u012c\2\2\u0ad7\u0adf\5\u0164" +
					"\u00b3\2\u0ad8\u0ad9\7\u012c\2\2\u0ad9\u0ada\5\u0164\u00b3\2\u0ada\u0adb" +
					"\7\u0130\2\2\u0adb\u0adc\5\u0164\u00b3\2\u0adc\u0ade\3\2\2\2\u0add\u0ad8" +
					"\3\2\2\2\u0ade\u0ae1\3\2\2\2\u0adf\u0add\3\2\2\2\u0adf\u0ae0\3\2\2\2\u0ae0" +
					"\u0ae3\3\2\2\2\u0ae1\u0adf\3\2\2\2\u0ae2\u0ad6\3\2\2\2\u0ae2\u0ae3\3\2" +
					"\2\2\u0ae3\u0ae4\3\2\2\2\u0ae4\u0ae5\7\u013d\2\2\u0ae5\u0b66\3\2\2\2\u0ae6" +
					"\u0ae7\7\u0119\2\2\u0ae7\u0ae8\7\u013a\2\2\u0ae8\u0af5\5\u0164\u00b3\2" +
					"\u0ae9\u0aea\7\u012c\2\2\u0aea\u0af2\5\u0164\u00b3\2\u0aeb\u0aec\7\u012c" +
					"\2\2\u0aec\u0aed\5\u0164\u00b3\2\u0aed\u0aee\7\u0130\2\2\u0aee\u0aef\5" +
					"\u0164\u00b3\2\u0aef\u0af1\3\2\2\2\u0af0\u0aeb\3\2\2\2\u0af1\u0af4\3\2" +
					"\2\2\u0af2\u0af0\3\2\2\2\u0af2\u0af3\3\2\2\2\u0af3\u0af6\3\2\2\2\u0af4" +
					"\u0af2\3\2\2\2\u0af5\u0ae9\3\2\2\2\u0af5\u0af6\3\2\2\2\u0af6\u0af7\3\2" +
					"\2\2\u0af7\u0af8\7\u013d\2\2\u0af8\u0b66\3\2\2\2\u0af9\u0afa\7\u011a\2" +
					"\2\u0afa\u0afb\7\u013a\2\2\u0afb\u0b08\5\u0164\u00b3\2\u0afc\u0afd\7\u012c" +
					"\2\2\u0afd\u0b05\5\u0164\u00b3\2\u0afe\u0aff\7\u012c\2\2\u0aff\u0b00\5" +
					"\u0164\u00b3\2\u0b00\u0b01\7\u0130\2\2\u0b01\u0b02\5\u0164\u00b3\2\u0b02" +
					"\u0b04\3\2\2\2\u0b03\u0afe\3\2\2\2\u0b04\u0b07\3\2\2\2\u0b05\u0b03\3\2" +
					"\2\2\u0b05\u0b06\3\2\2\2\u0b06\u0b09\3\2\2\2\u0b07\u0b05\3\2\2\2\u0b08" +
					"\u0afc\3\2\2\2\u0b08\u0b09\3\2\2\2\u0b09\u0b0a\3\2\2\2\u0b0a\u0b0b\7\u013d" +
					"\2\2\u0b0b\u0b66\3\2\2\2\u0b0c\u0b0d\7\u011b\2\2\u0b0d\u0b0e\7\u013a\2" +
					"\2\u0b0e\u0b1b\5\u0164\u00b3\2\u0b0f\u0b10\7\u012c\2\2\u0b10\u0b18\5\u0164" +
					"\u00b3\2\u0b11\u0b12\7\u012c\2\2\u0b12\u0b13\5\u0164\u00b3\2\u0b13\u0b14" +
					"\7\u0130\2\2\u0b14\u0b15\5\u0164\u00b3\2\u0b15\u0b17\3\2\2\2\u0b16\u0b11" +
					"\3\2\2\2\u0b17\u0b1a\3\2\2\2\u0b18\u0b16\3\2\2\2\u0b18\u0b19\3\2\2\2\u0b19" +
					"\u0b1c\3\2\2\2\u0b1a\u0b18\3\2\2\2\u0b1b\u0b0f\3\2\2\2\u0b1b\u0b1c\3\2" +
					"\2\2\u0b1c\u0b1d\3\2\2\2\u0b1d\u0b1e\7\u013d\2\2\u0b1e\u0b66\3\2\2\2\u0b1f" +
					"\u0b20\7\u011c\2\2\u0b20\u0b21\7\u013a\2\2\u0b21\u0b2e\5\u0164\u00b3\2" +
					"\u0b22\u0b23\7\u012c\2\2\u0b23\u0b2b\5\u0164\u00b3\2\u0b24\u0b25\7\u012c" +
					"\2\2\u0b25\u0b26\5\u0164\u00b3\2\u0b26\u0b27\7\u0130\2\2\u0b27\u0b28\5" +
					"\u0164\u00b3\2\u0b28\u0b2a\3\2\2\2\u0b29\u0b24\3\2\2\2\u0b2a\u0b2d\3\2" +
					"\2\2\u0b2b\u0b29\3\2\2\2\u0b2b\u0b2c\3\2\2\2\u0b2c\u0b2f\3\2\2\2\u0b2d" +
					"\u0b2b\3\2\2\2\u0b2e\u0b22\3\2\2\2\u0b2e\u0b2f\3\2\2\2\u0b2f\u0b30\3\2" +
					"\2\2\u0b30\u0b31\7\u013d\2\2\u0b31\u0b66\3\2\2\2\u0b32\u0b33\7\u011d\2" +
					"\2\u0b33\u0b34\7\u013a\2\2\u0b34\u0b3c\5\u0164\u00b3\2\u0b35\u0b36\7\u012c" +
					"\2\2\u0b36\u0b37\5\u0164\u00b3\2\u0b37\u0b38\7\u0130\2\2\u0b38\u0b39\5" +
					"\u0164\u00b3\2\u0b39\u0b3b\3\2\2\2\u0b3a\u0b35\3\2\2\2\u0b3b\u0b3e\3\2" +
					"\2\2\u0b3c\u0b3a\3\2\2\2\u0b3c\u0b3d\3\2\2\2\u0b3d\u0b3f\3\2\2\2\u0b3e" +
					"\u0b3c\3\2\2\2\u0b3f\u0b40\7\u013d\2\2\u0b40\u0b66\3\2\2\2\u0b41\u0b42" +
					"\7\u011e\2\2\u0b42\u0b43\7\u013a\2\2\u0b43\u0b49\5\u0164\u00b3\2\u0b44" +
					"\u0b45\7\u012c\2\2\u0b45\u0b46\5\u0164\u00b3\2\u0b46\u0b47\7\u0130\2\2" +
					"\u0b47\u0b48\5\u0164\u00b3\2\u0b48\u0b4a\3\2\2\2\u0b49\u0b44\3\2\2\2\u0b4a" +
					"\u0b4b\3\2\2\2\u0b4b\u0b49\3\2\2\2\u0b4b\u0b4c\3\2\2\2\u0b4c\u0b4f\3\2" +
					"\2\2\u0b4d\u0b4e\7\u012c\2\2\u0b4e\u0b50\5\u0164\u00b3\2\u0b4f\u0b4d\3" +
					"\2\2\2\u0b4f\u0b50\3\2\2\2\u0b50\u0b51\3\2\2\2\u0b51\u0b52\7\u013d\2\2" +
					"\u0b52\u0b66\3\2\2\2\u0b53\u0b54\7\u00d2\2\2\u0b54\u0b55\7\u013a\2\2\u0b55" +
					"\u0b56\5\u0164\u00b3\2\u0b56\u0b57\7\u013d\2\2\u0b57\u0b66\3\2\2\2\u0b58" +
					"\u0b59\7\u00e9\2\2\u0b59\u0b5a\7\u013a\2\2\u0b5a\u0b5b\5\u0164\u00b3\2" +
					"\u0b5b\u0b5c\7g\2\2\u0b5c\u0b5f\5\u0164\u00b3\2\u0b5d\u0b5e\7c\2\2\u0b5e" +
					"\u0b60\5\u0164\u00b3\2\u0b5f\u0b5d\3\2\2\2\u0b5f\u0b60\3\2\2\2\u0b60\u0b61" +
					"\3\2\2\2\u0b61\u0b62\7\u013d\2\2\u0b62\u0b66\3\2\2\2\u0b63\u0b66\7\u0122" +
					"\2\2\u0b64\u0b66\7\u0124\2\2\u0b65\u0a9d\3\2\2\2\u0b65\u0a9e\3\2\2\2\u0b65" +
					"\u0aa8\3\2\2\2\u0b65\u0aaf\3\2\2\2\u0b65\u0ab0\3\2\2\2\u0b65\u0ab5\3\2" +
					"\2\2\u0b65\u0abd\3\2\2\2\u0b65\u0abe\3\2\2\2\u0b65\u0ac0\3\2\2\2\u0b65" +
					"\u0ad3\3\2\2\2\u0b65\u0ae6\3\2\2\2\u0b65\u0af9\3\2\2\2\u0b65\u0b0c\3\2" +
					"\2\2\u0b65\u0b1f\3\2\2\2\u0b65\u0b32\3\2\2\2\u0b65\u0b41\3\2\2\2\u0b65" +
					"\u0b53\3\2\2\2\u0b65\u0b58\3\2\2\2\u0b65\u0b63\3\2\2\2\u0b65\u0b64\3\2" +
					"\2\2\u0b66\u0181\3\2\2\2\u0b67\u0b68\5\u0194\u00cb\2\u0b68\u0b6a\7\u013a" +
					"\2\2\u0b69\u0b6b\5\u0184\u00c3\2\u0b6a\u0b69\3\2\2\2\u0b6a\u0b6b\3\2\2" +
					"\2\u0b6b\u0b6c\3\2\2\2\u0b6c\u0b6d\7\u013d\2\2\u0b6d\u0183\3\2\2\2\u0b6e" +
					"\u0b73\5\u0186\u00c4\2\u0b6f\u0b70\7\u012c\2\2\u0b70\u0b72\5\u0186\u00c4" +
					"\2\u0b71\u0b6f\3\2\2\2\u0b72\u0b75\3\2\2\2\u0b73\u0b71\3\2\2\2\u0b73\u0b74" +
					"\3\2\2\2\u0b74\u0185\3\2\2\2\u0b75\u0b73\3\2\2\2\u0b76\u0b7c\6\u00c4\f" +
					"\2\u0b77\u0b78\5\u0194\u00cb\2\u0b78\u0b7a\7\u0130\2\2\u0b79\u0b7b\7\u0134" +
					"\2\2\u0b7a\u0b79\3\2\2\2\u0b7a\u0b7b\3\2\2\2\u0b7b\u0b7d\3\2\2\2\u0b7c" +
					"\u0b77\3\2\2\2\u0b7c\u0b7d\3\2\2\2\u0b7d\u0b7e\3\2\2\2\u0b7e\u0b7f\5\u0164" +
					"\u00b3\2\u0b7f\u0187\3\2\2\2\u0b80\u0b81\7\u0125\2\2\u0b81\u0b82\7\u013a" +
					"\2\2\u0b82\u0b83\5\u018a\u00c6\2\u0b83\u0b85\7\u013d\2\2\u0b84\u0b86\7" +
					"\u013f\2\2\u0b85\u0b84\3\2\2\2\u0b85\u0b86\3\2\2\2\u0b86\u0189\3\2\2\2" +
					"\u0b87\u0b8a\5\u0196\u00cc\2\u0b88\u0b8a\5\u0194\u00cb\2\u0b89\u0b87\3" +
					"\2\2\2\u0b89\u0b88\3\2\2\2\u0b8a\u0b92\3\2\2\2\u0b8b\u0b8e\7\u012a\2\2" +
					"\u0b8c\u0b8f\5\u0196\u00cc\2\u0b8d\u0b8f\5\u0194\u00cb\2\u0b8e\u0b8c\3" +
					"\2\2\2\u0b8e\u0b8d\3\2\2\2\u0b8f\u0b91\3\2\2\2\u0b90\u0b8b\3\2\2\2\u0b91" +
					"\u0b94\3\2\2\2\u0b92\u0b90\3\2\2\2\u0b92\u0b93\3\2\2\2\u0b93\u018b\3\2" +
					"\2\2\u0b94\u0b92\3\2\2\2\u0b95\u0b96\7:\2\2\u0b96\u0b97\5\u0196\u00cc" +
					"\2\u0b97\u018d\3\2\2\2\u0b98\u0b99\7\u00f2\2\2\u0b99\u0b9a\5\u0196\u00cc" +
					"\2\u0b9a\u018f\3\2\2\2\u0b9b\u0b9c\7\u013a\2\2\u0b9c\u0191\3\2\2\2\u0b9d" +
					"\u0b9e\7\u013d\2\2\u0b9e\u0193\3\2\2\2\u0b9f\u0ba2\7\u0141\2\2\u0ba0\u0ba2" +
					"\5\u01a0\u00d1\2\u0ba1\u0b9f\3\2\2\2\u0ba1\u0ba0\3\2\2\2\u0ba2\u0baa\3" +
					"\2\2\2\u0ba3\u0ba6\7\6\2\2\u0ba4\u0ba7\7\u0141\2\2\u0ba5\u0ba7\5\u01a0" +
					"\u00d1\2\u0ba6\u0ba4\3\2\2\2\u0ba6\u0ba5\3\2\2\2\u0ba7\u0ba9\3\2\2\2\u0ba8" +
					"\u0ba3\3\2\2\2\u0ba9\u0bac\3\2\2\2\u0baa\u0ba8\3\2\2\2\u0baa\u0bab\3\2" +
					"\2\2\u0bab\u0195\3\2\2\2\u0bac\u0baa\3\2\2\2\u0bad\u0bb0\7\u0143\2\2\u0bae" +
					"\u0bb0\7\u0142\2\2\u0baf\u0bad\3\2\2\2\u0baf\u0bae\3\2\2\2\u0bb0\u0197" +
					"\3\2\2\2\u0bb1\u0bb3\t(\2\2\u0bb2\u0bb1\3\2\2\2\u0bb2\u0bb3\3\2\2\2\u0bb3" +
					"\u0bb4\3\2\2\2\u0bb4\u0bb5\7\u0144\2\2\u0bb5\u0199\3\2\2\2\u0bb6\u0bb8" +
					"\t(\2\2\u0bb7\u0bb6\3\2\2\2\u0bb7\u0bb8\3\2\2\2\u0bb8\u0bb9\3\2\2\2\u0bb9" +
					"\u0bba\7\u0145\2\2\u0bba\u019b\3\2\2\2\u0bbb\u0bbc\t)\2\2\u0bbc\u019d" +
					"\3\2\2\2\u0bbd\u0bbe\7\u00a9\2\2\u0bbe\u019f\3\2\2\2\u0bbf\u0bc0\t*\2" +
					"\2\u0bc0\u01a1\3\2\2\2\u0170\u01a7\u01aa\u01ae\u01b1\u01b6\u01bd\u01c3" +
					"\u01c5\u01ce\u01d1\u01d3\u01f6\u01fc\u0203\u0208\u020c\u0210\u0213\u0217" +
					"\u021a\u021d\u0224\u022a\u0230\u0237\u023e\u0245\u024a\u025b\u0264\u0273" +
					"\u027d\u0281\u0285\u028e\u0292\u029a\u02a1\u02a7\u02aa\u02b3\u02c3\u02ca" +
					"\u02d1\u02d5\u02de\u02e3\u02eb\u02f0\u02f9\u0305\u030a\u030d\u0319\u0322" +
					"\u0330\u0334\u033f\u034a\u0354\u035b\u0362\u0366\u036a\u036f\u0373\u0378" +
					"\u037c\u0380\u038d\u03a0\u03a7\u03ac\u03b1\u03b9\u03c1\u03c7\u03d0\u03d4" +
					"\u03dc\u03df\u03e4\u03e9\u03f0\u03f7\u03fa\u0401\u0407\u040c\u0412\u0417" +
					"\u041a\u0420\u042e\u0438\u043e\u0443\u0448\u044d\u0451\u0456\u0459\u0463" +
					"\u046f\u0476\u0479\u0485\u048a\u048f\u0492\u0499\u04a7\u04b4\u04b6\u04bb" +
					"\u04be\u04cd\u04d3\u04de\u04e1\u04eb\u04f2\u04f8\u0500\u050d\u0517\u052b" +
					"\u0531\u0535\u053a\u053e\u0543\u0546\u054b\u054e\u055c\u057d\u057f\u0584" +
					"\u0588\u058d\u0594\u0597\u059a\u059f\u05a3\u05a5\u05ac\u05b2\u05b9\u05bf" +
					"\u05c2\u05c7\u05cb\u05ce\u05d5\u05db\u05de\u05e8\u05f1\u05f8\u05ff\u0601" +
					"\u0607\u060a\u0615\u061e\u0624\u062a\u062d\u0632\u0635\u0638\u063b\u063e" +
					"\u0644\u064e\u0659\u065c\u0663\u0668\u066d\u0671\u0679\u067d\u0682\u0686" +
					"\u0688\u068d\u0695\u069a\u069e\u06a6\u06ae\u06b1\u06b4\u06b9\u06c2\u06c6" +
					"\u06d0\u06e2\u06e6\u06ea\u06f4\u06fa\u06fe\u0702\u070e\u0715\u0725\u072c" +
					"\u0730\u0734\u0738\u0744\u074d\u0756\u0766\u076a\u0786\u078a\u0795\u07a9" +
					"\u07b1\u07b5\u07b9\u07c2\u07d3\u07d5\u07dd\u07ea\u07f0\u07f7\u0804\u080c" +
					"\u0817\u081f\u0823\u0827\u082b\u082d\u0832\u0835\u0838\u083b\u083f\u0842" +
					"\u0845\u0848\u084b\u0852\u085d\u0861\u0864\u086d\u0871\u087b\u0883\u0889" +
					"\u088d\u0893\u089c\u089f\u08a4\u08a7\u08b1\u08b6\u08bf\u08c4\u08ce\u08d2" +
					"\u08e0\u08ed\u08f2\u08f6\u08fc\u0907\u0909\u090d\u0914\u091c\u0922\u0929" +
					"\u092e\u0939\u0942\u094b\u094f\u0959\u095e\u0974\u0977\u098a\u099a\u099c" +
					"\u09a7\u09b6\u09c2\u09c6\u09d1\u09d5\u09e1\u09e5\u09f0\u09f5\u09fa\u09fe" +
					"\u0a02\u0a07\u0a0b\u0a0f\u0a26\u0a28\u0a3a\u0a3c\u0a44\u0a49\u0a4e\u0a53" +
					"\u0a60\u0a65\u0a6a\u0a6f\u0a74\u0a79\u0a7e\u0a83\u0a85\u0a8c\u0a8f\u0a9a" +
					"\u0aa4\u0aac\u0ab5\u0abb\u0acc\u0acf\u0adf\u0ae2\u0af2\u0af5\u0b05\u0b08" +
					"\u0b18\u0b1b\u0b2b\u0b2e\u0b3c\u0b4b\u0b4f\u0b5f\u0b65\u0b6a\u0b73\u0b7a" +
					"\u0b7c\u0b85\u0b89\u0b8e\u0b92\u0ba1\u0ba6\u0baa\u0baf\u0bb2\u0bb7";
	public static final String _serializedATN = Utils.join(
			new String[]{
					_serializedATNSegment0,
					_serializedATNSegment1
			},
			""
	);

	static {
		RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
	}

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

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

	public HplsqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	private static String[] makeRuleNames() {
		return new String[]{
				"program", "block", "begin_end_block", "single_block_stmt", "block_end",
				"proc_block", "stmt", "typeof", "error_stmt", "invalid_select", "invalid_where_clause",
				"invalid_from_clause", "invalid_bool_expr", "invalid_bool_expr_atom",
				"invalid_bool_expr_binary", "invalid_bool_expr_binary_operator", "invalid_cpp_function_stmt",
				"invalid_cpp_function_header", "invalid_cpp_function_params_clause",
				"invalid_cpp_function_param", "exception_block", "exception_block_item",
				"semicolon_stmt", "null_stmt", "expr_stmt", "assignment_stmt", "assignment_stmt_item",
				"assignment_stmt_single_item", "assignment_stmt_multiple_item", "assignment_stmt_select_item",
				"assignment_query_stmt", "associate_locator_stmt", "break_stmt", "call_stmt",
				"close_stmt", "declare_stmt", "declare_block", "declare_block_inplace",
				"declare_stmt_item", "declare_var_item", "declare_condition_item", "declare_handler_item",
				"create_type_stmt", "create_type_definition", "create_type_items", "create_type_items_item",
				"create_type_options", "create_type_option", "create_type_store_location",
				"create_type_delimiter", "declare_temporary_table_item", "create_table_stmt",
				"create_local_temp_table_stmt", "create_table_definition", "create_table_columns",
				"create_table_columns_item", "column_name", "create_table_column_inline_cons",
				"create_table_column_cons", "create_table_fk_action", "create_table_preoptions",
				"create_table_preoptions_item", "create_table_preoptions_td_item", "create_table_options",
				"create_table_options_item", "create_table_options_ora_item", "create_table_options_db2_item",
				"create_table_options_td_item", "create_table_options_hive_item", "create_table_store_location",
				"create_table_delimiter", "create_table_hive_row_format", "create_table_hive_row_format_fields",
				"create_table_options_mssql_item", "create_table_options_mysql_item",
				"dtype", "dtype_len", "dtype_attr", "dtype_default", "create_database_stmt",
				"create_database_option", "create_function_stmt", "create_function_return",
				"create_package_stmt", "package_spec", "package_spec_item", "create_package_body_stmt",
				"package_body", "package_body_item", "create_procedure_stmt", "create_routine_params",
				"create_routine_param_item", "create_routine_options", "create_routine_option",
				"exec_stmt", "if_stmt", "if_plsql_stmt", "if_tsql_stmt", "if_bteq_stmt",
				"elseif_block", "else_block", "exit_stmt", "leave_stmt", "cmp_stmt",
				"cmp_source", "create_index_stmt", "create_index_col", "index_storage_clause",
				"index_mssql_storage_clause", "quit_stmt", "return_stmt", "cpp_stmt",
				"cpp_function_stmt", "cpp_function_header", "cpp_function_params_clause",
				"cpp_function_param", "cpp_function_body", "cpp_if_stmt", "cpp_elseif_clause",
				"cpp_else_clause", "cpp_for_stmt", "cpp_for_stmt_header", "cpp_for_params_clause",
				"cpp_for_param", "cpp_for_stmt_var_incr_caluse", "cpp_for_stmt_var_incr",
				"cpp_for_stmt_body", "cpp_declare_assignment_stmt", "cpp_declare_stmt",
				"cpp_assignment_stmt", "cpp_return_stmt", "cpp_scope", "execute_query_stmt",
				"while_stmt", "for_range_stmt", "label", "using_clause", "select_stmt",
				"fullselect_stmt", "fullselect_stmt_item", "fullselect_set_clause", "subselect_stmt",
				"select_list", "select_list_set", "select_list_limit", "select_list_item",
				"select_list_alias", "select_list_asterisk", "into_clause", "from_clause",
				"from_table_clause", "from_table_name_clause", "from_subselect_clause",
				"from_join_clause", "from_join_type_clause", "from_table_values_clause",
				"from_table_values_row", "from_alias_clause", "table_name", "where_clause",
				"group_by_clause", "having_clause", "qualify_clause", "order_by_clause",
				"select_options", "select_options_item", "bool_expr", "bool_expr_atom",
				"bool_expr_unary", "bool_expr_is_not_null", "bool_expr_between", "bool_expr_exists",
				"bool_expr_single_in", "bool_expr_multi_in", "bool_expr_binary", "bool_expr_logical_operator",
				"bool_expr_binary_operator", "expr", "expr_atom", "expr_interval", "interval_item",
				"expr_concat", "expr_concat_item", "expr_case", "expr_case_simple", "expr_case_searched",
				"expr_cursor_attribute", "expr_agg_window_func", "expr_func_all_distinct",
				"expr_func_over_clause", "expr_func_partition_by_clause", "expr_spec_func",
				"expr_func", "expr_func_params", "func_param", "write_stmt", "write_stmt_string",
				"date_literal", "timestamp_literal", "parenthesis_open", "parenthesis_close",
				"ident", "string", "int_number", "dec_number", "bool_literal", "null_const",
				"non_reserved_words"
		};
	}

	private static String[] makeLiteralNames() {
		return new String[]{
				null, "'@'", "'#'", "'%'", "'.'", null, null, null, null, null, null,
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
				null, null, null, null, null, null, null, null, null, "'+'", "':'", "','",
				"'||'", "'/'", "'..'", "'='", "'=='", "'<>'", "'!='", "'>'", "'>='",
				"'<'", "'<='", "'*'", "'{'", "'('", "'['", "'}'", "')'", "']'", "';'",
				"'-'"
		};
	}

	private static String[] makeSymbolicNames() {
		return new String[]{
				null, null, null, null, null, "T_ACTION", "T_ALL", "T_ALTER", "T_AND",
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
				"T_STDEV", "T_SYSDATE", "T_VARIANCE", "T_USER", "T_WRITE", "T_TYPEOF",
				"T_QUERY", "T_QUERY_RESULT", "T_EXECUTE_QUERY", "T_ADD", "T_COLON", "T_COMMA",
				"T_PIPE", "T_DIV", "T_DOT2", "T_EQUAL", "T_EQUAL2", "T_NOTEQUAL", "T_NOTEQUAL2",
				"T_GREATER", "T_GREATEREQUAL", "T_LESS", "T_LESSEQUAL", "T_MUL", "T_OPEN_B",
				"T_OPEN_P", "T_OPEN_SB", "T_CLOSE_B", "T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON",
				"T_SUB", "L_ID", "L_S_STRING", "L_D_STRING", "L_INT", "L_DEC", "L_WS",
				"L_M_COMMENT", "L_S_COMMENT", "L_FILE", "L_LABEL"
		};
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

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(416);
				block();
				setState(417);
				match(EOF);
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

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(426);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							{
								setState(421);
								_errHandler.sync(this);
								switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
									case 1: {
										setState(419);
										begin_end_block();
									}
									break;
									case 2: {
										setState(420);
										stmt();
									}
									break;
								}
								setState(424);
								_errHandler.sync(this);
								switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
									case 1: {
										setState(423);
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
					setState(428);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
				} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
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

	public final Begin_end_blockContext begin_end_block() throws RecognitionException {
		Begin_end_blockContext _localctx = new Begin_end_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_begin_end_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_DECLARE) {
					{
						setState(430);
						declare_block();
					}
				}

				setState(433);
				match(T_BEGIN);
				setState(434);
				block();
				setState(436);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
					case 1: {
						setState(435);
						exception_block();
					}
					break;
				}
				setState(438);
				block_end();
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

	public final Single_block_stmtContext single_block_stmt() throws RecognitionException {
		Single_block_stmtContext _localctx = new Single_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_block_stmt);
		try {
			setState(451);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(440);
					match(T_BEGIN);
					setState(441);
					block();
					setState(443);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
						case 1: {
							setState(442);
							exception_block();
						}
						break;
					}
					setState(445);
					block_end();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(447);
					stmt();
					setState(449);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
						case 1: {
							setState(448);
							match(T_SEMICOLON);
						}
						break;
					}
				}
				break;
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

	public final Block_endContext block_end() throws RecognitionException {
		Block_endContext _localctx = new Block_endContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(453);
				if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION")))
					throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
				setState(454);
				match(T_END);
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

	public final Proc_blockContext proc_block() throws RecognitionException {
		Proc_blockContext _localctx = new Proc_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proc_block);
		try {
			int _alt;
			setState(465);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(456);
					begin_end_block();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(458);
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
							case 1: {
								{
									setState(457);
									stmt();
								}
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(460);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
					} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
					setState(463);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
						case 1: {
							setState(462);
							match(T_GO);
						}
						break;
					}
				}
				break;
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

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(500);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(467);
					assignment_stmt();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(468);
					associate_locator_stmt();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(469);
					break_stmt();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(470);
					call_stmt();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(471);
					close_stmt();
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(472);
					cmp_stmt();
				}
				break;
				case 7:
					enterOuterAlt(_localctx, 7);
				{
					setState(473);
					create_database_stmt();
				}
				break;
				case 8:
					enterOuterAlt(_localctx, 8);
				{
					setState(474);
					create_function_stmt();
				}
				break;
				case 9:
					enterOuterAlt(_localctx, 9);
				{
					setState(475);
					create_index_stmt();
				}
				break;
				case 10:
					enterOuterAlt(_localctx, 10);
				{
					setState(476);
					create_local_temp_table_stmt();
				}
				break;
				case 11:
					enterOuterAlt(_localctx, 11);
				{
					setState(477);
					create_package_stmt();
				}
				break;
				case 12:
					enterOuterAlt(_localctx, 12);
				{
					setState(478);
					create_package_body_stmt();
				}
				break;
				case 13:
					enterOuterAlt(_localctx, 13);
				{
					setState(479);
					create_procedure_stmt();
				}
				break;
				case 14:
					enterOuterAlt(_localctx, 14);
				{
					setState(480);
					create_table_stmt();
				}
				break;
				case 15:
					enterOuterAlt(_localctx, 15);
				{
					setState(481);
					create_type_stmt();
				}
				break;
				case 16:
					enterOuterAlt(_localctx, 16);
				{
					setState(482);
					declare_stmt();
				}
				break;
				case 17:
					enterOuterAlt(_localctx, 17);
				{
					setState(483);
					exec_stmt();
				}
				break;
				case 18:
					enterOuterAlt(_localctx, 18);
				{
					setState(484);
					exit_stmt();
				}
				break;
				case 19:
					enterOuterAlt(_localctx, 19);
				{
					setState(485);
					for_range_stmt();
				}
				break;
				case 20:
					enterOuterAlt(_localctx, 20);
				{
					setState(486);
					if_stmt();
				}
				break;
				case 21:
					enterOuterAlt(_localctx, 21);
				{
					setState(487);
					leave_stmt();
				}
				break;
				case 22:
					enterOuterAlt(_localctx, 22);
				{
					setState(488);
					quit_stmt();
				}
				break;
				case 23:
					enterOuterAlt(_localctx, 23);
				{
					setState(489);
					return_stmt();
				}
				break;
				case 24:
					enterOuterAlt(_localctx, 24);
				{
					setState(490);
					select_stmt();
				}
				break;
				case 25:
					enterOuterAlt(_localctx, 25);
				{
					setState(491);
					while_stmt();
				}
				break;
				case 26:
					enterOuterAlt(_localctx, 26);
				{
					setState(492);
					typeof();
				}
				break;
				case 27:
					enterOuterAlt(_localctx, 27);
				{
					setState(493);
					cpp_stmt();
				}
				break;
				case 28:
					enterOuterAlt(_localctx, 28);
				{
					setState(494);
					execute_query_stmt();
				}
				break;
				case 29:
					enterOuterAlt(_localctx, 29);
				{
					setState(495);
					error_stmt();
				}
				break;
				case 30:
					enterOuterAlt(_localctx, 30);
				{
					setState(496);
					label();
				}
				break;
				case 31:
					enterOuterAlt(_localctx, 31);
				{
					setState(497);
					null_stmt();
				}
				break;
				case 32:
					enterOuterAlt(_localctx, 32);
				{
					setState(498);
					expr_stmt();
				}
				break;
				case 33:
					enterOuterAlt(_localctx, 33);
				{
					setState(499);
					semicolon_stmt();
				}
				break;
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

	public final TypeofContext typeof() throws RecognitionException {
		TypeofContext _localctx = new TypeofContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(502);
				match(T_TYPEOF);
				setState(503);
				match(T_OPEN_P);
				setState(506);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
					case 1: {
						setState(504);
						expr(0);
					}
					break;
					case 2: {
						setState(505);
						bool_expr(0);
					}
					break;
				}
				setState(508);
				match(T_CLOSE_P);
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

	public final Error_stmtContext error_stmt() throws RecognitionException {
		Error_stmtContext _localctx = new Error_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_error_stmt);
		try {
			setState(513);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(510);
					invalid_select();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(511);
					invalid_bool_expr();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(512);
					invalid_cpp_function_stmt();
				}
				break;
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

	public final Invalid_selectContext invalid_select() throws RecognitionException {
		Invalid_selectContext _localctx = new Invalid_selectContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_invalid_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(515);
				_la = _input.LA(1);
				if (!(_la == T_SEL || _la == T_SELECT)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(516);
				select_list();
				setState(518);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
					case 1: {
						setState(517);
						into_clause();
					}
					break;
				}
				setState(522);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
					case 1: {
						setState(520);
						from_clause();
					}
					break;
					case 2: {
						setState(521);
						invalid_from_clause();
					}
					break;
				}
				setState(526);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
					case 1: {
						setState(524);
						where_clause();
					}
					break;
					case 2: {
						setState(525);
						invalid_where_clause();
					}
					break;
				}
				setState(529);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
					case 1: {
						setState(528);
						group_by_clause();
					}
					break;
				}
				setState(533);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
					case 1: {
						setState(531);
						having_clause();
					}
					break;
					case 2: {
						setState(532);
						qualify_clause();
					}
					break;
				}
				setState(536);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
					case 1: {
						setState(535);
						order_by_clause();
					}
					break;
				}
				setState(539);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
					case 1: {
						setState(538);
						select_options();
					}
					break;
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

	public final Invalid_where_clauseContext invalid_where_clause() throws RecognitionException {
		Invalid_where_clauseContext _localctx = new Invalid_where_clauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_invalid_where_clause);
		try {
			setState(546);
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
				case T_WRITE:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					enterOuterAlt(_localctx, 1);
				{
					setState(541);
					bool_expr(0);
					notifyErrorListeners("Missing 'where' word ");
				}
				break;
				case T_WHERE:
					enterOuterAlt(_localctx, 2);
				{
					setState(544);
					match(T_WHERE);
					setState(545);
					invalid_bool_expr();
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Invalid_from_clauseContext invalid_from_clause() throws RecognitionException {
		Invalid_from_clauseContext _localctx = new Invalid_from_clauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_invalid_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(548);
				from_table_clause();
				setState(552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 22, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(549);
								from_join_clause();
							}
						}
					}
					setState(554);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 22, _ctx);
				}
				notifyErrorListeners("Missing 'from' word ");
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

	public final Invalid_bool_exprContext invalid_bool_expr() throws RecognitionException {
		Invalid_bool_exprContext _localctx = new Invalid_bool_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_invalid_bool_expr);
		int _la;
		try {
			int _alt;
			setState(584);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(558);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
						case 1: {
							setState(557);
							match(T_NOT);
						}
						break;
					}
					setState(560);
					bool_expr(0);
					setState(561);
					match(T_CLOSE_P);
					notifyErrorListeners("Missing opening '('");
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_NOT) {
						{
							setState(564);
							match(T_NOT);
						}
					}

					setState(567);
					match(T_OPEN_P);
					setState(568);
					bool_expr(0);
					notifyErrorListeners("Missing closing ')'");
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(572);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
						case 1: {
							setState(571);
							match(T_NOT);
						}
						break;
					}
					setState(574);
					bool_expr(0);
					setState(575);
					match(T_CLOSE_P);
					setState(577);
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
							case 1: {
								{
									setState(576);
									match(T_CLOSE_P);
								}
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(579);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
					} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
					notifyErrorListeners("Too many parentheses");
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(583);
					invalid_bool_expr_atom();
				}
				break;
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

	public final Invalid_bool_expr_atomContext invalid_bool_expr_atom() throws RecognitionException {
		Invalid_bool_expr_atomContext _localctx = new Invalid_bool_expr_atomContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_invalid_bool_expr_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(586);
				invalid_bool_expr_binary();
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

	public final Invalid_bool_expr_binaryContext invalid_bool_expr_binary() throws RecognitionException {
		Invalid_bool_expr_binaryContext _localctx = new Invalid_bool_expr_binaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_invalid_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(588);
				expr(0);
				setState(589);
				invalid_bool_expr_binary_operator();
				setState(590);
				expr(0);
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

	public final Invalid_bool_expr_binary_operatorContext invalid_bool_expr_binary_operator() throws RecognitionException {
		Invalid_bool_expr_binary_operatorContext _localctx = new Invalid_bool_expr_binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_invalid_bool_expr_binary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(592);
				ident();
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

	public final Invalid_cpp_function_stmtContext invalid_cpp_function_stmt() throws RecognitionException {
		Invalid_cpp_function_stmtContext _localctx = new Invalid_cpp_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_invalid_cpp_function_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(594);
				invalid_cpp_function_header();
				setState(595);
				cpp_function_body();
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

	public final Invalid_cpp_function_headerContext invalid_cpp_function_header() throws RecognitionException {
		Invalid_cpp_function_headerContext _localctx = new Invalid_cpp_function_headerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_invalid_cpp_function_header);
		try {
			setState(639);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 32, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(597);
					ident();
					setState(598);
					match(T_OPEN_P);
					setState(601);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 28, _ctx)) {
						case 1: {
							setState(599);
							cpp_function_params_clause();
						}
						break;
						case 2: {
							setState(600);
							invalid_cpp_function_params_clause();
						}
						break;
					}
					setState(603);
					match(T_CLOSE_P);
					notifyErrorListeners("Missing data type");
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(606);
					dtype();
					setState(607);
					match(T_OPEN_P);
					setState(610);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 29, _ctx)) {
						case 1: {
							setState(608);
							cpp_function_params_clause();
						}
						break;
						case 2: {
							setState(609);
							invalid_cpp_function_params_clause();
						}
						break;
					}
					setState(612);
					match(T_CLOSE_P);
					notifyErrorListeners("Missing identify");
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(615);
					dtype();
					setState(616);
					ident();
					setState(617);
					match(T_OPEN_P);
					setState(618);
					invalid_cpp_function_params_clause();
					setState(619);
					match(T_CLOSE_P);
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(621);
					dtype();
					setState(622);
					ident();
					setState(625);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 30, _ctx)) {
						case 1: {
							setState(623);
							cpp_function_params_clause();
						}
						break;
						case 2: {
							setState(624);
							invalid_cpp_function_params_clause();
						}
						break;
					}
					setState(627);
					match(T_CLOSE_P);
					notifyErrorListeners("Missing openning '(' ");
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(630);
					dtype();
					setState(631);
					ident();
					setState(632);
					match(T_OPEN_P);
					setState(635);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 31, _ctx)) {
						case 1: {
							setState(633);
							cpp_function_params_clause();
						}
						break;
						case 2: {
							setState(634);
							invalid_cpp_function_params_clause();
						}
						break;
					}
					notifyErrorListeners("Missing closing ')' ");
				}
				break;
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

	public final Invalid_cpp_function_params_clauseContext invalid_cpp_function_params_clause() throws RecognitionException {
		Invalid_cpp_function_params_clauseContext _localctx = new Invalid_cpp_function_params_clauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_invalid_cpp_function_params_clause);
		int _la;
		try {
			int _alt;
			setState(680);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 39, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(643);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 33, _ctx)) {
						case 1: {
							setState(641);
							invalid_cpp_function_param();
						}
						break;
						case 2: {
							setState(642);
							cpp_function_param();
						}
						break;
					}
					setState(645);
					match(T_COMMA);
					notifyErrorListeners("append comma");
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(648);
					invalid_cpp_function_param();
					setState(656);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == T_COMMA) {
						{
							{
								setState(649);
								match(T_COMMA);
								setState(652);
								_errHandler.sync(this);
								switch (getInterpreter().adaptivePredict(_input, 34, _ctx)) {
									case 1: {
										setState(650);
										cpp_function_param();
									}
									break;
									case 2: {
										setState(651);
										invalid_cpp_function_param();
									}
									break;
								}
							}
						}
						setState(658);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(659);
					cpp_function_param();
					setState(664);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 36, _ctx);
					while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(660);
									match(T_COMMA);
									setState(661);
									cpp_function_param();
								}
							}
						}
						setState(666);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 36, _ctx);
					}
					setState(669);
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
							case 1: {
								{
									setState(667);
									match(T_COMMA);
									setState(668);
									invalid_cpp_function_param();
								}
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(671);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 37, _ctx);
					} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
					setState(677);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == T_COMMA) {
						{
							{
								setState(673);
								match(T_COMMA);
								setState(674);
								cpp_function_param();
							}
						}
						setState(679);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
				break;
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

	public final Invalid_cpp_function_paramContext invalid_cpp_function_param() throws RecognitionException {
		Invalid_cpp_function_paramContext _localctx = new Invalid_cpp_function_paramContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_invalid_cpp_function_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(682);
				ident();
				notifyErrorListeners("Missing data type");
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

	public final Exception_blockContext exception_block() throws RecognitionException {
		Exception_blockContext _localctx = new Exception_blockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exception_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(685);
				match(T_EXCEPTION);
				setState(687);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							{
								setState(686);
								exception_block_item();
							}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(689);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 40, _ctx);
				} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
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

	public final Exception_block_itemContext exception_block_item() throws RecognitionException {
		Exception_block_itemContext _localctx = new Exception_block_itemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exception_block_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(691);
				match(T_WHEN);
				setState(692);
				match(L_ID);
				setState(693);
				match(T_THEN);
				setState(694);
				block();
				setState(695);
				_la = _input.LA(1);
				if (_la <= 0 || (_la == T_END || _la == T_WHEN)) {
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

	public final Semicolon_stmtContext semicolon_stmt() throws RecognitionException {
		Semicolon_stmtContext _localctx = new Semicolon_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_semicolon_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(697);
				_la = _input.LA(1);
				if (!(_la == T__0 || _la == T__1 || _la == T_DIV || _la == T_SEMICOLON)) {
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

	public final Null_stmtContext null_stmt() throws RecognitionException {
		Null_stmtContext _localctx = new Null_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_null_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(699);
				match(T_NULL);
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

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(701);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("GO")))
					throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"GO\")");
				setState(702);
				expr(0);
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

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignment_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(705);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 41, _ctx)) {
					case 1: {
						setState(704);
						match(T_SET);
					}
					break;
				}
				setState(707);
				assignment_stmt_item();
				setState(712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 42, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(708);
								match(T_COMMA);
								setState(709);
								assignment_stmt_item();
							}
						}
					}
					setState(714);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 42, _ctx);
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

	public final Assignment_stmt_itemContext assignment_stmt_item() throws RecognitionException {
		Assignment_stmt_itemContext _localctx = new Assignment_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignment_stmt_item);
		try {
			setState(719);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 43, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(715);
					assignment_stmt_single_item();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(716);
					assignment_stmt_multiple_item();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(717);
					assignment_stmt_select_item();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(718);
					assignment_query_stmt();
				}
				break;
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

	public final Assignment_stmt_single_itemContext assignment_stmt_single_item() throws RecognitionException {
		Assignment_stmt_single_itemContext _localctx = new Assignment_stmt_single_itemContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assignment_stmt_single_item);
		int _la;
		try {
			setState(737);
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
				case T_WRITE:
				case L_ID:
					enterOuterAlt(_localctx, 1);
				{
					setState(721);
					ident();
					setState(723);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_COLON) {
						{
							setState(722);
							match(T_COLON);
						}
					}

					setState(725);
					match(T_EQUAL);
					setState(726);
					expr(0);
				}
				break;
				case T_OPEN_P:
					enterOuterAlt(_localctx, 2);
				{
					setState(728);
					match(T_OPEN_P);
					setState(729);
					ident();
					setState(730);
					match(T_CLOSE_P);
					setState(732);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_COLON) {
						{
							setState(731);
							match(T_COLON);
						}
					}

					setState(734);
					match(T_EQUAL);
					setState(735);
					expr(0);
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() throws RecognitionException {
		Assignment_stmt_multiple_itemContext _localctx = new Assignment_stmt_multiple_itemContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assignment_stmt_multiple_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(739);
				match(T_OPEN_P);
				setState(740);
				ident();
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T_COMMA) {
					{
						{
							setState(741);
							match(T_COMMA);
							setState(742);
							ident();
						}
					}
					setState(747);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(748);
				match(T_CLOSE_P);
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_COLON) {
					{
						setState(749);
						match(T_COLON);
					}
				}

				setState(752);
				match(T_EQUAL);
				setState(753);
				match(T_OPEN_P);
				setState(754);
				expr(0);
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T_COMMA) {
					{
						{
							setState(755);
							match(T_COMMA);
							setState(756);
							expr(0);
						}
					}
					setState(761);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(762);
				match(T_CLOSE_P);
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

	public final Assignment_stmt_select_itemContext assignment_stmt_select_item() throws RecognitionException {
		Assignment_stmt_select_itemContext _localctx = new Assignment_stmt_select_itemContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assignment_stmt_select_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(776);
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
					case T_WRITE:
					case L_ID: {
						setState(764);
						ident();
					}
					break;
					case T_OPEN_P: {
						{
							setState(765);
							match(T_OPEN_P);
							setState(766);
							ident();
							setState(771);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la == T_COMMA) {
								{
									{
										setState(767);
										match(T_COMMA);
										setState(768);
										ident();
									}
								}
								setState(773);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(774);
							match(T_CLOSE_P);
						}
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_COLON) {
					{
						setState(778);
						match(T_COLON);
					}
				}

				setState(781);
				match(T_EQUAL);
				setState(782);
				match(T_OPEN_P);
				setState(783);
				select_stmt();
				setState(784);
				match(T_CLOSE_P);
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

	public final Assignment_query_stmtContext assignment_query_stmt() throws RecognitionException {
		Assignment_query_stmtContext _localctx = new Assignment_query_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assignment_query_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(786);
				select_stmt();
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

	public final Associate_locator_stmtContext associate_locator_stmt() throws RecognitionException {
		Associate_locator_stmtContext _localctx = new Associate_locator_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_associate_locator_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(788);
				match(T_ASSOCIATE);
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_RESULT) {
					{
						setState(789);
						match(T_RESULT);
						setState(790);
						match(T_SET);
					}
				}

				setState(793);
				_la = _input.LA(1);
				if (!(_la == T_LOCATOR || _la == T_LOCATORS)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(794);
				match(T_OPEN_P);
				setState(795);
				ident();
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T_COMMA) {
					{
						{
							setState(796);
							match(T_COMMA);
							setState(797);
							ident();
						}
					}
					setState(802);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(803);
				match(T_CLOSE_P);
				setState(804);
				match(T_WITH);
				setState(805);
				match(T_PROCEDURE);
				setState(806);
				ident();
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

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(808);
				match(T_BREAK);
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

	public final Call_stmtContext call_stmt() throws RecognitionException {
		Call_stmtContext _localctx = new Call_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_call_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(810);
				match(T_CALL);
				setState(811);
				ident();
				setState(818);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 56, _ctx)) {
					case 1: {
						setState(812);
						match(T_OPEN_P);
						setState(814);
						_errHandler.sync(this);
						switch (getInterpreter().adaptivePredict(_input, 55, _ctx)) {
							case 1: {
								setState(813);
								expr_func_params();
							}
							break;
						}
						setState(816);
						match(T_CLOSE_P);
					}
					break;
					case 2: {
						setState(817);
						expr_func_params();
					}
					break;
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

	public final Close_stmtContext close_stmt() throws RecognitionException {
		Close_stmtContext _localctx = new Close_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_close_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(820);
				match(T_CLOSE);
				setState(821);
				match(L_ID);
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

	public final Declare_stmtContext declare_stmt() throws RecognitionException {
		Declare_stmtContext _localctx = new Declare_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_declare_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(823);
				match(T_DECLARE);
				setState(824);
				declare_stmt_item();
				setState(829);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 57, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(825);
								match(T_COMMA);
								setState(826);
								declare_stmt_item();
							}
						}
					}
					setState(831);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 57, _ctx);
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

	public final Declare_blockContext declare_block() throws RecognitionException {
		Declare_blockContext _localctx = new Declare_blockContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_declare_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(832);
				match(T_DECLARE);
				setState(833);
				declare_stmt_item();
				setState(834);
				match(T_SEMICOLON);
				setState(840);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 58, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(835);
								declare_stmt_item();
								setState(836);
								match(T_SEMICOLON);
							}
						}
					}
					setState(842);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 58, _ctx);
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

	public final Declare_block_inplaceContext declare_block_inplace() throws RecognitionException {
		Declare_block_inplaceContext _localctx = new Declare_block_inplaceContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_declare_block_inplace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(843);
				declare_stmt_item();
				setState(844);
				match(T_SEMICOLON);
				setState(850);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 59, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(845);
								declare_stmt_item();
								setState(846);
								match(T_SEMICOLON);
							}
						}
					}
					setState(852);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 59, _ctx);
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

	public final Declare_stmt_itemContext declare_stmt_item() throws RecognitionException {
		Declare_stmt_itemContext _localctx = new Declare_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_declare_stmt_item);
		try {
			setState(857);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 60, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(853);
					declare_condition_item();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(854);
					declare_handler_item();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(855);
					declare_var_item();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(856);
					declare_temporary_table_item();
				}
				break;
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

	public final Declare_var_itemContext declare_var_item() throws RecognitionException {
		Declare_var_itemContext _localctx = new Declare_var_itemContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_declare_var_item);
		int _la;
		try {
			int _alt;
			setState(894);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 68, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(859);
					ident();
					setState(864);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == T_COMMA) {
						{
							{
								setState(860);
								match(T_COMMA);
								setState(861);
								ident();
							}
						}
						setState(866);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(868);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 62, _ctx)) {
						case 1: {
							setState(867);
							match(T_AS);
						}
						break;
					}
					setState(870);
					dtype();
					setState(872);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 63, _ctx)) {
						case 1: {
							setState(871);
							dtype_len();
						}
						break;
					}
					setState(877);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 64, _ctx);
					while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(874);
									dtype_attr();
								}
							}
						}
						setState(879);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 64, _ctx);
					}
					setState(881);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 65, _ctx)) {
						case 1: {
							setState(880);
							dtype_default();
						}
						break;
					}
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(883);
					ident();
					setState(884);
					match(T_CONSTANT);
					setState(886);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 66, _ctx)) {
						case 1: {
							setState(885);
							match(T_AS);
						}
						break;
					}
					setState(888);
					dtype();
					setState(890);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_OPEN_P) {
						{
							setState(889);
							dtype_len();
						}
					}

					setState(892);
					dtype_default();
				}
				break;
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

	public final Declare_condition_itemContext declare_condition_item() throws RecognitionException {
		Declare_condition_itemContext _localctx = new Declare_condition_itemContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_declare_condition_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(896);
				ident();
				setState(897);
				match(T_CONDITION);
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

	public final Declare_handler_itemContext declare_handler_item() throws RecognitionException {
		Declare_handler_itemContext _localctx = new Declare_handler_itemContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_declare_handler_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(899);
				_la = _input.LA(1);
				if (!(_la == T_CONTINUE || _la == T_EXIT)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(900);
				match(T_HANDLER);
				setState(901);
				match(T_FOR);
				setState(907);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 69, _ctx)) {
					case 1: {
						setState(902);
						match(T_SQLEXCEPTION);
					}
					break;
					case 2: {
						setState(903);
						match(T_SQLWARNING);
					}
					break;
					case 3: {
						setState(904);
						match(T_NOT);
						setState(905);
						match(T_FOUND);
					}
					break;
					case 4: {
						setState(906);
						ident();
					}
					break;
				}
				setState(909);
				single_block_stmt();
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

	public final Create_type_stmtContext create_type_stmt() throws RecognitionException {
		Create_type_stmtContext _localctx = new Create_type_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_create_type_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(911);
				match(T_CREATE);
				setState(912);
				match(T_TYPE);
				setState(913);
				table_name();
				setState(914);
				create_type_definition();
				setState(915);
				create_type_options();
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

	public final Create_type_definitionContext create_type_definition() throws RecognitionException {
		Create_type_definitionContext _localctx = new Create_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_create_type_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(917);
				match(T_OPEN_P);
				setState(918);
				create_type_items();
				setState(919);
				match(T_CLOSE_P);
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

	public final Create_type_itemsContext create_type_items() throws RecognitionException {
		Create_type_itemsContext _localctx = new Create_type_itemsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_create_type_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(921);
				create_type_items_item();
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T_COMMA) {
					{
						{
							setState(922);
							match(T_COMMA);
							setState(923);
							create_type_items_item();
						}
					}
					setState(928);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public final Create_type_items_itemContext create_type_items_item() throws RecognitionException {
		Create_type_items_itemContext _localctx = new Create_type_items_itemContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_create_type_items_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(929);
				ident();
				setState(930);
				match(T_COLON);
				setState(933);
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
					case T_WRITE:
					case L_ID: {
						setState(931);
						ident();
					}
					break;
					case L_S_STRING:
					case L_D_STRING: {
						setState(932);
						string();
					}
					break;
					default:
						throw new NoViableAltException(this);
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

	public final Create_type_optionsContext create_type_options() throws RecognitionException {
		Create_type_optionsContext _localctx = new Create_type_optionsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_create_type_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(938);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 72, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(935);
								create_type_option();
							}
						}
					}
					setState(940);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 72, _ctx);
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

	public final Create_type_optionContext create_type_option() throws RecognitionException {
		Create_type_optionContext _localctx = new Create_type_optionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_create_type_option);
		try {
			setState(943);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_LOCATION:
					enterOuterAlt(_localctx, 1);
				{
					setState(941);
					create_type_store_location();
				}
				break;
				case T_DELIMITED:
					enterOuterAlt(_localctx, 2);
				{
					setState(942);
					create_type_delimiter();
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Create_type_store_locationContext create_type_store_location() throws RecognitionException {
		Create_type_store_locationContext _localctx = new Create_type_store_locationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_create_type_store_location);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(945);
				match(T_LOCATION);
				setState(946);
				string();
				setState(951);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 74, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(947);
								match(T_COMMA);
								setState(948);
								string();
							}
						}
					}
					setState(953);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 74, _ctx);
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

	public final Create_type_delimiterContext create_type_delimiter() throws RecognitionException {
		Create_type_delimiterContext _localctx = new Create_type_delimiterContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_create_type_delimiter);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(954);
				match(T_DELIMITED);
				setState(955);
				match(T_BY);
				setState(956);
				string();
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

	public final Declare_temporary_table_itemContext declare_temporary_table_item() throws RecognitionException {
		Declare_temporary_table_itemContext _localctx = new Declare_temporary_table_itemContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_declare_temporary_table_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_GLOBAL) {
					{
						setState(958);
						match(T_GLOBAL);
					}
				}

				setState(961);
				match(T_TEMPORARY);
				setState(962);
				match(T_TABLE);
				setState(963);
				ident();
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_ROW || _la == T_STORED || _la == T_COMMA) {
					{
						setState(964);
						create_table_preoptions();
					}
				}

				setState(967);
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
		enterRule(_localctx, 102, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(969);
				match(T_CREATE);
				setState(970);
				match(T_TABLE);
				setState(974);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 77, _ctx)) {
					case 1: {
						setState(971);
						match(T_IF);
						setState(972);
						match(T_NOT);
						setState(973);
						match(T_EXISTS);
					}
					break;
				}
				setState(976);
				table_name();
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_ROW || _la == T_STORED || _la == T_COMMA) {
					{
						setState(977);
						create_table_preoptions();
					}
				}

				setState(980);
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

	public final Create_local_temp_table_stmtContext create_local_temp_table_stmt() throws RecognitionException {
		Create_local_temp_table_stmtContext _localctx = new Create_local_temp_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_create_local_temp_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(982);
				match(T_CREATE);
				setState(989);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case T_LOCAL: {
						setState(983);
						match(T_LOCAL);
						setState(984);
						match(T_TEMPORARY);
					}
					break;
					case T_MULTISET:
					case T_SET:
					case T_VOLATILE: {
						setState(986);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == T_MULTISET || _la == T_SET) {
							{
								setState(985);
								_la = _input.LA(1);
								if (!(_la == T_MULTISET || _la == T_SET)) {
									_errHandler.recoverInline(this);
								} else {
									if (_input.LA(1) == Token.EOF) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
							}
						}

						setState(988);
						match(T_VOLATILE);
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(991);
				match(T_TABLE);
				setState(992);
				ident();
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_ROW || _la == T_STORED || _la == T_COMMA) {
					{
						setState(993);
						create_table_preoptions();
					}
				}

				setState(996);
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

	public final Create_table_definitionContext create_table_definition() throws RecognitionException {
		Create_table_definitionContext _localctx = new Create_table_definitionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_create_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1013);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 84, _ctx)) {
					case 1: {
						setState(999);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == T_AS) {
							{
								setState(998);
								match(T_AS);
							}
						}

						setState(1001);
						match(T_OPEN_P);
						setState(1002);
						select_stmt();
						setState(1003);
						match(T_CLOSE_P);
					}
					break;
					case 2: {
						setState(1006);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == T_AS) {
							{
								setState(1005);
								match(T_AS);
							}
						}

						setState(1008);
						select_stmt();
					}
					break;
					case 3: {
						setState(1009);
						match(T_OPEN_P);
						setState(1010);
						create_table_columns();
						setState(1011);
						match(T_CLOSE_P);
					}
					break;
				}
				setState(1016);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 85, _ctx)) {
					case 1: {
						setState(1015);
						create_table_options();
					}
					break;
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

	public final Create_table_columnsContext create_table_columns() throws RecognitionException {
		Create_table_columnsContext _localctx = new Create_table_columnsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_create_table_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1018);
				create_table_columns_item();
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T_COMMA) {
					{
						{
							setState(1019);
							match(T_COMMA);
							setState(1020);
							create_table_columns_item();
						}
					}
					setState(1025);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public final Create_table_columns_itemContext create_table_columns_item() throws RecognitionException {
		Create_table_columns_itemContext _localctx = new Create_table_columns_itemContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_create_table_columns_item);
		int _la;
		try {
			int _alt;
			setState(1048);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 91, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1026);
					column_name();
					setState(1027);
					dtype();
					setState(1029);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_OPEN_P) {
						{
							setState(1028);
							dtype_len();
						}
					}

					setState(1034);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 88, _ctx);
					while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(1031);
									dtype_attr();
								}
							}
						}
						setState(1036);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 88, _ctx);
					}
					setState(1040);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == T_AUTO_INCREMENT || _la == T_DEFAULT || _la == T_ENABLE || _la == T_IDENTITY || ((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & ((1L << (T_NOT - 165)) | (1L << (T_NULL - 165)) | (1L << (T_PRIMARY - 165)) | (1L << (T_REFERENCES - 165)))) != 0) || ((((_la - 248)) & ~0x3f) == 0 && ((1L << (_la - 248)) & ((1L << (T_UNIQUE - 248)) | (1L << (T_WITH - 248)) | (1L << (T_COLON - 248)) | (1L << (T_EQUAL - 248)))) != 0)) {
						{
							{
								setState(1037);
								create_table_column_inline_cons();
							}
						}
						setState(1042);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1045);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_CONSTRAINT) {
						{
							setState(1043);
							match(T_CONSTRAINT);
							setState(1044);
							ident();
						}
					}

					setState(1047);
					create_table_column_cons();
				}
				break;
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

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1050);
				ident();
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

	public final Create_table_column_inline_consContext create_table_column_inline_cons() throws RecognitionException {
		Create_table_column_inline_consContext _localctx = new Create_table_column_inline_consContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_create_table_column_inline_cons);
		int _la;
		try {
			setState(1084);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_DEFAULT:
				case T_WITH:
				case T_COLON:
				case T_EQUAL:
					enterOuterAlt(_localctx, 1);
				{
					setState(1052);
					dtype_default();
				}
				break;
				case T_NOT:
				case T_NULL:
					enterOuterAlt(_localctx, 2);
				{
					setState(1054);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_NOT) {
						{
							setState(1053);
							match(T_NOT);
						}
					}

					setState(1056);
					match(T_NULL);
				}
				break;
				case T_PRIMARY:
					enterOuterAlt(_localctx, 3);
				{
					setState(1057);
					match(T_PRIMARY);
					setState(1058);
					match(T_KEY);
				}
				break;
				case T_UNIQUE:
					enterOuterAlt(_localctx, 4);
				{
					setState(1059);
					match(T_UNIQUE);
				}
				break;
				case T_REFERENCES:
					enterOuterAlt(_localctx, 5);
				{
					setState(1060);
					match(T_REFERENCES);
					setState(1061);
					table_name();
					setState(1062);
					match(T_OPEN_P);
					setState(1063);
					ident();
					setState(1064);
					match(T_CLOSE_P);
					setState(1068);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == T_ON) {
						{
							{
								setState(1065);
								create_table_fk_action();
							}
						}
						setState(1070);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
				break;
				case T_IDENTITY:
					enterOuterAlt(_localctx, 6);
				{
					setState(1071);
					match(T_IDENTITY);
					setState(1072);
					match(T_OPEN_P);
					setState(1073);
					match(L_INT);
					setState(1078);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == T_COMMA) {
						{
							{
								setState(1074);
								match(T_COMMA);
								setState(1075);
								match(L_INT);
							}
						}
						setState(1080);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1081);
					match(T_CLOSE_P);
				}
				break;
				case T_AUTO_INCREMENT:
					enterOuterAlt(_localctx, 7);
				{
					setState(1082);
					match(T_AUTO_INCREMENT);
				}
				break;
				case T_ENABLE:
					enterOuterAlt(_localctx, 8);
				{
					setState(1083);
					match(T_ENABLE);
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Create_table_column_consContext create_table_column_cons() throws RecognitionException {
		Create_table_column_consContext _localctx = new Create_table_column_consContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_create_table_column_cons);
		int _la;
		try {
			setState(1143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_PRIMARY:
					enterOuterAlt(_localctx, 1);
				{
					setState(1086);
					match(T_PRIMARY);
					setState(1087);
					match(T_KEY);
					setState(1089);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_CLUSTERED) {
						{
							setState(1088);
							match(T_CLUSTERED);
						}
					}

					setState(1091);
					match(T_OPEN_P);
					setState(1092);
					ident();
					setState(1094);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_ASC || _la == T_DESC) {
						{
							setState(1093);
							_la = _input.LA(1);
							if (!(_la == T_ASC || _la == T_DESC)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
						}
					}

					setState(1103);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == T_COMMA) {
						{
							{
								setState(1096);
								match(T_COMMA);
								setState(1097);
								ident();
								setState(1099);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la == T_ASC || _la == T_DESC) {
									{
										setState(1098);
										_la = _input.LA(1);
										if (!(_la == T_ASC || _la == T_DESC)) {
											_errHandler.recoverInline(this);
										} else {
											if (_input.LA(1) == Token.EOF) matchedEOF = true;
											_errHandler.reportMatch(this);
											consume();
										}
									}
								}

							}
						}
						setState(1105);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1106);
					match(T_CLOSE_P);
					setState(1108);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_ENABLE) {
						{
							setState(1107);
							match(T_ENABLE);
						}
					}

					setState(1111);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_WITH) {
						{
							setState(1110);
							index_storage_clause();
						}
					}

				}
				break;
				case T_FOREIGN:
					enterOuterAlt(_localctx, 2);
				{
					setState(1113);
					match(T_FOREIGN);
					setState(1114);
					match(T_KEY);
					setState(1115);
					match(T_OPEN_P);
					setState(1116);
					ident();
					setState(1121);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == T_COMMA) {
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
					setState(1125);
					match(T_REFERENCES);
					setState(1126);
					table_name();
					setState(1127);
					match(T_OPEN_P);
					setState(1128);
					ident();
					setState(1133);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == T_COMMA) {
						{
							{
								setState(1129);
								match(T_COMMA);
								setState(1130);
								ident();
							}
						}
						setState(1135);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1136);
					match(T_CLOSE_P);
					setState(1140);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == T_ON) {
						{
							{
								setState(1137);
								create_table_fk_action();
							}
						}
						setState(1142);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Create_table_fk_actionContext create_table_fk_action() throws RecognitionException {
		Create_table_fk_actionContext _localctx = new Create_table_fk_actionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_create_table_fk_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1145);
				match(T_ON);
				setState(1146);
				_la = _input.LA(1);
				if (!(_la == T_DELETE || _la == T_UPDATE)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1155);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 106, _ctx)) {
					case 1: {
						setState(1147);
						match(T_NO);
						setState(1148);
						match(T_ACTION);
					}
					break;
					case 2: {
						setState(1149);
						match(T_RESTRICT);
					}
					break;
					case 3: {
						setState(1150);
						match(T_SET);
						setState(1151);
						match(T_NULL);
					}
					break;
					case 4: {
						setState(1152);
						match(T_SET);
						setState(1153);
						match(T_DEFAULT);
					}
					break;
					case 5: {
						setState(1154);
						match(T_CASCADE);
					}
					break;
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

	public final Create_table_preoptionsContext create_table_preoptions() throws RecognitionException {
		Create_table_preoptionsContext _localctx = new Create_table_preoptionsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_create_table_preoptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(1157);
							create_table_preoptions_item();
						}
					}
					setState(1160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == T_ROW || _la == T_STORED || _la == T_COMMA);
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

	public final Create_table_preoptions_itemContext create_table_preoptions_item() throws RecognitionException {
		Create_table_preoptions_itemContext _localctx = new Create_table_preoptions_itemContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_create_table_preoptions_item);
		try {
			setState(1165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_COMMA:
					enterOuterAlt(_localctx, 1);
				{
					setState(1162);
					match(T_COMMA);
					setState(1163);
					create_table_preoptions_td_item();
				}
				break;
				case T_ROW:
				case T_STORED:
					enterOuterAlt(_localctx, 2);
				{
					setState(1164);
					create_table_options_hive_item();
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Create_table_preoptions_td_itemContext create_table_preoptions_td_item() throws RecognitionException {
		Create_table_preoptions_td_itemContext _localctx = new Create_table_preoptions_td_itemContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_create_table_preoptions_td_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_NO) {
					{
						setState(1167);
						match(T_NO);
					}
				}

				setState(1170);
				_la = _input.LA(1);
				if (!(_la == T_FALLBACK || _la == T_LOG)) {
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

	public final Create_table_optionsContext create_table_options() throws RecognitionException {
		Create_table_optionsContext _localctx = new Create_table_optionsContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_create_table_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1173);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							{
								setState(1172);
								create_table_options_item();
							}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(1175);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 110, _ctx);
				} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
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

	public final Create_table_options_itemContext create_table_options_item() throws RecognitionException {
		Create_table_options_itemContext _localctx = new Create_table_options_itemContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_create_table_options_item);
		int _la;
		try {
			setState(1189);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 111, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1177);
					match(T_ON);
					setState(1178);
					match(T_COMMIT);
					setState(1179);
					_la = _input.LA(1);
					if (!(_la == T_DELETE || _la == T_PRESERVE)) {
						_errHandler.recoverInline(this);
					} else {
						if (_input.LA(1) == Token.EOF) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1180);
					match(T_ROWS);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1181);
					create_table_options_ora_item();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1182);
					create_table_options_db2_item();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(1183);
					create_table_options_td_item();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(1184);
					create_table_options_hive_item();
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(1185);
					create_table_options_mssql_item();
				}
				break;
				case 7:
					enterOuterAlt(_localctx, 7);
				{
					setState(1186);
					create_table_options_mysql_item();
				}
				break;
				case 8:
					enterOuterAlt(_localctx, 8);
				{
					setState(1187);
					create_table_store_location();
				}
				break;
				case 9:
					enterOuterAlt(_localctx, 9);
				{
					setState(1188);
					create_table_delimiter();
				}
				break;
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

	public final Create_table_options_ora_itemContext create_table_options_ora_item() throws RecognitionException {
		Create_table_options_ora_itemContext _localctx = new Create_table_options_ora_itemContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_create_table_options_ora_item);
		int _la;
		try {
			setState(1209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_SEGMENT:
					enterOuterAlt(_localctx, 1);
				{
					setState(1191);
					match(T_SEGMENT);
					setState(1192);
					match(T_CREATION);
					setState(1193);
					_la = _input.LA(1);
					if (!(_la == T_DEFERRED || _la == T_IMMEDIATE)) {
						_errHandler.recoverInline(this);
					} else {
						if (_input.LA(1) == Token.EOF) matchedEOF = true;
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
					setState(1194);
					_la = _input.LA(1);
					if (!(_la == T_INITRANS || _la == T_MAXTRANS || _la == T_PCTFREE || _la == T_PCTUSED)) {
						_errHandler.recoverInline(this);
					} else {
						if (_input.LA(1) == Token.EOF) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1195);
					match(L_INT);
				}
				break;
				case T_NOCOMPRESS:
					enterOuterAlt(_localctx, 3);
				{
					setState(1196);
					match(T_NOCOMPRESS);
				}
				break;
				case T_LOGGING:
				case T_NOLOGGING:
					enterOuterAlt(_localctx, 4);
				{
					setState(1197);
					_la = _input.LA(1);
					if (!(_la == T_LOGGING || _la == T_NOLOGGING)) {
						_errHandler.recoverInline(this);
					} else {
						if (_input.LA(1) == Token.EOF) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
				}
				break;
				case T_STORAGE:
					enterOuterAlt(_localctx, 5);
				{
					setState(1198);
					match(T_STORAGE);
					setState(1199);
					match(T_OPEN_P);
					setState(1202);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							setState(1202);
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
								case T_WRITE:
								case L_ID: {
									setState(1200);
									ident();
								}
								break;
								case L_INT: {
									setState(1201);
									match(L_INT);
								}
								break;
								default:
									throw new NoViableAltException(this);
							}
						}
						setState(1204);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T_ACTION - 5)) | (1L << (T_AND - 5)) | (1L << (T_AS - 5)) | (1L << (T_ASC - 5)) | (1L << (T_ASSOCIATE - 5)) | (1L << (T_AT - 5)) | (1L << (T_AUTO_INCREMENT - 5)) | (1L << (T_AVG - 5)) | (1L << (T_BEGIN - 5)) | (1L << (T_BETWEEN - 5)) | (1L << (T_BIGINT - 5)) | (1L << (T_BINARY_DOUBLE - 5)) | (1L << (T_BINARY_FLOAT - 5)) | (1L << (T_BIT - 5)) | (1L << (T_BODY - 5)) | (1L << (T_BREAK - 5)) | (1L << (T_BY - 5)) | (1L << (T_BYTE - 5)) | (1L << (T_CALL - 5)) | (1L << (T_CASCADE - 5)) | (1L << (T_CASE - 5)) | (1L << (T_CASESPECIFIC - 5)) | (1L << (T_CAST - 5)) | (1L << (T_CHAR - 5)) | (1L << (T_CHARACTER - 5)) | (1L << (T_CHARSET - 5)) | (1L << (T_CLOSE - 5)) | (1L << (T_CLUSTERED - 5)) | (1L << (T_CMP - 5)) | (1L << (T_COLLECT - 5)) | (1L << (T_COLLECTION - 5)) | (1L << (T_COMMENT - 5)) | (1L << (T_CONSTANT - 5)) | (1L << (T_COMPRESS - 5)) | (1L << (T_CONCAT - 5)) | (1L << (T_CONDITION - 5)) | (1L << (T_CONSTRAINT - 5)) | (1L << (T_CONTINUE - 5)) | (1L << (T_COUNT - 5)) | (1L << (T_COUNT_BIG - 5)) | (1L << (T_CREATION - 5)) | (1L << (T_CREATOR - 5)) | (1L << (T_CS - 5)) | (1L << (T_CURRENT - 5)) | (1L << (T_DATABASE - 5)) | (1L << (T_DATA - 5)) | (1L << (T_DATE - 5)) | (1L << (T_DATETIME - 5)) | (1L << (T_DAY - 5)) | (1L << (T_DAYS - 5)) | (1L << (T_DEC - 5)) | (1L << (T_DECIMAL - 5)) | (1L << (T_DECLARE - 5)) | (1L << (T_DEFAULT - 5)) | (1L << (T_DEFERRED - 5)) | (1L << (T_DEFINED - 5)) | (1L << (T_DEFINER - 5)) | (1L << (T_DEFINITION - 5)) | (1L << (T_DELETE - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T_DELIMITED - 69)) | (1L << (T_DESC - 69)) | (1L << (T_DIR - 69)) | (1L << (T_DISTINCT - 69)) | (1L << (T_DISTRIBUTE - 69)) | (1L << (T_DO - 69)) | (1L << (T_DOUBLE - 69)) | (1L << (T_DYNAMIC - 69)) | (1L << (T_ENABLE - 69)) | (1L << (T_END - 69)) | (1L << (T_ENGINE - 69)) | (1L << (T_ESCAPED - 69)) | (1L << (T_EXCEPT - 69)) | (1L << (T_EXEC - 69)) | (1L << (T_EXECUTE - 69)) | (1L << (T_EXCEPTION - 69)) | (1L << (T_EXCLUSIVE - 69)) | (1L << (T_EXISTS - 69)) | (1L << (T_EXIT - 69)) | (1L << (T_FALLBACK - 69)) | (1L << (T_FALSE - 69)) | (1L << (T_FIELDS - 69)) | (1L << (T_FLOAT - 69)) | (1L << (T_FOR - 69)) | (1L << (T_FOREIGN - 69)) | (1L << (T_FORMAT - 69)) | (1L << (T_FOUND - 69)) | (1L << (T_FROM - 69)) | (1L << (T_FULL - 69)) | (1L << (T_FUNCTION - 69)) | (1L << (T_GLOBAL - 69)) | (1L << (T_GO - 69)) | (1L << (T_GROUP - 69)) | (1L << (T_HANDLER - 69)) | (1L << (T_HASH - 69)) | (1L << (T_HAVING - 69)) | (1L << (T_IDENTITY - 69)) | (1L << (T_IF - 69)) | (1L << (T_IMMEDIATE - 69)) | (1L << (T_IN - 69)) | (1L << (T_INDEX - 69)) | (1L << (T_INITRANS - 69)) | (1L << (T_INNER - 69)) | (1L << (T_INOUT - 69)) | (1L << (T_INT - 69)) | (1L << (T_INT2 - 69)) | (1L << (T_INT4 - 69)) | (1L << (T_INT8 - 69)) | (1L << (T_INTEGER - 69)) | (1L << (T_INTERSECT - 69)) | (1L << (T_INTERVAL - 69)) | (1L << (T_INTO - 69)) | (1L << (T_INVOKER - 69)) | (1L << (T_IS - 69)) | (1L << (T_ISOPEN - 69)) | (1L << (T_ITEMS - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (T_JOIN - 133)) | (1L << (T_KEEP - 133)) | (1L << (T_KEY - 133)) | (1L << (T_KEYS - 133)) | (1L << (T_LANGUAGE - 133)) | (1L << (T_LEAVE - 133)) | (1L << (T_LEFT - 133)) | (1L << (T_LIKE - 133)) | (1L << (T_LIMIT - 133)) | (1L << (T_LINES - 133)) | (1L << (T_LOCAL - 133)) | (1L << (T_LOCATION - 133)) | (1L << (T_LOCATOR - 133)) | (1L << (T_LOCATORS - 133)) | (1L << (T_LOCKS - 133)) | (1L << (T_LOG - 133)) | (1L << (T_LOGGED - 133)) | (1L << (T_LOGGING - 133)) | (1L << (T_LOOP - 133)) | (1L << (T_MAP - 133)) | (1L << (T_MAX - 133)) | (1L << (T_MAXTRANS - 133)) | (1L << (T_MICROSECOND - 133)) | (1L << (T_MICROSECONDS - 133)) | (1L << (T_MIN - 133)) | (1L << (T_MULTISET - 133)) | (1L << (T_NCHAR - 133)) | (1L << (T_NVARCHAR - 133)) | (1L << (T_NO - 133)) | (1L << (T_NOCOMPRESS - 133)) | (1L << (T_NOLOGGING - 133)) | (1L << (T_NOT - 133)) | (1L << (T_NOTFOUND - 133)) | (1L << (T_NUMERIC - 133)) | (1L << (T_NUMBER - 133)) | (1L << (T_ON - 133)) | (1L << (T_ONLY - 133)) | (1L << (T_OPEN - 133)) | (1L << (T_OR - 133)) | (1L << (T_ORDER - 133)) | (1L << (T_OUT - 133)) | (1L << (T_OUTER - 133)) | (1L << (T_OVER - 133)) | (1L << (T_OWNER - 133)) | (1L << (T_PACKAGE - 133)) | (1L << (T_PARTITION - 133)) | (1L << (T_PCTFREE - 133)) | (1L << (T_PCTUSED - 133)) | (1L << (T_PRECISION - 133)) | (1L << (T_PRESERVE - 133)) | (1L << (T_PRIMARY - 133)) | (1L << (T_PROC - 133)) | (1L << (T_PROCEDURE - 133)) | (1L << (T_QUALIFY - 133)) | (1L << (T_QUIT - 133)) | (1L << (T_REAL - 133)) | (1L << (T_REFERENCES - 133)) | (1L << (T_REGEXP - 133)) | (1L << (T_REPLACE - 133)) | (1L << (T_RESTRICT - 133)) | (1L << (T_RESULT - 133)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (T_RESULT_SET_LOCATOR - 197)) | (1L << (T_RETURN - 197)) | (1L << (T_RETURNS - 197)) | (1L << (T_REVERSE - 197)) | (1L << (T_RIGHT - 197)) | (1L << (T_RLIKE - 197)) | (1L << (T_ROW - 197)) | (1L << (T_ROWS - 197)) | (1L << (T_ROW_COUNT - 197)) | (1L << (T_RR - 197)) | (1L << (T_RS - 197)) | (1L << (T_TRIM - 197)) | (1L << (T_SCHEMA - 197)) | (1L << (T_SECOND - 197)) | (1L << (T_SECONDS - 197)) | (1L << (T_SECURITY - 197)) | (1L << (T_SEGMENT - 197)) | (1L << (T_SEL - 197)) | (1L << (T_SELECT - 197)) | (1L << (T_SET - 197)) | (1L << (T_SETS - 197)) | (1L << (T_SHARE - 197)) | (1L << (T_SIMPLE_DOUBLE - 197)) | (1L << (T_SIMPLE_FLOAT - 197)) | (1L << (T_SMALLDATETIME - 197)) | (1L << (T_SMALLINT - 197)) | (1L << (T_SQL - 197)) | (1L << (T_SQLEXCEPTION - 197)) | (1L << (T_SQLWARNING - 197)) | (1L << (T_STEP - 197)) | (1L << (T_STORAGE - 197)) | (1L << (T_STORED - 197)) | (1L << (T_STRING - 197)) | (1L << (T_SUBSTRING - 197)) | (1L << (T_SUM - 197)) | (1L << (T_SYS_REFCURSOR - 197)) | (1L << (T_TABLE - 197)) | (1L << (T_TABLESPACE - 197)) | (1L << (T_TEMPORARY - 197)) | (1L << (T_TERMINATED - 197)) | (1L << (T_TEXTIMAGE_ON - 197)) | (1L << (T_THEN - 197)) | (1L << (T_TIMESTAMP - 197)) | (1L << (T_TITLE - 197)) | (1L << (T_TO - 197)) | (1L << (T_TOP - 197)) | (1L << (T_TRUE - 197)) | (1L << (T_UNIQUE - 197)) | (1L << (T_UPDATE - 197)) | (1L << (T_UR - 197)) | (1L << (T_USE - 197)) | (1L << (T_USING - 197)) | (1L << (T_VALUE - 197)) | (1L << (T_VALUES - 197)) | (1L << (T_VAR - 197)) | (1L << (T_VARCHAR - 197)) | (1L << (T_VARCHAR2 - 197)) | (1L << (T_VARYING - 197)) | (1L << (T_VOLATILE - 197)))) != 0) || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (T_WHILE - 262)) | (1L << (T_WITH - 262)) | (1L << (T_XML - 262)) | (1L << (T_YES - 262)) | (1L << (T_ACTIVITY_COUNT - 262)) | (1L << (T_CUME_DIST - 262)) | (1L << (T_CURRENT_DATE - 262)) | (1L << (T_CURRENT_TIMESTAMP - 262)) | (1L << (T_CURRENT_USER - 262)) | (1L << (T_DENSE_RANK - 262)) | (1L << (T_FIRST_VALUE - 262)) | (1L << (T_LAG - 262)) | (1L << (T_LAST_VALUE - 262)) | (1L << (T_LEAD - 262)) | (1L << (T_PART_COUNT - 262)) | (1L << (T_PART_LOC - 262)) | (1L << (T_RANK - 262)) | (1L << (T_ROW_NUMBER - 262)) | (1L << (T_STDEV - 262)) | (1L << (T_SYSDATE - 262)) | (1L << (T_VARIANCE - 262)) | (1L << (T_USER - 262)) | (1L << (T_WRITE - 262)) | (1L << (L_ID - 262)) | (1L << (L_INT - 262)))) != 0));
					setState(1206);
					match(T_CLOSE_P);
				}
				break;
				case T_TABLESPACE:
					enterOuterAlt(_localctx, 6);
				{
					setState(1207);
					match(T_TABLESPACE);
					setState(1208);
					ident();
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Create_table_options_db2_itemContext create_table_options_db2_item() throws RecognitionException {
		Create_table_options_db2_itemContext _localctx = new Create_table_options_db2_itemContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_create_table_options_db2_item);
		int _la;
		try {
			setState(1244);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 118, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_INDEX) {
						{
							setState(1211);
							match(T_INDEX);
						}
					}

					setState(1214);
					match(T_IN);
					setState(1215);
					ident();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1216);
					match(T_WITH);
					setState(1217);
					match(T_REPLACE);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1218);
					match(T_DISTRIBUTE);
					setState(1219);
					match(T_BY);
					setState(1220);
					match(T_HASH);
					setState(1221);
					match(T_OPEN_P);
					setState(1222);
					ident();
					setState(1227);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == T_COMMA) {
						{
							{
								setState(1223);
								match(T_COMMA);
								setState(1224);
								ident();
							}
						}
						setState(1229);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1230);
					match(T_CLOSE_P);
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(1233);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_NOT) {
						{
							setState(1232);
							match(T_NOT);
						}
					}

					setState(1235);
					match(T_LOGGED);
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(1236);
					match(T_COMPRESS);
					setState(1237);
					_la = _input.LA(1);
					if (!(_la == T_NO || _la == T_YES)) {
						_errHandler.recoverInline(this);
					} else {
						if (_input.LA(1) == Token.EOF) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(1238);
					match(T_DEFINITION);
					setState(1239);
					match(T_ONLY);
				}
				break;
				case 7:
					enterOuterAlt(_localctx, 7);
				{
					setState(1240);
					match(T_WITH);
					setState(1241);
					match(T_RESTRICT);
					setState(1242);
					match(T_ON);
					setState(1243);
					match(T_DROP);
				}
				break;
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

	public final Create_table_options_td_itemContext create_table_options_td_item() throws RecognitionException {
		Create_table_options_td_itemContext _localctx = new Create_table_options_td_itemContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_create_table_options_td_item);
		int _la;
		try {
			setState(1264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_PRIMARY:
				case T_UNIQUE:
					enterOuterAlt(_localctx, 1);
				{
					setState(1247);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_UNIQUE) {
						{
							setState(1246);
							match(T_UNIQUE);
						}
					}

					setState(1249);
					match(T_PRIMARY);
					setState(1250);
					match(T_INDEX);
					setState(1251);
					match(T_OPEN_P);
					setState(1252);
					ident();
					setState(1257);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == T_COMMA) {
						{
							{
								setState(1253);
								match(T_COMMA);
								setState(1254);
								ident();
							}
						}
						setState(1259);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1260);
					match(T_CLOSE_P);
				}
				break;
				case T_WITH:
					enterOuterAlt(_localctx, 2);
				{
					setState(1262);
					match(T_WITH);
					setState(1263);
					match(T_DATA);
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Create_table_options_hive_itemContext create_table_options_hive_item() throws RecognitionException {
		Create_table_options_hive_itemContext _localctx = new Create_table_options_hive_itemContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_create_table_options_hive_item);
		try {
			setState(1270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_ROW:
					enterOuterAlt(_localctx, 1);
				{
					setState(1266);
					create_table_hive_row_format();
				}
				break;
				case T_STORED:
					enterOuterAlt(_localctx, 2);
				{
					setState(1267);
					match(T_STORED);
					setState(1268);
					match(T_AS);
					setState(1269);
					ident();
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Create_table_store_locationContext create_table_store_location() throws RecognitionException {
		Create_table_store_locationContext _localctx = new Create_table_store_locationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_create_table_store_location);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1272);
				match(T_LOCATION);
				setState(1273);
				string();
				setState(1278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 123, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(1274);
								match(T_COMMA);
								setState(1275);
								string();
							}
						}
					}
					setState(1280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 123, _ctx);
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

	public final Create_table_delimiterContext create_table_delimiter() throws RecognitionException {
		Create_table_delimiterContext _localctx = new Create_table_delimiterContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_create_table_delimiter);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1281);
				match(T_DELIMITED);
				setState(1282);
				match(T_BY);
				setState(1283);
				string();
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

	public final Create_table_hive_row_formatContext create_table_hive_row_format() throws RecognitionException {
		Create_table_hive_row_formatContext _localctx = new Create_table_hive_row_formatContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_create_table_hive_row_format);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1285);
				match(T_ROW);
				setState(1286);
				match(T_FORMAT);
				setState(1287);
				match(T_DELIMITED);
				setState(1291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 124, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(1288);
								create_table_hive_row_format_fields();
							}
						}
					}
					setState(1293);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 124, _ctx);
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

	public final Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields() throws RecognitionException {
		Create_table_hive_row_format_fieldsContext _localctx = new Create_table_hive_row_format_fieldsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_create_table_hive_row_format_fields);
		try {
			setState(1321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_FIELDS:
					enterOuterAlt(_localctx, 1);
				{
					setState(1294);
					match(T_FIELDS);
					setState(1295);
					match(T_TERMINATED);
					setState(1296);
					match(T_BY);
					setState(1297);
					expr(0);
					setState(1301);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 125, _ctx)) {
						case 1: {
							setState(1298);
							match(T_ESCAPED);
							setState(1299);
							match(T_BY);
							setState(1300);
							expr(0);
						}
						break;
					}
				}
				break;
				case T_COLLECTION:
					enterOuterAlt(_localctx, 2);
				{
					setState(1303);
					match(T_COLLECTION);
					setState(1304);
					match(T_ITEMS);
					setState(1305);
					match(T_TERMINATED);
					setState(1306);
					match(T_BY);
					setState(1307);
					expr(0);
				}
				break;
				case T_MAP:
					enterOuterAlt(_localctx, 3);
				{
					setState(1308);
					match(T_MAP);
					setState(1309);
					match(T_KEYS);
					setState(1310);
					match(T_TERMINATED);
					setState(1311);
					match(T_BY);
					setState(1312);
					expr(0);
				}
				break;
				case T_LINES:
					enterOuterAlt(_localctx, 4);
				{
					setState(1313);
					match(T_LINES);
					setState(1314);
					match(T_TERMINATED);
					setState(1315);
					match(T_BY);
					setState(1316);
					expr(0);
				}
				break;
				case T_NULL:
					enterOuterAlt(_localctx, 5);
				{
					setState(1317);
					match(T_NULL);
					setState(1318);
					match(T_DEFINED);
					setState(1319);
					match(T_AS);
					setState(1320);
					expr(0);
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Create_table_options_mssql_itemContext create_table_options_mssql_item() throws RecognitionException {
		Create_table_options_mssql_itemContext _localctx = new Create_table_options_mssql_itemContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_create_table_options_mssql_item);
		try {
			setState(1327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_ON:
					enterOuterAlt(_localctx, 1);
				{
					setState(1323);
					match(T_ON);
					setState(1324);
					ident();
				}
				break;
				case T_TEXTIMAGE_ON:
					enterOuterAlt(_localctx, 2);
				{
					setState(1325);
					match(T_TEXTIMAGE_ON);
					setState(1326);
					ident();
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Create_table_options_mysql_itemContext create_table_options_mysql_item() throws RecognitionException {
		Create_table_options_mysql_itemContext _localctx = new Create_table_options_mysql_itemContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_create_table_options_mysql_item);
		int _la;
		try {
			setState(1356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_AUTO_INCREMENT:
					enterOuterAlt(_localctx, 1);
				{
					setState(1329);
					match(T_AUTO_INCREMENT);
					setState(1331);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_EQUAL) {
						{
							setState(1330);
							match(T_EQUAL);
						}
					}

					setState(1333);
					expr(0);
				}
				break;
				case T_COMMENT:
					enterOuterAlt(_localctx, 2);
				{
					setState(1334);
					match(T_COMMENT);
					setState(1336);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_EQUAL) {
						{
							setState(1335);
							match(T_EQUAL);
						}
					}

					setState(1338);
					expr(0);
				}
				break;
				case T_CHARACTER:
				case T_CHARSET:
				case T_DEFAULT:
					enterOuterAlt(_localctx, 3);
				{
					setState(1340);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_DEFAULT) {
						{
							setState(1339);
							match(T_DEFAULT);
						}
					}

					setState(1345);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
						case T_CHARACTER: {
							setState(1342);
							match(T_CHARACTER);
							setState(1343);
							match(T_SET);
						}
						break;
						case T_CHARSET: {
							setState(1344);
							match(T_CHARSET);
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(1348);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_EQUAL) {
						{
							setState(1347);
							match(T_EQUAL);
						}
					}

					setState(1350);
					expr(0);
				}
				break;
				case T_ENGINE:
					enterOuterAlt(_localctx, 4);
				{
					setState(1351);
					match(T_ENGINE);
					setState(1353);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_EQUAL) {
						{
							setState(1352);
							match(T_EQUAL);
						}
					}

					setState(1355);
					expr(0);
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_dtype);
		try {
			setState(1405);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 137, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1358);
					match(T_CHAR);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1359);
					match(T_BIGINT);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1360);
					match(T_BINARY_DOUBLE);
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(1361);
					match(T_BINARY_FLOAT);
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(1362);
					match(T_BINARY_INTEGER);
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(1363);
					match(T_BIT);
				}
				break;
				case 7:
					enterOuterAlt(_localctx, 7);
				{
					setState(1364);
					match(T_DATE);
				}
				break;
				case 8:
					enterOuterAlt(_localctx, 8);
				{
					setState(1365);
					match(T_DATETIME);
				}
				break;
				case 9:
					enterOuterAlt(_localctx, 9);
				{
					setState(1366);
					match(T_DEC);
				}
				break;
				case 10:
					enterOuterAlt(_localctx, 10);
				{
					setState(1367);
					match(T_DECIMAL);
				}
				break;
				case 11:
					enterOuterAlt(_localctx, 11);
				{
					setState(1368);
					match(T_DOUBLE);
					setState(1370);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 135, _ctx)) {
						case 1: {
							setState(1369);
							match(T_PRECISION);
						}
						break;
					}
				}
				break;
				case 12:
					enterOuterAlt(_localctx, 12);
				{
					setState(1372);
					match(T_FLOAT);
				}
				break;
				case 13:
					enterOuterAlt(_localctx, 13);
				{
					setState(1373);
					match(T_INT);
				}
				break;
				case 14:
					enterOuterAlt(_localctx, 14);
				{
					setState(1374);
					match(T_INT2);
				}
				break;
				case 15:
					enterOuterAlt(_localctx, 15);
				{
					setState(1375);
					match(T_INT4);
				}
				break;
				case 16:
					enterOuterAlt(_localctx, 16);
				{
					setState(1376);
					match(T_INT8);
				}
				break;
				case 17:
					enterOuterAlt(_localctx, 17);
				{
					setState(1377);
					match(T_INTEGER);
				}
				break;
				case 18:
					enterOuterAlt(_localctx, 18);
				{
					setState(1378);
					match(T_NCHAR);
				}
				break;
				case 19:
					enterOuterAlt(_localctx, 19);
				{
					setState(1379);
					match(T_NVARCHAR);
				}
				break;
				case 20:
					enterOuterAlt(_localctx, 20);
				{
					setState(1380);
					match(T_NUMBER);
				}
				break;
				case 21:
					enterOuterAlt(_localctx, 21);
				{
					setState(1381);
					match(T_NUMERIC);
				}
				break;
				case 22:
					enterOuterAlt(_localctx, 22);
				{
					setState(1382);
					match(T_PLS_INTEGER);
				}
				break;
				case 23:
					enterOuterAlt(_localctx, 23);
				{
					setState(1383);
					match(T_REAL);
				}
				break;
				case 24:
					enterOuterAlt(_localctx, 24);
				{
					setState(1384);
					match(T_RESULT_SET_LOCATOR);
					setState(1385);
					match(T_VARYING);
				}
				break;
				case 25:
					enterOuterAlt(_localctx, 25);
				{
					setState(1386);
					match(T_SIMPLE_FLOAT);
				}
				break;
				case 26:
					enterOuterAlt(_localctx, 26);
				{
					setState(1387);
					match(T_SIMPLE_DOUBLE);
				}
				break;
				case 27:
					enterOuterAlt(_localctx, 27);
				{
					setState(1388);
					match(T_SIMPLE_INTEGER);
				}
				break;
				case 28:
					enterOuterAlt(_localctx, 28);
				{
					setState(1389);
					match(T_SMALLINT);
				}
				break;
				case 29:
					enterOuterAlt(_localctx, 29);
				{
					setState(1390);
					match(T_SMALLDATETIME);
				}
				break;
				case 30:
					enterOuterAlt(_localctx, 30);
				{
					setState(1391);
					match(T_STRING);
				}
				break;
				case 31:
					enterOuterAlt(_localctx, 31);
				{
					setState(1392);
					match(T_SYS_REFCURSOR);
				}
				break;
				case 32:
					enterOuterAlt(_localctx, 32);
				{
					setState(1393);
					match(T_TIMESTAMP);
				}
				break;
				case 33:
					enterOuterAlt(_localctx, 33);
				{
					setState(1394);
					match(T_TINYINT);
				}
				break;
				case 34:
					enterOuterAlt(_localctx, 34);
				{
					setState(1395);
					match(T_VARCHAR);
				}
				break;
				case 35:
					enterOuterAlt(_localctx, 35);
				{
					setState(1396);
					match(T_VARCHAR2);
				}
				break;
				case 36:
					enterOuterAlt(_localctx, 36);
				{
					setState(1397);
					match(T_XML);
				}
				break;
				case 37:
					enterOuterAlt(_localctx, 37);
				{
					setState(1398);
					match(T_QUERY);
				}
				break;
				case 38:
					enterOuterAlt(_localctx, 38);
				{
					setState(1399);
					match(T_QUERY_RESULT);
				}
				break;
				case 39:
					enterOuterAlt(_localctx, 39);
				{
					setState(1400);
					ident();
					setState(1403);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 136, _ctx)) {
						case 1: {
							setState(1401);
							match(T__2);
							{
								setState(1402);
								match(T_TYPE);
							}
						}
						break;
					}
				}
				break;
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

	public final Dtype_lenContext dtype_len() throws RecognitionException {
		Dtype_lenContext _localctx = new Dtype_lenContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_dtype_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1407);
				match(T_OPEN_P);
				setState(1408);
				_la = _input.LA(1);
				if (!(_la == T_MAX || _la == L_INT)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_BYTE || _la == T_CHAR) {
					{
						setState(1409);
						_la = _input.LA(1);
						if (!(_la == T_BYTE || _la == T_CHAR)) {
							_errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
					}
				}

				setState(1414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_COMMA) {
					{
						setState(1412);
						match(T_COMMA);
						setState(1413);
						match(L_INT);
					}
				}

				setState(1416);
				match(T_CLOSE_P);
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

	public final Dtype_attrContext dtype_attr() throws RecognitionException {
		Dtype_attrContext _localctx = new Dtype_attrContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_dtype_attr);
		int _la;
		try {
			setState(1429);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 142, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1419);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_NOT) {
						{
							setState(1418);
							match(T_NOT);
						}
					}

					setState(1421);
					match(T_NULL);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1422);
					match(T_CHARACTER);
					setState(1423);
					match(T_SET);
					setState(1424);
					ident();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1426);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_NOT) {
						{
							setState(1425);
							match(T_NOT);
						}
					}

					setState(1428);
					_la = _input.LA(1);
					if (!(_la == T_CASESPECIFIC || _la == T_CS)) {
						_errHandler.recoverInline(this);
					} else {
						if (_input.LA(1) == Token.EOF) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
				}
				break;
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

	public final Dtype_defaultContext dtype_default() throws RecognitionException {
		Dtype_defaultContext _localctx = new Dtype_defaultContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_dtype_default);
		int _la;
		try {
			setState(1443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_COLON:
				case T_EQUAL:
					enterOuterAlt(_localctx, 1);
				{
					setState(1432);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_COLON) {
						{
							setState(1431);
							match(T_COLON);
						}
					}

					setState(1434);
					match(T_EQUAL);
					setState(1435);
					expr(0);
				}
				break;
				case T_DEFAULT:
				case T_WITH:
					enterOuterAlt(_localctx, 2);
				{
					setState(1437);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_WITH) {
						{
							setState(1436);
							match(T_WITH);
						}
					}

					setState(1439);
					match(T_DEFAULT);
					setState(1441);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 145, _ctx)) {
						case 1: {
							setState(1440);
							expr(0);
						}
						break;
					}
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Create_database_stmtContext create_database_stmt() throws RecognitionException {
		Create_database_stmtContext _localctx = new Create_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_create_database_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1445);
				match(T_CREATE);
				setState(1446);
				_la = _input.LA(1);
				if (!(_la == T_DATABASE || _la == T_SCHEMA)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1450);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 147, _ctx)) {
					case 1: {
						setState(1447);
						match(T_IF);
						setState(1448);
						match(T_NOT);
						setState(1449);
						match(T_EXISTS);
					}
					break;
				}
				setState(1452);
				expr(0);
				setState(1456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 148, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(1453);
								create_database_option();
							}
						}
					}
					setState(1458);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 148, _ctx);
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

	public final Create_database_optionContext create_database_option() throws RecognitionException {
		Create_database_optionContext _localctx = new Create_database_optionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_create_database_option);
		try {
			setState(1463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_COMMENT:
					enterOuterAlt(_localctx, 1);
				{
					setState(1459);
					match(T_COMMENT);
					setState(1460);
					expr(0);
				}
				break;
				case T_LOCATION:
					enterOuterAlt(_localctx, 2);
				{
					setState(1461);
					match(T_LOCATION);
					setState(1462);
					expr(0);
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Create_function_stmtContext create_function_stmt() throws RecognitionException {
		Create_function_stmtContext _localctx = new Create_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_create_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1472);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case T_ALTER: {
						setState(1465);
						match(T_ALTER);
					}
					break;
					case T_CREATE: {
						setState(1466);
						match(T_CREATE);
						setState(1469);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == T_OR) {
							{
								setState(1467);
								match(T_OR);
								setState(1468);
								match(T_REPLACE);
							}
						}

					}
					break;
					case T_REPLACE: {
						setState(1471);
						match(T_REPLACE);
					}
					break;
					case T_FUNCTION:
						break;
					default:
						break;
				}
				setState(1474);
				match(T_FUNCTION);
				setState(1475);
				ident();
				setState(1477);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 152, _ctx)) {
					case 1: {
						setState(1476);
						create_routine_params();
					}
					break;
				}
				setState(1479);
				create_function_return();
				setState(1481);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 153, _ctx)) {
					case 1: {
						setState(1480);
						_la = _input.LA(1);
						if (!(_la == T_AS || _la == T_IS)) {
							_errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
					}
					break;
				}
				setState(1484);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 154, _ctx)) {
					case 1: {
						setState(1483);
						declare_block_inplace();
					}
					break;
				}
				setState(1486);
				single_block_stmt();
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

	public final Create_function_returnContext create_function_return() throws RecognitionException {
		Create_function_returnContext _localctx = new Create_function_returnContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_create_function_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1488);
				_la = _input.LA(1);
				if (!(_la == T_RETURN || _la == T_RETURNS)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1489);
				dtype();
				setState(1491);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 155, _ctx)) {
					case 1: {
						setState(1490);
						dtype_len();
					}
					break;
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

	public final Create_package_stmtContext create_package_stmt() throws RecognitionException {
		Create_package_stmtContext _localctx = new Create_package_stmtContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_create_package_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1500);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case T_ALTER: {
						setState(1493);
						match(T_ALTER);
					}
					break;
					case T_CREATE: {
						setState(1494);
						match(T_CREATE);
						setState(1497);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == T_OR) {
							{
								setState(1495);
								match(T_OR);
								setState(1496);
								match(T_REPLACE);
							}
						}

					}
					break;
					case T_REPLACE: {
						setState(1499);
						match(T_REPLACE);
					}
					break;
					case T_PACKAGE:
						break;
					default:
						break;
				}
				setState(1502);
				match(T_PACKAGE);
				setState(1503);
				ident();
				setState(1504);
				_la = _input.LA(1);
				if (!(_la == T_AS || _la == T_IS)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1505);
				package_spec();
				setState(1506);
				match(T_END);
				setState(1510);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 158, _ctx)) {
					case 1: {
						setState(1507);
						ident();
						setState(1508);
						match(T_SEMICOLON);
					}
					break;
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

	public final Package_specContext package_spec() throws RecognitionException {
		Package_specContext _localctx = new Package_specContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_package_spec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1512);
				package_spec_item();
				setState(1513);
				match(T_SEMICOLON);
				setState(1519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 159, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(1514);
								package_spec_item();
								setState(1515);
								match(T_SEMICOLON);
							}
						}
					}
					setState(1521);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 159, _ctx);
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

	public final Package_spec_itemContext package_spec_item() throws RecognitionException {
		Package_spec_itemContext _localctx = new Package_spec_itemContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_package_spec_item);
		int _la;
		try {
			setState(1535);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 162, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1522);
					declare_stmt_item();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1523);
					match(T_FUNCTION);
					setState(1524);
					ident();
					setState(1526);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 160, _ctx)) {
						case 1: {
							setState(1525);
							create_routine_params();
						}
						break;
					}
					setState(1528);
					create_function_return();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1530);
					_la = _input.LA(1);
					if (!(_la == T_PROC || _la == T_PROCEDURE)) {
						_errHandler.recoverInline(this);
					} else {
						if (_input.LA(1) == Token.EOF) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1531);
					ident();
					setState(1533);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 161, _ctx)) {
						case 1: {
							setState(1532);
							create_routine_params();
						}
						break;
					}
				}
				break;
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

	public final Create_package_body_stmtContext create_package_body_stmt() throws RecognitionException {
		Create_package_body_stmtContext _localctx = new Create_package_body_stmtContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_create_package_body_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1544);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case T_ALTER: {
						setState(1537);
						match(T_ALTER);
					}
					break;
					case T_CREATE: {
						setState(1538);
						match(T_CREATE);
						setState(1541);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == T_OR) {
							{
								setState(1539);
								match(T_OR);
								setState(1540);
								match(T_REPLACE);
							}
						}

					}
					break;
					case T_REPLACE: {
						setState(1543);
						match(T_REPLACE);
					}
					break;
					case T_PACKAGE:
						break;
					default:
						break;
				}
				setState(1546);
				match(T_PACKAGE);
				setState(1547);
				match(T_BODY);
				setState(1548);
				ident();
				setState(1549);
				_la = _input.LA(1);
				if (!(_la == T_AS || _la == T_IS)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1550);
				package_body();
				setState(1551);
				match(T_END);
				setState(1555);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 165, _ctx)) {
					case 1: {
						setState(1552);
						ident();
						setState(1553);
						match(T_SEMICOLON);
					}
					break;
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

	public final Package_bodyContext package_body() throws RecognitionException {
		Package_bodyContext _localctx = new Package_bodyContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_package_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1557);
				package_body_item();
				setState(1558);
				match(T_SEMICOLON);
				setState(1564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 166, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(1559);
								package_body_item();
								setState(1560);
								match(T_SEMICOLON);
							}
						}
					}
					setState(1566);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 166, _ctx);
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

	public final Package_body_itemContext package_body_item() throws RecognitionException {
		Package_body_itemContext _localctx = new Package_body_itemContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_package_body_item);
		try {
			setState(1570);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 167, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1567);
					declare_stmt_item();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1568);
					create_function_stmt();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1569);
					create_procedure_stmt();
				}
				break;
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

	public final Create_procedure_stmtContext create_procedure_stmt() throws RecognitionException {
		Create_procedure_stmtContext _localctx = new Create_procedure_stmtContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_create_procedure_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1579);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case T_ALTER: {
						setState(1572);
						match(T_ALTER);
					}
					break;
					case T_CREATE: {
						setState(1573);
						match(T_CREATE);
						setState(1576);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == T_OR) {
							{
								setState(1574);
								match(T_OR);
								setState(1575);
								match(T_REPLACE);
							}
						}

					}
					break;
					case T_REPLACE: {
						setState(1578);
						match(T_REPLACE);
					}
					break;
					case T_PROC:
					case T_PROCEDURE:
						break;
					default:
						break;
				}
				setState(1581);
				_la = _input.LA(1);
				if (!(_la == T_PROC || _la == T_PROCEDURE)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1582);
				ident();
				setState(1584);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 170, _ctx)) {
					case 1: {
						setState(1583);
						create_routine_params();
					}
					break;
				}
				setState(1587);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 171, _ctx)) {
					case 1: {
						setState(1586);
						create_routine_options();
					}
					break;
				}
				setState(1590);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 172, _ctx)) {
					case 1: {
						setState(1589);
						_la = _input.LA(1);
						if (!(_la == T_AS || _la == T_IS)) {
							_errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
					}
					break;
				}
				setState(1593);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 173, _ctx)) {
					case 1: {
						setState(1592);
						declare_block_inplace();
					}
					break;
				}
				setState(1596);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 174, _ctx)) {
					case 1: {
						setState(1595);
						label();
					}
					break;
				}
				setState(1598);
				proc_block();
				setState(1602);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 175, _ctx)) {
					case 1: {
						setState(1599);
						ident();
						setState(1600);
						match(T_SEMICOLON);
					}
					break;
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

	public final Create_routine_paramsContext create_routine_params() throws RecognitionException {
		Create_routine_paramsContext _localctx = new Create_routine_paramsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_create_routine_params);
		int _la;
		try {
			int _alt;
			setState(1626);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 178, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1604);
					match(T_OPEN_P);
					setState(1605);
					match(T_CLOSE_P);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1606);
					match(T_OPEN_P);
					setState(1607);
					create_routine_param_item();
					setState(1612);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == T_COMMA) {
						{
							{
								setState(1608);
								match(T_COMMA);
								setState(1609);
								create_routine_param_item();
							}
						}
						setState(1614);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1615);
					match(T_CLOSE_P);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1617);
					if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
							!_input.LT(1).getText().equalsIgnoreCase("AS") &&
							!(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") &&
									_input.LT(2).getText().equalsIgnoreCase("RESULT"))
					))
						throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\r\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") &&\r\n        _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\r\n        ");
					setState(1618);
					create_routine_param_item();
					setState(1623);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 177, _ctx);
					while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(1619);
									match(T_COMMA);
									setState(1620);
									create_routine_param_item();
								}
							}
						}
						setState(1625);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 177, _ctx);
					}
				}
				break;
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

	public final Create_routine_param_itemContext create_routine_param_item() throws RecognitionException {
		Create_routine_param_itemContext _localctx = new Create_routine_param_itemContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_create_routine_param_item);
		try {
			int _alt;
			setState(1670);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 187, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1633);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 179, _ctx)) {
						case 1: {
							setState(1628);
							match(T_IN);
						}
						break;
						case 2: {
							setState(1629);
							match(T_OUT);
						}
						break;
						case 3: {
							setState(1630);
							match(T_INOUT);
						}
						break;
						case 4: {
							setState(1631);
							match(T_IN);
							setState(1632);
							match(T_OUT);
						}
						break;
					}
					setState(1635);
					ident();
					setState(1636);
					dtype();
					setState(1638);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 180, _ctx)) {
						case 1: {
							setState(1637);
							dtype_len();
						}
						break;
					}
					setState(1643);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 181, _ctx);
					while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(1640);
									dtype_attr();
								}
							}
						}
						setState(1645);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 181, _ctx);
					}
					setState(1647);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 182, _ctx)) {
						case 1: {
							setState(1646);
							dtype_default();
						}
						break;
					}
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1649);
					ident();
					setState(1655);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 183, _ctx)) {
						case 1: {
							setState(1650);
							match(T_IN);
						}
						break;
						case 2: {
							setState(1651);
							match(T_OUT);
						}
						break;
						case 3: {
							setState(1652);
							match(T_INOUT);
						}
						break;
						case 4: {
							setState(1653);
							match(T_IN);
							setState(1654);
							match(T_OUT);
						}
						break;
					}
					setState(1657);
					dtype();
					setState(1659);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 184, _ctx)) {
						case 1: {
							setState(1658);
							dtype_len();
						}
						break;
					}
					setState(1664);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 185, _ctx);
					while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(1661);
									dtype_attr();
								}
							}
						}
						setState(1666);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 185, _ctx);
					}
					setState(1668);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 186, _ctx)) {
						case 1: {
							setState(1667);
							dtype_default();
						}
						break;
					}
				}
				break;
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

	public final Create_routine_optionsContext create_routine_options() throws RecognitionException {
		Create_routine_optionsContext _localctx = new Create_routine_optionsContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_create_routine_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1673);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							{
								setState(1672);
								create_routine_option();
							}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(1675);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 188, _ctx);
				} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
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

	public final Create_routine_optionContext create_routine_option() throws RecognitionException {
		Create_routine_optionContext _localctx = new Create_routine_optionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_create_routine_option);
		int _la;
		try {
			setState(1688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_LANGUAGE:
					enterOuterAlt(_localctx, 1);
				{
					setState(1677);
					match(T_LANGUAGE);
					setState(1678);
					match(T_SQL);
				}
				break;
				case T_SQL:
					enterOuterAlt(_localctx, 2);
				{
					setState(1679);
					match(T_SQL);
					setState(1680);
					match(T_SECURITY);
					setState(1681);
					_la = _input.LA(1);
					if (!(_la == T_CREATOR || _la == T_DEFINER || _la == T_INVOKER || _la == T_OWNER)) {
						_errHandler.recoverInline(this);
					} else {
						if (_input.LA(1) == Token.EOF) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
				}
				break;
				case T_DYNAMIC:
				case T_RESULT:
					enterOuterAlt(_localctx, 3);
				{
					setState(1683);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_DYNAMIC) {
						{
							setState(1682);
							match(T_DYNAMIC);
						}
					}

					setState(1685);
					match(T_RESULT);
					setState(1686);
					match(T_SETS);
					setState(1687);
					match(L_INT);
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Exec_stmtContext exec_stmt() throws RecognitionException {
		Exec_stmtContext _localctx = new Exec_stmtContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_exec_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1690);
				_la = _input.LA(1);
				if (!(_la == T_EXEC || _la == T_EXECUTE)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1692);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 191, _ctx)) {
					case 1: {
						setState(1691);
						match(T_IMMEDIATE);
					}
					break;
				}
				setState(1694);
				expr(0);
				setState(1700);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 192, _ctx)) {
					case 1: {
						setState(1695);
						match(T_OPEN_P);
						setState(1696);
						expr_func_params();
						setState(1697);
						match(T_CLOSE_P);
					}
					break;
					case 2: {
						setState(1699);
						expr_func_params();
					}
					break;
				}
				setState(1711);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 194, _ctx)) {
					case 1: {
						setState(1702);
						match(T_INTO);
						setState(1703);
						match(L_ID);
						setState(1708);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 193, _ctx);
						while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
							if (_alt == 1) {
								{
									{
										setState(1704);
										match(T_COMMA);
										setState(1705);
										match(L_ID);
									}
								}
							}
							setState(1710);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input, 193, _ctx);
						}
					}
					break;
				}
				setState(1714);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 195, _ctx)) {
					case 1: {
						setState(1713);
						using_clause();
					}
					break;
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

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_if_stmt);
		try {
			setState(1719);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 196, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1716);
					if_plsql_stmt();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1717);
					if_tsql_stmt();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1718);
					if_bteq_stmt();
				}
				break;
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

	public final If_plsql_stmtContext if_plsql_stmt() throws RecognitionException {
		If_plsql_stmtContext _localctx = new If_plsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_if_plsql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1721);
				match(T_IF);
				setState(1722);
				bool_expr(0);
				setState(1723);
				match(T_THEN);
				setState(1724);
				block();
				setState(1728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T_ELSEIF || _la == T_ELSIF) {
					{
						{
							setState(1725);
							elseif_block();
						}
					}
					setState(1730);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_ELSE) {
					{
						setState(1731);
						else_block();
					}
				}

				setState(1734);
				match(T_END);
				setState(1735);
				match(T_IF);
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

	public final If_tsql_stmtContext if_tsql_stmt() throws RecognitionException {
		If_tsql_stmtContext _localctx = new If_tsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_if_tsql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1737);
				match(T_IF);
				setState(1738);
				bool_expr(0);
				setState(1739);
				single_block_stmt();
				setState(1742);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 199, _ctx)) {
					case 1: {
						setState(1740);
						match(T_ELSE);
						setState(1741);
						single_block_stmt();
					}
					break;
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

	public final If_bteq_stmtContext if_bteq_stmt() throws RecognitionException {
		If_bteq_stmtContext _localctx = new If_bteq_stmtContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_if_bteq_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1744);
				match(T__3);
				setState(1745);
				match(T_IF);
				setState(1746);
				bool_expr(0);
				setState(1747);
				match(T_THEN);
				setState(1748);
				single_block_stmt();
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

	public final Elseif_blockContext elseif_block() throws RecognitionException {
		Elseif_blockContext _localctx = new Elseif_blockContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_elseif_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1750);
				_la = _input.LA(1);
				if (!(_la == T_ELSEIF || _la == T_ELSIF)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1751);
				bool_expr(0);
				setState(1752);
				match(T_THEN);
				setState(1753);
				block();
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

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1755);
				match(T_ELSE);
				setState(1756);
				block();
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

	public final Exit_stmtContext exit_stmt() throws RecognitionException {
		Exit_stmtContext _localctx = new Exit_stmtContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_exit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1758);
				match(T_EXIT);
				setState(1760);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 200, _ctx)) {
					case 1: {
						setState(1759);
						match(L_ID);
					}
					break;
				}
				setState(1764);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 201, _ctx)) {
					case 1: {
						setState(1762);
						match(T_WHEN);
						setState(1763);
						bool_expr(0);
					}
					break;
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

	public final Leave_stmtContext leave_stmt() throws RecognitionException {
		Leave_stmtContext _localctx = new Leave_stmtContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_leave_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1766);
				match(T_LEAVE);
				setState(1768);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 202, _ctx)) {
					case 1: {
						setState(1767);
						match(L_ID);
					}
					break;
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

	public final Cmp_stmtContext cmp_stmt() throws RecognitionException {
		Cmp_stmtContext _localctx = new Cmp_stmtContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_cmp_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1770);
				match(T_CMP);
				setState(1771);
				_la = _input.LA(1);
				if (!(_la == T_ROW_COUNT || _la == T_SUM)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1772);
				cmp_source();
				setState(1773);
				match(T_COMMA);
				setState(1774);
				cmp_source();
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

	public final Cmp_sourceContext cmp_source() throws RecognitionException {
		Cmp_sourceContext _localctx = new Cmp_sourceContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_cmp_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1784);
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
					case T_WRITE:
					case L_ID: {
						setState(1776);
						table_name();
						setState(1778);
						_errHandler.sync(this);
						switch (getInterpreter().adaptivePredict(_input, 203, _ctx)) {
							case 1: {
								setState(1777);
								where_clause();
							}
							break;
						}
					}
					break;
					case T_OPEN_P: {
						setState(1780);
						match(T_OPEN_P);
						setState(1781);
						select_stmt();
						setState(1782);
						match(T_CLOSE_P);
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(1788);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 205, _ctx)) {
					case 1: {
						setState(1786);
						match(T_AT);
						setState(1787);
						ident();
					}
					break;
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

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1790);
				match(T_CREATE);
				setState(1792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_UNIQUE) {
					{
						setState(1791);
						match(T_UNIQUE);
					}
				}

				setState(1794);
				match(T_INDEX);
				setState(1795);
				ident();
				setState(1796);
				match(T_ON);
				setState(1797);
				table_name();
				setState(1798);
				match(T_OPEN_P);
				setState(1799);
				create_index_col();
				setState(1804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T_COMMA) {
					{
						{
							setState(1800);
							match(T_COMMA);
							setState(1801);
							create_index_col();
						}
					}
					setState(1806);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1807);
				match(T_CLOSE_P);
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

	public final Create_index_colContext create_index_col() throws RecognitionException {
		Create_index_colContext _localctx = new Create_index_colContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_create_index_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1809);
				ident();
				setState(1811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_ASC || _la == T_DESC) {
					{
						setState(1810);
						_la = _input.LA(1);
						if (!(_la == T_ASC || _la == T_DESC)) {
							_errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
					}
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

	public final Index_storage_clauseContext index_storage_clause() throws RecognitionException {
		Index_storage_clauseContext _localctx = new Index_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_index_storage_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1813);
				index_mssql_storage_clause();
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

	public final Index_mssql_storage_clauseContext index_mssql_storage_clause() throws RecognitionException {
		Index_mssql_storage_clauseContext _localctx = new Index_mssql_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_index_mssql_storage_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1815);
				match(T_WITH);
				setState(1816);
				match(T_OPEN_P);
				setState(1817);
				ident();
				setState(1818);
				match(T_EQUAL);
				setState(1819);
				ident();
				setState(1827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T_COMMA) {
					{
						{
							setState(1820);
							match(T_COMMA);
							setState(1821);
							ident();
							setState(1822);
							match(T_EQUAL);
							setState(1823);
							ident();
						}
					}
					setState(1829);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1830);
				match(T_CLOSE_P);
				setState(1834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T_ON || _la == T_TEXTIMAGE_ON) {
					{
						{
							setState(1831);
							create_table_options_mssql_item();
						}
					}
					setState(1836);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public final Quit_stmtContext quit_stmt() throws RecognitionException {
		Quit_stmtContext _localctx = new Quit_stmtContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_quit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T__3) {
					{
						setState(1837);
						match(T__3);
					}
				}

				setState(1840);
				match(T_QUIT);
				setState(1842);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 212, _ctx)) {
					case 1: {
						setState(1841);
						expr(0);
					}
					break;
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

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1844);
				match(T_RETURN);
				setState(1846);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 213, _ctx)) {
					case 1: {
						setState(1845);
						expr(0);
					}
					break;
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

	public final Cpp_stmtContext cpp_stmt() throws RecognitionException {
		Cpp_stmtContext _localctx = new Cpp_stmtContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_cpp_stmt);
		try {
			setState(1858);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 214, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1848);
					cpp_function_stmt();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1849);
					cpp_for_stmt();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1850);
					cpp_if_stmt();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(1851);
					cpp_return_stmt();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(1852);
					cpp_declare_stmt();
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(1853);
					cpp_assignment_stmt();
				}
				break;
				case 7:
					enterOuterAlt(_localctx, 7);
				{
					setState(1854);
					cpp_declare_assignment_stmt();
				}
				break;
				case 8:
					enterOuterAlt(_localctx, 8);
				{
					setState(1855);
					write_stmt();
				}
				break;
				case 9:
					enterOuterAlt(_localctx, 9);
				{
					setState(1856);
					create_table_stmt();
				}
				break;
				case 10:
					enterOuterAlt(_localctx, 10);
				{
					setState(1857);
					create_type_stmt();
				}
				break;
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

	public final Cpp_function_stmtContext cpp_function_stmt() throws RecognitionException {
		Cpp_function_stmtContext _localctx = new Cpp_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_cpp_function_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1860);
				cpp_function_header();
				setState(1861);
				cpp_function_body();
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

	public final Cpp_function_headerContext cpp_function_header() throws RecognitionException {
		Cpp_function_headerContext _localctx = new Cpp_function_headerContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_cpp_function_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1863);
				dtype();
				setState(1864);
				ident();
				setState(1865);
				match(T_OPEN_P);
				setState(1867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_AND) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BINARY_INTEGER) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_DATABASE) | (1L << T_DATA) | (1L << T_DATE) | (1L << T_DATETIME) | (1L << T_DAY) | (1L << T_DAYS) | (1L << T_DEC) | (1L << T_DECIMAL) | (1L << T_DECLARE) | (1L << T_DEFAULT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_END - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IMMEDIATE - 64)) | (1L << (T_IN - 64)) | (1L << (T_INDEX - 64)) | (1L << (T_INITRANS - 64)) | (1L << (T_INNER - 64)) | (1L << (T_INOUT - 64)) | (1L << (T_INT - 64)) | (1L << (T_INT2 - 64)) | (1L << (T_INT4 - 64)) | (1L << (T_INT8 - 64)) | (1L << (T_INTEGER - 64)) | (1L << (T_INTERSECT - 64)) | (1L << (T_INTERVAL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)) | (1L << (T_OR - 128)) | (1L << (T_ORDER - 128)) | (1L << (T_OUT - 128)) | (1L << (T_OUTER - 128)) | (1L << (T_OVER - 128)) | (1L << (T_OWNER - 128)) | (1L << (T_PACKAGE - 128)) | (1L << (T_PARTITION - 128)) | (1L << (T_PCTFREE - 128)) | (1L << (T_PCTUSED - 128)) | (1L << (T_PLS_INTEGER - 128)) | (1L << (T_PRECISION - 128)) | (1L << (T_PRESERVE - 128)) | (1L << (T_PRIMARY - 128)) | (1L << (T_PROC - 128)) | (1L << (T_PROCEDURE - 128)) | (1L << (T_QUALIFY - 128)) | (1L << (T_QUIT - 128)) | (1L << (T_REAL - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SIMPLE_INTEGER - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)) | (1L << (T_SQL - 192)) | (1L << (T_SQLEXCEPTION - 192)) | (1L << (T_SQLWARNING - 192)) | (1L << (T_STEP - 192)) | (1L << (T_STORAGE - 192)) | (1L << (T_STORED - 192)) | (1L << (T_STRING - 192)) | (1L << (T_SUBSTRING - 192)) | (1L << (T_SUM - 192)) | (1L << (T_SYS_REFCURSOR - 192)) | (1L << (T_TABLE - 192)) | (1L << (T_TABLESPACE - 192)) | (1L << (T_TEMPORARY - 192)) | (1L << (T_TERMINATED - 192)) | (1L << (T_TEXTIMAGE_ON - 192)) | (1L << (T_THEN - 192)) | (1L << (T_TIMESTAMP - 192)) | (1L << (T_TINYINT - 192)) | (1L << (T_TITLE - 192)) | (1L << (T_TO - 192)) | (1L << (T_TOP - 192)) | (1L << (T_TRUE - 192)) | (1L << (T_UNIQUE - 192)) | (1L << (T_UPDATE - 192)) | (1L << (T_UR - 192)) | (1L << (T_USE - 192)) | (1L << (T_USING - 192)) | (1L << (T_VALUE - 192)) | (1L << (T_VALUES - 192)) | (1L << (T_VAR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)) | (1L << (T_PART_COUNT - 256)) | (1L << (T_PART_LOC - 256)) | (1L << (T_RANK - 256)) | (1L << (T_ROW_NUMBER - 256)) | (1L << (T_STDEV - 256)) | (1L << (T_SYSDATE - 256)) | (1L << (T_VARIANCE - 256)) | (1L << (T_USER - 256)) | (1L << (T_WRITE - 256)) | (1L << (T_QUERY - 256)) | (1L << (T_QUERY_RESULT - 256)) | (1L << (L_ID - 256)))) != 0)) {
					{
						setState(1866);
						cpp_function_params_clause();
					}
				}

				setState(1869);
				match(T_CLOSE_P);
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

	public final Cpp_function_params_clauseContext cpp_function_params_clause() throws RecognitionException {
		Cpp_function_params_clauseContext _localctx = new Cpp_function_params_clauseContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_cpp_function_params_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1871);
				cpp_function_param();
				setState(1876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T_COMMA) {
					{
						{
							setState(1872);
							match(T_COMMA);
							setState(1873);
							cpp_function_param();
						}
					}
					setState(1878);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public final Cpp_function_paramContext cpp_function_param() throws RecognitionException {
		Cpp_function_paramContext _localctx = new Cpp_function_paramContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_cpp_function_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1879);
				dtype();
				setState(1880);
				ident();
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

	public final Cpp_function_bodyContext cpp_function_body() throws RecognitionException {
		Cpp_function_bodyContext _localctx = new Cpp_function_bodyContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_cpp_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1882);
				cpp_scope();
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

	public final Cpp_if_stmtContext cpp_if_stmt() throws RecognitionException {
		Cpp_if_stmtContext _localctx = new Cpp_if_stmtContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_cpp_if_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1884);
				match(T_IF);
				setState(1885);
				match(T_OPEN_P);
				setState(1886);
				bool_expr(0);
				setState(1887);
				match(T_CLOSE_P);
				setState(1888);
				cpp_for_stmt_body();
				setState(1892);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 217, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(1889);
								cpp_elseif_clause();
							}
						}
					}
					setState(1894);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 217, _ctx);
				}
				setState(1896);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 218, _ctx)) {
					case 1: {
						setState(1895);
						cpp_else_clause();
					}
					break;
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

	public final Cpp_elseif_clauseContext cpp_elseif_clause() throws RecognitionException {
		Cpp_elseif_clauseContext _localctx = new Cpp_elseif_clauseContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_cpp_elseif_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1898);
				_la = _input.LA(1);
				if (!(_la == T_ELSEIF || _la == T_ELSIF)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1899);
				match(T_OPEN_P);
				setState(1900);
				bool_expr(0);
				setState(1901);
				match(T_CLOSE_P);
				setState(1902);
				cpp_for_stmt_body();
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

	public final Cpp_else_clauseContext cpp_else_clause() throws RecognitionException {
		Cpp_else_clauseContext _localctx = new Cpp_else_clauseContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_cpp_else_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1904);
				match(T_ELSE);
				setState(1905);
				cpp_for_stmt_body();
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

	public final Cpp_for_stmtContext cpp_for_stmt() throws RecognitionException {
		Cpp_for_stmtContext _localctx = new Cpp_for_stmtContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_cpp_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1907);
				cpp_for_stmt_header();
				setState(1908);
				cpp_for_stmt_body();
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

	public final Cpp_for_stmt_headerContext cpp_for_stmt_header() throws RecognitionException {
		Cpp_for_stmt_headerContext _localctx = new Cpp_for_stmt_headerContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_cpp_for_stmt_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1910);
				match(T_FOR);
				setState(1911);
				match(T_OPEN_P);
				setState(1912);
				cpp_for_params_clause();
				setState(1913);
				match(T_SEMICOLON);
				setState(1914);
				bool_expr(0);
				setState(1915);
				match(T_SEMICOLON);
				setState(1916);
				cpp_for_stmt_var_incr_caluse();
				setState(1917);
				match(T_CLOSE_P);
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

	public final Cpp_for_params_clauseContext cpp_for_params_clause() throws RecognitionException {
		Cpp_for_params_clauseContext _localctx = new Cpp_for_params_clauseContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_cpp_for_params_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1919);
				cpp_for_param();
				setState(1924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T_COMMA) {
					{
						{
							setState(1920);
							match(T_COMMA);
							setState(1921);
							cpp_for_param();
						}
					}
					setState(1926);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public final Cpp_for_paramContext cpp_for_param() throws RecognitionException {
		Cpp_for_paramContext _localctx = new Cpp_for_paramContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_cpp_for_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1928);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 220, _ctx)) {
					case 1: {
						setState(1927);
						dtype();
					}
					break;
				}
				setState(1930);
				ident();
				setState(1931);
				match(T_EQUAL);
				setState(1932);
				match(L_INT);
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

	public final Cpp_for_stmt_var_incr_caluseContext cpp_for_stmt_var_incr_caluse() throws RecognitionException {
		Cpp_for_stmt_var_incr_caluseContext _localctx = new Cpp_for_stmt_var_incr_caluseContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_cpp_for_stmt_var_incr_caluse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1934);
				cpp_for_stmt_var_incr();
				setState(1939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T_COMMA) {
					{
						{
							setState(1935);
							match(T_COMMA);
							setState(1936);
							cpp_for_stmt_var_incr();
						}
					}
					setState(1941);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public final Cpp_for_stmt_var_incrContext cpp_for_stmt_var_incr() throws RecognitionException {
		Cpp_for_stmt_var_incrContext _localctx = new Cpp_for_stmt_var_incrContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_cpp_for_stmt_var_incr);
		int _la;
		try {
			setState(1967);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 223, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1942);
					ident();
					setState(1943);
					match(T_ADD);
					setState(1944);
					match(T_ADD);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1946);
					ident();
					setState(1947);
					match(T_EQUAL);
					setState(1948);
					ident();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1950);
					ident();
					setState(1951);
					match(T_EQUAL);
					setState(1952);
					ident();
					setState(1953);
					_la = _input.LA(1);
					if (!(_la == T__2 || ((((_la - 296)) & ~0x3f) == 0 && ((1L << (_la - 296)) & ((1L << (T_ADD - 296)) | (1L << (T_DIV - 296)) | (1L << (T_MUL - 296)) | (1L << (T_SUB - 296)))) != 0))) {
						_errHandler.recoverInline(this);
					} else {
						if (_input.LA(1) == Token.EOF) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1954);
					ident();
					setState(1959);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == T__2 || ((((_la - 296)) & ~0x3f) == 0 && ((1L << (_la - 296)) & ((1L << (T_ADD - 296)) | (1L << (T_DIV - 296)) | (1L << (T_MUL - 296)) | (1L << (T_SUB - 296)))) != 0)) {
						{
							{
								setState(1955);
								_la = _input.LA(1);
								if (!(_la == T__2 || ((((_la - 296)) & ~0x3f) == 0 && ((1L << (_la - 296)) & ((1L << (T_ADD - 296)) | (1L << (T_DIV - 296)) | (1L << (T_MUL - 296)) | (1L << (T_SUB - 296)))) != 0))) {
									_errHandler.recoverInline(this);
								} else {
									if (_input.LA(1) == Token.EOF) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								setState(1956);
								ident();
							}
						}
						setState(1961);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(1962);
					ident();
					setState(1963);
					_la = _input.LA(1);
					if (!(_la == T__2 || ((((_la - 296)) & ~0x3f) == 0 && ((1L << (_la - 296)) & ((1L << (T_ADD - 296)) | (1L << (T_DIV - 296)) | (1L << (T_MUL - 296)) | (1L << (T_SUB - 296)))) != 0))) {
						_errHandler.recoverInline(this);
					} else {
						if (_input.LA(1) == Token.EOF) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1964);
					match(T_EQUAL);
					setState(1965);
					ident();
				}
				break;
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

	public final Cpp_for_stmt_bodyContext cpp_for_stmt_body() throws RecognitionException {
		Cpp_for_stmt_bodyContext _localctx = new Cpp_for_stmt_bodyContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_cpp_for_stmt_body);
		try {
			setState(1971);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_OPEN_B:
					enterOuterAlt(_localctx, 1);
				{
					setState(1969);
					cpp_scope();
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
				case T_BINARY_INTEGER:
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
				case T_PLS_INTEGER:
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
				case T_SIMPLE_INTEGER:
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
				case T_TINYINT:
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
				case T_WRITE:
				case T_QUERY:
				case T_QUERY_RESULT:
				case L_ID:
					enterOuterAlt(_localctx, 2);
				{
					setState(1970);
					cpp_stmt();
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Cpp_declare_assignment_stmtContext cpp_declare_assignment_stmt() throws RecognitionException {
		Cpp_declare_assignment_stmtContext _localctx = new Cpp_declare_assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_cpp_declare_assignment_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1975);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 225, _ctx)) {
					case 1: {
						setState(1973);
						dtype();
					}
					break;
					case 2: {
						setState(1974);
						match(T_VAR);
					}
					break;
				}
				setState(1977);
				ident();
				setState(1978);
				match(T_EQUAL);
				setState(1979);
				stmt();
				setState(1980);
				match(T_SEMICOLON);
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

	public final Cpp_declare_stmtContext cpp_declare_stmt() throws RecognitionException {
		Cpp_declare_stmtContext _localctx = new Cpp_declare_stmtContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_cpp_declare_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1984);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 226, _ctx)) {
					case 1: {
						setState(1982);
						dtype();
					}
					break;
					case 2: {
						setState(1983);
						match(T_VAR);
					}
					break;
				}
				setState(1986);
				ident();
				setState(1987);
				match(T_SEMICOLON);
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

	public final Cpp_assignment_stmtContext cpp_assignment_stmt() throws RecognitionException {
		Cpp_assignment_stmtContext _localctx = new Cpp_assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_cpp_assignment_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1989);
				ident();
				setState(1990);
				match(T_EQUAL);
				setState(1991);
				stmt();
				setState(1992);
				match(T_SEMICOLON);
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

	public final Cpp_return_stmtContext cpp_return_stmt() throws RecognitionException {
		Cpp_return_stmtContext _localctx = new Cpp_return_stmtContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_cpp_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1994);
				match(T_RETURN);
				setState(1995);
				expr(0);
				setState(1996);
				match(T_SEMICOLON);
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

	public final Cpp_scopeContext cpp_scope() throws RecognitionException {
		Cpp_scopeContext _localctx = new Cpp_scopeContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_cpp_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1998);
				match(T_OPEN_B);
				setState(2003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_AND) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BINARY_INTEGER) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_DATABASE) | (1L << T_DATA) | (1L << T_DATE) | (1L << T_DATETIME) | (1L << T_DAY) | (1L << T_DAYS) | (1L << T_DEC) | (1L << T_DECIMAL) | (1L << T_DECLARE) | (1L << T_DEFAULT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_END - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IMMEDIATE - 64)) | (1L << (T_IN - 64)) | (1L << (T_INDEX - 64)) | (1L << (T_INITRANS - 64)) | (1L << (T_INNER - 64)) | (1L << (T_INOUT - 64)) | (1L << (T_INT - 64)) | (1L << (T_INT2 - 64)) | (1L << (T_INT4 - 64)) | (1L << (T_INT8 - 64)) | (1L << (T_INTEGER - 64)) | (1L << (T_INTERSECT - 64)) | (1L << (T_INTERVAL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)) | (1L << (T_OR - 128)) | (1L << (T_ORDER - 128)) | (1L << (T_OUT - 128)) | (1L << (T_OUTER - 128)) | (1L << (T_OVER - 128)) | (1L << (T_OWNER - 128)) | (1L << (T_PACKAGE - 128)) | (1L << (T_PARTITION - 128)) | (1L << (T_PCTFREE - 128)) | (1L << (T_PCTUSED - 128)) | (1L << (T_PLS_INTEGER - 128)) | (1L << (T_PRECISION - 128)) | (1L << (T_PRESERVE - 128)) | (1L << (T_PRIMARY - 128)) | (1L << (T_PROC - 128)) | (1L << (T_PROCEDURE - 128)) | (1L << (T_QUALIFY - 128)) | (1L << (T_QUIT - 128)) | (1L << (T_REAL - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SIMPLE_INTEGER - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)) | (1L << (T_SQL - 192)) | (1L << (T_SQLEXCEPTION - 192)) | (1L << (T_SQLWARNING - 192)) | (1L << (T_STEP - 192)) | (1L << (T_STORAGE - 192)) | (1L << (T_STORED - 192)) | (1L << (T_STRING - 192)) | (1L << (T_SUBSTRING - 192)) | (1L << (T_SUM - 192)) | (1L << (T_SYS_REFCURSOR - 192)) | (1L << (T_TABLE - 192)) | (1L << (T_TABLESPACE - 192)) | (1L << (T_TEMPORARY - 192)) | (1L << (T_TERMINATED - 192)) | (1L << (T_TEXTIMAGE_ON - 192)) | (1L << (T_THEN - 192)) | (1L << (T_TIMESTAMP - 192)) | (1L << (T_TINYINT - 192)) | (1L << (T_TITLE - 192)) | (1L << (T_TO - 192)) | (1L << (T_TOP - 192)) | (1L << (T_TRUE - 192)) | (1L << (T_UNIQUE - 192)) | (1L << (T_UPDATE - 192)) | (1L << (T_UR - 192)) | (1L << (T_USE - 192)) | (1L << (T_USING - 192)) | (1L << (T_VALUE - 192)) | (1L << (T_VALUES - 192)) | (1L << (T_VAR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)) | (1L << (T_PART_COUNT - 256)) | (1L << (T_PART_LOC - 256)) | (1L << (T_RANK - 256)) | (1L << (T_ROW_NUMBER - 256)) | (1L << (T_STDEV - 256)) | (1L << (T_SYSDATE - 256)) | (1L << (T_VARIANCE - 256)) | (1L << (T_USER - 256)) | (1L << (T_WRITE - 256)) | (1L << (T_QUERY - 256)) | (1L << (T_QUERY_RESULT - 256)) | (1L << (T_OPEN_B - 256)) | (1L << (L_ID - 256)))) != 0)) {
					{
						setState(2001);
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
							case T_BINARY_INTEGER:
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
							case T_PLS_INTEGER:
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
							case T_SIMPLE_INTEGER:
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
							case T_TINYINT:
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
							case T_WRITE:
							case T_QUERY:
							case T_QUERY_RESULT:
							case L_ID: {
								setState(1999);
								cpp_stmt();
							}
							break;
							case T_OPEN_B: {
								setState(2000);
								cpp_scope();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					setState(2005);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2006);
				match(T_CLOSE_B);
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

	public final Execute_query_stmtContext execute_query_stmt() throws RecognitionException {
		Execute_query_stmtContext _localctx = new Execute_query_stmtContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_execute_query_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_AND) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_DATABASE) | (1L << T_DATA) | (1L << T_DATE) | (1L << T_DATETIME) | (1L << T_DAY) | (1L << T_DAYS) | (1L << T_DEC) | (1L << T_DECIMAL) | (1L << T_DECLARE) | (1L << T_DEFAULT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_END - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IMMEDIATE - 64)) | (1L << (T_IN - 64)) | (1L << (T_INDEX - 64)) | (1L << (T_INITRANS - 64)) | (1L << (T_INNER - 64)) | (1L << (T_INOUT - 64)) | (1L << (T_INT - 64)) | (1L << (T_INT2 - 64)) | (1L << (T_INT4 - 64)) | (1L << (T_INT8 - 64)) | (1L << (T_INTEGER - 64)) | (1L << (T_INTERSECT - 64)) | (1L << (T_INTERVAL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)) | (1L << (T_OR - 128)) | (1L << (T_ORDER - 128)) | (1L << (T_OUT - 128)) | (1L << (T_OUTER - 128)) | (1L << (T_OVER - 128)) | (1L << (T_OWNER - 128)) | (1L << (T_PACKAGE - 128)) | (1L << (T_PARTITION - 128)) | (1L << (T_PCTFREE - 128)) | (1L << (T_PCTUSED - 128)) | (1L << (T_PRECISION - 128)) | (1L << (T_PRESERVE - 128)) | (1L << (T_PRIMARY - 128)) | (1L << (T_PROC - 128)) | (1L << (T_PROCEDURE - 128)) | (1L << (T_QUALIFY - 128)) | (1L << (T_QUIT - 128)) | (1L << (T_REAL - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)) | (1L << (T_SQL - 192)) | (1L << (T_SQLEXCEPTION - 192)) | (1L << (T_SQLWARNING - 192)) | (1L << (T_STEP - 192)) | (1L << (T_STORAGE - 192)) | (1L << (T_STORED - 192)) | (1L << (T_STRING - 192)) | (1L << (T_SUBSTRING - 192)) | (1L << (T_SUM - 192)) | (1L << (T_SYS_REFCURSOR - 192)) | (1L << (T_TABLE - 192)) | (1L << (T_TABLESPACE - 192)) | (1L << (T_TEMPORARY - 192)) | (1L << (T_TERMINATED - 192)) | (1L << (T_TEXTIMAGE_ON - 192)) | (1L << (T_THEN - 192)) | (1L << (T_TIMESTAMP - 192)) | (1L << (T_TITLE - 192)) | (1L << (T_TO - 192)) | (1L << (T_TOP - 192)) | (1L << (T_TRUE - 192)) | (1L << (T_UNIQUE - 192)) | (1L << (T_UPDATE - 192)) | (1L << (T_UR - 192)) | (1L << (T_USE - 192)) | (1L << (T_USING - 192)) | (1L << (T_VALUE - 192)) | (1L << (T_VALUES - 192)) | (1L << (T_VAR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)) | (1L << (T_PART_COUNT - 256)) | (1L << (T_PART_LOC - 256)) | (1L << (T_RANK - 256)) | (1L << (T_ROW_NUMBER - 256)) | (1L << (T_STDEV - 256)) | (1L << (T_SYSDATE - 256)) | (1L << (T_VARIANCE - 256)) | (1L << (T_USER - 256)) | (1L << (T_WRITE - 256)) | (1L << (L_ID - 256)))) != 0)) {
					{
						setState(2008);
						ident();
						setState(2009);
						match(T_EQUAL);
					}
				}

				setState(2013);
				match(T_EXECUTE_QUERY);
				setState(2014);
				match(T_OPEN_P);
				setState(2015);
				ident();
				setState(2016);
				match(T_CLOSE_P);
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

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2018);
				match(T_WHILE);
				setState(2019);
				bool_expr(0);
				setState(2020);
				_la = _input.LA(1);
				if (!(_la == T_BEGIN || _la == T_DO || _la == T_LOOP || _la == T_THEN)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2021);
				block();
				setState(2022);
				match(T_END);
				setState(2024);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 230, _ctx)) {
					case 1: {
						setState(2023);
						_la = _input.LA(1);
						if (!(_la == T_LOOP || _la == T_WHILE)) {
							_errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
					}
					break;
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

	public final For_range_stmtContext for_range_stmt() throws RecognitionException {
		For_range_stmtContext _localctx = new For_range_stmtContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_for_range_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2026);
				match(T_FOR);
				setState(2027);
				match(L_ID);
				setState(2028);
				match(T_IN);
				setState(2030);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 231, _ctx)) {
					case 1: {
						setState(2029);
						match(T_REVERSE);
					}
					break;
				}
				setState(2032);
				expr(0);
				setState(2033);
				match(T_DOT2);
				setState(2034);
				expr(0);
				setState(2037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_BY || _la == T_STEP) {
					{
						setState(2035);
						_la = _input.LA(1);
						if (!(_la == T_BY || _la == T_STEP)) {
							_errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2036);
						expr(0);
					}
				}

				setState(2039);
				match(T_LOOP);
				setState(2040);
				block();
				setState(2041);
				match(T_END);
				setState(2042);
				match(T_LOOP);
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

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_label);
		try {
			setState(2050);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case L_LABEL:
					enterOuterAlt(_localctx, 1);
				{
					setState(2044);
					match(L_LABEL);
				}
				break;
				case T_LESS:
					enterOuterAlt(_localctx, 2);
				{
					setState(2045);
					match(T_LESS);
					setState(2046);
					match(T_LESS);
					setState(2047);
					match(L_ID);
					setState(2048);
					match(T_GREATER);
					setState(2049);
					match(T_GREATER);
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Using_clauseContext using_clause() throws RecognitionException {
		Using_clauseContext _localctx = new Using_clauseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_using_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(2052);
				match(T_USING);
				setState(2053);
				expr(0);
				setState(2058);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 234, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(2054);
								match(T_COMMA);
								setState(2055);
								expr(0);
							}
						}
					}
					setState(2060);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 234, _ctx);
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

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_select_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2061);
				fullselect_stmt();
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

	public final Fullselect_stmtContext fullselect_stmt() throws RecognitionException {
		Fullselect_stmtContext _localctx = new Fullselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_fullselect_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(2063);
				fullselect_stmt_item();
				setState(2069);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 235, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(2064);
								fullselect_set_clause();
								setState(2065);
								fullselect_stmt_item();
							}
						}
					}
					setState(2071);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 235, _ctx);
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

	public final Fullselect_stmt_itemContext fullselect_stmt_item() throws RecognitionException {
		Fullselect_stmt_itemContext _localctx = new Fullselect_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_fullselect_stmt_item);
		try {
			setState(2077);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_SEL:
				case T_SELECT:
					enterOuterAlt(_localctx, 1);
				{
					setState(2072);
					subselect_stmt();
				}
				break;
				case T_OPEN_P:
					enterOuterAlt(_localctx, 2);
				{
					setState(2073);
					match(T_OPEN_P);
					setState(2074);
					fullselect_stmt();
					setState(2075);
					match(T_CLOSE_P);
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Fullselect_set_clauseContext fullselect_set_clause() throws RecognitionException {
		Fullselect_set_clauseContext _localctx = new Fullselect_set_clauseContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_fullselect_set_clause);
		int _la;
		try {
			setState(2091);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_UNION:
					enterOuterAlt(_localctx, 1);
				{
					setState(2079);
					match(T_UNION);
					setState(2081);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_ALL) {
						{
							setState(2080);
							match(T_ALL);
						}
					}

				}
				break;
				case T_EXCEPT:
					enterOuterAlt(_localctx, 2);
				{
					setState(2083);
					match(T_EXCEPT);
					setState(2085);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_ALL) {
						{
							setState(2084);
							match(T_ALL);
						}
					}

				}
				break;
				case T_INTERSECT:
					enterOuterAlt(_localctx, 3);
				{
					setState(2087);
					match(T_INTERSECT);
					setState(2089);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_ALL) {
						{
							setState(2088);
							match(T_ALL);
						}
					}

				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Subselect_stmtContext subselect_stmt() throws RecognitionException {
		Subselect_stmtContext _localctx = new Subselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_subselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2093);
				_la = _input.LA(1);
				if (!(_la == T_SEL || _la == T_SELECT)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2094);
				select_list();
				setState(2096);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 241, _ctx)) {
					case 1: {
						setState(2095);
						into_clause();
					}
					break;
				}
				setState(2099);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 242, _ctx)) {
					case 1: {
						setState(2098);
						from_clause();
					}
					break;
				}
				setState(2102);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 243, _ctx)) {
					case 1: {
						setState(2101);
						where_clause();
					}
					break;
				}
				setState(2105);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 244, _ctx)) {
					case 1: {
						setState(2104);
						group_by_clause();
					}
					break;
				}
				setState(2109);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 245, _ctx)) {
					case 1: {
						setState(2107);
						having_clause();
					}
					break;
					case 2: {
						setState(2108);
						qualify_clause();
					}
					break;
				}
				setState(2112);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 246, _ctx)) {
					case 1: {
						setState(2111);
						order_by_clause();
					}
					break;
				}
				setState(2115);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 247, _ctx)) {
					case 1: {
						setState(2114);
						select_options();
					}
					break;
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

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(2118);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 248, _ctx)) {
					case 1: {
						setState(2117);
						select_list_set();
					}
					break;
				}
				setState(2121);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 249, _ctx)) {
					case 1: {
						setState(2120);
						select_list_limit();
					}
					break;
				}
				setState(2123);
				select_list_item();
				setState(2128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 250, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(2124);
								match(T_COMMA);
								setState(2125);
								select_list_item();
							}
						}
					}
					setState(2130);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 250, _ctx);
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

	public final Select_list_setContext select_list_set() throws RecognitionException {
		Select_list_setContext _localctx = new Select_list_setContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_select_list_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2131);
				_la = _input.LA(1);
				if (!(_la == T_ALL || _la == T_DISTINCT)) {
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

	public final Select_list_limitContext select_list_limit() throws RecognitionException {
		Select_list_limitContext _localctx = new Select_list_limitContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_select_list_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2133);
				match(T_TOP);
				setState(2134);
				expr(0);
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

	public final Select_list_itemContext select_list_item() throws RecognitionException {
		Select_list_itemContext _localctx = new Select_list_itemContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_select_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2146);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 253, _ctx)) {
					case 1: {
						setState(2139);
						_errHandler.sync(this);
						switch (getInterpreter().adaptivePredict(_input, 251, _ctx)) {
							case 1: {
								setState(2136);
								ident();
								setState(2137);
								match(T_EQUAL);
							}
							break;
						}
						setState(2141);
						expr(0);
						setState(2143);
						_errHandler.sync(this);
						switch (getInterpreter().adaptivePredict(_input, 252, _ctx)) {
							case 1: {
								setState(2142);
								select_list_alias();
							}
							break;
						}
					}
					break;
					case 2: {
						setState(2145);
						select_list_asterisk();
					}
					break;
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

	public final Select_list_aliasContext select_list_alias() throws RecognitionException {
		Select_list_aliasContext _localctx = new Select_list_aliasContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_select_list_alias);
		try {
			setState(2155);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 254, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(2148);
					if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") &&
							!_input.LT(1).getText().equalsIgnoreCase("FROM")))
						throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") &&\r\n         !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
					setState(2149);
					match(T_AS);
					setState(2150);
					ident();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(2151);
					match(T_OPEN_P);
					setState(2152);
					match(T_TITLE);
					setState(2153);
					match(L_S_STRING);
					setState(2154);
					match(T_CLOSE_P);
				}
				break;
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

	public final Select_list_asteriskContext select_list_asterisk() throws RecognitionException {
		Select_list_asteriskContext _localctx = new Select_list_asteriskContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_select_list_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == L_ID) {
					{
						setState(2157);
						match(L_ID);
						setState(2158);
						match(T__3);
					}
				}

				setState(2161);
				match(T_MUL);
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

	public final Into_clauseContext into_clause() throws RecognitionException {
		Into_clauseContext _localctx = new Into_clauseContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_into_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(2163);
				match(T_INTO);
				setState(2164);
				ident();
				setState(2169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 256, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(2165);
								match(T_COMMA);
								setState(2166);
								ident();
							}
						}
					}
					setState(2171);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 256, _ctx);
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

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(2172);
				match(T_FROM);
				setState(2173);
				from_table_clause();
				setState(2177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 257, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(2174);
								from_join_clause();
							}
						}
					}
					setState(2179);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 257, _ctx);
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

	public final From_table_clauseContext from_table_clause() throws RecognitionException {
		From_table_clauseContext _localctx = new From_table_clauseContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_from_table_clause);
		try {
			setState(2183);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 258, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(2180);
					from_table_name_clause();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(2181);
					from_subselect_clause();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(2182);
					from_table_values_clause();
				}
				break;
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

	public final From_table_name_clauseContext from_table_name_clause() throws RecognitionException {
		From_table_name_clauseContext _localctx = new From_table_name_clauseContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2185);
				table_name();
				setState(2187);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 259, _ctx)) {
					case 1: {
						setState(2186);
						from_alias_clause();
					}
					break;
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

	public final From_subselect_clauseContext from_subselect_clause() throws RecognitionException {
		From_subselect_clauseContext _localctx = new From_subselect_clauseContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2189);
				match(T_OPEN_P);
				setState(2190);
				select_stmt();
				setState(2191);
				match(T_CLOSE_P);
				setState(2193);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 260, _ctx)) {
					case 1: {
						setState(2192);
						from_alias_clause();
					}
					break;
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

	public final From_join_clauseContext from_join_clause() throws RecognitionException {
		From_join_clauseContext _localctx = new From_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_from_join_clause);
		try {
			setState(2202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_COMMA:
					enterOuterAlt(_localctx, 1);
				{
					setState(2195);
					match(T_COMMA);
					setState(2196);
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
					setState(2197);
					from_join_type_clause();
					setState(2198);
					from_table_clause();
					setState(2199);
					match(T_ON);
					setState(2200);
					bool_expr(0);
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final From_join_type_clauseContext from_join_type_clause() throws RecognitionException {
		From_join_type_clauseContext _localctx = new From_join_type_clauseContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_from_join_type_clause);
		int _la;
		try {
			setState(2213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_INNER:
				case T_JOIN:
					enterOuterAlt(_localctx, 1);
				{
					setState(2205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_INNER) {
						{
							setState(2204);
							match(T_INNER);
						}
					}

					setState(2207);
					match(T_JOIN);
				}
				break;
				case T_FULL:
				case T_LEFT:
				case T_RIGHT:
					enterOuterAlt(_localctx, 2);
				{
					setState(2208);
					_la = _input.LA(1);
					if (!(_la == T_FULL || _la == T_LEFT || _la == T_RIGHT)) {
						_errHandler.recoverInline(this);
					} else {
						if (_input.LA(1) == Token.EOF) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2210);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_OUTER) {
						{
							setState(2209);
							match(T_OUTER);
						}
					}

					setState(2212);
					match(T_JOIN);
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final From_table_values_clauseContext from_table_values_clause() throws RecognitionException {
		From_table_values_clauseContext _localctx = new From_table_values_clauseContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2215);
				match(T_TABLE);
				setState(2216);
				match(T_OPEN_P);
				setState(2217);
				match(T_VALUES);
				setState(2218);
				from_table_values_row();
				setState(2223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T_COMMA) {
					{
						{
							setState(2219);
							match(T_COMMA);
							setState(2220);
							from_table_values_row();
						}
					}
					setState(2225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2226);
				match(T_CLOSE_P);
				setState(2228);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 266, _ctx)) {
					case 1: {
						setState(2227);
						from_alias_clause();
					}
					break;
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

	public final From_table_values_rowContext from_table_values_row() throws RecognitionException {
		From_table_values_rowContext _localctx = new From_table_values_rowContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_from_table_values_row);
		int _la;
		try {
			setState(2242);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 268, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(2230);
					expr(0);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(2231);
					match(T_OPEN_P);
					setState(2232);
					expr(0);
					setState(2237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == T_COMMA) {
						{
							{
								setState(2233);
								match(T_COMMA);
								setState(2234);
								expr(0);
							}
						}
						setState(2239);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2240);
					match(T_CLOSE_P);
				}
				break;
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

	public final From_alias_clauseContext from_alias_clause() throws RecognitionException {
		From_alias_clauseContext _localctx = new From_alias_clauseContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2244);
				match(T_AS);
				setState(2245);
				ident();
				setState(2256);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 270, _ctx)) {
					case 1: {
						setState(2246);
						match(T_OPEN_P);
						setState(2247);
						match(L_ID);
						setState(2252);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == T_COMMA) {
							{
								{
									setState(2248);
									match(T_COMMA);
									setState(2249);
									match(L_ID);
								}
							}
							setState(2254);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2255);
						match(T_CLOSE_P);
					}
					break;
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

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2258);
				ident();
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

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2260);
				match(T_WHERE);
				setState(2261);
				bool_expr(0);
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

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(2263);
				match(T_GROUP);
				setState(2264);
				match(T_BY);
				setState(2265);
				expr(0);
				setState(2270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 271, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(2266);
								match(T_COMMA);
								setState(2267);
								expr(0);
							}
						}
					}
					setState(2272);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 271, _ctx);
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

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2273);
				match(T_HAVING);
				setState(2274);
				bool_expr(0);
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

	public final Qualify_clauseContext qualify_clause() throws RecognitionException {
		Qualify_clauseContext _localctx = new Qualify_clauseContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2276);
				match(T_QUALIFY);
				setState(2277);
				bool_expr(0);
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

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(2279);
				match(T_ORDER);
				setState(2280);
				match(T_BY);
				setState(2281);
				expr(0);
				setState(2283);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 272, _ctx)) {
					case 1: {
						setState(2282);
						_la = _input.LA(1);
						if (!(_la == T_ASC || _la == T_DESC)) {
							_errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
					}
					break;
				}
				setState(2292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 274, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(2285);
								match(T_COMMA);
								setState(2286);
								expr(0);
								setState(2288);
								_errHandler.sync(this);
								switch (getInterpreter().adaptivePredict(_input, 273, _ctx)) {
									case 1: {
										setState(2287);
										_la = _input.LA(1);
										if (!(_la == T_ASC || _la == T_DESC)) {
											_errHandler.recoverInline(this);
										} else {
											if (_input.LA(1) == Token.EOF) matchedEOF = true;
											_errHandler.reportMatch(this);
											consume();
										}
									}
									break;
								}
							}
						}
					}
					setState(2294);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 274, _ctx);
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

	public final Select_optionsContext select_options() throws RecognitionException {
		Select_optionsContext _localctx = new Select_optionsContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_select_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(2296);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							{
								setState(2295);
								select_options_item();
							}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(2298);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 275, _ctx);
				} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
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

	public final Select_options_itemContext select_options_item() throws RecognitionException {
		Select_options_itemContext _localctx = new Select_options_itemContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_select_options_item);
		int _la;
		try {
			setState(2311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_LIMIT:
					enterOuterAlt(_localctx, 1);
				{
					setState(2300);
					match(T_LIMIT);
					setState(2301);
					expr(0);
				}
				break;
				case T_WITH:
					enterOuterAlt(_localctx, 2);
				{
					setState(2302);
					match(T_WITH);
					setState(2303);
					_la = _input.LA(1);
					if (!(_la == T_CS || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (T_RR - 206)) | (1L << (T_RS - 206)) | (1L << (T_UR - 206)))) != 0))) {
						_errHandler.recoverInline(this);
					} else {
						if (_input.LA(1) == Token.EOF) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2309);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 276, _ctx)) {
						case 1: {
							setState(2304);
							match(T_USE);
							setState(2305);
							match(T_AND);
							setState(2306);
							match(T_KEEP);
							setState(2307);
							_la = _input.LA(1);
							if (!(_la == T_EXCLUSIVE || _la == T_SHARE || _la == T_UPDATE)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(2308);
							match(T_LOCKS);
						}
						break;
					}
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 332;
		enterRecursionRule(_localctx, 332, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(2322);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 279, _ctx)) {
					case 1: {
						setState(2315);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == T_NOT) {
							{
								setState(2314);
								match(T_NOT);
							}
						}

						setState(2317);
						match(T_OPEN_P);
						setState(2318);
						bool_expr(0);
						setState(2319);
						match(T_CLOSE_P);
					}
					break;
					case 2: {
						setState(2321);
						bool_expr_atom();
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(2330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 280, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new Bool_exprContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
								setState(2324);
								if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
								setState(2325);
								bool_expr_logical_operator();
								setState(2326);
								bool_expr(3);
							}
						}
					}
					setState(2332);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 280, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public final Bool_expr_atomContext bool_expr_atom() throws RecognitionException {
		Bool_expr_atomContext _localctx = new Bool_expr_atomContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_bool_expr_atom);
		try {
			setState(2336);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 281, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(2333);
					bool_expr_unary();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(2334);
					bool_expr_binary();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(2335);
					expr(0);
				}
				break;
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

	public final Bool_expr_unaryContext bool_expr_unary() throws RecognitionException {
		Bool_expr_unaryContext _localctx = new Bool_expr_unaryContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_bool_expr_unary);
		try {
			setState(2343);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 282, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(2338);
					bool_expr_is_not_null();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(2339);
					bool_expr_between();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(2340);
					bool_expr_exists();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(2341);
					bool_expr_single_in();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(2342);
					bool_expr_multi_in();
				}
				break;
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

	public final Bool_expr_is_not_nullContext bool_expr_is_not_null() throws RecognitionException {
		Bool_expr_is_not_nullContext _localctx = new Bool_expr_is_not_nullContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_bool_expr_is_not_null);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2345);
				expr(0);
				setState(2346);
				match(T_IS);
				setState(2348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_NOT) {
					{
						setState(2347);
						match(T_NOT);
					}
				}

				setState(2350);
				match(T_NULL);
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

	public final Bool_expr_betweenContext bool_expr_between() throws RecognitionException {
		Bool_expr_betweenContext _localctx = new Bool_expr_betweenContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_bool_expr_between);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2352);
				expr(0);
				setState(2353);
				match(T_BETWEEN);
				setState(2354);
				expr(0);
				setState(2355);
				match(T_AND);
				setState(2356);
				expr(0);
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

	public final Bool_expr_existsContext bool_expr_exists() throws RecognitionException {
		Bool_expr_existsContext _localctx = new Bool_expr_existsContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_bool_expr_exists);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_NOT) {
					{
						setState(2358);
						match(T_NOT);
					}
				}

				setState(2361);
				match(T_EXISTS);
				setState(2362);
				match(T_OPEN_P);
				setState(2363);
				select_stmt();
				setState(2364);
				match(T_CLOSE_P);
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

	public final Bool_expr_single_inContext bool_expr_single_in() throws RecognitionException {
		Bool_expr_single_inContext _localctx = new Bool_expr_single_inContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2366);
				expr(0);
				setState(2368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_NOT) {
					{
						setState(2367);
						match(T_NOT);
					}
				}

				setState(2370);
				match(T_IN);
				setState(2371);
				parenthesis_open();
				setState(2381);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 287, _ctx)) {
					case 1: {
						{
							setState(2372);
							expr(0);
							setState(2377);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la == T_COMMA) {
								{
									{
										setState(2373);
										match(T_COMMA);
										setState(2374);
										expr(0);
									}
								}
								setState(2379);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
						}
					}
					break;
					case 2: {
						setState(2380);
						select_stmt();
					}
					break;
				}
				setState(2383);
				parenthesis_close();
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

	public final Bool_expr_multi_inContext bool_expr_multi_in() throws RecognitionException {
		Bool_expr_multi_inContext _localctx = new Bool_expr_multi_inContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2385);
				match(T_OPEN_P);
				setState(2386);
				expr(0);
				setState(2391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T_COMMA) {
					{
						{
							setState(2387);
							match(T_COMMA);
							setState(2388);
							expr(0);
						}
					}
					setState(2393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2394);
				match(T_CLOSE_P);
				setState(2396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_NOT) {
					{
						setState(2395);
						match(T_NOT);
					}
				}

				setState(2398);
				match(T_IN);
				setState(2399);
				match(T_OPEN_P);
				setState(2400);
				select_stmt();
				setState(2401);
				match(T_CLOSE_P);
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

	public final Bool_expr_binaryContext bool_expr_binary() throws RecognitionException {
		Bool_expr_binaryContext _localctx = new Bool_expr_binaryContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2403);
				expr(0);
				setState(2404);
				bool_expr_binary_operator();
				setState(2405);
				expr(0);
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

	public final Bool_expr_logical_operatorContext bool_expr_logical_operator() throws RecognitionException {
		Bool_expr_logical_operatorContext _localctx = new Bool_expr_logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_bool_expr_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2407);
				_la = _input.LA(1);
				if (!(_la == T_AND || _la == T_OR)) {
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

	public final Bool_expr_binary_operatorContext bool_expr_binary_operator() throws RecognitionException {
		Bool_expr_binary_operatorContext _localctx = new Bool_expr_binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(2421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_EQUAL:
					enterOuterAlt(_localctx, 1);
				{
					setState(2409);
					match(T_EQUAL);
				}
				break;
				case T_EQUAL2:
					enterOuterAlt(_localctx, 2);
				{
					setState(2410);
					match(T_EQUAL2);
				}
				break;
				case T_NOTEQUAL:
					enterOuterAlt(_localctx, 3);
				{
					setState(2411);
					match(T_NOTEQUAL);
				}
				break;
				case T_NOTEQUAL2:
					enterOuterAlt(_localctx, 4);
				{
					setState(2412);
					match(T_NOTEQUAL2);
				}
				break;
				case T_LESS:
					enterOuterAlt(_localctx, 5);
				{
					setState(2413);
					match(T_LESS);
				}
				break;
				case T_LESSEQUAL:
					enterOuterAlt(_localctx, 6);
				{
					setState(2414);
					match(T_LESSEQUAL);
				}
				break;
				case T_GREATER:
					enterOuterAlt(_localctx, 7);
				{
					setState(2415);
					match(T_GREATER);
				}
				break;
				case T_GREATEREQUAL:
					enterOuterAlt(_localctx, 8);
				{
					setState(2416);
					match(T_GREATEREQUAL);
				}
				break;
				case T_LIKE:
				case T_NOT:
				case T_REGEXP:
				case T_RLIKE:
					enterOuterAlt(_localctx, 9);
				{
					setState(2418);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_NOT) {
						{
							setState(2417);
							match(T_NOT);
						}
					}

					setState(2420);
					_la = _input.LA(1);
					if (!(((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (T_LIKE - 140)) | (1L << (T_REGEXP - 140)) | (1L << (T_RLIKE - 140)))) != 0))) {
						_errHandler.recoverInline(this);
					} else {
						if (_input.LA(1) == Token.EOF) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 354;
		enterRecursionRule(_localctx, 354, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(2440);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 292, _ctx)) {
					case 1: {
						setState(2424);
						match(T_OPEN_P);
						setState(2425);
						select_stmt();
						setState(2426);
						match(T_CLOSE_P);
					}
					break;
					case 2: {
						setState(2428);
						match(T_OPEN_P);
						setState(2429);
						expr(0);
						setState(2430);
						match(T_CLOSE_P);
					}
					break;
					case 3: {
						setState(2432);
						expr_interval();
					}
					break;
					case 4: {
						setState(2433);
						expr_concat();
					}
					break;
					case 5: {
						setState(2434);
						expr_case();
					}
					break;
					case 6: {
						setState(2435);
						expr_cursor_attribute();
					}
					break;
					case 7: {
						setState(2436);
						expr_agg_window_func();
					}
					break;
					case 8: {
						setState(2437);
						expr_spec_func();
					}
					break;
					case 9: {
						setState(2438);
						expr_func();
					}
					break;
					case 10: {
						setState(2439);
						expr_atom();
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(2458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 294, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(2456);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 293, _ctx)) {
								case 1: {
									_localctx = new ExprContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(2442);
									if (!(precpred(_ctx, 14)))
										throw new FailedPredicateException(this, "precpred(_ctx, 14)");
									setState(2443);
									match(T_MUL);
									setState(2444);
									expr(15);
								}
								break;
								case 2: {
									_localctx = new ExprContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(2445);
									if (!(precpred(_ctx, 13)))
										throw new FailedPredicateException(this, "precpred(_ctx, 13)");
									setState(2446);
									match(T_DIV);
									setState(2447);
									expr(14);
								}
								break;
								case 3: {
									_localctx = new ExprContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(2448);
									if (!(precpred(_ctx, 12)))
										throw new FailedPredicateException(this, "precpred(_ctx, 12)");
									setState(2449);
									match(T_ADD);
									setState(2450);
									expr(13);
								}
								break;
								case 4: {
									_localctx = new ExprContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(2451);
									if (!(precpred(_ctx, 11)))
										throw new FailedPredicateException(this, "precpred(_ctx, 11)");
									setState(2452);
									match(T_SUB);
									setState(2453);
									expr(12);
								}
								break;
								case 5: {
									_localctx = new ExprContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(2454);
									if (!(precpred(_ctx, 15)))
										throw new FailedPredicateException(this, "precpred(_ctx, 15)");
									setState(2455);
									interval_item();
								}
								break;
							}
						}
					}
					setState(2460);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 294, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_expr_atom);
		try {
			setState(2469);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 295, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(2461);
					date_literal();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(2462);
					timestamp_literal();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(2463);
					bool_literal();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(2464);
					ident();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(2465);
					string();
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(2466);
					dec_number();
				}
				break;
				case 7:
					enterOuterAlt(_localctx, 7);
				{
					setState(2467);
					int_number();
				}
				break;
				case 8:
					enterOuterAlt(_localctx, 8);
				{
					setState(2468);
					null_const();
				}
				break;
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

	public final Expr_intervalContext expr_interval() throws RecognitionException {
		Expr_intervalContext _localctx = new Expr_intervalContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2471);
				match(T_INTERVAL);
				setState(2472);
				expr(0);
				setState(2473);
				interval_item();
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

	public final Interval_itemContext interval_item() throws RecognitionException {
		Interval_itemContext _localctx = new Interval_itemContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2475);
				_la = _input.LA(1);
				if (!(_la == T_DAY || _la == T_DAYS || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (T_MICROSECOND - 156)) | (1L << (T_MICROSECONDS - 156)) | (1L << (T_SECOND - 156)) | (1L << (T_SECONDS - 156)))) != 0))) {
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

	public final Expr_concatContext expr_concat() throws RecognitionException {
		Expr_concatContext _localctx = new Expr_concatContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_expr_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(2477);
				expr_concat_item();
				setState(2478);
				_la = _input.LA(1);
				if (!(_la == T_CONCAT || _la == T_PIPE)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2479);
				expr_concat_item();
				setState(2484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 296, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(2480);
								_la = _input.LA(1);
								if (!(_la == T_CONCAT || _la == T_PIPE)) {
									_errHandler.recoverInline(this);
								} else {
									if (_input.LA(1) == Token.EOF) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								setState(2481);
								expr_concat_item();
							}
						}
					}
					setState(2486);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 296, _ctx);
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

	public final Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		Expr_concat_itemContext _localctx = new Expr_concat_itemContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_expr_concat_item);
		try {
			setState(2496);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 297, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(2487);
					match(T_OPEN_P);
					setState(2488);
					expr(0);
					setState(2489);
					match(T_CLOSE_P);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(2491);
					expr_case();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(2492);
					expr_agg_window_func();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(2493);
					expr_spec_func();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(2494);
					expr_func();
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(2495);
					expr_atom();
				}
				break;
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

	public final Expr_caseContext expr_case() throws RecognitionException {
		Expr_caseContext _localctx = new Expr_caseContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_expr_case);
		try {
			setState(2500);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 298, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(2498);
					expr_case_simple();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(2499);
					expr_case_searched();
				}
				break;
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

	public final Expr_case_simpleContext expr_case_simple() throws RecognitionException {
		Expr_case_simpleContext _localctx = new Expr_case_simpleContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2502);
				match(T_CASE);
				setState(2503);
				expr(0);
				setState(2509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(2504);
							match(T_WHEN);
							setState(2505);
							expr(0);
							setState(2506);
							match(T_THEN);
							setState(2507);
							expr(0);
						}
					}
					setState(2511);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == T_WHEN);
				setState(2515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_ELSE) {
					{
						setState(2513);
						match(T_ELSE);
						setState(2514);
						expr(0);
					}
				}

				setState(2517);
				match(T_END);
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

	public final Expr_case_searchedContext expr_case_searched() throws RecognitionException {
		Expr_case_searchedContext _localctx = new Expr_case_searchedContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2519);
				match(T_CASE);
				setState(2525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(2520);
							match(T_WHEN);
							setState(2521);
							bool_expr(0);
							setState(2522);
							match(T_THEN);
							setState(2523);
							expr(0);
						}
					}
					setState(2527);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == T_WHEN);
				setState(2531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_ELSE) {
					{
						setState(2529);
						match(T_ELSE);
						setState(2530);
						expr(0);
					}
				}

				setState(2533);
				match(T_END);
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

	public final Expr_cursor_attributeContext expr_cursor_attribute() throws RecognitionException {
		Expr_cursor_attributeContext _localctx = new Expr_cursor_attributeContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_expr_cursor_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2535);
				ident();
				setState(2536);
				match(T__2);
				setState(2537);
				_la = _input.LA(1);
				if (!(_la == T_FOUND || _la == T_ISOPEN || _la == T_NOTFOUND)) {
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

	public final Expr_agg_window_funcContext expr_agg_window_func() throws RecognitionException {
		Expr_agg_window_funcContext _localctx = new Expr_agg_window_funcContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(2691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T_AVG:
					enterOuterAlt(_localctx, 1);
				{
					setState(2539);
					match(T_AVG);
					setState(2540);
					match(T_OPEN_P);
					setState(2542);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 303, _ctx)) {
						case 1: {
							setState(2541);
							expr_func_all_distinct();
						}
						break;
					}
					setState(2544);
					expr(0);
					setState(2545);
					match(T_CLOSE_P);
					setState(2547);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 304, _ctx)) {
						case 1: {
							setState(2546);
							expr_func_over_clause();
						}
						break;
					}
				}
				break;
				case T_COUNT:
					enterOuterAlt(_localctx, 2);
				{
					setState(2549);
					match(T_COUNT);
					setState(2550);
					match(T_OPEN_P);
					setState(2556);
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
						case T_WRITE:
						case T_ADD:
						case T_OPEN_P:
						case T_SUB:
						case L_ID:
						case L_S_STRING:
						case L_D_STRING:
						case L_INT:
						case L_DEC: {
							{
								setState(2552);
								_errHandler.sync(this);
								switch (getInterpreter().adaptivePredict(_input, 305, _ctx)) {
									case 1: {
										setState(2551);
										expr_func_all_distinct();
									}
									break;
								}
								setState(2554);
								expr(0);
							}
						}
						break;
						case T_MUL: {
							setState(2555);
							match(T_MUL);
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(2558);
					match(T_CLOSE_P);
					setState(2560);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 307, _ctx)) {
						case 1: {
							setState(2559);
							expr_func_over_clause();
						}
						break;
					}
				}
				break;
				case T_COUNT_BIG:
					enterOuterAlt(_localctx, 3);
				{
					setState(2562);
					match(T_COUNT_BIG);
					setState(2563);
					match(T_OPEN_P);
					setState(2569);
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
						case T_WRITE:
						case T_ADD:
						case T_OPEN_P:
						case T_SUB:
						case L_ID:
						case L_S_STRING:
						case L_D_STRING:
						case L_INT:
						case L_DEC: {
							{
								setState(2565);
								_errHandler.sync(this);
								switch (getInterpreter().adaptivePredict(_input, 308, _ctx)) {
									case 1: {
										setState(2564);
										expr_func_all_distinct();
									}
									break;
								}
								setState(2567);
								expr(0);
							}
						}
						break;
						case T_MUL: {
							setState(2568);
							match(T_MUL);
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(2571);
					match(T_CLOSE_P);
					setState(2573);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 310, _ctx)) {
						case 1: {
							setState(2572);
							expr_func_over_clause();
						}
						break;
					}
				}
				break;
				case T_CUME_DIST:
					enterOuterAlt(_localctx, 4);
				{
					setState(2575);
					match(T_CUME_DIST);
					setState(2576);
					match(T_OPEN_P);
					setState(2577);
					match(T_CLOSE_P);
					setState(2578);
					expr_func_over_clause();
				}
				break;
				case T_DENSE_RANK:
					enterOuterAlt(_localctx, 5);
				{
					setState(2579);
					match(T_DENSE_RANK);
					setState(2580);
					match(T_OPEN_P);
					setState(2581);
					match(T_CLOSE_P);
					setState(2582);
					expr_func_over_clause();
				}
				break;
				case T_FIRST_VALUE:
					enterOuterAlt(_localctx, 6);
				{
					setState(2583);
					match(T_FIRST_VALUE);
					setState(2584);
					match(T_OPEN_P);
					setState(2585);
					expr(0);
					setState(2586);
					match(T_CLOSE_P);
					setState(2587);
					expr_func_over_clause();
				}
				break;
				case T_LAG:
					enterOuterAlt(_localctx, 7);
				{
					setState(2589);
					match(T_LAG);
					setState(2590);
					match(T_OPEN_P);
					setState(2591);
					expr(0);
					setState(2598);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_COMMA) {
						{
							setState(2592);
							match(T_COMMA);
							setState(2593);
							expr(0);
							setState(2596);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la == T_COMMA) {
								{
									setState(2594);
									match(T_COMMA);
									setState(2595);
									expr(0);
								}
							}

						}
					}

					setState(2600);
					match(T_CLOSE_P);
					setState(2601);
					expr_func_over_clause();
				}
				break;
				case T_LAST_VALUE:
					enterOuterAlt(_localctx, 8);
				{
					setState(2603);
					match(T_LAST_VALUE);
					setState(2604);
					match(T_OPEN_P);
					setState(2605);
					expr(0);
					setState(2606);
					match(T_CLOSE_P);
					setState(2607);
					expr_func_over_clause();
				}
				break;
				case T_LEAD:
					enterOuterAlt(_localctx, 9);
				{
					setState(2609);
					match(T_LEAD);
					setState(2610);
					match(T_OPEN_P);
					setState(2611);
					expr(0);
					setState(2618);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_COMMA) {
						{
							setState(2612);
							match(T_COMMA);
							setState(2613);
							expr(0);
							setState(2616);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la == T_COMMA) {
								{
									setState(2614);
									match(T_COMMA);
									setState(2615);
									expr(0);
								}
							}

						}
					}

					setState(2620);
					match(T_CLOSE_P);
					setState(2621);
					expr_func_over_clause();
				}
				break;
				case T_MAX:
					enterOuterAlt(_localctx, 10);
				{
					setState(2623);
					match(T_MAX);
					setState(2624);
					match(T_OPEN_P);
					setState(2626);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 315, _ctx)) {
						case 1: {
							setState(2625);
							expr_func_all_distinct();
						}
						break;
					}
					setState(2628);
					expr(0);
					setState(2629);
					match(T_CLOSE_P);
					setState(2631);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 316, _ctx)) {
						case 1: {
							setState(2630);
							expr_func_over_clause();
						}
						break;
					}
				}
				break;
				case T_MIN:
					enterOuterAlt(_localctx, 11);
				{
					setState(2633);
					match(T_MIN);
					setState(2634);
					match(T_OPEN_P);
					setState(2636);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 317, _ctx)) {
						case 1: {
							setState(2635);
							expr_func_all_distinct();
						}
						break;
					}
					setState(2638);
					expr(0);
					setState(2639);
					match(T_CLOSE_P);
					setState(2641);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 318, _ctx)) {
						case 1: {
							setState(2640);
							expr_func_over_clause();
						}
						break;
					}
				}
				break;
				case T_RANK:
					enterOuterAlt(_localctx, 12);
				{
					setState(2643);
					match(T_RANK);
					setState(2644);
					match(T_OPEN_P);
					setState(2645);
					match(T_CLOSE_P);
					setState(2646);
					expr_func_over_clause();
				}
				break;
				case T_ROW_NUMBER:
					enterOuterAlt(_localctx, 13);
				{
					setState(2647);
					match(T_ROW_NUMBER);
					setState(2648);
					match(T_OPEN_P);
					setState(2649);
					match(T_CLOSE_P);
					setState(2650);
					expr_func_over_clause();
				}
				break;
				case T_STDEV:
					enterOuterAlt(_localctx, 14);
				{
					setState(2651);
					match(T_STDEV);
					setState(2652);
					match(T_OPEN_P);
					setState(2654);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 319, _ctx)) {
						case 1: {
							setState(2653);
							expr_func_all_distinct();
						}
						break;
					}
					setState(2656);
					expr(0);
					setState(2657);
					match(T_CLOSE_P);
					setState(2659);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 320, _ctx)) {
						case 1: {
							setState(2658);
							expr_func_over_clause();
						}
						break;
					}
				}
				break;
				case T_SUM:
					enterOuterAlt(_localctx, 15);
				{
					setState(2661);
					match(T_SUM);
					setState(2662);
					match(T_OPEN_P);
					setState(2664);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 321, _ctx)) {
						case 1: {
							setState(2663);
							expr_func_all_distinct();
						}
						break;
					}
					setState(2666);
					expr(0);
					setState(2667);
					match(T_CLOSE_P);
					setState(2669);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 322, _ctx)) {
						case 1: {
							setState(2668);
							expr_func_over_clause();
						}
						break;
					}
				}
				break;
				case T_VAR:
					enterOuterAlt(_localctx, 16);
				{
					setState(2671);
					match(T_VAR);
					setState(2672);
					match(T_OPEN_P);
					setState(2674);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 323, _ctx)) {
						case 1: {
							setState(2673);
							expr_func_all_distinct();
						}
						break;
					}
					setState(2676);
					expr(0);
					setState(2677);
					match(T_CLOSE_P);
					setState(2679);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 324, _ctx)) {
						case 1: {
							setState(2678);
							expr_func_over_clause();
						}
						break;
					}
				}
				break;
				case T_VARIANCE:
					enterOuterAlt(_localctx, 17);
				{
					setState(2681);
					match(T_VARIANCE);
					setState(2682);
					match(T_OPEN_P);
					setState(2684);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 325, _ctx)) {
						case 1: {
							setState(2683);
							expr_func_all_distinct();
						}
						break;
					}
					setState(2686);
					expr(0);
					setState(2687);
					match(T_CLOSE_P);
					setState(2689);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 326, _ctx)) {
						case 1: {
							setState(2688);
							expr_func_over_clause();
						}
						break;
					}
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Expr_func_all_distinctContext expr_func_all_distinct() throws RecognitionException {
		Expr_func_all_distinctContext _localctx = new Expr_func_all_distinctContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2693);
				_la = _input.LA(1);
				if (!(_la == T_ALL || _la == T_DISTINCT)) {
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

	public final Expr_func_over_clauseContext expr_func_over_clause() throws RecognitionException {
		Expr_func_over_clauseContext _localctx = new Expr_func_over_clauseContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2695);
				match(T_OVER);
				setState(2696);
				match(T_OPEN_P);
				setState(2698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_PARTITION) {
					{
						setState(2697);
						expr_func_partition_by_clause();
					}
				}

				setState(2701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_ORDER) {
					{
						setState(2700);
						order_by_clause();
					}
				}

				setState(2703);
				match(T_CLOSE_P);
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

	public final Expr_func_partition_by_clauseContext expr_func_partition_by_clause() throws RecognitionException {
		Expr_func_partition_by_clauseContext _localctx = new Expr_func_partition_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2705);
				match(T_PARTITION);
				setState(2706);
				match(T_BY);
				setState(2707);
				expr(0);
				setState(2712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T_COMMA) {
					{
						{
							setState(2708);
							match(T_COMMA);
							setState(2709);
							expr(0);
						}
					}
					setState(2714);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public final Expr_spec_funcContext expr_spec_func() throws RecognitionException {
		Expr_spec_funcContext _localctx = new Expr_spec_funcContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(2915);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 351, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(2715);
					match(T_ACTIVITY_COUNT);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(2716);
					match(T_CAST);
					setState(2717);
					match(T_OPEN_P);
					setState(2718);
					expr(0);
					setState(2719);
					match(T_AS);
					setState(2720);
					dtype();
					setState(2722);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_OPEN_P) {
						{
							setState(2721);
							dtype_len();
						}
					}

					setState(2724);
					match(T_CLOSE_P);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(2726);
					match(T_COUNT);
					setState(2727);
					match(T_OPEN_P);
					setState(2730);
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
						case T_WRITE:
						case T_ADD:
						case T_OPEN_P:
						case T_SUB:
						case L_ID:
						case L_S_STRING:
						case L_D_STRING:
						case L_INT:
						case L_DEC: {
							setState(2728);
							expr(0);
						}
						break;
						case T_MUL: {
							setState(2729);
							match(T_MUL);
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(2732);
					match(T_CLOSE_P);
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(2733);
					match(T_CURRENT_DATE);
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(2734);
					match(T_CURRENT);
					setState(2735);
					match(T_DATE);
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(2739);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
						case T_CURRENT_TIMESTAMP: {
							setState(2736);
							match(T_CURRENT_TIMESTAMP);
						}
						break;
						case T_CURRENT: {
							setState(2737);
							match(T_CURRENT);
							setState(2738);
							match(T_TIMESTAMP);
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(2745);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 334, _ctx)) {
						case 1: {
							setState(2741);
							match(T_OPEN_P);
							setState(2742);
							expr(0);
							setState(2743);
							match(T_CLOSE_P);
						}
						break;
					}
				}
				break;
				case 7:
					enterOuterAlt(_localctx, 7);
				{
					setState(2747);
					match(T_CURRENT_USER);
				}
				break;
				case 8:
					enterOuterAlt(_localctx, 8);
				{
					setState(2748);
					match(T_CURRENT);
					setState(2749);
					match(T_USER);
				}
				break;
				case 9:
					enterOuterAlt(_localctx, 9);
				{
					setState(2750);
					match(T_MAX_PART_STRING);
					setState(2751);
					match(T_OPEN_P);
					setState(2752);
					expr(0);
					setState(2765);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_COMMA) {
						{
							setState(2753);
							match(T_COMMA);
							setState(2754);
							expr(0);
							setState(2762);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la == T_COMMA) {
								{
									{
										setState(2755);
										match(T_COMMA);
										setState(2756);
										expr(0);
										setState(2757);
										match(T_EQUAL);
										setState(2758);
										expr(0);
									}
								}
								setState(2764);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
						}
					}

					setState(2767);
					match(T_CLOSE_P);
				}
				break;
				case 10:
					enterOuterAlt(_localctx, 10);
				{
					setState(2769);
					match(T_MIN_PART_STRING);
					setState(2770);
					match(T_OPEN_P);
					setState(2771);
					expr(0);
					setState(2784);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_COMMA) {
						{
							setState(2772);
							match(T_COMMA);
							setState(2773);
							expr(0);
							setState(2781);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la == T_COMMA) {
								{
									{
										setState(2774);
										match(T_COMMA);
										setState(2775);
										expr(0);
										setState(2776);
										match(T_EQUAL);
										setState(2777);
										expr(0);
									}
								}
								setState(2783);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
						}
					}

					setState(2786);
					match(T_CLOSE_P);
				}
				break;
				case 11:
					enterOuterAlt(_localctx, 11);
				{
					setState(2788);
					match(T_MAX_PART_INT);
					setState(2789);
					match(T_OPEN_P);
					setState(2790);
					expr(0);
					setState(2803);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_COMMA) {
						{
							setState(2791);
							match(T_COMMA);
							setState(2792);
							expr(0);
							setState(2800);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la == T_COMMA) {
								{
									{
										setState(2793);
										match(T_COMMA);
										setState(2794);
										expr(0);
										setState(2795);
										match(T_EQUAL);
										setState(2796);
										expr(0);
									}
								}
								setState(2802);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
						}
					}

					setState(2805);
					match(T_CLOSE_P);
				}
				break;
				case 12:
					enterOuterAlt(_localctx, 12);
				{
					setState(2807);
					match(T_MIN_PART_INT);
					setState(2808);
					match(T_OPEN_P);
					setState(2809);
					expr(0);
					setState(2822);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_COMMA) {
						{
							setState(2810);
							match(T_COMMA);
							setState(2811);
							expr(0);
							setState(2819);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la == T_COMMA) {
								{
									{
										setState(2812);
										match(T_COMMA);
										setState(2813);
										expr(0);
										setState(2814);
										match(T_EQUAL);
										setState(2815);
										expr(0);
									}
								}
								setState(2821);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
						}
					}

					setState(2824);
					match(T_CLOSE_P);
				}
				break;
				case 13:
					enterOuterAlt(_localctx, 13);
				{
					setState(2826);
					match(T_MAX_PART_DATE);
					setState(2827);
					match(T_OPEN_P);
					setState(2828);
					expr(0);
					setState(2841);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_COMMA) {
						{
							setState(2829);
							match(T_COMMA);
							setState(2830);
							expr(0);
							setState(2838);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la == T_COMMA) {
								{
									{
										setState(2831);
										match(T_COMMA);
										setState(2832);
										expr(0);
										setState(2833);
										match(T_EQUAL);
										setState(2834);
										expr(0);
									}
								}
								setState(2840);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
						}
					}

					setState(2843);
					match(T_CLOSE_P);
				}
				break;
				case 14:
					enterOuterAlt(_localctx, 14);
				{
					setState(2845);
					match(T_MIN_PART_DATE);
					setState(2846);
					match(T_OPEN_P);
					setState(2847);
					expr(0);
					setState(2860);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_COMMA) {
						{
							setState(2848);
							match(T_COMMA);
							setState(2849);
							expr(0);
							setState(2857);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la == T_COMMA) {
								{
									{
										setState(2850);
										match(T_COMMA);
										setState(2851);
										expr(0);
										setState(2852);
										match(T_EQUAL);
										setState(2853);
										expr(0);
									}
								}
								setState(2859);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
						}
					}

					setState(2862);
					match(T_CLOSE_P);
				}
				break;
				case 15:
					enterOuterAlt(_localctx, 15);
				{
					setState(2864);
					match(T_PART_COUNT);
					setState(2865);
					match(T_OPEN_P);
					setState(2866);
					expr(0);
					setState(2874);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == T_COMMA) {
						{
							{
								setState(2867);
								match(T_COMMA);
								setState(2868);
								expr(0);
								setState(2869);
								match(T_EQUAL);
								setState(2870);
								expr(0);
							}
						}
						setState(2876);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2877);
					match(T_CLOSE_P);
				}
				break;
				case 16:
					enterOuterAlt(_localctx, 16);
				{
					setState(2879);
					match(T_PART_LOC);
					setState(2880);
					match(T_OPEN_P);
					setState(2881);
					expr(0);
					setState(2887);
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
							case 1: {
								{
									setState(2882);
									match(T_COMMA);
									setState(2883);
									expr(0);
									setState(2884);
									match(T_EQUAL);
									setState(2885);
									expr(0);
								}
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(2889);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 348, _ctx);
					} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
					setState(2893);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_COMMA) {
						{
							setState(2891);
							match(T_COMMA);
							setState(2892);
							expr(0);
						}
					}

					setState(2895);
					match(T_CLOSE_P);
				}
				break;
				case 17:
					enterOuterAlt(_localctx, 17);
				{
					setState(2897);
					match(T_TRIM);
					setState(2898);
					match(T_OPEN_P);
					setState(2899);
					expr(0);
					setState(2900);
					match(T_CLOSE_P);
				}
				break;
				case 18:
					enterOuterAlt(_localctx, 18);
				{
					setState(2902);
					match(T_SUBSTRING);
					setState(2903);
					match(T_OPEN_P);
					setState(2904);
					expr(0);
					setState(2905);
					match(T_FROM);
					setState(2906);
					expr(0);
					setState(2909);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == T_FOR) {
						{
							setState(2907);
							match(T_FOR);
							setState(2908);
							expr(0);
						}
					}

					setState(2911);
					match(T_CLOSE_P);
				}
				break;
				case 19:
					enterOuterAlt(_localctx, 19);
				{
					setState(2913);
					match(T_SYSDATE);
				}
				break;
				case 20:
					enterOuterAlt(_localctx, 20);
				{
					setState(2914);
					match(T_USER);
				}
				break;
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

	public final Expr_funcContext expr_func() throws RecognitionException {
		Expr_funcContext _localctx = new Expr_funcContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2917);
				ident();
				setState(2918);
				match(T_OPEN_P);
				setState(2920);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 352, _ctx)) {
					case 1: {
						setState(2919);
						expr_func_params();
					}
					break;
				}
				setState(2922);
				match(T_CLOSE_P);
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

	public final Expr_func_paramsContext expr_func_params() throws RecognitionException {
		Expr_func_paramsContext _localctx = new Expr_func_paramsContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_expr_func_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(2924);
				func_param();
				setState(2929);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 353, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(2925);
								match(T_COMMA);
								setState(2926);
								func_param();
							}
						}
					}
					setState(2931);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 353, _ctx);
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

	public final Func_paramContext func_param() throws RecognitionException {
		Func_paramContext _localctx = new Func_paramContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_func_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2932);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO")))
					throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
				setState(2938);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 355, _ctx)) {
					case 1: {
						setState(2933);
						ident();
						setState(2934);
						match(T_EQUAL);
						setState(2936);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == T_GREATER) {
							{
								setState(2935);
								match(T_GREATER);
							}
						}

					}
					break;
				}
				setState(2940);
				expr(0);
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

	public final Write_stmtContext write_stmt() throws RecognitionException {
		Write_stmtContext _localctx = new Write_stmtContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_write_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2942);
				match(T_WRITE);
				setState(2943);
				match(T_OPEN_P);
				setState(2944);
				write_stmt_string();
				setState(2945);
				match(T_CLOSE_P);
				setState(2947);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 356, _ctx)) {
					case 1: {
						setState(2946);
						match(T_SEMICOLON);
					}
					break;
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

	public final Write_stmt_stringContext write_stmt_string() throws RecognitionException {
		Write_stmt_stringContext _localctx = new Write_stmt_stringContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_write_stmt_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2951);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case L_S_STRING:
					case L_D_STRING: {
						setState(2949);
						string();
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
					case T_WRITE:
					case L_ID: {
						setState(2950);
						ident();
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(2960);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T_ADD) {
					{
						{
							setState(2953);
							match(T_ADD);
							setState(2956);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
								case L_S_STRING:
								case L_D_STRING: {
									setState(2954);
									string();
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
								case T_WRITE:
								case L_ID: {
									setState(2955);
									ident();
								}
								break;
								default:
									throw new NoViableAltException(this);
							}
						}
					}
					setState(2962);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2963);
				match(T_DATE);
				setState(2964);
				string();
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

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2966);
				match(T_TIMESTAMP);
				setState(2967);
				string();
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

	public final Parenthesis_openContext parenthesis_open() throws RecognitionException {
		Parenthesis_openContext _localctx = new Parenthesis_openContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_parenthesis_open);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2969);
				match(T_OPEN_P);
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

	public final Parenthesis_closeContext parenthesis_close() throws RecognitionException {
		Parenthesis_closeContext _localctx = new Parenthesis_closeContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_parenthesis_close);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2971);
				match(T_CLOSE_P);
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

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_ident);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(2975);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case L_ID: {
						setState(2973);
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
					case T_WRITE: {
						setState(2974);
						non_reserved_words();
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(2984);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 362, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(2977);
								match(T__3);
								setState(2980);
								_errHandler.sync(this);
								switch (_input.LA(1)) {
									case L_ID: {
										setState(2978);
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
									case T_WRITE: {
										setState(2979);
										non_reserved_words();
									}
									break;
									default:
										throw new NoViableAltException(this);
								}
							}
						}
					}
					setState(2986);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 362, _ctx);
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

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_string);
		try {
			setState(2989);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case L_D_STRING:
					_localctx = new Double_quotedStringContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(2987);
					match(L_D_STRING);
				}
				break;
				case L_S_STRING:
					_localctx = new Single_quotedStringContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(2988);
					match(L_S_STRING);
				}
				break;
				default:
					throw new NoViableAltException(this);
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

	public final Int_numberContext int_number() throws RecognitionException {
		Int_numberContext _localctx = new Int_numberContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_ADD || _la == T_SUB) {
					{
						setState(2991);
						_la = _input.LA(1);
						if (!(_la == T_ADD || _la == T_SUB)) {
							_errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
					}
				}

				setState(2994);
				match(L_INT);
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

	public final Dec_numberContext dec_number() throws RecognitionException {
		Dec_numberContext _localctx = new Dec_numberContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T_ADD || _la == T_SUB) {
					{
						setState(2996);
						_la = _input.LA(1);
						if (!(_la == T_ADD || _la == T_SUB)) {
							_errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
					}
				}

				setState(2999);
				match(L_DEC);
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

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(3001);
				_la = _input.LA(1);
				if (!(_la == T_FALSE || _la == T_TRUE)) {
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

	public final Null_constContext null_const() throws RecognitionException {
		Null_constContext _localctx = new Null_constContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(3003);
				match(T_NULL);
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
		enterRule(_localctx, 414, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(3005);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_AND) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_DATABASE) | (1L << T_DATA) | (1L << T_DATE) | (1L << T_DATETIME) | (1L << T_DAY) | (1L << T_DAYS) | (1L << T_DEC) | (1L << T_DECIMAL) | (1L << T_DECLARE) | (1L << T_DEFAULT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_END - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IMMEDIATE - 64)) | (1L << (T_IN - 64)) | (1L << (T_INDEX - 64)) | (1L << (T_INITRANS - 64)) | (1L << (T_INNER - 64)) | (1L << (T_INOUT - 64)) | (1L << (T_INT - 64)) | (1L << (T_INT2 - 64)) | (1L << (T_INT4 - 64)) | (1L << (T_INT8 - 64)) | (1L << (T_INTEGER - 64)) | (1L << (T_INTERSECT - 64)) | (1L << (T_INTERVAL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)) | (1L << (T_OR - 128)) | (1L << (T_ORDER - 128)) | (1L << (T_OUT - 128)) | (1L << (T_OUTER - 128)) | (1L << (T_OVER - 128)) | (1L << (T_OWNER - 128)) | (1L << (T_PACKAGE - 128)) | (1L << (T_PARTITION - 128)) | (1L << (T_PCTFREE - 128)) | (1L << (T_PCTUSED - 128)) | (1L << (T_PRECISION - 128)) | (1L << (T_PRESERVE - 128)) | (1L << (T_PRIMARY - 128)) | (1L << (T_PROC - 128)) | (1L << (T_PROCEDURE - 128)) | (1L << (T_QUALIFY - 128)) | (1L << (T_QUIT - 128)) | (1L << (T_REAL - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)) | (1L << (T_SQL - 192)) | (1L << (T_SQLEXCEPTION - 192)) | (1L << (T_SQLWARNING - 192)) | (1L << (T_STEP - 192)) | (1L << (T_STORAGE - 192)) | (1L << (T_STORED - 192)) | (1L << (T_STRING - 192)) | (1L << (T_SUBSTRING - 192)) | (1L << (T_SUM - 192)) | (1L << (T_SYS_REFCURSOR - 192)) | (1L << (T_TABLE - 192)) | (1L << (T_TABLESPACE - 192)) | (1L << (T_TEMPORARY - 192)) | (1L << (T_TERMINATED - 192)) | (1L << (T_TEXTIMAGE_ON - 192)) | (1L << (T_THEN - 192)) | (1L << (T_TIMESTAMP - 192)) | (1L << (T_TITLE - 192)) | (1L << (T_TO - 192)) | (1L << (T_TOP - 192)) | (1L << (T_TRUE - 192)) | (1L << (T_UNIQUE - 192)) | (1L << (T_UPDATE - 192)) | (1L << (T_UR - 192)) | (1L << (T_USE - 192)) | (1L << (T_USING - 192)) | (1L << (T_VALUE - 192)) | (1L << (T_VALUES - 192)) | (1L << (T_VAR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)) | (1L << (T_PART_COUNT - 256)) | (1L << (T_PART_LOC - 256)) | (1L << (T_RANK - 256)) | (1L << (T_ROW_NUMBER - 256)) | (1L << (T_STDEV - 256)) | (1L << (T_SYSDATE - 256)) | (1L << (T_VARIANCE - 256)) | (1L << (T_USER - 256)) | (1L << (T_WRITE - 256)))) != 0))) {
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
			case 24:
				return expr_stmt_sempred((Expr_stmtContext) _localctx, predIndex);
			case 90:
				return create_routine_params_sempred((Create_routine_paramsContext) _localctx, predIndex);
			case 146:
				return select_list_alias_sempred((Select_list_aliasContext) _localctx, predIndex);
			case 166:
				return bool_expr_sempred((Bool_exprContext) _localctx, predIndex);
			case 177:
				return expr_sempred((ExprContext) _localctx, predIndex);
			case 194:
				return func_param_sempred((Func_paramContext) _localctx, predIndex);
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

	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
			case 4:
				return precpred(_ctx, 2);
		}
		return true;
	}

	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
			case 5:
				return precpred(_ctx, 14);
			case 6:
				return precpred(_ctx, 13);
			case 7:
				return precpred(_ctx, 12);
			case 8:
				return precpred(_ctx, 11);
			case 9:
				return precpred(_ctx, 15);
		}
		return true;
	}

	private boolean func_param_sempred(Func_paramContext _localctx, int predIndex) {
		switch (predIndex) {
			case 10:
				return !_input.LT(1).getText().equalsIgnoreCase("INTO");
		}
		return true;
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public TerminalNode EOF() {
			return getToken(HplsqlParser.EOF, 0);
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
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Begin_end_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Single_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Block_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_END() {
			return getToken(HplsqlParser.T_END, 0);
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
		public Proc_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

		public TypeofContext typeof() {
			return getRuleContext(TypeofContext.class, 0);
		}

		public Cpp_stmtContext cpp_stmt() {
			return getRuleContext(Cpp_stmtContext.class, 0);
		}

		public Execute_query_stmtContext execute_query_stmt() {
			return getRuleContext(Execute_query_stmtContext.class, 0);
		}

		public Error_stmtContext error_stmt() {
			return getRuleContext(Error_stmtContext.class, 0);
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

	public static class TypeofContext extends ParserRuleContext {
		public TypeofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_TYPEOF() {
			return getToken(HplsqlParser.T_TYPEOF, 0);
		}

		public TerminalNode T_OPEN_P() {
			return getToken(HplsqlParser.T_OPEN_P, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return getToken(HplsqlParser.T_CLOSE_P, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeof;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterTypeof(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitTypeof(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitTypeof(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Error_stmtContext extends ParserRuleContext {
		public Error_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Invalid_selectContext invalid_select() {
			return getRuleContext(Invalid_selectContext.class, 0);
		}

		public Invalid_bool_exprContext invalid_bool_expr() {
			return getRuleContext(Invalid_bool_exprContext.class, 0);
		}

		public Invalid_cpp_function_stmtContext invalid_cpp_function_stmt() {
			return getRuleContext(Invalid_cpp_function_stmtContext.class, 0);
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

	public static class Invalid_selectContext extends ParserRuleContext {
		public Invalid_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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

		public Invalid_from_clauseContext invalid_from_clause() {
			return getRuleContext(Invalid_from_clauseContext.class, 0);
		}

		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class, 0);
		}

		public Invalid_where_clauseContext invalid_where_clause() {
			return getRuleContext(Invalid_where_clauseContext.class, 0);
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

		@Override
		public int getRuleIndex() {
			return RULE_invalid_select;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterInvalid_select(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitInvalid_select(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitInvalid_select(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Invalid_where_clauseContext extends ParserRuleContext {
		public Invalid_where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class, 0);
		}

		public TerminalNode T_WHERE() {
			return getToken(HplsqlParser.T_WHERE, 0);
		}

		public Invalid_bool_exprContext invalid_bool_expr() {
			return getRuleContext(Invalid_bool_exprContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_invalid_where_clause;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterInvalid_where_clause(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitInvalid_where_clause(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitInvalid_where_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Invalid_from_clauseContext extends ParserRuleContext {
		public Invalid_from_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

		@Override
		public int getRuleIndex() {
			return RULE_invalid_from_clause;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterInvalid_from_clause(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitInvalid_from_clause(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitInvalid_from_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Invalid_bool_exprContext extends ParserRuleContext {
		public Invalid_bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class, 0);
		}

		public List<TerminalNode> T_CLOSE_P() {
			return getTokens(HplsqlParser.T_CLOSE_P);
		}

		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}

		public TerminalNode T_NOT() {
			return getToken(HplsqlParser.T_NOT, 0);
		}

		public TerminalNode T_OPEN_P() {
			return getToken(HplsqlParser.T_OPEN_P, 0);
		}

		public Invalid_bool_expr_atomContext invalid_bool_expr_atom() {
			return getRuleContext(Invalid_bool_expr_atomContext.class, 0);
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

	public static class Invalid_bool_expr_atomContext extends ParserRuleContext {
		public Invalid_bool_expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Invalid_bool_expr_binaryContext invalid_bool_expr_binary() {
			return getRuleContext(Invalid_bool_expr_binaryContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_invalid_bool_expr_atom;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterInvalid_bool_expr_atom(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitInvalid_bool_expr_atom(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitInvalid_bool_expr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Invalid_bool_expr_binaryContext extends ParserRuleContext {
		public Invalid_bool_expr_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public Invalid_bool_expr_binary_operatorContext invalid_bool_expr_binary_operator() {
			return getRuleContext(Invalid_bool_expr_binary_operatorContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_invalid_bool_expr_binary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterInvalid_bool_expr_binary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitInvalid_bool_expr_binary(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitInvalid_bool_expr_binary(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Invalid_bool_expr_binary_operatorContext extends ParserRuleContext {
		public Invalid_bool_expr_binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public IdentContext ident() {
			return getRuleContext(IdentContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_invalid_bool_expr_binary_operator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener)
				((HplsqlListener) listener).enterInvalid_bool_expr_binary_operator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener)
				((HplsqlListener) listener).exitInvalid_bool_expr_binary_operator(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitInvalid_bool_expr_binary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Invalid_cpp_function_stmtContext extends ParserRuleContext {
		public Invalid_cpp_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Invalid_cpp_function_headerContext invalid_cpp_function_header() {
			return getRuleContext(Invalid_cpp_function_headerContext.class, 0);
		}

		public Cpp_function_bodyContext cpp_function_body() {
			return getRuleContext(Cpp_function_bodyContext.class, 0);
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
		public Invalid_cpp_function_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

		public Cpp_function_params_clauseContext cpp_function_params_clause() {
			return getRuleContext(Cpp_function_params_clauseContext.class, 0);
		}

		public Invalid_cpp_function_params_clauseContext invalid_cpp_function_params_clause() {
			return getRuleContext(Invalid_cpp_function_params_clauseContext.class, 0);
		}

		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class, 0);
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
		public Invalid_cpp_function_params_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Invalid_cpp_function_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public IdentContext ident() {
			return getRuleContext(IdentContext.class, 0);
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

	public static class Exception_blockContext extends ParserRuleContext {
		public Exception_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_EXCEPTION() {
			return getToken(HplsqlParser.T_EXCEPTION, 0);
		}

		public List<Exception_block_itemContext> exception_block_item() {
			return getRuleContexts(Exception_block_itemContext.class);
		}

		public Exception_block_itemContext exception_block_item(int i) {
			return getRuleContext(Exception_block_itemContext.class, i);
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
		public Exception_block_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Semicolon_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_SEMICOLON() {
			return getToken(HplsqlParser.T_SEMICOLON, 0);
		}

		public TerminalNode T_DIV() {
			return getToken(HplsqlParser.T_DIV, 0);
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
		public Null_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_NULL() {
			return getToken(HplsqlParser.T_NULL, 0);
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
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
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
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Assignment_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Assignment_stmt_single_itemContext assignment_stmt_single_item() {
			return getRuleContext(Assignment_stmt_single_itemContext.class, 0);
		}

		public Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() {
			return getRuleContext(Assignment_stmt_multiple_itemContext.class, 0);
		}

		public Assignment_stmt_select_itemContext assignment_stmt_select_item() {
			return getRuleContext(Assignment_stmt_select_itemContext.class, 0);
		}

		public Assignment_query_stmtContext assignment_query_stmt() {
			return getRuleContext(Assignment_query_stmtContext.class, 0);
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
		public Assignment_stmt_single_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Assignment_stmt_multiple_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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
		public Assignment_stmt_select_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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

	public static class Assignment_query_stmtContext extends ParserRuleContext {
		public Assignment_query_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assignment_query_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterAssignment_query_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitAssignment_query_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitAssignment_query_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Associate_locator_stmtContext extends ParserRuleContext {
		public Associate_locator_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_BREAK() {
			return getToken(HplsqlParser.T_BREAK, 0);
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
		public Call_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Close_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_CLOSE() {
			return getToken(HplsqlParser.T_CLOSE, 0);
		}

		public TerminalNode L_ID() {
			return getToken(HplsqlParser.L_ID, 0);
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
		public Declare_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Declare_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Declare_block_inplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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
		public Declare_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Declare_var_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Declare_condition_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public IdentContext ident() {
			return getRuleContext(IdentContext.class, 0);
		}

		public TerminalNode T_CONDITION() {
			return getToken(HplsqlParser.T_CONDITION, 0);
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
		public Declare_handler_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_type_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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

		public Create_type_optionsContext create_type_options() {
			return getRuleContext(Create_type_optionsContext.class, 0);
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
		public Create_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_OPEN_P() {
			return getToken(HplsqlParser.T_OPEN_P, 0);
		}

		public Create_type_itemsContext create_type_items() {
			return getRuleContext(Create_type_itemsContext.class, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return getToken(HplsqlParser.T_CLOSE_P, 0);
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
		public Create_type_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_type_items_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

		public StringContext string() {
			return getRuleContext(StringContext.class, 0);
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

	public static class Create_type_optionsContext extends ParserRuleContext {
		public Create_type_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<Create_type_optionContext> create_type_option() {
			return getRuleContexts(Create_type_optionContext.class);
		}

		public Create_type_optionContext create_type_option(int i) {
			return getRuleContext(Create_type_optionContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_create_type_options;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_type_options(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_type_options(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitCreate_type_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Create_type_optionContext extends ParserRuleContext {
		public Create_type_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Create_type_store_locationContext create_type_store_location() {
			return getRuleContext(Create_type_store_locationContext.class, 0);
		}

		public Create_type_delimiterContext create_type_delimiter() {
			return getRuleContext(Create_type_delimiterContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_create_type_option;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_type_option(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_type_option(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitCreate_type_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Create_type_store_locationContext extends ParserRuleContext {
		public Create_type_store_locationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_LOCATION() {
			return getToken(HplsqlParser.T_LOCATION, 0);
		}

		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}

		public StringContext string(int i) {
			return getRuleContext(StringContext.class, i);
		}

		public List<TerminalNode> T_COMMA() {
			return getTokens(HplsqlParser.T_COMMA);
		}

		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_create_type_store_location;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_type_store_location(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_type_store_location(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitCreate_type_store_location(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Create_type_delimiterContext extends ParserRuleContext {
		public Create_type_delimiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_DELIMITED() {
			return getToken(HplsqlParser.T_DELIMITED, 0);
		}

		public TerminalNode T_BY() {
			return getToken(HplsqlParser.T_BY, 0);
		}

		public StringContext string() {
			return getRuleContext(StringContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_create_type_delimiter;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_type_delimiter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_type_delimiter(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitCreate_type_delimiter(this);
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
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_local_temp_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_table_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

		public Create_table_columnsContext create_table_columns() {
			return getRuleContext(Create_table_columnsContext.class, 0);
		}

		public Create_table_optionsContext create_table_options() {
			return getRuleContext(Create_table_optionsContext.class, 0);
		}

		public TerminalNode T_AS() {
			return getToken(HplsqlParser.T_AS, 0);
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
		public Create_table_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_table_columns_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public IdentContext ident() {
			return getRuleContext(IdentContext.class, 0);
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
		public Create_table_column_inline_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_table_column_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_table_fk_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_table_preoptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<Create_table_preoptions_itemContext> create_table_preoptions_item() {
			return getRuleContexts(Create_table_preoptions_itemContext.class);
		}

		public Create_table_preoptions_itemContext create_table_preoptions_item(int i) {
			return getRuleContext(Create_table_preoptions_itemContext.class, i);
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
		public Create_table_preoptions_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_COMMA() {
			return getToken(HplsqlParser.T_COMMA, 0);
		}

		public Create_table_preoptions_td_itemContext create_table_preoptions_td_item() {
			return getRuleContext(Create_table_preoptions_td_itemContext.class, 0);
		}

		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class, 0);
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
		public Create_table_preoptions_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_LOG() {
			return getToken(HplsqlParser.T_LOG, 0);
		}

		public TerminalNode T_FALLBACK() {
			return getToken(HplsqlParser.T_FALLBACK, 0);
		}

		public TerminalNode T_NO() {
			return getToken(HplsqlParser.T_NO, 0);
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
		public Create_table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<Create_table_options_itemContext> create_table_options_item() {
			return getRuleContexts(Create_table_options_itemContext.class);
		}

		public Create_table_options_itemContext create_table_options_item(int i) {
			return getRuleContext(Create_table_options_itemContext.class, i);
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
		public Create_table_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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

		public Create_table_store_locationContext create_table_store_location() {
			return getRuleContext(Create_table_store_locationContext.class, 0);
		}

		public Create_table_delimiterContext create_table_delimiter() {
			return getRuleContext(Create_table_delimiterContext.class, 0);
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
		public Create_table_options_ora_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_table_options_db2_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_table_options_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_table_options_hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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

	public static class Create_table_store_locationContext extends ParserRuleContext {
		public Create_table_store_locationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_LOCATION() {
			return getToken(HplsqlParser.T_LOCATION, 0);
		}

		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}

		public StringContext string(int i) {
			return getRuleContext(StringContext.class, i);
		}

		public List<TerminalNode> T_COMMA() {
			return getTokens(HplsqlParser.T_COMMA);
		}

		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_create_table_store_location;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_table_store_location(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_table_store_location(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_store_location(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Create_table_delimiterContext extends ParserRuleContext {
		public Create_table_delimiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_DELIMITED() {
			return getToken(HplsqlParser.T_DELIMITED, 0);
		}

		public TerminalNode T_BY() {
			return getToken(HplsqlParser.T_BY, 0);
		}

		public StringContext string() {
			return getRuleContext(StringContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_create_table_delimiter;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCreate_table_delimiter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCreate_table_delimiter(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitCreate_table_delimiter(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Create_table_hive_row_formatContext extends ParserRuleContext {
		public Create_table_hive_row_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_table_hive_row_format_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_table_options_mssql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_ON() {
			return getToken(HplsqlParser.T_ON, 0);
		}

		public IdentContext ident() {
			return getRuleContext(IdentContext.class, 0);
		}

		public TerminalNode T_TEXTIMAGE_ON() {
			return getToken(HplsqlParser.T_TEXTIMAGE_ON, 0);
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
		public Create_table_options_mysql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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

		public TerminalNode T_QUERY() {
			return getToken(HplsqlParser.T_QUERY, 0);
		}

		public TerminalNode T_QUERY_RESULT() {
			return getToken(HplsqlParser.T_QUERY_RESULT, 0);
		}

		public IdentContext ident() {
			return getRuleContext(IdentContext.class, 0);
		}

		public TerminalNode T_TYPE() {
			return getToken(HplsqlParser.T_TYPE, 0);
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
		public Dtype_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Dtype_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Dtype_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

		public TerminalNode T_DEFAULT() {
			return getToken(HplsqlParser.T_DEFAULT, 0);
		}

		public TerminalNode T_WITH() {
			return getToken(HplsqlParser.T_WITH, 0);
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
		public Create_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_database_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_COMMENT() {
			return getToken(HplsqlParser.T_COMMENT, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode T_LOCATION() {
			return getToken(HplsqlParser.T_LOCATION, 0);
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
		public Create_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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
		public Create_function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_package_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Package_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Package_spec_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_package_body_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Package_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Package_body_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class, 0);
		}

		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class, 0);
		}

		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class, 0);
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
		public Create_procedure_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_routine_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_routine_param_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_routine_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<Create_routine_optionContext> create_routine_option() {
			return getRuleContexts(Create_routine_optionContext.class);
		}

		public Create_routine_optionContext create_routine_option(int i) {
			return getRuleContext(Create_routine_optionContext.class, i);
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
		public Create_routine_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Exec_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public If_plsql_stmtContext if_plsql_stmt() {
			return getRuleContext(If_plsql_stmtContext.class, 0);
		}

		public If_tsql_stmtContext if_tsql_stmt() {
			return getRuleContext(If_tsql_stmtContext.class, 0);
		}

		public If_bteq_stmtContext if_bteq_stmt() {
			return getRuleContext(If_bteq_stmtContext.class, 0);
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
		public If_plsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public If_tsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public If_bteq_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Elseif_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

		public TerminalNode T_ELSIF() {
			return getToken(HplsqlParser.T_ELSIF, 0);
		}

		public TerminalNode T_ELSEIF() {
			return getToken(HplsqlParser.T_ELSEIF, 0);
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
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_ELSE() {
			return getToken(HplsqlParser.T_ELSE, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
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
		public Exit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Leave_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_LEAVE() {
			return getToken(HplsqlParser.T_LEAVE, 0);
		}

		public TerminalNode L_ID() {
			return getToken(HplsqlParser.L_ID, 0);
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
		public Cmp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Cmp_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Create_index_colContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public IdentContext ident() {
			return getRuleContext(IdentContext.class, 0);
		}

		public TerminalNode T_ASC() {
			return getToken(HplsqlParser.T_ASC, 0);
		}

		public TerminalNode T_DESC() {
			return getToken(HplsqlParser.T_DESC, 0);
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
		public Index_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Index_mssql_storage_clauseContext index_mssql_storage_clause() {
			return getRuleContext(Index_mssql_storage_clauseContext.class, 0);
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
		public Index_mssql_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Quit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_QUIT() {
			return getToken(HplsqlParser.T_QUIT, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
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
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_RETURN() {
			return getToken(HplsqlParser.T_RETURN, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
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

	public static class Cpp_stmtContext extends ParserRuleContext {
		public Cpp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Cpp_function_stmtContext cpp_function_stmt() {
			return getRuleContext(Cpp_function_stmtContext.class, 0);
		}

		public Cpp_for_stmtContext cpp_for_stmt() {
			return getRuleContext(Cpp_for_stmtContext.class, 0);
		}

		public Cpp_if_stmtContext cpp_if_stmt() {
			return getRuleContext(Cpp_if_stmtContext.class, 0);
		}

		public Cpp_return_stmtContext cpp_return_stmt() {
			return getRuleContext(Cpp_return_stmtContext.class, 0);
		}

		public Cpp_declare_stmtContext cpp_declare_stmt() {
			return getRuleContext(Cpp_declare_stmtContext.class, 0);
		}

		public Cpp_assignment_stmtContext cpp_assignment_stmt() {
			return getRuleContext(Cpp_assignment_stmtContext.class, 0);
		}

		public Cpp_declare_assignment_stmtContext cpp_declare_assignment_stmt() {
			return getRuleContext(Cpp_declare_assignment_stmtContext.class, 0);
		}

		public Write_stmtContext write_stmt() {
			return getRuleContext(Write_stmtContext.class, 0);
		}

		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class, 0);
		}

		public Create_type_stmtContext create_type_stmt() {
			return getRuleContext(Create_type_stmtContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_cpp_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitCpp_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Cpp_function_stmtContext extends ParserRuleContext {
		public Cpp_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Cpp_function_headerContext cpp_function_header() {
			return getRuleContext(Cpp_function_headerContext.class, 0);
		}

		public Cpp_function_bodyContext cpp_function_body() {
			return getRuleContext(Cpp_function_bodyContext.class, 0);
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
		public Cpp_function_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class, 0);
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

		public Cpp_function_params_clauseContext cpp_function_params_clause() {
			return getRuleContext(Cpp_function_params_clauseContext.class, 0);
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
		public Cpp_function_params_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Cpp_function_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class, 0);
		}

		public IdentContext ident() {
			return getRuleContext(IdentContext.class, 0);
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
		public Cpp_function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Cpp_scopeContext cpp_scope() {
			return getRuleContext(Cpp_scopeContext.class, 0);
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
		public Cpp_if_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Cpp_elseif_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

		public TerminalNode T_ELSIF() {
			return getToken(HplsqlParser.T_ELSIF, 0);
		}

		public TerminalNode T_ELSEIF() {
			return getToken(HplsqlParser.T_ELSEIF, 0);
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
		public Cpp_else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_ELSE() {
			return getToken(HplsqlParser.T_ELSE, 0);
		}

		public Cpp_for_stmt_bodyContext cpp_for_stmt_body() {
			return getRuleContext(Cpp_for_stmt_bodyContext.class, 0);
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
		public Cpp_for_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Cpp_for_stmt_headerContext cpp_for_stmt_header() {
			return getRuleContext(Cpp_for_stmt_headerContext.class, 0);
		}

		public Cpp_for_stmt_bodyContext cpp_for_stmt_body() {
			return getRuleContext(Cpp_for_stmt_bodyContext.class, 0);
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
		public Cpp_for_stmt_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Cpp_for_params_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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

	public static class Cpp_for_paramContext extends ParserRuleContext {
		public Cpp_for_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Cpp_for_stmt_var_incr_caluseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<Cpp_for_stmt_var_incrContext> cpp_for_stmt_var_incr() {
			return getRuleContexts(Cpp_for_stmt_var_incrContext.class);
		}

		public Cpp_for_stmt_var_incrContext cpp_for_stmt_var_incr(int i) {
			return getRuleContext(Cpp_for_stmt_var_incrContext.class, i);
		}

		public List<TerminalNode> T_COMMA() {
			return getTokens(HplsqlParser.T_COMMA);
		}

		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
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

	public static class Cpp_for_stmt_var_incrContext extends ParserRuleContext {
		public Cpp_for_stmt_var_incrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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

		public TerminalNode T_EQUAL() {
			return getToken(HplsqlParser.T_EQUAL, 0);
		}

		public List<TerminalNode> T_SUB() {
			return getTokens(HplsqlParser.T_SUB);
		}

		public TerminalNode T_SUB(int i) {
			return getToken(HplsqlParser.T_SUB, i);
		}

		public List<TerminalNode> T_MUL() {
			return getTokens(HplsqlParser.T_MUL);
		}

		public TerminalNode T_MUL(int i) {
			return getToken(HplsqlParser.T_MUL, i);
		}

		public List<TerminalNode> T_DIV() {
			return getTokens(HplsqlParser.T_DIV);
		}

		public TerminalNode T_DIV(int i) {
			return getToken(HplsqlParser.T_DIV, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_cpp_for_stmt_var_incr;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_for_stmt_var_incr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_for_stmt_var_incr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitCpp_for_stmt_var_incr(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Cpp_for_stmt_bodyContext extends ParserRuleContext {
		public Cpp_for_stmt_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Cpp_scopeContext cpp_scope() {
			return getRuleContext(Cpp_scopeContext.class, 0);
		}

		public Cpp_stmtContext cpp_stmt() {
			return getRuleContext(Cpp_stmtContext.class, 0);
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

	public static class Cpp_declare_assignment_stmtContext extends ParserRuleContext {
		public Cpp_declare_assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public IdentContext ident() {
			return getRuleContext(IdentContext.class, 0);
		}

		public TerminalNode T_EQUAL() {
			return getToken(HplsqlParser.T_EQUAL, 0);
		}

		public StmtContext stmt() {
			return getRuleContext(StmtContext.class, 0);
		}

		public TerminalNode T_SEMICOLON() {
			return getToken(HplsqlParser.T_SEMICOLON, 0);
		}

		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class, 0);
		}

		public TerminalNode T_VAR() {
			return getToken(HplsqlParser.T_VAR, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_cpp_declare_assignment_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_declare_assignment_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_declare_assignment_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitCpp_declare_assignment_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Cpp_declare_stmtContext extends ParserRuleContext {
		public Cpp_declare_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public IdentContext ident() {
			return getRuleContext(IdentContext.class, 0);
		}

		public TerminalNode T_SEMICOLON() {
			return getToken(HplsqlParser.T_SEMICOLON, 0);
		}

		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class, 0);
		}

		public TerminalNode T_VAR() {
			return getToken(HplsqlParser.T_VAR, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_cpp_declare_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_declare_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_declare_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitCpp_declare_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Cpp_assignment_stmtContext extends ParserRuleContext {
		public Cpp_assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public IdentContext ident() {
			return getRuleContext(IdentContext.class, 0);
		}

		public TerminalNode T_EQUAL() {
			return getToken(HplsqlParser.T_EQUAL, 0);
		}

		public StmtContext stmt() {
			return getRuleContext(StmtContext.class, 0);
		}

		public TerminalNode T_SEMICOLON() {
			return getToken(HplsqlParser.T_SEMICOLON, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_cpp_assignment_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_assignment_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_assignment_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitCpp_assignment_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Cpp_return_stmtContext extends ParserRuleContext {
		public Cpp_return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_RETURN() {
			return getToken(HplsqlParser.T_RETURN, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode T_SEMICOLON() {
			return getToken(HplsqlParser.T_SEMICOLON, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_cpp_return_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_return_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_return_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitCpp_return_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Cpp_scopeContext extends ParserRuleContext {
		public Cpp_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_OPEN_B() {
			return getToken(HplsqlParser.T_OPEN_B, 0);
		}

		public TerminalNode T_CLOSE_B() {
			return getToken(HplsqlParser.T_CLOSE_B, 0);
		}

		public List<Cpp_stmtContext> cpp_stmt() {
			return getRuleContexts(Cpp_stmtContext.class);
		}

		public Cpp_stmtContext cpp_stmt(int i) {
			return getRuleContext(Cpp_stmtContext.class, i);
		}

		public List<Cpp_scopeContext> cpp_scope() {
			return getRuleContexts(Cpp_scopeContext.class);
		}

		public Cpp_scopeContext cpp_scope(int i) {
			return getRuleContext(Cpp_scopeContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_cpp_scope;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterCpp_scope(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitCpp_scope(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitCpp_scope(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Execute_query_stmtContext extends ParserRuleContext {
		public Execute_query_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_EXECUTE_QUERY() {
			return getToken(HplsqlParser.T_EXECUTE_QUERY, 0);
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

		public TerminalNode T_EQUAL() {
			return getToken(HplsqlParser.T_EQUAL, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_execute_query_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterExecute_query_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitExecute_query_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitExecute_query_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class While_stmtContext extends ParserRuleContext {
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public For_range_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Using_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class, 0);
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
		public Fullselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Fullselect_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Fullselect_set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Subselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Select_list_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_ALL() {
			return getToken(HplsqlParser.T_ALL, 0);
		}

		public TerminalNode T_DISTINCT() {
			return getToken(HplsqlParser.T_DISTINCT, 0);
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

	public static class Select_list_limitContext extends ParserRuleContext {
		public Select_list_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_TOP() {
			return getToken(HplsqlParser.T_TOP, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
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
		public Select_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Select_list_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_AS() {
			return getToken(HplsqlParser.T_AS, 0);
		}

		public IdentContext ident() {
			return getRuleContext(IdentContext.class, 0);
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
		public Select_list_asteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_MUL() {
			return getToken(HplsqlParser.T_MUL, 0);
		}

		public TerminalNode L_ID() {
			return getToken(HplsqlParser.L_ID, 0);
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
		public Into_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public From_table_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public From_table_name_clauseContext from_table_name_clause() {
			return getRuleContext(From_table_name_clauseContext.class, 0);
		}

		public From_subselect_clauseContext from_subselect_clause() {
			return getRuleContext(From_subselect_clauseContext.class, 0);
		}

		public From_table_values_clauseContext from_table_values_clause() {
			return getRuleContext(From_table_values_clauseContext.class, 0);
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
		public From_table_name_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class, 0);
		}

		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class, 0);
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
		public From_subselect_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class, 0);
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
		public From_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public From_join_type_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public From_table_values_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public From_table_values_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public From_alias_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_AS() {
			return getToken(HplsqlParser.T_AS, 0);
		}

		public IdentContext ident() {
			return getRuleContext(IdentContext.class, 0);
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
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public IdentContext ident() {
			return getRuleContext(IdentContext.class, 0);
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
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_WHERE() {
			return getToken(HplsqlParser.T_WHERE, 0);
		}

		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class, 0);
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
		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_HAVING() {
			return getToken(HplsqlParser.T_HAVING, 0);
		}

		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class, 0);
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
		public Qualify_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_QUALIFY() {
			return getToken(HplsqlParser.T_QUALIFY, 0);
		}

		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class, 0);
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
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Select_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<Select_options_itemContext> select_options_item() {
			return getRuleContexts(Select_options_itemContext.class);
		}

		public Select_options_itemContext select_options_item(int i) {
			return getRuleContext(Select_options_itemContext.class, i);
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
		public Select_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Bool_expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Bool_expr_unaryContext bool_expr_unary() {
			return getRuleContext(Bool_expr_unaryContext.class, 0);
		}

		public Bool_expr_binaryContext bool_expr_binary() {
			return getRuleContext(Bool_expr_binaryContext.class, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
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
		public Bool_expr_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Bool_expr_is_not_nullContext bool_expr_is_not_null() {
			return getRuleContext(Bool_expr_is_not_nullContext.class, 0);
		}

		public Bool_expr_betweenContext bool_expr_between() {
			return getRuleContext(Bool_expr_betweenContext.class, 0);
		}

		public Bool_expr_existsContext bool_expr_exists() {
			return getRuleContext(Bool_expr_existsContext.class, 0);
		}

		public Bool_expr_single_inContext bool_expr_single_in() {
			return getRuleContext(Bool_expr_single_inContext.class, 0);
		}

		public Bool_expr_multi_inContext bool_expr_multi_in() {
			return getRuleContext(Bool_expr_multi_inContext.class, 0);
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

	public static class Bool_expr_is_not_nullContext extends ParserRuleContext {
		public Bool_expr_is_not_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
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

		@Override
		public int getRuleIndex() {
			return RULE_bool_expr_is_not_null;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterBool_expr_is_not_null(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitBool_expr_is_not_null(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitBool_expr_is_not_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Bool_expr_betweenContext extends ParserRuleContext {
		public Bool_expr_betweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode T_BETWEEN() {
			return getToken(HplsqlParser.T_BETWEEN, 0);
		}

		public TerminalNode T_AND() {
			return getToken(HplsqlParser.T_AND, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_bool_expr_between;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterBool_expr_between(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitBool_expr_between(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitBool_expr_between(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Bool_expr_existsContext extends ParserRuleContext {
		public Bool_expr_existsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

		public TerminalNode T_NOT() {
			return getToken(HplsqlParser.T_NOT, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_bool_expr_exists;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterBool_expr_exists(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitBool_expr_exists(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitBool_expr_exists(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Bool_expr_single_inContext extends ParserRuleContext {
		public Bool_expr_single_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode T_IN() {
			return getToken(HplsqlParser.T_IN, 0);
		}

		public Parenthesis_openContext parenthesis_open() {
			return getRuleContext(Parenthesis_openContext.class, 0);
		}

		public Parenthesis_closeContext parenthesis_close() {
			return getRuleContext(Parenthesis_closeContext.class, 0);
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
		public Bool_expr_multi_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Bool_expr_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public Bool_expr_binary_operatorContext bool_expr_binary_operator() {
			return getRuleContext(Bool_expr_binary_operatorContext.class, 0);
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
		public Bool_expr_logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_AND() {
			return getToken(HplsqlParser.T_AND, 0);
		}

		public TerminalNode T_OR() {
			return getToken(HplsqlParser.T_OR, 0);
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
		public Bool_expr_binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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
		public Expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Expr_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_INTERVAL() {
			return getToken(HplsqlParser.T_INTERVAL, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class, 0);
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
		public Interval_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Expr_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Expr_concat_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Expr_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Expr_case_simpleContext expr_case_simple() {
			return getRuleContext(Expr_case_simpleContext.class, 0);
		}

		public Expr_case_searchedContext expr_case_searched() {
			return getRuleContext(Expr_case_searchedContext.class, 0);
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
		public Expr_case_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Expr_case_searchedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Expr_cursor_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Expr_agg_window_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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

	public static class Expr_func_all_distinctContext extends ParserRuleContext {
		public Expr_func_all_distinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_ALL() {
			return getToken(HplsqlParser.T_ALL, 0);
		}

		public TerminalNode T_DISTINCT() {
			return getToken(HplsqlParser.T_DISTINCT, 0);
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
		public Expr_func_over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Expr_func_partition_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Expr_spec_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Expr_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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
		public Expr_func_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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
		public Func_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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

	public static class Write_stmtContext extends ParserRuleContext {
		public Write_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_WRITE() {
			return getToken(HplsqlParser.T_WRITE, 0);
		}

		public TerminalNode T_OPEN_P() {
			return getToken(HplsqlParser.T_OPEN_P, 0);
		}

		public Write_stmt_stringContext write_stmt_string() {
			return getRuleContext(Write_stmt_stringContext.class, 0);
		}

		public TerminalNode T_CLOSE_P() {
			return getToken(HplsqlParser.T_CLOSE_P, 0);
		}

		public TerminalNode T_SEMICOLON() {
			return getToken(HplsqlParser.T_SEMICOLON, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_write_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterWrite_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitWrite_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor) return ((HplsqlVisitor<? extends T>) visitor).visitWrite_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Write_stmt_stringContext extends ParserRuleContext {
		public Write_stmt_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}

		public StringContext string(int i) {
			return getRuleContext(StringContext.class, i);
		}

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

		@Override
		public int getRuleIndex() {
			return RULE_write_stmt_string;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterWrite_stmt_string(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitWrite_stmt_string(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitWrite_stmt_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Date_literalContext extends ParserRuleContext {
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_DATE() {
			return getToken(HplsqlParser.T_DATE, 0);
		}

		public StringContext string() {
			return getRuleContext(StringContext.class, 0);
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
		public Timestamp_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_TIMESTAMP() {
			return getToken(HplsqlParser.T_TIMESTAMP, 0);
		}

		public StringContext string() {
			return getRuleContext(StringContext.class, 0);
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

	public static class Parenthesis_openContext extends ParserRuleContext {
		public Parenthesis_openContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_OPEN_P() {
			return getToken(HplsqlParser.T_OPEN_P, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_parenthesis_open;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterParenthesis_open(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitParenthesis_open(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitParenthesis_open(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Parenthesis_closeContext extends ParserRuleContext {
		public Parenthesis_closeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_CLOSE_P() {
			return getToken(HplsqlParser.T_CLOSE_P, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_parenthesis_close;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterParenthesis_close(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitParenthesis_close(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitParenthesis_close(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class IdentContext extends ParserRuleContext {
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public StringContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_string;
		}

		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class Double_quotedStringContext extends StringContext {
		public Double_quotedStringContext(StringContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode L_D_STRING() {
			return getToken(HplsqlParser.L_D_STRING, 0);
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
		public Single_quotedStringContext(StringContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode L_S_STRING() {
			return getToken(HplsqlParser.L_S_STRING, 0);
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
		public Int_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode L_INT() {
			return getToken(HplsqlParser.L_INT, 0);
		}

		public TerminalNode T_SUB() {
			return getToken(HplsqlParser.T_SUB, 0);
		}

		public TerminalNode T_ADD() {
			return getToken(HplsqlParser.T_ADD, 0);
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
		public Dec_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode L_DEC() {
			return getToken(HplsqlParser.L_DEC, 0);
		}

		public TerminalNode T_SUB() {
			return getToken(HplsqlParser.T_SUB, 0);
		}

		public TerminalNode T_ADD() {
			return getToken(HplsqlParser.T_ADD, 0);
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
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_TRUE() {
			return getToken(HplsqlParser.T_TRUE, 0);
		}

		public TerminalNode T_FALSE() {
			return getToken(HplsqlParser.T_FALSE, 0);
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
		public Null_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_NULL() {
			return getToken(HplsqlParser.T_NULL, 0);
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

	public static class Non_reserved_wordsContext extends ParserRuleContext {
		public Non_reserved_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode T_ACTION() {
			return getToken(HplsqlParser.T_ACTION, 0);
		}

		public TerminalNode T_ACTIVITY_COUNT() {
			return getToken(HplsqlParser.T_ACTIVITY_COUNT, 0);
		}

		public TerminalNode T_AND() {
			return getToken(HplsqlParser.T_AND, 0);
		}

		public TerminalNode T_AS() {
			return getToken(HplsqlParser.T_AS, 0);
		}

		public TerminalNode T_ASC() {
			return getToken(HplsqlParser.T_ASC, 0);
		}

		public TerminalNode T_ASSOCIATE() {
			return getToken(HplsqlParser.T_ASSOCIATE, 0);
		}

		public TerminalNode T_AT() {
			return getToken(HplsqlParser.T_AT, 0);
		}

		public TerminalNode T_AUTO_INCREMENT() {
			return getToken(HplsqlParser.T_AUTO_INCREMENT, 0);
		}

		public TerminalNode T_AVG() {
			return getToken(HplsqlParser.T_AVG, 0);
		}

		public TerminalNode T_BEGIN() {
			return getToken(HplsqlParser.T_BEGIN, 0);
		}

		public TerminalNode T_BETWEEN() {
			return getToken(HplsqlParser.T_BETWEEN, 0);
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

		public TerminalNode T_BIT() {
			return getToken(HplsqlParser.T_BIT, 0);
		}

		public TerminalNode T_BODY() {
			return getToken(HplsqlParser.T_BODY, 0);
		}

		public TerminalNode T_BREAK() {
			return getToken(HplsqlParser.T_BREAK, 0);
		}

		public TerminalNode T_BY() {
			return getToken(HplsqlParser.T_BY, 0);
		}

		public TerminalNode T_BYTE() {
			return getToken(HplsqlParser.T_BYTE, 0);
		}

		public TerminalNode T_CALL() {
			return getToken(HplsqlParser.T_CALL, 0);
		}

		public TerminalNode T_CASCADE() {
			return getToken(HplsqlParser.T_CASCADE, 0);
		}

		public TerminalNode T_CASE() {
			return getToken(HplsqlParser.T_CASE, 0);
		}

		public TerminalNode T_CASESPECIFIC() {
			return getToken(HplsqlParser.T_CASESPECIFIC, 0);
		}

		public TerminalNode T_CAST() {
			return getToken(HplsqlParser.T_CAST, 0);
		}

		public TerminalNode T_CHAR() {
			return getToken(HplsqlParser.T_CHAR, 0);
		}

		public TerminalNode T_CHARACTER() {
			return getToken(HplsqlParser.T_CHARACTER, 0);
		}

		public TerminalNode T_CHARSET() {
			return getToken(HplsqlParser.T_CHARSET, 0);
		}

		public TerminalNode T_CLOSE() {
			return getToken(HplsqlParser.T_CLOSE, 0);
		}

		public TerminalNode T_CLUSTERED() {
			return getToken(HplsqlParser.T_CLUSTERED, 0);
		}

		public TerminalNode T_CMP() {
			return getToken(HplsqlParser.T_CMP, 0);
		}

		public TerminalNode T_COLLECT() {
			return getToken(HplsqlParser.T_COLLECT, 0);
		}

		public TerminalNode T_COLLECTION() {
			return getToken(HplsqlParser.T_COLLECTION, 0);
		}

		public TerminalNode T_COMMENT() {
			return getToken(HplsqlParser.T_COMMENT, 0);
		}

		public TerminalNode T_COMPRESS() {
			return getToken(HplsqlParser.T_COMPRESS, 0);
		}

		public TerminalNode T_CONSTANT() {
			return getToken(HplsqlParser.T_CONSTANT, 0);
		}

		public TerminalNode T_CONCAT() {
			return getToken(HplsqlParser.T_CONCAT, 0);
		}

		public TerminalNode T_CONDITION() {
			return getToken(HplsqlParser.T_CONDITION, 0);
		}

		public TerminalNode T_CONSTRAINT() {
			return getToken(HplsqlParser.T_CONSTRAINT, 0);
		}

		public TerminalNode T_CONTINUE() {
			return getToken(HplsqlParser.T_CONTINUE, 0);
		}

		public TerminalNode T_COUNT() {
			return getToken(HplsqlParser.T_COUNT, 0);
		}

		public TerminalNode T_COUNT_BIG() {
			return getToken(HplsqlParser.T_COUNT_BIG, 0);
		}

		public TerminalNode T_CREATION() {
			return getToken(HplsqlParser.T_CREATION, 0);
		}

		public TerminalNode T_CREATOR() {
			return getToken(HplsqlParser.T_CREATOR, 0);
		}

		public TerminalNode T_CS() {
			return getToken(HplsqlParser.T_CS, 0);
		}

		public TerminalNode T_CUME_DIST() {
			return getToken(HplsqlParser.T_CUME_DIST, 0);
		}

		public TerminalNode T_CURRENT() {
			return getToken(HplsqlParser.T_CURRENT, 0);
		}

		public TerminalNode T_CURRENT_DATE() {
			return getToken(HplsqlParser.T_CURRENT_DATE, 0);
		}

		public TerminalNode T_CURRENT_TIMESTAMP() {
			return getToken(HplsqlParser.T_CURRENT_TIMESTAMP, 0);
		}

		public TerminalNode T_CURRENT_USER() {
			return getToken(HplsqlParser.T_CURRENT_USER, 0);
		}

		public TerminalNode T_DATA() {
			return getToken(HplsqlParser.T_DATA, 0);
		}

		public TerminalNode T_DATABASE() {
			return getToken(HplsqlParser.T_DATABASE, 0);
		}

		public TerminalNode T_DATE() {
			return getToken(HplsqlParser.T_DATE, 0);
		}

		public TerminalNode T_DATETIME() {
			return getToken(HplsqlParser.T_DATETIME, 0);
		}

		public TerminalNode T_DAY() {
			return getToken(HplsqlParser.T_DAY, 0);
		}

		public TerminalNode T_DAYS() {
			return getToken(HplsqlParser.T_DAYS, 0);
		}

		public TerminalNode T_DEC() {
			return getToken(HplsqlParser.T_DEC, 0);
		}

		public TerminalNode T_DECIMAL() {
			return getToken(HplsqlParser.T_DECIMAL, 0);
		}

		public TerminalNode T_DECLARE() {
			return getToken(HplsqlParser.T_DECLARE, 0);
		}

		public TerminalNode T_DEFAULT() {
			return getToken(HplsqlParser.T_DEFAULT, 0);
		}

		public TerminalNode T_DEFERRED() {
			return getToken(HplsqlParser.T_DEFERRED, 0);
		}

		public TerminalNode T_DEFINED() {
			return getToken(HplsqlParser.T_DEFINED, 0);
		}

		public TerminalNode T_DEFINER() {
			return getToken(HplsqlParser.T_DEFINER, 0);
		}

		public TerminalNode T_DEFINITION() {
			return getToken(HplsqlParser.T_DEFINITION, 0);
		}

		public TerminalNode T_DELETE() {
			return getToken(HplsqlParser.T_DELETE, 0);
		}

		public TerminalNode T_DELIMITED() {
			return getToken(HplsqlParser.T_DELIMITED, 0);
		}

		public TerminalNode T_DENSE_RANK() {
			return getToken(HplsqlParser.T_DENSE_RANK, 0);
		}

		public TerminalNode T_DESC() {
			return getToken(HplsqlParser.T_DESC, 0);
		}

		public TerminalNode T_DIR() {
			return getToken(HplsqlParser.T_DIR, 0);
		}

		public TerminalNode T_DISTINCT() {
			return getToken(HplsqlParser.T_DISTINCT, 0);
		}

		public TerminalNode T_DISTRIBUTE() {
			return getToken(HplsqlParser.T_DISTRIBUTE, 0);
		}

		public TerminalNode T_DO() {
			return getToken(HplsqlParser.T_DO, 0);
		}

		public TerminalNode T_DOUBLE() {
			return getToken(HplsqlParser.T_DOUBLE, 0);
		}

		public TerminalNode T_DYNAMIC() {
			return getToken(HplsqlParser.T_DYNAMIC, 0);
		}

		public TerminalNode T_END() {
			return getToken(HplsqlParser.T_END, 0);
		}

		public TerminalNode T_ENABLE() {
			return getToken(HplsqlParser.T_ENABLE, 0);
		}

		public TerminalNode T_ENGINE() {
			return getToken(HplsqlParser.T_ENGINE, 0);
		}

		public TerminalNode T_ESCAPED() {
			return getToken(HplsqlParser.T_ESCAPED, 0);
		}

		public TerminalNode T_EXCEPT() {
			return getToken(HplsqlParser.T_EXCEPT, 0);
		}

		public TerminalNode T_EXEC() {
			return getToken(HplsqlParser.T_EXEC, 0);
		}

		public TerminalNode T_EXECUTE() {
			return getToken(HplsqlParser.T_EXECUTE, 0);
		}

		public TerminalNode T_EXCEPTION() {
			return getToken(HplsqlParser.T_EXCEPTION, 0);
		}

		public TerminalNode T_EXCLUSIVE() {
			return getToken(HplsqlParser.T_EXCLUSIVE, 0);
		}

		public TerminalNode T_EXISTS() {
			return getToken(HplsqlParser.T_EXISTS, 0);
		}

		public TerminalNode T_EXIT() {
			return getToken(HplsqlParser.T_EXIT, 0);
		}

		public TerminalNode T_FALLBACK() {
			return getToken(HplsqlParser.T_FALLBACK, 0);
		}

		public TerminalNode T_FALSE() {
			return getToken(HplsqlParser.T_FALSE, 0);
		}

		public TerminalNode T_FIELDS() {
			return getToken(HplsqlParser.T_FIELDS, 0);
		}

		public TerminalNode T_FIRST_VALUE() {
			return getToken(HplsqlParser.T_FIRST_VALUE, 0);
		}

		public TerminalNode T_FLOAT() {
			return getToken(HplsqlParser.T_FLOAT, 0);
		}

		public TerminalNode T_FOR() {
			return getToken(HplsqlParser.T_FOR, 0);
		}

		public TerminalNode T_FOREIGN() {
			return getToken(HplsqlParser.T_FOREIGN, 0);
		}

		public TerminalNode T_FORMAT() {
			return getToken(HplsqlParser.T_FORMAT, 0);
		}

		public TerminalNode T_FOUND() {
			return getToken(HplsqlParser.T_FOUND, 0);
		}

		public TerminalNode T_FROM() {
			return getToken(HplsqlParser.T_FROM, 0);
		}

		public TerminalNode T_FULL() {
			return getToken(HplsqlParser.T_FULL, 0);
		}

		public TerminalNode T_FUNCTION() {
			return getToken(HplsqlParser.T_FUNCTION, 0);
		}

		public TerminalNode T_GLOBAL() {
			return getToken(HplsqlParser.T_GLOBAL, 0);
		}

		public TerminalNode T_GO() {
			return getToken(HplsqlParser.T_GO, 0);
		}

		public TerminalNode T_GROUP() {
			return getToken(HplsqlParser.T_GROUP, 0);
		}

		public TerminalNode T_HANDLER() {
			return getToken(HplsqlParser.T_HANDLER, 0);
		}

		public TerminalNode T_HASH() {
			return getToken(HplsqlParser.T_HASH, 0);
		}

		public TerminalNode T_HAVING() {
			return getToken(HplsqlParser.T_HAVING, 0);
		}

		public TerminalNode T_IDENTITY() {
			return getToken(HplsqlParser.T_IDENTITY, 0);
		}

		public TerminalNode T_IF() {
			return getToken(HplsqlParser.T_IF, 0);
		}

		public TerminalNode T_IMMEDIATE() {
			return getToken(HplsqlParser.T_IMMEDIATE, 0);
		}

		public TerminalNode T_IN() {
			return getToken(HplsqlParser.T_IN, 0);
		}

		public TerminalNode T_INDEX() {
			return getToken(HplsqlParser.T_INDEX, 0);
		}

		public TerminalNode T_INITRANS() {
			return getToken(HplsqlParser.T_INITRANS, 0);
		}

		public TerminalNode T_INNER() {
			return getToken(HplsqlParser.T_INNER, 0);
		}

		public TerminalNode T_INOUT() {
			return getToken(HplsqlParser.T_INOUT, 0);
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

		public TerminalNode T_INTERSECT() {
			return getToken(HplsqlParser.T_INTERSECT, 0);
		}

		public TerminalNode T_INTERVAL() {
			return getToken(HplsqlParser.T_INTERVAL, 0);
		}

		public TerminalNode T_INTO() {
			return getToken(HplsqlParser.T_INTO, 0);
		}

		public TerminalNode T_INVOKER() {
			return getToken(HplsqlParser.T_INVOKER, 0);
		}

		public TerminalNode T_ITEMS() {
			return getToken(HplsqlParser.T_ITEMS, 0);
		}

		public TerminalNode T_IS() {
			return getToken(HplsqlParser.T_IS, 0);
		}

		public TerminalNode T_ISOPEN() {
			return getToken(HplsqlParser.T_ISOPEN, 0);
		}

		public TerminalNode T_JOIN() {
			return getToken(HplsqlParser.T_JOIN, 0);
		}

		public TerminalNode T_KEEP() {
			return getToken(HplsqlParser.T_KEEP, 0);
		}

		public TerminalNode T_KEY() {
			return getToken(HplsqlParser.T_KEY, 0);
		}

		public TerminalNode T_KEYS() {
			return getToken(HplsqlParser.T_KEYS, 0);
		}

		public TerminalNode T_LAG() {
			return getToken(HplsqlParser.T_LAG, 0);
		}

		public TerminalNode T_LANGUAGE() {
			return getToken(HplsqlParser.T_LANGUAGE, 0);
		}

		public TerminalNode T_LAST_VALUE() {
			return getToken(HplsqlParser.T_LAST_VALUE, 0);
		}

		public TerminalNode T_LEAD() {
			return getToken(HplsqlParser.T_LEAD, 0);
		}

		public TerminalNode T_LEAVE() {
			return getToken(HplsqlParser.T_LEAVE, 0);
		}

		public TerminalNode T_LEFT() {
			return getToken(HplsqlParser.T_LEFT, 0);
		}

		public TerminalNode T_LIKE() {
			return getToken(HplsqlParser.T_LIKE, 0);
		}

		public TerminalNode T_LIMIT() {
			return getToken(HplsqlParser.T_LIMIT, 0);
		}

		public TerminalNode T_LINES() {
			return getToken(HplsqlParser.T_LINES, 0);
		}

		public TerminalNode T_LOCAL() {
			return getToken(HplsqlParser.T_LOCAL, 0);
		}

		public TerminalNode T_LOCATION() {
			return getToken(HplsqlParser.T_LOCATION, 0);
		}

		public TerminalNode T_LOCATOR() {
			return getToken(HplsqlParser.T_LOCATOR, 0);
		}

		public TerminalNode T_LOCATORS() {
			return getToken(HplsqlParser.T_LOCATORS, 0);
		}

		public TerminalNode T_LOCKS() {
			return getToken(HplsqlParser.T_LOCKS, 0);
		}

		public TerminalNode T_LOG() {
			return getToken(HplsqlParser.T_LOG, 0);
		}

		public TerminalNode T_LOGGED() {
			return getToken(HplsqlParser.T_LOGGED, 0);
		}

		public TerminalNode T_LOGGING() {
			return getToken(HplsqlParser.T_LOGGING, 0);
		}

		public TerminalNode T_LOOP() {
			return getToken(HplsqlParser.T_LOOP, 0);
		}

		public TerminalNode T_MAP() {
			return getToken(HplsqlParser.T_MAP, 0);
		}

		public TerminalNode T_MAX() {
			return getToken(HplsqlParser.T_MAX, 0);
		}

		public TerminalNode T_MAXTRANS() {
			return getToken(HplsqlParser.T_MAXTRANS, 0);
		}

		public TerminalNode T_MICROSECOND() {
			return getToken(HplsqlParser.T_MICROSECOND, 0);
		}

		public TerminalNode T_MICROSECONDS() {
			return getToken(HplsqlParser.T_MICROSECONDS, 0);
		}

		public TerminalNode T_MIN() {
			return getToken(HplsqlParser.T_MIN, 0);
		}

		public TerminalNode T_MULTISET() {
			return getToken(HplsqlParser.T_MULTISET, 0);
		}

		public TerminalNode T_NCHAR() {
			return getToken(HplsqlParser.T_NCHAR, 0);
		}

		public TerminalNode T_NVARCHAR() {
			return getToken(HplsqlParser.T_NVARCHAR, 0);
		}

		public TerminalNode T_NO() {
			return getToken(HplsqlParser.T_NO, 0);
		}

		public TerminalNode T_NOCOMPRESS() {
			return getToken(HplsqlParser.T_NOCOMPRESS, 0);
		}

		public TerminalNode T_NOLOGGING() {
			return getToken(HplsqlParser.T_NOLOGGING, 0);
		}

		public TerminalNode T_NOT() {
			return getToken(HplsqlParser.T_NOT, 0);
		}

		public TerminalNode T_NOTFOUND() {
			return getToken(HplsqlParser.T_NOTFOUND, 0);
		}

		public TerminalNode T_NUMERIC() {
			return getToken(HplsqlParser.T_NUMERIC, 0);
		}

		public TerminalNode T_NUMBER() {
			return getToken(HplsqlParser.T_NUMBER, 0);
		}

		public TerminalNode T_ON() {
			return getToken(HplsqlParser.T_ON, 0);
		}

		public TerminalNode T_ONLY() {
			return getToken(HplsqlParser.T_ONLY, 0);
		}

		public TerminalNode T_OPEN() {
			return getToken(HplsqlParser.T_OPEN, 0);
		}

		public TerminalNode T_OR() {
			return getToken(HplsqlParser.T_OR, 0);
		}

		public TerminalNode T_ORDER() {
			return getToken(HplsqlParser.T_ORDER, 0);
		}

		public TerminalNode T_OUT() {
			return getToken(HplsqlParser.T_OUT, 0);
		}

		public TerminalNode T_OUTER() {
			return getToken(HplsqlParser.T_OUTER, 0);
		}

		public TerminalNode T_OVER() {
			return getToken(HplsqlParser.T_OVER, 0);
		}

		public TerminalNode T_OWNER() {
			return getToken(HplsqlParser.T_OWNER, 0);
		}

		public TerminalNode T_PACKAGE() {
			return getToken(HplsqlParser.T_PACKAGE, 0);
		}

		public TerminalNode T_PART_COUNT() {
			return getToken(HplsqlParser.T_PART_COUNT, 0);
		}

		public TerminalNode T_PART_LOC() {
			return getToken(HplsqlParser.T_PART_LOC, 0);
		}

		public TerminalNode T_PARTITION() {
			return getToken(HplsqlParser.T_PARTITION, 0);
		}

		public TerminalNode T_PCTFREE() {
			return getToken(HplsqlParser.T_PCTFREE, 0);
		}

		public TerminalNode T_PCTUSED() {
			return getToken(HplsqlParser.T_PCTUSED, 0);
		}

		public TerminalNode T_PRECISION() {
			return getToken(HplsqlParser.T_PRECISION, 0);
		}

		public TerminalNode T_PRESERVE() {
			return getToken(HplsqlParser.T_PRESERVE, 0);
		}

		public TerminalNode T_PRIMARY() {
			return getToken(HplsqlParser.T_PRIMARY, 0);
		}

		public TerminalNode T_PROC() {
			return getToken(HplsqlParser.T_PROC, 0);
		}

		public TerminalNode T_PROCEDURE() {
			return getToken(HplsqlParser.T_PROCEDURE, 0);
		}

		public TerminalNode T_QUALIFY() {
			return getToken(HplsqlParser.T_QUALIFY, 0);
		}

		public TerminalNode T_QUIT() {
			return getToken(HplsqlParser.T_QUIT, 0);
		}

		public TerminalNode T_RANK() {
			return getToken(HplsqlParser.T_RANK, 0);
		}

		public TerminalNode T_REAL() {
			return getToken(HplsqlParser.T_REAL, 0);
		}

		public TerminalNode T_REFERENCES() {
			return getToken(HplsqlParser.T_REFERENCES, 0);
		}

		public TerminalNode T_REGEXP() {
			return getToken(HplsqlParser.T_REGEXP, 0);
		}

		public TerminalNode T_RR() {
			return getToken(HplsqlParser.T_RR, 0);
		}

		public TerminalNode T_REPLACE() {
			return getToken(HplsqlParser.T_REPLACE, 0);
		}

		public TerminalNode T_RESTRICT() {
			return getToken(HplsqlParser.T_RESTRICT, 0);
		}

		public TerminalNode T_RESULT() {
			return getToken(HplsqlParser.T_RESULT, 0);
		}

		public TerminalNode T_RESULT_SET_LOCATOR() {
			return getToken(HplsqlParser.T_RESULT_SET_LOCATOR, 0);
		}

		public TerminalNode T_RETURN() {
			return getToken(HplsqlParser.T_RETURN, 0);
		}

		public TerminalNode T_RETURNS() {
			return getToken(HplsqlParser.T_RETURNS, 0);
		}

		public TerminalNode T_REVERSE() {
			return getToken(HplsqlParser.T_REVERSE, 0);
		}

		public TerminalNode T_RIGHT() {
			return getToken(HplsqlParser.T_RIGHT, 0);
		}

		public TerminalNode T_RLIKE() {
			return getToken(HplsqlParser.T_RLIKE, 0);
		}

		public TerminalNode T_RS() {
			return getToken(HplsqlParser.T_RS, 0);
		}

		public TerminalNode T_ROW() {
			return getToken(HplsqlParser.T_ROW, 0);
		}

		public TerminalNode T_ROWS() {
			return getToken(HplsqlParser.T_ROWS, 0);
		}

		public TerminalNode T_ROW_COUNT() {
			return getToken(HplsqlParser.T_ROW_COUNT, 0);
		}

		public TerminalNode T_ROW_NUMBER() {
			return getToken(HplsqlParser.T_ROW_NUMBER, 0);
		}

		public TerminalNode T_SCHEMA() {
			return getToken(HplsqlParser.T_SCHEMA, 0);
		}

		public TerminalNode T_SECOND() {
			return getToken(HplsqlParser.T_SECOND, 0);
		}

		public TerminalNode T_SECONDS() {
			return getToken(HplsqlParser.T_SECONDS, 0);
		}

		public TerminalNode T_SECURITY() {
			return getToken(HplsqlParser.T_SECURITY, 0);
		}

		public TerminalNode T_SEGMENT() {
			return getToken(HplsqlParser.T_SEGMENT, 0);
		}

		public TerminalNode T_SEL() {
			return getToken(HplsqlParser.T_SEL, 0);
		}

		public TerminalNode T_SELECT() {
			return getToken(HplsqlParser.T_SELECT, 0);
		}

		public TerminalNode T_SET() {
			return getToken(HplsqlParser.T_SET, 0);
		}

		public TerminalNode T_SETS() {
			return getToken(HplsqlParser.T_SETS, 0);
		}

		public TerminalNode T_SHARE() {
			return getToken(HplsqlParser.T_SHARE, 0);
		}

		public TerminalNode T_SIMPLE_DOUBLE() {
			return getToken(HplsqlParser.T_SIMPLE_DOUBLE, 0);
		}

		public TerminalNode T_SIMPLE_FLOAT() {
			return getToken(HplsqlParser.T_SIMPLE_FLOAT, 0);
		}

		public TerminalNode T_SMALLDATETIME() {
			return getToken(HplsqlParser.T_SMALLDATETIME, 0);
		}

		public TerminalNode T_SMALLINT() {
			return getToken(HplsqlParser.T_SMALLINT, 0);
		}

		public TerminalNode T_SQL() {
			return getToken(HplsqlParser.T_SQL, 0);
		}

		public TerminalNode T_SQLEXCEPTION() {
			return getToken(HplsqlParser.T_SQLEXCEPTION, 0);
		}

		public TerminalNode T_SQLWARNING() {
			return getToken(HplsqlParser.T_SQLWARNING, 0);
		}

		public TerminalNode T_STEP() {
			return getToken(HplsqlParser.T_STEP, 0);
		}

		public TerminalNode T_STDEV() {
			return getToken(HplsqlParser.T_STDEV, 0);
		}

		public TerminalNode T_STORAGE() {
			return getToken(HplsqlParser.T_STORAGE, 0);
		}

		public TerminalNode T_STORED() {
			return getToken(HplsqlParser.T_STORED, 0);
		}

		public TerminalNode T_STRING() {
			return getToken(HplsqlParser.T_STRING, 0);
		}

		public TerminalNode T_SUBSTRING() {
			return getToken(HplsqlParser.T_SUBSTRING, 0);
		}

		public TerminalNode T_SUM() {
			return getToken(HplsqlParser.T_SUM, 0);
		}

		public TerminalNode T_SYSDATE() {
			return getToken(HplsqlParser.T_SYSDATE, 0);
		}

		public TerminalNode T_SYS_REFCURSOR() {
			return getToken(HplsqlParser.T_SYS_REFCURSOR, 0);
		}

		public TerminalNode T_TABLE() {
			return getToken(HplsqlParser.T_TABLE, 0);
		}

		public TerminalNode T_TABLESPACE() {
			return getToken(HplsqlParser.T_TABLESPACE, 0);
		}

		public TerminalNode T_TEMPORARY() {
			return getToken(HplsqlParser.T_TEMPORARY, 0);
		}

		public TerminalNode T_TERMINATED() {
			return getToken(HplsqlParser.T_TERMINATED, 0);
		}

		public TerminalNode T_TEXTIMAGE_ON() {
			return getToken(HplsqlParser.T_TEXTIMAGE_ON, 0);
		}

		public TerminalNode T_THEN() {
			return getToken(HplsqlParser.T_THEN, 0);
		}

		public TerminalNode T_TIMESTAMP() {
			return getToken(HplsqlParser.T_TIMESTAMP, 0);
		}

		public TerminalNode T_TITLE() {
			return getToken(HplsqlParser.T_TITLE, 0);
		}

		public TerminalNode T_TO() {
			return getToken(HplsqlParser.T_TO, 0);
		}

		public TerminalNode T_TOP() {
			return getToken(HplsqlParser.T_TOP, 0);
		}

		public TerminalNode T_TRIM() {
			return getToken(HplsqlParser.T_TRIM, 0);
		}

		public TerminalNode T_TRUE() {
			return getToken(HplsqlParser.T_TRUE, 0);
		}

		public TerminalNode T_UNIQUE() {
			return getToken(HplsqlParser.T_UNIQUE, 0);
		}

		public TerminalNode T_UPDATE() {
			return getToken(HplsqlParser.T_UPDATE, 0);
		}

		public TerminalNode T_UR() {
			return getToken(HplsqlParser.T_UR, 0);
		}

		public TerminalNode T_USE() {
			return getToken(HplsqlParser.T_USE, 0);
		}

		public TerminalNode T_USER() {
			return getToken(HplsqlParser.T_USER, 0);
		}

		public TerminalNode T_USING() {
			return getToken(HplsqlParser.T_USING, 0);
		}

		public TerminalNode T_VALUE() {
			return getToken(HplsqlParser.T_VALUE, 0);
		}

		public TerminalNode T_VALUES() {
			return getToken(HplsqlParser.T_VALUES, 0);
		}

		public TerminalNode T_VAR() {
			return getToken(HplsqlParser.T_VAR, 0);
		}

		public TerminalNode T_VARCHAR() {
			return getToken(HplsqlParser.T_VARCHAR, 0);
		}

		public TerminalNode T_VARCHAR2() {
			return getToken(HplsqlParser.T_VARCHAR2, 0);
		}

		public TerminalNode T_VARYING() {
			return getToken(HplsqlParser.T_VARYING, 0);
		}

		public TerminalNode T_VARIANCE() {
			return getToken(HplsqlParser.T_VARIANCE, 0);
		}

		public TerminalNode T_VOLATILE() {
			return getToken(HplsqlParser.T_VOLATILE, 0);
		}

		public TerminalNode T_WHILE() {
			return getToken(HplsqlParser.T_WHILE, 0);
		}

		public TerminalNode T_WITH() {
			return getToken(HplsqlParser.T_WITH, 0);
		}

		public TerminalNode T_WRITE() {
			return getToken(HplsqlParser.T_WRITE, 0);
		}

		public TerminalNode T_XML() {
			return getToken(HplsqlParser.T_XML, 0);
		}

		public TerminalNode T_YES() {
			return getToken(HplsqlParser.T_YES, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_non_reserved_words;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).enterNon_reserved_words(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof HplsqlListener) ((HplsqlListener) listener).exitNon_reserved_words(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof HplsqlVisitor)
				return ((HplsqlVisitor<? extends T>) visitor).visitNon_reserved_words(this);
			else return visitor.visitChildren(this);
		}
	}
}