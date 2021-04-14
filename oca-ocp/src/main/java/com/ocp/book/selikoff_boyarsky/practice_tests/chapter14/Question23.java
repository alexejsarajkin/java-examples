package com.ocp.book.selikoff_boyarsky.practice_tests.chapter14;

import java.util.ArrayList;
import java.util.List;

public class Question23 {
}

class Boss {
    private String name;

    public Boss(String name) {
        this.name = name;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public String toString() {
        return getName();
    }
}

class Initech {
    public static void main(String[] reports) {
        final List<Boss> bosses = new ArrayList(8);
        bosses.add(new Boss("Jenny"));
        bosses.add(new Boss("Ted"));
        bosses.add(new Boss("Grace"));
//        bosses.removeIf(s -> s.equalsIgnoreCase("ted")); System.out.print(bosses);
    }
}
