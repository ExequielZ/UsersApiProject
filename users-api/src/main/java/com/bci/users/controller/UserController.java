package com.bci.users.controller;

import com.bci.users.request.UserRequest;
import com.bci.users.response.UserResponse;
import com.bci.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public ResponseEntity<List<UserResponse>> findAll(){
        return ResponseEntity.ok(userService.findAll());
    }

    @PostMapping
    public ResponseEntity<UserResponse> create(@RequestBody UserRequest userRequest){
        return ResponseEntity.ok(userService.create(userRequest));
    }

}
