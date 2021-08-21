package com.example.demo.user.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {

    private String name;
    private String email;

    private String regiserDate;
}
