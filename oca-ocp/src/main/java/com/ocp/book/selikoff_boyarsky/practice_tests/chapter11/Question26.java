package com.ocp.book.selikoff_boyarsky.practice_tests.chapter11;

public class Question26 {
    static interface Vehicle {
    }

    static class Bus implements Vehicle {
    }

    static class Van extends Bus {
    }

    public static void main(String[] args) {
        Bus bus = new Van();
        Van van = new Van();
        Van[] vans = new Van[0];
        boolean b = bus instanceof Vehicle;
        boolean v = van instanceof Vehicle;
        boolean a = vans instanceof Vehicle[];
        System.out.println(b + " " + v + " " + a);
    }
}
