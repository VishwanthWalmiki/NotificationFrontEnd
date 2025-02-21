package com.digi9.WebNotificationApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotificationController {

    @GetMapping("/notification-form")
    public String showNotificationForm() {
        return "notification-form"; // Returns the Thymeleaf template
    }
}
