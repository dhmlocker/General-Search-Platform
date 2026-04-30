package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.model.entity.Post;

// 继承 IService，你就拥有了超级丰富的业务方法，比如 list(), save(), remove()
public interface PostService extends IService<Post> {
    boolean saveOrUpdatePost(Post post);
}