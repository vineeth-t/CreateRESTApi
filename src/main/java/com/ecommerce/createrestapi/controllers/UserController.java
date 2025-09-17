package com.ecommerce.createrestapi.controllers;

import com.ecommerce.createrestapi.entities.User;
import com.ecommerce.createrestapi.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserRepository userRepository;
    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }
    @GetMapping("/test")
    public String test() {
        return "Count: " + userRepository.count();
    }
}
