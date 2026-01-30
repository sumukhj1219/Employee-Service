package com.example.employee.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeLoginResponseDto<T> {
    private String message;
    private int status;
    private T data;
}
