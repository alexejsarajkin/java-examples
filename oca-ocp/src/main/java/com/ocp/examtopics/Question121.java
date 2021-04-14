package com.ocp.examtopics;

public class Question121 {
    public static void main(String[] args) throws Exception {
        MyClass obj = null;
        try (MyClass obj1 = new MyClass()) {
            obj1.test = 100;
            obj = obj1.copyObject();
        }
        System.out.println(obj.test);
    }
}

class MyClass implements AutoCloseable {
    int test;

    @Override
    public void close() throws Exception {

    }

    public MyClass copyObject() {
        return this;
    }
}

// 100
