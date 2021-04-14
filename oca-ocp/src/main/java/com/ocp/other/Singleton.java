package com.ocp.other;

public class Singleton {
    private static Singleton single_instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }
}

class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}