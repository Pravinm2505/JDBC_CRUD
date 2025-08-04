import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/"; // Change host/port if needed
        String user = "root"; // Change to your MySQL username
        String password = ""; // Change to your MySQL password
        String dbName = "testdb"; // Change to your desired database name

        try {
            // Load MySQL JDBC Driver (optional for newer JDBC)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL server (no database specified)
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            // Create database
            String sql = "CREATE DATABASE IF NOT EXISTS " + dbName;
            stmt.executeUpdate(sql);
            System.out.println("Database '" + dbName + "' created successfully.");

            // Clean up
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

        String sql = "CREATE TABLE IF NOT EXISTS data(" +
                     "id INT AUTO_INCREMENT PRIMARY KEY, " +
                     "name VARCHAR(100) NOT NULL, " +
                     "value VARCHAR(100)" +
                     ")";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(sql);
            System.out.println("Table 'data' created successfully.");
             } catch (Exception e) {
                e.printStackTrace();
             }
            }
}