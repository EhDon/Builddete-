package com.example.blog.service;

import com.example.blog.model.Usermodel;

public interface User_service {
    Usermodel createuser(Usermodel user);
    Usermodel finduserById(Usermodel id);
    Usermodel updateuser(Usermodel user);

    Usermodel createUsermodel(Usermodel Usermodel);

    Usermodel updateUsermodel(Long id, Usermodel UsermodelDetails);

    String loginUsermodel(Usermodel usermodel);

    Usermodel createRegister(Usermodel usermodel);

    String loginUser(LoginDTO Login);
}
