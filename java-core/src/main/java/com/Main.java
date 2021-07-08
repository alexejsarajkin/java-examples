package com;


import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BigDecimal decimal1 = new BigDecimal(1);

        BigDecimal decimal2 = decimal1.subtract(new BigDecimal("0.0001"));

        System.out.println(decimal1);
        System.out.println(decimal2);
    }
}
