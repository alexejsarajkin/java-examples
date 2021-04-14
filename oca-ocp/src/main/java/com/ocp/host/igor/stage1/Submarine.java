package com.ocp.host.igor.stage1;

class Vessel {
    protected double depth;
    protected int distance;

    int raid(int miles) {
        return distance += miles;
    }

    protected static void report(Vessel vsl) {
        System.out.println(vsl.distance);
    }
}

public class Submarine extends Vessel {
    public double depth;

    public int raid(int miles) {
        depth += .5;
        return distance += miles;
    }

    public static void report(Vessel vsl) {
        System.out.println(vsl.distance + " @ " + vsl.depth);
    }

    public static void main(String[] args) {
        Submarine sub1 = new Submarine();
        sub1.raid(3000);
        sub1.report(sub1);

        System.out.println("---------------");

        Vessel sub2 = new Submarine();
        sub2.raid(3000);
        sub2.report(sub2);

        System.out.println("---------------");

        Vessel sub3 = new Vessel();
        sub3.raid(3000);
        sub3.report(sub3);

        System.out.println("---------------");

        Vessel sub4 = new Vessel();
        sub4.raid(3000);
        Submarine.report(sub4);
    }
}


