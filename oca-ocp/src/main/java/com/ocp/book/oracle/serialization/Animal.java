package com.ocp.book.oracle.serialization;

import java.io.Serializable;

public class Animal implements Serializable {
    private String str = "Animal";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
