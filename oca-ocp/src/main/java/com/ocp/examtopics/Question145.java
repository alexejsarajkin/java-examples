package com.ocp.examtopics;

import java.util.Arrays;
import java.util.List;

public class Question145 {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Smith", 1500),
                new Person("John", 2000),
                new Person("Joe", 1000)
        );

        double val = list.stream()
                .filter(s -> s.getFirstName().startsWith("J"))
                .mapToInt(Person::getSalary)
                .average()
                .getAsDouble();
        System.out.println(val);
    }
}

class Person {
    private String firstName;
    private int salary;

    public Person(String firstName, int salary) {
        this.firstName = firstName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getSalary() {
        return salary;
    }
}

// 1500.0
