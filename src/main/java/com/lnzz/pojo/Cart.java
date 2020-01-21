package com.lnzz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName：Cart
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 17:02
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

    private Integer productId;

    private Integer quantity;

    private Boolean productSelected;

}
