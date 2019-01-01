package com.activiti.boot.service;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface ActivitiWorkFlowService {
	
	/**
	  *  部署流程
	 * @param fileName
	 * @param inputStream
	 */
	public void deployActivitiWorkflow(String fileName, InputStream inputStream);
	
	/**
	 * 查询部署对象信息列表
	 * @return
	 */
	public List<Map<String,Object>> processDeplyment();
	
	/**
	 * 	查询流程定义信息列表
	 * @return
	 */
	public List<Map<String,Object>> processProcedf();

}
