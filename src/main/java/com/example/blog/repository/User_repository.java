package com.example.blog.repository;

import com.example.blog.model.Usermodel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface User_repository extends JpaRepository<Usermodel, Long> {
    Usermodel findByEmail(String email);
}
