package com.example.demo.controller;

import com.example.demo.common.BaseResponse;
import com.example.demo.common.ErrorCode;
import com.example.demo.common.ResultUtils;
import com.example.demo.model.entity.Post;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/list")
    public BaseResponse<List<Post>> listPost() {
        List<Post> postList = postService.list();
        return ResultUtils.success(postList);
    }

    /**
     * 💡 新增：发布帖子的接口，测试实时双写
     */
    @PostMapping("/add")
    public BaseResponse<Long> addPost(@RequestBody Post post) {
        // 补充一些默认信息
        post.setCreateTime(new Date());
        post.setUpdateTime(new Date());
//        post.setIsDelete(0);

        // 💡 重点：这里不再调用 postService.save()，而是调用我们刚写的双写方法！
        boolean result = postService.saveOrUpdatePost(post);

        if (result) {
            return ResultUtils.success(post.getId());
        } else {
            throw new RuntimeException("发布失败");
        }
    }
}