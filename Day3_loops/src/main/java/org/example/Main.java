package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task2();
    }

    public static void task2(){
        Scanner sc = new Scanner(System.in);


        int sum = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Ievadiet vārdu");
            String name = sc.nextLine();
            int garums = name.length();
            sum = sum + garums;
            System.out.println("---");
        }
        System.out.println("Summa ir" + sum);

    }


        public static void sample1(){
            for(int i = 0; i < 5; i++){
                System.out.println(i);
            System.out.println("cau");
                System.out.println("----");


        }
    }
}