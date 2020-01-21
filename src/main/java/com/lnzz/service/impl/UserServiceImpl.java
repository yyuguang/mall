package com.lnzz.service.impl;

import com.lnzz.dao.UserMapper;
import com.lnzz.enums.ResponseEnum;
import com.lnzz.enums.RoleEnum;
import com.lnzz.pojo.User;
import com.lnzz.service.UserService;
import com.lnzz.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

/**
 * ClassName：UserServiceImpl
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/20 13:11
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public ResponseVo register(User user) {
        int countByUsername = userMapper.countByUsername(user.getUsername());
        if (countByUsername > 0) {
            return ResponseVo.error(ResponseEnum.USERNAME_EXIST);
        }

        int countByEmail = userMapper.countByEmail(user.getEmail());
        if (countByEmail > 0) {
            return ResponseVo.error(ResponseEnum.EMAIL_EXIST);
        }

        //MD5摘要算法(Spring自带)
        user.setPassword(DigestUtils.md5DigestAsHex(
                user.getPassword().getBytes(StandardCharsets.UTF_8))
        );
        user.setRole(RoleEnum.CUSTOMER.getCode());

        int resultCount = userMapper.insertSelective(user);
        if (resultCount == 0) {
            return ResponseVo.error(ResponseEnum.ERROR);
        }

        return ResponseVo.success();
    }

    @Override
    public ResponseVo<User> login(String username, String password) {
        User user = userMapper.selectByUsername(username);

        if (user == null) {
            return ResponseVo.error(ResponseEnum.USERNAME_OR_PASSWORD_ERROR);
        }

        if (!user.getPassword().equalsIgnoreCase(DigestUtils.md5DigestAsHex(
                password.getBytes(StandardCharsets.UTF_8)))) {
            return ResponseVo.error(ResponseEnum.USERNAME_OR_PASSWORD_ERROR);
        }
        user.setPassword("");
        return ResponseVo.success(user);
    }
}
