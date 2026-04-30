package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.model.entity.Post; // 这里一会儿会报错，因为我们还没建实体类，别急
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostMapper extends BaseMapper<Post> {
    // 继承了 BaseMapper，你就拥有了增删改查的所有超能力，一行 SQL 都不用写！
}