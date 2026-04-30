package com.example.demo.job;

import com.example.demo.model.entity.Post;
import com.example.demo.model.dto.post.PostEsDTO;
import com.example.demo.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 帖子同步到 ES 的定时任务
 */
@Component
@Slf4j
public class PostEsSyncJob {

    @Autowired
    private PostService postService;

    @Autowired
    private ElasticsearchOperations elasticsearchOperations;

    /**
     * 每分钟执行一次，把 MySQL 中最近更新的数据同步到 ES
     */
    @Scheduled(fixedRate = 60 * 1000)
    public void run() {
        log.info("=== 开始执行 ES 帖子增量同步任务 ===");

        // 1. 计算 5 分钟前的时间 (多查一点时间是为了防止数据遗漏)
        Date fiveMinutesAgo = new Date(System.currentTimeMillis() - 5 * 60 * 1000L);

        // 2. 从 MySQL 中查询最近 5 分钟内有变动（含新增、修改、逻辑删除）的数据
        // 注意：这里假设你的 postService 里面有一个查增量的方法，或者用 MyBatis-Plus 的条件构造器
        List<Post> postList = postService.lambdaQuery()
                .ge(Post::getUpdateTime, fiveMinutesAgo)
                .list();

        if (postList == null || postList.isEmpty()) {
            log.info("没有需要同步的数据，增量同步任务结束");
            return;
        }

        // 3. 将 MySQL 的 Post 实体转换为 ES 的 PostEsDTO
        List<PostEsDTO> postEsDTOList = postList.stream().map(post -> {
            PostEsDTO postEsDTO = new PostEsDTO();
            postEsDTO.setId(post.getId());
            postEsDTO.setTitle(post.getTitle());
            postEsDTO.setContent(post.getContent());
            postEsDTO.setUserId(post.getUserId());
            postEsDTO.setCreateTime(post.getCreateTime());
            postEsDTO.setUpdateTime(post.getUpdateTime());
            return postEsDTO;
        }).collect(Collectors.toList());

        // 4. 批量保存到 ES
        // 💡 save 方法自带特性：如果 ID 存在就更新，如果 ID 不存在就新增
        elasticsearchOperations.save(postEsDTOList);

        log.info("=== ES 帖子增量同步任务结束，成功同步 {} 条数据 ===", postEsDTOList.size());
    }
}