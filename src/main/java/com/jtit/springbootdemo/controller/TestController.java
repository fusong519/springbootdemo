package com.jtit.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 15892
 * @Date: 2019/2/13 8:51
 * @Version 1.0
 */
@Controller
@RequestMapping(value = "/book")
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "test";
    }
    @RequestMapping("/test")
    public String test(){
        return "hellodd";
    }
}
