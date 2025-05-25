package com.biancheng.po;

public class OrderInfo {
    private Integer id;
    private Integer orderNum;
    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "id=" + id +
                ", orderNum=" + orderNum +
                ", userId=" + userId +
                '}';
    }
}
