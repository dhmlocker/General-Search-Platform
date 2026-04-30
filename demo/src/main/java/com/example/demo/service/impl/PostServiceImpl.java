package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.PostMapper;
import com.example.demo.model.entity.Post;
import com.example.demo.model.dto.post.PostEsDTO;
import com.example.demo.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

@Slf4j // 💡 加入日志注解，方便我们看双写结果
@Service // 💡【原子笔记提醒】：[[Spring注解-Service]]，标记这是业务逻辑层
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements PostService {

    // 💡 注入 ES 客户端
    @Autowired
    private ElasticsearchOperations elasticsearchOperations;

    /**
     * 💡 核心：新增或更新帖子（双写 ES 保证实时性）
     * 注意：如果你的 PostService 接口里还没有这个方法，记得去接口里声明一下！
     */
    public boolean saveOrUpdatePost(Post post) {
        // 1. 先操作 MySQL 数据库 (调用 MyBatis-Plus 的原生方法)
        boolean isSuccess = this.saveOrUpdate(post);

        // 2. 如果 MySQL 操作成功，立刻进行 ES 双写！
        if (isSuccess) {
            try {
                PostEsDTO postEsDTO = new PostEsDTO();
                // 💡 使用 BeanUtils 快速把 Post 的属性拷贝到 PostEsDTO 中
                BeanUtils.copyProperties(post, postEsDTO);

                // 实时保存到 ES 中
                elasticsearchOperations.save(postEsDTO);
                log.info("实时双写 ES 成功，帖子ID: {}", post.getId());
            } catch (Exception e) {
                // 🚨 极其关键的容错机制！
                // 如果 ES 服务暂时连不上，绝对不能影响用户发帖。
                // 捕获异常后，由于 MySQL 已经存进去了，等 1 分钟后我们的增量定时任务会自动兜底补齐！
                log.error("实时双写 ES 失败，转为定时任务兜底，帖子ID: {}", post.getId(), e);
            }
        }
        return isSuccess;
    }

    // 💡 注意：如果你之前在这个类里写了 searchFromEs (ES搜索方法)，请把它保留在这里不要删！
}