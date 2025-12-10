package com.example.helloworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired(required = false)
    private String message;

    public String getMessage() {
        return message != null ? message : "Hello World!";
    }
}
