package com.weslaty.service;

import com.weslaty.data.access.entities.User;
import com.weslaty.data.access.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    IUserRepository userRepository;

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUser(Integer id) {
        return userRepository.findOne(id);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
