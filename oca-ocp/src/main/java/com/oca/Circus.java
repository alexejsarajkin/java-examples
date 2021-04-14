package com.oca;

class AnimalCircus {
    protected void jump() {
        System.out.println("Animal");
    }
}

class Cat extends AnimalCircus {
    public void jump(int a) {
        System.out.println("Cat");
    }
}

class Deer extends AnimalCircus {
    public void jump() {
        System.out.println("Deer");
    }
}

public class Circus {
    public static void main(String[] args) {
        AnimalCircus cat = new Cat();
        AnimalCircus deer = new Deer();
        cat.jump();
        deer.jump();
    }
}
