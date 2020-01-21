package com.lnzz.form;

import lombok.Data;

/**
 * ClassName：CartUpdateForm
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 17:36
 * @Description:
 */
@Data
public class CartUpdateForm {

    private Integer quantity;
    
    private Boolean selected;
}
