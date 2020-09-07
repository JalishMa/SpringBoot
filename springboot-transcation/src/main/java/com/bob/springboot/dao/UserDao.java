package com.bob.springboot.dao;


import com.bob.springboot.entity.User;

import java.util.List;

public interface UserDao {

    List<User> queryAll();

    int insert(User user);

    int update(User user);

    int delete(Integer id);

}
