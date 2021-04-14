package com.ocp.examtopics;

public class Question127 {
    public static void main(String[] args) {
        ProductCode<Number, Integer> c1 = new ProductCode<Number, Integer>();
//        ProductCode<Number, String> c2 = new ProductCode<Number, String>();
    }
}

class ProductCode<T, S extends T> {
    T c1;
    S c2;
}
