package com.hpe.employeeservice;

public class Employee {
    private String firstName;//object's variable
    private String lastName;
    private String employeeId;
    private String email;
    private String title;



    public Employee(){//the constructor that would be called 

    }






 //Getter: return the Employee firstName
public String getFirstName(){
    return firstName;
}

// Setter: changes/sets the employee's first name
public void setFirstName(string firstName){//parameter
this.firstName = firstName;
}

public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public String getEmployeeId() {
    return employeeId;
}

public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getTitle() {
    return title;
}

public void setTitle(String title) {
    this.title = title;
}
}
