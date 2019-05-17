package com.sqlcompiler.java;

import com.sqlcompiler.Environment;
import com.sqlcompiler.antlr.HplsqlParser;
import com.sqlcompiler.kotlin.Condition;
import com.sqlcompiler.kotlin.DesiredColumn;
import com.sqlcompiler.kotlin.Join;
import com.sqlcompiler.kotlin.Transform;
import com.sqlcompiler.stringtemplates.Templates;
import javaslang.Tuple2;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

import static com.sqlcompiler.java.DataType.SECONDARY_DATA_TYPE;

class AbstractSyntaxTree {
    SymbolTable symbolTable = new SymbolTable();
    private ParserRuleContext root = null;

    private int lastRule;
    private Stack<String> statements = new Stack<>();
    private Stack<Status> states = new Stack<>();
    private Status current;

    private ArrayList<Field> cppFunctionParam = null;
    private String typeCppFunction;

    private int currentDepth;
    Boolean isJoinStmt = false;
    Boolean isWhere = false;
    private Templates templates = new Templates();
    private String lastSingleInColumnsName;
    private String lastSetClause;
    private ArrayList<Condition> joinConditionColumns = new ArrayList<>();
    private ArrayList<String> joinCondition;
    private String joinSequence;
    private Join join;

    void build(RuleContext ctx) {
        root = (ParserRuleContext) ctx;
        buildHelper(ctx);
    }

