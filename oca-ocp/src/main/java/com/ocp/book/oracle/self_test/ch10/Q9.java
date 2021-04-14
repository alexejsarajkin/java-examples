package com.ocp.book.oracle.self_test.ch10;

public class Q9 {
    public static synchronized void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        thread.start();
        System.out.println("X");
        thread.wait(); // IllegalMonitorStateException
        System.out.println("Y");
    }
}
