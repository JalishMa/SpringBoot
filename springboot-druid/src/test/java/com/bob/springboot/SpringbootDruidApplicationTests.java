package com.bob.springboot;

import com.alibaba.druid.pool.DruidPooledConnection;
import com.zaxxer.hikari.util.DriverDataSource;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootDruidApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {

        System.out.println("获取的数据源对象"+dataSource.getClass());
        Connection connection = dataSource.getConnection();

        if (connection!=null){
            System.out.println("获取链接"+connection);
        }

        connection.close();


    }

}
