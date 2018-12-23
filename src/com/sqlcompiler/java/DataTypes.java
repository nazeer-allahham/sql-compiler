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

class DataTypes {

    private static HashMap<String, DataType> types = new HashMap<>();

    static void add(DataType type) {
        types.put(type.getName(), type);
    }

    static void delete(@NotNull DataType type) { types.remove(type.getName()); }

    static boolean isPrimitive(String typeName) {
        if (types.containsKey(typeName)) {
            return types.get(typeName).getRank() == 1;
        }
        return false;
    }

    @Nullable
    static DataType instance(String typeName) {
        if (types.containsKey(typeName)) {
            return types.get(typeName);
        }
        return null;
    }

    static String get(String typeName, int mode) {
        if (types.containsKey(typeName)) {
            return types.get(typeName).toString(mode);
        }
        return "";
    }

    static int count() {
        if(types == null)
            return -1;
        return types.size();
    }

    static void save(String path) {

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
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Data types save is completed successfully!");
    }

    static void restore(String path) {
        try {
            Gson gson = new Gson();
            DataTypes.types.clear();
            try {
                Type type = new TypeToken<HashMap<String, DataType>>(){}.getType();
                types = gson.fromJson(new InputStreamReader(new FileInputStream(new File(path))), type);
            }catch (JsonSyntaxException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Data types restore is completed successfully!");
    }
}
