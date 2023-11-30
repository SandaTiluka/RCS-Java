package org.example;


import java.awt.print.Book;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book st = new Book();

        st.autors = "Vilis Lācis";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet grāmatas nosaukumu");
        sc.nextLine() = st.nosaukums;
        System.out.println("Ievadiet izdošanas gadu");
        sc.nextInt() = st.gads;
        st.print();


    }
}