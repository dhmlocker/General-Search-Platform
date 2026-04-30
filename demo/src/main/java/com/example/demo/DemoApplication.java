package com.example.demo;

import org.mybatis.spring.annotation.MapperScan; // 注意要导入这个包
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
// 💡【原子笔记提醒】：[[Spring注解-MapperScan]]，告诉 Spring 去哪个包下面找我们写的 Mapper 接口
@MapperScan("com.example.demo.mapper")
@EnableScheduling // 💡 开启定时任务
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}