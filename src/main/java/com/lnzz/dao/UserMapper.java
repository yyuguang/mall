package com.lnzz.dao;

import com.lnzz.pojo.User;

public interface UserMapper {
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

    /**
     * countByUsername
     *
     * @param username
     * @return
     */
    int countByUsername(String username);

    /**
     * countByEmail
     *
     * @param email
     * @return
     */
    int countByEmail(String email);

    /**
     * selectByUsername
     *
     * @param username
     * @return
     */
    User selectByUsername(String username);
}