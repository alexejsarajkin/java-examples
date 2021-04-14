package com.oca;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse();
        a.eat();
        b.eat();
    }
}

class Animal {
    protected void eat() {
        System.out.println("Animal eat");
    }
}

class Horse extends Animal {
    public void eat() {
        System.out.println("Horse eat");
    }
}
