package com.sqlcompiler.java;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.LinkedList;

public class DataType implements Serializable {

    static final int DATA_TYPE_TO_STRING = 0;
    static final int DATA_TYPE_TO_STRING_FLAT = 1;

    public static class Attribute implements Serializable {
        private String name;
        private String type;

        Attribute(String name, String type) {
            if(name.charAt(0) == '\'' && name.charAt(name.length() - 1) == '\'')
                name = name.substring(1, name.length()-1);

            if(type.charAt(0) == '\'' && type.charAt(type.length() - 1) == '\'')
                type = type.substring(1, type.length()-1);

            this.name = name;
            this.type = type;
        }

        @Override
        public String toString() {

            if(DataTypes.isPrimitive(this.type))
                return String.format(" { \"name\" => \"%s\", \"type\" => \"%s\" } ", this.name, this.type);
            else
                return String.format(" { \"name\" => \"%s\", \"type\" => \"%s\", \"details\" => %s } ", this.name, this.type, DataTypes.get(this.type, DATA_TYPE_TO_STRING));
        }

        String toString(int mode) {

            if(mode == DATA_TYPE_TO_STRING || DataTypes.isPrimitive(this.type))
                return toString();
            else
            {
                DataType obj = DataTypes.instance(this.type);
                StringBuilder mString = new StringBuilder();
                assert obj != null;
                for(Attribute attr : obj.attributes)
                {
                    if(DataTypes.isPrimitive(attr.type))
                        mString.append(String.format(" { \"name\" => \"%s_%s\", \"type\" => \"%s\" } ", this.name, attr.name, attr.type));
                    else
                        mString.append(DataTypes.get(attr.type, DATA_TYPE_TO_STRING_FLAT));
                }
                return mString.toString();
            }
        }
    }

    private int scopeID;

    static void createSecondaryDataType(@NotNull String name, LinkedList<Attribute> attributes)
    {
        DataType mDataType = new DataType(name, 2);
        mDataType.attributes = attributes;

        DataTypes.add(mDataType);
    }

    private int                   rank;

    static void createPrimaryDataType(@NotNull String name, @NotNull String type) {
        DataType dt = new DataType(name, 1);
        dt.addAttribute(new Attribute(name, type));

        DataTypes.add(dt);
    }
    private String                name;
    private LinkedList<Attribute> attributes;

    private DataType(String name, int rank) {
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

    void setRank(int rank) {
        this.rank = rank;
    }

    private void setName(String name) {
        if(name.charAt(0) == '\'' && name.charAt(name.length() - 1) == '\'')
            name = name.substring(1, name.length()-1);
        this.name = name;
    }

    String getName() {
        return name;
    }

    int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        StringBuilder mString = new StringBuilder("{ ");
        for (Attribute attr : this.attributes) {
            mString.append(attr.toString());
        }
        mString.append(" }");
        return mString.toString();
    }

    String toString(int mode) {
        if(mode == DATA_TYPE_TO_STRING)
            return toString();
        else
        {
            StringBuilder mString = new StringBuilder("{ ");
            for (Attribute attr : this.attributes) {
                mString.append(attr.toString(DATA_TYPE_TO_STRING_FLAT));
            }
            mString.append(" }");
            return mString.toString();
        }
    }
}
