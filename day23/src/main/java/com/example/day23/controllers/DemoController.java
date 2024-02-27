package com.example.day23.controllers;

import com.example.day23.Database;
import com.example.day23.DemoService;
import com.example.day23.Employee;
import com.example.day23.Day23Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @Autowired
    private Database database;


    @RequestMapping(value="/employees", method= RequestMethod.GET)
    List<Employee> getEmployees(){
        System.out.println("This is random message");
        return demoService.getEmployees();
    }

    @RequestMapping(value="/employee/{id}", method= RequestMethod.GET)
    Employee getEmployee(@PathVariable int id){

        return demoService.getEmployee(id);
    }


}
