package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
  //      System.out.println("Hello world!");
 //       System.out.println("čau");
   //    System.out.println(1+2);
  //     System.out.println("aa   " + "cc");

       String a = "aa";
        System.out.println(a + " " + "bb");

        int b=1;
       b=2+1;
        System.out.println(b -3);
        System.out.println(a + b);


        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet savu vārdu!");
        String input = sc.nextLine();

        System.out.println("Ievadiet savu uzvārdu");
        String atbilde = sc.nextLine();
        System.out.println("Sveiki," + atbilde+ " " + input + " !");

 //       Scanner sc = new Scanner(System.in);
 //       System.out.println("Ievadiet 1.virkni");
  //      String a = sc.nextLine();

   //     System.out.println("Ievadiet 2.virkni");
   //     String b = sc.nextLine();

   //     System.out.println("Ievadiet 3.virkni");
   //     String c = sc.nextLine();

  //      System.out.println(c + b + a);
        }
    }
