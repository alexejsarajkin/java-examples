package com.ocp.host.igor.stage1;

public class Adder {
    public static String add(long arg1, long arg2) {
        return "longs";
    }

    public static String add(Long arg1, Long arg2) {
        return "Longs";
    }

    public static String add(Object args) {
        return "Objects";
    }

    public static String add(long... args) {
        return "varargs long";
    }

    public static String add(Long... args) {
        return "varargs Long";
    }

    public static String add(Object... args) {
        return "varargs Object";
    }

    public static void main(String[] args) {
        System.out.println(Adder.add(1, 2));
        System.out.println(Adder.add(1L, 2L));
        System.out.println(Adder.add(1.0, 2.0));
        Long[] arrLongs = {1L, 2L};
        System.out.println(Adder.add(arrLongs));
        int[] arrInts = {1, 2};
        System.out.println(Adder.add(arrInts));
    }
}
