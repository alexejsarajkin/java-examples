package com.ocp.host.igor.stage2;

public class Problem10 {
}

class Daddy {
    private String firstName, lastName;

    protected void showName() {
        System.out.println(firstName + " " + lastName);
    }

    private Daddy(String firstName) {
        this.firstName = firstName;
        showName();
    }

    protected Daddy(String firstName, String lastName) {
        this(firstName);
        this.lastName = lastName;
        showName();
    }
}

class Sonny extends Daddy {
    Sonny() {
        super("", "");

    }

    Sonny(String firstName, String lastName) {
        super("", "");
//		this();
    }
}
