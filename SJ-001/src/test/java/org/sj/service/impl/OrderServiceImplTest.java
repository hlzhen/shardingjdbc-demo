package org.sj.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sj.entity.Order;
import org.sj.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * sharding-jdbc测试
 * created by Lz on 2023/12/5 15:29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {
    @Autowired
    private OrderService orderService;

    /**
     * 测试订单保存
     */
    @Test
    public void testSaveOrder() {
        for (int i = 0; i < 2000; i++) {
            Order order = new Order();
            order.setUserId(i + 1);
            order.setPrice(new BigDecimal("0.2").multiply(new BigDecimal(String.valueOf(i + 1))));
            order.setStatus("测试状态" + i + 1);
            orderService.saveOrder(order);
        }
    }


    /**
     * 测试根据订单ID查询
     */
    @Test
    public void testSelectOrderById() {
        List<Long> orderIds = new ArrayList<>();
        orderIds.add(938821106972753920L);
        orderIds.add(938821107216023553L);
        List<Map> maps = orderService.selectOrderById(orderIds);
        System.out.println(maps);
    }


    /**
     * 测试根据用户ID查询
     */
    @Test
    public void testSelectOrderByUserId() {
        List<Long> userIds = new ArrayList<>();
        userIds.add(2L);
        userIds.add(33L);
        List<Map> maps = orderService.selectOrderByUserId(userIds);
        System.out.println(maps);
    }
}