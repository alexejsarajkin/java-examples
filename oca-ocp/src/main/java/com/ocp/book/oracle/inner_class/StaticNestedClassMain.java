package com.ocp.book.oracle.inner_class;

public class StaticNestedClassMain {

    public static void main(String[] args) {
        StaticNestedClass.Nested n1 = new StaticNestedClass.Nested();
        n1.go();

        Nested2 n2 = new Nested2();
        n2.go();
    }

    static class Nested2 {
        void go() {
            System.out.println("Nested 2");
        }
    }
}
