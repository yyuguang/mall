package com.lnzz.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * ClassName：UserRegisterForm
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 10:23
 * @Description:
 */
@Data
public class UserRegisterForm {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String email;
}
