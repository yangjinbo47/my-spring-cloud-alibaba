package com.anqing.myspringcloudalibaba.pay.dao;

import com.anqing.myspringcloudalibaba.pay.entity.Pay;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: my-spring-cloud-alibaba
 * @Date: 2021/6/13
 * @Author: BOBO
 * @Description:
 */
public interface PayDao extends JpaRepository<Pay, Integer> {
}
