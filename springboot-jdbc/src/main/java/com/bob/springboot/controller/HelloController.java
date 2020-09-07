package com.bob.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @GetMapping("/stu4/query")
    public Map<String,Object> map(){

        List<Map<String,Object>> list = jdbcTemplate.queryForList("select * FROM stu4");
        return  list.get(0);

    }


}
