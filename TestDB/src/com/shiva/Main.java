package com.shiva;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        // testing connection to the SQLite3 database.

        // try and except statement for the connection of the database
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\SQLite3\\Databases\\testjava.db");
            // we've now made the connection to the database

            // to make commands in sql we first need to make the instance from the Statement class:
            Statement statement = conn.createStatement();

            // we;ve now made the Statement, we can now run the .execute() method to run our SQL statements.
            statement.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT )");
            statement.execute("CREATE TABLE IF NOT EXISTS employee (name TEXT, id INTEGER)");

            // we can now add data into the database:
            // statement.execute("INSERT INTO contacts (name, phone, email) VALUES ('shiva', 1234567890, 'shiva@email')");
            // statement.execute("INSERT INTO contacts (name, phone, email) VALUES ('james', 9876543210, 'james@email')");
            // statement.execute("INSERT INTO contacts (name, phone, email) VALUES ('anil', 9874563210, 'anil@email')");
            statement.execute("");


            // getting data from the database, and allowing java to use the data:
            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            // while loop through all the of the results

            while (results.next()) {
                System.out.println(results.getString("name") + " " + results.getInt("phone") + " " + results.getString("email"));
            }
            results.close();


            // generally it's good programming practice to close resources we are no longer using.
            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Failed to connect to the database: " + e.getMessage());
        }



    }

}
