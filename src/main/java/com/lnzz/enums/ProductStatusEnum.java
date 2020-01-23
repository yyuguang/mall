package com.lnzz.enums;

import lombok.Getter;

/**
 * ClassName：ProductStatusEnum
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 16:17
 * @Description:
 */
@Getter
public enum ProductStatusEnum {
    /**
     * 在售
     */
    ON_SALE(1),

    /**
     * 下架
     */
    OFF_SALE(2),

    /**
     * 删除
     */
    DELETE(3),
    ;

    Integer code;

    ProductStatusEnum(Integer code) {
        this.code = code;
    }
}
