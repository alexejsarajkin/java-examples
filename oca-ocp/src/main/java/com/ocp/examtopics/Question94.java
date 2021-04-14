package com.ocp.examtopics;

public class Question94 {
    String name;

    public Question94(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Question94 q1 = new Question94("PowerCharger");
        Question94 q2 = q1;
        Question94 q3 = new Question94("PowerCharger");

        System.out.println(q1.equals(q2));
        System.out.println(q1.equals(q3));
    }
}
