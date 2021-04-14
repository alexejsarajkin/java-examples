package com.ocp.examtopics;

public class Question111 {
    public static void main(String[] args) {
        Question111 question111 = new Question111();
        double newPrice = question111.applyDiscount(Double.parseDouble("0"));
        System.out.println(newPrice);
    }

    public double applyDiscount(double price) {
        assert (price > 0);
        return price * 0.5;
    }
}

// New Price: 0.0
