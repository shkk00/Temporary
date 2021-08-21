package com.example.demo.user.service;

import com.example.demo.user.model.dto.UserDto;
import com.example.demo.user.model.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserResponse newUser(UserDto dto) {
        var user = new User(dto.getName(), dto.getEmail(), dto.getPassword());
        User newUser = userRepository.save(user);
        System.out.println(newUser.getRegisteredAt().toString());
        return UserResponse.builder()
                .name(newUser.getName())
                .email(newUser.getEmail())
                .build();
    }
}
