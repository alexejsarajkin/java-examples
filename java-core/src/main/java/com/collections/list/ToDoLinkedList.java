package com.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ToDoLinkedList {

    private List<String> toDoList = new LinkedList<>();

    public void addToList(String task) {
        toDoList.add(task);
    }

    public void addToListAtPosition(int position, String task) {
        toDoList.add(position, task);
    }

    public void printToDoList() {
        Iterator<String> iterator = toDoList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element " + iterator.next());
        }
    }

    public void changeTask(int index, String task) {
        toDoList.set(index, task);
    }

    public void removeTask(String task) {
        toDoList.remove(task);
    }

    public int getPriority(String task) {
        return toDoList.indexOf(task);
    }

    public boolean addInAlphabeticalOrder(String task) {
        ListIterator<String> listIterator = toDoList.listIterator();
        while (listIterator.hasNext()) {
            int compared = listIterator.next().compareTo(task);
            if (compared == 0) {
                System.out.println("Task already exists in the list");
                return true;
            } else if (compared > 0) {
                listIterator.previous();
                listIterator.add(task);
                return true;
            }
        }
        toDoList.add(task);
        return true;
    }

}
