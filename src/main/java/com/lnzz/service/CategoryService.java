package com.lnzz.service;

import com.lnzz.vo.CategoryVo;
import com.lnzz.vo.ResponseVo;

import java.util.List;
import java.util.Set;

/**
 * ClassName：CategoryService
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 14:19
 * @Description:
 */
public interface CategoryService {

    /**
     * selectAll
     *
     * @return
     */
    ResponseVo<List<CategoryVo>> selectAll();

    /**
     * findSubCategoryId
     *
     * @param id
     * @param resultSet
     */
    void findSubCategoryId(Integer id, Set<Integer> resultSet);
}
