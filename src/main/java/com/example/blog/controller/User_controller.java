package com.example.blog.controller;
import com.example.blog.model.Usermodel;
import com.example.blog.service.User_service;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Login")
@RequiredArgsConstructor
public class User_controller {
    @Autowired
    private User_service user_service;

    @PostMapping("/addUser")
    public Usermodel createuser(@RequestBody Usermodel user) {
        user_service.createRegister(user);
        return user;
    }
    @PutMapping("/update/{id}")
    public Usermodel updateLogin(@RequestBody Long id,  Usermodel Usermodel) {
        user_service.updateUsermodel(id, Usermodel);
        return Usermodel;
    }
}
