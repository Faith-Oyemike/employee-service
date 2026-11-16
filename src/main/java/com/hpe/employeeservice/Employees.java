package com.hpe.employeeservice;
import java.util.ArrayList; 
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Employees {
    
     @JsonProperty("Employees")
     // return the full employee list
    private List<Employee> employees= new ArrayList<>();
   
    
    public List<Employee> getEmployees(){
        return employees;
    }

    // replace the whole employee list
     public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    // add one employee to the list
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
