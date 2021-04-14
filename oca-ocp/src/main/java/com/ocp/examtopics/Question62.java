package com.ocp.examtopics;

public class Question62 {
    public static void main(String[] args) {
        Foo62<String, Integer> mark = new Foo62<String, Integer>("Steve", 100);

        Foo62<String, String> pair = Foo62.<String>twice("Hello World!");

        Foo62<?, ?> percentage = new Foo62<>(97, 32);

        Foo62<String, String> grade = new Foo62<>("John", "A");
    }

}

class Foo62<K, V> {
    private K key;
    private V value;

    public Foo62(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <T> Foo62<T, T> twice(T value) {
        return new Foo62<T, T>(value, value);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
