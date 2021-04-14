package com.ocp.book.oracle.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRunnable implements Runnable {
    private List<Integer> list = new ArrayList<>();

    public ArrayListRunnable() {
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (!list.isEmpty()) {
            System.out.println(name + " - " + list.remove(0));
        }
    }

    public static void main(String[] args) {
        ArrayListRunnable arrayListRunnable = new ArrayListRunnable();
        Thread t1 = new Thread(arrayListRunnable);
        Thread t2 = new Thread(arrayListRunnable);
        t1.start();
        t2.start();
    }
}
