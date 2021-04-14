package com.oca;

public class Election {

    public static void main(String[] args) {
        new Election().calculateResult(null, 203);
    }

    private void calculateResult(Integer candidateA, Integer candidateB) {
        boolean process = candidateA == null || candidateA.intValue() < 10;
//    boolean value = candidateA && candidateB;
//    System.out.println(process || value);
    }
}
