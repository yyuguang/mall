package com.lnzz.dao;

import com.lnzz.pojo.Shipping;

/**
 * ClassName：ShippingMapper
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/16 18:17
 * @Description:
 */
public interface ShippingMapper {
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
    int insert(Shipping record);

    /**
     * insertSelective
     *
     * @param record
     * @return
     */
    int insertSelective(Shipping record);

    /**
     * selectByPrimaryKey
     *
     * @param id
     * @return
     */
    Shipping selectByPrimaryKey(Integer id);

    /**
     * updateByPrimaryKeySelective
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Shipping record);

    /**
     * updateByPrimaryKey
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(Shipping record);
}