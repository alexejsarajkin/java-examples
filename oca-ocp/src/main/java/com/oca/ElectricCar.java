package com.oca;

class Automobile {
    private final String drive() {
        return "Driving vehicle";
    }
}

class Car1 extends Automobile {
    protected String drive() {
        return "Driving car";
    }
}

public class ElectricCar extends Car1 {
    public final String drive() {
        return "Driving electric car";
    }

    public static void main(String[] wheels) {
        final Car1 car = new ElectricCar();
        System.out.print(car.drive());
    }
}
