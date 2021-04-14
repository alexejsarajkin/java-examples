package com.oca;

interface MyInterface {
    default int doStuff() {
        return 42;
    }
}

public class IfaceTest implements MyInterface {
    public static void main(String[] args) {
        new IfaceTest().go();
    }

    void go() {
        System.out.println("Class " + doStuff());
        System.out.println("iface " + MyInterface.super.doStuff());
    }

    public int doStuff() {
        return 43;
    }
}
