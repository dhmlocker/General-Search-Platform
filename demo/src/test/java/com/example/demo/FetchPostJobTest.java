package com.example.demo;

import com.example.demo.job.FetchPostJob;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FetchPostJobTest {

    @Resource
    private FetchPostJob fetchPostJob;

    @Test
    void testFetch() {
        // 直接点一下左侧的运行箭头，就能单独执行爬虫入库
        fetchPostJob.fetchRealPosts();
    }
}