package com.lnzz.dao;

import com.lnzz.pojo.PayInfo;

/**
 * ClassName：PayInfoMapper
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/16 18:17
 * @Description:
 */
public interface PayInfoMapper {
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
    int insert(PayInfo record);

    /**
     * insertSelective
     *
     * @param record
     * @return
     */
    int insertSelective(PayInfo record);

    /**
     * selectByPrimaryKey
     *
     * @param id
     * @return
     */
    PayInfo selectByPrimaryKey(Integer id);

    /**
     * updateByPrimaryKeySelective
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(PayInfo record);

    /**
     * updateByPrimaryKey
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(PayInfo record);
}