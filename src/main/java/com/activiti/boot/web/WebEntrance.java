package com.activiti.boot.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.activiti.boot.service.SysMenuService;

@Controller
@RequestMapping("/abd/getView")
public class WebEntrance {
	
	@Autowired
	private SysMenuService sysMenuService;
	
	@GetMapping("/path/{param}")
	private String getViewPath(@RequestParam String param) {
		Map<String, Object> viewUrl = sysMenuService.getViewUrl(param);
		return String.valueOf(viewUrl.get("ViewUrl"));
	}

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
