package com.oca;

class Heroes {
    static String s = "-";

    Heroes() {
        s += "h1 ";
//    this(1);
    }

    Heroes(int x) {
        s += "h2 ";
    }
}

public class XmenHeroes extends Heroes {
    public static void main(String[] args) {
        new XmenHeroes();
        System.out.println(s);
    }

    XmenHeroes() {
        s += "h2 ";
    }
}
