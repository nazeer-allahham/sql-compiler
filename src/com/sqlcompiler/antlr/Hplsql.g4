grammar Hplsql;

program: block EOF;

block : ((begin_end_block | stmt) T_GO?)+ ;

begin_end_block :
      declare_block? T_BEGIN block exception_block? block_end
    ;

// Single BEGIN END block (but nested blocks are possible) or single statement
single_block_stmt :
      T_BEGIN block exception_block? block_end
    | stmt T_SEMICOLON?
    ;

block_end :
    {!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION")}? T_END
    ;

proc_block :
      begin_end_block
    | stmt+ T_GO?
    ;

stmt :
      assignment_stmt
    | associate_locator_stmt
    | break_stmt
    | call_stmt
    | close_stmt
    | cmp_stmt
    | create_database_stmt
    | create_function_stmt
    | create_index_stmt
    | create_local_temp_table_stmt
    | create_package_stmt
    | create_package_body_stmt
    | create_procedure_stmt
    | create_table_stmt
    | create_type_stmt
    | declare_stmt
    | exec_stmt
    | exit_stmt
    | for_range_stmt
    | if_stmt
    | leave_stmt
    | quit_stmt
    | return_stmt
    | select_stmt
    | while_stmt
    | cpp_stmt
    | error_stmt
    | label
    | null_stmt
    | expr_stmt
    | semicolon_stmt
    ;

error_stmt:
       invalid_select
    |  invalid_bool_expr
    |  invalid_cpp_function_stmt
    ;
invalid_select:
     (T_SELECT | T_SEL) select_list into_clause? (from_clause|invalid_from_clause)? (where_clause|invalid_where_clause)? group_by_clause? (having_clause | qualify_clause)? order_by_clause? select_options?

;
invalid_where_clause:
        bool_expr {notifyErrorListeners("Missing 'where' word ");}
     |T_WHERE invalid_bool_expr
;

invalid_from_clause:
         from_table_clause (from_join_clause)* {notifyErrorListeners("Missing 'from' word ");}
;
invalid_bool_expr:
        T_NOT? bool_expr T_CLOSE_P {notifyErrorListeners("Missing opening '('");}
    |   T_NOT? T_OPEN_P bool_expr {notifyErrorListeners("Missing closing ')'");}
    |   T_NOT?  bool_expr T_CLOSE_P T_CLOSE_P+  {notifyErrorListeners("Too many parentheses");}
    |   invalid_bool_expr_atom
    ;

invalid_bool_expr_atom :
        invalid_bool_expr_binary
    ;

invalid_bool_expr_binary :
        expr invalid_bool_expr_binary_operator expr
    ;

invalid_bool_expr_binary_operator :
        ident
    ;

invalid_cpp_function_stmt:
        invalid_cpp_function_header cpp_function_body
    ;

invalid_cpp_function_header:
        ident T_OPEN_P (cpp_function_params_clause | invalid_cpp_function_params_clause) T_CLOSE_P {notifyErrorListeners("Missing data type");}
    |   dtype T_OPEN_P (cpp_function_params_clause | invalid_cpp_function_params_clause) T_CLOSE_P {notifyErrorListeners("Missing identify");}
    |   dtype ident T_OPEN_P invalid_cpp_function_params_clause T_CLOSE_P
    |   dtype ident (cpp_function_params_clause | invalid_cpp_function_params_clause) T_CLOSE_P {notifyErrorListeners("Missing openning '(' ");}
    |   dtype ident T_OPEN_P (cpp_function_params_clause | invalid_cpp_function_params_clause) {notifyErrorListeners("Missing closing ')' ");}
    ;

invalid_cpp_function_params_clause:
        (invalid_cpp_function_param | cpp_function_param) T_COMMA {notifyErrorListeners("append comma");}
    |   invalid_cpp_function_param (T_COMMA (cpp_function_param | invalid_cpp_function_param))*
    |   cpp_function_param (T_COMMA cpp_function_param)* (T_COMMA invalid_cpp_function_param)+ (T_COMMA cpp_function_param)*
    ;

invalid_cpp_function_param:
        ident  {notifyErrorListeners("Missing data type");} // I choose here ident beacuse it's can match dtype and ident so we can match type without name and name without type status.
    ;

// Exception block
exception_block :
      T_EXCEPTION exception_block_item+
    ;

exception_block_item :
      T_WHEN L_ID T_THEN block ~(T_WHEN | T_END)
    ;

semicolon_stmt :
      T_SEMICOLON
    | '@'
    | '#'
    | '/'
    ;

// NULL statement (no operation)
null_stmt :
      T_NULL
    ;

// Standalone expression
expr_stmt :
      {!_input.LT(1).getText().equalsIgnoreCase("GO")}? expr
    ;

// Assignment statement
assignment_stmt :
        T_SET? assignment_stmt_item (T_COMMA assignment_stmt_item)*
    ;

assignment_stmt_item :
        assignment_stmt_single_item
    |   assignment_stmt_multiple_item
    |   assignment_stmt_select_item
    ;

assignment_stmt_single_item :
        ident T_COLON? T_EQUAL expr
    |   T_OPEN_P ident T_CLOSE_P T_COLON? T_EQUAL expr
    ;

assignment_stmt_multiple_item :
        T_OPEN_P ident (T_COMMA ident)* T_CLOSE_P T_COLON? T_EQUAL T_OPEN_P expr (T_COMMA expr)* T_CLOSE_P
    ;

assignment_stmt_select_item :
        (ident | (T_OPEN_P ident (T_COMMA ident)* T_CLOSE_P)) T_COLON? T_EQUAL T_OPEN_P select_stmt T_CLOSE_P
    ;

associate_locator_stmt :
        T_ASSOCIATE (T_RESULT T_SET)? (T_LOCATOR | T_LOCATORS) T_OPEN_P ident (T_COMMA ident)* T_CLOSE_P T_WITH T_PROCEDURE ident
    ;

break_stmt :
        T_BREAK
    ;

call_stmt :
        T_CALL ident (T_OPEN_P expr_func_params? T_CLOSE_P | expr_func_params)?
    ;

// close cursor statement
close_stmt :
        T_CLOSE L_ID
    ;

// Declaration statement
declare_stmt :
        T_DECLARE declare_stmt_item (T_COMMA declare_stmt_item)*
    ;

// Declaration block
declare_block :
        T_DECLARE declare_stmt_item T_SEMICOLON (declare_stmt_item T_SEMICOLON)*
    ;

declare_block_inplace :
        declare_stmt_item T_SEMICOLON (declare_stmt_item T_SEMICOLON)*
    ;

declare_stmt_item :
        declare_condition_item
    |   declare_handler_item
    |   declare_var_item
    |   declare_temporary_table_item
    ;

declare_var_item :
        ident (T_COMMA ident)* T_AS? dtype dtype_len? dtype_attr* dtype_default?
    |   ident T_CONSTANT T_AS? dtype dtype_len? dtype_default
    ;

// Condition declaration
declare_condition_item :
        ident T_CONDITION
    ;

// Condition handler declaration
declare_handler_item :
        (T_CONTINUE | T_EXIT) T_HANDLER T_FOR (T_SQLEXCEPTION | T_SQLWARNING | T_NOT T_FOUND | ident) single_block_stmt
    ;

// Create or define type statement
create_type_stmt:
        T_CREATE T_TYPE table_name create_type_definition create_type_options?
    ;

create_type_definition:
        T_OPEN_P create_type_items T_CLOSE_P
    ;

create_type_items:
        create_type_items_item (T_COMMA create_type_items_item)*
    ;

create_type_items_item:
        ident T_COLON ident
    ;

create_type_options:
        create_type_option+
    ;

create_type_option:
        create_type_store_location
    |   create_type_delemiter
    ;

create_type_store_location:
        T_LOCATION string (T_COMMA string)*;

create_type_delemiter:
        T_DELIMITED string;

// DECLARE TEMPORARY TABLE statement
declare_temporary_table_item :
        T_GLOBAL? T_TEMPORARY T_TABLE ident create_table_preoptions? create_table_definition
    ;

create_table_stmt :
        T_CREATE T_TABLE (T_IF T_NOT T_EXISTS)? table_name create_table_preoptions? create_table_definition
    ;

create_local_temp_table_stmt :
        T_CREATE (T_LOCAL T_TEMPORARY | (T_SET | T_MULTISET)? T_VOLATILE) T_TABLE ident create_table_preoptions? create_table_definition
    ;

create_table_definition :
        (T_AS? T_OPEN_P select_stmt T_CLOSE_P | T_AS? select_stmt | T_OPEN_P create_table_columns T_CLOSE_P) create_table_options?
    ;

create_table_columns :
        create_table_columns_item (T_COMMA create_table_columns_item)*
    ;

create_table_columns_item :
        column_name dtype dtype_len? dtype_attr* create_table_column_inline_cons*
    |   (T_CONSTRAINT ident)? create_table_column_cons
    ;

column_name :
        ident
    ;

create_table_column_inline_cons :
        dtype_default
    |   T_NOT? T_NULL
    |   T_PRIMARY T_KEY
    |   T_UNIQUE
    |   T_REFERENCES table_name T_OPEN_P ident T_CLOSE_P create_table_fk_action*
    |   T_IDENTITY T_OPEN_P L_INT (T_COMMA L_INT)* T_CLOSE_P
    |   T_AUTO_INCREMENT
    |   T_ENABLE
    ;

create_table_column_cons :
        T_PRIMARY T_KEY T_CLUSTERED? T_OPEN_P ident (T_ASC | T_DESC)? (T_COMMA ident (T_ASC | T_DESC)?)* T_CLOSE_P T_ENABLE? index_storage_clause?
    |   T_FOREIGN T_KEY T_OPEN_P ident (T_COMMA ident)* T_CLOSE_P T_REFERENCES table_name T_OPEN_P ident (T_COMMA ident)* T_CLOSE_P create_table_fk_action*
    ;

create_table_fk_action :
        T_ON (T_UPDATE | T_DELETE) (T_NO T_ACTION | T_RESTRICT | T_SET T_NULL | T_SET T_DEFAULT | T_CASCADE)
    ;

create_table_preoptions :
        create_table_preoptions_item+
    ;

create_table_preoptions_item :
        T_COMMA create_table_preoptions_td_item
    |   create_table_options_hive_item
    ;

create_table_preoptions_td_item :
        T_NO? (T_LOG | T_FALLBACK)
    ;

create_table_options :
        create_table_options_item+
    ;

create_table_options_item :
        T_ON T_COMMIT (T_DELETE | T_PRESERVE) T_ROWS
    |   create_table_options_ora_item
    |   create_table_options_db2_item
    |   create_table_options_td_item
    |   create_table_options_hive_item
    |   create_table_options_mssql_item
    |   create_table_options_mysql_item
    |   create_table_store_location
    |   create_table_delemiter
    ;

create_table_options_ora_item :
        T_SEGMENT T_CREATION (T_IMMEDIATE | T_DEFERRED)
    |   (T_PCTFREE | T_PCTUSED | T_INITRANS | T_MAXTRANS) L_INT
    |   T_NOCOMPRESS
    |   (T_LOGGING | T_NOLOGGING)
    |   T_STORAGE T_OPEN_P (ident | L_INT)+ T_CLOSE_P
    |   T_TABLESPACE ident
    ;

create_table_options_db2_item :
        T_INDEX? T_IN ident
    |   T_WITH T_REPLACE
    |   T_DISTRIBUTE T_BY T_HASH T_OPEN_P ident (T_COMMA ident)* T_CLOSE_P
    |   T_NOT? T_LOGGED
    |   T_COMPRESS (T_YES | T_NO)
    |   T_DEFINITION T_ONLY
    |   T_WITH T_RESTRICT T_ON T_DROP
    ;

create_table_options_td_item :
        T_UNIQUE? T_PRIMARY T_INDEX T_OPEN_P ident (T_COMMA ident)* T_CLOSE_P
    |   T_WITH T_DATA
    ;

create_table_options_hive_item :
        create_table_hive_row_format
    |   T_STORED T_AS ident
    ;

create_table_store_location:
        T_LOCATION string (T_COMMA string)*;

create_table_delemiter:
        T_DELIMITED string;

create_table_hive_row_format :
        T_ROW T_FORMAT T_DELIMITED create_table_hive_row_format_fields*
    ;

create_table_hive_row_format_fields :
        T_FIELDS T_TERMINATED T_BY expr (T_ESCAPED T_BY expr)?
    |   T_COLLECTION T_ITEMS T_TERMINATED T_BY expr
    |   T_MAP T_KEYS T_TERMINATED T_BY expr
    |   T_LINES T_TERMINATED T_BY expr
    |   T_NULL T_DEFINED T_AS expr
    ;

create_table_options_mssql_item :
        T_ON ident
    |   T_TEXTIMAGE_ON ident
    ;

create_table_options_mysql_item :
        T_AUTO_INCREMENT T_EQUAL? expr
    |   T_COMMENT T_EQUAL? expr
    |   T_DEFAULT? (T_CHARACTER T_SET | T_CHARSET) T_EQUAL? expr
    |   T_ENGINE T_EQUAL? expr
    ;

// Data types
dtype :
        T_CHAR
    |   T_BIGINT
    |   T_BINARY_DOUBLE
    |   T_BINARY_FLOAT
    |   T_BINARY_INTEGER
    |   T_BIT
    |   T_DATE
    |   T_DATETIME
    |   T_DEC
    |   T_DECIMAL
    |   T_DOUBLE T_PRECISION?
    |   T_FLOAT
    |   T_INT
    |   T_INT2
    |   T_INT4
    |   T_INT8
    |   T_INTEGER
    |   T_NCHAR
    |   T_NVARCHAR
    |   T_NUMBER
    |   T_NUMERIC
    |   T_PLS_INTEGER
    |   T_REAL
    |   T_RESULT_SET_LOCATOR T_VARYING
    |   T_SIMPLE_FLOAT
    |   T_SIMPLE_DOUBLE
    |   T_SIMPLE_INTEGER
    |   T_SMALLINT
    |   T_SMALLDATETIME
    |   T_STRING
    |   T_SYS_REFCURSOR
    |   T_TIMESTAMP
    |   T_TINYINT
    |   T_VARCHAR
    |   T_VARCHAR2
    |   T_XML
    |   ident ('%' (T_TYPE))?             // User-defined or derived data type
    ;

// Data type length or size specification
dtype_len :
        T_OPEN_P (L_INT | T_MAX) (T_CHAR | T_BYTE)? (T_COMMA L_INT)? T_CLOSE_P
    ;

dtype_attr :
        T_NOT? T_NULL
    |   T_CHARACTER T_SET ident
    |   T_NOT? (T_CASESPECIFIC | T_CS)
    ;

dtype_default :
        T_COLON? T_EQUAL expr
    |   T_WITH? T_DEFAULT expr?
    ;

create_database_stmt :
        T_CREATE (T_DATABASE | T_SCHEMA) (T_IF T_NOT T_EXISTS)? expr create_database_option*
    ;

create_database_option :
        T_COMMENT expr
    |   T_LOCATION expr
    ;

create_function_stmt :
        (T_ALTER | T_CREATE (T_OR T_REPLACE)? | T_REPLACE)? T_FUNCTION ident create_routine_params? create_function_return (T_AS | T_IS)? declare_block_inplace? single_block_stmt
    ;

create_function_return :
        (T_RETURN | T_RETURNS) dtype dtype_len?
    ;

create_package_stmt :
        (T_ALTER | T_CREATE (T_OR T_REPLACE)? | T_REPLACE)? T_PACKAGE ident (T_AS | T_IS) package_spec T_END (ident T_SEMICOLON)?
    ;

package_spec :
        package_spec_item T_SEMICOLON (package_spec_item T_SEMICOLON)*
    ;

package_spec_item :
        declare_stmt_item
    |   T_FUNCTION ident create_routine_params? create_function_return
    |   (T_PROCEDURE | T_PROC) ident create_routine_params?
    ;

create_package_body_stmt :
        (T_ALTER | T_CREATE (T_OR T_REPLACE)? | T_REPLACE)? T_PACKAGE T_BODY ident (T_AS | T_IS) package_body T_END (ident T_SEMICOLON)?
    ;

package_body :
        package_body_item T_SEMICOLON (package_body_item T_SEMICOLON)*
    ;

package_body_item :
        declare_stmt_item
    |   create_function_stmt
    |   create_procedure_stmt
    ;

create_procedure_stmt :
        (T_ALTER | T_CREATE (T_OR T_REPLACE)? | T_REPLACE)? (T_PROCEDURE | T_PROC) ident create_routine_params? create_routine_options? (T_AS | T_IS)? declare_block_inplace? label? proc_block (ident T_SEMICOLON)?
    ;

create_routine_params :
        T_OPEN_P T_CLOSE_P
    |   T_OPEN_P create_routine_param_item (T_COMMA create_routine_param_item)* T_CLOSE_P
    |   {!_input.LT(1).getText().equalsIgnoreCase("IS") &&
        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") &&
        _input.LT(2).getText().equalsIgnoreCase("RESULT"))
        }?
        create_routine_param_item (T_COMMA create_routine_param_item)*
    ;

