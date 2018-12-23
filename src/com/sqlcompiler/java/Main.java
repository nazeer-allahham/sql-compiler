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
  *  5- semi colon separate between each two statements in function
  *  6- for syntax
  *  7- min max ...
  *  8- if syntax
  *  9- aliases one word or one string
  **/

public class Main {

    public static void main(@NotNull String[] args)
    {
        new Main();
    }

    private Main()
    {
        try {
            CharStream input = CharStreams.fromFileName("E:\\ite-fourth-year\\compilers\\projects\\sql-compiler\\src\\com\\sqlcompiler\\antlr\\example.sql");

            HplsqlLexer lexer = new HplsqlLexer(input);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            HplsqlParser parser = new HplsqlParser(commonTokenStream);

            //
            //ParserRuleContext context = parser.program();
            //Trees.inspect(context, parser);

            MyListener listener = new MyListener();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, parser.program());

            DataTypes.save("my_data_types.json");

            System.out.printf("%d data type is detected\n", DataTypes.count());

//            DataTypes.restore("my_data_types.json");
//            System.out.println(DataTypes.get("user", DataType.DATA_TYPE_TO_STRING_FLAT));
        }catch (FileNotFoundException ex) {
           System.out.println(ex.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
