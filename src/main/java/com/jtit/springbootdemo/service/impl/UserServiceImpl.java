package com.jtit.springbootdemo.service.impl;

import com.jtit.springbootdemo.entity.Users;
import com.jtit.springbootdemo.mapper.UserMapper;
import com.jtit.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: 15892
 * @Date: 2019/2/13 10:50
 * @Version 1.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<Users> findAll() {
        return userMapper.findAll();
    }
}
