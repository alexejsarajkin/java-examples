package com.ocp.examtopics;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question136 {
    public static void main(String[] args) {
        Deque<Integer> nums = new ArrayDeque<>();
        nums.add(1000);
        nums.push(2000);
        nums.add(3000);
        nums.push(4000);
        Integer i1 = nums.remove();
        Integer i2 = nums.pop();
        System.out.println(i1);
        System.out.println(i2);
    }
}
