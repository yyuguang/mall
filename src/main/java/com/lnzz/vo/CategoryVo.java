package com.lnzz.vo;

import lombok.Data;

import java.util.List;

/**
 * ClassName：CatagoryVo
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 14:14
 * @Description:
 */
@Data
public class CategoryVo {
    private Integer id;

    private Integer parentId;

    private String name;

    private Integer sortOrder;

    private List<CategoryVo> subCategories;
}
