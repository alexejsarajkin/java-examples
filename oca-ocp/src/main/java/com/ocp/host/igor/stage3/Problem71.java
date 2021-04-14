package com.ocp.host.igor.stage3;

public class Problem71 {
    public static void main(String[] args) {
        Gadget g1 = new Gadget(01, "iPhone");
        Gadget g2 = new Gadget(10, "iPhone");
        System.out.println(g1.equals(g2));           // line n2
    }
}


class Gadget {
    int id;
    String name;

    public Gadget(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {      // line n1
        boolean result = false;
        Gadget b = (Gadget) obj;
        if (this.name.equals(b.name)) {
            result = true;
        }
        return result;
    }
}