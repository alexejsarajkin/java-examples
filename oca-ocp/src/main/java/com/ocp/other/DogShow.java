package com.ocp.other;

class Dog {
    public void bark() {
        System.out.println("woof ");
    }
}

class Hound extends Dog {
    public void sniff() {
        System.out.println("sniff ");
    }

    public void bark() {
        System.out.println("how1 ");
    }
}

public class DogShow {
    public static void main(String[] args) {
        new DogShow().go();
    }

    void go() {
        new Hound().bark();
        ((Dog) new Hound()).bark();
//		((Dog) new Hound()).sniff();
    }
}
