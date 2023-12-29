//Q1: - Write a JDBC program to insert five records of a student into a table.

package jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentJDBC {

	
	private static Connection  connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	
	public static void main(String[] args) throws ClassNotFoundException {
		Scanner scanner = new Scanner(System.in);
		
		try {
			connection = openConnection();
			query= "INSERT INTO student VALUES(?,?,?,?)";
			preparedStatement= connection.prepareStatement(query);
			for(int i=1;i <=5; i++) {
				System.out.println("Enter student id.");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter student name.");
				String  name = scanner.nextLine();
				System.out.println("Enter student email.");
				String email = scanner.nextLine();
				System.out.println("Enter student fees.");
				double fees = scanner.nextDouble();
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, name);
				preparedStatement.setString(3, email);
				preparedStatement.setDouble(4, fees);
				preparedStatement.addBatch();

			}
			scanner.close();
			int[] res = preparedStatement.executeBatch();
			System.out.println(res.length + " row(s) affected.");
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	private static Connection openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3","root","root");
	}
	private static void closeConnection() throws SQLException {
		if (preparedStatement != null) {
			preparedStatement.close();
		}
		if (connection != null) {
			connection.close();
		}
	}
	
}
