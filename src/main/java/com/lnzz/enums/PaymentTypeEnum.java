package com.lnzz.enums;

import lombok.Getter;

/**
 * ClassName：PaymentTypeEnum
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/23 12:35
 * @Description:
 */
@Getter
public enum PaymentTypeEnum {

    /**
     * 在线支付
     */
    PAY_ONLINE(1),
    ;

    Integer code;

    PaymentTypeEnum(Integer code) {
        this.code = code;
    }
}
