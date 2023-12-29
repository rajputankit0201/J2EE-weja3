package jdbc.cardekhoproject;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.util.Scanner;

	public class CarMainJDBC {
	    private static Connection connection;
	    private static String url = "jdbc:mysql://localhost:3306/weja3";
	    private static String username = "root";
	    private static String password = "root";

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter car ID to update:");
	        int id = scanner.nextInt();
	        scanner.nextLine();
	        System.out.println("Enter new car name:");
	        String name = scanner.nextLine();
	        System.out.println("Enter new car brand:");
	        String brand = scanner.nextLine();
	        System.out.println("Enter new car price:");
	        double price = scanner.nextDouble();
	        scanner.close();

	        try {
	            connection = DriverManager.getConnection(url, username, password);
	            String query = "UPDATE cars SET name = ?, brand = ?, price = ? WHERE id = ?";
	            PreparedStatement preparedStatement = connection.prepareStatement(query);
	            preparedStatement.setString(1, name);
	            preparedStatement.setString(2, brand);
	            preparedStatement.setDouble(3, price);
	            preparedStatement.setInt(4, id);
	            int rowsAffected = preparedStatement.executeUpdate();
	            System.out.println(rowsAffected + " row(s) updated.");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (connection != null) {
	                    connection.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}
