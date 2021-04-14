package com.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalCatch {
    public static void main(String[] args) {
        try {
            new BigDecimal("test");

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
