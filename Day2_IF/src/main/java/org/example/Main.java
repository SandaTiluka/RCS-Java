package org.example;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task2();
    }

    public static void task4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet vārdu");

        if(b.equals("bbb"){
            System.out.println("ir vienāds");
        }
    }
    public static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli");
        int a = sc.nextInt();

        if(a > 5){
            System.out.println("###");
        }else if(a < 5){
            System.out.println("####");
        }
    }



    public static void sample3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli 1");
        int a = sc.nextInt();


        if(a > 0){
            System.out.println("Jā");
        }else if(a < 0){
            System.out.println("Nē");
        }else{
            System.out.println("Kluda");
        }
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