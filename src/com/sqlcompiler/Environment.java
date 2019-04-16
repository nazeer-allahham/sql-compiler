package com.sqlcompiler;

import java.util.Date;

public class Environment {
    public static String ANTLR = "src\\com\\sqlcompiler\\antlr\\";
    public static String JAVA = "src\\com\\sqlcompiler\\java\\";
    public static String KOTLIN = "src\\com\\sqlcompiler\\kotlin\\";

    public static String INPUT_PATH = "test.sql";

    public static String DATA_TYPES_PATH = "data_types.json";
    public static String TABLES_PATH = "tables\\";

    public static String OUTPUT = "output\\";
    public static String OUTPUT_FILE_NAME = Environment.OUTPUT + "output_" + new Date().toString().toLowerCase().replaceAll("[: ]", "_");
}