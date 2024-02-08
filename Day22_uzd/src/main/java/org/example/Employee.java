package org.example;

public class Employee {
    public String name;
    public String lastName;
    public int workExp;

    public Employee (String name, String lastName, int workExp){
        this.name = name;
        this.lastName = lastName;
        this.workExp = workExp;
    }

    public void print() {
        System.out.println("Info ");
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Work experience: " + workExp);
    }


}

