package org.example;

import java.util.Scanner;
public class Main {
    public static void main(){
        list();
    }



    public static Employee list(){
        Scanner sc = new Scanner(System.in);

        Employee b = new Employee(list().name, list().lastName, list().workExp);
        System.out.println("Ievadiet vārdu");
        b.name = sc.nextLine();
        System.out.println("Ievadiet uzvārdu");
        b.lastName = sc.next();
        System.out.println("Ievadiet darba stāžu");
        b.workExp = sc.nextInt();

        return b;

    }


}


