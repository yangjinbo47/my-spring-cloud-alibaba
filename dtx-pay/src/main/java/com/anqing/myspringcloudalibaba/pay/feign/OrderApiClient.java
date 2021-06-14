package com.anqing.myspringcloudalibaba.pay.feign;

import com.anqing.myspringcloudalibaba.api.OrderApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @program: my-spring-cloud-alibaba
 * @Date: 2021/6/14
 * @Author: BOBO
 * @Description:
 */
@FeignClient(value = "my-spring-cloud-dtxorder")
public interface OrderApiClient extends OrderApi {
}