create_routine_param_item :
        (T_IN | T_OUT | T_INOUT | T_IN T_OUT)? ident dtype dtype_len? dtype_attr* dtype_default?
    |   ident (T_IN | T_OUT | T_INOUT | T_IN T_OUT)? dtype dtype_len? dtype_attr* dtype_default?
    ;

create_routine_options :
        create_routine_option+
    ;

create_routine_option :
        T_LANGUAGE T_SQL
    |   T_SQL T_SECURITY (T_CREATOR | T_DEFINER | T_INVOKER | T_OWNER)
    |   T_DYNAMIC? T_RESULT T_SETS L_INT
    ;

// EXEC, EXECUTE IMMEDIATE statement
exec_stmt :
        (T_EXEC | T_EXECUTE) T_IMMEDIATE? expr (T_OPEN_P expr_func_params T_CLOSE_P | expr_func_params)? (T_INTO L_ID (T_COMMA L_ID)*)? using_clause?
    ;

// IF statement
if_stmt :
        if_plsql_stmt
    |   if_tsql_stmt
    |   if_bteq_stmt
    ;

if_plsql_stmt :
        T_IF bool_expr T_THEN block elseif_block* else_block? T_END T_IF
    ;

if_tsql_stmt :
        T_IF bool_expr single_block_stmt (T_ELSE single_block_stmt)?
    ;

