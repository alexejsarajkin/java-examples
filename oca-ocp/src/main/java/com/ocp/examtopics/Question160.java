package com.ocp.examtopics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question160 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("sales", "Ada"),
                new Employee("sales", "Bob"),
                new Employee("hr", "Bob"),
                new Employee("hr", "Eva")
        );
        Stream<Employee> sorted = employees.stream()
                .sorted(Comparator.comparing((Employee e) -> e.getDept())
                        .thenComparing((Employee e) -> e.getName()));

        System.out.println(sorted.collect(Collectors.toList()));
    }
}

class Employee {
    String dept, name;

    public Employee(String dept, String name) {
        this.dept = dept;
        this.name = name;
    }

    @Override
    public String toString() {
        return dept + ":" + name;
    }

    public String getDept() {
        return dept;
    }

    public String getName() {
        return name;
    }
}

// [hr:Bob, hr:Eva, sales:Ada, sales:Bob]
