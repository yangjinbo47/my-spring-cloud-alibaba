package com.anqing.myspringcloudalibaba.api;

import org.springframework.web.bind.annotation.PostMapping;

/**
 * @program: my-spring-cloud-alibaba
 * @Date: 2021/6/14
 * @Author: BOBO
 * @Description:
 */
public interface PayApi {

    @PostMapping("/pay/pay/save")
    void save();
}
