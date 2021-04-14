package com.oca;

import java.util.function.Predicate;

public class MoreSheep {
    static boolean b = false;

    public static void main(String[] args) {
        MoreSheep s = new MoreSheep();
        s.go(x -> b == false);
        s.go(x -> adder(4, 2) >= 6);
        s.go(x -> b = true);
        s.go(x -> adder(3, 2) < 4);
    }

    void go(Predicate<MoreSheep> e) {
        MoreSheep s2 = new MoreSheep();
        if (e.test(s2))
            System.out.println("true");
        else
            System.out.println("false");

    }

    static int adder(int x, int y) {
        return x + y;
    }
}
