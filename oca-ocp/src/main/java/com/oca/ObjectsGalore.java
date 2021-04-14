package com.oca;

public class ObjectsGalore {
    static ObjectsGalore obj1, obj2, obj3, obj4;
    int numberOfObjects;

    public static int addObject(ObjectsGalore obj4) {
        return obj4.numberOfObjects *= 2;
    }

    public static void main(String[] args) {
        obj1 = obj2 = obj3 = new ObjectsGalore();
        obj4 = obj2;
        addObject(obj4);
    }
}
