package com.ocp.book.oracle.streems;

public class Duck implements Comparable<Duck> {
    String name;
    String color;
    int age;

    public Duck(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name = " + name + ", color = " + color + ", age = " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Duck duck) {
        return this.getName().compareTo(duck.getName());
    }
}
