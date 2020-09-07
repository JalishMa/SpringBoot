package com.bob.springboot.dao;


import com.bob.springboot.entity.User;

import java.util.List;

/**
 * @author Bob
 */

public interface UserDao {

    /**
     * 查询所有
     * @return
     */
    List<User> findAll();

    /**
     * 插入一个user
     * @param user
     * @return
     */
    Integer insertUser(User user);

    /**
     * 更改一个user
     * @param user
     * @return
     */
    Integer updateUser(User user);

    /**
     * 删除一个user
     * @param id
     * @return
     */
    Integer deleteById(Integer id);

}
