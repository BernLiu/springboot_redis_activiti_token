package com.activiti.boot.service.impl;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activiti.boot.dao.activiti.ActReDeploymentRepository;
import com.activiti.boot.dao.activiti.ActReProcdefRepository;
import com.activiti.boot.exception.CommonException;
import com.activiti.boot.service.ActivitiWorkFlowService;

@Service("ActivitiWorkFlowService")
public class ActivitiWorkFlowServiceImpl implements ActivitiWorkFlowService {

	@Autowired
	private RepositoryService repositoryService;
	@Autowired
	private RuntimeService RuntimeService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private HistoryService historyService;
	@Autowired
	private ActReDeploymentRepository actReDeploymentRepository;
	@Autowired
	private ActReProcdefRepository actReProcdefRepository;

	@Override
	public void deployActivitiWorkflow(String fileName, InputStream inputStream) {
		try {
			repositoryService.createDeployment() // 创建部署对象
					.name(fileName).
					addInputStream(fileName, inputStream).
					deploy();
		} catch (Exception e) {
			throw new CommonException("流程部署失败" + e.getMessage());
		}
	}
	
	/**查询部署对象结果集 act_re_deployment*/
	@Override
	public List<Map<String,Object>> processDeplyment() {
//		List<Deployment> list = repositoryService.createDeploymentQuery()  //创建部署对象查询
//				                .orderByDeploymenTime().asc().list();
		List<Map<String,Object>> processDeplyment = actReDeploymentRepository.processDeplyment();
		return processDeplyment;
	}


	/**查询流程定义信息 act_re_procdef*/
	@Override
	public List<Map<String,Object>> processProcedf() {
		List<ProcessDefinition> list = repositoryService.createProcessDefinitionQuery().
				                       orderByDeploymentId().asc().list();
		List<Map<String,Object>> processProcedf = actReProcdefRepository.processProcedf();
		return processProcedf;
	}

}
