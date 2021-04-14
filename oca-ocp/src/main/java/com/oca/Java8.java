package com.oca;

import java.util.function.Predicate;

public class Java8 {
    static boolean b = false;

    public static void main(String[] args) {
        Java8 s = new Java8();
        s.go(x -> mult(5, 1) < 7);
        s.go(x -> b = new Boolean(true));
        s.go(x -> {
            return mult(3, 2) < 4;
        });
    }

    void go(Predicate<Java8> e) {
        Java8 s2 = new Java8();
        if (e.test(s2))
            System.out.println("true");
        else
            System.out.println("false");

    }

    static int mult(int x, int y) {
        return x * y;
    }
}
