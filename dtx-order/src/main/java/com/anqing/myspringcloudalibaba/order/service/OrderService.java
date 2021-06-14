package com.anqing.myspringcloudalibaba.order.service;

import com.anqing.myspringcloudalibaba.order.dao.OrderDao;
import com.anqing.myspringcloudalibaba.order.entity.Order;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @program: my-spring-cloud-alibaba
 * @Date: 2021/6/13
 * @Author: BOBO
 * @Description:
 */
@Service
public class OrderService {

    @Resource
    private OrderDao orderDao;

    @Transactional
    @LcnTransaction
    public void save(Order order){
        orderDao.save(order);
    }

}
