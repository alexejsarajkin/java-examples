package com.inheritance;

public class InheritanceMain {

    public static void main(String[] args) {

        Auto electricCar = new ElectricCar("Tesla", "Model S", 4, 500);

//        Engine carEngine = new Engine(6, EngineType.DIESEL, 900);
//        Auto auto = new Auto("WV", "Polo", carEngine);

        Engine truckEngine = new Engine(6, EngineType.DIESEL, 900);
        Auto truck = new Truck("Volvo", "VNL 300", truckEngine, 300, 500, 1000);

        Engine truckBus = new Engine(3.5, EngineType.DIESEL, 400);
        Auto bus = new Bus("Mercedes", "Sprinter", truckBus, 30, 75, 12);


//        runCar(auto);
        runCar(bus);
        runCar(truck);
        runCar(electricCar);
    }

    private static void runCar(Auto auto) {
        auto.start();
        auto.stop();
        auto.energize();
    }
}
