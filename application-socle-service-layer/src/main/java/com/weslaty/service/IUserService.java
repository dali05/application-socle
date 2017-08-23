package com.weslaty.service;

import com.weslaty.data.access.entities.User;

import java.util.List;

public interface IUserService {
    public List<User> findAllUsers();

    public User findUser(Integer id);

    User saveUser(User user);
}
