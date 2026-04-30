package com.example.demo.controller;

import com.example.demo.common.BaseResponse;
import com.example.demo.common.ResultUtils;
import com.example.demo.model.entity.Picture;
import com.example.demo.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/picture")
public class PictureController {

    @Autowired
    private PictureService pictureService;

    /**
     * 搜索图片接口
     * @param searchText 搜索词 (前端必传)
     * @return 标准化包装的图片列表
     */
    @GetMapping("/search")
    public BaseResponse<List<Picture>> searchPicture(@RequestParam String searchText) {
        // 调用 Service，为了方便测试，我们默认查第 1 页，返回 10 条数据
        List<Picture> pictureList = pictureService.searchPicture(searchText, 1, 10);

        // 包装成统一结果返回
        return ResultUtils.success(pictureList);
    }
}