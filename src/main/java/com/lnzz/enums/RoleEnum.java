package com.lnzz.enums;

import lombok.Getter;

/**
 * ClassName：RoleEnum
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 9:50
 * @Description:
 */
@Getter
public enum RoleEnum {
    /**
     * 管理员
     */
    ADMIN(0),
    /**
     * 普通用户
     */
    CUSTOMER(1),
    ;
    Integer code;

    RoleEnum(Integer code) {
        this.code = code;
    }
}
