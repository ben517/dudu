package com.qfjy.dudu.common.core;


import lombok.Data;

/**
 * @ClassName ResultJson 响应信息主体
 * @Description TODO
 * @Version 1.0
 */
@Data
public class ResultJson<T> {
    /*响应码*/
    private Integer code;
    /*消息提示内容文件*/
    private String msg;
    /*返回指定对象*/
    private T data;

    public static <T> ResultJson<T> ok() {
        return restResult(null, CommonConstants.SUCCESS, null);
    }

    public static <T> ResultJson<T> ok(T data) {
        return restResult(data, CommonConstants.SUCCESS, null);
    }

    public static <T> ResultJson<T> ok(T data, String msg) {
        return restResult(data, CommonConstants.SUCCESS, msg);
    }

    public static <T> ResultJson<T> failed() {
        return restResult(null, CommonConstants.FAIL, null);
    }

    public static <T> ResultJson<T> failed(String msg) {
        return restResult(null, CommonConstants.FAIL, msg);
    }

    public static <T> ResultJson<T> failed(T data) {
        return restResult(data, CommonConstants.FAIL, null);
    }

    public static <T> ResultJson<T> failed(T data, String msg) {
        return restResult(data, CommonConstants.FAIL, msg);
    }

    private static <T> ResultJson<T> restResult(T data, int code, String msg) {
        ResultJson<T> apiResult = new ResultJson<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }

}