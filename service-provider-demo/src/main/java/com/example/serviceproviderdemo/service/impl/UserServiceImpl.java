package com.example.serviceproviderdemo.service.impl;

import com.example.serviceproviderdemo.model.User;
import com.example.serviceproviderdemo.repository.UserRepository;
import com.example.serviceproviderdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User get(long id) {
        return userRepository.getById(id);
    }
}
