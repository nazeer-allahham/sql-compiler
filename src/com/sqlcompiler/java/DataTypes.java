package com.sqlcompiler.java;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedList;

import static com.sqlcompiler.java.DataType.PRIMARY_DATA_TYPE;
import static com.sqlcompiler.java.DataType.SECONDARY_DATA_TYPE;

class DataTypes {
    /**
      * TYPES
      **/
    private static HashMap<String, DataType> TYPES = new HashMap<>();
    private static DataType ITEM = null;


    static void generatePrimaryTypes() {
        DataTypes.createPrimaryType("int", "int");
        DataTypes.createPrimaryType("real", "float");
        DataTypes.createPrimaryType("string", "char[]");
        DataTypes.createPrimaryType("bool", "boolean");
        //System.out.println(TYPES.size());
    }

    static void createPrimaryType(String name, String type) {
        DataType dataType = new DataType(name, PRIMARY_DATA_TYPE);
        dataType.addAttribute(new Attribute(name, type));
        TYPES.put(name, dataType);
    }

    static void createSecondaryType(String name, Attribute ...attributes) {
        DataType dataType = new DataType(name, SECONDARY_DATA_TYPE);
        if (attributes != null) {
            for (Attribute attribute : attributes) {
                dataType.addAttribute(attribute);
            }
        }
        TYPES.put(name, dataType);
    }

    static void createSecondaryType(String name, LinkedList<Attribute> attributes) {
        DataType dataType = new DataType(name, SECONDARY_DATA_TYPE);
        dataType.setAttributes(attributes);
        TYPES.put(name, dataType);
    }

    private static void push(DataType dataType) {
        TYPES.put(dataType.getName(), dataType);
    }

    static void flush() {
        if (ITEM != null) {
            push(ITEM);
        }
    }

    static void initialize(Integer rank, String name) {
        flush();
        ITEM = new DataType(name, rank);
    }

    static void addAttribute(String name, String type) {
        ITEM.addAttribute(new Attribute(name, type));
    }

    static void delete(@NotNull DataType type) { TYPES.remove(type.getName()); }

    static boolean isPrimitive(String typeName) {
        if (TYPES.containsKey(typeName)) {
            return TYPES.get(typeName).getRank() == PRIMARY_DATA_TYPE;
        }
        return false;
    }

    @Nullable
    static DataType get(String typeName) {
        if (TYPES.containsKey(typeName)) {
            return TYPES.get(typeName);
        }
        return null;
    }

    static int count() {
        if(TYPES == null)
            return -1;
        return TYPES.size();
    }

    static void save(String path) {
        console.log(console.open);
        Gson gson = new Gson();
        File file = new File(path);
        try {
            if(!file.exists()) {
                if(!file.createNewFile())
                    return;
            }
            FileOutputStream stream = new FileOutputStream(file);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stream, Charset.forName("UTF-8")));
            writer.write(gson.toJson(TYPES));
            writer.close();
            console.log("Data types save is completed successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        console.log(console.close);
    }

    static void restore(String path) {
        console.log(console.open);
        try {
            Gson gson = new Gson();
            DataTypes.TYPES.clear();
            Type type = new TypeToken<HashMap<String, DataType>>(){}.getType();
            TYPES = gson.fromJson(new InputStreamReader(new FileInputStream(new File(path))), type);
            console.log("Data types restore is completed successfully.");
        } catch (JsonSyntaxException | IOException e) {
            e.printStackTrace();
        }
        console.log(console.close);
    }

    static void print() {
        console.log(console.open);
        for(String key : TYPES.keySet()) {
            console.log(TYPES.get(key).toJson(DataType.DATA_TYPE_TO_STRING_FLAT));
        }
        console.log(console.close);
    }
}