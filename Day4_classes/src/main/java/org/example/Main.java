package org.example;


public class Main {
    public static void main(String[] args) {
//        String a = "aaaa";
//        String b = "bbbb";
//        String c = "cccc";
//        sample1(a,b,c);
        int b = 9;
        sample2(b);

    }
    public static void sample2(int b){
        String a = "";

        for (int i = 0; i < b; i++){
            a = a + "$";
            System.out.println(a);

        }

    }


    public static void sample1(String a, String b, String c){

        int len = a.length() + b.length() + c.length();

        if (len > 15){
            System.out.println(a+c);
        }else{
            System.out.println(c+b+a);
        }






    }
}