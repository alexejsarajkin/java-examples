package com.ocp.examtopics;

public class Question70 {
    public static void main(String[] args) {
        Vehicle66 v = new Vehicle66(100);
        v.increSpeed(60);
    }
}

class Vehicle66 {
    int distance; //line n1

    Vehicle66(int x) {
        this.distance = x;
    }

    public void increSpeed(int time) { //line n2

        int timeTravel = time; //line n3

        class Car {
            int value = 0;

            public void speed() {
                value = distance / timeTravel;
                System.out.println("Velocity with new speed " + value + " kmph");
            }
        }
        new Car().speed();
    }
}
