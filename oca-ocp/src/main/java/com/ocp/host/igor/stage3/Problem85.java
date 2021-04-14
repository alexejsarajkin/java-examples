package com.ocp.host.igor.stage3;

public class Problem85 {
    public void check(String name, int age) throws NameException, ScoreOutOfLimitException {
        if (name.length() < 4) {
            throw new NameException();
        } else if (age >= 65) {
            throw new ScoreOutOfLimitException();
        } else {
            System.out.println("Passed.");
        }
    }

    public static void main(String[] args) throws NameException {
        Problem85 t = new Problem85();
        t.check("John", 65);
    }
}


class NameException extends Exception {
}

class ScoreOutOfLimitException extends NameException {
}