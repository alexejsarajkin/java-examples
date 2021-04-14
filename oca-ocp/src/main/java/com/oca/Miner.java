package com.oca;

class Mineral {
}

class Gem extends Mineral {
}

public class Miner {
    static int x = 7;
    static String s = null;

    public static void getWeight(Mineral m) {
        int y = 0 / x;
        System.out.println(s + " ");
    }

    public static void main(String[] args) {
        Mineral[] ma = {new Mineral(), new Gem()};
        for (Object o : ma) {
            getWeight((Mineral) o);
        }
    }
}
