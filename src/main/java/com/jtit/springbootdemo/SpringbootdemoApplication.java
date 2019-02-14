package com.jtit.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;

import java.nio.charset.Charset;

// Spring Boot 应用的标识
//排除自动配置
//@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
// mapper 接口类扫描包配置
@MapperScan("com.jtit.springbootdemo.mapper")
public class SpringbootdemoApplication extends SpringBootServletInitializer {


    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(SpringbootdemoApplication.class, args);

    }

    /**
     * 打war包
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootdemoApplication.class);
    }
    //消息转换器
   /* @Bean
    public StringHttpMessageConverter httpMessageConverter(){
        StringHttpMessageConverter httpMessageConverter = new StringHttpMessageConverter(Charset.forName("utf-8"));
        return httpMessageConverter;
    }*/
}

