package com.ocp.host.igor.stage3;

public class Problem41 {
}


abstract class Comsat {
    Comsat() {
        System.out.println("Communication Satellite");
    }

    protected void transmit() {
        System.out.println("Communication Satellite");
    }
}

class Constellation extends Comsat {
    int num;

    Constellation(int num) {
        this.num = num;
    }

    public void transmit() {
        System.out.println("Constellation of comsats");
    }
}

class Galileo extends Constellation {
    int height, incl;

    Galileo(int x, int y) {
        super(x);
        height = x;
        incl = y;
    }

    public void transmit() {
        System.out.println("Galileo");
    }
}