package com.sqlcompiler.java;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.Objects;

public class Field implements Serializable {
    private String name;
    private String type;

    Field(@NotNull String name, @NotNull String type) {
        this.name = DataType.toUnquotedString(name);
        this.type = DataType.toUnquotedString(type);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof String) {
            System.out.println("Hello " + obj);
            return this.name.equalsIgnoreCase((String) obj);
        } else {
            Field field = (Field) obj;
            return this.name.equalsIgnoreCase(field.name) && this.type.equalsIgnoreCase(field.type);
        }
    }

    @Override
    public String toString() {
        return this.toJson(DataType.DATA_TYPE_TO_STRING);
    }

    String toJson(Integer mode) {
        if (DataTypes.primitive(this.type))
            return String.format("{ \"name\" => \"%s\", \"type\" => \"%s\" } ", this.name, this.type);
        else if (mode == DataType.DATA_TYPE_TO_STRING)
            return String.format(" { \"name\" => \"%s\", \"type\" => \"%s\", \"details\" => %s } ", this.name,
                                                                                                    this.type,
                                                                                                    Objects.requireNonNull(DataTypes.get(this.type)).toJson(DataType.DATA_TYPE_TO_STRING));
        else
        {
            DataType obj = DataTypes.get(this.type);
            if (obj == null)
                return "";
            StringBuilder mString = new StringBuilder();
            try {
                for (Field attr : obj.getFields())
                {
                    if (DataTypes.primitive(attr.type))
                        mString.append(String.format(" { \"name\" => \"%s_%s\", \"type\" => \"%s\" } ", this.name, attr.name, attr.type));
                    else
                        mString.append(Objects.requireNonNull(DataTypes.get(attr.type)).toJson(DataType.DATA_TYPE_TO_STRING_FLAT));
                }
            }
            catch (Exception e) {
                System.out.print("Error:"  + obj.getName());
            }
            return mString.toString();
        }
    }
}