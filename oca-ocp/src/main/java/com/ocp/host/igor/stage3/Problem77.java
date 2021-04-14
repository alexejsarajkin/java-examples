package com.ocp.host.igor.stage3;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Problem77 {
    public static void main(String[] args) {
        Path pa = Paths.get("home/user.dat");
        System.out.println(pa.getNameCount()
                + " - " + pa.getName(0)
                + " - " + pa.getName(1)
                + " - " + pa.getFileName());
    }
}
