package com.bob.springbootdata.controller;

import com.bob.springbootdata.entity.User;
import com.bob.springbootdata.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    UserRepository ur;

    @GetMapping("/find/{id}")
    public User findById(@PathVariable("id") Integer id){

        User user = ur.findById(id).get();

        return  user;
    }

    @GetMapping("/insert")
    public User insertUser(User user){

        User user1 = ur.save(user);

        return user1;
    }


}
