package org.example;
import com.google.gson.Gson;
import org.xerial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);


        System.out.println("Ievadiet vārdu");
        String name = sc.nextLine();
        System.out.println("Ievadiet uzvārdu");
        String lastName = sc.next();
        System.out.println("Ievadiet darba stāžu");
        int workExp = sc.nextInt();

        Employee b = new Employee(name, lastName, workExp);

        Gson g = new Gson();
        String json = g.toJson(b);

        SqlLite s = new

    }




}


