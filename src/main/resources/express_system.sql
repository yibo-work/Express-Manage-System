/*
 Navicat Premium Data Transfer

 Source Server         : local Mysql57
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : express_system

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 10/05/2020 22:57:39
*/

create database if not exists express_system;

use express_system;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order_list
-- ----------------------------
DROP TABLE IF EXISTS `order_list`;
CREATE TABLE `order_list`
(
    `id`             int(11)                                                       NOT NULL AUTO_INCREMENT COMMENT '主键自增id',
    `order_no`       varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL     DEFAULT NULL COMMENT '订单号',
    `user_id`        int(11)                                                       NULL     DEFAULT NULL COMMENT '订单用户id',
    `goods`          varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL     DEFAULT NULL COMMENT '物品信息',
    `username`       varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL     DEFAULT NULL COMMENT '收货人姓名',
    `phone`          varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL     DEFAULT NULL COMMENT '收货人电话',
    `start_express`  int(11)                                                       NULL     DEFAULT NULL COMMENT '寄件人地址（快递点）',
    `end_express`    int(11)                                                       NULL     DEFAULT NULL COMMENT '收件人地址（快递点）',
    `arrive_express` int(11)                                                       NULL     DEFAULT NULL COMMENT '已到达快递点',
    `status`         int(255)                                                      NOT NULL DEFAULT 0 COMMENT '状态',
    `create_time`    datetime(0)                                                   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '订单'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `id`       int(11)                                                       NOT NULL AUTO_INCREMENT COMMENT '主键自增id',
    `name`     varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `phone`    varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '电话',
    `address`  varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '地址',
    `role_id`  int(11)                                                       NULL DEFAULT NULL COMMENT '角色id，1、用户 2、快递点 3、管理员',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 13
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '用户'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user`
VALUES (1, '快递点A', '123', '13312341234', '快递点A的地址', 2);
INSERT INTO `user`
VALUES (2, '快递点B', '123', '13312341234', '快递点B的地址', 2);
INSERT INTO `user`
VALUES (3, '快递点C', '123', '13312341234', '快递点C的地址', 2);
INSERT INTO `user`
VALUES (4, '快递点D', '123', '13312341234', '快递点D的地址', 2);
INSERT INTO `user`
VALUES (5, '快递点E', '123', '13312341234', '快递点E的地址', 2);
INSERT INTO `user`
VALUES (6, '快递点F', '123', '13312341234', '快递点F的地址', 2);
INSERT INTO `user`
VALUES (7, '快递点G', '123', '13312341234', '快递点G的地址', 2);
INSERT INTO `user`
VALUES (8, '快递点H', '123', '13312341234', '快递点H的地址', 2);
INSERT INTO `user`
VALUES (9, 'user1', '123', '13312341234', 'user1的地址', 1);
INSERT INTO `user`
VALUES (10, 'user2', '123', '13312341234', 'user2的地址', 1);
INSERT INTO `user`
VALUES (11, 'user3', '123', '13312341234', 'user3的地址', 1);

SET FOREIGN_KEY_CHECKS = 1;
