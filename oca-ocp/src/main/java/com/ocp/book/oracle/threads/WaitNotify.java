package com.ocp.book.oracle.threads;

public class WaitNotify {
    public static void main(String[] args) {
        Operator operator = new Operator();
        operator.start();

        synchronized (operator) {
            try {
                System.out.println("Wait for operator to complete...");
                operator.wait();
            } catch (InterruptedException e) {
            }
            System.out.println("Total is: " + operator.total);
        }
    }

    static class Operator extends Thread {
        int total;

        @Override
        public void run() {
            synchronized (this) {
                for (int i = 0; i < 100; i++) {
                    total += 1;
                }
                notify();
            }
        }
    }
}
