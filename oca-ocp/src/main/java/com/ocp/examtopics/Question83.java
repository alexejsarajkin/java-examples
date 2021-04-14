package com.ocp.examtopics;

public class Question83 {
    public static void main(String[] args) {
        Engine carEngine = new Engine();
        carEngine.operate();
    }
}

abstract class Operator {
//    protected void turnOn();
//    protected void turnOff();

    protected abstract void turnOn();

    protected abstract void turnOff();
}

class EngineOperator extends Operator {
    @Override
    protected void turnOn() {
        System.out.println("ON");
    }

    @Override
    protected void turnOff() {
        System.out.println("OFF");
    }
}

class Engine {
    Operator m = new EngineOperator();

    public void operate() {
        m.turnOn();
        m.turnOff();
    }
}
