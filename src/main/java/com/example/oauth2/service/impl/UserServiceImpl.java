package com.example.oauth2.service.impl;

import com.example.oauth2.persistence.model.User;
import com.example.oauth2.persistence.repository.UserRepository;
import com.example.oauth2.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User edited, User oldUser) {
        BeanUtils.copyProperties(edited, oldUser);
        return oldUser;
    }
}
