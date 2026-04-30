package com.example.demo.esmapper;

import com.example.demo.model.dto.post.PostEsDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 只要继承了这个接口，你就能像用 MyBatis-Plus 一样操作 ES
 */
public interface PostEsRepository extends ElasticsearchRepository<PostEsDTO, Long> {

    // 甚至可以像写英文句子一样定义查询方法
    List<PostEsDTO> findByTitle(String title);
    /**
     * ✨ Spring Data 魔法：
     * 方法名解析：findBy + Title + Or + Content
     * 只要你按这个规则命名，底层就会自动生成去 ES 里的标题和内容中进行匹配搜索的 DSL 语句！
     */
    Page<PostEsDTO> findByTitleOrContent(String title, String content, Pageable pageable);
}
