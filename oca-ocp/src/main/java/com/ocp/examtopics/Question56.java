package com.ocp.examtopics;

public class Question56 {
    public static void main(String[] args) {
        Book56 b1 = new Book56(101, "Java Programing");
        Book56 b2 = new Book56(102, "Java Programing");
        System.out.println(b1.equals(b2)); //line n2
    }
}

class Book56 {
    int id;
    String name;

    public Book56(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        boolean output = false;
        Book56 book = (Book56) obj;
        if (this.name.equals(book.name)) {
            output = true;
        }

        return output;
    }
}
