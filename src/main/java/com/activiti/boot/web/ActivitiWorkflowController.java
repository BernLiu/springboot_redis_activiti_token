package com.activiti.boot.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activiti.boot.service.ActivitiWorkFlowService;

@RestController
@RequestMapping("/abd/activiti")
public class ActivitiWorkflowController {
	
	@Autowired
	private ActivitiWorkFlowService activitiWorkFlowService;

	@RequestMapping("/processDeplyment")
	private List<Map<String,Object>> processDeplyment(HttpServletRequest request){
		List<Map<String,Object>> processDeplyment = activitiWorkFlowService.processDeplyment();
		if(processDeplyment!=null && processDeplyment.size()>0) {
			return processDeplyment;
		}
		return null;
	}
	
	@RequestMapping("/processProcedf")
	private List<Map<String,Object>> processProcedf(HttpServletRequest request){
		List<Map<String,Object>> processProcedf = activitiWorkFlowService.processProcedf();
		if(processProcedf !=null && processProcedf.size()>0) {
		return processProcedf;
		}
		return null;
	}
}
