package ru.netology.bff.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.bff.model.UserProfileResponse;
import ru.netology.bff.service.BffService;

@RestController
@RequestMapping("${bff.service.api.bff}")
@RequiredArgsConstructor
public class BffController {
    private final BffService bffService;

    @GetMapping("${bff.service.api.user}")
    public ResponseEntity<UserProfileResponse> getUserProfile(@PathVariable Long userId) {
        return ResponseEntity.ok(bffService.getUserProfile(userId));
    }
}
