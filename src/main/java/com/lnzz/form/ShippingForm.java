package com.lnzz.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * ClassName：ShippingForm
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/22 10:27
 * @Description:
 */
@Data
public class ShippingForm {
    @NotBlank
    private String receiverName;

    @NotBlank
    private String receiverPhone;

    @NotBlank
    private String receiverMobile;

    @NotBlank
    private String receiverProvince;

    @NotBlank
    private String receiverCity;

    @NotBlank
    private String receiverDistrict;

    @NotBlank
    private String receiverAddress;

    @NotBlank
    private String receiverZip;

}
