package com.sqlcompiler.java;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class SymbolTable {
    private Scope currentScope;
    private boolean state;
    public HashMap<String, Symbol> AllSymbol = new HashMap<>();
    public ArrayList<String> nameSymbols = new ArrayList<>();

    SymbolTable() {
        currentScope = new Scope(null);
    }

    void allocate() {
        currentScope = new Scope(currentScope);
        if (state) {
            currentScope.parent.scopeChildren.put(currentScope.parent.lastChildName, currentScope);
        }
    }

    boolean isTypeCompatible(String type, String value) {
        try {
            type = type.toLowerCase();
        } catch (Exception e) {
        }
        if (isVariable(value)) {
            return isTypeCompatible(type, AllSymbol.get(value).getValue());
        }
        try {
            switch (type) {
                case "int":
                    Integer.parseInt(value);
                    break;
                case "real":
                    Float.parseFloat(value);
                    break;
                case "string":
                    return value.startsWith("\"") && value.endsWith("\"");
                case "boolean":
                    return value.equalsIgnoreCase("true")
                            || value.equalsIgnoreCase("false");
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    boolean isVariable(String value) {
        return AllSymbol.get(value) != null;
    }


    boolean checkCasting(String type1, String type2) {
        if (type2 == null)
            return true;
        return type1.charAt(0) >= type2.charAt(0);
    }

    String getValueWithCasting(String value, String type) {

        try {
            switch (type) {
                case "int":
                    if (value.startsWith("\"") && value.endsWith("\"")) {
                        value = value.replace("\"", "");
                        if (value.contains(".")) {
                            value = value.split("\\.")[0];
                        }

                    } else if (value.contains(".")) {
                        Float.parseFloat(value);
                        value = value.split("\\.")[0];
                    }
                    Integer.parseInt(value);
                    break;

                case "string":
                    if (!value.startsWith("\"")) {
                        value = "\"" + value;
                    }
                    if (!value.endsWith("\"")) {
                        value = value + "\"";
                    }
                    break;
                case "real":
                    value = value.replaceAll("\"", "");
                    Float.parseFloat(value);
                    if (!value.contains(".")) value = value + ".0";
                    break;
                case "boolean":
                    if (value.equalsIgnoreCase("true") || value.equalsIgnoreCase("false")) break;
                    value = value.replaceAll("\"", "");
                    value = value.split("\\.")[0];
                    Integer.parseInt(value);
                    if (value.matches("[1-9]")) value = "true";
                    else value = "false";
                    break;
            }
        } catch (Exception e) {
            System.err.println("Error: value = " + value + " can't be Casted to " + type);
        }
        return value;
    }

    void isUnassignedVariable() {
        for (Map.Entry<String, Symbol> symbolEntry : AllSymbol.entrySet()) {
            if (!symbolEntry.getValue().isAssigned && symbolEntry.getValue().getAttribute().equalsIgnoreCase("")) {
                System.err.println("Warring unassigned variable : " + symbolEntry.getValue().getName());
            }
        }

    }

    void free() {
        currentScope = currentScope.parent;
    }

    Symbol lookup(String name) {
        Scope temp = currentScope;
        do {
            if (temp.children.containsKey(name))
                return temp.children.get(name);
            temp = temp.parent;
        } while (temp != null);
        return null;
    }

    public Scope getCurrentScope() {
        return currentScope;
    }

    public void setCurrentScope(Scope currentScope) {
        this.currentScope = currentScope;
    }

    void insert(Symbol symbol, boolean state) {
        if (symbol.attribute.equals("variable") && DataTypes.get(symbol.type) == null) {
            System.err.println(String.format("Type already undefined: %s", symbol.type));
            System.exit(1);
        }
        if (currentScope.children.containsKey(symbol.name)) {
            System.err.println(String.format("Variable already declared: %s", symbol.name));
            System.exit(1);
        }

        this.state = state;
        currentScope.lastChildName = symbol.name;
        currentScope.children.put(symbol.name, symbol);
        AllSymbol.put(symbol.name, symbol);
    }

    void print() {
        Scope temp = currentScope;
        while (temp != null) {
            System.out.println(temp.toString());
            temp = temp.parent;
        }
    }

    public boolean checkParampetersFunctionCpp(String nameFunction, String parameter, int indexParameter) {
        try {
            Field field = AllSymbol.get(nameFunction).getLocalField().get(indexParameter);
            try {
                Symbol symbol = AllSymbol.get(parameter);
                parameter = symbol.getValue();
            } catch (Exception e) {
            }
            parameter = getValueWithCasting(parameter, field.getType());
            /*
            if (!isTypeCompatible(field.getType(), parameter)) {
                if (isVariable(parameter)) {
                    parameter = AllSymbol.get(parameter).type;
                    return checkCasting(field.getType(), parameter);
                } else {
                    try {
                        Integer.parseInt(parameter);
                        return checkCasting(field.getType(), "int");
                    } catch (Exception e) {
                    }
                    try {
                        Float.parseFloat(parameter);
                        return checkCasting(field.getType(), "real");
                    } catch (Exception e) {
                    }
                    if ((parameter.equalsIgnoreCase("true")
                            || parameter.equalsIgnoreCase("false"))
                            && field.getType().equalsIgnoreCase("boolean")) {
                        return true;
                    }
                    return parameter.startsWith("\"") && parameter.endsWith("\"")
                            && field.getType().equalsIgnoreCase("string");

                }
            }

             */
        } catch (Exception e) {
            return false;//over parameter
        }
        return true;
    }

    static class Scope {
        private static int ID = 0;
        int id;
        HashMap<String, Symbol> children;
        HashMap<String, Scope> scopeChildren;
        Scope parent;
        String lastChildName;

        Scope(Scope parent) {
            if (parent != null) {
                this.parent = parent;
            }
            this.id = ++ID;
            this.children = new HashMap<>();
            this.scopeChildren = new HashMap<>();

        }

        @Override
        public String toString() {
            StringBuilder mString = new StringBuilder("Scope").append(id).append('{');
            for (Symbol sym : children.values())
                mString.append(sym).append('\n');
            mString.append('}');
            return mString.toString();
        }
    }

    public static class Symbol {
        private String name;
        private String type;
        private String attribute;
        private String value;
        private boolean isAssigned = false;
        private ArrayList<Field> localField;//parameter in func and we can use it as columns in Tables

        Symbol(String name, String type, @NotNull String attribute) {
            this.name = name;
            this.type = type;
            if (attribute.compareTo("") == 0)
                this.attribute = "variable";
            else
                this.attribute = attribute;
        }

        public Symbol(Symbol symbol) {
            this.name = symbol.name;
            this.type = symbol.type;
            this.attribute = symbol.attribute;
            this.isAssigned = symbol.isAssigned;
        }

        public Symbol(String name, String type, String attribute, String value, boolean isAssigned) {
            this.name = name;
            this.type = type;
            this.attribute = attribute;
            this.value = value;
            this.isAssigned = isAssigned;
        }

        public Symbol(String name, String type, String attribute, ArrayList<Field> localField) {
            this.name = name;
            this.type = type;
            this.attribute = attribute;
            this.localField = localField;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setAttribute(String attribute) {
            this.attribute = attribute;
        }

        public void setAssigned(boolean assigned) {
            isAssigned = assigned;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public String getAttribute() {
            return attribute;
        }

        public boolean isAssigned() {
            return isAssigned;
        }

        public ArrayList<Field> getLocalField() {
            return localField;
        }

        public void setLocalField(ArrayList<Field> localField) {
            this.localField = localField;
        }

        public Symbol(String name, String type, String attribute, boolean isAssigned) {
            this.name = name;
            this.type = type;
            this.attribute = attribute;
            this.isAssigned = isAssigned;
        }

        @Override
        public String toString() {
            return String.format("Symbol { name => %s, type => %s, attribute => %s }", this.name, this.type, this.attribute);
        }
    }
}
