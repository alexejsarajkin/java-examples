package com.oca;

interface Breakable {
    void breakSmoothly();
}

class Car {
    public void accelerate() {
    }
}

class FancyCar extends Car {
    public void breakSmoothly() {
    }
}

class SuperFancyCar extends FancyCar implements Breakable {
    public void breakSmoothly() {
    }

    public void turn() {

    }
}

public class Start {
    public static void main(String[] args) {
        print(new FancyCar());
    }

    private static void print(Car car) {
//    ((Breakable) car).breakSmoothly();
//    ((SuperFancyCar) car).turn();
//    ((SuperFancyCar) car).breakSmoothly();
//    ((FancyCar) car).turn();
        ((FancyCar) car).breakSmoothly();
        car.accelerate();
//    car.turn();
//    car.breakSmoothly();
    }
}