if_bteq_stmt :
        '.' T_IF bool_expr T_THEN single_block_stmt
    ;

elseif_block :
        (T_ELSIF | T_ELSEIF) bool_expr T_THEN block
    ;

else_block :
        T_ELSE block
    ;

exit_stmt :
        T_EXIT L_ID? (T_WHEN bool_expr)?
    ;

leave_stmt :
        T_LEAVE L_ID?
    ;

// CMP statement
cmp_stmt :
        T_CMP (T_ROW_COUNT | T_SUM) cmp_source T_COMMA cmp_source
    ;

cmp_source :
        (table_name where_clause? | T_OPEN_P select_stmt T_CLOSE_P) (T_AT ident)?
    ;

// CREATE INDEX statement
create_index_stmt :
        T_CREATE T_UNIQUE? T_INDEX ident T_ON table_name T_OPEN_P create_index_col (T_COMMA create_index_col)* T_CLOSE_P
    ;

create_index_col :
        ident (T_ASC | T_DESC)?
    ;

index_storage_clause :
        index_mssql_storage_clause
    ;

index_mssql_storage_clause :
        T_WITH T_OPEN_P ident T_EQUAL ident (T_COMMA ident T_EQUAL ident)* T_CLOSE_P create_table_options_mssql_item*
    ;

quit_stmt :
        '.'? T_QUIT expr?
    ;

// RETURN statement
return_stmt :
        T_RETURN expr?
    ;

// C plus plus section
cpp_stmt:
            cpp_function_stmt
        |   cpp_for_stmt
        |   cpp_if_stmt
        |   cpp_return_stmt
        |   cpp_declare_stmt
        |   cpp_assignment_stmt
        |   cpp_declare_assignment_stmt
        |   write_stmt
        |   create_table_stmt
        |   create_type_stmt
    ;

cpp_function_stmt:
        cpp_function_header cpp_function_body
    ;

cpp_function_header:
        dtype ident T_OPEN_P cpp_function_params_clause? T_CLOSE_P
    ;

cpp_function_params_clause:
        cpp_function_param (T_COMMA cpp_function_param)*
    ;

cpp_function_param:
        dtype ident
    ;

cpp_function_body:
        cpp_scope
    ;

cpp_if_stmt :
        T_IF T_OPEN_P bool_expr T_CLOSE_P cpp_for_stmt_body cpp_elseif_clause* cpp_else_clause?
    ;

cpp_elseif_clause :
        (T_ELSIF | T_ELSEIF) T_OPEN_P bool_expr T_CLOSE_P cpp_for_stmt_body
    ;

cpp_else_clause :
        T_ELSE cpp_for_stmt_body
    ;

cpp_for_stmt:
        cpp_for_stmt_header cpp_for_stmt_body
    ;

cpp_for_stmt_header:
        T_FOR T_OPEN_P cpp_for_params_clause T_SEMICOLON bool_expr T_SEMICOLON cpp_for_stmt_var_incr_caluse  T_CLOSE_P
    ;

cpp_for_params_clause:
        cpp_for_param (T_COMMA cpp_for_param)*
    ;

cpp_for_param:
     dtype? ident T_EQUAL L_INT
    ;

cpp_for_stmt_var_incr_caluse:
        cpp_for_stmt_var_incr (T_COMMA cpp_for_stmt_var_incr)*
    ;

cpp_for_stmt_var_incr:
        ident '+' '+'
    |   ident T_EQUAL ident
    |   ident T_EQUAL ident ('+' | '-' | '*' | '/' | '%') ident (('+' | '-' | '*' | '/' | '%') ident)*
    |   ident ('+' | '-' | '*' | '/' | '%') T_EQUAL ident
    ;

cpp_for_stmt_body:
        cpp_scope | cpp_stmt
    ;

cpp_declare_assignment_stmt:
        (dtype | T_VAR) ident '=' stmt T_SEMICOLON
    ;

cpp_declare_stmt:
        (dtype | T_VAR) ident T_SEMICOLON
    ;

cpp_assignment_stmt:
        ident '=' stmt T_SEMICOLON
    ;

cpp_return_stmt:
        T_RETURN expr T_SEMICOLON
    ;

