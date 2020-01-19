package com.lnzz.dao;

import com.lnzz.pojo.OrderItem;

/**
 * ClassName：OrderItemMapper
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/16 18:17
 * @Description:
 */
public interface OrderItemMapper {
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
    int insert(OrderItem record);

    /**
     * insertSelective
     *
     * @param record
     * @return
     */
    int insertSelective(OrderItem record);

    /**
     * selectByPrimaryKey
     *
     * @param id
     * @return
     */
    OrderItem selectByPrimaryKey(Integer id);

    /**
     * updateByPrimaryKeySelective
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(OrderItem record);

    /**
     * updateByPrimaryKey
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(OrderItem record);
}