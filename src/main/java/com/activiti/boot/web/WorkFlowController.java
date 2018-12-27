package com.activiti.boot.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workFlow")
public class WorkFlowController {

	@RequestMapping("/audti")
	public Map<String, Object> audti(){
		Map<String, Object> map=new HashMap<>();
		return map;
	}
}
