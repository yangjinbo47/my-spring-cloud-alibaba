package com.anqing.myspringcloudalibaba.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @program: my-spring-cloud-alibaba
 * @Date: 2021/6/14
 * @Author: BOBO
 * @Description:
 */
@FeignClient(value = "my-spring-cloud-dtxorder")
public interface OrderApi {

    @PostMapping("/order/order/save")
    void save();
}
