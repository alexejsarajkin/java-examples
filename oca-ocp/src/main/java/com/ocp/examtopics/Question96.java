package com.ocp.examtopics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Question96 {
    public static void main(String[] args) {
        String URL = "1";
        String username = "1";
        String password = "1";

        try {
            Properties properties = new Properties();
            properties.put("user", username);
            properties.put("password", password);
            Connection connection = DriverManager.getConnection(URL, properties);
            if (connection != null) {
                System.out.println("Connection Established");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
