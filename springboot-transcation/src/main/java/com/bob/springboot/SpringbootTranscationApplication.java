package com.bob.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.bob.springboot.dao")
@SpringBootApplication
public class SpringbootTranscationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTranscationApplication.class, args);
    }

}
