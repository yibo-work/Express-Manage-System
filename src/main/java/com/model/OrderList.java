package com.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单
 *
 * @author Clrvn
 */
@Data
public class OrderList implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键自增id
     */
    private Integer id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 订单用户id
     */
    private Integer userId;

    /**
     * 物品信息
     */
    private String goods;

    /**
     * 收货人姓名
     */
    private String username;

    /**
     * 收货人电话
     */
    private String phone;

    /**
     * 寄件人地址（快递点）
     */
    private Integer startExpress;
    private String startExpressName;

    /**
     * 收件人地址（快递点）
     */
    private Integer endExpress;
    private String endExpressName;

    /**
     * 已到达快递点
     */
    private Integer arriveExpress;
    private String arriveExpressName;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;


}
