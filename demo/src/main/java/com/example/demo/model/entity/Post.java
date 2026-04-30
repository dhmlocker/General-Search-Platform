package com.example.demo.model.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

@Data // 💡【原子笔记提醒】：Lombok 注解，自动生成 get/set 方法
@TableName("post") // 对应数据库里的表名
public class Post {
    @TableId
    private Long id;
    private String title;
    private String content;
    private String tags;
    private Long userId;
    private Date createTime;
    private Date updateTime;
    // 在 Post 类中增加字段
    private String url;

}