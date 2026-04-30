package com.example.demo.job;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.common.BaseResponse;
import com.example.demo.common.ResultUtils;
import com.example.demo.model.entity.Post;
import com.example.demo.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 工业级文章抓取任务：解决重复爬取与链接缺失
 */
@Component
@Slf4j
@RestController
public class FetchPostJob {

    @Autowired
    private PostService postService;

    /**
     * 💡 手动触发接口：访问 localhost:8081/fetch 即可立即启动
     */
    @GetMapping("/fetch")
    public BaseResponse<String> testFetch() {
        this.fetchRealPosts();
        return ResultUtils.success("增量爬取任务已启动");
    }

    /**
     * 💡 定时任务：每 1 小时自动增量扫描一次
     */
    @Scheduled(cron = "0 0 * * * *")
    public void fetchRealPosts() {
        log.info(">>> 爬虫启动：正在扫描最新技术文章...");
        String targetUrl = "https://www.cnblogs.com/";

        try {
            Document doc = Jsoup.connect(targetUrl)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36")
                    .timeout(10000)
                    .get();

            Elements postItems = doc.select(".post-item");
            List<Post> newPostList = new ArrayList<>();

            for (Element item : postItems) {
                Element titleElem = item.selectFirst(".post-item-title");
                if (titleElem == null) continue;

                String articleUrl = titleElem.attr("href");

                // 💡 改进 1：过滤掉没有链接的无效文章
                if (articleUrl == null || articleUrl.isEmpty()) continue;

                // 💡 改进 2：增量校验（核心防重逻辑）
                // 只有当数据库里不存在这个 URL 时，才认为它是新文章
                long count = postService.count(new QueryWrapper<Post>().eq("url", articleUrl));
                if (count > 0) continue;

                Post post = new Post();
                post.setTitle(titleElem.text());
                post.setUrl(articleUrl); // 💡 确保跳转链接被存入

                Element summaryElem = item.selectFirst(".post-item-summary");
                post.setContent(summaryElem != null ? summaryElem.text() : "暂无摘要");

                post.setUserId(1L);
                post.setCreateTime(new Date());
                post.setUpdateTime(new Date());

                newPostList.add(post);
            }

            if (!newPostList.isEmpty()) {
                postService.saveBatch(newPostList);
                log.info(">>> 扫描完毕！成功发现并增量入库 {} 条新文章", newPostList.size());
            } else {
                log.info(">>> 本次扫描未发现新内容");
            }
        } catch (IOException e) {
            log.error(">>> 爬虫执行异常: ", e);
        }
    }
}