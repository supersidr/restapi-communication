package ru.netology.bff.dto;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String fullName;
    private String address;
    private String phoneNumber;
    private String email;
}
