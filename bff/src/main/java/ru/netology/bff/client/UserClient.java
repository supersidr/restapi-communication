package ru.netology.bff.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.netology.contracts.dto.User;

@FeignClient(name = "user-service", url = "${user.service.url}")
public interface UserClient {
    @GetMapping("${user.service.api.users}${user.service.api.userId}")
    User getUser(@PathVariable Long userId);
}
