package com.example.demo.service.datasource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.model.entity.Picture;
import com.example.demo.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureDataSource implements DataSource<Picture> {

    @Autowired
    private PictureService pictureService;

    @Override
    public Page<Picture> doSearch(String searchText, long pageNum, long pageSize) {
        // 💡 适配器只需透传参数，不负责拼接 URL
        List<Picture> pictureList = pictureService.searchPicture(searchText, pageNum, pageSize);

        Page<Picture> picturePage = new Page<>(pageNum, pageSize);
        picturePage.setRecords(pictureList);

        // 由于爬虫无法获取真实总数，设置一个较大的虚拟总数让前端分页器可用
        picturePage.setTotal(1000L);

        return picturePage;
    }
}