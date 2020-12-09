package com.zc.add.common;

/**
 * 项目中所使用的同意返回值
 */
public enum ResponseEnum {
    OK(200,"成功"),
    ERROR(500,"操作失败"),
    USER_PASSWORD_IS_NULL(1001,"用户名或密码不能为空"),
    USER_IS_NOT_EXIST(1002,"用户不存在"),
    PASSWORD_IS_ERROR(1003,"密码错误"),
    LOGIN_NULL(1004,"用户没有登陆"),
    USER_EXIST(1005,"用户已经存在"),
    CODE_IS_ERROR(1006,"验证码错误"),
    PHONE_EXIST(1007,"手机号已经存在"),
    PRODUCT_NULL(1008,"商品不存在"),
    PRODUCT_ISUP_NO(1009,"商品已下架"),
    ORDER_IS_ERROR(1011,"下单失败 其中有产品没有库存了,请重新下单"),
    TOKEN_IS_NULL(1012,"");


    private int code;
    private String message;

    ResponseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
