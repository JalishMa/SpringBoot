package com.bob.springboot;

import com.bob.springboot.service.HelloService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootTestApplicationTests {

    @Autowired
    private HelloService helloService;

    @Test
    void contextLoads() {
        System.out.println(helloService.helloService("小明"));
    }

}
