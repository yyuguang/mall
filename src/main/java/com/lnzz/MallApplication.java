package com.lnzz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName：MallApplication
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/16 17:18
 * @Description:
 */
@SpringBootApplication
@MapperScan(basePackages = "com.lnzz.dao")
public class MallApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallApplication.class, args);
    }

}
