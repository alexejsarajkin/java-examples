package com.oca;

class Feline {
    String name;

    Feline(String n) {
        name = " " + n + " ";
    }
}

public class Kitty extends Feline {
    String name = "kitty";

    Kitty(String n) {
        super(n);
        name = n;
    }

    public static void main(String[] args) {
        Kitty k = new Kitty("Niki");
        System.out.println(k.name);
    }
}
