package com.example.blog.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table
@Getter
@Setter
@RequiredArgsConstructor
@Data
public class Usermodel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    @NotNull
    @Column(unique = true)

    private String firstname;
    private String lastname;
    private String password;


}
