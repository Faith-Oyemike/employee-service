package com.hpe.employeeservice;

// Imports RestController from Spring in other to use @RestController
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

// Tells Spring that this class will handle REST API requests
@RestController

public class EmployeeController {

    // EmployeeManager is injected by Spring through the constructor
    private final EmployeeManager employeeManager;

    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    // GET /employees: returns all employees as JSON
    @GetMapping("/employees")
    public Employees getEmployees() {
        return employeeManager.getAllEmployees();
    }
}
