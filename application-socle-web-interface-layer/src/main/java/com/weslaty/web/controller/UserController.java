package com.weslaty.web.controller;

import com.weslaty.data.access.entities.User;
import com.weslaty.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping("/user/list")
    public List<User> listUser(){
        return userService.findAllUsers();
    }
}
