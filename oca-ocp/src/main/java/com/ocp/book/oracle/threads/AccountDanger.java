package com.ocp.book.oracle.threads;

public class AccountDanger implements Runnable {
    private Account account = new Account();

    public static void main(String[] args) {
        AccountDanger accountDanger = new AccountDanger();
        Thread one = new Thread(accountDanger, "Fred");
        Thread two = new Thread(accountDanger, "Lucy");
        one.start();
        two.start();
    }

    @Override
    public void run() {
        for (int x = 0; x < 5; x++) {
            makeWithdrawal(10);
            if (account.getBalance() < 0) System.out.println("Account is overdrawn!");
        }
    }

    private synchronized void makeWithdrawal(int amt) {
        if (account.getBalance() >= amt) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.withdrawal(amt);
            System.out.println(Thread.currentThread().getName() + " is completes the withdrawal");
        } else {
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + account.getBalance());
        }
    }
}
