package com.example.insta_clone;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;
import java.sql.DriverManager;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DBConnectionTests {

    @Value("${spring.datasource.url}")
    String dataSourceUrl;

    @Value("${spring.datasource.username}")
    String username;

    @Value("${spring.datasource.password}")
    String password;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void MyBatis_Connection(){
        try(final Connection con = sqlSessionFactory.openSession().getConnection()) {
            System.out.println("Success MyBatis Connection");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void JDBC_Connection() {
        try (final Connection con = DriverManager.getConnection(dataSourceUrl, username, password)) {
            System.out.println("Success JDBC Connection");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}

