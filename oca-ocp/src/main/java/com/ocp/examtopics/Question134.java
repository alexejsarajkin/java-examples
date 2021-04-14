package com.ocp.examtopics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question134 {
    public static void main(String[] args) {
        List<Person134> sts = Arrays.asList(
                new Person134("Jack", 30),
                new Person134("Mike Hill", 21),
                new Person134("Tomas Hill", 24)
        );
        Stream<Person134> resList = sts.stream().filter(s -> s.getAge() >= 25);
        long count = resList.filter(s -> s.getName().contains("Hill")).count();
        System.out.println(count);
    }
}

class Person134 {
    String name;
    int age;

    public Person134(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// 0
