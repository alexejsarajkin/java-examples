package com.ocp.book.oracle.class_design;

interface Gadget {
    void doStuff();
}

abstract class Electronics {
    void getPower() {
        System.out.println("plug in ");
    }
}

public class Tablet extends Electronics implements Gadget {
    @Override
    public void doStuff() {
        System.out.println("Show book ");
    }

    public static void main(String[] args) {
        new Tablet().getPower();
        new Tablet().doStuff();
    }
}
