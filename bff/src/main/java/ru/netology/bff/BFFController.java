package ru.netology.bff;

import jakarta.persistence.criteria.Order;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.bff.client.OrderClient;
import ru.netology.bff.client.UserClient;

import java.util.List;

@RestController
@RequestMapping("/api/site-bff")
@RequiredArgsConstructor
public class BFFController {
    private final UserClient userClient;
    private final OrderClient orderClient;

    @GetMapping("/user/{userId}")
    public ResponseEntity<AggregatedUserData> getAggregatedData(@PathVariable Long userId) {
        User user = userClient.getUser(userId);
        List<Order> orders = orderClient.getOrdersByUser(userId);

        return ResponseEntity.ok(new AggregatedUserData(user, orders));
    }
}
