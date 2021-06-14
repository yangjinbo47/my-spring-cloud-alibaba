package com.anqing.myspringcloudalibaba.pay.service;

import com.anqing.myspringcloudalibaba.pay.dao.PayDao;
import com.anqing.myspringcloudalibaba.pay.entity.Pay;
import com.anqing.myspringcloudalibaba.pay.feign.OrderApiClient;
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
public class PayService {

    @Resource
    private PayDao payDao;
    @Resource
    private OrderApiClient orderApiClient;

    @Transactional
    @LcnTransaction
    public void save(Pay pay){
        payDao.save(pay);
        orderApiClient.save();
    }

}
