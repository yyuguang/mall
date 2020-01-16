package com.lnzz.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ClassName：Product
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/16 18:17
 * @Description:
 */
@Data
public class Product {
    private Integer id;

    private Integer categoryId;

    private String name;

    private String subtitle;

    private String mainImage;

    private BigDecimal price;

    private Integer stock;

    private Integer status;

    private Date createTime;

    private Date updateTime;

}