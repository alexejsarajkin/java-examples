package com.ocp.book.oracle.self_test.ch7;

class A {
    void m() {
        System.out.println("outer");
    }
}

public class Q8 {
    public static void main(String[] args) {
        new Q8().go();
    }

    void go() {
        new A().m();
        class A {
            void m() {
                System.out.println("inner");
            }
        }
    }

    class A {
        void m() {
            System.out.println("middle");
        }
    }
}
