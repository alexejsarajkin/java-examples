package com.ocp.host.igor.stage3;

public class Problem81 {
    public static void main(String[] args) {
        String crew[] = new String[3];
        crew[0] = "Neil Armstrong";
        crew[1] = "Buzz Aldrin";
        crew[2] = "Mike Collins";
        try {
            for (String n : crew) {
                try {
                    String scrambled = n.substring(0, 3) + n.substring(8, 12);
                    System.out.println(scrambled);
                } catch (StringIndexOutOfBoundsException sioobe) {
                    System.out.println("String out of limits");
                }
            }
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Array out of limits");
        }
    }
}
