package com.oca;

public class StringTest {
    public static void main(String[] args) {
        String x = "Java";
        String y = x;

        System.out.println("y = " + y);

        x = x + " Bean";

        System.out.println("y = " + y);

        String s = "Fred";
        String t = s;
        t.toUpperCase();
        System.out.println("s = " + s);
        System.out.println("t = " + t);

    }
}
