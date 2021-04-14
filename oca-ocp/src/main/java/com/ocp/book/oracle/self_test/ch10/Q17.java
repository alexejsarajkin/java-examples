package com.ocp.book.oracle.self_test.ch10;

public class Q17 implements Runnable {
    @Override
    public void run() {
        move(Thread.currentThread().getId());
    }

    private void move(long id) {
        System.out.println(id);
        System.out.println(id);
    }

    public static void main(String[] args) {
        Q17 ch = new Q17();
        new Thread(ch).start();
        new Thread(new Q17()).start();
    }
}
