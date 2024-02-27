package com.example.day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public static Connection connect() {
        String url = "jdbc:sqlite:C:\\Users\\Liepziedi\\Desktop\\Coding School\\SQL\\day22.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Success!");
        } catch (Exception e) {
            System.out.println("Connection failed");
        }
        return conn;
    }

    public static List<Employee> getEmployees(Connection conn) {
        String sql = "SELECT * FROM employee ";
        List<Employee> emp = new ArrayList<>();

        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                emp.add(new Employee( rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("lastName"),
                        rs.getInt("workExp")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return emp;
    }
    public static Employee getEmployee(Connection conn, int id){
        String sql = "SELECT * FROm employee WHERE id=" + id;
        Employee emp = new Employee();

        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                emp = new Employee( rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("lastName"),
                        rs.getInt("workExp")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return emp;

    }
}

