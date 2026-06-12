package com.example.demo.controller;

import com.example.demo.services.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    private final MessageService message;

    public AppController(MessageService message) {this.message = message;}

    @GetMapping("/hello")
    public String getMessage(){
        return message.getMessage();
    }

}
