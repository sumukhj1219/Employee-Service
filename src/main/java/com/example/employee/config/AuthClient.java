package com.example.employee.config;

import com.example.employee.dto.AuthDataDto;
import com.example.employee.dto.EmployeeLoginRequestDto;
import com.example.employee.dto.EmployeeLoginResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        name = "auth-service",
        url = "http://localhost:8081"
)
public interface AuthClient {
    @PostMapping("/api/v1/auth/login")
    EmployeeLoginResponseDto<AuthDataDto> login(@RequestBody EmployeeLoginRequestDto request);
}
