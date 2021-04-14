package com.ocp.book.selikoff_boyarsky.practice_tests.chapter11;

public class Question13 {
}

class Laptop extends Computer {
    String type = "laptop";
}

class Computer {
    String type = "computer";

    public static void main(String[] args) {
        Computer computer = new Laptop();
        Laptop laptop = new Laptop();
        System.out.println(computer.type + "," + laptop.type);
    }
}
