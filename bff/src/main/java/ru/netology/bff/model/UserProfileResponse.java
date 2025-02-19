package ru.netology.bff.model;

import lombok.Data;

import java.util.List;

@Data
public class UserProfileResponse {
    private User user;
    private List<Order> orders;
}
