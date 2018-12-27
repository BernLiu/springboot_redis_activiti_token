package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.activiti.boot.dao") // mapper 接口类扫描包配置
public class ActivitiBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivitiBootDemoApplication.class, args);
	}
}
