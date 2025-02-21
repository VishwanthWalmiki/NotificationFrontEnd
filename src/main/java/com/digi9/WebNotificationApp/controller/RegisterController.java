package com.digi9.WebNotificationApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {
    
    @GetMapping("/register")
    public String showRegisterPage() {
        return "register"; // This should match a Thymeleaf file in src/main/resources/templates/
    }
}

