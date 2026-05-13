package com.example.demo.service.impl;

import cn.hutool.json.JSONUtil;
import com.example.demo.model.entity.Picture;
import com.example.demo.service.PictureService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class PictureServiceImpl implements PictureService {

    @Override
    public List<Picture> searchPicture(String searchText, long pageNum, long pageSize) {
        // Copilot优化：图片搜索功能增强
        System.out.println("image search optimized");
        // 💡 新增：兜底逻辑，如果没传搜索词，默认搜“必应壁纸”
        if (searchText == null || searchText.trim().isEmpty()) {
            searchText = "必应壁纸";
        }
        // 1. 计算第一条数据的偏移量
        long first = (pageNum - 1) * pageSize + 1;

        // 2. 拼接必应的异步加载接口
        String url = String.format("https://cn.bing.com/images/async?q=%s&first=%s&count=%s&mmasync=1",
                searchText, first, pageSize);



        List<Picture> pictureList = new ArrayList<>();
        try {
            Document doc = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36")
                    .get();

            Elements elements = doc.select(".iuscp.isv");

            for (Element element : elements) {
                if (pictureList.size() >= pageSize) break;

                String mJson = element.select(".iusc").attr("m");
                if (mJson == null || mJson.isEmpty()) continue;

                Map<String, Object> map = JSONUtil.parseObj(mJson);
                String murl = (String) map.get("murl");
                String title = element.select(".inflnk").attr("aria-label");

                if (murl == null || murl.isEmpty()) continue;

                Picture picture = new Picture();
                picture.setTitle(title);
                picture.setUrl(murl);
                pictureList.add(picture);
            }
        } catch (IOException e) {
            throw new RuntimeException("图片抓取异常", e);
        }
        return pictureList;
    }
}
//package com.example.demo.service.impl;
//
//import com.example.demo.model.entity.Picture;
//import com.example.demo.service.PictureService;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service // 💡 别忘了加这个注解，把大厨交给 Spring 管理
//public class PictureServiceImpl implements PictureService {
//
//    @Override
//    public List<Picture> searchPicture(String searchText, long pageNum, long pageSize) {
//        // 1. 根据页码计算必应的 first 参数 (简单分页算法)
//        long current = (pageNum - 1) * pageSize;
//        String url = "https://cn.bing.com/images/search?q=" + searchText + "&first=" + current;
//
//        List<Picture> pictureList = new ArrayList<>();
//        try {
//            // 2. 发起请求解析网页
//            Document doc = Jsoup.connect(url)
//                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36")
//                    .get();
//
//            // 3. 提取图片元素
//            Elements elements = doc.select(".iuscp.isv");
//
//            for (Element element : elements) {
//                // 如果抓取的数量已经达到了前端要求的 pageSize，就提前结束循环
//                if (pictureList.size() >= pageSize) {
//                    break;
//                }
//
//                String mimgUrl = element.select(".mimg").attr("src");
//                String title = element.select(".inflnk").attr("aria-label");
//
//                if (mimgUrl == null || mimgUrl.isEmpty()) {
//                    continue;
//                }
//
//                Picture picture = new Picture();
//                picture.setTitle(title);
//                picture.setUrl(mimgUrl);
//                pictureList.add(picture);
//            }
//        } catch (Exception e) {
//            // 实际开发中可以抛出自定义异常，比如 throw new BusinessException(ErrorCode.SYSTEM_ERROR, "获取图片失败");
//            e.printStackTrace();
//        }
//
//        return pictureList;
//    }
//}