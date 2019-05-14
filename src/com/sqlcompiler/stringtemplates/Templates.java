package com.sqlcompiler.stringtemplates;

import com.sqlcompiler.Environment;
import com.sqlcompiler.java.DesiredColumn;
import com.sqlcompiler.java.Field;
import com.sqlcompiler.kotlin.Join;
import org.jetbrains.annotations.NotNull;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Templates {
    private int selectID = 0;

    private STGroup group;
    private HashMap<String, ST> templates;

    public Templates() {
        this.group = new STGroupDir(Environment.STRINGTEMPLATES);
        this.templates = new HashMap<>();
    }

    @NotNull
    public static <T> String IterableToString(@NotNull List<T> iterable) {
        StringBuilder builder = new StringBuilder();
        for (T e : iterable) {
            builder.append(e.toString());
        }
        return builder.toString();
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
        String KEY = "create_type_" + (++selectID);
        this.templates.put(KEY, this.group.getInstanceOf("create"));
        return KEY;
    }

    public void flushSelectStatement(String key,
                                     String table,
                                     List<DesiredColumn> columns,
                                     String where,
                                     List<String> whereColumns,
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
            column.setColumnName(column.getNameTable() + "_" + column.getColumnName());
        }

        this.add(key, "table", table);
        this.add(key, "columns", columns);
        this.add(key, "where", where);
        this.add(key, "conditions", whereColumns);
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

    public void add(String name, String key, Object value) {
        ST template = this.templates.get(name);
        System.out.println("template" + template);
        System.out.println(key);
        if (template.getAttribute(key) == null) {
            template.add(key, value);
        } else {
            String oldValue = (String) template.getAttribute(key);
            template.remove(key);
            template.add(key, oldValue + ", " + value);
        }
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
}
