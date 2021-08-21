package com.example.demo.user.controller;


import com.example.demo.user.model.dto.UserDto;
import com.example.demo.user.model.dto.UserResponse;
import com.example.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")
public class UserApiController {

    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity createUser(@Valid @RequestBody UserDto dto) {
        UserResponse response = userService.newUser(dto);
        return ResponseEntity.ok().body(response);
    }
}
