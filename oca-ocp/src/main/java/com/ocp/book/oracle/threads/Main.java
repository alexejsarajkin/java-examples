package com.ocp.book.oracle.threads;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method thread name - " + Thread.currentThread().getName());

        System.out.println("----------------------");

        Thread myThread = new Thread(new MyThread());
        myThread.start();

        System.out.println("----------------------");

        Thread myRunnable = new Thread(new MyRunnable(), "My runnable test");
        myRunnable.start();

        System.out.println("----------------------");

        Runnable r = () -> {
            for (int x = 1; x < 6; x++) {
                System.out.println("Runnable running " + Thread.currentThread().getName() + " - " + x);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread one = new Thread(r);
        Thread two = new Thread(r);
        Thread three = new Thread(r);
        one.start();
        System.out.println("----------------------");
        two.start();
        System.out.println("----------------------");
        three.start();
    }

}
