package com.lnzz.dao;

import com.lnzz.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
 * ClassName：ProductMapper
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/16 18:17
 * @Description:
 */
public interface ProductMapper {
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
    int insert(Product record);

    /**
     * insertSelective
     *
     * @param record
     * @return
     */
    int insertSelective(Product record);

    /**
     * selectByPrimaryKey
     *
     * @param id
     * @return
     */
    Product selectByPrimaryKey(Integer id);

    /**
     * updateByPrimaryKeySelective
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * updateByPrimaryKey
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(Product record);

    /**
     * selectByCategoryIdSet
     *
     * @param categoryIdSet
     * @return
     */
    List<Product> selectByCategoryIdSet(@Param("categoryIdSet") Set<Integer> categoryIdSet);

    /**
     * selectByProductIdSet
     *
     * @param productIdSet
     * @return
     */
    List<Product> selectByProductIdSet(@Param("productIdSet") Set<Integer> productIdSet);
}