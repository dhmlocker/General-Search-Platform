package com.example.demo.service;

import com.example.demo.model.entity.Picture;
import java.util.List;

/**
 * 图片搜索服务接口
 */
public interface PictureService {

    /**
     * 搜索图片
     * @param searchText 搜索关键字
     * @param pageNum    当前页码
     * @param pageSize   每页数量
     * @return 图片列表
     */
    List<Picture> searchPicture(String searchText, long pageNum, long pageSize);
}