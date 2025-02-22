package ru.netology.bff.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import ru.netology.contracts.dto.Order;

@FeignClient(name = "order-service", url = "${order.service.url}")
public interface OrderClient {
    @GetMapping("${order.service.path}")
    List<Order> getOrdersByUser(@PathVariable Long userId);
}