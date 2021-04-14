package com.ocp.book.oracle.serialization;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat = new Cat();
        cat.setName("CatName");
        cat.setType("CatType");
        cat.setStr("Animal name = cat");
        Cat.staticName = "Static name";
        cat.setCollar(new Collar(1));
        cat.setCustomCollar(new Collar(2));
        cat.setInvisibleCollar(new Collar(3));

        System.out.println(cat.toString());

        File file = new File("src/main/java/com/ocp/book/serialization/CatSer");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(cat);
        objectOutputStream.close();

        Cat.staticName = "";

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Cat newCat = (Cat) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(newCat.toString());
    }
}
