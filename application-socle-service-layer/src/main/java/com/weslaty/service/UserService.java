package com.weslaty.service;

import com.weslaty.data.access.entities.User;
import com.weslaty.data.access.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    IUserRepository IUserRepository;

    public List<User> findAllUsers() {
        return IUserRepository.findAll();
    }
}
