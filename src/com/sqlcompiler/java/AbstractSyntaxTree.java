package com.sqlcompiler.java;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;

class AbstractSyntaxTree {
    private ParserRuleContext root = null;

    void build(RuleContext ctx) {
        root = (ParserRuleContext) ctx;
        buildHelper(ctx, 0);
    }

    private void buildHelper(@NotNull RuleContext ctx, int indentation) {
        //String ruleName = HplsqlParser.ruleNames[ctx.getRuleIndex()];
        //System.out.println(ruleName);
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
        } else if (ctx.getChildCount() == 0) {
            System.out.println(ctx.getText());
        }
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                buildHelper((RuleContext) element, indentation + 1);
            }
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
