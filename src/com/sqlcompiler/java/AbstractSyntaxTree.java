package com.sqlcompiler.java;

import com.sqlcompiler.Environment;
import com.sqlcompiler.antlr.HplsqlParser;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;

import static com.sqlcompiler.java.DataType.SECONDARY_DATA_TYPE;

class AbstractSyntaxTree {
    SymbolTable symbolTable = new SymbolTable();
    private Integer lnCount = 1;
    private ParserRuleContext root = null;

    void build(RuleContext ctx) {
        root = (ParserRuleContext) ctx;
        buildHelper(ctx);

        DataTypes.flush();
    }

    private void buildHelper(@NotNull RuleContext start) {
        LinkedList<RuleContext> queue = new LinkedList<>();
        queue.add(start);
        int currentDepth = start.depth();

        File file = new File(Environment.KOTLIN + "main.kt");
        DataOutputStream stream = null;

        StringTemplate template = new StringTemplate("fun select(tables)");

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
                    DataTypes.addAttribute(ctx.getChild(0).getText(), ctx.getChild(2).getText());
                    break;

                case HplsqlParser.RULE_create_table_columns_item:
                    //System.out.print(ctx.getChild(0).getText() + " " + ctx.getChild(1).getText());
                    DataTypes.addAttribute(ctx.getChild(0).getText(), ctx.getChild(1).getText());
                    break;

                case HplsqlParser.RULE_create_table_store_location:
                    System.out.println(ctx.getChild(1).getText());
                    DataTypes.setStoreLocation(ctx.getChild(1).getText());
                    break;

                case HplsqlParser.RULE_create_type_stmt:
                case HplsqlParser.RULE_create_table_stmt:
                    DataTypes.initialize(SECONDARY_DATA_TYPE, ctx.getChild(2).getText());
                    break;

                case HplsqlParser.RULE_cpp_scope:
                case HplsqlParser.RULE_begin_end_block:
                    symbolTable.allocate();
                    currentDepth = ctx.depth();
                    break;

                case HplsqlParser.RULE_declare_var_item:
                    symbolTable.insert(new SymbolTable.Symbol(ctx.getChild(1).getText(),
                            ctx.getChild(0).getText(),
                            ""), false);
                    break;

                case HplsqlParser.RULE_cpp_declare_stmt:
                case HplsqlParser.RULE_cpp_function_param:
                    symbolTable.insert(new SymbolTable.Symbol(ctx.getChild(1).getText(),
                            ctx.getChild(0).getText(),
                            ""), false);
                    break;

                case HplsqlParser.RULE_cpp_declare_assignment_stmt:
                    symbolTable.insert(new SymbolTable.Symbol(ctx.getChild(1).getText(),
                            ctx.getChild(0).getText(),
                            ""), false);
                    // TODO: 26/12/2018 Check if types are compatible
                    break;

                case HplsqlParser.RULE_cpp_assignment_stmt:
                case HplsqlParser.RULE_assignment_stmt_single_item:
                    SymbolTable.Symbol symbol = symbolTable.lookup(ctx.getChild(0).getText());
                    if (symbol == null) {
                        System.err.println("Semantic error at line " + lnCount + ": variable " + ctx.getChild(0).getText() + " used before it's declared");
                        System.exit(1);
                    }
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
                        stream.writeBytes("package com.sqlcompiler.kotlin\n" +
                                "\n" +
                                "fun main() {\n" +
                                "    Handler.select()\n" +
                                "}");
                    } catch (IOException e) {
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
