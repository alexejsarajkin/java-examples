package com.ocp.book.oracle.self_test.ch10;

public class Q13 implements Runnable {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getId());
        new Q13().run();
//		new Q13().start();
        new Thread(new Q13());
        new Thread(new Q13()).run();
        new Thread(new Q13()).start();
    }

    void go(long id) {
        System.out.println(id);
    }

    @Override
    public void run() {
        go(Thread.currentThread().getId());
    }
}
