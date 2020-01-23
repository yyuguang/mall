package com.lnzz.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ClassName：OrderItemVo
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/22 12:19
 * @Description:
 */
@Data
public class OrderItemVo {

    private Long orderNo;

    private Integer productId;

    private String productName;

    private String productImage;

    private BigDecimal currentUnitPrice;

    private Integer quantity;

    private BigDecimal totalPrice;

    private Date createTime;

}
