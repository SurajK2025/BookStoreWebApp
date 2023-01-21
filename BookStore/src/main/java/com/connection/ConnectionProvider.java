package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	private static Connection con;
	public static Connection openConnetion() throws ClassNotFoundException, SQLException {
		if(con == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
		}
		return con;
	}
	
	public static void closeConnection() throws SQLException {
		if(con != null) {
			con.close();
		}
	}
}