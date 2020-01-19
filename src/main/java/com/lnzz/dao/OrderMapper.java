package com.lnzz.dao;

import com.lnzz.pojo.Order;

/**
 * ClassName：OrderMapper
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/16 18:17
 * @Description:
 */
public interface OrderMapper {
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
    int insert(Order record);

    /**
     * insertSelective
     *
     * @param record
     * @return
     */
    int insertSelective(Order record);

    /**
     * selectByPrimaryKey
     *
     * @param id
     * @return
     */
    Order selectByPrimaryKey(Integer id);

    /**
     * updateByPrimaryKeySelective
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * updateByPrimaryKey
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(Order record);
}