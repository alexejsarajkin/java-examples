package com.ocp.examtopics;

public class Question98 {
    public static void main(String[] args) {
        for (Course a : Course.values()) {
            System.out.println(a + " " + a.getCost());
        }
    }
}

enum Course {
    JAVA(100),
    J2ME(150);

    private int cost;

    Course(int cost) {
        this.cost = cost;
    }

    int getCost() {
        return cost;
    }
}
