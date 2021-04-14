package com.oca;

class GasException extends Exception {
}

class Element {
    public int getSymbol() throws GasException {
        return -1;
    }
}

public class Oxygen extends Element {
    public int getSymbol() {
        return 8;
    }

    public void printData() {
        try {
            System.out.print(getSymbol());
        } catch (Exception e) {
            System.out.print("Unable to read data");
        }
    }
}
