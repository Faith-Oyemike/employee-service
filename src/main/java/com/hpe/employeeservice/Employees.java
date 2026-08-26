package com.hpe.employeeservice;// Defines the package this class belongs to

import java.util.ArrayList;//import Array list from utilities 
import java.util.List;

public class Employees {
    //create an empty List that will store employee objects 
    private List<Employee> employees= new ArrayList<>();

    //Return The Full List Of Employee
    public List<Employee> getEmployees(){
        return employees;
    }

    //Add New Employee
    public Void addEmployee(Employee employee){
        employees.Add(employee);
    }
}
