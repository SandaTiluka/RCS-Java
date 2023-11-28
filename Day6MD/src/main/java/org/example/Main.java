package org.example;


public class Main {
    public static void main(String[] args) {

    int[] a = new int[3];
    a[0] = 8;
    a[1] = 7;
    a[2] = 7;
    System.out.println(summa(a));
    System.out.println(dalit(a));


    }

    public static int summa( int[] a){
        int sum = a[0] + a[1] + a[2];

        return sum;

    }

    public static double dalit( int[] a){
        double sum = a[0] + a[1] + a[2];

        return sum/3;

    }
}