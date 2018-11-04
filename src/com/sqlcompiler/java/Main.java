package com.sqlcompiler.java;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.jetbrains.annotations.NotNull;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
  *  1- parenthesis.
  *  2- expected 'from' found 'form'
  *  3- invalid variable name
  *  4- begin end
  *  5- not defined variable
  *  6- semi colon separate between each two statements in function
  *  7- for syntax
  *  8- min max ...
  *  9- if syntax
  * 10- aliases one word or one string
  **/

public class Main {

    public static void main(@NotNull String[] args)
    {
        new Main();
        System.out.println("nazir allaham :)");
    }

    private Main()
    {
        try {
            CharStream input = CharStreams.fromFileName("E:\\ite-fourth-year\\compilers\\sql-compiler\\src\\com\\sqlcompiler\\antlr\\example.sql");

            HplsqlLexer lexer = new HplsqlLexer(input);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            HplsqlParser parser = new HplsqlParser(commonTokenStream);

            //
            //ParserRuleContext context = parser.program();
            //Trees.inspect(context, parser);

            MyListener listener = new MyListener();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, parser.program());

        }catch (FileNotFoundException ex) {
           System.out.println(ex.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}