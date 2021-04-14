package com.oca;

public class Vark {
    private static final int y = 0;

    public static void main(String... a) {
        new Vark().go(a, 42);
    }

    void go(String[] b, int life) {
        System.out.println(b[1]);
    }
}
