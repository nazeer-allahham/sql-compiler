package com.sqlcompiler.java;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

public class DataType implements Serializable {

    static final int DATA_TYPE_TO_STRING = 0;
    static final int DATA_TYPE_TO_STRING_FLAT = 1;

    static final int PRIMARY_DATA_TYPE = 0;
    static final int SECONDARY_DATA_TYPE = 1;

    private int rank;
    private String name;
    private String delimiter = ",";
    private LinkedList<String> locations;
    private LinkedList<Field> fields;

    DataType(int rank, String name) {
        setName(toUnquotedString(name));
        setRank(rank);
        this.fields = new LinkedList<>();
        this.locations = new LinkedList<>();
    }

    DataType(int rank, String name, String type) {
        this(rank, name);
        this.fields.add(new Field(name, type));
    }

    DataType(int rank, String name, @NotNull Field... fields) {
        this(rank, name);
        for (Field field : fields) {
            addField(field);
        }
    }

    DataType(int rank, String name, LinkedList<Field> fields) {
        this(rank, name);
        setFields(fields);
    }

    static String toUnquotedString(@NotNull String string) {
        if (string.isEmpty()) {
            return "";
        }
        char first = string.charAt(0);
        char last = string.charAt(string.length() - 1);

        if (first == '\'' && last == '\'' || first == '"' && last == '"')
            return string.substring(1, string.length() - 1);
        return string;
    }

    void addField(Field field) {
        if (this.fields != null) {
            this.fields.add(field);
        }
    }

    void addLocation(String location) {
        if (this.locations != null) {
            this.locations.add(toUnquotedString(location));
        }
    }

    int getRank() {
        return this.rank;
    }

    void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = toUnquotedString(name);
    }

    public LinkedList<String> getLocations() {
        return this.locations;
    }

    public void setLocations(LinkedList<String> locations) {
        this.locations = locations;
    }

    public LinkedList<Field> getFields() {
        return this.fields;
    }

    public void setFields(LinkedList<Field> fields) {
        this.fields = fields;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = toUnquotedString(delimiter);
    }

    String getDelimiter() {
        return delimiter;
    }

    String checkColumnsStatus(ArrayList<DesiredColumn> columns) {
        if (columns == null) {
            return null;
        }
        boolean flag = false;
        StringBuilder result = new StringBuilder("[");
        for (DesiredColumn column : columns) {
            if (!this.contains(column)) {
                result.append(column.getColumnName()).append(", ");
                flag = true;
            }
        }
        // result.deleteCharAt(result.lastIndexOf(", "));
        result.append("]");
        return flag ? result.toString() : null;
    }


    @Override
    public String toString() {
        return "";
        //return this.toJson(DATA_TYPE_TO_STRING);
    }

    String toJson(int mode) {
        if (mode == DATA_TYPE_TO_STRING) {
            if (this.rank == DataType.PRIMARY_DATA_TYPE) {
                return this.fields.get(0).toString();
            }
            StringBuilder mString = new StringBuilder("{ ");
            for (Field attr : this.fields) {
                mString.append(attr.toString());
            }
            mString.append(" }");
            return mString.toString();
        } else {
            if (this.rank == DataType.PRIMARY_DATA_TYPE) {
                return this.fields.get(0).toJson(DATA_TYPE_TO_STRING_FLAT);
            }
            StringBuilder mString = new StringBuilder("{ ");
            for (Field attr : this.fields) {
                mString.append(attr.toJson(DATA_TYPE_TO_STRING_FLAT));
            }
            mString.append(" }");
            return mString.toString();
        }
    }

    boolean contains(DesiredColumn column) {
        if (!column.getNameTable().equals("") && !column.getNameTable().equalsIgnoreCase(this.name)) {
            System.out.println("false ");
            return false;
        }
        if (column.getColumnName().equals("*")) {
            return true;
        }
        String name = column.getColumnName();
        for (Field field : this.fields) {
            if (field.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}