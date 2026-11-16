package com.hpe.employeeservice;

//lombok creates the getter and setter for u for shortcut
import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

// one employee: 5 fields, each tagged with the name it need too display in json -name tag
public class Employee {
   @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("employee_id")
    private String employeeId;
    @JsonProperty("email")
    private String email;
    @JsonProperty("title")
    private String title;
}



    



