package com.dao;

import com.model.OrderList;

import java.util.List;
import java.util.Map;


/**
 * 订单DAO
 *
 * @author Clrvn
 */
public interface OrderListDao {

    /**
     * 通过id查询单个订单
     */
    OrderList findById(Integer id);

    /**
     * 通过map查询单个订单
     */
    OrderList findByMap(Map<String, Object> map);

    /**
     * 查询订单列表
     */
    List<OrderList> list(Map<String, Object> map);

    /**
     * 新增订单
     */
    int save(OrderList orderList);

    /**
     * 修改订单
     */
    int update(OrderList orderList);

    /**
     * 删除订单
     */
    int deleteById(Integer id);

}
