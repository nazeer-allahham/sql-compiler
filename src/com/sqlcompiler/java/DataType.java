package com.sqlcompiler.java;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.LinkedList;

public class DataType implements Serializable {

    static final int DATA_TYPE_TO_STRING = 0;
    static final int DATA_TYPE_TO_STRING_FLAT = 1;

    static final int PRIMARY_DATA_TYPE = 0;
    static final int SECONDARY_DATA_TYPE = 1;
    private String name;
    private String location;

    private int rank;

    static String toUnquotedString(@NotNull String string) {
        char first = string.charAt(0);
        char last = string.charAt(string.length() - 1);

        if(first == '\'' && last == '\'')
            return string.substring(1, string.length() - 1);
        return string;
    }
    private LinkedList<Attribute> attributes;

    DataType(String name, int rank) {
        setName(name);
        setRank(rank);
        this.attributes = new LinkedList<>();
    }

    void addAttribute(Attribute attribute) {
        if(this.attributes != null)
        {
            this.attributes.add(attribute);
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = toUnquotedString(location);
    }

    private void setRank(int rank) {
        this.rank = rank;
    }

    private void setName(String name) {
        this.name = toUnquotedString(name);
    }

    String getName() {
        return name;
    }

    int getRank() {
        return rank;
    }

    LinkedList<Attribute> getAttributes() {
        return this.attributes;
    }

    void setAttributes(LinkedList<Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return this.toJson(DATA_TYPE_TO_STRING);
    }

    String toJson(int mode) {
        if(mode == DATA_TYPE_TO_STRING)
        {
            if (this.rank == DataType.PRIMARY_DATA_TYPE)
            {
                return this.attributes.get(0).toString();
            }
            StringBuilder mString = new StringBuilder("{ ");
            for (Attribute attr : this.attributes) {
                mString.append(attr.toString());
            }
            mString.append(" }");
            return mString.toString();
        }
        else
        {
            if (this.rank == DataType.PRIMARY_DATA_TYPE)
            {
                return this.attributes.get(0).toJson(DATA_TYPE_TO_STRING_FLAT);
            }
            StringBuilder mString = new StringBuilder("{ ");
            for (Attribute attr : this.attributes) {
                mString.append(attr.toJson(DATA_TYPE_TO_STRING_FLAT));
            }
            mString.append(" }");
            return mString.toString();
        }
    }
}