cpp_scope:
        T_OPEN_B (cpp_stmt | cpp_scope)* T_CLOSE_B
    ;

// WHILE loop statement
while_stmt :
        T_WHILE bool_expr (T_DO | T_LOOP | T_THEN | T_BEGIN) block T_END (T_WHILE | T_LOOP)?
    ;

// FOR (Integer range) statement
for_range_stmt :
        T_FOR L_ID T_IN T_REVERSE? expr T_DOT2 expr ((T_BY | T_STEP) expr)? T_LOOP block T_END T_LOOP
    ;

label :
        L_LABEL
    |   T_LESS T_LESS L_ID T_GREATER T_GREATER
    ;

// USING var,... clause
using_clause :
        T_USING expr (T_COMMA expr)*
    ;

// SELECT statement
select_stmt :
        fullselect_stmt
    ;

fullselect_stmt :
        fullselect_stmt_item (fullselect_set_clause fullselect_stmt_item)*
    ;

fullselect_stmt_item :
        subselect_stmt
    |   T_OPEN_P fullselect_stmt T_CLOSE_P
    ;

fullselect_set_clause :
        T_UNION T_ALL?
    |   T_EXCEPT T_ALL?
    |   T_INTERSECT T_ALL?
    ;

subselect_stmt :
        (T_SELECT | T_SEL) select_list into_clause? from_clause? where_clause? group_by_clause? (having_clause | qualify_clause)? order_by_clause? select_options?
    ;

select_list :
        select_list_set? select_list_limit? select_list_item (T_COMMA select_list_item)*
    ;

select_list_set :
        T_ALL
    |   T_DISTINCT
    ;

select_list_limit :
        T_TOP expr
    ;

select_list_item :
        ((ident T_EQUAL)? expr select_list_alias? | select_list_asterisk)
    ;

select_list_alias :
        {!_input.LT(1).getText().equalsIgnoreCase("INTO") &&
         !_input.LT(1).getText().equalsIgnoreCase("FROM")}? T_AS? ident
    |   T_OPEN_P T_TITLE L_S_STRING T_CLOSE_P
    ;

select_list_asterisk :
        (L_ID '.')? '*'
    ;

into_clause :
        T_INTO ident (T_COMMA ident)*
    ;

from_clause :
        T_FROM from_table_clause (from_join_clause)*
    ;

from_table_clause :
        from_table_name_clause
    |   from_subselect_clause
    |   from_table_values_clause
    ;

from_table_name_clause :
        table_name from_alias_clause?
    ;

from_subselect_clause :
        T_OPEN_P select_stmt T_CLOSE_P from_alias_clause?
    ;

from_join_clause :
        T_COMMA from_table_clause
    |   from_join_type_clause from_table_clause T_ON bool_expr
    ;

from_join_type_clause :
        T_INNER? T_JOIN
    |   (T_LEFT | T_RIGHT | T_FULL) T_OUTER? T_JOIN
    ;

from_table_values_clause:
        T_TABLE T_OPEN_P T_VALUES from_table_values_row (T_COMMA from_table_values_row)* T_CLOSE_P from_alias_clause?
    ;

from_table_values_row:
        expr
    |   T_OPEN_P expr (T_COMMA expr)* T_CLOSE_P
    ;

from_alias_clause :
    T_AS? ident (T_OPEN_P L_ID (T_COMMA L_ID)* T_CLOSE_P)?
    ;

table_name :
        ident
    ;

where_clause :
        T_WHERE bool_expr
    ;

group_by_clause :
        T_GROUP T_BY expr (T_COMMA expr)*
    ;

having_clause :
        T_HAVING bool_expr
    ;

qualify_clause :
        T_QUALIFY bool_expr
    ;

order_by_clause :
        T_ORDER T_BY expr (T_ASC | T_DESC)? (T_COMMA expr (T_ASC | T_DESC)?)*
    ;

select_options :
        select_options_item+
    ;

select_options_item :
        T_LIMIT expr
    |   T_WITH (T_RR | T_RS | T_CS | T_UR) (T_USE T_AND T_KEEP (T_EXCLUSIVE | T_UPDATE | T_SHARE) T_LOCKS)?
    ;

// Boolean condition
bool_expr :
        T_NOT? T_OPEN_P bool_expr T_CLOSE_P
    |   bool_expr bool_expr_logical_operator bool_expr
    |   bool_expr_atom
    ;

bool_expr_atom :
        bool_expr_unary
    |   bool_expr_binary
    |   expr
    ;

bool_expr_unary :
        expr T_IS T_NOT? T_NULL
    |   expr T_BETWEEN expr T_AND expr
    |   T_NOT? T_EXISTS T_OPEN_P select_stmt T_CLOSE_P
    |   bool_expr_single_in
    |   bool_expr_multi_in
    ;

bool_expr_single_in :
        expr T_NOT? T_IN T_OPEN_P ((expr (T_COMMA expr)*) | select_stmt) T_CLOSE_P
    ;

bool_expr_multi_in :
        T_OPEN_P expr (T_COMMA expr)* T_CLOSE_P T_NOT? T_IN T_OPEN_P select_stmt T_CLOSE_P
    ;

bool_expr_binary :
        expr bool_expr_binary_operator expr
    ;

bool_expr_logical_operator :
        T_AND
    |   T_OR
    ;

bool_expr_binary_operator :
        T_EQUAL
    |   T_EQUAL2
    |   T_NOTEQUAL
    |   T_NOTEQUAL2
    |   T_LESS
    |   T_LESSEQUAL
    |   T_GREATER
    |   T_GREATEREQUAL
    |   T_NOT? (T_LIKE | T_RLIKE | T_REGEXP)
    ;

expr :
        expr interval_item
    |   expr T_MUL expr
    |   expr T_DIV expr
    |   expr T_ADD expr
    |   expr T_SUB expr
    |   T_OPEN_P select_stmt T_CLOSE_P
    |   T_OPEN_P expr T_CLOSE_P
    |   expr_interval
    |   expr_concat
    |   expr_case
    |   expr_cursor_attribute
    |   expr_agg_window_func
    |   expr_spec_func
    |   expr_func
    |   expr_atom
    ;

expr_atom :
        date_literal
    |   timestamp_literal
    |   bool_literal
    |   ident
    |   string
    |   dec_number
    |   int_number
    |   null_const
    ;

expr_interval :
        T_INTERVAL expr interval_item
    ;

interval_item :
        T_DAY
    |   T_DAYS
    |   T_MICROSECOND
    |   T_MICROSECONDS
    |   T_SECOND
    |   T_SECONDS
    ;

// String concatenation operator
expr_concat :
        expr_concat_item (T_PIPE | T_CONCAT) expr_concat_item ((T_PIPE | T_CONCAT) expr_concat_item)*
    ;

expr_concat_item :
        T_OPEN_P expr T_CLOSE_P
    |   expr_case
    |   expr_agg_window_func
    |   expr_spec_func
    |   expr_func
    |   expr_atom
    ;

// CASE expression
expr_case :
        expr_case_simple
    |   expr_case_searched
    ;

expr_case_simple :
        T_CASE expr (T_WHEN expr T_THEN expr)+ (T_ELSE expr)? T_END
    ;

expr_case_searched :
        T_CASE (T_WHEN bool_expr T_THEN expr)+ (T_ELSE expr)? T_END
    ;

expr_cursor_attribute :
        ident '%' (T_ISOPEN | T_FOUND | T_NOTFOUND)
    ;

