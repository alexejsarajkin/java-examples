package com.ocp.book.oracle.self_test.ch10;

public class Q15 implements Runnable {
    static Dudes dudes;

    public static void main(String[] args) {
        new Q15().go();
    }

    private void go() {
        dudes = new Dudes();
        new Thread(new Q15()).start();
        new Thread(new Q15()).start();
    }

    @Override
    public void run() {
        dudes.chat(Thread.currentThread().getId());
    }

    static class Dudes {
        static long flag = 0;

        //		synchronized void chat(long id) {
        void chat(long id) {
            if (flag == 0) flag = id;
            for (int i = 1; i < 3; i++) {
                if (flag == id) System.out.println("yo");
                else System.out.println("dude");
            }
        }
    }
}
