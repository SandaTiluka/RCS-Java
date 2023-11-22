package org.example;


public class Main {
    public static void main(String[] args) {
//    uzd1(9,"SS ");
//        int a = uzd2(5,9);
//        System.out.println(a);
        Samples.uzd1();
        int a = Samples.uzd1();
    }

    public static int uzd2(int b, int c){

        if (b > c){

            return b;
        }else{

            return c;
        }


    }

    public static void uzd1(int skaitlis, String vards){
        String a = "";
        for(int i = 0; i < skaitlis; i++){
            a = a + vards;
            System.out.println(a);
        }


    }

}