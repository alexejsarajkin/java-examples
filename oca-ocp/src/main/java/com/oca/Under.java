package com.oca;

class Upper {
    String go() {
        return "Hi ";
    }
}

class Mid extends Upper {
}


public class Under extends Mid {
    static String s = " ";

    public static void main(String[] args) {
        Upper u = new Under();
        s = u.go();
        Mid m = (Mid) u;

    }

}
