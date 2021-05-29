package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/evening")
    public String goodEvening() {
        return "Good evening, Sir!";
    }
}
