package com.anqing.myspringcloudalibaba.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: my-spring-cloud-alibaba
 * @Date: 2021/4/19
 * @Author: BOBO
 * @Description:
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Value("${service-url.nacos-user-service}")
    private String serverUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/demo")
    public String demo(){
        return restTemplate.getForObject(serverUrl+"/service/provider/demo",String.class);
    }

    @GetMapping("/config")
    public String config(){
        return restTemplate.getForObject(serverUrl+"/service/provider/config",String.class);
    }
}
