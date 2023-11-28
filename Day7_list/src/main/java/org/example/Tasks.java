package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Tasks {
    public static double biggestNumber(double[] a){
        double max = Double.MIN_VALUE;

        for(int i = 0; i < a.length; i++){
            if (a[i] > max){
                max = a[i];

            }

        }
        return max;
    }

    public static void task2(){

        List<String> stringList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Cik vārdus pievienosiet sarakstam?");
        int skaitlis = sc.nextInt();

        for(int i = 0; i < skaitlis; i++){
            System.out.println("Ievadiet vārdus");
            String vards = sc.next();
            stringList.add(vards);
        }
        System.out.println("Vai vēlaties izvadīt visus vai konkrētu vārdu?");
        String atbilde = sc.next();

        if(atbilde.equals("visu")){
            for(int i = 0; i < skaitlis; i++){
                System.out.println(stringList.get(i));
            }
        }
        if(atbilde.equals("vārdu")){
            System.out.println("Kuru pēc kārtas vārdu?");
            int izvade = sc.nextInt();
            System.out.println(stringList.get(izvade));
        }


    }

    public static int task3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli");
        int input = sc.nextInt();
        return input;

        try {
            input = sc.nextInt();
        }
        catch (Exception e){
            input = 0;
        }
    }
}
