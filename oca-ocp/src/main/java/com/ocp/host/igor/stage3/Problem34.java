package com.ocp.host.igor.stage3;

public class Problem34 {
    public static void main(String[] args) {
//		Bread b1 = new Bread();
//		b1.eat("bread.");
//		Bread b2 = new Pizza();
//		b2.eat("Quattro Stagioni.");
    }
}

class Bread {
    private String eat(String piece) {
        return "Consume " + piece;
    }
}


class Pizza extends Bread {
    public String eat(String slice) {
        return "Enjoy " + slice;
    }
}
