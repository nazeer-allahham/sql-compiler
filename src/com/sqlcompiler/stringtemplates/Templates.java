package com.sqlcompiler.stringtemplates;

import com.sqlcompiler.Environment;
import com.sqlcompiler.java.Field;
import com.sqlcompiler.kotlin.DesiredColumn;
import com.sqlcompiler.kotlin.Join;
import com.sqlcompiler.kotlin.Where;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Templates {
    private int selectID = 0;
    private int create_typeID = 0;
    private int queryID = 0;
    private int query_resultID = 0;

    private STGroup group;
    private HashMap<String, ST> templates;

    public Templates() {
        this.group = new STGroupDir(Environment.STRINGTEMPLATES);
        this.templates = new HashMap<>();
    }

    private void clear() {
        this.templates.clear();
    }

    public void init(String name) {
        this.clear();
        this.templates.put(name, this.group.getInstanceOf(name));
    }

    public String initSelect() {
        // this.clear();
        String KEY = "select_" + (++selectID);
        this.templates.put(KEY, this.group.getInstanceOf("select"));
        return KEY;
    }

    public String initCreateType() {
        String KEY = "create_type_" + (++create_typeID);
        this.templates.put(KEY, this.group.getInstanceOf("create"));
        return KEY;
    }

    public String initDeclareQuery() {
        String KEY = "query_" + (++queryID);
        this.templates.put(KEY, this.group.getInstanceOf("query"));
        return KEY;
    }

    public String initQueryResult() {
        String KEY = "query_" + (++query_resultID);
        this.templates.put(KEY, this.group.getInstanceOf("query_result"));
        return KEY;
    }

    public void flushSelectStatement(String key,
                                     String table,
                                     List<DesiredColumn> columns,
                                     List<Where> wheres,
                                     String subWheres,
                                     List<Join> joins,
                                     List<String> groupBy,
                                     List<String> orderBy,
                                     String combineType,
                                     String combineSource,
                                     Boolean distinct,
                                     Integer purpose) {
//        Console.INSTANCE.log(key,
//                table,
//                columns.toString(),
//                where,
//                whereColumns.toString(),
//                joins.toString(),
//                groupBy.toString(),
//                orderBy.toString(),
//                combineType,
//                combineSource,
//                distinct.toString(),
//                purpose.toString());

        for (DesiredColumn column : columns) {
            column.setColumnName(column.getTableName() + "_" + column.getColumnName());
        }

        this.add(key, "table", table);
        this.add(key, "columns", columns);
        this.add(key, "wheres", wheres);
        if (!subWheres.isEmpty())
            this.add(key, "subWheres", subWheres);
        this.add(key, "joins", joins);
        this.add(key, "groupBy", groupBy);
        this.add(key, "orderBy", orderBy);
        this.add(key, "combineType", combineType);
        this.add(key, "combineSource", combineSource);
        this.add(key, "distinct", distinct);
        this.add(key, "purpose", purpose);
    }

    public void flushCreateTypeStatement(String key,
                                         String name,
                                         List<Field> columns,
                                         List<String> locations,
                                         String delimiter) {
        System.out.println(name);
        System.out.println(columns);
        System.out.println(locations);
        System.out.println(delimiter);
        name = "\"" + name + "\"";
        delimiter = "\"" + delimiter + "\"";
        for (int i = 0; i < locations.size(); i++) {
            locations.set(i, "\"" + locations.get(i) + "\"");
        }

        this.add(key, "name", name);
        this.add(key, "columns", columns);
        this.add(key, "locations", locations);
        this.add(key, "delimiter", delimiter);
    }

    public void flushQueryStatement(String key,
                                    String mode,
                                    String variable,
                                    String query,
                                    String type) {
        if (mode.equals("declare")) {
            this.add(key, "declare", "declare");
        }
        this.add(key, "variable", variable);
        this.add(key, "query", query);
        this.add(key, "type", type);
    }

    public void flushQueryResultStatement(String key,
                                          String variable,
                                          String query,
                                          String type) {
        this.add(key, "variable", variable);
        this.add(key, "query", query);
        this.add(key, "type", type);
    }

    public void add(String name, String key, Object value) {
        ST template = this.templates.get(name);
        //System.out.println("template" + template);
        //System.out.println(key);
        template.add(key, value);
    }

    public void addColumns(ArrayList<String> columns) {
        this.add("select", "columns", columns);
    }

    public String calculate(String name) {
        return this.templates.get(name).render();
    }

    public String calculateAll() {
        /*StringBuilder builder = new StringBuilder();

        for (String key : this.templates.keySet()) {
            builder.append(this.calculate(key));
        }
        return builder.toString();*/

        ArrayList<String> instructions = new ArrayList<>();
        for (String key : this.templates.keySet()) {
            instructions.add(this.calculate(key));
        }

        ST program = this.group.getInstanceOf("program");
        program.add("instructions", instructions);
        return program.render();
    }

    public String calculateAll(Stack<String> keys) {
        ArrayList<String> instructions = new ArrayList<>();
        for (String key : keys) {
            instructions.add(this.calculate(key));
        }

        ST program = this.group.getInstanceOf("program");
        program.add("instructions", instructions);
        return program.render();
    }
}
