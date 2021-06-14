package com.anqing.myspringcloudalibaba.app.controller;

import com.anqing.myspringcloudalibaba.api.PayApi;
import com.anqing.myspringcloudalibaba.app.feign.PayApiClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
    @Value("${pay-url.nacos-pay-service}")
    private String payUrl;

    @Resource
    private PayApiClient payApiClient;

    @GetMapping("/demo")
    public String demo(){
//        return restTemplate.getForObject(serverUrl+"/service/provider/demo",String.class);
        return null;
    }

    @GetMapping("/config")
    public String config(){
//        return restTemplate.getForObject(serverUrl+"/service/provider/config",String.class);
        System.out.println("config");
        return null;
    }

    @GetMapping("/dtx")
    public String dtx(){
//        restTemplate.getForObject(payUrl+"/pay/pay/save",String.class);
        System.out.println(11111);
        payApiClient.save();
        return "dtx";
    }
}
