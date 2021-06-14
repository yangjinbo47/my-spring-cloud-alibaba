package com.anqing.myspringcloudalibaba.pay.controller;

import com.anqing.myspringcloudalibaba.api.PayApi;
import com.anqing.myspringcloudalibaba.pay.entity.Pay;
import com.anqing.myspringcloudalibaba.pay.service.PayService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: my-spring-cloud-alibaba
 * @Date: 2021/6/13
 * @Author: BOBO
 * @Description:
 */
@RestController
@RequestMapping("/pay")
public class PayController implements PayApi {

    @Value("${order-url.nacos-order-service}")
    private String orderUrl;

    @Resource
    private PayService payService;

    @RequestMapping("/save")
    public void save(){
        Pay order = new Pay();
        order.setName(System.currentTimeMillis()+"");
        payService.save(order);
    }
}
