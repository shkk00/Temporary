package com.example.demo.user.model.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class UserDto {

    @NotBlank
    private String name;

    @Email
    private String email;

    @Pattern(regexp = "^[a-zA-zㄱ-ㅎ가-핳0-9]+$")
    private String password;

}
