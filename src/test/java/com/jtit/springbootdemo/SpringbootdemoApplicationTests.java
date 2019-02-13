package com.jtit.springbootdemo;

import com.jtit.springbootdemo.controller.TestController;
import com.jtit.springbootdemo.entity.Person;
import com.jtit.springbootdemo.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {
    @Autowired
    Person person;
    @Autowired
    UserMapper userMapper;
    @Test
    public void contextLoads() {
        System.out.println(userMapper.findAll());
    }

}

