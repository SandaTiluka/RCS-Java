package org.example;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      sample2();
    }

    public static void sample2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli 1");
        int a = sc.nextInt();
        System.out.println("Ievadiet skaitli 2");
        int b = sc.nextInt();
        System.out.println( "Rezultāts " + (a + b));

    }

    public static void sample1(){
    System.out.printf("Ievadiet vārdu!");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.printf("Sveiki" + input);
    }

}