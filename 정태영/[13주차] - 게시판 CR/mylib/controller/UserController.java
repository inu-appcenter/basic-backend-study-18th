package com.myapp.mylib.controller;

import com.myapp.mylib.domain.User;
import com.myapp.mylib.dto.LoginRequest;
import com.myapp.mylib.dto.SignupRequest;
import com.myapp.mylib.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/users/signup")
    public Map<String, String> signup(@RequestBody SignupRequest request){
        userService.signup(request);
        return Map.of("message", "signup success");
    }

    @PostMapping("/users/login")
    public Map<String, String> login(@RequestBody LoginRequest request) {
        User user = userService.login(request);
        return Map.of("token", user.getEmail() + "_logined");
    }
}
