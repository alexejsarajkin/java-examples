package com.oca;

class Production {
    static int count = 0;
    int a = 0;

    public void rampUp() {
        while (a < 10) {
            a++;
            count++;
        }
    }

    public static void main(String[] args) {
        Production p1 = new Production();
        Production p2 = new Production();
        p1.rampUp();
        p2.rampUp();
        System.out.print("p1.count = " + p1.count + ", p2.count = " + p2.count);
    }
}
