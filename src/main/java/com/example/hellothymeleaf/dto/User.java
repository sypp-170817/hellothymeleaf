package com.example.hellothymeleaf.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {
    private String firstName;
    private String lastName;
    private String nationality;
    private boolean isAdmin;
    private int age;
}
