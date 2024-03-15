package com.example.day23;
import java.util.List;

public class Employee {
    public int id;
    public String name;
    public String lastName;
    public int workExp;

    public Employee(){
        this.id = 0;
        this.name = "";
        this.lastName = "";
        this.workExp = 0;
    }

    public Employee(int id, String name, String lastName, int workExp){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.workExp = workExp;
    }
}
