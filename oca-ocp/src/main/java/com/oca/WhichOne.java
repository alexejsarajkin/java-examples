package com.oca;

public class WhichOne {
    public static void run(int x, int y) {
        System.out.println("working with int: " + (x + y));
    }

    public static void run(Integer x, Integer y) {
        System.out.println("working with Integer: " + (x + y));
    }

    public static void run(float x, float y) {
        System.out.println("working with float: " + (x + y));
    }

    public static void run(double x, double y) {
        System.out.println("working with double: " + (x + y));
    }

    public static void main(String[] args) {
        run(1, 2);
        run(1.0, 2.0);
    }


}