expr_agg_window_func :
        T_AVG T_OPEN_P expr_func_all_distinct? expr T_CLOSE_P expr_func_over_clause?
    |   T_COUNT T_OPEN_P ((expr_func_all_distinct? expr) | '*') T_CLOSE_P expr_func_over_clause?
    |   T_COUNT_BIG T_OPEN_P ((expr_func_all_distinct? expr) | '*') T_CLOSE_P expr_func_over_clause?
    |   T_CUME_DIST T_OPEN_P T_CLOSE_P expr_func_over_clause
    |   T_DENSE_RANK T_OPEN_P T_CLOSE_P expr_func_over_clause
    |   T_FIRST_VALUE T_OPEN_P expr T_CLOSE_P expr_func_over_clause
    |   T_LAG T_OPEN_P expr (T_COMMA expr (T_COMMA expr)?)? T_CLOSE_P expr_func_over_clause
    |   T_LAST_VALUE T_OPEN_P expr T_CLOSE_P expr_func_over_clause
    |   T_LEAD T_OPEN_P expr (T_COMMA expr (T_COMMA expr)?)? T_CLOSE_P expr_func_over_clause
    |   T_MAX T_OPEN_P expr_func_all_distinct? expr T_CLOSE_P expr_func_over_clause?
    |   T_MIN T_OPEN_P expr_func_all_distinct? expr T_CLOSE_P expr_func_over_clause?
    |   T_RANK T_OPEN_P T_CLOSE_P expr_func_over_clause
    |   T_ROW_NUMBER T_OPEN_P T_CLOSE_P expr_func_over_clause
    |   T_STDEV T_OPEN_P expr_func_all_distinct? expr T_CLOSE_P expr_func_over_clause?
    |   T_SUM T_OPEN_P expr_func_all_distinct? expr T_CLOSE_P expr_func_over_clause?
    |   T_VAR T_OPEN_P expr_func_all_distinct? expr T_CLOSE_P expr_func_over_clause?
    |   T_VARIANCE T_OPEN_P expr_func_all_distinct? expr T_CLOSE_P expr_func_over_clause?
    ;

expr_func_all_distinct :
        T_ALL
    |   T_DISTINCT
    ;

expr_func_over_clause :
        T_OVER T_OPEN_P expr_func_partition_by_clause? order_by_clause? T_CLOSE_P
    ;

expr_func_partition_by_clause :
        T_PARTITION T_BY expr (T_COMMA expr)*
    ;

expr_spec_func :
        T_ACTIVITY_COUNT
    |   T_CAST T_OPEN_P expr T_AS  dtype dtype_len? T_CLOSE_P
    |   T_COUNT T_OPEN_P (expr | '*') T_CLOSE_P
    |   T_CURRENT_DATE | T_CURRENT T_DATE
    |   (T_CURRENT_TIMESTAMP | T_CURRENT T_TIMESTAMP) (T_OPEN_P expr T_CLOSE_P)?
    |   T_CURRENT_USER | T_CURRENT T_USER
    |   T_MAX_PART_STRING T_OPEN_P expr (T_COMMA expr (T_COMMA expr T_EQUAL expr)*)? T_CLOSE_P
    |   T_MIN_PART_STRING T_OPEN_P expr (T_COMMA expr (T_COMMA expr T_EQUAL expr)*)? T_CLOSE_P
    |   T_MAX_PART_INT T_OPEN_P expr (T_COMMA expr (T_COMMA expr T_EQUAL expr)*)? T_CLOSE_P
    |   T_MIN_PART_INT T_OPEN_P expr (T_COMMA expr (T_COMMA expr T_EQUAL expr)*)? T_CLOSE_P
    |   T_MAX_PART_DATE T_OPEN_P expr (T_COMMA expr (T_COMMA expr T_EQUAL expr)*)? T_CLOSE_P
    |   T_MIN_PART_DATE T_OPEN_P expr (T_COMMA expr (T_COMMA expr T_EQUAL expr)*)? T_CLOSE_P
    |   T_PART_COUNT T_OPEN_P expr (T_COMMA expr T_EQUAL expr)* T_CLOSE_P
    |   T_PART_LOC T_OPEN_P expr (T_COMMA expr T_EQUAL expr)+ (T_COMMA expr)? T_CLOSE_P
    |   T_TRIM T_OPEN_P expr T_CLOSE_P
    |   T_SUBSTRING T_OPEN_P expr T_FROM expr (T_FOR expr)? T_CLOSE_P
    |   T_SYSDATE
    |   T_USER
    ;

expr_func :
        ident T_OPEN_P expr_func_params? T_CLOSE_P
    ;

expr_func_params :
        func_param (T_COMMA func_param)*
    ;

func_param :
        {!_input.LT(1).getText().equalsIgnoreCase("INTO")}? (ident T_EQUAL T_GREATER?)? expr
    ;

write_stmt:
        T_WRITE T_OPEN_P  write_stmt_string T_CLOSE_P T_SEMICOLON?
    ;

write_stmt_string:
        (string | ident) ('+' (string | ident))*
    ;

// DATE 'YYYY-MM-DD' literal
date_literal :
        T_DATE string
    ;

// TIMESTAMP 'YYYY-MM-DD HH:MI:SS.FFF' literal
timestamp_literal :
        T_TIMESTAMP string
    ;

ident :
        (L_ID | non_reserved_words) ('.' (L_ID | non_reserved_words))*
    ;

// String literal (single or double quoted)
string :
        L_D_STRING                          # double_quotedString
    |   L_S_STRING                          # single_quotedString
    ;

// Integer (positive or negative)
int_number :
        ('-' | '+')? L_INT
    ;

// Decimal number (positive or negative)
dec_number :
        ('-' | '+')? L_DEC
    ;

// Boolean literal
bool_literal :
        T_TRUE
    |   T_FALSE
    ;

// NULL constant
null_const :
        T_NULL
    ;

