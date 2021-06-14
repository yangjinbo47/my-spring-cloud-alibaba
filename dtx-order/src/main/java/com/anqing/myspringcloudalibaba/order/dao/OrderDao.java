package com.anqing.myspringcloudalibaba.order.dao;

import com.anqing.myspringcloudalibaba.order.entity.Order;
import netscape.security.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: my-spring-cloud-alibaba
 * @Date: 2021/6/13
 * @Author: BOBO
 * @Description:
 */
public interface OrderDao extends JpaRepository<Order, Integer> {
}
