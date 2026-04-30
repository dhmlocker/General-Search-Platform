package com.example.demo.common;

/**
 * 全局错误码定义
 * 💡【原子笔记提醒】：关联 [[项目-后端模板初始化]] -> 记录企业级错误码枚举的用法
 */
public enum ErrorCode {

    SUCCESS(0, "ok"),
    PARAMS_ERROR(40000, "请求参数错误"),
    NOT_LOGIN_ERROR(40100, "未登录"),
    NO_AUTH_ERROR(40101, "无权限"),
    SYSTEM_ERROR(50000, "系统内部异常");

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
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