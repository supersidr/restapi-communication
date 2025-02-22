package ru.netology.bff.service;

import ru.netology.bff.client.UserClient;
import ru.netology.bff.client.OrderClient;
import ru.netology.bff.model.UserProfileResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.contracts.dto.User;
import ru.netology.contracts.dto.Order;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BffService {
    private final UserClient userClient;
    private final OrderClient orderClient;

    public UserProfileResponse getUserProfile(Long userId) {
        User user = userClient.getUser(userId);
        List<Order> orders = orderClient.getOrdersByUser(userId);

        UserProfileResponse response = new UserProfileResponse();
        response.setUser(user);
        response.setOrders(orders);
        return response;
    }
}