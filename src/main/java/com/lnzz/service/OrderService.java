package com.lnzz.service;

import com.github.pagehelper.PageInfo;
import com.lnzz.vo.OrderVo;
import com.lnzz.vo.ResponseVo;

/**
 * ClassName：OrderService
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/22 12:21
 * @Description:
 */
public interface OrderService {

    /**
     * create
     *
     * @param uid
     * @param shippingId
     * @return
     */
    ResponseVo<OrderVo> create(Integer uid, Integer shippingId);

    /**
     * list
     *
     * @param uid
     * @param pageNum
     * @param pageSize
     * @return
     */
    ResponseVo<PageInfo> list(Integer uid, Integer pageNum, Integer pageSize);

    /**
     * detail
     *
     * @param uid
     * @param orderNo
     * @return
     */
    ResponseVo<OrderVo> detail(Integer uid, Long orderNo);

    /**
     * cancel
     * @param uid
     * @param orderNo
     * @return
     */
    ResponseVo cancel(Integer uid, Long orderNo);

}
