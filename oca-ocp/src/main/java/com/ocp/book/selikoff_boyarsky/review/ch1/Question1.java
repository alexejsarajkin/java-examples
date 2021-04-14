package com.ocp.book.selikoff_boyarsky.review.ch1;

public class Question1 {
    public int employeeId;
    public String firstName, lastName;
    public int yearStarted;

    @Override
    public int hashCode() {
        return employeeId;
    }

    public boolean equals(Question1 e) {
        return this.employeeId == e.employeeId;
    }

    public static void main(String[] args) {
        Question1 one = new Question1();
        one.employeeId = 101;
        Question1 two = new Question1();
        two.employeeId = 101;
        if (one.equals(two)) System.out.println("Success");
        else System.out.println("Failure");
    }
}
