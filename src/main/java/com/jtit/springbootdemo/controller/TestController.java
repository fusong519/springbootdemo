package com.jtit.springbootdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: 15892
 * @Date: 2019/2/13 8:51
 * @Version 1.0
 */
@Controller
@RequestMapping(value = "/book")
public class TestController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "中文";
    }
    @RequestMapping("/login")
    @ResponseBody
    public String test(){
        logger.info("登录成功");
        return "登录成功";
    }
}
