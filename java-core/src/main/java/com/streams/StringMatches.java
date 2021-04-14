package com.streams;

import java.util.Arrays;
import java.util.List;

public class StringMatches {


    public static void main(String[] args) {

        List<String> numbers = Arrays.asList("http://habrahabr.ru/post/260767/", "htt2p://habrahabr.ru/post/260767/", "http://habrahabr.r3u/post/260767/", "333", "A2A211");

        numbers.stream()
                .map(x -> {
                    if (x.matches("^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$")) {
                        return x;
                    }
                    System.out.println("Error: ");
                    return x;
                })
                .forEach(System.out::println);

        System.out.println("------------------------");

    }


}