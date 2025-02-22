package ru.netology.order.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.contracts.dto.Order;
import ru.netology.contracts.dto.OrderItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final List<Order> orders;

    public OrderService() {
        orders = new ArrayList<>();
        orders.add(new Order(1L, 1L, 1500.0, "RUB", List.of(new OrderItem("Холодильник", 2, 8000.0))));
        orders.add(new Order(2L, 2L, 5000.0, "RUB", List.of(new OrderItem("Духовка", 1, 5000.0))));
        orders.add(new Order(3L, 2L, 6000.0, "RUB", List.of(new OrderItem("Морозилка", 2, 3000.0))));
    }

    public List<Order> getOrdersByUserId(Long userId) {
        return orders.stream().filter(order -> order.getUserId().equals(userId)).collect(Collectors.toList());
    }

    public Optional<Order> getOrderById(Long orderId) {
        return orders.stream().filter(order -> order.getId().equals(orderId)).findFirst();
    }

    public List<Order> getAllOrders() {
        return orders;
    }
}
