package com.bob.springboot.controller;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
public class DSController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/datasource")
    public Map<String,Object> dataSource() throws SQLException {
        Map<String,Object> result = new HashMap<>();

        result.put("数据源类名",dataSource.getClass());
        Connection connection = dataSource.getConnection();
        result.put("连接不为空",connection!=null);

        connection.close();
        return  result;
    }

    @GetMapping("/datasource2")
    public Map dataSource2() throws SQLException {
        Map result = new HashMap();

        DruidDataSource druidDataSource = (DruidDataSource) dataSource;


        Connection connection = druidDataSource.getConnection();

        result.put("数据源类名",druidDataSource.getClass());
        result.put("连接不为空",connection!=null);
        result.put("初始化大小",druidDataSource.getInitialSize());
        result.put("连接池的最大值",druidDataSource.getMaxActive());
        result.put("获取连接等待超时的时间",druidDataSource.getMaxWait());
        result.put("最大空闲值",druidDataSource.getMaxIdle());
        result.put("最小空闲值",druidDataSource.getMinIdle());

        connection.close();
        return result;
    }







}
