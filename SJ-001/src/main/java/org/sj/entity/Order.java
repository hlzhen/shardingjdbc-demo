package org.sj.entity;

import java.math.BigDecimal;

/**
 * 实体表
 * created by Lz on 2023/12/5 15:21
 */
public class Order {
    private long orderId;

    private BigDecimal price;

    private long userId;

    private String status;


    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", price=" + price +
                ", userId=" + userId +
                ", status='" + status + '\'' +
                '}';
    }
}
