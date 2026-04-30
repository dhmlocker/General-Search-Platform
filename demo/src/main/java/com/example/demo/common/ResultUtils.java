package com.example.demo.common;

/**
 * 返回结果工具类
 */
public class ResultUtils {

    // 成功时调用，把数据打包塞进去
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    // 失败时调用，返回对应的错误码
    public static BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode.getCode(), null, errorCode.getMessage());
    }
}