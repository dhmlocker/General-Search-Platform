package com.example.demo.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 * 💡【原子笔记提醒】：关联 [[项目-后端模板初始化]] -> 记录 @RestControllerAdvice 全局拦截异常的原理
 */
@RestControllerAdvice // 这个注解就是“保安”，专门负责盯着所有 Controller
@Slf4j // 用于打印日志
public class GlobalExceptionHandler {

    // 拦截所有的 Exception (兜底)
    @ExceptionHandler(Exception.class)
    public BaseResponse<?> runtimeExceptionHandler(Exception e) {
        // 在后台控制台打印出红色的错误详情，方便你修 Bug
        log.error("系统异常", e);
        // 给前端返回一个极其体面的、带有 50000 错误码的 JSON
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR);
    }
}