package com.ocp.book.selikoff_boyarsky.practice_tests.chapter12;

public class Question17 {
    public static void main(String[] args) {
        Bottle.Ship q = new Bottle.Ship();
    }
}

interface Pump {
    void pump(double psi);
}

interface Bend extends Pump {
    void bend(double tensileStrength);
}

class Robot {
    public static final void apply(Bend instruction, double input) { // r1
        instruction.bend(input);
    }

//    public static void main(String... future) {
//        final Robot r = new Robot();
//        r.apply(x -> System.out.print(x + " bent!"), 5);
//    }
}
