package com.lnzz.form;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * ClassName：CartAddForm
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 16:39
 * @Description:添加商品
 */
@Data
public class CartAddForm {
    @NotNull
    private Integer productId;

    private Boolean selected = true;
}
