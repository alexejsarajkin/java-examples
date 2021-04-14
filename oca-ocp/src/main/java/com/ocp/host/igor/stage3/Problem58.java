package com.ocp.host.igor.stage3;

public class Problem58 {
    public static void main(String[] args) {
        C myC = new C();
        B myB = myC;
        A myA = myB;
        System.out.print(myB);
        System.out.print((C) myB);
        System.out.print(myA);
    }
}

class B implements A {
    public String toString() {
        return "B ";
    }

}

class C extends B {
    public String toString() {
        return "C ";
    }
}

interface A {
    public String toString();
}