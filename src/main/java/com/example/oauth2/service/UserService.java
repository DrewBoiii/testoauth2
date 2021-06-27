package com.example.oauth2.service;

import com.example.oauth2.persistence.model.User;

public interface UserService {

    User save(User user);

    User update(User edited, User oldUser);

}
