package com.lnzz.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName：InterceptorConfig
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 13:44
 * @Description:
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserLoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/error", "/api/user/login", "/api/user/register", "/api/category/categories", "/api/product", "/api/product/products/*");
    }
}
