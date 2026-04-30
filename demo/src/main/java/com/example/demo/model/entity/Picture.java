package com.example.demo.model.entity;

import lombok.Data;

/**
 * 图片实体类（仅用于数据传输，不存数据库）
 */
@Data
public class Picture {
    private String title; // 图片标题
    private String url;   // 图片链接
}