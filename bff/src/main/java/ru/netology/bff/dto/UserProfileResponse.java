package ru.netology.bff.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserProfileResponse {
    private User user;
    private List<Order> orders;
}
