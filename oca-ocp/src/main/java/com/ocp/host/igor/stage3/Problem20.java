package com.ocp.host.igor.stage3;

public class Problem20 {
}

class WhiteStarLiner implements Sinkable {
    public void sink() {
    }
}

abstract class Shipwreck extends WhiteStarLiner {
}

class Britannic extends WhiteStarLiner {
    protected void sink(int numberOfMines) {
    }
}

class Titanic extends WhiteStarLiner implements Sinkable {
    public void hitIceberg() {
    }
}

interface Sinkable {
    public abstract void sink();
}