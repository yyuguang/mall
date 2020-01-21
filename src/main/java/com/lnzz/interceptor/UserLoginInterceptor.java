package com.lnzz.interceptor;

import com.lnzz.consts.MallConst;
import com.lnzz.enums.ResponseEnum;
import com.lnzz.exception.UserLoginException;
import com.lnzz.pojo.User;
import com.lnzz.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ClassName：UserLoginInterceptor
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 13:40
 * @Description:
 */
@Slf4j
public class UserLoginInterceptor implements HandlerInterceptor {

    /**
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("preHandle...");
        User user = (User) request.getSession().getAttribute(MallConst.CURRENT_USER);
        if (user == null) {
            log.info("user=null");
            throw  new UserLoginException();
        }
        return true;
    }
}
