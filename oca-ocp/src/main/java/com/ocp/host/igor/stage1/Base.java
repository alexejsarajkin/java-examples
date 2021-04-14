package com.ocp.host.igor.stage1;

class Base {
    String name = "";

    Base(String name) {
        this.name = name;
    }
}

class Test extends Base {
    String test = "Test";
    static String best = "Best";

    String run() {
        return test;
    }

    static String walk() {
        return best;
    }

    Test() {
//       super(test);     // INVALID: "cannot reference test before supertype ctor has been called"
//       super( run() );  // INVALID: "cannot reference this before supertype ctor has been called"
        super(walk());  // VALID
    }
}
