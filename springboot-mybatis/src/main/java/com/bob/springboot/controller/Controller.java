package com.bob.springboot.controller;

import com.bob.springboot.dao.UserDao;
import com.bob.springboot.entity.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * @author Bob
 */
@RestController
public class Controller {

    @Resource
    UserDao user;


    /**
     * 查找所有记录
     * @return
     */
    @ApiOperation(value = "获取用户列表", notes = "")
    @GetMapping("/findAll")
    public List<User> queryAll()
    {
         return user.findAll();
    }

    /**
     * 插入一条记录
     * @param name
     * @param password
     * @return
     */
    @ApiOperation(value = "新增用户", notes = "根据name和password新增用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户name", paramType = "path", required = true, dataType = "string"),
            @ApiImplicitParam(name = "password", value = "用户password", paramType = "path", required = true, dataType = "string")})
    @PostMapping("/insert/{name}&{password}")
    public boolean insert(@PathVariable String name, @PathVariable String password){
        if(StringUtils.isEmpty(name)||StringUtils.isEmpty(password))
        {
            return false;
        }
        User us = new User();
        us.setName(name);
        us.setPassword(password);
        return user.insertUser(us)>0;
    }

    /**
     * 更新某个记录
     * @param id
     * @param name
     * @param password
     * @return
     */


    @ApiOperation(value = "更新用户",notes = "根据用户id更改用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户id", paramType = "path", required = true, dataType ="int" ),
            @ApiImplicitParam(name = "name", value = "用户name", paramType = "path", required = true, dataType = "string"),
            @ApiImplicitParam(name = "password", value = "用户password", paramType = "path", required = true, dataType = "string")
    })
    @PutMapping("/update/{id}&{name}&{password}")
    public boolean update(@PathVariable Integer id,@PathVariable String name,@PathVariable String password){
        if(id==null||id<0||StringUtils.isEmpty(name)||StringUtils.isEmpty(password))
        {
            return false;
        }
        User us = new User();
        us.setId(id);
        us.setName(name);
        us.setPassword(password);
        return user.updateUser(us)>0;
    }

    /**
     * 删除一条记录
     * @param id
     * @return
     */
    @ApiOperation(value = "删除用户", notes = "根据id删除用户")
    @ApiImplicitParam(name = "id", value = "用户id", paramType="path",required = true, dataType = "int")
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable Integer id) {
        if (id == null || id < 0) {
            return false;
        }
        return user.deleteById(id)>0;
    }
}
