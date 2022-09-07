package com.quinnox;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {

	
		public static final String url = "jdbc:mysql://localhost:3306/items";
		public static final String user = "root";
		public static final String password = "Password@1";
		
		
		public static Connection getConnection() throws SQLException {
			
			Connection conn = DriverManager.getConnection(url, user, password);
			if (conn.isValid(4)) {
				System.out.println("Connection is establishes to database");
			}
			return conn;
		}
}


