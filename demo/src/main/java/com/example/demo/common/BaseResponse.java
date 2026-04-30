package com.example.demo.common;

import lombok.Data;
import java.io.Serializable;

/**
 * 通用返回类
 * 💡【原子笔记提醒】：关联 [[项目-后端模板初始化]] -> 记录泛型 <T> 在通用返回类中的妙用
 */
@Data // 自动生成 get/set
public class BaseResponse<T> implements Serializable {

    private int code;
    private T data; // 这里用泛型 T，意思是 data 里想装什么类型的对象都可以
    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }
}