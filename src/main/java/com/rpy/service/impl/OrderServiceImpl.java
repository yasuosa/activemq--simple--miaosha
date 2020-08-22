package com.rpy.service.impl;

import com.rpy.domain.Order;
import com.rpy.mapper.OrderMapper;
import com.rpy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: activemq-code
 * @author: 任鹏宇
 * @create: 2020-08-22 11:53
 **/
@Transactional
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    //@PostConstruct  //当项目启动时会自己执行的方法
    public void insert(Order order) {
        orderMapper.insert(order);
    }
}
