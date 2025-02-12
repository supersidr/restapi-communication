package ru.netology.order.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import ru.netology.order.entity.Order;
import ru.netology.order.repository.OrderRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public List<Order> getOrdersByUserId(Long userId) {
        return orderRepository.findByUserId(userId);
    }
}
