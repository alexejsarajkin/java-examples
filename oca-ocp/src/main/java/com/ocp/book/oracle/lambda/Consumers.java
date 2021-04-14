package com.ocp.book.oracle.lambda;

import java.util.Map;
import java.util.function.BiConsumer;

public class Consumers {
    public static void main(String[] args) {
        Map<String, String> env = System.getenv();
        User user = new User();

        BiConsumer<String, String> findUserName = (key, value) -> {
            if (key.equals("USER")) user.setName(value);
        };
        env.forEach(findUserName);
        System.out.println(user.getName());

    }
}
