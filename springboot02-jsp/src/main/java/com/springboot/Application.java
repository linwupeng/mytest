package com.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 	springboot启动类
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		// 创建SpringApplication对象
		SpringApplication application = new SpringApplication(Application.class);
		// 关闭广告标识
		application.setBannerMode(Mode.OFF);
		// 启动
		application.run(args);
		
		
	}
}
