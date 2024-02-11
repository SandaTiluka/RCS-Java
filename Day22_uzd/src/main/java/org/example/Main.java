package org.example;
import com.google.gson.Gson;
import java.sql.Connection;
import org.example.Database;
import org.example.Employee;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Connection conn = Database.employee();
        Database.readEmployee(conn);


        Gson empl = new Gson();
        String json = empl.toJson(conn);

        List<Database> databaseList = new ArrayList<>();
        System.out.println(databaseList);
        List<Database> databaseList = Arrays.asList(empl.fromJson(json, Database[].class));



        Scanner sc = new Scanner(System.in);


//        System.out.println("Ievadiet vārdu");
//        String name = sc.nextLine();
//        System.out.println("Ievadiet uzvārdu");
//        String lastName = sc.next();
//        System.out.println("Ievadiet darba stāžu");
//        int workExp = sc.nextInt();
//
//
//
//        System.out.println("Info ");
//        System.out.println("Name: " + name);
//        System.out.println("Last Name: " + lastName);
//        System.out.println("Work experience: " + workExp);
//
//        Employee b = new Employee(name, lastName, workExp);
//
//        Gson g = new Gson();
//        String json = g.toJson(b);







    }




}


