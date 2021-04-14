package com.oca;

public class ABC {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};
        int a = 0;
        for (String e : arr) {
            while (a < arr.length) {
                System.out.println(a);
                a++;
                break;
            }
        }
    }
}
