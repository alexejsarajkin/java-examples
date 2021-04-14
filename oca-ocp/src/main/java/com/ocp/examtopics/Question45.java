package com.ocp.examtopics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Question45 {
    static Connection newConnection = null;

    public static Connection getDBConnection() throws SQLException {
        String URL = "1";
        String username = "1";
        String password = "1";

        try (Connection con = DriverManager.getConnection(URL, username, password)) {
            newConnection = con;
        }
        return newConnection;
    }

    public static void main(String[] args) throws SQLException {
        getDBConnection();
        Statement st = newConnection.createStatement();
//        st.executeUpdate("INSERT INTO student VALUES(102, 'Kelvin')");
    }
}
