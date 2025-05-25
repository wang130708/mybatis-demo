package com.biancheng.mapper;

import com.biancheng.po.OrderInfo;

import java.util.List;

public interface OrderInfoMapper {
    List<OrderInfo> selectOrderById(int id);
}
