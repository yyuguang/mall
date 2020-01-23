package com.lnzz.enums;

import lombok.Getter;

/**
 * ClassName：OrderStatusEnum
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/23 12:35
 * @Description:
 */
@Getter
public enum OrderStatusEnum {

    /**
     * 已取消
     */
    CANCELED(0, "已取消"),

    /**
     * 未付款
     */
    NO_PAY(10, "未付款"),

    /**
     * 已付款
     */
    PAID(20, "已付款"),

    /**
     * 已发货
     */
    SHIPPED(40, "已发货"),

    /**
     * 交易成功
     */
    TRADE_SUCCESS(50, "交易成功"),

    /**
     * 交易关闭
     */
    TRADE_CLOSE(60, "交易关闭"),
    ;

    Integer code;

    String desc;

    OrderStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
