package com.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户
 *
 * @author Clrvn
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键自增id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 电话
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 角色id，1、用户 2、快递点 3、管理员
     */
    private Integer roleId;

}
