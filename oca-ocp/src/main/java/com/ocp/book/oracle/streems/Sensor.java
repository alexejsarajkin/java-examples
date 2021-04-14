package com.ocp.book.oracle.streems;

public class Sensor {
    String value = "up";
    int i = 0;

    public String next() {
        return ++i > 10 ? "down" : "up";
    }
}
