package com.ocp.book.oracle.threads;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NameList {
    private List<String> names = Collections.synchronizedList(new LinkedList<>()); // Synchronized is redundant

    public void add(String name) {
        names.add(name);
    }

    public synchronized String removeFirst() {
        if (names.isEmpty())
            return names.remove(0);
        else
            return null;
    }
}
