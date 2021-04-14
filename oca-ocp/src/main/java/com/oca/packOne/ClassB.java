package com.oca.packOne;

public class ClassB {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        System.out.println("a = " + classA.pub);
        System.out.println("b = " + classA.prot);
        System.out.println("c = " + classA.def);
//        System.out.println("d = " + classA.priv);
    }
}
