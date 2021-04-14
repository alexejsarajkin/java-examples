package com.ocp.book.selikoff_boyarsky.practice_tests.chapter11;

public class Question9 {
    static interface Vehicle {
    }

    static class Bus implements Vehicle {
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        boolean n = null instanceof Bus;
        boolean v = bus instanceof Vehicle;
        boolean b = bus instanceof Bus;
        System.out.println(n + " " + v + " " + b);
    }
}
