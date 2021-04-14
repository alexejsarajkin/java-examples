package com.ocp.book.oracle.threads;


public class Reader extends Thread {
    Calculator c;

    public Reader(Calculator c) {
        this.c = c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        new Reader(calculator).start();
        new Reader(calculator).start();
        new Reader(calculator).start();
        new Reader(calculator).start();
        new Thread(calculator).start();
    }

    @Override
    public void run() {
        synchronized (c) {
            try {
                System.out.println("Waiting for calculation...");
                c.wait();
            } catch (InterruptedException e) {
            }
            System.out.println("Total is: " + c.total);
        }
    }

    static class Calculator implements Runnable {
        int total;

        @Override
        public void run() {
            synchronized (this) {
                for (int i = 0; i < 100; i++) {
                    total += 1;
                }
                notifyAll();
            }
        }
    }
}


