package com.ocp.host.igor.stage3;

import java.util.ArrayList;
import java.util.List;


public class Problem2 {
    static class Plant {
        public String brew(String msg) {
            return msg;
        }
    }

    static class Coffee extends Plant {
        public String brew(String msg) {
            return msg.replace('a', 'e');
        }
    }

    static class Arabica extends Coffee {
        public String brew(String msg) {
            return msg.substring(2);
        }
    }

    public static void main(String[] args) {
        List<Plant> cup = new ArrayList<Plant>();
        cup.add(new Plant());
        cup.add(new Coffee());
        cup.add(new Arabica());
        for (Plant item : cup) {
            System.out.println(item.brew("Java"));
        }
    }
}
