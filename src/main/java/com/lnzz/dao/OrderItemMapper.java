package com.lnzz.dao;

import com.lnzz.pojo.OrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

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

    /**
     * 批量插入
     * batchInsert
     *
     * @param orderItemList
     * @return
     */
    int batchInsert(@Param("orderItemList") List<OrderItem> orderItemList);


    /**
     * selectOrderByNoSet
     *
     * @param orderNoSet
     * @return
     */
    List<OrderItem> selectByOrderNoSet(@Param("orderNoSet") Set orderNoSet);
}