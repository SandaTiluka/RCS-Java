package org.example;

public class Calculation{
    int num1 = Main.number1();
    int num2 = Main.number2();
    String calcul = Main.izvele();





    public static int action(int num1, int num2){
        if (Main.izvele() == "+"){
            int sum = num1 + num2;
            System.out.println(sum);
            return sum;
        }
        if (Main.izvele() == "-"){
            int diff = num1 + num2;
            System.out.println(diff);
            return diff;
        } else {
            return 0;
        }

        }


    }










