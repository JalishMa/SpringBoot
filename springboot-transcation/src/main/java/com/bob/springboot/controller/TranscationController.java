package com.bob.springboot.controller;

import com.bob.springboot.service.TranscationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 * @author Bob
 */

@RestController
public class TranscationController {

    @Resource
    private TranscationService transcationService;

    @PostMapping("/transcation")
    public void test (){
        try {
            transcationService.transcationTest1();       //没加@Transactional
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try{
                transcationService.transcationTest2();  //加了@Transactional
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }




    }



}
