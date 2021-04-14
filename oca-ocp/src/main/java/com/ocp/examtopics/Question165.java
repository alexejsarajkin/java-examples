package com.ocp.examtopics;

public class Question165 {
    public static void main(String[] args) {
        MyClass165 myClass165 = new MyClass165();
        Thread a = new Thread(myClass165);
        a.start();
        Thread b = new Thread(myClass165);
        b.start();
    }
}

class MyClass165 implements Runnable {
    public int value;

    @Override
    public synchronized void run() {
        while (value < 100) {
            value++;
            System.out.println("value: " + value);
        }
    }
}
