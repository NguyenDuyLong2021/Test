package com.homework.lab6.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataConnector {
    private static Connection connection;
    private static DataConnector dataConnector;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/ltw?useUnicode=true&characterEncoding=utf-8";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Statement connect() throws ClassNotFoundException, SQLException {
        if (connection == null || connection.isClosed()) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);

        }
        return connection.createStatement();
    }
}
