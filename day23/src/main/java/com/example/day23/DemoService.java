
package com.example.day23;

import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;



@Service
public class DemoService {

    public List<Employee> getEmployees(){
        Connection conn = Database.connect();
        List<Employee> lst = Database.getEmployees(conn);
        return lst;
    }

    public Employee getEmployee(int id){
        Connection conn = Database.connect();
        Employee e = Database.getEmployee(conn, id);

         return e;
    }


}
