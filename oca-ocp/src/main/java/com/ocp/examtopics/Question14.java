package com.ocp.examtopics;

public class Question14 {
    public static void main(String[] args) {
        int rateOfInterest = 0;
        String accountType = "LOAN";
        switch (accountType) {
            case "RD":
                rateOfInterest = 5;
                break;
            case "FD":
                rateOfInterest = 10;
                break;
            default:
                assert false : "No interest for this account";
        }
        System.out.println("Rate of interest:" + rateOfInterest);
    }
}
