package com.ocp.book.oracle.self_test.ch11;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Q1 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> cowList = new CopyOnWriteArrayList<>();
        cowList.add(4);
        cowList.add(2);
        Iterator<Integer> it = cowList.iterator();
        cowList.add(6);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
