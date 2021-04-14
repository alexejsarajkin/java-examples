package com.ocp.book.oracle.self_test.ch10;

public class Q14 implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new Q14());
        thread.start();
        System.out.println("m1");
        thread.notifyAll();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m2");
    }

    @Override
    public void run() {
        System.out.println("r1");
        System.out.println("r2");
    }
}
