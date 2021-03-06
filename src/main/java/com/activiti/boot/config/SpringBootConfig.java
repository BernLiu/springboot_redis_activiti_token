package com.activiti.boot.config;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootConfig {

	 
	/**
	     * 文件上传配置
	     * @return
	     */
	    @Bean
	    public MultipartConfigElement multipartConfigElement() {
	        MultipartConfigFactory factory = new MultipartConfigFactory();
	        //文件最大
	        factory.setMaxFileSize("10240000000KB");
	        /// 设置总上传数据总大小
	        factory.setMaxRequestSize("102400000000KB");
	        return factory.createMultipartConfig();
	    }

}
