package com.ocp.book.oracle.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Cat extends Animal implements Serializable {
    public static String staticName;
    private String name;
    private String type;

    private Collar collar;
    private transient Collar customCollar;
    private transient Collar invisibleCollar;

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeInt(customCollar.getSize());
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        customCollar = new Collar(ois.readInt());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Collar getInvisibleCollar() {
        return invisibleCollar;
    }

    public void setInvisibleCollar(Collar invisibleCollar) {
        this.invisibleCollar = invisibleCollar;
    }

    public Collar getCustomCollar() {
        return customCollar;
    }

    public void setCustomCollar(Collar customCollar) {
        this.customCollar = customCollar;
    }

    public Collar getCollar() {
        return collar;
    }

    public void setCollar(Collar collar) {
        this.collar = collar;
    }

    @Override
    public String toString() {
        return "Cat - " +
                "name='" + name + '\'' +
                "static name='" + staticName + '\'' +
                ", type='" + type + '\'' +
                ", invisibleCollar=" + invisibleCollar +
                ", customCollar=" + customCollar +
                ", collar=" + collar + '\'' +
                ", animal=" + getStr();
    }
}

