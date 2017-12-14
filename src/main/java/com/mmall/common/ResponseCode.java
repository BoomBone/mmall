package com.mmall.common;

/**
 * Created by Administrator on 2017/12/14.
 * 响应编码枚举类
 */
public enum ResponseCode {

    SUCCESS(0, "SUCCESS"),
    ERROR(1, "ERROR"),
    NEED_LOGIN(10, "NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2, "ILLEGAL_ARGUMENT");

    private final int CODE;
    private final String DESC;

    ResponseCode(int code, String desc) {
        this.CODE = code;
        this.DESC = desc;
    }

    public int getCode() {
        return CODE;
    }

    public String getDesc() {
        return DESC;
    }
}
