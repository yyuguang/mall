package com.lnzz.service;

import com.lnzz.pojo.User;
import com.lnzz.vo.ResponseVo;
import org.springframework.stereotype.Service;

/**
 * ClassName：UserService
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/20 13:10
 * @Description:
 */

public interface UserService {
    /**
     * 注册
     *
     * @param user
     * @return
     */
    ResponseVo<User> register(User user);

    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    ResponseVo<User> login(String username, String password);

}
