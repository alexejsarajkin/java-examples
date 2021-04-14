package com.ocp.examtopics;

public class Question131 {
    public static void main(String[] args) {
        P p = new P() {
            @Override
            public void method1() {
                System.out.println();
            }
        };

        Q q = new Q() {
            @Override
            public void method1() {
                System.out.println();
            }
        };
    }
}

interface P {
    public void method1();
}

interface Q extends P {
    public void method1();
}

interface R131 extends P {
    public void method2();
}

interface S {
    public default void method() {

    }
}

interface T {
    public void method1();

    public void method2();
}

interface U {
    public void method1();

    public abstract void method2();
}

// P Q
