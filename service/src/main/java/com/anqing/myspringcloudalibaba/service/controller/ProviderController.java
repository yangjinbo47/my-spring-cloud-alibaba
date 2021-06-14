package com.anqing.myspringcloudalibaba.service.controller;

import com.anqing.myspringcloudalibaba.service.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: my-spring-cloud-alibaba
 * @Date: 2021/4/18
 * @Author: BOBO
 * @Description:
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @GetMapping("/demo")
    public Object demo() {
//        System.out.println(1/0);
        return "this is provider demo";
    }

    @Autowired
    private ConfigService configService;

    @GetMapping("/config")
    public Object config() {
        return configService.redis();
    }
}
