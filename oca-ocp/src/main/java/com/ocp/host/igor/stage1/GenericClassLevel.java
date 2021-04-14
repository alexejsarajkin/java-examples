package com.ocp.host.igor.stage1;

import java.util.ArrayList;
import java.util.List;

public class GenericClassLevel<T> {
    T name;

    GenericClassLevel(T name) {
        this.name = name;
    }

    void run(T arg) {
        System.out.println(arg.getClass().getSimpleName());
    }

    static <T> List<T> doStuff(T elem) {        // this T is completely different
        List<T> list = new ArrayList<>();      // from the previous one
        list.add(elem);
        return list;
    }

    public static void main(String[] args) {

        new GenericClassLevel<>("Name").run("Age");                                              // String
        System.out.println(doStuff(1).get(0).getClass().getSimpleName());   // Integer

    }
}

//class Test<T>{
//	static void doStuff(){
//		List<T> list = new ArrayList<>();
//	}
//}
