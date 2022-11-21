package com.example.springsequrity.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping({"/","home"})
    public String home() {
        return "home";
    }
    @GetMapping({"/","hello"})
    public String hello() {
        return "hello";
    }
}

