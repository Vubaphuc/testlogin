package com.example.login.controller;


import com.example.login.dto.UserDto;
import com.example.login.request.LoginRequest;
import com.example.login.service.LoginService;
import jakarta.validation.Valid;
import org.apache.tomcat.util.log.UserDataHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
public class LoginController {

    @Autowired
    private LoginService service;


    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody LoginRequest request) {
        UserDto userDto = service.login(request);
        return ResponseEntity.ok(userDto);
    }
}
