package com.ocp.host.igor.stage3;

import java.util.concurrent.CyclicBarrier;

public class Problem44 {
    public static void main(String[] args) {
        Tom tom = new Tom();
        CyclicBarrier cb = new CyclicBarrier(1, tom);
        Jerry jerry = new Jerry(cb);
        jerry.start();
    }
}


class Jerry extends Thread {
    CyclicBarrier cb;

    public Jerry(CyclicBarrier cb) {
        this.cb = cb;
    }

    public void run() {
        try {
            System.out.println("Jerry start");
            cb.await();
            System.out.println("Jerry finish");
        } catch (Exception ex) {
        }
    }
}

class Tom implements Runnable {
    public void run() {
        System.out.println("Tom chasing");
    }
}
