package com.example.demo.job;

import com.example.demo.model.entity.Picture;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class PictureFetcher {

    public static void main(String[] args) {
        // 1. 准备搜索关键字和目标 URL
        String keyword = "美女"; // 你可以换成 "程序员"、"风景" 等
        String url = "https://cn.bing.com/images/search?q=" + keyword + "&first=1";

        try {
            // 2. 发起 HTTP GET 请求，获取整个网页的 HTML 文档
            // 必须伪装成浏览器 (User-Agent)，否则必应会认为你是爬虫并拒绝访问
            Document doc = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36")
                    .get();

            // 3. 使用 CSS 选择器解析网页寻找图片元素
            // 💡 必应图片列表中，每张图片的容器 class 通常是 iuscp
            Elements elements = doc.select(".iuscp.isv");
            List<Picture> pictureList = new ArrayList<>();

            // 4. 遍历提取数据
            for (Element element : elements) {
                // 提取图片地址 (必应通常把真实的缩略图地址放在 .mimg 标签的 src 属性中)
                String mimgUrl = element.select(".mimg").attr("src");
                // 提取标题 (通常在 .inflnk 标签的 aria-label 属性中)
                String title = element.select(".inflnk").attr("aria-label");

                // 防御性编程：如果没有抓到图片链接，就跳过
                if (mimgUrl == null || mimgUrl.isEmpty()) {
                    continue;
                }

                // 封装成我们的对象
                Picture picture = new Picture();
                picture.setTitle(title);
                picture.setUrl(mimgUrl);
                pictureList.add(picture);
            }

            // 5. 打印结果看看
            System.out.println("成功抓取到 " + pictureList.size() + " 张图片！");
            for (Picture p : pictureList) {
                System.out.println("标题: " + p.getTitle());
                System.out.println("链接: " + p.getUrl());
                System.out.println("--------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}