package com.designpatterns.creational.singleton.databaseConnection;

/**
 * Singleton class for managing a database connection.
 * Ensures only one instance exists throughout the application.
 */
public class DatabaseConnection {

    // Static variable to hold the single instance
    private static DatabaseConnection instance;

    // Private constructor prevents instantiation from other classes
    private DatabaseConnection() {
        System.out.println("DatabaseConnection instance created.");
    }

    // Public method to provide access to the instance (lazy initialization)
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Example method to simulate a query
    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}
