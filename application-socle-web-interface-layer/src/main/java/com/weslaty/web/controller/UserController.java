package com.weslaty.web.controller;

import com.weslaty.data.access.entities.User;
import com.weslaty.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/user/{id}")
    public User findUser(@PathVariable final Integer id){
        return userService.findUser(id);
    }

    @RequestMapping(value ="/user/edit", method = RequestMethod.PUT)
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

}
