package com.ocp.examtopics;

import java.util.Set;
import java.util.TreeSet;

public class Question187 {
    public static void main(String[] args) {
        Set<Vehicle187> vehicles = new TreeSet<>();
        vehicles.add(new Vehicle187(10123, "Ford"));
        vehicles.add(new Vehicle187(10124, "BMW"));
        System.out.println(vehicles);
    }
}

class Vehicle187 implements Comparable<Vehicle187> {
    int vno;
    String name;

    public Vehicle187(int vno, String name) {
        this.vno = vno;
        this.name = name;
    }

    public String toString() {
        return vno + ":" + name;
    }

    public int compareTo(Vehicle187 o) {
        return this.name.compareTo(o.name);
    }
}
