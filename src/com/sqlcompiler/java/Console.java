package com.sqlcompiler.java;

import org.jetbrains.annotations.NotNull;

class Console {
    public  static final int divider = 1;
    public  static final int open = 2;
    public  static final int close = 3;
    public  static final int append = 4;
    private static final int width = 75;

    static void log(int mode, String... args) {
        if (mode == open || mode == close) {
            log(divider);
        }
        log(args);
    }

    static void log(@NotNull String... args) {
        for(String arg : args) {
            StringBuilder complement = new StringBuilder();
            while (complement.length() + 2 + arg.length() < width)
                complement.append(" ");
            System.out.printf("%c%s%s%c\n", '|', arg, complement.toString(), '|');
        }
    }

    static void log(int mode) {
        switch (mode) {
            case divider:
            case open:
            case close:
                StringBuilder str = new StringBuilder();
                while (str.length() < width - 2)
                    str.append("-");
                System.out.printf("+%s+\n", str.toString());
                break;
            default:
                System.out.println(mode);
        }
    }
}
