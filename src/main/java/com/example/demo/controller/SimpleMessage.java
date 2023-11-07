package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleMessage {


    @GetMapping("/message")
    public String message(){
        return "You are getting your message successfully";
    }
}
