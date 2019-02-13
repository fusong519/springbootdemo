package com.jtit.springbootdemo.service;

import com.jtit.springbootdemo.entity.Users;

import java.util.List;

/**
 * @Author: 15892
 * @Date: 2019/2/13 10:49
 * @Version 1.0
 */
public interface UserService {
    List<Users> findAll();
}
