package com.example.serviceproviderdemo.controller;

import com.example.serviceproviderdemo.model.User;
import com.example.serviceproviderdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/get/{id}")
    public User get(@PathVariable(value = "id") long id){
        return userService.get(id);
    }
}
