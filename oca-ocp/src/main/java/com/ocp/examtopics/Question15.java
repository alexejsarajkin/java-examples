package com.ocp.examtopics;

import java.sql.*;

public class Question15 {

    public static void main(String[] args) throws Exception {
        try {
            String URL = "1";
            String username = "1";
            String password = "1";
            Connection conn = DriverManager.getConnection(URL, username, password);
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            st.execute("SELECT * FROM Employee");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                if (rs.getInt(1) == 112) {
                    rs.updateString(2, "Jack");
                }
            }
            rs.absolute(2);
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        } catch (SQLException ex) {
            System.out.println("Exception is raised");
        }
    }
}
