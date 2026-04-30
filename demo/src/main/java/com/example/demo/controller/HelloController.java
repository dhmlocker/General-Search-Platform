package com.example.demo.controller;

// 注意这里导入的包变了哦，去掉了原来的，换成了这三个
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // 升级1：用这个神仙注解，代替原来的 @Controller + @ResponseBody
public class HelloController {

    // 升级2：把路径改成 /search，假装这是一个搜索接口
    @GetMapping("/search")
    // 升级3：加了一个 @RequestParam，意思是要求前端必须传一个叫 keyword 的参数过来
    public String search(@RequestParam String keyword) {

        // 我们在后台黑框框（控制台）里打印一下，看看有没有真收到
        System.out.println("太棒了！后端成功接收到前端传来的搜索词：" + keyword);

        // 给前端返回动态的结果
        return "后端已收到你的搜索请求，你搜索的词是：【" + keyword + "】。目前数据库还没连，稍后再给你结果！";
    }
}