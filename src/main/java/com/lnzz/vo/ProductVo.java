package com.lnzz.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * ClassName：ProductVo
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 15:31
 * @Description:
 */
@Data
public class ProductVo {
    private Integer id;

    private Integer categoryId;

    private String name;

    private String subtitle;

    private String mainImage;

    private BigDecimal price;

    private Integer status;

}
