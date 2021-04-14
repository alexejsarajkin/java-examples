package com.ocp.examtopics;

import java.util.Set;
import java.util.TreeSet;

public class Question42 {
    public static void main(String[] args) {
        Set<Vehicle42> vehicles = new TreeSet<>();
        vehicles.add(new Vehicle42(10123, "Ford"));
        vehicles.add(new Vehicle42(10124, "BMW"));
        System.out.println(vehicles);
    }
}


class Vehicle42 {
    int vno;
    String name;

    public Vehicle42(int vno, String name) {
        this.vno = vno;
        this.name = name;
    }

    public String toString() {
        return vno + ":" + name;
    }
}
