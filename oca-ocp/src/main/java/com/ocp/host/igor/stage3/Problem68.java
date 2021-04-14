package com.ocp.host.igor.stage3;

public class Problem68 {

    public static void main(String[] args) {
        LongDistanceVoIP ld = new LongDistanceVoIP(1.1);
        ld.makeCall(10);
    }
}

class LongDistanceVoIP {
    double tariff;

    LongDistanceVoIP(double tariff) {
        this.tariff = tariff;
    }

    public void makeCall(int time) {
        int minutes = time;
        class CallingChicago {                              // line n1
            double charge = 0;

            public void calcCost() {
                charge = minutes * tariff;                  // line n2
                System.out.println("It'll set me back for " + charge + " cents.");
            }
        }
        new CallingChicago().calcCost();                    // line n3
    }
}