package com.controlstatement;

public class WhileDo {
    public static void main(String[] args) {

        int finalBalance = 1000000;
        double currentBalance = 0;
        int payment = 10000;
        int years = 0;
        double interestRate = 0.03;

        while (currentBalance < finalBalance) {
            currentBalance += payment;
            currentBalance = currentBalance + currentBalance * interestRate;
            years++;
        }

        System.out.println("CurrentBalance = " + currentBalance);
        System.out.println("Years = " + years);
    }
}
