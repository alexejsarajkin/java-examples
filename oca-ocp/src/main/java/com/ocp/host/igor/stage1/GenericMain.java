package com.ocp.host.igor.stage1;

public class GenericMain {
    <T> void run(T obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        new GenericMain().run("Hello!");
        new GenericMain().<String>run("Hello again!");
//        new Test().<>run("Hello");               // INVALID
    }
}
