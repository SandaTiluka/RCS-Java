package org.example;


public class Main {
    public static void main(String[] args) {
        String a = "aaaa";
        String b = "bbbb";
        String c = "cccc";
        sample1(a,b,c);

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