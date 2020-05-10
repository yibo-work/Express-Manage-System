package com.service.impl;

import com.dao.OrderListDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.OrderList;
import com.service.OrderListService;
import com.utils.RequestParamsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 订单ServiceImpl
 *
 * @author Clrvn
 */
@Service
public class OrderListServiceImpl implements OrderListService {

    @Autowired
    private OrderListDao orderListDao;

    /**
     * 查询订单页面
     *
     * @return 分页订单数据
     */
    @Override
    public PageInfo<OrderList> page(RequestParamsUtil requestParamsUtil) {
        PageHelper.startPage(requestParamsUtil.getPageNo(), requestParamsUtil.getPageSize());
        return new PageInfo<>(orderListDao.list(requestParamsUtil.getParameters()));
    }

    /**
     * 查询订单列表
     */
    @Override
    public List<OrderList> list(Map<String, Object> map) {
        return orderListDao.list(map);
    }


    /**
     * 通过id查询单个订单
     */
    @Override
    public OrderList findById(Integer id) {
        return orderListDao.findById(id);
    }

    /**
     * 通过map查询单个订单
     */
    @Override
    public OrderList findByMap(Map<String, Object> map) {
        return orderListDao.findByMap(map);
    }

    /**
     * 新增订单
     */
    @Override
    public int save(OrderList orderList) {
        return orderListDao.save(orderList);
    }

    /**
     * 修改订单
     */
    @Override
    public int update(OrderList orderList) {
        return orderListDao.update(orderList);
    }

    /**
     * 修改订单
     */
    @Override
    public int submitOrder(OrderList orderList) {
        SimpleDateFormat dft = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String orderNo = dft.format(new Date());
        orderList.setOrderNo(orderNo);
        return orderListDao.update(orderList);
    }

    /**
     * 删除订单
     */
    @Override
    public int deleteById(Integer id) {
        return orderListDao.deleteById(id);
    }

}
