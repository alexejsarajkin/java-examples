package com.ocp.host.igor.stage3;

import java.util.Arrays;
import java.util.List;

public class Problem99 {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(new Car(), new Car(), new Car());
        System.out.println(cars.stream()
                .map(Car::getWheels)
                .flatMap(List::stream)
                .mapToInt(Wheel::getAirPressure)
                .max()
                .orElse(12345)
        );
    }
}

class Car {
    private List<Wheel> wheels;

    public Car() {
        wheels = Arrays.asList(
                new Wheel(),
                new Wheel(),
                new Wheel(),
                new Wheel());
    }

    public List<Wheel> getWheels() {
        return wheels;
    }
}

class Wheel {
    private int airPressure;

    public Wheel() {
        airPressure = (int) (Math.random() * 100);  // sets airPressure randomly
    }                                            // from 0 to 99 inclusive

    public int getAirPressure() {
        return airPressure;
    }
}
