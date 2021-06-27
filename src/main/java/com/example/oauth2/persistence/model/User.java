package com.example.oauth2.persistence.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "usr")
public class User {

    @Id
    private String id;

    private String email;
    private String name;
    private String locale;
    private String gender;

}
