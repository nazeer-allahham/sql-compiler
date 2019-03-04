package com.sqlcompiler.java;

import com.sqlcompiler.Environment;
import com.sqlcompiler.antlr.HplsqlLexer;
import com.sqlcompiler.antlr.HplsqlParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

class Compiler {
    static final int COMPILE = 1;
    static final int RETRIEVE_TYPES = 2;

    private CharStream          input = null;
    private HplsqlLexer         lexer = null;
    private CommonTokenStream   commonTokenStream = null;
    private HplsqlParser        parser = null;
    private AbstractSyntaxTree  AST = null;

    public Compiler(int mode) {
        if((mode & 1) != 0)
        {
            log("reading input file...");
            try {
                this.input = CharStreams.fromFileName(Environment.INPUT_PATH);
                log("reading has been finished successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if ((mode & 2) != 0) // then must retrieve data types
        {
            log("retrieving data types...");
            DataTypes.restore(Environment.DATA_TYPES_PATH);
            log(String.valueOf(DataTypes.count()), "data type has been retrieved");
        }
    }

    void lexical_analyzer() {

        this.lexer = new HplsqlLexer(input);
        this.commonTokenStream = new CommonTokenStream(lexer);
    }

    void parse() {
        this.parser = new HplsqlParser(commonTokenStream);
    }

    void semantic_analyzer() {
        /*
        MyListener listener = new MyListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
        */

        /*
        MyVisitor visitor = new MyVisitor();
        System.out.println(visitor.visitProgram(parser.program()));
        */

        this.AST = new AbstractSyntaxTree();
        this.AST.build(parser.program());
        this.AST.print();
    }

    void print() {
        System.out.printf("%d data type has been saved successfully.", DataTypes.count());
        this.AST.symbolTable.print();
    }

    private void log(@NotNull String ...args) {
        for (String arg : args) {
            System.out.printf("%s\t", arg);
        }
        System.out.println();
    }
}
