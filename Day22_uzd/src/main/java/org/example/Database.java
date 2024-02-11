package org.example;
import com.google.gson.Gson;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

public class Database {

    public static Connection employee() {
        String url = "C:\\Users\\Liepziedi\\Desktop\\Coding School\\SQL\\Day22.db";
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url);
            System.out.println("Success!");
        }catch(Exception e){
            System.out.println("Connection failed");
        }
        return conn;
    }
     public static void readEmployee(Connection conn){
        String sql = "SELECT * FROM employee";

         try {
             Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery(sql);
                while(rs.next()){
                    System.out.println(rs.getString("id"));
                    System.out.println(rs.getString("name"));
                    System.out.println(rs.getString("lastName"));
                    System.out.println(rs.getInt("workExp"));
                    System.out.println("-------");
                }

             }catch (Exception e){
             System.out.println(e.getMessage());
         }


     }






}
