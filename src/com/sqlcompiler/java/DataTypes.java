package com.sqlcompiler.java;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedList;

class DataTypes {
    static DataType currentType;
    private static HashMap<String, DataType> types = new HashMap<>();

    static void generateDefaultDataTypes() {
        createPrimaryDataType("int", "int");
        createPrimaryDataType("real", "real");
        createPrimaryDataType("string", "string");
        createPrimaryDataType("boolean", "boolean");
        createPrimaryDataType("var", "var");
    }

    static void createPrimaryDataType(String name, String type) {
        types.put(name, new DataType(DataType.PRIMARY_DATA_TYPE, name, type));
    }

    static void createSecondaryDataType(String name, Field... fields) {
        types.put(name, new DataType(DataType.SECONDARY_DATA_TYPE, name, fields));
    }

    static void createSecondaryDataType(String name, LinkedList<Field> fields) {
        types.put(name, new DataType(DataType.SECONDARY_DATA_TYPE, name, fields));
    }

    static void initialize(Integer rank, String name) {
        currentType = new DataType(rank, name);
        Console.log(currentType.hashCode());
        put(currentType);
    }

    static void put(DataType type) {
        types.put(type.getName(), type);
    }

    static void remove(@NotNull DataType type) {
        types.remove(type.getName());
    }

    static boolean primitive(String name) {
        return types.containsKey(name) && types.get(name).getRank() == DataType.PRIMARY_DATA_TYPE;
    }

    static DataType get(String name) {
        return types.getOrDefault(name, null);
    }

    static void addField(String name, String type) {
        currentType.addField(new Field(name, type));
    }

    static void addLocation(String location) {
        currentType.addLocation(location);
    }

    static int count() {
        return types.size();
    }

    static void save(String path) {
        Console.log(Console.open);

        Gson gson = new Gson();
        File file = new File(path);
        try {
            if(!file.exists()) {
                if(!file.createNewFile())
                    return;
            }
            FileOutputStream stream = new FileOutputStream(file);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stream, Charset.forName("UTF-8")));
            writer.write(gson.toJson(types));
            writer.close();
            //Console.log("Data types save is completed successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Console.log(Console.close);
    }

    static void restore(String path) {
        Console.log(Console.open);
        try {
            Gson gson = new Gson();
            types.clear();
            Type type = new TypeToken<HashMap<String, DataType>>(){}.getType();
            HashMap<String, DataType> temp = gson.fromJson(new InputStreamReader(new FileInputStream(new File(path))), type);
            if (temp != null)
                types = temp;
            //Console.log("Data types restore is completed successfully.");
        } catch (JsonSyntaxException | IOException e) {
            //e.printStackTrace();
        }
        Console.log(Console.close);
    }

    static void print() {
        /*Console.log(Console.open);
        for (String key : types.keySet()) {
            Console.log(types.get(key).toJson(DataType.DATA_TYPE_TO_STRING_FLAT));
        }
        Console.log(Console.close);*/
    }

    static void setDelimiter(String delimiter) {
        currentType.setDelimiter(delimiter);
    }
}
