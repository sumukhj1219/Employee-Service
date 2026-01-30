package com.example.employee.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthDataDto {
    private String email;
    private String token;
    private String userType;
    private String username;
}
