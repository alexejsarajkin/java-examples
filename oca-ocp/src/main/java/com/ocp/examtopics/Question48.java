package com.ocp.examtopics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question48 {
    public static void main(String[] args) {
        List<Emp1> emp = Arrays.asList(
                new Emp1("John", "Smith"),
                new Emp1("Peter", "Sam"),
                new Emp1("Thomas", "Wale"));
        emp.stream().sorted(Comparator.comparing(Emp1::getfName).reversed().thenComparing(Emp1::getlName));
    }
}

class Emp1 {
    String fName;
    String lName;

    public Emp1(String fn, String ln) {
        fName = fn;
        lName = ln;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }
}
