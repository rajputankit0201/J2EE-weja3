package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert {
	public static void main(String[] args) throws SQLException {
		//static query
		//Register Driver
		
		Driver driver =new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		
		//open connection
		
		Connection connection= DriverManager.getConnection("jdbc://localhost:3306/weja3?user=root&&password=root");
		
		
		//create statement
		Statement statement = connection.createStatement();
		
		//Execute statement
		statement.execute("INSERT INTO student VALUES(1,'ram', 'ram@gmail.com',1000");
		
		//Process result
		System.out.println("Data inserted.");
		
		//Close the connection 
		statement.close();
		connection.close();
		
		//DeRegister Driver
		DriverManager.deregisterDriver(driver);
	}

}
