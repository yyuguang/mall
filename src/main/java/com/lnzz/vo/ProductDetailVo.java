package com.lnzz.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ClassName：ProductDetailVo
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 16:09
 * @Description:
 */
@Data
public class ProductDetailVo {
    private Integer id;

    private Integer categoryId;

    private String name;

    private String subtitle;

    private String mainImage;

    private String subImages;

    private String detail;

    private BigDecimal price;

    private Integer stock;

    private Integer status;

    private Date createTime;

    private Date updateTime;
}
