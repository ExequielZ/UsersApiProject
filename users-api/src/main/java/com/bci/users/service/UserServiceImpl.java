package com.bci.users.service;

import com.bci.users.model.User;
import com.bci.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return (List<User>) repository.findAll();
    }

}