    // TODO Left and Right outer join must add to where conditions (Left / Right) table id >=0 && < 0
    // TODO Full outer join must add to where conditions always true
    private void buildHelper(@NotNull RuleContext start) {
        Stack<RuleContext> queue = new Stack<>();
        queue.add(start);
        currentDepth = start.depth();

        while (!queue.isEmpty()) {
            RuleContext ctx = queue.pop();

            switch (ctx.getRuleIndex()) {
                // Create type
                case HplsqlParser.RULE_create_type_stmt:
                    if (!this.states.empty())
                        this.flush();
                    this.lastRule = HplsqlParser.RULE_create_table_stmt;
                    this.current = new CreateTypeStatus(null, this.templates.initCreateType(), SECONDARY_DATA_TYPE, ctx.getChild(2).getText());
                    //this.current = new CreateTypeStatus(null, "", SECONDARY_DATA_TYPE, ctx.getChild(2).getText());
                    this.states.add(this.current);
                    DataTypes.initialize(SECONDARY_DATA_TYPE, ctx.getChild(2).getText());
                    ((CreateTypeStatus) this.current).setName(ctx.getChild(2).getText());
                    break;

                // Create table
                case HplsqlParser.RULE_create_table_columns_item:
                    if (DataTypes.get(ctx.getChild(1).getText()) == null) {
                        System.err.println("Type " + ctx.getChild(1).getText() + " undefined");
                        System.exit(1);
                    }
                    break;
                case HplsqlParser.RULE_create_table_stmt:
                    if (!this.states.empty())
                        this.flush();
                    this.lastRule = HplsqlParser.RULE_create_table_stmt;
                    this.current = new CreateTypeStatus(null, this.templates.initCreateType(), SECONDARY_DATA_TYPE, ctx.getChild(2).getText());
                    //this.current = new CreateTypeStatus(null, "", SECONDARY_DATA_TYPE, ctx.getChild(2).getText());
                    this.states.add(this.current);

                    DataTypes.initialize(SECONDARY_DATA_TYPE, ctx.getChild(2).getText());
                    ((CreateTypeStatus) this.current).setName(ctx.getChild(2).getText());

                    for (int i = 0; i < ctx.getChild(3).getChild(1).getChildCount(); i++) {
                        if (i % 2 == 0) {
                            String nameField = ctx.getChild(3).getChild(1).getChild(i).getChild(0).getText();
                            String typeField = ctx.getChild(3).getChild(1).getChild(i).getChild(1).getText();
                            ((CreateTypeStatus) this.current).addField(new Field(nameField, typeField));
                        }
                    }
                    DataTypes.createSecondaryDataType(((CreateTypeStatus) this.current).getName(), ((CreateTypeStatus) this.current).getFields());
                    symbolTable.insert(new SymbolTable.Symbol(ctx.getChild(2).getText(),
                            "Table",
                            "table"), false);
                    break;

                case HplsqlParser.RULE_create_type_items_item:
                    DataTypes.addField(ctx.getChild(0).getText(), ctx.getChild(2).getText());
                    ((CreateTypeStatus) this.current).addField(new Field(ctx.getChild(0).getText(), ctx.getChild(2).getText()));
                    break;

                case HplsqlParser.RULE_create_table_store_location:
                case HplsqlParser.RULE_create_type_store_location:
                    System.out.println(ctx.getChildCount() / 2);
                    for (int i = 1; i < ctx.getChildCount(); i += 2) {
                        DataTypes.addLocation(ctx.getChild(i).getText());
                        ((CreateTypeStatus) this.current).addLocation(ctx.getChild(i).getText());
                    }
                    break;
                case HplsqlParser.RULE_create_table_delimiter:
                case HplsqlParser.RULE_create_type_delimiter:
                    System.out.println(ctx.getChild(2).getText());
                    DataTypes.setDelimiter(ctx.getChild(2).getText());
                    ((CreateTypeStatus) this.current).setDelimiter(ctx.getChild(2).getText());
                    break;
                // End create table & type

                // Select statement
                case HplsqlParser.RULE_fullselect_stmt:
                    if (isWhereSubquery()) {
                        System.err.println("where sub query");
                        this.current = new SelectStatus(this.current, this.templates.initSelect(), 4, this.lastSingleInColumnsName, null);
                    } else if (isFromSubquery()) {
                        System.err.println("from sub query");
                        this.current = new SelectStatus(this.current, this.templates.initSelect(), 2, null, null);
                    } else if (isCombineQuery()) {
                        System.err.println("combine");
                        this.current = new SelectStatus(this.current, this.templates.initSelect(), 16, null, this.lastSetClause);
                    } else {
                        if (!this.states.empty()) {
                            this.flush();
                        }
                        this.current = new SelectStatus(this.current, this.templates.initSelect(), 1, null, null);
                    }
                    this.lastRule = HplsqlParser.RULE_select_stmt;
                    this.states.push(this.current);
                    break;

                case HplsqlParser.RULE_fullselect_stmt_item:
                    break;

                case HplsqlParser.RULE_fullselect_set_clause:
                    this.lastRule = HplsqlParser.RULE_fullselect_set_clause;
                    handleSelectSetClause(ctx);
                    break;

                case HplsqlParser.RULE_subselect_stmt:
                    break;

                case HplsqlParser.RULE_select_list:
                    // handleSelectList(ctx);
                    break;
                case HplsqlParser.RULE_select_list_item:
                    handleSelectListItem(ctx);
                    break;
                case HplsqlParser.RULE_select_list_alias:
                    break;

                case HplsqlParser.RULE_select_list_asterisk:
                    break;

                case HplsqlParser.RULE_into_clause:
                    break;

                case HplsqlParser.RULE_from_clause:
                    break;

                case HplsqlParser.RULE_from_table_clause:
                    break;

                case HplsqlParser.RULE_from_table_name_clause:
                    handleFromTableNameClause(ctx);
                    break;

                case HplsqlParser.RULE_from_subselect_clause:
                    this.lastRule = HplsqlParser.RULE_from_subselect_clause;
                    break;

                case HplsqlParser.RULE_from_join_clause:
                    this.lastRule = HplsqlParser.RULE_from_join_clause;
                    handleFromJoinClause(ctx);
                    break;

                case HplsqlParser.RULE_from_join_type_clause:
                    // handleTypeJoin(ctx);
                    break;

                case HplsqlParser.RULE_from_table_values_clause:
                    break;

                case HplsqlParser.RULE_from_table_values_row:
                    break;

                case HplsqlParser.RULE_from_alias_clause:
                    break;

                case HplsqlParser.RULE_table_name:
                    break;


                case HplsqlParser.RULE_where_clause:
                    isJoinStmt = false;
                    isWhere = true;
                    this.lastRule = HplsqlParser.RULE_where_clause;
                    //handleWhereClause(ctx);

                    break;

                case HplsqlParser.RULE_bool_expr_is_not_null:
                    if (this.isCurrentStatementSelect()) {
                        handleIsNotNullWhereClause(ctx);
                    }
                    break;
                case HplsqlParser.RULE_bool_expr_between:
                    if (this.isCurrentStatementSelect()) {
                        handleBetweenWhereClause(ctx);
                    }
                    break;
                case HplsqlParser.RULE_bool_expr_exists:
                    if (this.isCurrentStatementSelect()) {
                        // handleExistsWhereClause(ctx);
                    }
                    break;
                case HplsqlParser.RULE_bool_expr_single_in:
                    this.lastRule = HplsqlParser.RULE_bool_expr_single_in;
                    /*if (this.isCurrentStatementSelect()) {
                        handleSingleInWhereClause(ctx);
                    }
                    // in with subquery
                    if (((RuleContext) ctx.getChild(3)).getRuleIndex() == HplsqlParser.RULE_select_stmt) {

                    }
                    // normal in
                    else {
                        String col = ctx.getChild(0).getText().replace('.', '_');
                        // ((SelectStatus) this.current).columnsWhereClause.add(col);
                        ((SelectStatus) this.current).whereSelectStmt += "( ";
                        for (int i = 3; i < ctx.getChildCount() - 1; i += 2) {
                            ((SelectStatus) this.current).whereSelectStmt += col + "==" + ctx.getChild(i).getText();
                            if (i != ctx.getChildCount() - 2)
                                ((SelectStatus) this.current).whereSelectStmt += " || ";
                        }
                        ((SelectStatus) this.current).whereSelectStmt += " )";


                    }*/
                    break;
                case HplsqlParser.RULE_bool_expr_multi_in:
                    if (this.isCurrentStatementSelect()) {
//                        handleMultiInWhereClause(ctx);
                    }
                    break;
                case HplsqlParser.RULE_bool_expr_binary:
                    if (isJoinStmt) {
                        handleJoinWhereCondition(ctx);
                    }
                    if (isWhere) {
                        handleWhereClause(ctx);
                    }
                    break;

                case HplsqlParser.RULE_bool_expr_logical_operator:
                    if (this.lastRule == HplsqlParser.RULE_where_clause) {
                        handleLogicalOperator(ctx);
                    } else if (lastRule == HplsqlParser.RULE_from_join_clause) {
                        this.join.setCondition(join.getCondition() + ctx.getText());
                    }
                    break;

                case HplsqlParser.RULE_group_by_clause:
                    handleGroupByClause(ctx);
                    break;

                case HplsqlParser.RULE_having_clause:
                    if (isValidBooleanExpression(ctx.getChild(1).getText())) {
                        System.err.println("Invalid Boolean Expression Having clause");
                    }
                    if (!isHavingContainAggFun(ctx.getChild(1).getText())) {
                        System.err.println("Having should contain only aggregation function");
                    }
                    break;

                case HplsqlParser.RULE_qualify_clause:
                    break;

                case HplsqlParser.RULE_order_by_clause:
                    handleOrderByClause(ctx);
                    break;

                case HplsqlParser.RULE_select_options:
                    break;

                case HplsqlParser.RULE_select_options_item:
                    break;
                // End select statement

                case HplsqlParser.RULE_cpp_scope:
                case HplsqlParser.RULE_begin_end_block:
                    handleNewScope(ctx);
                    break;
                case HplsqlParser.RULE_block_end:
                    symbolTable.setCurrentScope(symbolTable.getCurrentScope().parent);
                    break;
                case HplsqlParser.RULE_declare_var_item:
                    handleDeclareVariable(ctx);
                    break;
                case HplsqlParser.RULE_cpp_declare_stmt:
                    handleDeclareCppVariable(ctx);
                    break;

                case HplsqlParser.RULE_cpp_function_param:
                    handleCPPFunctionParam(ctx);
                    break;

                case HplsqlParser.RULE_expr_func:
                    handleExprFunc(ctx);
                    break;

                case HplsqlParser.RULE_cpp_declare_assignment_stmt:
                    handleCPPDeclareAssignmentStmt(ctx);
                    break;

                case HplsqlParser.RULE_cpp_assignment_stmt:
                case HplsqlParser.RULE_assignment_stmt_single_item:
                    handleAssignmentSingleItemStmt(ctx);
                    break;

                case HplsqlParser.RULE_create_procedure_stmt:
                    symbolTable.insert(new SymbolTable.Symbol(ctx.getChild(2).getText(), "", ctx.getChild(1).getText().toLowerCase()), true);
                    break;
                case HplsqlParser.RULE_create_function_stmt:
                    String type;
                    ArrayList<Field> fields = new ArrayList<>();
                    if (ctx.getChild(3).getChildCount() > 2) {
                        for (int i = 1; i < ctx.getChild(3).getChildCount(); i += 2) {
                            type = ctx.getChild(3).getChild(i).getChild(1).getText();
                            type = plsql2Cpp(type);
                            fields.add(new Field(
                                    ctx.getChild(3).getChild(i).getChild(0).getText()
                                    , type));
                        }
                        symbolTable.insert(new SymbolTable.Symbol(
                                ctx.getChild(2).getText(),
                                ctx.getChild(4).getChild(1).getText(),
                                ctx.getChild(1).getText().toLowerCase(), fields), true);
                    } else symbolTable.insert(new SymbolTable.Symbol(
                            ctx.getChild(2).getText(),
                            ctx.getChild(3).getChild(1).getText(),
                            ctx.getChild(1).getText().toLowerCase()), true);
                    break;

                case HplsqlParser.RULE_cpp_function_stmt:
                    // get parameter function
                    cppFunctionParam = new ArrayList<>();
                    for (int i = 0; i < ctx.getChild(0).getChild(3).getChildCount(); i++) {
                        if (i % 2 == 0) {
                            cppFunctionParam.add(
                                    new Field(ctx.getChild(0).getChild(3).getChild(i).getChild(1).getText(),
                                            ctx.getChild(0).getChild(3).getChild(i).getChild(0).getText()));
                        }
                    }
                    typeCppFunction = ctx.getChild(0).getChild(0).getText();
                    symbolTable.insert(new SymbolTable.Symbol(ctx.getChild(0).getChild(1).getText(),
                            ctx.getChild(0).getChild(0).getText(), "function", cppFunctionParam), true);
                    break;
                case HplsqlParser.RULE_expr_func_params:
                    if (!ctx.parent.getChild(0).getText().equalsIgnoreCase("summarize")) {
                        boolean okay = true;
                        for (int i = 0; i < ctx.getChildCount(); i++) {
                            if (i % 2 == 0) {
                                if (!symbolTable.checkParampetersFunctionCpp(
                                        ctx.parent.getChild(0).getText(),
                                        ctx.getChild(i).getText(), i / 2)) {
                                    System.err.println("Error in the method's parameters ");
                                    okay = false;
                                }
                            }
                        }
                        if (okay) {
                            int coutnParameters = ctx.getChildCount() + 1 / 2;
                            if (symbolTable.AllSymbol.get(
                                    ctx.parent.getChild(0).getText()).getLocalField().size()
                                    > coutnParameters) {
                                System.err.println("Error in the method's parameters ");
                            }

                        }
                    }
                    break;
                case HplsqlParser.RULE_cpp_return_stmt:
                    try {
                        symbolTable.getValueWithCasting(ctx.getChild(1).getText(), typeCppFunction);
                    } catch (Exception e) {
                        System.err.println("Error  return type doesn't match ");
                    }
                    break;
                //Boolean semantic check
                case HplsqlParser.RULE_cpp_if_stmt:
                    if (isValidBooleanExpression(ctx.getChild(2).getText())) {
                        System.err.println("Invalid Boolean Expression if clause");
                    }
                    break;
                case HplsqlParser.RULE_cpp_for_stmt_header:
                    if (isValidBooleanExpression(ctx.getChild(4).getText())) {
                        System.err.println("Invalid Boolean Expression for clause");
                    }
                    break;
                case HplsqlParser.RULE_cpp_for_param:
                    symbolTable.nameSymbols.add(ctx.getChild(1).getText());
                    symbolTable.insert(new SymbolTable.Symbol(ctx.getChild(1).getText(),
                            ctx.getChild(0).getText(), "",
                            ctx.getChild(3).getText(), true), false);
                    break;
                case HplsqlParser.RULE_expr_agg_window_func:

                    break;
            }

            if (ctx.getChildCount() == 1) {
                ParseTree temp = ctx;
                while (temp.getChildCount() == 1)
                    temp = temp.getChild(0);

                for (int i = 0; i < ctx.getParent().getChildCount(); i++) {
                    if (ctx.getParent().getChild(i) == ctx) {
                        temp.setParent(ctx.getParent());
                        ParserRuleContext parent = (ParserRuleContext) ctx.getParent();
                        parent.children.set(i, temp);
                    }
                }
            }

            if (currentDepth > ctx.depth()) {
                symbolTable.free();
            }
            for (int i = ctx.getChildCount() - 1; i >= 0; i--) {
                ParseTree element = ctx.getChild(i);
                if (element instanceof RuleContext) {
                    queue.add((RuleContext) element);
                }
            }
            //this.lastRule = ctx.getRuleIndex();
        }

        while (!this.states.isEmpty()) {
            System.out.println("Flush");
            flush();
        }

        File file = new File(Environment.KOTLIN + "main2.kt");
        DataOutputStream stream = null;
        try {
            file.createNewFile();
            stream = new DataOutputStream(new FileOutputStream(file));
            stream.writeBytes(this.templates.calculateAll(this.statements));
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        symbolTable.isUnassignedVariable();
        DataTypes.save(Environment.DATA_TYPES_PATH);
        checkExistGroupBy();
        if (isJoinStmt)
            ((SelectStatus) this.current).joins.add(this.join);
    }

    private String inWithoutSubSelect(RuleContext ctx) {
        /**SelectStatus status = ((SelectStatus) this.current);
         if (status.whereSelectStmt.contains("orand")) {
         status.whereSelectStmt = status.whereSelectStmt.replaceAll("orand", "and");
         } else if (status.whereSelectStmt.contains("andor")) {
         status.whereSelectStmt = status.whereSelectStmt.replaceAll("andor", "or");
         } else if (status.whereSelectStmt.contains("andand")) {
         status.whereSelectStmt = status.whereSelectStmt.replaceAll("andand", "and");
         } else if (status.whereSelectStmt.contains("oror")) {
         status.whereSelectStmt = status.whereSelectStmt.replaceAll("oror", "or");
         }
         if (ctx.parent.parent.parent.getChildCount() == 3) {
         status.whereSelectStmt += ctx.parent.parent.parent.getChild(1).getText();
         }*/
        String res = "";
        String column = ctx.getChild(0).getText();
        column = column.replace('.', '_');
        res += "( ";
        for (int i = 3; i < ctx.getChildCount() - 1; i += 2) {
            res += column + "=" + ctx.getChild(i).getText() + " ";
            if (i != ctx.getChildCount() - 2) {
                res += "or";
            }
        }
        res += " )";
        return res;

    }

    private void checkExistGroupBy() {
        if (!((SelectStatus) this.current).isExistGroupBy
                && ((SelectStatus) this.current).isColWithoutFun
                && ((SelectStatus) this.current).isExistAggregationFun) {
            System.err.println("Semantic Error doesn't exist group by");
            System.exit(1);
        }
    }

    private void handleJoinWhereCondition(RuleContext ctx) {
        SelectStatus status = ((SelectStatus) this.current);
        String left = ctx.getChild(0).getText();
        String op = ctx.getChild(1).getText();
        String right = ctx.getChild(2).getText();
        String type = "";

        SymbolTable.Symbol symbolLeft = null;
        SymbolTable.Symbol symbolRigth = null;
        if (left.contains("."))
            symbolLeft = symbolTable.AllSymbol.get(left.split("\\.")[0]);
        if (right.contains("."))
            symbolRigth = symbolTable.AllSymbol.get(left.split("\\.")[0]);

        if (symbolLeft != null) {
            type = symbolLeft.getType();
            left = symbolLeft.getValue();
        } else if (left.startsWith("\"") || left.startsWith("\'")) type = "string";
        if (symbolRigth != null) {
            type = symbolRigth.getType();
            right = symbolRigth.getValue();
        } else if (right.startsWith("\"") || right.startsWith("\'")) type = "string";
        if (isColumnName(left)) {
            left = left.replace('.', '_');
            //TODO this.join.getConditionColumns().add(left);
        }
        if (isColumnName(right)) {
            right = right.replace('.', '_');
            //TODO Add column to join
            // this.join.getConditionColumns().add(right);
        }
        if (type.equalsIgnoreCase("")) type = "number";

        String x = " x" + (this.join.getDefinitions().size() + 1);
        this.join.setCondition(this.join.getCondition() + x + " ");
        this.join.getDefinitions().add(new Condition(x, left, right, op, type));
    }

    private boolean isJoinWhereCondition() {
        return this.lastRule == HplsqlParser.RULE_from_join_clause;
    }

    private void handleLogicalOperator(@NotNull RuleContext ctx) {
        ((SelectStatus) this.current).whereSelectStmt += ctx.getText();
    }

    private void handleFromJoinClause(@NotNull RuleContext ctx) {
        String type = ctx.getChild(0).getText();
        String tableName;
        String tableAlias = "";
        {
            RuleContext context = (RuleContext) ctx.getChild(1).getChild(0);
            tableName = context.getChild(0).getText();
            if (context.getChildCount() == 2) {
                tableAlias = context.getChild(1).getText();
            }
        }
        if (isJoinStmt == false) {
            isJoinStmt = true;
            this.join = new Join(type, tableName, tableAlias, "",
                    new ArrayList<>());
        } else {
            ((SelectStatus) this.current).joins.add(this.join);
            this.joinConditionColumns = new ArrayList<>();
            this.joinCondition = new ArrayList<>();
            this.join = new Join(type, tableName, tableAlias, "", new ArrayList<>());
        }

        /*
        if (this.join != null) {
            this.join.setCondition(this.joinCondition);
            this.join.setConditionColumns(this.joinConditionColumns);
            ((SelectStatus) this.current).joins.add(this.join);
            this.join = null;
        }

        String type = ctx.getChild(0).getText();
        String tableName;
        String tableAlias = "";
        {
            RuleContext context = (RuleContext) ctx.getChild(1).getChild(0);
            tableName = context.getChild(0).getText();
            if (context.getChildCount() == 2) {
                tableAlias = context.getChild(1).getText();
            }
        }
        this.join = new Join(type, tableName, tableAlias, "", this.joinConditionColumns);*/
    }

    private String plsql2Cpp(@NotNull String type) {
        if (type.equalsIgnoreCase("number")) type = "int";
        else if (type.equalsIgnoreCase("varchar")) type = "string";
        else if (type.equalsIgnoreCase("varchar2")) type = "string";
        else if (type.equalsIgnoreCase("date")) type = "string";
        else if (type.equalsIgnoreCase("char")) type = "string";
        else if (type.equalsIgnoreCase("char")) type = "string";
        return type;
    }

    private void handleDeclareVariable(@NotNull RuleContext ctx) {
        String type = ctx.getChild(1).getText();
        type = plsql2Cpp(type);
        if (ctx.getChildCount() == 3) {
            symbolTable.nameSymbols.add(ctx.getChild(0).getText());
            symbolTable.insert(new SymbolTable.Symbol(
                    ctx.getChild(0).getText(),
                    type,
                    "",
                    symbolTable.getValueWithCasting(ctx.getChild(2).getChild(2).getText(), type),
                    true), false);
        } else {
            symbolTable.nameSymbols.add(ctx.getChild(0).getText());
            symbolTable.insert(new SymbolTable.Symbol(
                    ctx.getChild(0).getText(),
                    type, ""), false);
        }
    }

    private void handleTypeJoin(RuleContext ctx) {
        //TODO For uncle MOUAZ
        /**
         * select * from c left join ttt on  ttt.id= c.id
         * */
        if (ctx.getChildCount() == 1
                && !ctx.getText().equalsIgnoreCase("join")) {
            System.err.println("Error type \"" + ctx.getText() + "\" join");
            System.exit(1);
        } else if (ctx.getChildCount() == 2) {
            if (!ctx.getChild(1).getText().equalsIgnoreCase("join")) {
                System.err.println("Error type \"" + ctx.getChild(1).getText() + "\" join");
                System.exit(1);
            }
            if (!ctx.getChild(0).getText().equalsIgnoreCase("inner") &&
                    !ctx.getChild(0).getText().equalsIgnoreCase("left") &&
                    !ctx.getChild(0).getText().equalsIgnoreCase("right") &&
                    !ctx.getChild(0).getText().equalsIgnoreCase("full")
            ) {
                System.err.println("Error type \"" + ctx.getChild(0).getText() + "\" join");
                System.exit(1);
            }
        } else if (ctx.getChildCount() == 3 &&
                ctx.getChild(1).getText().equalsIgnoreCase("outer") &&
                (ctx.getChild(0).getText().equalsIgnoreCase("left") ||
                        ctx.getChild(0).getText().equalsIgnoreCase("right") ||
                        ctx.getChild(0).getText().equalsIgnoreCase("full"))) {
            String leftColumn = ctx.parent.getChild(3).getChild(0).getChild(0).getChild(0).getText().replace('.', '_');
            String rightColumn = ctx.parent.getChild(3).getChild(0).getChild(0).getChild(2).getText().replace('.', '_');
            String condition = "";
            if (ctx.getChild(0).getText().equalsIgnoreCase("left")) {
                condition = leftColumn;
                condition = condition + " > 0";
            } else if (ctx.getChild(0).getText().equalsIgnoreCase("right")) {
                condition = rightColumn;
                condition = condition + " > 0";
            } else if (ctx.getChild(0).getText().equalsIgnoreCase("full")) {
                condition = leftColumn + " > 0 or " + rightColumn + " > 0 ";
            }
            ((SelectStatus) this.current).whereSelectStmt += condition + " or ";

        }

    }

    private void handleSelectSetClause(@NotNull RuleContext ctx) {
        String type = ctx.getChild(0).getText();
        if (ctx.getChildCount() == 2) {
            type += " " + ctx.getChild(1).getText();
        }
        this.lastSetClause = type;
    }

    private void handleOrderByClause(@NotNull RuleContext ctx) {
        SelectStatus status = (SelectStatus) this.current;
        for (int i = 2; i < ctx.getChildCount(); i += 2) {
            status.columnsOrderBy.add(ctx.getChild(i).getText().replace('.', '_'));
        }
    }

    private void handleSingleInWhereClause(@NotNull RuleContext ctx) {
        this.lastSingleInColumnsName = ctx.getChild(0).getText().replace('.', '_');
    }

    private void handleExistsWhereClause(RuleContext ctx) {
        // TODO
    }

    private void handleBetweenWhereClause(@NotNull RuleContext ctx) {
        String left = ctx.getChild(0).getText();
        String e1 = ctx.getChild(2).getText();
        String e2 = ctx.getChild(4).getText();
        if (ctx.parent.parent.parent.getChildCount() == 3)
            ((SelectStatus) this.current).whereSelectStmt += ctx.parent.parent.parent.getChild(1).getText();

        ((SelectStatus) this.current).whereSelectStmt =
                ((SelectStatus) this.current).whereSelectStmt.replaceAll(ctx.getText(), "");
        //((SelectStatus) this.current).columnsWhereClause.add(left.replace('.', '_'));
        ((SelectStatus) this.current).whereSelectStmt += "( " + left + " >= " + e1 + " and " + left + " <= " + e2 + " )";
    }

    private void handleIsNotNullWhereClause(@NotNull RuleContext ctx) {
        String left = ctx.getChild(0).getText();
        String op;
        String right;

        if (ctx.getChildCount() == 4) {
            op = "!=";
            right = "";
        } else {
            op = "=";
            right = "";
        }
        //((SelectStatus) this.current).columnsWhereClause.add(left.replace('.', '_'));
        // ((SelectStatus) this.current).columnsWhereClause.add(left.replace('.', '_'));
        ((SelectStatus) this.current).whereSelectStmt += left + " " + op + " " + right;
    }

    private void handleWhereClause(@NotNull RuleContext ctx) {
        SelectStatus status = ((SelectStatus) this.current);
        String left = ctx.getChild(0).getText();
        String op = ctx.getChild(1).getText();
        String right = ctx.getChild(2).getText();
        String type = "";

        SymbolTable.Symbol symbolLeft = null;
        SymbolTable.Symbol symbolRigth = null;
        if (left.contains("."))
            symbolLeft = symbolTable.AllSymbol.get(left.split("\\.")[0]);
        if (right.contains("."))
            symbolRigth = symbolTable.AllSymbol.get(left.split("\\.")[0]);

        if (symbolLeft != null) {
            type = symbolLeft.getType();
            left = symbolLeft.getValue();
        } else if (left.startsWith("\"") || left.startsWith("\'")) type = "string";
        if (symbolRigth != null) {
            type = symbolRigth.getType();
            right = symbolRigth.getValue();
        } else if (right.startsWith("\"") || right.startsWith("\'")) type = "string";
        if (isColumnName(left)) {
            left = left.replace('.', '_');
            //  ((SelectStatus) this.current).columnsWhereClause.add(left);
        }
        if (isColumnName(right)) {
            right = right.replace('.', '_');
            //  ((SelectStatus) this.current).columnsWhereClause.add(right);
        }
        if (type.equalsIgnoreCase("")) type = "number";
        String x = "x" + (status.columnsWhereClause.size() + 1);
        status.whereSelectStmt += " x" + status.columnsWhereClause.size() + " ";
        status.columnsWhereClause.add(new Condition(
                x,
                left,
                right,
                op,
                type
        ));
    }

    private boolean isColumnName(@NotNull String name) {
        int dot = name.indexOf('.');
        if (dot == -1) {
            return false;
        }
        return name.length() >= 3 &&
                dot < name.length() - 1 &&
                Character.isAlphabetic(name.charAt(0)) &&
                Character.isAlphabetic(name.charAt(dot + 1));
    }

    private boolean isCurrentStatementSelect() {
        if (this.states.size() > 0)
            return this.states.elementAt(0) instanceof SelectStatus;
        else return false;
    }

    private boolean isWhereSubquery() {
        return this.lastRule == HplsqlParser.RULE_bool_expr_single_in;
    }

    private boolean isFromSubquery() {
        return this.lastRule == HplsqlParser.RULE_from_subselect_clause;
    }

    private boolean isCombineQuery() {
        return this.lastRule == HplsqlParser.RULE_fullselect_set_clause;
    }

    private void flush() {
        this.current = this.states.pop();

        if (this.current instanceof SelectStatus) {
            //System.out.println("Flush select: <SelectStatus>");
            SelectStatus status = (SelectStatus) this.current;

            if (status.purpose == 1 || status.purpose == 8) {
                this.statements.add(status.key);
            }

            if (this.join != null) {
                status.joins.add(this.join);
            }

            if (status.whereSelectStmt.contains("orand")) {
                status.whereSelectStmt = status.whereSelectStmt.replaceAll("orand", "and");
                status.whereSelectStmt += "or";
            } else if (status.whereSelectStmt.contains("andor")) {
                status.whereSelectStmt = status.whereSelectStmt.replaceAll("andor", "or");
                status.whereSelectStmt += "and";
            } else if (status.whereSelectStmt.contains("andand")) {
                status.whereSelectStmt = status.whereSelectStmt.replaceAll("andand", "and");
                status.whereSelectStmt += "and";
            } else if (status.whereSelectStmt.contains("oror")) {
                status.whereSelectStmt = status.whereSelectStmt.replaceAll("oror", "or");
                status.whereSelectStmt += "or";
            }
            if (status.whereSelectStmt.startsWith("or"))
                status.whereSelectStmt = status.whereSelectStmt.substring(2);
            if (status.whereSelectStmt.startsWith("and"))
                status.whereSelectStmt = status.whereSelectStmt.substring(3);


            status.whereSelectStmt = status.whereSelectStmt.replaceAll("or", " || ");
            status.whereSelectStmt = status.whereSelectStmt.replaceAll("and", " && ");
            this.templates.flushSelectStatement(status.key,
                    status.tableSelectStmt,
                    status.desiredColumns,
                    "\"" + status.whereSelectStmt.replace('.', '_') + "\"" + calcWhereInSelectStmt(status).replace('.', '_'),
                    status.columnsWhereClause,
                    status.joins,
                    status.columnsGroupBy,
                    status.columnsOrderBy,
                    status.combineType,
                    status.combineSource != null ? this.templates.calculate(status.combineSource) : null,
                    status.distinct,
                    status.purpose);
        } else if (this.current instanceof CreateTypeStatus) {
            System.out.println("Flush select: <CreateTypeStatus>");
            CreateTypeStatus status = (CreateTypeStatus) this.current;
            this.templates.flushCreateTypeStatement(status.key, status.getName(), status.getFields(), status.getLocations(), status.getDelimiter());
        }
    }

    @NotNull
    private String calcWhereInSelectStmt(@NotNull SelectStatus status) {
        StringBuilder builder = new StringBuilder();

        System.err.println("Size" + status.key + " " + status.whereInKeys.size());
        for (int i = 0; i < status.whereInKeys.size(); i++) {
            Tuple2<String, String> w = status.whereInKeys.get(i);
            builder.append(" + smartSplit(\"").append(w._1).append("\", ").append(this.templates.calculate(w._2)).append("as String )");
        }
        return builder.toString();
    }

    private void handleAssignmentSingleItemStmt(@NotNull RuleContext ctx) {
        SymbolTable.Symbol symbol = symbolTable.lookup(ctx.getChild(0).getText());
        if (symbol == null) {
            System.err.println("Semantic error : variable " + ctx.getChild(0).getText() + " used before it's declared");
            System.exit(1);
        }
        SymbolTable.Symbol nSymbol = new SymbolTable.Symbol(symbol);
        nSymbol.setAssigned(true);
        nSymbol.setValue(ctx.getChild(2).getText());
        symbolTable.AllSymbol.replace(symbol.getName(), symbol, nSymbol);
    }

    private void handleCPPDeclareAssignmentStmt(@NotNull RuleContext ctx) {
        String value = ctx.getChild(3).getText();
        String type = ctx.getChild(0).getText();
        if (ctx.getChild(3).getChild(0).getChild(0).getChild(0).getChildCount() > 1) {
            value = "";
        } else
            value = symbolTable.getValueWithCasting(value, type);
        symbolTable.nameSymbols.add(ctx.getChild(1).getText());
        symbolTable.insert(new SymbolTable.Symbol(ctx.getChild(1).getText(),
                type, "",
                value, true), false);
    }

    private void handleExprFunc(@NotNull RuleContext ctx) {
        if (symbolTable.AllSymbol.get(ctx.getChild(0).getText()) == null) {
            System.err.println("Error for calling undeclared method : " + ctx.getChild(0).getText());
        }
    }

    private void handleCPPFunctionParam(@NotNull RuleContext ctx) {
        symbolTable.nameSymbols.add(ctx.getChild(1).getText());
        symbolTable.insert(new SymbolTable.Symbol(ctx.getChild(1).getText(), ctx.getChild(0).getText(), "", true), false);
    }

    private void handleDeclareCppVariable(@NotNull RuleContext ctx) {
        if (!ctx.getChild(0).getText().equalsIgnoreCase("begin")) {
            symbolTable.nameSymbols.add(ctx.getChild(1).getText());
            symbolTable.insert(new SymbolTable.Symbol(
                    ctx.getChild(1).getText(),
                    ctx.getChild(0).getText(), ""), false);
        }
    }

    private void handleNewScope(@NotNull RuleContext ctx) {
        symbolTable.allocate();
        currentDepth = ctx.depth();
    }

    private void handleGroupByClause(@NotNull RuleContext ctx) {
        SelectStatus status = (SelectStatus) this.current;
        status.isExistGroupBy = true;
        status.columnsGroupBy = new ArrayList<>();
        ArrayList<String> selectColumnTemp = new ArrayList<>();
        String col;
        for (DesiredColumn desiredColumn : status.desiredColumns) {
            if (desiredColumn.getFunctionName().equalsIgnoreCase(""))
                selectColumnTemp.add(desiredColumn.getColumnName());
        }
        for (int i = 2; i < ctx.getChildCount(); i++) {
            if (i % 2 == 0) {
                col = ctx.getChild(i).getText();
                if (ctx.getChild(i).getChild(0).getChildCount() > 1)
                    System.err.println("Error: group by clause can't contain grouping functions ");
                else {
                    status.columnsGroupBy.add(col.replace('.', '_'));
                    if (col.contains("."))
                        col = col.split("\\.")[1];
                    selectColumnTemp.remove(col);
                }
            }
        }
        if (selectColumnTemp.size() > 0)
            System.err.println("Missing group by list " + selectColumnTemp);
    }

    private void handleFromTableNameClause(@NotNull RuleContext ctx) {
        SelectStatus status = (SelectStatus) this.current;
        if (status.tableSelectStmt.equalsIgnoreCase(""))
            status.tableSelectStmt = ctx.getText();
        status.dataType = DataTypes.get(ctx.getText());
        if (status.dataType == null) {
            System.err.println("Semantic error : Table " + ctx.getChild(0).getChild(0).getText() + " used before it's declared");
            System.exit(1);
        }

        String result = status.dataType.checkColumnsStatus(status.desiredColumns, ctx.getText());
        if (result != null) {
            System.err.println("Semantic error column " + status.columnsNamesToString() + " doesn't exist in table");
            System.exit(1);
        }
        if (status.AllColumns) {
            for (Field field : status.dataType.getFields()) {
                status.desiredColumns.add(new DesiredColumn(field.getName(), status.dataType.getName(), "", "", false, new ArrayList<>()));
            }
        }
    }

    private boolean isValidBooleanExpression(String exp) {
        try {
            ScriptEngineManager sem = new ScriptEngineManager();
            ScriptEngine se = sem.getEngineByName("JavaScript");
            exp = exp.replaceAll("and", "&&");
            exp = exp.replaceAll("or", "||");
            exp = exp.replaceAll("not", "!");
            exp = exp.replaceAll("max|Max", " ");
            exp = exp.replaceAll("min|Min", " ");
            exp = exp.replaceAll("avg|Avg", " ");
            exp = exp.replaceAll("sum|Sum", " ");
            exp = exp.replaceAll("Count_Big|count_big", " ");
            exp = exp.replaceAll("Cume_Dist|cume_dist", " ");
            exp = exp.replaceAll("Dense_Rang|dense_rang", " ");
            exp = exp.replaceAll("First_Value|first_value", " ");
            exp = exp.replaceAll("Lag|lag", " ");
            exp = exp.replaceAll("Last_Value|last_value", " ");
            exp = exp.replaceAll("lead|Lead", " ");
            exp = exp.replaceAll("Rank|rank", " ");
            exp = exp.replaceAll("Row_Number|row_number", " ");
            exp = exp.replaceAll("Stdev|stdev", " ");
            exp = exp.replaceAll("Var|var", " ");
            exp = exp.replaceAll("Variance|variance", " ");
            exp = exp.replaceAll("Like|like", "==");
            exp = exp.replaceAll("count|Count", " ");
            exp = exp.replaceAll("[a-z]|[A-Z]", "1");
            se.eval(exp);
            //System.err.println(exp);
        } catch (ScriptException e) {
            return true;
        }
        return false;
    }

    private boolean isHavingContainAggFun(@NotNull String exp) {
        boolean okay = false;
        String[] sAnd = exp.split("and");
        for (String sa : sAnd) {
            String[] sOr = sa.split("or");
            for (String so : sOr) {
                if (so.contains("not(")) okay = true;
                if (so.contains("max(")) okay = true;
                if (so.contains("min(")) okay = true;
                if (so.contains("avg(")) okay = true;
                if (so.contains("sum(")) okay = true;
                if (so.contains("Count_Big(")) okay = true;
                if (so.contains("Cume_Dist(")) okay = true;
                if (so.contains("Dense_Rang(")) okay = true;
                if (so.contains("First_Value(")) okay = true;
                if (so.contains("Lag(")) okay = true;
                if (so.contains("count(")) okay = true;
            }
            if (!okay) return false;
            okay = false;
        }
        return true;
    }

    private void handleSelectListItem(@NotNull RuleContext ctx) {
        /*
        Example
        select c1, t.c2, max(c3), min(c) as m, t.c4 as alias1, c5 as alias2, c6=(select * from g) from t
        */
        /**
         * tableName_columnName as alias
         * tableName_columnName on function
         * tableName_columnName as alias && on function
         **/
        SelectStatus status = (SelectStatus) this.current;
        DesiredColumn column = new DesiredColumn();

        RuleContext context;

        switch (ctx.getChildCount()) {
            // Column without alias
            case 1:
                if (ctx.getChild(0).getChild(0).getChildCount() == 4 &&
                        ctx.getChild(0).getChild(0).getChild(0).getText().equalsIgnoreCase("summarize")) {
                    handleSummarize(ctx);
                    status.isExistAggregationFun = true;
                } else if (ctx.getChild(0).getChild(0).getText().equalsIgnoreCase("*")) {
                    handleAllColumn();
                    status.isColWithoutFun = true;
                } else
                    handleListItemColumnAndFunction((RuleContext) ctx.getChild(0).getChild(0), column);
                break;
            // Column with alias
            case 2:
                handleListItemColumnAndFunction((RuleContext) ctx.getChild(0).getChild(0), column);
                handleListItemColumnAlias((RuleContext) ctx.getChild(1), column);
                break;
            // Column subquery without alias
            case 3:
                context = (RuleContext) ctx.getChild(0);
                if (context.getChildCount() == 1) // ColumnName without TableName
                {
                    column.setColumnName(context.getChild(0).getText());
                } else // ColumnName with TableName
                {
                    column.setTableName(context.getChild(0).getText());
                    column.setColumnName(context.getChild(2).getText());
                }
                // TODO subquery
                break;
            // Column subquery with alias
            case 4:
                context = (RuleContext) ctx.getChild(0);
                if (context.getChildCount() == 1) // ColumnName without TableName
                {
                    column.setColumnName(context.getChild(0).getText());
                } else // ColumnName with TableName
                {
                    column.setTableName(context.getChild(0).getText());
                    column.setColumnName(context.getChild(2).getText());
                }
                handleListItemColumnAlias((RuleContext) ctx.getChild(3), column);
                break;
        }
        if (!column.getColumnName().equalsIgnoreCase(""))
            status.desiredColumns.add(column);
        /*
        if (!status.dataType.contains(column)) {
            System.err.println("Semantic error column " + column.getColumnName() + " doesn't exist in table");
            System.exit(1);
        }
        */
    }

    private void handleAllColumn() {
        ((SelectStatus) this.current).AllColumns = true;
    }

    private void handleSummarize(RuleContext ctx) {
        String name = ctx.getChild(0).getChild(0).getChild(2).getText();

        String colname;
        String tablename = "";
        if (name.contains(".")) {
            colname = (name.split("\\.")[1]);
            tablename = (name.split("\\.")[0]);
        } else colname = name;
        ArrayList<DesiredColumn> column = new ArrayList<>();
        column.add(new DesiredColumn(colname, "max", tablename, "", false, null));
        column.add(new DesiredColumn(colname, "min", tablename, "", false, null));
        column.add(new DesiredColumn(colname, "avg", tablename, "", false, null));
        column.add(new DesiredColumn(colname, "std", tablename, "", false, null));
        column.add(new DesiredColumn(colname, "count", tablename, "", false, null));
        column.add(new DesiredColumn(colname, "Q2", tablename, "", false, null));
        column.add(new DesiredColumn(colname, "Q3", tablename, "", false, null));
        column.add(new DesiredColumn(colname, "mode", tablename, "", false, null));
        column.add(new DesiredColumn(colname, "mean", tablename, "", false, null));
        column.add(new DesiredColumn(colname, "median", tablename, "", false, null));

        ((SelectStatus) this.current).desiredColumns.addAll(column);
    }

    private void handleFunctionParams(ArrayList<String> params, @NotNull RuleContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i += 2)
            params.add(ctx.getChild(i).getText().replace(".", "_"));
    }

