package com.lnzz.enums;

import lombok.Getter;

/**
 * ClassName：ResponseEnum
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 10:17
 * @Description:
 */
@Getter
public enum ResponseEnum {

    /**
     * 服务端错误
     */
    ERROR(-1, "服务端错误"),

    /**
     * 成功
     */
    SUCCESS(0, "成功"),

    /**
     * 密码错误
     */
    PASSWORD_ERROR(1, "密码错误"),

    /**
     * 用户名已存在
     */
    USERNAME_EXIST(2, "用户名已存在"),

    /**
     * 参数错误
     */
    PARAM_ERROR(3, "参数错误"),

    /**
     * 邮箱已存在
     */
    EMAIL_EXIST(4, "邮箱已存在"),

    /**
     * 用户未登录, 请先登录
     */
    NEED_LOGIN(10, "用户未登录, 请先登录"),

    /**
     * 用户名或密码错误
     */
    USERNAME_OR_PASSWORD_ERROR(11, "用户名或密码错误"),

    /**
     * 商品下架或删除
     */
    PRODUCT_OFF_SALE_OR_DELETE(12, "商品下架或删除"),

    /**
     * 商品不存在
     */
    PRODUCT_NOT_EXIST(13, "商品不存在"),

    /**
     * 库存不正确
     */
    PRODUCT_STOCK_ERROR(14, "库存不正确"),

    /**
     * 购物车里无此商品
     */
    CART_PRODUCT_NOT_EXIST(15, "购物车里无此商品"),

    /**
     * 删除收货地址失败
     */
    DELETE_SHIPPING_FAIL(16, "删除收货地址失败"),

    /**
     * 收货地址不存在
     */
    SHIPPING_NOT_EXIST(17, "收货地址不存在"),

    /**
     * 请选择商品后下单
     */
    CART_SELECTED_IS_EMPTY(18, "请选择商品后下单"),

    /**
     * 订单不存在
     */
    ORDER_NOT_EXIST(19, "订单不存在"),

    /**
     * 订单状态有误
     */
    ORDER_STATUS_ERROR(20, "订单状态有误"),

    ;

    Integer code;

    String desc;

    ResponseEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
