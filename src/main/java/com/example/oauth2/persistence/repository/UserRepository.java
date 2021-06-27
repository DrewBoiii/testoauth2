package com.example.oauth2.persistence.repository;

import com.example.oauth2.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {



}
