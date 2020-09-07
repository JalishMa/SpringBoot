package com.bob.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String helloService(String name){
        return "Hello,"+name;
    }


}
