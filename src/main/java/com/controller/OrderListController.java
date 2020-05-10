package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.OrderList;
import com.service.OrderListService;
import com.utils.RequestParamsUtil;
import com.utils.ResultVOUtil;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 订单Controller
 *
 * @author Clrvn
 */
@RestController
@RequestMapping("/orderList")
public class OrderListController {

    @Autowired
    private OrderListService orderListService;

    /**
     * 查询订单页面
     *
     * @return 分页订单数据
     */
    @GetMapping("/page")
    public PageInfo<OrderList> page() {
        return orderListService.page(new RequestParamsUtil());
    }

    /**
     * 查询订单列表
     */
    @GetMapping("/list")
    public ResultVO list() {
        List<OrderList> orderListList = orderListService.list(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(orderListList);
    }

    /**
     * 通过id查询单个订单
     */
    @GetMapping("/findById")
    public ResultVO findById(@RequestParam(value = "id") Integer id) {
        OrderList orderList = orderListService.findById(id);
        return ResultVOUtil.success(orderList);
    }

    /**
     * 通过map查询单个订单
     */
    @GetMapping("/findByMap")
    public ResultVO findByMap() {
        OrderList orderList = orderListService.findByMap(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(orderList);
    }

    /**
     * 添加订单
     */
    @PostMapping("/save")
    public ResultVO save(@RequestBody OrderList orderList) {
        orderListService.save(orderList);
        return ResultVOUtil.success();
    }

    /**
     * 修改订单
     */
    @PutMapping("/update")
    public ResultVO update(@RequestBody OrderList orderList) {
        orderListService.update(orderList);
        return ResultVOUtil.success();
    }

    /**
     * 删除订单
     */
    @DeleteMapping("/deleteById")
    public ResultVO deleteById(@RequestParam(value = "id") Integer id) {
        orderListService.deleteById(id);
        return ResultVOUtil.success();

    }

}