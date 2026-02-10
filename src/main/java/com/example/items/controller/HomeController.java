package com.example.items.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // GET / - Root endpoint (Welcome message)
    @GetMapping("/")
    public String home() {
        return "Welcome to the Java Assessment API! Use POST /items to add items and GET /items to see them.";
    }
}
