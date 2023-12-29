package jdbc;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCDelete {

	private static Connection connection;
	private static Statement statement;
	private static String query;

	public static void main(String[] args) {

		try {
			connection = openConnection();
			statement = connection.createStatement();
			query = "DELETE FROM student WHERE SId = 4";
			int row = statement.executeUpdate(query);
			System.out.println(row + " row(s) affected.");
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static Connection openConnection() throws SQLException, ClassNotFoundException, IOException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		File file = new File("F:\\J2EE\\jdbcinfo.txt");
		FileReader fileReader = new FileReader(file);
		Properties properties = new Properties();
		properties.load(fileReader);
		return DriverManager.getConnection(properties.getProperty("url"), properties);

	}

	private static void closeConnection() throws SQLException {

		if (statement != null) {
			statement.close();
		}
		if (connection != null) {
			connection.close();
		}

	}

}
