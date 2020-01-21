package com.lnzz.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

/**
 * ClassName：CartProductVo
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 16:35
 * @Description:
 */
@Data
@AllArgsConstructor
public class CartProductVo {
    private Integer productId;

    /**
     * 购买的数量
     */
    private Integer quantity;

    private String productName;

    private String productSubtitle;

    private String productMainImage;

    private BigDecimal productPrice;

    private Integer productStatus;

    /**
     * 等于 quantity * productPrice
     */
    private BigDecimal productTotalPrice;

    private Integer productStock;

    /**
     * 商品是否选中
     */
    private Boolean productSelected;
}
