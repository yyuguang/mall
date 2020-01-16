package com.lnzz.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ClassName：PayInfo
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/16 18:17
 * @Description:
 */
@Data
public class PayInfo {
    private Integer id;

    private Integer userId;

    private Long orderNo;

    private Integer payPlatform;

    private String platformNumber;

    private String platformStatus;

    private BigDecimal payAmount;

    private Date createTime;

    private Date updateTime;

}