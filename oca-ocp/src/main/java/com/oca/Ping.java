package com.oca;

class Utils {
    int getInt(String x) throws Exception {
        System.out.println("Utils");
        return 7;
    }
}

public class Ping extends Utils {
    public static void main(String[] args) {
        Utils u = new Ping();
//    System.out.println(u.getInt("8"));
    }

    int getInt(String x) {
        System.out.println("Ping");
        return Integer.parseInt(x);
    }
}
