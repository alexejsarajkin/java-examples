package com.oca;

public class TestingMain {


    void main() {
        System.out.println("one");
    }

    static void main(String args) {
        System.out.println("two");
    }

    public static void main(String[] args) {
        System.out.println("three");
    }

    void main(Object[] args) {
        System.out.println("four");
    }
}

class TestingMainMain {
    public static void main(String[] args) {
        TestingMain.main(args);
    }
}
