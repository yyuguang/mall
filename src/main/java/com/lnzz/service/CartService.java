package com.lnzz.service;

import com.lnzz.form.CartAddForm;
import com.lnzz.form.CartUpdateForm;
import com.lnzz.pojo.Cart;
import com.lnzz.vo.CartVo;
import com.lnzz.vo.ResponseVo;

import java.util.List;

/**
 * ClassName：CartService
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 16:51
 * @Description:
 */
public interface CartService {

    /**
     * add
     *
     * @param uid
     * @param cartAddForm
     * @return
     */
    ResponseVo<CartVo> add(Integer uid, CartAddForm cartAddForm);

    /**
     * list
     *
     * @param uid
     * @return
     */
    ResponseVo<CartVo> list(Integer uid);

    /**
     * update
     *
     * @param uid
     * @param productId
     * @param cartUpdateForm
     * @return
     */
    ResponseVo<CartVo> update(Integer uid, Integer productId, CartUpdateForm cartUpdateForm);

    /**
     * delete
     *
     * @param uid
     * @param productId
     * @return
     */
    ResponseVo<CartVo> delete(Integer uid, Integer productId);

    /**
     * selectAll
     *
     * @param uid
     * @return
     */
    ResponseVo<CartVo> selectAll(Integer uid);

    /**
     * unSelectAll
     *
     * @param uid
     * @return
     */
    ResponseVo<CartVo> unSelectAll(Integer uid);

    /**
     * sum
     *
     * @param uid
     * @return
     */
    ResponseVo<Integer> sum(Integer uid);

    /**
     * listForCart
     *
     * @param uid
     * @return
     */
    List<Cart> listForCart(Integer uid);
}
