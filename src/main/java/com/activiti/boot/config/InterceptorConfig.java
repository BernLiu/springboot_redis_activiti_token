package com.activiti.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class InterceptorConfig extends WebMvcConfigurerAdapter{

	 @Override
	    public void addInterceptors(InterceptorRegistry registry) {
	        registry.addInterceptor(authenticationInterceptor())
	                .addPathPatterns("/**");    // 拦截所有请求，通过判断是否有 @LoginRequired 注解 决定是否需要登录
	    }
	    @Bean
	    public AuthenticationInterceptor authenticationInterceptor() {
	        return new AuthenticationInterceptor();
	    }
}
