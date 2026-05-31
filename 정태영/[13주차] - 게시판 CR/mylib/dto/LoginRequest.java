package com.myapp.mylib.dto;

public record LoginRequest(
        String email,
        String password
) {
}
