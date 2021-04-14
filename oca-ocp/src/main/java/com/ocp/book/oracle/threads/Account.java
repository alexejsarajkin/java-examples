package com.ocp.book.oracle.threads;

public class Account {
    private int balance = 50;

    public int getBalance() {
        return balance;
    }

    public void withdrawal(int amount) {
        balance = balance - amount;
    }
}
