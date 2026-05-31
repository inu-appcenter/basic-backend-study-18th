package com.myapp.mylib.dto;

public record SignupRequest(
        String email,
        String password,
        String name
) {
}
