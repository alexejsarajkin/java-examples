package com.oca;

class Tire {
    void doStuff() {
    }
}

public class Retread extends Tire {
    public static void main(String[] args) {
        new Retread().doStuff();
    }

    void doStuff() {
//  void doStuff() throws MyException {
//  void doStuff() throws Exception{
//  void doStuff() throws RuntimeException{
//  void doStuff() throws ArithmeticException{
        System.out.println(7 / 0);
    }
}
