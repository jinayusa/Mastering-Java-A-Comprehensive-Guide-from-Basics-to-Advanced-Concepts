//A practical example of connecting to a database using JDBC (Java Database Connectivity).
import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "password";

        try {
            // Establishing a connection
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful!");

            // Creating a statement
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(query);

            // Processing the results
            while (resultSet.next()) {
                System.out.println("User ID: " + resultSet.getInt("id"));
                System.out.println("User Name: " + resultSet.getString("name"));
            }

            // Closing the connection
            connection.close();

        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }
    }
}
