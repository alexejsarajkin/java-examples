package com.ocp.examtopics;

public class Question84 {
}

//final class Cream {
class Cream84 {
    public void prepare() {
    }
}

class Cake84 extends Cream84 {
    public void bake(int min, int temp) {
    }

    public void mix() {
    }
}

class Shop84 {
    private Cake84 c = new Cake84();
    private final double discount = 0.25;

    public void makeReady() {
        c.bake(10, 120);
    }
}

class Bread84 extends Cake84 {
    public void bake(int minutes, int temperature) {
    }

    public void addToppings() {
    }
}
