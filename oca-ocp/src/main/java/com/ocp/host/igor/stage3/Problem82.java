package com.ocp.host.igor.stage3;

public class Problem82 {
    public static void main(String[] args) {
        Record<String, Integer> employee = new Record<String, Integer>("Smith", 25);
        Record<String, String> quote = Record.<String>write("Knowledge is power.");
//		 Record<Object, Object> score = new Record<String, Integer> ("Joe Random", 86);
        Record<String, String> animation = new Record<>("Shaun The Sheep", "Season 5");
    }
}

class Record<K, V> {
    private K key;
    private V value;

    public Record(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <T> Record<T, T> write(T value) {
        return new Record<T, T>(value, value);
    }

    public K getKey() {
        return key;
    }

    public V getVal() {
        return value;
    }
}