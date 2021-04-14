package com.ocp.examtopics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Question106 {
    public static void main(String[] args) {
        String URL = "1";
        String username = "1";
        String password = "1";

        try {
            Connection connection = DriverManager.getConnection(URL, username, password);
            String query = "SELECT * FROM Employee WHERE ID = 110";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            System.out.println(resultSet.getInt("ID"));
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}

// The code prints Error.
