package com.bob.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello,springboot";
    }

    @ResponseBody
    @GetMapping("/hello1")
    public String hello2(String name){
        return "hello,"+name;
    }


}
