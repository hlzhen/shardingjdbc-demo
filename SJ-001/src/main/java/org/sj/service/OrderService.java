package org.sj.service;

import org.sj.entity.Order;

import java.util.List;
import java.util.Map;

/**
 * TODO: Delete todo after editing description
 * created by Lz on 2023/12/5 15:26
 */
public interface OrderService {
    int saveOrder(Order order);

    List<Map> selectOrderById(List<Long> orderIds);

    List<Map> selectOrderByUserId(List<Long> userIds);
}
