package com.example.demo.model.dto;

import lombok.Data;
import java.io.Serializable;

/**
 * 通用搜索请求
 */
@Data // 💡 关键：这个注解会自动生成 getCurrent() 和 getPageSize()
public class SearchRequest implements Serializable {

    /**
     * 搜索词
     */
    private String searchText;

    /**
     * 类型（post / user / picture）
     */
    private String type;

    /**
     * 当前页码
     */
    private long current = 1; // 默认第一页

    /**
     * 每页数量
     */
    private long pageSize = 10; // 默认每页10条

    private static final long serialVersionUID = 1L;
}