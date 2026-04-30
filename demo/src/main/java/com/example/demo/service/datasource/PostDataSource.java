package com.example.demo.service.datasource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.esmapper.PostEsRepository;
import com.example.demo.model.dto.post.PostEsDTO;
import com.example.demo.model.entity.Post;
import com.example.demo.service.PostService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 文章数据源适配器：连接 ES 进行高级搜索
 */
@Service
public class PostDataSource implements DataSource<Post> {

    @Autowired
    private PostService postService;

    @Autowired
    private PostEsRepository postEsRepository;

    @Override
    public Page<Post> doSearch(String searchText, long pageNum, long pageSize) {
        // 1. 兜底逻辑：如果搜索词为空，直接查 MySQL 返回
        if (StringUtils.isBlank(searchText)) {
            return postService.page(new Page<>(pageNum, pageSize));
        }

        // 2. 核心逻辑：调用 Elasticsearch 搜索
        // 注意：Spring Data ES 的页码是从 0 开始的
        PageRequest pageRequest = PageRequest.of((int) pageNum - 1, (int) pageSize);

        // 在 ES 中同时匹配标题或内容
        org.springframework.data.domain.Page<PostEsDTO> esPage =
                postEsRepository.findByTitleOrContent(searchText, searchText, pageRequest);

        // 3. 将 PostEsDTO 转换为通用的 Post 实体
        List<Post> postList = esPage.getContent().stream().map(postEsDTO -> {
            Post post = new Post();
            BeanUtils.copyProperties(postEsDTO, post);
            return post;
        }).collect(Collectors.toList());

        // 4. 封装回 MyBatis-Plus 的 Page 对象
        Page<Post> page = new Page<>(pageNum, pageSize);
        page.setRecords(postList);
        page.setTotal(esPage.getTotalElements());

        return page;
    }
}

//package com.example.demo.service.datasource;
//
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import com.example.demo.model.entity.Post;
//import com.example.demo.service.PostService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
///**
// * 文章数据源适配器
// */
//@Service // 💡 必须加上 @Service，交给 Spring 管理
//public class PostDataSource implements DataSource<Post> {
//
//    @Autowired
//    private PostService postService;
//
//    @Override
//    public Page<Post> doSearch(String searchText, long pageNum, long pageSize) {
//        // 1. 创建 MyBatis-Plus 的分页对象
//        Page<Post> postPage = new Page<>(pageNum, pageSize);
//
//        // 2. 调用原有的 PostService 去数据库查询
//        // 这里暂时做简单的全量分页查询，后续如果想根据 searchText 模糊搜索，可以使用 QueryWrapper
//        return postService.page(postPage);
//    }
//}