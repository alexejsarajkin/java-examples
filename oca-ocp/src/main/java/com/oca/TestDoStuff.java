package com.oca;

public class TestDoStuff {
    public static void main(String[] args) {
        TestDoStuffBeta testDoStuffBeta = new TestDoStuffBeta();
    }
}

class TestDoStuffAlpha {
    TestDoStuffAlpha doStuff(char c) {
        return new TestDoStuffAlpha();
    }
}

class TestDoStuffBeta extends TestDoStuffAlpha {
    TestDoStuffBeta doStuff(char c) {
        return new TestDoStuffBeta();
    }
}
