package com.example.employee.dto;

import com.example.employee.entity.EmployeeType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeLoginRequestDto {
    private String email;
    private String password;
    private EmployeeType userType;
}
