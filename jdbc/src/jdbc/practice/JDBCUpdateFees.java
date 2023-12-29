//Q4:  WA JDBC program to update fees of students as 35000, who have fees greater than 50000.

package jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUpdateFees {
	private static Connection connection;
	private static PreparedStatement  preparedStatement;
	private static String query;
	
	public static void main(String [] args)
	{
		try {
			connection=openConnnection();
			query="UPDATE student SET fees=35000 where fees>5000";
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
			}
		}
	}

	private static void closeConnection() throws SQLException {
		if(preparedStatement!=null) {
			preparedStatement.close();
		}
		if(connection!=null)
		{
			connection.close();
		}
	}

	private static Connection openConnnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3","root","root") ;
	}
	
	

}
