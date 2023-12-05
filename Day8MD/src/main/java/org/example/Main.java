package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        samplist();

        run2uzd();
        uzd3(2);




    }

    public static Student InputStudent(){
        Scanner sc = new Scanner(System.in);

        Student b = new Student();

        System.out.println("Ievadiet studenta vārdu");
        b.name = sc.next();
        System.out.println("Ievadiet studenta uzvārdu");
        b.lastName  = sc.next();

        System.out.println("Ievadiet studenta kursu");
        b.course = 0;
        try {
            b.course = sc.nextInt();

        }
        catch (InputMismatchException e){

            System.out.println("Kļūda ievadē.Mēģiniet vēlreiz");
            b.course = sc.nextInt();
        }

        return b;
    }


    public static void samplist(){
        List<Student> Studentlst = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        for(int i = 0; i < 3; i++){
            Studentlst.add(new Student(InputStudent().name, InputStudent().lastName, InputStudent().course));
        }
        for(int i = 0; i < Studentlst.size(); i++){
            Studentlst.get(i).print();

        }

    }

    public static void run2uzd(List<Student> Studentlst){
        for (Object element: Studentlst) {
            System.out.println(element);
        }

    }
    public static List<Student> uzd3(int a){

        List<Student> sar = samplist();
        for(int i = 0; i < a; i++){
            System.out.println("Studentu saraksts" + i + sar);
            return sar;
        }

    }





//    public static void Book(){
//        Book b = addBook();
//        b.print();
//
//        Book b2 = addBook();
//        b2.print();
//
//    }
//
//    public static Book addBook(){
//        Scanner sc = new Scanner(System.in);
//
//        Book b = new Book();
//        System.out.println("Ievadiet autoru");
//        b.author = sc.nextLine();
//        System.out.println("Ievadiet grāmatas nosaukumu");
//        b.bookname = sc.nextLine();
//        System.out.println("Izdošanas gads:");
//        b.year = sc.nextInt();
//
//        return b;


//    }
}