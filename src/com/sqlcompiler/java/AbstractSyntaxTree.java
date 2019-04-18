package com.sqlcompiler.java;

import com.sqlcompiler.Environment;
import com.sqlcompiler.antlr.HplsqlParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import static com.sqlcompiler.java.DataType.SECONDARY_DATA_TYPE;

class AbstractSyntaxTree {
    SymbolTable symbolTable = new SymbolTable();
    private Integer lnCount = 1;
    private ParserRuleContext root = null;
    private LinkedList<Field> ColumnsCreateTable = null;
    ArrayList<String> columns = new ArrayList<>();
    private String nameAttribute, typeAttribute, nameTable;

    void build(RuleContext ctx) {
        root = (ParserRuleContext) ctx;
        buildHelper(ctx);
    }

    private void buildHelper(@NotNull RuleContext start) {
        LinkedList<RuleContext> queue = new LinkedList<>();
        queue.add(start);
        int currentDepth = start.depth();

        File file = new File(Environment.KOTLIN + "main.kt");
        DataOutputStream stream = null;


        try {
            file.createNewFile();
            stream = new DataOutputStream(new FileOutputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (!queue.isEmpty()) {
            RuleContext ctx = queue.pop();

            switch (ctx.getRuleIndex()) {
                case HplsqlParser.RULE_create_type_items_item:
                    DataTypes.addField(ctx.getChild(0).getText(), ctx.getChild(2).getText());
                    break;


                case HplsqlParser.RULE_create_table_store_location:
                    System.out.println(ctx.getChild(1).getText());
                    DataTypes.addLocation(ctx.getChild(1).getText());
                    break;

                case HplsqlParser.RULE_create_type_stmt:
                    DataTypes.initialize(SECONDARY_DATA_TYPE, ctx.getChild(2).getText());
                    break;

                case HplsqlParser.RULE_create_table_stmt:/**___create table __*/
                    DataTypes.initialize(SECONDARY_DATA_TYPE, ctx.getChild(2).getText());
                    nameTable = ctx.getChild(2).getText();
                    ColumnsCreateTable = new LinkedList<>();

                    for (int i = 0; i < ctx.getChild(3).getChild(1).getChildCount(); i++) {
                        if (i % 2 == 0) {
                            nameAttribute = ctx.getChild(3).getChild(1).getChild(i).getChild(0).getText();
                            typeAttribute = ctx.getChild(3).getChild(1).getChild(i).getChild(1).getText();
                            ColumnsCreateTable.add(new Field(nameAttribute, typeAttribute));
                        }
                    }
                    DataTypes.createSecondaryDataType(nameTable, ColumnsCreateTable);
                    symbolTable.insert(new SymbolTable.Symbol(ctx.getChild(2).getText(),
                            "Table",
                            "table"), false);
                    break;
                case HplsqlParser.RULE_select_list_item:
                    columns.add(ctx.getText());
                    //System.out.println(ctx.parent.getText()+"______________");
                    break;
                case HplsqlParser.RULE_cpp_scope:
                case HplsqlParser.RULE_begin_end_block:
                    symbolTable.allocate();
                    currentDepth = ctx.depth();
                    break;

                case HplsqlParser.RULE_declare_var_item:
                    symbolTable.nameSymbols.add(ctx.getChild(1).getText());
                    symbolTable.insert(new SymbolTable.Symbol(ctx.getChild(1).getText(),
                            ctx.getChild(0).getText(),
                            ""), false);
                    break;

                case HplsqlParser.RULE_cpp_declare_stmt:
                case HplsqlParser.RULE_cpp_function_param:
                    symbolTable.nameSymbols.add(ctx.getChild(1).getText());
                    symbolTable.insert(new SymbolTable.Symbol(ctx.getChild(1).getText(),
                            ctx.getChild(0).getText(),
                            ""), false);
                    break;
                case HplsqlParser.RULE_expr_func:
                    if (symbolTable.lookup(ctx.getChild(0).getText()) == null) {
                        System.err.println("Error for calling undeclared method : " + ctx.getChild(0).getText());
                    }
                    break;

                case HplsqlParser.RULE_cpp_declare_assignment_stmt:
                    symbolTable.nameSymbols.add(ctx.getChild(1).getText());
                    symbolTable.insert(new SymbolTable.Symbol(ctx.getChild(1).getText(),
                            ctx.getChild(0).getText(),
                            "", true), false);
                    try {
                        if (!symbolTable.checkCasting(ctx.getChild(0).getText(), symbolTable.AllSymbol.get(ctx.getChild(3).getText()).getType())) {
                            System.err.println("checkCasting");
                        }
                    }catch (Exception e){}

//                    String type = ctx.getChild(0).getText();
//                    if (symbolTable.CheckTypeCompatible(type, ctx.getChild(3).getText()))
//                        System.out.println("int is correct________________");
//                    else System.out.println("not correct ______________");
                    // TODO: 26/12/2018 Check if types are compatible
                    break;

                case HplsqlParser.RULE_from_table_name_clause:
                    DataType dataType = DataTypes.get(ctx.getText());
                    SymbolTable.Symbol symbol ;
                    if (dataType == null) {
                        System.err.println("Semantic error : variable " + ctx.getChild(0).getChild(0).getText() + " used before it's declared");
                        System.exit(1);
                    }
                    if ((columns = dataType.isContainColumns(columns)) != null) {
                        if (columns.size() > 1)
                            System.err.println("Semantic error columns  " + columns.toString() + "  doesn't exist in table");
                        else
                            System.err.println("Semantic error column  " + columns.toString() + "  doesn't exist in table");

                    }
                    break;
                case HplsqlParser.RULE_cpp_assignment_stmt:
                case HplsqlParser.RULE_assignment_stmt_single_item:
                    symbol = symbolTable.lookup(ctx.getChild(0).getText());
                    if (symbol == null) {
                        System.err.println("Semantic error : variable " + ctx.getChild(0).getText() + " used before it's declared");
                        System.exit(1);
                    }
                    SymbolTable.Symbol newsymbol = new SymbolTable.Symbol(symbol);
                    newsymbol.setAssigned(true);
                    symbolTable.AllSymbol.replace(symbol.getName(), symbol, newsymbol);
                    //TODO edit if symbol assignment

                    // TODO: 26/12/2018 Check if types are compatible
                    break;

                case HplsqlParser.RULE_create_procedure_stmt:
                    symbolTable.insert(new SymbolTable.Symbol(ctx.getChild(2).getText(), "", ctx.getChild(1).getText().toLowerCase()), true);
                    break;
                case HplsqlParser.RULE_create_function_stmt:
                    symbolTable.insert(new SymbolTable.Symbol(ctx.getChild(2).getText(),
                            // substring start from 7  to get the actual type value (miss return)
                            ctx.getChild(4).getText().substring(7),
                            ctx.getChild(1).getText().toLowerCase()), true);
                    break;

                case HplsqlParser.RULE_cpp_function_stmt:
                    symbolTable.insert(new SymbolTable.Symbol(ctx.getChild(0).getChild(1).getText(),
                            ctx.getChild(0).getChild(0).getText(), "function"), true);
                    break;

                case HplsqlParser.RULE_select_stmt:
//                    DataTypes.get(ctx.getChild(0).getText()).getPath();
                    try {
                        assert stream != null;
                        /*stream.writeBytes("package com.sqlcompiler.kotlin\n" +
                                "\n" +
                                "fun main() {\n" +
                                "    Handler.select()\n" +
                                "}");*/
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
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

            for (int i = 0; i < ctx.getChildCount(); i++) {
                ParseTree element = ctx.getChild(i);
                if (element instanceof RuleContext) {
                    queue.add((RuleContext) element);
                }
            }
        }
        try {
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        symbolTable.isUnassignedVariable();
        DataTypes.save(Environment.DATA_TYPES_PATH);
    }

    void print() {
        RuleContext ctx = root;
        explore(ctx, 0);
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