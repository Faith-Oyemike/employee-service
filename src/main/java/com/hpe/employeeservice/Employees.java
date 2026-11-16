package com.hpe.employeeservice;
import java.util.ArrayList; 
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Employees {
    
     @JsonProperty("Employees")
    private List<Employee> employees= new ArrayList<>();
   
    
    public List<Employee> getEmployees(){
        return employees;
    }

    //Add New Employee
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
}
