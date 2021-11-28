package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
	
	public Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/desafiowl", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}

}
