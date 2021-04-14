package com.atomic;

public class Main {
    public static void main(String[] args) throws Exception {

        Counter c = new Counter();

        Thread thread1 = new Thread(() -> {

            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }

        });

        Thread thread2 = new Thread(() -> {

            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }

        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(c.count);
    }
}
