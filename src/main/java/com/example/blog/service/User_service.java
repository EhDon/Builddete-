package com.example.blog.service;

import com.example.blog.model.Usermodel;
import org.springframework.stereotype.Service;

@Service
public interface User_service {

    Usermodel updateUsermodel(Long id, Usermodel UsermodelDetails);

    Usermodel createRegister(Usermodel usermodel);

}
