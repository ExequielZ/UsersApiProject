package com.bci.users.service;

import com.bci.users.request.UserRequest;
import com.bci.users.response.UserResponse;

import java.util.List;

public interface UserService {
    List<UserResponse> findAll();
    UserResponse create(UserRequest user);

}
