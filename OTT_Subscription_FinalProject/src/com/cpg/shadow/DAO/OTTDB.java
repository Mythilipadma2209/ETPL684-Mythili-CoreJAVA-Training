package com.cpg.shadow.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OTTDB {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Use the updated MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver"); // Updated driver class name

            // Database connection string, username, and password
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/projectdb", "root", "admin"
            );
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }

        return conn;
    }
}