// Tokens that are not reserved words and can be used as identifiers
non_reserved_words :
        T_ACTION
    |   T_ACTIVITY_COUNT
    |   T_AND
    |   T_AS
    |   T_ASC
    |   T_ASSOCIATE
    |   T_AT
    |   T_AUTO_INCREMENT
    |   T_AVG
    |   T_BEGIN
    |   T_BETWEEN
    |   T_BIGINT
    |   T_BINARY_DOUBLE
    |   T_BINARY_FLOAT
    |   T_BIT
    |   T_BODY
    |   T_BREAK
    |   T_BY
    |   T_BYTE
    |   T_CALL
    |   T_CASCADE
    |   T_CASE
    |   T_CASESPECIFIC
    |   T_CAST
    |   T_CHAR
    |   T_CHARACTER
    |   T_CHARSET
    |   T_CLOSE
    |   T_CLUSTERED
    |   T_CMP
    |   T_COLLECT
    |   T_COLLECTION
    |   T_COMMENT
    |   T_COMPRESS
    |   T_CONSTANT
    |   T_CONCAT
    |   T_CONDITION
    |   T_CONSTRAINT
    |   T_CONTINUE
    |   T_COUNT
    |   T_COUNT_BIG
    //|   T_CREATE
    |   T_CREATION
    |   T_CREATOR
    |   T_CS
    |   T_CUME_DIST
    |   T_CURRENT
    |   T_CURRENT_DATE
    |   T_CURRENT_TIMESTAMP
    |   T_CURRENT_USER
    |   T_DATA
    |   T_DATABASE
    |   T_DATE
    |   T_DATETIME
    |   T_DAY
    |   T_DAYS
    |   T_DEC
    |   T_DECIMAL
    |   T_DECLARE
    |   T_DEFAULT
    |   T_DEFERRED
    |   T_DEFINED
    |   T_DEFINER
    |   T_DEFINITION
    |   T_DELETE
    |   T_DELEMITER
    |   T_DELIMITED
    |   T_DENSE_RANK
    |   T_DESC
    |   T_DIR
    |   T_DISTINCT
    |   T_DISTRIBUTE
    |   T_DO
    |   T_DOUBLE
    |   T_DYNAMIC
    // T_ELSE reserved word
    // T_ELSEIF reserved word
    // T_ELSIF reserved word
    |   T_END
    |   T_ENABLE
    |   T_ENGINE
    |   T_ESCAPED
    |   T_EXCEPT
    |   T_EXEC
    |   T_EXECUTE
    |   T_EXCEPTION
    |   T_EXCLUSIVE
    |   T_EXISTS
    |   T_EXIT
    |   T_FALLBACK
    |   T_FALSE
    |   T_FIELDS
    |   T_FIRST_VALUE
    |   T_FLOAT
    |   T_FOR
    |   T_FOREIGN
    |   T_FORMAT
    |   T_FOUND
    |   T_FROM
    |   T_FULL
    |   T_FUNCTION
    |   T_GLOBAL
    |   T_GO
    |   T_GROUP
    |   T_HANDLER
    |   T_HASH
    |   T_HAVING
    |   T_IDENTITY
    |   T_IF
    |   T_IMMEDIATE
    |   T_IN
    |   T_INDEX
    |   T_INITRANS
    |   T_INNER
    |   T_INOUT
    |   T_INT
    |   T_INT2
    |   T_INT4
    |   T_INT8
    |   T_INTEGER
    |   T_INTERSECT
    |   T_INTERVAL
    |   T_INTO
    |   T_INVOKER
    |   T_ITEMS
    |   T_IS
    |   T_ISOPEN
    |   T_JOIN
    |   T_KEEP
    |   T_KEY
    |   T_KEYS
    |   T_LAG
    |   T_LANGUAGE
    |   T_LAST_VALUE
    |   T_LEAD
    |   T_LEAVE
    |   T_LEFT
    |   T_LIKE
    |   T_LIMIT
    |   T_LINES
    |   T_LOCAL
    |   T_LOCATION
    |   T_LOCATOR
    |   T_LOCATORS
    |   T_LOCKS
    |   T_LOG
    |   T_LOGGED
    |   T_LOGGING
    |   T_LOOP
    |   T_MAP
    |   T_MAX
    |   T_MAXTRANS
    |   T_MICROSECOND
    |   T_MICROSECONDS
    |   T_MIN
    |   T_MULTISET
    |   T_NCHAR
    |   T_NVARCHAR
    |   T_NO
    |   T_NOCOMPRESS
    |   T_NOLOGGING
    |   T_NOT
    |   T_NOTFOUND
    // T_NULL reserved word
    |   T_NUMERIC
    |   T_NUMBER
    |   T_ON
    |   T_ONLY
    |   T_OPEN
    |   T_OR
    |   T_ORDER
    |   T_OUT
    |   T_OUTER
    |   T_OVER
    |   T_OWNER
    |   T_PACKAGE
    |   T_PART_COUNT
    |   T_PART_LOC
    |   T_PARTITION
    |   T_PCTFREE
    |   T_PCTUSED
    |   T_PRECISION
    |   T_PRESERVE
    |   T_PRIMARY
    |   T_PROC
    |   T_PROCEDURE
    |   T_QUALIFY
    |   T_QUIT
    |   T_RANK
    |   T_REAL
    |   T_REFERENCES
    |   T_REGEXP
    |   T_RR
    |   T_REPLACE
    |   T_RESTRICT
    |   T_RESULT
    |   T_RESULT_SET_LOCATOR
    |   T_RETURN
    |   T_RETURNS
    |   T_REVERSE
    |   T_RIGHT
    |   T_RLIKE
    |   T_RS
    |   T_ROW
    |   T_ROWS
    |   T_ROW_COUNT
    |   T_ROW_NUMBER
    |   T_SCHEMA
    |   T_SECOND
    |   T_SECONDS
    |   T_SECURITY
    |   T_SEGMENT
    |   T_SEL
    |   T_SELECT
    |   T_SET
    |   T_SETS
    |   T_SHARE
    |   T_SIMPLE_DOUBLE
    |   T_SIMPLE_FLOAT
    |   T_SMALLDATETIME
    |   T_SMALLINT
    |   T_SQL
    |   T_SQLEXCEPTION
    |   T_SQLWARNING
    |   T_STEP
    |   T_STDEV
    |   T_STORAGE
    |   T_STORED
    |   T_STRING
    |   T_SUBSTRING
    |   T_SUM
    |   T_SYSDATE
    |   T_SYS_REFCURSOR
    |   T_TABLE
    |   T_TABLESPACE
    |   T_TEMPORARY
    |   T_TERMINATED
    |   T_TEXTIMAGE_ON
    |   T_THEN
    |   T_TIMESTAMP
    |   T_TITLE
    |   T_TO
    |   T_TOP
    |   T_TRIM
    |   T_TRUE
    // T_UNION reserved word
    |   T_UNIQUE
    |   T_UPDATE
    |   T_UR
    |   T_USE
    |   T_USER
    |   T_USING
    |   T_VALUE
    |   T_VALUES
    |   T_VAR
    |   T_VARCHAR
    |   T_VARCHAR2
    |   T_VARYING
    |   T_VARIANCE
    |   T_VOLATILE
    // T_WHEN reserved word
    // T_WHERE reserved word
    |   T_WHILE
    |   T_WITH
    |   T_WRITE
    |   T_XML
    |   T_YES

    ;

