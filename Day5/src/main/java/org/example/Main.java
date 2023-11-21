package org.example;


public class Main {
    public static void main(String[] args) {
    uzd1(2,"SS");
    }

    public static void uzd1(int skaitlis, String vards){

        for(int i = 0; i < skaitlis; i++){

            vards = vards + vards;
            System.out.println(vards);
        }


    }

}