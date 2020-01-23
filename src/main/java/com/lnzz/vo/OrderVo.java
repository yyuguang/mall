package com.lnzz.vo;

import com.lnzz.pojo.Shipping;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * ClassName：OrderVo
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/22 12:17
 * @Description:
 */
@Data
public class OrderVo {

    private Long orderNo;

    private BigDecimal payment;

    private Integer userId;

    private Integer postage;

    private Integer status;

    private Date paymentTime;

    private Date sendTime;

    private Date endTime;

    private Date closeTime;

    private Date createTime;

    private List<OrderItemVo> orderItemVoList;

    private Integer shippingId;

    private Shipping shippingVo;

}
