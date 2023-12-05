package org.example;

public class Pet {
    public String vards;
    public String tips;
    public int vecums;
    public String email;

    }
    public Pet(String vards, String tips, int vecums,String email){
    this.vards = vards;
    this.tips = tips;
    this.vecums = vecums;
    this.email;
    }
    public void print(){
        System.out.println(vards);
        System.out.println(tips);
        System.out.println("Gadi:" + vecums);
        System.out.println("e-pasts:" + email);
        System.out.println("--------");
    }

}
