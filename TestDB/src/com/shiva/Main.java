package com.shiva;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        // testing connection to the SQLite3 database.

        // try and except statement for the connection of the database
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\SQLite3\\Databases\\testjava.db");

            // to make commands in sql we first need to make the statements:
            Statement statement = conn.createStatement();

            // we;ve now made the Statement, we can now run the .execute() method to run our SQL statements.
            statement.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT )");

            // we can now add data into the database:
            statement.execute("INSERT INTO contacts (name, phone, email) VALUES ('shiva', 1234567890, 'shivaemail')");

            // generally it's good programming practice to close resources we are no longer using.
            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Failed to connect to the database: " + e.getMessage());
        }
        // we've now made the connection to the database


    }

}
