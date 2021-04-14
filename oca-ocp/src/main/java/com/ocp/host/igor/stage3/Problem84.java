package com.ocp.host.igor.stage3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem84 {
    public static void main(String[] args) {
        List<Coder> list = Arrays.asList(
                new Coder("Alice", Coder.Gender.FEMALE),
                new Coder("Chuck", Coder.Gender.MALE),
                new Coder("Bob", Coder.Gender.MALE));
        Map<Coder.Gender, List<String>> classification = list.stream().
                collect(Collectors.groupingBy(Coder::getGender,
                        Collectors.mapping(Coder::getName, Collectors.toList())));
        System.out.println(classification);
    }
}

class Coder {
    enum Gender {
        FEMALE, MALE,
    }

    String name;
    Gender gender;

    public Coder(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }
}
