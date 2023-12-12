package org.sj.service.impl;

import org.sj.dao.OrderMapper;
import org.sj.entity.Order;
import org.sj.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * TODO: Delete todo after editing description
 * created by Lz on 2023/12/5 15:26
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public int saveOrder(Order order) {
        return orderMapper.saveOrder(order);
    }


    @Override
    public List<Map> selectOrderById(List<Long> orderIds) {
        return orderMapper.selectOrderById(orderIds);
    }


    @Override
    public List<Map> selectOrderByUserId(List<Long> userIds) {
        return orderMapper.selectOrderByUserId(userIds);
    }
}
