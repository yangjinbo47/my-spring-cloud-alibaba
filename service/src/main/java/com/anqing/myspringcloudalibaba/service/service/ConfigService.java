package com.anqing.myspringcloudalibaba.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @program: my-spring-cloud-alibaba
 * @Date: 2021/5/4
 * @Author: BOBO
 * @Description:
 */
@Service
@RefreshScope
public class ConfigService {

    @Value("${username:lily}")
    private String username;

    @Autowired
    private RedisTemplate redisTemplate;

    public String get(){
        return username;
    }

    public Object redis(){
//        redisTemplate.opsForValue().set("name","aaa");
        return redisTemplate.opsForValue().get("name");
    }
}
