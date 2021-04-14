package com.ocp.host.igor.stage3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Problem31 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("GoVPN.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("option1"));
        System.out.println(prop.getProperty("option2", "Opera ver.46.0"));   //line n1
        System.out.println(prop.getProperty("option3"));
    }
}
