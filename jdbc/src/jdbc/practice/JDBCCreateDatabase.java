package jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCCreateDatabase {

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	
	
	public static void main(String[] args) {
		try {
			connection =openConnection();
			query="CREATE DATABASE weja300";
			preparedStatement=connection.prepareStatement(query);
			int row=preparedStatement.executeUpdate();	
			System.out.println(row+ " rows affected");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				closeConnection();			
				} catch (Exception e2) {
					e2.printStackTrace();
				
			}
		}
	}
	private static void closeConnection() {
		
		
	}


	private static Connection openConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
	}

}
