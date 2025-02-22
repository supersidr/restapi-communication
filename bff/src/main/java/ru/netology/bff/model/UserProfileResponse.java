package ru.netology.bff.model;

import lombok.Data;
import ru.netology.contracts.dto.Order;
import ru.netology.contracts.dto.User;

import java.util.List;

@Data
public class UserProfileResponse {
    private User user;
    private List<Order> orders;
}
