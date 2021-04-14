package com.ocp.examtopics;

public class Question141 implements Interface1, Interface2 {
    public static void main(String[] args) {
        Interface1 obj = new Question141();
        obj.sayHi();
    }

    @Override
    public void sayHi() {
        System.out.println("Hi MyClass");
    }
}

interface Interface1 {
    public default void sayHi() {
        System.out.println("Hi Interface 1");
    }
}

interface Interface2 {
    public default void sayHi() {
        System.out.println("Hi Interface 2");
    }
}

// Hi MyClass
