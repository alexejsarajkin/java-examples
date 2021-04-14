package com.ocp.book.oracle.serialization;

import java.io.Serializable;

public class Collar implements Serializable {
    private int size;

    public Collar(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Collar size=" + size;
    }
}
