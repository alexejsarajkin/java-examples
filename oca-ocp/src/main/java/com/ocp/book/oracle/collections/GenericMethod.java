package com.ocp.book.oracle.collections;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
    public static void main(String[] args) {
        Animal[] animalArray = new Animal[2];
        animalArray[0] = new Dog();

        addAnimalArray(animalArray);

        for (Animal a : animalArray) {
            System.out.println(a);
        }

        Dog[] dogArray = new Dog[2];
        dogArray[0] = new Dog();

//		addAnimalArray(dogArray); // ArrayStoreException
        addDogArray(dogArray);

        for (Dog d : dogArray) {
            System.out.println(d);
        }

        List<Animal> listAnimal = new ArrayList<>();
        listAnimal.add(new Dog());

        addAnimalList(listAnimal);

        for (Animal a : listAnimal) {
            System.out.println(a);
        }

        List<Dog> listDog = new ArrayList<>();
        listDog.add(new Dog());

        addAnimalGenericList(listDog);
        addAnimalGenericSuperList(listDog);
    }

    private static void addAnimalArray(Animal[] array) {
        array[1] = new Cat();
    }

    private static void addDogArray(Dog[] array) {
        array[1] = new Dog();
    }

    private static void addAnimalList(List<Animal> list) {
        list.add(new Cat());
    }

    private static void addAnimalGenericList(List<? extends Animal> list) {
        // Only reading
    }

    private static void addAnimalGenericSuperList(List<? super Dog> list) {
        list.add(new Dog());
    }
}

class Animal {
    @Override
    public String toString() {
        return "Animal";
    }
}

class Dog extends Animal {
    @Override
    public String toString() {
        return "Dog";
    }
}

class Cat extends Animal {
    @Override
    public String toString() {
        return "Cat";
    }
}
