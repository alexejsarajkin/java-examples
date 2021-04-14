package com.ocp.book.oracle.self_test.ch10;

public class Q3 {
    public static void main(String[] args) {
        printAll(args);
    }

    private static void printAll(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
