package com.ocp.examtopics;

import java.util.function.Supplier;

public class Question65 {
}

class Bird {
    public void fly() {
        System.out.print("Can fly");
    }
}

class Penguin extends Bird {
    public void fly() {
        System.out.print("Cannot fly");
    }
}

class Birdie {
    public static void main(String[] args) {
        fly(() -> new Bird());
        fly(Penguin::new);
    }

    static void fly(Supplier<Bird> bird) {
        bird.get().fly();
    }
}
