package com.example.employee.dto;

import com.example.employee.entity.EmployeeType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeRegisterResponseDto {
    private String username;
    private String email;
    private EmployeeType userType;
    private String profilePicture;
}
