package com.oca;

public class Tester {
    public static void main(String[] args) {
        TesterBeta b1 = new TesterBeta();
        TesterBeta b2 = new TesterBeta();
        TesterAlpha a1 = new TesterAlpha();
        TesterAlpha a2 = new TesterAlpha();

        a1.b1 = b1;
        a1.b2 = b1;
        a2.b2 = b2;
        a1 = null;
        b1 = null;
        b2 = null;
    }
}

class TesterBeta {
}

class TesterAlpha {
    static TesterBeta b1;
    TesterBeta b2;
}
