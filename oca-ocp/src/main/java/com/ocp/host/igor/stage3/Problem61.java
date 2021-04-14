package com.ocp.host.igor.stage3;

public class Problem61 {
    public static void main(String[] args) throws DataEncryptedException, Exception {
        Computer c = new SuperCluster();
        c.crunch();
    }
}

class DataEncryptedException extends Exception {
}

class Computer {
    protected void crunch() throws Exception {  // line n1
        System.out.println("Yummy!");
    }
}

class SuperCluster extends Computer {
    public void crunch() throws Exception {        // line n2
        super.crunch();
    }
}
