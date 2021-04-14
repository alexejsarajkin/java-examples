package com.ocp.examtopics;

public class Question5 {
    public static void main(String[] args) {
//        Book b1 = new Book();
//        b1.read("Java Programing");
//        Book b2 = new EBook();
//        b2.read("http://ebook.com/ebook");
    }
}

class Book {
    private String read(String name) {
        return "Read" + name;
    }
}

class EBook extends Book {
    public String read(String url) {
        return "View" + url;
    }
}
