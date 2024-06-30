package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String URL = "jdbc:mysql://localhost:3306/java_backend";
	private final String USER = "app_goal";
	private final String PASS = "goal_2024!";
	
	private Connection conn = null;
	
	public Connection getConn() {
		
		if (conn == null) connetti();
		return conn;
	}
	
	private void connetti() {
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Sei connesso al DB");
		} catch (SQLException e) {
			System.err.println("Non sei connesso al DB " + e.getMessage());
		}
		
		
	}
	
}
