package com.ocp.examtopics;

public class Question102 {
    double fuelLevel;

    public Question102(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void start() {
        assert fuelLevel > 0 : "Impossible fuel";
        System.out.println("Started");
    }

    public static void main(String[] args) {
        new Question102(0).start();
    }
}

// assert fuelLevel > 0: "Impossible fuel" ;
