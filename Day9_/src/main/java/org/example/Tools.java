package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tools {
    public static List<Pet> petList(){
        List<Pet> lst = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet skaitli, cik dzīvniekus pievienosiet sarakstam");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++){
            System.out.println("Ievadiet dzīvnieka vārdu");
            String vards = sc.nextLine();
            System.out.println("Ievadiet dzīvnieka tipu");
            String tips = sc.nextLine();
            System.out.println("Ievadiet dzīvnieka vecumu");
            int vecums = sc.nextInt();
            System.out.println("Ievadiet savu e-pastu");
            String email= sc.nextLine();
            sc.nextLine();

        }

    }

    public static void addPetlist(List<Pet> lst){
        List<Pet> list = new ArrayList<>();

        lst.add(new Pet(vards, tips, vecums, email));
    }
}
