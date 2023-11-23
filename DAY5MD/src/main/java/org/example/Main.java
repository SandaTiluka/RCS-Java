package org.example;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1 = number1();
        int num2 = number2();

        String calcul = izvele();
        int result = Calculation.action(int num1, int num2);
        System.out.println(result);





    }

    public static int number1 (){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet pirmo skaitli");
        int numb1 = sc.nextInt();
        return numb1;
    }

    public static int number2 (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet otro skaitli");
        int numb2 = sc.nextInt();
        return numb2;
    }


    public static String izvele() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Izvēlies darbību: + , - , * , / ");
        String b = sc.nextLine();

        if (b.equals("+")) {
            return"+";

        }
        if (b.equals("-")) {
            return "-";
        }
        if (b.equals("*")) {
            return "*";
        }
        if (b.equals("/")) {
            return "/";
        } else {
            System.out.println("Kļūda! Ievadiet vēlreiz izvēlēto darbību");
            String h = sc.nextLine();
            return "Kļūda";
        }
    }

}