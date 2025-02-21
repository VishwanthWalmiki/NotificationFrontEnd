package com.digi9.WebNotificationApp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/project-id")
    public String enterProjectPage() {
        return "project-id"; // This should match the name of your Thymeleaf file (enter_project.html)
    }
}
