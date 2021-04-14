package com.oca;

class IndianaX {
    public String markTheSpot() {
        return "X";
    }
}

class IndianaY extends IndianaX {
    public String markTheSpot() {
        return "Y";
    }
}

class IndianaZ extends IndianaY {
    public String markTheSpot() {
        return "Z";
    }
}

class IndianaA extends IndianaZ {
}

public class Indiana {
    public static void main(String[] args) {
        System.out.println(new IndianaA().markTheSpot() + " never, ever marks the spot");
    }
}
