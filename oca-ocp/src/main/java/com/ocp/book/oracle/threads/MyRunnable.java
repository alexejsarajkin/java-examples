package com.ocp.book.oracle.threads;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable name - " + Thread.currentThread().getName());
    }
}
