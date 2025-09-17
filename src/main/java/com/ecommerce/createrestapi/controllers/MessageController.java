package com.ecommerce.createrestapi.controllers;

import com.ecommerce.createrestapi.entities.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @RequestMapping("/message")
    public Message message() {
        return new Message("message");
    }
}
