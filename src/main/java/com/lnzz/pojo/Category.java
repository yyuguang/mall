package com.lnzz.pojo;

import lombok.Data;

import java.util.Date;

/**
 * ClassName：Category
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/16 18:17
 * @Description:
 */
@Data
public class Category {
    private Integer id;

    private Integer parentId;

    private String name;

    private Boolean status;

    private Integer sortOrder;

    private Date createTime;

    private Date updateTime;
}