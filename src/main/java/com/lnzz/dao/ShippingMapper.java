package com.lnzz.dao;

import com.lnzz.pojo.Shipping;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    /**
     * deleteByIdAndUid
     *
     * @param uid
     * @param shippingId
     * @return
     */
    int deleteByIdAndUid(@Param("uid") Integer uid, @Param("shippingId") Integer shippingId);

    /**
     * selectByUid
     * @param uid
     * @return
     */
    List<Shipping> selectByUid(@Param("uid") Integer uid);
}