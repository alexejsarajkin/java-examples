package com.controlstatement;

public class SwitchCase {
    public static void main(String[] args) {
        String dayOfTheWeek = args[0];

        switch (dayOfTheWeek.toLowerCase()) {
            case "monday":
                System.out.println("This is first working day");
                break;
            case "tuesday":
                System.out.println("This is second working day");
                break;
            case "wednesday":
                System.out.println("This is third working day");
                break;
            case "thursday":
                System.out.println("This is fourth working day");
                break;
            case "friday":
                System.out.println("This is fifth working day");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Finally weekend");
                break;
            default:
                System.out.println("Not of the working day");
        }
        System.out.println("Final string");
    }
}
