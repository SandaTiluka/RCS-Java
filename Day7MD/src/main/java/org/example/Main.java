package org.example;


import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        uzd1();
    }

    public static void uzd1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet vārdu");
        String input = sc.next();
        int input2 = 0;



        while(!input.equals(input2)){
            try {
                input2 = sc.nextInt();
                System.out.println("Ievadiet vārdu");



            }
            catch(InputMismatchException e){
                System.out.println("Mēģiniet vēlreiz");
                input = sc.next();
            }


        }


    }
}