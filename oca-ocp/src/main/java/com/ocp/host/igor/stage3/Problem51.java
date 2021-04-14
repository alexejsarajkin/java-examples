package com.ocp.host.igor.stage3;

import java.util.function.ToIntFunction;

public class Problem51 {
    public static void main(String[] args) {
        String str = "Say what?!";
        ToIntFunction<String> indx = str::indexOf;   //line n1
        int a = indx.applyAsInt("Say");              //line n2
        System.out.println(a);
    }
}
