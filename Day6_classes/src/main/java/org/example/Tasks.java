package org.example;

import java.util.Scanner;

public class Tasks {



    public static double avarageNumber(int count){
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        for (int i = 0; i < count; i++){
            System.out.println("Ievadiet skaitli");
            double number = sc.nextDouble();
            sum = sum + number;

        }
        return sum/count;

    }
    private static void uzd1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet skaitli!");
        int input = sc.nextInt();

        int smallest = 0;

        while(true){
            smallest = input;
            System.out.println("Ievadiet skaitli!");
            input = sc.nextInt();

            if(input < smallest){
                System.out.println("Hello word");
            }else{
                break;
            }

        }

    }

    public static void uzd2(){
        Scanner sc = new Scanner(System.in);

        String[] a= new String[5];
        for(int i = 0; i < a.length; i++){
            System.out.println("Ievadiet vārdu!");
            a[i]= sc.nextLine();


        }
        for(int i = 0; i < a.length; i++){
            int b = a[i].length();
            System.out.println(a[i] + b);


        }


    }



}

