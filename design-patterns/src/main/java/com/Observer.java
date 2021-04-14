package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Observer {
    public static void main(String[] args) {
        GuineaPig guineaPig = new GuineaPig("Vasya", 1);
        PigListener pigListener = new PigListener();

        guineaPig.addPropertyChangeListener(pigListener);
        guineaPig.setName("Vovchik");
        guineaPig.setAge(2);

    }
}

class GuineaPig implements Serializable {
    private String name;
    private int age;
    private final Set<PropertyChangeListener> listenerSet = new HashSet<>();

    public GuineaPig() {

    }

    public GuineaPig(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        PropertyChangeEvent propertyChangeEvent =
                new PropertyChangeEvent(this, "name", this.name, name);
        this.name = name;
        this.listenerSet.forEach(e -> e.propertyChange(propertyChangeEvent));
    }

    public void setAge(int age) {
        PropertyChangeEvent propertyChangeEvent =
                new PropertyChangeEvent(this, "age", this.age, age);
        this.age = age;
        this.listenerSet.forEach(e -> e.propertyChange(propertyChangeEvent));
    }

    public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        this.listenerSet.add(propertyChangeListener);
    }
}

class PigListener implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        switch (evt.getPropertyName()) {
            case "name":
            case "age":
                System.out.println(evt.getOldValue());
                System.out.println(evt.getNewValue());
                break;
            default:
                System.out.println("Default");
        }
    }
}