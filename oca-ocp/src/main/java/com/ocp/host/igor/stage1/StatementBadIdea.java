package com.ocp.host.igor.stage1;


public class StatementBadIdea {
    public static void main(String[] args) {
//		Statement stmt = null;               // bad idea
//		Connection c = DriverManager.getConnection("jdbc:_smth_valid_", "app", "app");   // throws SQLException
//		try (stmt = c.createStatement() ;){   // INVALID: should've been try(Statement stmt = c.createStatement();)
//			ResultSet rs = stmt.executeQuery("select * from EMPLOYEE");
//			while (rs.next()) {
//				System.out.println(rs.getString(0));
//			}
//		} catch(SQLException e){
//			System.out.println("Exception ");
//		}
    }
}
