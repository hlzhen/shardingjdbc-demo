package org.sj.dao;

import org.apache.ibatis.annotations.Param;
import org.sj.entity.Order;

import java.util.List;
import java.util.Map;

/**
 * 逻辑表的映射
 * created by Lz on 2023/12/5 15:20
 */
public interface OrderMapper {

    int saveOrder(Order order);


    List<Map> selectOrderById(@Param("orderIds") List<Long> orderIds);


    List<Map> selectOrderByUserId(@Param("userIds") List<Long> userIds);
}
