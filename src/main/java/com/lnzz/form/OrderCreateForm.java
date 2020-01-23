package com.lnzz.form;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * ClassName：OrderCreateForm
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/23 13:49
 * @Description:
 */
@Data
public class OrderCreateForm {

    @NotNull
    private Integer shippingId;
}
