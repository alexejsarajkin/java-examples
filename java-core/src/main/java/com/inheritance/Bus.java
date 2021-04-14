package com.inheritance;

public class Bus extends FuelAuto {

    private int passengersNumber;

    public Bus(String producer, String model, Engine engine, int availablePetrol, int tankVolume, int passengersNumber) {
        super(producer, model, engine, availablePetrol, tankVolume);
        this.passengersNumber = passengersNumber;
        System.out.println("Bus was initialized");
    }

    public void pickUpPassengers(int passengersNumber) {
        this.passengersNumber += passengersNumber;
        System.out.println("Picking up passengers");
    }

    public void releasePassengers() {
        if (isRunning) {
            stop();
        }
        this.passengersNumber = 0;
        System.out.println("Passengers is released");
    }

    public void fuelUp() {
        int volume = getTankVolume() - getAvailablePetrol();

        fuelUp(volume);
        System.out.println("Adding fuel");
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Bus is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Bus has stopped");
    }

    @Override
    public void fuelUp(int petrolValue) {
        int volume = getAvailablePetrol() + petrolValue;

        if (volume > getTankVolume()) {
            setAvailablePetrol(getTankVolume());
        }
        System.out.println("Adding DIESEL");
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    @Override
    public void energize() {
        fuelUp(getTankVolume() - getAvailablePetrol());
    }
}

