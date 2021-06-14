package com.anqing.myspringcloudalibaba.app.feign;

import com.anqing.myspringcloudalibaba.api.PayApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @program: my-spring-cloud-alibaba
 * @Date: 2021/6/14
 * @Author: BOBO
 * @Description:
 */
@FeignClient(value = "my-spring-cloud-dtxpay")
public interface PayApiClient extends PayApi {
}
