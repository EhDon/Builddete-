package com.example.blog.serviceimpl;

import com.example.blog.model.Usermodel;
import com.example.blog.repository.User_repository;
import com.example.blog.service.User_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class User_serviceimpl implements User_service {
    @Autowired
    private User_repository user_repository;

    @Override
    public Usermodel createRegister(Usermodel usermodel){
        Usermodel user_model = new Usermodel();

        user_model.setEmail(user_model.getEmail());
        user_model.setPassword(user_model.getPassword());
        user_model.setFirstname(user_model.getFirstname());
        user_model.setLastname(user_model.getLastname());
         user_repository.save(user_model);
         return user_model;
    }

    }



