package com.bci.users.service;

import com.bci.users.model.User;
import com.bci.users.request.UserRequest;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User create(UserRequest user);

}
