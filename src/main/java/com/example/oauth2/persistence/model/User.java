package com.example.oauth2.persistence.model;

import com.example.oauth2.auth.AuthenticationProvider;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "usr")
public class User {

    @Id
    private String id;

    private String email;
    private String name;

    @Enumerated(EnumType.STRING)
    private AuthenticationProvider authProvider;

}
