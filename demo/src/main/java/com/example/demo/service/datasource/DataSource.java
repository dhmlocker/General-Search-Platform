package com.example.demo.service.datasource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 统一的数据源接口 (适配器模式的标准)
 * 💡 无论是文章、图片还是未来的视频，都必须实现这个接口！
 * @param <T> 代表具体的数据类型，比如 Post 或者 Picture
 */
public interface DataSource<T> {

    /**
     * 统一的搜索方法
     * @param searchText 搜索关键字
     * @param pageNum    当前页
     * @param pageSize   每页大小
     * @return 统一返回 Spring 的 Page 分页对象
     */
    Page<T> doSearch(String searchText, long pageNum, long pageSize);
}