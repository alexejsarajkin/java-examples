package com.ocp.book.selikoff_boyarsky.practice_tests.chapter11;

public class Question30 {
    public static void main(String[] args) {
        Building b = new Building();
        House h = new House();
        Building bh = new House();
        House p = (House) b;
        House q = (House) h;
        House r = (House) bh;
    }
}

class Building {
}

class House extends Building {
}
