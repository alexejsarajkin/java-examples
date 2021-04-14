package com.ocp.host.igor.stage3;

public class Problem90 {
    public static void main(String args[]) {
        Test1<String> obj1 = new Test1<>();
        Test1 obj2 = new Test1();                 // line n1
        obj1.setT("1Z0");
        obj2.setT(809);                         // line n2
        System.out.print(obj1.getT() + "-" + obj2.getT());
    }
}

class Test1<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}