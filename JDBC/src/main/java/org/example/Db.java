package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
    private static final String URL = "jdbc:mysql://localhost:3306";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void con() {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Connection done!");

        } catch (SQLException e){
            throw new RuntimeException();
        }
    }
}
