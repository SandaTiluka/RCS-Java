package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        uzd2();
    }

        public static void uzd2(){
            Scanner sc = new Scanner(System.in);



            int input = 0;
            int last = 0;



            while(input >= last){
                last = input + 0;
                System.out.println("Ievadiet skaitli!");
                input = sc.nextInt();
                System.out.println(input);



                if(input < 0){
                    break;
                }


            }

        }



        public static void uzd1(){
            String a = "";

            for (int i = 0; i < 5; i++){
                a = a + "$";
                System.out.println(a);

            }

        }

    }
