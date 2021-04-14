package com.ocp.host.igor.stage3;

public class Problem60 {
    public static void main(String[] args) {
        A1 a = new B1();
        B1 b = (B1) a;
        b.runB();
        a.runA();
    }
}


class A1 {
    public void runA() {
        System.out.println("ArunA");
    }
}

class B1 extends A1 {
    public void runA() {
        System.out.println("BrunA");
    }

    public void runB() {
        System.out.println("BrunB");
    }
}