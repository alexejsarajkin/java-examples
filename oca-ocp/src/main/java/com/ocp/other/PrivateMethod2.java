package com.ocp.other;

public class PrivateMethod2 extends PrivateMethod {
    private void todo() {
        System.out.println("todo");
    }

    public static void main(String[] args) {
        PrivateMethod2 privateMethod2 = new PrivateMethod2();
        privateMethod2.todo();
    }


}
