package org.example;

public class Book {
    public String autors;
    public String nosaukums;
    public int gads;

    public void print(){
        System.out.println("Autors:" + autors);
        System.out.println("Grāmatas nosaukums:" + nosaukums);
        System.out.println("Izdošanas gads:" + gads);
        System.out.println("----");

    }
}
