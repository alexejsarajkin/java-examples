package com.ocp.book.oracle.streems;

import java.util.*;
import java.util.stream.Collectors;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Beth", 30),
                new Person("Beth", 45),
                new Person("Eric", 31),
                new Person("Deb", 31),
                new Person("Liz", 30),
                new Person("Wendi", 34),
                new Person("Kathy", 35),
                new Person("Bert", 32),
                new Person("Bert", 38),
                new Person("Robert", 38),
                new Person("Bill", 34),
                new Person("Bill", 40)

        );

        List<Person> personList34 = personList.stream()
                .filter(p -> p.getAge() == 34)
                .collect(Collectors.toList());
        System.out.println(personList34);

        System.out.println("-------------");

        ArrayList<Person> person34ArrayList = personList.stream()
                .filter(p -> p.getAge() == 34)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(person34ArrayList);


        System.out.println("-------------");

        Map<Integer, List<Person>> groupBy = personList.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(groupBy);

        System.out.println("-------------");

        Map<Integer, Long> counting = personList.stream()
                .collect(Collectors.groupingBy(
                        Person::getAge,
                        Collectors.counting()
                ));
        System.out.println(counting);

        System.out.println("------------- mapping");

        Map<Integer, List<String>> namesByAge = personList.stream()
                .collect(
                        Collectors.groupingBy(
                                Person::getAge,
                                Collectors.mapping(
                                        Person::getName,
                                        Collectors.toList()
                                )
                        )
                );
        System.out.println(namesByAge);

        System.out.println("------------- partitioningBy");

        Map<Boolean, List<Person>> partitionOlder34 = personList.stream()
                .collect(
                        Collectors.partitioningBy(p -> p.getAge() > 34)
                );
        System.out.println(partitionOlder34);


        System.out.println("-------------");

        Map<String, Integer> subOfAges = personList.stream()
                .filter(p -> p.getName().startsWith("B"))
                .collect(
                        Collectors.groupingBy(
                                Person::getName,
                                Collectors.summingInt(Person::getAge)
                        )
                );
        System.out.println(subOfAges);

        System.out.println("-------------");

        Map<String, Double> avgOfAges = personList.stream()
                .filter(p -> p.getName().startsWith("B"))
                .collect(
                        Collectors.groupingBy(
                                Person::getName,
                                Collectors.averagingInt(Person::getAge)
                        )
                );
        System.out.println(avgOfAges);


        System.out.println("-------------");

        String older34 = personList.stream()
                .filter(p -> p.getAge() > 34)
                .map(Person::getName)
                .collect(Collectors.joining(","));

        System.out.println(older34);

        System.out.println("-------------");

        Optional<Person> oldest = personList.stream()
                .collect(
                        Collectors.maxBy((p1, p2) -> p1.getAge() - p2.getAge())
                );

        System.out.println(oldest);
    }
}