// Lexer rules
T_ACTION          : A C T I O N ;
T_ALL             : A L L ;
T_ALTER           : A L T E R ;
T_AND             : A N D ;
T_AS              : A S ;
T_ASC             : A S C ;
T_ASSOCIATE       : A S S O C I A T E ;
T_AT              : A T ;
T_AUTO_INCREMENT  : A U T O '_' I N C R E M E N T ;
T_AVG             : A V G ;
T_BEGIN           : B E G I N ;
T_BETWEEN         : B E T W E E N ;
T_BIGINT          : B I G I N T ;
T_BINARY_DOUBLE   : B I N A R Y '_' D O U B L E ;
T_BINARY_FLOAT    : B I N A R Y '_' F L O A T ;
T_BINARY_INTEGER  : B I N A R Y '_' I N T E G E R ;
T_BIT             : B I T ;
T_BODY            : B O D Y ;
T_BREAK           : B R E A K ;
T_BY              : B Y ;
T_BYTE            : B Y T E ;
T_CALL            : C A L L ;
T_CASCADE         : C A S C A D E ;
T_CASE            : C A S E ;
T_CASESPECIFIC    : C A S E S P E C I F I C ;
T_CAST            : C A S T ;
T_CHAR            : C H A R ;
T_CHARACTER       : C H A R A C T E R ;
T_CHARSET         : C H A R S E T ;
T_CLOSE           : C L O S E ;
T_CLUSTERED       : C L U S T E R E D;
T_CMP             : C M P ;
T_COLLECT         : C O L L E C T ;
T_COLLECTION      : C O L L E C T I O N ;
T_COMMENT         : C O M M E N T;
T_CONSTANT        : C O N S T A N T ;
T_COMMIT          : C O M M I T ;
T_COMPRESS        : C O M P R E S S ;
T_CONCAT          : C O N C A T;
T_CONDITION       : C O N D I T I O N ;
T_CONSTRAINT      : C O N S T R A I N T ;
T_CONTINUE        : C O N T I N U E ;
T_COUNT           : C O U N T ;
T_COUNT_BIG       : C O U N T '_' B I G;
T_CREATE          : C R E A T E ;
T_CREATION        : C R E A T I O N ;
T_CREATOR         : C R E A T O R ;
T_CS              : C S;
T_CURRENT         : C U R R E N T ;
T_DATABASE        : D A T A B A S E ;
T_DATA            : D A T A ;
T_DATE            : D A T E ;
T_DATETIME        : D A T E T I M E ;
T_DAY             : D A Y ;
T_DAYS            : D A Y S ;
T_DEC             : D E C ;
T_DECIMAL         : D E C I M A L ;
T_DECLARE         : D E C L A R E ;
T_DEFAULT         : D E F A U L T ;
T_DEFERRED        : D E F E R R E D ;
T_DEFINED         : D E F I N E D ;
T_DEFINER         : D E F I N E R ;
T_DEFINITION      : D E F I N I T I O N ;
T_DELETE          : D E L E T E ;
T_DELEMITER       : D E L E M I T I E R;
T_DELIMITED       : D E L I M I T E D ;
T_DESC            : D E S C ;
T_DIR             : D I R ;
T_DIRECTORY       : D I R E C T O R Y ;
T_DISTINCT        : D I S T I N C T ;
T_DISTRIBUTE      : D I S T R I B U T E ;
T_DO              : D O ;
T_DOUBLE          : D O U B L E ;
T_DROP            : D R O P ;
T_DYNAMIC         : D Y N A M I C ;
T_ELSE            : E L S E ;
T_ELSEIF          : E L S E I F ;
T_ELSIF           : E L S I F ;
T_ENABLE          : E N A B L E ;
T_END             : E N D ;
T_ENGINE          : E N G I N E ;
T_ESCAPED         : E S C A P E D ;
T_EXCEPT          : E X C E P T ;
T_EXEC            : E X E C ;
T_EXECUTE         : E X E C U T E ;
T_EXCEPTION       : E X C E P T I O N ;
T_EXCLUSIVE       : E X C L U S I V E ;
T_EXISTS          : E X I S T S ;
T_EXIT            : E X I T ;
T_FALLBACK        : F A L L B A C K ;
T_FALSE           : F A L S E ;
T_FIELDS          : F I E L D S ;
T_FLOAT           : F L O A T ;
T_FOR             : F O R ;
T_FOREIGN         : F O R E I G N ;
T_FORMAT          : F O R M A T ;
T_FOUND           : F O U N D ;
T_FROM            : F R O M ;
T_FULL            : F U L L ;
T_FUNCTION        : F U N C T I O N ;
T_GET             : G E T ;
T_GLOBAL          : G L O B A L ;
T_GO              : G O ;
T_GROUP           : G R O U P ;
T_HANDLER         : H A N D L E R ;
T_HASH            : H A S H ;
T_HAVING          : H A V I N G ;
T_HDFS            : H D F S ;
T_IDENTITY        : I D E N T I T Y ;
T_IF              : I F ;
T_IMMEDIATE       : I M M E D I A T E ;
T_IN              : I N ;
T_INDEX           : I N D E X ;
T_INITRANS        : I N I T R A N S ;
T_INNER           : I N N E R ;
T_INOUT           : I N O U T;
T_INSERT          : I N S E R T ;
T_INT             : I N T ;
T_INT2            : I N T '2';
T_INT4            : I N T '4';
T_INT8            : I N T '8';
T_INTEGER         : I N T E G E R ;
T_INTERSECT       : I N T E R S E C T ;
T_INTERVAL        : I N T E R V A L ;
T_INTO            : I N T O ;
T_INVOKER         : I N V O K E R ;
T_IS              : I S ;
T_ISOPEN          : I S O P E N ;
T_ITEMS           : I T E M S ;
T_JOIN            : J O I N ;
T_KEEP            : K E E P;
T_KEY             : K E Y ;
T_KEYS            : K E Y S ;
T_LANGUAGE        : L A N G U A G E ;
T_LEAVE           : L E A V E ;
T_LEFT            : L E F T ;
T_LIKE            : L I K E ;
T_LIMIT           : L I M I T ;
T_LINES           : L I N E S ;
T_LOCAL           : L O C A L ;
T_LOCATION        : L O C A T I O N ;
T_LOCATOR         : L O C A T O R ;
T_LOCATORS        : L O C A T O R S ;
T_LOCKS           : L O C K S ;
T_LOG             : L O G ;
T_LOGGED          : L O G G E D ;
T_LOGGING         : L O G G I N G ;
T_LOOP            : L O O P ;
T_MAP             : M A P ;
T_MAX             : M A X ;
T_MAXTRANS        : M A X T R A N S ;
T_MERGE           : M E R G E ;
T_MICROSECOND     : M I C R O S E C O N D ;
T_MICROSECONDS    : M I C R O S E C O N D S;
T_MIN             : M I N ;
T_MULTISET        : M U L T I S E T ;
T_NCHAR           : N C H A R ;
T_NVARCHAR        : N V A R C H A R ;
T_NO              : N O ;
T_NOCOMPRESS      : N O C O M P R E S S ;
T_NOLOGGING       : N O L O G G I N G ;
T_NOT             : N O T ;
T_NOTFOUND        : N O T F O U N D ;
T_NULL            : N U L L ;
T_NUMERIC         : N U M E R I C ;
T_NUMBER          : N U M B E R ;
T_ON              : O N ;
T_ONLY            : O N L Y ;
T_OPEN            : O P E N ;
T_OR              : O R ;
T_ORDER           : O R D E R;
T_OUT             : O U T ;
T_OUTER           : O U T E R ;
T_OVER            : O V E R ;
T_OWNER           : O W N E R ;
T_PACKAGE         : P A C K A G E ;
T_PARTITION       : P A R T I T I O N ;
T_PCTFREE         : P C T F R E E ;
T_PCTUSED         : P C T U S E D ;
T_PLS_INTEGER     : P L S '_' I N T E G E R ;
T_PRECISION       : P R E C I S I O N ;
T_PRESERVE        : P R E S E R V E ;
T_PRIMARY         : P R I M A R Y ;
T_PROC            : P R O C ;
T_PROCEDURE       : P R O C E D U R E ;
T_QUALIFY         : Q U A L I F Y ;
T_QUIT            : Q U I T ;
T_REAL            : R E A L ;
T_REFERENCES      : R E F E R E N C E S ;
T_REGEXP          : R E G E X P ;
T_REPLACE         : R E P L A C E ;
T_RESTRICT        : R E S T R I C T ;
T_RESULT          : R E S U L T ;
T_RESULT_SET_LOCATOR : R E S U L T '_' S E T '_' L O C A T O R ;
T_RETURN          : R E T U R N ;
T_RETURNS         : R E T U R N S ;
T_REVERSE         : R E V E R S E ;
T_RIGHT           : R I G H T ;
T_RLIKE           : R L I K E ;
T_ROW             : R O W ;
T_ROWS            : R O W S ;
T_ROW_COUNT       : R O W '_' C O U N T ;
T_RR              : R R;
T_RS              : R S ;
T_TRIM            : T R I M ;
T_SCHEMA          : S C H E M A ;
T_SECOND          : S E C O N D ;
T_SECONDS         : S E C O N D S;
T_SECURITY        : S E C U R I T Y ;
T_SEGMENT         : S E G M E N T ;
T_SEL             : S E L ;
T_SELECT          : S E L E C T ;
T_SET             : S E T ;
T_SETS            : S E T S;
T_SHARE           : S H A R E ;
T_SIMPLE_DOUBLE   : S I M P L E '_' D O U B L E ;
T_SIMPLE_FLOAT    : S I M P L E '_' F L O A T ;
T_SIMPLE_INTEGER  : S I M P L E '_' I N T E G E R ;
T_SMALLDATETIME   : S M A L L D A T E T I M E ;
T_SMALLINT        : S M A L L I N T ;
T_SQL             : S Q L ;
T_SQLEXCEPTION    : S Q L E X C E P T I O N ;
T_SQLWARNING      : S Q L W A R N I N G ;
T_STEP            : S T E P ;
T_STORAGE         : S T O R A G E ;
T_STORED          : S T O R E D ;
T_STRING          : S T R I N G ;
T_SUBSTRING       : S U B S T R I N G ;
T_SUM             : S U M ;
T_SYS_REFCURSOR   : S Y S '_' R E F C U R S O R ;
T_TABLE           : T A B L E ;
T_TABLESPACE      : T A B L E S P A C E ;
T_TEMPORARY       : T E M P O R A R Y ;
T_TERMINATED      : T E R M I N A T E D ;
T_TEXTIMAGE_ON    : T E X T I M A G E '_' O N ;
T_THEN            : T H E N ;
T_TIMESTAMP       : T I M E S T A M P ;
T_TINYINT         : T I N Y I N T ;
T_TITLE           : T I T L E ;
T_TO              : T O ;
T_TOP             : T O P ;
T_TRUE            : T R U E ;
T_TYPE            : T Y P E ;
T_UNION           : U N I O N ;
T_UNIQUE          : U N I Q U E ;
T_UPDATE          : U P D A T E ;
T_UR              : U R ;
T_USE             : U S E ;
T_USING           : U S I N G ;
T_VALUE           : V A L U E ;
T_VALUES          : V A L U E S ;
T_VAR             : V A R ;
T_VARCHAR         : V A R C H A R ;
T_VARCHAR2        : V A R C H A R '2' ;
T_VARYING         : V A R Y I N G ;
T_VOLATILE        : V O L A T I L E ;
T_WHEN            : W H E N ;
T_WHERE           : W H E R E ;
T_WHILE           : W H I L E ;
T_WITH            : W I T H ;
T_WORK            : W O R K ;
T_XML             : X M L ;
T_YES             : Y E S ;

