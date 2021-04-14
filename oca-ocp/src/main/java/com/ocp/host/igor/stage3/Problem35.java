package com.ocp.host.igor.stage3;

import java.util.concurrent.atomic.AtomicInteger;

public class Problem35 {
    public static void main(String[] args) {
        Thread justin1 = new Thread(new Sprinter());
        Thread christian2 = new Thread(new Sprinter());
        Thread usain3 = new Thread(new Sprinter());
        Thread[] sprint = {justin1, christian2, usain3};
        for (int i = 0; i < 3; i++) {
            sprint[i].start();
        }
    }
}

class Sprinter implements Runnable {
    private static AtomicInteger place = new AtomicInteger(0);

    public void run() {
        int p = place.incrementAndGet();
        System.out.print(p + " ");
    }
}