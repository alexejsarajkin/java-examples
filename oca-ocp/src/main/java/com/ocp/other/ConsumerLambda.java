package com.ocp.other;

import java.util.function.Consumer;

public class ConsumerLambda {
    public static void main(String[] args) {
        Consumer<Integer> cons = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                new Integer(10);
            }

        };
    }
}
