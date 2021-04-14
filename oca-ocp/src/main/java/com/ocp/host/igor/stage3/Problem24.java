package com.ocp.host.igor.stage3;

import java.util.Set;
import java.util.TreeSet;

public class Problem24 {
    public static void main(String[] args) {
        Set<MutualFund> funds = new TreeSet<>();
        funds.add(new MutualFund(293, "Pimco"));
        funds.add(new MutualFund(190, "Vanguard"));
        System.out.println(funds);
    }
}

class MutualFund {
    int capital;
    String name;

    public MutualFund(int capital, String name) {
        this.capital = capital;
        this.name = name;
    }

    public String toString() {
        return capital + ":" + name;
    }
}
