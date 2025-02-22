package ru.netology.bff.model;

import lombok.Data;

import java.util.List;
import ru.netology.contracts.dto.User;
import ru.netology.contracts.dto.Order;

@Data
public class UserProfileResponse {
    private User user;
    private List<Order> orders;
}
