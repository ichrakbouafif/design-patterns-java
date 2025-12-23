package com.designpatterns.creational.singleton.databaseConnection;

public class Main {
    public static void main(String[] args) {

        // Attempt to get two instances
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();

        // Both references point to the same instance
        System.out.println("Are both connections the same? " + (connection1 == connection2));

        // Use the connection
        connection1.query("SELECT * FROM users");
        connection2.query("UPDATE users SET active = 1 WHERE id = 5");
    }
}
