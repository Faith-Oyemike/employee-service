package com.hpe.employeeservice;

import org.springframework.stereotype.Repository;

// fills the employee list when the server starts and hands it out
@Repository
public class EmployeeManager {
    private Employees employees = new Employees();

    // sample employees: first name, last name, id, email, title
    public EmployeeManager() {
        employees.addEmployee(new Employee("Faith", "Oyemike", "1", "faith@hpe.com", "Software Engineer"));
        employees.addEmployee(new Employee("John", "Doe", "2", "john@hpe.com", "Manager"));
        employees.addEmployee(new Employee("Ada", "Lovelace", "3", "ada@hpe.com", "Data Analyst"));
    }

    
    public Employees getAllEmployees() {
        return employees;
    }
}