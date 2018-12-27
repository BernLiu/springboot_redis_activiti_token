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
}
