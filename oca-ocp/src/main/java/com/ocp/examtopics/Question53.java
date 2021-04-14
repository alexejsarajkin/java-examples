package com.ocp.examtopics;

import java.util.concurrent.atomic.AtomicInteger;

public class Question53 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread53());
        Thread thread2 = new Thread(new MyThread53());
        Thread thread3 = new Thread(new MyThread53());
        Thread[] ta = {thread1, thread2, thread3};
        for (int x = 0; x < 3; x++) {
            ta[x].start();
        }
    }
}

class MyThread53 implements Runnable {
    private static AtomicInteger count = new AtomicInteger(0);

    public void run() {
        int x = count.incrementAndGet();
        System.out.print(x + " ");
    }
}
