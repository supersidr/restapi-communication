package ru.netology.bff.controller;

import ru.netology.bff.service.BffService;
import ru.netology.bff.dto.UserProfileResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/site-bff")
@RequiredArgsConstructor
public class BffController {
    private final BffService bffService;

    @GetMapping("/user/{userId}")
    public ResponseEntity<UserProfileResponse> getUserProfile(@PathVariable Long userId) {
        return ResponseEntity.ok(bffService.getUserProfile(userId));
    }
}
