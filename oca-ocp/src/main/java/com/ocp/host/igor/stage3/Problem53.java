package com.ocp.host.igor.stage3;

public class Problem53 {
    public static void main(String[] args) {
        Season ssn = Season.SUMMER;
        System.out.println(ssn.getTemp());
    }
}

enum Season {
    WINTER(6),
    SPRING(10),
    SUMMER(25),
    FALL(14);
    private int averageTemp;

    Season(int averageTemp) {
        this.averageTemp = averageTemp;
    }

    public int getTemp() {
        return averageTemp;
    }
}
