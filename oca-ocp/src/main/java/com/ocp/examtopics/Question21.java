package com.ocp.examtopics;

public class Question21 {
    public static void main(String[] args) {
        Moveable<Integer> animal = n -> System.out.println("Running" + n);
        animal.run(100);
        animal.walk(20);
    }
}


interface Moveable<Integer> {
    public default void walk(Integer distance) {
        System.out.println("Walking");
    }

    public void run(Integer distance);
}
