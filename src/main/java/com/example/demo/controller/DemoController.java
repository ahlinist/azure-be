package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class DemoController {

    private static int ID = new Random().nextInt(10 - 1 + 1) + 1;

    @GetMapping("/evening")
    public String goodEvening() {
        return "Good evening, Sir!";
    }

    @GetMapping("/id")
    public int id() {
        return ID;
    }
}
