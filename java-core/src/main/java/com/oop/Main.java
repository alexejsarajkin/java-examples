package com.oop;

public class Main {

    public static void main(String[] args) {

        Dog dogLab = new Dog();
        dogLab.setName("Charley");
        dogLab.setBreed("Lab");
        dogLab.setSize(Size.AVERAGE);
        dogLab.bite();

        System.out.println(dogLab);

        Dog dogSheppard = new Dog();
        dogSheppard.setName("Mike");
        dogSheppard.setBreed("Sheppard");
        dogSheppard.setSize(Size.BIG);
        dogSheppard.bite();

        System.out.println(dogSheppard);

    }
}
