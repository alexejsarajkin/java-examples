package com.ocp.host.igor.stage3;

import java.util.ArrayList;
import java.util.List;

public class Problem33 {
    public static void main(String[] args) {
//		List<Item> inventory = Arrays.asList(
//				new Item(1, 10),
//				new Item(2, 15),
//				new Item(3, 20)
//		);

        List<Item> inventory = new ArrayList<>();
        inventory.add(new Item(1, 10));
        inventory.add(new Item(2, 15));
        inventory.add(new Item(3, 20));

        Item item = inventory.stream()
                .reduce(new Item(4, 0), (x, y) -> {
                    x.price += y.price;
                    return new Item(x.id, y.price);
                });

        inventory.add(item);

        inventory.stream()
                .parallel()
                .reduce((x, y) ->
                        x.price > y.price ? x : y
                )
                .ifPresent(System.out::println);
    }
}

class Item {
    int id;
    int price;

    public Item(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public String toString() {
        return id + " : " + price;
    }
}