// Functions with specific syntax
T_ACTIVITY_COUNT       : A C T I V I T Y '_' C O U N T ;
T_CUME_DIST            : C U M E '_' D I S T ;
T_CURRENT_DATE         : C U R R E N T '_' D A T E ;
T_CURRENT_TIMESTAMP    : C U R R E N T '_' T I M E S T A M P ;
T_CURRENT_USER         : C U R R E N T '_' U S E R ;
T_DENSE_RANK           : D E N S E '_' R A N K ;
T_FIRST_VALUE          : F I R S T '_' V A L U E;
T_LAG                  : L A G ;
T_LAST_VALUE           : L A S T '_' V A L U E;
T_LEAD                 : L E A D ;
T_MAX_PART_STRING      : M A X '_' P A R T '_' S T R I N G ;
T_MIN_PART_STRING      : M I N '_' P A R T '_' S T R I N G ;
T_MAX_PART_INT         : M A X '_' P A R T '_' I N T ;
T_MIN_PART_INT         : M I N '_' P A R T '_' I N T ;
T_MAX_PART_DATE        : M A X '_' P A R T '_' D A T E ;
T_MIN_PART_DATE        : M I N '_' P A R T '_' D A T E ;
T_PART_COUNT           : P A R T '_' C O U N T ;
T_PART_LOC             : P A R T '_' L O C ;
T_RANK                 : R A N K ;
T_ROW_NUMBER           : R O W '_' N U M B E R;
T_STDEV                : S T D E V ;
T_SYSDATE              : S Y S D A T E ;
T_VARIANCE             : V A R I A N C E ;
T_USER                 : U S E R;
T_WRITE                : W R I T E;


T_ADD          : '+' ;
T_COLON        : ':' ;
T_COMMA        : ',' ;
T_PIPE         : '||' ;
T_DIV          : '/' ;
T_DOT2         : '..' ;
T_EQUAL        : '=' ;
T_EQUAL2       : '==' ;
T_NOTEQUAL     : '<>' ;
T_NOTEQUAL2    : '!=' ;
T_GREATER      : '>' ;
T_GREATEREQUAL : '>=' ;
T_LESS         : '<' ;
T_LESSEQUAL    : '<=' ;
T_MUL          : '*' ;
T_OPEN_B       : '{' ;
T_OPEN_P       : '(' ;
T_OPEN_SB      : '[' ;
T_CLOSE_B      : '}' ;
T_CLOSE_P      : ')' ;
T_CLOSE_SB     : ']' ;
T_SEMICOLON    : ';' ;
T_SUB          : '-' ;

L_ID        : L_ID_PART                                                // Identifier
            ;
L_S_STRING  : '\'' (('\'' '\'') | ('\\' '\'') | ~('\''))* '\''         // Single quoted string literal
            ;
L_D_STRING  : '"' (L_STR_ESC_D | .)*? '"'                              // Double quoted string literal
            ;
L_INT       : L_DIGIT+ ;                                               // Integer
L_DEC       : L_DIGIT+ '.' ~'.' L_DIGIT*                               // Decimal number
            | '.' L_DIGIT+
            ;
L_WS        : L_BLANK+ -> skip ;                                       // Whitespace
L_M_COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;                       // Multiline comment
L_S_COMMENT : ('--' | '//')  .*? '\r'? '\n' -> channel(HIDDEN) ;       // Single line comment

L_FILE      : ([a-zA-Z] ':' '\\'?)? L_ID ('\\' L_ID)*                  // File path (a/b/c Linux path causes conflicts with division operator and handled at parser level)
            ;

L_LABEL     : ([a-zA-Z] | L_DIGIT | '_')* ':'
            ;


fragment
L_ID_PART  :
             [a-zA-Z] ([a-zA-Z] | L_DIGIT | '_')*                           // Identifier part
            | '$' '{' .*? '}'
            | ('_' | '@' | ':' | '#' | '$') ([a-zA-Z] | L_DIGIT | '_' | '@' | ':' | '#' | '$')+     // (at least one char must follow special char)
            | '"' .*? '"'                                                   // Quoted identifiers
            | '[' .*? ']'
            | '`' .*? '`'
            ;
fragment
L_STR_ESC_D :                                                          // Double quoted string escape sequence
              '""' | '\\"'
            ;
fragment
L_DIGIT     : [0-9]                                                    // Digit
            ;
fragment
L_BLANK     : (' ' | '\t' | '\r' | '\n')
            ;

//Support case-insensitive keywords and allowing case-sensitive identifiers
fragment A : ('a'|'A') ;
fragment B : ('b'|'B') ;
fragment C : ('c'|'C') ;
fragment D : ('d'|'D') ;
fragment E : ('e'|'E') ;
fragment F : ('f'|'F') ;
fragment G : ('g'|'G') ;
fragment H : ('h'|'H') ;
fragment I : ('i'|'I') ;
fragment J : ('j'|'J') ;
fragment K : ('k'|'K') ;
fragment L : ('l'|'L') ;
fragment M : ('m'|'M') ;
fragment N : ('n'|'N') ;
fragment O : ('o'|'O') ;
fragment P : ('p'|'P') ;
fragment Q : ('q'|'Q') ;
fragment R : ('r'|'R') ;
fragment S : ('s'|'S') ;
fragment T : ('t'|'T') ;
fragment U : ('u'|'U') ;
fragment V : ('v'|'V') ;
fragment W : ('w'|'W') ;
fragment X : ('x'|'X') ;
fragment Y : ('y'|'Y') ;
fragment Z : ('z'|'Z') ;
