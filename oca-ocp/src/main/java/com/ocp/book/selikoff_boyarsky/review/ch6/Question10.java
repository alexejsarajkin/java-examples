package com.ocp.book.selikoff_boyarsky.review.ch6;

public class Question10 {
    private int addPlusOne(int a, int b) {
//		boolean assert = false;
        assert a++ > 0;
        assert b > 0;
        return a + b;
    }
}
