package ru.netology.bff.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import ru.netology.bff.dto.Order;

@FeignClient(name = "order-service", url = "http://localhost:8082")
public interface OrderClient {
    @GetMapping("/api/orders/by-user/{userId}")
    List<Order> getOrdersByUser(@PathVariable Long userId);
}