package com.oca;


public class Test {
    public static void main(String[] args) {
        Boolean b = null;
        System.out.println((b != null && b));
        b = false;
        System.out.println(b != null && b);
        b = true;
        System.out.println(b != null && b);
    }
}
