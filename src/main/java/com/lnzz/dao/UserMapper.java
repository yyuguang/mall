package com.lnzz.dao;

import com.lnzz.pojo.User;

/**
 * ClassName：UserMapper
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/16 18:17
 * @Description:
 */
public interface UserMapper {
    /**
     * deleteByPrimaryKey
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @param record
     * @return
     */
    int insert(User record);

    /**
     * insertSelective
     *
     * @param record
     * @return
     */
    int insertSelective(User record);

    /**
     * selectByPrimaryKey
     *
     * @param id
     * @return
     */
    User selectByPrimaryKey(Integer id);

    /**
     * updateByPrimaryKeySelective
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * updateByPrimaryKey
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(User record);
}