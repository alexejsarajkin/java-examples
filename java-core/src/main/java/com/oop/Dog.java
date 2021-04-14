package com.oop;

public class Dog {

    private static int dogsCount;

    private static final int TAIL = 1;
    private static final int PAWS = 4;
    private String name;
    private String breed;
    private Size size;

    public Dog() {
        dogsCount++;
    }

    static int getDogsCount() {
        return dogsCount;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog - " +
                "tail = " + TAIL +
                ", name = '" + name + '\'' +
                ", breed = '" + breed + '\'' +
                ", paws = " + PAWS +
                ", size = '" + size + '\'' +
                ", dogsCount = " + getDogsCount();
    }

    public void bark() {
        switch (size) {
            case BIG:
            case VERY_BIG:
                System.out.println("Wof - Wof");
                break;
            case AVERAGE:
                System.out.println("Raf - Raf");
                break;
            case SMALL:
            case VERY_SMALL:
                System.out.println("Tiaf - tiaf ");
                break;
            default:
                System.out.println("Dog's size is undefined");
        }
    }

    public void bite() {
        if (dogsCount >= 2) {
            System.out.println("Dogs are biting you");
        } else {
            bark();
        }
    }
}
