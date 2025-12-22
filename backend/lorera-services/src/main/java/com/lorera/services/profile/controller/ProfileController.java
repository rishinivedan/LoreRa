package com.lorera.services.profile.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class ProfileController {

    @GetMapping("/profile/me")
    public Map<String, Object> myProfile() {
        log.info("Profile /me endpoint called");

        return Map.of(
                "username", "lorera_user",
                "displayName", "LoreRa Tester",
                "city", "Bangalore"
        );
    }
}
