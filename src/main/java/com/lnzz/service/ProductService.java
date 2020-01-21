package com.lnzz.service;

import com.github.pagehelper.PageInfo;
import com.lnzz.vo.ProductDetailVo;
import com.lnzz.vo.ProductVo;
import com.lnzz.vo.ResponseVo;

import java.util.List;

/**
 * ClassName：ProductService
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 15:40
 * @Description:
 */
public interface ProductService {
    /**
     * list
     *
     * @param categoryId
     * @param pageNum
     * @param pageSize
     * @return
     */
    ResponseVo<PageInfo> list(Integer categoryId, Integer pageNum, Integer pageSize);

    /**
     * detail
     *
     * @param productId
     * @return
     */
    ResponseVo<ProductDetailVo> detail(Integer productId);
}
