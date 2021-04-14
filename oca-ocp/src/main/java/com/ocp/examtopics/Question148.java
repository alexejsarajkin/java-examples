package com.ocp.examtopics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question148 {
    public static void main(String[] args) {

    }

    private void run() {
        List<String> li = Arrays.asList("Dog", "Cat", "Mouse");
        Animal animal = new Animal();
        animal.setList(li.stream().collect(Collectors.toList()));
//        animal.getList().forEach(Animal::printValues);
    }
}

class Animal {
    List<String> list = null;

    public void printValues() {
        System.out.println(getList());
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}

// A compilation error occurs.
