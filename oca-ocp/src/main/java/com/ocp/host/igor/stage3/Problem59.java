package com.ocp.host.igor.stage3;

public class Problem59 {
    public static void main(String[] args) throws Exception {
        Company comp1 = new Company("Google", 1998);
        Company comp2 = new Company("Microsoft", 1975);
        System.out.println(comp1);
        System.out.println(comp2);
    }
}

class NoNameException extends Exception {
}

class YearOutOfRangeException extends Exception {
}

class Company {
    String name;
    int est;

    Company(String name, int est) throws Exception {
        if (name == null) {
            throw new NoNameException();
        } else if (est <= 0 || est >= 2100) {
            throw new YearOutOfRangeException();
        } else {
            this.name = name;
            this.est = est;
        }
    }

    public String toString() {
        return name + " was founded in " + est;
    }
}
