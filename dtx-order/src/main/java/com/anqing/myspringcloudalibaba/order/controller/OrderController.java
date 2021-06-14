package com.anqing.myspringcloudalibaba.order.controller;

import com.anqing.myspringcloudalibaba.api.OrderApi;
import com.anqing.myspringcloudalibaba.order.entity.Order;
import com.anqing.myspringcloudalibaba.order.service.OrderService;
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
@RequestMapping("/order")
public class OrderController implements OrderApi {

    @Resource
    private OrderService orderService;

    @RequestMapping("/save")
    public void save(){
//        System.out.println(1/0);
        Order order = new Order();
        order.setName(System.currentTimeMillis()+"");
        orderService.save(order);
    }
}
