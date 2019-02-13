package com.jtit.springbootdemo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: 15892
 * @Date: 2019/2/13 9:38
 * @Version 1.0
 */
@Getter
@Setter
@ToString
@Component
@ConfigurationProperties(prefix = "home")
public class Person {
    private String province;
}
