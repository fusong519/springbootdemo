package com.jtit.springbootdemo.mapper;

import com.jtit.springbootdemo.entity.Users;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: 15892
 * @Date: 2019/2/13 10:40
 * @Version 1.0
 */
public interface UserMapper {
    List<Users> findAll();
}
