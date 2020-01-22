package com.lnzz.service;

import com.github.pagehelper.PageInfo;
import com.lnzz.form.ShippingForm;
import com.lnzz.vo.ResponseVo;

import java.util.Map;

/**
 * ClassName：ShippingService
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/22 10:26
 * @Description:
 */
public interface ShippingService {

    /**
     * add
     *
     * @param uid
     * @param shippingForm
     * @return
     */
    ResponseVo<Map<String, Integer>> add(Integer uid, ShippingForm shippingForm);

    /**
     * delete
     *
     * @param uid
     * @param shippingId
     * @return
     */
    ResponseVo delete(Integer uid, Integer shippingId);

    /**
     * update
     *
     * @param uid
     * @param shippingId
     * @param shippingForm
     * @return
     */
    ResponseVo update(Integer uid, Integer shippingId, ShippingForm shippingForm);

    /**
     * list
     *
     * @param uid
     * @param pageNum
     * @param pageSize
     * @return
     */
    ResponseVo<PageInfo> list(Integer uid, Integer pageNum, Integer pageSize);
}
