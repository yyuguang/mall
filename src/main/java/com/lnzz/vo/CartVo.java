package com.lnzz.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * ClassName：CartVo
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 16:34
 * @Description:
 */
@Data
public class CartVo {

    private List<CartProductVo> cartProductVoList;

    private Boolean selectedAll;

    private BigDecimal cartTotalPrice;

    private Integer cartTotalQuantity;
}
