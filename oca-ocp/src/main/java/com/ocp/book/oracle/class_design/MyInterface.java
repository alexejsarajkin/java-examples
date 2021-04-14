package com.ocp.book.oracle.class_design;

public abstract interface MyInterface {
    public abstract int m3();

    public default void m2() {
        System.out.println("");
    }

    public static void m6() {
        System.out.println("");
    }
}
