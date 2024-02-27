package com.example.day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    public static Connection employee() {
        String url = "jdbc:sqlite:C:\\Users\\Liepziedi\\Desktop\\chinook.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Success!");
        } catch (Exception e) {
            System.out.println("Connection failed");
        }
        return conn;
    }

    public static void readEmployee(Connection conn) {
        String sql = "SELECT * FROM employee";

        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("lastName"));
                System.out.println(rs.getInt("workExp"));
                System.out.println("-------");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

