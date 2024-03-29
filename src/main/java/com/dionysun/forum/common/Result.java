package com.dionysun.forum.common;

import com.alibaba.fastjson.JSONObject;

/**
 * 返回结果类
 */
public class Result<T> extends JSONObject{
    private Integer statusCode;
    private T object;
    private String message;

    public Result(Integer statusCode, T data) {
        this.statusCode = statusCode;
        this.object = data;
        put("status",statusCode);
        put("data",object);
    }
    public Result(Integer statusCode){
        this.statusCode = statusCode;
        put("status",statusCode);
    }
    public Result(Integer statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
        put("status",statusCode);
        put("message",message);
    }
}
