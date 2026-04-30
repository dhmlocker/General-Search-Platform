package com.example.demo.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

@Data
@TableName("user") // 指定对应的数据库表名
public class User {
    @TableId(type = IdType.AUTO) // 主键自增
    private Long id;
    private String username;
    private String userAvatar;
    private String userProfile;
    private Date createTime;
}