package com.ocp.book.oracle.self_test.ch10;

public class Q16 implements Runnable {
    Chicks chicks; // Must be static

    public static void main(String[] args) {
        new Q16().go();
    }

    private void go() {
        chicks = new Chicks();
        new Thread(new Q16()).start();
        new Thread(new Q16()).start();
    }

    @Override
    public void run() {
        chicks.yack(Thread.currentThread().getId());
    }

    static class Chicks {
        synchronized void yack(long id) {
            for (int i = 1; i < 3; i++) {
                System.out.println(id);
                Thread.yield();
            }
        }
    }
}
