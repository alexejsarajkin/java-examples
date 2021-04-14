package com.ocp.book.oracle.self_test.ch10;

public class Q10 extends Thread {
    Q10() {
        System.out.println("MyThread");
    }

    public void run() {
        System.out.println("bar");
    }

    public void run(String s) {
        System.out.println("baz");
    }

    public static void main(String[] args) {
        Thread thread = new Q10() {
            @Override
            public void run() {
                System.out.println("Foo");
            }
        };
        thread.start();
    }
}
