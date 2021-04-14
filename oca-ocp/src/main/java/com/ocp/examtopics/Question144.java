package com.ocp.examtopics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question144 {
    public static void main(String[] args) {
        List<Person144> emps = new ArrayList<>();
        emps.add(new Person144("C"));
        emps.add(new Person144("B"));
        emps.add(new Person144("A"));
        Collections.sort(emps);

        emps.forEach(e -> System.out.println(e.name));
    }
}

class Person144 implements Comparable<Person144> {
    String name;

    public Person144(String name) {
        this.name = name;
    }

    public int compareTo(Person144 p) {
        return this.name.compareTo(p.name);
    }
}

// At line n2 insert public int compareTo (Person p) { return this.name.compareTo (p.name); }
// Replace line n1 with class Person implements Comparable<Person>
