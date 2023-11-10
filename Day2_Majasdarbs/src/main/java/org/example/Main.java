package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task2();}

        public static void task1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet simbolu virkni/savu vārdu!");

        String input = sc.nextLine();
        int len = input.length();

        if(len > 10){
            System.out.println("###");
            }else if(len < 10) {
            System.out.println("##");
            }else if(len == 10) {
            System.out.println("#");

        }

        public static void task2(){
            Scanner sc = new Scanner(System.in);

            System.out.println("Ievadiet simbolu virkni/savu vārdu!");

            String input = sc.nextLine();
            int len = input.length();

            if(len > 5 && len < 10) {
                System.out.println("Jā");
            }else{
            System.out.println("Not ok");

            }



    }
