package com.oca;

public class Doubler {
    public static void main(String[] args) {
        int a = 100;
        System.out.print(doubleValue(a));
        System.out.print(" : " + a);
    }

    static int doubleValue(int a) {
        a = a * 2;
        return a;
    }
}
