package com.example.demo.services.impl;

import com.example.demo.services.MessageService;
import org.springframework.stereotype.Component;

@Component
public class HelloMessageService implements MessageService {

    @Override
    public String getMessage(){
        return "Hello";
    }
}
