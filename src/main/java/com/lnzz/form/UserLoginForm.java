package com.lnzz.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * ClassName：UserLoginForm
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 10:28
 * @Description:
 */
@Data
public class UserLoginForm {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
