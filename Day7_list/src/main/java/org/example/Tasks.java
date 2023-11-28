package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

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
        System.out.println("Cik vardus pievienosiet sarakstam?");
        int skaitlis = sc.nextInt();

        for(int i = 0; i < skaitlis; i++){
            System.out.println("Ievadiet vardus");
            String vards = sc.nextLine();
            stringList.add(vards);
        }
//        System.out.println("Vai velaties izvadit visus vai konkretu vardu?");
//        String atbilde = sc.nextLine();
//        if(atbilde.equals("visu")){
//            System.out.println(stringList.get(i));
//        }



    }
}
