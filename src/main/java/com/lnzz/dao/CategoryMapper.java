package com.lnzz.dao;

import com.lnzz.pojo.Category;

/**
 * ClassName：CategoryMapper
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/16 18:17
 * @Description:
 */
public interface CategoryMapper {
    /**
     * deleteByPrimaryKey
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     *
     * @param record
     * @return
     */
    int insert(Category record);

    /**
     * insertSelective
     *
     * @param record
     * @return
     */
    int insertSelective(Category record);

    /**
     * selectByPrimaryKey
     *
     * @param id
     * @return
     */
    Category selectByPrimaryKey(Integer id);

    /**
     * updateByPrimaryKeySelective
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * updateByPrimaryKey
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(Category record);
}