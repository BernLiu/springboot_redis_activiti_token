package com.activiti.boot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/abd")
public class WebEntrance {

	@GetMapping("/gologin")
	private String goLogin() {
		return "/login";
	}
	
	@GetMapping("/goIndex")
	private String goIndex() {
		return "/index";
	}
	
	@GetMapping("/goProcessDetail")
	private String goProcessDetail() {
		return "/processDetail";
	}
	
	@GetMapping("/header")
	private String getHeader() {
		return "/header";
	}
	
	@GetMapping("/footer")
	private String getFooter() {
		return "/footer";
	}
	
	@GetMapping("/goProcessAdd")
	private String getProcessAdd() {
		return "/processAdd";
	}
}
