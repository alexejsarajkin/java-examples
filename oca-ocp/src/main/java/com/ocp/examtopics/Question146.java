package com.ocp.examtopics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Question146 {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            String URL = "1";
            String username = "1";
            String password = "1";

            Properties properties = new Properties();
            properties.put("user", username);
            properties.put("password", password);
            connection = DriverManager.getConnection(URL, properties);

            if (connection != null) {
                System.out.println("Connection Established");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

// Properties prop = new Properties(); prop.put ("user", userName); prop.put ("password", password); con = DriverManager.getConnection (dbURL, prop);
