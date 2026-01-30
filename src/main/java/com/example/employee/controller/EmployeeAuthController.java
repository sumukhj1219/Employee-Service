package com.example.employee.controller;

import com.example.employee.config.AuthClient;
import com.example.employee.dto.AuthDataDto;
import com.example.employee.dto.EmployeeLoginRequestDto;
import com.example.employee.dto.EmployeeLoginResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeAuthController {

    @Autowired
    private AuthClient authClient;

    @PostMapping("/login")
    public ResponseEntity<AuthDataDto> login(@RequestBody EmployeeLoginRequestDto request) {
        EmployeeLoginResponseDto<AuthDataDto> authResponse = authClient.login(request);

        return ResponseEntity.ok(authResponse.getData());
    }


}


