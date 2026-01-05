package com.lorera.services.profile.controller;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;

@RestController
public class ProfileController {

    private static final Logger log =
            LoggerFactory.getLogger(ProfileController.class);
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
