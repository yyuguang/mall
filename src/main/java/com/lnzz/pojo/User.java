package com.lnzz.pojo;

import lombok.Data;

import java.util.Date;

/**
 * ClassName：User
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/16 18:17
 * @Description:
 */
@Data
public class User {
    private Integer id;

    private String username;

    private String password;

    private String email;

    private String phone;

    private String question;

    private String answer;

    private Integer role;

    private Date createTime;

    private Date updateTime;

}