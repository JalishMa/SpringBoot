package com.bob.springboot.service;

import com.bob.springboot.dao.UserDao;
import com.bob.springboot.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class TranscationService {

    @Resource
    UserDao userDao;


    public Boolean transcationTest1(){

        User user = new User();
        user.setName("test1");
        user.setPassword("test1-psd");
        userDao.insert(user);

        System.out.println(1/0);

        return  true;
    }


    @Transactional
    public Boolean transcationTest2(){

        User user = new User();
        user.setName("test2");
        user.setPassword("test2-psd");
        userDao.insert(user);

        System.out.println(1/0);

        return true;
    }


}
