package com.oca;

abstract class Parallelogram {
    private int getEqualSides() {
        return 0;
    }
}

abstract class Rectangle extends Parallelogram {
    public static int getEqualSides() {
        return 2;
    }
}

public final class Square extends Rectangle {
    //    public int getEqualSides() {
//      return 4;
//    }
    public static void main(String[] corners) {

        final Square myFigure = new Square();
        System.out.println(myFigure.getEqualSides());
    }
}
