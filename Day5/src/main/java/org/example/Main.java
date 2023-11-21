package org.example;


public class Main {
    public static void main(String[] args) {
    uzd1(3,"SS ");
    }

    public static void uzd1(int skaitlis, String vards){
        String a = "";
        for(int i = 0; i < skaitlis; i++){
            a = a + vards;
            System.out.println(a);
        }


    }

}