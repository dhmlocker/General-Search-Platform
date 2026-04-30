package com.example.demo.manager;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.model.dto.SearchRequest;
import com.example.demo.model.entity.Picture;
import com.example.demo.model.entity.Post;
import com.example.demo.model.entity.User;
import com.example.demo.model.vo.SearchVO;
import com.example.demo.service.datasource.DataSource;
import com.example.demo.manager.DataSourceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 搜索门面：负责路由分发和数据聚合
 */
@Component
public class SearchFacade {

    @Autowired
    private DataSourceRegistry dataSourceRegistry;

    public SearchVO searchAll(SearchRequest searchRequest) {
        String type = searchRequest.getType();
        String searchText = searchRequest.getSearchText();
        long current = searchRequest.getCurrent();
        long pageSize = searchRequest.getPageSize();

        SearchVO searchVO = new SearchVO();

        // 💡 如果前端没传 type，我们默认它想搜文章 (post)
        if (StringUtils.isBlank(type)) {
            type = "post";
        }

        // 根据类型（post / picture / user）获取对应的数据源插件
        DataSource<?> dataSource = dataSourceRegistry.getDataSourceByType(type);
        if (dataSource == null) {
            return searchVO; // 或者抛出自定义异常
        }

        // 执行搜索
        Page<?> page = dataSource.doSearch(searchText, current, pageSize);

        // 将结果塞进通用的 dataList 返回给前端，并按搜索词排序
        searchVO.setDataList(rankResults(page.getRecords(), searchText));

        // 💡 核心逻辑：给前端返回正确的 total
        if (type.equals("picture")) {
            // 因为图片是爬虫，拿不到真实总数。我们可以给前端“骗”一个相对合理的假总数，比如允许翻 10 页
            searchVO.setTotal(100L); // 或者随便设定一个你想要的上限
        } else {
            // 文章和用户是从数据库来的，直接用真实的总数
            searchVO.setTotal(page.getTotal());
        }

// AI辅助优化：增加日志提示
System.out.println("search facade optimization by copilot");
    
        return searchVO;
    }
// 根据关键词优化搜索结果排序
    private List<?> rankResults(List<?> records, String searchText) {
        if (records == null || records.isEmpty() || StringUtils.isBlank(searchText)) {
            return records;
        }

        String normalized = searchText.trim().toLowerCase();
        return records.stream()
                .sorted(Comparator.comparingInt((Object item) -> -computeRelevance(item, normalized)))
                .collect(Collectors.toList());
    }

    private int computeRelevance(Object item, String normalizedSearchText) {
        if (item == null) {
            return 0;
        }

        int score = 0;
        if (item instanceof Post post) {
            score += scoreText(post.getTitle(), normalizedSearchText, 10);
            score += scoreText(post.getContent(), normalizedSearchText, 6);
            score += scoreText(post.getTags(), normalizedSearchText, 4);
        } else if (item instanceof Picture picture) {
            score += scoreText(picture.getTitle(), normalizedSearchText, 10);
            score += scoreText(picture.getUrl(), normalizedSearchText, 2);
        } else if (item instanceof User user) {
            score += scoreText(user.getUsername(), normalizedSearchText, 10);
            score += scoreText(user.getUserProfile(), normalizedSearchText, 4);
        } else {
            score += scoreText(Objects.toString(item, ""), normalizedSearchText, 1);
        }

        return score;
    }

    private int scoreText(String text, String normalizedSearchText, int baseWeight) {
        if (StringUtils.isBlank(text)) {
            return 0;
        }

        String normalizedText = text.toLowerCase();
        int score = 0;

        if (normalizedText.equals(normalizedSearchText)) {
            score += baseWeight * 20;
        } else if (normalizedText.startsWith(normalizedSearchText)) {
            score += baseWeight * 10;
        }

        if (normalizedText.contains(normalizedSearchText)) {
            score += baseWeight * 5;
        }

        return score;
    }
}
//package com.example.demo.manager;
//
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import com.example.demo.model.dto.SearchRequest;
//import com.example.demo.model.vo.SearchVO;
//import com.example.demo.service.datasource.DataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//@Component
//public class SearchFacade {
//
//    @Autowired
//    private DataSourceRegistry dataSourceRegistry; // 只需要引入注册中心
//
//    public SearchVO searchAll(SearchRequest searchRequest) {
//        String type = searchRequest.getType();
//        String searchText = searchRequest.getSearchText();
//        SearchVO searchVO = new SearchVO();
//
//        // 💡 如果 type 为空，说明是聚合搜索（目前我们先保持原来的逻辑，或者循环调用）
//        if (type == null) {
//            // 这里可以循环调用 registry 里的所有数据源，实现真正的“全自动聚合”
//            // 为了不步子跨太大，我们先看单类型搜索的优雅实现：
//            return null;
//        } else {
//            // 🚀 核心变身：根据前端传的 type，直接一行代码搞定，再也没有 if-else！
//            DataSource dataSource = dataSourceRegistry.getDataSourceByType(type);
//            Page<?> page = dataSource.doSearch(searchText, 1, 10);
//
//            // 根据类型塞回 VO (此处也可以进一步优化成通用的 dataList)
//            searchVO.setDataList(page.getRecords());
//            return searchVO;
//        }
//    }
//}
/**
 * 搜索门面：负责把各个分散的 Service 聚合起来
 */
//@Component
//public class SearchFacade {
//
//    @Autowired
//    private PostService postService;
//
//    @Autowired
//    private PictureService pictureService;
//
//    public SearchVO searchAll(SearchRequest searchRequest) {
//        String searchText = searchRequest.getSearchText();
//        SearchVO searchVO = new SearchVO();
//
//        // 简单粗暴的聚合逻辑：分别去查，然后塞进同一个大对象里
//        // 1. 查文章 (由于 Post 还没有带关键字搜索的逻辑，我们这里暂时还是全量查询)
//        searchVO.setPostList(postService.list());
//
//        // 2. 查图片
//        searchVO.setPictureList(pictureService.searchPicture(searchText, 1, 10));
//
//        return searchVO;
//    }
//}


