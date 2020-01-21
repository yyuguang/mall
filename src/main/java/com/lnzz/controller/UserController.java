package com.lnzz.controller;

import com.lnzz.consts.MallConst;
import com.lnzz.enums.ResponseEnum;
import com.lnzz.form.UserLoginForm;
import com.lnzz.form.UserRegisterForm;
import com.lnzz.pojo.User;
import com.lnzz.service.UserService;
import com.lnzz.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * ClassName：UserController
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 10:03
 * @Description:
 */
@RestController
@RequestMapping("/api/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseVo register(@Valid @RequestBody UserRegisterForm userRegisterForm) {
        User user = new User();
        BeanUtils.copyProperties(userRegisterForm, user);
        return userService.register(user);
    }

    @PostMapping("/login")
    public ResponseVo login(@Valid @RequestBody UserLoginForm userLoginForm,
                            HttpSession session) {

        ResponseVo<User> userResponseVo = userService.login(userLoginForm.getUsername(), userLoginForm.getPassword());
        //设置Session
        session.setAttribute(MallConst.CURRENT_USER, userResponseVo.getData());
        return userResponseVo;
    }

    @GetMapping("/userInfo")
    public ResponseVo<User> userInfo(HttpSession session) {
        User user = (User) session.getAttribute(MallConst.CURRENT_USER);
        return ResponseVo.success(user);
    }

    @PostMapping("/logout")
    public ResponseVo<User> logout(HttpSession session) {
        session.removeAttribute(MallConst.CURRENT_USER);
        return ResponseVo.success();
    }
}
