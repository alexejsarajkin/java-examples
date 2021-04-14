package com.ocp.examtopics;

public class Question40 {
    public static void main(String args[]) {
        Test1<String> type = new Test1<>();
        Test1 type1 = new Test1(); //line n1
        type.set("Java");
        type1.set(100); //line n2
        System.out.print(type.get() + " " + type1.get());
    }
}

class Test1<T> {
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

}
