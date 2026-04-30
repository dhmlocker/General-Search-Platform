package com.example.demo;

import com.example.demo.esmapper.PostEsRepository;
import com.example.demo.model.dto.post.PostEsDTO;
import com.example.demo.model.entity.Post;
import com.example.demo.service.PostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

/**
 * ES 数据同步测试类
 */
@SpringBootTest
public class PostEsSyncTest {

    @Autowired
    private PostService postService;

    @Autowired
    private PostEsRepository postEsRepository;

    @Test
    void testFullSync() {
        System.out.println("开始执行全量同步...");

        // 1. 从 MySQL 数据库中查询出所有的文章数据
        List<Post> postList = postService.list();
        if (postList == null || postList.isEmpty()) {
            System.out.println("数据库中暂无文章数据，同步结束。");
            return;
        }

        // 2. 数据转换：将 MySQL 的实体类 (Post) 转换为 ES 的 DTO 类 (PostEsDTO)
        List<PostEsDTO> postEsDTOList = postList.stream().map(post -> {
            PostEsDTO postEsDTO = new PostEsDTO();
            // 使用 Spring 提供的 BeanUtils 进行属性拷贝（前提是两边字段名一样）
            BeanUtils.copyProperties(post, postEsDTO);
            return postEsDTO;
        }).collect(Collectors.toList());

        // 3. 批量保存到 Elasticsearch
        // saveAll 方法底层会转化为 ES 的 bulk 批量操作，性能极高
        postEsRepository.saveAll(postEsDTOList);

        System.out.println("全量同步完成！共成功同步 " + postEsDTOList.size() + " 条文章数据到 ES！");
    }
}