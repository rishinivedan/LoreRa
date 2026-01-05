package com.lorera.services.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    private static final Logger log =
            LoggerFactory.getLogger(HealthController.class);

    @GetMapping("/health")
    public String health() {
        log.info("Health check endpoint called");
        return "LoreRa backend is alive 🚀";
    }
}