    private void handleListItemColumnAndFunction(@NotNull RuleContext ctx, DesiredColumn column) {
        while (ctx.getChildCount() == 4 && ctx.getRuleIndex() == HplsqlParser.RULE_expr_func) {
            ArrayList<String> params = new ArrayList<>();
            handleFunctionParams(params, (RuleContext) ctx.getChild(2));

            column.addTransform(new Transform(ctx.getChild(0).getText(), params));
            ctx = (RuleContext) ctx.getChild(2).getChild(0).getChild(0).getChild(0);
        }

        if (ctx.getChildCount() == 1) { // Column doesn't has grouping function
            RuleContext context = (RuleContext) ctx.getChild(0);
            if (context.getChildCount() == 1) // ColumnName without TableName
            {
                column.setColumnName(context.getChild(0).getText());
            } else // ColumnName with TableName
            {
                ((SelectStatus) this.current).isColWithoutFun = true;
                column.setTableName(context.getChild(0).getText());
                column.setColumnName(context.getChild(2).getText());
            }
        } else if (ctx.getChildCount() == 4) { // Column has grouping function
            ((SelectStatus) this.current).isExistAggregationFun = true;
            column.setFunctionName(ctx.getChild(0).getText());

            RuleContext context = (RuleContext) ctx.getChild(2).getChild(0).getChild(0);
            if (context.getChildCount() == 1) {
                column.setColumnName(context.getChild(0).getText());
            } else {
                column.setTableName(context.getChild(0).getText());
                column.setColumnName(context.getChild(2).getText());
            }
        } else if (ctx.getChildCount() == 5) { // Column has grouping function and distinct
            column.setFunctionName(ctx.getChild(0).getText());
            column.setDistinct(true);
            ((SelectStatus) this.current).isExistAggregationFun = true;
            RuleContext context = (RuleContext) ctx.getChild(3).getChild(0).getChild(0);
            if (context.getChildCount() == 1) {
                column.setColumnName(context.getChild(0).getText());
            } else {
                column.setTableName(context.getChild(0).getText());
                column.setColumnName(context.getChild(2).getText());
            }
        }
    }

    private void handleListItemColumnAlias(@NotNull RuleContext ctx, @NotNull DesiredColumn column) {
        column.setColumnAlias(ctx.getChild(1).getText());
        ((SelectStatus) this.current).isColWithoutFun = true;
    }

    private ArrayList<String> getColumnsName() {
        ArrayList<String> columns = new ArrayList<>();
        for (DesiredColumn dc : ((SelectStatus) this.current).desiredColumns) {
            columns.add(dc.getColumnName());
        }
        return columns;
    }

    void print() {
        RuleContext ctx = root;
        //explore(ctx, 0);
    }

    private void explore(@NotNull RuleContext ctx, int indentation) {
        String ruleName = HplsqlParser.ruleNames[ctx.getRuleIndex()];
        String ws = "";
        for (int i = 0; i < indentation; i++) {
            ws = ws.concat("  ");
        }
        System.out.println(ws + ruleName);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                explore((RuleContext) element, indentation + 1);
            } else {
                System.out.println("  " + ws + element.getText());
            }
        }
    }
}