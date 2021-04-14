package com.ocp.examtopics;

public class Question166 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread);
        Thread b = new Thread(myThread);
        a.start();
        b.start();
    }
}

class MyThread implements Runnable {
    private String src[] = {"A", "B", "C"};
    private int count = 0;

    @Override
    public synchronized void run() {
        while (count < src.length) {
            System.out.println(src[count]);
            count++;
        }
    }
}
