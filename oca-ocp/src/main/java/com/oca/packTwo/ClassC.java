package com.oca.packTwo;

import com.oca.packOne.ClassA;

public class ClassC extends ClassA {

    public static void main(String[] args) {
//        ClassC obj = new ClassC();
        ClassA obj = new ClassC();
        System.out.println("a = " + obj.pub);
//        System.out.println("b = " + obj.prot);
//        System.out.println("c = " + obj.def);
//        System.out.println("d = " + obj.priv);
    }
}
